class RelatorioPDF implements Relatorio {
    public void gerar () {
        System.out.println("Gerando relatório em PDF...");
    }
}

class RelatorioHTML implements Relatorio {
    public void gerar() {
        System.out.println("Gerando relatório em HTML...");
    }
}

class RelatorioJSON implements Relatorio {
    public void gerar () {
        System.out.println("Gerando relatório em JSON...");
    }
}
