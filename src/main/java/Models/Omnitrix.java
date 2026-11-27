package Models;

import Exceptions.OmnitrixDescarregadoException;
import Exceptions.OmnitrixJaCarregadoException;


public interface  Omnitrix {
    int descarregarOmnitrix();
    int carregarOmnitrix() throws OmnitrixJaCarregadoException;
    Alien transformar (Alien alienEscolhido)throws OmnitrixDescarregadoException;
    void adicionarAlien(Alien novoAlien);
}
