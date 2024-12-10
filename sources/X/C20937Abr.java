package X;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONObject;

/* renamed from: X.Abr  reason: case insensitive filesystem */
public final class C20937Abr implements BDZ {
    public static final Parcelable.Creator CREATOR = new Object();
    public final C22565BDa A00;
    public final C22565BDa A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C20937Abr) {
                C20937Abr abr = (C20937Abr) obj;
                if (!C18070vi.A18(this.A02, abr.A02) || !C18070vi.A18(this.A04, abr.A04) || !C18070vi.A18(this.A03, abr.A03) || !C18070vi.A18(this.A00, abr.A00) || !C18070vi.A18(this.A01, abr.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
    }

    public JSONObject CPM() {
        return AnonymousClass84U.A00(new B09(this));
    }

    public int hashCode() {
        return ((C17890vO.A02(this.A03, C17890vO.A02(this.A04, C17880vN.A03(this.A02))) + AnonymousClass001.A0k(this.A00)) * 31) + C17880vN.A02(this.A01);
    }

    public C20937Abr(C22565BDa bDa, C22565BDa bDa2, String str, String str2, String str3) {
        C18070vi.A0o(str, str2, str3);
        this.A02 = str;
        this.A04 = str2;
        this.A03 = str3;
        this.A00 = bDa;
        this.A01 = bDa2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PreferredPaymentMethodOfferDetail(description=");
        A10.append(this.A02);
        A10.append(", offerType=");
        A10.append(this.A04);
        A10.append(", offerAmountType=");
        A10.append(this.A03);
        A10.append(", offerAmount=");
        A10.append(this.A00);
        A10.append(", offerPercentage=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
