package lgm.com.gof;

/**
 *  Singleton "preguiçoso"
 *
 * @author liviagoncalves
 */
public class SingletonEager {

    private static SingletonEager instancia;

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia() {
        if (instancia  == null) {
            instancia = new SingletonEager();
        }
        return instancia;
    }
}
