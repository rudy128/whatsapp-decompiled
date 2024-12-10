package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.AEl  reason: case insensitive filesystem */
public final class C20278AEl implements Parcelable {
    public static final C20278AEl A02 = new C20278AEl(new C20269AEc(-90.0d, -180.0d), new C20269AEc(90.0d, 180.0d));
    public static final Parcelable.Creator CREATOR = new AD6(8);
    public final C20269AEc A00;
    public final C20269AEc A01;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20278AEl)) {
            return false;
        }
        C20278AEl aEl = (C20278AEl) obj;
        return this.A00.equals(aEl.A00) && this.A01.equals(aEl.A01);
    }

    public C20269AEc A00() {
        double d;
        C20269AEc aEc = this.A01;
        double d2 = aEc.A00;
        C20269AEc aEc2 = this.A00;
        double d3 = (d2 + aEc2.A00) / 2.0d;
        double d4 = aEc.A01;
        double d5 = aEc2.A01;
        int i = (d4 > d5 ? 1 : (d4 == d5 ? 0 : -1));
        double d6 = d4 + d5;
        if (i <= 0) {
            d = d6 / 2.0d;
        } else {
            double d7 = 360.0d;
            double d8 = (d6 + 360.0d) / 2.0d;
            if (d8 <= 180.0d) {
                d7 = 0.0d;
            }
            d = d8 - d7;
        }
        return new C20269AEc(d3, d);
    }

    public C20278AEl A01(C20269AEc aEc) {
        C20269AEc aEc2 = aEc;
        if (A02(aEc2)) {
            return this;
        }
        C20269AEc aEc3 = this.A00;
        double d = aEc3.A00;
        C20269AEc aEc4 = this.A01;
        double d2 = aEc4.A00;
        double d3 = aEc3.A01;
        double d4 = aEc4.A01;
        double d5 = aEc2.A00;
        if (d5 > d) {
            d = d5;
        } else if (d5 < d2) {
            d2 = d5;
        }
        double d6 = d3 - d4;
        int i = 0;
        if (d6 < 0.0d) {
            i = 360;
        }
        double d7 = d6 + ((double) i);
        double d8 = aEc2.A01;
        double d9 = d8;
        double d10 = d8 - d4;
        int i2 = 0;
        if (d10 < 0.0d) {
            i2 = 360;
        }
        double d11 = d10 + ((double) i2);
        double d12 = d3 - d9;
        int i3 = 0;
        if (d12 < 0.0d) {
            i3 = 360;
        }
        double d13 = d12 + ((double) i3);
        if (Double.compare(d11, d7) > 0 || Double.compare(d13, d7) > 0) {
            if (d11 <= d13) {
                d3 = d9;
            } else {
                d4 = d9;
            }
        }
        if (d2 == d && d4 == d3) {
            double d14 = d3 + 2.0E-4d;
            if (d14 < 180.0d) {
                d3 = d14;
            }
            double d15 = d4 - 2.0E-4d;
            if (d15 > -180.0d) {
                d4 = d15;
            }
        }
        return new C20278AEl(new C20269AEc(d2, d4), new C20269AEc(d, d3));
    }

    public boolean A02(C20269AEc aEc) {
        double d = aEc.A00;
        C20269AEc aEc2 = this.A00;
        if (d > aEc2.A00) {
            return false;
        }
        C20269AEc aEc3 = this.A01;
        if (d < aEc3.A00) {
            return false;
        }
        double d2 = aEc3.A01;
        double d3 = aEc2.A01;
        int i = (d2 > d3 ? 1 : (d2 == d3 ? 0 : -1));
        double d4 = aEc.A01;
        int i2 = (d4 > d2 ? 1 : (d4 == d2 ? 0 : -1));
        if (i < 0) {
            if (i2 < 0) {
                return false;
            }
        } else if (i2 >= 0) {
            return true;
        }
        if (d4 <= d3) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, AnonymousClass000.A0N(this.A00, 527));
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
    }

    public C20278AEl(C20269AEc aEc, C20269AEc aEc2) {
        double d = aEc.A00;
        double d2 = aEc2.A00;
        if (d <= d2) {
            this.A01 = aEc;
            this.A00 = aEc2;
            return;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Southern latitude (");
        A10.append(d);
        A10.append(") exceeds Northern latitude (");
        A10.append(d2);
        throw AnonymousClass001.A12(").", A10);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        C17900vP.A0a(this, A10);
        A10.append("{northeast=");
        A10.append(this.A00);
        A10.append(", southwest=");
        return AnonymousClass8BX.A0d(this.A01, A10);
    }

    public C20278AEl(Parcel parcel) {
        Class<C20269AEc> cls = C20269AEc.class;
        this.A00 = (C20269AEc) AnonymousClass3Ma.A08(parcel, cls);
        this.A01 = (C20269AEc) AnonymousClass3Ma.A08(parcel, cls);
    }
}
