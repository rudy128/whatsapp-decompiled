package X;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONObject;

/* renamed from: X.Abn  reason: case insensitive filesystem */
public final class C20933Abn implements BDZ {
    public static final Parcelable.Creator CREATOR = new Object();
    public final C20932Abm A00;
    public final String A01;
    public final String A02;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C20933Abn) {
                C20933Abn abn = (C20933Abn) obj;
                if (!C18070vi.A18(this.A02, abn.A02) || !C18070vi.A18(this.A01, abn.A01) || !C18070vi.A18(this.A00, abn.A00)) {
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
        parcel.writeString(this.A01);
        C20932Abm abm = this.A00;
        if (abm == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        abm.writeToParcel(parcel, i);
    }

    public JSONObject CPM() {
        return AnonymousClass84U.A00(new B0B(this));
    }

    public int hashCode() {
        return C17890vO.A02(this.A01, C17880vN.A03(this.A02)) + AnonymousClass001.A0k(this.A00);
    }

    public C20933Abn(C20932Abm abm, String str, String str2) {
        C18070vi.A0j(str, str2);
        this.A02 = str;
        this.A01 = str2;
        this.A00 = abm;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("UpiMerchantConfiguration(transactionRef=");
        A10.append(this.A02);
        A10.append(", configurationName=");
        A10.append(this.A01);
        A10.append(", paymentLink=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
