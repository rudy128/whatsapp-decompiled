package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

public class BHI extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new D36(14);
    public int A00;

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A00);
    }
}
