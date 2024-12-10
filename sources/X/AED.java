package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

public final class AED implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final ADY A00;
    public final AnonymousClass9I2 A01;
    public final String A02;
    public final List A03;

    public AED(ADY ady, AnonymousClass9I2 r3, String str, List list) {
        C18070vi.A0d(r3, 1);
        this.A01 = r3;
        this.A03 = list;
        this.A00 = ady;
        this.A02 = str;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AED) {
                AED aed = (AED) obj;
                if (this.A01 != aed.A01 || !C18070vi.A18(this.A03, aed.A03) || !C18070vi.A18(this.A00, aed.A00) || !C18070vi.A18(this.A02, aed.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A01.name());
        List list = this.A03;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            Iterator A0r = C108985cd.A0r(parcel, list);
            while (A0r.hasNext()) {
                ((C20265ADx) A0r.next()).writeToParcel(parcel, i);
            }
        }
        ADY ady = this.A00;
        if (ady == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ady.writeToParcel(parcel, i);
        }
        parcel.writeString(this.A02);
    }

    public int hashCode() {
        return ((((AnonymousClass000.A0L(this.A01) + AnonymousClass001.A0k(this.A03)) * 31) + AnonymousClass001.A0k(this.A00)) * 31) + C108955ca.A06(this.A02);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MerchantPaymentConfig(merchantStatus=");
        A10.append(this.A01);
        A10.append(", installmentOptions=");
        A10.append(this.A03);
        A10.append(", merchantAccountSettings=");
        A10.append(this.A00);
        A10.append(", merchantGatewayName=");
        return C17900vP.A0B(this.A02, A10);
    }
}
