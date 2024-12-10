package X;

import java.util.regex.Pattern;

/* renamed from: X.72d  reason: invalid class name */
public abstract class AnonymousClass72d {
    public static final Pattern A00 = Pattern.compile("\r?\n");
    public static final Pattern A01 = Pattern.compile("(?<=\nEND:VCARD)\\s*\r?\n", 2);

    /* JADX WARNING: Can't wrap try/catch for region: R(4:135|(1:137)|141|142) */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0311, code lost:
        r3[1] = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0409, code lost:
        if (r12 != ',') goto L_0x041e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x040f, code lost:
        if (r2 == null) goto L_0x041e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x046d, code lost:
        if (r0 != false) goto L_0x05a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x046f, code lost:
        r2 = java.lang.System.currentTimeMillis();
        r7.A04.A02.add(r7.A03);
        r6.A00 = A00(r2, r6.A00);
        r2 = java.lang.System.currentTimeMillis();
        r7.A03 = new X.C136406tl();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x04f5, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x0751, code lost:
        throw new X.C33281iZ(X.AnonymousClass000.A0y("\" came)", r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0185, code lost:
        r1 = r7.substring(r13, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x018d, code lost:
        if (r1.equalsIgnoreCase("END") != false) goto L_0x0433;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x018f, code lost:
        r3[0] = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0192, code lost:
        if (r2 >= (r12 - 1)) goto L_0x01c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0194, code lost:
        r3[1] = r7.substring(r2 + 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01c5, code lost:
        r3[1] = "";
     */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x03ba  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x03c2  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x052b  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x055c A[Catch:{ OutOfMemoryError -> 0x058b }] */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x057b A[Catch:{ OutOfMemoryError -> 0x058b }] */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x05a2 A[LOOP:3: B:37:0x00dd->B:291:0x05a2, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:384:0x046d A[EDGE_INSN: B:384:0x046d->B:226:0x046d ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(java.util.List r24, X.C133926pj r25) {
        /*
            r0 = 5
            r2 = r24
            int r5 = X.C108955ca.A08(r2, r0)
            r4 = 0
        L_0x0008:
            java.lang.String r3 = "vcard2.1"
            if (r4 >= r5) goto L_0x06dd
            java.lang.String r1 = X.C17880vN.A0w(r2, r4)
            java.lang.String r0 = "VERSION:"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x06d9
            java.lang.String r0 = "2.1"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x06dd
            java.lang.String r0 = "3.0"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x06d9
            java.lang.String r0 = "vcard3.0"
        L_0x002a:
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x06d2
            X.72O r6 = new X.72O
            r6.<init>()
        L_0x0035:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0614
            java.util.ArrayList r7 = X.AnonymousClass000.A13()
        L_0x003f:
            X.7Sq r1 = new X.7Sq
            r1.<init>(r7)
            X.7Sp r0 = new X.7Sp
            r0.<init>(r1)
            r6.A0G = r0
            r0 = r25
            r6.A0F = r0
            java.lang.System.currentTimeMillis()
        L_0x0052:
            r5 = 1
            r4 = 0
        L_0x0054:
            java.lang.String r2 = r6.A01()
            if (r2 != 0) goto L_0x005e
            java.lang.System.currentTimeMillis()
            return
        L_0x005e:
            java.lang.String r0 = r2.trim()
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0054
            java.lang.String r21 = ":"
            r1 = 2
            r0 = r21
            java.lang.String[] r3 = r2.split(r0, r1)
            int r0 = r3.length
            if (r0 != r1) goto L_0x073a
            r0 = r3[r4]
            java.lang.String r1 = r0.trim()
            java.lang.String r22 = "BEGIN"
            r0 = r22
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x073a
            r0 = r3[r5]
            java.lang.String r1 = r0.trim()
            java.lang.String r18 = "VCARD"
            r0 = r18
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x073a
            X.6pj r8 = r6.A0F
            if (r8 == 0) goto L_0x00c2
            long r1 = java.lang.System.currentTimeMillis()
            X.6gu r7 = new X.6gu
            r7.<init>()
            r7.A00 = r5
            r0 = r18
            r7.A01 = r0
            java.util.List r3 = r8.A02
            r3.add(r7)
            int r0 = X.AnonymousClass3MX.A02(r3, r5)
            r8.A00 = r0
            java.lang.Object r0 = r3.get(r0)
            X.6gu r0 = (X.C128926gu) r0
            r8.A04 = r0
            long r7 = r6.A0A
            long r0 = A00(r1, r7)
            r6.A0A = r0
        L_0x00c2:
            long r16 = java.lang.System.currentTimeMillis()
            X.6pj r1 = r6.A0F
            if (r1 == 0) goto L_0x00dd
            long r2 = java.lang.System.currentTimeMillis()
            X.6tl r0 = new X.6tl
            r0.<init>()
            r1.A03 = r0
        L_0x00d5:
            long r0 = r6.A09
            long r0 = A00(r2, r0)
            r6.A09 = r0
        L_0x00dd:
            java.lang.String r25 = "8BIT"
            r0 = r25
            r6.A0B = r0
            java.lang.String r7 = r6.A02()
            long r19 = java.lang.System.currentTimeMillis()
            int r12 = r7.length()
            r11 = 2
            java.lang.String[] r3 = new java.lang.String[r11]
            java.lang.String r0 = "item"
            boolean r0 = r7.startsWith(r0)
            java.lang.String r24 = ""
            r10 = 0
            r23 = 0
            if (r0 == 0) goto L_0x0150
            r0 = r21
            java.lang.String[] r9 = r7.split(r0)
            int r8 = r9.length
            if (r8 < r11) goto L_0x0435
            r14 = r9[r4]
            java.lang.StringBuilder r13 = X.AnonymousClass000.A10()
            java.lang.String r0 = "."
            int r0 = r14.indexOf(r0)
            int r2 = r0 + 1
            r1 = 64
        L_0x0118:
            int r0 = r14.length()
            if (r2 >= r0) goto L_0x01c8
            char r15 = r14.charAt(r2)
            r0 = 65
            if (r15 < r0) goto L_0x013c
            char r15 = r14.charAt(r2)
            r0 = 90
            if (r15 > r0) goto L_0x013c
            char r0 = r14.charAt(r2)
            r13.append(r0)
            char r1 = r14.charAt(r2)
        L_0x0139:
            int r2 = r2 + 1
            goto L_0x0118
        L_0x013c:
            char r15 = r14.charAt(r2)
            r0 = 45
            if (r15 != r0) goto L_0x01c8
            r0 = 88
            if (r1 != r0) goto L_0x01c8
            char r0 = r14.charAt(r2)
            r13.append(r0)
            goto L_0x0139
        L_0x0150:
            r2 = 0
            r8 = 0
            r13 = 0
        L_0x0153:
            if (r2 >= r12) goto L_0x0722
            char r11 = r7.charAt(r2)
            r1 = 59
            r0 = 58
            if (r8 == 0) goto L_0x0181
            r9 = 34
            if (r8 == r5) goto L_0x0169
            if (r11 != r9) goto L_0x0166
        L_0x0165:
            r8 = 1
        L_0x0166:
            int r2 = r2 + 1
            goto L_0x0153
        L_0x0169:
            if (r11 != r9) goto L_0x016d
            r8 = 2
            goto L_0x0166
        L_0x016d:
            if (r11 != r1) goto L_0x0177
            java.lang.String r0 = r7.substring(r13, r2)
            r6.A04(r0)
            goto L_0x01b1
        L_0x0177:
            if (r11 != r0) goto L_0x0166
            java.lang.String r0 = r7.substring(r13, r2)
            r6.A04(r0)
            goto L_0x0191
        L_0x0181:
            java.lang.String r9 = "END"
            if (r11 != r0) goto L_0x019e
            java.lang.String r1 = r7.substring(r13, r2)
            boolean r0 = r1.equalsIgnoreCase(r9)
            if (r0 != 0) goto L_0x0433
            r3[r4] = r1
        L_0x0191:
            int r12 = r12 - r5
            if (r2 >= r12) goto L_0x01c5
            int r0 = r2 + 1
            java.lang.String r0 = r7.substring(r0)
            r3[r5] = r0
            goto L_0x0240
        L_0x019e:
            r0 = 46
            if (r11 != r0) goto L_0x01b4
            java.lang.String r1 = r7.substring(r13, r2)
            X.6pj r0 = r6.A0F
            if (r0 == 0) goto L_0x01b1
            X.6tl r0 = r0.A03
            java.util.Set r0 = r0.A05
            r0.add(r1)
        L_0x01b1:
            int r13 = r2 + 1
            goto L_0x0166
        L_0x01b4:
            if (r11 != r1) goto L_0x0166
            java.lang.String r1 = r7.substring(r13, r2)
            boolean r0 = r1.equalsIgnoreCase(r9)
            if (r0 != 0) goto L_0x0433
            r3[r4] = r1
            int r13 = r2 + 1
            goto L_0x0165
        L_0x01c5:
            r3[r5] = r24
            goto L_0x0240
        L_0x01c8:
            java.lang.String r0 = r13.toString()
            r3[r4] = r0
            r2 = r9[r5]
            java.lang.String r1 = "(\r\n|\r|\n|\n\r)"
            r0 = r24
            java.lang.String r0 = r2.replaceAll(r1, r0)
            r3[r5] = r0
            r1 = r3[r4]
            java.lang.String r0 = "ADR"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x028a
            java.lang.String r0 = "type"
            boolean r0 = r7.contains(r0)
            if (r0 == 0) goto L_0x0286
            java.lang.String r0 = "="
            int r0 = r7.indexOf(r0)
            int r1 = r0 + 1
            r0 = r21
            int r0 = r7.indexOf(r0)
            java.lang.String r0 = r7.substring(r1, r0)
            r6.A05(r0)
        L_0x0201:
            java.lang.String r0 = "X-ABADR"
            java.lang.String r2 = X.AnonymousClass72O.A00(r7, r0, r6)
            if (r2 == 0) goto L_0x0229
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            r0 = r3[r5]
            r1.append(r0)
            java.lang.String r0 = ";"
            r1.append(r0)
            r0 = r21
            int r0 = r2.lastIndexOf(r0)
            int r0 = r0 + 1
            java.lang.String r0 = r2.substring(r0)
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            r3[r5] = r0
        L_0x0229:
            if (r23 == 0) goto L_0x0240
            java.lang.String r1 = X.AnonymousClass72O.A00(r7, r10, r6)
        L_0x022f:
            if (r1 == 0) goto L_0x0240
            r0 = r21
            int r0 = r1.lastIndexOf(r0)
            int r0 = r0 + 1
            java.lang.String r0 = r1.substring(r0)
            r6.A05(r0)
        L_0x0240:
            r0 = r3[r4]
            java.lang.String r7 = X.C108955ca.A0y(r0)
            r9 = r3[r5]
            long r2 = r6.A05
            r0 = r19
            long r0 = A00(r0, r2)
            r6.A05 = r0
            X.6pj r0 = r6.A0F
            if (r0 == 0) goto L_0x025a
            X.6tl r0 = r0.A03
            r0.A01 = r7
        L_0x025a:
            java.lang.String r0 = "ADR"
            boolean r13 = r7.equals(r0)
            if (r13 != 0) goto L_0x03ac
            java.lang.String r0 = "ORG"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x03ac
            java.lang.String r0 = "N"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x03ac
            java.lang.String r0 = "AGENT"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x031d
            boolean r0 = r6 instanceof X.AnonymousClass84X
            if (r0 == 0) goto L_0x06e0
            java.lang.String r1 = "AGENT in vCard 3.0 is not supported yet."
            X.1iZ r0 = new X.1iZ
            r0.<init>(r1)
            throw r0
        L_0x0286:
            r23 = 1
            goto L_0x0201
        L_0x028a:
            if (r8 <= r11) goto L_0x02aa
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r12)
            r0 = r3[r5]
            r1.append(r0)
        L_0x0296:
            r0 = r21
            r1.append(r0)
            r0 = r9[r11]
            r1.append(r0)
            int r11 = r11 + 1
            if (r11 < r8) goto L_0x0296
            java.lang.String r0 = r1.toString()
            r3[r5] = r0
        L_0x02aa:
            java.lang.String r0 = "waid"
            boolean r0 = r7.contains(r0)
            if (r0 == 0) goto L_0x0315
            java.lang.String r0 = "type"
            boolean r0 = r7.contains(r0)
            if (r0 == 0) goto L_0x02ed
            java.util.regex.Pattern r0 = X.AnonymousClass72O.A0L
            java.util.regex.Matcher r1 = r0.matcher(r7)
            boolean r0 = r1.find()
            if (r0 == 0) goto L_0x02cf
            java.lang.String r0 = r1.group(r5)
            if (r0 == 0) goto L_0x02cf
            r6.A05(r0)
        L_0x02cf:
            java.util.regex.Pattern r0 = X.AnonymousClass72O.A0M
            java.util.regex.Matcher r1 = r0.matcher(r7)
            boolean r0 = r1.find()
            if (r0 == 0) goto L_0x0240
            java.lang.String r2 = r1.group(r5)
            if (r2 == 0) goto L_0x0240
            X.6pj r1 = r6.A0F
            if (r1 == 0) goto L_0x0303
            java.lang.String r0 = "waId"
            r1.A01 = r0
            r1.A00(r2)
            goto L_0x0303
        L_0x02ed:
            java.lang.String r1 = X.AnonymousClass72O.A00(r7, r10, r6)
            if (r1 == 0) goto L_0x02cf
            r0 = r21
            int r0 = r1.lastIndexOf(r0)
            int r0 = r0 + 1
            java.lang.String r0 = r1.substring(r0)
            r6.A05(r0)
            goto L_0x02cf
        L_0x0303:
            X.1Dx r0 = com.whatsapp.jid.PhoneUserJid.Companion     // Catch:{ 11T -> 0x0311 }
            com.whatsapp.jid.PhoneUserJid r0 = X.C22951Dx.A01(r2)     // Catch:{ 11T -> 0x0311 }
            java.lang.String r0 = X.AnonymousClass17K.A05(r0)     // Catch:{ 11T -> 0x0311 }
            r3[r5] = r0     // Catch:{ 11T -> 0x0311 }
            goto L_0x0240
        L_0x0311:
            r3[r5] = r10
            goto L_0x0240
        L_0x0315:
            java.lang.String r0 = "X-ABLabel"
            java.lang.String r1 = X.AnonymousClass72O.A00(r7, r0, r6)
            goto L_0x022f
        L_0x031d:
            boolean r1 = r6 instanceof X.AnonymousClass84X
            if (r1 == 0) goto L_0x0356
            java.util.HashSet r0 = X.AnonymousClass84X.A02
            boolean r0 = r0.contains(r7)
            if (r0 != 0) goto L_0x033e
            java.util.HashSet r0 = X.AnonymousClass84X.A03
            boolean r0 = r0.contains(r7)
            if (r0 != 0) goto L_0x033e
            java.lang.String r0 = "X-"
            boolean r0 = r7.startsWith(r0)
            if (r0 != 0) goto L_0x033e
            java.util.HashSet r0 = r6.A0E
            X.C108985cd.A1I(r7, r0)
        L_0x033e:
            r0 = r22
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x037f
            r0 = r18
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x06e8
            java.lang.String r1 = "This vCard has nested vCard data in it."
            X.84V r0 = new X.84V
            r0.<init>(r1)
            throw r0
        L_0x0356:
            java.util.HashSet r2 = X.AnonymousClass72O.A0J
            java.lang.String r0 = X.C108955ca.A0y(r7)
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L_0x033e
            java.lang.String r0 = "X-"
            boolean r0 = r7.startsWith(r0)
            if (r0 != 0) goto L_0x033e
            java.util.HashSet r2 = r6.A0E
            boolean r0 = r2.contains(r7)
            if (r0 != 0) goto L_0x033e
            r2.add(r7)
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Property name unsupported by vCard 2.1: "
            X.C17900vP.A0g(r0, r7, r2)
            goto L_0x033e
        L_0x037f:
            java.lang.String r0 = "VERSION"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0437
            if (r1 == 0) goto L_0x03a9
            java.lang.String r2 = "3.0"
        L_0x038b:
            boolean r0 = r9.equals(r2)
            if (r0 != 0) goto L_0x0437
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Incompatible version: "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = " != "
            java.lang.String r1 = X.AnonymousClass001.A1H(r0, r2, r1)
            X.84W r0 = new X.84W
            r0.<init>(r1)
            throw r0
        L_0x03a9:
            java.lang.String r2 = "2.1"
            goto L_0x038b
        L_0x03ac:
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r3 = r6.A0B
            java.lang.String r2 = "QUOTED-PRINTABLE"
            boolean r2 = r3.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x03be
            java.lang.String r9 = r6.A03(r9)
        L_0x03be:
            X.6pj r2 = r6.A0F
            if (r2 == 0) goto L_0x042a
            java.lang.StringBuilder r11 = X.AnonymousClass000.A10()
            java.util.ArrayList r10 = X.AnonymousClass000.A13()
            int r8 = r9.length()
            r7 = 0
        L_0x03cf:
            if (r7 >= r8) goto L_0x0422
            char r3 = r9.charAt(r7)
            r2 = 92
            if (r3 != r2) goto L_0x0412
            int r2 = r8 + -1
            if (r7 >= r2) goto L_0x041e
            if (r13 != 0) goto L_0x041e
            int r2 = r7 + 1
            char r12 = r9.charAt(r2)
            boolean r2 = r6 instanceof X.AnonymousClass84X
            if (r2 == 0) goto L_0x03fb
            r2 = 110(0x6e, float:1.54E-43)
            if (r12 == r2) goto L_0x03f1
            r2 = 78
            if (r12 != r2) goto L_0x040b
        L_0x03f1:
            java.lang.String r2 = "\r\n"
        L_0x03f3:
            r11.append(r2)
            int r7 = r7 + 1
        L_0x03f8:
            int r7 = r7 + 1
            goto L_0x03cf
        L_0x03fb:
            r2 = 92
            if (r12 == r2) goto L_0x040b
            r2 = 59
            if (r12 == r2) goto L_0x040b
            r2 = 58
            if (r12 == r2) goto L_0x040b
            r2 = 44
            if (r12 != r2) goto L_0x041e
        L_0x040b:
            java.lang.String r2 = java.lang.String.valueOf(r12)
            if (r2 == 0) goto L_0x041e
            goto L_0x03f3
        L_0x0412:
            r2 = 59
            if (r3 != r2) goto L_0x041e
            X.C108955ca.A1U(r11, r10)
            java.lang.StringBuilder r11 = X.AnonymousClass000.A10()
            goto L_0x03f8
        L_0x041e:
            r11.append(r3)
            goto L_0x03f8
        L_0x0422:
            X.C108955ca.A1U(r11, r10)
            X.6pj r2 = r6.A0F
            r2.A01(r10)
        L_0x042a:
            long r2 = r6.A07
            long r0 = A00(r0, r2)
            r6.A07 = r0
            goto L_0x0468
        L_0x0433:
            r6.A0D = r7
        L_0x0435:
            r0 = 1
            goto L_0x0469
        L_0x0437:
            long r7 = java.lang.System.currentTimeMillis()
            java.lang.String r3 = r6.A0B
            java.lang.String r0 = "QUOTED-PRINTABLE"
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0491
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = r6.A03(r9)
            X.6pj r1 = r6.A0F
            if (r1 == 0) goto L_0x0458
            java.util.ArrayList r0 = X.C108965cb.A0s(r0)
            r1.A01(r0)
        L_0x0458:
            long r0 = r6.A03
            long r0 = A00(r2, r0)
            r6.A03 = r0
        L_0x0460:
            long r0 = r6.A06
            long r0 = A00(r7, r0)
            r6.A06 = r0
        L_0x0468:
            r0 = 0
        L_0x0469:
            X.6pj r7 = r6.A0F
            if (r7 == 0) goto L_0x05a2
            if (r0 != 0) goto L_0x05a6
            long r2 = java.lang.System.currentTimeMillis()
            X.6gu r0 = r7.A04
            java.util.ArrayList r1 = r0.A02
            X.6tl r0 = r7.A03
            r1.add(r0)
            long r0 = r6.A00
            long r0 = A00(r2, r0)
            r6.A00 = r0
            long r2 = java.lang.System.currentTimeMillis()
            X.6tl r0 = new X.6tl
            r0.<init>()
            r7.A03 = r0
            goto L_0x00d5
        L_0x0491:
            java.lang.String r0 = "BASE64"
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x0525
            java.lang.String r0 = "B"
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x0525
            java.lang.String r0 = "7BIT"
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x04ce
            r0 = r25
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x04ce
            java.lang.String r2 = X.C108955ca.A0y(r3)
            java.lang.String r0 = "X-"
            boolean r0 = r2.startsWith(r0)
            if (r0 != 0) goto L_0x04ce
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "The encoding unsupported by vCard spec: \""
            r2.append(r0)
            r2.append(r3)
            java.lang.String r0 = "\"."
            X.C17890vO.A1B(r2, r0)
        L_0x04ce:
            long r2 = java.lang.System.currentTimeMillis()
            X.6pj r0 = r6.A0F
            if (r0 == 0) goto L_0x051b
            java.util.ArrayList r11 = X.AnonymousClass000.A13()
            if (r9 == 0) goto L_0x071a
            if (r1 == 0) goto L_0x0513
            java.lang.StringBuilder r12 = X.AnonymousClass000.A10()
            int r10 = r9.length()
            r1 = 0
        L_0x04e7:
            if (r1 >= r10) goto L_0x050f
            char r13 = r9.charAt(r1)
            r0 = 92
            if (r13 != r0) goto L_0x050b
            int r0 = r10 + -1
            if (r1 >= r0) goto L_0x050b
            int r1 = r1 + 1
            char r13 = r9.charAt(r1)
            r0 = 110(0x6e, float:1.54E-43)
            if (r13 == r0) goto L_0x0503
            r0 = 78
            if (r13 != r0) goto L_0x050b
        L_0x0503:
            java.lang.String r0 = "\r\n"
            r12.append(r0)
        L_0x0508:
            int r1 = r1 + 1
            goto L_0x04e7
        L_0x050b:
            r12.append(r13)
            goto L_0x0508
        L_0x050f:
            java.lang.String r9 = r12.toString()
        L_0x0513:
            r11.add(r9)
            X.6pj r0 = r6.A0F
            r0.A01(r11)
        L_0x051b:
            long r0 = r6.A02
            long r0 = A00(r2, r0)
            r6.A02 = r0
            goto L_0x0460
        L_0x0525:
            long r2 = java.lang.System.currentTimeMillis()
            if (r1 == 0) goto L_0x055c
            r1 = r6
            X.84X r1 = (X.AnonymousClass84X) r1     // Catch:{ OutOfMemoryError -> 0x058b }
            java.lang.StringBuilder r11 = X.AnonymousClass000.A10()     // Catch:{ OutOfMemoryError -> 0x058b }
        L_0x0532:
            r11.append(r9)     // Catch:{ OutOfMemoryError -> 0x058b }
            java.lang.String r9 = r1.A01()     // Catch:{ OutOfMemoryError -> 0x058b }
            if (r9 == 0) goto L_0x0554
            int r0 = r9.length()     // Catch:{ OutOfMemoryError -> 0x058b }
            if (r0 == 0) goto L_0x0573
            java.lang.String r0 = " "
            boolean r0 = r9.startsWith(r0)     // Catch:{ OutOfMemoryError -> 0x058b }
            if (r0 != 0) goto L_0x0532
            java.lang.String r0 = "\t"
            boolean r0 = r9.startsWith(r0)     // Catch:{ OutOfMemoryError -> 0x058b }
            if (r0 != 0) goto L_0x0532
            r1.A00 = r9     // Catch:{ OutOfMemoryError -> 0x058b }
            goto L_0x0573
        L_0x0554:
            java.lang.String r1 = "File ended during parsing BASE64 binary"
            X.1iZ r0 = new X.1iZ     // Catch:{ OutOfMemoryError -> 0x058b }
            r0.<init>(r1)     // Catch:{ OutOfMemoryError -> 0x058b }
            throw r0     // Catch:{ OutOfMemoryError -> 0x058b }
        L_0x055c:
            java.lang.StringBuilder r11 = X.AnonymousClass000.A10()     // Catch:{ OutOfMemoryError -> 0x058b }
        L_0x0560:
            r11.append(r9)     // Catch:{ OutOfMemoryError -> 0x058b }
            java.lang.String r9 = r6.A01()     // Catch:{ OutOfMemoryError -> 0x058b }
            if (r9 == 0) goto L_0x0583
            java.lang.String r0 = r9.trim()     // Catch:{ OutOfMemoryError -> 0x058b }
            boolean r0 = r0.isEmpty()     // Catch:{ OutOfMemoryError -> 0x058b }
            if (r0 == 0) goto L_0x0560
        L_0x0573:
            java.lang.String r0 = r11.toString()     // Catch:{ OutOfMemoryError -> 0x058b }
            X.6pj r1 = r6.A0F     // Catch:{ OutOfMemoryError -> 0x058b }
            if (r1 == 0) goto L_0x0598
            java.util.ArrayList r0 = X.C108965cb.A0s(r0)     // Catch:{ OutOfMemoryError -> 0x058b }
            r1.A01(r0)     // Catch:{ OutOfMemoryError -> 0x058b }
            goto L_0x0598
        L_0x0583:
            java.lang.String r1 = "File ended during parsing BASE64 binary"
            X.1iZ r0 = new X.1iZ     // Catch:{ OutOfMemoryError -> 0x058b }
            r0.<init>(r1)     // Catch:{ OutOfMemoryError -> 0x058b }
            throw r0     // Catch:{ OutOfMemoryError -> 0x058b }
        L_0x058b:
            r1 = move-exception
            java.lang.String r0 = "vcardparser/out-of-memory "
            com.whatsapp.util.Log.e(r0, r1)
            X.6pj r0 = r6.A0F
            if (r0 == 0) goto L_0x0598
            r0.A01(r10)
        L_0x0598:
            long r0 = r6.A04
            long r0 = A00(r2, r0)
            r6.A04 = r0
            goto L_0x0460
        L_0x05a2:
            if (r0 != 0) goto L_0x05a6
            goto L_0x00dd
        L_0x05a6:
            long r2 = r6.A08
            r0 = r16
            long r0 = A00(r0, r2)
            r6.A08 = r0
            java.lang.String r2 = r6.A0D
            if (r2 == 0) goto L_0x0712
            r1 = 2
            r0 = r21
            java.lang.String[] r2 = r2.split(r0, r1)
            int r0 = r2.length
            if (r0 != r1) goto L_0x06f8
            r0 = r2[r4]
            java.lang.String r1 = r0.trim()
            java.lang.String r0 = "END"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x06f8
            r0 = r2[r5]
            java.lang.String r1 = r0.trim()
            r0 = r18
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x06f8
            X.6pj r7 = r6.A0F
            if (r7 == 0) goto L_0x0052
            long r2 = java.lang.System.currentTimeMillis()
            java.util.List r1 = r7.A02
            int r0 = r7.A00
            java.lang.Object r0 = r1.get(r0)
            X.6gu r0 = (X.C128926gu) r0
            r0.A00 = r4
        L_0x05ee:
            int r0 = r7.A00
            if (r0 <= 0) goto L_0x0600
            int r0 = r0 + -1
            r7.A00 = r0
            java.lang.Object r0 = r1.get(r0)
            X.6gu r0 = (X.C128926gu) r0
            int r0 = r0.A00
            if (r0 != r5) goto L_0x05ee
        L_0x0600:
            int r0 = r7.A00
            java.lang.Object r0 = r1.get(r0)
            X.6gu r0 = (X.C128926gu) r0
            r7.A04 = r0
            long r0 = r6.A01
            long r0 = A00(r2, r0)
            r6.A01 = r0
            goto L_0x0052
        L_0x0614:
            int r0 = X.AnonymousClass3MX.A01(r2)
            java.lang.String r5 = X.C17880vN.A0w(r2, r0)
            int r0 = X.AnonymousClass3MX.A01(r2)
            r4 = 0
            java.util.List r10 = r2.subList(r4, r0)
            r9 = 99
            r0 = 198(0xc6, float:2.77E-43)
            int r0 = X.C108955ca.A08(r10, r0)
            java.util.ArrayList r7 = X.C17880vN.A0z(r0)
            r8 = 0
            r3 = 0
        L_0x0633:
            int r0 = r10.size()
            if (r8 >= r0) goto L_0x0688
            int r11 = r10.size()
            java.lang.String r12 = X.C17880vN.A0w(r10, r8)
            int r14 = r12.length()
            r13 = 0
            if (r14 <= 0) goto L_0x0659
            char r1 = r12.charAt(r4)
            r0 = 32
            if (r1 == r0) goto L_0x0658
            char r1 = r12.charAt(r4)
            r0 = 9
            if (r1 != r0) goto L_0x0659
        L_0x0658:
            r13 = 1
        L_0x0659:
            r2 = 1
            if (r13 != 0) goto L_0x0674
            r1 = 58
            int r0 = r12.indexOf(r1)
            if (r0 >= 0) goto L_0x0683
            if (r14 != 0) goto L_0x0674
            int r0 = r8 + 1
            if (r0 >= r11) goto L_0x0674
            java.lang.String r0 = X.C17880vN.A0w(r10, r0)
            int r0 = r0.indexOf(r1)
            if (r0 > 0) goto L_0x0683
        L_0x0674:
            java.lang.String r1 = X.C17880vN.A0w(r10, r8)
            X.6fd r0 = new X.6fd
            r0.<init>(r1, r2)
            r7.add(r0)
            int r8 = r8 + 1
            goto L_0x0633
        L_0x0683:
            r2 = 0
            int r3 = r3 + 1
            if (r3 <= r9) goto L_0x0674
        L_0x0688:
            int r8 = r7.size()
            r3 = 0
        L_0x068d:
            if (r3 >= r8) goto L_0x06c8
            java.lang.Object r9 = r7.get(r3)
            X.6fd r9 = (X.C128216fd) r9
            java.lang.String r2 = r9.A00
            int r0 = r2.length()
            if (r0 <= 0) goto L_0x06b0
            char r1 = r2.charAt(r4)
            r0 = 32
            if (r1 == r0) goto L_0x06ad
            char r1 = r2.charAt(r4)
            r0 = 9
            if (r1 != r0) goto L_0x06b0
        L_0x06ad:
            int r3 = r3 + 1
            goto L_0x068d
        L_0x06b0:
            boolean r0 = r9.A01
            if (r0 == 0) goto L_0x06ad
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            r0 = 32
            java.lang.String r2 = X.C17890vO.A0Z(r2, r1, r0)
            r1 = 1
            X.6fd r0 = new X.6fd
            r0.<init>(r2, r1)
            r7.set(r3, r0)
            goto L_0x06ad
        L_0x06c8:
            X.6fd r0 = new X.6fd
            r0.<init>(r5, r4)
            r7.add(r0)
            goto L_0x003f
        L_0x06d2:
            X.84X r6 = new X.84X
            r6.<init>()
            goto L_0x0035
        L_0x06d9:
            int r4 = r4 + 1
            goto L_0x0008
        L_0x06dd:
            r0 = r3
            goto L_0x002a
        L_0x06e0:
            java.lang.String r1 = "AGENT Property is not supported."
            X.1iZ r0 = new X.1iZ
            r0.<init>(r1)
            throw r0
        L_0x06e8:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Unknown BEGIN type: "
            java.lang.String r1 = X.AnonymousClass001.A1H(r0, r9, r1)
            X.1iZ r0 = new X.1iZ
            r0.<init>(r1)
            throw r0
        L_0x06f8:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "END:VCARD != \""
            r1.append(r0)
            java.lang.String r0 = r6.A0D
            r1.append(r0)
            java.lang.String r0 = "\""
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)
            X.1iZ r0 = new X.1iZ
            r0.<init>(r1)
            throw r0
        L_0x0712:
            java.lang.String r1 = "Attempted to split null line"
            X.1iZ r0 = new X.1iZ
            r0.<init>(r1)
            throw r0
        L_0x071a:
            java.lang.String r1 = "null property value is not supported"
            X.1iZ r0 = new X.1iZ
            r0.<init>(r1)
            throw r0
        L_0x0722:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Invalid line: \""
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = "\""
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)
            X.1iZ r0 = new X.1iZ
            r0.<init>(r1)
            throw r0
        L_0x073a:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Expected String \"BEGIN:VCARD\" did not come (Instead, \""
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = "\" came)"
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)
            X.1iZ r0 = new X.1iZ
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass72d.A02(java.util.List, X.6pj):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0023, code lost:
        if (X.C17880vN.A0w(r4, r4.size() - 1).isEmpty() != false) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List A01(java.lang.String r6) {
        /*
            r5 = 257(0x101, float:3.6E-43)
            java.util.regex.Pattern r1 = A01
            r0 = 258(0x102, float:3.62E-43)
            java.lang.String[] r0 = r1.split(r6, r0)
            java.util.List r4 = java.util.Arrays.asList(r0)
            int r0 = r4.size()
            r3 = 0
            if (r0 <= 0) goto L_0x0039
            int r0 = r4.size()
            r2 = 1
            int r0 = r0 - r2
            java.lang.String r0 = X.C17880vN.A0w(r4, r0)
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0039
        L_0x0025:
            int r0 = r4.size()
            int r1 = java.lang.Math.min(r0, r5)
            int r1 = r1 - r2
            int r0 = r4.size()
            if (r1 >= r0) goto L_0x0038
            java.util.List r4 = r4.subList(r3, r1)
        L_0x0038:
            return r4
        L_0x0039:
            r2 = 0
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass72d.A01(java.lang.String):java.util.List");
    }

    public static long A00(long j, long j2) {
        return j2 + (System.currentTimeMillis() - j);
    }
}
