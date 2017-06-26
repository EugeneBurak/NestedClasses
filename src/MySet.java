import java.util.AbstractSet;
import java.util.Iterator;

/**
 * Created by java_dev on 26.06.17.
 */
public class MySet extends AbstractSet {    //Non static member class

    public Iterator iterator() {
        return new MyIterator(); }

    @Override
    public int size() {
        return 0;
    }

    private class MyIterator implements Iterator {
        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Object next() {
            return null;
        }
    }
}

