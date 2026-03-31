package br.edu.ifg.atividades;

public class Main {
    public static void main(String[] args) {
        // --- Teste do Adapter ---
        System.out.println("=== TESTE ADAPTER ===");
        TomadaAntiga antiga = new TomadaAntiga(); // [cite: 42]
        AdaptadorTomada adaptador = new AdaptadorTomada(antiga); // [cite: 43]
        Notebook meuNote = new Notebook(); // [cite: 44]
        meuNote.conectar(adaptador); // [cite: 45]

        System.out.println("\n=== TESTE COMPOSITE ===");
        // Criando funcionários simples [cite: 111]
        Funcionario joao = new FuncionarioSimples("João", 3000);
        Funcionario maria = new FuncionarioSimples("Maria", 4000);
        Funcionario carlos = new FuncionarioSimples("Carlos", 5000);

        // Departamento TI [cite: 112]
        Departamento ti = new Departamento("TI");
        ti.adicionar(joao);
        ti.adicionar(maria);

        // Departamento Geral (Empresa) [cite: 113]
        Departamento empresa = new Departamento("Empresa");
        empresa.adicionar(carlos); // Outro funcionário [cite: 116]
        empresa.adicionar(ti); // Departamento anterior [cite: 114]

        empresa.mostrarDetalhes();
        System.out.println("Custo total da empresa: " + empresa.getSalario()); // [cite: 125]
    }
}