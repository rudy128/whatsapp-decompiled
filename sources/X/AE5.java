package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.util.Date;

public final class AE5 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final BigDecimal A00;
    public final Date A01;
    public final Date A02;
    public final A6S A03;

    public AE5(A6S a6s, BigDecimal bigDecimal, Date date, Date date2) {
        C18070vi.A0d(bigDecimal, 1);
        this.A00 = bigDecimal;
        this.A03 = a6s;
        this.A02 = date;
        this.A01 = date2;
    }

    public final boolean A00(Date date) {
        Date date2;
        C18070vi.A0d(date, 0);
        Date date3 = this.A02;
        if (date3 == null || (date2 = this.A01) == null || (date.after(date3) && date.before(date2))) {
            return true;
        }
        return false;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !C18070vi.A14(this, obj)) {
                return false;
            }
            AE5 ae5 = (AE5) obj;
            if (!C42171xk.A00(this.A00, ae5.A00) || !C42171xk.A00(this.A03, ae5.A03) || !C42171xk.A00(this.A02, ae5.A02) || !C42171xk.A00(this.A01, ae5.A01)) {
                return false;
            }
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeSerializable(this.A00);
        String str = this.A03.A00;
        C18070vi.A0X(str);
        parcel.writeString(str);
        parcel.writeSerializable(this.A02);
        parcel.writeSerializable(this.A01);
    }

    public int hashCode() {
        int i = 0;
        int A0N = (AnonymousClass000.A0N(this.A03, AnonymousClass000.A0L(this.A00)) + AnonymousClass001.A0l(this.A02)) * 31;
        Date date = this.A01;
        if (date != null) {
            i = date.hashCode();
        }
        return A0N + i;
    }
}
