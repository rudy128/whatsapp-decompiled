package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Calendar;
import java.util.GregorianCalendar;

public final class ADU implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AD6(12);
    public C21349Aie A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final BDY A04;
    public final C21349Aie A05;
    public final C21349Aie A06;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ADU)) {
            return false;
        }
        ADU adu = (ADU) obj;
        return this.A06.equals(adu.A06) && this.A05.equals(adu.A05) && AnonymousClass026.A00(this.A00, adu.A00) && this.A01 == adu.A01 && this.A04.equals(adu.A04);
    }

    public int hashCode() {
        Object[] objArr = new Object[5];
        objArr[0] = this.A06;
        objArr[1] = this.A05;
        objArr[2] = this.A00;
        C17890vO.A1G(objArr, this.A01);
        return AnonymousClass000.A0P(this.A04, objArr, 4);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A06, 0);
        parcel.writeParcelable(this.A05, 0);
        parcel.writeParcelable(this.A00, 0);
        parcel.writeParcelable(this.A04, 0);
        parcel.writeInt(this.A01);
    }

    public ADU(BDY bdy, C21349Aie aie, C21349Aie aie2, C21349Aie aie3, int i) {
        if (aie == null) {
            throw AnonymousClass000.A0s("start cannot be null");
        } else if (aie2 == null) {
            throw AnonymousClass000.A0s("end cannot be null");
        } else if (bdy != null) {
            this.A06 = aie;
            this.A05 = aie2;
            this.A00 = aie3;
            this.A01 = i;
            this.A04 = bdy;
            if (aie3 != null) {
                Calendar calendar = aie.A06;
                Calendar calendar2 = aie3.A06;
                if (calendar.compareTo(calendar2) > 0) {
                    throw AnonymousClass000.A0k("start Month cannot be after current Month");
                } else if (calendar2.compareTo(aie2.A06) > 0) {
                    throw AnonymousClass000.A0k("current Month cannot be after end Month");
                }
            }
            if (i < 0 || i > A8Y.A07((Calendar) null).getMaximum(7)) {
                throw AnonymousClass000.A0k("firstDayOfWeek is not valid");
            } else if (aie.A06 instanceof GregorianCalendar) {
                int i2 = aie2.A04 - aie.A04;
                this.A02 = (i2 * 12) + (aie2.A03 - aie.A03) + 1;
                this.A03 = i2 + 1;
            } else {
                throw AnonymousClass000.A0k("Only Gregorian calendars are supported.");
            }
        } else {
            throw AnonymousClass000.A0s("validator cannot be null");
        }
    }
}
