package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.Cz9  reason: case insensitive filesystem */
public final class C26408Cz9 implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String A0y = C72453Mb.A0y(parcel);
        float[] createFloatArray = parcel.createFloatArray();
        float[] createFloatArray2 = parcel.createFloatArray();
        boolean A1R = C72473Md.A1R(parcel);
        return new D3R((C26558D3y) C26558D3y.CREATOR.createFromParcel(parcel), (D4C) AnonymousClass3Ma.A08(parcel, D3R.class), A0y, createFloatArray, createFloatArray2, A1R);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new D3R[i];
    }
}
