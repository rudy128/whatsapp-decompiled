package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: X.3O0  reason: invalid class name */
public final class AnonymousClass3O0 extends View.BaseSavedState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final Parcelable A00;

    public final void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeParcelable(this.A00, i);
    }

    public AnonymousClass3O0(Parcelable parcelable) {
        super(parcelable);
        this.A00 = parcelable;
    }
}
