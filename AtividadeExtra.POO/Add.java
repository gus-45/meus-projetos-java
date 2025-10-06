public class void Add(node newNode) {
  if(cursor == null) {
     newNode.setNext(newNode);
     cursor = newNode;
  } else {
     newNode.setNext(cursor.getNext()); //novoNo aponta para o proximo dele e para o proximo do cursor
     cursor.setNext(newNode); // o proximo do cursor vai ser o newNode ( novoNo)
  }
  advance();
  size++;
}

//public void add() {
 //  if( cursor ==  null) {
  //   newNode = cursor.setNext(newNode);
  //   cursor = newNode;
  // }else {
   //  newNode.setNext(cursor.getNext());
    // cursor.setNext
   

//public Node remove() {
 // Node oldNode = cursor;
  //if( size == 1){
  //  cursor = null;
  //} else { // indo até o anterior do cursor, não dando a volta
    //for(int i = 0; i < size -1; i++) {
    //cursor = cursor.getNext();
    //}
    //cursor.setNext(oldNode.getNext()); // 
   // oldNode.setNext(null);
  // }
   //size--;
  // return oldNode;
 //}  
  
 // public void advance() {
  // cursor = cursor.getNext();
  //}
  
  