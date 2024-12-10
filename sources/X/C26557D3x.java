package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: X.D3x  reason: case insensitive filesystem */
public final class C26557D3x implements Parcelable {
    public static final C26557D3x A05 = new C26557D3x((TreeMap) null, (TreeMap) null);
    public static final Parcelable.Creator CREATOR = D3B.A00(34);
    public final TreeMap A00;
    public final TreeMap A01;
    public final TreeMap A02;
    public final TreeMap A03;
    public final TreeMap A04;

    public C26557D3x(TreeMap treeMap, TreeMap treeMap2) {
        this.A04 = treeMap;
        this.A03 = treeMap2;
        this.A00 = null;
        this.A01 = null;
        this.A02 = null;
    }

    public int describeContents() {
        return 0;
    }

    public int A00(String str, int i) {
        Number A1D;
        TreeMap treeMap = this.A04;
        if (treeMap == null || (A1D = C108945cZ.A1D(str, treeMap)) == null) {
            return i;
        }
        return A1D.intValue();
    }

    public boolean A01(String str, boolean z) {
        Boolean bool;
        TreeMap treeMap = this.A03;
        if (treeMap == null || (bool = (Boolean) treeMap.get(str)) == null) {
            return z;
        }
        return bool.booleanValue();
    }

    public void writeToParcel(Parcel parcel, int i) {
        TreeMap treeMap = this.A04;
        TreeMap treeMap2 = this.A03;
        TreeMap treeMap3 = this.A00;
        TreeMap treeMap4 = this.A01;
        TreeMap treeMap5 = this.A02;
        Bundle A0D = C17880vN.A0D();
        if (treeMap != null) {
            Iterator A0i = C17890vO.A0i(treeMap);
            while (A0i.hasNext()) {
                Map.Entry A16 = AnonymousClass000.A16(A0i);
                A0D.putInt(C17880vN.A0x(A16), BE9.A0J(A16));
            }
        }
        parcel.writeBundle(A0D);
        Bundle A0D2 = C17880vN.A0D();
        if (treeMap2 != null) {
            Iterator A0i2 = C17890vO.A0i(treeMap2);
            while (A0i2.hasNext()) {
                Map.Entry A162 = AnonymousClass000.A16(A0i2);
                A0D2.putBoolean(C17880vN.A0x(A162), AnonymousClass000.A1Y(A162.getValue()));
            }
        }
        parcel.writeBundle(A0D2);
        Bundle A0D3 = C17880vN.A0D();
        if (treeMap3 != null) {
            Iterator A0i3 = C17890vO.A0i(treeMap3);
            while (A0i3.hasNext()) {
                Map.Entry A163 = AnonymousClass000.A16(A0i3);
                A0D3.putIntArray(C17880vN.A0x(A163), (int[]) A163.getValue());
            }
        }
        parcel.writeBundle(A0D3);
        Bundle A0D4 = C17880vN.A0D();
        if (treeMap4 != null) {
            Iterator A0i4 = C17890vO.A0i(treeMap4);
            while (A0i4.hasNext()) {
                Map.Entry A164 = AnonymousClass000.A16(A0i4);
                A0D4.putStringArrayList(C17880vN.A0x(A164), (ArrayList) A164.getValue());
            }
        }
        parcel.writeBundle(A0D4);
        Bundle A0D5 = C17880vN.A0D();
        if (treeMap5 != null) {
            Iterator A0i5 = C17890vO.A0i(treeMap5);
            while (A0i5.hasNext()) {
                Map.Entry A165 = AnonymousClass000.A16(A0i5);
                A0D5.putCharArray(C17880vN.A0x(A165), AnonymousClass8BR.A10(A165).toCharArray());
            }
        }
        parcel.writeBundle(A0D5);
    }

    public C26557D3x(Parcel parcel) {
        Class<?> cls = getClass();
        Bundle A0K = BE8.A0K(parcel, cls);
        Set<String> keySet = A0K.keySet();
        if (!keySet.isEmpty()) {
            this.A04 = new TreeMap();
            Iterator<String> it = keySet.iterator();
            while (it.hasNext()) {
                String A0v = C17880vN.A0v(it);
                C17890vO.A0z(A0v, this.A04, A0K.getInt(A0v));
            }
        } else {
            this.A04 = null;
        }
        Bundle A0K2 = BE8.A0K(parcel, cls);
        Set<String> keySet2 = A0K2.keySet();
        if (!keySet2.isEmpty()) {
            this.A03 = new TreeMap();
            Iterator<String> it2 = keySet2.iterator();
            while (it2.hasNext()) {
                String A0v2 = C17880vN.A0v(it2);
                this.A03.put(A0v2, Boolean.valueOf(A0K2.getBoolean(A0v2)));
            }
        } else {
            this.A03 = null;
        }
        Bundle A0K3 = BE8.A0K(parcel, cls);
        Set<String> keySet3 = A0K3.keySet();
        if (!keySet3.isEmpty()) {
            this.A00 = new TreeMap();
            Iterator<String> it3 = keySet3.iterator();
            while (it3.hasNext()) {
                String A0v3 = C17880vN.A0v(it3);
                this.A00.put(A0v3, A0K3.getIntArray(A0v3));
            }
        } else {
            this.A00 = null;
        }
        Bundle A0K4 = BE8.A0K(parcel, cls);
        Set<String> keySet4 = A0K4.keySet();
        if (!keySet4.isEmpty()) {
            this.A01 = new TreeMap();
            Iterator<String> it4 = keySet4.iterator();
            while (it4.hasNext()) {
                String A0v4 = C17880vN.A0v(it4);
                this.A01.put(A0v4, A0K4.getStringArrayList(A0v4));
            }
        } else {
            this.A01 = null;
        }
        Bundle A0K5 = BE8.A0K(parcel, cls);
        Set<String> keySet5 = A0K5.keySet();
        if (!keySet5.isEmpty()) {
            this.A02 = new TreeMap();
            Iterator<String> it5 = keySet5.iterator();
            while (it5.hasNext()) {
                String A0v5 = C17880vN.A0v(it5);
                this.A02.put(A0v5, new String(A0K5.getCharArray(A0v5)));
            }
            return;
        }
        this.A02 = null;
    }
}
