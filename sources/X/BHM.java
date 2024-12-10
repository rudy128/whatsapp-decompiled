package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

public class BHM extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new D36(10);
    public int A00;

    public String toString() {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        BEA.A1K(this, "MaterialCheckBox.SavedState{", A10);
        A10.append(" CheckedState=");
        int i = this.A00;
        if (i == 1) {
            str = "checked";
        } else if (i != 2) {
            str = "unchecked";
        } else {
            str = "indeterminate";
        }
        return BEA.A0n(str, A10);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(Integer.valueOf(this.A00));
    }
}
