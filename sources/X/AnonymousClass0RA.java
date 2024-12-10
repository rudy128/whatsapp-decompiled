package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0RA  reason: invalid class name */
public class AnonymousClass0RA implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass0R8(10);
    public C17160uD A00;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            C17160uD r0 = this.A00;
            if (r0 == null) {
                r0 = new AnonymousClass04Y(this);
                this.A00 = r0;
            }
            parcel.writeStrongBinder(r0.asBinder());
        }
    }
}
