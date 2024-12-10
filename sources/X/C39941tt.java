package X;

import java.io.Closeable;
import java.util.Arrays;

/* renamed from: X.1tt  reason: invalid class name and case insensitive filesystem */
public abstract class C39941tt implements Closeable {
    public static final String[] A04 = new String[128];
    public int A00;
    public int[] A01 = new int[32];
    public int[] A02 = new int[32];
    public String[] A03 = new String[32];

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public double A07() {
        /*
            r9 = this;
            r5 = r9
            X.1tu r5 = (X.C39951tu) r5
            int r2 = r5.A00
            if (r2 != 0) goto L_0x000b
            int r2 = X.C39951tu.A01(r5)
        L_0x000b:
            r0 = 16
            r1 = 0
            if (r2 != r0) goto L_0x0022
            r5.A00 = r1
            int[] r2 = r5.A01
            int r0 = r5.A00
            int r1 = r0 + -1
            r0 = r2[r1]
            int r0 = r0 + 1
            r2[r1] = r0
            long r0 = r5.A02
            double r2 = (double) r0
            return r2
        L_0x0022:
            r0 = 17
            java.lang.String r6 = "Expected a double but was "
            r8 = 11
            java.lang.String r4 = " at path "
            if (r2 != r0) goto L_0x003c
            X.1tn r7 = r5.A04
            int r0 = r5.A01
            long r2 = (long) r0
            java.nio.charset.Charset r0 = X.C26571Sq.A05
            java.lang.String r0 = r7.A05(r0, r2)
        L_0x0037:
            r5.A03 = r0
        L_0x0039:
            r5.A00 = r8
            goto L_0x0080
        L_0x003c:
            r0 = 9
            if (r2 != r0) goto L_0x0047
            X.1u8 r0 = X.C39951tu.A06
        L_0x0042:
            java.lang.String r0 = X.C39951tu.A04(r5, r0)
            goto L_0x0037
        L_0x0047:
            r0 = 8
            if (r2 != r0) goto L_0x004e
            X.1u8 r0 = X.C39951tu.A07
            goto L_0x0042
        L_0x004e:
            r0 = 10
            if (r2 != r0) goto L_0x0057
            java.lang.String r0 = X.C39951tu.A03(r5)
            goto L_0x0037
        L_0x0057:
            if (r2 == r8) goto L_0x0039
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            java.lang.Integer r0 = r5.A0B()
            java.lang.String r0 = X.C24513C7h.A00(r0)
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r5.A0E()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            X.3EP r1 = new X.3EP
            r1.<init>(r0)
            throw r1
        L_0x0080:
            java.lang.String r0 = r5.A03     // Catch:{ NumberFormatException -> 0x00c5 }
            double r2 = java.lang.Double.parseDouble(r0)     // Catch:{ NumberFormatException -> 0x00c5 }
            boolean r0 = java.lang.Double.isNaN(r2)
            if (r0 != 0) goto L_0x00a4
            boolean r0 = java.lang.Double.isInfinite(r2)
            if (r0 != 0) goto L_0x00a4
            r0 = 0
            r5.A03 = r0
            r5.A00 = r1
            int[] r4 = r5.A01
            int r0 = r5.A00
            int r1 = r0 + -1
            r0 = r4[r1]
            int r0 = r0 + 1
            r4[r1] = r0
            return r2
        L_0x00a4:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "JSON forbids NaN and infinities: "
            r1.append(r0)
            r1.append(r2)
            r1.append(r4)
            java.lang.String r0 = r5.A0E()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            X.2QR r1 = new X.2QR
            r1.<init>(r0)
            throw r1
        L_0x00c5:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            java.lang.String r0 = r5.A03
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r5.A0E()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            X.3EP r0 = new X.3EP
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39941tt.A07():double");
    }

    public int A08() {
        int i;
        C40081u8 r0;
        C39951tu r4 = (C39951tu) this;
        int i2 = r4.A00;
        if (i2 == 0) {
            i2 = C39951tu.A01(r4);
        }
        if (i2 == 16) {
            long j = r4.A02;
            i = (int) j;
            if (j != ((long) i)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Expected an int but was ");
                sb.append(j);
                sb.append(" at path ");
                sb.append(r4.A0E());
                throw new AnonymousClass3EP(sb.toString());
            }
        } else {
            if (i2 == 17) {
                r4.A03 = r4.A04.A05(C26571Sq.A05, (long) r4.A01);
            } else {
                if (i2 == 9) {
                    r0 = C39951tu.A06;
                } else if (i2 == 8) {
                    r0 = C39951tu.A07;
                } else if (i2 != 11) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Expected an int but was ");
                    sb2.append(C24513C7h.A00(r4.A0B()));
                    sb2.append(" at path ");
                    sb2.append(r4.A0E());
                    throw new AnonymousClass3EP(sb2.toString());
                }
                String A042 = C39951tu.A04(r4, r0);
                r4.A03 = A042;
                try {
                    int parseInt = Integer.parseInt(A042);
                    r4.A00 = 0;
                    int[] iArr = r4.A01;
                    int i3 = r4.A00 - 1;
                    iArr[i3] = iArr[i3] + 1;
                    return parseInt;
                } catch (NumberFormatException unused) {
                }
            }
            r4.A00 = 11;
            try {
                String str = r4.A03;
                double parseDouble = Double.parseDouble(str);
                i = (int) parseDouble;
                if (((double) i) == parseDouble) {
                    r4.A03 = null;
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Expected an int but was ");
                    sb3.append(str);
                    sb3.append(" at path ");
                    sb3.append(r4.A0E());
                    throw new AnonymousClass3EP(sb3.toString());
                }
            } catch (NumberFormatException unused2) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Expected an int but was ");
                sb4.append(r4.A03);
                sb4.append(" at path ");
                sb4.append(r4.A0E());
                throw new AnonymousClass3EP(sb4.toString());
            }
        }
        r4.A00 = 0;
        int[] iArr2 = r4.A01;
        int i4 = r4.A00 - 1;
        iArr2[i4] = iArr2[i4] + 1;
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0074, code lost:
        if (r6 == -1) goto L_0x0076;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A09(X.C40111uB r11) {
        /*
            r10 = this;
            r8 = r10
            X.1tu r8 = (X.C39951tu) r8
            int r1 = r8.A00
            if (r1 != 0) goto L_0x000b
            int r1 = X.C39951tu.A01(r8)
        L_0x000b:
            r0 = 12
            r9 = -1
            if (r1 < r0) goto L_0x0088
            r7 = 15
            if (r1 > r7) goto L_0x0088
            if (r1 != r7) goto L_0x0035
            java.lang.String r4 = r8.A03
            java.lang.String[] r3 = r11.A01
            int r2 = r3.length
            r1 = 0
            r6 = 0
        L_0x001d:
            if (r6 >= r2) goto L_0x0088
            r0 = r3[r6]
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0032
            r8.A00 = r1
            java.lang.String[] r1 = r8.A03
            int r0 = r8.A00
            int r0 = r0 + -1
            r1[r0] = r4
        L_0x0031:
            return r6
        L_0x0032:
            int r6 = r6 + 1
            goto L_0x001d
        L_0x0035:
            X.1tl r1 = r8.A05
            X.1uD r0 = r11.A00
            int r6 = r1.CHC(r0)
            if (r6 == r9) goto L_0x004f
            r0 = 0
            r8.A00 = r0
            java.lang.String[] r2 = r8.A03
            int r0 = r8.A00
            int r1 = r0 + -1
            java.lang.String[] r0 = r11.A01
            r0 = r0[r6]
            r2[r1] = r0
            return r6
        L_0x004f:
            java.lang.String[] r1 = r8.A03
            int r0 = r8.A00
            int r0 = r0 + -1
            r5 = r1[r0]
            java.lang.String r4 = r8.A0C()
            java.lang.String[] r3 = r11.A01
            int r2 = r3.length
            r1 = 0
            r6 = 0
        L_0x0060:
            if (r6 >= r2) goto L_0x0086
            r0 = r3[r6]
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0083
            r8.A00 = r1
            java.lang.String[] r1 = r8.A03
            int r0 = r8.A00
            int r0 = r0 + -1
            r1[r0] = r4
            if (r6 != r9) goto L_0x0031
        L_0x0076:
            r8.A00 = r7
            r8.A03 = r4
            java.lang.String[] r1 = r8.A03
            int r0 = r8.A00
            int r0 = r0 + -1
            r1[r0] = r5
            return r6
        L_0x0083:
            int r6 = r6 + 1
            goto L_0x0060
        L_0x0086:
            r6 = -1
            goto L_0x0076
        L_0x0088:
            r6 = -1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39941tt.A09(X.1uB):int");
    }

    public Integer A0B() {
        C39951tu r1 = (C39951tu) this;
        int i = r1.A00;
        if (i == 0) {
            i = C39951tu.A01(r1);
        }
        switch (i) {
            case 1:
                return AnonymousClass00R.A0C;
            case 2:
                return AnonymousClass00R.A0N;
            case 3:
                return AnonymousClass00R.A00;
            case 4:
                return AnonymousClass00R.A01;
            case 5:
            case 6:
                return AnonymousClass00R.A15;
            case 7:
                return AnonymousClass00R.A18;
            case 8:
            case 9:
            case 10:
            case 11:
                return AnonymousClass00R.A0j;
            case 16:
            case 17:
                return AnonymousClass00R.A0u;
            case 18:
                return AnonymousClass00R.A19;
            default:
                return AnonymousClass00R.A0Y;
        }
    }

    public String A0C() {
        String str;
        C40081u8 r0;
        C39951tu r3 = (C39951tu) this;
        int i = r3.A00;
        if (i == 0) {
            i = C39951tu.A01(r3);
        }
        if (i == 14) {
            str = C39951tu.A03(r3);
        } else {
            if (i == 13) {
                r0 = C39951tu.A06;
            } else if (i == 12) {
                r0 = C39951tu.A07;
            } else if (i == 15) {
                str = r3.A03;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Expected a name but was ");
                sb.append(C24513C7h.A00(r3.A0B()));
                sb.append(" at path ");
                sb.append(r3.A0E());
                throw new AnonymousClass3EP(sb.toString());
            }
            str = C39951tu.A04(r3, r0);
        }
        r3.A00 = 0;
        r3.A03[r3.A00 - 1] = str;
        return str;
    }

    public String A0D() {
        String A05;
        C39951tu r4 = (C39951tu) this;
        int i = r4.A00;
        if (i == 0) {
            i = C39951tu.A01(r4);
        }
        if (i == 10) {
            A05 = C39951tu.A03(r4);
        } else if (i == 9) {
            A05 = C39951tu.A04(r4, C39951tu.A06);
        } else if (i == 8) {
            A05 = C39951tu.A04(r4, C39951tu.A07);
        } else if (i == 11) {
            A05 = r4.A03;
            r4.A03 = null;
        } else if (i == 16) {
            A05 = Long.toString(r4.A02);
        } else if (i == 17) {
            A05 = r4.A04.A05(C26571Sq.A05, (long) r4.A01);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected a string but was ");
            sb.append(C24513C7h.A00(r4.A0B()));
            sb.append(" at path ");
            sb.append(r4.A0E());
            throw new AnonymousClass3EP(sb.toString());
        }
        r4.A00 = 0;
        int[] iArr = r4.A01;
        int i2 = r4.A00 - 1;
        iArr[i2] = iArr[i2] + 1;
        return A05;
    }

    public void A0F() {
        C39951tu r3 = (C39951tu) this;
        int i = r3.A00;
        if (i == 0) {
            i = C39951tu.A01(r3);
        }
        if (i == 3) {
            r3.A0L(1);
            r3.A01[r3.A00 - 1] = 0;
            r3.A00 = 0;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected BEGIN_ARRAY but was ");
        sb.append(C24513C7h.A00(r3.A0B()));
        sb.append(" at path ");
        sb.append(r3.A0E());
        throw new AnonymousClass3EP(sb.toString());
    }

    public void A0G() {
        C39951tu r2 = (C39951tu) this;
        int i = r2.A00;
        if (i == 0) {
            i = C39951tu.A01(r2);
        }
        if (i == 1) {
            r2.A0L(3);
            r2.A00 = 0;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected BEGIN_OBJECT but was ");
        sb.append(C24513C7h.A00(r2.A0B()));
        sb.append(" at path ");
        sb.append(r2.A0E());
        throw new AnonymousClass3EP(sb.toString());
    }

    public void A0H() {
        C39951tu r3 = (C39951tu) this;
        int i = r3.A00;
        if (i == 0) {
            i = C39951tu.A01(r3);
        }
        if (i == 4) {
            int i2 = r3.A00 - 1;
            r3.A00 = i2;
            int[] iArr = r3.A01;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            r3.A00 = 0;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected END_ARRAY but was ");
        sb.append(C24513C7h.A00(r3.A0B()));
        sb.append(" at path ");
        sb.append(r3.A0E());
        throw new AnonymousClass3EP(sb.toString());
    }

    public void A0I() {
        C39951tu r4 = (C39951tu) this;
        int i = r4.A00;
        if (i == 0) {
            i = C39951tu.A01(r4);
        }
        if (i == 2) {
            int i2 = r4.A00 - 1;
            r4.A00 = i2;
            r4.A03[i2] = null;
            int[] iArr = r4.A01;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            r4.A00 = 0;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected END_OBJECT but was ");
        sb.append(C24513C7h.A00(r4.A0B()));
        sb.append(" at path ");
        sb.append(r4.A0E());
        throw new AnonymousClass3EP(sb.toString());
    }

    public void A0J() {
        C40081u8 r0;
        C39951tu r3 = (C39951tu) this;
        int i = r3.A00;
        if (i == 0) {
            i = C39951tu.A01(r3);
        }
        if (i == 14) {
            long Bd3 = r3.A05.Bd3(C39951tu.A08);
            C39881tn r6 = r3.A04;
            if (Bd3 == -1) {
                Bd3 = r6.A00;
            }
            r6.A08(Bd3);
        } else {
            if (i == 13) {
                r0 = C39951tu.A06;
            } else if (i == 12) {
                r0 = C39951tu.A07;
            } else if (i != 15) {
                StringBuilder sb = new StringBuilder();
                sb.append("Expected a name but was ");
                sb.append(C24513C7h.A00(r3.A0B()));
                sb.append(" at path ");
                sb.append(r3.A0E());
                throw new AnonymousClass3EP(sb.toString());
            }
            C39951tu.A05(r3, r0);
        }
        r3.A00 = 0;
        r3.A03[r3.A00 - 1] = "null";
    }

    public void A0K() {
        C40081u8 r0;
        C39951tu r3 = (C39951tu) this;
        int i = 0;
        do {
            int i2 = r3.A00;
            if (i2 == 0) {
                i2 = C39951tu.A01(r3);
            }
            if (i2 == 3) {
                r3.A0L(1);
            } else if (i2 == 1) {
                r3.A0L(3);
            } else {
                if (i2 == 4) {
                    i--;
                    if (i < 0) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Expected a value but was ");
                        sb.append(C24513C7h.A00(r3.A0B()));
                        sb.append(" at path ");
                        sb.append(r3.A0E());
                        throw new AnonymousClass3EP(sb.toString());
                    }
                } else if (i2 == 2) {
                    i--;
                    if (i < 0) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Expected a value but was ");
                        sb2.append(C24513C7h.A00(r3.A0B()));
                        sb2.append(" at path ");
                        sb2.append(r3.A0E());
                        throw new AnonymousClass3EP(sb2.toString());
                    }
                } else if (i2 == 14 || i2 == 10) {
                    long Bd3 = r3.A05.Bd3(C39951tu.A08);
                    C39881tn r8 = r3.A04;
                    if (Bd3 == -1) {
                        Bd3 = r8.A00;
                    }
                    r8.A08(Bd3);
                    r3.A00 = 0;
                } else {
                    if (i2 == 9 || i2 == 13) {
                        r0 = C39951tu.A06;
                    } else if (i2 == 8 || i2 == 12) {
                        r0 = C39951tu.A07;
                    } else {
                        if (i2 == 17) {
                            r3.A04.A08((long) r3.A01);
                        } else if (i2 == 18) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Expected a value but was ");
                            sb3.append(C24513C7h.A00(r3.A0B()));
                            sb3.append(" at path ");
                            sb3.append(r3.A0E());
                            throw new AnonymousClass3EP(sb3.toString());
                        }
                        r3.A00 = 0;
                    }
                    C39951tu.A05(r3, r0);
                    r3.A00 = 0;
                }
                r3.A00--;
                r3.A00 = 0;
            }
            i++;
            r3.A00 = 0;
        } while (i != 0);
        int[] iArr = r3.A01;
        int i3 = r3.A00 - 1;
        iArr[i3] = iArr[i3] + 1;
        r3.A03[i3] = "null";
    }

    public boolean A0M() {
        C39951tu r0 = (C39951tu) this;
        int i = r0.A00;
        if (i == 0) {
            i = C39951tu.A01(r0);
        }
        if (i == 2 || i == 4 || i == 18) {
            return false;
        }
        return true;
    }

    public boolean A0N() {
        C39951tu r4 = (C39951tu) this;
        int i = r4.A00;
        if (i == 0) {
            i = C39951tu.A01(r4);
        }
        if (i == 5) {
            r4.A00 = 0;
            int[] iArr = r4.A01;
            int i2 = r4.A00 - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            r4.A00 = 0;
            int[] iArr2 = r4.A01;
            int i3 = r4.A00 - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected a boolean but was ");
            sb.append(C24513C7h.A00(r4.A0B()));
            sb.append(" at path ");
            sb.append(r4.A0E());
            throw new AnonymousClass3EP(sb.toString());
        }
    }

    static {
        String[] strArr;
        int i = 0;
        do {
            strArr = A04;
            strArr[i] = String.format("\\u%04x", new Object[]{Integer.valueOf(i)});
            i++;
        } while (i <= 31);
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public final AnonymousClass2QR A0A(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" at path ");
        sb.append(A0E());
        throw new AnonymousClass2QR(sb.toString());
    }

    public final String A0E() {
        int i = this.A00;
        int[] iArr = this.A02;
        String[] strArr = this.A03;
        int[] iArr2 = this.A01;
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(iArr2[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String str = strArr[i2];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    public final void A0L(int i) {
        int i2 = this.A00;
        int[] iArr = this.A02;
        int length = iArr.length;
        if (i2 == length) {
            if (i2 != 256) {
                this.A02 = Arrays.copyOf(iArr, length * 2);
                String[] strArr = this.A03;
                this.A03 = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.A01;
                this.A01 = Arrays.copyOf(iArr2, iArr2.length * 2);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Nesting too deep at ");
                sb.append(A0E());
                throw new AnonymousClass3EP(sb.toString());
            }
        }
        int[] iArr3 = this.A02;
        int i3 = this.A00;
        this.A00 = i3 + 1;
        iArr3[i3] = i;
    }
}
