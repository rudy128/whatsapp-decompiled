package X;

/* renamed from: X.4t2  reason: invalid class name and case insensitive filesystem */
public class C99544t2 implements AnonymousClass1G2 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C99544t2(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A00 = i;
        this.A01 = obj4;
        this.A04 = obj2;
        this.A03 = obj3;
        this.A02 = obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object BJt(java.lang.Object r8, X.C30391dr r9) {
        /*
            r7 = this;
            int r0 = r7.A00
            switch(r0) {
                case 0: goto L_0x00cb;
                case 1: goto L_0x00a0;
                case 2: goto L_0x0079;
                default: goto L_0x0005;
            }
        L_0x0005:
            r2 = r7
            boolean r0 = r9 instanceof X.C100834v9
            if (r0 == 0) goto L_0x0073
            r5 = r9
            X.4v9 r5 = (X.C100834v9) r5
            int r3 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x0073
            int r3 = r3 - r1
            r5.label = r3
        L_0x0018:
            java.lang.Object r1 = r5.result
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L_0x004f
            if (r0 != r3) goto L_0x0143
            java.lang.Object r8 = r5.L$1
            java.lang.Object r2 = r5.L$0
            X.4t2 r2 = (X.C99544t2) r2
            X.C30691eM.A01(r1)
        L_0x002c:
            java.lang.Object r6 = r2.A03
            X.4rF r6 = (X.C98494rF) r6
            java.lang.Object r5 = r2.A01
            X.1OX r5 = (X.AnonymousClass1OX) r5
            java.lang.Integer r4 = X.AnonymousClass00R.A0N
            java.lang.Object r3 = r2.A04
            X.5WQ r3 = (X.AnonymousClass5WQ) r3
            java.lang.Object r2 = r2.A02
            X.1G2 r2 = (X.AnonymousClass1G2) r2
            r0 = 0
            X.57L r1 = new X.57L
            r1.<init>(r8, r0, r2, r3)
            X.1OR r0 = X.AnonymousClass1OR.A00
            X.1e4 r0 = X.C30451dy.A02(r4, r0, r1, r5)
            r6.element = r0
        L_0x004c:
            X.1Wu r4 = X.C27621Wu.A00
            return r4
        L_0x004f:
            X.C30691eM.A01(r1)
            java.lang.Object r0 = r7.A03
            X.4rF r0 = (X.C98494rF) r0
            java.lang.Object r1 = r0.element
            X.1OB r1 = (X.AnonymousClass1OB) r1
            if (r1 == 0) goto L_0x002c
            X.Dc7 r0 = new X.Dc7
            r0.<init>()
            r1.BEM(r0)
            r5.L$0 = r7
            r5.L$1 = r8
            r5.L$2 = r1
            r5.label = r3
            java.lang.Object r0 = r1.BhB(r5)
            if (r0 != r4) goto L_0x002c
            return r4
        L_0x0073:
            X.4v9 r5 = new X.4v9
            r5.<init>(r7, r9)
            goto L_0x0018
        L_0x0079:
            X.206 r8 = (X.AnonymousClass206) r8
            if (r8 == 0) goto L_0x008f
            java.lang.Object r2 = r7.A04
            com.whatsapp.pininchat.expirationDialog.PinInChatExpirationDialogFragment r2 = (com.whatsapp.pininchat.expirationDialog.PinInChatExpirationDialogFragment) r2
            java.lang.Object r1 = r7.A03
            com.whatsapp.pininchat.expirationDialog.PinInChatExpirationDialogFragment r1 = (com.whatsapp.pininchat.expirationDialog.PinInChatExpirationDialogFragment) r1
            java.lang.Object r0 = r7.A02
            android.view.View r0 = (android.view.View) r0
            r2.A05 = r8
            com.whatsapp.pininchat.expirationDialog.PinInChatExpirationDialogFragment.A00(r0, r1, r8)
            goto L_0x004c
        L_0x008f:
            java.lang.Object r0 = r7.A03
            com.whatsapp.pininchat.expirationDialog.PinInChatExpirationDialogFragment r0 = (com.whatsapp.pininchat.expirationDialog.PinInChatExpirationDialogFragment) r0
            X.190 r3 = r0.A00
            if (r3 == 0) goto L_0x0148
            java.lang.String r2 = "selectedMessage is still null after querying"
            r1 = 1
            java.lang.String r0 = "PinInChatExpirationDialogFragment"
            r3.A0G(r0, r2, r1)
            goto L_0x004c
        L_0x00a0:
            boolean r1 = X.AnonymousClass000.A1Y(r8)
            java.lang.Object r0 = r7.A04
            com.whatsapp.wds.components.list.listitem.WDSListItem r0 = (com.whatsapp.wds.components.list.listitem.WDSListItem) r0
            com.whatsapp.wds.components.toggle.WDSSwitch r0 = r0.A0D
            if (r0 == 0) goto L_0x00af
            r0.setChecked(r1)
        L_0x00af:
            java.lang.Object r0 = r7.A01
            android.widget.CompoundButton r0 = (android.widget.CompoundButton) r0
            if (r0 == 0) goto L_0x00b8
            r0.setChecked(r1)
        L_0x00b8:
            java.lang.Object r0 = r7.A02
            android.view.View r0 = (android.view.View) r0
            int r1 = X.C72453Mb.A06(r1)
            r0.setVisibility(r1)
            java.lang.Object r0 = r7.A03
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r1)
            goto L_0x004c
        L_0x00cb:
            X.4D3 r8 = (X.AnonymousClass4D3) r8
            int r1 = r8.ordinal()
            r0 = 0
            if (r1 == r0) goto L_0x0115
            r0 = 1
            if (r1 == r0) goto L_0x0115
            r0 = 3
            if (r1 == r0) goto L_0x0115
            r0 = 2
            if (r1 != r0) goto L_0x014f
            java.lang.Object r2 = r7.A01
            android.view.View r2 = (android.view.View) r2
            java.lang.Object r1 = r7.A02
            com.whatsapp.CircularProgressBar r1 = (com.whatsapp.CircularProgressBar) r1
            java.lang.Object r4 = r7.A03
            android.widget.TextView r4 = (android.widget.TextView) r4
            boolean r0 = r2.isEnabled()
            if (r0 != 0) goto L_0x004c
            r0 = 1
            r2.setEnabled(r0)
            android.content.Context r3 = r2.getContext()
            r0 = 2131099728(0x7f060050, float:1.7811817E38)
            int r0 = X.C19740yt.A00(r3, r0)
            r1.A0B = r0
            r1.invalidate()
            X.C18070vi.A0b(r3)
            r2 = 2130968681(0x7f040069, float:1.7546023E38)
            r1 = 2131103410(0x7f060eb2, float:1.7819285E38)
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            X.C72463Mc.A0y(r3, r4, r2, r1)
            goto L_0x004c
        L_0x0115:
            java.lang.Object r1 = r7.A01
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r3 = r7.A02
            com.whatsapp.CircularProgressBar r3 = (com.whatsapp.CircularProgressBar) r3
            java.lang.Object r2 = r7.A03
            android.widget.TextView r2 = (android.widget.TextView) r2
            boolean r0 = r1.isEnabled()
            if (r0 == 0) goto L_0x004c
            r0 = 0
            r1.setEnabled(r0)
            android.content.Context r1 = r1.getContext()
            r0 = 2131099729(0x7f060051, float:1.781182E38)
            int r0 = X.C19740yt.A00(r1, r0)
            r3.A0B = r0
            r3.invalidate()
            r0 = 2131099719(0x7f060047, float:1.78118E38)
            X.AnonymousClass3MX.A1C(r1, r2, r0)
            goto L_0x004c
        L_0x0143:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0148:
            java.lang.String r0 = "crashLogs"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x014f:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C99544t2.BJt(java.lang.Object, X.1dr):java.lang.Object");
    }
}
