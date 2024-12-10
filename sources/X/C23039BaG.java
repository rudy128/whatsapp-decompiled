package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: X.BaG  reason: case insensitive filesystem */
public class C23039BaG extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public List A00;
    public final int A01;

    public C23039BaG(int i, List list) {
        this.A01 = i;
        this.A00 = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A06(parcel, 1, this.A01);
        C26293Cx2.A0C(parcel, this.A00, 2, false);
        C26293Cx2.A05(parcel, A002);
    }
}
