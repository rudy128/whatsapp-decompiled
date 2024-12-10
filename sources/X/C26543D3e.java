package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.D3e  reason: case insensitive filesystem */
public class C26543D3e implements Parcelable {
    public static final Parcelable.Creator CREATOR = D3B.A00(47);
    public final String A00;
    public final String A01;

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        r5 = (X.C26543D3e) r5;
        r1 = r4.A00;
        r0 = r5.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        r1 = r4.A01;
        r0 = r5.A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r3 = 1
            if (r4 == r5) goto L_0x0026
            boolean r0 = r5 instanceof X.C26543D3e
            r2 = 0
            if (r0 == 0) goto L_0x0027
            X.D3e r5 = (X.C26543D3e) r5
            java.lang.String r1 = r4.A00
            java.lang.String r0 = r5.A00
            if (r1 == r0) goto L_0x0018
            if (r1 == 0) goto L_0x0027
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0027
        L_0x0018:
            java.lang.String r1 = r4.A01
            java.lang.String r0 = r5.A01
            if (r1 == r0) goto L_0x0026
            if (r1 == 0) goto L_0x0027
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0027
        L_0x0026:
            return r3
        L_0x0027:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26543D3e.equals(java.lang.Object):boolean");
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public C26543D3e(Parcel parcel) {
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }

    public int hashCode() {
        Object[] A1b = AnonymousClass3MW.A1b();
        A1b[0] = this.A00;
        return AnonymousClass000.A0P(this.A01, A1b, 1);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SphericalMetadata{projectionType=");
        A10.append(this.A00);
        A10.append(", stereoMode=");
        return BEA.A0n(this.A01, A10);
    }
}
