
package pt.ulusofona.aed.rockindeisi2023;

public class Songs {

    static int segundos;
    static int minutos;
    String idTemaMusical;
    String titulo;
    int anoLancamento;
    String nomeArtists;
    int numArtists;
    String duracao;
    int letraExplicita;
    int popularidade;
    float dancabilidade;
    float vivacidade;
    float volumemedio;
    int numArtists1;
    int countLinhasOkSongs;
    int countLinhasNOkSongs;
    int countPrimeiraLinhaComErroA;
    String tipoEntidade;
    String ficheiro;

    static int  variavel = 0;

    Songs(String idTemaMusical, String titulo, int anoLancamento){
        this.idTemaMusical = idTemaMusical;
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
        variavel=1;
    }

    Songs(String idTemaMusical, String duracao, int letraExplicita, int popularidade, float dancabilidade, float vivacidade, float volumemedio){
        this.idTemaMusical = idTemaMusical;
        this.duracao = duracao;
        this.letraExplicita = letraExplicita;
        this.popularidade = popularidade;
        this.dancabilidade = dancabilidade;
        this.vivacidade = vivacidade;
        this.volumemedio = volumemedio;
        variavel=2;
    }

    Songs(String idTemaMusical, String titulo, int anoLancamento, String nomeArtists, int numArtists, String duracao, int letraExplicita, int popularidade, float dancabilidade, float vivacidade, float volumemedio, String TipoEntidade, int numArtists1){
        this.idTemaMusical = idTemaMusical;
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
        this.nomeArtists = nomeArtists;
        this.numArtists = numArtists;
        this.duracao = duracao;
        this.letraExplicita = letraExplicita;
        this.popularidade = popularidade;
        this.dancabilidade = dancabilidade;
        this.vivacidade = vivacidade;
        this.volumemedio = volumemedio;
        this.tipoEntidade = TipoEntidade;
        this.numArtists1 = numArtists1;
        variavel=3;

    }

    Songs(String idTemaMusical, String nomeArtists){
        this.idTemaMusical = idTemaMusical;
        this.nomeArtists = nomeArtists;
        this.tipoEntidade = tipoEntidade;
        variavel=4;
    }

    String nome;

    Songs(){

    }

    @Override
    public String toString() {


        if(tipoEntidade == "TEMA" || variavel ==1) {


            if (anoLancamento < 1995) {
                return idTemaMusical + " | " + titulo + " | " + anoLancamento;
            } else if (anoLancamento < 2000) {

                minutos = (Integer.parseInt(duracao) / 1000) / 60;
                segundos =  (Integer.parseInt(duracao) / 1000) % 60;

                if (segundos < 10){
                    return idTemaMusical + " | " + titulo + " | " + anoLancamento + " | " + minutos + ":" +"0"+ segundos  + " | " + popularidade;
                }

                return idTemaMusical + " | " + titulo + " | " + anoLancamento + " | " + minutos  + ":" + segundos  + " | " + popularidade;

            } else {

                minutos = (Integer.parseInt(duracao) / 1000) / 60;
                segundos =  (Integer.parseInt(duracao) / 1000) % 60;

                if (segundos < 10){
                    return idTemaMusical + " | " + titulo + " | " + anoLancamento + " | " + minutos + ":" +"0"+ segundos  + " | " + popularidade + " | " + numArtists;
                }

                return idTemaMusical + " | " + titulo + " | " + anoLancamento + " | " + minutos + ":" + segundos  + " | " + popularidade + " | " + numArtists;
            }


        } else if (tipoEntidade == "ARTISTA") {

            int posicaoLetra = 0;
            String nome1;


            for(int i = 0; i < nomeArtists.length(); i ++){
                if(Character.isLetter(nomeArtists.charAt(i))){
                    posicaoLetra = i;
                    break;
                }
            }


            if(nomeArtists.charAt(nomeArtists.length() - 1) == ' '){

                nome1 = nomeArtists.substring(posicaoLetra, nomeArtists.length() - 1);

            }else {

                nome1 = nomeArtists.substring(posicaoLetra, nomeArtists.length());
            }


            if(nome1.charAt(0) == 'A' || nome1.charAt(0) == 'B' || nome1.charAt(0) == 'C' || nome1.charAt(0) == 'D'){

                return "Artista: [" + nome1 + "]";

            }else{

                return "Artista: [" + nome1 + "] | " + numArtists1;
            }



        }else {

            return ficheiro + " | " + countLinhasOkSongs + " | " + countLinhasNOkSongs + " | " + countPrimeiraLinhaComErroA;

        }


    }

}

