package X;

/* renamed from: X.7Ed  reason: invalid class name and case insensitive filesystem */
public class C143627Ed implements C43451zp {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C143627Ed(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: X.5lT} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: X.5lD} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v19, resolved type: X.5lT} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: X.5lT} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BpK(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.A00
            switch(r0) {
                case 0: goto L_0x00ef;
                case 1: goto L_0x010b;
                case 2: goto L_0x002f;
                case 3: goto L_0x0005;
                case 4: goto L_0x0005;
                case 5: goto L_0x001f;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r10.A01
            X.5lD r2 = (X.C112275lD) r2
            java.lang.Object r1 = r10.A02
            java.util.List r1 = (java.util.List) r1
            X.Cl4 r11 = (X.C25734Cl4) r11
            if (r11 == 0) goto L_0x001e
            X.0vl r0 = r2.A0C
            boolean r0 = X.C72453Mb.A1a(r0)
            if (r0 == 0) goto L_0x0134
            X.0vl r0 = r2.A0A
            X.C108995ce.A1S(r1, r0)
        L_0x001e:
            return
        L_0x001f:
            java.lang.Object r2 = r10.A01
            X.5lT r2 = (X.C112435lT) r2
            java.lang.Object r0 = r10.A02
            java.util.List r0 = (java.util.List) r0
            X.Cl4 r11 = (X.C25734Cl4) r11
            if (r11 == 0) goto L_0x001e
            r2.A01 = r0
            goto L_0x0136
        L_0x002f:
            java.lang.Object r3 = r10.A01
            X.5lM r3 = (X.C112365lM) r3
            java.lang.Object r2 = r10.A02
            java.util.List r2 = (java.util.List) r2
            X.Cl4 r11 = (X.C25734Cl4) r11
            if (r11 == 0) goto L_0x001e
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Applying diff util changes, updates list size: "
            r1.append(r0)
            int r0 = r2.size()
            X.C17900vP.A0o(r1, r0)
            r3.A09 = r2
            r11.A02(r3)
            com.whatsapp.updates.ui.UpdatesFragment r3 = r3.A04
            if (r3 == 0) goto L_0x001e
            com.whatsapp.updates.viewmodels.UpdatesViewModel r0 = r3.A0P
            if (r0 == 0) goto L_0x001e
            X.1BI r6 = r0.A00
            if (r6 == 0) goto L_0x001e
            X.5lM r0 = r3.A0N
            if (r0 == 0) goto L_0x00c5
            java.util.List r0 = X.C112365lM.A06(r0)
            java.util.Iterator r7 = r0.iterator()
            r5 = 0
        L_0x0069:
            boolean r0 = r7.hasNext()
            r4 = 0
            if (r0 == 0) goto L_0x00c5
            java.lang.Object r2 = r7.next()
            int r1 = r5 + 1
            if (r5 >= 0) goto L_0x007c
            X.AnonymousClass1ZU.A0B()
            throw r4
        L_0x007c:
            X.6U0 r2 = (X.AnonymousClass6U0) r2
            boolean r0 = r2 instanceof X.C121346Jh
            if (r0 == 0) goto L_0x00ab
            r0 = r2
            X.6Jh r0 = (X.C121346Jh) r0
            if (r0 == 0) goto L_0x00ab
            X.2Dk r0 = r0.A0A
            X.1BI r0 = r0.A08()
        L_0x008d:
            boolean r0 = X.C18070vi.A18(r0, r6)
            if (r0 != 0) goto L_0x00ad
            boolean r0 = r2 instanceof X.AnonymousClass6J8
            if (r0 == 0) goto L_0x00a3
            X.6J8 r2 = (X.AnonymousClass6J8) r2
            if (r2 == 0) goto L_0x00a3
            X.2sx r0 = r2.A00()
            if (r0 == 0) goto L_0x00a3
            com.whatsapp.jid.UserJid r4 = r0.A0A
        L_0x00a3:
            boolean r0 = X.C18070vi.A18(r4, r6)
            if (r0 != 0) goto L_0x00ad
            r5 = r1
            goto L_0x0069
        L_0x00ab:
            r0 = r4
            goto L_0x008d
        L_0x00ad:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            if (r0 == 0) goto L_0x00c5
            int r2 = r0.intValue()
            com.whatsapp.updates.viewmodels.UpdatesViewModel r1 = r3.A0P
            if (r1 == 0) goto L_0x00be
            r0 = 0
            r1.A00 = r0
        L_0x00be:
            com.whatsapp.collections.ObservableRecyclerView r0 = r3.A0C
            if (r0 == 0) goto L_0x00c5
            r0.A0f(r2)
        L_0x00c5:
            com.whatsapp.updates.viewmodels.UpdatesViewModel r0 = r3.A0P
            if (r0 == 0) goto L_0x001e
            X.70D r7 = com.whatsapp.updates.viewmodels.UpdatesViewModel.A00(r0)
            java.util.List r0 = com.whatsapp.updates.viewmodels.UpdatesViewModel.A05(r0)
            java.util.ArrayList r2 = X.C29351c6.A0D(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x00d9:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x013a
            java.lang.Object r0 = r1.next()
            X.6Jh r0 = (X.C121346Jh) r0
            X.2Dk r0 = r0.A0A
            X.1BI r0 = r0.A08()
            r2.add(r0)
            goto L_0x00d9
        L_0x00ef:
            java.lang.Object r2 = r10.A01
            X.5lR r2 = (X.C112415lR) r2
            java.lang.Object r1 = r10.A02
            java.util.Collection r1 = (java.util.Collection) r1
            X.Cl4 r11 = (X.C25734Cl4) r11
            r0 = 1
            X.C18070vi.A0d(r1, r0)
            if (r11 == 0) goto L_0x001e
            java.util.List r0 = r2.A08
            r0.clear()
            r0.addAll(r1)
            r11.A02(r2)
            return
        L_0x010b:
            java.lang.Object r4 = r10.A01
            java.util.Set r4 = (java.util.Set) r4
            java.lang.Object r3 = r10.A02
            X.5jJ r3 = (X.C111255jJ) r3
            java.util.Map r11 = (java.util.Map) r11
            r0 = 0
            X.C18070vi.A0d(r4, r0)
            if (r11 == 0) goto L_0x012d
            java.util.LinkedHashMap r2 = X.C108995ce.A0b(r11)
            java.util.Iterator r1 = X.AnonymousClass000.A15(r11)
        L_0x0123:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x012e
            X.C139106yE.A00(r1, r2, r4)
            goto L_0x0123
        L_0x012d:
            r2 = 0
        L_0x012e:
            X.1DT r0 = r3.A04
            r0.A0E(r2)
            return
        L_0x0134:
            r2.A02 = r1
        L_0x0136:
            r11.A02(r2)
            return
        L_0x013a:
            java.util.Set r9 = X.C29431cG.A12(r2)
            r8 = 0
            java.lang.Object r6 = r7.A09
            monitor-enter(r6)
            java.util.Map r5 = r7.A0A     // Catch:{ all -> 0x0182 }
            java.util.Set r0 = r5.keySet()     // Catch:{ all -> 0x0182 }
            java.util.ArrayList r4 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x0182 }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x0182 }
        L_0x0150:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0182 }
            r2 = 1
            if (r0 == 0) goto L_0x0169
            java.lang.Object r1 = r3.next()     // Catch:{ all -> 0x0182 }
            r0 = r1
            X.1BI r0 = (X.AnonymousClass1BI) r0     // Catch:{ all -> 0x0182 }
            boolean r0 = r9.contains(r0)     // Catch:{ all -> 0x0182 }
            r2 = r2 ^ r0
            if (r2 == 0) goto L_0x0150
            r4.add(r1)     // Catch:{ all -> 0x0182 }
            goto L_0x0150
        L_0x0169:
            X.1BI[] r0 = new X.AnonymousClass1BI[r8]     // Catch:{ all -> 0x0182 }
            java.lang.Object[] r1 = r4.toArray(r0)     // Catch:{ all -> 0x0182 }
            r0 = r1
            X.1BI[] r0 = (X.AnonymousClass1BI[]) r0     // Catch:{ all -> 0x0182 }
            int r0 = r0.length     // Catch:{ all -> 0x0182 }
            if (r0 != 0) goto L_0x0176
            r1 = 0
        L_0x0176:
            X.1BI[] r1 = (X.AnonymousClass1BI[]) r1     // Catch:{ all -> 0x0182 }
            if (r1 == 0) goto L_0x0180
            X.AnonymousClass4Z0.A02(r5, r1)     // Catch:{ all -> 0x0182 }
            X.AnonymousClass70D.A00(r7, r5)     // Catch:{ all -> 0x0182 }
        L_0x0180:
            monitor-exit(r6)
            return
        L_0x0182:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C143627Ed.BpK(java.lang.Object):void");
    }
}
