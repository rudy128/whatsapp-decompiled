package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class D14 implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r0v1, types: [X.Bbd, java.lang.Object] */
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        int i = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            i = C26300CxD.A06(parcel, (char) readInt, 1, readInt, i);
        }
        C26300CxD.A0H(parcel, A02);
        ? obj = new Object();
        obj.A00 = i;
        return obj;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23124Bbd[i];
    }
}
