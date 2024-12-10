package X;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: X.2AM  reason: invalid class name */
public class AnonymousClass2AM extends AnonymousClass1IZ {
    public final /* synthetic */ Iterator val$iterator;
    public final /* synthetic */ int val$size;

    public AnonymousClass2AM(Iterator it, int i, boolean z) {
        this.val$iterator = it;
        this.val$size = i;
    }

    public boolean hasNext() {
        return this.val$iterator.hasNext();
    }

    public List next() {
        if (hasNext()) {
            Object[] objArr = new Object[this.val$size];
            int i = 0;
            while (i < this.val$size && this.val$iterator.hasNext()) {
                objArr[i] = this.val$iterator.next();
                i++;
            }
            for (int i2 = i; i2 < this.val$size; i2++) {
                objArr[i2] = null;
            }
            List unmodifiableList = Collections.unmodifiableList(Arrays.asList(objArr));
            if (i != this.val$size) {
                return unmodifiableList.subList(0, i);
            }
            return unmodifiableList;
        }
        throw new NoSuchElementException();
    }
}
