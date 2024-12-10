package X;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

public abstract class DV3 implements Iterator {
    public int entryIndex;
    public int expectedModCount;
    public final /* synthetic */ C23543BlW this$0;
    public int toRemove = -1;

    public abstract Object result(int i);

    public DV3(C23543BlW blW) {
        this.this$0 = blW;
        C26286Cwi cwi = blW.backingMap;
        this.entryIndex = cwi.firstIndex();
        this.expectedModCount = cwi.modCount;
    }

    private void checkForConcurrentModification() {
        if (this.this$0.backingMap.modCount != this.expectedModCount) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean hasNext() {
        checkForConcurrentModification();
        return AnonymousClass000.A1Q(this.entryIndex);
    }

    public Object next() {
        if (hasNext()) {
            Object result = result(this.entryIndex);
            int i = this.entryIndex;
            this.toRemove = i;
            this.entryIndex = this.this$0.backingMap.nextIndex(i);
            return result;
        }
        throw BE6.A14();
    }

    public void remove() {
        checkForConcurrentModification();
        C201310y.checkRemove(AnonymousClass000.A1S(this.toRemove, -1));
        C23543BlW blW = this.this$0;
        blW.size -= (long) blW.backingMap.removeEntry(this.toRemove);
        C26286Cwi cwi = this.this$0.backingMap;
        this.entryIndex = cwi.nextIndexAfterRemove(this.entryIndex, this.toRemove);
        this.toRemove = -1;
        this.expectedModCount = cwi.modCount;
    }
}
