package ex_robo;

public class MoveRobo {
        public static void main(String args[]) throws InterruptedException
        {
          char escCode = 0x1B; 
          int row = 1, col = 1; 
          int rowinc = 1 ,colinc = 1; 
          while (true)
          {
            System.out.print(String.format("%c[%d;%df ",escCode,row,col));
            if ( row + rowinc < 1 || row + rowinc > 15 )
              rowinc = -rowinc;
            row += rowinc;
            if ( col + colinc < 1 || col + colinc > 40 )
              colinc = -colinc;
            col += colinc;
            System.out.print(String.format("%c[%d;%dfO%c[1D",escCode,row,col,escCode));
            Thread.sleep(250);
          }
        
      }
    
}
