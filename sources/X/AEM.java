package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class AEM implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AEM) {
                AEM aem = (AEM) obj;
                if (!C18070vi.A18(this.A04, aem.A04) || !C18070vi.A18(this.A05, aem.A05) || !C18070vi.A18(this.A02, aem.A02) || !C18070vi.A18(this.A00, aem.A00) || !C18070vi.A18(this.A03, aem.A03) || !C18070vi.A18(this.A01, aem.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
        parcel.writeString(this.A03);
        parcel.writeString(this.A01);
    }

    public int hashCode() {
        return (((((((((C17900vP.A00(this.A04) * 31) + C17900vP.A00(this.A05)) * 31) + C17900vP.A00(this.A02)) * 31) + C17900vP.A00(this.A00)) * 31) + C17900vP.A00(this.A03)) * 31) + C108955ca.A06(this.A01);
    }

    public AEM(String str, String str2, String str3, String str4, String str5, String str6) {
        this.A04 = str;
        this.A05 = str2;
        this.A02 = str3;
        this.A00 = str4;
        this.A03 = str5;
        this.A01 = str6;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ProductImportAddress(street1=");
        A10.append(this.A04);
        A10.append(", street2=");
        A10.append(this.A05);
        A10.append(", postalCode=");
        A10.append(this.A02);
        A10.append(", city=");
        A10.append(this.A00);
        A10.append(", region=");
        A10.append(this.A03);
        A10.append(", countryCode=");
        return C17900vP.A0B(this.A01, A10);
    }
}
