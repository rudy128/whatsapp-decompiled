package X;

import com.google.common.base.Strings;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Iterator;

/* renamed from: X.BlW  reason: case insensitive filesystem */
public abstract class C23543BlW<E> extends C27285DbE<E> implements Serializable {
    public static final long serialVersionUID = 0;
    public transient C26286Cwi backingMap = newBackingMap(3);
    public transient long size;

    public C23543BlW(int i) {
    }

    public final Iterator elementIterator() {
        return new C23536BlP(this, 0);
    }

    public final Iterator entryIterator() {
        return new C23536BlP(this, 1);
    }

    public abstract C26286Cwi newBackingMap(int i);

    public final int add(Object obj, int i) {
        if (i == 0) {
            return count(obj);
        }
        boolean z = true;
        if (AnonymousClass000.A1R(i)) {
            int indexOf = this.backingMap.indexOf(obj);
            C26286Cwi cwi = this.backingMap;
            if (indexOf == -1) {
                cwi.put(obj, i);
                this.size += (long) i;
                return 0;
            }
            int value = cwi.getValue(indexOf);
            long j = (long) i;
            long j2 = ((long) value) + j;
            if (j2 > 2147483647L) {
                z = false;
            }
            if (z) {
                this.backingMap.setValue(indexOf, (int) j2);
                this.size += j;
                return value;
            }
            Object[] A1a = AnonymousClass3MW.A1a();
            BE8.A1N(A1a, j2);
            throw AnonymousClass000.A0k(Strings.A00("too many occurrences: %s", A1a));
        }
        Object[] objArr = new Object[1];
        C17880vN.A1T(objArr, i, 0);
        throw AnonymousClass000.A0k(Strings.A00("occurrences cannot be negative: %s", objArr));
    }

    public final void clear() {
        this.backingMap.clear();
        this.size = 0;
    }

    public final int count(Object obj) {
        return this.backingMap.get(obj);
    }

    public final int distinctElements() {
        return this.backingMap.size();
    }

    public final int remove(Object obj, int i) {
        if (i == 0) {
            return count(obj);
        }
        int i2 = 0;
        if (AnonymousClass000.A1R(i)) {
            int indexOf = this.backingMap.indexOf(obj);
            if (indexOf != -1) {
                i2 = this.backingMap.getValue(indexOf);
                if (i2 > i) {
                    this.backingMap.setValue(indexOf, i2 - i);
                } else {
                    this.backingMap.removeEntry(indexOf);
                    i = i2;
                }
                this.size -= (long) i;
            }
            return i2;
        }
        Object[] A1a = AnonymousClass3MW.A1a();
        C17880vN.A1T(A1a, i, 0);
        throw AnonymousClass000.A0k(Strings.A00("occurrences cannot be negative: %s", A1a));
    }

    public final boolean setCount(Object obj, int i, int i2) {
        long j;
        long j2;
        C201310y.checkNonnegative(i, "oldCount");
        C201310y.checkNonnegative(i2, "newCount");
        int indexOf = this.backingMap.indexOf(obj);
        if (indexOf == -1) {
            if (i == 0) {
                if (i2 > 0) {
                    this.backingMap.put(obj, i2);
                    j = this.size;
                }
                return true;
            }
            return false;
        }
        if (this.backingMap.getValue(indexOf) == i) {
            C26286Cwi cwi = this.backingMap;
            if (i2 == 0) {
                cwi.removeEntry(indexOf);
                j2 = this.size - ((long) i);
                this.size = j2;
                return true;
            }
            cwi.setValue(indexOf, i2);
            j = this.size;
            i2 -= i;
        }
        return false;
        j2 = j + ((long) i2);
        this.size = j2;
        return true;
    }

    public final int size() {
        return C25336Cdv.A00(this.size);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readCount = C26230CvM.readCount(objectInputStream);
        this.backingMap = newBackingMap(3);
        C26230CvM.populateMultiset(this, objectInputStream, readCount);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        C26230CvM.writeMultiset(this, objectOutputStream);
    }

    public void addTo(C28677EDz eDz) {
        C199610h.A04(eDz);
        C26286Cwi cwi = this.backingMap;
        int firstIndex = cwi.firstIndex();
        while (firstIndex >= 0) {
            eDz.add(cwi.getKey(firstIndex), this.backingMap.getValue(firstIndex));
            cwi = this.backingMap;
            firstIndex = cwi.nextIndex(firstIndex);
        }
    }

    public final Iterator iterator() {
        return C26253Cvt.iteratorImpl(this);
    }
}
