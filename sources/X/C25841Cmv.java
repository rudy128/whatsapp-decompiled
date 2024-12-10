package X;

import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.Cmv  reason: case insensitive filesystem */
public class C25841Cmv {
    public C25841Cmv A00;
    public C25841Cmv A01;
    public final Handler A02;
    public final C25639CjS A03;
    public final EDJ A04;
    public final C26045Cr9 A05;
    public final C25482Cgd A06;
    public final C25663Cjt A07;

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b6, code lost:
        if (r0.A01 == 3553) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c1, code lost:
        if (r1 == 3) goto L_0x013f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.EA3 A00() {
        /*
            r12 = this;
            r2 = 0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "input_"
            java.lang.String r2 = X.AnonymousClass001.A1I(r0, r1, r2)
            X.Cgd r0 = r12.A06
            java.util.concurrent.ConcurrentHashMap r0 = r0.A00
            java.lang.Object r5 = r0.get(r2)
            X.DDm r5 = (X.DDm) r5
            if (r5 == 0) goto L_0x0148
            java.lang.String r0 = "getInputData"
            android.os.Trace.beginSection(r0)     // Catch:{ all -> 0x0143 }
            X.EA3 r4 = r5.A06     // Catch:{ all -> 0x0143 }
            if (r4 != 0) goto L_0x0028
            X.E8l r0 = r5.A07     // Catch:{ all -> 0x0143 }
            if (r0 == 0) goto L_0x00d9
            X.EA3 r4 = r0.BRy()     // Catch:{ all -> 0x0143 }
        L_0x0028:
            X.C28111Yx.A02(r4)     // Catch:{ all -> 0x0143 }
            X.Cr9 r0 = r5.A02     // Catch:{ all -> 0x0143 }
            if (r0 != 0) goto L_0x0038
            X.CjS r1 = r5.A05     // Catch:{ all -> 0x0143 }
            X.C0H r0 = X.C0H.A05     // Catch:{ all -> 0x0143 }
        L_0x0033:
            r1.A00(r0)     // Catch:{ all -> 0x0143 }
            goto L_0x013f
        L_0x0038:
            X.EAJ r0 = r5.A01     // Catch:{ all -> 0x0143 }
            if (r0 != 0) goto L_0x0041
            X.CjS r1 = r5.A05     // Catch:{ all -> 0x0143 }
            X.C0H r0 = X.C0H.A08     // Catch:{ all -> 0x0143 }
            goto L_0x0033
        L_0x0041:
            X.CWu r0 = r0.BY7()     // Catch:{ all -> 0x0143 }
            boolean r0 = r0.A00()     // Catch:{ all -> 0x0143 }
            if (r0 != 0) goto L_0x013f
            X.Cr9 r3 = r5.A02     // Catch:{ all -> 0x0143 }
            X.C28111Yx.A02(r3)     // Catch:{ all -> 0x0143 }
            X.EAJ r2 = r5.A01     // Catch:{ all -> 0x0143 }
            X.C28111Yx.A02(r2)     // Catch:{ all -> 0x0143 }
            X.DDl r0 = r5.A03     // Catch:{ all -> 0x0143 }
            if (r0 != 0) goto L_0x006c
            X.CNM r0 = r5.A08     // Catch:{ all -> 0x0143 }
            X.CjS r1 = r0.A00     // Catch:{ all -> 0x0143 }
            X.DDl r0 = new X.DDl     // Catch:{ all -> 0x0143 }
            r0.<init>(r1)     // Catch:{ all -> 0x0143 }
            r5.A03 = r0     // Catch:{ all -> 0x0143 }
            r0.Bd8(r3)     // Catch:{ all -> 0x0143 }
            X.DDl r0 = r5.A03     // Catch:{ all -> 0x0143 }
            r0.BCi(r2)     // Catch:{ all -> 0x0143 }
        L_0x006c:
            X.DDl r3 = r5.A03     // Catch:{ all -> 0x0143 }
            boolean r2 = r5.A04     // Catch:{ all -> 0x0143 }
            int r8 = r5.A00     // Catch:{ all -> 0x0143 }
            android.os.Looper r0 = android.os.Looper.myLooper()     // Catch:{ all -> 0x0143 }
            if (r0 == 0) goto L_0x008b
            android.os.Looper r0 = android.os.Looper.myLooper()     // Catch:{ all -> 0x0143 }
            java.lang.Thread r1 = r0.getThread()     // Catch:{ all -> 0x0143 }
            java.lang.Thread r0 = X.BE8.A0k()     // Catch:{ all -> 0x0143 }
            if (r1 != r0) goto L_0x008b
            X.CjS r1 = r3.A04     // Catch:{ all -> 0x0143 }
            X.C0H r0 = X.C0H.A01     // Catch:{ all -> 0x0143 }
            goto L_0x0033
        L_0x008b:
            X.Cr9 r0 = r3.A01     // Catch:{ all -> 0x0143 }
            if (r0 != 0) goto L_0x0094
            X.CjS r1 = r3.A04     // Catch:{ all -> 0x0143 }
            X.C0H r0 = X.C0H.A05     // Catch:{ all -> 0x0143 }
            goto L_0x0033
        L_0x0094:
            X.EAJ r0 = r3.A00     // Catch:{ all -> 0x0143 }
            if (r0 != 0) goto L_0x009d
            X.CjS r1 = r3.A04     // Catch:{ all -> 0x0143 }
            X.C0H r0 = X.C0H.A08     // Catch:{ all -> 0x0143 }
            goto L_0x0033
        L_0x009d:
            X.CWu r0 = r0.BY7()     // Catch:{ all -> 0x0143 }
            boolean r0 = r0.A00()     // Catch:{ all -> 0x0143 }
            if (r0 != 0) goto L_0x013f
            if (r4 == 0) goto L_0x013f
            if (r2 == 0) goto L_0x00b8
            X.CZB r0 = r4.getTexture()     // Catch:{ all -> 0x0143 }
            X.C28111Yx.A02(r0)     // Catch:{ all -> 0x0143 }
            int r1 = r0.A01     // Catch:{ all -> 0x0143 }
            r0 = 3553(0xde1, float:4.979E-42)
            if (r1 != r0) goto L_0x00c3
        L_0x00b8:
            if (r8 != 0) goto L_0x00c3
            int r1 = r4.BOx()     // Catch:{ all -> 0x0143 }
            if (r1 == 0) goto L_0x013f
            r0 = 3
            if (r1 == r0) goto L_0x013f
        L_0x00c3:
            X.Cr9 r5 = r3.A01     // Catch:{ all -> 0x0143 }
            X.C26159CtX.A01(r5)     // Catch:{ all -> 0x0143 }
            X.EAJ r11 = r3.A00     // Catch:{ all -> 0x0143 }
            X.C26159CtX.A01(r11)     // Catch:{ all -> 0x0143 }
            X.CWX r0 = r4.Bbf()     // Catch:{ all -> 0x0143 }
            if (r0 != 0) goto L_0x00dc
            X.CjS r1 = r3.A05     // Catch:{ all -> 0x0143 }
            X.C0H r0 = X.C0H.A0n     // Catch:{ all -> 0x0143 }
            goto L_0x0033
        L_0x00d9:
            r4 = 0
            goto L_0x0028
        L_0x00dc:
            int r10 = r0.A01     // Catch:{ all -> 0x0143 }
            int r9 = r0.A00     // Catch:{ all -> 0x0143 }
            X.DE4 r1 = r3.A02     // Catch:{ all -> 0x0143 }
            if (r1 != 0) goto L_0x0105
            X.CjS r7 = r3.A05     // Catch:{ all -> 0x0143 }
            X.BUV r6 = new X.BUV     // Catch:{ all -> 0x0143 }
            r6.<init>()     // Catch:{ all -> 0x0143 }
            X.BUR r2 = new X.BUR     // Catch:{ all -> 0x0143 }
            r2.<init>()     // Catch:{ all -> 0x0143 }
            r0 = 0
            X.DE4 r1 = new X.DE4     // Catch:{ all -> 0x0143 }
            r1.<init>(r7, r6, r2, r0)     // Catch:{ all -> 0x0143 }
            r3.A02 = r1     // Catch:{ all -> 0x0143 }
            int r0 = r4.BQb()     // Catch:{ all -> 0x0143 }
            r1.A03(r10, r9, r0)     // Catch:{ all -> 0x0143 }
            X.DE4 r0 = r3.A02     // Catch:{ all -> 0x0143 }
            r0.BCi(r11)     // Catch:{ all -> 0x0143 }
            goto L_0x010c
        L_0x0105:
            int r0 = r4.BQb()     // Catch:{ all -> 0x0143 }
            r1.A03(r10, r9, r0)     // Catch:{ all -> 0x0143 }
        L_0x010c:
            if (r8 == 0) goto L_0x0114
            X.DE4 r0 = r3.A02     // Catch:{ all -> 0x0143 }
            X.DE1 r0 = r0.A08     // Catch:{ all -> 0x0143 }
            r0.A00 = r8     // Catch:{ all -> 0x0143 }
        L_0x0114:
            X.DDk r0 = r3.A03     // Catch:{ all -> 0x0143 }
            if (r0 != 0) goto L_0x0130
            X.CjS r1 = r3.A04     // Catch:{ all -> 0x0143 }
            X.DDk r0 = new X.DDk     // Catch:{ all -> 0x0143 }
            r0.<init>(r1)     // Catch:{ all -> 0x0143 }
            r3.A03 = r0     // Catch:{ all -> 0x0143 }
            X.Cr9 r0 = r3.A01     // Catch:{ all -> 0x0143 }
            X.C26159CtX.A01(r0)     // Catch:{ all -> 0x0143 }
            X.DDk r1 = r3.A03     // Catch:{ all -> 0x0143 }
            X.EAJ r0 = r3.A00     // Catch:{ all -> 0x0143 }
            X.C26159CtX.A01(r0)     // Catch:{ all -> 0x0143 }
            r1.BCi(r0)     // Catch:{ all -> 0x0143 }
        L_0x0130:
            X.DDk r2 = r3.A03     // Catch:{ all -> 0x0143 }
            X.EAJ r1 = r5.A01()     // Catch:{ all -> 0x0143 }
            X.DE4 r0 = r3.A02     // Catch:{ all -> 0x0143 }
            r2.A00(r1, r4, r0)     // Catch:{ all -> 0x0143 }
            X.DE4 r0 = r3.A02     // Catch:{ all -> 0x0143 }
            X.DE1 r4 = r0.A08     // Catch:{ all -> 0x0143 }
        L_0x013f:
            android.os.Trace.endSection()
            return r4
        L_0x0143:
            r0 = move-exception
            android.os.Trace.endSection()
            throw r0
        L_0x0148:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "input not set "
            java.lang.RuntimeException r0 = X.BEA.A0g(r0, r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25841Cmv.A00():X.EA3");
    }

    public C25841Cmv(C25639CjS cjS, EDJ edj, C26045Cr9 cr9) {
        C25482Cgd cgd = new C25482Cgd();
        C25663Cjt cjt = new C25663Cjt(cjS);
        this.A03 = cjS;
        this.A05 = cr9;
        this.A02 = cr9.A00;
        this.A06 = cgd;
        this.A07 = cjt;
        this.A04 = edj;
    }

    public List A01() {
        DDn dDn = (DDn) this.A07.A00.get(0);
        if (dDn != null) {
            return dDn.A05.A00;
        }
        throw BEA.A0h("GlOutput not set ", AnonymousClass000.A10(), 0);
    }

    public void A02(int i, Object obj) {
        DDn dDn = (DDn) this.A07.A00.get(i);
        if (dDn != null) {
            dDn.A03(obj);
        }
        EDJ edj = this.A04;
        if (edj != null) {
            HashMap A11 = C17880vN.A11();
            A11.put("output_index", String.valueOf(i));
            edj.BiS("media_pipeline_remove_output", "MediaGraphIOImpl", A11, BE6.A0O(this));
        }
    }

    public void A03(EAK eak, int i) {
        C25663Cjt cjt = this.A07;
        C26045Cr9 cr9 = this.A05;
        C25663Cjt.A00(cr9, cjt, i).A01(cr9, eak);
        EDJ edj = this.A04;
        if (edj != null) {
            HashMap A11 = C17880vN.A11();
            A11.put("output_index", String.valueOf(i));
            A11.put("output_class", C108955ca.A0x(eak));
            edj.BiS("media_pipeline_add_output", "MediaGraphIOImpl", A11, BE6.A0O(this));
        }
    }

    public void A04(DDm dDm, int i) {
        String A1I = AnonymousClass001.A1I("input_", AnonymousClass000.A10(), i);
        C25482Cgd cgd = this.A06;
        C26045Cr9 cr9 = this.A05;
        Handler handler = this.A02;
        DDm dDm2 = dDm;
        if (cgd.A00.get(A1I) != dDm) {
            if (handler.getLooper() == Looper.myLooper()) {
                C25482Cgd.A00(cr9, cgd, dDm, A1I);
            } else {
                handler.post(new C21456AkN(cgd, cr9, dDm2, A1I, 1));
            }
        }
        EDJ edj = this.A04;
        if (edj != null) {
            HashMap A11 = C17880vN.A11();
            A11.put("input_index", A1I);
            edj.BiS("media_pipeline_add_input", "MediaGraphIOImpl", A11, BE6.A0O(this));
        }
    }

    public C25841Cmv(C25639CjS cjS, C26045Cr9 cr9, C25482Cgd cgd, C25663Cjt cjt) {
        this.A03 = cjS;
        this.A05 = cr9;
        this.A02 = cr9.A00;
        this.A06 = cgd;
        this.A07 = cjt;
        this.A04 = null;
    }
}
