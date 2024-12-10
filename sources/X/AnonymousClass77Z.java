package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.77Z  reason: invalid class name */
public final class AnonymousClass77Z implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final String A04;

    public AnonymousClass77Z(int i, int i2, int i3, int i4) {
        this((String) null, i, i2, i3, i4);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass77Z) {
                AnonymousClass77Z r5 = (AnonymousClass77Z) obj;
                if (!(this.A01 == r5.A01 && this.A03 == r5.A03 && this.A02 == r5.A02 && this.A00 == r5.A00 && C18070vi.A18(this.A04, r5.A04))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A04);
    }

    public int hashCode() {
        return (((((((this.A01 * 31) + this.A03) * 31) + this.A02) * 31) + this.A00) * 31) + C17900vP.A00(this.A04);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SmartFilter(filterId=");
        A10.append(this.A01);
        A10.append(", filterViewIdRes=");
        A10.append(this.A03);
        A10.append(", filterNameStringRes=");
        A10.append(this.A02);
        A10.append(", filterDrawableRes=");
        A10.append(this.A00);
        A10.append(", filterName=");
        return C17900vP.A0B(this.A04, A10);
    }

    public AnonymousClass77Z(String str, int i, int i2, int i3, int i4) {
        this.A01 = i;
        this.A03 = i2;
        this.A02 = i3;
        this.A00 = i4;
        this.A04 = str;
    }
}
