package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.1b5  reason: invalid class name */
public final class AnonymousClass1b5 implements Iterator, C18450wR {
    public int A00 = -1;
    public C25411Oc A01;
    public int A02;
    public int A03;
    public int A04;
    public final /* synthetic */ C28841az A05;

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public AnonymousClass1b5(C28841az r3) {
        this.A05 = r3;
        int A032 = C28851b7.A03(0, 0, r3.A01.length());
        this.A03 = A032;
        this.A04 = A032;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        if (r0 < r1) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A00() {
        /*
            r8 = this;
            int r7 = r8.A04
            r5 = 0
            if (r7 >= 0) goto L_0x000b
            r8.A00 = r5
            r0 = 0
            r8.A01 = r0
            return
        L_0x000b:
            X.1az r6 = r8.A05
            int r1 = r6.A00
            r2 = -1
            r3 = 1
            if (r1 <= 0) goto L_0x001b
            int r0 = r8.A02
            int r0 = r0 + 1
            r8.A02 = r0
            if (r0 >= r1) goto L_0x0057
        L_0x001b:
            java.lang.CharSequence r4 = r6.A01
            int r0 = r4.length()
            if (r7 > r0) goto L_0x0057
            X.1OS r1 = r6.A02
            int r0 = r8.A04
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r1 = r1.invoke(r4, r0)
            X.1D6 r1 = (X.AnonymousClass1D6) r1
            if (r1 == 0) goto L_0x0057
            java.lang.Object r0 = r1.first
            java.lang.Number r0 = (java.lang.Number) r0
            int r2 = r0.intValue()
            java.lang.Object r0 = r1.second
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            int r0 = r8.A03
            X.1Oc r0 = X.C28851b7.A08(r0, r2)
            r8.A01 = r0
            int r2 = r2 + r1
            r8.A03 = r2
            if (r1 != 0) goto L_0x0051
            r5 = 1
        L_0x0051:
            int r2 = r2 + r5
        L_0x0052:
            r8.A04 = r2
            r8.A00 = r3
            return
        L_0x0057:
            int r4 = r8.A03
            java.lang.CharSequence r0 = r6.A01
            int r0 = r0.length()
            int r1 = r0 + -1
            X.1Oc r0 = new X.1Oc
            r0.<init>(r4, r1)
            r8.A01 = r0
            goto L_0x0052
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1b5.A00():void");
    }

    public boolean hasNext() {
        if (this.A00 == -1) {
            A00();
        }
        if (this.A00 != 1) {
            return false;
        }
        return true;
    }

    public /* bridge */ /* synthetic */ Object next() {
        if (this.A00 == -1) {
            A00();
        }
        if (this.A00 != 0) {
            C25411Oc r1 = this.A01;
            C18070vi.A0z(r1, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.A01 = null;
            this.A00 = -1;
            return r1;
        }
        throw new NoSuchElementException();
    }
}
