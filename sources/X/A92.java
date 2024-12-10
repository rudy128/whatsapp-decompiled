package X;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;

public final class A92 {
    public static final Map A0A;
    public ArrayList A00;
    public ArrayList A01;
    public final HashMap A02 = C17880vN.A11();
    public final HashMap A03 = C17880vN.A11();
    public final HashSet A04 = C17880vN.A12();
    public final HashSet A05 = C17880vN.A12();
    public final Vector A06 = new Vector();
    public final Vector A07 = new Vector();
    public final Vector A08 = new Vector();
    public final Vector A09 = new Vector();

    static {
        AnonymousClass1D6[] r2 = new AnonymousClass1D6[5];
        C72463Mc.A1H(AnonymousClass1D6.A01("min", 2), "MIN", r2);
        C108985cd.A1G(AnonymousClass1D6.A01("max", 2), "MAX", r2);
        AnonymousClass1D6.A03(AnonymousClass1D6.A01("log", 2), "LOG", r2, 2);
        C72463Mc.A1J(AnonymousClass1D6.A01("pow", 2), "POW", r2);
        AnonymousClass8BW.A1L(AnonymousClass1D6.A01("mod", 2), "MOD", r2);
        A0A = AnonymousClass1D7.A0B(r2);
    }

    public static final int A01(A92 a92, String str, boolean z) {
        HashMap hashMap = a92.A03;
        if (!hashMap.containsKey(str)) {
            Vector vector = a92.A07;
            vector.add(new A8N());
            int size = vector.size() - 1;
            C17890vO.A0z(str, hashMap, size);
            if (z) {
                a92.A04.add(str);
            }
            return size;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Multiple declarations of symbol ");
        A10.append(str);
        throw C21581AmV.A00(" found in the configuration file.", A10);
    }

    private final int A09(Integer num, int i, int i2) {
        Vector vector = this.A07;
        vector.add(new A8N(num, i, i2));
        return vector.size() - 1;
    }

    private final void A0A(int i) {
        Iterator it = ((AbstractCollection) this.A08.get(i)).iterator();
        while (true) {
            if (it.hasNext()) {
                Number number = (Number) it.next();
                ArrayList arrayList = this.A00;
                if (arrayList == null) {
                    break;
                }
                int A032 = AnonymousClass3MY.A03(number);
                if (!AnonymousClass000.A1Y(arrayList.get(A032))) {
                    A0A(A032);
                }
            } else {
                AnonymousClass1D6 r0 = (AnonymousClass1D6) this.A06.get(i);
                int A042 = AnonymousClass3MZ.A04(r0);
                int A092 = C108955ca.A09(r0);
                ArrayList arrayList2 = this.A01;
                if (arrayList2 != null) {
                    A8N A0C = A0C(A092);
                    ArrayList arrayList3 = this.A01;
                    if (arrayList3 != null) {
                        arrayList2.set(A042, Double.valueOf(A0C.A04(this, arrayList3, A092)));
                        ArrayList arrayList4 = this.A00;
                        if (arrayList4 != null) {
                            arrayList4.set(i, AnonymousClass000.A0i());
                            ArrayList arrayList5 = this.A01;
                            if (arrayList5 != null) {
                                ((Number) AnonymousClass8BS.A0Z(arrayList5, A042)).doubleValue();
                                return;
                            }
                        }
                    }
                }
                C18070vi.A11("outputValues");
            }
        }
        C18070vi.A11("isComputedFeatureEvaluated");
        throw null;
    }

    public final double A0B(String str) {
        String str2;
        HashMap hashMap = this.A03;
        if (hashMap.containsKey(str)) {
            if (!this.A04.contains(str)) {
                ArrayList arrayList = this.A00;
                if (arrayList == null) {
                    str2 = "isComputedFeatureEvaluated";
                    C18070vi.A11(str2);
                    throw null;
                }
                HashMap hashMap2 = this.A02;
                C18070vi.A0d(hashMap2, 0);
                if (!AnonymousClass000.A1Y(AnonymousClass8BS.A0Z(arrayList, AnonymousClass000.A0M(C200510q.A01(str, hashMap2))))) {
                    A0A(AnonymousClass000.A0M(C200510q.A01(str, hashMap2)));
                }
            }
            ArrayList arrayList2 = this.A01;
            if (arrayList2 != null) {
                return AnonymousClass8BR.A00(AnonymousClass8BS.A0Z(arrayList2, AnonymousClass000.A0M(C200510q.A01(str, hashMap))));
            }
            str2 = "outputValues";
            C18070vi.A11(str2);
            throw null;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Symbol ");
        A10.append(str);
        throw C21581AmV.A00(" does not exist.", A10);
    }

    public final A8N A0C(int i) {
        if (i >= 0) {
            Vector vector = this.A07;
            if (i < vector.size()) {
                return (A8N) AnonymousClass8BS.A0Z(vector, i);
            }
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("getNodeByIndex was called with unexpected index=");
        A10.append(i);
        A10.append(", size of allNodes is ");
        throw new C21581AmV(C17880vN.A0t(A10, this.A07.size()));
    }

    public static final int A00(A92 a92, C20053A4z a4z, String str) {
        int A052 = a92.A05(a4z, str);
        while (a4z.A02() == '|') {
            if (C20053A4z.A00(a4z) <= 1 || a4z.A03(1) != '|') {
                StringBuilder A10 = AnonymousClass000.A10();
                C20053A4z.A01(a4z, "Invalid operator found at index ", str, A10);
                throw C21581AmV.A00("'s expression", A10);
            }
            a4z.A04();
            Integer num = AnonymousClass00R.A0C;
            a4z.A04();
            A052 = a92.A09(num, A052, a92.A05(a4z, str));
        }
        return A052;
    }

    private final int A02(C20053A4z a4z, String str) {
        Integer num;
        int A062 = A06(a4z, str);
        while (true) {
            char A022 = a4z.A02();
            if (A022 == '+') {
                num = AnonymousClass00R.A19;
            } else if (A022 != '-') {
                return A062;
            } else {
                num = AnonymousClass00R.A02;
            }
            a4z.A04();
            A062 = A09(num, A062, A06(a4z, str));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005e, code lost:
        throw new X.C21581AmV(r1.toString());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int A03(X.C20053A4z r8, java.lang.String r9) {
        /*
            r7 = this;
            int r6 = r7.A07(r8, r9)
        L_0x0004:
            char r5 = r8.A02()
            java.lang.String r3 = "'s expression"
            java.lang.String r2 = " in "
            r4 = 61
            r1 = 1
            if (r5 != r4) goto L_0x002e
            int r0 = X.C20053A4z.A00(r8)
            if (r0 <= r1) goto L_0x0044
            char r0 = r8.A03(r1)
            if (r0 != r4) goto L_0x0044
            r8.A04()
            java.lang.Integer r1 = X.AnonymousClass00R.A0N
        L_0x0022:
            r8.A04()
            int r0 = r7.A07(r8, r9)
            int r6 = r7.A09(r1, r6, r0)
            goto L_0x0004
        L_0x002e:
            r0 = 33
            if (r5 != r0) goto L_0x007a
            int r0 = X.C20053A4z.A00(r8)
            if (r0 <= r1) goto L_0x005f
            char r0 = r8.A03(r1)
            if (r0 != r4) goto L_0x005f
            r8.A04()
            java.lang.Integer r1 = X.AnonymousClass00R.A0Y
            goto L_0x0022
        L_0x0044:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Invalid operator found at index "
            r1.append(r0)
            int r0 = r8.A00
            r1.append(r0)
            X.C17890vO.A10(r2, r9, r3, r1)
            java.lang.String r1 = r1.toString()
            X.AmV r0 = new X.AmV
            r0.<init>(r1)
            throw r0
        L_0x005f:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Unexpected '!' found at index "
            r1.append(r0)
            int r0 = r8.A00
            r1.append(r0)
            X.C17890vO.A10(r2, r9, r3, r1)
            java.lang.String r1 = r1.toString()
            X.AmV r0 = new X.AmV
            r0.<init>(r1)
            throw r0
        L_0x007a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A92.A03(X.A4z, java.lang.String):int");
    }

    private final int A04(C20053A4z a4z, String str) {
        int length;
        Integer num;
        char A022 = a4z.A02();
        if (A022 == '(') {
            a4z.A04();
            int A002 = A00(this, a4z, str);
            if (a4z.A02() == ')') {
                a4z.A04();
                return A002;
            }
            StringBuilder A10 = AnonymousClass000.A10();
            C20053A4z.A01(a4z, "Unexpected character found at index ", str, A10);
            throw C21581AmV.A00("'s expression. Expected ')'.", A10);
        } else if ('a' > A022 ? 'A' > A022 || (A022 >= '[' && A022 != '_') : A022 >= '{') {
            char A032 = a4z.A03(0);
            if ('0' > A032 || A032 >= ':') {
                StringBuilder A102 = AnonymousClass000.A10();
                A102.append("Unexpected character '");
                A102.append(A022);
                C20053A4z.A01(a4z, "' found at index ", str, A102);
                throw C21581AmV.A00("'s expression", A102);
            }
            String str2 = a4z.A01;
            String A0z = C108955ca.A0z(str2, a4z.A00);
            while (true) {
                length = str2.length();
                if (!AnonymousClass000.A1R(length - a4z.A00)) {
                    break;
                }
                char A033 = a4z.A03(0);
                if ('0' > A033) {
                    if (A033 != '.') {
                        break;
                    }
                } else if (A033 >= ':') {
                    break;
                }
                a4z.A04();
            }
            String A0q = C108955ca.A0q(0, A0z.length() - (length - a4z.A00), A0z);
            try {
                double parseDouble = Double.parseDouble(A0q);
                Vector vector = this.A07;
                vector.add(new A8N(parseDouble));
                return vector.size() - 1;
            } catch (NumberFormatException unused) {
                StringBuilder A103 = AnonymousClass000.A10();
                A103.append("Failed to convert '");
                A103.append(A0q);
                A103.append("' to double in ");
                A103.append(str);
                throw C21581AmV.A00("'s expression", A103);
            }
        } else {
            String str3 = a4z.A01;
            String A0z2 = C108955ca.A0z(str3, a4z.A00);
            while (AnonymousClass000.A1R(str3.length() - a4z.A00)) {
                char A034 = a4z.A03(0);
                char c = '{';
                if ('a' > A034) {
                    if ('A' > A034) {
                        if ('0' > A034) {
                            break;
                        }
                        c = ':';
                    } else {
                        if (A034 >= '[' && A034 != '_') {
                            break;
                        }
                        a4z.A04();
                    }
                }
                if (A034 >= c) {
                    break;
                }
                a4z.A04();
            }
            String A0q2 = C108955ca.A0q(0, A0z2.length() - C108955ca.A0z(str3, a4z.A00).length(), A0z2);
            if (a4z.A02() == '(') {
                a4z.A04();
                ArrayList A13 = AnonymousClass000.A13();
                while (a4z.A02() != ')') {
                    C17890vO.A1D(A13, A00(this, a4z, str));
                    if (a4z.A02() == ',') {
                        a4z.A04();
                        if (a4z.A02() == ')') {
                            StringBuilder A104 = AnonymousClass000.A10();
                            C20053A4z.A01(a4z, "Function argument list ends in comma at index ", str, A104);
                            throw C21581AmV.A00("'s expression", A104);
                        }
                    }
                }
                a4z.A04();
                AnonymousClass1D6 A003 = AnonymousClass1D6.A00(C108975cc.A0d(A0q2), A13.size());
                Map map = A0A;
                if (map.containsKey(A003)) {
                    String str4 = (String) C200510q.A01(A003, map);
                    if (str4.equals("NOT")) {
                        num = AnonymousClass00R.A00;
                    } else if (str4.equals("AND")) {
                        num = AnonymousClass00R.A01;
                    } else if (str4.equals("OR")) {
                        num = AnonymousClass00R.A0C;
                    } else if (str4.equals("EQ")) {
                        num = AnonymousClass00R.A0N;
                    } else if (str4.equals("NE")) {
                        num = AnonymousClass00R.A0Y;
                    } else if (str4.equals("GT")) {
                        num = AnonymousClass00R.A0j;
                    } else if (str4.equals("GE")) {
                        num = AnonymousClass00R.A0u;
                    } else if (str4.equals("LT")) {
                        num = AnonymousClass00R.A15;
                    } else if (str4.equals("LE")) {
                        num = AnonymousClass00R.A18;
                    } else if (str4.equals("ADD")) {
                        num = AnonymousClass00R.A19;
                    } else if (str4.equals("SUB")) {
                        num = AnonymousClass00R.A02;
                    } else if (str4.equals("MUL")) {
                        num = AnonymousClass00R.A03;
                    } else if (str4.equals("DIV")) {
                        num = AnonymousClass00R.A04;
                    } else if (str4.equals("MIN")) {
                        num = AnonymousClass00R.A05;
                    } else if (str4.equals("MAX")) {
                        num = AnonymousClass00R.A06;
                    } else if (str4.equals("LOG")) {
                        num = AnonymousClass00R.A07;
                    } else if (str4.equals("POW")) {
                        num = AnonymousClass00R.A08;
                    } else if (str4.equals("MOD")) {
                        num = AnonymousClass00R.A09;
                    } else if (str4.equals("VALUE")) {
                        num = AnonymousClass00R.A0A;
                    } else if (str4.equals("CONSTANT")) {
                        num = AnonymousClass00R.A0B;
                    } else {
                        throw AnonymousClass000.A0k(str4);
                    }
                    int size = A13.size();
                    if (size == 1) {
                        int A0M = AnonymousClass000.A0M(A13.get(0));
                        Vector vector2 = this.A07;
                        vector2.add(new A8N(A0M, num));
                        return vector2.size() - 1;
                    } else if (size == 2) {
                        return A09(num, AnonymousClass000.A0M(A13.get(0)), AnonymousClass000.A0M(A13.get(1)));
                    } else {
                        StringBuilder A11 = AnonymousClass000.A11(str);
                        A11.append("'s expression contains function call to '");
                        A11.append(A0q2);
                        C17890vO.A14("' with ", A11, A13);
                        throw C21581AmV.A00(" arguments which has been found in the lookup table but the number of arguments is unexpected.", A11);
                    }
                } else {
                    StringBuilder A112 = AnonymousClass000.A11(str);
                    A112.append("'s expression contains an unexpected function call to '");
                    A112.append(A0q2);
                    C17890vO.A14("' with ", A112, A13);
                    throw C21581AmV.A00(" arguments", A112);
                }
            } else if (!C18070vi.A18(str, A0q2)) {
                HashMap hashMap = this.A03;
                if (hashMap.containsKey(A0q2)) {
                    if (this.A04.contains(A0q2)) {
                        this.A05.add(A0q2);
                    } else {
                        HashMap hashMap2 = this.A02;
                        C18070vi.A0d(hashMap2, 0);
                        ((Vector) this.A08.get(AnonymousClass000.A0M(C200510q.A01(str, hashMap2)))).addElement(Integer.valueOf(AnonymousClass000.A0M(C200510q.A01(A0q2, hashMap2))));
                    }
                    return AnonymousClass000.A0M(C200510q.A01(A0q2, hashMap));
                }
                StringBuilder A105 = AnonymousClass000.A10();
                A105.append("Unexpected symbol ");
                A105.append(A0q2);
                A105.append(" found in ");
                A105.append(str);
                throw C21581AmV.A00("'s expression", A105);
            } else {
                throw C21581AmV.A00("'s expression contains itself", AnonymousClass000.A11(str));
            }
        }
    }

    private final int A05(C20053A4z a4z, String str) {
        int A032 = A03(a4z, str);
        while (a4z.A02() == '&') {
            if (C20053A4z.A00(a4z) <= 1 || a4z.A03(1) != '&') {
                StringBuilder A10 = AnonymousClass000.A10();
                C20053A4z.A01(a4z, "Invalid operator found at index ", str, A10);
                throw C21581AmV.A00("'s expression", A10);
            }
            a4z.A04();
            Integer num = AnonymousClass00R.A01;
            a4z.A04();
            A032 = A09(num, A032, A03(a4z, str));
        }
        return A032;
    }

    private final int A06(C20053A4z a4z, String str) {
        Integer num;
        int A082 = A08(a4z, str);
        while (true) {
            char A022 = a4z.A02();
            if (A022 == '*') {
                num = AnonymousClass00R.A03;
            } else if (A022 != '/') {
                return A082;
            } else {
                num = AnonymousClass00R.A04;
            }
            a4z.A04();
            A082 = A09(num, A082, A08(a4z, str));
        }
    }

    private final int A07(C20053A4z a4z, String str) {
        Integer num;
        int A022 = A02(a4z, str);
        while (true) {
            char A023 = a4z.A02();
            if (A023 == '>') {
                if (C20053A4z.A00(a4z) <= 1 || a4z.A03(1) != '=') {
                    num = AnonymousClass00R.A0j;
                } else {
                    a4z.A04();
                    num = AnonymousClass00R.A0u;
                }
            } else if (A023 != '<') {
                return A022;
            } else {
                if (C20053A4z.A00(a4z) <= 1 || a4z.A03(1) != '=') {
                    num = AnonymousClass00R.A15;
                } else {
                    a4z.A04();
                    num = AnonymousClass00R.A18;
                }
            }
            a4z.A04();
            A022 = A09(num, A022, A02(a4z, str));
        }
    }

    private final int A08(C20053A4z a4z, String str) {
        if (a4z.A02() != '!') {
            return A04(a4z, str);
        }
        a4z.A04();
        int A042 = A04(a4z, str);
        Integer num = AnonymousClass00R.A00;
        Vector vector = this.A07;
        vector.add(new A8N(A042, num));
        return vector.size() - 1;
    }
}
