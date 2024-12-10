package X;

public class D6I implements AnonymousClass1GV {
    public final int A00;
    public final Object A01;

    public D6I(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0123, code lost:
        if (r6 == null) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0171, code lost:
        if (r1.getString("newsletter_invite_link_jid") != null) goto L_0x0173;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void accept(java.lang.Object r8) {
        /*
            r7 = this;
            int r1 = r7.A00
            java.lang.Object r0 = r7.A01
            int r1 = 2 - r1
            if (r1 == 0) goto L_0x000e
            X.5bn r0 = (X.C108495bn) r0
            r0.CQ0(r8)
        L_0x000d:
            return
        L_0x000e:
            com.whatsapp.contact.picker.ContactPicker r0 = (com.whatsapp.contact.picker.ContactPicker) r0
            X.CRl r8 = (X.C24961CRl) r8
            X.Cpv r5 = r0.A06
            android.content.Intent r4 = r0.getIntent()
            r3 = 0
            X.C18070vi.A0d(r4, r3)
            int r1 = X.C25982Cpv.A00(r4)
            r0 = 108(0x6c, float:1.51E-43)
            if (r1 != r0) goto L_0x0129
            java.lang.String r2 = r4.getAction()
            if (r2 == 0) goto L_0x0040
            int r1 = r2.hashCode()
            r0 = -1173264947(0xffffffffba1165cd, float:-5.5464805E-4)
            if (r1 == r0) goto L_0x007e
            r0 = -58484670(0xfffffffffc839842, float:-5.4662324E36)
            if (r1 != r0) goto L_0x0040
            java.lang.String r0 = "android.intent.action.SEND_MULTIPLE"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0086
        L_0x0040:
            X.1Om r6 = X.C25511Om.A00
        L_0x0042:
            java.util.Iterator r3 = r6.iterator()
        L_0x0046:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x000d
            java.lang.Object r0 = r3.next()
            X.Byv r0 = (X.C24298Byv) r0
            int r2 = r0.ordinal()
            r1 = 1
            r0 = 4
            if (r2 == r0) goto L_0x0077
            r0 = 5
            if (r2 == r0) goto L_0x0070
            r0 = 3
            if (r2 == r0) goto L_0x0069
            if (r2 != r1) goto L_0x0046
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r8.A02 = r0
            goto L_0x0046
        L_0x0069:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r8.A00 = r0
            goto L_0x0046
        L_0x0070:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r8.A03 = r0
            goto L_0x0046
        L_0x0077:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r8.A01 = r0
            goto L_0x0046
        L_0x007e:
            java.lang.String r0 = "android.intent.action.SEND"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0040
        L_0x0086:
            java.lang.String r1 = r4.getType()
            if (r1 == 0) goto L_0x0176
            java.lang.String r0 = "*"
            boolean r1 = X.AnonymousClass1YE.A0A(r1, r0, r3)
            r0 = 1
            if (r1 != r0) goto L_0x0176
            android.content.ClipData r6 = r4.getClipData()
            if (r6 == 0) goto L_0x00cb
            X.DpP r1 = new X.DpP
            r1.<init>(r5)
            int r0 = r6.getItemCount()
            java.util.ArrayList r4 = X.C17880vN.A0z(r0)
            X.Dqc r3 = new X.Dqc
            r3.<init>(r4, r1)
            int r2 = r6.getItemCount()
            r1 = 0
        L_0x00b2:
            if (r1 >= r2) goto L_0x00c1
            android.content.ClipData$Item r0 = r6.getItemAt(r1)
            X.C18070vi.A0X(r0)
            r3.invoke(r0)
            int r1 = r1 + 1
            goto L_0x00b2
        L_0x00c1:
            java.util.List r0 = X.C29431cG.A0t(r4)
            java.util.Set r6 = X.C29431cG.A12(r0)
            goto L_0x0042
        L_0x00cb:
            java.lang.String r0 = "android.intent.extra.TEXT"
            java.lang.String r1 = r4.getStringExtra(r0)
            r2 = 0
            if (r1 == 0) goto L_0x0115
            X.1gU r0 = r5.A03
            java.lang.String r0 = r0.A02(r1)
            if (r0 == 0) goto L_0x0112
            X.Byv r0 = X.C24298Byv.TYPE_LINK
        L_0x00de:
            java.util.Set r6 = X.C18070vi.A0P(r0)
        L_0x00e2:
            android.os.Bundle r1 = r4.getExtras()
            if (r1 == 0) goto L_0x011b
            X.DpR r3 = new X.DpR
            r3.<init>(r5)
            java.lang.String r0 = "android.intent.extra.STREAM"
            java.util.ArrayList r0 = r1.getParcelableArrayList(r0)
            if (r0 == 0) goto L_0x011b
            java.util.ArrayList r2 = X.AnonymousClass000.A13()
            java.util.Iterator r1 = r0.iterator()
        L_0x00fd:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0117
            java.lang.Object r0 = r1.next()
            X.C18070vi.A0b(r0)
            java.lang.Object r0 = r3.invoke(r0)
            r2.add(r0)
            goto L_0x00fd
        L_0x0112:
            X.Byv r0 = X.C24298Byv.TYPE_TEXT
            goto L_0x00de
        L_0x0115:
            r6 = r2
            goto L_0x00e2
        L_0x0117:
            java.util.Set r2 = X.C29431cG.A12(r2)
        L_0x011b:
            if (r6 == 0) goto L_0x0127
            if (r2 == 0) goto L_0x0042
            java.util.LinkedHashSet r6 = X.C41841x9.A04(r2, r6)
        L_0x0123:
            if (r6 != 0) goto L_0x0042
            goto L_0x0040
        L_0x0127:
            r6 = r2
            goto L_0x0123
        L_0x0129:
            android.os.Bundle r1 = r4.getExtras()
            if (r1 == 0) goto L_0x0165
            X.DpQ r3 = new X.DpQ
            r3.<init>(r5)
            java.lang.String r0 = "message_keys"
            android.os.Bundle r0 = r1.getBundle(r0)
            if (r0 == 0) goto L_0x0165
            java.util.ArrayList r0 = X.AnonymousClass4aU.A04(r0)
            if (r0 == 0) goto L_0x0165
            java.util.ArrayList r2 = X.AnonymousClass000.A13()
            java.util.Iterator r1 = r0.iterator()
        L_0x014a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x015f
            java.lang.Object r0 = r1.next()
            X.C18070vi.A0b(r0)
            java.lang.Object r0 = r3.invoke(r0)
            r2.add(r0)
            goto L_0x014a
        L_0x015f:
            java.util.Set r6 = X.C29431cG.A12(r2)
            goto L_0x0042
        L_0x0165:
            android.os.Bundle r1 = r4.getExtras()
            if (r1 == 0) goto L_0x0040
            java.lang.String r0 = "newsletter_invite_link_jid"
            java.lang.String r0 = r1.getString(r0)
            if (r0 == 0) goto L_0x0040
        L_0x0173:
            X.Byv r0 = X.C24298Byv.TYPE_LINK
            goto L_0x0192
        L_0x0176:
            java.lang.String r0 = r4.getType()
            int r0 = X.C26511Sk.A04(r0)
            if (r0 != 0) goto L_0x019b
            java.lang.String r0 = "android.intent.extra.TEXT"
            java.lang.String r1 = r4.getStringExtra(r0)
            if (r1 == 0) goto L_0x0198
            X.1gU r0 = r5.A03
            java.lang.String r0 = r0.A02(r1)
            if (r0 != 0) goto L_0x0173
            X.Byv r0 = X.C24298Byv.TYPE_TEXT
        L_0x0192:
            java.util.Set r6 = X.C18070vi.A0P(r0)
            goto L_0x0042
        L_0x0198:
            X.Byv r0 = X.C24298Byv.TYPE_UNKNOWN
            goto L_0x0192
        L_0x019b:
            java.lang.String r0 = r4.getType()
            int r0 = X.C26511Sk.A04(r0)
            X.Byv r0 = X.C25982Cpv.A01(r0)
            goto L_0x0192
        */
        throw new UnsupportedOperationException("Method not decompiled: X.D6I.accept(java.lang.Object):void");
    }
}
