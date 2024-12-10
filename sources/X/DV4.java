package X;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

public class DV4 implements Iterator {
    public int currentIndex;
    public int expectedMetadata;
    public int indexToRemove = -1;
    public final /* synthetic */ C27308Dbf this$0;

    public DV4(C27308Dbf dbf) {
        this.this$0 = dbf;
        this.expectedMetadata = dbf.metadata;
        this.currentIndex = dbf.firstEntryIndex();
    }

    private void checkForConcurrentModification() {
        if (this.this$0.metadata != this.expectedMetadata) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean hasNext() {
        return AnonymousClass000.A1Q(this.currentIndex);
    }

    public void incrementExpectedModCount() {
        this.expectedMetadata += 32;
    }

    public Object next() {
        checkForConcurrentModification();
        if (hasNext()) {
            int i = this.currentIndex;
            this.indexToRemove = i;
            Object access$100 = this.this$0.element(i);
            this.currentIndex = this.this$0.getSuccessor(this.currentIndex);
            return access$100;
        }
        throw BE6.A14();
    }

    public void remove() {
        checkForConcurrentModification();
        C201310y.checkRemove(AnonymousClass000.A1Q(this.indexToRemove));
        incrementExpectedModCount();
        C27308Dbf dbf = this.this$0;
        dbf.remove(dbf.element(this.indexToRemove));
        this.currentIndex = this.this$0.adjustAfterRemove(this.currentIndex, this.indexToRemove);
        this.indexToRemove = -1;
    }
}
