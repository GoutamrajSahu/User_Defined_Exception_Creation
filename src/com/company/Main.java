package com.company;
import java.util.*;;

class CheckUserMailException extends Exception{
    CheckUserMailException(String message){
        super(message);
    }
}
class Main {
    static boolean checkPresence(String[] Seen, String email){
        for(int i=0;i<5; i++){
            System.out.println(Seen[i]);
        }
        for(int i=0;i<5; i++){
            if(Seen[i].equals(email)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the mails:");
        String[] Seen = new String[5];
        for(int i=0; i<5; i++){
            Seen[i] = Sc.nextLine();
        }
        System.out.println("Enter the check mails:");
        String email = Sc.nextLine();
        try{
            if(checkPresence(Seen, email)){
                throw new CheckUserMailException("Email already registered");
            }else{
                System.out.println("Email not registered.");
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}


//---------------------------------Simple program written below to understand the concept-----------------------//

//package com.company;
//        import java.util.*;;
//
//
//class InvalidException extends Exception{
//    InvalidException(String message){
//        super(message);
//    }
//}
//
//class Main {
//    public static void main(String[] args){
//        Scanner Sc = new Scanner(System.in);
//        System.out.println("Enter 2 strings: ");
//        String str = Sc.nextLine();
//        String str2 = Sc.nextLine();
//        try{
//            if(str.equals(str2)){
//                System.out.println("You are going in Correct direction.");
//            }else{
//                throw new InvalidException("You are going in Wrong direction.");
//            }
//        }catch(Exception e){
//            System.out.println(e);
//        }
//    }
//}