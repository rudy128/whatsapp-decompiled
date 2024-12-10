package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public final class D4D implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final Bundle A01;
    public final D3T A02;
    public final C26553D3t A03;
    public final ECW A04;
    public final BVW A05;
    public final BVX A06;
    public final String A07;
    public final boolean A08;
    public final int A09;
    public final long A0A;
    public final Integer A0B;
    public final Integer A0C;
    public final Integer A0D;
    public final String A0E;
    public final String A0F;

    public D4D(Bundle bundle, D3T d3t, C26553D3t d3t2, ECW ecw, BVW bvw, BVX bvx, Integer num, Integer num2, Integer num3, String str, String str2, String str3, int i, int i2, long j, boolean z) {
        C18070vi.A0g(num, 1, str);
        C18070vi.A0d(d3t, 8);
        this.A0B = num;
        this.A05 = bvw;
        this.A09 = i;
        this.A00 = i2;
        this.A0F = str;
        this.A0A = j;
        this.A04 = ecw;
        this.A02 = d3t;
        this.A06 = bvx;
        this.A0C = num2;
        this.A0E = str2;
        this.A01 = bundle;
        this.A0D = num3;
        this.A08 = z;
        this.A07 = str3;
        this.A03 = d3t2;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof D4D) {
                D4D d4d = (D4D) obj;
                if (this.A0B != d4d.A0B || !C18070vi.A18(this.A05, d4d.A05) || this.A09 != d4d.A09 || this.A00 != d4d.A00 || !C18070vi.A18(this.A0F, d4d.A0F) || this.A0A != d4d.A0A || !C18070vi.A18(this.A04, d4d.A04) || !C18070vi.A18(this.A02, d4d.A02) || !C18070vi.A18(this.A06, d4d.A06) || this.A0C != d4d.A0C || !C18070vi.A18(this.A0E, d4d.A0E) || !C18070vi.A18(this.A01, d4d.A01) || this.A0D != d4d.A0D || this.A08 != d4d.A08 || !C18070vi.A18(this.A07, d4d.A07) || !C18070vi.A18(this.A03, d4d.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(C25323CdU.A01(this.A0B));
        parcel.writeParcelable(this.A05, i);
        parcel.writeInt(this.A09);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A0F);
        parcel.writeLong(this.A0A);
        parcel.writeParcelable(this.A04, i);
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A06, i);
        Integer num = this.A0C;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(A00(num));
        }
        parcel.writeParcelable((Parcelable) null, i);
        parcel.writeString(this.A0E);
        parcel.writeBundle(this.A01);
        parcel.writeParcelable((Parcelable) null, i);
        Integer num2 = this.A0D;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(A01(num2));
        }
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeString(this.A07);
        parcel.writeParcelable(this.A03, i);
    }

    public int hashCode() {
        int A0E2;
        int A0E3;
        Integer num = this.A0B;
        int A022 = C17890vO.A02(this.A0F, ((((((C72453Mb.A0E(num, C25323CdU.A01(num)) * 31) + AnonymousClass001.A0k(this.A05)) * 31) + this.A09) * 31) + this.A00) * 31);
        int A0N = (AnonymousClass000.A0N(this.A02, (AnonymousClass001.A0K(this.A0A, A022) + AnonymousClass001.A0k(this.A04)) * 31) + AnonymousClass001.A0k(this.A06)) * 31;
        Integer num2 = this.A0C;
        if (num2 == null) {
            A0E2 = 0;
        } else {
            A0E2 = C72453Mb.A0E(num2, A00(num2));
        }
        int A062 = BE6.A06((BE6.A06(A0N, A0E2) + C17900vP.A00(this.A0E)) * 31, AnonymousClass001.A0k(this.A01));
        Integer num3 = this.A0D;
        if (num3 == null) {
            A0E3 = 0;
        } else {
            A0E3 = C72453Mb.A0E(num3, A01(num3));
        }
        return ((AnonymousClass0DV.A00((A062 + A0E3) * 31, this.A08) + C17900vP.A00(this.A07)) * 31) + C17880vN.A02(this.A03);
    }

    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "IMAGE";
            case 2:
                return "VIDEO";
            case 3:
                return "VIDEO_AUTOPLAY";
            case 4:
                return "NONE";
            default:
                return "ICON";
        }
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "LONGEST";
            case 2:
                return "NOT_SET";
            default:
                return "SHORTEST";
        }
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PhotoSelfieCaptureConfig(featureLevel=");
        A10.append(C25323CdU.A01(this.A0B));
        A10.append(", selfieCaptureUi=");
        A10.append(this.A05);
        A10.append(", theme=");
        A10.append(this.A09);
        A10.append(", themeLightForced=");
        A10.append(this.A00);
        A10.append(", product=");
        A10.append(this.A0F);
        A10.append(", submissionId=");
        A10.append(this.A0A);
        A10.append(", stringOverrideFactory=");
        A10.append(this.A04);
        A10.append(", evidenceRecorderProvider=");
        A10.append(this.A02);
        A10.append(", resourcesProvider=");
        A10.append(this.A06);
        A10.append(", reviewType=");
        Integer num = this.A0C;
        if (num != null) {
            str = A00(num);
        } else {
            str = "null";
        }
        A10.append(str);
        AnonymousClass000.A1G(A10, ", smartCaptureLoggerProvider=");
        A10.append(", loggingSessionId=");
        A10.append(this.A0E);
        A10.append(", tags=");
        A10.append(this.A01);
        AnonymousClass000.A1G(A10, ", experimentConfigProvider=");
        A10.append(", trainingConsentInitialValue=");
        Integer num2 = this.A0D;
        if (num2 != null) {
            str2 = A01(num2);
        } else {
            str2 = "null";
        }
        A10.append(str2);
        A10.append(", shouldHidePrivacyDisclaimer=");
        A10.append(this.A08);
        A10.append(", sessionTokenKey=");
        A10.append(this.A07);
        A10.append(", challengeProvider=");
        return AnonymousClass001.A1F(this.A03, A10);
    }
}
