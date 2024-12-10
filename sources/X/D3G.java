package X;

import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;

public final class D3G implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public Messenger A00;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return this.A00.getBinder().equals(((D3G) obj).A00.getBinder());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        return this.A00.getBinder().hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.A00.getBinder());
    }
}
