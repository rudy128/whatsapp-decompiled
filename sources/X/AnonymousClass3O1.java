package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: X.3O1  reason: invalid class name */
public final class AnonymousClass3O1 extends View.BaseSavedState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final Parcelable A01;

    public final void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeParcelable(this.A01, i);
        parcel.writeInt(this.A00);
    }

    public AnonymousClass3O1(Parcelable parcelable, int i) {
        super(parcelable);
        this.A01 = parcelable;
        this.A00 = i;
    }
}
