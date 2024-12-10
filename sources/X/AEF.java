package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class AEF implements Parcelable {
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
            if (obj instanceof AEF) {
                AEF aef = (AEF) obj;
                if (!C18070vi.A18(this.A02, aef.A02) || !C18070vi.A18(this.A01, aef.A01) || !C18070vi.A18(this.A03, aef.A03) || !C18070vi.A18(this.A00, aef.A00)) {
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
        parcel.writeString(this.A03);
        parcel.writeString(this.A00);
    }

    public int hashCode() {
        return C17890vO.A02(this.A03, (C17880vN.A03(this.A02) + C17900vP.A00(this.A01)) * 31) + C108955ca.A06(this.A00);
    }

    public AEF(String str, String str2, String str3, String str4) {
        C72473Md.A1I(str, str3);
        this.A02 = str;
        this.A01 = str2;
        this.A03 = str3;
        this.A00 = str4;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SingleSelectListSectionItem(id=");
        A10.append(this.A02);
        A10.append(", header=");
        A10.append(this.A01);
        A10.append(", title=");
        A10.append(this.A03);
        A10.append(", description=");
        return C17900vP.A0B(this.A00, A10);
    }
}
