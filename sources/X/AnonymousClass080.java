package X;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;

/* renamed from: X.080  reason: invalid class name */
public final class AnonymousClass080 extends C06910a3 implements ListIterator, C18450wR {
    public int A00;
    public int A01 = -1;
    public C013107z A02;
    public final C07360ao A03;

    private final void A00() {
        if (this.A00 != this.A03.A0T()) {
            throw new ConcurrentModificationException();
        }
    }

    private final void A01() {
        C013107z r0;
        C07360ao r1 = this.A03;
        Object[] A0X = r1.A0X();
        if (A0X == null) {
            r0 = null;
        } else {
            int A0Q = AnonymousClass000.A0Q(r1) & -32;
            int A022 = A02();
            if (A022 > A0Q) {
                A022 = A0Q;
            }
            int A0U = (r1.A0U() / 5) + 1;
            C013107z r02 = this.A02;
            if (r02 == null) {
                r0 = new C013107z(A0X, A022, A0Q, A0U);
            } else {
                C18070vi.A0b(r02);
                r02.A08(A0X, A022, A0Q, A0U);
                return;
            }
        }
        this.A02 = r0;
    }

    public AnonymousClass080(C07360ao r2, int i) {
        super(i, r2.size());
        this.A03 = r2;
        this.A00 = r2.A0T();
        A01();
    }

    public void add(Object obj) {
        A00();
        C07360ao r1 = this.A03;
        r1.add(A02(), obj);
        A06(A02() + 1);
        A07(r1.size());
        this.A00 = r1.A0T();
        this.A01 = -1;
        A01();
    }

    public Object next() {
        Object[] A0Y;
        A00();
        A04();
        int A022 = A02();
        this.A01 = A022;
        C013107z r2 = this.A02;
        if (r2 == null) {
            A0Y = this.A03.A0Y();
            A06(A022 + 1);
        } else if (r2.hasNext()) {
            A06(A022 + 1);
            return r2.next();
        } else {
            A0Y = this.A03.A0Y();
            A06(A022 + 1);
            A022 -= r2.A03();
        }
        return A0Y[A022];
    }

    public Object previous() {
        Object[] A0Y;
        int A022;
        A00();
        A05();
        int A023 = A02();
        int i = A023 - 1;
        this.A01 = i;
        C013107z r0 = this.A02;
        if (r0 == null) {
            A0Y = this.A03.A0Y();
            A06(i);
            A022 = A02();
        } else {
            int A032 = r0.A03();
            if (A023 > A032) {
                A0Y = this.A03.A0Y();
                A06(i);
                A022 = A02() - A032;
            } else {
                A06(i);
                return r0.previous();
            }
        }
        return A0Y[A022];
    }

    public void remove() {
        A00();
        int i = this.A01;
        if (i != -1) {
            C07360ao r2 = this.A03;
            r2.remove(i);
            int i2 = this.A01;
            if (i2 < A02()) {
                A06(i2);
            }
            A07(r2.size());
            this.A00 = r2.A0T();
            this.A01 = -1;
            A01();
            return;
        }
        throw new IllegalStateException();
    }

    public void set(Object obj) {
        A00();
        int i = this.A01;
        if (i != -1) {
            C07360ao r0 = this.A03;
            r0.set(i, obj);
            this.A00 = r0.A0T();
            A01();
            return;
        }
        throw new IllegalStateException();
    }
}
