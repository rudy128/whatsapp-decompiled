package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0RK  reason: invalid class name */
public final class AnonymousClass0RK implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass0R8(15);
    public final int A00;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass0RK) && this.A00 == ((AnonymousClass0RK) obj).A00);
    }

    public int hashCode() {
        return this.A00;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
    }

    public AnonymousClass0RK(int i) {
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("DefaultLazyKey(index=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
