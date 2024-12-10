package X;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1pP  reason: invalid class name and case insensitive filesystem */
public final class C37361pP {
    public static final Class[] A05 = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};
    public final AnonymousClass1GI A00;
    public final Map A01;
    public final Map A02;
    public final Map A03;
    public final Map A04;

    public final void A03(String str) {
        C18070vi.A0d(str, 0);
        this.A03.remove(str);
        AnonymousClass27x r1 = (AnonymousClass27x) this.A02.remove(str);
        if (r1 != null) {
            r1.A00 = null;
        }
        this.A01.remove(str);
    }

    public final void A04(String str, Object obj) {
        AnonymousClass1DS r1;
        C18070vi.A0d(str, 0);
        if (obj != null) {
            Class[] clsArr = A05;
            int i = 0;
            do {
                Class cls = clsArr[i];
                C18070vi.A0b(cls);
                if (!cls.isInstance(obj)) {
                    i++;
                }
            } while (i < 29);
            StringBuilder sb = new StringBuilder();
            sb.append("Can't put value with type ");
            sb.append(obj.getClass());
            sb.append(" into saved state");
            throw new IllegalArgumentException(sb.toString());
        }
        Object obj2 = this.A02.get(str);
        if (!(obj2 instanceof AnonymousClass1DT) || (r1 = (AnonymousClass1DS) obj2) == null) {
            this.A03.put(str, obj);
        } else {
            r1.A0F(obj);
        }
        AnonymousClass1G4 r0 = (AnonymousClass1G4) this.A01.get(str);
        if (r0 != null) {
            r0.setValue(obj);
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [X.27x, X.1DT, X.1DS, java.lang.Object] */
    public final AnonymousClass1DT A00(Object obj, String str) {
        AnonymousClass1DT r1;
        Map map = this.A02;
        Object obj2 = map.get(str);
        if ((obj2 instanceof AnonymousClass1DT) && (r1 = (AnonymousClass1DT) obj2) != null) {
            return r1;
        }
        Map map2 = this.A03;
        if (map2.containsKey(str)) {
            obj = map2.get(str);
        } else {
            map2.put(str, obj);
        }
        ? r12 = new AnonymousClass1DS(obj);
        r12.A01 = str;
        r12.A00 = this;
        map.put(str, r12);
        return r12;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: X.1DS} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: X.27x} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: X.1DS} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: X.27x} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: X.27x} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass1DT A01(java.lang.String r4) {
        /*
            r3 = this;
            java.util.Map r2 = r3.A02
            java.lang.Object r1 = r2.get(r4)
            boolean r0 = r1 instanceof X.AnonymousClass1DT
            if (r0 == 0) goto L_0x000f
            X.1DT r1 = (X.AnonymousClass1DT) r1
            if (r1 == 0) goto L_0x000f
            return r1
        L_0x000f:
            java.util.Map r1 = r3.A03
            boolean r0 = r1.containsKey(r4)
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r1.get(r4)
            X.27x r1 = new X.27x
            r1.<init>(r0)
        L_0x0020:
            r1.A01 = r4
            r1.A00 = r3
            r2.put(r4, r1)
            return r1
        L_0x0028:
            X.27x r1 = new X.27x
            r1.<init>()
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37361pP.A01(java.lang.String):X.1DT");
    }

    public final Object A02(String str) {
        try {
            return this.A03.get(str);
        } catch (ClassCastException unused) {
            A03(str);
            return null;
        }
    }

    public C37361pP(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.A03 = linkedHashMap;
        this.A04 = new LinkedHashMap();
        this.A02 = new LinkedHashMap();
        this.A01 = new LinkedHashMap();
        this.A00 = new C65132vt(this, 2);
        linkedHashMap.putAll(map);
    }

    public C37361pP() {
        this.A03 = new LinkedHashMap();
        this.A04 = new LinkedHashMap();
        this.A02 = new LinkedHashMap();
        this.A01 = new LinkedHashMap();
        this.A00 = new C65132vt(this, 2);
    }
}
