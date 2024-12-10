package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.ADj  reason: case insensitive filesystem */
public final class C20251ADj implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final BDZ A00;
    public final String A01;

    public C20251ADj(BDZ bdz, String str) {
        C18070vi.A0d(str, 1);
        this.A01 = str;
        this.A00 = bdz;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C20251ADj) {
                C20251ADj aDj = (C20251ADj) obj;
                if (!C18070vi.A18(this.A01, aDj.A01) || !C18070vi.A18(this.A00, aDj.A00)) {
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
        parcel.writeParcelable(this.A00, i);
    }

    public int hashCode() {
        return C17880vN.A03(this.A01) + AnonymousClass001.A0k(this.A00);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PaymentSettings(type=");
        A10.append(this.A01);
        A10.append(", paymentSetting=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
