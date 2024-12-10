package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;

/* renamed from: X.Aie  reason: case insensitive filesystem */
public final class C21349Aie implements Comparable, Parcelable {
    public static final Parcelable.Creator CREATOR = new AD6(13);
    public String A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final long A05;
    public final Calendar A06;

    public static C21349Aie A00(int i, int i2) {
        Calendar A07 = A8Y.A07((Calendar) null);
        A07.set(1, i);
        A07.set(2, i2);
        return new C21349Aie(A07);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21349Aie)) {
            return false;
        }
        C21349Aie aie = (C21349Aie) obj;
        return this.A03 == aie.A03 && this.A04 == aie.A04;
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.A06.compareTo(((C21349Aie) obj).A06);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A03);
    }

    public C21349Aie(Calendar calendar) {
        calendar.set(5, 1);
        Calendar A062 = A8Y.A06(calendar);
        this.A06 = A062;
        this.A03 = A062.get(2);
        this.A04 = A062.get(1);
        this.A02 = A062.getMaximum(7);
        this.A01 = A062.getActualMaximum(5);
        this.A05 = A062.getTimeInMillis();
    }

    public int hashCode() {
        Object[] A1b = AnonymousClass3MW.A1b();
        AnonymousClass000.A1L(A1b, this.A03);
        AnonymousClass000.A1M(A1b, this.A04);
        return Arrays.hashCode(A1b);
    }
}
