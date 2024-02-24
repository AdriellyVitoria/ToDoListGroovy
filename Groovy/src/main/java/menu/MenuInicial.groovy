package menu

class MenuInicial {

    static void menuPrincipal(){
       Scanner scanner = new Scanner(System.in)
        def opcao = 0
        while (true){
            println """
Seja Bem vindo(a) Ao programa TodoList
1 - Criar Tarefa
2 - Atualizar Tarefa
3 - Deletar Tarefa
4 - Listar Tarefa
5 - Sair"""
            opcao = Integer.parseInt(scanner.next());
            iteracaoComMenu(opcao)
            if (opcao == 5){
                break
            }
        }

    }
    static void iteracaoComMenu(opcao){
            if (opcao == 1){
                println "Criar tarefa"
            } else if (opcao == 2) {
                println "Atualizar Tarefa"
            } else if (opcao == 3) {
                println "Deletar Tarefa"
            } else if (opcao == 4) {
                println "Listar Tarefas"
            } else if (opcao == 5){
                println "Saido do programa"
            } else {
                println "Opção inválida... Tente novamente"
            }
    }
}
