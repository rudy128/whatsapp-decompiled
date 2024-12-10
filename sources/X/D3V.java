package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public class D3V implements Parcelable {
    public static final Parcelable.Creator CREATOR = D3B.A00(6);
    public int A00;
    public int A01;
    public boolean A02;
    public int[] A03;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int length;
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A02 ? 1 : 0);
        int[] iArr = this.A03;
        if (iArr == null || (length = iArr.length) <= 0) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(length);
        parcel.writeIntArray(this.A03);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("FullSpanItem{mPosition=");
        A10.append(this.A01);
        A10.append(", mGapDir=");
        A10.append(this.A00);
        A10.append(", mHasUnwantedGapAfter=");
        A10.append(this.A02);
        A10.append(", mGapPerSpan=");
        A10.append(Arrays.toString(this.A03));
        return C17890vO.A0b(A10);
    }
}
