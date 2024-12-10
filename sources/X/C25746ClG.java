package X;

import com.facebook.android.exoplayer2.util.Util;

/* renamed from: X.ClG  reason: case insensitive filesystem */
public final class C25746ClG {
    public static final C25740ClA A0B;
    public static final Object A0C = C17880vN.A0p();
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public C25740ClA A07 = A0B;
    public Object A08 = A0C;
    public boolean A09;
    public boolean A0A;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !getClass().equals(obj.getClass())) {
                return false;
            }
            C25746ClG clG = (C25746ClG) obj;
            if (!(Util.A0D(this.A08, clG.A08) && Util.A0D(this.A07, clG.A07) && this.A05 == clG.A05 && this.A06 == clG.A06 && this.A04 == clG.A04 && this.A0A == clG.A0A && this.A09 == clG.A09 && this.A02 == clG.A02 && this.A03 == clG.A03 && this.A00 == clG.A00 && this.A01 == clG.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((BE8.A09(this.A03, BE8.A09(this.A02, BE6.A06((BE8.A09(this.A04, BE8.A09(this.A06, BE8.A09(this.A05, AnonymousClass000.A0N(this.A07, AnonymousClass000.A0N(this.A08, 217)) * 31 * 31))) + (this.A0A ? 1 : 0)) * 31, this.A09 ? 1 : 0))) + this.A00) * 31) + this.A01) * 31) + ((int) (0 ^ (0 >>> 32)));
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.BOH, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v1, types: [X.CXg, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v2, types: [X.CYp] */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Object r0 = X.C17880vN.A0p()
            A0C = r0
            r3 = 0
            X.C7x r0 = new X.C7x
            r0.<init>()
            java.util.List r2 = java.util.Collections.emptyList()
            java.util.List r1 = java.util.Collections.emptyList()
            X.C7y r0 = new X.C7y
            r0.<init>()
            java.lang.String r5 = "com.facebook.android.exoplayer2.Timeline"
            android.net.Uri r0 = android.net.Uri.EMPTY
            if (r0 == 0) goto L_0x0024
            X.BOI r3 = new X.BOI
            r3.<init>(r0, r2, r1)
        L_0x0024:
            X.BOH r1 = new X.BOH
            r1.<init>()
            X.CXg r2 = new X.CXg
            r2.<init>()
            X.CXs r4 = X.C25099CXs.A00
            X.ClA r0 = new X.ClA
            r0.<init>(r1, r2, r3, r4, r5)
            A0B = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25746ClG.<clinit>():void");
    }
}
