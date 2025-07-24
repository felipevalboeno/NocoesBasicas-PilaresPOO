/**
 * Aqui simulados que o pedrinho pode escolher enviar mensagens pelo MSN, Facebook ou Telegram
 * Cada serviço de mensagem desses, utiliza os mesmos métodos herdados da classe pai
 * Porém, os métodos tem retorno diferente de acordo com a classe chamada
 * Aqui temos completo a Herança, Abstração e Polimorfismo
 */

public class ComputadorPedrinho {
    public static void main(String[] args) {
        ServicoMensagemInstantanea smi = null;
//teste
        String appEscolhido="fbm";

        if(appEscolhido.equals("msn"))
            smi = new MSNMessenger();
        else if(appEscolhido.equals("fbm"))
            smi = new FacebookMessenger();
        else if(appEscolhido.equals("tlg"))
            smi = new Telegram();

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}