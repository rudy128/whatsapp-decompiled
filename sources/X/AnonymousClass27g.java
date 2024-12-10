package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.27g  reason: invalid class name */
public class AnonymousClass27g extends C27741Xj {
    public static final Parcelable.Creator CREATOR = new C26406Cz7(4);
    public int A00;
    public Parcelable A01;
    public ClassLoader A02;

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("FragmentPager.SavedState{");
        A10.append(Integer.toHexString(System.identityHashCode(this)));
        A10.append(" position=");
        A10.append(this.A00);
        return AnonymousClass000.A0y("}", A10);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A01, i);
    }
}
