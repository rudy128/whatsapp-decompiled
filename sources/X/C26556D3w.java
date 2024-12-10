package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.android.exoplayer2.util.Util;
import java.util.Arrays;
import java.util.UUID;

/* renamed from: X.D3w  reason: case insensitive filesystem */
public final class C26556D3w implements Parcelable {
    public static final Parcelable.Creator CREATOR = D3B.A00(12);
    public int A00;
    public final String A01;
    public final String A02;
    public final UUID A03;
    public final byte[] A04;

    public int describeContents() {
        return 0;
    }

    public C26556D3w(String str, UUID uuid, byte[] bArr) {
        this.A03 = uuid;
        this.A01 = str;
        this.A02 = "video/mp4";
        this.A04 = bArr;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C26556D3w)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C26556D3w d3w = (C26556D3w) obj;
        if (!Util.A0D(this.A01, d3w.A01) || !Util.A0D(this.A02, d3w.A02) || !Util.A0D(this.A03, d3w.A03) || !Arrays.equals(this.A04, d3w.A04)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = this.A00;
        if (i != 0) {
            return i;
        }
        int A022 = C17890vO.A02(this.A02, (AnonymousClass000.A0L(this.A03) + C17900vP.A00(this.A01)) * 31) + Arrays.hashCode(this.A04);
        this.A00 = A022;
        return A022;
    }

    public void writeToParcel(Parcel parcel, int i) {
        UUID uuid = this.A03;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeByteArray(this.A04);
    }

    public C26556D3w(Parcel parcel) {
        this.A03 = new UUID(parcel.readLong(), parcel.readLong());
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        this.A04 = parcel.createByteArray();
    }
}
