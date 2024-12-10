package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.466  reason: invalid class name */
public final class AnonymousClass466 extends AD7 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;

    public AnonymousClass466() {
        this(0);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass466) && this.A00 == ((AnonymousClass466) obj).A00);
    }

    public int hashCode() {
        return this.A00;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeInt(this.A00);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Stars(value=");
        return AnonymousClass001.A1L(A10, this.A00);
    }

    public AnonymousClass466(int i) {
        this.A00 = Integer.valueOf(i);
        this.A00 = i;
    }
}
