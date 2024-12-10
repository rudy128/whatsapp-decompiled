package X;

import java.io.EOFException;

/* renamed from: X.1tu  reason: invalid class name and case insensitive filesystem */
public final class C39951tu extends C39941tt {
    public static final C40081u8 A06 = C40091u9.A00("\"\\");
    public static final C40081u8 A07 = C40091u9.A00("'\\");
    public static final C40081u8 A08 = C40091u9.A00("{}[]:, \n\t\r\f/\\;#=");
    public static final C40081u8 A09 = C40091u9.A00("*/");
    public static final C40081u8 A0A = C40091u9.A00("\n\r");
    public int A00 = 0;
    public int A01;
    public long A02;
    public String A03;
    public final C39881tn A04;
    public final C39861tl A05;

    private int A02(boolean z) {
        int i = 0;
        while (true) {
            C39861tl r3 = this.A05;
            if (r3.CFQ((long) (i + 1))) {
                C39881tn r5 = this.A04;
                int i2 = i + 1;
                byte A012 = r5.A01((long) i);
                if (A012 == 10 || A012 == 32 || A012 == 13 || A012 == 9) {
                    i = i2;
                } else {
                    r5.A08((long) (i2 - 1));
                    if (A012 != 47 ? A012 != 35 : !r3.CFQ(2)) {
                        return A012;
                    }
                    throw A0A("Use JsonReader.setLenient(true) to accept malformed JSON");
                }
            } else if (!z) {
                return -1;
            } else {
                throw new EOFException("End of input");
            }
        }
    }

    public static String A04(C39951tu r6, C40081u8 r7) {
        StringBuilder sb = null;
        while (true) {
            long Bd3 = r6.A05.Bd3(r7);
            if (Bd3 != -1) {
                C39881tn r4 = r6.A04;
                if (r4.A01(Bd3) == 92) {
                    if (sb == null) {
                        sb = new StringBuilder();
                    }
                    sb.append(r4.A05(C26571Sq.A05, Bd3));
                    r4.A00();
                    sb.append(r6.A00());
                } else {
                    String A052 = r4.A05(C26571Sq.A05, Bd3);
                    if (sb == null) {
                        r4.A00();
                        return A052;
                    }
                    sb.append(A052);
                    r4.A00();
                    return sb.toString();
                }
            } else {
                throw r6.A0A("Unterminated string");
            }
        }
    }

    public void close() {
        this.A00 = 0;
        this.A02[0] = 8;
        this.A00 = 1;
        C39881tn r2 = this.A04;
        r2.A08(r2.A00);
        this.A05.close();
    }

    static {
        C40081u8 r0 = C40081u8.A02;
    }

    private char A00() {
        String str;
        StringBuilder sb;
        int i;
        C39861tl r3 = this.A05;
        if (r3.CFQ(1)) {
            C39881tn r6 = this.A04;
            byte A002 = r6.A00();
            if (A002 == 10 || A002 == 34 || A002 == 39 || A002 == 47 || A002 == 92) {
                return (char) A002;
            }
            if (A002 == 98) {
                return 8;
            }
            char c = 12;
            if (A002 != 102) {
                if (A002 == 110) {
                    return 10;
                }
                c = 13;
                if (A002 != 114) {
                    c = 9;
                    if (A002 != 116) {
                        if (A002 != 117) {
                            sb = new StringBuilder();
                            sb.append("Invalid escape sequence: \\");
                            sb.append((char) A002);
                        } else if (r3.CFQ(4)) {
                            int i2 = 0;
                            c = 0;
                            do {
                                byte A012 = r6.A01((long) i2);
                                char c2 = (char) (c << 4);
                                if (A012 >= 48) {
                                    int i3 = A012 - 48;
                                    if (A012 > 57) {
                                        if (A012 >= 97) {
                                            if (A012 <= 102) {
                                                i = A012 - 97;
                                            }
                                        } else if (A012 >= 65 && A012 <= 70) {
                                            i = A012 - 65;
                                        }
                                        i3 = i + 10;
                                    }
                                    c = (char) (c2 + i3);
                                    i2++;
                                }
                                sb = new StringBuilder();
                                sb.append("\\u");
                                sb.append(r6.A05(C26571Sq.A05, 4));
                            } while (i2 < 4);
                            r6.A08(4);
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Unterminated escape sequence at path ");
                            sb2.append(A0E());
                            throw new EOFException(sb2.toString());
                        }
                        str = sb.toString();
                    }
                }
            }
            return c;
        }
        str = "Unterminated escape sequence";
        throw A0A(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0107, code lost:
        if (r8.A06(r1) != false) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0109, code lost:
        if (r10 != 2) goto L_0x0129;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x010b, code lost:
        if (r20 == false) goto L_0x012d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0111, code lost:
        if (r4 != Long.MIN_VALUE) goto L_0x0115;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0113, code lost:
        if (r19 == false) goto L_0x012d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0117, code lost:
        if (r4 != 0) goto L_0x0126;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0119, code lost:
        if (r19 != false) goto L_0x012d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x011b, code lost:
        r4 = -r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x011c, code lost:
        r8.A02 = r4;
        r6.A08((long) r11);
        r5 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0126, code lost:
        if (r19 == false) goto L_0x011b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0129, code lost:
        if (r10 == 4) goto L_0x012d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x012b, code lost:
        if (r10 != 7) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x012d, code lost:
        r8.A01 = r11;
        r5 = 17;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A01(X.C39951tu r20) {
        /*
            r8 = r20
            int[] r15 = r8.A02
            int r13 = r8.A00
            r7 = 1
            int r13 = r13 - r7
            r11 = r15[r13]
            r2 = 0
            r10 = 34
            r6 = 93
            r12 = 3
            r14 = 7
            r5 = 59
            r4 = 44
            r9 = 4
            r1 = 2
            if (r11 != r7) goto L_0x016b
            r15[r13] = r1
        L_0x001c:
            int r13 = r8.A02(r7)
            if (r13 == r10) goto L_0x0219
            r0 = 39
            if (r13 == r0) goto L_0x01fa
            if (r13 == r4) goto L_0x018d
            if (r13 == r5) goto L_0x018d
            r0 = 91
            if (r13 == r0) goto L_0x0211
            if (r13 == r6) goto L_0x0183
            r0 = 123(0x7b, float:1.72E-43)
            if (r13 == r0) goto L_0x0209
            X.1tn r6 = r8.A04
            byte r1 = r6.A01(r2)
            r0 = 116(0x74, float:1.63E-43)
            if (r1 == r0) goto L_0x0163
            r0 = 84
            if (r1 == r0) goto L_0x0163
            r0 = 102(0x66, float:1.43E-43)
            if (r1 == r0) goto L_0x015c
            r0 = 70
            if (r1 == r0) goto L_0x015c
            r0 = 110(0x6e, float:1.54E-43)
            if (r1 == r0) goto L_0x0052
            r0 = 78
            if (r1 != r0) goto L_0x007a
        L_0x0052:
            java.lang.String r13 = "null"
            java.lang.String r11 = "NULL"
            r5 = 7
        L_0x0057:
            int r4 = r13.length()
            r10 = 1
        L_0x005c:
            if (r10 >= r4) goto L_0x0144
            X.1tl r15 = r8.A05
            int r0 = r10 + 1
            long r0 = (long) r0
            boolean r0 = r15.CFQ(r0)
            if (r0 == 0) goto L_0x007a
            long r0 = (long) r10
            byte r1 = r6.A01(r0)
            char r0 = r13.charAt(r10)
            if (r1 == r0) goto L_0x0140
            char r0 = r11.charAt(r10)
            if (r1 == r0) goto L_0x0140
        L_0x007a:
            r4 = 0
            r11 = 0
            r10 = 0
            r20 = 1
            r19 = 0
        L_0x0082:
            X.1tl r13 = r8.A05
            int r0 = r11 + 1
            long r0 = (long) r0
            boolean r0 = r13.CFQ(r0)
            r13 = 2
            if (r0 == 0) goto L_0x0109
            long r0 = (long) r11
            byte r1 = r6.A01(r0)
            r0 = 43
            r15 = 5
            if (r1 == r0) goto L_0x00ff
            r0 = 69
            if (r1 == r0) goto L_0x00f9
            r0 = 101(0x65, float:1.42E-43)
            if (r1 == r0) goto L_0x00f9
            r0 = 45
            if (r1 == r0) goto L_0x00f3
            r0 = 46
            if (r1 == r0) goto L_0x00ef
            r0 = 48
            if (r1 < r0) goto L_0x0103
            r0 = 57
            if (r1 > r0) goto L_0x0103
            if (r10 == r7) goto L_0x00e9
            if (r10 == 0) goto L_0x00e9
            if (r10 != r13) goto L_0x00de
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0133
            r17 = 10
            long r17 = r17 * r4
            int r0 = r1 + -48
            long r0 = (long) r0
            long r17 = r17 - r0
            r15 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r0 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r0 > 0) goto L_0x00d4
            int r0 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r0 != 0) goto L_0x00dc
            int r0 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x00dc
        L_0x00d4:
            r0 = 1
        L_0x00d5:
            r20 = r20 & r0
            r4 = r17
        L_0x00d9:
            int r11 = r11 + 1
            goto L_0x0082
        L_0x00dc:
            r0 = 0
            goto L_0x00d5
        L_0x00de:
            if (r10 != r12) goto L_0x00e2
            r10 = 4
            goto L_0x00d9
        L_0x00e2:
            if (r10 == r15) goto L_0x00e7
            r0 = 6
            if (r10 != r0) goto L_0x00d9
        L_0x00e7:
            r10 = 7
            goto L_0x00d9
        L_0x00e9:
            int r0 = r1 + -48
            int r0 = -r0
            long r4 = (long) r0
            r10 = 2
            goto L_0x00d9
        L_0x00ef:
            if (r10 != r13) goto L_0x0133
            r10 = 3
            goto L_0x00d9
        L_0x00f3:
            if (r10 != 0) goto L_0x00ff
            r10 = 1
            r19 = 1
            goto L_0x00d9
        L_0x00f9:
            if (r10 == r13) goto L_0x00fd
            if (r10 != r9) goto L_0x0133
        L_0x00fd:
            r10 = 5
            goto L_0x00d9
        L_0x00ff:
            if (r10 != r15) goto L_0x0133
            r10 = 6
            goto L_0x00d9
        L_0x0103:
            boolean r0 = r8.A06(r1)
            if (r0 != 0) goto L_0x0133
        L_0x0109:
            if (r10 != r13) goto L_0x0129
            if (r20 == 0) goto L_0x012d
            r9 = -9223372036854775808
            int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x0115
            if (r19 == 0) goto L_0x012d
        L_0x0115:
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0126
            if (r19 != 0) goto L_0x012d
        L_0x011b:
            long r4 = -r4
        L_0x011c:
            r8.A02 = r4
            long r0 = (long) r11
            r6.A08(r0)
            r5 = 16
            goto L_0x022d
        L_0x0126:
            if (r19 == 0) goto L_0x011b
            goto L_0x011c
        L_0x0129:
            if (r10 == r9) goto L_0x012d
            if (r10 != r14) goto L_0x0133
        L_0x012d:
            r8.A01 = r11
            r5 = 17
            goto L_0x022d
        L_0x0133:
            byte r0 = r6.A01(r2)
            boolean r0 = r8.A06(r0)
            if (r0 != 0) goto L_0x01fa
            java.lang.String r2 = "Expected value"
            goto L_0x017e
        L_0x0140:
            int r10 = r10 + 1
            goto L_0x005c
        L_0x0144:
            X.1tl r10 = r8.A05
            int r0 = r4 + 1
            long r0 = (long) r0
            boolean r0 = r10.CFQ(r0)
            if (r0 == 0) goto L_0x0229
            long r0 = (long) r4
            byte r0 = r6.A01(r0)
            boolean r0 = r8.A06(r0)
            if (r0 == 0) goto L_0x0229
            goto L_0x007a
        L_0x015c:
            java.lang.String r13 = "false"
            java.lang.String r11 = "FALSE"
            r5 = 6
            goto L_0x0057
        L_0x0163:
            java.lang.String r13 = "true"
            java.lang.String r11 = "TRUE"
            r5 = 5
            goto L_0x0057
        L_0x016b:
            if (r11 != r1) goto L_0x0194
            int r13 = r8.A02(r7)
            X.1tn r0 = r8.A04
            r0.A00()
            if (r13 == r4) goto L_0x001c
            if (r13 == r5) goto L_0x01fa
            if (r13 == r6) goto L_0x018a
            java.lang.String r2 = "Unterminated array"
        L_0x017e:
            X.2QR r0 = r8.A0A(r2)
            throw r0
        L_0x0183:
            if (r11 != r7) goto L_0x018d
            X.1tn r0 = r8.A04
            r0.A00()
        L_0x018a:
            r8.A00 = r9
            return r9
        L_0x018d:
            if (r11 == r7) goto L_0x01fa
            if (r11 == r1) goto L_0x01fa
            java.lang.String r2 = "Unexpected value"
            goto L_0x017e
        L_0x0194:
            r0 = 5
            if (r11 == r12) goto L_0x01c5
            if (r11 == r0) goto L_0x01c5
            if (r11 != r9) goto L_0x01b1
            r15[r13] = r0
            int r13 = r8.A02(r7)
            X.1tn r0 = r8.A04
            r0.A00()
            r0 = 58
            if (r13 == r0) goto L_0x001c
            r0 = 61
            if (r13 == r0) goto L_0x01fa
            java.lang.String r2 = "Expected ':'"
            goto L_0x017e
        L_0x01b1:
            r0 = 6
            if (r11 != r0) goto L_0x01b8
            r15[r13] = r14
            goto L_0x001c
        L_0x01b8:
            if (r11 != r14) goto L_0x01fd
            r0 = 0
            int r1 = r8.A02(r0)
            r0 = -1
            if (r1 != r0) goto L_0x01fa
            r5 = 18
            goto L_0x022d
        L_0x01c5:
            r15[r13] = r9
            r6 = 125(0x7d, float:1.75E-43)
            if (r11 != r0) goto L_0x01dd
            int r3 = r8.A02(r7)
            X.1tn r2 = r8.A04
            r2.A00()
            if (r3 == r4) goto L_0x01dd
            if (r3 == r5) goto L_0x01fa
            if (r3 == r6) goto L_0x01f2
            java.lang.String r2 = "Unterminated object"
            goto L_0x017e
        L_0x01dd:
            int r3 = r8.A02(r7)
            if (r3 == r10) goto L_0x0221
            r2 = 39
            if (r3 == r2) goto L_0x01f5
            java.lang.String r2 = "Expected name"
            if (r3 != r6) goto L_0x01fa
            if (r11 == r0) goto L_0x017e
            X.1tn r0 = r8.A04
            r0.A00()
        L_0x01f2:
            r8.A00 = r1
            return r1
        L_0x01f5:
            X.1tn r0 = r8.A04
            r0.A00()
        L_0x01fa:
            java.lang.String r2 = "Use JsonReader.setLenient(true) to accept malformed JSON"
            goto L_0x017e
        L_0x01fd:
            r0 = 8
            if (r11 != r0) goto L_0x001c
            java.lang.String r1 = "JsonReader is closed"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0209:
            X.1tn r0 = r8.A04
            r0.A00()
            r8.A00 = r7
            return r7
        L_0x0211:
            X.1tn r0 = r8.A04
            r0.A00()
            r8.A00 = r12
            return r12
        L_0x0219:
            X.1tn r0 = r8.A04
            r0.A00()
            r5 = 9
            goto L_0x022d
        L_0x0221:
            X.1tn r0 = r8.A04
            r0.A00()
            r5 = 13
            goto L_0x022d
        L_0x0229:
            long r0 = (long) r4
            r6.A08(r0)
        L_0x022d:
            r8.A00 = r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39951tu.A01(X.1tu):int");
    }

    public static String A03(C39951tu r6) {
        long Bd3 = r6.A05.Bd3(A08);
        if (Bd3 != -1) {
            return r6.A04.A05(C26571Sq.A05, Bd3);
        }
        C39881tn r3 = r6.A04;
        return r3.A05(C26571Sq.A05, r3.A00);
    }

    public static void A05(C39951tu r7, C40081u8 r8) {
        while (true) {
            long Bd3 = r7.A05.Bd3(r8);
            if (Bd3 != -1) {
                C39881tn r6 = r7.A04;
                byte A012 = r6.A01(Bd3);
                long j = Bd3 + 1;
                if (A012 == 92) {
                    r6.A08(j);
                    r7.A00();
                } else {
                    r6.A08(j);
                    return;
                }
            } else {
                throw r7.A0A("Unterminated string");
            }
        }
    }

    private boolean A06(int i) {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (!(i == 47 || i == 61)) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case C166418cr.ASSOCIATED_CHILD_MESSAGE_FIELD_NUMBER /*91*/:
                        case C166418cr.POLL_CREATION_MESSAGE_V4_FIELD_NUMBER /*93*/:
                            return false;
                        case C166418cr.GROUP_STATUS_MENTION_MESSAGE_FIELD_NUMBER /*92*/:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        throw A0A("Use JsonReader.setLenient(true) to accept malformed JSON");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("JsonReader(");
        sb.append(this.A05);
        sb.append(")");
        return sb.toString();
    }

    public C39951tu(C39861tl r2) {
        this.A05 = r2;
        this.A04 = ((C39871tm) r2).A01;
        A0L(6);
    }
}
