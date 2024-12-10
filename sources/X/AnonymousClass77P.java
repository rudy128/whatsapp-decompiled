package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.77P  reason: invalid class name */
public final class AnonymousClass77P implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final String A00;
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

    public AnonymousClass77P(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        C18070vi.A0d(str3, 3);
        C18070vi.A0q(str6, str7, str8);
        C18070vi.A0d(str10, 10);
        C72473Md.A1L(str11, str12);
        this.A00 = str;
        this.A0B = str2;
        this.A07 = str3;
        this.A08 = str4;
        this.A09 = str5;
        this.A03 = str6;
        this.A05 = str7;
        this.A0A = str8;
        this.A02 = str9;
        this.A01 = str10;
        this.A06 = str11;
        this.A04 = str12;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass77P) {
                AnonymousClass77P r5 = (AnonymousClass77P) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A0B, r5.A0B) || !C18070vi.A18(this.A07, r5.A07) || !C18070vi.A18(this.A08, r5.A08) || !C18070vi.A18(this.A09, r5.A09) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A05, r5.A05) || !C18070vi.A18(this.A0A, r5.A0A) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A06, r5.A06) || !C18070vi.A18(this.A04, r5.A04)) {
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
        parcel.writeString(this.A0B);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        parcel.writeString(this.A09);
        parcel.writeString(this.A03);
        parcel.writeString(this.A05);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeString(this.A06);
        parcel.writeString(this.A04);
    }

    public int hashCode() {
        String str = this.A07;
        int A022 = C17890vO.A02(this.A05, C17890vO.A02(this.A03, (((C17890vO.A02(str, ((C17900vP.A00(this.A00) * 31) + C17900vP.A00(this.A0B)) * 31) + C17900vP.A00(this.A08)) * 31) + C17900vP.A00(this.A09)) * 31));
        return C108945cZ.A09(this.A04, C17890vO.A02(this.A06, C17890vO.A02(this.A01, (C17890vO.A02(this.A0A, A022) + C108955ca.A06(this.A02)) * 31)));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PixQrCode(chavePix=");
        A10.append(this.A00);
        A10.append(", urlDoPayload=");
        A10.append(this.A0B);
        A10.append(", payloadFormatIndicator=");
        A10.append(this.A07);
        A10.append(", pointOfInformationMethod=");
        A10.append(this.A08);
        A10.append(", postalCode=");
        A10.append(this.A09);
        A10.append(", countryCode=");
        A10.append(this.A03);
        A10.append(", payeeCategoryCode=");
        A10.append(this.A05);
        A10.append(", txnCurrency=");
        A10.append(this.A0A);
        A10.append(", txnAmount=");
        A10.append(this.A02);
        A10.append(", payeeName=");
        A10.append(this.A01);
        A10.append(", payeeCity=");
        A10.append(this.A06);
        A10.append(", crc16=");
        return C17900vP.A0B(this.A04, A10);
    }
}
