package X;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;

/* renamed from: X.72Y  reason: invalid class name */
public abstract class AnonymousClass72Y {
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        if (A03(r7, r0) == false) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A01(android.content.Context r7, X.AnonymousClass11P r8, X.AnonymousClass1E7 r9) {
        /*
            r0 = 1
            X.C18070vi.A0d(r8, r0)
            r6 = 0
            if (r9 == 0) goto L_0x0017
            java.lang.String r5 = r9.A0a
            if (r5 != 0) goto L_0x0018
            java.lang.String r0 = r9.A0Z
            if (r0 == 0) goto L_0x0048
            if (r7 == 0) goto L_0x0048
            boolean r0 = A03(r7, r0)
            if (r0 != 0) goto L_0x0048
        L_0x0017:
            return r6
        L_0x0018:
            long r3 = r9.A0F
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0029
            long r1 = java.lang.System.currentTimeMillis()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0029
            return r6
        L_0x0029:
            java.lang.String r0 = r9.A0Z
            if (r0 == 0) goto L_0x0047
            boolean r0 = X.AnonymousClass1EG.A0H(r5)
            if (r0 != 0) goto L_0x0048
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = r9.A0a
            r1.append(r0)
            r0 = 32
            r1.append(r0)
            java.lang.String r0 = r9.A0Z
            java.lang.String r5 = X.AnonymousClass000.A0y(r0, r1)
        L_0x0047:
            return r5
        L_0x0048:
            java.lang.String r5 = r9.A0Z
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass72Y.A01(android.content.Context, X.11P, X.1E7):java.lang.String");
    }

    public static final Drawable A00(Resources resources, AnonymousClass1KW r7, String str) {
        return r7.A08(resources, new C43281zY(str), 1.0f, -1);
    }

    public static final String A02(Context context, AnonymousClass11P r3, AnonymousClass1E7 r4, C18030ve r5) {
        C18070vi.A0h(r5, r3);
        if (C18020vd.A05(C18040vf.A02, r5, 5839)) {
            String A01 = A01(context, r3, r4);
            if (A01 == null || AnonymousClass1YF.A0T(A01)) {
                return null;
            }
            return A01;
        }
        String str = r4.A0Z;
        if (str != null && !AnonymousClass1YF.A0T(str)) {
            return r4.A0Z;
        }
        return null;
    }

    public static final boolean A03(Context context, String str) {
        if (str != null && !AnonymousClass1YF.A0T(str) && !str.equals(context.getString(2131889231))) {
            TypedArray obtainTypedArray = context.getResources().obtainTypedArray(2130903050);
            C18070vi.A0X(obtainTypedArray);
            int length = obtainTypedArray.length();
            int i = 0;
            while (i < length) {
                String string = obtainTypedArray.getString(i);
                if (string == null || !string.equals(str)) {
                    i++;
                } else {
                    obtainTypedArray.recycle();
                }
            }
            obtainTypedArray.recycle();
            return true;
        }
        return false;
    }
}
