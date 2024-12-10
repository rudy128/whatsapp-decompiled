package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

public class BHL extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = D3B.A00(0);
    public int A00;

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        BEA.A1K(this, "HorizontalScrollView.SavedState{", A10);
        A10.append(" scrollPosition=");
        A10.append(this.A00);
        return AnonymousClass000.A0y("}", A10);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A00);
    }
}
