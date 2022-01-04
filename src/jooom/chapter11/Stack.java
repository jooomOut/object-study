package jooom.chapter11;

import java.util.EmptyStackException;
import java.util.Vector;

/**
 * 불필요한 인터페이스의 상속으로 생기는 문제
 *
 * Stack의 FIFO 구조가 Vector의 중간 삽입 메서드로 깨질 우려가 있어
 * 합성으로 변경한다.
 * */
public class Stack<E> {
    private Vector<E> elements = new Vector<>();

    public E push(E item){
        elements.addElement(item);
        return item;
    }
    public E pop(){
        if (elements.isEmpty()){
            throw new EmptyStackException();
        }
        return elements.remove(elements.size() - 1);
    }
}
