package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.77D  reason: invalid class name */
public final class AnonymousClass77D implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass77D) {
                AnonymousClass77D r5 = (AnonymousClass77D) obj;
                if (!C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A01, r5.A01)) {
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
        parcel.writeString(this.A00);
        parcel.writeString(this.A03);
        parcel.writeString(this.A01);
    }

    public int hashCode() {
        return C108945cZ.A09(this.A01, C17890vO.A02(this.A03, C17890vO.A02(this.A00, C17880vN.A03(this.A02))));
    }

    public AnonymousClass77D(String str, String str2, String str3, String str4) {
        C18070vi.A0s(str, str2, str3, str4);
        this.A02 = str;
        this.A00 = str2;
        this.A03 = str3;
        this.A01 = str4;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PaymentSupportFAQ(title=");
        A10.append(this.A02);
        A10.append(", description=");
        A10.append(this.A00);
        A10.append(", url=");
        A10.append(this.A03);
        A10.append(", id=");
        return C17900vP.A0B(this.A01, A10);
    }
}
