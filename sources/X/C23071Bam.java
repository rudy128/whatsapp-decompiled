package X;

import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
/* renamed from: X.Bam  reason: case insensitive filesystem */
public final class C23071Bam extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final String A00;
    public final String A01;
    public final String A02;

    public C23071Bam(String str, String str2, String str3) {
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        boolean A0K = DJ0.A0K(parcel, this.A00);
        C26293Cx2.A0A(parcel, this.A01, 2, A0K);
        C26293Cx2.A0A(parcel, this.A02, 5, A0K);
        C26293Cx2.A05(parcel, A002);
    }
}
