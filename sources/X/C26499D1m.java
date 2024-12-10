package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.D1m  reason: case insensitive filesystem */
public final class C26499D1m implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r0v1, types: [X.Bbn, java.lang.Object] */
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        int i = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                j = C26300CxD.A07(parcel, readInt);
            } else if (c == 2) {
                i = C26300CxD.A03(parcel, readInt);
            } else if (c == 3) {
                j2 = C26300CxD.A07(parcel, readInt);
            } else if (c != 4) {
                C26300CxD.A0I(parcel, readInt);
            } else {
                j3 = C26300CxD.A07(parcel, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        ? obj = new Object();
        obj.A01 = j;
        obj.A00 = i;
        obj.A02 = j2;
        obj.A03 = j3;
        return obj;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23134Bbn[i];
    }
}
