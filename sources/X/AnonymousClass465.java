package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.465  reason: invalid class name */
public final class AnonymousClass465 extends AnonymousClass4c9 {
    public static final Parcelable.Creator CREATOR = new Object();
    public AD7 A00;
    public final String A01;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass465) {
                AnonymousClass465 r5 = (AnonymousClass465) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
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
        return AnonymousClass000.A0O(this.A00, C17880vN.A03(this.A01));
    }

    public AnonymousClass465(AD7 ad7, String str) {
        C18070vi.A0j(str, ad7);
        this.A01 = str;
        this.A00 = ad7;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Rating(id=");
        A10.append(this.A01);
        A10.append(", ratingType=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
