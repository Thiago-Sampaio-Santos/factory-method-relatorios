public class App {
    public static void main(String[] args) {
        RelatorioFactory factoryPDF =  new RelatorioPDFFactory();
        Relatorio relatorioPDF = factoryPDF.criarRelatorio();
        relatorioPDF.gerar ();

        RelatorioFactory factoryHTML  = new RelatorioHTMLFactory();
        Relatorio relatorioHTML = factoryHTML.criarRelatorio();
        relatorioHTML.gerar();

        RelatorioFactory factoryJSON = new RelatorioJSONFactory();
        Relatorio relatorioJSON = factoryJSON.criarRelatorio();
        relatorioJSON.gerar();
    }
}
