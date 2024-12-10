package com.whatsapp.calling.dialer;

import X.AnonymousClass12Q;
import X.C18070vi;
import X.C18600wl;
import X.C24817CLk;
import X.C678831f;

public final class DialerContactQuerySyncManager {
    public final C678831f A00;
    public final C18600wl A01;
    public final C24817CLk A02 = ((C24817CLk) AnonymousClass12Q.A01(49154));
    public final DialerHelper A03;

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b5, code lost:
        if (r1 == r6) goto L_0x00b7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(java.lang.String r13, X.C30391dr r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof X.C27399DdG
            if (r0 == 0) goto L_0x002b
            r5 = r14
            X.DdG r5 = (X.C27399DdG) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002b
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r1 = r5.result
            X.1g4 r6 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r5.label
            r4 = 4
            r8 = 3
            r10 = 2
            r3 = 1
            if (r0 == 0) goto L_0x0031
            if (r0 == r3) goto L_0x0044
            if (r0 == r10) goto L_0x00c6
            if (r0 == r8) goto L_0x00c6
            if (r0 == r4) goto L_0x00c6
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x002b:
            X.DdG r5 = new X.DdG
            r5.<init>(r12, r14)
            goto L_0x0012
        L_0x0031:
            X.C30691eM.A01(r1)
            com.whatsapp.calling.dialer.DialerHelper r0 = r12.A03
            r5.L$0 = r12
            r5.L$1 = r13
            r5.label = r3
            java.lang.Object r1 = r0.A07(r13, r5)
            if (r1 == r6) goto L_0x00b7
            r2 = r12
            goto L_0x004f
        L_0x0044:
            java.lang.Object r13 = r5.L$1
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r2 = r5.L$0
            com.whatsapp.calling.dialer.DialerContactQuerySyncManager r2 = (com.whatsapp.calling.dialer.DialerContactQuerySyncManager) r2
            X.C30691eM.A01(r1)
        L_0x004f:
            boolean r0 = X.AnonymousClass000.A1Y(r1)
            r1 = 0
            if (r0 == 0) goto L_0x00ef
            X.CLk r7 = r2.A02
            r0 = 0
            X.C18070vi.A0d(r13, r0)
            java.util.Map r0 = r7.A00
            java.lang.Object r9 = r0.get(r13)
            X.CQU r9 = (X.CQU) r9
            if (r9 == 0) goto L_0x00bf
            X.Byt[] r11 = new X.C24296Byt[r10]
            r7 = 0
            X.Byt r0 = X.C24296Byt.SUCCESS_USER_IN_WA
            r11[r7] = r0
            X.Byt r0 = X.C24296Byt.SUCCESS_USER_NOT_IN_WA
            java.util.List r7 = X.C18070vi.A0O(r0, r11, r3)
            X.Byt r0 = r9.A00
            boolean r0 = r7.contains(r0)
            if (r0 == r3) goto L_0x00f5
            X.2rf r7 = r9.A01
            if (r7 == 0) goto L_0x00bf
            X.2rf r0 = X.C62602rf.A03
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x00b8
            X.2rf r0 = X.C62602rf.A04
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x00b8
            X.2rf r0 = X.C62602rf.A02
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x00b8
            X.2rf r0 = X.C62602rf.A05
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x00ef
            java.lang.String r0 = "DialerContactQuerySyncManager/querySyncUserForPhoneNumber last try was rate limited, sending query"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r5.L$0 = r2
            r5.L$1 = r13
            r5.label = r4
        L_0x00aa:
            X.0wl r4 = r2.A01
            com.whatsapp.calling.dialer.DialerContactQuerySyncManager$querySyncUserUsingIoDispatcher$2 r0 = new com.whatsapp.calling.dialer.DialerContactQuerySyncManager$querySyncUserUsingIoDispatcher$2
            r0.<init>(r2, r13, r1)
            java.lang.Object r1 = X.C30451dy.A00(r5, r4, r0)
            if (r1 != r6) goto L_0x00d1
        L_0x00b7:
            return r6
        L_0x00b8:
            r5.L$0 = r2
            r5.L$1 = r13
            r5.label = r8
            goto L_0x00aa
        L_0x00bf:
            r5.L$0 = r2
            r5.L$1 = r13
            r5.label = r10
            goto L_0x00aa
        L_0x00c6:
            java.lang.Object r13 = r5.L$1
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r2 = r5.L$0
            com.whatsapp.calling.dialer.DialerContactQuerySyncManager r2 = (com.whatsapp.calling.dialer.DialerContactQuerySyncManager) r2
            X.C30691eM.A01(r1)
        L_0x00d1:
            android.util.Pair r1 = (android.util.Pair) r1
            X.CLk r4 = r2.A02
            r0 = 0
            X.C18070vi.A0d(r13, r0)
            X.C18070vi.A0d(r1, r3)
            java.lang.Object r2 = r1.first
            X.2rf r2 = (X.C62602rf) r2
            java.lang.Object r0 = r1.second
            X.9i3 r0 = (X.C188829i3) r0
            X.CQU r1 = new X.CQU
            r1.<init>(r2, r0, r13, r3)
            java.util.Map r0 = r4.A00
            r0.put(r13, r1)
            return r1
        L_0x00ef:
            r0 = 0
            X.CQU r9 = new X.CQU
            r9.<init>(r1, r1, r13, r0)
        L_0x00f5:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.dialer.DialerContactQuerySyncManager.A00(java.lang.String, X.1dr):java.lang.Object");
    }

    public DialerContactQuerySyncManager(DialerHelper dialerHelper, C678831f r3, C18600wl r4) {
        C18070vi.A0o(dialerHelper, r3, r4);
        this.A03 = dialerHelper;
        this.A00 = r3;
        this.A01 = r4;
    }
}
