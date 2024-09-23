import java.util.Scanner;
public class Çin {
    public static void main(String[] args) {
        int yıl;
          Scanner inp=new Scanner(System.in);
            System.out.print("DOĞUM YILINIZI GİRİNİZ:");
               yıl= inp.nextInt();

               String str=("ÇİN ZODYAĞI BURCUNUZ:");

               switch (yıl%12){
                       case 0:
                           System.out.print("MONKEY"+str);

                           break;
                              case 1:
                                  System.out.print("HOROZ"+str);
                                  break;
                                      case 2:
                                          System.out.print(str+"KÖPEK");
                                           break;
                                                case 3:
                                                    System.out.print(str+"DOMUZ");
                                                     break;
                                                        case 4:
                                                          System.out.print(str+"FARE");
                                                       break;
                                                          case 5:
                                                              System.out.print(str+"ÖKÜZ");
                                                         break;
                                                     case 6:
                                                    System.out.print(str+"KAPLAN");
                                               break;
                                           case 7:
                                            System.out.print(str+"TAVŞAN");
                                        break;
                                  case 8:
                                     System.out.print(str+"EJDERHA");
                                     break;
                             case 9:
                                   System.out.print(str+"YILAN");
                       break;
                   case 10:
                       System.out.print(str+"AT");
                       break;
                   case 11:
                       System.out.print("KOYUN"+str);
                    
                       break;



               }

    }
}