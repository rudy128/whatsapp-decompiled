package X;

/* renamed from: X.Aiu  reason: case insensitive filesystem */
public class C21365Aiu implements Runnable {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C21365Aiu(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.A00 = i2;
        this.A01 = i;
        this.A02 = obj;
        this.A03 = obj2;
        this.A04 = obj3;
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v357, resolved type: X.2cz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v358, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v389, resolved type: X.2cz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v390, resolved type: X.2cz} */
    /* JADX WARNING: type inference failed for: r3v110, types: [java.lang.Object, X.9gW] */
    /* JADX WARNING: type inference failed for: r13v8, types: [X.9Zl, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v269, types: [java.lang.Object, X.9hV] */
    /* JADX WARNING: type inference failed for: r8v34, types: [java.lang.Object, X.9gV] */
    /* JADX WARNING: type inference failed for: r11v18, types: [X.9Uf, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v37, types: [java.lang.Object, X.9gV] */
    /* JADX WARNING: type inference failed for: r8v53, types: [java.lang.Object, X.4rF] */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:381|(1:383)(1:384)|385|386|387|388|389|390|(2:391|(18:393|(1:395)(2:423|(1:425)(3:426|(2:428|1109)(1:1108)|1105))|396|(1:398)(1:399)|400|(1:402)(1:403)|404|(1:406)(1:407)|408|(1:410)|411|(1:413)|414|(1:416)|417|(1:419)|420|(3:422|1107|1105)(2:1066|705))(7:1106|429|(1:431)|432|(1:434)|435|(1:437)(2:1068|661)))) */
    /* JADX WARNING: Code restructure failed: missing block: B:1020:0x1b69, code lost:
        if (r1.length() == 0) goto L_0x1b6b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1025:0x1b9c, code lost:
        r2.A0J(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1026:0x1b9f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1034:0x1bc2, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1035:0x1bc6, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0483, code lost:
        if (r3 != 4) goto L_0x0485;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:799:0x14d4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:801:?, code lost:
        X.CDX.A00(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:802:0x14d8, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:934:0x1a22, code lost:
        r5.notifyAllObservers(new X.AnonymousClass7KV(r3, r4, r1, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:935:0x1a2a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:946:0x1a70, code lost:
        if (r6.A0x != r14) goto L_0x1a73;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:388:0x0bd7 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:707:0x1253 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:1063:0x1034 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:1067:0x125f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:1111:0x0fdf A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:1164:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x048b  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x07ec A[Catch:{ all -> 0x1200, all -> 0x123b }] */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x083a A[Catch:{ all -> 0x122f }] */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x086c A[Catch:{ all -> 0x1200, all -> 0x123b }] */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x08c9 A[Catch:{ 3ER -> 0x1253 }] */
    /* JADX WARNING: Removed duplicated region for block: B:552:0x0fa6 A[Catch:{ all -> 0x0fda, IOException -> 0x1019 }] */
    /* JADX WARNING: Removed duplicated region for block: B:581:0x0fe5 A[Catch:{ all -> 0x0fda, IOException -> 0x1019 }] */
    /* JADX WARNING: Removed duplicated region for block: B:582:0x0fef A[Catch:{ all -> 0x0fda, IOException -> 0x1019 }] */
    /* JADX WARNING: Removed duplicated region for block: B:601:0x103d A[Catch:{ 3ER -> 0x1253 }] */
    /* JADX WARNING: Removed duplicated region for block: B:970:0x1ab9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r44 = this;
            r0 = r44
            int r1 = r0.A00
            switch(r1) {
                case 0: goto L_0x0691;
                case 1: goto L_0x1268;
                case 2: goto L_0x12b3;
                case 3: goto L_0x0019;
                case 4: goto L_0x010c;
                case 5: goto L_0x031a;
                case 6: goto L_0x1573;
                case 7: goto L_0x158e;
                case 8: goto L_0x15e0;
                case 9: goto L_0x15f7;
                case 10: goto L_0x162c;
                case 11: goto L_0x1663;
                case 12: goto L_0x16a2;
                case 13: goto L_0x16ed;
                case 14: goto L_0x16ff;
                case 15: goto L_0x0343;
                case 16: goto L_0x1731;
                case 17: goto L_0x1761;
                case 18: goto L_0x1783;
                case 19: goto L_0x17a6;
                case 20: goto L_0x17bc;
                case 21: goto L_0x03b3;
                case 22: goto L_0x17ce;
                case 23: goto L_0x17e2;
                case 24: goto L_0x17f4;
                case 25: goto L_0x0402;
                case 26: goto L_0x187a;
                case 27: goto L_0x04a6;
                case 28: goto L_0x04cf;
                case 29: goto L_0x04cf;
                case 30: goto L_0x1907;
                case 31: goto L_0x0533;
                case 32: goto L_0x1931;
                case 33: goto L_0x1959;
                case 34: goto L_0x196b;
                case 35: goto L_0x056c;
                case 36: goto L_0x1984;
                case 37: goto L_0x19ed;
                case 38: goto L_0x0007;
                case 39: goto L_0x0007;
                case 40: goto L_0x0007;
                case 41: goto L_0x058d;
                case 42: goto L_0x19ff;
                case 43: goto L_0x1a0b;
                case 44: goto L_0x1a17;
                case 45: goto L_0x05f2;
                case 46: goto L_0x1a2b;
                case 47: goto L_0x1b41;
                case 48: goto L_0x1b75;
                case 49: goto L_0x1ba0;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r3 = r0.A02
            X.1gO r3 = (X.C31951gO) r3
            java.lang.Object r2 = r0.A03
            java.lang.Object r1 = r0.A04
            X.2nR r1 = (X.C60132nR) r1
            r0 = 2
            X.C18070vi.A0d(r2, r0)
            X.C31951gO.A00(r3, r1, r2)
        L_0x0018:
            return
        L_0x0019:
            java.lang.Object r2 = r0.A02
            X.A5M r2 = (X.A5M) r2
            java.lang.Object r3 = r0.A03
            X.206 r3 = (X.AnonymousClass206) r3
            int r10 = r0.A01
            java.lang.Object r12 = r0.A04
            X.1BI r12 = (X.AnonymousClass1BI) r12
            X.00H r4 = r2.A0H
            X.A8x r1 = X.AnonymousClass8BR.A0K(r4)
            X.205 r11 = r3.A0v
            X.C18070vi.A0W(r11)
            X.1BI r0 = r11.A00
            if (r0 == 0) goto L_0x0018
            boolean r0 = r1.A0O(r0)
            if (r0 == 0) goto L_0x0018
            X.0ve r5 = r1.A07
            r1 = 7557(0x1d85, float:1.059E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r5, r1)
            if (r0 == 0) goto L_0x0018
            X.A8x r0 = X.AnonymousClass8BR.A0K(r4)
            boolean r0 = r0.A0R(r11)
            if (r0 != 0) goto L_0x0079
            r4.get()
            r0 = 3
            java.lang.Integer[] r1 = new java.lang.Integer[r0]
            r0 = 8
            X.AnonymousClass000.A1L(r1, r0)
            r0 = 9
            X.AnonymousClass000.A1M(r1, r0)
            r0 = 10
            X.AnonymousClass3Ma.A1S(r1, r0)
            java.util.List r1 = java.util.Arrays.asList(r1)
            X.C18070vi.A0X(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0079
            return
        L_0x0079:
            X.1M9 r0 = r2.A02
            X.1E7 r1 = r0.A0E(r12)
            if (r1 == 0) goto L_0x0018
            int r16 = X.C20136A8x.A01(r1, r4)
            int r15 = X.C20136A8x.A02(r12, r4)
            X.A8x r0 = X.AnonymousClass8BR.A0K(r4)
            java.lang.String r9 = r0.A0I(r1)
            r4.get()
            int r0 = r3.A0u
            java.lang.String r8 = X.C20136A8x.A07(r0)
            X.A8x r0 = X.AnonymousClass8BR.A0K(r4)
            java.lang.Integer r7 = r0.A0G(r3)
            r4.get()
            java.lang.String r6 = X.C20136A8x.A08(r3)
            long r0 = X.C20136A8x.A04(r4)
            java.lang.Long r5 = X.C20136A8x.A06(r3, r0)
            long r0 = X.C20136A8x.A04(r4)
            long r13 = X.C20136A8x.A03(r3, r0)
            X.A8x r0 = X.AnonymousClass8BR.A0K(r4)
            java.lang.String r12 = r0.A0J(r12)
            X.1Rb r1 = r2.A0A
            java.lang.String r0 = r11.A01
            java.lang.String r11 = r1.A04(r0)
            X.A8x r0 = X.AnonymousClass8BR.A0K(r4)
            java.lang.Integer r4 = r0.A0H(r3)
            X.00H r0 = r2.A0G
            java.lang.Object r3 = r0.get()
            X.9eK r3 = (X.C186519eK) r3
            java.lang.Long r2 = java.lang.Long.valueOf(r13)
            X.8rw r1 = new X.8rw
            r1.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            r1.A00 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)
            r1.A02 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)
            r1.A01 = r0
            r1.A05 = r5
            r1.A06 = r2
            r1.A0A = r8
            r1.A0B = r9
            r1.A03 = r7
            r1.A08 = r6
            r1.A07 = r12
            r1.A09 = r11
            r1.A04 = r4
            X.00H r0 = r3.A03
            X.C20136A8x.A09(r1, r0)
            return
        L_0x010c:
            java.lang.Object r10 = r0.A02
            X.A5M r10 = (X.A5M) r10
            int r9 = r0.A01
            java.lang.Object r8 = r0.A03
            java.util.Collection r8 = (java.util.Collection) r8
            java.lang.Object r7 = r0.A04
            java.lang.Integer r7 = (java.lang.Integer) r7
            X.00H r0 = r10.A0H
            X.A8x r0 = X.AnonymousClass8BR.A0K(r0)
            X.11S r0 = r0.A00
            boolean r0 = r0.A0N()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0018
            r0 = 15
            if (r9 == r0) goto L_0x0268
            X.00H r0 = r10.A0F
            java.lang.Object r6 = r0.get()
            X.9g5 r6 = (X.C187609g5) r6
            X.1Nb r11 = r10.A0C
            if (r8 == 0) goto L_0x0268
            java.util.Iterator r13 = r8.iterator()
        L_0x013e:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0268
            X.206 r5 = X.C17880vN.A0Y(r13)
            X.205 r0 = r5.A0v
            X.1BI r4 = r0.A00
            if (r4 == 0) goto L_0x013e
            X.1M9 r0 = r6.A02
            X.1E7 r12 = r0.A0E(r4)
            if (r12 == 0) goto L_0x013e
            X.00H r3 = r6.A05
            int r1 = X.C20136A8x.A01(r12, r3)
            r3.get()
            r0 = 1
            if (r1 == r0) goto L_0x013e
            X.A8x r0 = X.AnonymousClass8BR.A0K(r3)
            boolean r0 = r0.A0Q(r5, r1)
            if (r0 == 0) goto L_0x013e
            X.8sA r2 = new X.8sA
            r2.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            r2.A07 = r0
            java.lang.Long r0 = X.C20136A8x.A05(r4, r3)
            r2.A0E = r0
            java.lang.Long r0 = X.C88244Yx.A02(r12)
            r2.A0B = r0
            X.A8x r0 = X.AnonymousClass8BR.A0K(r3)
            java.lang.String r0 = r0.A0J(r4)
            r2.A0G = r0
            X.A8x r0 = X.AnonymousClass8BR.A0K(r3)
            java.lang.Integer r0 = r0.A0E(r4)
            r2.A09 = r0
            X.A8x r0 = X.AnonymousClass8BR.A0K(r3)
            java.lang.String r0 = r0.A0L(r5)
            r2.A0I = r0
            long r0 = X.C20136A8x.A04(r3)
            java.lang.Long r0 = X.C20136A8x.A06(r5, r0)
            r2.A0C = r0
            X.A8x r0 = X.AnonymousClass8BR.A0K(r3)
            java.lang.Integer r0 = r0.A0G(r5)
            r2.A08 = r0
            X.A8x r0 = X.AnonymousClass8BR.A0K(r3)
            X.1CJ r0 = r0.A04
            boolean r0 = r0.A0Q(r4)
            int r0 = X.C72453Mb.A03(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A05 = r0
            r3.get()
            java.lang.String r0 = X.C20136A8x.A08(r5)
            r2.A0H = r0
            r3.get()
            X.1yf r1 = r12.A0G
            r0 = 0
            if (r1 == 0) goto L_0x01e2
            boolean r0 = r1.A01()
            boolean r0 = X.C108975cc.A1B(r0)
        L_0x01e2:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A01 = r0
            X.AcA r0 = X.AnonymousClass9RV.A00(r5)
            if (r0 == 0) goto L_0x0266
            boolean r0 = r0.A02
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x01f4:
            r2.A00 = r0
            long r0 = X.C20136A8x.A04(r3)
            long r0 = X.C20136A8x.A03(r5, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0D = r0
            int r0 = X.C20136A8x.A01(r12, r3)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A06 = r0
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = r5.A0I
            java.lang.Long r0 = X.AnonymousClass8BT.A0p(r12, r0)
            r2.A0A = r0
            X.A8x r0 = X.AnonymousClass8BR.A0K(r3)
            java.lang.Boolean r0 = r0.A0C(r5)
            r2.A03 = r0
            long r0 = r5.A0G
            java.lang.Long r0 = X.AnonymousClass8BT.A0p(r12, r0)
            r2.A0F = r0
            boolean r0 = r11.A0x(r4)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A02 = r0
            X.A8x r1 = X.AnonymousClass8BR.A0K(r3)
            X.1N5 r0 = r6.A04
            boolean r0 = r0.A04(r4)
            java.lang.Boolean r0 = r1.A0D(r0)
            r2.A04 = r0
            X.A8x r3 = X.AnonymousClass8BR.A0K(r3)
            X.18K r0 = r3.A08
            r0.CC7(r2)
            java.lang.Integer r0 = r3.A0F(r5)
            if (r0 == 0) goto L_0x013e
            int r1 = r0.intValue()
            r0 = 3
            if (r1 != r0) goto L_0x013e
            boolean r0 = r3.A0P(r5)
            if (r0 == 0) goto L_0x013e
            r0 = 1
            r3.A0M(r0)
            goto L_0x013e
        L_0x0266:
            r0 = 0
            goto L_0x01f4
        L_0x0268:
            X.00H r0 = r10.A0G
            java.lang.Object r3 = r0.get()
            X.9eK r3 = (X.C186519eK) r3
            if (r8 == 0) goto L_0x0018
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x0018
            X.00H r2 = r3.A03
            X.A8x r0 = X.AnonymousClass8BR.A0K(r2)
            X.0ve r4 = r0.A07
            r1 = 11082(0x2b4a, float:1.5529E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r4, r1)
            if (r0 == 0) goto L_0x0018
            r0 = 2
            if (r9 == r0) goto L_0x0295
            r0 = 6
            if (r9 == r0) goto L_0x0295
            r0 = 15
            if (r9 == r0) goto L_0x0295
            return
        L_0x0295:
            java.util.Iterator r10 = r8.iterator()
        L_0x0299:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0018
            X.206 r5 = X.C17880vN.A0Y(r10)
            X.205 r8 = r5.A0v
            X.1BI r6 = r8.A00
            if (r6 != 0) goto L_0x02b0
            X.1BI r6 = r5.A0H()
            if (r6 != 0) goto L_0x02b0
            goto L_0x0299
        L_0x02b0:
            X.1M9 r0 = r3.A01
            X.1E7 r1 = r0.A0E(r6)
            if (r1 == 0) goto L_0x0299
            int r4 = X.C20136A8x.A01(r1, r2)
            r0 = 2
            if (r4 != r0) goto L_0x0299
            X.8sS r4 = new X.8sS
            r4.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            r4.A04 = r0
            r4.A03 = r7
            boolean r0 = r1.A0B()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.A00 = r0
            int r0 = X.C20136A8x.A01(r1, r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A02 = r0
            X.A8x r0 = X.AnonymousClass8BR.A0K(r2)
            java.lang.String r0 = r0.A0I(r1)
            r4.A08 = r0
            X.1Rb r1 = r3.A02
            java.lang.String r0 = r8.A01
            java.lang.String r0 = r1.A04(r0)
            r4.A07 = r0
            X.A8x r0 = X.AnonymousClass8BR.A0K(r2)
            java.lang.String r0 = r0.A0J(r6)
            r4.A06 = r0
            X.A8x r0 = X.AnonymousClass8BR.A0K(r2)
            java.lang.Boolean r0 = r0.A0C(r5)
            r4.A01 = r0
            long r0 = X.C20136A8x.A04(r2)
            long r0 = X.C20136A8x.A03(r5, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.A05 = r0
            X.C20136A8x.A09(r4, r2)
            goto L_0x0299
        L_0x031a:
            java.lang.Object r2 = r0.A02
            X.1ml r2 = (X.C35761ml) r2
            java.lang.Object r1 = r0.A03
            X.63p r1 = (X.C1184763p) r1
            java.lang.Object r3 = r0.A04
            X.1BI r3 = (X.AnonymousClass1BI) r3
            int r0 = r0.A01
            boolean r9 = X.C72453Mb.A1Z(r1)
            X.C35761ml.A00(r2, r1)
            if (r3 == 0) goto L_0x0018
            X.A5M r2 = r2.A02
            r8 = 22
            if (r0 != 0) goto L_0x0339
            r8 = 23
        L_0x0339:
            r7 = 10
            r4 = 0
            r6 = r4
            r5 = r4
            r10 = r9
            r2.A03(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        L_0x0343:
            java.lang.Object r3 = r0.A02
            X.206 r3 = (X.AnonymousClass206) r3
            java.lang.Object r5 = r0.A03
            X.8nl r5 = (X.C169908nl) r5
            int r2 = r0.A01
            java.lang.Object r4 = r0.A04
            X.2qD r4 = (X.C61762qD) r4
            r0 = 3
            X.C18070vi.A0d(r4, r0)
            X.205 r0 = r3.A0v
            X.1BI r0 = r0.A00
            if (r0 == 0) goto L_0x0018
            com.whatsapp.jid.UserJid r6 = r3.A0I()
            if (r6 == 0) goto L_0x036d
            X.00H r0 = r5.A05
            java.lang.Object r1 = r0.get()
            X.A5M r1 = (X.A5M) r1
            r0 = 1
            r1.A02(r6, r3, r0)
        L_0x036d:
            r0 = 4194304(0x400000, double:2.0722615E-317)
            boolean r0 = r3.A11(r0)
            if (r0 == 0) goto L_0x0387
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            X.00H r0 = r5.A09
            java.lang.Object r1 = r0.get()
            X.6nI r1 = (X.C132656nI) r1
            r0 = 0
            r1.A00(r3, r2, r0)
            return
        L_0x0387:
            java.lang.String r0 = X.C20120A8f.A04(r3)
            boolean r0 = X.AnonymousClass1EG.A0H(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0018
            X.00H r0 = r5.A08
            java.lang.Object r1 = r0.get()
            X.1iV r1 = (X.C33241iV) r1
            r0 = 4
            X.C33241iV.A00(r1, r3, r0, r2)
            X.00H r0 = r5.A06
            java.lang.Object r2 = r0.get()
            X.9kk r2 = (X.C190319kk) r2
            int r0 = r4.A06
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "quick-reply"
            r2.A00(r3, r0, r1)
            return
        L_0x03b3:
            java.lang.Object r4 = r0.A02
            X.6je r4 = (X.C130566je) r4
            java.lang.Object r2 = r0.A03
            X.1Di r2 = (X.C22821Di) r2
            java.lang.Object r5 = r0.A04
            android.view.ViewStub r5 = (android.view.ViewStub) r5
            int r9 = r0.A01
            r3 = 1
            X.C18070vi.A0d(r2, r3)
            X.0vl r0 = r4.A07
            boolean r0 = X.C72453Mb.A1a(r0)
            if (r0 == 0) goto L_0x0018
            boolean r0 = X.C197219wL.A00
            if (r0 != 0) goto L_0x03df
            java.lang.String r0 = "fb"
            r1 = 16
            X.AnonymousClass1A8.A07(r0, r1)
            java.lang.String r0 = "smartglasses-bundle"
            X.AnonymousClass1A8.A07(r0, r1)
            X.C197219wL.A00 = r3
        L_0x03df:
            X.2YQ r0 = r4.A01
            X.10F r0 = r0.A00
            X.10E r1 = r0.A00
            X.0ve r8 = X.AnonymousClass10E.A8r(r1)
            X.00S r0 = r1.A97
            java.lang.Object r7 = r0.get()
            X.1V7 r7 = (X.AnonymousClass1V7) r7
            X.00S r0 = r1.A42
            java.lang.Object r6 = r0.get()
            X.2qQ r6 = (X.C61872qQ) r6
            X.DOq r4 = new X.DOq
            r4.<init>(r5, r6, r7, r8, r9)
            r2.invoke(r4)
            return
        L_0x0402:
            java.lang.Object r10 = r0.A02
            com.whatsapp.invites.SMSPreviewInviteBottomSheetFragment r10 = (com.whatsapp.invites.SMSPreviewInviteBottomSheetFragment) r10
            java.lang.Object r1 = r0.A03
            X.1EC r1 = (X.AnonymousClass1EC) r1
            java.lang.Object r6 = r0.A04
            java.util.AbstractCollection r6 = (java.util.AbstractCollection) r6
            int r3 = r0.A01
            r8 = 0
            r5 = 1
            r4 = 2
            X.C18070vi.A0d(r6, r4)
            X.1M9 r0 = r10.A02
            if (r0 == 0) goto L_0x1bba
            X.1E7 r9 = r0.A0H(r1)
            X.1CJ r0 = r10.A07
            if (r0 == 0) goto L_0x1bb7
            java.lang.String r0 = r0.A0F(r1)
            java.lang.String r7 = "https://whatsapp.com/dl/"
            if (r0 == 0) goto L_0x0461
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0461
            boolean r0 = com.whatsapp.invites.SMSPreviewInviteBottomSheetFragment.A01(r10, r1)
            r2 = 2131895696(0x7f122590, float:1.9426232E38)
            if (r0 == 0) goto L_0x043c
            r2 = 2131895675(0x7f12257b, float:1.942619E38)
        L_0x043c:
            java.lang.Object[] r1 = new java.lang.Object[r4]
            X.1Me r0 = r10.A03
            if (r0 == 0) goto L_0x1bb4
            java.lang.String r0 = r0.A0U(r9, r5, r8)
            r1[r8] = r0
            java.lang.String r11 = X.AnonymousClass3MX.A16(r10, r7, r1, r5, r2)
        L_0x044c:
            X.C18070vi.A0b(r11)
            java.util.ArrayList r9 = X.AnonymousClass000.A13()
            java.util.Iterator r1 = r6.iterator()
        L_0x0457:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0472
            X.AnonymousClass8BX.A1N(r9, r1)
            goto L_0x0457
        L_0x0461:
            boolean r1 = com.whatsapp.invites.SMSPreviewInviteBottomSheetFragment.A01(r10, r1)
            r0 = 2131895698(0x7f122592, float:1.9426236E38)
            if (r1 == 0) goto L_0x046d
            r0 = 2131895697(0x7f122591, float:1.9426234E38)
        L_0x046d:
            java.lang.String r11 = X.AnonymousClass3MY.A0o(r10, r7, r8, r0)
            goto L_0x044c
        L_0x0472:
            X.4rF r8 = new X.4rF
            r8.<init>()
            if (r3 == 0) goto L_0x049d
            if (r3 == r5) goto L_0x0496
            r1 = 22
            if (r3 == r4) goto L_0x049f
            r0 = 3
            if (r3 == r0) goto L_0x049d
            r0 = 4
            if (r3 == r0) goto L_0x049f
        L_0x0485:
            X.1FL r0 = r10.A1B()
            if (r0 == 0) goto L_0x0018
            r12 = 31
            X.AkN r7 = new X.AkN
            r7.<init>(r8, r9, r10, r11, r12)
            r0.runOnUiThread(r7)
            return
        L_0x0496:
            r0 = 21
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x04a3
        L_0x049d:
            r0 = 0
            goto L_0x04a3
        L_0x049f:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
        L_0x04a3:
            r8.element = r0
            goto L_0x0485
        L_0x04a6:
            java.lang.Object r2 = r0.A02
            com.whatsapp.invites.SMSPreviewInviteBottomSheetFragment r2 = (com.whatsapp.invites.SMSPreviewInviteBottomSheetFragment) r2
            java.lang.Object r1 = r0.A03
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r3 = r0.A04
            int r5 = r0.A01
            boolean r0 = r2.A0j
            if (r0 != 0) goto L_0x0018
            boolean r0 = r2.A0Z
            if (r0 != 0) goto L_0x0018
            r0 = 1
            r1.setEnabled(r0)
            java.util.ArrayList r4 = r2.A0F
            X.10I r0 = r2.A09
            if (r0 == 0) goto L_0x1bbd
            r6 = 25
            X.Aiu r1 = new X.Aiu
            r1.<init>(r2, r3, r4, r5, r6)
            r0.CGN(r1)
            return
        L_0x04cf:
            java.lang.Object r6 = r0.A02
            X.1nP r6 = (X.C36141nP) r6
            java.lang.Object r5 = r0.A03
            X.9r6 r5 = (X.C194059r6) r5
            int r9 = r0.A01
            java.lang.Object r8 = r0.A04
            com.whatsapp.jid.DeviceJid r8 = (com.whatsapp.jid.DeviceJid) r8
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "LocationNotificationHandler/axolotl received a location notification; jid="
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = "; retryCount="
            X.C17900vP.A0j(r0, r1, r9)
            X.2nE r3 = X.C63962tz.A02(r8)
            X.AQq r1 = new X.AQq
            r1.<init>(r3, r8, r6)
            int r2 = r5.A00
            if (r2 != 0) goto L_0x0527
            X.1P3 r4 = r6.A03
            byte[] r0 = r5.A01
            X.A4S r3 = r4.A08(r1, r3, r0)
        L_0x0503:
            int r2 = r3.A00
            if (r2 == 0) goto L_0x0510
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "LocationNotificationHandler/axolotl error; status="
            X.C17900vP.A0k(r0, r1, r2)
        L_0x0510:
            boolean r0 = r3.A01()
            if (r0 == 0) goto L_0x0018
            int r7 = r4.A06()
            X.1KB r0 = r6.A00
            r10 = 9
            X.3Cq r5 = new X.3Cq
            r5.<init>((java.lang.Object) r6, (int) r7, (java.lang.Object) r8, (int) r9, (int) r10)
            r0.A0J(r5)
            return
        L_0x0527:
            r0 = 1
            if (r2 != r0) goto L_0x1bc7
            X.1P3 r4 = r6.A03
            byte[] r0 = r5.A01
            X.A4S r3 = r4.A09(r1, r3, r0)
            goto L_0x0503
        L_0x0533:
            java.lang.Object r4 = r0.A02
            X.1hB r4 = (X.C32431hB) r4
            java.lang.Object r3 = r0.A03
            X.21V r3 = (X.AnonymousClass21V) r3
            java.lang.Object r2 = r0.A04
            X.2rc r2 = (X.C62572rc) r2
            int r1 = r0.A01
            X.1Kg r4 = r4.A0E
            X.1So r0 = X.C63972u0.A02(r3)
            java.lang.String r5 = r0.A02
            java.lang.String r6 = r3.A08
            java.lang.String r7 = r2.A0J
            r8 = 1
            if (r1 != 0) goto L_0x0551
            r8 = 2
        L_0x0551:
            r0 = 1
            X.C17960vV.A0D(r0)
            X.0ve r2 = r4.A06
            r1 = 15
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 != 0) goto L_0x0018
            X.10I r0 = r4.A0D
            X.Aj2 r3 = new X.Aj2
            r3.<init>(r4, r5, r6, r7, r8)
            r0.CGF(r3)
            return
        L_0x056c:
            java.lang.Object r4 = r0.A02
            com.whatsapp.mentions.MentionableEntry r4 = (com.whatsapp.mentions.MentionableEntry) r4
            java.lang.Object r3 = r0.A03
            X.1E7 r3 = (X.AnonymousClass1E7) r3
            java.lang.Object r2 = r0.A04
            X.1yg r2 = (X.C42751yg) r2
            int r1 = r0.A01
            r4.A0N(r2, r3)
            X.1BI r2 = r4.A0B
            if (r2 == 0) goto L_0x0018
            r0 = 8
            if (r1 != r0) goto L_0x0018
            X.1i1 r1 = r4.A08
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            r1.A0D(r2, r0)
            return
        L_0x058d:
            java.lang.Object r4 = r0.A02
            X.1gO r4 = (X.C31951gO) r4
            int r7 = r0.A01
            java.lang.Object r6 = r0.A03
            X.2nR r6 = (X.C60132nR) r6
            java.lang.Object r5 = r0.A04
            r2 = 2
            X.C18070vi.A0d(r6, r2)
            X.C18070vi.A0b(r5)
            boolean r0 = r4.A03(r6)
            if (r0 != 0) goto L_0x0018
            X.00H r0 = r4.A03
            java.lang.Object r0 = r0.get()
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0018
            int r1 = r0.intValue()
            r0 = 1
            if (r1 != r0) goto L_0x05ca
            X.10I r2 = r4.A02
            r8 = 38
            X.Aiu r3 = new X.Aiu
            r3.<init>(r4, r5, r6, r7, r8)
            java.lang.String r1 = "BaseReceiptHandler/handleReceipt"
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            r2.CGF(r3)
            return
        L_0x05ca:
            if (r1 != r2) goto L_0x05db
            X.1gM r1 = r4.A01
            r8 = 39
            X.Aiu r3 = new X.Aiu
            r3.<init>(r4, r5, r6, r7, r8)
            r0 = 12
            r1.A02(r3, r0)
            return
        L_0x05db:
            r0 = 3
            if (r1 != r0) goto L_0x05eb
            X.1Ot r0 = r4.A00
            r8 = 40
            X.Aiu r3 = new X.Aiu
            r3.<init>(r4, r5, r6, r7, r8)
            r0.A02(r3)
            return
        L_0x05eb:
            r0 = 4
            if (r1 != r0) goto L_0x0018
            X.C31951gO.A00(r4, r6, r5)
            return
        L_0x05f2:
            java.lang.Object r7 = r0.A02
            X.2qF r7 = (X.C61782qF) r7
            java.lang.Object r1 = r0.A03
            java.util.Set r1 = (java.util.Set) r1
            java.lang.Object r6 = r0.A04
            com.whatsapp.jid.Jid r6 = (com.whatsapp.jid.Jid) r6
            int r5 = r0.A01
            java.util.Iterator r9 = r1.iterator()
        L_0x0604:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0018
            X.1BI r4 = X.C17880vN.A0Q(r9)
            X.1Rj r8 = r7.A09
            java.util.concurrent.ConcurrentHashMap r0 = r8.A0F
            java.lang.Object r3 = r0.get(r4)
            X.1zh r3 = (X.C43371zh) r3
            if (r3 != 0) goto L_0x0622
            X.1zh r3 = new X.1zh
            r3.<init>()
            r0.put(r4, r3)
        L_0x0622:
            if (r6 == 0) goto L_0x064e
            boolean r0 = X.C22971Dz.A0e(r4)
            if (r0 == 0) goto L_0x064e
            java.util.HashMap r0 = r3.A06
            if (r0 != 0) goto L_0x0634
            java.util.HashMap r0 = X.C17880vN.A11()
            r3.A06 = r0
        L_0x0634:
            java.lang.Object r2 = r0.get(r6)
            X.2cz r2 = (X.C53722cz) r2
            if (r2 != 0) goto L_0x0646
            X.2cz r2 = new X.2cz
            r2.<init>()
            java.util.HashMap r0 = r3.A06
            r0.put(r6, r2)
        L_0x0646:
            long r0 = android.os.SystemClock.elapsedRealtime()
            r2.A01 = r0
            r2.A00 = r5
        L_0x064e:
            long r0 = android.os.SystemClock.elapsedRealtime()
            r3.A04 = r0
            r3.A01 = r5
            if (r6 != 0) goto L_0x0680
            java.lang.String r2 = r4.getRawString()
        L_0x065c:
            java.util.HashMap r1 = r8.A0C
            java.lang.Object r3 = r1.get(r2)
            X.3C5 r3 = (X.AnonymousClass3C5) r3
            if (r3 != 0) goto L_0x0670
            r0 = 9
            X.3C5 r3 = new X.3C5
            r3.<init>(r6, r4, r8, r0)
            r1.put(r2, r3)
        L_0x0670:
            android.os.Handler r2 = r8.A00
            r2.removeCallbacks(r3)
            r0 = 25000(0x61a8, double:1.23516E-319)
            r2.postDelayed(r3, r0)
            X.1mk r0 = r7.A04
            r0.A00(r4)
            goto L_0x0604
        L_0x0680:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = r4.getRawString()
            java.lang.String r0 = X.AnonymousClass8BS.A0g(r6, r0, r1)
            java.lang.String r2 = X.AnonymousClass000.A0y(r0, r1)
            goto L_0x065c
        L_0x0691:
            java.lang.Object r1 = r0.A02
            X.0y9 r1 = (X.C19400y9) r1
            java.lang.Object r2 = r0.A03
            r19 = r2
            r2 = r19
            X.0yE r2 = (X.C19450yE) r2
            r19 = r2
            int r2 = r0.A01
            r18 = r2
            java.lang.Object r0 = r0.A04
            r25 = r0
            r0 = r25
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r25 = r0
            X.0xw r0 = r1.A05     // Catch:{ 3ER -> 0x1253 }
            X.0xu r2 = r1.A04     // Catch:{ 3ER -> 0x1253 }
            r24 = r2
            r24.getClass()     // Catch:{ 3ER -> 0x1253 }
            X.0xx r0 = (X.C19280xx) r0     // Catch:{ 3ER -> 0x1253 }
            android.database.sqlite.SQLiteDatabase r4 = r0.A04()     // Catch:{ 3ER -> 0x1253 }
            X.C19280xx.A03(r4, r0)     // Catch:{ 3ER -> 0x1253 }
            r2 = r24
            X.0xx r2 = (X.C19280xx) r2     // Catch:{ all -> 0x1240 }
            r43 = r2
            X.0xi r2 = r2.A02     // Catch:{ all -> 0x1240 }
            long r2 = r2.BaO()     // Catch:{ all -> 0x1240 }
            r5 = 604800000(0x240c8400, double:2.988109026E-315)
            long r2 = r2 - r5
            android.database.sqlite.SQLiteDatabase r5 = r43.A04()     // Catch:{ all -> 0x1240 }
            r5.beginTransaction()     // Catch:{ all -> 0x1240 }
            java.lang.String[] r7 = X.C17880vN.A1Y()     // Catch:{ all -> 0x123b }
            r6 = 0
            X.C17880vN.A1V(r7, r6, r2)     // Catch:{ all -> 0x123b }
            java.lang.String r2 = "SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name"
            android.database.Cursor r8 = r5.rawQuery(r2, r7)     // Catch:{ all -> 0x123b }
        L_0x06e4:
            boolean r2 = r8.moveToNext()     // Catch:{ all -> 0x122f }
            if (r2 == 0) goto L_0x06fd
            r2 = 0
            int r3 = r8.getInt(r2)     // Catch:{ all -> 0x122f }
            r2 = 1
            java.lang.String r10 = r8.getString(r2)     // Catch:{ all -> 0x122f }
            long r2 = (long) r3     // Catch:{ all -> 0x122f }
            X.9JT r9 = X.AnonymousClass9JT.MESSAGE_TOO_OLD     // Catch:{ all -> 0x122f }
            r6 = r43
            r6.CDf(r9, r10, r2)     // Catch:{ all -> 0x122f }
            goto L_0x06e4
        L_0x06fd:
            r8.close()     // Catch:{ all -> 0x123b }
            java.lang.String r3 = "events"
            java.lang.String r2 = "timestamp_ms < ?"
            r5.delete(r3, r2, r7)     // Catch:{ all -> 0x123b }
            r5.setTransactionSuccessful()     // Catch:{ all -> 0x123b }
            r5.endTransaction()     // Catch:{ all -> 0x1240 }
            r4.setTransactionSuccessful()     // Catch:{ all -> 0x1240 }
            r4.endTransaction()     // Catch:{ 3ER -> 0x1253 }
            android.content.Context r3 = r1.A00     // Catch:{ 3ER -> 0x1253 }
            java.lang.String r2 = "connectivity"
            java.lang.Object r2 = r3.getSystemService(r2)     // Catch:{ 3ER -> 0x1253 }
            android.net.ConnectivityManager r2 = (android.net.ConnectivityManager) r2     // Catch:{ 3ER -> 0x1253 }
            android.net.NetworkInfo r2 = r2.getActiveNetworkInfo()     // Catch:{ 3ER -> 0x1253 }
            if (r2 == 0) goto L_0x1205
            boolean r2 = r2.isConnected()     // Catch:{ 3ER -> 0x1253 }
            if (r2 == 0) goto L_0x1205
            X.0xn r3 = r1.A01     // Catch:{ 3ER -> 0x1253 }
            r2 = r19
            X.0yF r2 = (X.C19460yF) r2     // Catch:{ 3ER -> 0x1253 }
            r42 = r2
            java.lang.String r2 = r2.A01     // Catch:{ 3ER -> 0x1253 }
            r22 = r2
            X.B6q r20 = r3.BM0(r2)     // Catch:{ 3ER -> 0x1253 }
            r16 = 0
            java.lang.Integer r23 = X.AnonymousClass00R.A00     // Catch:{ 3ER -> 0x1253 }
        L_0x073d:
            android.database.sqlite.SQLiteDatabase r4 = r0.A04()     // Catch:{ 3ER -> 0x1253 }
            X.C19280xx.A03(r4, r0)     // Catch:{ 3ER -> 0x1253 }
            android.database.sqlite.SQLiteDatabase r5 = r43.A04()     // Catch:{ all -> 0x1240 }
            r5.beginTransaction()     // Catch:{ all -> 0x1240 }
            r2 = r19
            java.lang.Long r2 = X.C19280xx.A00(r5, r2)     // Catch:{ all -> 0x123b }
            r10 = 0
            if (r2 != 0) goto L_0x075c
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r10)     // Catch:{ all -> 0x123b }
        L_0x0758:
            r5.setTransactionSuccessful()     // Catch:{ all -> 0x123b }
            goto L_0x077c
        L_0x075c:
            android.database.sqlite.SQLiteDatabase r6 = r43.A04()     // Catch:{ all -> 0x123b }
            java.lang.String[] r3 = X.C17880vN.A1Y()     // Catch:{ all -> 0x123b }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x123b }
            r3[r10] = r2     // Catch:{ all -> 0x123b }
            java.lang.String r2 = "SELECT 1 FROM events WHERE context_id = ? LIMIT 1"
            android.database.Cursor r3 = r6.rawQuery(r2, r3)     // Catch:{ all -> 0x123b }
            boolean r2 = r3.moveToNext()     // Catch:{ all -> 0x1200 }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x1200 }
            r3.close()     // Catch:{ all -> 0x123b }
            goto L_0x0758
        L_0x077c:
            r5.endTransaction()     // Catch:{ all -> 0x1240 }
            r4.setTransactionSuccessful()     // Catch:{ all -> 0x1240 }
            r4.endTransaction()     // Catch:{ 3ER -> 0x1253 }
            boolean r2 = r2.booleanValue()     // Catch:{ 3ER -> 0x1253 }
            if (r2 == 0) goto L_0x11f8
            android.database.sqlite.SQLiteDatabase r4 = r0.A04()     // Catch:{ 3ER -> 0x1253 }
            X.C19280xx.A03(r4, r0)     // Catch:{ 3ER -> 0x1253 }
            android.database.sqlite.SQLiteDatabase r5 = r43.A04()     // Catch:{ all -> 0x1240 }
            r5.beginTransaction()     // Catch:{ all -> 0x1240 }
            r3 = 200(0xc8, float:2.8E-43)
            r11 = 200(0xc8, float:2.8E-43)
            r6 = r19
            r2 = r43
            java.util.ArrayList r21 = X.C19280xx.A02(r5, r6, r2, r3)     // Catch:{ all -> 0x123b }
            X.0xz[] r9 = X.C19300xz.values()     // Catch:{ all -> 0x123b }
            int r8 = r9.length     // Catch:{ all -> 0x123b }
        L_0x07aa:
            if (r10 >= r8) goto L_0x07d8
            r7 = r9[r10]     // Catch:{ all -> 0x123b }
            r2 = r42
            X.0xz r2 = r2.A00     // Catch:{ all -> 0x123b }
            if (r7 == r2) goto L_0x07d5
            int r2 = r21.size()     // Catch:{ all -> 0x123b }
            int r6 = r11 - r2
            if (r6 <= 0) goto L_0x07d8
            if (r22 == 0) goto L_0x1234
            if (r7 == 0) goto L_0x1131
            r2 = r42
            byte[] r3 = r2.A02     // Catch:{ all -> 0x123b }
            r2 = r22
            X.0yF r3 = X.C19440yD.A00(r7, r2, r3)     // Catch:{ all -> 0x123b }
            r2 = r43
            java.util.ArrayList r2 = X.C19280xx.A02(r5, r3, r2, r6)     // Catch:{ all -> 0x123b }
            r3 = r21
            r3.addAll(r2)     // Catch:{ all -> 0x123b }
        L_0x07d5:
            int r10 = r10 + 1
            goto L_0x07aa
        L_0x07d8:
            java.util.HashMap r7 = X.C17880vN.A11()     // Catch:{ all -> 0x123b }
            java.lang.String r2 = "event_id IN ("
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x123b }
            r8.<init>(r2)     // Catch:{ all -> 0x123b }
            r6 = 0
            r9 = 0
        L_0x07e5:
            int r2 = r21.size()     // Catch:{ all -> 0x123b }
            r10 = 1
            if (r9 >= r2) goto L_0x080a
            r2 = r21
            java.lang.Object r2 = r2.get(r9)     // Catch:{ all -> 0x123b }
            X.9Lt r2 = (X.C180259Lt) r2     // Catch:{ all -> 0x123b }
            X.8R9 r2 = (X.AnonymousClass8R9) r2     // Catch:{ all -> 0x123b }
            long r2 = r2.A00     // Catch:{ all -> 0x123b }
            r8.append(r2)     // Catch:{ all -> 0x123b }
            int r2 = r21.size()     // Catch:{ all -> 0x123b }
            int r2 = r2 - r10
            if (r9 >= r2) goto L_0x0807
            r2 = 44
            r8.append(r2)     // Catch:{ all -> 0x123b }
        L_0x0807:
            int r9 = r9 + 1
            goto L_0x07e5
        L_0x080a:
            r2 = 41
            r8.append(r2)     // Catch:{ all -> 0x123b }
            java.lang.String[] r28 = X.AnonymousClass8BR.A1b()     // Catch:{ all -> 0x123b }
            java.lang.String r2 = "event_id"
            r28[r6] = r2     // Catch:{ all -> 0x123b }
            java.lang.String r2 = "name"
            r28[r10] = r2     // Catch:{ all -> 0x123b }
            r9 = 2
            java.lang.String r2 = "value"
            r28[r9] = r2     // Catch:{ all -> 0x123b }
            java.lang.String r29 = r8.toString()     // Catch:{ all -> 0x123b }
            r30 = 0
            java.lang.String r27 = "event_metadata"
            r32 = r30
            r33 = r30
            r31 = r30
            r26 = r5
            android.database.Cursor r8 = r26.query(r27, r28, r29, r30, r31, r32, r33)     // Catch:{ all -> 0x123b }
        L_0x0834:
            boolean r2 = r8.moveToNext()     // Catch:{ all -> 0x122f }
            if (r2 == 0) goto L_0x085f
            java.lang.Long r2 = X.C17890vO.A0M(r8, r6)     // Catch:{ all -> 0x122f }
            java.lang.Object r11 = r7.get(r2)     // Catch:{ all -> 0x122f }
            java.util.Set r11 = (java.util.Set) r11     // Catch:{ all -> 0x122f }
            if (r11 != 0) goto L_0x084d
            java.util.HashSet r11 = X.C17880vN.A12()     // Catch:{ all -> 0x122f }
            r7.put(r2, r11)     // Catch:{ all -> 0x122f }
        L_0x084d:
            r2 = 1
            java.lang.String r10 = r8.getString(r2)     // Catch:{ all -> 0x122f }
            java.lang.String r3 = r8.getString(r9)     // Catch:{ all -> 0x122f }
            X.9Zn r2 = new X.9Zn     // Catch:{ all -> 0x122f }
            r2.<init>(r10, r3)     // Catch:{ all -> 0x122f }
            r11.add(r2)     // Catch:{ all -> 0x122f }
            goto L_0x0834
        L_0x085f:
            r8.close()     // Catch:{ all -> 0x123b }
            java.util.ListIterator r11 = r21.listIterator()     // Catch:{ all -> 0x123b }
        L_0x0866:
            boolean r2 = r11.hasNext()     // Catch:{ all -> 0x123b }
            if (r2 == 0) goto L_0x08b3
            java.lang.Object r10 = r11.next()     // Catch:{ all -> 0x123b }
            X.9Lt r10 = (X.C180259Lt) r10     // Catch:{ all -> 0x123b }
            X.8R9 r10 = (X.AnonymousClass8R9) r10     // Catch:{ all -> 0x123b }
            long r2 = r10.A00     // Catch:{ all -> 0x123b }
            java.lang.Long r6 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x123b }
            boolean r8 = r7.containsKey(r6)     // Catch:{ all -> 0x123b }
            if (r8 == 0) goto L_0x0866
            X.9Ns r8 = r10.A01     // Catch:{ all -> 0x123b }
            X.9tB r9 = r8.A00()     // Catch:{ all -> 0x123b }
            java.lang.Object r6 = r7.get(r6)     // Catch:{ all -> 0x123b }
            java.util.Set r6 = (java.util.Set) r6     // Catch:{ all -> 0x123b }
            java.util.Iterator r12 = r6.iterator()     // Catch:{ all -> 0x123b }
        L_0x0890:
            boolean r6 = r12.hasNext()     // Catch:{ all -> 0x123b }
            if (r6 == 0) goto L_0x08a4
            java.lang.Object r6 = r12.next()     // Catch:{ all -> 0x123b }
            X.9Zn r6 = (X.C183769Zn) r6     // Catch:{ all -> 0x123b }
            java.lang.String r8 = r6.A00     // Catch:{ all -> 0x123b }
            java.lang.String r6 = r6.A01     // Catch:{ all -> 0x123b }
            r9.A02(r8, r6)     // Catch:{ all -> 0x123b }
            goto L_0x0890
        L_0x08a4:
            X.0yE r8 = r10.A02     // Catch:{ all -> 0x123b }
            X.8R7 r9 = r9.A00()     // Catch:{ all -> 0x123b }
            X.8R9 r6 = new X.8R9     // Catch:{ all -> 0x123b }
            r6.<init>(r9, r8, r2)     // Catch:{ all -> 0x123b }
            r11.set(r6)     // Catch:{ all -> 0x123b }
            goto L_0x0866
        L_0x08b3:
            r5.setTransactionSuccessful()     // Catch:{ all -> 0x123b }
            r5.endTransaction()     // Catch:{ all -> 0x1240 }
            r4.setTransactionSuccessful()     // Catch:{ all -> 0x1240 }
            r4.endTransaction()     // Catch:{ 3ER -> 0x1253 }
            java.util.Iterator r2 = r21.iterator()     // Catch:{ 3ER -> 0x1253 }
            boolean r2 = r2.hasNext()     // Catch:{ 3ER -> 0x1253 }
            if (r2 == 0) goto L_0x125f
            if (r20 != 0) goto L_0x08d8
            java.lang.String r4 = "Uploader"
            java.lang.String r3 = "Unknown backend for %s, deleting event batch for it..."
            r2 = r19
            X.A3G.A01(r2, r4, r3)     // Catch:{ 3ER -> 0x1253 }
            java.lang.Integer r4 = X.AnonymousClass00R.A0C     // Catch:{ 3ER -> 0x1253 }
            goto L_0x1026
        L_0x08d8:
            java.util.ArrayList r6 = X.AnonymousClass000.A13()     // Catch:{ 3ER -> 0x1253 }
            java.util.Iterator r3 = r21.iterator()     // Catch:{ 3ER -> 0x1253 }
        L_0x08e0:
            boolean r2 = r3.hasNext()     // Catch:{ 3ER -> 0x1253 }
            if (r2 == 0) goto L_0x08f4
            java.lang.Object r2 = r3.next()     // Catch:{ 3ER -> 0x1253 }
            X.9Lt r2 = (X.C180259Lt) r2     // Catch:{ 3ER -> 0x1253 }
            X.8R9 r2 = (X.AnonymousClass8R9) r2     // Catch:{ 3ER -> 0x1253 }
            X.9Ns r2 = r2.A01     // Catch:{ 3ER -> 0x1253 }
            r6.add(r2)     // Catch:{ 3ER -> 0x1253 }
            goto L_0x08e0
        L_0x08f4:
            r2 = r42
            byte[] r15 = r2.A02     // Catch:{ 3ER -> 0x1253 }
            if (r15 == 0) goto L_0x0a91
            X.0xv r10 = r1.A03     // Catch:{ 3ER -> 0x1253 }
            r10.getClass()     // Catch:{ 3ER -> 0x1253 }
            android.database.sqlite.SQLiteDatabase r11 = r0.A04()     // Catch:{ 3ER -> 0x1253 }
            X.C19280xx.A03(r11, r0)     // Catch:{ 3ER -> 0x1253 }
            X.0xx r10 = (X.C19280xx) r10     // Catch:{ all -> 0x114d }
            X.9e9 r9 = new X.9e9     // Catch:{ all -> 0x114d }
            r9.<init>()     // Catch:{ all -> 0x114d }
            java.util.HashMap r12 = X.C17880vN.A11()     // Catch:{ all -> 0x114d }
            java.lang.String r3 = "SELECT log_source, reason, events_dropped_count FROM log_event_dropped"
            android.database.sqlite.SQLiteDatabase r8 = r10.A04()     // Catch:{ all -> 0x114d }
            r8.beginTransaction()     // Catch:{ all -> 0x114d }
            r2 = 0
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ all -> 0x1148 }
            android.database.Cursor r7 = r8.rawQuery(r3, r2)     // Catch:{ all -> 0x1148 }
        L_0x0921:
            boolean r2 = r7.moveToNext()     // Catch:{ all -> 0x1143 }
            if (r2 == 0) goto L_0x0989
            r2 = 0
            java.lang.String r5 = r7.getString(r2)     // Catch:{ all -> 0x1143 }
            r2 = 1
            int r3 = r7.getInt(r2)     // Catch:{ all -> 0x1143 }
            X.9JT r4 = X.AnonymousClass9JT.REASON_UNKNOWN     // Catch:{ all -> 0x1143 }
            int r2 = r4.number_     // Catch:{ all -> 0x1143 }
            if (r3 == r2) goto L_0x0966
            X.9JT r13 = X.AnonymousClass9JT.MESSAGE_TOO_OLD     // Catch:{ all -> 0x1143 }
            int r2 = r13.number_     // Catch:{ all -> 0x1143 }
            if (r3 == r2) goto L_0x0987
            X.9JT r13 = X.AnonymousClass9JT.CACHE_FULL     // Catch:{ all -> 0x1143 }
            int r2 = r13.number_     // Catch:{ all -> 0x1143 }
            if (r3 == r2) goto L_0x0987
            X.9JT r13 = X.AnonymousClass9JT.PAYLOAD_TOO_BIG     // Catch:{ all -> 0x1143 }
            int r2 = r13.number_     // Catch:{ all -> 0x1143 }
            if (r3 == r2) goto L_0x0987
            X.9JT r13 = X.AnonymousClass9JT.MAX_RETRIES_REACHED     // Catch:{ all -> 0x1143 }
            int r2 = r13.number_     // Catch:{ all -> 0x1143 }
            if (r3 == r2) goto L_0x0987
            X.9JT r13 = X.AnonymousClass9JT.INVALID_PAYLOD     // Catch:{ all -> 0x1143 }
            int r2 = r13.number_     // Catch:{ all -> 0x1143 }
            if (r3 == r2) goto L_0x0987
            X.9JT r13 = X.AnonymousClass9JT.SERVER_ERROR     // Catch:{ all -> 0x1143 }
            int r2 = r13.number_     // Catch:{ all -> 0x1143 }
            if (r3 == r2) goto L_0x0987
            java.lang.String r13 = "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x1143 }
            java.lang.String r2 = "SQLiteEventStore"
            X.A3G.A01(r3, r2, r13)     // Catch:{ all -> 0x1143 }
        L_0x0966:
            r2 = 2
            long r2 = r7.getLong(r2)     // Catch:{ all -> 0x1143 }
            boolean r13 = r12.containsKey(r5)     // Catch:{ all -> 0x1143 }
            if (r13 != 0) goto L_0x0978
            java.util.ArrayList r13 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x1143 }
            r12.put(r5, r13)     // Catch:{ all -> 0x1143 }
        L_0x0978:
            java.lang.Object r13 = r12.get(r5)     // Catch:{ all -> 0x1143 }
            java.util.List r13 = (java.util.List) r13     // Catch:{ all -> 0x1143 }
            X.9Zm r5 = new X.9Zm     // Catch:{ all -> 0x1143 }
            r5.<init>(r4, r2)     // Catch:{ all -> 0x1143 }
            r13.add(r5)     // Catch:{ all -> 0x1143 }
            goto L_0x0921
        L_0x0987:
            r4 = r13
            goto L_0x0966
        L_0x0989:
            java.util.Iterator r5 = X.C17890vO.A0i(r12)     // Catch:{ all -> 0x1143 }
        L_0x098d:
            boolean r2 = r5.hasNext()     // Catch:{ all -> 0x1143 }
            if (r2 == 0) goto L_0x09b0
            java.util.Map$Entry r2 = X.AnonymousClass000.A16(r5)     // Catch:{ all -> 0x1143 }
            java.lang.String r4 = X.C17880vN.A0x(r2)     // Catch:{ all -> 0x1143 }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x1143 }
            java.util.List r2 = (java.util.List) r2     // Catch:{ all -> 0x1143 }
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)     // Catch:{ all -> 0x1143 }
            X.Chc r3 = new X.Chc     // Catch:{ all -> 0x1143 }
            r3.<init>(r4, r2)     // Catch:{ all -> 0x1143 }
            java.util.List r2 = r9.A03     // Catch:{ all -> 0x1143 }
            r2.add(r3)     // Catch:{ all -> 0x1143 }
            goto L_0x098d
        L_0x09b0:
            X.0xi r2 = r10.A02     // Catch:{ all -> 0x1143 }
            long r4 = r2.BaO()     // Catch:{ all -> 0x1143 }
            android.database.sqlite.SQLiteDatabase r14 = r10.A04()     // Catch:{ all -> 0x1143 }
            r14.beginTransaction()     // Catch:{ all -> 0x1143 }
            r2 = 0
            java.lang.String[] r3 = new java.lang.String[r2]     // Catch:{ all -> 0x113e }
            java.lang.String r2 = "SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1"
            android.database.Cursor r13 = r14.rawQuery(r2, r3)     // Catch:{ all -> 0x113e }
            r13.moveToNext()     // Catch:{ all -> 0x1139 }
            r2 = 0
            long r2 = r13.getLong(r2)     // Catch:{ all -> 0x1139 }
            X.CNo r12 = new X.CNo     // Catch:{ all -> 0x1139 }
            r12.<init>(r2, r4)     // Catch:{ all -> 0x1139 }
            r13.close()     // Catch:{ all -> 0x113e }
            r14.setTransactionSuccessful()     // Catch:{ all -> 0x113e }
            r14.endTransaction()     // Catch:{ all -> 0x1143 }
            r9.A01 = r12     // Catch:{ all -> 0x1143 }
            android.database.sqlite.SQLiteDatabase r3 = r10.A04()     // Catch:{ all -> 0x1143 }
            java.lang.String r2 = "PRAGMA page_count"
            android.database.sqlite.SQLiteStatement r2 = r3.compileStatement(r2)     // Catch:{ all -> 0x1143 }
            long r2 = r2.simpleQueryForLong()     // Catch:{ all -> 0x1143 }
            android.database.sqlite.SQLiteDatabase r5 = r10.A04()     // Catch:{ all -> 0x1143 }
            java.lang.String r4 = "PRAGMA page_size"
            android.database.sqlite.SQLiteStatement r4 = r5.compileStatement(r4)     // Catch:{ all -> 0x1143 }
            long r4 = r4.simpleQueryForLong()     // Catch:{ all -> 0x1143 }
            long r2 = r2 * r4
            X.0xq r4 = X.C19210xq.A00     // Catch:{ all -> 0x1143 }
            X.CNn r4 = new X.CNn     // Catch:{ all -> 0x1143 }
            r4.<init>(r2)     // Catch:{ all -> 0x1143 }
            X.Ch1 r2 = new X.Ch1     // Catch:{ all -> 0x1143 }
            r2.<init>(r4)     // Catch:{ all -> 0x1143 }
            r9.A00 = r2     // Catch:{ all -> 0x1143 }
            X.0vp r2 = r10.A03     // Catch:{ all -> 0x1143 }
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x1143 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x1143 }
            r9.A02 = r2     // Catch:{ all -> 0x1143 }
            X.CNo r10 = r9.A01     // Catch:{ all -> 0x1143 }
            java.util.List r2 = r9.A03     // Catch:{ all -> 0x1143 }
            java.util.List r5 = java.util.Collections.unmodifiableList(r2)     // Catch:{ all -> 0x1143 }
            X.Ch1 r4 = r9.A00     // Catch:{ all -> 0x1143 }
            java.lang.String r3 = r9.A02     // Catch:{ all -> 0x1143 }
            X.9yH r2 = new X.9yH     // Catch:{ all -> 0x1143 }
            r2.<init>(r4, r10, r3, r5)     // Catch:{ all -> 0x1143 }
            r7.close()     // Catch:{ all -> 0x1148 }
            r8.setTransactionSuccessful()     // Catch:{ all -> 0x1148 }
            r8.endTransaction()     // Catch:{ all -> 0x114d }
            r11.setTransactionSuccessful()     // Catch:{ all -> 0x114d }
            r11.endTransaction()     // Catch:{ 3ER -> 0x1253 }
            java.util.HashMap r32 = X.C17880vN.A11()     // Catch:{ 3ER -> 0x1253 }
            X.0xi r3 = r1.A06     // Catch:{ 3ER -> 0x1253 }
            long r33 = r3.BaO()     // Catch:{ 3ER -> 0x1253 }
            java.lang.Long r7 = java.lang.Long.valueOf(r33)     // Catch:{ 3ER -> 0x1253 }
            X.0xi r3 = r1.A07     // Catch:{ 3ER -> 0x1253 }
            long r35 = r3.BaO()     // Catch:{ 3ER -> 0x1253 }
            java.lang.Long r5 = java.lang.Long.valueOf(r35)     // Catch:{ 3ER -> 0x1253 }
            java.lang.String r31 = "GDT_CLIENT_METRICS"
            java.lang.String r3 = "proto"
            X.0xy r4 = new X.0xy     // Catch:{ 3ER -> 0x1253 }
            r4.<init>(r3)     // Catch:{ 3ER -> 0x1253 }
            X.9kt r3 = X.C197129wC.A00     // Catch:{ 3ER -> 0x1253 }
            byte[] r2 = r3.A00(r2)     // Catch:{ 3ER -> 0x1253 }
            X.9pq r3 = new X.9pq     // Catch:{ 3ER -> 0x1253 }
            r3.<init>(r4, r2)     // Catch:{ 3ER -> 0x1253 }
            java.lang.String r2 = ""
            if (r7 != 0) goto L_0x0a6d
            java.lang.StringBuilder r4 = X.AnonymousClass000.A11(r2)     // Catch:{ 3ER -> 0x1253 }
            java.lang.String r2 = " eventMillis"
            java.lang.String r2 = X.AnonymousClass000.A0y(r2, r4)     // Catch:{ 3ER -> 0x1253 }
        L_0x0a6d:
            if (r5 != 0) goto L_0x0a79
            java.lang.StringBuilder r4 = X.AnonymousClass000.A11(r2)     // Catch:{ 3ER -> 0x1253 }
            java.lang.String r2 = " uptimeMillis"
            java.lang.String r2 = X.AnonymousClass000.A0y(r2, r4)     // Catch:{ 3ER -> 0x1253 }
        L_0x0a79:
            boolean r4 = r2.isEmpty()     // Catch:{ 3ER -> 0x1253 }
            if (r4 == 0) goto L_0x11ea
            X.8R7 r2 = new X.8R7     // Catch:{ 3ER -> 0x1253 }
            r28 = r2
            r29 = r3
            r28.<init>(r29, r30, r31, r32, r33, r35)     // Catch:{ 3ER -> 0x1253 }
            r3 = r20
            X.8R7 r2 = r3.BI9(r2)     // Catch:{ 3ER -> 0x1253 }
            r6.add(r2)     // Catch:{ 3ER -> 0x1253 }
        L_0x0a91:
            java.lang.String r28 = ""
            boolean r2 = r28.isEmpty()     // Catch:{ 3ER -> 0x1253 }
            if (r2 == 0) goto L_0x11da
            r4 = r20
            X.AJ3 r4 = (X.AJ3) r4     // Catch:{ 3ER -> 0x1253 }
            java.util.HashMap r2 = X.C17880vN.A11()     // Catch:{ 3ER -> 0x1253 }
            java.util.Iterator r7 = r6.iterator()     // Catch:{ 3ER -> 0x1253 }
        L_0x0aa5:
            boolean r3 = r7.hasNext()     // Catch:{ 3ER -> 0x1253 }
            if (r3 == 0) goto L_0x0ace
            java.lang.Object r5 = r7.next()     // Catch:{ 3ER -> 0x1253 }
            X.9Ns r5 = (X.C180739Ns) r5     // Catch:{ 3ER -> 0x1253 }
            r3 = r5
            X.8R7 r3 = (X.AnonymousClass8R7) r3     // Catch:{ 3ER -> 0x1253 }
            java.lang.String r3 = r3.A04     // Catch:{ 3ER -> 0x1253 }
            boolean r6 = r2.containsKey(r3)     // Catch:{ 3ER -> 0x1253 }
            if (r6 != 0) goto L_0x0ac4
            java.util.ArrayList r5 = X.C108965cb.A0s(r5)     // Catch:{ 3ER -> 0x1253 }
            r2.put(r3, r5)     // Catch:{ 3ER -> 0x1253 }
            goto L_0x0aa5
        L_0x0ac4:
            java.lang.Object r3 = r2.get(r3)     // Catch:{ 3ER -> 0x1253 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ 3ER -> 0x1253 }
            r3.add(r5)     // Catch:{ 3ER -> 0x1253 }
            goto L_0x0aa5
        L_0x0ace:
            java.util.ArrayList r7 = X.AnonymousClass000.A13()     // Catch:{ 3ER -> 0x1253 }
            java.util.Iterator r27 = X.C17890vO.A0i(r2)     // Catch:{ 3ER -> 0x1253 }
        L_0x0ad6:
            boolean r2 = r27.hasNext()     // Catch:{ 3ER -> 0x1253 }
            if (r2 == 0) goto L_0x0d69
            java.util.Map$Entry r26 = X.AnonymousClass000.A16(r27)     // Catch:{ 3ER -> 0x1253 }
            java.lang.Object r2 = r26.getValue()     // Catch:{ 3ER -> 0x1253 }
            java.util.List r2 = (java.util.List) r2     // Catch:{ 3ER -> 0x1253 }
            java.lang.Object r8 = X.C108955ca.A0p(r2)     // Catch:{ 3ER -> 0x1253 }
            X.9Ns r8 = (X.C180739Ns) r8     // Catch:{ 3ER -> 0x1253 }
            X.9gW r3 = new X.9gW     // Catch:{ 3ER -> 0x1253 }
            r3.<init>()     // Catch:{ 3ER -> 0x1253 }
            X.BzB r2 = X.C24314BzB.DEFAULT     // Catch:{ 3ER -> 0x1253 }
            r3.A01 = r2     // Catch:{ 3ER -> 0x1253 }
            X.0xi r2 = r4.A03     // Catch:{ 3ER -> 0x1253 }
            long r5 = r2.BaO()     // Catch:{ 3ER -> 0x1253 }
            java.lang.Long r2 = java.lang.Long.valueOf(r5)     // Catch:{ 3ER -> 0x1253 }
            r3.A03 = r2     // Catch:{ 3ER -> 0x1253 }
            X.0xi r2 = r4.A02     // Catch:{ 3ER -> 0x1253 }
            long r5 = r2.BaO()     // Catch:{ 3ER -> 0x1253 }
            java.lang.Long r2 = java.lang.Long.valueOf(r5)     // Catch:{ 3ER -> 0x1253 }
            r3.A04 = r2     // Catch:{ 3ER -> 0x1253 }
            X.9Zl r13 = new X.9Zl     // Catch:{ 3ER -> 0x1253 }
            r13.<init>()     // Catch:{ 3ER -> 0x1253 }
            X.9IO r2 = X.AnonymousClass9IO.ANDROID_FIREBASE     // Catch:{ 3ER -> 0x1253 }
            r13.A01 = r2     // Catch:{ 3ER -> 0x1253 }
            X.9hV r2 = new X.9hV     // Catch:{ 3ER -> 0x1253 }
            r2.<init>()     // Catch:{ 3ER -> 0x1253 }
            java.lang.String r6 = "sdk-version"
            r5 = r8
            X.8R7 r5 = (X.AnonymousClass8R7) r5     // Catch:{ 3ER -> 0x1253 }
            java.util.Map r5 = r5.A05     // Catch:{ 3ER -> 0x1253 }
            java.lang.String r5 = X.C17880vN.A0s(r6, r5)     // Catch:{ 3ER -> 0x1253 }
            if (r5 != 0) goto L_0x0b2a
            r5 = 0
            goto L_0x0b32
        L_0x0b2a:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ 3ER -> 0x1253 }
            int r5 = r5.intValue()     // Catch:{ 3ER -> 0x1253 }
        L_0x0b32:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ 3ER -> 0x1253 }
            r2.A00 = r5     // Catch:{ 3ER -> 0x1253 }
            java.lang.String r5 = "model"
            java.lang.String r5 = r8.A01(r5)     // Catch:{ 3ER -> 0x1253 }
            r2.A08 = r5     // Catch:{ 3ER -> 0x1253 }
            java.lang.String r5 = "hardware"
            java.lang.String r5 = r8.A01(r5)     // Catch:{ 3ER -> 0x1253 }
            r2.A04 = r5     // Catch:{ 3ER -> 0x1253 }
            java.lang.String r5 = "device"
            java.lang.String r5 = r8.A01(r5)     // Catch:{ 3ER -> 0x1253 }
            r2.A02 = r5     // Catch:{ 3ER -> 0x1253 }
            java.lang.String r5 = "product"
            java.lang.String r5 = r8.A01(r5)     // Catch:{ 3ER -> 0x1253 }
            r2.A0A = r5     // Catch:{ 3ER -> 0x1253 }
            java.lang.String r5 = "os-uild"
            java.lang.String r5 = r8.A01(r5)     // Catch:{ 3ER -> 0x1253 }
            r2.A09 = r5     // Catch:{ 3ER -> 0x1253 }
            java.lang.String r5 = "manufacturer"
            java.lang.String r5 = r8.A01(r5)     // Catch:{ 3ER -> 0x1253 }
            r2.A06 = r5     // Catch:{ 3ER -> 0x1253 }
            java.lang.String r5 = "fingerprint"
            java.lang.String r5 = r8.A01(r5)     // Catch:{ 3ER -> 0x1253 }
            r2.A03 = r5     // Catch:{ 3ER -> 0x1253 }
            java.lang.String r5 = "country"
            java.lang.String r5 = r8.A01(r5)     // Catch:{ 3ER -> 0x1253 }
            r2.A01 = r5     // Catch:{ 3ER -> 0x1253 }
            java.lang.String r5 = "locale"
            java.lang.String r5 = r8.A01(r5)     // Catch:{ 3ER -> 0x1253 }
            r2.A05 = r5     // Catch:{ 3ER -> 0x1253 }
            java.lang.String r5 = "mcc_mnc"
            java.lang.String r5 = r8.A01(r5)     // Catch:{ 3ER -> 0x1253 }
            r2.A07 = r5     // Catch:{ 3ER -> 0x1253 }
            java.lang.String r5 = "application_build"
            java.lang.String r41 = r8.A01(r5)     // Catch:{ 3ER -> 0x1253 }
            java.lang.Integer r5 = r2.A00     // Catch:{ 3ER -> 0x1253 }
            r30 = r5
            java.lang.String r5 = r2.A08     // Catch:{ 3ER -> 0x1253 }
            r31 = r5
            java.lang.String r5 = r2.A04     // Catch:{ 3ER -> 0x1253 }
            r32 = r5
            java.lang.String r14 = r2.A02     // Catch:{ 3ER -> 0x1253 }
            java.lang.String r12 = r2.A0A     // Catch:{ 3ER -> 0x1253 }
            java.lang.String r11 = r2.A09     // Catch:{ 3ER -> 0x1253 }
            java.lang.String r10 = r2.A06     // Catch:{ 3ER -> 0x1253 }
            java.lang.String r9 = r2.A03     // Catch:{ 3ER -> 0x1253 }
            java.lang.String r8 = r2.A05     // Catch:{ 3ER -> 0x1253 }
            java.lang.String r6 = r2.A01     // Catch:{ 3ER -> 0x1253 }
            java.lang.String r5 = r2.A07     // Catch:{ 3ER -> 0x1253 }
            X.8R0 r2 = new X.8R0     // Catch:{ 3ER -> 0x1253 }
            r29 = r2
            r33 = r14
            r34 = r12
            r35 = r11
            r36 = r10
            r37 = r9
            r38 = r8
            r39 = r6
            r40 = r5
            r29.<init>(r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)     // Catch:{ 3ER -> 0x1253 }
            r13.A00 = r2     // Catch:{ 3ER -> 0x1253 }
            X.9IO r6 = r13.A01     // Catch:{ 3ER -> 0x1253 }
            X.8R2 r5 = new X.8R2     // Catch:{ 3ER -> 0x1253 }
            r5.<init>(r2, r6)     // Catch:{ 3ER -> 0x1253 }
            r3.A00 = r5     // Catch:{ 3ER -> 0x1253 }
            java.lang.String r2 = X.C17880vN.A0x(r26)     // Catch:{ NumberFormatException -> 0x0bd7 }
            java.lang.Integer r2 = X.C108955ca.A0l(r2)     // Catch:{ NumberFormatException -> 0x0bd7 }
            r3.A02 = r2     // Catch:{ NumberFormatException -> 0x0bd7 }
            goto L_0x0bdd
        L_0x0bd7:
            java.lang.String r2 = X.C17880vN.A0x(r26)     // Catch:{ 3ER -> 0x1253 }
            r3.A05 = r2     // Catch:{ 3ER -> 0x1253 }
        L_0x0bdd:
            java.util.ArrayList r2 = X.AnonymousClass000.A13()     // Catch:{ 3ER -> 0x1253 }
            java.lang.Object r5 = r26.getValue()     // Catch:{ 3ER -> 0x1253 }
            java.util.Iterator r13 = X.AnonymousClass8BR.A13(r5)     // Catch:{ 3ER -> 0x1253 }
        L_0x0be9:
            boolean r5 = r13.hasNext()     // Catch:{ 3ER -> 0x1253 }
            if (r5 == 0) goto L_0x0d1d
            java.lang.Object r9 = r13.next()     // Catch:{ 3ER -> 0x1253 }
            X.9Ns r9 = (X.C180739Ns) r9     // Catch:{ 3ER -> 0x1253 }
            X.8R7 r9 = (X.AnonymousClass8R7) r9     // Catch:{ 3ER -> 0x1253 }
            X.9pq r10 = r9.A02     // Catch:{ 3ER -> 0x1253 }
            X.0xy r8 = r10.A00     // Catch:{ 3ER -> 0x1253 }
            java.lang.String r6 = "proto"
            X.0xy r5 = new X.0xy     // Catch:{ 3ER -> 0x1253 }
            r5.<init>(r6)     // Catch:{ 3ER -> 0x1253 }
            boolean r5 = r8.equals(r5)     // Catch:{ 3ER -> 0x1253 }
            if (r5 == 0) goto L_0x0cde
            byte[] r5 = r10.A01     // Catch:{ 3ER -> 0x1253 }
            X.9gV r8 = new X.9gV     // Catch:{ 3ER -> 0x1253 }
            r8.<init>()     // Catch:{ 3ER -> 0x1253 }
            r8.A06 = r5     // Catch:{ 3ER -> 0x1253 }
        L_0x0c11:
            long r5 = r9.A00     // Catch:{ 3ER -> 0x1253 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ 3ER -> 0x1253 }
            r8.A02 = r5     // Catch:{ 3ER -> 0x1253 }
            long r5 = r9.A01     // Catch:{ 3ER -> 0x1253 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ 3ER -> 0x1253 }
            r8.A03 = r5     // Catch:{ 3ER -> 0x1253 }
            java.lang.String r5 = "tz-offset"
            java.util.Map r6 = r9.A05     // Catch:{ 3ER -> 0x1253 }
            java.lang.String r5 = X.C17880vN.A0s(r5, r6)     // Catch:{ 3ER -> 0x1253 }
            if (r5 != 0) goto L_0x0c2e
            r10 = 0
            goto L_0x0c36
        L_0x0c2e:
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ 3ER -> 0x1253 }
            long r10 = r5.longValue()     // Catch:{ 3ER -> 0x1253 }
        L_0x0c36:
            java.lang.Long r5 = java.lang.Long.valueOf(r10)     // Catch:{ 3ER -> 0x1253 }
            r8.A04 = r5     // Catch:{ 3ER -> 0x1253 }
            X.9Uf r11 = new X.9Uf     // Catch:{ 3ER -> 0x1253 }
            r11.<init>()     // Catch:{ 3ER -> 0x1253 }
            java.lang.String r5 = "net-type"
            java.lang.String r5 = X.C17880vN.A0s(r5, r6)     // Catch:{ 3ER -> 0x1253 }
            if (r5 != 0) goto L_0x0c4b
            r10 = 0
            goto L_0x0c53
        L_0x0c4b:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ 3ER -> 0x1253 }
            int r10 = r5.intValue()     // Catch:{ 3ER -> 0x1253 }
        L_0x0c53:
            android.util.SparseArray r5 = X.C24313BzA.A00     // Catch:{ 3ER -> 0x1253 }
            java.lang.Object r5 = r5.get(r10)     // Catch:{ 3ER -> 0x1253 }
            X.BzA r5 = (X.C24313BzA) r5     // Catch:{ 3ER -> 0x1253 }
            r11.A00 = r5     // Catch:{ 3ER -> 0x1253 }
            java.lang.String r5 = "mobile-subtype"
            java.lang.String r5 = X.C17880vN.A0s(r5, r6)     // Catch:{ 3ER -> 0x1253 }
            if (r5 != 0) goto L_0x0c67
            r6 = 0
            goto L_0x0c6f
        L_0x0c67:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ 3ER -> 0x1253 }
            int r6 = r5.intValue()     // Catch:{ 3ER -> 0x1253 }
        L_0x0c6f:
            android.util.SparseArray r5 = X.AnonymousClass9IS.A00     // Catch:{ 3ER -> 0x1253 }
            java.lang.Object r10 = r5.get(r6)     // Catch:{ 3ER -> 0x1253 }
            X.9IS r10 = (X.AnonymousClass9IS) r10     // Catch:{ 3ER -> 0x1253 }
            X.BzA r5 = r11.A00     // Catch:{ 3ER -> 0x1253 }
            X.8R6 r6 = new X.8R6     // Catch:{ 3ER -> 0x1253 }
            r6.<init>(r10, r5)     // Catch:{ 3ER -> 0x1253 }
            r8.A00 = r6     // Catch:{ 3ER -> 0x1253 }
            java.lang.Integer r5 = r9.A03     // Catch:{ 3ER -> 0x1253 }
            if (r5 == 0) goto L_0x0c86
            r8.A01 = r5     // Catch:{ 3ER -> 0x1253 }
        L_0x0c86:
            java.lang.Long r12 = r8.A02     // Catch:{ 3ER -> 0x1253 }
            r10 = r28
            if (r12 != 0) goto L_0x0c96
            java.lang.StringBuilder r9 = X.AnonymousClass000.A11(r28)     // Catch:{ 3ER -> 0x1253 }
            java.lang.String r5 = " eventTimeMs"
            java.lang.String r10 = X.AnonymousClass000.A0y(r5, r9)     // Catch:{ 3ER -> 0x1253 }
        L_0x0c96:
            java.lang.Long r9 = r8.A03     // Catch:{ 3ER -> 0x1253 }
            if (r9 != 0) goto L_0x0ca4
            java.lang.StringBuilder r10 = X.AnonymousClass000.A11(r10)     // Catch:{ 3ER -> 0x1253 }
            java.lang.String r5 = " eventUptimeMs"
            java.lang.String r10 = X.AnonymousClass000.A0y(r5, r10)     // Catch:{ 3ER -> 0x1253 }
        L_0x0ca4:
            java.lang.Long r5 = r8.A04     // Catch:{ 3ER -> 0x1253 }
            if (r5 != 0) goto L_0x0cb2
            java.lang.StringBuilder r11 = X.AnonymousClass000.A11(r10)     // Catch:{ 3ER -> 0x1253 }
            java.lang.String r10 = " timezoneOffsetSeconds"
            java.lang.String r10 = X.AnonymousClass000.A0y(r10, r11)     // Catch:{ 3ER -> 0x1253 }
        L_0x0cb2:
            boolean r11 = r10.isEmpty()     // Catch:{ 3ER -> 0x1253 }
            if (r11 == 0) goto L_0x1245
            long r34 = r12.longValue()     // Catch:{ 3ER -> 0x1253 }
            java.lang.Integer r10 = r8.A01     // Catch:{ 3ER -> 0x1253 }
            long r36 = r9.longValue()     // Catch:{ 3ER -> 0x1253 }
            byte[] r9 = r8.A06     // Catch:{ 3ER -> 0x1253 }
            java.lang.String r8 = r8.A05     // Catch:{ 3ER -> 0x1253 }
            long r38 = r5.longValue()     // Catch:{ 3ER -> 0x1253 }
            X.8R3 r5 = new X.8R3     // Catch:{ 3ER -> 0x1253 }
            r29 = r5
            r30 = r6
            r31 = r10
            r32 = r8
            r33 = r9
            r29.<init>(r30, r31, r32, r33, r34, r36, r38)     // Catch:{ 3ER -> 0x1253 }
            r2.add(r5)     // Catch:{ 3ER -> 0x1253 }
            goto L_0x0be9
        L_0x0cde:
            java.lang.String r6 = "json"
            X.0xy r5 = new X.0xy     // Catch:{ 3ER -> 0x1253 }
            r5.<init>(r6)     // Catch:{ 3ER -> 0x1253 }
            boolean r5 = r8.equals(r5)     // Catch:{ 3ER -> 0x1253 }
            if (r5 == 0) goto L_0x0d01
            byte[] r8 = r10.A01     // Catch:{ 3ER -> 0x1253 }
            java.lang.String r5 = "UTF-8"
            java.nio.charset.Charset r6 = java.nio.charset.Charset.forName(r5)     // Catch:{ 3ER -> 0x1253 }
            java.lang.String r5 = new java.lang.String     // Catch:{ 3ER -> 0x1253 }
            r5.<init>(r8, r6)     // Catch:{ 3ER -> 0x1253 }
            X.9gV r8 = new X.9gV     // Catch:{ 3ER -> 0x1253 }
            r8.<init>()     // Catch:{ 3ER -> 0x1253 }
            r8.A05 = r5     // Catch:{ 3ER -> 0x1253 }
            goto L_0x0c11
        L_0x0d01:
            java.lang.String r5 = "CctTransportBackend"
            java.lang.String r9 = "Received event of unsupported encoding %s. Skipping..."
            java.lang.String r6 = X.A3G.A00(r5)     // Catch:{ 3ER -> 0x1253 }
            r5 = 5
            boolean r5 = android.util.Log.isLoggable(r6, r5)     // Catch:{ 3ER -> 0x1253 }
            if (r5 == 0) goto L_0x0be9
            java.lang.Object[] r5 = X.AnonymousClass8BV.A1b(r8)     // Catch:{ 3ER -> 0x1253 }
            java.lang.String r5 = java.lang.String.format(r9, r5)     // Catch:{ 3ER -> 0x1253 }
            android.util.Log.w(r6, r5)     // Catch:{ 3ER -> 0x1253 }
            goto L_0x0be9
        L_0x0d1d:
            r3.A06 = r2     // Catch:{ 3ER -> 0x1253 }
            java.lang.Long r9 = r3.A03     // Catch:{ 3ER -> 0x1253 }
            r5 = r28
            if (r9 != 0) goto L_0x0d2f
            java.lang.StringBuilder r6 = X.AnonymousClass000.A11(r28)     // Catch:{ 3ER -> 0x1253 }
            java.lang.String r5 = " requestTimeMs"
            java.lang.String r5 = X.AnonymousClass000.A0y(r5, r6)     // Catch:{ 3ER -> 0x1253 }
        L_0x0d2f:
            java.lang.Long r6 = r3.A04     // Catch:{ 3ER -> 0x1253 }
            if (r6 != 0) goto L_0x0d3d
            java.lang.StringBuilder r8 = X.AnonymousClass000.A11(r5)     // Catch:{ 3ER -> 0x1253 }
            java.lang.String r5 = " requestUptimeMs"
            java.lang.String r5 = X.AnonymousClass000.A0y(r5, r8)     // Catch:{ 3ER -> 0x1253 }
        L_0x0d3d:
            boolean r8 = r5.isEmpty()     // Catch:{ 3ER -> 0x1253 }
            if (r8 == 0) goto L_0x1153
            long r35 = r9.longValue()     // Catch:{ 3ER -> 0x1253 }
            long r37 = r6.longValue()     // Catch:{ 3ER -> 0x1253 }
            X.9Os r9 = r3.A00     // Catch:{ 3ER -> 0x1253 }
            java.lang.Integer r8 = r3.A02     // Catch:{ 3ER -> 0x1253 }
            java.lang.String r6 = r3.A05     // Catch:{ 3ER -> 0x1253 }
            X.BzB r5 = r3.A01     // Catch:{ 3ER -> 0x1253 }
            X.8R4 r3 = new X.8R4     // Catch:{ 3ER -> 0x1253 }
            r29 = r3
            r30 = r9
            r31 = r5
            r32 = r8
            r33 = r6
            r34 = r2
            r29.<init>(r30, r31, r32, r33, r34, r35, r37)     // Catch:{ 3ER -> 0x1253 }
            r7.add(r3)     // Catch:{ 3ER -> 0x1253 }
            goto L_0x0ad6
        L_0x0d69:
            X.8R1 r5 = new X.8R1     // Catch:{ 3ER -> 0x1253 }
            r5.<init>(r7)     // Catch:{ 3ER -> 0x1253 }
            java.net.URL r6 = r4.A05     // Catch:{ 3ER -> 0x1253 }
            r3 = 0
            if (r15 == 0) goto L_0x0de5
            java.lang.String r2 = "UTF-8"
            java.nio.charset.Charset r7 = java.nio.charset.Charset.forName(r2)     // Catch:{ IllegalArgumentException -> 0x1024 }
            java.lang.String r2 = new java.lang.String     // Catch:{ IllegalArgumentException -> 0x1024 }
            r2.<init>(r15, r7)     // Catch:{ IllegalArgumentException -> 0x1024 }
            java.lang.String r7 = "1$"
            boolean r7 = r2.startsWith(r7)     // Catch:{ IllegalArgumentException -> 0x1024 }
            if (r7 == 0) goto L_0x0dd7
            r8 = 2
            java.lang.String r7 = r2.substring(r8)     // Catch:{ IllegalArgumentException -> 0x1024 }
            java.lang.String r2 = "\\"
            java.lang.String r2 = java.util.regex.Pattern.quote(r2)     // Catch:{ IllegalArgumentException -> 0x1024 }
            java.lang.String[] r7 = r7.split(r2, r8)     // Catch:{ IllegalArgumentException -> 0x1024 }
            int r2 = r7.length     // Catch:{ IllegalArgumentException -> 0x1024 }
            if (r2 != r8) goto L_0x0dd0
            r2 = 0
            r8 = r7[r2]     // Catch:{ IllegalArgumentException -> 0x1024 }
            boolean r2 = r8.isEmpty()     // Catch:{ IllegalArgumentException -> 0x1024 }
            if (r2 != 0) goto L_0x0dde
            r2 = 1
            r7 = r7[r2]     // Catch:{ IllegalArgumentException -> 0x1024 }
            boolean r2 = r7.isEmpty()     // Catch:{ IllegalArgumentException -> 0x1024 }
            if (r2 == 0) goto L_0x0dab
            r7 = 0
        L_0x0dab:
            X.0yC r2 = new X.0yC     // Catch:{ IllegalArgumentException -> 0x1024 }
            r2.<init>(r8, r7)     // Catch:{ IllegalArgumentException -> 0x1024 }
            java.lang.String r7 = r2.A00     // Catch:{ IllegalArgumentException -> 0x1024 }
            if (r7 == 0) goto L_0x0db5
            r3 = r7
        L_0x0db5:
            java.lang.String r2 = r2.A01     // Catch:{ IllegalArgumentException -> 0x1024 }
            if (r2 == 0) goto L_0x0de5
            java.net.URL r6 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0dbf }
            r6.<init>(r2)     // Catch:{ MalformedURLException -> 0x0dbf }
            goto L_0x0de5
        L_0x0dbf:
            r4 = move-exception
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()     // Catch:{ IllegalArgumentException -> 0x1024 }
            java.lang.String r3 = "Invalid url: "
            java.lang.String r2 = X.AnonymousClass001.A1H(r3, r2, r5)     // Catch:{ IllegalArgumentException -> 0x1024 }
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x1024 }
            r3.<init>(r2, r4)     // Catch:{ IllegalArgumentException -> 0x1024 }
            goto L_0x0de4
        L_0x0dd0:
            java.lang.String r2 = "Extra is not a valid encoded LegacyFlgDestination"
            java.lang.IllegalArgumentException r3 = X.AnonymousClass000.A0k(r2)     // Catch:{ IllegalArgumentException -> 0x1024 }
            goto L_0x0de4
        L_0x0dd7:
            java.lang.String r2 = "Version marker missing from extras"
            java.lang.IllegalArgumentException r3 = X.AnonymousClass000.A0k(r2)     // Catch:{ IllegalArgumentException -> 0x1024 }
            goto L_0x0de4
        L_0x0dde:
            java.lang.String r2 = "Missing endpoint in CCTDestination extras"
            java.lang.IllegalArgumentException r3 = X.AnonymousClass000.A0k(r2)     // Catch:{ IllegalArgumentException -> 0x1024 }
        L_0x0de4:
            throw r3     // Catch:{ IllegalArgumentException -> 0x1024 }
        L_0x0de5:
            X.9cU r8 = new X.9cU     // Catch:{ IOException -> 0x1019 }
            r8.<init>(r5, r3, r6)     // Catch:{ IOException -> 0x1019 }
            X.9Ue r29 = new X.9Ue     // Catch:{ IOException -> 0x1019 }
            r2 = r29
            r2.<init>(r4)     // Catch:{ IOException -> 0x1019 }
            r28 = 5
            r9 = 1
        L_0x0df4:
            r2 = r29
            X.AJ3 r3 = r2.A00     // Catch:{ IOException -> 0x1019 }
            java.lang.String r10 = "Making request to: %s"
            java.net.URL r6 = r8.A02     // Catch:{ IOException -> 0x1019 }
            java.lang.String r7 = "CctTransportBackend"
            java.lang.String r5 = X.A3G.A00(r7)     // Catch:{ IOException -> 0x1019 }
            r2 = 4
            boolean r2 = android.util.Log.isLoggable(r5, r2)     // Catch:{ IOException -> 0x1019 }
            if (r2 == 0) goto L_0x0e13
            java.lang.Object[] r4 = new java.lang.Object[r9]     // Catch:{ IOException -> 0x1019 }
            r2 = 0
            java.lang.String r2 = X.AnonymousClass8BS.A0l(r6, r10, r4, r2)     // Catch:{ IOException -> 0x1019 }
            android.util.Log.i(r5, r2)     // Catch:{ IOException -> 0x1019 }
        L_0x0e13:
            java.net.URLConnection r14 = r6.openConnection()     // Catch:{ IOException -> 0x1019 }
            java.net.HttpURLConnection r14 = (java.net.HttpURLConnection) r14     // Catch:{ IOException -> 0x1019 }
            r2 = 30000(0x7530, float:4.2039E-41)
            r14.setConnectTimeout(r2)     // Catch:{ IOException -> 0x1019 }
            r2 = 130000(0x1fbd0, float:1.82169E-40)
            r14.setReadTimeout(r2)     // Catch:{ IOException -> 0x1019 }
            r14.setDoOutput(r9)     // Catch:{ IOException -> 0x1019 }
            r2 = 0
            r14.setInstanceFollowRedirects(r2)     // Catch:{ IOException -> 0x1019 }
            java.lang.String r4 = "POST"
            r14.setRequestMethod(r4)     // Catch:{ IOException -> 0x1019 }
            java.lang.Object[] r4 = new java.lang.Object[r9]     // Catch:{ IOException -> 0x1019 }
            java.lang.String r5 = "3.1.8"
            r4[r2] = r5     // Catch:{ IOException -> 0x1019 }
            java.lang.String r2 = "datatransport/%s android/"
            java.lang.String r4 = java.lang.String.format(r2, r4)     // Catch:{ IOException -> 0x1019 }
            java.lang.String r2 = "User-Agent"
            r14.setRequestProperty(r2, r4)     // Catch:{ IOException -> 0x1019 }
            java.lang.String r13 = "Content-Encoding"
            java.lang.String r12 = "gzip"
            r14.setRequestProperty(r13, r12)     // Catch:{ IOException -> 0x1019 }
            java.lang.String r4 = "application/json"
            java.lang.String r27 = "Content-Type"
            r2 = r27
            r14.setRequestProperty(r2, r4)     // Catch:{ IOException -> 0x1019 }
            java.lang.String r2 = "Accept-Encoding"
            r14.setRequestProperty(r2, r12)     // Catch:{ IOException -> 0x1019 }
            java.lang.String r4 = r8.A01     // Catch:{ IOException -> 0x1019 }
            if (r4 == 0) goto L_0x0e5f
            java.lang.String r2 = "X-Goog-Api-Key"
            r14.setRequestProperty(r2, r4)     // Catch:{ IOException -> 0x1019 }
        L_0x0e5f:
            r5 = 0
            r26 = 0
            java.io.OutputStream r15 = r14.getOutputStream()     // Catch:{ ConnectException | UnknownHostException -> 0x0f8f, AmU | IOException -> 0x0f86 }
            java.util.zip.GZIPOutputStream r11 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x0f7a }
            r11.<init>(r15)     // Catch:{ all -> 0x0f7a }
            X.9Ug r3 = r3.A04     // Catch:{ all -> 0x0f70 }
            X.9Or r10 = r8.A00     // Catch:{ all -> 0x0f70 }
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x0f70 }
            r2.<init>(r11)     // Catch:{ all -> 0x0f70 }
            java.io.BufferedWriter r4 = new java.io.BufferedWriter     // Catch:{ all -> 0x0f70 }
            r4.<init>(r2)     // Catch:{ all -> 0x0f70 }
            X.AJj r3 = r3.A00     // Catch:{ all -> 0x0f70 }
            X.BDi r2 = X.C20396AJj.A05     // Catch:{ all -> 0x0f70 }
            java.util.Map r2 = r3.A02     // Catch:{ all -> 0x0f70 }
            r33 = r2
            java.util.Map r2 = r3.A03     // Catch:{ all -> 0x0f70 }
            r34 = r2
            X.BDh r2 = r3.A00     // Catch:{ all -> 0x0f70 }
            r30 = r2
            boolean r3 = r3.A01     // Catch:{ all -> 0x0f70 }
            X.AJe r2 = new X.AJe     // Catch:{ all -> 0x0f70 }
            r31 = r30
            r32 = r4
            r35 = r3
            r30 = r2
            r30.<init>(r31, r32, r33, r34, r35)     // Catch:{ all -> 0x0f70 }
            r2.A00(r10)     // Catch:{ all -> 0x0f70 }
            android.util.JsonWriter r2 = r2.A00     // Catch:{ all -> 0x0f70 }
            r2.flush()     // Catch:{ all -> 0x0f70 }
            r11.close()     // Catch:{ all -> 0x0f7a }
            if (r15 == 0) goto L_0x0ea9
            r15.close()     // Catch:{ ConnectException | UnknownHostException -> 0x0f8f, AmU | IOException -> 0x0f86 }
        L_0x0ea9:
            int r4 = r14.getResponseCode()     // Catch:{ IOException -> 0x1019 }
            java.lang.String r15 = "Status Code: %d"
            java.lang.Integer r11 = java.lang.Integer.valueOf(r4)     // Catch:{ IOException -> 0x1019 }
            java.lang.String r10 = X.A3G.A00(r7)     // Catch:{ IOException -> 0x1019 }
            r2 = 4
            boolean r2 = android.util.Log.isLoggable(r10, r2)     // Catch:{ IOException -> 0x1019 }
            if (r2 == 0) goto L_0x0ec8
            java.lang.Object[] r3 = new java.lang.Object[r9]     // Catch:{ IOException -> 0x1019 }
            r2 = 0
            java.lang.String r2 = X.AnonymousClass8BS.A0l(r11, r15, r3, r2)     // Catch:{ IOException -> 0x1019 }
            android.util.Log.i(r10, r2)     // Catch:{ IOException -> 0x1019 }
        L_0x0ec8:
            java.lang.String r3 = "Content-Type: %s"
            r2 = r27
            java.lang.String r2 = r14.getHeaderField(r2)     // Catch:{ IOException -> 0x1019 }
            X.A3G.A01(r2, r7, r3)     // Catch:{ IOException -> 0x1019 }
            java.lang.String r3 = "Content-Encoding: %s"
            java.lang.String r2 = r14.getHeaderField(r13)     // Catch:{ IOException -> 0x1019 }
            X.A3G.A01(r2, r7, r3)     // Catch:{ IOException -> 0x1019 }
            r2 = 302(0x12e, float:4.23E-43)
            if (r4 == r2) goto L_0x0f5f
            r2 = 301(0x12d, float:4.22E-43)
            if (r4 == r2) goto L_0x0f5f
            r2 = 307(0x133, float:4.3E-43)
            if (r4 == r2) goto L_0x0f5f
            r2 = 200(0xc8, float:2.8E-43)
            if (r4 == r2) goto L_0x0ef5
            X.9cV r11 = new X.9cV     // Catch:{ IOException -> 0x1019 }
            r2 = r26
            r11.<init>(r2, r4, r5)     // Catch:{ IOException -> 0x1019 }
            goto L_0x0fa2
        L_0x0ef5:
            java.io.InputStream r5 = r14.getInputStream()     // Catch:{ IOException -> 0x1019 }
            java.lang.String r2 = r14.getHeaderField(r13)     // Catch:{ all -> 0x0fd3 }
            boolean r2 = r12.equals(r2)     // Catch:{ all -> 0x0fd3 }
            if (r2 == 0) goto L_0x0f09
            java.util.zip.GZIPInputStream r6 = new java.util.zip.GZIPInputStream     // Catch:{ all -> 0x0fd3 }
            r6.<init>(r5)     // Catch:{ all -> 0x0fd3 }
            goto L_0x0f0a
        L_0x0f09:
            r6 = r5
        L_0x0f0a:
            java.io.BufferedReader r2 = X.AnonymousClass8BW.A0W(r6)     // Catch:{ all -> 0x0fc7 }
            android.util.JsonReader r11 = new android.util.JsonReader     // Catch:{ all -> 0x0fc7 }
            r11.<init>(r2)     // Catch:{ all -> 0x0fc7 }
            r11.beginObject()     // Catch:{ all -> 0x0fc2 }
        L_0x0f16:
            boolean r2 = r11.hasNext()     // Catch:{ all -> 0x0fc2 }
            if (r2 == 0) goto L_0x0fbb
            java.lang.String r3 = r11.nextName()     // Catch:{ all -> 0x0fc2 }
            java.lang.String r2 = "nextRequestWaitMillis"
            boolean r2 = r3.equals(r2)     // Catch:{ all -> 0x0fc2 }
            if (r2 == 0) goto L_0x0f3e
            android.util.JsonToken r3 = r11.peek()     // Catch:{ all -> 0x0fc2 }
            android.util.JsonToken r2 = android.util.JsonToken.STRING     // Catch:{ all -> 0x0fc2 }
            if (r3 != r2) goto L_0x0f42
            java.lang.String r2 = r11.nextString()     // Catch:{ all -> 0x0fc2 }
            long r2 = java.lang.Long.parseLong(r2)     // Catch:{ all -> 0x0fc2 }
            X.8R5 r10 = new X.8R5     // Catch:{ all -> 0x0fc2 }
            r10.<init>(r2)     // Catch:{ all -> 0x0fc2 }
            goto L_0x0f4b
        L_0x0f3e:
            r11.skipValue()     // Catch:{ all -> 0x0fc2 }
            goto L_0x0f16
        L_0x0f42:
            long r2 = r11.nextLong()     // Catch:{ all -> 0x0fc2 }
            X.8R5 r10 = new X.8R5     // Catch:{ all -> 0x0fc2 }
            r10.<init>(r2)     // Catch:{ all -> 0x0fc2 }
        L_0x0f4b:
            r11.close()     // Catch:{ all -> 0x0fc7 }
            long r2 = r10.A00     // Catch:{ all -> 0x0fc7 }
            X.9cV r11 = new X.9cV     // Catch:{ all -> 0x0fc7 }
            r10 = r26
            r11.<init>(r10, r4, r2)     // Catch:{ all -> 0x0fc7 }
            if (r6 == 0) goto L_0x0f5c
            r6.close()     // Catch:{ all -> 0x0fd3 }
        L_0x0f5c:
            if (r5 == 0) goto L_0x0fa2
            goto L_0x0f9f
        L_0x0f5f:
            java.lang.String r2 = "Location"
            java.lang.String r3 = r14.getHeaderField(r2)     // Catch:{ IOException -> 0x1019 }
            java.net.URL r2 = new java.net.URL     // Catch:{ IOException -> 0x1019 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x1019 }
            X.9cV r11 = new X.9cV     // Catch:{ IOException -> 0x1019 }
            r11.<init>(r2, r4, r5)     // Catch:{ IOException -> 0x1019 }
            goto L_0x0fa2
        L_0x0f70:
            r2 = move-exception
            r11.close()     // Catch:{ all -> 0x0f75 }
            goto L_0x0f79
        L_0x0f75:
            r3 = move-exception
            X.AnonymousClass0DT.A00(r2, r3)     // Catch:{ all -> 0x0f7a }
        L_0x0f79:
            throw r2     // Catch:{ all -> 0x0f7a }
        L_0x0f7a:
            r2 = move-exception
            if (r15 == 0) goto L_0x0f85
            r15.close()     // Catch:{ all -> 0x0f81 }
            goto L_0x0f85
        L_0x0f81:
            r3 = move-exception
            X.AnonymousClass0DT.A00(r2, r3)     // Catch:{ ConnectException | UnknownHostException -> 0x0f8f, AmU | IOException -> 0x0f86 }
        L_0x0f85:
            throw r2     // Catch:{ ConnectException | UnknownHostException -> 0x0f8f, AmU | IOException -> 0x0f86 }
        L_0x0f86:
            r3 = move-exception
            java.lang.String r2 = "Couldn't encode request, returning with 400"
            X.A3G.A02(r7, r2, r3)     // Catch:{ IOException -> 0x1019 }
            r3 = 400(0x190, float:5.6E-43)
            goto L_0x0f97
        L_0x0f8f:
            r3 = move-exception
            java.lang.String r2 = "Couldn't open connection, returning with 500"
            X.A3G.A02(r7, r2, r3)     // Catch:{ IOException -> 0x1019 }
            r3 = 500(0x1f4, float:7.0E-43)
        L_0x0f97:
            X.9cV r11 = new X.9cV     // Catch:{ IOException -> 0x1019 }
            r2 = r26
            r11.<init>(r2, r3, r5)     // Catch:{ IOException -> 0x1019 }
            goto L_0x0fa2
        L_0x0f9f:
            r5.close()     // Catch:{ IOException -> 0x1019 }
        L_0x0fa2:
            java.net.URL r3 = r11.A02     // Catch:{ IOException -> 0x1019 }
            if (r3 == 0) goto L_0x0fdf
            java.lang.String r2 = "Following redirect to: %s"
            X.A3G.A01(r3, r7, r2)     // Catch:{ IOException -> 0x1019 }
            X.9Or r4 = r8.A00     // Catch:{ IOException -> 0x1019 }
            java.lang.String r2 = r8.A01     // Catch:{ IOException -> 0x1019 }
            X.9cU r8 = new X.9cU     // Catch:{ IOException -> 0x1019 }
            r8.<init>(r4, r2, r3)     // Catch:{ IOException -> 0x1019 }
            int r28 = r28 + -1
            r2 = r28
            if (r2 >= r9) goto L_0x0df4
            goto L_0x0fdf
        L_0x0fbb:
            java.lang.String r2 = "Response is missing nextRequestWaitMillis field."
            java.io.IOException r2 = X.C17880vN.A0f(r2)     // Catch:{ all -> 0x0fc2 }
            throw r2     // Catch:{ all -> 0x0fc2 }
        L_0x0fc2:
            r2 = move-exception
            r11.close()     // Catch:{ all -> 0x0fc7 }
            throw r2     // Catch:{ all -> 0x0fc7 }
        L_0x0fc7:
            r3 = move-exception
            if (r6 == 0) goto L_0x0fd2
            r6.close()     // Catch:{ all -> 0x0fce }
            goto L_0x0fd2
        L_0x0fce:
            r2 = move-exception
            X.AnonymousClass0DT.A00(r3, r2)     // Catch:{ all -> 0x0fd3 }
        L_0x0fd2:
            throw r3     // Catch:{ all -> 0x0fd3 }
        L_0x0fd3:
            r3 = move-exception
            if (r5 == 0) goto L_0x0fde
            r5.close()     // Catch:{ all -> 0x0fda }
            goto L_0x0fde
        L_0x0fda:
            r2 = move-exception
            X.AnonymousClass0DT.A00(r3, r2)     // Catch:{ IOException -> 0x1019 }
        L_0x0fde:
            throw r3     // Catch:{ IOException -> 0x1019 }
        L_0x0fdf:
            int r3 = r11.A00     // Catch:{ IOException -> 0x1019 }
            r2 = 200(0xc8, float:2.8E-43)
            if (r3 != r2) goto L_0x0fef
            long r2 = r11.A01     // Catch:{ IOException -> 0x1019 }
            X.8R8 r5 = new X.8R8     // Catch:{ IOException -> 0x1019 }
            r4 = r23
            r5.<init>(r4, r2)     // Catch:{ IOException -> 0x1019 }
            goto L_0x102d
        L_0x0fef:
            r2 = 500(0x1f4, float:7.0E-43)
            if (r3 >= r2) goto L_0x100f
            r2 = 404(0x194, float:5.66E-43)
            if (r3 == r2) goto L_0x100f
            r2 = 400(0x190, float:5.6E-43)
            if (r3 != r2) goto L_0x1005
            java.lang.Integer r4 = X.AnonymousClass00R.A0N     // Catch:{ IOException -> 0x1019 }
            r2 = -1
            X.8R8 r5 = new X.8R8     // Catch:{ IOException -> 0x1019 }
            r5.<init>(r4, r2)     // Catch:{ IOException -> 0x1019 }
            goto L_0x102d
        L_0x1005:
            java.lang.Integer r4 = X.AnonymousClass00R.A0C     // Catch:{ IOException -> 0x1019 }
            r2 = -1
            X.8R8 r5 = new X.8R8     // Catch:{ IOException -> 0x1019 }
            r5.<init>(r4, r2)     // Catch:{ IOException -> 0x1019 }
            goto L_0x102d
        L_0x100f:
            java.lang.Integer r4 = X.AnonymousClass00R.A01     // Catch:{ IOException -> 0x1019 }
            r2 = -1
            X.8R8 r5 = new X.8R8     // Catch:{ IOException -> 0x1019 }
            r5.<init>(r4, r2)     // Catch:{ IOException -> 0x1019 }
            goto L_0x102d
        L_0x1019:
            r4 = move-exception
            java.lang.String r3 = "CctTransportBackend"
            java.lang.String r2 = "Could not make request to the backend"
            X.A3G.A02(r3, r2, r4)     // Catch:{ 3ER -> 0x1253 }
            java.lang.Integer r4 = X.AnonymousClass00R.A01     // Catch:{ 3ER -> 0x1253 }
            goto L_0x1026
        L_0x1024:
            java.lang.Integer r4 = X.AnonymousClass00R.A0C     // Catch:{ 3ER -> 0x1253 }
        L_0x1026:
            r2 = -1
            X.8R8 r5 = new X.8R8     // Catch:{ 3ER -> 0x1253 }
            r5.<init>(r4, r2)     // Catch:{ 3ER -> 0x1253 }
        L_0x102d:
            java.lang.Integer r7 = r5.A01     // Catch:{ 3ER -> 0x1253 }
            java.lang.Integer r2 = X.AnonymousClass00R.A01     // Catch:{ 3ER -> 0x1253 }
            r6 = 1
            if (r7 != r2) goto L_0x103d
            android.database.sqlite.SQLiteDatabase r4 = r0.A04()     // Catch:{ 3ER -> 0x1253 }
            X.C19280xx.A03(r4, r0)     // Catch:{ 3ER -> 0x1253 }
            goto L_0x1162
        L_0x103d:
            android.database.sqlite.SQLiteDatabase r4 = r0.A04()     // Catch:{ 3ER -> 0x1253 }
            X.C19280xx.A03(r4, r0)     // Catch:{ 3ER -> 0x1253 }
            java.util.Iterator r2 = r21.iterator()     // Catch:{ all -> 0x1240 }
            boolean r2 = r2.hasNext()     // Catch:{ all -> 0x1240 }
            if (r2 == 0) goto L_0x106a
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x1240 }
            java.lang.String r2 = "DELETE FROM events WHERE _id in "
            r3.append(r2)     // Catch:{ all -> 0x1240 }
            java.lang.String r2 = X.C19280xx.A01(r21)     // Catch:{ all -> 0x1240 }
            java.lang.String r3 = X.AnonymousClass000.A0y(r2, r3)     // Catch:{ all -> 0x1240 }
            android.database.sqlite.SQLiteDatabase r2 = r43.A04()     // Catch:{ all -> 0x1240 }
            android.database.sqlite.SQLiteStatement r2 = r2.compileStatement(r3)     // Catch:{ all -> 0x1240 }
            r2.execute()     // Catch:{ all -> 0x1240 }
        L_0x106a:
            r4.setTransactionSuccessful()     // Catch:{ all -> 0x1240 }
            r4.endTransaction()     // Catch:{ 3ER -> 0x1253 }
            r2 = r23
            if (r7 != r2) goto L_0x10bb
            long r4 = r5.A00     // Catch:{ 3ER -> 0x1253 }
            r2 = r16
            long r16 = java.lang.Math.max(r2, r4)     // Catch:{ 3ER -> 0x1253 }
            r2 = r42
            byte[] r2 = r2.A02     // Catch:{ 3ER -> 0x1253 }
            if (r2 == 0) goto L_0x073d
            android.database.sqlite.SQLiteDatabase r4 = r0.A04()     // Catch:{ 3ER -> 0x1253 }
            X.C19280xx.A03(r4, r0)     // Catch:{ 3ER -> 0x1253 }
            X.0xv r3 = r1.A03     // Catch:{ all -> 0x1240 }
            X.0xx r3 = (X.C19280xx) r3     // Catch:{ all -> 0x1240 }
            android.database.sqlite.SQLiteDatabase r5 = r3.A04()     // Catch:{ all -> 0x1240 }
            r5.beginTransaction()     // Catch:{ all -> 0x1240 }
            java.lang.String r2 = "DELETE FROM log_event_dropped"
            android.database.sqlite.SQLiteStatement r2 = r5.compileStatement(r2)     // Catch:{ all -> 0x123b }
            r2.execute()     // Catch:{ all -> 0x123b }
            java.lang.StringBuilder r6 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x123b }
            java.lang.String r2 = "UPDATE global_log_event_state SET last_metrics_upload_ms="
            r6.append(r2)     // Catch:{ all -> 0x123b }
            X.0xi r2 = r3.A02     // Catch:{ all -> 0x123b }
            long r2 = r2.BaO()     // Catch:{ all -> 0x123b }
            java.lang.String r2 = X.C17880vN.A0u(r6, r2)     // Catch:{ all -> 0x123b }
            android.database.sqlite.SQLiteStatement r2 = r5.compileStatement(r2)     // Catch:{ all -> 0x123b }
            r2.execute()     // Catch:{ all -> 0x123b }
            r5.setTransactionSuccessful()     // Catch:{ all -> 0x123b }
            goto L_0x1126
        L_0x10bb:
            java.lang.Integer r2 = X.AnonymousClass00R.A0N     // Catch:{ 3ER -> 0x1253 }
            if (r7 != r2) goto L_0x073d
            java.util.HashMap r3 = X.C17880vN.A11()     // Catch:{ 3ER -> 0x1253 }
            java.util.Iterator r5 = r21.iterator()     // Catch:{ 3ER -> 0x1253 }
        L_0x10c7:
            boolean r2 = r5.hasNext()     // Catch:{ 3ER -> 0x1253 }
            if (r2 == 0) goto L_0x10fa
            java.lang.Object r2 = r5.next()     // Catch:{ 3ER -> 0x1253 }
            X.9Lt r2 = (X.C180259Lt) r2     // Catch:{ 3ER -> 0x1253 }
            X.8R9 r2 = (X.AnonymousClass8R9) r2     // Catch:{ 3ER -> 0x1253 }
            X.9Ns r2 = r2.A01     // Catch:{ 3ER -> 0x1253 }
            X.8R7 r2 = (X.AnonymousClass8R7) r2     // Catch:{ 3ER -> 0x1253 }
            java.lang.String r4 = r2.A04     // Catch:{ 3ER -> 0x1253 }
            boolean r2 = r3.containsKey(r4)     // Catch:{ 3ER -> 0x1253 }
            if (r2 != 0) goto L_0x10e9
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)     // Catch:{ 3ER -> 0x1253 }
        L_0x10e5:
            r3.put(r4, r2)     // Catch:{ 3ER -> 0x1253 }
            goto L_0x10c7
        L_0x10e9:
            java.lang.Object r2 = r3.get(r4)     // Catch:{ 3ER -> 0x1253 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ 3ER -> 0x1253 }
            int r2 = r2.intValue()     // Catch:{ 3ER -> 0x1253 }
            int r2 = r2 + 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ 3ER -> 0x1253 }
            goto L_0x10e5
        L_0x10fa:
            android.database.sqlite.SQLiteDatabase r4 = r0.A04()     // Catch:{ 3ER -> 0x1253 }
            X.C19280xx.A03(r4, r0)     // Catch:{ 3ER -> 0x1253 }
            java.util.Iterator r8 = X.C17890vO.A0i(r3)     // Catch:{ all -> 0x1240 }
        L_0x1105:
            boolean r2 = r8.hasNext()     // Catch:{ all -> 0x1240 }
            if (r2 == 0) goto L_0x1129
            java.util.Map$Entry r5 = X.AnonymousClass000.A16(r8)     // Catch:{ all -> 0x1240 }
            X.0xv r7 = r1.A03     // Catch:{ all -> 0x1240 }
            java.lang.Object r2 = r5.getValue()     // Catch:{ all -> 0x1240 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x1240 }
            int r2 = r2.intValue()     // Catch:{ all -> 0x1240 }
            long r2 = (long) r2     // Catch:{ all -> 0x1240 }
            X.9JT r6 = X.AnonymousClass9JT.INVALID_PAYLOD     // Catch:{ all -> 0x1240 }
            java.lang.String r5 = X.C17880vN.A0x(r5)     // Catch:{ all -> 0x1240 }
            r7.CDf(r6, r5, r2)     // Catch:{ all -> 0x1240 }
            goto L_0x1105
        L_0x1126:
            r5.endTransaction()     // Catch:{ all -> 0x1240 }
        L_0x1129:
            r4.setTransactionSuccessful()     // Catch:{ all -> 0x1240 }
            r4.endTransaction()     // Catch:{ 3ER -> 0x1253 }
            goto L_0x073d
        L_0x1131:
            java.lang.String r0 = "Null priority"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)     // Catch:{ all -> 0x123b }
            goto L_0x123a
        L_0x1139:
            r0 = move-exception
            r13.close()     // Catch:{ all -> 0x113e }
            throw r0     // Catch:{ all -> 0x113e }
        L_0x113e:
            r0 = move-exception
            r14.endTransaction()     // Catch:{ all -> 0x1143 }
            throw r0     // Catch:{ all -> 0x1143 }
        L_0x1143:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x1148 }
            throw r0     // Catch:{ all -> 0x1148 }
        L_0x1148:
            r0 = move-exception
            r8.endTransaction()     // Catch:{ all -> 0x114d }
            throw r0     // Catch:{ all -> 0x114d }
        L_0x114d:
            r0 = move-exception
            r11.endTransaction()     // Catch:{ 3ER -> 0x1253 }
            goto L_0x1252
        L_0x1153:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ 3ER -> 0x1253 }
            java.lang.String r0 = "Missing required properties:"
            r2.append(r0)     // Catch:{ 3ER -> 0x1253 }
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0o(r5, r2)     // Catch:{ 3ER -> 0x1253 }
            goto L_0x1252
        L_0x1162:
            java.util.Iterator r0 = r21.iterator()     // Catch:{ all -> 0x1240 }
            boolean r0 = r0.hasNext()     // Catch:{ all -> 0x1240 }
            if (r0 == 0) goto L_0x11bc
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x1240 }
            java.lang.String r0 = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in "
            r2.append(r0)     // Catch:{ all -> 0x1240 }
            java.lang.String r0 = X.C19280xx.A01(r21)     // Catch:{ all -> 0x1240 }
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r2)     // Catch:{ all -> 0x1240 }
            java.lang.String r2 = "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name"
            android.database.sqlite.SQLiteDatabase r5 = r43.A04()     // Catch:{ all -> 0x1240 }
            r5.beginTransaction()     // Catch:{ all -> 0x1240 }
            android.database.sqlite.SQLiteStatement r0 = r5.compileStatement(r0)     // Catch:{ all -> 0x123b }
            r0.execute()     // Catch:{ all -> 0x123b }
            r0 = 0
            android.database.Cursor r8 = r5.rawQuery(r2, r0)     // Catch:{ all -> 0x123b }
        L_0x1192:
            boolean r0 = r8.moveToNext()     // Catch:{ all -> 0x122f }
            if (r0 == 0) goto L_0x11aa
            r0 = 0
            int r0 = r8.getInt(r0)     // Catch:{ all -> 0x122f }
            java.lang.String r9 = r8.getString(r6)     // Catch:{ all -> 0x122f }
            long r2 = (long) r0     // Catch:{ all -> 0x122f }
            X.9JT r7 = X.AnonymousClass9JT.MAX_RETRIES_REACHED     // Catch:{ all -> 0x122f }
            r0 = r43
            r0.CDf(r7, r9, r2)     // Catch:{ all -> 0x122f }
            goto L_0x1192
        L_0x11aa:
            r8.close()     // Catch:{ all -> 0x123b }
            java.lang.String r0 = "DELETE FROM events WHERE num_attempts >= 16"
            android.database.sqlite.SQLiteStatement r0 = r5.compileStatement(r0)     // Catch:{ all -> 0x123b }
            r0.execute()     // Catch:{ all -> 0x123b }
            r5.setTransactionSuccessful()     // Catch:{ all -> 0x123b }
            r5.endTransaction()     // Catch:{ all -> 0x1240 }
        L_0x11bc:
            X.0xi r0 = r1.A06     // Catch:{ all -> 0x1240 }
            long r2 = r0.BaO()     // Catch:{ all -> 0x1240 }
            long r2 = r2 + r16
            r5 = r24
            r0 = r19
            r5.CDh(r0, r2)     // Catch:{ all -> 0x1240 }
            r4.setTransactionSuccessful()     // Catch:{ all -> 0x1240 }
            r4.endTransaction()     // Catch:{ 3ER -> 0x1253 }
            X.0y5 r3 = r1.A02     // Catch:{ 3ER -> 0x1253 }
            int r2 = r18 + 1
            r3.CGt(r0, r2, r6)     // Catch:{ 3ER -> 0x1253 }
            goto L_0x125f
        L_0x11da:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ 3ER -> 0x1253 }
            java.lang.String r0 = "Missing required properties:"
            r2.append(r0)     // Catch:{ 3ER -> 0x1253 }
            r0 = r28
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0o(r0, r2)     // Catch:{ 3ER -> 0x1253 }
            goto L_0x1252
        L_0x11ea:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ 3ER -> 0x1253 }
            java.lang.String r0 = "Missing required properties:"
            r3.append(r0)     // Catch:{ 3ER -> 0x1253 }
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0o(r2, r3)     // Catch:{ 3ER -> 0x1253 }
            goto L_0x1252
        L_0x11f8:
            android.database.sqlite.SQLiteDatabase r4 = r0.A04()     // Catch:{ 3ER -> 0x1253 }
            X.C19280xx.A03(r4, r0)     // Catch:{ 3ER -> 0x1253 }
            goto L_0x1219
        L_0x1200:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x123b }
            goto L_0x123a
        L_0x1205:
            android.database.sqlite.SQLiteDatabase r4 = r0.A04()     // Catch:{ 3ER -> 0x1253 }
            X.C19280xx.A03(r4, r0)     // Catch:{ 3ER -> 0x1253 }
            X.0y5 r5 = r1.A02     // Catch:{ all -> 0x1240 }
            int r3 = r18 + 1
            X.0y6 r5 = (X.C19370y6) r5     // Catch:{ all -> 0x1240 }
            r2 = 0
            r0 = r19
            r5.CGt(r0, r3, r2)     // Catch:{ all -> 0x1240 }
            goto L_0x1228
        L_0x1219:
            X.0xi r0 = r1.A06     // Catch:{ all -> 0x1240 }
            long r2 = r0.BaO()     // Catch:{ all -> 0x1240 }
            long r2 = r2 + r16
            r5 = r24
            r0 = r19
            r5.CDh(r0, r2)     // Catch:{ all -> 0x1240 }
        L_0x1228:
            r4.setTransactionSuccessful()     // Catch:{ all -> 0x1240 }
            r4.endTransaction()     // Catch:{ 3ER -> 0x1253 }
            goto L_0x125f
        L_0x122f:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x123b }
            goto L_0x123a
        L_0x1234:
            java.lang.String r0 = "Null backendName"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)     // Catch:{ all -> 0x123b }
        L_0x123a:
            throw r0     // Catch:{ all -> 0x123b }
        L_0x123b:
            r0 = move-exception
            r5.endTransaction()     // Catch:{ all -> 0x1240 }
            throw r0     // Catch:{ all -> 0x1240 }
        L_0x1240:
            r0 = move-exception
            r4.endTransaction()     // Catch:{ 3ER -> 0x1253 }
            goto L_0x1252
        L_0x1245:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ 3ER -> 0x1253 }
            java.lang.String r0 = "Missing required properties:"
            r2.append(r0)     // Catch:{ 3ER -> 0x1253 }
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0o(r10, r2)     // Catch:{ 3ER -> 0x1253 }
        L_0x1252:
            throw r0     // Catch:{ 3ER -> 0x1253 }
        L_0x1253:
            X.0y5 r3 = r1.A02     // Catch:{ all -> 0x1263 }
            int r2 = r18 + 1
            X.0y6 r3 = (X.C19370y6) r3     // Catch:{ all -> 0x1263 }
            r1 = 0
            r0 = r19
            r3.CGt(r0, r2, r1)     // Catch:{ all -> 0x1263 }
        L_0x125f:
            r25.run()
            return
        L_0x1263:
            r0 = move-exception
            r25.run()
            throw r0
        L_0x1268:
            java.lang.Object r6 = r0.A02
            com.whatsapp.avatar.profilephoto.AvatarProfilePhotoViewModel r6 = (com.whatsapp.avatar.profilephoto.AvatarProfilePhotoViewModel) r6
            java.lang.Object r3 = r0.A03
            X.1E7 r3 = (X.AnonymousClass1E7) r3
            java.lang.Object r2 = r0.A04
            byte[] r2 = (byte[]) r2
            int r5 = r0.A01
            r0 = 2
            X.C18070vi.A0d(r2, r0)
            X.1Up r1 = r6.A03
            r0 = 1
            r4 = 0
            boolean r3 = X.C27071Up.A01(r3, r1, r4, r2, r0)
            if (r3 != 0) goto L_0x1292
            X.00H r0 = r6.A07
            java.lang.Object r2 = X.C18070vi.A0E(r0)
            X.6ue r2 = (X.C136936ue) r2
            java.lang.String r1 = "unable_to_save_profile_photo"
            r0 = 6
            r2.A02(r0, r1, r4)
        L_0x1292:
            com.whatsapp.avatar.profilephoto.AvatarProfilePhotoViewModel.A04(r6, r3)
            X.00H r2 = r6.A08
            java.lang.Object r1 = r2.get()
            X.70I r1 = (X.AnonymousClass70I) r1
            java.lang.String r0 = "profile_photo_updated"
            r1.A03(r5, r0)
            java.lang.Object r1 = r2.get()
            X.70I r1 = (X.AnonymousClass70I) r1
            if (r3 == 0) goto L_0x12b0
            java.lang.Integer r0 = X.AnonymousClass00R.A00
        L_0x12ac:
            r1.A02(r5, r0)
            return
        L_0x12b0:
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            goto L_0x12ac
        L_0x12b3:
            java.lang.Object r11 = r0.A02
            X.9hw r11 = (X.C188759hw) r11
            java.lang.Object r2 = r0.A03
            X.725 r2 = (X.AnonymousClass725) r2
            int r10 = r0.A01
            java.lang.Object r12 = r0.A04
            X.1Di r12 = (X.C22821Di) r12
            r19 = 1
            X.0z4 r0 = r11.A03
            android.content.SharedPreferences$Editor r3 = X.C19830z4.A00(r0)
            java.lang.String r1 = "sticker_store_onboarding_badge_shown"
            r0 = r19
            X.C17880vN.A1F(r3, r1, r0)
            X.00H r0 = r11.A0E
            java.lang.Object r9 = r0.get()
            X.9fM r9 = (X.C187159fM) r9
            java.util.List r0 = r2.A07
            r0.size()
            X.67t r5 = r9.A01
            java.util.List r7 = r2.A07
            X.C18070vi.A0X(r7)
            java.util.LinkedHashMap r6 = X.C17880vN.A13()
            java.util.HashMap r0 = r5.A07()
            java.util.LinkedHashMap r4 = X.C17880vN.A13()
            java.util.Iterator r3 = X.C17890vO.A0i(r0)
        L_0x12f4:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x1313
            java.util.Map$Entry r1 = X.AnonymousClass000.A16(r3)
            java.lang.Object r0 = r1.getKey()
            X.6pg r0 = (X.C133896pg) r0
            java.lang.Object r1 = r1.getValue()
            java.lang.String r0 = r0.A01
            if (r0 == 0) goto L_0x12f4
            X.C18070vi.A0b(r1)
            r4.put(r0, r1)
            goto L_0x12f4
        L_0x1313:
            java.util.Iterator r3 = r7.iterator()
        L_0x1317:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x1335
            java.lang.Object r1 = r3.next()
            X.77d r1 = (X.C1418377d) r1
            boolean r0 = r1.A0N
            if (r0 == 0) goto L_0x132f
            java.lang.String r0 = r1.A07
            if (r0 == 0) goto L_0x132f
            r6.put(r0, r1)
            goto L_0x1317
        L_0x132f:
            java.lang.String r0 = "RecentStickers/sticker is not avatar or with null stable id, skipping"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x1317
        L_0x1335:
            java.util.ArrayList r0 = r5.A05()
            java.util.Iterator r15 = r0.iterator()
        L_0x133d:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x13a1
            java.lang.Object r0 = r15.next()
            X.6pg r0 = (X.C133896pg) r0
            if (r0 == 0) goto L_0x133d
            java.lang.String r14 = r0.A01
            if (r14 == 0) goto L_0x133d
            r5.A09(r0)
            java.lang.Object r13 = r6.get(r14)
            X.77d r13 = (X.C1418377d) r13
            if (r13 == 0) goto L_0x133d
            java.lang.String r8 = r13.A0F
            if (r8 == 0) goto L_0x133d
            java.lang.String r3 = r13.A0C
            long r0 = r0.A00
            X.6pg r7 = new X.6pg
            r23 = r3
            r24 = r14
            r25 = r0
            r20 = r7
            r21 = r13
            r22 = r8
            r20.<init>(r21, r22, r23, r24, r25)
            java.lang.Number r0 = X.C108945cZ.A1D(r14, r4)
            if (r0 == 0) goto L_0x139b
            float r0 = r0.floatValue()
        L_0x137d:
            X.7Ic r3 = new X.7Ic
            r3.<init>(r7, r0)
            r5.A08()
            monitor-enter(r5)
            java.util.List r0 = r5.A03     // Catch:{ all -> 0x139e }
            r0.add(r3)     // Catch:{ all -> 0x139e }
            X.89r r1 = r5.A01     // Catch:{ all -> 0x139e }
            java.util.List r0 = r5.A03     // Catch:{ all -> 0x139e }
            r1.CBh(r0)     // Catch:{ all -> 0x139e }
            monitor-exit(r5)     // Catch:{ all -> 0x139e }
            X.6pg r0 = r3.A01
            X.77d r0 = r0.A04
            r5.A0F(r0)
            goto L_0x133d
        L_0x139b:
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L_0x137d
        L_0x139e:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x139e }
            throw r0
        L_0x13a1:
            X.1KB r14 = r9.A00
            r0 = 7
            X.C21457AkO.A00(r14, r9, r0)
            X.00H r0 = r9.A02
            r27 = r0
            java.lang.Object r1 = r27.get()
            X.70I r1 = (X.AnonymousClass70I) r1
            java.lang.String r0 = "migrate_stickers_recents_done"
            r1.A03(r10, r0)
            java.util.List r0 = r2.A07
            r0.size()
            X.00H r0 = r9.A03
            java.lang.Object r8 = r0.get()
            X.6zr r8 = (X.C140046zr) r8
            java.util.List r2 = r2.A07
            X.C18070vi.A0X(r2)
            java.util.HashMap r7 = X.C17880vN.A11()
            X.6zY r6 = r8.A05
            r1 = 2
            r0 = 2147483647(0x7fffffff, float:NaN)
            java.util.ArrayList r4 = r6.A01(r0, r1)
            java.util.Iterator r3 = r2.iterator()
        L_0x13da:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x13f8
            java.lang.Object r2 = r3.next()
            X.77d r2 = (X.C1418377d) r2
            java.lang.String r1 = r2.A07
            boolean r0 = r2.A0N
            if (r0 == 0) goto L_0x13f2
            if (r1 == 0) goto L_0x13f2
            r7.put(r1, r2)
            goto L_0x13da
        L_0x13f2:
            java.lang.String r0 = "StarredStickers/updateStarredStickersByAvatarStableId/is not avatar or with null stable id, skipping"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x13da
        L_0x13f8:
            java.util.Iterator r18 = r4.iterator()
        L_0x13fc:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L_0x14e1
            java.lang.Object r5 = r18.next()
            X.6uA r5 = (X.C136656uA) r5
            java.lang.String r0 = r5.A00
            if (r0 != 0) goto L_0x1412
            java.lang.String r0 = "StarredStickers/updateStarredStickersByAvatarStableId/sticker has no avatar stable id, aborting"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x13fc
        L_0x1412:
            java.lang.Object r4 = r7.get(r0)
            X.77d r4 = (X.C1418377d) r4
            if (r4 != 0) goto L_0x1420
            java.lang.String r0 = r5.A0C
            r6.A03(r0)
            goto L_0x13fc
        L_0x1420:
            java.lang.String r13 = r4.A07
            if (r13 == 0) goto L_0x13fc
            java.lang.String r3 = r4.A0F
            if (r3 == 0) goto L_0x13fc
            java.lang.String r15 = r4.A0I
            java.lang.String r1 = r4.A08
            java.lang.String r0 = r4.A0E
            r26 = r0
            int r0 = r4.A00
            r25 = r0
            int r0 = r4.A03
            r24 = r0
            int r0 = r4.A02
            r22 = r0
            java.lang.String r0 = r4.A09
            r21 = r0
            boolean r0 = r4.A0P
            r20 = r0
            boolean r0 = r4.A0N
            r16 = r0
            r17 = 0
            java.lang.String r23 = "avatar_template_id = ?"
            android.content.ContentValues r2 = X.C17880vN.A08()
            java.lang.String r0 = "plaintext_hash"
            r2.put(r0, r3)
            java.lang.String r0 = "url"
            r2.put(r0, r15)
            java.lang.String r0 = "direct_path"
            r2.put(r0, r1)
            java.lang.String r1 = "mimetype"
            r0 = r26
            r2.put(r1, r0)
            java.lang.String r1 = "file_size"
            r0 = r25
            X.C17880vN.A18(r2, r1, r0)
            java.lang.String r1 = "width"
            r0 = r24
            X.C17880vN.A18(r2, r1, r0)
            java.lang.String r1 = "height"
            r0 = r22
            X.C17880vN.A18(r2, r1, r0)
            java.lang.String r1 = "emojis"
            r0 = r21
            r2.put(r1, r0)
            java.lang.String r1 = "is_first_party"
            r0 = r20
            X.AnonymousClass8BT.A13(r2, r1, r0)
            java.lang.String r1 = "is_avatar"
            r0 = r16
            X.AnonymousClass8BT.A13(r2, r1, r0)
            X.00H r0 = r6.A00     // Catch:{ Exception -> 0x14d9 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x14d9 }
            X.5yf r0 = (X.C116815yf) r0     // Catch:{ Exception -> 0x14d9 }
            X.1au r1 = r0.A06()     // Catch:{ Exception -> 0x14d9 }
            r0 = r1
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x14d2 }
            X.1Ev r15 = r0.A02     // Catch:{ all -> 0x14d2 }
            java.lang.String r22 = "starred_stickers"
            r16 = 1
            r0 = r19
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ all -> 0x14d2 }
            r0[r17] = r13     // Catch:{ all -> 0x14d2 }
            java.lang.String r24 = "updateStickerAttrsByAvatarTemplateId/UPDATE_STARRED_STICKERS"
            r20 = r15
            r21 = r2
            r25 = r0
            int r0 = r20.A02(r21, r22, r23, r24, r25)     // Catch:{ all -> 0x14d2 }
            if (r0 > 0) goto L_0x14bb
            r16 = 0
        L_0x14bb:
            r1.close()     // Catch:{ Exception -> 0x14d9 }
            if (r16 == 0) goto L_0x13fc
            X.6uI r2 = r8.A01
            java.lang.String r1 = r5.A0C
            java.lang.String r0 = r2.A00(r1)
            r2.A02(r1, r0)
            java.lang.String r0 = r4.A0C
            r2.A01(r3, r0)
            goto L_0x13fc
        L_0x14d2:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x14d4 }
        L_0x14d4:
            r0 = move-exception
            X.CDX.A00(r1, r2)     // Catch:{ Exception -> 0x14d9 }
            throw r0     // Catch:{ Exception -> 0x14d9 }
        L_0x14d9:
            r1 = move-exception
            java.lang.String r0 = "updateStickerAttrsByAvatarTemplateId/unable to update sticker"
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x13fc
        L_0x14e1:
            X.C140046zr.A00(r8)
            r0 = 8
            X.C21457AkO.A00(r14, r9, r0)
            java.lang.Object r1 = r27.get()
            X.70I r1 = (X.AnonymousClass70I) r1
            java.lang.String r0 = "migrate_stickers_favorites_done"
            r1.A03(r10, r0)
            java.lang.Object r0 = r27.get()
            X.70I r0 = (X.AnonymousClass70I) r0
            java.lang.Integer r1 = X.AnonymousClass00R.A00
            r0.A02(r10, r1)
            X.00H r0 = r11.A0A
            java.lang.Object r0 = r0.get()
            X.70I r0 = (X.AnonymousClass70I) r0
            r0.A02(r10, r1)
            X.00H r4 = r11.A09
            java.lang.Object r0 = r4.get()
            X.6xr r0 = (X.C138886xr) r0
            X.1Ul r0 = r0.A00
            X.0vl r0 = r0.A01
            android.content.SharedPreferences r0 = X.C17880vN.A0C(r0)
            java.lang.String r3 = "pref_avatar_art_pending_revision"
            java.lang.String r2 = X.C17880vN.A0r(r0, r3)
            if (r2 == 0) goto L_0x156b
            java.lang.Object r0 = r4.get()
            X.6xr r0 = (X.C138886xr) r0
            X.1Ul r0 = r0.A00
            X.0vl r0 = r0.A01
            android.content.SharedPreferences$Editor r1 = X.C17890vO.A0A(r0)
            java.lang.String r0 = "pref_avatar_art_revision"
            X.C17880vN.A1E(r1, r0, r2)
            java.lang.Object r0 = r4.get()
            X.6xr r0 = (X.C138886xr) r0
            X.1Ul r0 = r0.A00
            X.0vl r0 = r0.A01
            android.content.SharedPreferences$Editor r0 = X.C17890vO.A0A(r0)
            X.C17880vN.A1B(r0, r3)
            X.00H r0 = r11.A0B
            java.lang.Object r0 = r0.get()
            X.1Ul r0 = (X.C27031Ul) r0
            X.0vl r0 = r0.A01
            android.content.SharedPreferences$Editor r1 = X.C17890vO.A0A(r0)
            java.lang.String r0 = "pref_avatar_sticker_search_dictionary_revision"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)
            java.lang.String r0 = "pref_avatar_sticker_search_dictionary_state"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)
            java.lang.String r0 = "pref_avatar_sticker_search_dictionary_filters"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)
            java.lang.String r0 = "pref_avatar_sticker_search_dictionary_country_code"
            X.C17880vN.A1B(r1, r0)
        L_0x156b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r19)
            r12.invoke(r0)
            return
        L_0x1573:
            java.lang.Object r5 = r0.A02
            X.A45 r5 = (X.A45) r5
            java.lang.Object r4 = r0.A03
            int r3 = r0.A01
            r0 = 0
            X.C18070vi.A0d(r5, r0)
            X.Boh r2 = r5.A00
            X.E8A r1 = r5.A01
            java.util.List r0 = X.C18070vi.A0M(r4)
            X.AnonymousClass8BT.A19(X.ALS.A06(r2), r1, r0)
            X.C1404371k.A00(r5, r3)
            return
        L_0x158e:
            java.lang.Object r3 = r0.A02
            X.1Vn r3 = (X.C27301Vn) r3
            int r6 = r0.A01
            java.lang.Object r5 = r0.A03
            X.0z4 r5 = (X.C19830z4) r5
            java.lang.Object r4 = r0.A04
            X.2qZ r4 = (X.C61962qZ) r4
            int r2 = r6 + 4
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "MissedCallNotificationHelper/clearNotificationWithKey /"
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r1, r6)
            r3.BEJ(r2, r0)
            java.lang.String r0 = java.lang.String.valueOf(r6)
            java.util.ArrayList r1 = r5.A0r()
            r1.add(r0)
            android.content.SharedPreferences$Editor r2 = X.C19830z4.A00(r5)
            java.lang.String r0 = ","
            java.lang.String r1 = X.AnonymousClass1EG.A07(r0, r1)
            java.lang.String r0 = "dismissed_missed_call_notification_key_list"
            X.C17880vN.A1E(r2, r0, r1)
            java.util.LinkedHashMap r2 = r4.A01
            monitor-enter(r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x15dd }
            r2.remove(r0)     // Catch:{ all -> 0x15dd }
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x15dd }
            if (r0 == 0) goto L_0x15db
            java.lang.String r1 = "MissedCallNotificationHelper/clearNotificationsSummary"
            r0 = 4
            r3.BEJ(r0, r1)     // Catch:{ all -> 0x15dd }
        L_0x15db:
            monitor-exit(r2)
            return
        L_0x15dd:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x15e0:
            java.lang.Object r1 = r0.A02
            X.A2h r1 = (X.C19994A2h) r1
            java.lang.Object r4 = r0.A03
            com.whatsapp.jid.DeviceJid r4 = (com.whatsapp.jid.DeviceJid) r4
            java.lang.Object r3 = r0.A04
            byte[] r3 = (byte[]) r3
            int r0 = r0.A01
            byte r2 = (byte) r0
            X.A7t r1 = r1.A05
            java.lang.String r0 = "call_rekey"
            r1.A06(r4, r0, r3, r2)
            return
        L_0x15f7:
            java.lang.Object r1 = r0.A02
            X.AJT r1 = (X.AJT) r1
            int r10 = r0.A01
            java.lang.Object r8 = r0.A03
            X.6xW r8 = (X.C138686xW) r8
            java.lang.Object r5 = r0.A04
            com.whatsapp.voipcalling.CallInfo r5 = (com.whatsapp.voipcalling.CallInfo) r5
            X.A99 r4 = r1.A02
            X.73y r6 = r4.A2H
            android.content.Context r7 = r4.A1r
            X.1V7 r9 = r4.A2J
            r11 = 1
            r3 = 0
            android.app.Notification r2 = r6.A06(r7, r8, r9, r10, r11)
            X.1Vn r1 = r4.A2d
            r0 = 23
            r1.BkR(r0, r2)
            com.whatsapp.jid.GroupJid r1 = r5.groupJid
            if (r1 != 0) goto L_0x1624
            com.whatsapp.jid.UserJid r1 = r5.getCreatorJid()
            if (r1 == 0) goto L_0x1629
        L_0x1624:
            X.1i1 r0 = r4.A2X
            r0.A0C(r1, r3)
        L_0x1629:
            r4.A1R = r11
            return
        L_0x162c:
            int r2 = r0.A01
            java.lang.Object r5 = r0.A02
            X.1Di r5 = (X.C22821Di) r5
            java.lang.Object r4 = r0.A03
            X.9yZ r4 = (X.C198579yZ) r4
            java.lang.Object r1 = r0.A04
            X.9hY r1 = (X.C188519hY) r1
            r0 = -1
            if (r2 == r0) goto L_0x1660
            r0 = 406(0x196, float:5.69E-43)
            if (r2 == r0) goto L_0x164b
            r0 = 421(0x1a5, float:5.9E-43)
            if (r2 == r0) goto L_0x164b
        L_0x1645:
            X.8lv r0 = X.AnonymousClass8lv.A00
        L_0x1647:
            r5.invoke(r0)
            return
        L_0x164b:
            com.whatsapp.jid.UserJid r3 = r1.A08
            boolean r0 = r4.A00
            if (r0 != 0) goto L_0x1645
            r0 = 1
            r4.A00 = r0
            X.1Ty r2 = r4.A02
            X.AMu r1 = new X.AMu
            r1.<init>(r4, r0)
            r0 = 0
            r2.A0F(r1, r3, r0)
            goto L_0x1645
        L_0x1660:
            X.8lw r0 = X.C169568lw.A00
            goto L_0x1647
        L_0x1663:
            java.lang.Object r5 = r0.A02
            X.1pJ r5 = (X.C37311pJ) r5
            java.lang.Object r12 = r0.A03
            android.content.Context r12 = (android.content.Context) r12
            java.lang.Object r4 = r0.A04
            X.3Kp r4 = (X.C72093Kp) r4
            int r10 = r0.A01
            X.0z4 r6 = r5.A07
            X.11P r0 = r5.A05
            long r0 = X.AnonymousClass11P.A01(r0)
            X.00H r2 = r6.A00
            android.content.SharedPreferences$Editor r3 = X.AnonymousClass8BV.A06(r2)
            java.lang.String r2 = "native_contacts_nux_onboard_time"
            X.C17880vN.A1D(r3, r2, r0)
            X.1pH r11 = r5.A09
            int r0 = r5.A00
            java.lang.Integer r15 = java.lang.Integer.valueOf(r0)
            X.1To r3 = r5.A02
            X.1pI r7 = r5.A0B
            X.0wl r8 = r5.A0D
            X.1OX r9 = r5.A0E
            X.7Kx r2 = new X.7Kx
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            X.6wZ r13 = X.C138126wZ.A05
            r16 = 0
            r14 = r2
            r11.A02(r12, r13, r14, r15, r16)
            return
        L_0x16a2:
            java.lang.Object r3 = r0.A02
            X.1pJ r3 = (X.C37311pJ) r3
            java.lang.Object r5 = r0.A03
            java.lang.Object r4 = r0.A04
            int r6 = r0.A01
            r1 = 1
            X.1iv r0 = r3.A0A
            int r2 = r3.A00
            boolean r0 = r0.A07(r2)
            if (r0 == 0) goto L_0x16ca
            X.0z4 r0 = r3.A07
            r0.A26(r1)
            r3.A00()
            X.1KB r2 = r3.A01
            r0 = 25
        L_0x16c3:
            X.3Bp r1 = new X.3Bp
            r1.<init>(r5, r0)
            goto L_0x1b9c
        L_0x16ca:
            X.0vl r0 = r3.A0C
            boolean r0 = X.C72453Mb.A1a(r0)
            if (r0 != 0) goto L_0x16e0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "NativeContactsLauncher: native contacts address book size is not eligible to launch NUX "
            X.C17900vP.A0k(r0, r1, r2)
            X.1KB r2 = r3.A01
            r0 = 26
            goto L_0x16c3
        L_0x16e0:
            X.1KB r0 = r3.A01
            r7 = 11
            X.Aiu r2 = new X.Aiu
            r2.<init>(r3, r4, r5, r6, r7)
            r0.A0J(r2)
            return
        L_0x16ed:
            java.lang.Object r3 = r0.A02
            X.5tO r3 = (X.C115095tO) r3
            java.lang.Object r2 = r0.A03
            android.net.Uri r2 = (android.net.Uri) r2
            java.lang.Object r1 = r0.A04
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r0 = r0.A01
            r3.A0D(r2, r1, r0)
            return
        L_0x16ff:
            java.lang.Object r5 = r0.A02
            X.8ns r5 = (X.C169968ns) r5
            java.lang.Object r4 = r0.A03
            X.206 r4 = (X.AnonymousClass206) r4
            int r2 = r0.A01
            java.lang.Object r3 = r0.A04
            X.2qD r3 = (X.C61762qD) r3
            X.00H r0 = r5.A05
            java.lang.Object r1 = r0.get()
            X.1iV r1 = (X.C33241iV) r1
            r0 = 0
            X.C18070vi.A0d(r4, r0)
            r0 = 5
            X.C33241iV.A00(r1, r4, r0, r2)
            X.00H r0 = r5.A04
            java.lang.Object r2 = r0.get()
            X.9kk r2 = (X.C190319kk) r2
            int r0 = r3.A06
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "cta-call"
            r2.A00(r4, r0, r1)
            return
        L_0x1731:
            java.lang.Object r8 = r0.A02
            X.1ju r8 = (X.C34091ju) r8
            int r7 = r0.A01
            java.lang.Object r6 = r0.A03
            java.lang.Object r5 = r0.A04
            com.whatsapp.conversationslist.ConversationsFragment r4 = r8.A0Q
            android.content.res.Resources r3 = X.AnonymousClass3MZ.A09(r4)
            r2 = 2131755030(0x7f100016, float:1.9140928E38)
            java.lang.Object[] r1 = X.AnonymousClass3MW.A1a()
            r0 = 0
            X.C17880vN.A1T(r1, r7, r0)
            java.lang.String r3 = r3.getQuantityString(r2, r7, r1)
            r0 = 2131897301(0x7f122bd5, float:1.9429488E38)
            java.lang.String r2 = r4.A1H(r0)
            r1 = 3
            X.78A r0 = new X.78A
            r0.<init>(r8, r6, r5, r1)
            r4.A2F(r3, r2, r0)
            return
        L_0x1761:
            java.lang.Object r5 = r0.A02
            X.2fS r5 = (X.C55242fS) r5
            java.lang.Object r3 = r0.A04
            X.1IX r3 = (X.AnonymousClass1IX) r3
            java.lang.Object r2 = r0.A03
            X.1IX r2 = (X.AnonymousClass1IX) r2
            X.289 r1 = new X.289
            r1.<init>(r3, r2, r5)
            X.Cl4 r4 = X.C25367CeS.A00(r1)
            java.util.concurrent.Executor r3 = r5.A04
            r2 = 26
            X.3Bw r1 = new X.3Bw
            r1.<init>(r0, r4, r2)
            r3.execute(r1)
            return
        L_0x1783:
            java.lang.Object r1 = r0.A02
            X.1Co r1 = (X.C22621Co) r1
            java.lang.Object r4 = r0.A03
            X.1BI r4 = (X.AnonymousClass1BI) r4
            int r3 = r0.A01
            java.lang.Object r2 = r0.A04
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            X.00H r0 = r1.A01
            java.lang.Object r0 = r0.get()
            X.1as r0 = (X.C28771as) r0
            X.00H r0 = r0.A0M
            java.lang.Object r1 = r0.get()
            X.A5M r1 = (X.A5M) r1
            r0 = 0
            r1.A04(r4, r2, r3, r0)
            return
        L_0x17a6:
            java.lang.Object r1 = r0.A02
            X.122 r1 = (X.AnonymousClass122) r1
            java.lang.Object r4 = r0.A03
            int r3 = r0.A01
            java.lang.Object r2 = r0.A04
            java.util.concurrent.CountDownLatch r2 = (java.util.concurrent.CountDownLatch) r2
            X.1Lg r1 = r1.A0S
            r0 = 6
            X.C20739AWu.A00(r1, r4, r3, r0)
            r2.countDown()
            return
        L_0x17bc:
            java.lang.Object r3 = r0.A02
            X.1h1 r3 = (X.C32331h1) r3
            java.lang.Object r2 = r0.A03
            X.205 r2 = (X.AnonymousClass205) r2
            int r1 = r0.A01
            java.lang.Object r0 = r0.A04
            X.3KP r0 = (X.AnonymousClass3KP) r0
            r3.A03(r0, r2, r1)
            return
        L_0x17ce:
            java.lang.Object r4 = r0.A02
            X.1Ma r4 = (X.C24881Ma) r4
            java.lang.Object r3 = r0.A03
            com.whatsapp.jid.GroupJid r3 = (com.whatsapp.jid.GroupJid) r3
            int r2 = r0.A01
            java.lang.Object r1 = r0.A04
            X.2Rt r1 = (X.C49752Rt) r1
            int r0 = r2 + 1
            r4.A02(r1, r3, r0)
            return
        L_0x17e2:
            java.lang.Object r3 = r0.A02
            X.1Ma r3 = (X.C24881Ma) r3
            java.lang.Object r2 = r0.A03
            com.whatsapp.jid.GroupJid r2 = (com.whatsapp.jid.GroupJid) r2
            int r1 = r0.A01
            java.lang.Object r0 = r0.A04
            X.2Rt r0 = (X.C49752Rt) r0
            r3.A02(r0, r2, r1)
            return
        L_0x17f4:
            java.lang.Object r4 = r0.A02
            com.whatsapp.group.GroupChatInfoActivity r4 = (com.whatsapp.group.GroupChatInfoActivity) r4
            java.lang.Object r6 = r0.A03
            android.view.View r6 = (android.view.View) r6
            java.lang.Object r2 = r0.A04
            X.1E7 r2 = (X.AnonymousClass1E7) r2
            int r3 = r0.A01
            r4.invalidateOptionsMenu()
            r0 = 2131432024(0x7f0b1258, float:1.8485794E38)
            android.view.View r5 = X.C110885hR.A0A(r4, r0)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            X.0vb r1 = r4.A0m
            r0 = 2131231229(0x7f0801fd, float:1.8078533E38)
            X.AnonymousClass3NL.A01(r4, r5, r1, r0)
            r0 = 0
            r6.setVisibility(r0)
            r1 = 26
            X.48g r0 = new X.48g
            r0.<init>(r4, r1)
            r6.setOnClickListener(r0)
            r0 = 2131432026(0x7f0b125a, float:1.8485798E38)
            android.view.View r1 = X.C110885hR.A0A(r4, r0)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            X.1pZ r0 = r4.A0f
            r0.A07(r1, r2)
            X.00H r0 = r4.A0W
            java.lang.Object r0 = r0.get()
            X.1xo r0 = (X.C42211xo) r0
            boolean r0 = r0.A00(r2)
            if (r0 == 0) goto L_0x1845
            r0 = 1056964608(0x3f000000, float:0.5)
            r1.setAlpha(r0)
        L_0x1845:
            r0 = 2131432028(0x7f0b125c, float:1.8485802E38)
            android.view.View r1 = X.C110885hR.A0A(r4, r0)
            com.whatsapp.TextEmojiLabel r1 = (com.whatsapp.TextEmojiLabel) r1
            X.1Me r0 = r4.A0d
            java.lang.String r0 = r0.A0I(r2)
            r1.A0R(r0)
            X.C43421zm.A04(r1)
            r0 = 2131432027(0x7f0b125b, float:1.84858E38)
            android.widget.TextView r2 = X.AnonymousClass3MW.A0I(r4, r0)
            android.content.res.Resources r1 = r4.getResources()
            if (r3 <= 0) goto L_0x1872
            r0 = 2131755210(0x7f1000ca, float:1.9141293E38)
            java.lang.String r0 = X.C72473Md.A0k(r1, r3, r0)
        L_0x186e:
            r2.setText(r0)
            return
        L_0x1872:
            r0 = 2131891640(0x7f1215b8, float:1.9418006E38)
            java.lang.String r0 = r1.getString(r0)
            goto L_0x186e
        L_0x187a:
            java.lang.Object r6 = r0.A02
            com.whatsapp.invites.SMSPreviewInviteBottomSheetFragment r6 = (com.whatsapp.invites.SMSPreviewInviteBottomSheetFragment) r6
            java.lang.Object r5 = r0.A03
            X.1EC r5 = (X.AnonymousClass1EC) r5
            java.lang.Object r4 = r0.A04
            android.view.View r4 = (android.view.View) r4
            int r7 = r0.A01
            X.1FL r2 = r6.A1B()
            if (r2 == 0) goto L_0x1898
            r1 = 33
            X.7Pd r0 = new X.7Pd
            r0.<init>(r4, r1)
            r2.runOnUiThread(r0)
        L_0x1898:
            java.util.ArrayList r10 = X.AnonymousClass000.A13()
            java.util.ArrayList r0 = r6.A0F
            java.util.Iterator r2 = r0.iterator()
        L_0x18a2:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x18b7
            java.lang.Object r1 = r2.next()
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            X.9Ed r0 = new X.9Ed
            r0.<init>((com.whatsapp.jid.UserJid) r1)
            r10.add(r0)
            goto L_0x18a2
        L_0x18b7:
            X.00H r0 = r6.A0A
            if (r0 == 0) goto L_0x1bc0
            java.lang.String r11 = X.C17890vO.A0T(r0)
            java.lang.String r1 = "to"
            X.1cX r9 = X.C108955ca.A0Y()
            java.lang.String r0 = "w:g2"
            X.AnonymousClass8BY.A17(r9, r0)
            X.AnonymousClass8BT.A1E(r5, r9, r1)
            X.AnonymousClass8BY.A15(r9, r11)
            java.lang.String r0 = "store_sent_invite_sms"
            X.1cX r8 = X.C108945cZ.A0t(r0)
            r2 = 1
            r0 = 32
            boolean r0 = X.C29601cY.A05(r10, r2, r0)
            if (r0 == 0) goto L_0x18ee
            java.util.Iterator r1 = r10.iterator()
        L_0x18e4:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x18ee
            X.C178709Ed.A00(r8, r1)
            goto L_0x18e4
        L_0x18ee:
            X.1ca r10 = X.C29591cX.A00(r8, r9)
            X.00H r0 = r6.A0A
            if (r0 == 0) goto L_0x1bc0
            X.1OZ r8 = X.C17880vN.A0U(r0)
            X.AcV r9 = new X.AcV
            r9.<init>(r4, r6, r5, r7)
            r13 = 0
            r12 = 408(0x198, float:5.72E-43)
            r8.A0I(r9, r10, r11, r12, r13)
            return
        L_0x1907:
            java.lang.Object r7 = r0.A02
            X.1T6 r7 = (X.AnonymousClass1T6) r7
            java.lang.Object r6 = r0.A03
            X.34B r6 = (X.AnonymousClass34B) r6
            int r5 = r0.A01
            java.lang.Object r4 = r0.A04
            X.2rU r4 = (X.C62492rU) r4
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "MediaJobManager/enqueueUploading/responseCallback One Request Protocol PTT metadata size too large, mediaJob: "
            X.C17900vP.A0X(r6, r0, r1)
            X.18K r3 = r7.A03
            X.73e r2 = r6.A0O
            int r1 = r6.A01
            X.0ve r0 = r7.A02
            X.64X r0 = r2.A05(r0, r5, r1)
            r3.CC7(r0)
            r7.A0I(r6, r4)
            return
        L_0x1931:
            java.lang.Object r1 = r0.A02
            X.71q r1 = (X.C1404871q) r1
            int r15 = r0.A01
            java.lang.Object r13 = r0.A03
            java.io.File r13 = (java.io.File) r13
            java.lang.Object r4 = r0.A04
            X.9dF r4 = (X.C185849dF) r4
            X.190 r2 = r1.A01
            X.17r r3 = r1.A02
            X.2r8 r11 = r1.A0D
            X.6xt r10 = r1.A0B
            X.1h6 r5 = r1.A04
            X.73l r12 = r1.A0E
            com.whatsapp.media.WamediaManager r6 = r1.A05
            X.6zF r9 = r1.A09
            X.6uk r8 = r1.A08
            X.5ti r7 = r1.A07
            int r14 = r7.A15
            X.AnonymousClass74L.A09(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        L_0x1959:
            java.lang.Object r3 = r0.A02
            X.1hY r3 = (X.C32661hY) r3
            java.lang.Object r2 = r0.A03
            X.206 r2 = (X.AnonymousClass206) r2
            java.lang.Object r1 = r0.A04
            X.36w r1 = (X.C693536w) r1
            int r0 = r0.A01
            X.C32661hY.A00(r3, r2, r1, r0)
            return
        L_0x196b:
            java.lang.Object r5 = r0.A02
            X.2gL r5 = (X.C55772gL) r5
            java.lang.Object r4 = r0.A03
            X.1h9 r4 = (X.C32411h9) r4
            java.lang.Object r3 = r0.A04
            X.6zF r3 = (X.C139666zF) r3
            int r2 = r0.A01
            X.1h4 r1 = r4.A02
            java.lang.String r0 = r3.A0H
            r1.A01(r0)
            X.C32411h9.A00(r5, r4, r2)
            return
        L_0x1984:
            java.lang.Object r5 = r0.A02
            X.1gK r5 = (X.C31911gK) r5
            int r8 = r0.A01
            java.lang.Object r6 = r0.A03
            X.1ca r6 = (X.C29621ca) r6
            java.lang.Object r7 = r0.A04
            X.2nR r7 = (X.C60132nR) r7
            r3 = 2
            X.C18070vi.A0d(r6, r3)
            X.1N7 r2 = r5.A05
            long r0 = r7.A00
            X.2tQ r2 = X.AnonymousClass1N7.A00(r2, r3, r0)
            X.8vI r2 = (X.C173568vI) r2
            r4 = 0
            X.1ca r1 = r6.A0J(r4)
            if (r2 == 0) goto L_0x19b1
            if (r1 == 0) goto L_0x19ad
            java.lang.String r0 = r1.A00
            r2.A00 = r0
        L_0x19ad:
            r0 = 3
            r2.A05(r0)
        L_0x19b1:
            java.util.Map r3 = r5.A08
            java.lang.String r2 = r7.A08
            X.C18070vi.A0W(r2)
            if (r1 == 0) goto L_0x19be
            java.lang.String r1 = r1.A00
            if (r1 != 0) goto L_0x19c0
        L_0x19be:
            java.lang.String r1 = "null"
        L_0x19c0:
            java.lang.String r0 = "offline"
            java.lang.String r0 = X.C29621ca.A02(r6, r0)
            if (r0 == 0) goto L_0x19c9
            r4 = 1
        L_0x19c9:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            android.util.Pair r0 = X.C108945cZ.A0N(r1, r0)
            r3.put(r2, r0)
            X.10s r2 = r5.A06
            if (r2 != 0) goto L_0x19dc
            X.C31911gK.A00(r5, r6, r7, r8)
            return
        L_0x19dc:
            r9 = 37
            X.Aiu r4 = new X.Aiu
            r4.<init>(r5, r6, r7, r8, r9)
            java.lang.String r1 = "BaseNotificationHandler/handleNotification"
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            r2.execute(r4)
            return
        L_0x19ed:
            java.lang.Object r3 = r0.A02
            X.1gK r3 = (X.C31911gK) r3
            int r2 = r0.A01
            java.lang.Object r1 = r0.A03
            X.1ca r1 = (X.C29621ca) r1
            java.lang.Object r0 = r0.A04
            X.2nR r0 = (X.C60132nR) r0
            X.C31911gK.A00(r3, r1, r0, r2)
            return
        L_0x19ff:
            java.lang.Object r5 = r0.A02
            X.10T r5 = (X.AnonymousClass10T) r5
            int r4 = r0.A01
            java.lang.Object r3 = r0.A03
            java.lang.Object r2 = r0.A04
            r1 = 2
            goto L_0x1a22
        L_0x1a0b:
            java.lang.Object r5 = r0.A02
            X.10T r5 = (X.AnonymousClass10T) r5
            int r4 = r0.A01
            java.lang.Object r3 = r0.A03
            java.lang.Object r2 = r0.A04
            r1 = 1
            goto L_0x1a22
        L_0x1a17:
            java.lang.Object r5 = r0.A02
            X.10T r5 = (X.AnonymousClass10T) r5
            int r4 = r0.A01
            java.lang.Object r3 = r0.A03
            java.lang.Object r2 = r0.A04
            r1 = 3
        L_0x1a22:
            X.7KV r0 = new X.7KV
            r0.<init>(r3, r4, r1, r2)
            r5.notifyAllObservers(r0)
            return
        L_0x1a2b:
            java.lang.Object r8 = r0.A02
            X.1PT r8 = (X.AnonymousClass1PT) r8
            java.lang.Object r7 = r0.A03
            X.2HU r7 = (X.AnonymousClass2HU) r7
            java.lang.Object r6 = r0.A04
            X.206 r6 = (X.AnonymousClass206) r6
            int r9 = r0.A01
            int r0 = X.C62912sC.A00()
            java.lang.Long r0 = X.C17880vN.A0n(r0)
            r7.A0T = r0
            java.lang.Boolean r0 = r7.A0A
            boolean r0 = r0.booleanValue()
            r5 = 0
            if (r0 != 0) goto L_0x1a73
            X.205 r0 = r6.A0v
            X.1BI r4 = r0.A00
            boolean r0 = X.C22971Dz.A0e(r4)
            if (r0 == 0) goto L_0x1a79
            android.util.LruCache r3 = r8.A00
            java.lang.Object r0 = r3.get(r4)
            if (r0 == 0) goto L_0x1ae1
            java.lang.Object r0 = r3.get(r4)
            long r14 = X.C17880vN.A05(r0)
        L_0x1a66:
            r1 = -1
            int r0 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x1a72
            long r1 = r6.A0x
            int r0 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r0 != 0) goto L_0x1a73
        L_0x1a72:
            r5 = 1
        L_0x1a73:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r7.A09 = r0
        L_0x1a79:
            java.lang.Boolean r0 = r7.A0A
            if (r0 == 0) goto L_0x1a83
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x1aa5
        L_0x1a83:
            java.lang.Boolean r0 = r7.A09
            if (r0 == 0) goto L_0x1a8d
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x1aa5
        L_0x1a8d:
            java.lang.Boolean r0 = r7.A01
            if (r0 == 0) goto L_0x1aad
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x1aad
            java.lang.Long r0 = r7.A0Q
            if (r0 == 0) goto L_0x1aad
            long r3 = r0.longValue()
            r1 = 50
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x1aad
        L_0x1aa5:
            X.18K r1 = r8.A0C
            X.0vt r0 = X.C18180vt.A06
        L_0x1aa9:
            r1.CC6(r7, r0)
            return
        L_0x1aad:
            X.0ve r2 = r8.A0B
            r1 = 1861(0x745, float:2.608E-42)
            X.0vf r0 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r0, r2, r1)
            if (r9 >= r0) goto L_0x1aa5
            java.lang.Long r0 = r7.A0Y
            if (r0 == 0) goto L_0x1acc
            long r3 = r0.longValue()
            r1 = 50
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x1acc
            X.18K r1 = r8.A0C
            X.0vt r0 = X.AnonymousClass184.DEFAULT_SAMPLING_RATE
            goto L_0x1aa9
        L_0x1acc:
            java.lang.Integer r0 = r7.A0E
            if (r0 == 0) goto L_0x1b25
            int r1 = r0.intValue()
            r0 = 14
            if (r1 == r0) goto L_0x1adc
            r0 = 15
            if (r1 != r0) goto L_0x1b25
        L_0x1adc:
            X.18K r1 = r8.A0C
            X.0vt r0 = X.AnonymousClass1PT.A0i
            goto L_0x1aa9
        L_0x1ae1:
            r12 = -1
            if (r4 == 0) goto L_0x1a72
            X.1NK r1 = r8.A09
            java.lang.String[] r11 = X.C17880vN.A1Y()
            X.1LW r0 = r1.A00
            X.AnonymousClass1LW.A03(r0, r4, r11, r5)
            X.1Cd r0 = r1.A01
            X.1at r10 = r0.get()
            r0 = r10
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x1b37 }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x1b37 }
            java.lang.String r1 = "SELECT _id FROM available_message_view WHERE chat_row_id = ? AND message_type NOT IN ('7') AND from_me = 1  ORDER BY sort_id ASC LIMIT 1"
            java.lang.String r0 = "FIRST_OUTGOING_MESSAGE_RAW_SQL"
            android.database.Cursor r2 = r2.A0A(r1, r0, r11)     // Catch:{ all -> 0x1b37 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x1b2b }
            if (r0 == 0) goto L_0x1b10
            java.lang.String r0 = "_id"
            long r14 = X.C17890vO.A06(r2, r0)     // Catch:{ all -> 0x1b2b }
            goto L_0x1b12
        L_0x1b10:
            r14 = -1
        L_0x1b12:
            r2.close()     // Catch:{ all -> 0x1b37 }
            r10.close()
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x1a66
            java.lang.Long r0 = java.lang.Long.valueOf(r14)
            r3.put(r4, r0)
            goto L_0x1a66
        L_0x1b25:
            X.18K r0 = r8.A0C
            r0.CC7(r7)
            return
        L_0x1b2b:
            r1 = move-exception
            if (r2 == 0) goto L_0x1b36
            r2.close()     // Catch:{ all -> 0x1b32 }
            goto L_0x1b36
        L_0x1b32:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x1b37 }
        L_0x1b36:
            throw r1     // Catch:{ all -> 0x1b37 }
        L_0x1b37:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x1b3c }
            throw r1
        L_0x1b3c:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        L_0x1b41:
            java.lang.Object r4 = r0.A02
            X.6zj r4 = (X.C139966zj) r4
            int r1 = r0.A01
            java.lang.Object r2 = r0.A03
            java.lang.ref.Reference r2 = (java.lang.ref.Reference) r2
            java.lang.Object r3 = r0.A04
            X.1Di r3 = (X.C22821Di) r3
            X.C18070vi.A0k(r2, r3)
            X.1iv r0 = r4.A00
            java.lang.String r1 = r0.A01(r1)
            X.1FU r0 = X.C108945cZ.A0Z(r2)
            if (r0 == 0) goto L_0x1b61
            r0.CEx()
        L_0x1b61:
            r2 = 1
            if (r1 == 0) goto L_0x1b6b
            int r1 = r1.length()
            r0 = 0
            if (r1 != 0) goto L_0x1b6c
        L_0x1b6b:
            r0 = 1
        L_0x1b6c:
            r2 = r2 ^ r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r3.invoke(r0)
            return
        L_0x1b75:
            java.lang.Object r4 = r0.A02
            X.5l0 r4 = (X.C112145l0) r4
            java.lang.Object r1 = r0.A03
            X.1BI r1 = (X.AnonymousClass1BI) r1
            java.lang.Object r2 = r0.A04
            X.6s7 r2 = (X.C135386s7) r2
            int r3 = r0.A01
            X.1M9 r0 = r4.A03
            X.1E7 r0 = r0.A0H(r1)
            X.5yh r1 = new X.5yh
            r1.<init>(r0)
            X.1E7 r0 = r2.A00
            r1.A01(r0)
            X.1KB r2 = r4.A02
            r0 = 24
            X.7RM r1 = new X.7RM
            r1.<init>((java.lang.Object) r4, (int) r3, (int) r0)
        L_0x1b9c:
            r2.A0J(r1)
            return
        L_0x1ba0:
            java.lang.Object r4 = r0.A02
            X.Aa5 r4 = (X.C20827Aa5) r4
            int r3 = r0.A01
            java.lang.Object r2 = r0.A03
            X.9nV r2 = (X.C191979nV) r2
            java.lang.Object r1 = r0.A04
            X.9I2 r1 = (X.AnonymousClass9I2) r1
            com.whatsapp.payments.ui.BrazilOrderDetailsActivity r0 = r4.A01
            r0.A4u(r1, r2, r3)
            return
        L_0x1bb4:
            java.lang.String r0 = "waContactNames"
            goto L_0x1bc2
        L_0x1bb7:
            java.lang.String r0 = "chatsCache"
            goto L_0x1bc2
        L_0x1bba:
            java.lang.String r0 = "contactManager"
            goto L_0x1bc2
        L_0x1bbd:
            java.lang.String r0 = "waWorkers"
            goto L_0x1bc2
        L_0x1bc0:
            java.lang.String r0 = "messageClient"
        L_0x1bc2:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x1bc7:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "LocationNotificationHandler/axolotl unrecognized ciphertext type; jid="
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = "; type="
            X.C17900vP.A0k(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21365Aiu.run():void");
    }
}
