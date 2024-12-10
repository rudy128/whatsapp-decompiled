package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.io.File;
import java.util.Arrays;

public final class AEX implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public long A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public boolean A07;
    public byte[] A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final long A0E;
    public final String A0F;
    public final String A0G;

    public AEX(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, byte[] bArr, int i, int i2, int i3, int i4, int i5, long j, long j2, boolean z) {
        C18070vi.A0g(str, 1, str2);
        this.A0F = str;
        this.A0E = j;
        this.A0D = i;
        this.A09 = i2;
        this.A0G = str2;
        this.A0A = i3;
        this.A0C = i4;
        this.A0B = i5;
        this.A05 = str3;
        this.A01 = str4;
        this.A06 = str5;
        this.A00 = j2;
        this.A08 = bArr;
        this.A04 = str6;
        this.A03 = str7;
        this.A02 = str8;
        this.A07 = z;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !C18070vi.A14(this, obj)) {
                return false;
            }
            AEX aex = (AEX) obj;
            if (!C18070vi.A18(this.A0F, aex.A0F) || this.A0E != aex.A0E || this.A0D != aex.A0D || this.A09 != aex.A09 || !C18070vi.A18(this.A0G, aex.A0G) || this.A0A != aex.A0A || this.A0C != aex.A0C || this.A0B != aex.A0B || !C42171xk.A00(this.A05, aex.A05) || !C42171xk.A00(this.A01, aex.A01) || !C42171xk.A00(this.A06, aex.A06) || !Arrays.equals(this.A08, aex.A08) || this.A00 != aex.A00 || !C42171xk.A00(this.A04, aex.A04) || !C42171xk.A00(this.A03, aex.A03) || !C42171xk.A00(this.A02, aex.A02) || this.A07 != aex.A07) {
                return false;
            }
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A0F);
        parcel.writeLong(this.A0E);
        parcel.writeInt(this.A0D);
        parcel.writeInt(this.A09);
        parcel.writeString(this.A0G);
        parcel.writeInt(this.A0A);
        parcel.writeInt(this.A0C);
        parcel.writeInt(this.A0B);
        parcel.writeString(this.A05);
        parcel.writeString(this.A01);
        parcel.writeString(this.A06);
        parcel.writeLong(this.A00);
        parcel.writeByteArray(this.A08);
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A07 ? 1 : 0);
    }

    public final C165978c9 A00() {
        AnonymousClass8bL r3;
        if (!this.A07 || this.A08 == null) {
            r3 = null;
        } else {
            C23624Bmt A0N = AnonymousClass8bL.DEFAULT_INSTANCE.A0N();
            C23581BmB A032 = C17900vP.A03(A0N, this.A08);
            AnonymousClass8bL r1 = (AnonymousClass8bL) A0N.A00;
            r1.bitField0_ |= 1;
            r1.mediaKey_ = A032;
            long j = this.A00;
            AnonymousClass8bL r12 = (AnonymousClass8bL) C17880vN.A0G(A0N);
            r12.bitField0_ |= 2;
            r12.mediaKeyTimestamp_ = j;
            String str = this.A02;
            AnonymousClass8bL r13 = (AnonymousClass8bL) C17880vN.A0G(A0N);
            str.getClass();
            r13.bitField0_ |= 16;
            r13.directPath_ = str;
            C23581BmB A033 = C17900vP.A03(A0N, Base64.decode(this.A04, 2));
            AnonymousClass8bL r14 = (AnonymousClass8bL) A0N.A00;
            r14.bitField0_ |= 4;
            r14.fileSha256_ = A033;
            C23581BmB A034 = C17900vP.A03(A0N, Base64.decode(this.A03, 2));
            AnonymousClass8bL r15 = (AnonymousClass8bL) A0N.A00;
            r15.bitField0_ |= 8;
            r15.fileEncSha256_ = A034;
            r3 = (AnonymousClass8bL) A0N.A0C();
        }
        C23624Bmt A0N2 = C165978c9.DEFAULT_INSTANCE.A0N();
        String str2 = this.A0F;
        C165978c9 r16 = (C165978c9) C17880vN.A0G(A0N2);
        r16.bitField0_ |= 1;
        r16.id_ = str2;
        long j2 = this.A0E;
        C165978c9 r17 = (C165978c9) C17880vN.A0G(A0N2);
        r17.bitField0_ |= 2;
        r17.fileLength_ = j2;
        int i = this.A0D;
        C165978c9 r18 = (C165978c9) C17880vN.A0G(A0N2);
        r18.bitField0_ |= 4;
        r18.width_ = i;
        int i2 = this.A09;
        C165978c9 r19 = (C165978c9) C17880vN.A0G(A0N2);
        r19.bitField0_ |= 8;
        r19.height_ = i2;
        String str3 = this.A0G;
        C165978c9 r110 = (C165978c9) C17880vN.A0G(A0N2);
        r110.bitField0_ |= 16;
        r110.mimetype_ = str3;
        int i3 = this.A0A;
        C165978c9 r111 = (C165978c9) C17880vN.A0G(A0N2);
        r111.bitField0_ |= 32;
        r111.placeholderArgb_ = i3;
        int i4 = this.A0C;
        C165978c9 r112 = (C165978c9) C17880vN.A0G(A0N2);
        r112.bitField0_ |= 64;
        r112.textArgb_ = i4;
        int i5 = this.A0B;
        C165978c9 r113 = (C165978c9) C17880vN.A0G(A0N2);
        r113.bitField0_ |= 128;
        r113.subtextArgb_ = i5;
        if (r3 != null) {
            C165978c9 r114 = (C165978c9) C17880vN.A0G(A0N2);
            r114.mediaData_ = r3;
            r114.bitField0_ |= 256;
        }
        return (C165978c9) A0N2.A0C();
    }

    public int hashCode() {
        Object[] objArr = new Object[16];
        objArr[0] = this.A0F;
        C17890vO.A1M(objArr, this.A0E);
        AnonymousClass3Ma.A1S(objArr, this.A0D);
        C17890vO.A1G(objArr, this.A09);
        objArr[4] = this.A0G;
        AnonymousClass3Ma.A1U(objArr, this.A0A);
        C17890vO.A1H(objArr, this.A0C);
        C17890vO.A1I(objArr, this.A0B);
        objArr[8] = this.A05;
        objArr[9] = this.A01;
        objArr[10] = this.A06;
        objArr[11] = this.A08;
        objArr[12] = Long.valueOf(this.A00);
        objArr[13] = this.A04;
        objArr[14] = this.A03;
        return AnonymousClass000.A0P(this.A02, objArr, 15);
    }

    public final File A01(File file) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(this.A0F);
        return AnonymousClass8BW.A0X(file, ".webp", A10);
    }

    public String toString() {
        return "PaymentBackgroundMetadata{}";
    }
}
