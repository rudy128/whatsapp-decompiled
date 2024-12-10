package X;

import android.net.Uri;

/* renamed from: X.4ZB  reason: invalid class name */
public abstract class AnonymousClass4ZB {
    public static C25131Mz A00;
    public static final Object A01 = C17880vN.A0p();

    public static final Uri A00(AEB aeb, int i) {
        String str;
        StringBuilder sb = new StringBuilder("https://");
        if (i != 0) {
            if (i == 1) {
                sb.append("www.instagram.com/");
                str = aeb.A01;
            }
            Uri parse = Uri.parse(sb.toString());
            C18070vi.A0X(parse);
            return parse;
        }
        sb.append("www.facebook.com/");
        str = aeb.A02;
        sb.append(str);
        Uri parse2 = Uri.parse(sb.toString());
        C18070vi.A0X(parse2);
        return parse2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: X.4d8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: X.4d4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v3, resolved type: X.4d4} */
    /* JADX WARNING: type inference failed for: r4v1, types: [android.view.View$OnClickListener] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.AnonymousClass1L9 r16, com.whatsapp.biz.BusinessProfileFieldView r17, X.AnonymousClass72R r18, X.C1417376t r19, X.AnonymousClass689 r20, java.lang.Integer r21, java.lang.String r22, int r23, boolean r24, boolean r25, boolean r26) {
        /*
            r4 = 1
            r6 = r17
            r6.getTextView()
            android.content.Context r3 = r6.getContext()
            android.content.Context r2 = r6.getContext()
            r1 = 2130971981(0x7f040d4d, float:1.7552716E38)
            r0 = 2131099973(0x7f060145, float:1.7812314E38)
            int r1 = X.AnonymousClass3MZ.A02(r2, r3, r1, r0)
            android.widget.TextView r0 = r6.getTextView()
            r0.setTextColor(r1)
            r5 = r16
            r7 = r18
            r8 = r19
            r9 = r21
            r10 = r22
            r0 = r23
            r15 = r24
            r13 = r25
            r14 = r26
            if (r23 == 0) goto L_0x0050
            if (r0 == r4) goto L_0x00e4
            java.lang.String r23 = r6.getText()
            int r0 = r23.length()
            if (r0 <= 0) goto L_0x004f
            X.4d5 r0 = new X.4d5
            r16 = r0
            r24 = r13
            r25 = r14
            r26 = r15
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r6.setOnClickListener(r0)
        L_0x004f:
            return
        L_0x0050:
            java.lang.String r11 = r6.getText()
            int r0 = r11.length()
            if (r0 <= 0) goto L_0x004f
            java.lang.String r0 = r6.getText()
            if (r0 == 0) goto L_0x00e2
            r6.getTextView()
            r6.getSubTextView()
            java.lang.String r0 = r6.getText()
            boolean r0 = X.C83544Fn.A00(r0)
            boolean r1 = X.AnonymousClass000.A1O(r0)
            java.lang.String r0 = r6.getText()
            java.lang.String r0 = X.C87364Vh.A01(r0)
            android.net.Uri r2 = android.net.Uri.parse(r0)
            if (r1 == 0) goto L_0x00e2
            if (r2 == 0) goto L_0x00e2
            java.util.List r0 = r2.getPathSegments()
            int r0 = r0.size()
            if (r0 == 0) goto L_0x00e2
            r0 = 2131231739(0x7f0803fb, float:1.8079568E38)
            r6.setIcon((int) r0)
            r0 = 2131887541(0x7f1205b5, float:1.9409692E38)
            java.lang.String r1 = X.AnonymousClass3Ma.A11(r6, r0)
            r0 = 0
            r6.setText(r1, r0)
            java.util.List r1 = r2.getPathSegments()
            r0 = 0
            java.lang.String r0 = X.C17880vN.A0w(r1, r0)
            r6.setSubText(r0)
            android.content.Context r3 = r6.getContext()
            android.content.Context r2 = r6.getContext()
            r1 = 2130968817(0x7f0400f1, float:1.7546298E38)
            r0 = 2131099899(0x7f0600fb, float:1.7812164E38)
            int r4 = X.AnonymousClass3MZ.A02(r2, r3, r1, r0)
            android.content.Context r3 = r6.getContext()
            android.content.Context r2 = r6.getContext()
            r1 = 2130970338(0x7f0406e2, float:1.7549383E38)
            r0 = 2131101307(0x7f06067b, float:1.781502E38)
            int r1 = X.AnonymousClass3MZ.A02(r2, r3, r1, r0)
            android.widget.TextView r0 = r6.getTextView()
            r0.setTextColor(r4)
            android.widget.TextView r0 = r6.getSubTextView()
            r0.setTextColor(r1)
            r12 = 1
        L_0x00dc:
            X.4d8 r4 = new X.4d8
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            goto L_0x0115
        L_0x00e2:
            r12 = 0
            goto L_0x00dc
        L_0x00e4:
            java.lang.String r2 = r6.getText()
            int r0 = r2.length()
            if (r0 <= 0) goto L_0x004f
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "mailto:"
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r2, r1)
            android.net.Uri r17 = android.net.Uri.parse(r0)
            X.4d4 r4 = new X.4d4
            r16 = r4
            r18 = r5
            r19 = r6
            r20 = r7
            r21 = r8
            r22 = r9
            r23 = r10
            r24 = r13
            r25 = r14
            r26 = r15
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
        L_0x0115:
            r6.setOnClickListener(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4ZB.A01(X.1L9, com.whatsapp.biz.BusinessProfileFieldView, X.72R, X.76t, X.689, java.lang.Integer, java.lang.String, int, boolean, boolean, boolean):void");
    }
}
