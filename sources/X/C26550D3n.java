package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.D3n  reason: case insensitive filesystem */
public class C26550D3n implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C26406Cz7(2);
    public final Bundle A00;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.A00);
    }

    public C26550D3n(Parcel parcel, ClassLoader classLoader) {
        Bundle readBundle = parcel.readBundle();
        this.A00 = readBundle;
        if (classLoader != null && readBundle != null) {
            readBundle.setClassLoader(classLoader);
        }
    }

    public C26550D3n(Bundle bundle) {
        this.A00 = bundle;
    }
}
