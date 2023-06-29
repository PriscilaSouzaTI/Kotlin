open class Pessoa(val cpf: String, val rg: String, val nome: String, val idade: Int) {
    open fun exibirInformacoes() {
        println("Nome: $nome")
        println("CPF: $cpf")
        println("RG: $rg")
        println("Idade: $idade")
    }
}

class Aluno(cpf: String, rg: String, nome: String, idade: Int, val matricula: String) : Pessoa(cpf, rg, nome, idade) {
    override fun exibirInformacoes() {
        super.exibirInformacoes()
        println("Matrícula: $matricula")
    }
}

class Professor(cpf: String, rg: String, nome: String, idade: Int, val disciplina: String) : Pessoa(cpf, rg, nome, idade) {
    override fun exibirInformacoes() {
        super.exibirInformacoes()
        println("Disciplina: $disciplina")
    }
}

class Diretor(cpf: String, rg: String, nome: String, idade: Int, val setor: String) : Pessoa(cpf, rg, nome, idade) {
    override fun exibirInformacoes() {
        super.exibirInformacoes()
        println("Setor: $setor")
    }
}

class Responsavel(cpf: String, rg: String, nome: String, idade: Int, val parentesco: String) : Pessoa(cpf, rg, nome, idade) {
    override fun exibirInformacoes() {
        super.exibirInformacoes()
        println("Parentesco: $parentesco")
    }
}
