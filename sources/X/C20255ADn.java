package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.ADn  reason: case insensitive filesystem */
public final class C20255ADn implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final AEM A00;
    public final String A01;
    public final String A02;

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C20255ADn) {
                C20255ADn aDn = (C20255ADn) obj;
                if (!C18070vi.A18(this.A01, aDn.A01) || !C18070vi.A18(this.A02, aDn.A02) || !C18070vi.A18(this.A00, aDn.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        AEM aem = this.A00;
        if (aem == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        aem.writeToParcel(parcel, i);
    }

    public int hashCode() {
        return (((C17900vP.A00(this.A01) * 31) + C17900vP.A00(this.A02)) * 31) + C17880vN.A02(this.A00);
    }

    public C20255ADn(AEM aem, String str, String str2) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = aem;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ProductComplianceInfo(countryCodeOrigin=");
        A10.append(this.A01);
        A10.append(", importerName=");
        A10.append(this.A02);
        A10.append(", importerAddress=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
