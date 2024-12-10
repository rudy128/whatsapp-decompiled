package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseIntArray;
import android.view.View;

/* renamed from: X.273  reason: invalid class name */
public final class AnonymousClass273 extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final SparseIntArray A05;
    public final Parcelable A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass273(Parcelable parcelable, SparseIntArray sparseIntArray, int i, int i2, int i3, int i4, int i5) {
        super(parcelable);
        C18070vi.A0d(parcelable, 1);
        C18070vi.A0d(sparseIntArray, 7);
        this.A06 = parcelable;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = i3;
        this.A02 = i4;
        this.A04 = i5;
        this.A05 = sparseIntArray;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeParcelable(this.A06, i);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A04);
        SparseIntArray sparseIntArray = this.A05;
        int size = sparseIntArray.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 != size; i2++) {
            parcel.writeInt(sparseIntArray.keyAt(i2));
            parcel.writeInt(sparseIntArray.valueAt(i2));
        }
    }
}
