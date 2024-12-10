package X;

import java.io.IOException;
import java.util.Hashtable;

/* renamed from: X.Cvu  reason: case insensitive filesystem */
public abstract class C26254Cvu {
    public static int A00(char c) {
        int i;
        if ('0' <= c) {
            if (c <= '9') {
                return c - '0';
            }
            if ('a' <= c && c <= 'f') {
                i = c - 'a';
                return i + 10;
            }
        }
        i = c - 'A';
        return i + 10;
    }

    public static void A04(StringBuffer stringBuffer, Hashtable hashtable, C28291Dwz dwz) {
        AnonymousClass1C0 r1 = dwz.A01;
        String str = (String) hashtable.get(r1);
        if (str == null) {
            str = r1.A01;
        }
        stringBuffer.append(str);
        stringBuffer.append('=');
        stringBuffer.append(A03(dwz.A00));
    }

    public static void A05(StringBuffer stringBuffer, Hashtable hashtable, C28307DxF dxF) {
        if (dxF.A00.A00.length > 1) {
            C28291Dwz[] A0E = dxF.A0E();
            boolean z = true;
            for (int i = 0; i != A0E.length; i++) {
                if (z) {
                    z = false;
                } else {
                    stringBuffer.append('+');
                }
                A04(stringBuffer, hashtable, A0E[i]);
            }
        } else if (dxF.A0D() != null) {
            A04(stringBuffer, hashtable, dxF.A0D());
        }
    }

    public static boolean A06(C28307DxF dxF, C28307DxF dxF2) {
        if (dxF.A00.A00.length == dxF2.A00.A00.length) {
            C28291Dwz[] A0E = dxF.A0E();
            C28291Dwz[] A0E2 = dxF2.A0E();
            int length = A0E.length;
            if (length == A0E2.length) {
                int i = 0;
                while (i != length) {
                    C28291Dwz dwz = A0E[i];
                    C28291Dwz dwz2 = A0E2[i];
                    if (dwz == dwz2 || (dwz != null && dwz2 != null && dwz.A01.A0J(dwz2.A01) && A01(A03(dwz.A00)).equals(A01(A03(dwz2.A00))))) {
                        i++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: X.DxF[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: X.DxF} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: X.1C0[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: X.Dwz[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: X.1C0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v21, resolved type: X.1C0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v32, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: X.DxF} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: X.DxF} */
    /* JADX WARNING: type inference failed for: r5v0, types: [X.COm, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v10, types: [X.Dxm] */
    /* JADX WARNING: type inference failed for: r1v19, types: [X.Dxm] */
    /* JADX WARNING: type inference failed for: r0v31, types: [java.lang.Object, X.Dwz] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C28307DxF[] A07(X.CZY r12) {
        /*
            java.lang.String r1 = "CN=WAUser"
            r0 = 44
            X.CWk r4 = new X.CWk
            r4.<init>(r1, r0)
            X.COm r5 = new X.COm
            r5.<init>()
            java.util.Vector r0 = new java.util.Vector
            r0.<init>()
            r5.A00 = r0
            r5.A01 = r12
        L_0x0017:
            int r1 = r4.A01
            java.lang.String r0 = r4.A02
            int r0 = r0.length()
            boolean r0 = X.AnonymousClass000.A1S(r1, r0)
            if (r0 == 0) goto L_0x0172
            java.lang.String r2 = r4.A00()
            r1 = 43
            int r0 = r2.indexOf(r1)
            java.lang.String r11 = "badly formatted directory string"
            r8 = 61
            if (r0 <= 0) goto L_0x0115
            X.CWk r9 = new X.CWk
            r9.<init>(r2, r1)
            java.lang.String r0 = r9.A00()
            X.CWk r3 = new X.CWk
            r3.<init>(r0, r8)
            java.lang.String r2 = r3.A00()
            int r1 = r3.A01
            java.lang.String r0 = r3.A02
            int r0 = r0.length()
            boolean r0 = X.AnonymousClass000.A1S(r1, r0)
            if (r0 == 0) goto L_0x0168
            java.lang.String r10 = r3.A00()
            java.lang.String r0 = r2.trim()
            X.1C0 r6 = r12.A03(r0)
            int r1 = r9.A01
            java.lang.String r0 = r9.A02
            int r0 = r0.length()
            boolean r0 = X.AnonymousClass000.A1S(r1, r0)
            if (r0 == 0) goto L_0x0138
            java.util.Vector r7 = new java.util.Vector
            r7.<init>()
            java.util.Vector r2 = new java.util.Vector
            r2.<init>()
        L_0x0079:
            r7.addElement(r6)
            java.lang.String r0 = A02(r10)
            r2.addElement(r0)
            int r1 = r9.A01
            java.lang.String r0 = r9.A02
            int r0 = r0.length()
            boolean r0 = X.AnonymousClass000.A1S(r1, r0)
            if (r0 == 0) goto L_0x00b9
            java.lang.String r0 = r9.A00()
            X.CWk r6 = new X.CWk
            r6.<init>(r0, r8)
            java.lang.String r3 = r6.A00()
            int r1 = r6.A01
            java.lang.String r0 = r6.A02
            int r0 = r0.length()
            boolean r0 = X.AnonymousClass000.A1S(r1, r0)
            if (r0 == 0) goto L_0x0163
            java.lang.String r10 = r6.A00()
            java.lang.String r0 = r3.trim()
            X.1C0 r6 = r12.A03(r0)
            goto L_0x0079
        L_0x00b9:
            int r9 = r7.size()
            X.1C0[] r8 = new X.AnonymousClass1C0[r9]
            r1 = 0
        L_0x00c0:
            if (r1 == r9) goto L_0x00cb
            java.lang.Object r0 = r7.elementAt(r1)
            r8[r1] = r0
            int r1 = r1 + 1
            goto L_0x00c0
        L_0x00cb:
            int r10 = r2.size()
            java.lang.String[] r6 = new java.lang.String[r10]
            r1 = 0
        L_0x00d2:
            if (r1 == r10) goto L_0x00dd
            java.lang.Object r0 = r2.elementAt(r1)
            r6[r1] = r0
            int r1 = r1 + 1
            goto L_0x00d2
        L_0x00dd:
            X.1Bx[] r7 = new X.AnonymousClass1Bx[r10]
            r3 = 0
        L_0x00e0:
            if (r3 == r10) goto L_0x00f1
            X.CZY r2 = r5.A01
            r1 = r8[r3]
            r0 = r6[r3]
            X.1Bx r0 = r2.A02(r0, r1)
            r7[r3] = r0
            int r3 = r3 + 1
            goto L_0x00e0
        L_0x00f1:
            X.Dwz[] r6 = new X.C28291Dwz[r9]
            r3 = 0
        L_0x00f4:
            if (r3 == r9) goto L_0x0108
            r2 = r8[r3]
            r1 = r7[r3]
            X.Dwz r0 = new X.Dwz
            r0.<init>()
            r0.A01 = r2
            r0.A00 = r1
            r6[r3] = r0
            int r3 = r3 + 1
            goto L_0x00f4
        L_0x0108:
            java.util.Vector r3 = r5.A00
            X.DxF r2 = new X.DxF
            r2.<init>()
            X.Dy6 r1 = new X.Dy6
            r1.<init>((X.AnonymousClass1Bx[]) r6)
            goto L_0x0159
        L_0x0115:
            X.CWk r3 = new X.CWk
            r3.<init>(r2, r8)
            java.lang.String r2 = r3.A00()
            int r1 = r3.A01
            java.lang.String r0 = r3.A02
            int r0 = r0.length()
            boolean r0 = X.AnonymousClass000.A1S(r1, r0)
            if (r0 == 0) goto L_0x016d
            java.lang.String r10 = r3.A00()
            java.lang.String r0 = r2.trim()
            X.1C0 r6 = r12.A03(r0)
        L_0x0138:
            java.lang.String r1 = A02(r10)
            X.CZY r0 = r5.A01
            X.1Bx r1 = r0.A02(r1, r6)
            java.util.Vector r3 = r5.A00
            X.DxF r2 = new X.DxF
            r2.<init>()
            X.Csy r0 = X.BE8.A0t()
            r0.A02(r6)
            X.Dy3 r0 = X.C28339Dxl.A07(r1, r0)
            X.Dy6 r1 = new X.Dy6
            r1.<init>((X.AnonymousClass1Bx) r0)
        L_0x0159:
            r0 = -1
            r1.A00 = r0
            r2.A00 = r1
            r3.addElement(r2)
            goto L_0x0017
        L_0x0163:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r11)
            throw r0
        L_0x0168:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r11)
            throw r0
        L_0x016d:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r11)
            throw r0
        L_0x0172:
            java.util.Vector r4 = r5.A00
            int r3 = r4.size()
            X.DxF[] r2 = new X.C28307DxF[r3]
            r1 = 0
        L_0x017b:
            if (r1 == r3) goto L_0x0186
            java.lang.Object r0 = r4.elementAt(r1)
            r2[r1] = r0
            int r1 = r1 + 1
            goto L_0x017b
        L_0x0186:
            X.CZY r1 = r5.A01
            X.DxW r0 = new X.DxW
            r0.<init>((X.CZY) r1, (X.C28307DxF[]) r2)
            X.DxF[] r0 = r0.A0D()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26254Cvu.A07(X.CZY):X.DxF[]");
    }

    public static String A01(String str) {
        int length = str.length();
        int i = 0;
        if (length > 0 && str.charAt(0) == '#') {
            try {
                AnonymousClass1Bz A01 = AnonymousClass1Bz.A01(C20073A5z.A01(str, length - 1));
                if (A01 instanceof E74) {
                    str = ((E74) A01).BZl();
                }
            } catch (IOException e) {
                throw BEA.A0c(e, "unknown encoding in name: ", AnonymousClass000.A10());
            }
        }
        String A00 = AnonymousClass1Bo.A00(str);
        int length2 = A00.length();
        if (length2 < 2) {
            return A00;
        }
        int i2 = length2 - 1;
        while (i < i2 && A00.charAt(i) == '\\' && A00.charAt(i + 1) == ' ') {
            i += 2;
        }
        int i3 = i + 1;
        int i4 = i2;
        while (i4 > i3 && A00.charAt(i4 - 1) == '\\' && A00.charAt(i4) == ' ') {
            i4 -= 2;
        }
        if (i > 0 || i4 < i2) {
            A00 = A00.substring(i, i4 + 1);
        }
        if (A00.indexOf("  ") < 0) {
            return A00;
        }
        StringBuffer A0s = BE6.A0s();
        char A002 = BE7.A00(A00);
        A0s.append(A002);
        for (int i5 = 1; i5 < A00.length(); i5++) {
            char charAt = A00.charAt(i5);
            if (A002 != ' ' || charAt != ' ') {
                A0s.append(charAt);
                A002 = charAt;
            }
        }
        return A0s.toString();
    }

    public static String A02(String str) {
        int i;
        int length = str.length();
        if (length == 0 || (str.indexOf(92) < 0 && str.indexOf(34) < 0)) {
            return str.trim();
        }
        char[] charArray = str.toCharArray();
        StringBuffer stringBuffer = new StringBuffer(length);
        if (charArray[0] == '\\' && charArray[1] == '#') {
            stringBuffer.append("\\#");
            i = 2;
        } else {
            i = 0;
        }
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        boolean z3 = false;
        char c = 0;
        while (i != charArray.length) {
            char c2 = charArray[i];
            if (c2 != ' ') {
                z3 = true;
                if (c2 == '\"') {
                    if (!z) {
                        z2 = !z2;
                    }
                } else if (c2 == '\\') {
                    if (!z && !z2) {
                        i2 = stringBuffer.length();
                        z = true;
                        i++;
                    }
                } else if (z && '0' <= c2 && (c2 <= '9' || ('a' > c2 ? !('A' > c2 || c2 > 'F') : c2 <= 'f'))) {
                    if (c != 0) {
                        stringBuffer.append((char) ((A00(c) * 16) + A00(c2)));
                        z = false;
                        c = 0;
                    } else {
                        c = c2;
                    }
                    i++;
                }
                stringBuffer.append(c2);
            } else {
                if (!z && !z3) {
                    i++;
                }
                stringBuffer.append(c2);
            }
            z = false;
            i++;
        }
        if (stringBuffer.length() > 0) {
            while (stringBuffer.charAt(stringBuffer.length() - 1) == ' ' && i2 != stringBuffer.length() - 1) {
                stringBuffer.setLength(stringBuffer.length() - 1);
            }
        }
        return stringBuffer.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0042, code lost:
        if (r4.charAt(1) != '#') goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A03(X.AnonymousClass1Bx r8) {
        /*
            java.lang.StringBuffer r4 = X.BE6.A0s()
            boolean r0 = r8 instanceof X.E74
            r2 = 35
            r3 = 92
            r5 = 0
            if (r0 == 0) goto L_0x0069
            boolean r0 = r8 instanceof X.C28352Dxy
            if (r0 != 0) goto L_0x0069
            X.E74 r8 = (X.E74) r8
            java.lang.String r1 = r8.BZl()
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x0026
            char r0 = r1.charAt(r5)
            if (r0 != r2) goto L_0x0026
            r4.append(r3)
        L_0x0026:
            r4.append(r1)
        L_0x0029:
            int r8 = r4.length()
            int r1 = r4.length()
            r7 = 1
            r0 = 2
            if (r1 < r0) goto L_0x0044
            char r0 = r4.charAt(r5)
            if (r0 != r3) goto L_0x0044
            char r1 = r4.charAt(r7)
            r0 = 35
            r2 = 2
            if (r1 == r0) goto L_0x0045
        L_0x0044:
            r2 = 0
        L_0x0045:
            java.lang.String r6 = "\\"
            if (r2 == r8) goto L_0x007d
            char r1 = r4.charAt(r2)
            r0 = 34
            if (r1 == r0) goto L_0x0061
            if (r1 == r3) goto L_0x0061
            r0 = 43
            if (r1 == r0) goto L_0x0061
            r0 = 44
            if (r1 == r0) goto L_0x0061
            switch(r1) {
                case 59: goto L_0x0061;
                case 60: goto L_0x0061;
                case 61: goto L_0x0061;
                case 62: goto L_0x0061;
                default: goto L_0x005e;
            }
        L_0x005e:
            int r2 = r2 + 1
            goto L_0x0045
        L_0x0061:
            r4.insert(r2, r6)
            int r2 = r2 + 2
            int r8 = r8 + 1
            goto L_0x0045
        L_0x0069:
            r4.append(r2)     // Catch:{ IOException -> 0x00af }
            byte[] r1 = X.BE9.A1Z(r8)     // Catch:{ IOException -> 0x00af }
            int r0 = r1.length     // Catch:{ IOException -> 0x00af }
            byte[] r0 = X.C20073A5z.A02(r1, r5, r0)     // Catch:{ IOException -> 0x00af }
            java.lang.String r0 = X.AnonymousClass1Bo.A02(r0)     // Catch:{ IOException -> 0x00af }
            r4.append(r0)     // Catch:{ IOException -> 0x00af }
            goto L_0x0029
        L_0x007d:
            int r0 = r4.length()
            r2 = 32
            if (r0 <= 0) goto L_0x0097
        L_0x0085:
            int r0 = r4.length()
            if (r0 <= r5) goto L_0x0097
            char r0 = r4.charAt(r5)
            if (r0 != r2) goto L_0x0097
            r4.insert(r5, r6)
            int r5 = r5 + 2
            goto L_0x0085
        L_0x0097:
            int r1 = r4.length()
            int r1 = r1 - r7
        L_0x009c:
            if (r1 < 0) goto L_0x00aa
            char r0 = r4.charAt(r1)
            if (r0 != r2) goto L_0x00aa
            r4.insert(r1, r3)
            int r1 = r1 + -1
            goto L_0x009c
        L_0x00aa:
            java.lang.String r0 = r4.toString()
            return r0
        L_0x00af:
            java.lang.String r0 = "Other value has no encoded form"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26254Cvu.A03(X.1Bx):java.lang.String");
    }
}
