package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class AEN implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final C20258ADq A00;
    public final AE7 A01;
    public final Boolean A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AEN) {
                AEN aen = (AEN) obj;
                if (!C18070vi.A18(this.A03, aen.A03) || !C18070vi.A18(this.A04, aen.A04) || !C18070vi.A18(this.A05, aen.A05) || !C18070vi.A18(this.A02, aen.A02) || !C18070vi.A18(this.A00, aen.A00) || !C18070vi.A18(this.A01, aen.A01)) {
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
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        Boolean bool = this.A02;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        C20258ADq aDq = this.A00;
        if (aDq == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aDq.writeToParcel(parcel, i);
        }
        AE7 ae7 = this.A01;
        if (ae7 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        ae7.writeToParcel(parcel, i);
    }

    public int hashCode() {
        return (((((((((C17900vP.A00(this.A03) * 31) + C17900vP.A00(this.A04)) * 31) + C17900vP.A00(this.A05)) * 31) + AnonymousClass001.A0k(this.A02)) * 31) + AnonymousClass001.A0k(this.A00)) * 31) + C17880vN.A02(this.A01);
    }

    public AEN(C20258ADq aDq, AE7 ae7, Boolean bool, String str, String str2, String str3) {
        this.A03 = str;
        this.A04 = str2;
        this.A05 = str3;
        this.A02 = bool;
        this.A00 = aDq;
        this.A01 = ae7;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BusinessComplianceDetail(entityName=");
        A10.append(this.A03);
        A10.append(", entityType=");
        A10.append(this.A04);
        A10.append(", entityTypeCustom=");
        A10.append(this.A05);
        A10.append(", isRegistered=");
        A10.append(this.A02);
        A10.append(", businessCustomerCareDetails=");
        A10.append(this.A00);
        A10.append(", businessGrievanceOfficerDetails=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
