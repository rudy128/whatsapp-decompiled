package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.UserJid;
import java.math.BigDecimal;

public final class ADG implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public int A00;
    public UserJid A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public BigDecimal A0A;
    public BigDecimal A0B;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ADG) {
                ADG adg = (ADG) obj;
                if (!C18070vi.A18(this.A01, adg.A01) || !C18070vi.A18(this.A06, adg.A06) || !C18070vi.A18(this.A09, adg.A09) || !C18070vi.A18(this.A04, adg.A04) || !C18070vi.A18(this.A03, adg.A03) || !C18070vi.A18(this.A0A, adg.A0A) || !C18070vi.A18(this.A0B, adg.A0B) || !C18070vi.A18(this.A08, adg.A08) || !C18070vi.A18(this.A07, adg.A07) || this.A00 != adg.A00 || !C18070vi.A18(this.A02, adg.A02) || !C18070vi.A18(this.A05, adg.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A06);
        parcel.writeString(this.A09);
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
        parcel.writeSerializable(this.A0A);
        parcel.writeSerializable(this.A0B);
        parcel.writeString(this.A08);
        parcel.writeString(this.A07);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A02);
        parcel.writeString(this.A05);
    }

    public int hashCode() {
        return ((((((((((((((((C17890vO.A02(this.A09, C17890vO.A02(this.A06, AnonymousClass001.A0k(this.A01) * 31)) + C17900vP.A00(this.A04)) * 31) + C17900vP.A00(this.A03)) * 31) + AnonymousClass001.A0k(this.A0A)) * 31) + AnonymousClass001.A0k(this.A0B)) * 31) + C17900vP.A00(this.A08)) * 31) + C17900vP.A00(this.A07)) * 31) + this.A00) * 31) + C17900vP.A00(this.A02)) * 31) + C108955ca.A06(this.A05);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SingleProductInfo(businessOwnerJid=");
        A10.append(this.A01);
        A10.append(", productId=");
        A10.append(this.A06);
        A10.append(", title=");
        A10.append(this.A09);
        A10.append(", description=");
        A10.append(this.A04);
        A10.append(", currencyCode=");
        A10.append(this.A03);
        A10.append(", priceAmount=");
        A10.append(this.A0A);
        A10.append(", salePriceAmount=");
        A10.append(this.A0B);
        A10.append(", retailerId=");
        A10.append(this.A08);
        A10.append(", productUrl=");
        A10.append(this.A07);
        A10.append(", productImageCount=");
        A10.append(this.A00);
        A10.append(", body=");
        A10.append(this.A02);
        A10.append(", footer=");
        return C17900vP.A0B(this.A05, A10);
    }
}
