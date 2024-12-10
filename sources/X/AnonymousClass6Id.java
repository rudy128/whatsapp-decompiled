package X;

import android.text.Editable;

/* renamed from: X.6Id  reason: invalid class name */
public final class AnonymousClass6Id extends C89564cf {
    public final /* synthetic */ C138706xY A00;

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0129, code lost:
        if (r4.A04 != false) goto L_0x012b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x019f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void afterTextChanged(android.text.Editable r21) {
        /*
            r20 = this;
            r6 = 0
            r14 = r21
            X.C18070vi.A0d(r14, r6)
            int r1 = r14.length()
            java.lang.Class<android.text.style.UnderlineSpan> r0 = android.text.style.UnderlineSpan.class
            r5 = 0
            java.lang.Object[] r3 = r14.getSpans(r6, r1, r0)
            android.text.style.UnderlineSpan[] r3 = (android.text.style.UnderlineSpan[]) r3
            X.C18070vi.A0b(r3)
            int r2 = r3.length
            r1 = 0
        L_0x0018:
            if (r1 >= r2) goto L_0x0022
            r0 = r3[r1]
            r14.removeSpan(r0)
            int r1 = r1 + 1
            goto L_0x0018
        L_0x0022:
            r0 = r20
            X.6xY r4 = r0.A00
            X.0ve r2 = r4.A0D
            com.whatsapp.status.widget.StatusEditText r3 = r4.A0K
            android.content.Context r12 = r3.getContext()
            X.1KW r1 = r4.A0C
            X.11C r15 = r4.A0A
            X.0vc r0 = r4.A0H
            android.text.TextPaint r13 = r3.getPaint()
            r19 = 1066192077(0x3f8ccccd, float:1.1)
            r17 = r2
            r18 = r0
            r16 = r1
            X.C26302CxJ.A0J(r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.String r10 = r14.toString()
            X.7J1 r12 = r4.A0M
            X.6lX r1 = r12.A07
            boolean r0 = r1 instanceof X.C121226Iq
            if (r0 == 0) goto L_0x01b3
            X.6Iq r1 = (X.C121226Iq) r1
            int r0 = android.text.TextUtils.getTrimmedLength(r10)
            if (r0 <= 0) goto L_0x0086
            X.7J1 r13 = r1.A00
            X.72I r11 = r13.A08
            int r9 = r13.A03
            java.lang.String r8 = r13.A09
            r7 = 1
            X.C18070vi.A0d(r8, r7)
            android.widget.ImageButton r2 = r11.A01
            r2.setEnabled(r7)
            X.0vb r1 = r11.A05
            if (r1 == 0) goto L_0x0287
            android.content.Context r0 = r2.getContext()
            X.AnonymousClass3NL.A01(r0, r2, r1, r9)
            r2.setContentDescription(r8)
            X.AnonymousClass71W.A00(r2, r7, r7)
            android.widget.ImageButton r0 = r11.A00
            X.AnonymousClass71W.A00(r0, r6, r7)
        L_0x007f:
            X.6Io r0 = new X.6Io
            r0.<init>(r13)
            r13.A07 = r0
        L_0x0086:
            com.whatsapp.statuscomposer.composer.TextStatusComposerFragment r0 = r12.A06
            if (r0 == 0) goto L_0x00a6
            X.886 r2 = com.whatsapp.statuscomposer.composer.TextStatusComposerFragment.A00(r0)
            if (r2 == 0) goto L_0x00a6
            com.whatsapp.statuscomposer.ConsolidatedStatusComposerActivity r2 = (com.whatsapp.statuscomposer.ConsolidatedStatusComposerActivity) r2
            if (r10 == 0) goto L_0x019f
            boolean r0 = X.AnonymousClass1YF.A0T(r10)
            if (r0 != 0) goto L_0x019f
            X.7DZ r1 = r2.A04
            if (r1 == 0) goto L_0x00a3
            r0 = 8
            r1.setVisibility(r0)
        L_0x00a3:
            com.whatsapp.statuscomposer.ConsolidatedStatusComposerActivity.A0d(r2, r6)
        L_0x00a6:
            int r0 = android.text.TextUtils.getTrimmedLength(r10)
            boolean r1 = X.AnonymousClass000.A1R(r0)
            X.2iK r0 = r4.A0I
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x00e6
            if (r1 == 0) goto L_0x00e6
            boolean r0 = r4.A03
            if (r0 != 0) goto L_0x00e6
            X.1hg r0 = r4.A0J
            X.2tc r7 = X.C108965cb.A0Y(r0)
            boolean r0 = X.C63742tc.A03(r7)
            if (r0 == 0) goto L_0x00e3
            X.2HA r2 = X.C63742tc.A00(r7)
            r0 = 17
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A03 = r0
            X.6ey r1 = r7.A02
            java.lang.Integer r0 = r1.A01
            r2.A02 = r0
            java.lang.Integer r0 = r1.A00
            r2.A01 = r0
            X.18K r0 = r7.A01
            r0.CC7(r2)
        L_0x00e3:
            r0 = 1
            r4.A03 = r0
        L_0x00e6:
            X.1gU r0 = r4.A0F
            java.lang.String r7 = r0.A02(r10)
            int r2 = r10.length()
            int r1 = X.AnonymousClass74F.A03(r10, r6, r2)
            X.1DT r0 = r4.A07
            X.AnonymousClass3MX.A1J(r0, r1)
            boolean r0 = r4.A04
            if (r0 != 0) goto L_0x010c
            X.3TA r13 = r4.A09
            X.00H r0 = r4.A0N
            X.1BI r15 = r4.A0E
            r17 = 1
            r18 = r6
            r16 = r0
            r13.A0W(r14, r15, r16, r17, r18)
        L_0x010c:
            int r0 = r14.length()
            int r8 = X.C137186v3.A01(r14, r6, r0)
            int r0 = X.C138706xY.A00(r14, r6, r0)
            int r0 = r0 * 49
            int r8 = r8 + r0
            if (r7 == 0) goto L_0x012b
            java.lang.String r0 = r4.A02
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x012b
            boolean r1 = r4.A04
            r0 = 350(0x15e, float:4.9E-43)
            if (r1 == 0) goto L_0x012d
        L_0x012b:
            r0 = 700(0x2bc, float:9.81E-43)
        L_0x012d:
            if (r8 < r0) goto L_0x0147
            int r0 = r4.A00
            if (r0 != 0) goto L_0x0147
            int r1 = r3.getInputType()
            r4.A00 = r1
            if (r1 == 0) goto L_0x0147
            r0 = 524288(0x80000, float:7.34684E-40)
            r1 = r1 | r0
            r3.setInputType(r1)
            r3.setText(r10)
            r3.setCursorPosition(r2)
        L_0x0147:
            r8 = 0
            if (r2 == 0) goto L_0x022b
            java.util.regex.Pattern r1 = X.C50912Wg.A01
            r0 = 4096(0x1000, float:5.74E-42)
            if (r2 <= r0) goto L_0x019d
            java.lang.String r0 = X.C108955ca.A0q(r6, r0, r10)
        L_0x0154:
            java.util.regex.Matcher r11 = r1.matcher(r0)
        L_0x0158:
            boolean r0 = r11.find()
            if (r0 == 0) goto L_0x022b
            int r1 = r11.start()
            int r0 = r11.end()
            android.util.Pair r9 = X.C60402ny.A00(r10, r1, r0)
            if (r9 == 0) goto L_0x0158
            java.lang.Object r0 = r9.first
            X.C18070vi.A0W(r0)
            int r1 = X.AnonymousClass000.A0M(r0)
            java.lang.Object r0 = r9.second
            X.C18070vi.A0W(r0)
            int r0 = X.AnonymousClass000.A0M(r0)
            java.lang.String r6 = X.C108955ca.A0q(r1, r0, r10)
            java.lang.String[] r4 = X.C50912Wg.A03
            r2 = 2
            r1 = 0
        L_0x0186:
            r0 = r4[r1]
            boolean r0 = X.C60402ny.A01(r6, r0)
            if (r0 == 0) goto L_0x0198
            if (r8 != 0) goto L_0x0194
            java.util.ArrayList r8 = X.AnonymousClass000.A13()
        L_0x0194:
            X.C108985cd.A1I(r9, r8)
            goto L_0x0158
        L_0x0198:
            int r1 = r1 + 1
            if (r1 >= r2) goto L_0x0158
            goto L_0x0186
        L_0x019d:
            r0 = r10
            goto L_0x0154
        L_0x019f:
            r1 = 1
            X.7DZ r0 = r2.A04
            if (r0 == 0) goto L_0x01a7
            r0.setVisibility(r6)
        L_0x01a7:
            com.whatsapp.textstatuscomposer.bottombar.CreationModeBottomBar r0 = r2.A06
            if (r0 == 0) goto L_0x01ae
            r0.setBackgroundColor(r6)
        L_0x01ae:
            com.whatsapp.statuscomposer.ConsolidatedStatusComposerActivity.A0d(r2, r1)
            goto L_0x00a6
        L_0x01b3:
            boolean r0 = r1 instanceof X.C121216Ip
            if (r0 != 0) goto L_0x0086
            boolean r0 = r1 instanceof X.AnonymousClass6Io
            if (r0 == 0) goto L_0x01f6
            X.6Io r1 = (X.AnonymousClass6Io) r1
            int r0 = android.text.TextUtils.getTrimmedLength(r10)
            if (r0 > 0) goto L_0x0086
            X.7J1 r7 = r1.A00
            X.0vl r0 = r7.A0K
            boolean r0 = X.C72453Mb.A1a(r0)
            X.72I r2 = r7.A08
            if (r0 == 0) goto L_0x01df
            r0 = 125(0x7d, float:1.75E-43)
            r2.A03(r0)
            X.6Iq r0 = new X.6Iq
            r0.<init>(r7)
            r7.A07 = r0
            r7.A0B = r6
            goto L_0x0086
        L_0x01df:
            android.widget.ImageButton r1 = r2.A01
            r1.setEnabled(r6)
            android.widget.ImageButton r0 = r2.A00
            X.AnonymousClass71W.A00(r0, r6, r6)
            r0 = 1
            X.AnonymousClass71W.A00(r1, r6, r0)
            X.6Im r0 = new X.6Im
            r0.<init>(r7)
            r7.A07 = r0
            goto L_0x0086
        L_0x01f6:
            boolean r0 = r1 instanceof X.AnonymousClass6In
            if (r0 != 0) goto L_0x0086
            X.6Im r1 = (X.AnonymousClass6Im) r1
            int r0 = android.text.TextUtils.getTrimmedLength(r10)
            if (r0 <= 0) goto L_0x0086
            X.7J1 r13 = r1.A00
            X.72I r11 = r13.A08
            int r9 = r13.A03
            java.lang.String r8 = r13.A09
            r7 = 1
            X.C18070vi.A0d(r8, r7)
            android.widget.ImageButton r2 = r11.A01
            r2.setEnabled(r7)
            X.0vb r1 = r11.A05
            if (r1 == 0) goto L_0x028c
            android.content.Context r0 = r2.getContext()
            X.AnonymousClass3NL.A01(r0, r2, r1, r9)
            r2.setContentDescription(r8)
            android.widget.ImageButton r0 = r11.A00
            X.AnonymousClass71W.A00(r0, r6, r7)
            X.AnonymousClass71W.A00(r2, r7, r7)
            goto L_0x007f
        L_0x022b:
            if (r7 == 0) goto L_0x0286
            if (r8 == 0) goto L_0x0286
            int r0 = r8.size()
            if (r0 <= 0) goto L_0x0286
            android.text.Editable r6 = r3.getText()
            if (r6 == 0) goto L_0x0286
            int r4 = r8.size()
        L_0x023f:
            if (r5 >= r4) goto L_0x0286
            java.lang.Object r7 = r8.get(r5)
            android.util.Pair r7 = (android.util.Pair) r7
            if (r7 == 0) goto L_0x0283
            java.lang.Object r0 = r7.first
            X.C18070vi.A0W(r0)
            int r1 = X.AnonymousClass000.A0M(r0)
            int r0 = r6.length()
            if (r1 >= r0) goto L_0x0283
            java.lang.Object r0 = r7.second
            X.C18070vi.A0W(r0)
            int r1 = X.AnonymousClass000.A0M(r0)
            int r0 = r6.length()
            if (r1 >= r0) goto L_0x0283
            android.text.style.UnderlineSpan r3 = new android.text.style.UnderlineSpan
            r3.<init>()
            java.lang.Object r0 = r7.first
            X.C18070vi.A0W(r0)
            int r2 = X.AnonymousClass000.A0M(r0)
            java.lang.Object r0 = r7.second
            X.C18070vi.A0W(r0)
            int r1 = X.AnonymousClass000.A0M(r0)
            r0 = 33
            r6.setSpan(r3, r2, r1, r0)
        L_0x0283:
            int r5 = r5 + 1
            goto L_0x023f
        L_0x0286:
            return
        L_0x0287:
            X.AnonymousClass3MW.A1M()
            r0 = 0
            throw r0
        L_0x028c:
            X.AnonymousClass3MW.A1M()
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6Id.afterTextChanged(android.text.Editable):void");
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int codePointCount;
        C18070vi.A0d(charSequence, 0);
        C138706xY r2 = this.A00;
        r2.A0G.A00(C29671cg.A00);
        AnonymousClass3TA r4 = r2.A09;
        boolean z = false;
        if (i3 > i2 && ((codePointCount = Character.codePointCount(charSequence, i, i3 + i)) > 1 || (codePointCount == 1 && Character.isWhitespace(Character.codePointAt(charSequence, i))))) {
            z = true;
        }
        r4.A0C = z;
        Editable text = r2.A0K.getText();
        if (text != null && i + i3 == text.length()) {
            r2.A08.A0J(AnonymousClass7RI.A00(r2, 48));
        }
    }

    public AnonymousClass6Id(C138706xY r1) {
        this.A00 = r1;
    }
}
