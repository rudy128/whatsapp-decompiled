package androidx.versionedparcelable;

import X.C22717BMe;
import X.D3B;
import X.E0M;
import android.os.Parcel;
import android.os.Parcelable;

public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator CREATOR = D3B.A00(8);
    public final E0M A00;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        new C22717BMe(parcel).A08(this.A00);
    }

    public ParcelImpl(Parcel parcel) {
        this.A00 = new C22717BMe(parcel).A04();
    }
}
