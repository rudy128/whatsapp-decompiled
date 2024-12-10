package X;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.7Gp  reason: invalid class name and case insensitive filesystem */
public class C144257Gp implements C160998Ax {
    public final int A00;
    public final AnonymousClass7PY A01;
    public final String A02;
    public final Set A03;

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003e A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean BeY(X.C132366mf r4) {
        /*
            r3 = this;
            r2 = 0
            java.lang.String r0 = r3.A02     // Catch:{ IllegalArgumentException -> 0x0050 }
            java.lang.Object r0 = r4.A00(r0)     // Catch:{ IllegalArgumentException -> 0x0050 }
            X.7PY r1 = new X.7PY
            r1.<init>(r0)
            int r0 = r3.A00
            switch(r0) {
                case 4: goto L_0x0040;
                case 5: goto L_0x0047;
                case 6: goto L_0x001b;
                case 7: goto L_0x0024;
                case 8: goto L_0x002d;
                case 9: goto L_0x0036;
                default: goto L_0x0011;
            }
        L_0x0011:
            java.util.Set r0 = r3.A03
            X.C17960vV.A07(r0)
            boolean r0 = r0.contains(r1)
            return r0
        L_0x001b:
            X.7PY r0 = r3.A01
            int r0 = r1.compareTo(r0)
            if (r0 >= 0) goto L_0x003f
            goto L_0x003e
        L_0x0024:
            X.7PY r0 = r3.A01
            int r0 = r1.compareTo(r0)
            if (r0 <= 0) goto L_0x003f
            goto L_0x003e
        L_0x002d:
            X.7PY r0 = r3.A01
            int r0 = r1.compareTo(r0)
            if (r0 > 0) goto L_0x003f
            goto L_0x003e
        L_0x0036:
            X.7PY r0 = r3.A01
            int r0 = r1.compareTo(r0)
            if (r0 < 0) goto L_0x003f
        L_0x003e:
            r2 = 1
        L_0x003f:
            return r2
        L_0x0040:
            X.7PY r0 = r3.A01
            boolean r0 = r1.equals(r0)
            return r0
        L_0x0047:
            X.7PY r0 = r3.A01
            boolean r0 = r1.equals(r0)
            r0 = r0 ^ 1
            return r0
        L_0x0050:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C144257Gp.BeY(X.6mf):boolean");
    }

    public int hashCode() {
        Object[] objArr = new Object[5];
        objArr[0] = this.A02;
        AnonymousClass000.A1M(objArr, this.A00);
        objArr[2] = this.A01;
        objArr[3] = this.A03;
        return AnonymousClass000.A0P(String.class, objArr, 4);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C144257Gp)) {
            return false;
        }
        C144257Gp r4 = (C144257Gp) obj;
        if (!this.A02.equals(r4.A02) || this.A00 != r4.A00) {
            return false;
        }
        AnonymousClass7PY r1 = this.A01;
        AnonymousClass7PY r0 = r4.A01;
        if (r1 == null) {
            if (r0 != null) {
                return false;
            }
        } else if (!r1.equals(r0)) {
            return false;
        }
        Set set = this.A03;
        Set set2 = r4.A03;
        if (set == null) {
            if (set2 != null) {
                return false;
            }
        } else if (!set.equals(set2)) {
            return false;
        }
        Class<String> cls = String.class;
        if (cls.equals(cls)) {
            return true;
        }
        return false;
    }

    public C144257Gp(int i, String str, Object obj) {
        this.A00 = i;
        this.A02 = str;
        this.A01 = new AnonymousClass7PY(obj);
        this.A03 = null;
    }

    public C144257Gp(String str, List list) {
        this.A00 = 10;
        this.A02 = str;
        this.A03 = new HashSet(list.size());
        for (Object r2 : list) {
            this.A03.add(new AnonymousClass7PY(r2));
        }
        this.A01 = null;
    }
}
