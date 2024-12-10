package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: X.5e9  reason: invalid class name and case insensitive filesystem */
public final class C109865e9 extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new Object();
    public final float A00;
    public final int A01;
    public final Parcelable A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109865e9(Parcelable parcelable, float f, int i) {
        super(parcelable);
        C18070vi.A0d(parcelable, 1);
        this.A02 = parcelable;
        this.A01 = i;
        this.A00 = f;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeParcelable(this.A02, i);
        parcel.writeInt(this.A01);
        parcel.writeFloat(this.A00);
    }
}
