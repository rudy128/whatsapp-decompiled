package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

public class BHN extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new C26406Cz7(5);
    public int A00;
    public int A01;
    public Parcelable A02;

    public BHN(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        BEA.A16(parcel, this, classLoader);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A02, i);
    }
}
