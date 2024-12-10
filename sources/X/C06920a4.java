package X;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;

/* renamed from: X.0a4  reason: invalid class name and case insensitive filesystem */
public final class C06920a4 implements ListIterator, C18450wR {
    public int A00;
    public int A01 = -1;
    public int A02;
    public final C06820Zu A03;

    private final void A00() {
        if (this.A03.A02() != this.A02) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean hasNext() {
        if (this.A00 >= this.A03.size() - 1) {
            return false;
        }
        return true;
    }

    public boolean hasPrevious() {
        return AnonymousClass000.A1Q(this.A00);
    }

    public int nextIndex() {
        return this.A00 + 1;
    }

    public C06920a4(C06820Zu r2, int i) {
        this.A03 = r2;
        this.A00 = i - 1;
        this.A02 = r2.A02();
    }

    public void add(Object obj) {
        A00();
        C06820Zu r1 = this.A03;
        r1.add(this.A00 + 1, obj);
        this.A01 = -1;
        this.A00++;
        this.A02 = r1.A02();
    }

    public Object next() {
        A00();
        int i = this.A00 + 1;
        this.A01 = i;
        C06820Zu r1 = this.A03;
        C04110Lw.A00(i, r1.size());
        Object obj = r1.get(i);
        this.A00 = i;
        return obj;
    }

    public Object previous() {
        A00();
        int i = this.A00;
        C06820Zu r1 = this.A03;
        C04110Lw.A00(i, r1.size());
        int i2 = this.A00;
        this.A01 = i2;
        this.A00--;
        return r1.get(i2);
    }

    public int previousIndex() {
        return this.A00;
    }

    public void remove() {
        A00();
        C06820Zu r2 = this.A03;
        r2.remove(this.A00);
        this.A00--;
        this.A01 = -1;
        this.A02 = r2.A02();
    }

    public void set(Object obj) {
        A00();
        int i = this.A01;
        if (i >= 0) {
            C06820Zu r0 = this.A03;
            r0.set(i, obj);
            this.A02 = r0.A02();
            return;
        }
        throw AnonymousClass000.A0n("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
    }
}
