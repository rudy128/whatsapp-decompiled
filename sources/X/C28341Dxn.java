package X;

import java.io.IOException;

/* renamed from: X.Dxn  reason: case insensitive filesystem */
public abstract class C28341Dxn extends AnonymousClass1Bz implements AnonymousClass1Bx, E75 {
    public final int A00;
    public final AnonymousClass1Bx A01;
    public final boolean A02;

    public static void A04(AnonymousClass1Bx r3, C26135Csy csy) {
        csy.A02(new C28341Dxn(r3, 0, true));
    }

    public static void A05(AnonymousClass1Bx r3, C26135Csy csy) {
        csy.A02(new C28341Dxn(r3, 1, false));
    }

    public AnonymousClass1Bz BU4() {
        return this;
    }

    public static AnonymousClass1Bz A02(C28341Dxn dxn) {
        return dxn.A01.CP9();
    }

    public static C28341Dxn A03(Object obj) {
        if (obj == null || (obj instanceof C28341Dxn)) {
            return (C28341Dxn) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return A03(AnonymousClass1Bz.A01((byte[]) obj));
            } catch (IOException e) {
                throw AnonymousClass000.A0k(C17900vP.A0C("failed to construct tagged object from byte[]: ", AnonymousClass000.A10(), e));
            }
        } else {
            throw BEB.A0T(obj, "unknown object in getInstance: ", AnonymousClass000.A10());
        }
    }

    public static void A06(AnonymousClass1Bx r1, C26135Csy csy, int i, boolean z) {
        csy.A02(new C28341Dxn(r1, i, z));
    }

    public static void A07(AnonymousClass1Bx r1, C26135Csy csy, boolean z) {
        csy.A02(new C28341Dxn(r1, z ? 1 : 0, z));
    }

    public AnonymousClass1Bz A0E() {
        boolean z = this.A02;
        return new C28341Dxn(this.A01, this.A00, z);
    }

    public AnonymousClass1Bz A0F() {
        boolean z = this.A02;
        return new C28341Dxn(this.A01, this.A00, z);
    }

    public boolean A0I(AnonymousClass1Bz r4) {
        if (!(r4 instanceof C28341Dxn)) {
            return false;
        }
        C28341Dxn dxn = (C28341Dxn) r4;
        if (this.A00 != dxn.A00 || this.A02 != dxn.A02) {
            return false;
        }
        AnonymousClass1Bz A022 = A02(this);
        AnonymousClass1Bz A023 = A02(dxn);
        if (A022 == A023 || A022.A0I(A023)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = this.A00;
        int i2 = 240;
        if (this.A02) {
            i2 = 15;
        }
        return (i ^ i2) ^ A02(this).hashCode();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        if ((r3 instanceof X.E3M) != false) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C28341Dxn(X.AnonymousClass1Bx r3, int r4, boolean r5) {
        /*
            r2 = this;
            r2.<init>()
            if (r3 == 0) goto L_0x0014
            r2.A00 = r4
            if (r5 != 0) goto L_0x000e
            boolean r1 = r3 instanceof X.E3M
            r0 = 0
            if (r1 == 0) goto L_0x000f
        L_0x000e:
            r0 = 1
        L_0x000f:
            r2.A02 = r0
            r2.A01 = r3
            return
        L_0x0014:
            java.lang.String r0 = "'obj' cannot be null"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28341Dxn.<init>(X.1Bx, int, boolean):void");
    }

    public String toString() {
        StringBuilder A0q = BE9.A0q();
        A0q.append(this.A00);
        A0q.append("]");
        return C17890vO.A0V(this.A01, A0q);
    }
}
