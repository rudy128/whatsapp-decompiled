package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

public final class AEU implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public String A00;
    public String A01;
    public final C20250ADi A02;
    public final AE1 A03;
    public final AE1 A04;
    public final AE1 A05;
    public final AE1 A06;
    public final String A07;
    public final String A08;
    public final List A09;

    public AEU(C20250ADi aDi, AE1 ae1, AE1 ae12, AE1 ae13, AE1 ae14, String str, String str2, String str3, String str4, List list) {
        C18070vi.A0d(str, 1);
        this.A01 = str;
        this.A09 = list;
        this.A05 = ae1;
        this.A06 = ae12;
        this.A03 = ae13;
        this.A04 = ae14;
        this.A00 = str2;
        this.A07 = str3;
        this.A02 = aDi;
        this.A08 = str4;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AEU) {
                AEU aeu = (AEU) obj;
                if (!C18070vi.A18(this.A01, aeu.A01) || !C18070vi.A18(this.A09, aeu.A09) || !C18070vi.A18(this.A05, aeu.A05) || !C18070vi.A18(this.A06, aeu.A06) || !C18070vi.A18(this.A03, aeu.A03) || !C18070vi.A18(this.A04, aeu.A04) || !C18070vi.A18(this.A00, aeu.A00) || !C18070vi.A18(this.A07, aeu.A07) || !C18070vi.A18(this.A02, aeu.A02) || !C18070vi.A18(this.A08, aeu.A08)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A01);
        List list = this.A09;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            Iterator A0r = C108985cd.A0r(parcel, list);
            while (A0r.hasNext()) {
                ((AET) A0r.next()).writeToParcel(parcel, i);
            }
        }
        AnonymousClass8BX.A10(parcel, this.A05, i);
        AnonymousClass8BX.A10(parcel, this.A06, i);
        AnonymousClass8BX.A10(parcel, this.A03, i);
        AnonymousClass8BX.A10(parcel, this.A04, i);
        parcel.writeString(this.A00);
        parcel.writeString(this.A07);
        C20250ADi aDi = this.A02;
        if (aDi == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aDi.writeToParcel(parcel, i);
        }
        parcel.writeString(this.A08);
    }

    public final int A00() {
        List<AET> list = this.A09;
        int i = 0;
        if (list != null) {
            for (AET aet : list) {
                i += aet.A01;
            }
        }
        return i;
    }

    public int hashCode() {
        return ((((((((((((((((C17880vN.A03(this.A01) + AnonymousClass001.A0k(this.A09)) * 31) + AnonymousClass001.A0k(this.A05)) * 31) + AnonymousClass001.A0k(this.A06)) * 31) + AnonymousClass001.A0k(this.A03)) * 31) + AnonymousClass001.A0k(this.A04)) * 31) + C17900vP.A00(this.A00)) * 31) + C17900vP.A00(this.A07)) * 31) + AnonymousClass001.A0k(this.A02)) * 31) + C108955ca.A06(this.A08);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Order(status=");
        A10.append(this.A01);
        A10.append(", items=");
        A10.append(this.A09);
        A10.append(", subtotal=");
        A10.append(this.A05);
        A10.append(", tax=");
        A10.append(this.A06);
        A10.append(", discount=");
        A10.append(this.A03);
        A10.append(", shipping=");
        A10.append(this.A04);
        A10.append(", description=");
        A10.append(this.A00);
        A10.append(", discountProgramName=");
        A10.append(this.A07);
        A10.append(", expiration=");
        A10.append(this.A02);
        A10.append(", orderType=");
        return C17900vP.A0B(this.A08, A10);
    }
}
