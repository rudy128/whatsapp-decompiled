package X;

import com.whatsapp.TextEmojiLabel;

/* renamed from: X.6AR  reason: invalid class name */
public final class AnonymousClass6AR extends C136786uO {
    public TextEmojiLabel A00;
    public TextEmojiLabel A01;
    public final C33251iW A02;
    public final AnonymousClass118 A03;
    public final AnonymousClass11C A04;
    public final AnonymousClass1KW A05;
    public final AnonymousClass1LU A06;
    public final C18010vc A07;

    public AnonymousClass6AR(C33251iW r2, AnonymousClass11C r3, AnonymousClass118 r4, AnonymousClass1KW r5, AnonymousClass1LU r6, C18010vc r7) {
        C18070vi.A0w(r4, r6, r5, r2, r3);
        C18070vi.A0d(r7, 6);
        this.A03 = r4;
        this.A06 = r6;
        this.A05 = r5;
        this.A02 = r2;
        this.A04 = r3;
        this.A07 = r7;
    }

    public void A01() {
        super.A01();
        this.A01 = null;
        this.A00 = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0135 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(android.content.Context r14, X.AnonymousClass02n r15, X.C140016zo r16) {
        /*
            r13 = this;
            boolean r5 = X.C108975cc.A1J(r15)
            r0 = r16
            super.A02(r14, r15, r0)
            X.6qU r0 = r0.A02
            if (r0 == 0) goto L_0x00f3
            java.lang.String r6 = r0.A00
            r10 = 4
            java.lang.Character[] r1 = new java.lang.Character[r10]
            r0 = 46
            java.lang.Character r12 = java.lang.Character.valueOf(r0)
            r1[r5] = r12
            r0 = 33
            java.lang.Character r11 = java.lang.Character.valueOf(r0)
            r9 = 1
            r1[r9] = r11
            r0 = 63
            java.lang.Character r7 = java.lang.Character.valueOf(r0)
            r4 = 2
            r1[r4] = r7
            r0 = 58
            java.lang.Character r3 = java.lang.Character.valueOf(r0)
            r2 = 3
            java.util.List r8 = X.C18070vi.A0O(r3, r1, r2)
            r0 = 5
            java.lang.Character[] r1 = new java.lang.Character[r0]
            r1[r5] = r12
            r1[r9] = r11
            r1[r4] = r7
            r1[r2] = r3
            r0 = 10
            java.lang.Character r2 = java.lang.Character.valueOf(r0)
            java.util.List r3 = X.C18070vi.A0O(r2, r1, r10)
            java.lang.Character[] r1 = new java.lang.Character[r4]
            r0 = 32
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            java.util.List r0 = X.C18070vi.A0N(r0, r2, r1, r5, r9)
            X.7SD r2 = new X.7SD
            r2.<init>(r0, r3, r6, r5)
            int r3 = r6.length()
            r7 = 0
        L_0x0062:
            if (r7 >= r3) goto L_0x007d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            char r0 = r6.charAt(r7)
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            java.lang.Object r0 = r2.invoke(r1, r0)
            boolean r0 = X.AnonymousClass000.A1Y(r0)
            if (r0 != 0) goto L_0x007e
            int r7 = r7 + 1
            goto L_0x0062
        L_0x007d:
            r7 = -1
        L_0x007e:
            r4 = 0
            if (r7 < 0) goto L_0x009d
            r2 = r7
        L_0x0082:
            int r1 = r3 - r9
            if (r2 >= r1) goto L_0x0099
            int r0 = r2 + 1
            char r0 = r6.charAt(r0)
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            boolean r0 = r8.contains(r0)
            if (r0 == 0) goto L_0x0099
            int r2 = r2 + 1
            goto L_0x0082
        L_0x0099:
            if (r7 != r2) goto L_0x00f6
            if (r2 != r1) goto L_0x00f6
        L_0x009d:
            X.1D6 r0 = X.AnonymousClass1D6.A01(r6, r4)
        L_0x00a1:
            java.lang.Object r2 = r0.first
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            java.lang.Object r4 = r0.second
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            com.whatsapp.TextEmojiLabel r6 = r13.A01
            r3 = 0
            if (r6 == 0) goto L_0x00c7
            X.11C r1 = r13.A04
            X.0vc r0 = r13.A07
            java.lang.CharSequence r2 = X.C26302CxJ.A0C(r1, r0, r2)
            com.whatsapp.TextEmojiLabel r0 = r13.A01
            if (r0 == 0) goto L_0x00f4
            android.text.TextPaint r1 = r0.getPaint()
        L_0x00be:
            X.1KW r0 = r13.A05
            java.lang.CharSequence r0 = X.C43251zV.A03(r14, r1, r0, r2)
            r6.setText(r0)
        L_0x00c7:
            if (r4 == 0) goto L_0x0138
            int r0 = r4.length()
            if (r0 == 0) goto L_0x0138
            com.whatsapp.TextEmojiLabel r0 = r13.A00
            if (r0 == 0) goto L_0x00d6
            r0.setVisibility(r5)
        L_0x00d6:
            com.whatsapp.TextEmojiLabel r2 = r13.A00
            if (r2 == 0) goto L_0x00f3
            X.11C r1 = r13.A04
            X.0vc r0 = r13.A07
            java.lang.CharSequence r1 = X.C26302CxJ.A0C(r1, r0, r4)
            com.whatsapp.TextEmojiLabel r0 = r13.A00
            if (r0 == 0) goto L_0x00ea
            android.text.TextPaint r3 = r0.getPaint()
        L_0x00ea:
            X.1KW r0 = r13.A05
            java.lang.CharSequence r0 = X.C43251zV.A03(r14, r3, r0, r1)
            r2.setText(r0)
        L_0x00f3:
            return
        L_0x00f4:
            r1 = r3
            goto L_0x00be
        L_0x00f6:
            int r1 = r2 + 1
            java.lang.CharSequence r0 = r6.subSequence(r5, r1)
            java.lang.String r0 = r0.toString()
            java.lang.CharSequence r0 = X.AnonymousClass1YF.A0H(r0)
            java.lang.String r4 = r0.toString()
            java.lang.CharSequence r0 = r6.subSequence(r1, r3)
            java.lang.String r3 = r0.toString()
            X.C18070vi.A0d(r3, r5)
            int r2 = r3.length()
            r1 = 0
        L_0x0118:
            if (r1 >= r2) goto L_0x0135
            char r0 = r3.charAt(r1)
            boolean r0 = X.AnonymousClass1c5.A00(r0)
            if (r0 != 0) goto L_0x0132
            java.lang.CharSequence r0 = r3.subSequence(r1, r2)
        L_0x0128:
            java.lang.String r0 = r0.toString()
            X.1D6 r0 = X.AnonymousClass1D6.A01(r4, r0)
            goto L_0x00a1
        L_0x0132:
            int r1 = r1 + 1
            goto L_0x0118
        L_0x0135:
            java.lang.String r0 = ""
            goto L_0x0128
        L_0x0138:
            com.whatsapp.TextEmojiLabel r0 = r13.A00
            X.C72453Mb.A1B(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6AR.A02(android.content.Context, X.02n, X.6zo):void");
    }
}
