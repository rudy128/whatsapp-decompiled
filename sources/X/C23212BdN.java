package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.BdN  reason: case insensitive filesystem */
public final class C23212BdN extends DJ0 implements C28449E1p {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final SparseArray A01;
    public final HashMap A02;

    public final void writeToParcel(Parcel parcel, int i) {
        int A012 = C26293Cx2.A01(parcel, this.A00);
        ArrayList A13 = AnonymousClass000.A13();
        HashMap hashMap = this.A02;
        Iterator A0k = C17890vO.A0k(hashMap);
        while (A0k.hasNext()) {
            String A0v = C17880vN.A0v(A0k);
            A13.add(new C23177BcX(A0v, BE9.A0D(A0v, hashMap)));
        }
        C26293Cx2.A0C(parcel, A13, 2, false);
        C26293Cx2.A05(parcel, A012);
    }

    public C23212BdN(ArrayList arrayList, int i) {
        this.A00 = i;
        this.A02 = C17880vN.A11();
        this.A01 = BE6.A0Q();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C23177BcX bcX = (C23177BcX) arrayList.get(i2);
            String str = bcX.A02;
            int i3 = bcX.A01;
            this.A02.put(str, Integer.valueOf(i3));
            this.A01.put(i3, str);
        }
    }

    public C23212BdN() {
        this.A00 = 1;
        this.A02 = C17880vN.A11();
        this.A01 = BE6.A0Q();
    }
}
