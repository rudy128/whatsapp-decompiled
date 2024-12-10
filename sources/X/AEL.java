package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class AEL implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AEL) {
                AEL ael = (AEL) obj;
                if (!C18070vi.A18(this.A01, ael.A01) || !C18070vi.A18(this.A00, ael.A00) || !C18070vi.A18(this.A03, ael.A03) || this.A04 != ael.A04 || !C18070vi.A18(this.A02, ael.A02)) {
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
        parcel.writeString(this.A00);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeString(this.A02);
    }

    public int hashCode() {
        return C108945cZ.A09(this.A02, AnonymousClass0DV.A00(C17890vO.A02(this.A03, C17890vO.A02(this.A00, C17880vN.A03(this.A01))), this.A04));
    }

    public AEL(String str, String str2, String str3, String str4, boolean z) {
        C18070vi.A0o(str, str2, str3);
        C18070vi.A0d(str4, 5);
        this.A01 = str;
        this.A00 = str2;
        this.A03 = str3;
        this.A04 = z;
        this.A02 = str4;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BusinessServiceOffering(categoryName=");
        A10.append(this.A01);
        A10.append(", categoryId=");
        A10.append(this.A00);
        A10.append(", offeringId=");
        A10.append(this.A03);
        A10.append(", isOffered=");
        A10.append(this.A04);
        A10.append(", offerName=");
        return C17900vP.A0B(this.A02, A10);
    }
}
