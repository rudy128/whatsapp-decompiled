package X;

import java.util.ArrayList;

/* renamed from: X.8p8  reason: invalid class name */
public final class AnonymousClass8p8 extends C123466Uo {
    public final AnonymousClass1W7 A00;
    public final AnonymousClass1WM A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;

    public ArrayList A02(AnonymousClass205 r7, int i, long j) {
        C18070vi.A0d(r7, 0);
        return ((ARP) this.A05.get()).A03(r7, 1, i, j);
    }

    public ArrayList A01(int i, long j) {
        return ((ARP) this.A05.get()).A02(1, i, j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0123, code lost:
        if (r9 != null) goto L_0x0125;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0127, code lost:
        if (r2 == null) goto L_0x0129;
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(java.util.List r18, java.util.Set r19) {
        /*
            r17 = this;
            r0 = r18
            r4 = r19
            X.C18070vi.A0h(r0, r4)
            java.util.LinkedHashSet r3 = X.C17880vN.A14()
            java.util.Iterator r16 = r0.iterator()
        L_0x000f:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0141
            java.lang.Object r10 = r16.next()
            X.9tq r10 = (X.C195749tq) r10
            java.lang.Long r6 = r10.A07
            X.205 r9 = r10.A06
            X.1Dv r0 = X.AnonymousClass1BI.A00
            com.whatsapp.jid.Jid r0 = r10.A03
            X.1BI r8 = X.C22931Dv.A00(r0)
            java.lang.String r5 = " parentKeyId="
            if (r6 == 0) goto L_0x0123
            if (r9 == 0) goto L_0x0129
            X.1BI r0 = r9.A00
            if (r0 == 0) goto L_0x0125
            boolean r0 = r3.contains(r9)
            if (r0 == 0) goto L_0x0049
            java.lang.String r2 = r9.A01
            java.lang.StringBuilder r1 = X.C108955ca.A15(r2)
            java.lang.String r0 = "MessageAddOnOrphanResolver/processOrphanBatch/no parent orphanId="
            r1.append(r0)
            r1.append(r6)
            X.C17900vP.A0g(r5, r2, r1)
            goto L_0x000f
        L_0x0049:
            r2 = r17
            X.00H r0 = r2.A02
            X.206 r7 = X.AnonymousClass1W2.A01(r9, r0)
            if (r7 != 0) goto L_0x0061
            X.00H r0 = r2.A04
            java.lang.Object r0 = r0.get()
            X.2mE r0 = (X.C59392mE) r0
            X.206 r7 = r0.A00(r9)
            if (r7 == 0) goto L_0x011e
        L_0x0061:
            boolean r0 = X.C20133A8t.A0B(r7)
            if (r0 != 0) goto L_0x011e
            X.1W7 r5 = r2.A00
            long r0 = r7.A0x
            byte[] r11 = r5.A01(r0)
            X.205 r15 = r10.A05
            com.whatsapp.jid.Jid r0 = r10.A04
            X.1BI r12 = X.C22931Dv.A00(r0)
            long r0 = r10.A02
            byte[] r5 = r10.A08
            byte[] r14 = r10.A09
            java.lang.String r10 = "MessageAddOnOrphanResolver/buildFMessageAddOn/failed to parse orphan message"
            r13 = 0
            if (r5 != 0) goto L_0x0088
            java.lang.String r0 = "MessageAddOnOrphanResolver/buildFMessageAddOn/Orphan data is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x000f
        L_0x0088:
            X.8cr r5 = X.C166418cr.A01(r5)     // Catch:{ 1PN -> 0x0118 }
            X.C18070vi.A0b(r5)     // Catch:{ 1PN -> 0x0118 }
            if (r14 == 0) goto L_0x00a2
            X.8av r13 = X.C165308av.DEFAULT_INSTANCE     // Catch:{ 1PN -> 0x009a }
            X.Bm6 r13 = X.C23577Bm6.A07(r13, r14)     // Catch:{ 1PN -> 0x009a }
            X.8av r13 = (X.C165308av) r13     // Catch:{ 1PN -> 0x009a }
            goto L_0x00a2
        L_0x009a:
            r1 = move-exception
            java.lang.String r0 = "MessageAddOnOrphanResolver/buildFMessageAddOn/failed to parse orphan stanza data"
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x000f
        L_0x00a2:
            X.9p8 r5 = X.C196699vU.A00(r5, r15, r0)
            r5.A02 = r12
            if (r13 == 0) goto L_0x00b4
            int r0 = r13.bitField0_
            r0 = r0 & 2
            if (r0 == 0) goto L_0x00b4
            int r0 = r13.editVersion_
            r5.A00 = r0
        L_0x00b4:
            X.00H r0 = r2.A03     // Catch:{  }
            java.lang.Object r1 = r0.get()     // Catch:{  }
            X.12N r1 = (X.AnonymousClass12N) r1     // Catch:{  }
            X.A6d r0 = r5.A00()     // Catch:{  }
            X.206 r5 = r1.A00(r0)     // Catch:{  }
            boolean r0 = r5 instanceof X.AnonymousClass212     // Catch:{  }
            if (r0 == 0) goto L_0x000f
            X.212 r5 = (X.AnonymousClass212) r5     // Catch:{  }
            if (r5 == 0) goto L_0x000f
            r5.A0d(r12)
            X.A51 r0 = new X.A51
            r0.<init>(r8, r9)
            r5.A05 = r0
            if (r11 == 0) goto L_0x00da
            r5.A1D = r11
        L_0x00da:
            boolean r0 = r7 instanceof X.AnonymousClass23U
            if (r0 == 0) goto L_0x00e4
            boolean r0 = r5 instanceof X.AnonymousClass22E
            if (r0 == 0) goto L_0x00e4
            goto L_0x000f
        L_0x00e4:
            boolean r0 = r7 instanceof X.AnonymousClass213
            if (r0 == 0) goto L_0x00ee
            X.A51 r0 = X.A51.A00(r7)
            r5.A05 = r0
        L_0x00ee:
            X.1WM r2 = r2.A01
            r0 = 0
            int r1 = X.AnonymousClass1WM.A00(r2, r5, r0)
            boolean r0 = X.C63792th.A02(r1)
            if (r0 != 0) goto L_0x00fe
            r0 = 5
            if (r1 != r0) goto L_0x0101
        L_0x00fe:
            r4.add(r6)
        L_0x0101:
            r0 = 8
            if (r1 == r0) goto L_0x010b
            r0 = 9
            if (r1 == r0) goto L_0x010b
            goto L_0x000f
        L_0x010b:
            boolean r0 = r5 instanceof X.AnonymousClass22C
            if (r0 == 0) goto L_0x000f
            X.1WF r0 = r2.A0B
            X.22C r5 = (X.AnonymousClass22C) r5
            r0.A03(r5)
            goto L_0x000f
        L_0x0118:
            r0 = move-exception
            com.whatsapp.util.Log.e(r10, r0)
            goto L_0x000f
        L_0x011e:
            r3.add(r9)
            goto L_0x000f
        L_0x0123:
            if (r9 == 0) goto L_0x0129
        L_0x0125:
            java.lang.String r2 = r9.A01
            if (r2 != 0) goto L_0x012b
        L_0x0129:
            java.lang.String r2 = ""
        L_0x012b:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "MessageAddOnOrphanResolver/processOrphanBatch/invalid orphan orphanId="
            r1.append(r0)
            r1.append(r6)
            X.C17900vP.A0g(r5, r2, r1)
            if (r6 == 0) goto L_0x000f
            r4.add(r6)
            goto L_0x000f
        L_0x0141:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8p8.A03(java.util.List, java.util.Set):void");
    }

    public AnonymousClass8p8(AnonymousClass1W7 r2, AnonymousClass1WM r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7) {
        C18070vi.A0w(r4, r5, r2, r6, r3);
        C18070vi.A0d(r7, 6);
        this.A02 = r4;
        this.A05 = r5;
        this.A00 = r2;
        this.A04 = r6;
        this.A01 = r3;
        this.A03 = r7;
    }

    public String A00() {
        return "MessageAddOnOrphanResolver";
    }
}
