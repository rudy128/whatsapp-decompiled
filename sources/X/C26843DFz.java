package X;

/* renamed from: X.DFz  reason: case insensitive filesystem */
public class C26843DFz implements C28508E4s {
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0310, code lost:
        if (r17 == false) goto L_0x0320;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0314, code lost:
        if (r14 == 2) goto L_0x042f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0316, code lost:
        if (r1 > 0) goto L_0x042f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0318, code lost:
        r3 = X.AnonymousClass000.A0k("IPV6 address with zero elision must have at least one non-zero piece");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0322, code lost:
        if (r1 == 8) goto L_0x042f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0324, code lost:
        if (r14 == 1) goto L_0x0352;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0328, code lost:
        if (r11 == 4) goto L_0x033e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x032a, code lost:
        r1 = X.AnonymousClass000.A10();
        r1.append("IPV6 address with IPV4 ending must specify exactly 4 IPV4 octets, found ");
        r1.append(r11);
        r3 = X.AnonymousClass001.A12(" octets", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x033e, code lost:
        r2 = X.AnonymousClass000.A10();
        r2.append("IPV6 without zero elision must have have exactly 8 pieces, found ");
        r2.append(r1);
        r3 = X.AnonymousClass001.A12(" pieces", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0352, code lost:
        r3 = X.AnonymousClass000.A0k("IPV6 must not end with a single colon");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0437, code lost:
        if (r21 < (r23.length() - 1)) goto L_0x0403;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0439, code lost:
        r0 = new X.C26006CqN(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:?, code lost:
        r1 = X.AnonymousClass000.A10();
        X.BEA.A1R("Query contains illegal character ", r1, r8);
        r1 = X.AnonymousClass001.A13(" at string index ", r1, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:?, code lost:
        r1 = X.AnonymousClass000.A10();
        X.BEA.A1R("Fragment contains illegal character ", r1, r2);
        r1 = X.AnonymousClass001.A13(" at string index ", r1, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x06af, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x06b0, code lost:
        r5.A00 = r0.mAuthority;
        r3 = new X.C2N(new X.C25730Cl0(r5), "Unable to parse authority");
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String CGc(java.lang.String r28) {
        /*
            r27 = this;
            X.CST r5 = new X.CST     // Catch:{ C2N -> 0x06c1 }
            r5.<init>()     // Catch:{ C2N -> 0x06c1 }
            r6 = r28
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch:{ C2N -> 0x06c1 }
            if (r0 != 0) goto L_0x06a2
            java.text.BreakIterator r4 = java.text.BreakIterator.getCharacterInstance()     // Catch:{ C2N -> 0x06c1 }
            r0 = 58
            int r11 = r6.indexOf(r0)     // Catch:{ C2N -> 0x06c1 }
            int r3 = r6.length()     // Catch:{ C2N -> 0x06c1 }
            r0 = 3
            int[] r2 = new int[r0]     // Catch:{ C2N -> 0x06c1 }
            r0 = 47
            r7 = 0
            int r0 = r6.indexOf(r0, r7)     // Catch:{ C2N -> 0x06c1 }
            r2[r7] = r0     // Catch:{ C2N -> 0x06c1 }
            r0 = 63
            int r1 = r6.indexOf(r0, r7)     // Catch:{ C2N -> 0x06c1 }
            r0 = 1
            r2[r0] = r1     // Catch:{ C2N -> 0x06c1 }
            r0 = 35
            int r1 = r6.indexOf(r0, r7)     // Catch:{ C2N -> 0x06c1 }
            r0 = 2
            r2[r0] = r1     // Catch:{ C2N -> 0x06c1 }
            int r0 = X.C25730Cl0.A00(r2, r3)     // Catch:{ C2N -> 0x06c1 }
            if (r11 < 0) goto L_0x00ec
            if (r11 > r0) goto L_0x00ec
            java.lang.String r10 = r6.substring(r7, r11)     // Catch:{ C2N -> 0x06c1 }
            r5.A04 = r10     // Catch:{ C2N -> 0x06c1 }
            if (r10 == 0) goto L_0x0050
            int r0 = r11 + 1
            if (r3 == r0) goto L_0x0050
            r6.codePointAt(r0)     // Catch:{ C2N -> 0x06c1 }
        L_0x0050:
            boolean r0 = android.text.TextUtils.isEmpty(r10)     // Catch:{ IllegalArgumentException -> 0x00dd }
            if (r0 != 0) goto L_0x0079
            r4.setText(r10)     // Catch:{ IllegalArgumentException -> 0x00dd }
            int r1 = r10.length()     // Catch:{ IllegalArgumentException -> 0x00dd }
            int r2 = r4.current()     // Catch:{ IllegalArgumentException -> 0x00dd }
            int r8 = r10.codePointAt(r2)     // Catch:{ IllegalArgumentException -> 0x00dd }
            r0 = 65
            if (r8 < r0) goto L_0x0077
            r0 = 90
            if (r8 <= r0) goto L_0x0075
            r0 = 97
            if (r8 < r0) goto L_0x0077
            r0 = 122(0x7a, float:1.71E-43)
            if (r8 > r0) goto L_0x0077
        L_0x0075:
            r0 = 1
            goto L_0x0080
        L_0x0077:
            r0 = 0
            goto L_0x0080
        L_0x0079:
            java.lang.String r0 = "Scheme cannot be empty"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)     // Catch:{ IllegalArgumentException -> 0x00dd }
            goto L_0x0092
        L_0x0080:
            java.lang.String r9 = "Scheme contains illegal character "
            r13 = 1
            if (r0 != 0) goto L_0x0093
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IllegalArgumentException -> 0x00dd }
            X.BEA.A1R(r9, r1, r8)     // Catch:{ IllegalArgumentException -> 0x00dd }
            java.lang.String r0 = " at string index "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A13(r0, r1, r2)     // Catch:{ IllegalArgumentException -> 0x00dd }
        L_0x0092:
            throw r0     // Catch:{ IllegalArgumentException -> 0x00dd }
        L_0x0093:
            int r8 = r4.next()     // Catch:{ IllegalArgumentException -> 0x00dd }
            r0 = -1
            if (r8 == r0) goto L_0x00da
            if (r8 >= r1) goto L_0x00da
            int r2 = r10.codePointAt(r8)     // Catch:{ IllegalArgumentException -> 0x00dd }
            r0 = 65
            if (r2 < r0) goto L_0x00a5
            goto L_0x00b8
        L_0x00a5:
            r12 = 48
            r0 = 57
            if (r2 >= r12) goto L_0x00c2
            r0 = 43
            if (r2 == r0) goto L_0x0093
            r0 = 45
            if (r2 == r0) goto L_0x0093
            r0 = 46
            if (r2 != r0) goto L_0x00c5
            goto L_0x0093
        L_0x00b8:
            r0 = 90
            if (r2 <= r0) goto L_0x0093
            r0 = 97
            if (r2 < r0) goto L_0x00c5
            r0 = 122(0x7a, float:1.71E-43)
        L_0x00c2:
            if (r2 > r0) goto L_0x00c5
            goto L_0x0093
        L_0x00c5:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IllegalArgumentException -> 0x00dd }
            X.BEA.A1R(r9, r1, r2)     // Catch:{ IllegalArgumentException -> 0x00dd }
            java.lang.String r0 = " at code point offset "
            r1.append(r0)     // Catch:{ IllegalArgumentException -> 0x00dd }
            int r8 = r8 - r13
            r1.append(r8)     // Catch:{ IllegalArgumentException -> 0x00dd }
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0j(r1)     // Catch:{ IllegalArgumentException -> 0x00dd }
            goto L_0x0092
        L_0x00da:
            int r26 = r11 + 1
            goto L_0x00ee
        L_0x00dd:
            r2 = move-exception
            java.lang.String r1 = "Uri contained an invalid scheme"
            X.Cl0 r0 = new X.Cl0     // Catch:{ C2N -> 0x06c1 }
            r0.<init>(r5)     // Catch:{ C2N -> 0x06c1 }
            X.C2N r3 = new X.C2N     // Catch:{ C2N -> 0x06c1 }
            r3.<init>(r0, r1, r2)     // Catch:{ C2N -> 0x06c1 }
            goto L_0x06c0
        L_0x00ec:
            r26 = 0
        L_0x00ee:
            java.lang.String r1 = "//"
            r0 = r26
            int r1 = r6.indexOf(r1, r0)     // Catch:{ C2N -> 0x06c1 }
            r6.substring(r0)     // Catch:{ C2N -> 0x06c1 }
            r25 = 2
            r2 = 1
            if (r1 != r0) goto L_0x049e
            int r1 = r1 + 2
            r0 = 3
            int[] r8 = new int[r0]     // Catch:{ C2N -> 0x06c1 }
            r0 = 47
            int r0 = r6.indexOf(r0, r1)     // Catch:{ C2N -> 0x06c1 }
            r8[r7] = r0     // Catch:{ C2N -> 0x06c1 }
            r0 = 63
            int r0 = r6.indexOf(r0, r1)     // Catch:{ C2N -> 0x06c1 }
            r8[r2] = r0     // Catch:{ C2N -> 0x06c1 }
            r0 = 35
            int r0 = r6.indexOf(r0, r1)     // Catch:{ C2N -> 0x06c1 }
            r8[r25] = r0     // Catch:{ C2N -> 0x06c1 }
            int r24 = X.C25730Cl0.A00(r8, r3)     // Catch:{ C2N -> 0x06c1 }
            if (r1 >= r3) goto L_0x04a0
            int r0 = r24 - r1
            if (r0 <= 0) goto L_0x04a0
            r0 = r24
            java.lang.String r12 = r6.substring(r1, r0)     // Catch:{ C2M -> 0x06af }
            r0 = 64
            int r0 = r12.indexOf(r0)     // Catch:{ C2M -> 0x06af }
            r10 = 0
            if (r0 <= 0) goto L_0x013b
            java.lang.String r9 = r12.substring(r7, r0)     // Catch:{ C2M -> 0x06af }
            int r1 = r0 + 1
            goto L_0x013d
        L_0x013b:
            r9 = r10
            r1 = 0
        L_0x013d:
            boolean r0 = android.text.TextUtils.isEmpty(r9)     // Catch:{ IllegalArgumentException -> 0x047e }
            if (r0 != 0) goto L_0x01a3
            r4.setText(r9)     // Catch:{ IllegalArgumentException -> 0x047e }
            int r13 = r9.length()     // Catch:{ IllegalArgumentException -> 0x047e }
            int r0 = r4.current()     // Catch:{ IllegalArgumentException -> 0x047e }
            r9.codePointAt(r0)     // Catch:{ IllegalArgumentException -> 0x047e }
            int r8 = r4.next()     // Catch:{ IllegalArgumentException -> 0x047e }
        L_0x0155:
            if (r8 >= r13) goto L_0x01a3
            r0 = -1
            if (r8 == r0) goto L_0x01a3
            int r11 = r9.codePointAt(r8)     // Catch:{ IllegalArgumentException -> 0x047e }
            boolean r0 = X.C26059CrY.A03(r11)     // Catch:{ IllegalArgumentException -> 0x047e }
            if (r0 != 0) goto L_0x017d
            boolean r0 = X.C26059CrY.A02(r11)     // Catch:{ IllegalArgumentException -> 0x047e }
            if (r0 != 0) goto L_0x017d
            r0 = 37
            if (r11 == r0) goto L_0x0177
            r0 = 58
            if (r11 == r0) goto L_0x017d
            r0 = 63
            if (r11 == r0) goto L_0x017d
            goto L_0x0182
        L_0x0177:
            r4.next()     // Catch:{ IllegalArgumentException -> 0x0192 }
            X.C26059CrY.A00(r9, r4)     // Catch:{ IllegalArgumentException -> 0x0192 }
        L_0x017d:
            int r8 = r4.next()     // Catch:{ IllegalArgumentException -> 0x047e }
            goto L_0x0155
        L_0x0182:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IllegalArgumentException -> 0x047e }
            java.lang.String r0 = "UserInfo contains illegal character "
            X.BEA.A1R(r0, r1, r11)     // Catch:{ IllegalArgumentException -> 0x047e }
            java.lang.String r0 = " at string index "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A13(r0, r1, r8)     // Catch:{ IllegalArgumentException -> 0x047e }
            throw r0     // Catch:{ IllegalArgumentException -> 0x047e }
        L_0x0192:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IllegalArgumentException -> 0x047e }
            java.lang.String r0 = "UserInfo contains invalid percent encoded character at string index "
            java.lang.String r1 = X.AnonymousClass001.A1I(r0, r1, r8)     // Catch:{ IllegalArgumentException -> 0x047e }
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x047e }
            r0.<init>(r1, r2)     // Catch:{ IllegalArgumentException -> 0x047e }
            throw r0     // Catch:{ IllegalArgumentException -> 0x047e }
        L_0x01a3:
            int r0 = r12.length()     // Catch:{ C2M -> 0x06af }
            if (r1 >= r0) goto L_0x0471
            java.lang.String r23 = r12.substring(r1)     // Catch:{ C2M -> 0x06af }
            r1 = 58
            r0 = r23
            int r22 = r0.lastIndexOf(r1)     // Catch:{ C2M -> 0x06af }
            if (r22 == 0) goto L_0x0464
            java.lang.String r1 = "["
            boolean r0 = r0.startsWith(r1)     // Catch:{ C2M -> 0x06af }
            if (r0 == 0) goto L_0x03a0
            r1 = 93
            r0 = r23
            int r0 = r0.lastIndexOf(r1)     // Catch:{ C2M -> 0x06af }
            if (r0 < 0) goto L_0x0392
            int r21 = r0 + 1
            r1 = r21
            r0 = r23
            java.lang.String r8 = r0.substring(r7, r1)     // Catch:{ C2M -> 0x06af }
            boolean r0 = android.text.TextUtils.isEmpty(r8)     // Catch:{ C2M -> 0x06af }
            if (r0 != 0) goto L_0x038a
            r4.setText(r8)     // Catch:{ C2M -> 0x06af }
            int r20 = r8.length()     // Catch:{ C2M -> 0x06af }
            int r1 = r4.current()     // Catch:{ C2M -> 0x06af }
            r0 = r20
            if (r1 >= r0) goto L_0x0382
            r0 = -1
            if (r1 == r0) goto L_0x0382
            int r11 = r8.codePointAt(r1)     // Catch:{ C2M -> 0x06af }
            r0 = 91
            if (r11 != r0) goto L_0x036a
            int r13 = r4.next()     // Catch:{ C2M -> 0x06af }
            r0 = r20
            if (r13 >= r0) goto L_0x0362
            r0 = -1
            if (r13 == r0) goto L_0x0362
            int r1 = r8.codePointAt(r13)     // Catch:{ C2M -> 0x06af }
            r0 = 86
            if (r1 == r0) goto L_0x035a
            r0 = 118(0x76, float:1.65E-43)
            if (r1 == r0) goto L_0x035a
            r19 = 4
            java.nio.CharBuffer r18 = java.nio.CharBuffer.allocate(r19)     // Catch:{ C2M -> 0x06af }
            r0 = r18
            java.nio.Buffer r0 = r0.position(r7)     // Catch:{ C2M -> 0x06af }
            if (r0 == 0) goto L_0x0221
            r0 = r18
            java.nio.Buffer r0 = r0.position(r7)     // Catch:{ C2M -> 0x06af }
            r0.limit(r7)     // Catch:{ C2M -> 0x06af }
        L_0x0221:
            r12 = 0
            r14 = 0
            r11 = 0
            r1 = 0
            r17 = 0
            r16 = 1
        L_0x0229:
            r0 = r20
            if (r13 >= r0) goto L_0x0310
            r0 = -1
            if (r13 == r0) goto L_0x0310
            int r15 = r8.codePointAt(r13)     // Catch:{ C2M -> 0x06af }
            boolean r0 = X.C26059CrY.A01(r15)     // Catch:{ C2M -> 0x06af }
            if (r0 == 0) goto L_0x0252
            if (r12 != 0) goto L_0x023e
            int r1 = r1 + 1
        L_0x023e:
            int r12 = r12 + 1
            r0 = r19
            if (r12 > r0) goto L_0x048c
            r0 = r18
            r0.limit(r12)     // Catch:{ C2M -> 0x06af }
            int r14 = r12 + -1
            char r13 = (char) r15     // Catch:{ C2M -> 0x06af }
            r0 = r18
            r0.put(r14, r13)     // Catch:{ C2M -> 0x06af }
            goto L_0x0291
        L_0x0252:
            r0 = 46
            if (r15 == r0) goto L_0x0275
            r0 = 58
            if (r15 == r0) goto L_0x0261
            r0 = 93
            if (r15 != r0) goto L_0x02a8
            if (r11 <= 0) goto L_0x0310
            goto L_0x02a4
        L_0x0261:
            int r14 = r14 + 1
            r0 = r25
            if (r14 != r0) goto L_0x026e
            if (r17 != 0) goto L_0x02c1
            r17 = 1
        L_0x026b:
            if (r11 <= 0) goto L_0x028f
            goto L_0x02b9
        L_0x026e:
            if (r14 > r0) goto L_0x02e1
            if (r16 != 0) goto L_0x026b
            if (r12 != 0) goto L_0x026b
            goto L_0x02d5
        L_0x0275:
            X.C26006CqN.A00(r18)     // Catch:{ C2M -> 0x06af }
            r0 = r18
            java.nio.Buffer r0 = r0.position(r7)     // Catch:{ C2M -> 0x06af }
            if (r0 == 0) goto L_0x0289
            r0 = r18
            java.nio.Buffer r0 = r0.position(r7)     // Catch:{ C2M -> 0x06af }
            r0.limit(r7)     // Catch:{ C2M -> 0x06af }
        L_0x0289:
            if (r12 <= 0) goto L_0x028d
            int r1 = r1 + -1
        L_0x028d:
            int r11 = r11 + 1
        L_0x028f:
            r12 = 0
            goto L_0x0292
        L_0x0291:
            r14 = 0
        L_0x0292:
            r0 = 8
            if (r17 == 0) goto L_0x0297
            r0 = 7
        L_0x0297:
            if (r1 > r0) goto L_0x02fc
            r0 = r19
            if (r11 > r0) goto L_0x02f4
            int r13 = r4.next()     // Catch:{ C2M -> 0x06af }
            r16 = 0
            goto L_0x0229
        L_0x02a4:
            X.C26006CqN.A00(r18)     // Catch:{ C2M -> 0x06af }
            goto L_0x0304
        L_0x02a8:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ C2M -> 0x06af }
            java.lang.String r1 = "Illegal character "
            X.BEA.A1R(r1, r2, r15)     // Catch:{ C2M -> 0x06af }
            java.lang.String r0 = " at string index "
            java.lang.IllegalArgumentException r3 = X.AnonymousClass001.A13(r0, r2, r13)     // Catch:{ C2M -> 0x06af }
            goto L_0x049d
        L_0x02b9:
            java.lang.String r0 = "IPV4 address is only valid at the end of an IPV6 address string"
            java.lang.IllegalArgumentException r3 = X.AnonymousClass000.A0k(r0)     // Catch:{ C2M -> 0x06af }
            goto L_0x049d
        L_0x02c1:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ C2M -> 0x06af }
            java.lang.String r0 = "Second double colon run detected at string index "
            r1.append(r0)     // Catch:{ C2M -> 0x06af }
            int r13 = r13 - r25
            r1.append(r13)     // Catch:{ C2M -> 0x06af }
            java.lang.IllegalArgumentException r3 = X.AnonymousClass000.A0j(r1)     // Catch:{ C2M -> 0x06af }
            goto L_0x049d
        L_0x02d5:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ C2M -> 0x06af }
            java.lang.String r0 = "Missing hex digit before colon at string index "
            java.lang.IllegalArgumentException r3 = X.AnonymousClass001.A13(r0, r1, r13)     // Catch:{ C2M -> 0x06af }
            goto L_0x049d
        L_0x02e1:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ C2M -> 0x06af }
            java.lang.String r0 = "Illegal length colon run starting at string index "
            r1.append(r0)     // Catch:{ C2M -> 0x06af }
            int r13 = r13 - r14
            r1.append(r13)     // Catch:{ C2M -> 0x06af }
            java.lang.IllegalArgumentException r3 = X.AnonymousClass000.A0j(r1)     // Catch:{ C2M -> 0x06af }
            goto L_0x049d
        L_0x02f4:
            java.lang.String r0 = "IPV4 address at the end of IPV6 address must have at most 4 octets"
            java.lang.IllegalArgumentException r3 = X.AnonymousClass000.A0k(r0)     // Catch:{ C2M -> 0x06af }
            goto L_0x049d
        L_0x02fc:
            java.lang.String r0 = "IPV6 must have 8 or fewer pieces"
            java.lang.IllegalArgumentException r3 = X.AnonymousClass000.A0k(r0)     // Catch:{ C2M -> 0x06af }
            goto L_0x049d
        L_0x0304:
            if (r12 <= 0) goto L_0x0308
            int r1 = r1 + -1
        L_0x0308:
            int r11 = r11 + 1
            r0 = r19
            if (r11 != r0) goto L_0x0310
            int r1 = r1 + 2
        L_0x0310:
            if (r17 == 0) goto L_0x0320
            r0 = r25
            if (r14 == r0) goto L_0x042f
            if (r1 > 0) goto L_0x042f
            java.lang.String r0 = "IPV6 address with zero elision must have at least one non-zero piece"
            java.lang.IllegalArgumentException r3 = X.AnonymousClass000.A0k(r0)     // Catch:{ C2M -> 0x06af }
            goto L_0x049d
        L_0x0320:
            r0 = 8
            if (r1 == r0) goto L_0x042f
            if (r14 == r2) goto L_0x0352
            r0 = r19
            if (r11 == r0) goto L_0x033e
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ C2M -> 0x06af }
            java.lang.String r0 = "IPV6 address with IPV4 ending must specify exactly 4 IPV4 octets, found "
            r1.append(r0)     // Catch:{ C2M -> 0x06af }
            r1.append(r11)     // Catch:{ C2M -> 0x06af }
            java.lang.String r0 = " octets"
            java.lang.IllegalArgumentException r3 = X.AnonymousClass001.A12(r0, r1)     // Catch:{ C2M -> 0x06af }
            goto L_0x049d
        L_0x033e:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ C2M -> 0x06af }
            java.lang.String r0 = "IPV6 without zero elision must have have exactly 8 pieces, found "
            r2.append(r0)     // Catch:{ C2M -> 0x06af }
            r2.append(r1)     // Catch:{ C2M -> 0x06af }
            java.lang.String r0 = " pieces"
            java.lang.IllegalArgumentException r3 = X.AnonymousClass001.A12(r0, r2)     // Catch:{ C2M -> 0x06af }
            goto L_0x049d
        L_0x0352:
            java.lang.String r0 = "IPV6 must not end with a single colon"
            java.lang.IllegalArgumentException r3 = X.AnonymousClass000.A0k(r0)     // Catch:{ C2M -> 0x06af }
            goto L_0x049d
        L_0x035a:
            java.lang.String r0 = "IPFuture address types not supported"
            java.lang.IllegalArgumentException r3 = X.AnonymousClass000.A0k(r0)     // Catch:{ C2M -> 0x06af }
            goto L_0x049d
        L_0x0362:
            java.lang.String r0 = "No characters after opening bracket '['"
            java.lang.IllegalArgumentException r3 = X.AnonymousClass000.A0k(r0)     // Catch:{ C2M -> 0x06af }
            goto L_0x049d
        L_0x036a:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ C2M -> 0x06af }
            java.lang.String r0 = "Illegal character at start of literal "
            r3.append(r0)     // Catch:{ C2M -> 0x06af }
            int[] r1 = new int[r2]     // Catch:{ C2M -> 0x06af }
            r1[r7] = r11     // Catch:{ C2M -> 0x06af }
            java.lang.String r0 = new java.lang.String     // Catch:{ C2M -> 0x06af }
            r0.<init>(r1, r7, r2)     // Catch:{ C2M -> 0x06af }
            java.lang.IllegalArgumentException r3 = X.AnonymousClass001.A12(r0, r3)     // Catch:{ C2M -> 0x06af }
            goto L_0x049d
        L_0x0382:
            java.lang.String r0 = "BreakIterator#current is past the end of string"
            java.lang.IllegalArgumentException r3 = X.AnonymousClass000.A0k(r0)     // Catch:{ C2M -> 0x06af }
            goto L_0x049d
        L_0x038a:
            java.lang.String r0 = "IP literal cannot be empty"
            java.lang.IllegalArgumentException r3 = X.AnonymousClass000.A0k(r0)     // Catch:{ C2M -> 0x06af }
            goto L_0x049d
        L_0x0392:
            X.CqN r1 = new X.CqN     // Catch:{ C2M -> 0x06af }
            r1.<init>(r9, r10, r10)     // Catch:{ C2M -> 0x06af }
            java.lang.String r0 = "IPFutureV6 / IPFutureAddress missing closing bracket"
            X.C2M r3 = new X.C2M     // Catch:{ C2M -> 0x06af }
            r3.<init>(r1, r0)     // Catch:{ C2M -> 0x06af }
            goto L_0x049d
        L_0x03a0:
            if (r22 >= 0) goto L_0x03a5
            r8 = r23
            goto L_0x03ad
        L_0x03a5:
            r1 = r22
            r0 = r23
            java.lang.String r8 = r0.substring(r7, r1)     // Catch:{ C2M -> 0x06af }
        L_0x03ad:
            boolean r0 = android.text.TextUtils.isEmpty(r8)     // Catch:{ IllegalArgumentException -> 0x0456 }
            if (r0 != 0) goto L_0x044f
            r4.setText(r8)     // Catch:{ IllegalArgumentException -> 0x0456 }
            int r1 = r8.length()     // Catch:{ IllegalArgumentException -> 0x0456 }
            int r11 = r4.current()     // Catch:{ IllegalArgumentException -> 0x0456 }
        L_0x03be:
            r0 = -1
            if (r11 == r0) goto L_0x0403
            if (r11 >= r1) goto L_0x0403
            int r12 = r8.codePointAt(r11)     // Catch:{ IllegalArgumentException -> 0x0456 }
            boolean r0 = X.C26059CrY.A03(r12)     // Catch:{ IllegalArgumentException -> 0x0456 }
            if (r0 != 0) goto L_0x03dd
            boolean r0 = X.C26059CrY.A02(r12)     // Catch:{ IllegalArgumentException -> 0x0456 }
            if (r0 != 0) goto L_0x03dd
            r0 = 37
            if (r12 != r0) goto L_0x03f3
            r4.next()     // Catch:{ IllegalArgumentException -> 0x03e2 }
            X.C26059CrY.A00(r8, r4)     // Catch:{ IllegalArgumentException -> 0x03e2 }
        L_0x03dd:
            int r11 = r4.next()     // Catch:{ IllegalArgumentException -> 0x0456 }
            goto L_0x03be
        L_0x03e2:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IllegalArgumentException -> 0x0456 }
            java.lang.String r0 = "Host contains invalid percent encoded character at string index "
            java.lang.String r1 = X.AnonymousClass001.A1I(r0, r1, r11)     // Catch:{ IllegalArgumentException -> 0x0456 }
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0456 }
            r0.<init>(r1, r2)     // Catch:{ IllegalArgumentException -> 0x0456 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0456 }
        L_0x03f3:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IllegalArgumentException -> 0x0456 }
            java.lang.String r0 = "Host contains illegal character "
            X.BEA.A1R(r0, r1, r12)     // Catch:{ IllegalArgumentException -> 0x0456 }
            java.lang.String r0 = " at string index "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A13(r0, r1, r11)     // Catch:{ IllegalArgumentException -> 0x0456 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0456 }
        L_0x0403:
            if (r22 <= 0) goto L_0x0429
            r1 = r22
            r0 = r23
            java.lang.String r10 = X.BE6.A0p(r1, r0)     // Catch:{ C2M -> 0x06af }
            r0 = 10
            long r0 = java.lang.Long.parseLong(r10, r0)     // Catch:{ IllegalArgumentException -> 0x0441 }
            r12 = 0
            int r11 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r11 >= 0) goto L_0x0429
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ IllegalArgumentException -> 0x0441 }
            java.lang.String r2 = "Port cannot be negative "
            java.lang.String r1 = X.C17890vO.A0a(r2, r3, r0)     // Catch:{ IllegalArgumentException -> 0x0441 }
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException     // Catch:{ IllegalArgumentException -> 0x0441 }
            r0.<init>(r1)     // Catch:{ IllegalArgumentException -> 0x0441 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0441 }
        L_0x0429:
            X.CqN r0 = new X.CqN     // Catch:{ C2M -> 0x06af }
            r0.<init>(r9, r8, r10)     // Catch:{ C2M -> 0x06af }
            goto L_0x043e
        L_0x042f:
            int r0 = r23.length()     // Catch:{ C2M -> 0x06af }
            int r1 = r0 + -1
            r0 = r21
            if (r0 < r1) goto L_0x0403
            X.CqN r0 = new X.CqN     // Catch:{ C2M -> 0x06af }
            r0.<init>(r9, r8)     // Catch:{ C2M -> 0x06af }
        L_0x043e:
            r5.A00 = r0     // Catch:{ C2M -> 0x06af }
            goto L_0x04a0
        L_0x0441:
            r2 = move-exception
            X.CqN r1 = new X.CqN     // Catch:{ C2M -> 0x06af }
            r1.<init>(r9, r8, r10)     // Catch:{ C2M -> 0x06af }
            java.lang.String r0 = "Invalid port number"
            X.C2M r3 = new X.C2M     // Catch:{ C2M -> 0x06af }
            r3.<init>(r1, r0, r2)     // Catch:{ C2M -> 0x06af }
            goto L_0x049d
        L_0x044f:
            java.lang.String r0 = "Host cannot be empty"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)     // Catch:{ IllegalArgumentException -> 0x0456 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0456 }
        L_0x0456:
            r2 = move-exception
            X.CqN r1 = new X.CqN     // Catch:{ C2M -> 0x06af }
            r1.<init>(r9, r8, r10)     // Catch:{ C2M -> 0x06af }
            java.lang.String r0 = "Invalid host name"
            X.C2M r3 = new X.C2M     // Catch:{ C2M -> 0x06af }
            r3.<init>(r1, r0, r2)     // Catch:{ C2M -> 0x06af }
            goto L_0x049d
        L_0x0464:
            X.CqN r1 = new X.CqN     // Catch:{ C2M -> 0x06af }
            r1.<init>(r9, r10, r10)     // Catch:{ C2M -> 0x06af }
            java.lang.String r0 = "Host string started with colon (':')"
            X.C2M r3 = new X.C2M     // Catch:{ C2M -> 0x06af }
            r3.<init>(r1, r0)     // Catch:{ C2M -> 0x06af }
            goto L_0x049d
        L_0x0471:
            X.CqN r1 = new X.CqN     // Catch:{ C2M -> 0x06af }
            r1.<init>(r9, r10, r10)     // Catch:{ C2M -> 0x06af }
            java.lang.String r0 = "No host string was present"
            X.C2M r3 = new X.C2M     // Catch:{ C2M -> 0x06af }
            r3.<init>(r1, r0)     // Catch:{ C2M -> 0x06af }
            goto L_0x049d
        L_0x047e:
            r2 = move-exception
            X.CqN r1 = new X.CqN     // Catch:{ C2M -> 0x06af }
            r1.<init>(r9, r10)     // Catch:{ C2M -> 0x06af }
            java.lang.String r0 = "Invalid userinfo"
            X.C2M r3 = new X.C2M     // Catch:{ C2M -> 0x06af }
            r3.<init>(r1, r0, r2)     // Catch:{ C2M -> 0x06af }
            goto L_0x049d
        L_0x048c:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ C2M -> 0x06af }
            java.lang.String r0 = "Illegal length hex run >4 characters starting at string index "
            r1.append(r0)     // Catch:{ C2M -> 0x06af }
            int r13 = r13 - r12
            r1.append(r13)     // Catch:{ C2M -> 0x06af }
            java.lang.IllegalArgumentException r3 = X.AnonymousClass000.A0j(r1)     // Catch:{ C2M -> 0x06af }
        L_0x049d:
            throw r3     // Catch:{ C2M -> 0x06af }
        L_0x049e:
            r24 = r0
        L_0x04a0:
            r0 = r24
            if (r0 >= r3) goto L_0x0698
            r0 = r25
            int[] r8 = new int[r0]     // Catch:{ C2N -> 0x06c1 }
            r1 = 63
            r0 = r24
            int r0 = r6.indexOf(r1, r0)     // Catch:{ C2N -> 0x06c1 }
            r8[r7] = r0     // Catch:{ C2N -> 0x06c1 }
            r1 = 35
            r0 = r24
            int r0 = r6.indexOf(r1, r0)     // Catch:{ C2N -> 0x06c1 }
            r8[r2] = r0     // Catch:{ C2N -> 0x06c1 }
            int r7 = X.C25730Cl0.A00(r8, r3)     // Catch:{ C2N -> 0x06c1 }
            r0 = r24
            java.lang.String r12 = r6.substring(r0, r7)     // Catch:{ C2N -> 0x06c1 }
            r5.A02 = r12     // Catch:{ C2N -> 0x06c1 }
            boolean r0 = android.text.TextUtils.isEmpty(r12)     // Catch:{ IllegalArgumentException -> 0x068a }
            if (r0 != 0) goto L_0x0547
            r4.setText(r12)     // Catch:{ IllegalArgumentException -> 0x068a }
            int r11 = r12.length()     // Catch:{ IllegalArgumentException -> 0x068a }
            int r8 = r4.current()     // Catch:{ IllegalArgumentException -> 0x068a }
            int r0 = r12.codePointAt(r8)     // Catch:{ IllegalArgumentException -> 0x068a }
            r10 = -1
            r1 = 47
            if (r0 != r1) goto L_0x04eb
            int r8 = r4.next()     // Catch:{ IllegalArgumentException -> 0x068a }
            if (r8 >= r11) goto L_0x0547
            if (r8 == r10) goto L_0x0547
            goto L_0x0535
        L_0x04eb:
            if (r8 >= r11) goto L_0x0547
            if (r8 == r10) goto L_0x0547
            int r9 = r12.codePointAt(r8)     // Catch:{ IllegalArgumentException -> 0x068a }
            boolean r0 = X.C26059CrY.A03(r9)     // Catch:{ IllegalArgumentException -> 0x068a }
            if (r0 != 0) goto L_0x0542
            boolean r0 = X.C26059CrY.A02(r9)     // Catch:{ IllegalArgumentException -> 0x068a }
            if (r0 != 0) goto L_0x0542
            r0 = 37
            if (r9 == r0) goto L_0x051d
            if (r9 == r1) goto L_0x0542
            r0 = 58
            if (r9 == r0) goto L_0x0542
            r0 = 64
            if (r9 == r0) goto L_0x0542
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IllegalArgumentException -> 0x068a }
            java.lang.String r0 = "Path contains illegal character "
            X.BEA.A1R(r0, r1, r9)     // Catch:{ IllegalArgumentException -> 0x068a }
            java.lang.String r0 = " at string index "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A13(r0, r1, r8)     // Catch:{ IllegalArgumentException -> 0x068a }
            goto L_0x0541
        L_0x051d:
            r4.next()     // Catch:{ IllegalArgumentException -> 0x0524 }
            X.C26059CrY.A00(r12, r4)     // Catch:{ IllegalArgumentException -> 0x0524 }
            goto L_0x0542
        L_0x0524:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IllegalArgumentException -> 0x068a }
            java.lang.String r0 = "Path contains invalid percent encoded character at string index "
            java.lang.String r1 = X.AnonymousClass001.A1I(r0, r1, r8)     // Catch:{ IllegalArgumentException -> 0x068a }
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x068a }
            r0.<init>(r1, r2)     // Catch:{ IllegalArgumentException -> 0x068a }
            goto L_0x0541
        L_0x0535:
            int r0 = r12.codePointAt(r8)     // Catch:{ IllegalArgumentException -> 0x068a }
            if (r0 != r1) goto L_0x04eb
            java.lang.String r0 = "Path cannot start with two slashes '//' when Uri contains an authority"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)     // Catch:{ IllegalArgumentException -> 0x068a }
        L_0x0541:
            throw r0     // Catch:{ IllegalArgumentException -> 0x068a }
        L_0x0542:
            int r8 = r4.next()     // Catch:{ IllegalArgumentException -> 0x068a }
            goto L_0x04eb
        L_0x0547:
            if (r7 >= r3) goto L_0x0698
            int r1 = r6.codePointAt(r7)     // Catch:{ C2N -> 0x06c1 }
            r0 = 63
            if (r1 != r0) goto L_0x05f1
            r0 = 35
            int r10 = r6.indexOf(r0, r7)     // Catch:{ C2N -> 0x06c1 }
            if (r10 >= 0) goto L_0x055a
            r10 = r3
        L_0x055a:
            java.lang.String r9 = r6.substring(r7, r10)     // Catch:{ C2N -> 0x06c1 }
            java.lang.String r0 = r9.substring(r2)     // Catch:{ C2N -> 0x06c1 }
            r5.A03 = r0     // Catch:{ C2N -> 0x06c1 }
            boolean r0 = android.text.TextUtils.isEmpty(r9)     // Catch:{ IllegalArgumentException -> 0x05e2 }
            if (r0 != 0) goto L_0x05da
            r4.setText(r9)     // Catch:{ IllegalArgumentException -> 0x05e2 }
            int r1 = r9.length()     // Catch:{ IllegalArgumentException -> 0x05e2 }
            int r0 = r4.current()     // Catch:{ IllegalArgumentException -> 0x05e2 }
            int r7 = r9.codePointAt(r0)     // Catch:{ IllegalArgumentException -> 0x05e2 }
            r0 = 63
            if (r7 == r0) goto L_0x0584
            java.lang.String r0 = "Query must start with ASCII question mark '?'"
            java.lang.IllegalArgumentException r1 = X.AnonymousClass000.A0k(r0)     // Catch:{ IllegalArgumentException -> 0x05e2 }
        L_0x0583:
            throw r1     // Catch:{ IllegalArgumentException -> 0x05e2 }
        L_0x0584:
            int r7 = r4.next()     // Catch:{ IllegalArgumentException -> 0x05e2 }
            if (r7 >= r1) goto L_0x05da
            r0 = -1
            if (r7 == r0) goto L_0x05da
            int r8 = r9.codePointAt(r7)     // Catch:{ IllegalArgumentException -> 0x05e2 }
            boolean r0 = X.C26059CrY.A03(r8)     // Catch:{ IllegalArgumentException -> 0x05e2 }
            if (r0 != 0) goto L_0x0584
            boolean r0 = X.C26059CrY.A02(r8)     // Catch:{ IllegalArgumentException -> 0x05e2 }
            if (r0 != 0) goto L_0x0584
            r0 = 37
            if (r8 == r0) goto L_0x05b2
            r0 = 47
            if (r8 == r0) goto L_0x0584
            r0 = 58
            if (r8 == r0) goto L_0x0584
            r0 = 63
            if (r8 == r0) goto L_0x0584
            r0 = 64
            if (r8 == r0) goto L_0x0584
            goto L_0x05b9
        L_0x05b2:
            r4.next()     // Catch:{ IllegalArgumentException -> 0x05c9 }
            X.C26059CrY.A00(r9, r4)     // Catch:{ IllegalArgumentException -> 0x05c9 }
            goto L_0x0584
        L_0x05b9:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IllegalArgumentException -> 0x05e2 }
            java.lang.String r0 = "Query contains illegal character "
            X.BEA.A1R(r0, r1, r8)     // Catch:{ IllegalArgumentException -> 0x05e2 }
            java.lang.String r0 = " at string index "
            java.lang.IllegalArgumentException r1 = X.AnonymousClass001.A13(r0, r1, r7)     // Catch:{ IllegalArgumentException -> 0x05e2 }
            goto L_0x0583
        L_0x05c9:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IllegalArgumentException -> 0x05e2 }
            java.lang.String r0 = "Query contains invalid percent encoded character at string index "
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r1, r7)     // Catch:{ IllegalArgumentException -> 0x05e2 }
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x05e2 }
            r1.<init>(r0, r2)     // Catch:{ IllegalArgumentException -> 0x05e2 }
            goto L_0x0583
        L_0x05da:
            if (r10 >= r3) goto L_0x0698
            int r1 = r6.codePointAt(r10)     // Catch:{ C2N -> 0x06c1 }
            r7 = r10
            goto L_0x05f1
        L_0x05e2:
            r2 = move-exception
            java.lang.String r1 = "Uri contained invalid query string"
            X.Cl0 r0 = new X.Cl0     // Catch:{ C2N -> 0x06c1 }
            r0.<init>(r5)     // Catch:{ C2N -> 0x06c1 }
            X.C2N r3 = new X.C2N     // Catch:{ C2N -> 0x06c1 }
            r3.<init>(r0, r1, r2)     // Catch:{ C2N -> 0x06c1 }
            goto L_0x06c0
        L_0x05f1:
            r0 = 35
            if (r1 != r0) goto L_0x0605
            java.lang.String r1 = r6.substring(r7)     // Catch:{ C2N -> 0x06c1 }
            java.lang.String r0 = r1.substring(r2)     // Catch:{ C2N -> 0x06c1 }
            r5.A01 = r0     // Catch:{ C2N -> 0x06c1 }
            r0 = r26
            r6.substring(r0, r7)     // Catch:{ C2N -> 0x06c1 }
            goto L_0x0606
        L_0x0605:
            r1 = 0
        L_0x0606:
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ IllegalArgumentException -> 0x067c }
            if (r0 != 0) goto L_0x0698
            r4.setText(r1)     // Catch:{ IllegalArgumentException -> 0x067c }
            int r6 = r1.length()     // Catch:{ IllegalArgumentException -> 0x067c }
            int r0 = r4.current()     // Catch:{ IllegalArgumentException -> 0x067c }
            int r2 = r1.codePointAt(r0)     // Catch:{ IllegalArgumentException -> 0x067c }
            r0 = 35
            if (r2 == r0) goto L_0x0626
            java.lang.String r0 = "Fragment must start with ASCII number sign '#'"
            java.lang.IllegalArgumentException r1 = X.AnonymousClass000.A0k(r0)     // Catch:{ IllegalArgumentException -> 0x067c }
        L_0x0625:
            throw r1     // Catch:{ IllegalArgumentException -> 0x067c }
        L_0x0626:
            int r3 = r4.next()     // Catch:{ IllegalArgumentException -> 0x067c }
            if (r3 >= r6) goto L_0x0698
            r0 = -1
            if (r3 == r0) goto L_0x0698
            int r2 = r1.codePointAt(r3)     // Catch:{ IllegalArgumentException -> 0x067c }
            boolean r0 = X.C26059CrY.A03(r2)     // Catch:{ IllegalArgumentException -> 0x067c }
            if (r0 != 0) goto L_0x0626
            boolean r0 = X.C26059CrY.A02(r2)     // Catch:{ IllegalArgumentException -> 0x067c }
            if (r0 != 0) goto L_0x0626
            r0 = 37
            if (r2 == r0) goto L_0x0654
            r0 = 47
            if (r2 == r0) goto L_0x0626
            r0 = 58
            if (r2 == r0) goto L_0x0626
            r0 = 63
            if (r2 == r0) goto L_0x0626
            r0 = 64
            if (r2 == r0) goto L_0x0626
            goto L_0x065b
        L_0x0654:
            r4.next()     // Catch:{ IllegalArgumentException -> 0x066b }
            X.C26059CrY.A00(r1, r4)     // Catch:{ IllegalArgumentException -> 0x066b }
            goto L_0x0626
        L_0x065b:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IllegalArgumentException -> 0x067c }
            java.lang.String r0 = "Fragment contains illegal character "
            X.BEA.A1R(r0, r1, r2)     // Catch:{ IllegalArgumentException -> 0x067c }
            java.lang.String r0 = " at string index "
            java.lang.IllegalArgumentException r1 = X.AnonymousClass001.A13(r0, r1, r3)     // Catch:{ IllegalArgumentException -> 0x067c }
            goto L_0x0625
        L_0x066b:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IllegalArgumentException -> 0x067c }
            java.lang.String r0 = "Fragment contains invalid percent encoded character at string index "
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r1, r3)     // Catch:{ IllegalArgumentException -> 0x067c }
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x067c }
            r1.<init>(r0, r2)     // Catch:{ IllegalArgumentException -> 0x067c }
            goto L_0x0625
        L_0x067c:
            r2 = move-exception
            java.lang.String r1 = "Uri contained invalid fragment"
            X.Cl0 r0 = new X.Cl0     // Catch:{ C2N -> 0x06c1 }
            r0.<init>(r5)     // Catch:{ C2N -> 0x06c1 }
            X.C2N r3 = new X.C2N     // Catch:{ C2N -> 0x06c1 }
            r3.<init>(r0, r1, r2)     // Catch:{ C2N -> 0x06c1 }
            goto L_0x06c0
        L_0x068a:
            r2 = move-exception
            java.lang.String r1 = "Uri contained an invalid path"
            X.Cl0 r0 = new X.Cl0     // Catch:{ C2N -> 0x06c1 }
            r0.<init>(r5)     // Catch:{ C2N -> 0x06c1 }
            X.C2N r3 = new X.C2N     // Catch:{ C2N -> 0x06c1 }
            r3.<init>(r0, r1, r2)     // Catch:{ C2N -> 0x06c1 }
            goto L_0x06c0
        L_0x0698:
            X.Cl0 r0 = new X.Cl0     // Catch:{ C2N -> 0x06c1 }
            r0.<init>(r5)     // Catch:{ C2N -> 0x06c1 }
            java.lang.String r0 = r0.toString()     // Catch:{ C2N -> 0x06c1 }
            return r0
        L_0x06a2:
            java.lang.String r1 = "Empty uriString"
            X.Cl0 r0 = new X.Cl0     // Catch:{ C2N -> 0x06c1 }
            r0.<init>(r5)     // Catch:{ C2N -> 0x06c1 }
            X.C2N r3 = new X.C2N     // Catch:{ C2N -> 0x06c1 }
            r3.<init>(r0, r1)     // Catch:{ C2N -> 0x06c1 }
            goto L_0x06c0
        L_0x06af:
            r0 = move-exception
            X.CqN r0 = r0.mAuthority     // Catch:{ C2N -> 0x06c1 }
            r5.A00 = r0     // Catch:{ C2N -> 0x06c1 }
            java.lang.String r1 = "Unable to parse authority"
            X.Cl0 r0 = new X.Cl0     // Catch:{ C2N -> 0x06c1 }
            r0.<init>(r5)     // Catch:{ C2N -> 0x06c1 }
            X.C2N r3 = new X.C2N     // Catch:{ C2N -> 0x06c1 }
            r3.<init>(r0, r1)     // Catch:{ C2N -> 0x06c1 }
        L_0x06c0:
            throw r3     // Catch:{ C2N -> 0x06c1 }
        L_0x06c1:
            r0 = move-exception
            X.Cl0 r0 = r0.mParsedUri
            java.lang.String r0 = r0.A01()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26843DFz.CGc(java.lang.String):java.lang.String");
    }
}
