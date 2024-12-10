package X;

import java.lang.ref.WeakReference;
import java.util.Set;

/* renamed from: X.Cku  reason: case insensitive filesystem */
public final class C25724Cku {
    public E4O A00;
    public final Set A01 = C17880vN.A14();
    public final C25590CiV A02;

    public synchronized void A01() {
        C25590CiV ciV = this.A02;
        synchronized (ciV) {
            C26294Cx6.A04("AleProviderRegistery", "[RemoveAleProviderReference]");
            int decrementAndGet = ciV.A04.decrementAndGet();
            C26294Cx6.A04("AleProviderRegistery", AnonymousClass001.A1I("[RemoveAleProviderReference] currentCount: ", AnonymousClass000.A10(), decrementAndGet));
            if (decrementAndGet == 0) {
                C26294Cx6.A04("AleProviderRegistery", "[RemoveAleProviderReference] clearing out aleProvider");
                WeakReference weakReference = ciV.A01;
                if (weakReference != null) {
                    E4O e4o = (E4O) weakReference.get();
                    if (e4o != null) {
                        C26294Cx6.A04("AleProviderImpl", "[Destroy]");
                        EAU eau = ((DBR) e4o).A00;
                        if (eau == null) {
                            C18070vi.A11("aleBridge");
                            throw null;
                        }
                        eau.CEo();
                    }
                    weakReference.clear();
                }
                ciV.A00 = null;
            }
        }
        synchronized (ciV) {
            ciV.A03.remove(this);
        }
        this.A00 = null;
        A00();
    }

    private final void A00() {
        for (C26651D8a d8a : this.A01) {
            E4O e4o = this.A00;
            WeakReference weakReference = d8a.A01;
            if (weakReference != null) {
                weakReference.clear();
            }
            if (e4o != null) {
                d8a.A01 = AnonymousClass3MW.A0z(e4o);
                EAU eau = ((DBR) e4o).A00;
                if (eau == null) {
                    C18070vi.A11("aleBridge");
                    throw null;
                }
                eau.CDu(d8a);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: X.DBR} */
    /* JADX WARNING: type inference failed for: r1v5, types: [X.CU0, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void A02(X.C25243Cbe r19) {
        /*
            r18 = this;
            r14 = r18
            monitor-enter(r14)
            X.E4O r0 = r14.A00     // Catch:{ all -> 0x015c }
            if (r0 != 0) goto L_0x015a
            X.CiV r13 = r14.A02     // Catch:{ all -> 0x015c }
            monitor-enter(r13)     // Catch:{ all -> 0x015c }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0157 }
            r2 = r19
            java.lang.String r0 = r2.A0E     // Catch:{ all -> 0x0157 }
            r1.append(r0)     // Catch:{ all -> 0x0157 }
            r0 = 124(0x7c, float:1.74E-43)
            r1.append(r0)     // Catch:{ all -> 0x0157 }
            java.lang.String r0 = r2.A0F     // Catch:{ all -> 0x0157 }
            java.lang.String r12 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ all -> 0x0157 }
            java.lang.String r3 = "AleProviderRegistery"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0157 }
            java.lang.String r0 = "[GetAleProvider] requestedAleKey: "
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r12, r1)     // Catch:{ all -> 0x0157 }
            X.C26294Cx6.A04(r3, r0)     // Catch:{ all -> 0x0157 }
            java.lang.ref.WeakReference r0 = r13.A01     // Catch:{ all -> 0x0157 }
            r5 = 0
            if (r0 == 0) goto L_0x003c
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0157 }
            X.E4O r0 = (X.E4O) r0     // Catch:{ all -> 0x0157 }
            if (r0 != 0) goto L_0x0044
        L_0x003c:
            r13.A00 = r5     // Catch:{ all -> 0x0157 }
            java.util.concurrent.atomic.AtomicInteger r1 = r13.A04     // Catch:{ all -> 0x0157 }
            r0 = 0
            r1.set(r0)     // Catch:{ all -> 0x0157 }
        L_0x0044:
            java.lang.String r0 = r13.A00     // Catch:{ all -> 0x0157 }
            boolean r0 = X.C18070vi.A18(r12, r0)     // Catch:{ all -> 0x0157 }
            if (r0 == 0) goto L_0x007d
            java.lang.String r0 = "[GetAleProvider] matches current aleProviderKey"
            X.C26294Cx6.A04(r3, r0)     // Catch:{ all -> 0x0157 }
            java.lang.ref.WeakReference r0 = r13.A01     // Catch:{ all -> 0x0157 }
            if (r0 == 0) goto L_0x0078
            java.lang.Object r11 = r0.get()     // Catch:{ all -> 0x0157 }
            X.E4O r11 = (X.E4O) r11     // Catch:{ all -> 0x0157 }
            if (r11 == 0) goto L_0x0078
            java.util.concurrent.atomic.AtomicInteger r2 = r13.A04     // Catch:{ all -> 0x0157 }
            r2.incrementAndGet()     // Catch:{ all -> 0x0157 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0157 }
            java.lang.String r0 = "[GetAleProvider] currentCount: "
            r1.append(r0)     // Catch:{ all -> 0x0157 }
            int r0 = r2.get()     // Catch:{ all -> 0x0157 }
            java.lang.String r0 = X.C17880vN.A0t(r1, r0)     // Catch:{ all -> 0x0157 }
            X.C26294Cx6.A04(r3, r0)     // Catch:{ all -> 0x0157 }
            goto L_0x0149
        L_0x0078:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()     // Catch:{ all -> 0x0157 }
            throw r0     // Catch:{ all -> 0x0157 }
        L_0x007d:
            java.lang.String r0 = "[GetAleProvider] doesn't matches current aleProviderKey"
            X.C26294Cx6.A04(r3, r0)     // Catch:{ all -> 0x0157 }
            X.CQf r0 = r13.A02     // Catch:{ all -> 0x0157 }
            X.DBR r11 = new X.DBR     // Catch:{ all -> 0x0157 }
            r11.<init>(r2, r0)     // Catch:{ all -> 0x0157 }
            X.EAU r0 = r11.A00     // Catch:{ all -> 0x0157 }
            if (r0 != 0) goto L_0x011c
            X.CQf r4 = r11.A02     // Catch:{ all -> 0x0157 }
            X.Cbe r1 = r11.A01     // Catch:{ all -> 0x0157 }
            X.BVe r2 = r4.A00     // Catch:{ all -> 0x0157 }
            r0 = 114(0x72, float:1.6E-43)
            java.io.File r3 = r2.A00(r0)     // Catch:{ all -> 0x0157 }
            r3.mkdirs()     // Catch:{ all -> 0x0157 }
            X.0wl r2 = r4.A02     // Catch:{ all -> 0x0157 }
            X.1OE r0 = new X.1OE     // Catch:{ all -> 0x0157 }
            r0.<init>(r5)     // Catch:{ all -> 0x0157 }
            X.0wh r10 = X.AnonymousClass1OQ.A03(r2, r0)     // Catch:{ all -> 0x0157 }
            r3.getCanonicalPath()     // Catch:{ all -> 0x0157 }
            java.lang.String r0 = r3.getCanonicalPath()     // Catch:{ all -> 0x0157 }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x0157 }
            X.CMf r9 = new X.CMf     // Catch:{ all -> 0x0157 }
            r9.<init>(r0)     // Catch:{ all -> 0x0157 }
            X.CLh r0 = r4.A01     // Catch:{ all -> 0x0157 }
            X.10H r0 = r0.A00     // Catch:{ all -> 0x0157 }
            X.10E r0 = r0.A00     // Catch:{ all -> 0x0157 }
            X.10G r3 = r0.A00     // Catch:{ all -> 0x0157 }
            X.00S r0 = r3.A2B     // Catch:{ all -> 0x0157 }
            java.lang.Object r2 = r0.get()     // Catch:{ all -> 0x0157 }
            X.6aw r2 = (X.C125356aw) r2     // Catch:{ all -> 0x0157 }
            X.6eg r0 = X.AnonymousClass10G.A92(r3)     // Catch:{ all -> 0x0157 }
            X.D8b r8 = new X.D8b     // Catch:{ all -> 0x0157 }
            r8.<init>(r2, r0, r10)     // Catch:{ all -> 0x0157 }
            r9.A00 = r8     // Catch:{ all -> 0x0157 }
            java.lang.String r0 = r1.A0E     // Catch:{ all -> 0x0157 }
            r17 = r0
            java.lang.String r0 = r1.A0F     // Catch:{ all -> 0x0157 }
            r16 = r0
            java.lang.Integer r15 = r1.A06     // Catch:{ all -> 0x0157 }
            boolean r0 = r1.A0I     // Catch:{ all -> 0x0157 }
            if (r0 == 0) goto L_0x0146
            java.lang.Integer r7 = X.AnonymousClass00R.A00     // Catch:{ all -> 0x0157 }
        L_0x00e1:
            java.lang.String r6 = r1.A0C     // Catch:{ all -> 0x0157 }
            java.lang.Integer r5 = r1.A0B     // Catch:{ all -> 0x0157 }
            java.lang.Integer r4 = r1.A09     // Catch:{ all -> 0x0157 }
            java.lang.Integer r3 = r1.A0A     // Catch:{ all -> 0x0157 }
            java.lang.Integer r2 = r1.A08     // Catch:{ all -> 0x0157 }
            X.CU0 r1 = new X.CU0     // Catch:{ all -> 0x0157 }
            r1.<init>()     // Catch:{ all -> 0x0157 }
            r0 = r17
            r1.A09 = r0     // Catch:{ all -> 0x0157 }
            r0 = r16
            r1.A0A = r0     // Catch:{ all -> 0x0157 }
            java.lang.String r0 = r9.A01     // Catch:{ all -> 0x0157 }
            r1.A07 = r0     // Catch:{ all -> 0x0157 }
            r1.A02 = r7     // Catch:{ all -> 0x0157 }
            r1.A08 = r6     // Catch:{ all -> 0x0157 }
            r1.A00 = r8     // Catch:{ all -> 0x0157 }
            r1.A01 = r15     // Catch:{ all -> 0x0157 }
            r1.A04 = r4     // Catch:{ all -> 0x0157 }
            r1.A06 = r5     // Catch:{ all -> 0x0157 }
            r1.A03 = r2     // Catch:{ all -> 0x0157 }
            r1.A05 = r3     // Catch:{ all -> 0x0157 }
            X.D8Y r2 = new X.D8Y     // Catch:{ all -> 0x0157 }
            r2.<init>(r1)     // Catch:{ all -> 0x0157 }
            r0 = 0
            X.C18070vi.A0d(r10, r0)     // Catch:{ all -> 0x0157 }
            X.D8Z r0 = new X.D8Z     // Catch:{ all -> 0x0157 }
            r0.<init>(r2, r10)     // Catch:{ all -> 0x0157 }
            r11.A00 = r0     // Catch:{ all -> 0x0157 }
        L_0x011c:
            java.util.concurrent.atomic.AtomicInteger r1 = r13.A04     // Catch:{ all -> 0x0157 }
            r0 = 1
            r1.set(r0)     // Catch:{ all -> 0x0157 }
            java.lang.ref.WeakReference r0 = r13.A01     // Catch:{ all -> 0x0157 }
            if (r0 == 0) goto L_0x0129
            r0.clear()     // Catch:{ all -> 0x0157 }
        L_0x0129:
            java.lang.ref.WeakReference r0 = X.AnonymousClass3MW.A0z(r11)     // Catch:{ all -> 0x0157 }
            r13.A01 = r0     // Catch:{ all -> 0x0157 }
            r13.A00 = r12     // Catch:{ all -> 0x0157 }
            java.util.List r0 = r13.A03     // Catch:{ all -> 0x0157 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0157 }
        L_0x0137:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0157 }
            if (r0 == 0) goto L_0x0149
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0157 }
            X.Cku r0 = (X.C25724Cku) r0     // Catch:{ all -> 0x0157 }
            r0.A00 = r11     // Catch:{ all -> 0x0157 }
            goto L_0x0137
        L_0x0146:
            java.lang.Integer r7 = X.AnonymousClass00R.A01     // Catch:{ all -> 0x0157 }
            goto L_0x00e1
        L_0x0149:
            monitor-exit(r13)     // Catch:{ all -> 0x015c }
            r14.A00 = r11     // Catch:{ all -> 0x015c }
            monitor-enter(r13)     // Catch:{ all -> 0x015c }
            java.util.List r0 = r13.A03     // Catch:{ all -> 0x0157 }
            r0.add(r14)     // Catch:{ all -> 0x0157 }
            monitor-exit(r13)     // Catch:{ all -> 0x015c }
            r14.A00()     // Catch:{ all -> 0x015c }
            goto L_0x015a
        L_0x0157:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x015c }
            throw r0     // Catch:{ all -> 0x015c }
        L_0x015a:
            monitor-exit(r14)
            return
        L_0x015c:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25724Cku.A02(X.Cbe):void");
    }

    public C25724Cku(C25590CiV ciV) {
        this.A02 = ciV;
    }
}
