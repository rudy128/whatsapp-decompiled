package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.77Q  reason: invalid class name */
public final class AnonymousClass77Q implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final int A01;
    public final int A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final String[] A0E;
    public final boolean A0F;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (C18070vi.A18(getClass(), C108975cc.A0R(obj))) {
                C18070vi.A0z(obj, "null cannot be cast to non-null type com.whatsapp.productinfra.avatar.data.graphql.stickers.AvatarSticker");
                AnonymousClass77Q r5 = (AnonymousClass77Q) obj;
                if (C18070vi.A18(this.A0A, r5.A0A) && C18070vi.A18(this.A04, r5.A04) && this.A00 == r5.A00 && C18070vi.A18(this.A06, r5.A06) && this.A01 == r5.A01 && this.A02 == r5.A02 && C18070vi.A18(this.A05, r5.A05) && C18070vi.A18(this.A08, r5.A08) && this.A0B == r5.A0B && this.A0C == r5.A0C && this.A0D == r5.A0D) {
                    String[] strArr = this.A0E;
                    String[] strArr2 = r5.A0E;
                    if (strArr != null) {
                        if (strArr2 == null || !Arrays.equals(strArr, strArr2)) {
                            return false;
                        }
                    } else if (strArr2 != null) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A06);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A02);
        parcel.writeString(this.A05);
        parcel.writeString(this.A08);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A0B ? 1 : 0);
        parcel.writeInt(this.A0F ? 1 : 0);
        parcel.writeInt(this.A0C ? 1 : 0);
        parcel.writeInt(this.A0D ? 1 : 0);
        parcel.writeStringArray(this.A0E);
        parcel.writeString(this.A09);
        parcel.writeString(this.A07);
    }

    public int hashCode() {
        int i;
        int A032 = C17880vN.A03(this.A0A);
        String str = this.A06;
        int A002 = AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(C17890vO.A02(this.A08, C17890vO.A02(this.A05, (((C17890vO.A02(str, (C17890vO.A02(this.A04, A032) + this.A00) * 31) + this.A01) * 31) + this.A02) * 31)), this.A0B), this.A0C), this.A0D);
        String[] strArr = this.A0E;
        if (strArr != null) {
            i = Arrays.hashCode(strArr);
        } else {
            i = 0;
        }
        return A002 + i;
    }

    public AnonymousClass77Q(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String[] strArr, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4) {
        C18070vi.A0j(str, str2);
        C18070vi.A0d(str3, 4);
        C108965cb.A1P(str4, 7, str5);
        this.A0A = str;
        this.A04 = str2;
        this.A00 = i;
        this.A06 = str3;
        this.A01 = i2;
        this.A02 = i3;
        this.A05 = str4;
        this.A08 = str5;
        this.A03 = str6;
        this.A0B = z;
        this.A0F = z2;
        this.A0C = z3;
        this.A0D = z4;
        this.A0E = strArr;
        this.A09 = str7;
        this.A07 = str8;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AvatarSticker(url=");
        A10.append(this.A0A);
        A10.append(", emojis=");
        A10.append(this.A04);
        A10.append(", fileSize=");
        A10.append(this.A00);
        A10.append(", mimeType=");
        A10.append(this.A06);
        A10.append(", height=");
        A10.append(this.A01);
        A10.append(", width=");
        A10.append(this.A02);
        A10.append(", fileHash=");
        A10.append(this.A05);
        A10.append(", stableId=");
        C108965cb.A1U(A10, this.A08);
        A10.append(this.A03);
        A10.append(", isCountrySticker=");
        A10.append(this.A0B);
        A10.append(", isAnimated=");
        A10.append(this.A0F);
        A10.append(", isInstantSticker=");
        A10.append(this.A0C);
        A10.append(", isSocial=");
        A10.append(this.A0D);
        A10.append(", socialStickerFbIds=");
        A10.append(Arrays.toString(this.A0E));
        A10.append(", style=");
        A10.append(this.A09);
        A10.append(", revisionId=");
        return C17900vP.A0B(this.A07, A10);
    }
}
