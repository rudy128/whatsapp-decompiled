package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class D46 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof D46) {
                D46 d46 = (D46) obj;
                if (!C18070vi.A18(this.A03, d46.A03) || !C18070vi.A18(this.A02, d46.A02) || !C18070vi.A18(this.A01, d46.A01) || !C18070vi.A18(this.A00, d46.A00) || !C18070vi.A18(this.A07, d46.A07) || !C18070vi.A18(this.A06, d46.A06) || !C18070vi.A18(this.A05, d46.A05) || !C18070vi.A18(this.A04, d46.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
        parcel.writeString(this.A07);
        parcel.writeString(this.A06);
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
    }

    public int hashCode() {
        return C108945cZ.A09(this.A04, C17890vO.A02(this.A05, C17890vO.A02(this.A06, C17890vO.A02(this.A07, C17890vO.A02(this.A00, C17890vO.A02(this.A01, C17890vO.A02(this.A02, C17880vN.A03(this.A03))))))));
    }

    public D46(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        C18070vi.A0w(str, str2, str3, str4, str5);
        C18070vi.A0q(str6, str7, str8);
        this.A03 = str;
        this.A02 = str2;
        this.A01 = str3;
        this.A00 = str4;
        this.A07 = str5;
        this.A06 = str6;
        this.A05 = str7;
        this.A04 = str8;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SelfiePermissionsDialogTexts(rationaleTitle=");
        A10.append(this.A03);
        A10.append(", rationaleText=");
        A10.append(this.A02);
        A10.append(", rationaleOk=");
        A10.append(this.A01);
        A10.append(", rationaleCancel=");
        A10.append(this.A00);
        A10.append(", toSettingsTitle=");
        A10.append(this.A07);
        A10.append(", toSettingsText=");
        A10.append(this.A06);
        A10.append(", toSettingsOk=");
        A10.append(this.A05);
        A10.append(", toSettingsCancel=");
        return C17900vP.A0B(this.A04, A10);
    }

    public D46() {
        this("", "", "", "", "", "", "", "");
    }
}
