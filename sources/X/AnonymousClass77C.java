package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.77C  reason: invalid class name */
public final class AnonymousClass77C implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final int A01;
    public final int A02;
    public final String A03;

    public AnonymousClass77C(int i, int i2, String str, int i3) {
        C18070vi.A0d(str, 1);
        this.A03 = str;
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass77C) {
                AnonymousClass77C r5 = (AnonymousClass77C) obj;
                if (!(C18070vi.A18(this.A03, r5.A03) && this.A02 == r5.A02 && this.A00 == r5.A00 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }

    public int hashCode() {
        return ((((C17880vN.A03(this.A03) + this.A02) * 31) + this.A00) * 31) + this.A01;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(C17890vO.A0U(this));
        A10.append("{url='");
        A10.append(this.A03);
        A10.append("', width='");
        A10.append(this.A02);
        A10.append("', height='");
        A10.append(this.A00);
        return AnonymousClass000.A0y("'}", A10);
    }
}
