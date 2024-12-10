package X;

/* renamed from: X.49m  reason: invalid class name and case insensitive filesystem */
public final class C827249m extends C201010v {
    public final String A00;
    public final AnonymousClass4LG A01;
    public volatile boolean A02;
    public final /* synthetic */ AnonymousClass4RR A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C827249m(AnonymousClass4LG r2, AnonymousClass4RR r3, String str) {
        super("LinkifierThread");
        this.A03 = r3;
        this.A01 = r2;
        this.A00 = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0058, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r1.A00, 12655) == false) goto L_0x005a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r27 = this;
            r0 = 10
            android.os.Process.setThreadPriority(r0)
        L_0x0005:
            r2 = r27
            boolean r0 = r2.A02     // Catch:{ InterruptedException -> 0x0310 }
            if (r0 != 0) goto L_0x0310
            X.4LG r0 = r2.A01     // Catch:{ InterruptedException -> 0x0310 }
            java.util.concurrent.LinkedBlockingDeque r0 = r0.A00     // Catch:{ InterruptedException -> 0x0310 }
            java.lang.Object r1 = r0.takeLast()     // Catch:{ InterruptedException -> 0x0310 }
            X.4Nr r1 = (X.C85514Nr) r1     // Catch:{ InterruptedException -> 0x0310 }
            if (r1 == 0) goto L_0x0005
            java.lang.CharSequence r0 = r1.A03     // Catch:{ InterruptedException -> 0x0310 }
            r26 = r0
            android.widget.TextView r0 = r1.A00     // Catch:{ InterruptedException -> 0x0310 }
            r25 = r0
            X.206 r4 = r1.A02     // Catch:{ InterruptedException -> 0x0310 }
            X.5ZA r0 = r1.A01     // Catch:{ InterruptedException -> 0x0310 }
            r24 = r0
            java.lang.Object r1 = r25.getTag()     // Catch:{ InterruptedException -> 0x0310 }
            boolean r0 = r1 instanceof X.AnonymousClass206     // Catch:{ InterruptedException -> 0x0310 }
            if (r0 == 0) goto L_0x030d
            X.206 r1 = (X.AnonymousClass206) r1     // Catch:{ InterruptedException -> 0x0310 }
            X.205 r1 = r1.A0v     // Catch:{ InterruptedException -> 0x0310 }
        L_0x0031:
            X.205 r0 = r4.A0v     // Catch:{ InterruptedException -> 0x0310 }
            boolean r0 = r0.equals(r1)     // Catch:{ InterruptedException -> 0x0310 }
            if (r0 == 0) goto L_0x0005
            android.text.SpannableStringBuilder r5 = X.AnonymousClass3MW.A09(r26)     // Catch:{ InterruptedException -> 0x0310 }
            X.4RR r3 = r2.A03     // Catch:{ InterruptedException -> 0x0310 }
            X.2ch r1 = r3.A07     // Catch:{ InterruptedException -> 0x0310 }
            boolean r0 = r4 instanceof X.AnonymousClass210     // Catch:{ InterruptedException -> 0x0310 }
            if (r0 == 0) goto L_0x005a
            r0 = 65536(0x10000, float:9.18355E-41)
            boolean r0 = r4.A0z(r0)     // Catch:{ InterruptedException -> 0x0310 }
            if (r0 == 0) goto L_0x005a
            X.0ve r6 = r1.A00     // Catch:{ InterruptedException -> 0x0310 }
            r1 = 12655(0x316f, float:1.7733E-41)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ InterruptedException -> 0x0310 }
            boolean r0 = X.C18020vd.A05(r0, r6, r1)     // Catch:{ InterruptedException -> 0x0310 }
            r8 = 1
            if (r0 != 0) goto L_0x005b
        L_0x005a:
            r8 = 0
        L_0x005b:
            boolean r0 = X.C87494Vu.A00(r4)     // Catch:{ InterruptedException -> 0x0310 }
            if (r0 == 0) goto L_0x011a
            X.0ve r6 = r3.A06     // Catch:{ InterruptedException -> 0x0310 }
            if (r6 == 0) goto L_0x011a
            X.0vf r1 = X.C18040vf.A01     // Catch:{ InterruptedException -> 0x0310 }
            r0 = 9318(0x2466, float:1.3057E-41)
            boolean r0 = X.C18020vd.A05(r1, r6, r0)     // Catch:{ InterruptedException -> 0x0310 }
            if (r0 == 0) goto L_0x011a
            X.1np r6 = r3.A09     // Catch:{ InterruptedException -> 0x0310 }
            java.lang.String r7 = r2.A00     // Catch:{ InterruptedException -> 0x0310 }
            r0 = 0
            r6.A09(r5, r7, r0)     // Catch:{ InterruptedException -> 0x0310 }
            java.lang.String r12 = r4.A0X     // Catch:{ InterruptedException -> 0x0310 }
            if (r12 == 0) goto L_0x0121
            r8 = 0
            r11 = 0
        L_0x007d:
            int r10 = r12.length()     // Catch:{ InterruptedException -> 0x0310 }
            if (r8 >= r10) goto L_0x0121
            int r0 = r5.length()     // Catch:{ InterruptedException -> 0x0310 }
            if (r11 >= r0) goto L_0x0121
            char r1 = r5.charAt(r11)     // Catch:{ InterruptedException -> 0x0310 }
            char r0 = r12.charAt(r8)     // Catch:{ InterruptedException -> 0x0310 }
            if (r1 != r0) goto L_0x0098
            int r11 = r11 + 1
            int r8 = r8 + 1
            goto L_0x007d
        L_0x0098:
            int r0 = r8 + 1
            if (r0 >= r10) goto L_0x00a9
            int r0 = r8 + 1
            char r1 = r12.charAt(r0)     // Catch:{ InterruptedException -> 0x0310 }
            char r0 = r5.charAt(r11)     // Catch:{ InterruptedException -> 0x0310 }
            if (r1 == r0) goto L_0x00a9
            goto L_0x0121
        L_0x00a9:
            r9 = r8
            r14 = 0
            r13 = 0
        L_0x00ac:
            r0 = 1
            int r0 = r10 - r0
            if (r9 >= r0) goto L_0x00cb
            if (r14 != 0) goto L_0x00ce
            int r9 = r9 + 1
            char r1 = r12.charAt(r9)     // Catch:{ InterruptedException -> 0x0310 }
            r0 = 91
            if (r1 != r0) goto L_0x00c0
            int r13 = r13 + 1
            goto L_0x00ac
        L_0x00c0:
            r0 = 93
            if (r1 != r0) goto L_0x00ac
            if (r13 != 0) goto L_0x00c8
            r14 = 1
            goto L_0x00ac
        L_0x00c8:
            int r13 = r13 + -1
            goto L_0x00ac
        L_0x00cb:
            if (r14 != 0) goto L_0x00ce
            goto L_0x0121
        L_0x00ce:
            r0 = -1
            if (r9 == r0) goto L_0x0121
            int r9 = r9 - r8
            int r0 = r9 + r8
            int r13 = r9 + -2
            int r8 = r0 + 1
            char r1 = r12.charAt(r8)     // Catch:{ InterruptedException -> 0x0310 }
            r0 = 40
            if (r1 != r0) goto L_0x007d
            r10 = r8
        L_0x00e1:
            int r10 = r10 + 1
            char r1 = r12.charAt(r10)     // Catch:{ InterruptedException -> 0x0310 }
            r0 = 41
            if (r1 != r0) goto L_0x00e1
            int r0 = r8 + 1
            java.lang.CharSequence r0 = r12.subSequence(r0, r10)     // Catch:{ InterruptedException -> 0x0310 }
            java.lang.String r1 = r0.toString()     // Catch:{ InterruptedException -> 0x0310 }
            java.util.regex.Pattern r0 = X.C50912Wg.A00     // Catch:{ InterruptedException -> 0x0310 }
            java.util.regex.Matcher r0 = r0.matcher(r1)     // Catch:{ InterruptedException -> 0x0310 }
            boolean r0 = r0.find()     // Catch:{ InterruptedException -> 0x0310 }
            if (r0 == 0) goto L_0x0113
            java.lang.String r9 = X.C32011gU.A00(r1)     // Catch:{ InterruptedException -> 0x0310 }
            int r0 = r11 + r13
            int r8 = r0 + 1
            android.text.style.URLSpan r1 = new android.text.style.URLSpan     // Catch:{ InterruptedException -> 0x0310 }
            r1.<init>(r9)     // Catch:{ InterruptedException -> 0x0310 }
            r0 = 33
            r5.setSpan(r1, r11, r8, r0)     // Catch:{ InterruptedException -> 0x0310 }
        L_0x0113:
            int r0 = r13 + 1
            int r11 = r11 + r0
            int r8 = r10 + 1
            goto L_0x007d
        L_0x011a:
            X.1np r6 = r3.A09     // Catch:{ InterruptedException -> 0x0310 }
            java.lang.String r7 = r2.A00     // Catch:{ InterruptedException -> 0x0310 }
            r6.A09(r5, r7, r8)     // Catch:{ InterruptedException -> 0x0310 }
        L_0x0121:
            X.00H r0 = r6.A03     // Catch:{ InterruptedException -> 0x0310 }
            r23 = r0
            java.lang.Object r0 = r23.get()     // Catch:{ InterruptedException -> 0x0310 }
            X.2sf r0 = (X.C63192sf) r0     // Catch:{ InterruptedException -> 0x0310 }
            r0.A02(r5, r4)     // Catch:{ InterruptedException -> 0x0310 }
            java.lang.Class<android.text.style.URLSpan> r20 = android.text.style.URLSpan.class
            java.util.ArrayList r1 = X.C26302CxJ.A0H(r5)     // Catch:{ InterruptedException -> 0x0310 }
            if (r1 == 0) goto L_0x0005
            boolean r0 = r1.isEmpty()     // Catch:{ InterruptedException -> 0x0310 }
            if (r0 != 0) goto L_0x0005
            X.11C r0 = r3.A04     // Catch:{ InterruptedException -> 0x0310 }
            r22 = r0
            X.0vc r0 = r3.A08     // Catch:{ InterruptedException -> 0x0310 }
            r21 = r0
            java.util.Iterator r19 = r1.iterator()     // Catch:{ InterruptedException -> 0x0310 }
        L_0x0148:
            boolean r0 = r19.hasNext()     // Catch:{ InterruptedException -> 0x0310 }
            if (r0 == 0) goto L_0x02a6
            java.lang.Object r10 = r19.next()     // Catch:{ InterruptedException -> 0x0310 }
            int r9 = r5.getSpanStart(r10)     // Catch:{ InterruptedException -> 0x0310 }
            int r8 = r5.getSpanEnd(r10)     // Catch:{ InterruptedException -> 0x0310 }
            r0 = -1
            if (r9 == r0) goto L_0x029f
            if (r8 == r0) goto L_0x029f
            java.util.HashMap r13 = X.C17880vN.A11()     // Catch:{ InterruptedException -> 0x0310 }
            java.lang.Class<android.text.style.StyleSpan> r0 = android.text.style.StyleSpan.class
            java.lang.Object[] r11 = r5.getSpans(r9, r8, r0)     // Catch:{ InterruptedException -> 0x0310 }
            android.text.style.StyleSpan[] r11 = (android.text.style.StyleSpan[]) r11     // Catch:{ InterruptedException -> 0x0310 }
            int r0 = r11.length     // Catch:{ InterruptedException -> 0x0310 }
            r16 = r0
            r14 = 0
            r12 = 0
        L_0x0170:
            r0 = r16
            if (r12 >= r0) goto L_0x01c4
            r15 = r11[r12]     // Catch:{ InterruptedException -> 0x0310 }
            int r0 = r5.getSpanStart(r15)     // Catch:{ InterruptedException -> 0x0310 }
            if (r0 > r9) goto L_0x0183
            int r0 = r5.getSpanEnd(r15)     // Catch:{ InterruptedException -> 0x0310 }
            if (r0 < r8) goto L_0x0183
            goto L_0x01c1
        L_0x0183:
            int r1 = r15.getStyle()     // Catch:{ InterruptedException -> 0x0310 }
            r0 = 1
            if (r1 != r0) goto L_0x01a2
            r0 = 42
            java.lang.Character r1 = java.lang.Character.valueOf(r0)     // Catch:{ InterruptedException -> 0x0310 }
            java.lang.Object r0 = r13.get(r1)     // Catch:{ InterruptedException -> 0x0310 }
            if (r0 != 0) goto L_0x019d
            java.util.ArrayList r0 = X.AnonymousClass000.A13()     // Catch:{ InterruptedException -> 0x0310 }
            r13.put(r1, r0)     // Catch:{ InterruptedException -> 0x0310 }
        L_0x019d:
            java.util.List r0 = (java.util.List) r0     // Catch:{ InterruptedException -> 0x0310 }
            r0.add(r15)     // Catch:{ InterruptedException -> 0x0310 }
        L_0x01a2:
            int r1 = r15.getStyle()     // Catch:{ InterruptedException -> 0x0310 }
            r0 = 2
            if (r1 != r0) goto L_0x01c1
            r0 = 95
            java.lang.Character r1 = java.lang.Character.valueOf(r0)     // Catch:{ InterruptedException -> 0x0310 }
            java.lang.Object r0 = r13.get(r1)     // Catch:{ InterruptedException -> 0x0310 }
            if (r0 != 0) goto L_0x01bc
            java.util.ArrayList r0 = X.AnonymousClass000.A13()     // Catch:{ InterruptedException -> 0x0310 }
            r13.put(r1, r0)     // Catch:{ InterruptedException -> 0x0310 }
        L_0x01bc:
            java.util.List r0 = (java.util.List) r0     // Catch:{ InterruptedException -> 0x0310 }
            r0.add(r15)     // Catch:{ InterruptedException -> 0x0310 }
        L_0x01c1:
            int r12 = r12 + 1
            goto L_0x0170
        L_0x01c4:
            java.lang.Class<android.text.style.StrikethroughSpan> r0 = android.text.style.StrikethroughSpan.class
            java.lang.Object[] r15 = r5.getSpans(r9, r8, r0)     // Catch:{ InterruptedException -> 0x0310 }
            android.text.style.StrikethroughSpan[] r15 = (android.text.style.StrikethroughSpan[]) r15     // Catch:{ InterruptedException -> 0x0310 }
            int r12 = r15.length     // Catch:{ InterruptedException -> 0x0310 }
        L_0x01cd:
            if (r14 >= r12) goto L_0x01f9
            r11 = r15[r14]     // Catch:{ InterruptedException -> 0x0310 }
            int r0 = r5.getSpanStart(r11)     // Catch:{ InterruptedException -> 0x0310 }
            if (r0 > r9) goto L_0x01de
            int r0 = r5.getSpanEnd(r11)     // Catch:{ InterruptedException -> 0x0310 }
            if (r0 < r8) goto L_0x01de
            goto L_0x01f6
        L_0x01de:
            r0 = 126(0x7e, float:1.77E-43)
            java.lang.Character r1 = java.lang.Character.valueOf(r0)     // Catch:{ InterruptedException -> 0x0310 }
            java.lang.Object r0 = r13.get(r1)     // Catch:{ InterruptedException -> 0x0310 }
            if (r0 != 0) goto L_0x01f1
            java.util.ArrayList r0 = X.AnonymousClass000.A13()     // Catch:{ InterruptedException -> 0x0310 }
            r13.put(r1, r0)     // Catch:{ InterruptedException -> 0x0310 }
        L_0x01f1:
            java.util.List r0 = (java.util.List) r0     // Catch:{ InterruptedException -> 0x0310 }
            r0.add(r11)     // Catch:{ InterruptedException -> 0x0310 }
        L_0x01f6:
            int r14 = r14 + 1
            goto L_0x01cd
        L_0x01f9:
            java.util.Iterator r18 = X.C17890vO.A0i(r13)     // Catch:{ InterruptedException -> 0x0310 }
            r11 = 0
            r17 = 0
        L_0x0200:
            boolean r0 = r18.hasNext()     // Catch:{ InterruptedException -> 0x0310 }
            if (r0 == 0) goto L_0x0251
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r18)     // Catch:{ InterruptedException -> 0x0310 }
            java.lang.Object r14 = r0.getKey()     // Catch:{ InterruptedException -> 0x0310 }
            java.lang.Object r1 = r0.getValue()     // Catch:{ InterruptedException -> 0x0310 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ InterruptedException -> 0x0310 }
            if (r1 == 0) goto L_0x0200
            boolean r0 = r1.isEmpty()     // Catch:{ InterruptedException -> 0x0310 }
            if (r0 != 0) goto L_0x0200
            java.util.Iterator r16 = r1.iterator()     // Catch:{ InterruptedException -> 0x0310 }
        L_0x0220:
            boolean r0 = r16.hasNext()     // Catch:{ InterruptedException -> 0x0310 }
            if (r0 == 0) goto L_0x0200
            java.lang.Object r13 = r16.next()     // Catch:{ InterruptedException -> 0x0310 }
            int r17 = r17 + 2
            int r12 = r5.getSpanStart(r13)     // Catch:{ InterruptedException -> 0x0310 }
            int r1 = r5.getSpanEnd(r13)     // Catch:{ InterruptedException -> 0x0310 }
            java.lang.StringBuilder r15 = X.AnonymousClass000.A10()     // Catch:{ InterruptedException -> 0x0310 }
            java.lang.String r0 = r14.toString()     // Catch:{ InterruptedException -> 0x0310 }
            r15.append(r0)     // Catch:{ InterruptedException -> 0x0310 }
            java.lang.CharSequence r0 = r5.subSequence(r12, r1)     // Catch:{ InterruptedException -> 0x0310 }
            r15.append(r0)     // Catch:{ InterruptedException -> 0x0310 }
            java.lang.String r0 = X.C17890vO.A0V(r14, r15)     // Catch:{ InterruptedException -> 0x0310 }
            r5.replace(r12, r1, r0)     // Catch:{ InterruptedException -> 0x0310 }
            r5.removeSpan(r13)     // Catch:{ InterruptedException -> 0x0310 }
            goto L_0x0220
        L_0x0251:
            if (r17 <= 0) goto L_0x0148
            int r8 = r8 + r17
            java.lang.CharSequence r0 = r5.subSequence(r9, r8)     // Catch:{ InterruptedException -> 0x0310 }
            java.lang.String r0 = r0.toString()     // Catch:{ InterruptedException -> 0x0310 }
            android.text.SpannableStringBuilder r12 = X.AnonymousClass3MW.A09(r0)     // Catch:{ InterruptedException -> 0x0310 }
            r6.A09(r12, r7, r11)     // Catch:{ InterruptedException -> 0x0310 }
            java.lang.Object r0 = r23.get()     // Catch:{ InterruptedException -> 0x0310 }
            X.2sf r0 = (X.C63192sf) r0     // Catch:{ InterruptedException -> 0x0310 }
            r0.A02(r12, r4)     // Catch:{ InterruptedException -> 0x0310 }
            int r1 = r12.length()     // Catch:{ InterruptedException -> 0x0310 }
            r0 = r20
            java.lang.Object[] r0 = r12.getSpans(r11, r1, r0)     // Catch:{ InterruptedException -> 0x0310 }
            android.text.style.URLSpan[] r0 = (android.text.style.URLSpan[]) r0     // Catch:{ InterruptedException -> 0x0310 }
            int r0 = r0.length     // Catch:{ InterruptedException -> 0x0310 }
            if (r0 != 0) goto L_0x0297
            r1 = r22
            r0 = r21
            X.C26302CxJ.A0C(r1, r0, r12)     // Catch:{ InterruptedException -> 0x0310 }
            java.lang.String r0 = ""
            android.text.style.URLSpan r13 = new android.text.style.URLSpan     // Catch:{ InterruptedException -> 0x0310 }
            r13.<init>(r0)     // Catch:{ InterruptedException -> 0x0310 }
            int r11 = r5.length()     // Catch:{ InterruptedException -> 0x0310 }
            int r1 = r5.length()     // Catch:{ InterruptedException -> 0x0310 }
            r0 = 17
            r5.setSpan(r13, r11, r1, r0)     // Catch:{ InterruptedException -> 0x0310 }
        L_0x0297:
            r5.removeSpan(r10)     // Catch:{ InterruptedException -> 0x0310 }
            r5.replace(r9, r8, r12)     // Catch:{ InterruptedException -> 0x0310 }
            goto L_0x0148
        L_0x029f:
            java.lang.String r0 = "AsyncLinkifier/unFormatLinks/unformat missing url span"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ InterruptedException -> 0x0310 }
            goto L_0x0148
        L_0x02a6:
            int r1 = r5.length()     // Catch:{ InterruptedException -> 0x0310 }
            r11 = 0
            r0 = r20
            java.lang.Object[] r10 = r5.getSpans(r11, r1, r0)     // Catch:{ InterruptedException -> 0x0310 }
            android.text.style.URLSpan[] r10 = (android.text.style.URLSpan[]) r10     // Catch:{ InterruptedException -> 0x0310 }
            if (r10 == 0) goto L_0x02df
            int r9 = r10.length     // Catch:{ InterruptedException -> 0x0310 }
        L_0x02b6:
            if (r11 >= r9) goto L_0x02df
            r8 = r10[r11]     // Catch:{ InterruptedException -> 0x0310 }
            if (r8 == 0) goto L_0x02dc
            java.lang.String r7 = r8.getURL()     // Catch:{ InterruptedException -> 0x0310 }
            if (r7 == 0) goto L_0x02dc
            X.1no r1 = r6.A01     // Catch:{ InterruptedException -> 0x0310 }
            com.whatsapp.jid.UserJid r0 = r4.A0I()     // Catch:{ InterruptedException -> 0x0310 }
            java.util.Set r1 = r1.BX2(r0, r4, r7)     // Catch:{ InterruptedException -> 0x0310 }
            if (r1 == 0) goto L_0x02dc
            boolean r0 = r1.isEmpty()     // Catch:{ InterruptedException -> 0x0310 }
            if (r0 != 0) goto L_0x02dc
            X.3Nb r0 = new X.3Nb     // Catch:{ InterruptedException -> 0x0310 }
            r0.<init>(r7, r1)     // Catch:{ InterruptedException -> 0x0310 }
            X.C72473Md.A0x(r5, r8, r0)     // Catch:{ InterruptedException -> 0x0310 }
        L_0x02dc:
            int r11 = r11 + 1
            goto L_0x02b6
        L_0x02df:
            X.00z r6 = r3.A01     // Catch:{ InterruptedException -> 0x0310 }
            java.lang.String r1 = r26.toString()     // Catch:{ InterruptedException -> 0x0310 }
            android.text.SpannableStringBuilder r0 = X.AnonymousClass3MW.A09(r5)     // Catch:{ InterruptedException -> 0x0310 }
            r6.A08(r1, r0)     // Catch:{ InterruptedException -> 0x0310 }
            java.lang.Object r0 = r25.getTag()     // Catch:{ InterruptedException -> 0x0310 }
            boolean r0 = r4.equals(r0)     // Catch:{ InterruptedException -> 0x0310 }
            if (r0 == 0) goto L_0x0005
            X.1KB r1 = r3.A02     // Catch:{ InterruptedException -> 0x0310 }
            r13 = 9
            X.Akd r0 = new X.Akd     // Catch:{ InterruptedException -> 0x0310 }
            r6 = r0
            r7 = r24
            r8 = r4
            r9 = r5
            r10 = r3
            r11 = r2
            r12 = r25
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ InterruptedException -> 0x0310 }
            r1.A0J(r0)     // Catch:{ InterruptedException -> 0x0310 }
            goto L_0x0005
        L_0x030d:
            r1 = 0
            goto L_0x0031
        L_0x0310:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C827249m.run():void");
    }
}
