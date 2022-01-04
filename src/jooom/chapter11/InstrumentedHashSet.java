package jooom.chapter11;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.Spliterator;


/**
 * 메서드 오버라이딩의 오작용
 *
 * 상속 관계를 제거하고 합성을 사용해 count 오류를 제거
 * */
public class InstrumentedHashSet<E> implements Set<E> {
    private int addCount = 0;
    private Set<E> set;

    public InstrumentedHashSet(Set<E> set) {
        this.set = set;
    }

    @Override
    public boolean add(E e){
        addCount++;
        return set.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c){
        addCount += c.size();
        return set.addAll(c);
    }

    public int getAddCount(){
        return addCount;
    }

    @Override public int size() {return set.size();}
    @Override public boolean isEmpty() {return set.isEmpty();}
    @Override public boolean contains(Object o) {return set.contains(o);}
    @Override public Iterator<E> iterator() {return set.iterator();}
    @Override public Object[] toArray() {return set.toArray();}
    @Override public <T> T[] toArray(T[] a) {return set.toArray(a);}
    @Override public boolean remove(Object o) {return set.remove(o);}
    @Override public boolean containsAll(Collection<?> c) {return set.containsAll(c);}
    @Override public boolean retainAll(Collection<?> c) {return set.retainAll(c);}
    @Override public boolean removeAll(Collection<?> c) {return set.removeAll(c);}
    @Override public void clear() {set.clear();}
    @Override public boolean equals(Object o) {return set.equals(o);}
    @Override public  int hashCode() {return set.hashCode();}
    @Override public Spliterator<E> spliterator() {return set.spliterator();}
}
