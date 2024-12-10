package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

public class BL1 extends C27741Xj {
    public static final Parcelable.Creator CREATOR = new C26406Cz7(14);
    public CharSequence A00;
    public boolean A01;

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        BEA.A1K(this, "TextInputLayout.SavedState{", A10);
        A10.append(" error=");
        return AnonymousClass8BX.A0d(this.A00, A10);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        TextUtils.writeToParcel(this.A00, parcel, i);
        parcel.writeInt(this.A01 ? 1 : 0);
    }
}
