package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class AEP implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final boolean A0C;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AEP) {
                AEP aep = (AEP) obj;
                if (!C18070vi.A18(this.A07, aep.A07) || !C18070vi.A18(this.A06, aep.A06) || !C18070vi.A18(this.A04, aep.A04) || !C18070vi.A18(this.A0B, aep.A0B) || !C18070vi.A18(this.A08, aep.A08) || !C18070vi.A18(this.A0A, aep.A0A) || !C18070vi.A18(this.A02, aep.A02) || !C18070vi.A18(this.A09, aep.A09) || this.A0C != aep.A0C || !C18070vi.A18(this.A01, aep.A01) || !C18070vi.A18(this.A03, aep.A03) || !C18070vi.A18(this.A05, aep.A05) || !C18070vi.A18(this.A00, aep.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A07);
        parcel.writeString(this.A06);
        parcel.writeString(this.A04);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A08);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A02);
        parcel.writeString(this.A09);
        parcel.writeByte(this.A0C ? (byte) 1 : 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
        parcel.writeString(this.A05);
        parcel.writeString(this.A00);
    }

    public int hashCode() {
        int A022 = C17890vO.A02(this.A04, (C17880vN.A03(this.A07) + C17900vP.A00(this.A06)) * 31);
        return C108945cZ.A09(this.A00, C17890vO.A02(this.A05, C17890vO.A02(this.A03, C17890vO.A02(this.A01, AnonymousClass0DV.A00(C17890vO.A02(this.A09, C17890vO.A02(this.A02, (((C17890vO.A02(this.A0B, A022) + C17900vP.A00(this.A08)) * 31) + C108955ca.A06(this.A0A)) * 31)), this.A0C)))));
    }

    public AEP(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z) {
        C72473Md.A1I(str, str3);
        C18070vi.A0d(str4, 4);
        C108965cb.A1P(str7, 7, str8);
        C18070vi.A0d(str9, 10);
        C18070vi.A0r(str10, str11, str12);
        this.A07 = str;
        this.A06 = str2;
        this.A04 = str3;
        this.A0B = str4;
        this.A08 = str5;
        this.A0A = str6;
        this.A02 = str7;
        this.A09 = str8;
        this.A0C = z;
        this.A01 = str9;
        this.A03 = str10;
        this.A05 = str11;
        this.A00 = str12;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("IndiaUpiInternationalQrCodeMetadata(payeeName=");
        A10.append(this.A07);
        A10.append(", merchantCode=");
        A10.append(this.A06);
        A10.append(", initiationMode=");
        A10.append(this.A04);
        A10.append(", purposeCode=");
        A10.append(this.A0B);
        A10.append(", presetAmount=");
        A10.append(this.A08);
        A10.append(", presetMinAmount=");
        A10.append(this.A0A);
        A10.append(", externalPaymentSource=");
        A10.append(this.A02);
        A10.append(", vpa=");
        A10.append(this.A09);
        A10.append(", isVpaVerifiedMerchant=");
        A10.append(this.A0C);
        A10.append(", baseCurrency=");
        A10.append(this.A01);
        A10.append(", fxConversionFactor=");
        A10.append(this.A03);
        A10.append(", markUpFee=");
        A10.append(this.A05);
        A10.append(", internationalPayDetails=");
        return C17900vP.A0B(this.A00, A10);
    }
}
