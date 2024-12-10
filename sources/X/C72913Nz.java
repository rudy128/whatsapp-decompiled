package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: X.3Nz  reason: invalid class name and case insensitive filesystem */
public final class C72913Nz extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final int A01;
    public final boolean A02;
    public final Parcelable A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C72913Nz(Parcelable parcelable, int i, int i2, boolean z) {
        super(parcelable);
        C18070vi.A0d(parcelable, 1);
        this.A03 = parcelable;
        this.A02 = z;
        this.A00 = i;
        this.A01 = i2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeParcelable(this.A03, i);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }
}
