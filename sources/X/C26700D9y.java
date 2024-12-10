package X;

import com.facebook.debug.tracer.Tracer;
import com.facebook.systrace.Systrace;

/* renamed from: X.D9y  reason: case insensitive filesystem */
public class C26700D9y implements C28652ECm {
    public static C26700D9y A04;
    public CNZ A00;
    public C25582CiM A01;
    public String A02;
    public boolean A03;

    public void Bt8(int i, int i2, String str, String str2) {
    }

    public void C6K(EA9 ea9, String str, long j, long j2) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0058, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0059, code lost:
        com.facebook.systrace.Systrace.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005c, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void C61(X.EA9 r19, X.DSC r20) {
        /*
            r18 = this;
            java.lang.String r0 = "CacheInstrumentationListener.onSpanAdded"
            com.facebook.debug.tracer.Tracer.A00(r0)
            r4 = r18
            X.CiM r0 = r4.A01     // Catch:{ all -> 0x0058 }
            if (r0 == 0) goto L_0x0054
            java.lang.String r8 = ""
            java.lang.String r6 = "UNKNOWN"
            X.CNZ r2 = r4.A00     // Catch:{ all -> 0x0058 }
            monitor-enter(r2)     // Catch:{ all -> 0x0058 }
            java.util.TreeSet r0 = r2.A01     // Catch:{ all -> 0x0051 }
            r3 = r20
            java.lang.Object r1 = r0.floor(r3)     // Catch:{ all -> 0x0051 }
            X.DSC r1 = (X.DSC) r1     // Catch:{ all -> 0x0051 }
            java.util.Map r0 = r2.A00     // Catch:{ all -> 0x0051 }
            java.lang.Object r1 = r0.get(r1)     // Catch:{ all -> 0x0051 }
            X.CNY r1 = (X.CNY) r1     // Catch:{ all -> 0x0051 }
            monitor-exit(r2)     // Catch:{ all -> 0x0058 }
            java.lang.String r5 = "unknown"
            if (r1 == 0) goto L_0x0035
            X.CZH r0 = r1.A00     // Catch:{ all -> 0x0058 }
            java.lang.String r5 = r0.A02     // Catch:{ all -> 0x0058 }
            X.ByY r0 = r0.A00     // Catch:{ all -> 0x0058 }
            java.lang.String r6 = r0.name()     // Catch:{ all -> 0x0058 }
            java.lang.String r8 = r1.A01     // Catch:{ all -> 0x0058 }
        L_0x0035:
            X.CiM r0 = r4.A01     // Catch:{ all -> 0x0058 }
            java.lang.String r4 = r4.A02     // Catch:{ all -> 0x0058 }
            java.lang.String r7 = r3.A07     // Catch:{ all -> 0x0058 }
            long r10 = r3.A05     // Catch:{ all -> 0x0058 }
            long r12 = r3.A04     // Catch:{ all -> 0x0058 }
            X.Byy r3 = X.C24301Byy.SPAN_ADDED     // Catch:{ all -> 0x0058 }
            r14 = 0
            r9 = 0
            X.DRq r2 = new X.DRq     // Catch:{ all -> 0x0058 }
            r16 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r12, r14, r16)     // Catch:{ all -> 0x0058 }
            java.util.List r0 = r0.A01     // Catch:{ all -> 0x0058 }
            r0.add(r2)     // Catch:{ all -> 0x0058 }
            goto L_0x0054
        L_0x0051:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0058 }
            throw r0     // Catch:{ all -> 0x0058 }
        L_0x0054:
            com.facebook.systrace.Systrace.A01()
            return
        L_0x0058:
            r0 = move-exception
            com.facebook.systrace.Systrace.A01()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26700D9y.C61(X.EA9, X.DSC):void");
    }

    public void C62(EA9 ea9, DSC dsc) {
        Tracer.A00("CacheInstrumentationListener.onSpanRemoved");
        Systrace.A01();
    }

    public void C63(EA9 ea9, DSC dsc, DSC dsc2, Integer num) {
        Tracer.A00("CacheInstrumentationListener.onSpanTouched");
        try {
            C25582CiM ciM = this.A01;
            if (ciM != null) {
                DSC dsc3 = dsc;
                if (!(dsc == null || num == AnonymousClass00R.A0N)) {
                    DSC dsc4 = dsc2;
                    ciM.A01.add(new C27067DRq(C24301Byy.SPAN_TOUCHED, this.A02, (String) null, (String) null, dsc3.A07, (String) null, (String) null, dsc3.A05, dsc3.A04, dsc4.A05, dsc4.A04));
                }
            }
        } finally {
            Systrace.A01();
        }
    }
}
