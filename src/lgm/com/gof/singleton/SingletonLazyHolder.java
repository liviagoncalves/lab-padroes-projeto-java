package lgm.com.gof.singleton;

/**
 *  Singleton "Lazer Holder"
 *
 * @see <a href="https://stackoverflow.com/a/2418148">Referencia</a>
 *
 * @author liviagoncalves
 */
public class SingletonLazyHolder {

    private static class InstanceHolder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstancia() {
        return InstanceHolder.instancia;
    }
}
