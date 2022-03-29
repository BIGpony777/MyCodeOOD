public class SmartMove extends NextMove{
  @Override
  public Move getNextMove(char board[][]){
  for(int i =0; i<3; i++){
      if(board[i][0]==board[i][1]&&board[i][0]!= ' '&&board[i][2]==' '){
        return new Move(i, 2);
      }
      if(board[i][0]==board[i][2]&&board[i][0]!=' '&&board[i][1]==' '){
        return new Move(i, 1);
      }
      if(board[i][1]==board[i][2]&&board[i][1]!=' '&&board[i][0]==' '){
        return new Move(i, 0);
      } 
    }
    
  return super.getNextMove(board);
}
}
