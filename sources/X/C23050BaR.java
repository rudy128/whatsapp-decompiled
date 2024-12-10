package X;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.BaR  reason: case insensitive filesystem */
public final class C23050BaR extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final PointF[] A01;

    public C23050BaR(PointF[] pointFArr, int i) {
        this.A01 = pointFArr;
        this.A00 = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A0F(parcel, this.A01, 2, i);
        C26293Cx2.A06(parcel, 3, this.A00);
        C26293Cx2.A05(parcel, A002);
    }
}
