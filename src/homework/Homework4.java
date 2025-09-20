package homework;

public class Homework4 {

    public static void main(String[] args) {
        char[] letters = {'բ', 'ա', 'ր', 'և', 'ա', 'շ', 'խ', 'ա', 'ր', 'հ',};

             int count = 0;
             System.out.println("vowels");
              for(char ch : letters) {
                  switch (ch) {
                      case 'ա':
                      case 'ի':
                      case 'օ':
                      case 'ո':
                      case 'է':
                      case 'ե':
                          System.out.println("char");
                          count++;
                  }
                  break;
              }

               System.out.println("vowels count = "  + count);
                  }
        }

