package X;

import java.util.Set;

/* renamed from: X.340  reason: invalid class name */
public final class AnonymousClass340 implements C72443Lz {
    public final C19880zA A00;
    public final AnonymousClass1P1 A01;
    public final C55282fW A02;
    public final C18030ve A03;
    public final AnonymousClass12N A04;
    public final C52572b8 A05;

    public AnonymousClass340(C19880zA r2, AnonymousClass1P1 r3, C55282fW r4, C18030ve r5, AnonymousClass12N r6, C52572b8 r7) {
        C18070vi.A0s(r5, r4, r6, r2);
        C18070vi.A0d(r3, 6);
        this.A03 = r5;
        this.A02 = r4;
        this.A04 = r6;
        this.A00 = r2;
        this.A05 = r7;
        this.A01 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c7, code lost:
        if (r1 != null) goto L_0x00cf;
     */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00f1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BLq(X.C196049uN r8, X.C195829ty r9, X.A1O r10) {
        /*
            r7 = this;
            X.C18070vi.A0h(r10, r9)
            X.2pc r2 = new X.2pc
            r2.<init>()
            com.whatsapp.jid.Jid r0 = r10.A06
            X.1BI r0 = X.C22971Dz.A00(r0)
            X.C17960vV.A07(r0)
            X.C18070vi.A0X(r0)
            X.0zA r1 = r7.A00
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x0026
            r1.A03()
            java.lang.String r0 = "isPremiumMessageChat"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x0026:
            X.206 r3 = r9.A03
            if (r3 == 0) goto L_0x0138
            X.12N r4 = r7.A04
            X.00H r0 = r4.A08
            java.lang.Object r0 = X.C18070vi.A0E(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r1 = r0.iterator()
        L_0x0038:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0048
            java.lang.Object r0 = r1.next()
            X.3L5 r0 = (X.AnonymousClass3L5) r0
            r0.BCD(r3, r2)
            goto L_0x0038
        L_0x0048:
            X.0vl r0 = r4.A0B
            java.lang.Object r0 = r0.getValue()
            X.20Z r0 = (X.AnonymousClass20Z) r0
            int r5 = r3.A0u
            X.20A r1 = r0.A00(r5)
            X.20m r1 = (X.C436820m) r1
            boolean r0 = r1 instanceof X.AnonymousClass3LE
            if (r0 == 0) goto L_0x0061
            X.3LE r1 = (X.AnonymousClass3LE) r1
            r1.BCD(r3, r2)
        L_0x0061:
            X.2fW r4 = r7.A02
            X.2Qs r6 = r3.A0J
            java.lang.Class<X.9Mg> r1 = X.C180369Mg.class
            monitor-enter(r1)
            java.lang.Class<X.Abz> r0 = X.C20945Abz.class
            X.229 r0 = X.AnonymousClass206.A01(r3, r0)     // Catch:{ all -> 0x00ca }
            X.Abz r0 = (X.C20945Abz) r0     // Catch:{ all -> 0x00ca }
            monitor-exit(r1)
            if (r0 == 0) goto L_0x00b3
            java.lang.Integer r0 = r0.A00
            int r0 = r0.intValue()
            switch(r0) {
                case 0: goto L_0x0082;
                case 1: goto L_0x0085;
                case 2: goto L_0x0088;
                case 3: goto L_0x008b;
                case 4: goto L_0x008e;
                case 5: goto L_0x0092;
                case 6: goto L_0x0096;
                case 7: goto L_0x009a;
                case 8: goto L_0x009e;
                case 9: goto L_0x00a1;
                case 10: goto L_0x00a4;
                case 11: goto L_0x00a7;
                case 12: goto L_0x00aa;
                case 13: goto L_0x00ad;
                case 14: goto L_0x00b0;
                case 15: goto L_0x00cd;
                default: goto L_0x007c;
            }
        L_0x007c:
            X.3EW r0 = new X.3EW
            r0.<init>()
            throw r0
        L_0x0082:
            java.lang.String r1 = "favicon"
            goto L_0x00cf
        L_0x0085:
            java.lang.String r1 = "chat_list"
            goto L_0x00cf
        L_0x0088:
            java.lang.String r1 = "nullstate_paper_plane"
            goto L_0x00cf
        L_0x008b:
            java.lang.String r1 = "nullstate_suggestion"
            goto L_0x00cf
        L_0x008e:
            java.lang.String r1 = "typeahead_suggestion"
            goto L_0x00cf
        L_0x0092:
            java.lang.String r1 = "typeahead_paper_plane"
            goto L_0x00cf
        L_0x0096:
            java.lang.String r1 = "typeahead_chat"
            goto L_0x00cf
        L_0x009a:
            java.lang.String r1 = "typeahead_chat_message"
            goto L_0x00cf
        L_0x009e:
            java.lang.String r1 = "ai_voice_search_bar"
            goto L_0x00cf
        L_0x00a1:
            java.lang.String r1 = "ai_voice_favicon"
            goto L_0x00cf
        L_0x00a4:
            java.lang.String r1 = "ai_studio"
            goto L_0x00cf
        L_0x00a7:
            java.lang.String r1 = "deeplink"
            goto L_0x00cf
        L_0x00aa:
            java.lang.String r1 = "notification"
            goto L_0x00cf
        L_0x00ad:
            java.lang.String r1 = "profile_message_button"
            goto L_0x00cf
        L_0x00b0:
            java.lang.String r1 = "forward"
            goto L_0x00cf
        L_0x00b3:
            if (r6 == 0) goto L_0x00d4
            X.2Qs r0 = X.C49502Qs.GENERAL
            if (r6 == r0) goto L_0x00d4
            X.0ve r4 = r4.A02
            r1 = 5623(0x15f7, float:7.88E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r4, r1)
            if (r0 == 0) goto L_0x00d4
            java.lang.String r1 = r6.origin
            if (r1 == 0) goto L_0x00d4
            goto L_0x00cf
        L_0x00ca:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x00cd:
            java.lang.String r1 = "app_shortcut"
        L_0x00cf:
            java.lang.String r0 = "origin"
            X.C61402pc.A00(r2, r0, r1)
        L_0x00d4:
            X.205 r0 = r3.A0v
            X.1BI r0 = r0.A00
            boolean r4 = r9.A0C
            X.2Qd r1 = r9.A00
            boolean r0 = r0 instanceof X.AnonymousClass1E2
            if (r0 != 0) goto L_0x00e2
            if (r4 == 0) goto L_0x00ed
        L_0x00e2:
            X.2Qd r0 = X.C49352Qd.ENABLED
            if (r1 != r0) goto L_0x00ed
            java.lang.String r1 = "deprecated_lid_session"
            java.lang.String r0 = "false"
            X.C61402pc.A00(r2, r1, r0)
        L_0x00ed:
            r0 = 73
            if (r5 != r0) goto L_0x00fa
            java.lang.String r1 = "share_pn"
            java.lang.String r0 = "true"
            X.C61402pc.A00(r2, r1, r0)
        L_0x00fa:
            X.0ve r4 = r7.A03
            r1 = 11282(0x2c12, float:1.581E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r4, r1)
            if (r0 == 0) goto L_0x011f
            r0 = 42
            if (r5 == r0) goto L_0x0116
            r0 = 43
            if (r5 == r0) goto L_0x0116
            r0 = 82
            if (r5 == r0) goto L_0x0116
            r0 = 78
            if (r5 != r0) goto L_0x011f
        L_0x0116:
            java.lang.String r1 = "view_once"
            java.lang.String r0 = "true"
            X.C61402pc.A00(r2, r1, r0)
        L_0x011f:
            int r0 = r10.A03
            if (r0 > 0) goto L_0x0127
            boolean r0 = r9.A07
            if (r0 == 0) goto L_0x0138
        L_0x0127:
            r0 = 134217728(0x8000000, double:6.63123685E-316)
            boolean r0 = r3.A11(r0)
            if (r0 == 0) goto L_0x0138
            java.lang.String r1 = "sender_intent"
            java.lang.String r0 = "hosted"
            X.C61402pc.A00(r2, r1, r0)
        L_0x0138:
            boolean r0 = r3 instanceof X.AnonymousClass219
            if (r0 == 0) goto L_0x0151
            X.2b8 r0 = r7.A05
            X.00H r0 = r0.A00
            java.lang.Object r0 = r0.get()
            X.2qa r0 = (X.C61972qa) r0
            java.lang.String r1 = r0.A01()
            if (r1 == 0) goto L_0x0151
            java.lang.String r0 = "liveloc_mode"
            X.C61402pc.A00(r2, r0, r1)
        L_0x0151:
            boolean r0 = r3 instanceof X.C442422r
            if (r0 == 0) goto L_0x0177
            X.36c r0 = X.C60492o7.A00(r3)
            if (r0 == 0) goto L_0x0170
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Editing appdata is not allowed for "
            r1.append(r0)
            X.205 r0 = r3.A0v
            java.lang.String r0 = r0.A01
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)
            r0 = 0
            X.C17960vV.A0F(r0, r1)
        L_0x0170:
            java.lang.String r1 = "default"
            java.lang.String r0 = "appdata"
            X.C61402pc.A00(r2, r0, r1)
        L_0x0177:
            java.util.Set r1 = r2.A01
            boolean r0 = r1.isEmpty()
            r3 = 0
            if (r0 == 0) goto L_0x0189
            java.util.List r0 = r2.A00
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0189
            return
        L_0x0189:
            boolean r0 = r1.isEmpty()
            r0 = r0 ^ 1
            r5 = 0
            if (r0 == 0) goto L_0x01bb
            X.1MD[] r0 = new X.AnonymousClass1MD[r5]
            java.lang.Object[] r4 = r1.toArray(r0)
            X.1MD[] r4 = (X.AnonymousClass1MD[]) r4
        L_0x019a:
            java.util.List r1 = r2.A00
            boolean r0 = X.AnonymousClass000.A1a(r1)
            if (r0 == 0) goto L_0x01aa
            X.1ca[] r0 = new X.C29621ca[r5]
            java.lang.Object[] r3 = r1.toArray(r0)
            X.1ca[] r3 = (X.C29621ca[]) r3
        L_0x01aa:
            java.lang.String r1 = "meta"
            X.1ca r0 = new X.1ca
            r0.<init>((java.lang.String) r1, (X.AnonymousClass1MD[]) r4, (X.C29621ca[]) r3)
            java.util.List r1 = X.C18070vi.A0M(r0)
            java.util.List r0 = r10.A0A
            r0.addAll(r1)
            return
        L_0x01bb:
            r4 = r3
            goto L_0x019a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass340.BLq(X.9uN, X.9ty, X.A1O):void");
    }

    public AnonymousClass9IM Ba7() {
        return AnonymousClass9IM.META_NODE;
    }

    public /* synthetic */ Set CGJ() {
        return C25511Om.A00;
    }

    public /* synthetic */ Set CGK() {
        return C25511Om.A00;
    }
}
