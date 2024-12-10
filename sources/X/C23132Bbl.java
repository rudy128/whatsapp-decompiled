package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.Bbl  reason: case insensitive filesystem */
public class C23132Bbl extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final short A01;
    public final short A02;

    public boolean equals(Object obj) {
        if (obj instanceof C23132Bbl) {
            C23132Bbl bbl = (C23132Bbl) obj;
            if (this.A00 == bbl.A00 && this.A01 == bbl.A01 && this.A02 == bbl.A02) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C23132Bbl(int i, short s, short s2) {
        this.A00 = i;
        this.A01 = s;
        this.A02 = s2;
    }

    public int hashCode() {
        Object[] A1a = AnonymousClass8BR.A1a();
        AnonymousClass000.A1L(A1a, this.A00);
        A1a[1] = Short.valueOf(this.A01);
        return AnonymousClass000.A0P(Short.valueOf(this.A02), A1a, 2);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A06(parcel, 1, this.A00);
        short s = this.A01;
        parcel.writeInt(262146);
        parcel.writeInt(s);
        short s2 = this.A02;
        parcel.writeInt(262147);
        parcel.writeInt(s2);
        C26293Cx2.A05(parcel, A002);
    }
}
