package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.UUID;

/* renamed from: X.D3b  reason: case insensitive filesystem */
public final class C26540D3b implements Parcelable {
    public static final Parcelable.Creator CREATOR = new D36(4);
    public int A00;
    public final String A01;
    public final String A02;
    public final UUID A03;
    public final byte[] A04;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C26540D3b)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C26540D3b d3b = (C26540D3b) obj;
        if (!C25458CgB.A00(this.A01, d3b.A01) || !C25458CgB.A00(this.A02, d3b.A02) || !C25458CgB.A00(this.A03, d3b.A03) || !Arrays.equals(this.A04, d3b.A04)) {
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

    public C26540D3b(Parcel parcel) {
        this.A03 = new UUID(parcel.readLong(), parcel.readLong());
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        this.A04 = parcel.createByteArray();
    }
}
