package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1Xj  reason: invalid class name and case insensitive filesystem */
public abstract class C27741Xj implements Parcelable {
    public static final C27741Xj A01 = new C451327f();
    public static final Parcelable.Creator CREATOR = new C26406Cz7(1);
    public final Parcelable A00;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
    }

    public C27741Xj(Parcelable parcelable) {
        if (parcelable != null) {
            this.A00 = parcelable == A01 ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public final Parcelable A00() {
        return this.A00;
    }

    public C27741Xj(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.A00 = readParcelable == null ? A01 : readParcelable;
    }

    public C27741Xj() {
        this.A00 = null;
    }
}
