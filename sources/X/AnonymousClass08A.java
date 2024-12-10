package X;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* renamed from: X.08A  reason: invalid class name */
public class AnonymousClass08A extends C06810Zt implements Iterator, C18450wR {
    public int A00;
    public boolean A01;
    public Object A02;
    public final C07370ap A03;

    private final void A00(C05180Qv r6, Object obj, int i, int i2) {
        int i3 = i2 * 5;
        if (i3 > 30) {
            C06800Zs[] A05 = A05();
            C06800Zs r3 = A05[i2];
            Object[] objArr = r6.A02;
            r3.A07(objArr, objArr.length, 0);
            while (!C18070vi.A18(r3.A02(), obj)) {
                r3 = A05[i2];
                r3.A03();
            }
        } else {
            int i4 = 1 << ((i >> i3) & 31);
            int i5 = r6.A00;
            if ((i4 & i5) != 0) {
                A05()[i2].A07(r6.A02, Integer.bitCount(i5) * 2, r6.A0N(i4));
            } else {
                int A0O = r6.A0O(i4);
                C05180Qv A0Q = r6.A0Q(A0O);
                A05()[i2].A07(r6.A02, Integer.bitCount(r6.A00) * 2, A0O);
                A00(A0Q, obj, i, i2 + 1);
                return;
            }
        }
        A04(i2);
    }

    public final void A06(Object obj, Object obj2) {
        C07370ap r4 = this.A03;
        if (r4.containsKey(obj)) {
            if (hasNext()) {
                Object A032 = A03();
                r4.put(obj, obj2);
                A00(r4.A02(), A032, AnonymousClass001.A0l(A032), 0);
            } else {
                r4.put(obj, obj2);
            }
            this.A00 = r4.A00();
        }
    }

    public Object next() {
        if (this.A03.A00() == this.A00) {
            this.A02 = A03();
            this.A01 = true;
            return super.next();
        }
        throw new ConcurrentModificationException();
    }

    public void remove() {
        C07370ap r2;
        if (this.A01) {
            if (hasNext()) {
                Object A032 = A03();
                r2 = this.A03;
                C41681wt.A03(r2).remove(this.A02);
                A00(r2.A02(), A032, AnonymousClass001.A0l(A032), 0);
            } else {
                r2 = this.A03;
                C41681wt.A03(r2).remove(this.A02);
            }
            this.A02 = null;
            this.A01 = false;
            this.A00 = r2.A00();
            return;
        }
        throw new IllegalStateException();
    }

    public AnonymousClass08A(C07370ap r2, C06800Zs[] r3) {
        super(r2.A02(), r3);
        this.A03 = r2;
        this.A00 = r2.A00();
    }
}
