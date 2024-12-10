package X;

import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: X.6pH  reason: invalid class name and case insensitive filesystem */
public final class C133666pH {
    public final C18030ve A00;
    public final C183279Xq A01;
    public final AnonymousClass00H A02;
    public final List A03 = AnonymousClass000.A13();

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002b, code lost:
        if ((!X.C20045A4o.A00(r3).contains(X.C197659x3.A00(r11.A01.A00))) == false) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.List A01() {
        /*
            r11 = this;
            monitor-enter(r11)
            java.util.List r2 = r11.A03     // Catch:{ all -> 0x0048 }
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x0048 }
            if (r0 == 0) goto L_0x0046
            r2.clear()     // Catch:{ all -> 0x0048 }
            X.0ve r3 = r11.A00     // Catch:{ all -> 0x0048 }
            r1 = 6743(0x1a57, float:9.449E-42)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ all -> 0x0048 }
            boolean r0 = X.C18020vd.A05(r0, r3, r1)     // Catch:{ all -> 0x0048 }
            if (r0 == 0) goto L_0x002d
            X.9Xq r0 = r11.A01     // Catch:{ all -> 0x0048 }
            X.9x3 r0 = r0.A00     // Catch:{ all -> 0x0048 }
            java.lang.String r1 = X.C197659x3.A00(r0)     // Catch:{ all -> 0x0048 }
            java.util.HashSet r0 = X.C20045A4o.A00(r3)     // Catch:{ all -> 0x0048 }
            boolean r0 = r0.contains(r1)     // Catch:{ all -> 0x0048 }
            r0 = r0 ^ 1
            r10 = 1
            if (r0 != 0) goto L_0x002e
        L_0x002d:
            r10 = 0
        L_0x002e:
            X.6Az r4 = new X.6Az     // Catch:{ all -> 0x0048 }
            r4.<init>(r11)     // Catch:{ all -> 0x0048 }
            r5 = 0
            r6 = 0
            r7 = 2131434859(0x7f0b1d6b, float:1.8491544E38)
            r8 = 2131890392(0x7f1210d8, float:1.9415475E38)
            r9 = 2131232338(0x7f080652, float:1.8080782E38)
            X.77M r3 = new X.77M     // Catch:{ all -> 0x0048 }
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0048 }
            r2.add(r3)     // Catch:{ all -> 0x0048 }
        L_0x0046:
            monitor-exit(r11)
            return r2
        L_0x0048:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C133666pH.A01():java.util.List");
    }

    public C133666pH(C18030ve r2, C183279Xq r3, AnonymousClass00H r4) {
        C18070vi.A0o(r2, r3, r4);
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r4;
    }

    public final AnonymousClass77M A00() {
        for (AnonymousClass77M r1 : A01()) {
            if (r1.A03 == 0) {
                return r1;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
