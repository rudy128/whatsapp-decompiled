package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

public final class AET implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public String A00;
    public final int A01;
    public final AE1 A02;
    public final AE1 A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final List A07;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AET) {
                AET aet = (AET) obj;
                if (!C18070vi.A18(this.A06, aet.A06) || !C18070vi.A18(this.A05, aet.A05) || !C18070vi.A18(this.A04, aet.A04) || !C18070vi.A18(this.A02, aet.A02) || !C18070vi.A18(this.A03, aet.A03) || this.A01 != aet.A01 || !C18070vi.A18(this.A07, aet.A07) || !C18070vi.A18(this.A00, aet.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A06);
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
        this.A02.writeToParcel(parcel, i);
        AnonymousClass8BX.A10(parcel, this.A03, i);
        parcel.writeInt(this.A01);
        List list = this.A07;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            Iterator A0r = C108985cd.A0r(parcel, list);
            while (A0r.hasNext()) {
                ((C20252ADk) A0r.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.A00);
    }

    public final String A00() {
        String str = this.A05;
        if (str != null && str.length() != 0) {
            return str;
        }
        String str2 = this.A06;
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public int hashCode() {
        return ((((((AnonymousClass000.A0N(this.A02, C17890vO.A02(this.A04, ((C17900vP.A00(this.A06) * 31) + C17900vP.A00(this.A05)) * 31)) + AnonymousClass001.A0k(this.A03)) * 31) + this.A01) * 31) + AnonymousClass001.A0k(this.A07)) * 31) + C108955ca.A06(this.A00);
    }

    public AET(AE1 ae1, AE1 ae12, String str, String str2, String str3, String str4, List list, int i) {
        C108985cd.A1D(str3, ae1);
        this.A06 = str;
        this.A05 = str2;
        this.A04 = str3;
        this.A02 = ae1;
        this.A03 = ae12;
        this.A01 = i;
        this.A07 = list;
        this.A00 = str4;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("OrderItem(retailerId=");
        A10.append(this.A06);
        A10.append(", productId=");
        AnonymousClass8BT.A1W(A10, this.A05);
        A10.append(this.A04);
        A10.append(", amount=");
        A10.append(this.A02);
        A10.append(", saleAmount=");
        A10.append(this.A03);
        A10.append(", quantity=");
        A10.append(this.A01);
        A10.append(", variantInfo=");
        A10.append(this.A07);
        A10.append(", base64Thumbnail=");
        return C17900vP.A0B(this.A00, A10);
    }
}
