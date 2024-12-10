package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4cJ  reason: invalid class name and case insensitive filesystem */
public final class C89344cJ implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final int A01;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C89344cJ) {
                C89344cJ r5 = (C89344cJ) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.A01 * 31) + this.A00;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
    }

    public C89344cJ(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BackwardCompatibilityEvent(reason=");
        A10.append(this.A01);
        A10.append(", feature=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
