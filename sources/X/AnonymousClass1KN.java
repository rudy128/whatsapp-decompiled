package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.math.RoundingMode;

/* renamed from: X.1KN  reason: invalid class name */
public final class AnonymousClass1KN implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public BigDecimal A00;
    public final int A01;

    public AnonymousClass1KN(BigDecimal bigDecimal, int i) {
        C18070vi.A0d(bigDecimal, 1);
        this.A00 = bigDecimal;
        this.A01 = i;
        BigDecimal scale = bigDecimal.setScale(i, RoundingMode.HALF_EVEN);
        C18070vi.A0X(scale);
        this.A00 = scale;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || (obj != null && C18070vi.A18(getClass(), obj.getClass()) && this.A00.compareTo(((AnonymousClass1KN) obj).A00) == 0);
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeSerializable(this.A00);
        parcel.writeInt(this.A01);
    }

    public final boolean A00() {
        if (this.A00.compareTo(BigDecimal.ZERO) >= 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return 31 + this.A00.hashCode();
    }

    public String toString() {
        String obj = this.A00.toString();
        C18070vi.A0X(obj);
        return obj;
    }
}
