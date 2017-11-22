public class OrbTest { 
  static protected org.omg.CORBA.ORB _orb = null;

  public static void main(String args[]) { 
    System.setProperty("org.omg.PortableInterceptor.ORBInitializerClass.InterpositionORBInitializerImpl", "InterpositionORBInitializerImpl");
    _orb = org.omg.CORBA.ORB.init(new String[]{}, null);
    System.out.println("orb init ok");
  }
}
