package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: X.8D4  reason: invalid class name */
public class AnonymousClass8D4 extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new AD6(16);
    public final String A00;
    public final String A01;

    public AnonymousClass8D4(Parcelable parcelable, String str, String str2) {
        super(parcelable);
        this.A00 = str;
        this.A01 = str2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public AnonymousClass8D4(Parcel parcel) {
        super(parcel);
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }
}
