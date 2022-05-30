// 하위 버전에서 구동가능
public class ExitExample {
   public static void main(String[] args)  {
      //보안 관리자 설정
      System.setSecurityManager(new SecurityManager(){
         @Override
         public void checkExit(int status) {
            if(status != 5) { // 특정 상태 값이 있을때 종료 -> 보안관리자 설정
               throw new SecurityException();
            }
         }
      });
      
      for(int i=0; i<10; i++) {
         //i값 출력
         System.out.println(i);
         try {
            //JVM 종료 요청
            System.exit(i);
         } catch(SecurityException e) { }
      }
   }
}