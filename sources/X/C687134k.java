package X;

import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: X.34k  reason: invalid class name and case insensitive filesystem */
public final class C687134k implements C25471Oi, AnonymousClass3M6 {
    public final C18030ve A00;

    public C687134k(C18030ve r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public /* synthetic */ void BBw(AnonymousClass206 r1, C63362sw r2) {
    }

    public /* synthetic */ void Bvt(C63362sw r1) {
    }

    public /* synthetic */ void CB9(C63362sw r1, C29621ca r2) {
    }

    public /* synthetic */ B5J BCv(AnonymousClass206 r2, C63362sw r3) {
        return C20699AVf.A00;
    }

    public /* synthetic */ void CBF(C63362sw r1, C29621ca r2) {
    }

    public static final LinkedHashSet A00(C29621ca r4) {
        AnonymousClass1BI A02;
        LinkedHashSet A14 = C17880vN.A14();
        Iterator A03 = C29621ca.A03(r4, "to");
        while (A03.hasNext()) {
            String A022 = C29621ca.A02(C17880vN.A0a(A03), "jid");
            if (!(A022 == null || (A02 = AnonymousClass1BI.A00.A02(A022)) == null)) {
                A14.add(A02);
            }
        }
        return A14;
    }

    public String BSr() {
        return "IncomingStatusHandler";
    }

    public void Bvr(C166278cd r5, AnonymousClass206 r6, C63362sw r7) {
        C688534y r1;
        Integer num;
        AnonymousClass9Jb r0;
        C18070vi.A0i(r7, r6);
        if (!(r6 instanceof C439721q) && (r1 = (C688534y) C63362sw.A00(r7, C688534y.class)) != null) {
            C692236j A01 = C63672tV.A01(r6);
            A01.A00 = r1.A00;
            A01.A09 = r1.A03;
            A01.A05 = r1.A02;
            A01.A04 = r1.A01;
            if (C18020vd.A05(C18040vf.A02, this.A00, 12727)) {
                if (r5 != null) {
                    int i = r5.statusAttributionType_;
                    if (i == 0 || i != 1) {
                        r0 = AnonymousClass9Jb.NONE;
                    } else {
                        r0 = AnonymousClass9Jb.RESHARED_FROM_MENTION;
                    }
                    num = Integer.valueOf(r0.ordinal());
                } else {
                    num = null;
                }
                A01.A02 = AnonymousClass6WE.A00(num);
            }
        }
    }

    public /* synthetic */ long CBC(C29621ca r3) {
        return 0;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0034, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r9.A00, 9816) == false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007f, code lost:
        if (r2.equals("contacts") == false) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0089, code lost:
        if (r2.equals("allowlist") == false) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0093, code lost:
        if (r2.equals("denylist") == false) goto L_0x0018;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0057  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ X.B5K CBD(X.C194979sb r10, X.C29621ca r11) {
        /*
            r9 = this;
            X.1ca r1 = X.C18070vi.A0A(r11)
            r4 = 0
            if (r1 == 0) goto L_0x0073
            java.lang.String r0 = "status_setting"
            java.lang.String r2 = r1.A0Q(r0, r4)
            r5 = 3
            if (r2 == 0) goto L_0x0096
            int r0 = r2.hashCode()
            switch(r0) {
                case -567451565: goto L_0x0078;
                case 372737895: goto L_0x0082;
                case 895207594: goto L_0x008c;
                default: goto L_0x0018;
            }
        L_0x0018:
            r7 = 3
        L_0x0019:
            java.lang.String r0 = "status_mentioned"
            java.lang.String r2 = r1.A0Q(r0, r4)
            java.lang.String r0 = "true"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0036
            X.0ve r3 = r9.A00
            r2 = 9816(0x2658, float:1.3755E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r3, r2)
            r8 = 1
            if (r0 != 0) goto L_0x0037
        L_0x0036:
            r8 = 0
        L_0x0037:
            java.lang.String r0 = "mentioned_users"
            X.1ca r6 = r1.A0K(r0)
            if (r6 == 0) goto L_0x0076
            X.0ve r3 = r9.A00
            r2 = 9817(0x2659, float:1.3757E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r3, r2)
            if (r0 == 0) goto L_0x0076
            java.util.LinkedHashSet r6 = A00(r6)
        L_0x004f:
            java.lang.String r0 = "mention_source"
            X.1ca r3 = r1.A0K(r0)
            if (r3 == 0) goto L_0x0074
            X.0ve r2 = r9.A00
            r1 = 12254(0x2fde, float:1.7172E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0074
            java.util.LinkedHashSet r1 = A00(r3)
        L_0x0067:
            if (r7 != r5) goto L_0x0098
            if (r8 != 0) goto L_0x0098
            if (r6 == 0) goto L_0x0073
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x0098
        L_0x0073:
            return r4
        L_0x0074:
            r1 = 0
            goto L_0x0067
        L_0x0076:
            r6 = 0
            goto L_0x004f
        L_0x0078:
            java.lang.String r0 = "contacts"
            boolean r0 = r2.equals(r0)
            r7 = 0
            if (r0 != 0) goto L_0x0019
            goto L_0x0018
        L_0x0082:
            java.lang.String r0 = "allowlist"
            boolean r0 = r2.equals(r0)
            r7 = 1
            if (r0 != 0) goto L_0x0019
            goto L_0x0018
        L_0x008c:
            java.lang.String r0 = "denylist"
            boolean r0 = r2.equals(r0)
            r7 = 2
            if (r0 != 0) goto L_0x0019
            goto L_0x0018
        L_0x0096:
            r7 = 3
            goto L_0x0019
        L_0x0098:
            X.34y r4 = new X.34y
            r4.<init>(r6, r1, r7, r8)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C687134k.CBD(X.9sb, X.1ca):X.B5K");
    }

    public /* synthetic */ boolean CM6(C63362sw r2) {
        return false;
    }

    public /* synthetic */ B5I Bvs(C166418cr r2, C63362sw r3, boolean z) {
        return C20697AVd.A00;
    }
}
