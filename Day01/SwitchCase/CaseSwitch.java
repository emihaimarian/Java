public class CaseSwitch{
    public static void main(String [] args){
        char season = 's';
        
        switch(season){
            case 's':
                System.out.println("It`s hot outside");
                break;
                
            case 'w':
                System.out.println("It`s cold outside");
                break;
                
            case 'p':
            case 'a':
                System.out.println("it's raining");
        }
    }
}