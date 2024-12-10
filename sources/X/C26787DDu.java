package X;

import android.os.Trace;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: X.DDu  reason: case insensitive filesystem */
public class C26787DDu implements E98, EDG, C28562E7o {
    public DDv A00;
    public C26045Cr9 A01;
    public C25841Cmv A02;
    public boolean A03;
    public final C25639CjS A04;
    public final C24863CNg A05 = new C24863CNg(this);
    public final Map A06 = C17880vN.A11();
    public final Map A07 = new TreeMap(new DUR(10));
    public final DE4[] A08 = new DE4[2];

    public /* synthetic */ EA3 CFA(EA3 ea3, C25841Cmv cmv) {
        return ea3;
    }

    private EA3 A00(EA3 ea3, EDG edg, C25841Cmv cmv, boolean z) {
        EAK eak;
        try {
            Trace.beginSection("CompositeMediaGraph.renderMediaGraph");
            if (ea3 == null) {
                ea3 = cmv.A00();
            }
            if (z) {
                DDn dDn = (DDn) cmv.A07.A00.get(0);
                if (dDn == null || dDn.A05.A00.size() != 1) {
                    eak = null;
                } else {
                    List A012 = cmv.A01();
                    synchronized (A012) {
                        eak = (EAK) A012.get(0);
                    }
                    if (eak != null) {
                        eak.CJf(this.A05);
                    }
                }
            } else {
                eak = null;
            }
            ea3 = edg.CFA(ea3, cmv);
            if (z && eak != null) {
                eak.CJf((C24863CNg) null);
            }
        } catch (Throwable th) {
            try {
                C27222Da1.A00(this.A01, "CompositeMediaGraph.renderMediaGraph() failed.", th);
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        }
        Trace.endSection();
        return ea3;
    }

    public void BCi(EAJ eaj) {
        Iterator A0l = C17890vO.A0l(this.A07);
        while (A0l.hasNext()) {
            ((E98) A0l.next()).BCi(eaj);
        }
        DDv dDv = this.A00;
        if (dDv != null) {
            dDv.BCi(eaj);
        }
    }

    public void BIY() {
        Iterator A0l = C17890vO.A0l(this.A07);
        while (A0l.hasNext()) {
            ((E98) A0l.next()).BIY();
        }
        DDv dDv = this.A00;
        if (dDv != null) {
            dDv.BIY();
        }
    }

    public boolean Bcs() {
        Iterator A0l = C17890vO.A0l(this.A07);
        while (A0l.hasNext()) {
            if (((EDG) A0l.next()).Bcs()) {
                return true;
            }
        }
        DDv dDv = this.A00;
        if (dDv == null || !dDv.Bcs()) {
            return false;
        }
        return true;
    }

    public void Bd8(C26045Cr9 cr9) {
        this.A01 = cr9;
        Iterator A0l = C17890vO.A0l(this.A07);
        while (A0l.hasNext()) {
            ((E98) A0l.next()).Bd8(cr9);
        }
        DDv dDv = this.A00;
        if (dDv != null) {
            dDv.Bd8(cr9);
        }
    }

    public void CCm(C28560E7m e7m, C28561E7n e7n) {
        DDv dDv = this.A00;
        if (dDv != null) {
            DDv.A06(dDv, e7m, e7n);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0095, code lost:
        if (r13.A02 != null) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00a3, code lost:
        if (r5.size() != r13.A06.size()) goto L_0x00a5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void CF9(X.C25841Cmv r14, java.lang.Long r15) {
        /*
            r13 = this;
            java.lang.String r0 = "CompositeMediaGraph.render"
            android.os.Trace.beginSection(r0)     // Catch:{ all -> 0x0207 }
            r12 = 0
            X.Cr9 r0 = r13.A01     // Catch:{ all -> 0x0207 }
            X.EAJ r0 = r0.A0E     // Catch:{ all -> 0x0207 }
            if (r0 == 0) goto L_0x008b
            X.CWu r0 = r0.BY7()     // Catch:{ all -> 0x0207 }
            boolean r0 = r0.A00()     // Catch:{ all -> 0x0207 }
            if (r0 == 0) goto L_0x008b
            java.util.Map r2 = r13.A07     // Catch:{ all -> 0x0207 }
            java.util.Iterator r1 = X.C17890vO.A0l(r2)     // Catch:{ all -> 0x0207 }
            r6 = 0
        L_0x001d:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0207 }
            if (r0 == 0) goto L_0x0034
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0207 }
            X.EDG r0 = (X.EDG) r0     // Catch:{ all -> 0x0207 }
            if (r0 == 0) goto L_0x001d
            boolean r0 = r0.Bcs()     // Catch:{ all -> 0x0207 }
            if (r0 == 0) goto L_0x001d
            int r6 = r6 + 1
            goto L_0x001d
        L_0x0034:
            X.DDv r0 = r13.A00     // Catch:{ all -> 0x0207 }
            if (r0 == 0) goto L_0x0040
            boolean r0 = r0.Bcs()     // Catch:{ all -> 0x0207 }
            if (r0 == 0) goto L_0x0040
            int r6 = r6 + 1
        L_0x0040:
            java.util.Iterator r5 = X.C17890vO.A0l(r2)     // Catch:{ all -> 0x0207 }
            r4 = 1
            r3 = 0
            r2 = 0
        L_0x0047:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x0207 }
            if (r0 == 0) goto L_0x0066
            java.lang.Object r1 = r5.next()     // Catch:{ all -> 0x0207 }
            X.EDG r1 = (X.EDG) r1     // Catch:{ all -> 0x0207 }
            if (r1 == 0) goto L_0x0047
            boolean r0 = r1.Bcs()     // Catch:{ all -> 0x0207 }
            if (r0 == 0) goto L_0x0047
            int r2 = r2 + 1
            boolean r0 = X.AnonymousClass000.A1T(r2, r6)
            X.EA3 r3 = r13.A00(r3, r1, r14, r0)     // Catch:{ all -> 0x0207 }
            goto L_0x0047
        L_0x0066:
            if (r3 != 0) goto L_0x006c
            X.EA3 r3 = r14.A00()     // Catch:{ all -> 0x0207 }
        L_0x006c:
            X.DDv r0 = r13.A00     // Catch:{ all -> 0x0207 }
            if (r0 == 0) goto L_0x0081
            boolean r0 = r0.Bcs()     // Catch:{ all -> 0x0207 }
            if (r0 == 0) goto L_0x0081
            int r0 = r2 + 1
            if (r0 == r6) goto L_0x007b
            r4 = 0
        L_0x007b:
            X.DDv r0 = r13.A00     // Catch:{ all -> 0x0207 }
            X.EA3 r3 = r13.A00(r3, r0, r14, r4)     // Catch:{ all -> 0x0207 }
        L_0x0081:
            if (r3 == 0) goto L_0x020f
            X.Cjt r1 = r14.A07     // Catch:{ all -> 0x0207 }
            r0 = 0
            r1.A01(r3, r0)     // Catch:{ all -> 0x0207 }
            goto L_0x020f
        L_0x008b:
            boolean r0 = r13.A03     // Catch:{ all -> 0x0207 }
            if (r0 == 0) goto L_0x00ad
            X.DDv r0 = r13.A00     // Catch:{ all -> 0x0207 }
            if (r0 == 0) goto L_0x00b6
            X.Cmv r0 = r13.A02     // Catch:{ all -> 0x0207 }
            if (r0 == 0) goto L_0x00a5
        L_0x0097:
            java.util.Map r5 = r13.A07     // Catch:{ all -> 0x0207 }
            int r1 = r5.size()     // Catch:{ all -> 0x0207 }
            java.util.Map r0 = r13.A06     // Catch:{ all -> 0x0207 }
            int r0 = r0.size()     // Catch:{ all -> 0x0207 }
            if (r1 == r0) goto L_0x01d3
        L_0x00a5:
            java.util.Map r0 = r13.A06     // Catch:{ all -> 0x0207 }
            r0.clear()     // Catch:{ all -> 0x0207 }
            r0 = 0
            r13.A02 = r0     // Catch:{ all -> 0x0207 }
        L_0x00ad:
            java.util.Map r5 = r13.A07     // Catch:{ all -> 0x0207 }
            int r1 = r5.size()     // Catch:{ all -> 0x0207 }
            X.DDv r2 = r13.A00     // Catch:{ all -> 0x0207 }
            goto L_0x00bb
        L_0x00b6:
            X.Cmv r0 = r13.A02     // Catch:{ all -> 0x0207 }
            if (r0 != 0) goto L_0x00a5
            goto L_0x0097
        L_0x00bb:
            boolean r0 = X.AnonymousClass000.A1W(r2)
            int r1 = r1 + r0
            r11 = 1
            if (r1 != r11) goto L_0x00e1
            if (r2 == 0) goto L_0x00c9
            r13.A02 = r14     // Catch:{ all -> 0x0207 }
            goto L_0x01d1
        L_0x00c9:
            java.util.Iterator r2 = X.AnonymousClass000.A15(r5)     // Catch:{ all -> 0x0207 }
        L_0x00cd:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0207 }
            if (r0 == 0) goto L_0x01d1
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r2)     // Catch:{ all -> 0x0207 }
            java.util.Map r1 = r13.A06     // Catch:{ all -> 0x0207 }
            java.lang.Object r0 = r0.getKey()     // Catch:{ all -> 0x0207 }
            r1.put(r0, r14)     // Catch:{ all -> 0x0207 }
            goto L_0x00cd
        L_0x00e1:
            X.EA3 r2 = r14.A00()     // Catch:{ all -> 0x0207 }
            X.CWX r0 = r2.Bbf()     // Catch:{ all -> 0x0207 }
            X.C26159CtX.A01(r0)     // Catch:{ all -> 0x0207 }
            int r8 = r0.A01     // Catch:{ all -> 0x0207 }
            int r7 = r0.A00     // Catch:{ all -> 0x0207 }
            int r6 = r2.BQb()     // Catch:{ all -> 0x0207 }
            r4 = 0
        L_0x00f5:
            int r0 = r1 + -1
            r3 = 2
            if (r4 >= r0) goto L_0x0110
            if (r4 >= r3) goto L_0x0110
            X.DE4[] r2 = r13.A08     // Catch:{ all -> 0x0207 }
            r0 = r2[r4]     // Catch:{ all -> 0x0207 }
            if (r0 != 0) goto L_0x010d
            X.CjS r0 = r13.A04     // Catch:{ all -> 0x0207 }
            X.DE4 r0 = X.DE4.A00(r0, r12)     // Catch:{ all -> 0x0207 }
            r0.A03(r8, r7, r6)     // Catch:{ all -> 0x0207 }
            r2[r4] = r0     // Catch:{ all -> 0x0207 }
        L_0x010d:
            int r4 = r4 + 1
            goto L_0x00f5
        L_0x0110:
            java.util.Set r0 = r5.keySet()     // Catch:{ all -> 0x0207 }
            java.util.ArrayList r4 = X.C17880vN.A10(r0)     // Catch:{ all -> 0x0207 }
            r2 = 0
        L_0x0119:
            int r0 = r4.size()     // Catch:{ all -> 0x0207 }
            if (r2 >= r0) goto L_0x01a3
            if (r2 != 0) goto L_0x013c
            X.Cmv r0 = r14.A00     // Catch:{ all -> 0x0207 }
            if (r0 != 0) goto L_0x0137
            X.CjS r9 = r14.A03     // Catch:{ all -> 0x0207 }
            X.Cr9 r8 = r14.A05     // Catch:{ all -> 0x0207 }
            X.Cgd r7 = r14.A06     // Catch:{ all -> 0x0207 }
            X.Cjt r6 = new X.Cjt     // Catch:{ all -> 0x0207 }
            r6.<init>(r9)     // Catch:{ all -> 0x0207 }
            X.Cmv r0 = new X.Cmv     // Catch:{ all -> 0x0207 }
            r0.<init>(r9, r8, r7, r6)     // Catch:{ all -> 0x0207 }
            r14.A00 = r0     // Catch:{ all -> 0x0207 }
        L_0x0137:
            X.DE4[] r6 = r13.A08     // Catch:{ all -> 0x0207 }
            r6 = r6[r12]     // Catch:{ all -> 0x0207 }
            goto L_0x019b
        L_0x013c:
            int r0 = r4.size()     // Catch:{ all -> 0x0207 }
            int r0 = r0 - r11
            if (r2 != r0) goto L_0x017b
            X.DDv r0 = r13.A00     // Catch:{ all -> 0x0207 }
            if (r0 != 0) goto L_0x017b
            X.Cmv r0 = r14.A01     // Catch:{ all -> 0x0207 }
            if (r0 != 0) goto L_0x015d
            X.CjS r9 = r14.A03     // Catch:{ all -> 0x0207 }
            X.Cr9 r8 = r14.A05     // Catch:{ all -> 0x0207 }
            X.Cgd r7 = new X.Cgd     // Catch:{ all -> 0x0207 }
            r7.<init>()     // Catch:{ all -> 0x0207 }
            X.Cjt r6 = r14.A07     // Catch:{ all -> 0x0207 }
            X.Cmv r0 = new X.Cmv     // Catch:{ all -> 0x0207 }
            r0.<init>(r9, r8, r7, r6)     // Catch:{ all -> 0x0207 }
            r14.A01 = r0     // Catch:{ all -> 0x0207 }
        L_0x015d:
            X.CjS r8 = r13.A04     // Catch:{ all -> 0x0207 }
            X.DE4[] r7 = r13.A08     // Catch:{ all -> 0x0207 }
            int r6 = r2 + -1
            int r6 = r6 % r3
            r6 = r7[r6]     // Catch:{ all -> 0x0207 }
            X.DE1 r9 = r6.A08     // Catch:{ all -> 0x0207 }
            r10 = 0
            X.DDm r7 = new X.DDm     // Catch:{ all -> 0x0207 }
            r7.<init>(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0207 }
            r0.A04(r7, r12)     // Catch:{ all -> 0x0207 }
        L_0x0171:
            java.util.Map r7 = r13.A06     // Catch:{ all -> 0x0207 }
            java.lang.Object r6 = r4.get(r2)     // Catch:{ all -> 0x0207 }
            r7.put(r6, r0)     // Catch:{ all -> 0x0207 }
            goto L_0x019f
        L_0x017b:
            X.CjS r8 = r13.A04     // Catch:{ all -> 0x0207 }
            X.Cr9 r7 = r13.A01     // Catch:{ all -> 0x0207 }
            r6 = 0
            X.Cmv r0 = new X.Cmv     // Catch:{ all -> 0x0207 }
            r0.<init>(r8, r6, r7)     // Catch:{ all -> 0x0207 }
            X.DE4[] r6 = r13.A08     // Catch:{ all -> 0x0207 }
            int r7 = r2 + -1
            int r7 = r7 % r3
            r7 = r6[r7]     // Catch:{ all -> 0x0207 }
            X.DE1 r9 = r7.A08     // Catch:{ all -> 0x0207 }
            r10 = 0
            X.DDm r7 = new X.DDm     // Catch:{ all -> 0x0207 }
            r7.<init>(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0207 }
            r0.A04(r7, r12)     // Catch:{ all -> 0x0207 }
            int r7 = r2 % 2
            r6 = r6[r7]     // Catch:{ all -> 0x0207 }
        L_0x019b:
            r0.A03(r6, r12)     // Catch:{ all -> 0x0207 }
            goto L_0x0171
        L_0x019f:
            int r2 = r2 + 1
            goto L_0x0119
        L_0x01a3:
            X.DDv r0 = r13.A00     // Catch:{ all -> 0x0207 }
            if (r0 == 0) goto L_0x01d1
            X.Cmv r2 = r14.A01     // Catch:{ all -> 0x0207 }
            if (r2 != 0) goto L_0x01bd
            X.CjS r7 = r14.A03     // Catch:{ all -> 0x0207 }
            X.Cr9 r6 = r14.A05     // Catch:{ all -> 0x0207 }
            X.Cgd r4 = new X.Cgd     // Catch:{ all -> 0x0207 }
            r4.<init>()     // Catch:{ all -> 0x0207 }
            X.Cjt r0 = r14.A07     // Catch:{ all -> 0x0207 }
            X.Cmv r2 = new X.Cmv     // Catch:{ all -> 0x0207 }
            r2.<init>(r7, r6, r4, r0)     // Catch:{ all -> 0x0207 }
            r14.A01 = r2     // Catch:{ all -> 0x0207 }
        L_0x01bd:
            r13.A02 = r2     // Catch:{ all -> 0x0207 }
            X.CjS r8 = r13.A04     // Catch:{ all -> 0x0207 }
            X.DE4[] r0 = r13.A08     // Catch:{ all -> 0x0207 }
            int r1 = r1 % r3
            r0 = r0[r1]     // Catch:{ all -> 0x0207 }
            X.DE1 r9 = r0.A08     // Catch:{ all -> 0x0207 }
            r10 = 0
            X.DDm r7 = new X.DDm     // Catch:{ all -> 0x0207 }
            r7.<init>(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0207 }
            r2.A04(r7, r12)     // Catch:{ all -> 0x0207 }
        L_0x01d1:
            r13.A03 = r11     // Catch:{ all -> 0x0207 }
        L_0x01d3:
            java.util.Iterator r3 = X.AnonymousClass000.A15(r5)     // Catch:{ all -> 0x0207 }
        L_0x01d7:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0207 }
            if (r0 == 0) goto L_0x01fa
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r3)     // Catch:{ all -> 0x0207 }
            java.lang.Object r2 = r0.getValue()     // Catch:{ all -> 0x0207 }
            X.EDG r2 = (X.EDG) r2     // Catch:{ all -> 0x0207 }
            java.util.Map r1 = r13.A06     // Catch:{ all -> 0x0207 }
            java.lang.Object r0 = r0.getKey()     // Catch:{ all -> 0x0207 }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x0207 }
            X.Cmv r0 = (X.C25841Cmv) r0     // Catch:{ all -> 0x0207 }
            X.C26159CtX.A01(r0)     // Catch:{ all -> 0x0207 }
            r2.CF9(r0, r15)     // Catch:{ all -> 0x0207 }
            goto L_0x01d7
        L_0x01fa:
            X.DDv r1 = r13.A00     // Catch:{ all -> 0x0207 }
            if (r1 == 0) goto L_0x020f
            X.Cmv r0 = r13.A02     // Catch:{ all -> 0x0207 }
            X.C26159CtX.A01(r0)     // Catch:{ all -> 0x0207 }
            r1.CF9(r0, r15)     // Catch:{ all -> 0x0207 }
            goto L_0x020f
        L_0x0207:
            r2 = move-exception
            X.Cr9 r1 = r13.A01     // Catch:{ all -> 0x0213 }
            java.lang.String r0 = "CompositeMediaGraph.render() failed."
            X.C27222Da1.A00(r1, r0, r2)     // Catch:{ all -> 0x0213 }
        L_0x020f:
            android.os.Trace.endSection()
            return
        L_0x0213:
            r0 = move-exception
            android.os.Trace.endSection()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26787DDu.CF9(X.Cmv, java.lang.Long):void");
    }

    public void CRE(int i, int i2, int i3, int i4, int i5, boolean z) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z2;
        Iterator A0l = C17890vO.A0l(this.A07);
        while (true) {
            i6 = i;
            i7 = i2;
            i8 = i3;
            i9 = i4;
            i10 = i5;
            z2 = z;
            if (!A0l.hasNext()) {
                break;
            }
            ((EDG) A0l.next()).CRE(i6, i7, i8, i9, i10, z2);
        }
        DDv dDv = this.A00;
        if (dDv != null) {
            dDv.CRE(i6, i7, i8, i9, i10, z2);
        }
    }

    public void release() {
        Iterator A0l = C17890vO.A0l(this.A07);
        while (A0l.hasNext()) {
            ((E98) A0l.next()).release();
        }
        DDv dDv = this.A00;
        if (dDv != null) {
            dDv.release();
        }
    }

    public C26787DDu(C25639CjS cjS) {
        this.A04 = cjS;
    }

    public void CCl(C28560E7m e7m) {
        C0O Bap = e7m.Bap();
        if (Bap == C0O.A04 || Bap == C0O.A0j) {
            Iterator A0l = C17890vO.A0l(this.A07);
            while (A0l.hasNext()) {
                EDG edg = (EDG) A0l.next();
                if (edg instanceof C28562E7o) {
                    ((C28562E7o) edg).CCl(e7m);
                }
            }
            return;
        }
        DDv dDv = this.A00;
        if (dDv != null) {
            DDv.A06(dDv, e7m, (C28561E7n) null);
        }
    }
}
