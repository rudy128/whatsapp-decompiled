package X;

import java.util.Arrays;
import java.util.Collection;

/* renamed from: X.1F7  reason: invalid class name */
public abstract class AnonymousClass1F7 extends C201410z {
    public Object[] contents;
    public boolean forceCopy;
    public int size = 0;

    private void getReadyToExpandTo(int i) {
        Object[] objArr;
        Object[] objArr2 = this.contents;
        int length = objArr2.length;
        if (length < i) {
            objArr = Arrays.copyOf(objArr2, C201410z.expandedCapacity(length, i));
        } else if (this.forceCopy) {
            objArr = (Object[]) objArr2.clone();
        } else {
            return;
        }
        this.contents = objArr;
        this.forceCopy = false;
    }

    public C201410z addAll(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            getReadyToExpandTo(this.size + collection.size());
            if (collection instanceof C199310e) {
                this.size = ((C199310e) collection).copyIntoArray(this.contents, this.size);
                return this;
            }
        }
        super.addAll(iterable);
        return this;
    }

    public AnonymousClass1F7(int i) {
        C201310y.checkNonnegative(i, "initialCapacity");
        this.contents = new Object[i];
    }

    public AnonymousClass1F7 add(Object obj) {
        C199610h.A04(obj);
        getReadyToExpandTo(this.size + 1);
        Object[] objArr = this.contents;
        int i = this.size;
        this.size = i + 1;
        objArr[i] = obj;
        return this;
    }

    public C201410z add(Object... objArr) {
        addAll(objArr, objArr.length);
        return this;
    }

    public final void addAll(Object[] objArr, int i) {
        AnonymousClass1HW.checkElementsNotNull(objArr, i);
        getReadyToExpandTo(this.size + i);
        System.arraycopy(objArr, 0, this.contents, this.size, i);
        this.size += i;
    }
}
