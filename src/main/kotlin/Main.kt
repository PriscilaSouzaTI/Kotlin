fun main(args: Array<String>) {
    val aluno = Aluno("123456789", "987654321", "Priscila", 18, "A123")
    aluno.exibirInformacoes()
    println()

    val professor = Professor("987654321", "123456789", "Wagner", 35, "Matemática")
    professor.exibirInformacoes()
    println()

    val diretor = Diretor("456789123", "654321987", "Edney", 40, "Administração")
    diretor.exibirInformacoes()
    println()

    val responsavel = Responsavel("789123456", "321987654", "Deus", 45, "Pai")
    responsavel.exibirInformacoes()
}