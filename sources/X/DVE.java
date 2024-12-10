package X;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;

public final class DVE implements ListIterator, C18450wR {
    public int A00;
    public int A01;
    public int A02 = -1;
    public final C27354DcQ A03;

    private final void A00() {
        if (this.A03.modCount != this.A00) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean hasNext() {
        int i = this.A01;
        C27354DcQ dcQ = this.A03;
        C27354DcQ dcQ2 = C27354DcQ.A00;
        return AnonymousClass000.A1U(i, dcQ.length);
    }

    public boolean hasPrevious() {
        return AnonymousClass000.A1R(this.A01);
    }

    public int nextIndex() {
        return this.A01;
    }

    public int previousIndex() {
        return this.A01 - 1;
    }

    public DVE(C27354DcQ dcQ, int i) {
        this.A03 = dcQ;
        this.A01 = i;
        this.A00 = dcQ.modCount;
    }

    public void add(Object obj) {
        A00();
        C27354DcQ dcQ = this.A03;
        int i = this.A01;
        this.A01 = i + 1;
        dcQ.add(i, obj);
        this.A02 = -1;
        this.A00 = dcQ.modCount;
    }

    public Object next() {
        A00();
        int i = this.A01;
        C27354DcQ dcQ = this.A03;
        C27354DcQ dcQ2 = C27354DcQ.A00;
        if (i < dcQ.length) {
            this.A01 = i + 1;
            this.A02 = i;
            return dcQ.backing[i];
        }
        throw BE6.A14();
    }

    public Object previous() {
        A00();
        int i = this.A01;
        if (i > 0) {
            int i2 = i - 1;
            this.A01 = i2;
            this.A02 = i2;
            C27354DcQ dcQ = this.A03;
            C27354DcQ dcQ2 = C27354DcQ.A00;
            return dcQ.backing[i2];
        }
        throw BE6.A14();
    }

    public void remove() {
        A00();
        int i = this.A02;
        if (i != -1) {
            C27354DcQ dcQ = this.A03;
            dcQ.remove(i);
            this.A01 = this.A02;
            this.A02 = -1;
            this.A00 = dcQ.modCount;
            return;
        }
        throw AnonymousClass000.A0n("Call next() or previous() before removing element from the iterator.");
    }

    public void set(Object obj) {
        A00();
        int i = this.A02;
        if (i != -1) {
            this.A03.set(i, obj);
            return;
        }
        throw AnonymousClass000.A0n("Call next() or previous() before replacing element from the iterator.");
    }
}
