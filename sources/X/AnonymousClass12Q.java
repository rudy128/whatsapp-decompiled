package X;

import android.content.Context;

/* renamed from: X.12Q  reason: invalid class name */
public abstract class AnonymousClass12Q {
    public static final ThreadLocal A00 = new AnonymousClass12R();

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        if (r2 == null) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object A02(android.content.Context r4, int r5) {
        /*
            r3 = 0
            if (r4 == 0) goto L_0x000d
            X.114 r2 = X.AnonymousClass114.get(r4)
        L_0x0007:
            X.18s r2 = (X.C221318s) r2
            A05(r2)
            goto L_0x0038
        L_0x000d:
            java.lang.ThreadLocal r0 = A00
            java.lang.Object r0 = r0.get()
            X.18k r0 = (X.C220518k) r0
            if (r0 == 0) goto L_0x0022
            java.util.List r1 = r0.A01
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x002b
            r2 = 0
        L_0x0020:
            if (r2 != 0) goto L_0x0007
        L_0x0022:
            android.content.Context r0 = X.AnonymousClass114.A00()
            X.114 r2 = X.AnonymousClass114.get(r0)
            goto L_0x0007
        L_0x002b:
            int r0 = r1.size()
            int r0 = r0 + -1
            java.lang.Object r2 = r1.get(r0)
            X.18s r2 = (X.C221318s) r2
            goto L_0x0020
        L_0x0038:
            X.18k r1 = r2.BKQ()     // Catch:{ all -> 0x0052 }
            r0 = r2
            X.18q r0 = (X.C221118q) r0     // Catch:{ all -> 0x0050 }
            X.114 r0 = r0.A00     // Catch:{ all -> 0x0050 }
            X.18n r0 = r0.BYf()     // Catch:{ all -> 0x0050 }
            java.lang.Object r0 = X.C449725m.A00(r5, r0, r3)     // Catch:{ all -> 0x0050 }
            A04()
            r2.BKt(r1)
            return r0
        L_0x0050:
            r0 = move-exception
            goto L_0x0054
        L_0x0052:
            r0 = move-exception
            r1 = 0
        L_0x0054:
            A04()
            r2.BKt(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass12Q.A02(android.content.Context, int):java.lang.Object");
    }

    public static void A04() {
        try {
            ((C220518k) A00.get()).A00();
        } catch (IllegalStateException e) {
            C60712oU.A00();
            throw e;
        }
    }

    public static void A05(AnonymousClass113 r1) {
        ((C220518k) A00.get()).A01.add(r1.BYe());
    }

    public static C202011f A00(Class cls) {
        Integer A01 = AnonymousClass12S.A01(cls);
        if (A01 != null) {
            return new C202011f(A01.intValue());
        }
        throw new AssertionError("Looks like you hit the fallback method.  Please see https://fburl.com/wiki/g9sq37h7 for what this means and how to fix it.");
    }

    public static Object A01(int i) {
        return A02(AnonymousClass114.A00(), i);
    }

    public static Object A03(Class cls) {
        Integer A01 = AnonymousClass12S.A01(cls);
        if (A01 != null) {
            return A02((Context) null, A01.intValue());
        }
        throw new AssertionError("Looks like you hit the fallback method.  Please see https://fburl.com/wiki/g9sq37h7 for what this means and how to fix it.");
    }
}
