package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1x1  reason: invalid class name and case insensitive filesystem */
public final class C41761x1 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final String A06;
    public final boolean A07;

    public C41761x1(String str, int i, int i2, int i3, long j, long j2, long j3, boolean z) {
        C18070vi.A0d(str, 3);
        this.A02 = i;
        this.A03 = j;
        this.A06 = str;
        this.A04 = j2;
        this.A01 = i2;
        this.A05 = j3;
        this.A07 = z;
        this.A00 = i3;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C41761x1) {
                C41761x1 r8 = (C41761x1) obj;
                if (!(this.A02 == r8.A02 && this.A03 == r8.A03 && C18070vi.A18(this.A06, r8.A06) && this.A04 == r8.A04 && this.A01 == r8.A01 && this.A05 == r8.A05 && this.A07 == r8.A07 && this.A00 == r8.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LabelInfo(type=");
        sb.append(this.A02);
        sb.append(", labelId=");
        sb.append(this.A03);
        sb.append(", labelName=");
        sb.append(this.A06);
        sb.append(", predefinedId=");
        sb.append(this.A04);
        sb.append(", labelColorId=");
        sb.append(this.A01);
        sb.append(", sortId=");
        sb.append(this.A05);
        sb.append(", hidden=");
        sb.append(this.A07);
        sb.append(", count=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeInt(this.A02);
        parcel.writeLong(this.A03);
        parcel.writeString(this.A06);
        parcel.writeLong(this.A04);
        parcel.writeInt(this.A01);
        parcel.writeLong(this.A05);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeInt(this.A00);
    }

    public int hashCode() {
        long j = this.A03;
        long j2 = this.A04;
        long j3 = this.A05;
        int hashCode = ((((((((((this.A02 * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.A06.hashCode()) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.A01) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        int i = 1237;
        if (this.A07) {
            i = 1231;
        }
        return ((hashCode + i) * 31) + this.A00;
    }
}
