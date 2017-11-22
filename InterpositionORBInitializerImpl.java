import org.omg.CORBA.LocalObject;
import org.omg.PortableInterceptor.ORBInitInfo;
import org.omg.PortableInterceptor.ORBInitializer;

public class InterpositionORBInitializerImpl extends LocalObject implements ORBInitializer {

   public void pre_init (ORBInitInfo init_info) {
     System.out.println("pre_init");
   }
   public void post_init (ORBInitInfo init_info) {
     System.out.println("post_init");
   }
}
