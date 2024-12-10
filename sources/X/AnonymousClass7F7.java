package X;

import java.lang.ref.WeakReference;
import java.util.Date;

/* renamed from: X.7F7  reason: invalid class name */
public final class AnonymousClass7F7 implements C72113Kr {
    public C129686iC A00;
    public final AnonymousClass1KB A01;
    public final AnonymousClass11P A02;
    public final AnonymousClass118 A03;
    public final C196109uT A04;
    public final C18030ve A05;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: X.7Gs} */
    /* JADX WARNING: type inference failed for: r4v1, types: [X.879] */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C129686iC A00() {
        /*
            r6 = this;
            X.6iC r0 = r6.A00
            if (r0 != 0) goto L_0x003b
            X.0ve r2 = r6.A05
            r0 = 7126(0x1bd6, float:9.986E-42)
            X.0vf r1 = X.C18040vf.A02
            int r5 = X.C18020vd.A00(r1, r2, r0)
            r0 = 7125(0x1bd5, float:9.984E-42)
            java.lang.String r1 = X.C18020vd.A01(r1, r2, r0)     // Catch:{ MalformedURLException -> 0x001a }
            java.net.URL r0 = new java.net.URL     // Catch:{ MalformedURLException -> 0x001a }
            r0.<init>(r1)     // Catch:{ MalformedURLException -> 0x001a }
            goto L_0x0025
        L_0x001a:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FlowsLogger/FlowsWebCacheCleanerHelper.initFLowsWebCacheCleaner -- Invalid cache cleanup url "
            X.C108995ce.A1M(r0, r1, r2)
            r0 = 0
        L_0x0025:
            if (r5 <= 0) goto L_0x003c
            if (r0 == 0) goto L_0x003c
            X.7Gs r4 = new X.7Gs
            r4.<init>(r0)
        L_0x002e:
            X.1KB r1 = r6.A01
            X.9uT r3 = r6.A04
            X.11P r2 = r6.A02
            X.6iC r0 = new X.6iC
            r0.<init>(r1, r2, r3, r4, r5)
            r6.A00 = r0
        L_0x003b:
            return r0
        L_0x003c:
            X.7Gr r4 = new X.7Gr
            r4.<init>()
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7F7.A00():X.6iC");
    }

    public void Bqf() {
        if (C18020vd.A05(C18040vf.A02, this.A05, 5936)) {
            C129686iC A002 = A00();
            WeakReference A0z = AnonymousClass3MW.A0z(this.A03.A00);
            C196109uT r8 = A002.A03;
            r8.A01();
            r8.A00();
            Date date = new Date(r8.A01());
            r8.A00();
            if (date.getTime() > 0) {
                Date date2 = new Date(System.currentTimeMillis());
                Date date3 = new Date(r8.A01());
                r8.A00();
                if (date2.compareTo(date3) >= 0) {
                    A002.A01.A0J(new C146797Qq(A002, A0z, 12));
                }
            }
        }
    }

    public AnonymousClass7F7(AnonymousClass1KB r1, AnonymousClass11P r2, AnonymousClass118 r3, C196109uT r4, C18030ve r5) {
        C18070vi.A0w(r1, r5, r2, r4, r3);
        this.A01 = r1;
        this.A05 = r5;
        this.A02 = r2;
        this.A04 = r4;
        this.A03 = r3;
    }
}
