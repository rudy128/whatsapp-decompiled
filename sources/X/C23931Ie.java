package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.1Ie  reason: invalid class name and case insensitive filesystem */
public class C23931Ie extends AnonymousClass1IZ {
    public int index = 0;
    public final /* synthetic */ Iterator[] val$elements;

    public C23931Ie(Iterator[] itArr) {
        this.val$elements = itArr;
    }

    public boolean hasNext() {
        if (this.index < this.val$elements.length) {
            return true;
        }
        return false;
    }

    public Iterator next() {
        if (hasNext()) {
            Iterator it = this.val$elements[this.index];
            it.getClass();
            Iterator[] itArr = this.val$elements;
            int i = this.index;
            itArr[i] = null;
            this.index = i + 1;
            return it;
        }
        throw new NoSuchElementException();
    }
}
