package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: X.8D3  reason: invalid class name */
public final class AnonymousClass8D3 extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new Object();
    public final long A00;
    public final long A01;
    public final boolean A02;
    public final Parcelable A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8D3(Parcelable parcelable, long j, long j2, boolean z) {
        super(parcelable);
        C18070vi.A0d(parcelable, 1);
        this.A03 = parcelable;
        this.A01 = j;
        this.A00 = j2;
        this.A02 = z;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeParcelable(this.A03, i);
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
        parcel.writeInt(this.A02 ? 1 : 0);
    }
}
