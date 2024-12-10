package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

public final class BHO extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new Object();
    public final float A00;
    public final float A01;
    public final Parcelable A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BHO(Parcelable parcelable, float f, float f2) {
        super(parcelable);
        C18070vi.A0d(parcelable, 1);
        this.A02 = parcelable;
        this.A01 = f;
        this.A00 = f2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BHO) {
                BHO bho = (BHO) obj;
                if (!(C18070vi.A18(this.A02, bho.A02) && Float.compare(this.A01, bho.A01) == 0 && Float.compare(this.A00, bho.A00) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeParcelable(this.A02, i);
        parcel.writeFloat(this.A01);
        parcel.writeFloat(this.A00);
    }

    public int hashCode() {
        return AnonymousClass000.A0C(AnonymousClass000.A0B(AnonymousClass000.A0L(this.A02), this.A01), this.A00);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WaRangeSeekBarSavedState(state=");
        A10.append(this.A02);
        A10.append(", rangeStart=");
        A10.append(this.A01);
        A10.append(", rangeEnd=");
        return AnonymousClass001.A1K(A10, this.A00);
    }
}
