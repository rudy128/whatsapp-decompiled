package X;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.Cca  reason: case insensitive filesystem */
public abstract class C25278Cca {
    public int A00 = -1;
    public C25278Cca A01;
    public C25278Cca A02;
    public Boolean A03 = null;
    public Boolean A04 = null;

    /* JADX WARNING: type inference failed for: r2v3, types: [X.Boo, X.DSB, java.lang.Object] */
    public void A04(C25812CmP cmP, Object obj, String str, int i) {
        DSB dsb;
        String A022 = C25888Cnz.A02(str, "[", String.valueOf(i), "]");
        if (cmP.A07) {
            ? obj2 = new Object();
            obj2.A00 = obj;
            obj2.A00 = i;
            dsb = obj2;
        } else {
            dsb = DSB.A01;
        }
        if (i < 0) {
            i += cmP.A01.A00.BhV(obj);
        }
        try {
            Object obj3 = ((List) obj).get(i);
            if (this.A01 == null) {
                cmP.A02(dsb, obj3, A022);
            } else {
                A01().A03(dsb, cmP, obj3, A022);
            }
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    public C25278Cca A01() {
        C25278Cca cca = this.A01;
        if (cca != null) {
            return cca;
        }
        throw AnonymousClass000.A0n("Current path token is a leaf");
    }

    public String A02() {
        if (this instanceof C23768BpD) {
            return "[*]";
        }
        if (this instanceof C23773BpI) {
            return "..";
        }
        if (this instanceof C23771BpG) {
            return ((C23771BpG) this).A02;
        }
        if (this instanceof C23769BpE) {
            C23769BpE bpE = (C23769BpE) this;
            return BEA.A0m(C25888Cnz.A00(bpE.A01, ",", bpE.A00), BE9.A0q());
        } else if (this instanceof C23772BpH) {
            C23772BpH bpH = (C23772BpH) this;
            StringBuilder A0q = BE9.A0q();
            for (int i = 0; i < bpH.A00.size(); i++) {
                if (i != 0) {
                    BE6.A1K(A0q);
                }
                A0q.append("?");
            }
            return AnonymousClass000.A0z(A0q);
        } else if (this instanceof C23770BpF) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append(".");
            return AnonymousClass000.A0y(((C23770BpF) this).A02, A10);
        } else if (this instanceof C23766BpB) {
            return ((C23766BpB) this).A00.toString();
        } else {
            return ((C23765BpA) this).A00.toString();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: X.E6N} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v6, resolved type: X.E6N} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v7, resolved type: X.DOS} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v8, resolved type: X.E6N} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v9, resolved type: X.DOR} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v10, resolved type: X.DOT} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(X.DSB r17, X.C25812CmP r18, java.lang.Object r19, java.lang.String r20) {
        /*
            r16 = this;
            r10 = r17
            r3 = r16
            boolean r0 = r3 instanceof X.C23768BpD
            r11 = r18
            r14 = r19
            r15 = r20
            if (r0 == 0) goto L_0x004e
            X.Ck0 r6 = r11.A01
            X.EBZ r5 = r6.A00
            boolean r0 = r14 instanceof java.util.Map
            if (r0 == 0) goto L_0x0030
            java.util.Set r0 = r5.BXg(r14)
            java.util.Iterator r1 = r0.iterator()
        L_0x001e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0062
            java.lang.Object r0 = r1.next()
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r3.A05(r11, r14, r15, r0)
            goto L_0x001e
        L_0x0030:
            boolean r0 = r14 instanceof java.util.List
            if (r0 == 0) goto L_0x0062
            r4 = 0
        L_0x0035:
            int r0 = r5.BhV(r14)
            if (r4 >= r0) goto L_0x0062
            r3.A04(r11, r14, r15, r4)     // Catch:{ Boi -> 0x003f }
            goto L_0x004b
        L_0x003f:
            r2 = move-exception
            java.util.Set r1 = r6.A03
            X.Byk r0 = X.C24287Byk.REQUIRE_PROPERTIES
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x004b
            throw r2
        L_0x004b:
            int r4 = r4 + 1
            goto L_0x0035
        L_0x004e:
            boolean r0 = r3 instanceof X.C23773BpI
            if (r0 == 0) goto L_0x0084
            X.Cca r12 = r3.A01()
            boolean r0 = r12 instanceof X.C23769BpE
            if (r0 == 0) goto L_0x0063
            X.DOT r13 = new X.DOT
            r13.<init>(r11, r12)
        L_0x005f:
            X.C23773BpI.A00(r10, r11, r12, r13, r14, r15)
        L_0x0062:
            return
        L_0x0063:
            boolean r0 = r12 instanceof X.C23767BpC
            if (r0 == 0) goto L_0x006d
            X.DOR r13 = new X.DOR
            r13.<init>(r11)
            goto L_0x005f
        L_0x006d:
            boolean r0 = r12 instanceof X.C23768BpD
            if (r0 == 0) goto L_0x0077
            X.DOQ r13 = new X.DOQ
            r13.<init>()
            goto L_0x005f
        L_0x0077:
            boolean r0 = r12 instanceof X.C23772BpH
            if (r0 == 0) goto L_0x0081
            X.DOS r13 = new X.DOS
            r13.<init>(r11, r12)
            goto L_0x005f
        L_0x0081:
            X.E6N r13 = X.C23773BpI.A00
            goto L_0x005f
        L_0x0084:
            boolean r0 = r3 instanceof X.C23771BpG
            if (r0 == 0) goto L_0x009a
            X.BpG r3 = (X.C23771BpG) r3
            X.Cca r0 = r3.A01
            if (r0 != 0) goto L_0x02bd
            boolean r0 = r11.A07
            if (r0 != 0) goto L_0x0094
            X.DSB r10 = X.DSB.A01
        L_0x0094:
            java.lang.String r0 = r3.A02
            r11.A02(r10, r14, r0)
            return
        L_0x009a:
            boolean r0 = r3 instanceof X.C23769BpE
            if (r0 == 0) goto L_0x0118
            X.BpE r3 = (X.C23769BpE) r3
            X.Ck0 r1 = r11.A01
            X.EBZ r6 = r1.A00
            boolean r0 = r14 instanceof java.util.Map
            r4 = 0
            r5 = 1
            if (r0 != 0) goto L_0x00e5
            boolean r0 = r3.A08()
            if (r0 == 0) goto L_0x0062
            java.util.Set r1 = r1.A03
            X.Byk r0 = X.C24287Byk.SUPPRESS_EXCEPTIONS
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0062
            if (r19 != 0) goto L_0x00e0
            java.lang.String r1 = "null"
        L_0x00be:
            java.lang.Object[] r2 = X.BE6.A1a()
            java.lang.String r0 = r3.A02()
            r2[r4] = r0
            r2[r5] = r20
            r0 = 2
            r2[r0] = r1
            java.lang.String r1 = X.C17890vO.A0U(r6)
            r0 = 3
            r2[r0] = r1
            java.lang.String r0 = "Expected to find an object with property %s in path %s but found '%s'. This is not a json object according to the JsonProvider: '%s'."
            java.lang.String r1 = java.lang.String.format(r0, r2)
            X.Boi r0 = new X.Boi
            r0.<init>(r1)
            throw r0
        L_0x00e0:
            java.lang.String r1 = X.C17890vO.A0U(r14)
            goto L_0x00be
        L_0x00e5:
            java.util.List r1 = r3.A01
            int r0 = r1.size()
            if (r0 == r5) goto L_0x00f7
            X.Cca r0 = r3.A01
            if (r0 != 0) goto L_0x00fb
            int r0 = r1.size()
            if (r0 <= r5) goto L_0x00fb
        L_0x00f7:
            r3.A05(r11, r14, r15, r1)
            return
        L_0x00fb:
            java.util.ArrayList r2 = X.C17880vN.A0z(r5)
            r0 = 0
            r2.add(r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x0107:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0062
            java.lang.Object r0 = r1.next()
            r2.set(r4, r0)
            r3.A05(r11, r14, r15, r2)
            goto L_0x0107
        L_0x0118:
            boolean r0 = r3 instanceof X.C23772BpH
            if (r0 == 0) goto L_0x017d
            X.BpH r3 = (X.C23772BpH) r3
            X.Ck0 r5 = r11.A01
            X.EBZ r1 = r5.A00
            boolean r0 = r14 instanceof java.util.Map
            if (r0 == 0) goto L_0x013c
            java.lang.Object r0 = r11.A04
            boolean r0 = r3.A09(r5, r11, r14, r0)
            if (r0 == 0) goto L_0x0062
            boolean r0 = r11.A07
            if (r0 != 0) goto L_0x0134
            X.DSB r10 = X.DSB.A01
        L_0x0134:
            X.Cca r0 = r3.A01
            if (r0 != 0) goto L_0x02c7
            r11.A02(r10, r14, r15)
            return
        L_0x013c:
            boolean r0 = r14 instanceof java.util.List
            r4 = 0
            if (r0 == 0) goto L_0x0161
            java.lang.Iterable r0 = r1.CPI(r14)
            java.util.Iterator r2 = r0.iterator()
        L_0x0149:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0062
            java.lang.Object r1 = r2.next()
            java.lang.Object r0 = r11.A04
            boolean r0 = r3.A09(r5, r11, r1, r0)
            if (r0 == 0) goto L_0x015e
            r3.A04(r11, r14, r15, r4)
        L_0x015e:
            int r4 = r4 + 1
            goto L_0x0149
        L_0x0161:
            boolean r0 = r3.A08()
            if (r0 == 0) goto L_0x0062
            java.lang.Object[] r1 = X.AnonymousClass3MW.A1b()
            java.lang.String r0 = r3.toString()
            X.AnonymousClass8BS.A1B(r0, r14, r1)
            java.lang.String r0 = "Filter: %s can not be applied to primitives. Current context is: %s"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            X.Bom r0 = X.C23741Bom.A00(r0)
            throw r0
        L_0x017d:
            boolean r0 = r3 instanceof X.C23770BpF
            if (r0 == 0) goto L_0x020a
            X.BpF r3 = (X.C23770BpF) r3
            java.lang.String r4 = r3.A01
            java.util.Map r0 = X.CFz.A00
            java.lang.Object r0 = r0.get(r4)
            java.lang.Class r0 = (java.lang.Class) r0
            if (r0 == 0) goto L_0x02e8
            java.lang.Object r5 = r0.newInstance()     // Catch:{ Exception -> 0x02cf }
            X.E6L r5 = (X.E6L) r5     // Catch:{ Exception -> 0x02cf }
            java.util.List r0 = r3.A00
            if (r0 == 0) goto L_0x01eb
            java.util.Iterator r9 = r0.iterator()
        L_0x019d:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x01eb
            java.lang.Object r6 = r9.next()
            X.CiO r6 = (X.C25584CiO) r6
            java.lang.Integer r0 = r6.A03
            int r1 = r0.intValue()
            r7 = 1
            if (r1 == r7) goto L_0x01cf
            r0 = 0
            if (r1 != r0) goto L_0x019d
            java.lang.Boolean r0 = r6.A02
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x019d
            X.Ck0 r0 = r11.A01
            X.EBZ r0 = r0.A00
            X.DON r2 = new X.DON
            r2.<init>(r6, r0)
        L_0x01c6:
            r6.A00 = r2
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            r6.A02 = r0
            goto L_0x019d
        L_0x01cf:
            X.CYQ r8 = r6.A01
            java.lang.Object r1 = r11.A04
            X.Ck0 r0 = r11.A01
            X.DOO r2 = new X.DOO
            r2.<init>(r0, r8, r1)
            java.lang.Boolean r0 = r6.A02
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x01c6
            X.E6M r0 = r6.A00
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x019d
            goto L_0x01c6
        L_0x01eb:
            java.util.List r0 = r3.A00
            java.lang.Object r2 = r5.Bdr(r11, r14, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r15)
            java.lang.String r0 = "."
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r4, r1)
            r11.A02(r10, r2, r0)
            X.Cca r0 = r3.A01
            if (r0 == 0) goto L_0x0062
            X.Cca r0 = r3.A01()
            r0.A03(r10, r11, r2, r15)
            return
        L_0x020a:
            boolean r0 = r3 instanceof X.C23766BpB
            if (r0 == 0) goto L_0x028f
            X.BpB r3 = (X.C23766BpB) r3
            boolean r0 = r3.A09(r11, r14, r15)
            if (r0 == 0) goto L_0x0062
            X.CWJ r4 = r3.A00
            java.lang.Integer r0 = r4.A01
            int r5 = r0.intValue()
            r2 = 0
            if (r5 == r2) goto L_0x026a
            r1 = 2
            X.Ck0 r0 = r11.A01
            X.EBZ r0 = r0.A00
            if (r5 == r1) goto L_0x0247
            int r1 = r0.BhV(r14)
            if (r1 == 0) goto L_0x0062
            java.lang.Integer r0 = r4.A02
            int r0 = r0.intValue()
            if (r0 >= 0) goto L_0x0237
            int r0 = r0 + r1
        L_0x0237:
            int r1 = java.lang.Math.min(r1, r0)
            r0 = 0
            r3.toString()
        L_0x023f:
            if (r0 >= r1) goto L_0x0062
            r3.A04(r11, r14, r15, r0)
            int r0 = r0 + 1
            goto L_0x023f
        L_0x0247:
            int r2 = r0.BhV(r14)
            java.lang.Integer r0 = r4.A00
            int r1 = r0.intValue()
            java.lang.Integer r0 = r4.A02
            int r0 = r0.intValue()
            int r0 = java.lang.Math.min(r2, r0)
            if (r1 >= r0) goto L_0x0062
            if (r2 == 0) goto L_0x0062
            r3.toString()
        L_0x0262:
            if (r1 >= r0) goto L_0x0062
            r3.A04(r11, r14, r15, r1)
            int r1 = r1 + 1
            goto L_0x0262
        L_0x026a:
            X.Ck0 r0 = r11.A01
            X.EBZ r0 = r0.A00
            int r1 = r0.BhV(r14)
            java.lang.Integer r0 = r4.A00
            int r0 = r0.intValue()
            if (r0 >= 0) goto L_0x027b
            int r0 = r0 + r1
        L_0x027b:
            int r0 = java.lang.Math.max(r2, r0)
            r3.toString()
            if (r1 == 0) goto L_0x0062
            if (r0 < r1) goto L_0x0287
            return
        L_0x0287:
            if (r0 >= r1) goto L_0x0062
            r3.A04(r11, r14, r15, r0)
            int r0 = r0 + 1
            goto L_0x0287
        L_0x028f:
            X.BpA r3 = (X.C23765BpA) r3
            boolean r0 = r3.A09(r11, r14, r15)
            if (r0 == 0) goto L_0x0062
            X.CjU r0 = r3.A00
            java.util.List r2 = r0.A00
            int r1 = r2.size()
            r0 = 1
            if (r1 != r0) goto L_0x02ab
            r0 = 0
            int r0 = X.AnonymousClass001.A0n(r2, r0)
            r3.A04(r11, r14, r15, r0)
            return
        L_0x02ab:
            java.util.Iterator r1 = r2.iterator()
        L_0x02af:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0062
            int r0 = X.C72453Mb.A0H(r1)
            r3.A04(r11, r14, r15, r0)
            goto L_0x02af
        L_0x02bd:
            X.Cca r1 = r3.A01()
            java.lang.String r0 = r3.A02
            r1.A03(r10, r11, r14, r0)
            return
        L_0x02c7:
            X.Cca r0 = r3.A01()
            r0.A03(r10, r11, r14, r15)
            return
        L_0x02cf:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Function of name: "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " cannot be created"
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)
            X.Bom r0 = new X.Bom
            r0.<init>(r1, r2)
            throw r0
        L_0x02e8:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Function with name: "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " does not exist."
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            X.Bom r0 = X.C23741Bom.A00(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25278Cca.A03(X.DSB, X.CmP, java.lang.Object, java.lang.String):void");
    }

    public boolean A06() {
        C25278Cca cca;
        Boolean bool = this.A03;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean A07 = A07();
        if (A07 && (cca = this.A01) != null) {
            A07 = cca.A06();
        }
        this.A03 = Boolean.valueOf(A07);
        return A07;
    }

    public boolean A07() {
        if ((this instanceof C23768BpD) || (this instanceof C23773BpI)) {
            return false;
        }
        if (this instanceof C23771BpG) {
            return true;
        }
        if (this instanceof C23769BpE) {
            C23769BpE bpE = (C23769BpE) this;
            List list = bpE.A01;
            if (list.size() == 1) {
                return true;
            }
            if (bpE.A01 != null || list.size() <= 1) {
                return false;
            }
            return true;
        } else if (this instanceof C23772BpH) {
            return false;
        } else {
            if (this instanceof C23770BpF) {
                return true;
            }
            if (!(this instanceof C23766BpB)) {
                return C17890vO.A1R(((C23765BpA) this).A00.A00.size());
            }
            return false;
        }
    }

    public boolean A08() {
        boolean z;
        Boolean bool = this.A04;
        if (bool == null) {
            C25278Cca cca = this.A02;
            if (cca == null || (cca.A07() && this.A02.A08())) {
                z = true;
            } else {
                z = false;
            }
            bool = Boolean.valueOf(z);
            this.A04 = bool;
        }
        return bool.booleanValue();
    }

    public String toString() {
        if (this.A01 == null) {
            return A02();
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(A02());
        AnonymousClass8BS.A1D(A01(), A10);
        return A10.toString();
    }

    /* JADX WARNING: type inference failed for: r0v10, types: [X.DSB, X.Bop, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v4, types: [X.Boq, X.DSB, java.lang.Object] */
    public void A05(C25812CmP cmP, Object obj, String str, List list) {
        DSB dsb;
        Object obj2;
        Object obj3;
        DSB dsb2;
        Object obj4 = null;
        if (list.size() == 1) {
            String A0w = C17880vN.A0w(list, 0);
            String A022 = C25888Cnz.A02(str, "['", A0w, "']");
            Map map = (Map) obj;
            if (!map.containsKey(A0w)) {
                obj3 = EBZ.A00;
            } else {
                obj3 = map.get(A0w);
            }
            if (obj3 != EBZ.A00) {
                obj4 = obj3;
            } else if (this.A01 == null) {
                Set set = cmP.A01.A03;
                if (!set.contains(C24287Byk.DEFAULT_PATH_LEAF_TO_NULL)) {
                    if (!set.contains(C24287Byk.SUPPRESS_EXCEPTIONS) && set.contains(C24287Byk.REQUIRE_PROPERTIES)) {
                        throw new C23737Boi(AnonymousClass001.A1H("No results for path: ", A022, AnonymousClass000.A10()));
                    }
                    return;
                }
            } else if (((A08() && A07()) || cmP.A01.A03.contains(C24287Byk.REQUIRE_PROPERTIES)) && !cmP.A01.A03.contains(C24287Byk.SUPPRESS_EXCEPTIONS)) {
                throw new C23737Boi(C17900vP.A0A("Missing property in path ", A022));
            } else {
                return;
            }
            if (cmP.A07) {
                ? obj5 = new Object();
                obj5.A00 = obj;
                obj5.A00 = A0w;
                dsb2 = obj5;
            } else {
                dsb2 = DSB.A01;
            }
            if (this.A01 == null) {
                String A1H = AnonymousClass001.A1H(String.valueOf(this.A00), "]", AnonymousClass000.A11("["));
                if (A1H.equals("[-1]") || cmP.A02.A00.A01.A02.A02().equals(A1H)) {
                    cmP.A02(dsb2, obj4, A022);
                    return;
                }
                return;
            }
            A01().A03(dsb2, cmP, obj4, A022);
            return;
        }
        String A1H2 = AnonymousClass001.A1H(C25888Cnz.A00(list, ", ", "'"), "]", AnonymousClass8BW.A0o(str, "["));
        C25670Ck0 ck0 = cmP.A01;
        EBZ ebz = ck0.A00;
        Object A023 = ((DOV) ebz).A00.A02();
        for (Object next : list) {
            if (ebz.BXg(obj).contains(next)) {
                Map map2 = (Map) obj;
                if (!map2.containsKey(next)) {
                    obj2 = EBZ.A00;
                } else {
                    obj2 = map2.get(next);
                }
                if (obj2 == EBZ.A00) {
                    if (!ck0.A03.contains(C24287Byk.DEFAULT_PATH_LEAF_TO_NULL)) {
                    }
                }
                ebz.CKG(A023, next, obj2);
            } else {
                Set set2 = ck0.A03;
                if (!set2.contains(C24287Byk.DEFAULT_PATH_LEAF_TO_NULL)) {
                    if (set2.contains(C24287Byk.REQUIRE_PROPERTIES)) {
                        throw new C23737Boi(C17900vP.A0A("Missing property in path ", A1H2));
                    }
                }
            }
            obj2 = null;
            ebz.CKG(A023, next, obj2);
        }
        if (cmP.A07) {
            ? obj6 = new Object();
            obj6.A00 = obj;
            obj6.A00 = list;
            dsb = obj6;
        } else {
            dsb = DSB.A01;
        }
        cmP.A02(dsb, A023, A1H2);
    }

    public int hashCode() {
        return toString().hashCode();
    }
}
