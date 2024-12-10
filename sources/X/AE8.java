package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class AE8 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final int A01;
    public final Integer A02;
    public final Integer A03;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AE8) {
                AE8 ae8 = (AE8) obj;
                if (this.A00 != ae8.A00 || this.A01 != ae8.A01 || !C18070vi.A18(this.A03, ae8.A03) || !C18070vi.A18(this.A02, ae8.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        C108995ce.A0r(parcel, this.A03);
        C108995ce.A0r(parcel, this.A02);
    }

    public int hashCode() {
        return (((((this.A00 * 31) + this.A01) * 31) + AnonymousClass001.A0k(this.A03)) * 31) + C17880vN.A02(this.A02);
    }

    public AE8(Integer num, Integer num2, int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
        this.A03 = num;
        this.A02 = num2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BusinessHoursDayConfig(dayOfWeek=");
        A10.append(this.A00);
        A10.append(", mode=");
        A10.append(this.A01);
        A10.append(", openTime=");
        A10.append(this.A03);
        A10.append(", closeTime=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}
