package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.77b  reason: invalid class name and case insensitive filesystem */
public final class C1418177b implements Parcelable {
    public static final Integer A0E = AnonymousClass00R.A00;
    public static final Parcelable.Creator CREATOR = new Object();
    public final AnonymousClass771 A00;
    public final AnonymousClass771 A01;
    public final AnonymousClass77L A02;
    public final AnonymousClass77L A03;
    public final C1416776n A04;
    public final Integer A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final AnonymousClass776[] A0D;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1418177b) {
                C1418177b r5 = (C1418177b) obj;
                if (!C18070vi.A18(this.A0A, r5.A0A) || !C18070vi.A18(this.A0B, r5.A0B) || this.A05 != r5.A05 || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A0C, r5.A0C) || !C18070vi.A18(this.A06, r5.A06) || !C18070vi.A18(this.A08, r5.A08) || !C18070vi.A18(this.A0D, r5.A0D) || !C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A07, r5.A07) || !C18070vi.A18(this.A09, r5.A09)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0B);
        parcel.writeString(A00(this.A05));
        AnonymousClass77L r0 = this.A03;
        if (r0 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            r0.writeToParcel(parcel, i);
        }
        parcel.writeString(this.A0C);
        parcel.writeString(this.A06);
        parcel.writeString(this.A08);
        AnonymousClass776[] r3 = this.A0D;
        int length = r3.length;
        parcel.writeInt(length);
        for (int i2 = 0; i2 != length; i2++) {
            r3[i2].writeToParcel(parcel, i);
        }
        C1416776n r02 = this.A04;
        if (r02 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            r02.writeToParcel(parcel, i);
        }
        this.A00.writeToParcel(parcel, i);
        AnonymousClass771 r03 = this.A01;
        if (r03 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            r03.writeToParcel(parcel, i);
        }
        AnonymousClass77L r04 = this.A02;
        if (r04 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            r04.writeToParcel(parcel, i);
        }
        parcel.writeString(this.A07);
        parcel.writeString(this.A09);
    }

    public int hashCode() {
        int A022 = C17890vO.A02(this.A0B, C17880vN.A03(this.A0A));
        Integer num = this.A05;
        return ((((((AnonymousClass000.A0N(this.A00, (((((((((((((A022 + C72453Mb.A0E(num, A00(num))) * 31) + AnonymousClass001.A0k(this.A03)) * 31) + C17900vP.A00(this.A0C)) * 31) + C17900vP.A00(this.A06)) * 31) + C17900vP.A00(this.A08)) * 31) + Arrays.hashCode(this.A0D)) * 31) + AnonymousClass001.A0k(this.A04)) * 31) + AnonymousClass001.A0k(this.A01)) * 31) + AnonymousClass001.A0k(this.A02)) * 31) + C17900vP.A00(this.A07)) * 31) + C108955ca.A06(this.A09);
    }

    public C1418177b(AnonymousClass771 r2, AnonymousClass771 r3, AnonymousClass77L r4, AnonymousClass77L r5, C1416776n r6, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, AnonymousClass776[] r15) {
        C18070vi.A0o(str, str2, num);
        C18070vi.A0d(r15, 8);
        C18070vi.A0d(r2, 10);
        this.A0A = str;
        this.A0B = str2;
        this.A05 = num;
        this.A03 = r4;
        this.A0C = str3;
        this.A06 = str4;
        this.A08 = str5;
        this.A0D = r15;
        this.A04 = r6;
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r5;
        this.A07 = str6;
        this.A09 = str7;
    }

    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "LARGE";
            case 1:
                return "MEDIUM";
            case 2:
                return "FIT_CONTENT";
            default:
                return "FULL_SCREEN";
        }
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PrivacyDisclosurePrompt(name=");
        A10.append(this.A0A);
        A10.append(", template=");
        A10.append(this.A0B);
        A10.append(", height=");
        A10.append(A00(this.A05));
        A10.append(", headIcon=");
        A10.append(this.A03);
        A10.append(", title=");
        A10.append(this.A0C);
        A10.append(", body=");
        A10.append(this.A06);
        A10.append(", footer=");
        A10.append(this.A08);
        A10.append(", bullets=");
        A10.append(Arrays.toString(this.A0D));
        A10.append(", navBar=");
        A10.append(this.A04);
        A10.append(", primaryButton=");
        A10.append(this.A00);
        A10.append(", secondaryButton=");
        A10.append(this.A01);
        A10.append(", brandingIcon=");
        A10.append(this.A02);
        A10.append(", brandingText=");
        A10.append(this.A07);
        A10.append(", footerFontSize=");
        return C17900vP.A0B(this.A09, A10);
    }
}
