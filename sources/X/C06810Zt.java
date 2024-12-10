package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.0Zt  reason: invalid class name and case insensitive filesystem */
public abstract class C06810Zt implements Iterator, C18450wR {
    public int A00;
    public boolean A01 = true;
    public final C06800Zs[] A02;

    private final int A01(int i) {
        C06800Zs r2;
        Object[] objArr;
        int bitCount;
        C06800Zs[] r22 = this.A02;
        C06800Zs r1 = r22[i];
        if (r1.A08()) {
            return i;
        }
        if (!r1.A09()) {
            return -1;
        }
        C05180Qv A012 = r1.A01();
        if (i == 6) {
            r2 = r22[7];
            objArr = A012.A02;
            bitCount = objArr.length;
        } else {
            r2 = r22[i + 1];
            objArr = A012.A02;
            bitCount = Integer.bitCount(A012.A00) * 2;
        }
        r2.A06(objArr, bitCount);
        return A01(i + 1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0034 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A02() {
        /*
            r6 = this;
            X.0Zs[] r5 = r6.A02
            int r4 = r6.A00
            r0 = r5[r4]
            boolean r0 = r0.A08()
            if (r0 == 0) goto L_0x000d
            return
        L_0x000d:
            r3 = 0
            r2 = -1
            if (r2 >= r4) goto L_0x0040
            int r0 = r6.A01(r4)
            if (r0 != r2) goto L_0x0026
            r1 = r5[r4]
            boolean r0 = r1.A09()
            if (r0 == 0) goto L_0x002b
            r1.A04()
            int r0 = r6.A01(r4)
        L_0x0026:
            if (r0 == r2) goto L_0x002b
            r6.A00 = r0
            return
        L_0x002b:
            if (r4 <= 0) goto L_0x0034
            int r0 = r4 + -1
            r0 = r5[r0]
            r0.A04()
        L_0x0034:
            r1 = r5[r4]
            X.0Qv r0 = X.C05180Qv.A04
            java.lang.Object[] r0 = r0.A02
            r1.A06(r0, r3)
            int r4 = r4 + -1
            goto L_0x000d
        L_0x0040:
            r6.A01 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06810Zt.A02():void");
    }

    public C06810Zt(C05180Qv r5, C06800Zs[] r6) {
        this.A02 = r6;
        r6[0].A06(r5.A02, Integer.bitCount(r5.A00) * 2);
        this.A00 = 0;
        A02();
    }

    public final Object A03() {
        if (hasNext()) {
            return this.A02[this.A00].A02();
        }
        throw new NoSuchElementException();
    }

    public final C06800Zs[] A05() {
        return this.A02;
    }

    public boolean hasNext() {
        return this.A01;
    }

    public Object next() {
        if (hasNext()) {
            Object next = this.A02[this.A00].next();
            A02();
            return next;
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        throw AnonymousClass000.A12();
    }

    public final void A04(int i) {
        this.A00 = i;
    }
}
