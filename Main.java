import java.util.ArrayList;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.mostrarLivros();
        
        Livro livro1 = new Livro("O Senhor dos Anéis");
        livro1.reservar();
        
        Pessoa aluno = new Aluno(1, "João");
        Emprestimo emprestimo = new Emprestimo(livro1, aluno, LocalDate.now());
        emprestimo.mostrarDetalhes();
        
        emprestimo.devolverLivro(LocalDate.now().plusDays(7));
        emprestimo.mostrarDetalhes();
    }
}

abstract class Pessoa {
    private int id;
    String nome;  
    
    public Pessoa(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    
    public int getId() {
        return id;
    }
    
    abstract void multa();
}

class Aluno extends Pessoa {
    public Aluno(int id, String nome) {
        super(id, nome);
    }
    
    @Override
    void multa() {
        // Implementação da multa para o aluno
        System.out.println("Aplicando multa para o aluno " + nome);
    }
}

class Professor extends Pessoa {
    public Professor(int id, String nome) {
        super(id, nome);
    }
    
    @Override
    void multa() {
        // Implementação da multa para o professor
        System.out.println("Aplicando multa para o professor " + nome);
    }
}

interface Reservavel {
    void reservar();
    void cancelarReserva();
}

class Livro implements Reservavel {
    private String livro;
    
    public Livro(String livro) {
        this.livro = livro;
    }
    
    public String getLivro() {
        return livro;
    }
    
    @Override
    public void reservar() {
        System.out.println("\n"+ livro + " reservado com sucesso!");
    }
    
    @Override
    public void cancelarReserva() {
        System.out.println("Reserva do livro " + livro + " cancelada com sucesso!");
    }
}

class Biblioteca {
    private ArrayList<String> livroList = new ArrayList<>();
    
    public Biblioteca() {
        livroList.add("Harry Potter e a pedra filosofal");
        livroList.add("Programação Orientada a Objetos com Java");
        livroList.add("A bela e a fera");
        livroList.add("O mágico de OZ");
        livroList.add("O Senhor dos Anéis");
    }
    
    public void mostrarLivros() {
        System.out.println("Livros na biblioteca:");
        for (String livro : livroList) {
            System.out.println(livro);
        }
    }
}

class Emprestimo {
    private Livro livro;
    private Pessoa pessoa;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;
    
    public Emprestimo(Livro livro, Pessoa pessoa, LocalDate dataEmprestimo) {
        this.livro = livro;
        this.pessoa = pessoa;
        this.dataEmprestimo = dataEmprestimo;
    }
    
    // Registra a devolução do livro e a data em que isso ocorreu
    public void devolverLivro(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
        System.out.println("Livro " + livro.getLivro() + " devolvido por " + pessoa.nome + " em " + dataDevolucao);
    }
    
    // Exibe os detalhes do empréstimo
    public void mostrarDetalhes() {
        System.out.println("\nDetalhes do Empréstimo:");
        System.out.println("Livro: " + livro.getLivro());
        System.out.println("Emprestado para: " + pessoa.nome);
        System.out.println("Data do empréstimo: " + dataEmprestimo);
        if (dataDevolucao != null) {
            System.out.println("\nData da devolução: " + dataDevolucao);
        } else {
            System.out.println("\nLivro ainda não foi devolvido.");
        }
    }
}