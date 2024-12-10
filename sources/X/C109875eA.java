package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: X.5eA  reason: invalid class name and case insensitive filesystem */
public final class C109875eA extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new Object();
    public final float A00;
    public final String A01;
    public final String A02;
    public final boolean A03;
    public final Parcelable A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109875eA(Parcelable parcelable, String str, String str2, float f, boolean z) {
        super(parcelable);
        C18070vi.A0d(parcelable, 1);
        this.A04 = parcelable;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = z;
        this.A00 = f;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeParcelable(this.A04, i);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeFloat(this.A00);
    }
}
