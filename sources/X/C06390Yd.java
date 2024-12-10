package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.0Yd  reason: invalid class name and case insensitive filesystem */
public final class C06390Yd implements Iterable, C18450wR {
    public int A00;
    public ArrayList A01 = AnonymousClass000.A13();
    public boolean A02;
    public int A03;
    public int A04;
    public int A05;
    public HashMap A06;
    public int[] A07 = new int[0];
    public Object[] A08 = new Object[0];

    public Iterator iterator() {
        return new C06780Zq(this, 0, this.A00);
    }

    public final int A03(C02090Cr r3) {
        if (!this.A02) {
            int i = r3.A00;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            throw AnonymousClass000.A0k("Anchor refers to a group that was removed");
        }
        C05020Qb.A06("Use active SlotWriter to determine anchor location instead");
        throw null;
    }

    public final AnonymousClass0NZ A04() {
        if (!this.A02) {
            this.A03++;
            return new AnonymousClass0NZ(this);
        }
        throw AnonymousClass000.A0n("Cannot read while a writer is pending");
    }

    public final AnonymousClass0Qu A05() {
        String str;
        if (!(!this.A02)) {
            str = "Cannot start a writer when another writer is pending";
        } else if (this.A03 <= 0) {
            this.A02 = true;
            this.A05++;
            return new AnonymousClass0Qu(this);
        } else {
            str = "Cannot start a writer when a reader is pending";
        }
        C05020Qb.A06(str);
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        r1 = r3.A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A08(int r4) {
        /*
            r3 = this;
            java.util.HashMap r2 = r3.A06
            r1 = 0
            if (r2 == 0) goto L_0x0022
            boolean r0 = r3.A02
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0023
            if (r4 < 0) goto L_0x0022
            int r0 = r3.A00
            if (r4 >= r0) goto L_0x0022
            java.util.ArrayList r1 = r3.A01
            int r0 = X.C04780Ot.A01(r1, r4, r0)
            if (r0 < 0) goto L_0x0022
            java.lang.Object r0 = r1.get(r0)
            if (r0 == 0) goto L_0x0022
            r2.get(r0)
        L_0x0022:
            return
        L_0x0023:
            java.lang.String r0 = "use active SlotWriter to crate an anchor for location instead"
            X.C05020Qb.A06(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06390Yd.A08(int):void");
    }

    public final void A0B(ArrayList arrayList, HashMap hashMap, int[] iArr, Object[] objArr, int i, int i2) {
        this.A07 = iArr;
        this.A00 = i;
        this.A08 = objArr;
        this.A04 = i2;
        this.A01 = arrayList;
        this.A06 = hashMap;
    }

    public boolean A0C() {
        return AnonymousClass000.A1P(this.A00);
    }

    public final boolean A0D() {
        if (this.A00 <= 0 || (this.A07[1] & 67108864) == 0) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r1 = r3.A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0F(X.C02090Cr r4) {
        /*
            r3 = this;
            int r2 = r4.A00
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == r0) goto L_0x001b
            java.util.ArrayList r1 = r3.A01
            int r0 = r3.A00
            int r0 = X.C04780Ot.A01(r1, r2, r0)
            if (r0 < 0) goto L_0x001b
            java.lang.Object r0 = r1.get(r0)
            boolean r1 = X.C18070vi.A18(r0, r4)
            r0 = 1
            if (r1 != 0) goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06390Yd.A0F(X.0Cr):boolean");
    }

    public final int A00() {
        return this.A00;
    }

    public final int A01() {
        return this.A04;
    }

    public final int A02() {
        return this.A05;
    }

    public final ArrayList A06() {
        return this.A01;
    }

    public final HashMap A07() {
        return this.A06;
    }

    public final void A09(AnonymousClass0NZ r2) {
        int i;
        if (r2.A03() != this || (i = this.A03) <= 0) {
            C05020Qb.A06("Unexpected reader close()");
            throw null;
        } else {
            this.A03 = i - 1;
        }
    }

    public final void A0A(AnonymousClass0Qu r9, ArrayList arrayList, HashMap hashMap, int[] iArr, Object[] objArr, int i, int i2) {
        if (r9.A0N() != this || !this.A02) {
            throw AnonymousClass000.A0k("Unexpected writer close()");
        }
        this.A02 = false;
        A0B(arrayList, hashMap, iArr, objArr, i, i2);
    }

    public final boolean A0E() {
        return this.A02;
    }

    public final int[] A0G() {
        return this.A07;
    }

    public final Object[] A0H() {
        return this.A08;
    }
}
