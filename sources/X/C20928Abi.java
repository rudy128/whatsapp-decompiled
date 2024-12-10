package X;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONObject;

/* renamed from: X.Abi  reason: case insensitive filesystem */
public final class C20928Abi implements BDZ {
    public static final Parcelable.Creator CREATOR = new Object();
    public final C20937Abr A00;
    public final String A01;

    public C20928Abi(C20937Abr abr, String str) {
        C18070vi.A0d(str, 1);
        this.A01 = str;
        this.A00 = abr;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C20928Abi) {
                C20928Abi abi = (C20928Abi) obj;
                if (!C18070vi.A18(this.A01, abi.A01) || !C18070vi.A18(this.A00, abi.A00)) {
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
        C20937Abr abr = this.A00;
        if (abr == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        abr.writeToParcel(parcel, i);
    }

    public JSONObject CPM() {
        return AnonymousClass84U.A00(new B08(this));
    }

    public int hashCode() {
        return C17880vN.A03(this.A01) + AnonymousClass001.A0k(this.A00);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PreferredPaymentMethodInformation(method=");
        A10.append(this.A01);
        A10.append(", offerDetails=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
