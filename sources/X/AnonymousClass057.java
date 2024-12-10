package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: X.057  reason: invalid class name */
public class AnonymousClass057 extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new AnonymousClass0R8(14);
    public boolean A00;

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.A00 ? (byte) 1 : 0);
    }
}
