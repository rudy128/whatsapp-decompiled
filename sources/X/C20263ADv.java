package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.ADv  reason: case insensitive filesystem */
public final class C20263ADv implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final String A00;
    public final String A01;
    public final String A02;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C20263ADv) {
                C20263ADv aDv = (C20263ADv) obj;
                if (!C18070vi.A18(this.A02, aDv.A02) || !C18070vi.A18(this.A00, aDv.A00) || !C18070vi.A18(this.A01, aDv.A01)) {
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
        parcel.writeString(this.A01);
    }

    public int hashCode() {
        return C108945cZ.A09(this.A01, C17890vO.A02(this.A00, C17880vN.A03(this.A02)));
    }

    public C20263ADv(String str, String str2, String str3) {
        C18070vi.A0o(str, str2, str3);
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SavingsOffer(id=");
        A10.append(this.A02);
        A10.append(", code=");
        A10.append(this.A00);
        A10.append(", description=");
        return C17900vP.A0B(this.A01, A10);
    }
}
