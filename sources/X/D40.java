package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class D40 implements Parcelable {
    public static final D40 A0D = new D40((String) null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, false);
    public static final Parcelable.Creator CREATOR = D3B.A00(40);
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final long A09;
    public final String A0A;
    public final boolean A0B;
    public final boolean A0C;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof D40)) {
            return false;
        }
        D40 d40 = (D40) obj;
        return d40.A03 == this.A03 && d40.A00 == this.A00 && d40.A07 == this.A07 && d40.A06 == this.A06 && d40.A08 == this.A08 && d40.A02 == this.A02 && d40.A09 == this.A09 && d40.A01 == this.A01 && d40.A0B == this.A0B && d40.A04 == this.A04 && d40.A05 == this.A05 && d40.A0C == this.A0C;
    }

    public int hashCode() {
        int A0K = AnonymousClass001.A0K(this.A01, AnonymousClass001.A0K(this.A09, AnonymousClass001.A0K(this.A02, AnonymousClass001.A0K(this.A08, AnonymousClass001.A0K(this.A06, AnonymousClass001.A0K(this.A07, AnonymousClass001.A0K((long) this.A00, AnonymousClass8BV.A00(this.A03))))))));
        long j = 1;
        int A0K2 = AnonymousClass001.A0K(this.A05, AnonymousClass001.A0K(this.A04, AnonymousClass001.A0K(AnonymousClass8BX.A06(this.A0B ? 1 : 0), A0K)));
        if (!this.A0C) {
            j = 0;
        }
        return AnonymousClass001.A0J(j, A0K2);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A03);
        parcel.writeInt(this.A00);
        parcel.writeLong(this.A07);
        parcel.writeLong(this.A06);
        parcel.writeLong(this.A08);
        parcel.writeLong(this.A02);
        parcel.writeLong(this.A09);
        parcel.writeLong(this.A01);
        parcel.writeInt(this.A0B ? 1 : 0);
        parcel.writeLong(this.A04);
        parcel.writeLong(this.A05);
        parcel.writeInt(this.A0C ? 1 : 0);
        parcel.writeString(this.A0A);
    }

    public D40(Parcel parcel) {
        this.A03 = parcel.readLong();
        this.A00 = parcel.readInt();
        this.A07 = parcel.readLong();
        this.A06 = parcel.readLong();
        this.A08 = parcel.readLong();
        this.A02 = parcel.readLong();
        this.A09 = parcel.readLong();
        this.A01 = parcel.readLong();
        boolean z = false;
        this.A0B = AnonymousClass000.A1T(parcel.readInt(), 1);
        this.A04 = parcel.readLong();
        this.A05 = parcel.readLong();
        this.A0C = parcel.readInt() == 1 ? true : z;
        this.A0A = parcel.readString();
    }

    public D40(String str, int i, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, boolean z, boolean z2) {
        this.A03 = j;
        this.A00 = i;
        this.A07 = j2;
        this.A06 = j3;
        this.A08 = j4;
        this.A02 = j5;
        this.A09 = j6;
        this.A01 = j7;
        this.A0B = z;
        this.A04 = j8;
        this.A05 = j9;
        this.A0C = z2;
        this.A0A = str;
    }
}
