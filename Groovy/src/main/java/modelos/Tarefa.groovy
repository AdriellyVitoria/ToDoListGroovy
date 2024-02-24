package modelos

class Tarefa {
    String nome, descricao, dataDeTermino, categoria, status
    int prioridade

    Tarefa(String nome, String descricao,String dataDeTermino, String categoria, String status, int prioridade) {
        this.nome = nome
        this.descricao = descricao
        this.dataDeTermino = dataDeTermino
        this.categoria = categoria
        this.status = status
        this.prioridade = prioridade
    }
}
