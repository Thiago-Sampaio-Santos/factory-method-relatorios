abstract class RelatorioFactory {
    public abstract Relatorio criarRelatorio();
}


//Fabricas Concretas
class RelatorioPDFFactory extends RelatorioFactory {
    public Relatorio criarRelatorio() {
        return new RelatorioPDF();
    }
}

class RelatorioHTMLFactory extends RelatorioFactory {
    public Relatorio criarRelatorio() {
        return new RelatorioHTML();
    }
}

class RelatorioJSONFactory extends RelatorioFactory {
    public Relatorio criarRelatorio() {
        return new RelatorioJSON();
    }
}