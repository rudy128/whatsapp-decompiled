package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.D3k  reason: case insensitive filesystem */
public final class C26548D3k implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final long A01;
    public final Bundle A02;
    public final C26544D3f A03;
    public final ECW A04;
    public final BVV A05;
    public final BVX A06;
    public final Integer A07;
    public final Integer A08;
    public final Integer A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final long A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final boolean A0J;

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26548D3k) {
                C26548D3k d3k = (C26548D3k) obj;
                if (!C18070vi.A18(this.A0A, d3k.A0A) || this.A07 != d3k.A07 || !C18070vi.A18(this.A05, d3k.A05) || this.A08 != d3k.A08 || this.A09 != d3k.A09 || !C18070vi.A18(this.A03, d3k.A03) || !C18070vi.A18(this.A0B, d3k.A0B) || this.A0D != d3k.A0D || this.A0J != d3k.A0J || this.A0E != d3k.A0E || !C18070vi.A18(this.A0C, d3k.A0C) || this.A01 != d3k.A01 || !C18070vi.A18(this.A0G, d3k.A0G) || !C18070vi.A18(this.A0H, d3k.A0H) || !C18070vi.A18(this.A06, d3k.A06) || !C18070vi.A18(this.A0I, d3k.A0I) || !C18070vi.A18(this.A04, d3k.A04) || this.A0F != d3k.A0F || !C18070vi.A18(this.A02, d3k.A02) || this.A00 != d3k.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        String str2;
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A0A);
        if (this.A07.intValue() != 0) {
            str = "TWO_SIDES";
        } else {
            str = "ONE_SIDE";
        }
        parcel.writeString(str);
        parcel.writeParcelable(this.A05, i);
        parcel.writeParcelable((Parcelable) null, i);
        if (this.A08.intValue() != 0) {
            str2 = "XMDS";
        } else {
            str2 = "APP_DEFAULT";
        }
        parcel.writeString(str2);
        parcel.writeParcelable((Parcelable) null, i);
        parcel.writeString(C25323CdU.A01(this.A09));
        parcel.writeParcelable(this.A03, i);
        parcel.writeString(this.A0B);
        parcel.writeInt(this.A0D ? 1 : 0);
        parcel.writeInt(this.A0J ? 1 : 0);
        parcel.writeInt(this.A0E ? 1 : 0);
        parcel.writeParcelable((Parcelable) null, i);
        parcel.writeString(this.A0C);
        parcel.writeLong(this.A01);
        parcel.writeParcelable((Parcelable) null, i);
        parcel.writeString(this.A0G);
        parcel.writeString(this.A0H);
        parcel.writeParcelable(this.A06, i);
        parcel.writeString(this.A0I);
        parcel.writeParcelable(this.A04, i);
        parcel.writeLong(this.A0F);
        parcel.writeBundle(this.A02);
        parcel.writeInt(this.A00);
    }

    public int hashCode() {
        String str;
        String str2;
        int A002 = C17900vP.A00(this.A0A) * 31;
        int intValue = this.A07.intValue();
        if (intValue != 0) {
            str = "TWO_SIDES";
        } else {
            str = "ONE_SIDE";
        }
        int A062 = BE6.A06((A002 + str.hashCode() + intValue) * 31, AnonymousClass001.A0k(this.A05));
        int intValue2 = this.A08.intValue();
        if (intValue2 != 0) {
            str2 = "XMDS";
        } else {
            str2 = "APP_DEFAULT";
        }
        int A063 = BE6.A06(A062, str2.hashCode() + intValue2);
        Integer num = this.A09;
        int A0K = AnonymousClass001.A0K(this.A01, ((AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00((((((A063 + C72453Mb.A0E(num, C25323CdU.A01(num))) * 31) + AnonymousClass001.A0k(this.A03)) * 31) + C17900vP.A00(this.A0B)) * 31, this.A0D), this.A0J), this.A0E) * 31) + C17900vP.A00(this.A0C)) * 31) * 31;
        return ((AnonymousClass001.A0K(this.A0F, AnonymousClass000.A0N(this.A04, (((((C17890vO.A02(this.A0G, A0K) + C17900vP.A00(this.A0H)) * 31) + AnonymousClass001.A0k(this.A06)) * 31) + C17900vP.A00(this.A0I)) * 31)) + C17880vN.A02(this.A02)) * 31) + this.A00;
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("IdCaptureConfig(backFilePath=");
        A10.append(this.A0A);
        A10.append(", captureMode=");
        if (this.A07.intValue() != 0) {
            str = "TWO_SIDES";
        } else {
            str = "ONE_SIDE";
        }
        A10.append(str);
        A10.append(", captureUi=");
        A10.append(this.A05);
        AnonymousClass000.A1G(A10, ", clientSignalsAccumulator=");
        A10.append(", designSystem=");
        if (this.A08.intValue() != 0) {
            str2 = "XMDS";
        } else {
            str2 = "APP_DEFAULT";
        }
        A10.append(str2);
        AnonymousClass000.A1G(A10, ", experimentConfigProvider=");
        A10.append(", featureLevel=");
        A10.append(C25323CdU.A01(this.A09));
        A10.append(", fixedSizes=");
        A10.append(this.A03);
        A10.append(", frontFilePath=");
        A10.append(this.A0B);
        A10.append(", isCancelConfirmationActionSheetEnabled=");
        A10.append(this.A0D);
        A10.append(", isDebugAnnotationsEnabled=");
        A10.append(this.A0J);
        A10.append(", isShouldSkipReviewScreen=");
        A10.append(this.A0E);
        AnonymousClass000.A1G(A10, ", loggerProvider=");
        A10.append(", loggingSessionId=");
        A10.append(this.A0C);
        A10.append(", maxFileSizeInBytes=");
        A10.append(this.A01);
        AnonymousClass000.A1G(A10, ", modulesDownloader=");
        A10.append(", product=");
        A10.append(this.A0G);
        A10.append(", publicEncryptionKey=");
        A10.append(this.A0H);
        A10.append(", resourcesProvider=");
        A10.append(this.A06);
        A10.append(", sessionTokenKey=");
        A10.append(this.A0I);
        A10.append(", stringOverrideFactory=");
        A10.append(this.A04);
        A10.append(", submissionId=");
        A10.append(this.A0F);
        A10.append(", tags=");
        A10.append(this.A02);
        A10.append(", theme=");
        return AnonymousClass001.A1L(A10, this.A00);
    }

    public C26548D3k(Bundle bundle, C26544D3f d3f, ECW ecw, BVV bvv, BVX bvx, Integer num, Integer num2, Integer num3, String str, String str2, String str3, String str4, String str5, String str6, int i, long j, long j2, boolean z, boolean z2, boolean z3) {
        C18070vi.A0g(num, 2, num2);
        C18070vi.A0d(num3, 7);
        C18070vi.A0d(str4, 17);
        C18070vi.A0d(ecw, 21);
        this.A0A = str;
        this.A07 = num;
        this.A05 = bvv;
        this.A08 = num2;
        this.A09 = num3;
        this.A03 = d3f;
        this.A0B = str2;
        this.A0D = z;
        this.A0J = z2;
        this.A0E = z3;
        this.A0C = str3;
        this.A01 = j;
        this.A0G = str4;
        this.A0H = str5;
        this.A06 = bvx;
        this.A0I = str6;
        this.A04 = ecw;
        this.A0F = j2;
        this.A02 = bundle;
        this.A00 = i;
    }
}
