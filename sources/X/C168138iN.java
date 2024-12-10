package X;

import android.os.Parcelable;

/* renamed from: X.8iN  reason: invalid class name and case insensitive filesystem */
public final class C168138iN extends C20287AEv {
    public static final Parcelable.Creator CREATOR = new Object();
    public final C20287AEv A00;
    public final boolean A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C168138iN(X.C20287AEv r38, boolean r39) {
        /*
            r37 = this;
            r13 = 1
            r14 = r38
            X.C18070vi.A0d(r14, r13)
            java.lang.String r12 = r14.A0H
            java.lang.String r11 = r14.A08
            java.lang.String r0 = r14.A0E
            r22 = r0
            java.math.BigDecimal r0 = r14.A09
            r20 = r0
            X.A6S r0 = r14.A07
            r21 = r0
            java.lang.String r0 = r14.A0G
            r19 = r0
            java.lang.String r0 = r14.A0I
            r18 = r0
            java.lang.String r15 = r14.A0J
            java.util.List r10 = r14.A0A
            java.util.List r9 = r14.A0B
            X.AEJ r8 = r14.A03
            X.AE5 r7 = r14.A04
            java.lang.String r6 = r14.A0F
            int r5 = r14.A00
            boolean r4 = r14.A0C
            long r2 = r14.A01
            X.AE6 r1 = r14.A05
            X.C18070vi.A0e(r12, r13, r11)
            r16 = 0
            r0 = r37
            r17 = r16
            r31 = r9
            r32 = r5
            r33 = r2
            r35 = r13
            r36 = r4
            r24 = r22
            r25 = r19
            r26 = r18
            r27 = r15
            r28 = r6
            r29 = r20
            r30 = r10
            r18 = r8
            r19 = r7
            r20 = r1
            r22 = r12
            r23 = r11
            r15 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r35, r36)
            r0.A00 = r14
            r1 = r39
            r0.A01 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C168138iN.<init>(X.AEv, boolean):void");
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C168138iN) {
                C168138iN r5 = (C168138iN) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass000.A0L(this.A00), this.A01);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("EditCollectionProduct(product=");
        A10.append(this.A00);
        A10.append(", belongsToCollection=");
        return C17900vP.A0F(A10, this.A01);
    }
}
