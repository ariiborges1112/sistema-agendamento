create table clientes(
	id serial primary key,
	nome varchar(100) not null,
	cpf varchar(14) unique not null,
	telefone varchar(20) not null,
	data_cadastro timestamp default current_timestamp
);

create table esportes(
	id int primary key serial,
	nome varchar(50) not null unique
);

create table quadras(
	id serial primary key,
	nome varchar(50) not null,
	coberta boolean default false,
	ativa boolean default true
);

create table quadras_esportes(
	quadra_id int,
	esporte_id int,

	primary key(quadra_id, esporte_id),

	foreign key(quadra_id) references quadras(id) on delete cascade,
	foreign key(esporte_id) references esportes(id) on delete cascade
);

create table tarifas(
	id serial primary key,
	quadra_id int not null,
	dia_semana int not null,
	hora_inicio time not null,
	hora_fim time not null,
	preco_hora decimal(10,2) not null,

	foreign key (quadra_id) references quadras(id),
	constraint checagem_horario check (hora_fim > hora_inicio)
);

create table reservas(
	id int primary key serial,
	cliente_id int not null,
	quadra_id int not null,
	esporte_id int not null,
	data_reserva date not null,
	horario_inicio time not null,
	horario_fim time not null,
	valor_total decimal(10,2) not null,
	status varchar(20) default 'CONFIRMADA', -- 'CONFIRMADA', 'CANCELADA', 'FINALIZADA',
	data_criacao timestamp default current_timestamp,

	foreign key (cliente_id) references clientes(id),
	foreign key (quadra_id) references quadras(id),
	foreign key (esporte_id) references esportes(id)
);