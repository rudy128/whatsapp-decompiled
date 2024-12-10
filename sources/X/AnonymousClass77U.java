package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.77U  reason: invalid class name */
public final class AnonymousClass77U implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;
    public final byte[] A07;
    public final byte[] A08;
    public final byte[] A09;
    public final byte[] A0A;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C18070vi.A18(getClass(), C108975cc.A0R(obj))) {
            return false;
        }
        C18070vi.A0z(obj, "null cannot be cast to non-null type com.whatsapp.protocol.EmbeddedMusic");
        AnonymousClass77U r4 = (AnonymousClass77U) obj;
        return C18070vi.A18(this.A03, r4.A03) && C18070vi.A18(this.A04, r4.A04) && C18070vi.A18(this.A02, r4.A02) && C18070vi.A18(this.A05, r4.A05) && C18070vi.A18(this.A01, r4.A01) && Arrays.equals(this.A09, r4.A09) && Arrays.equals(this.A07, r4.A07) && Arrays.equals(this.A08, r4.A08) && C18070vi.A18(this.A00, r4.A00) && Arrays.equals(this.A0A, r4.A0A) && this.A06 == r4.A06;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A02);
        parcel.writeString(this.A05);
        parcel.writeString(this.A01);
        parcel.writeByteArray(this.A09);
        parcel.writeByteArray(this.A07);
        parcel.writeByteArray(this.A08);
        parcel.writeString(this.A00);
        parcel.writeByteArray(this.A0A);
        parcel.writeInt(this.A06 ? 1 : 0);
    }

    public final boolean A00() {
        String str;
        String str2;
        String str3;
        String str4 = this.A03;
        if (str4 == null || str4.length() == 0 || (str = this.A04) == null || str.length() == 0 || (str2 = this.A02) == null || str2.length() == 0 || (str3 = this.A05) == null || str3.length() == 0) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[11];
        objArr[0] = this.A03;
        objArr[1] = this.A04;
        objArr[2] = this.A02;
        objArr[3] = this.A05;
        objArr[4] = this.A01;
        objArr[5] = this.A09;
        objArr[6] = this.A07;
        objArr[7] = this.A08;
        objArr[8] = this.A00;
        objArr[9] = this.A0A;
        return AnonymousClass000.A0P(Boolean.valueOf(this.A06), objArr, 10);
    }

    public AnonymousClass77U(String str, String str2, String str3, String str4, String str5, String str6, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, boolean z) {
        this.A03 = str;
        this.A04 = str2;
        this.A02 = str3;
        this.A05 = str4;
        this.A01 = str5;
        this.A09 = bArr;
        this.A07 = bArr2;
        this.A08 = bArr3;
        this.A00 = str6;
        this.A0A = bArr4;
        this.A06 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("EmbeddedMusic(musicContentMediaId=");
        A10.append(this.A03);
        A10.append(", songId=");
        A10.append(this.A04);
        A10.append(", author=");
        A10.append(this.A02);
        A10.append(", title=");
        A10.append(this.A05);
        A10.append(", artworkDirectPath=");
        A10.append(this.A01);
        A10.append(", artworkSha256=");
        C17890vO.A1C(A10, this.A09);
        A10.append(", artworkEncSha256=");
        C17890vO.A1C(A10, this.A07);
        A10.append(", artworkMediaKey=");
        C17890vO.A1C(A10, this.A08);
        A10.append(", artistAttribution=");
        A10.append(this.A00);
        A10.append(", countryBlocklist=");
        C17890vO.A1C(A10, this.A0A);
        A10.append(", isExplicit=");
        return C17900vP.A0F(A10, this.A06);
    }
}
