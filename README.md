# Sistema de Agendamento e Reservas de Quadras

Um sistema robusto de back-end executado via terminal para gestão, agendamento e reserva de quadras esportivas.
O sistema lida com regras complexas de negócio como tempo, concorrência e preços variáveis.

# Funcionalidades

- Preços Dinâmicos: Sistema de tarifas diferenciadas (ex: horários noturnos com iluminação
são mais caros, horários no fim de semana)
- Diversidade de Quadras: Associação de quadras a suas modalidades específicas
- Gestão de Status: Múltiplos estados para as reservas, incluindo PENDENTE, CONFIRMADA, CANCELADA e FINALIZADA
- Política de Cancelamento: Regras de reembolso ou multas baseadas na antecedência do cancelamento
- Busca Avançada (Slot Finder): Motor de pesquisa dinâmico no terminal que lista horários vagos considerando
a duração escolhida e evita conflitos de agenda

# Tecnologias Utilizadas

- Linguagem: JAVA 21
- SGBD: PostgreSQL
- Conectividade: JDBC configurado nativamente
- APIs Nativas: java.time(LocalDate, LocalTime, LocalDateTime, Duration, DayOfWeek)