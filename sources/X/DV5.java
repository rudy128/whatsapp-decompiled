package X;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

public abstract class DV5 implements Iterator {
    public int currentIndex;
    public int expectedMetadata;
    public int indexToRemove;
    public final /* synthetic */ C27301DbX this$0;

    public abstract Object getOutput(int i);

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
            Object output = getOutput(i);
            this.currentIndex = this.this$0.getSuccessor(this.currentIndex);
            return output;
        }
        throw BE6.A14();
    }

    public void remove() {
        checkForConcurrentModification();
        C201310y.checkRemove(AnonymousClass000.A1Q(this.indexToRemove));
        incrementExpectedModCount();
        C27301DbX dbX = this.this$0;
        dbX.remove(dbX.key(this.indexToRemove));
        this.currentIndex = this.this$0.adjustAfterRemove(this.currentIndex, this.indexToRemove);
        this.indexToRemove = -1;
    }

    public /* synthetic */ DV5(C27301DbX dbX, C23544BlX blX) {
        this(dbX);
    }

    public DV5(C27301DbX dbX) {
        this.this$0 = dbX;
        this.expectedMetadata = dbX.metadata;
        this.currentIndex = dbX.firstEntryIndex();
        this.indexToRemove = -1;
    }
}
