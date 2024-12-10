package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.771  reason: invalid class name */
public final class AnonymousClass771 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final String A00;
    public final String A01;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass771) {
                AnonymousClass771 r5 = (AnonymousClass771) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public int hashCode() {
        return C108945cZ.A09(this.A01, C17880vN.A03(this.A00));
    }

    public AnonymousClass771(String str, String str2) {
        C18070vi.A0j(str, str2);
        this.A00 = str;
        this.A01 = str2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PrivacyDisclosureButton(action=");
        A10.append(this.A00);
        A10.append(", label=");
        return C17900vP.A0B(this.A01, A10);
    }
}
