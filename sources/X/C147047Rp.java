package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.7Rp  reason: invalid class name and case insensitive filesystem */
public class C147047Rp implements Iterator, C18450wR {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03 = 0;
    public final Object A04;

    public C147047Rp(C147157Sa r2) {
        this.A04 = r2;
        this.A01 = r2.A01.iterator();
        this.A00 = -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00() {
        /*
            r4 = this;
        L_0x0000:
            java.lang.Object r1 = r4.A01
            java.util.Iterator r1 = (java.util.Iterator) r1
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0026
            java.lang.Object r3 = r1.next()
            java.lang.Object r2 = r4.A04
            X.7Sa r2 = (X.C147157Sa) r2
            X.1Di r0 = r2.A00
            java.lang.Object r0 = r0.invoke(r3)
            boolean r1 = X.AnonymousClass000.A1Y(r0)
            boolean r0 = r2.A02
            if (r1 != r0) goto L_0x0000
            r4.A02 = r3
            r0 = 1
        L_0x0023:
            r4.A00 = r0
            return
        L_0x0026:
            r0 = 0
            goto L_0x0023
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C147047Rp.A00():void");
    }

    public final boolean A01() {
        Iterator it;
        Iterator it2 = (Iterator) this.A01;
        if (it2 == null || !it2.hasNext()) {
            do {
                Iterator it3 = (Iterator) this.A02;
                if (it3.hasNext()) {
                    Object next = it3.next();
                    C147167Sb r0 = (C147167Sb) this.A04;
                    it = (Iterator) r0.A00.invoke(r0.A01.invoke(next));
                } else {
                    this.A00 = 2;
                    this.A01 = null;
                    return false;
                }
            } while (!it.hasNext());
            this.A01 = it;
        }
        this.A00 = 1;
        return true;
    }

    public boolean hasNext() {
        int i = this.A03;
        int i2 = this.A00;
        if (i == 0) {
            if (i2 == -1) {
                A00();
            }
            if (this.A00 == 1) {
                return true;
            }
            return false;
        } else if (i2 == 1) {
            return true;
        } else {
            if (i2 != 2) {
                return A01();
            }
            return false;
        }
    }

    public Object next() {
        if (this.A03 != 0) {
            int i = this.A00;
            if (i == 2) {
                throw new NoSuchElementException();
            } else if (i != 0 || A01()) {
                this.A00 = 0;
                Iterator it = (Iterator) this.A01;
                C18070vi.A0b(it);
                return it.next();
            } else {
                throw new NoSuchElementException();
            }
        } else {
            if (this.A00 == -1) {
                A00();
            }
            if (this.A00 != 0) {
                Object obj = this.A02;
                this.A02 = null;
                this.A00 = -1;
                return obj;
            }
            throw new NoSuchElementException();
        }
    }

    public void remove() {
        if (this.A03 != 0) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public C147047Rp(C147167Sb r2) {
        this.A04 = r2;
        this.A02 = r2.A02.iterator();
    }
}
