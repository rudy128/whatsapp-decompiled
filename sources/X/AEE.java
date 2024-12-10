package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class AEE implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final C20275AEi A00;
    public final String A01;
    public final String A02;
    public final byte[] A03;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeByteArray(this.A03);
        C20275AEi aEi = this.A00;
        if (aEi == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        aEi.writeToParcel(parcel, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003a, code lost:
        if (java.util.Arrays.equals(r1, r0) != false) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            if (r3 != r4) goto L_0x0004
            r0 = 1
            return r0
        L_0x0004:
            java.lang.Class r1 = r3.getClass()
            java.lang.Class r0 = X.C108975cc.A0R(r4)
            boolean r0 = X.C18070vi.A18(r1, r0)
            r2 = 0
            if (r0 == 0) goto L_0x003c
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.protocol.content.Header"
            X.C18070vi.A0z(r4, r0)
            X.AEE r4 = (X.AEE) r4
            java.lang.String r1 = r3.A02
            java.lang.String r0 = r4.A02
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x003c
            java.lang.String r1 = r3.A01
            java.lang.String r0 = r4.A01
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x003c
            byte[] r1 = r3.A03
            byte[] r0 = r4.A03
            if (r1 == 0) goto L_0x003d
            if (r0 == 0) goto L_0x003c
            boolean r0 = java.util.Arrays.equals(r1, r0)
            if (r0 != 0) goto L_0x0040
        L_0x003c:
            return r2
        L_0x003d:
            if (r0 == 0) goto L_0x0040
            return r2
        L_0x0040:
            X.AEi r1 = r3.A00
            X.AEi r0 = r4.A00
            boolean r0 = X.C18070vi.A18(r1, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AEE.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        int A022 = ((AnonymousClass8BW.A02(this.A02) * 31) + AnonymousClass8BW.A02(this.A01)) * 31;
        byte[] bArr = this.A03;
        if (bArr != null) {
            i = Arrays.hashCode(bArr);
        } else {
            i = 0;
        }
        int i3 = (A022 + i) * 31;
        C20275AEi aEi = this.A00;
        if (aEi != null) {
            i2 = aEi.hashCode();
        }
        return i3 + i2;
    }

    public AEE(C20275AEi aEi, String str, String str2, byte[] bArr) {
        this.A02 = str;
        this.A01 = str2;
        this.A03 = bArr;
        this.A00 = aEi;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Header(title=");
        A10.append(this.A02);
        A10.append(", subTitle=");
        A10.append(this.A01);
        A10.append(", thumbnail=");
        C17890vO.A1C(A10, this.A03);
        A10.append(", documentMetadata=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
