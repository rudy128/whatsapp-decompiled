package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public final class Bc6 extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final String A00;
    public final List A01;

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        if (r1.equals(r0) != false) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r3 = 1
            if (r4 == r5) goto L_0x0031
            r2 = 0
            if (r5 == 0) goto L_0x002a
            java.lang.Class r1 = r4.getClass()
            java.lang.Class r0 = r5.getClass()
            if (r1 != r0) goto L_0x002a
            X.Bc6 r5 = (X.Bc6) r5
            java.lang.String r1 = r4.A00
            java.lang.String r0 = r5.A00
            if (r1 == 0) goto L_0x002b
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x002a
        L_0x001e:
            java.util.List r1 = r4.A01
            java.util.List r0 = r5.A01
            if (r1 == 0) goto L_0x002e
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0031
        L_0x002a:
            return r2
        L_0x002b:
            if (r0 == 0) goto L_0x001e
            return r2
        L_0x002e:
            if (r0 == 0) goto L_0x0031
            return r2
        L_0x0031:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Bc6.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = 0;
        int A02 = (AnonymousClass8BW.A02(this.A00) + 31) * 31;
        List list = this.A01;
        if (list != null) {
            i = list.hashCode();
        }
        return A02 + i;
    }

    public final String toString() {
        String str = this.A00;
        String valueOf = String.valueOf(this.A01);
        StringBuilder A0q = BE7.A0q(BE8.A0C(str) + 18, BE8.A0C(valueOf));
        A0q.append("CapabilityInfo{");
        AnonymousClass8BT.A1V(A0q, str);
        return BEA.A0n(valueOf, A0q);
    }

    public Bc6(String str, List list) {
        this.A00 = str;
        this.A01 = list;
        C18210vx.A00(str);
        C18210vx.A00(list);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A0C(parcel, this.A01, 3, DJ0.A0L(parcel, this.A00));
        C26293Cx2.A05(parcel, A002);
    }
}
