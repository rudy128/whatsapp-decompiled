package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.BcC  reason: case insensitive filesystem */
public final class C23156BcC extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final byte A00;
    public final byte A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                C23156BcC bcC = (C23156BcC) obj;
                if (!(this.A00 == bcC.A00 && this.A01 == bcC.A01 && this.A02.equals(bcC.A02))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C108945cZ.A09(this.A02, (((this.A00 + 31) * 31) + this.A01) * 31);
    }

    public final String toString() {
        byte b = this.A00;
        byte b2 = this.A01;
        String str = this.A02;
        StringBuilder A0t = BE6.A0t(BE8.A0C(str) + 73);
        A0t.append("AmsEntityUpdateParcelable{, mEntityId=");
        A0t.append(b);
        A0t.append(", mAttributeId=");
        A0t.append(b2);
        A0t.append(", mValue='");
        A0t.append(str);
        return AnonymousClass000.A0y("'}", A0t);
    }

    public C23156BcC(String str, byte b, byte b2) {
        this.A00 = b;
        this.A01 = b2;
        this.A02 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        byte b = this.A00;
        BE7.A0z(2, parcel);
        parcel.writeInt(b);
        byte b2 = this.A01;
        BE7.A0z(3, parcel);
        parcel.writeInt(b2);
        C26293Cx2.A0A(parcel, this.A02, 4, false);
        C26293Cx2.A05(parcel, A002);
    }
}
