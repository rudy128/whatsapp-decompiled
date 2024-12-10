package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.BbK  reason: case insensitive filesystem */
public final class C23105BbK extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final String A01;
    public final HashMap A02;

    public C23105BbK(ArrayList arrayList, int i, String str) {
        this.A00 = i;
        HashMap A11 = C17880vN.A11();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C23178BcY bcY = (C23178BcY) arrayList.get(i2);
            String str2 = bcY.A01;
            HashMap A112 = C17880vN.A11();
            ArrayList arrayList2 = bcY.A02;
            C18210vx.A00(arrayList2);
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                C23179BcZ bcZ = (C23179BcZ) bcY.A02.get(i3);
                A112.put(bcZ.A02, bcZ.A01);
            }
            A11.put(str2, A112);
        }
        this.A02 = A11;
        C18210vx.A00(str);
        this.A01 = str;
        Iterator A0k = C17890vO.A0k(A11);
        while (A0k.hasNext()) {
            Map map = (Map) A11.get(A0k.next());
            Iterator A0x = AnonymousClass8BU.A0x(map);
            while (A0x.hasNext()) {
                ((C23196Bcq) map.get(A0x.next())).A00 = this;
            }
        }
    }

    public final String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        HashMap hashMap = this.A02;
        Iterator A0k = C17890vO.A0k(hashMap);
        while (A0k.hasNext()) {
            String A0v = C17880vN.A0v(A0k);
            A10.append(A0v);
            A10.append(":\n");
            Map map = (Map) hashMap.get(A0v);
            Iterator A0x = AnonymousClass8BU.A0x(map);
            while (A0x.hasNext()) {
                String A0v2 = C17880vN.A0v(A0x);
                A10.append("  ");
                BE7.A1N(A10, A0v2);
                A10.append(map.get(A0v2));
            }
        }
        return A10.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A06(parcel, 1, this.A00);
        ArrayList A13 = AnonymousClass000.A13();
        HashMap hashMap = this.A02;
        Iterator A0k = C17890vO.A0k(hashMap);
        while (A0k.hasNext()) {
            String A0v = C17880vN.A0v(A0k);
            A13.add(new C23178BcY(A0v, (Map) hashMap.get(A0v)));
        }
        C26293Cx2.A0C(parcel, A13, 2, false);
        C26293Cx2.A0A(parcel, this.A01, 3, false);
        C26293Cx2.A05(parcel, A002);
    }
}
