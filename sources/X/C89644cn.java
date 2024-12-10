package X;

import android.view.MenuItem;

/* renamed from: X.4cn  reason: invalid class name and case insensitive filesystem */
public class C89644cn implements MenuItem.OnMenuItemClickListener {
    public final int A00;
    public final Object A01;

    public C89644cn(C77043p2 r1, int i) {
        this.A00 = i;
        this.A01 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x008c, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x008e, code lost:
        X.C98754rf.A00(r2.A10, r2, 24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00e1, code lost:
        r4.CGF(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onMenuItemClick(android.view.MenuItem r13) {
        /*
            r12 = this;
            int r0 = r12.A00
            switch(r0) {
                case 0: goto L_0x00f7;
                case 1: goto L_0x00c2;
                case 2: goto L_0x00a7;
                case 3: goto L_0x0096;
                case 4: goto L_0x0074;
                case 5: goto L_0x004c;
                case 6: goto L_0x002d;
                case 7: goto L_0x0016;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r12.A01
            X.3p2 r0 = (X.C77043p2) r0
            com.whatsapp.community.CommunityNavigationActivity r0 = r0.A00
            X.1BI r1 = r0.A0W
            if (r1 == 0) goto L_0x0113
            X.1py r0 = r0.A0O
            boolean r0 = r0.A00(r1)
            return r0
        L_0x0016:
            java.lang.Object r0 = r12.A01
            X.3p2 r0 = (X.C77043p2) r0
            com.whatsapp.community.CommunityNavigationActivity r0 = r0.A00
            X.1BI r2 = r0.A0W
            if (r2 == 0) goto L_0x0113
            X.1py r1 = r0.A0O
            X.10I r4 = r1.A05
            r0 = 8
            X.3Bw r3 = new X.3Bw
            r3.<init>(r1, r2, r0)
            goto L_0x00e1
        L_0x002d:
            java.lang.Object r0 = r12.A01
            X.3p2 r0 = (X.C77043p2) r0
            com.whatsapp.community.CommunityNavigationActivity r2 = r0.A00
            X.1BI r5 = r2.A0W
            X.00H r0 = r2.A0d
            X.1fA r1 = X.AnonymousClass3MW.A0Y(r0)
            X.3oX r3 = new X.3oX
            r3.<init>(r5)
            r0 = 0
            X.4jV r4 = new X.4jV
            r4.<init>(r5, r2, r0)
            r6 = 1
            r1.A0C(r2, r3, r4, r5, r6)
            goto L_0x0113
        L_0x004c:
            java.lang.Object r0 = r12.A01
            X.3p2 r0 = (X.C77043p2) r0
            com.whatsapp.community.CommunityNavigationActivity r3 = r0.A00
            X.1BI r2 = r3.A0W
            r8 = 1
            if (r2 == 0) goto L_0x0113
            X.1px r1 = r3.A0P
            java.lang.Integer r0 = X.C17880vN.A0j()
            r1.A02(r2, r0)
            X.1hl r4 = r3.A0L
            X.1BI r5 = r3.A0W
            r6 = 3
            r7 = 4
            r11 = 0
            r10 = r8
            r9 = r8
            r4.A01(r5, r6, r7, r8, r9, r10, r11)
            X.1gx r0 = r3.A0Y
            r0.A08()
            X.3p1 r2 = r3.A0D
            goto L_0x008c
        L_0x0074:
            java.lang.Object r0 = r12.A01
            X.3p2 r0 = (X.C77043p2) r0
            com.whatsapp.community.CommunityNavigationActivity r4 = r0.A00
            X.1BI r3 = r4.A0W
            if (r3 == 0) goto L_0x0113
            X.1px r0 = r4.A0P
            r2 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            X.1Co r0 = r0.A06
            r0.A08(r3, r1, r2, r2)
            X.3p1 r2 = r4.A0D
        L_0x008c:
            if (r2 == 0) goto L_0x0113
            X.10s r1 = r2.A10
            r0 = 24
            X.C98754rf.A00(r1, r2, r0)
            goto L_0x0113
        L_0x0096:
            java.lang.Object r0 = r12.A01
            X.3p2 r0 = (X.C77043p2) r0
            com.whatsapp.community.CommunityNavigationActivity r0 = r0.A00
            X.1BI r2 = r0.A0W
            r1 = 1
            if (r2 == 0) goto L_0x0113
            X.1hl r0 = r0.A0L
            r0.A02(r2, r1)
            goto L_0x0113
        L_0x00a7:
            java.lang.Object r0 = r12.A01
            X.3p2 r0 = (X.C77043p2) r0
            com.whatsapp.community.CommunityNavigationActivity r0 = r0.A00
            X.1BI r2 = r0.A0W
            r5 = 1
            if (r2 == 0) goto L_0x0113
            X.1hl r1 = r0.A0L
            r3 = 3
            r4 = 4
            r8 = 0
            r7 = r5
            r6 = r5
            r1.A01(r2, r3, r4, r5, r6, r7, r8)
            X.1gx r0 = r0.A0Y
            r0.A08()
            goto L_0x0113
        L_0x00c2:
            java.lang.Object r2 = r12.A01
            X.3p2 r2 = (X.C77043p2) r2
            com.whatsapp.community.CommunityNavigationActivity r3 = r2.A00
            X.1BI r1 = r3.A0W
            if (r1 == 0) goto L_0x0113
            X.1Nb r0 = r3.A0Z
            X.1yM r0 = r0.A0a(r1)
            boolean r0 = r0.A0A()
            if (r0 == 0) goto L_0x00e5
            X.10I r4 = r3.A05
            r0 = 13
            X.4rf r3 = new X.4rf
            r3.<init>(r2, r0)
        L_0x00e1:
            r4.CGF(r3)
            goto L_0x0113
        L_0x00e5:
            X.1BI r1 = r3.A0W
            X.1i2 r0 = X.C32961i2.COMMUNITY_NAVIGATION
            com.whatsapp.mute.ui.MuteDialogFragment r2 = X.AnonymousClass4Z1.A01(r1, r0)
            X.1GP r1 = r3.getSupportFragmentManager()
            java.lang.String r0 = "MuteDialogFragment"
            r2.A2C(r1, r0)
            goto L_0x0113
        L_0x00f7:
            java.lang.Object r0 = r12.A01
            X.3p2 r0 = (X.C77043p2) r0
            com.whatsapp.community.CommunityNavigationActivity r1 = r0.A00
            X.00H r0 = r1.A0j
            java.lang.Object r4 = r0.get()
            X.1rO r4 = (X.C38501rO) r4
            X.1GP r3 = r1.getSupportFragmentManager()
            X.1BI r2 = r1.A0W
            java.lang.Integer r1 = X.C17880vN.A0k()
            r0 = 0
            r4.A05(r3, r2, r1, r0)
        L_0x0113:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89644cn.onMenuItemClick(android.view.MenuItem):boolean");
    }
}
