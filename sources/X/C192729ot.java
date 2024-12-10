package X;

import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.9ot  reason: invalid class name and case insensitive filesystem */
public final class C192729ot {
    public int A00;
    public BBM A01;
    public final C183069Wu A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0090, code lost:
        if (r1.isEmpty() != false) goto L_0x0092;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A01(X.C195639tf r9, X.BBM r10, java.util.Map r11, X.AnonymousClass1D6 r12) {
        /*
            r8 = this;
            r5 = 0
            r6 = 1
            int r0 = r9.A00
            r8.A00 = r0
            r8.A01 = r10
            java.lang.String r7 = "app_id"
            java.lang.Object r0 = r11.get(r7)
            r1 = 0
            if (r0 != 0) goto L_0x001c
            java.lang.String r0 = "No parameters or no app_id"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.A1q r0 = X.C19980A1q.A03
            r10.Btu(r0, r1)
            return r5
        L_0x001c:
            X.00H r0 = r8.A05
            java.lang.Object r0 = r0.get()
            X.A2V r0 = (X.A2V) r0
            X.A2X r2 = r0.A00()
            java.lang.Class<X.Aec> r1 = X.C21108Aec.class
            r0 = 4
            X.A2X.A00(r2, r1, r8, r0)
            java.lang.String r4 = X.AnonymousClass8BW.A0g(r7, r11)
            int r3 = r8.A00
            java.lang.String r2 = "requestBloksScreen"
            X.00H r1 = r8.A04
            java.lang.Object r0 = r1.get()
            X.9oo r0 = (X.C192689oo) r0
            X.19a r0 = r0.A01
            r0.A03(r3, r2)
            if (r4 == 0) goto L_0x004e
            java.lang.Object r0 = r1.get()
            X.9oo r0 = (X.C192689oo) r0
            r0.A01(r3, r7, r4)
        L_0x004e:
            java.lang.String r0 = "data"
            java.lang.Object r1 = r11.get(r0)
            boolean r0 = r1 instanceof java.util.Map
            if (r0 == 0) goto L_0x00f8
            java.util.Map r1 = (java.util.Map) r1
            if (r1 == 0) goto L_0x00f8
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>(r1)
            X.9Ip r0 = X.C179599Ip.ADDITIONAL_PARAMS
            java.lang.String r0 = r0.key
            java.lang.Object r1 = r11.get(r0)
            boolean r0 = r1 instanceof java.util.Map
            if (r0 == 0) goto L_0x0074
            java.util.Map r1 = (java.util.Map) r1
            if (r1 == 0) goto L_0x0074
            r4.putAll(r1)
        L_0x0074:
            X.9Ip r0 = X.C179599Ip.RESUMABLE_DATA
            java.lang.String r3 = r0.key
            X.9p2 r2 = r9.A02
            if (r2 == 0) goto L_0x0092
            java.util.Stack r1 = r2.A06
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0092
            java.lang.Object r0 = r1.peek()
            X.9sh r0 = (X.C195039sh) r0
            java.util.Map r1 = r0.A03
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0096
        L_0x0092:
            X.1CQ r1 = X.AnonymousClass1D7.A0I()
        L_0x0096:
            r4.put(r3, r1)
            X.9Ip r0 = X.C179599Ip.EXTENSIONS_CONTEXT
            java.lang.String r7 = r0.key
            java.util.LinkedHashMap r3 = X.C17880vN.A13()
            X.9Ip r0 = X.C179599Ip.EXTENSIONS_IS_RESUMED
            java.lang.String r1 = r0.key
            if (r2 == 0) goto L_0x00f9
            boolean r0 = r2.A01
        L_0x00a9:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.put(r1, r0)
            X.9Ip r0 = X.C179599Ip.EXTENSIONS_IS_BACK_TRIGGERED
            java.lang.String r2 = r0.key
            java.lang.String r1 = "is_back_triggered"
            java.lang.Object r0 = r4.get(r1)
            if (r0 != 0) goto L_0x00c0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
        L_0x00c0:
            r3.put(r2, r0)
            r4.put(r7, r3)
            r4.remove(r1)
            X.9Wu r3 = r8.A02
            java.lang.Object r2 = r12.first
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r12.second
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            X.C18070vi.A0d(r2, r5)
            X.C18070vi.A0d(r1, r6)
            X.CVW r5 = r3.A00
            r5.A00(r0, r2, r1, r4)
            java.lang.Object r4 = r12.first
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r12.second
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Integer r2 = X.AnonymousClass00R.A01
            java.lang.String r1 = "job_id"
            java.lang.String r0 = r9.A04
            java.util.Map r0 = X.C108975cc.A0h(r1, r0)
            X.C108975cc.A12(r4, r3, r6)
            r5.A00(r2, r4, r3, r0)
        L_0x00f8:
            return r6
        L_0x00f9:
            r0 = 0
            goto L_0x00a9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C192729ot.A01(X.9tf, X.BBM, java.util.Map, X.1D6):boolean");
    }

    public final void A00(Map map) {
        ((A2V) this.A05.get()).A00().A03(C21108Aec.class, this);
        BBM bbm = this.A01;
        if (bbm == null) {
            return;
        }
        if (map == null || !C18070vi.A18(map.get("success"), "false")) {
            Log.w("Finishing Bloks resource with success");
            bbm.C7V(map);
            return;
        }
        Log.w("Finishing Bloks resource with failure");
        bbm.Btu(new C19980A1q((Integer) null, "BloksScreenFinishWithError", "Finishing Bloks resource with failure"), map);
    }

    public C192729ot(C183069Wu r1, AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4) {
        C18070vi.A0s(r2, r1, r3, r4);
        this.A05 = r2;
        this.A02 = r1;
        this.A03 = r3;
        this.A04 = r4;
    }
}
