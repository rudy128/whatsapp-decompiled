package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.BcJ  reason: case insensitive filesystem */
public final class C23163BcJ extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C23163BcJ)) {
            return false;
        }
        return ((C23163BcJ) obj).A01.equals(this.A01);
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    public final String toString() {
        String str = this.A02;
        String str2 = this.A01;
        int i = this.A00;
        boolean z = this.A03;
        StringBuilder A0q = BE7.A0q(BE8.A0C(str) + 45, BE8.A0C(str2));
        A0q.append("Node{");
        A0q.append(str);
        A0q.append(", id=");
        A0q.append(str2);
        A0q.append(", hops=");
        A0q.append(i);
        A0q.append(", isNearby=");
        A0q.append(z);
        return AnonymousClass000.A0y("}", A0q);
    }

    public C23163BcJ(String str, String str2, int i, boolean z) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = i;
        this.A03 = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A0A(parcel, this.A02, 3, DJ0.A0L(parcel, this.A01));
        C26293Cx2.A06(parcel, 4, this.A00);
        C26293Cx2.A08(parcel, 5, this.A03);
        C26293Cx2.A05(parcel, A002);
    }
}
