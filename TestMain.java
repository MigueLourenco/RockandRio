package pt.ulusofona.aed.rockindeisi2023;
import org.junit.jupiter.api.Test;
import java.io.File;
import static org.junit.jupiter.api.Assertions.assertEquals;

    public class TestMain {
        private Songs song;

        @Test
        public void ano_de_lancamento_menor_1995() {

            Songs song = new Songs();
            song.idTemaMusical ="1";
            song.anoLancamento = 1990;
            song.titulo = "Song Name";
            song.tipoEntidade = "TEMA";

            String expected = "1 | Song Name | 1990";
            String actual = song.toString();
            assertEquals(expected, actual);
        }


      @Test
        public void ano_de_lancamento_menor_2000() {
            song = new Songs();
            song.idTemaMusical = "1";
            song.titulo= "Song Name";
            song.tipoEntidade = "TEMA";
            song.duracao = "240000";
            song.popularidade = 85;
            song.anoLancamento = 1998;


            String expected = "1 | Song Name | 1998 | 4:00 | 85";
            String result = song.toString();
            assertEquals(expected, result);
        }

    @Test
        public void ano_de_lancamento_maior_2000(){
        song = new Songs();
        song.idTemaMusical = "1";
        song.titulo= "Song Name";
        song.tipoEntidade = "TEMA";
        song.duracao = "240000";
        song.popularidade = 85;
        song.anoLancamento = 2001;
        song.numArtists = 0;
        String expected = "1 | Song Name | 2001 | 4:00 | 85 | 0";
        String result = song.toString();
        assertEquals(expected, result);

    }
@Test
        void TestetoString() {
    song = new Songs();
    song.nomeArtists = "  Artist Name";
    song.tipoEntidade = "ARTISTA";
    song.numArtists = 1;

    String expected = "Artista: [Artist Name]";
   String  result = song.toString();
   assertEquals(expected,result);
}


@Test
      void TesteLoadfiles(){
    File file = new File("test-files");

     boolean load = Main.loadFiles(file);

     boolean esperado = false;

     assertEquals(load,esperado);

}

@Test
        void TestescomERROS(){
    File file = new File("test-files");
    boolean load = Main.loadFiles(file);
    boolean  esperado = false;
    assertEquals(esperado,load);

}
    }




