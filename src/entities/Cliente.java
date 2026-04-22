package entities;

public class Cliente extends Usuario { //Classe cliente vai herdar (ter tudo que tem na classe Usuario)

    public Cliente(String nome, String email, Integer idade) {
        super(nome, email, idade); //Super usa o construtor da classe PAI (Usuario)
    }

    @Override
    public String toString() {
        return "\nCliente: " + getNome() + "\nIdade: " + getIdade() + "\nEmail: " + getEmail();
    }
}
