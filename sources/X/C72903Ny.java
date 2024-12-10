package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: X.3Ny  reason: invalid class name and case insensitive filesystem */
public final class C72903Ny extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new Object();
    public final String A00;
    public final String A01;
    public final Parcelable A02;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }

    public C72903Ny(Parcelable parcelable, String str, String str2) {
        super(parcelable);
        this.A02 = parcelable;
        this.A01 = str;
        this.A00 = str2;
    }
}
