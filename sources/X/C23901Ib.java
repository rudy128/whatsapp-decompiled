package X;

import java.util.NoSuchElementException;

/* renamed from: X.1Ib  reason: invalid class name and case insensitive filesystem */
public abstract class C23901Ib extends C23891Ia {
    public int position;
    public final int size;

    public abstract Object get(int i);

    public final boolean hasNext() {
        if (this.position < this.size) {
            return true;
        }
        return false;
    }

    public final boolean hasPrevious() {
        if (this.position > 0) {
            return true;
        }
        return false;
    }

    public final int previousIndex() {
        return this.position - 1;
    }

    public C23901Ib(int i, int i2) {
        C199610h.A02(i2, i);
        this.size = i;
        this.position = i2;
    }

    public final Object next() {
        if (hasNext()) {
            int i = this.position;
            this.position = i + 1;
            return get(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.position;
    }

    public final Object previous() {
        if (hasPrevious()) {
            int i = this.position - 1;
            this.position = i;
            return get(i);
        }
        throw new NoSuchElementException();
    }
}
