package X;

import java.util.HashMap;
import java.util.List;

/* renamed from: X.DGn  reason: case insensitive filesystem */
public final class C26856DGn implements C28562E7o {
    public final C24854CMx A00 = new C24854CMx();
    public final C25553Chr A01 = new C25553Chr();
    public final HashMap A02 = C17880vN.A11();

    public void A00(C28561E7n e7n, C0O c0o) {
        C24853CMw cMw;
        C18070vi.A0d(e7n, 0);
        C25132CZh cZh = this.A00.A00;
        List list = cZh.A00;
        int A08 = BE7.A08(list);
        int i = 0;
        while (true) {
            if (i >= A08) {
                cMw = new C24853CMw(e7n);
                cZh.A01(cMw);
                break;
            }
            cMw = (C24853CMw) list.get(i);
            if (cMw.A00 == e7n) {
                break;
            }
            i++;
        }
        cMw.A01.add(c0o);
        C25553Chr chr = this.A01;
        if (c0o.shouldNotifyEventListenerRegistration) {
            int ordinal = c0o.ordinal();
            chr.A02[ordinal] = true;
            E53[] e53Arr = chr.A01;
            if (e53Arr[ordinal] != null && chr.A00.get()) {
                E53 e53 = e53Arr[ordinal];
                C18070vi.A0b(e53);
                e53.BJu();
            }
        }
        C28560E7m e7m = (C28560E7m) this.A02.get(c0o);
        if (e7m != null) {
            e7n.C3B(e7m);
        }
    }

    public void A02(E53 e53) {
        C0O c0o;
        C18070vi.A0d(e53, 0);
        C25553Chr chr = this.A01;
        E53[] e53Arr = chr.A01;
        if (((C26857DGo) e53).A00 != 0) {
            c0o = C0O.EXTERNAL_WORLD_TRACKING_EVENT;
        } else {
            c0o = C0O.INPUT_PREVIEW;
        }
        e53Arr[c0o.ordinal()] = e53;
        C25553Chr.A00(chr);
    }

    public void CCl(C28560E7m e7m) {
        CCm(e7m, (C28561E7n) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0049, code lost:
        r4 = r8.ordinal();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.C28561E7n r7, X.C0O r8) {
        /*
            r6 = this;
            X.CMx r0 = r6.A00
            X.CZh r5 = r0.A00
            java.util.List r4 = r5.A00
            int r3 = X.BE7.A08(r4)
            r2 = 0
        L_0x000b:
            if (r2 >= r3) goto L_0x0025
            java.lang.Object r1 = r4.get(r2)
            X.CMw r1 = (X.C24853CMw) r1
            X.E7n r0 = r1.A00
            if (r0 != r7) goto L_0x003f
            java.util.HashSet r0 = r1.A01
            r0.remove(r8)
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0025
            r5.A02(r1)
        L_0x0025:
            java.util.List r3 = r5.A00
            int r2 = X.BE7.A08(r3)
            r1 = 0
        L_0x002c:
            if (r1 >= r2) goto L_0x0042
            java.lang.Object r0 = r3.get(r1)
            X.CMw r0 = (X.C24853CMw) r0
            java.util.HashSet r0 = r0.A01
            boolean r0 = r0.contains(r8)
            if (r0 != 0) goto L_0x0095
            int r1 = r1 + 1
            goto L_0x002c
        L_0x003f:
            int r2 = r2 + 1
            goto L_0x000b
        L_0x0042:
            X.Chr r1 = r6.A01
            r3 = 0
            boolean r0 = r8.shouldNotifyEventListenerRegistration
            if (r0 == 0) goto L_0x0095
            int r4 = r8.ordinal()
            X.E53[] r0 = r1.A01
            r2 = r0[r4]
            if (r2 == 0) goto L_0x0095
            boolean[] r1 = r1.A02
            boolean r0 = r1[r4]
            if (r0 == 0) goto L_0x0095
            r1[r4] = r3
            X.DGo r2 = (X.C26857DGo) r2
            int r0 = r2.A00
            if (r0 == 0) goto L_0x0073
            java.lang.Object r2 = r2.A01
            X.BUG r2 = (X.BUG) r2
            monitor-enter(r2)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x0070 }
            r0 = 0
            X.BUG.A00(r2, r1, r0)     // Catch:{ all -> 0x0070 }
            monitor-exit(r2)
            return
        L_0x0070:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0073:
            java.lang.Object r0 = r2.A01
            X.DDv r0 = (X.DDv) r0
            X.DDj r2 = r0.A0K
            if (r2 == 0) goto L_0x0095
            boolean r0 = r2.A02
            if (r0 == 0) goto L_0x0095
            X.CyL r0 = r2.A04
            r0.A0G = r3
            android.os.Handler r1 = r0.A08
            java.lang.Runnable r0 = r0.A0A
            r1.post(r0)
            X.DE4 r1 = r2.A00
            if (r1 == 0) goto L_0x0093
            X.DDn r0 = r2.A01
            r0.A03(r1)
        L_0x0093:
            r2.A02 = r3
        L_0x0095:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26856DGn.A01(X.E7n, X.C0O):void");
    }

    public void CCm(C28560E7m e7m, C28561E7n e7n) {
        C0O Bap = e7m.Bap();
        if (Bap.isCacheableEvent) {
            this.A02.put(Bap, e7m);
        }
        C24854CMx cMx = this.A00;
        if (cMx.A01.get()) {
            List list = cMx.A00.A00;
            int A08 = BE7.A08(list);
            for (int i = 0; i < A08; i++) {
                C24853CMw cMw = (C24853CMw) list.get(i);
                if ((e7n == null || e7n == cMw.A00) && cMw.A01.contains(Bap)) {
                    cMw.A00.C3B(e7m);
                }
            }
        }
    }
}
