package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.AEj  reason: case insensitive filesystem */
public final class C20276AEj implements Parcelable {
    public static final C198849z1 A0E = new Object();
    public static final Parcelable.Creator CREATOR = new Object();
    public int A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final int A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;

    public C20276AEj(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, int i2) {
        C18070vi.A0d(str, 1);
        C72473Md.A1M(str2, str3, str4, 2);
        C18070vi.A0q(str5, str6, str7);
        this.A0C = str;
        this.A0D = str2;
        this.A0A = i;
        this.A08 = str3;
        this.A0B = str4;
        this.A09 = str5;
        this.A06 = str6;
        this.A05 = str7;
        this.A07 = str8;
        this.A02 = str9;
        this.A01 = str10;
        this.A03 = str11;
        this.A04 = str12;
        this.A00 = i2;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C20276AEj) {
                C20276AEj aEj = (C20276AEj) obj;
                if (!C18070vi.A18(this.A0C, aEj.A0C) || !C18070vi.A18(this.A0D, aEj.A0D) || this.A0A != aEj.A0A || !C18070vi.A18(this.A08, aEj.A08) || !C18070vi.A18(this.A0B, aEj.A0B) || !C18070vi.A18(this.A09, aEj.A09) || !C18070vi.A18(this.A06, aEj.A06) || !C18070vi.A18(this.A05, aEj.A05) || !C18070vi.A18(this.A07, aEj.A07) || !C18070vi.A18(this.A02, aEj.A02) || !C18070vi.A18(this.A01, aEj.A01) || !C18070vi.A18(this.A03, aEj.A03) || !C18070vi.A18(this.A04, aEj.A04) || this.A00 != aEj.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0D);
        parcel.writeInt(this.A0A);
        parcel.writeString(this.A08);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A09);
        parcel.writeString(this.A06);
        parcel.writeString(this.A05);
        parcel.writeString(this.A07);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A00);
    }

    public static final void A00(String str, String str2, StringBuilder sb) {
        if (str2 != null) {
            StringBuilder A11 = AnonymousClass000.A11(str);
            A11.append('=');
            A11.append(str2);
            A11.append('&');
            AnonymousClass8BS.A1D(A11, sb);
        }
    }

    public int hashCode() {
        int A032 = C17880vN.A03(this.A0C);
        return ((((((((((C17890vO.A02(this.A05, C17890vO.A02(this.A06, C17890vO.A02(this.A09, C17890vO.A02(this.A0B, C17890vO.A02(this.A08, (C17890vO.A02(this.A0D, A032) + this.A0A) * 31))))) + C17900vP.A00(this.A07)) * 31) + C17900vP.A00(this.A02)) * 31) + C17900vP.A00(this.A01)) * 31) + C17900vP.A00(this.A03)) * 31) + C108955ca.A06(this.A04)) * 31) + this.A00;
    }

    public final String A01() {
        StringBuilder A10 = AnonymousClass000.A10();
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append(this.A0C);
        A102.append(this.A0D);
        A102.append('?');
        AnonymousClass8BS.A1D(A102, A10);
        A00("version", String.valueOf(this.A0A), A10);
        A00("platform", this.A08, A10);
        A00("sessionID", this.A09, A10);
        A00("authMethod", this.A0B, A10);
        A00("cert", this.A06, A10);
        A00("authToken", this.A05, A10);
        A00("peerID", this.A07, A10);
        A00("ip", this.A01, A10);
        A00("ssid", this.A03, A10);
        A00("ssidPw", this.A04, A10);
        A00("otpCode", this.A02, A10);
        A00("port", String.valueOf(this.A00), A10);
        if (AnonymousClass1YF.A0W(A10, "&")) {
            A10.setLength(A10.length() - 1);
        }
        return C18070vi.A0H(A10);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("TransferConnectionDetails(deeplinkBase=");
        A10.append(this.A0C);
        A10.append(", deeplinkFlag=");
        A10.append(this.A0D);
        A10.append(", version=");
        A10.append(this.A0A);
        A10.append(", platform=");
        A10.append(this.A08);
        A10.append(", authMethod=");
        A10.append(this.A0B);
        A10.append(", sessionId=");
        A10.append(this.A09);
        A10.append(", certHash=");
        A10.append(this.A06);
        A10.append(", authToken=");
        A10.append(this.A05);
        A10.append(", peerID=");
        A10.append(this.A07);
        A10.append(", otpCode=");
        A10.append(this.A02);
        A10.append(", ipAddress=");
        A10.append(this.A01);
        A10.append(", ssID=");
        A10.append(this.A03);
        A10.append(", ssIDPassword=");
        A10.append(this.A04);
        A10.append(", port=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
