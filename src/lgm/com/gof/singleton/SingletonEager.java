package lgm.com.gof.singleton;

/**
 *  Singleton "Apressado"
 *
 * @author liviagoncalves
 */
public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }
}
