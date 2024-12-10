package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.Czt  reason: case insensitive filesystem */
public final class C26454Czt implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.Bax] */
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        Bundle bundle = null;
        C23191Bcl[] bclArr = null;
        C23090Bb5 bb5 = null;
        int i = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                bundle = C26300CxD.A08(parcel, readInt);
            } else if (c == 2) {
                bclArr = (C23191Bcl[]) C26300CxD.A0R(parcel, C23191Bcl.CREATOR, readInt);
            } else if (c == 3) {
                i = C26300CxD.A03(parcel, readInt);
            } else if (c != 4) {
                C26300CxD.A0I(parcel, readInt);
            } else {
                bb5 = (C23090Bb5) C26300CxD.A0A(parcel, C23090Bb5.CREATOR, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        ? obj = new Object();
        obj.A01 = bundle;
        obj.A03 = bclArr;
        obj.A00 = i;
        obj.A02 = bb5;
        return obj;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23082Bax[i];
    }
}
