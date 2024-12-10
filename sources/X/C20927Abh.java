package X;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONObject;

/* renamed from: X.Abh  reason: case insensitive filesystem */
public final class C20927Abh implements BDZ {
    public static final Parcelable.Creator CREATOR = new Object();
    public final String A00;

    public C20927Abh(String str) {
        C18070vi.A0d(str, 1);
        this.A00 = str;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C20927Abh) && C18070vi.A18(this.A00, ((C20927Abh) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A00);
    }

    public JSONObject CPM() {
        return AnonymousClass84U.A00(new B04(this));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PaymentBoleto(digitableLine=");
        return C17900vP.A0B(this.A00, A10);
    }
}
