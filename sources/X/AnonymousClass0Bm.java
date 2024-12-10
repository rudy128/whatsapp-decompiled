package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0Bm  reason: invalid class name */
public class AnonymousClass0Bm extends C27741Xj {
    public static final Parcelable.Creator CREATOR = new AnonymousClass0R5(0);
    public boolean A00;

    public AnonymousClass0Bm(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.A00 = AnonymousClass000.A1Y(parcel.readValue((ClassLoader) null));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SearchView.SavedState{");
        A10.append(Integer.toHexString(System.identityHashCode(this)));
        A10.append(" isIconified=");
        A10.append(this.A00);
        return AnonymousClass000.A0y("}", A10);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(Boolean.valueOf(this.A00));
    }

    public AnonymousClass0Bm(Parcelable parcelable) {
        super(parcelable);
    }
}
