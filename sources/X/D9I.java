package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.android.exoplayer2.util.Util;
import java.util.Arrays;

public final class D9I implements ECQ {
    public static final D48 A06 = D48.A00("application/id3");
    public static final D48 A07 = D48.A00("application/x-scte35");
    public static final Parcelable.Creator CREATOR = D3B.A00(15);
    public int A00;
    public final long A01;
    public final long A02;
    public final String A03;
    public final String A04;
    public final byte[] A05;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            D9I d9i = (D9I) obj;
            if (this.A01 != d9i.A01 || this.A02 != d9i.A02 || !Util.A0D(this.A03, d9i.A03) || !Util.A0D(this.A04, d9i.A04) || !Arrays.equals(this.A05, d9i.A05)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = this.A00;
        if (i != 0) {
            return i;
        }
        int i2 = 0;
        int A022 = (527 + AnonymousClass8BW.A02(this.A03)) * 31;
        String str = this.A04;
        if (str != null) {
            i2 = str.hashCode();
        }
        int A09 = BE8.A09(this.A02, BE8.A09(this.A01, (A022 + i2) * 31)) + Arrays.hashCode(this.A05);
        this.A00 = A09;
        return A09;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A02);
        parcel.writeByteArray(this.A05);
    }

    public D9I(Parcel parcel) {
        this.A03 = parcel.readString();
        this.A04 = parcel.readString();
        this.A01 = parcel.readLong();
        this.A02 = parcel.readLong();
        this.A05 = parcel.createByteArray();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("EMSG: scheme=");
        A10.append(this.A03);
        A10.append(", id=");
        A10.append(this.A02);
        A10.append(", durationMs=");
        A10.append(this.A01);
        A10.append(", value=");
        return AnonymousClass000.A0y(this.A04, A10);
    }

    public D9I(String str, String str2, byte[] bArr, long j, long j2) {
        this.A03 = str;
        this.A04 = str2;
        this.A01 = j;
        this.A02 = j2;
        this.A05 = bArr;
    }
}
