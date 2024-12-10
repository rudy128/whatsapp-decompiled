package X;

import android.os.Parcel;
import android.os.Parcelable;

public class Bc5 extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final Float A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Bc5) {
                Bc5 bc5 = (Bc5) obj;
                if (this.A00 != bc5.A00 || !C25332Cdd.A01(this.A01, bc5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public String toString() {
        int i = this.A00;
        String valueOf = String.valueOf(this.A01);
        StringBuilder A0t = BE6.A0t(BE8.A0C(valueOf) + 39);
        A0t.append("[PatternItem: type=");
        A0t.append(i);
        A0t.append(" length=");
        return BEA.A0m(valueOf, A0t);
    }

    public Bc5(Float f, int i) {
        boolean z = true;
        if (i != 1 && (f == null || f.floatValue() < 0.0f)) {
            z = false;
        }
        String valueOf = String.valueOf(f);
        StringBuilder A0t = BE6.A0t(BE8.A0C(valueOf) + 45);
        A0t.append("Invalid PatternItem: type=");
        A0t.append(i);
        C18210vx.A07(z, AnonymousClass001.A1H(" length=", valueOf, A0t));
        this.A00 = i;
        this.A01 = f;
    }

    public int hashCode() {
        Object[] A1b = AnonymousClass3MW.A1b();
        AnonymousClass000.A1L(A1b, this.A00);
        return AnonymousClass000.A0P(this.A01, A1b, 1);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A06(parcel, 2, this.A00);
        Float f = this.A01;
        if (f != null) {
            parcel.writeInt(262147);
            parcel.writeFloat(f.floatValue());
        }
        C26293Cx2.A05(parcel, A002);
    }
}
