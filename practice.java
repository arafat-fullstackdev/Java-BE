public class practice {

    int lessThanThirty_MinCal = 15;
    int sixty_Min = 19;
    int ninty_MIn = 21;

    public class One{

          public static void main(String[] args){

        System.out.println("Class One");
        //create obj
        practice obj_One = new practice();
        System.out.println(obj_One.lessThanThirty_MinCal);
    }
    }

    public class Two{
    
        public static void main(String[]  args){
            System.out.println("Class Two!");

            //create obj
        practice obj_Two = new practice();
        System.out.println(obj_Two.sixty_Min);
        }
    }
    public class Three{
    public static void main(String[]  args){
            System.out.println("Class Three!");

            //create obj
        practice obj_Three = new practice();
        System.out.println(obj_Three.ninty_MIn);
        }
    }

    public static void main(String[] args){
        System.out.println("Hello Man!");
    }
    
}
