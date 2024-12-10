package X;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

public class DV2 implements Iterator {
    public int expectedModCount;
    public int index;
    public int indexToRemove = -1;
    public int remaining;
    public final /* synthetic */ C27304Dba this$0;

    public DV2(C27304Dba dba) {
        this.this$0 = dba;
        C27300DbW dbW = dba.biMap;
        this.index = dbW.firstInInsertionOrder;
        this.expectedModCount = dbW.modCount;
        this.remaining = dbW.size;
    }

    private void checkForComodification() {
        if (this.this$0.biMap.modCount != this.expectedModCount) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean hasNext() {
        checkForComodification();
        if (this.index == -2 || this.remaining <= 0) {
            return false;
        }
        return true;
    }

    public Object next() {
        if (hasNext()) {
            C27304Dba dba = this.this$0;
            int i = this.index;
            Object forEntry = dba.forEntry(i);
            this.indexToRemove = i;
            this.index = dba.biMap.nextInInsertionOrder[i];
            this.remaining--;
            return forEntry;
        }
        throw BE6.A14();
    }

    public void remove() {
        checkForComodification();
        C201310y.checkRemove(AnonymousClass000.A1S(this.indexToRemove, -1));
        this.this$0.biMap.removeEntry(this.indexToRemove);
        int i = this.index;
        C27300DbW dbW = this.this$0.biMap;
        if (i == dbW.size) {
            this.index = this.indexToRemove;
        }
        this.indexToRemove = -1;
        this.expectedModCount = dbW.modCount;
    }
}
