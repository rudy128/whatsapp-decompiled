package X;

/* renamed from: X.4hz  reason: invalid class name and case insensitive filesystem */
public class C92834hz implements B77 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C92834hz(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009d, code lost:
        if (r1.getVisibility() != 0) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00bf, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r9.A0F, 957) != false) goto L_0x00c1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Bmx(X.AEW r12) {
        /*
            r11 = this;
            int r0 = r11.A00
            switch(r0) {
                case 0: goto L_0x00a7;
                case 1: goto L_0x0069;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r5 = r11.A01
            X.4aY r5 = (X.AnonymousClass4aY) r5
            java.lang.Object r6 = r11.A02
            com.whatsapp.jid.Jid r6 = (com.whatsapp.jid.Jid) r6
            X.4OV r0 = X.AnonymousClass3MY.A0T(r5)
            X.00H r0 = r0.A03
            java.lang.Object r0 = r0.get()
            X.9uX r0 = (X.C196149uX) r0
            java.lang.String r2 = r0.A00(r12)
            int r0 = r2.hashCode()
            switch(r0) {
                case -839883634: goto L_0x004d;
                case 181990675: goto L_0x0028;
                case 476614193: goto L_0x0025;
                default: goto L_0x0024;
            }
        L_0x0024:
            return
        L_0x0025:
            java.lang.String r0 = "TEMPORARY"
            goto L_0x004f
        L_0x0028:
            java.lang.String r0 = "UNBLOCKED"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0024
            X.A8Q r1 = X.C72463Mc.A0Z(r5)
            r0 = 7
            r4 = 0
            r1.A08(r0, r4, r4)
            X.1L9 r3 = r5.A0r
            X.1FY r2 = X.AnonymousClass3MW.A0Q(r5)
            X.1FY r1 = X.AnonymousClass3MW.A0Q(r5)
            r0 = 12
            android.content.Intent r0 = X.AnonymousClass1LU.A0z(r1, r6, r4, r0)
            r3.A08(r2, r0)
            return
        L_0x004d:
            java.lang.String r0 = "PERMANENT"
        L_0x004f:
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0024
            X.4OV r0 = X.AnonymousClass3MY.A0T(r5)
            X.00H r0 = r0.A01
            java.lang.Object r1 = r0.get()
            X.A0o r1 = (X.C19957A0o) r1
            X.1FY r0 = X.AnonymousClass3MW.A0Q(r5)
            r1.A02(r0, r2)
            return
        L_0x0069:
            java.lang.Object r5 = r11.A01
            X.3sy r5 = (X.C78543sy) r5
            java.lang.Object r4 = r11.A02
            X.4U7 r4 = (X.AnonymousClass4U7) r4
            com.whatsapp.conversation.conversationrow.ConversationRowContactInfoLinkedAccount r3 = r5.A0B
            r2 = 0
            if (r12 == 0) goto L_0x00a5
            X.ADg r0 = r12.A06
            if (r0 == 0) goto L_0x00a5
            X.AEB r1 = r0.A00
        L_0x007c:
            java.lang.String r0 = r4.A01
            X.C78543sy.A06(r1, r5, r3, r0)
            com.whatsapp.conversation.conversationrow.ConversationRowContactInfoLinkedAccount r1 = r5.A0C
            if (r12 == 0) goto L_0x008b
            X.ADg r0 = r12.A06
            if (r0 == 0) goto L_0x008b
            X.AEB r2 = r0.A01
        L_0x008b:
            java.lang.String r0 = r4.A02
            X.C78543sy.A06(r2, r5, r1, r0)
            android.view.View r2 = r5.A0A
            int r0 = r3.getVisibility()
            if (r0 != 0) goto L_0x009f
            int r1 = r1.getVisibility()
            r0 = 0
            if (r1 == 0) goto L_0x00a1
        L_0x009f:
            r0 = 8
        L_0x00a1:
            r2.setVisibility(r0)
            return
        L_0x00a5:
            r1 = r2
            goto L_0x007c
        L_0x00a7:
            java.lang.Object r9 = r11.A01
            X.3rZ r9 = (X.C77833rZ) r9
            java.lang.Object r2 = r11.A02
            android.view.Menu r2 = (android.view.Menu) r2
            if (r12 == 0) goto L_0x00c1
            boolean r0 = r12.A0f
            if (r0 == 0) goto L_0x00c7
            X.0ve r3 = r9.A0F
            r1 = 957(0x3bd, float:1.341E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r3, r1)
            if (r0 == 0) goto L_0x00c7
        L_0x00c1:
            X.00H r0 = r9.A0K
            r0.get()
            return
        L_0x00c7:
            X.9uX r1 = r9.A06
            boolean r0 = r1.A01(r12)
            r8 = 2
            r7 = 1
            r10 = 0
            if (r0 == 0) goto L_0x010e
            r3 = 30
            android.view.MenuItem r0 = r2.findItem(r3)
            if (r0 == 0) goto L_0x00dd
            r2.removeItem(r3)
        L_0x00dd:
            r4 = 2131897961(0x7f122e69, float:1.9430826E38)
            r1 = 2131231647(0x7f08039f, float:1.807938E38)
            X.00H r0 = r9.A0K
            r0.get()
            android.view.MenuItem r0 = r2.add(r10, r3, r7, r4)
            android.view.MenuItem r3 = r0.setIcon(r1)
            r0 = 2131627382(0x7f0e0d76, float:1.8882027E38)
            r3.setActionView(r0)
            android.view.View r2 = r3.getActionView()
            r1 = 2131436014(0x7f0b21ee, float:1.8493886E38)
            java.lang.String r0 = r12.A0K
            r2.setTag(r1, r0)
            X.01E r0 = r9.A01
            X.AnonymousClass3MY.A0w(r0, r2, r4)
            r9.A0I(r3, r4, r7)
            r3.setShowAsAction(r8)
            goto L_0x00c1
        L_0x010e:
            boolean r0 = r1.A02(r12)
            if (r0 == 0) goto L_0x00c1
            java.lang.String r1 = r1.A00(r12)
            java.lang.String r0 = "PERMANENT"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00c1
            r1 = 29
            android.view.MenuItem r0 = r2.findItem(r1)
            if (r0 == 0) goto L_0x012b
            r2.removeItem(r1)
        L_0x012b:
            r6 = 2131897869(0x7f122e0d, float:1.943064E38)
            r5 = 2131232334(0x7f08064e, float:1.8080774E38)
            X.00H r0 = r9.A0K
            r0.get()
            android.view.MenuItem r4 = r9.A02(r2, r1, r6, r5)
            X.01E r3 = r9.A01
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r3)
            r1 = 2131627368(0x7f0e0d68, float:1.8881998E38)
            r0 = 0
            android.view.View r0 = r2.inflate(r1, r0, r10)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            X.AnonymousClass3MX.A1B(r3, r0, r5)
            X.AnonymousClass3MY.A0w(r3, r0, r6)
            r4.setActionView(r0)
            r9.A0I(r4, r6, r7)
            r4.setShowAsAction(r8)
            goto L_0x00c1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92834hz.Bmx(X.AEW):void");
    }
}
