package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.BcY  reason: case insensitive filesystem */
public final class C23178BcY extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final String A01;
    public final ArrayList A02;

    public final void writeToParcel(Parcel parcel, int i) {
        int A012 = C26293Cx2.A01(parcel, this.A00);
        C26293Cx2.A0C(parcel, this.A02, 3, DJ0.A0L(parcel, this.A01));
        C26293Cx2.A05(parcel, A012);
    }

    public C23178BcY(ArrayList arrayList, int i, String str) {
        this.A00 = i;
        this.A01 = str;
        this.A02 = arrayList;
    }

    public C23178BcY(String str, Map map) {
        ArrayList A13;
        this.A00 = 1;
        this.A01 = str;
        if (map == null) {
            A13 = null;
        } else {
            A13 = AnonymousClass000.A13();
            Iterator A0x = AnonymousClass8BU.A0x(map);
            while (A0x.hasNext()) {
                String A0v = C17880vN.A0v(A0x);
                A13.add(new C23179BcZ((C23196Bcq) map.get(A0v), A0v));
            }
        }
        this.A02 = A13;
    }
}
