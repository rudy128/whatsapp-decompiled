package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.ADw  reason: case insensitive filesystem */
public final class C20264ADw implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final ARR A01;
    public final ARR A02;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C20264ADw) {
                C20264ADw aDw = (C20264ADw) obj;
                if (this.A00 != aDw.A00 || !C18070vi.A18(this.A01, aDw.A01) || !C18070vi.A18(this.A02, aDw.A02)) {
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
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A02, i);
    }

    public int hashCode() {
        return (((this.A00 * 31) + AnonymousClass001.A0k(this.A01)) * 31) + C17880vN.A02(this.A02);
    }

    public C20264ADw(ARR arr, ARR arr2, int i) {
        this.A00 = i;
        this.A01 = arr;
        this.A02 = arr2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Installment(count=");
        A10.append(this.A00);
        A10.append(", dueAmount=");
        A10.append(this.A01);
        A10.append(", interest=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}
