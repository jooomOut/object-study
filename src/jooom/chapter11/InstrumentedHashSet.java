package jooom.chapter11;

import java.util.Collection;
import java.util.Set;


/**
 * 메서드 오버라이딩의 오작용
 *
 * 상속 관계를 제거하고 합성을 사용해 count 오류를 제거
 * */
public class InstrumentedHashSet<E> {
    private int addCount = 0;
    private Set<E> set;

    public InstrumentedHashSet(Set<E> set) {
        this.set = set;
    }

    public boolean add(E e){
        addCount++;
        return set.add(e);
    }

    public boolean addAll(Collection<? extends E> c){
        addCount += c.size();
        return set.addAll(c);
    }

    public int getAddCount(){
        return addCount;
    }
}
