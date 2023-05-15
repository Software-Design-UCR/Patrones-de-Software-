
public class Singleton {

    //Instancia pública accesible globalmente
    public static singleton = new Singleton();

    private Singleton(){
        //Constructor privado
    }
}

//Implementación clasica
class Singleton
{
    private static Singleton obj;
 
    //Constructor privado
    private Singleton() {}
 
    public static Singleton getInstance()
    {
        if (obj==null)
            obj = new Singleton();
        return obj;
    }
}

//Implementación Thread safe
class Singleton
{
    private static Singleton obj;
 
    private Singleton() {}
 
    // Only one thread can execute this at a time
    public static synchronized Singleton getInstance()
    {
        if (obj==null)
            obj = new Singleton();
        return obj;
    }
}

//Implementación Eager/Impaciente
class Singleton
{
    private static Singleton obj = new Singleton();
 
    private Singleton() {}
 
    public static Singleton getInstance()
    {
        return obj;
    }
}

//Double checked locking 
class Singleton
{
    private static volatile Singleton obj  = null;
 
    private Singleton() {}
 
    public static Singleton getInstance()
    {
        if (obj == null)
        {
            // thread safe
            synchronized (Singleton.class)
            {
                // En caso de que varios 
                // hilos lleguen acá
                if (obj==null)
                    obj = new Singleton();
            }
        }
        return obj;
    }
}


