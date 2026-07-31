package view;

import java.util.Scanner;

public class MenuCliente {
    private Scanner scanner = new Scanner(System.in);

    public void exibirMenu() {
        int opcao = -1;
        while (opcao != 0) {
            System.out.println("\n=== MENU DO CLIENTE / RESERVAS ===");
            System.out.println("1. Consultar Horários Livres");
            System.out.println("2. Agendar Horário");
            System.out.println("3. Meus Agendamentos");
            System.out.println("4. Cancelar Reserva");
            System.out.println("0. Voltar ao Menu Principal");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> consultarHorariosLivres();
                case 2 -> agendarHorario();
                case 3 -> listarMeusAgendamentos();
                case 4 -> cancelarReserva();
            }
        }
    }

    private void consultarHorariosLivres() { /* Chamará o Slot Finder do Service */ }
    private void agendarHorario() { /* Fluxo de checkout e verificação anti-conflito */ }
    private void listarMeusAgendamentos() { /* Busca reservas por CPF do cliente */ }
    private void cancelarReserva() { /* Aplica regra de cancelamento */ }
}