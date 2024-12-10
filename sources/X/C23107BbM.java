package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.BbM  reason: case insensitive filesystem */
public final class C23107BbM extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final String A00;
    public final String A01;
    public final byte[] A02;
    public final int A03;

    public final String toString() {
        Object valueOf;
        int i = this.A03;
        String str = this.A00;
        byte[] bArr = this.A02;
        if (bArr == null) {
            valueOf = "null";
        } else {
            valueOf = Integer.valueOf(bArr.length);
        }
        String valueOf2 = String.valueOf(valueOf);
        StringBuilder A0q = BE7.A0q(BE8.A0C(str) + 43, BE8.A0C(valueOf2));
        A0q.append("MessageEventParcelable[");
        A0q.append(i);
        BE6.A1K(A0q);
        A0q.append(str);
        A0q.append(", size=");
        return BEA.A0m(valueOf2, A0q);
    }

    public C23107BbM(String str, String str2, byte[] bArr, int i) {
        this.A03 = i;
        this.A00 = str;
        this.A02 = bArr;
        this.A01 = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A06(parcel, 2, this.A03);
        C26293Cx2.A0A(parcel, this.A00, 3, false);
        C26293Cx2.A0D(parcel, this.A02, 4, false);
        C26293Cx2.A0A(parcel, this.A01, 5, false);
        C26293Cx2.A05(parcel, A002);
    }
}
