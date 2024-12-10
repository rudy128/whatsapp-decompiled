package X;

public class BO4 extends C25854CnG {
    public static int A00(int i) {
        if (i < 48) {
            return -1;
        }
        if (i <= 57) {
            return i - 48;
        }
        int i2 = 65;
        if (i < 65) {
            return -1;
        }
        if (i > 70) {
            i2 = 97;
            if (i < 97 || i > 102) {
                return -1;
            }
        }
        return (i - i2) + 10;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: X.D8U} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: X.CMe} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v14, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v29, resolved type: X.D8U} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v30, resolved type: X.D8U} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v31, resolved type: X.D8U} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v32, resolved type: X.D8U} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v33, resolved type: X.D8U} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v34, resolved type: X.D8U} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v35, resolved type: X.D8U} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v36, resolved type: X.D8U} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v18, resolved type: X.CMe} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v37, resolved type: X.D8U} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v39, resolved type: X.D8U} */
    /* JADX WARNING: type inference failed for: r7v7, types: [X.D8Q, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v10, types: [X.D8Q, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v11, types: [java.lang.Object, X.CMe] */
    /* JADX WARNING: type inference failed for: r10v8, types: [X.C5A, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v10, types: [X.C5A, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v12, types: [X.C5A, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v21, types: [java.lang.Object, X.D8O] */
    /* JADX WARNING: type inference failed for: r7v23, types: [X.D8P, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (r1 != false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0234, code lost:
        if (r7 == X.C24308Bz5.A0L) goto L_0x0236;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0240, code lost:
        if (r7 == X.C24308Bz5.A0K) goto L_0x0242;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x02bb, code lost:
        if (r6.A0F('-') == false) goto L_0x02bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x037c, code lost:
        r5.A00 += 1000;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0382, code lost:
        r0 = r2.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0384, code lost:
        if (r0 != null) goto L_0x038c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0386, code lost:
        r0 = X.AnonymousClass000.A13();
        r2.A03 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x038c, code lost:
        r0.add(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x03eb, code lost:
        throw new X.C1H("Invalid attribute simpleSelectors");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x03f2, code lost:
        r6.A01 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0401, code lost:
        throw new X.C1H(X.C17900vP.A0A("Invalid or missing parameter section for pseudo class: ", r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x040e, code lost:
        r0 = r5.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x0410, code lost:
        if (r0 == null) goto L_0x041b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0416, code lost:
        if (r0.isEmpty() != false) goto L_0x041b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0418, code lost:
        r14.add(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x041b, code lost:
        return r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0186, code lost:
        if (r6.A0F(')') != false) goto L_0x0188;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0188, code lost:
        r7 = new java.lang.Object();
        r7.A00 = r8;
        r7 = r7;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0393  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x03ab  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x03e0 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x040a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00eb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList A01(X.BO4 r23) {
        /*
            r6 = r23
            int r1 = r6.A01
            int r0 = r6.A00
            boolean r1 = X.AnonymousClass000.A1T(r1, r0)
            r0 = 0
            if (r1 == 0) goto L_0x000e
            return r0
        L_0x000e:
            java.util.ArrayList r14 = X.AnonymousClass8BT.A0z()
        L_0x0012:
            X.CVa r5 = new X.CVa
            r5.<init>()
        L_0x0017:
            int r1 = r6.A01
            int r0 = r6.A00
            boolean r0 = X.AnonymousClass000.A1T(r1, r0)
            if (r0 != 0) goto L_0x040e
            int r0 = r6.A01
            r23 = r0
            java.util.List r0 = r5.A01
            if (r0 == 0) goto L_0x0030
            boolean r1 = r0.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x0031
        L_0x0030:
            r0 = 1
        L_0x0031:
            r4 = 0
            if (r0 != 0) goto L_0x03cd
            r0 = 62
            boolean r0 = r6.A0F(r0)
            if (r0 == 0) goto L_0x03c1
            java.lang.Integer r3 = X.AnonymousClass00R.A01
        L_0x003e:
            r6.A0D()
        L_0x0041:
            r0 = 42
            boolean r0 = r6.A0F(r0)
            if (r0 == 0) goto L_0x03ab
            X.CYo r2 = new X.CYo
            r2.<init>(r3, r4)
        L_0x004e:
            int r1 = r6.A01
            int r0 = r6.A00
            boolean r0 = X.AnonymousClass000.A1T(r1, r0)
            if (r0 != 0) goto L_0x0391
            r0 = 46
            boolean r0 = r6.A0F(r0)
            if (r0 == 0) goto L_0x007b
            if (r2 != 0) goto L_0x0067
            X.CYo r2 = new X.CYo
            r2.<init>(r3, r4)
        L_0x0067:
            java.lang.String r7 = r6.A0I()
            if (r7 == 0) goto L_0x03d0
            java.lang.String r1 = "class"
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            r2.A00(r0, r1, r7)
            int r0 = r5.A00
            int r0 = r0 + 1000
            r5.A00 = r0
            goto L_0x004e
        L_0x007b:
            r0 = 35
            boolean r0 = r6.A0F(r0)
            if (r0 == 0) goto L_0x00a0
            if (r2 != 0) goto L_0x008a
            X.CYo r2 = new X.CYo
            r2.<init>(r3, r4)
        L_0x008a:
            java.lang.String r7 = r6.A0I()
            if (r7 == 0) goto L_0x03d8
            java.lang.String r1 = "id"
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            r2.A00(r0, r1, r7)
            int r1 = r5.A00
            r0 = 1000000(0xf4240, float:1.401298E-39)
            int r1 = r1 + r0
            r5.A00 = r1
            goto L_0x004e
        L_0x00a0:
            r0 = 91
            boolean r0 = r6.A0F(r0)
            if (r0 == 0) goto L_0x0113
            if (r2 != 0) goto L_0x00af
            X.CYo r2 = new X.CYo
            r2.<init>(r3, r4)
        L_0x00af:
            r6.A0D()
            java.lang.String r8 = r6.A0I()
            java.lang.String r7 = "Invalid attribute simpleSelectors"
            if (r8 == 0) goto L_0x03ec
            r6.A0D()
            r0 = 61
            boolean r0 = r6.A0F(r0)
            if (r0 == 0) goto L_0x00fa
            java.lang.Integer r9 = X.AnonymousClass00R.A01
        L_0x00c7:
            r6.A0D()
            int r1 = r6.A01
            int r0 = r6.A00
            boolean r0 = X.AnonymousClass000.A1T(r1, r0)
            if (r0 != 0) goto L_0x03e6
            java.lang.String r1 = r6.A0B()
            if (r1 != 0) goto L_0x00e0
            java.lang.String r1 = r6.A0I()
            if (r1 == 0) goto L_0x03e6
        L_0x00e0:
            r6.A0D()
        L_0x00e3:
            r0 = 93
            boolean r0 = r6.A0F(r0)
            if (r0 == 0) goto L_0x03e0
            if (r9 != 0) goto L_0x00ef
            java.lang.Integer r9 = X.AnonymousClass00R.A00
        L_0x00ef:
            r2.A00(r9, r8, r1)
            int r0 = r5.A00
            int r0 = r0 + 1000
            r5.A00 = r0
            goto L_0x004e
        L_0x00fa:
            java.lang.String r0 = "~="
            boolean r0 = r6.A0G(r0)
            if (r0 == 0) goto L_0x0105
            java.lang.Integer r9 = X.AnonymousClass00R.A0C
            goto L_0x00c7
        L_0x0105:
            java.lang.String r0 = "|="
            boolean r0 = r6.A0G(r0)
            if (r0 == 0) goto L_0x0110
            java.lang.Integer r9 = X.AnonymousClass00R.A0N
            goto L_0x00c7
        L_0x0110:
            r9 = r4
            r1 = r4
            goto L_0x00e3
        L_0x0113:
            r0 = 58
            boolean r0 = r6.A0F(r0)
            if (r0 == 0) goto L_0x0391
            if (r2 != 0) goto L_0x0122
            X.CYo r2 = new X.CYo
            r2.<init>(r3, r4)
        L_0x0122:
            java.lang.String r8 = r6.A0I()
            if (r8 == 0) goto L_0x0402
            java.util.Map r0 = X.C24308Bz5.A00
            java.lang.Object r7 = r0.get(r8)
            X.Bz5 r7 = (X.C24308Bz5) r7
            if (r7 != 0) goto L_0x0134
            X.Bz5 r7 = X.C24308Bz5.UNSUPPORTED
        L_0x0134:
            X.C7s r0 = X.C24523C7s.$redex_init_class
            int r0 = r7.ordinal()
            java.lang.String r19 = "Invalid or missing parameter section for pseudo class: "
            r1 = 1
            r10 = 0
            switch(r0) {
                case 0: goto L_0x0225;
                case 1: goto L_0x0330;
                case 2: goto L_0x022c;
                case 3: goto L_0x022c;
                case 4: goto L_0x022c;
                case 5: goto L_0x022c;
                case 6: goto L_0x0372;
                case 7: goto L_0x0367;
                case 8: goto L_0x034f;
                case 9: goto L_0x0342;
                case 10: goto L_0x035c;
                case 11: goto L_0x0336;
                case 12: goto L_0x032a;
                case 13: goto L_0x0194;
                case 14: goto L_0x0151;
                case 15: goto L_0x0188;
                case 16: goto L_0x0188;
                case 17: goto L_0x0188;
                case 18: goto L_0x0188;
                case 19: goto L_0x0188;
                case 20: goto L_0x0188;
                case 21: goto L_0x0188;
                case 22: goto L_0x0188;
                case 23: goto L_0x0188;
                default: goto L_0x0141;
            }
        L_0x0141:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Unsupported pseudo class: "
            java.lang.String r1 = X.AnonymousClass001.A1H(r0, r8, r1)
            X.C1H r0 = new X.C1H
            r0.<init>(r1)
            throw r0
        L_0x0151:
            int r1 = r6.A01
            int r0 = r6.A00
            boolean r0 = X.AnonymousClass000.A1T(r1, r0)
            if (r0 != 0) goto L_0x0188
            int r1 = r6.A01
            r0 = 40
            boolean r0 = r6.A0F(r0)
            if (r0 == 0) goto L_0x0188
            r6.A0D()
        L_0x0168:
            java.lang.String r0 = r6.A0I()
            if (r0 == 0) goto L_0x0191
            if (r10 != 0) goto L_0x0174
            java.util.ArrayList r10 = X.AnonymousClass000.A13()
        L_0x0174:
            r10.add(r0)
            r6.A0D()
            boolean r0 = r6.A0E()
            if (r0 != 0) goto L_0x0168
            r0 = 41
            boolean r0 = r6.A0F(r0)
            if (r0 == 0) goto L_0x0191
        L_0x0188:
            X.D8P r7 = new X.D8P
            r7.<init>()
            r7.A00 = r8
            goto L_0x037c
        L_0x0191:
            r6.A01 = r1
            goto L_0x0188
        L_0x0194:
            int r1 = r6.A01
            int r0 = r6.A00
            boolean r0 = X.AnonymousClass000.A1T(r1, r0)
            if (r0 != 0) goto L_0x01f3
            int r1 = r6.A01
            r0 = 40
            boolean r0 = r6.A0F(r0)
            if (r0 == 0) goto L_0x01f3
            r6.A0D()
            java.util.ArrayList r9 = A01(r6)
            if (r9 == 0) goto L_0x01ff
            r0 = 41
            boolean r0 = r6.A0F(r0)
            if (r0 == 0) goto L_0x01ff
            java.util.Iterator r10 = r9.iterator()
        L_0x01bd:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0202
            java.lang.Object r0 = r10.next()
            X.CVa r0 = (X.C25046CVa) r0
            java.util.List r0 = r0.A01
            if (r0 == 0) goto L_0x0202
            java.util.Iterator r7 = r0.iterator()
        L_0x01d1:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x01bd
            java.lang.Object r0 = r7.next()
            X.CYo r0 = (X.C25115CYo) r0
            java.util.List r0 = r0.A03
            if (r0 == 0) goto L_0x01bd
            java.util.Iterator r1 = r0.iterator()
        L_0x01e5:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01d1
            java.lang.Object r0 = r1.next()
            boolean r0 = r0 instanceof X.D8O
            if (r0 == 0) goto L_0x01e5
        L_0x01f3:
            r0 = r19
            java.lang.String r1 = X.C17900vP.A0A(r0, r8)
            X.C1H r0 = new X.C1H
            r0.<init>(r1)
            throw r0
        L_0x01ff:
            r6.A01 = r1
            goto L_0x01f3
        L_0x0202:
            X.D8O r7 = new X.D8O
            r7.<init>()
            r7.A00 = r9
            java.util.Iterator r8 = r9.iterator()
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x020f:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0221
            java.lang.Object r0 = r8.next()
            X.CVa r0 = (X.C25046CVa) r0
            int r0 = r0.A00
            if (r0 <= r1) goto L_0x020f
            r1 = r0
            goto L_0x020f
        L_0x0221:
            r5.A00 = r1
            goto L_0x0382
        L_0x0225:
            X.D8T r7 = new X.D8T
            r7.<init>()
            goto L_0x037c
        L_0x022c:
            X.Bz5 r0 = X.C24308Bz5.nth_child
            if (r7 == r0) goto L_0x0236
            X.Bz5 r0 = X.C24308Bz5.nth_of_type
            r20 = 0
            if (r7 != r0) goto L_0x0238
        L_0x0236:
            r20 = 1
        L_0x0238:
            X.Bz5 r0 = X.C24308Bz5.nth_of_type
            if (r7 == r0) goto L_0x0242
            X.Bz5 r0 = X.C24308Bz5.nth_last_of_type
            r21 = 0
            if (r7 != r0) goto L_0x0244
        L_0x0242:
            r21 = 1
        L_0x0244:
            int r7 = r6.A01
            int r0 = r6.A00
            boolean r0 = X.AnonymousClass000.A1T(r7, r0)
            if (r0 != 0) goto L_0x03f6
            int r0 = r6.A01
            r22 = r0
            r0 = 40
            boolean r0 = r6.A0F(r0)
            if (r0 == 0) goto L_0x03f6
            r6.A0D()
            java.lang.String r0 = "odd"
            boolean r0 = r6.A0G(r0)
            r18 = 1
            if (r0 == 0) goto L_0x0297
            r0 = 2
            X.C5A r10 = new X.C5A
            r10.<init>()
            r10.A00 = r0
            r10.A01 = r1
        L_0x0271:
            r6.A0D()
            r0 = 41
            boolean r0 = r6.A0F(r0)
            if (r0 == 0) goto L_0x03f2
            int r8 = r10.A00
            int r1 = r10.A01
            java.lang.String r0 = r2.A01
            X.D8U r7 = new X.D8U
            r16 = r7
            r17 = r0
            r18 = r8
            r19 = r1
            r16.<init>(r17, r18, r19, r20, r21)
            int r0 = r5.A00
            int r0 = r0 + 1000
            r5.A00 = r0
            goto L_0x0382
        L_0x0297:
            java.lang.String r0 = "even"
            boolean r0 = r6.A0G(r0)
            r9 = 0
            if (r0 == 0) goto L_0x02ab
            r0 = 2
            X.C5A r10 = new X.C5A
            r10.<init>()
            r10.A00 = r0
            r10.A01 = r9
            goto L_0x0271
        L_0x02ab:
            r13 = 43
            boolean r0 = r6.A0F(r13)
            r12 = 45
            if (r0 != 0) goto L_0x02bd
            boolean r0 = r6.A0F(r12)
            r17 = -1
            if (r0 != 0) goto L_0x02bf
        L_0x02bd:
            r17 = 1
        L_0x02bf:
            java.lang.String r11 = r6.A03
            int r0 = r6.A01
            int r7 = r6.A00
            X.CMe r1 = X.C24836CMe.A00(r11, r0, r7)
            if (r1 == 0) goto L_0x02cf
            int r0 = r1.A00
            r6.A01 = r0
        L_0x02cf:
            r0 = 110(0x6e, float:1.54E-43)
            boolean r0 = r6.A0F(r0)
            if (r0 != 0) goto L_0x02f2
            r0 = 78
            boolean r0 = r6.A0F(r0)
            if (r0 != 0) goto L_0x02f2
            r10 = r1
            r7 = 0
        L_0x02e1:
            if (r10 == 0) goto L_0x02e8
            long r0 = r10.A01
            int r9 = (int) r0
            int r9 = r17 * r9
        L_0x02e8:
            X.C5A r10 = new X.C5A
            r10.<init>()
            r10.A00 = r7
            r10.A01 = r9
            goto L_0x0271
        L_0x02f2:
            if (r1 != 0) goto L_0x0301
            int r0 = r6.A01
            r15 = 1
            X.CMe r1 = new X.CMe
            r1.<init>()
            r1.A01 = r15
            r1.A00 = r0
        L_0x0301:
            r6.A0D()
            boolean r0 = r6.A0F(r13)
            if (r0 != 0) goto L_0x0312
            boolean r0 = r6.A0F(r12)
            if (r0 == 0) goto L_0x0321
            r18 = -1
        L_0x0312:
            r6.A0D()
            int r0 = r6.A01
            X.CMe r10 = X.C24836CMe.A00(r11, r0, r7)
            if (r10 == 0) goto L_0x03f2
            int r0 = r10.A00
            r6.A01 = r0
        L_0x0321:
            r7 = r17
            r17 = r18
            long r0 = r1.A01
            int r11 = (int) r0
            int r7 = r7 * r11
            goto L_0x02e1
        L_0x032a:
            X.D8R r7 = new X.D8R
            r7.<init>()
            goto L_0x037c
        L_0x0330:
            X.D8S r7 = new X.D8S
            r7.<init>()
            goto L_0x037c
        L_0x0336:
            java.lang.String r0 = r2.A01
            X.D8Q r7 = new X.D8Q
            r7.<init>()
            r7.A01 = r1
            r7.A00 = r0
            goto L_0x037c
        L_0x0342:
            java.lang.String r0 = r2.A01
            X.D8U r7 = new X.D8U
            r9 = 0
            r10 = r1
            r8 = r0
            r11 = r9
            r12 = r1
            r7.<init>(r8, r9, r10, r11, r12)
            goto L_0x037c
        L_0x034f:
            java.lang.String r0 = r2.A01
            X.D8U r7 = new X.D8U
            r9 = 0
            r12 = r1
            r10 = r1
            r8 = r0
            r11 = r1
            r7.<init>(r8, r9, r10, r11, r12)
            goto L_0x037c
        L_0x035c:
            X.D8Q r7 = new X.D8Q
            r7.<init>()
            r0 = 0
            r7.A01 = r0
            r7.A00 = r4
            goto L_0x037c
        L_0x0367:
            X.D8U r7 = new X.D8U
            r9 = 0
            r12 = r9
            r8 = r4
            r10 = r1
            r11 = r9
            r7.<init>(r8, r9, r10, r11, r12)
            goto L_0x037c
        L_0x0372:
            X.D8U r7 = new X.D8U
            r9 = 0
            r11 = r1
            r8 = r4
            r10 = r1
            r12 = r9
            r7.<init>(r8, r9, r10, r11, r12)
        L_0x037c:
            int r0 = r5.A00
            int r0 = r0 + 1000
            r5.A00 = r0
        L_0x0382:
            java.util.List r0 = r2.A03
            if (r0 != 0) goto L_0x038c
            java.util.ArrayList r0 = X.AnonymousClass000.A13()
            r2.A03 = r0
        L_0x038c:
            r0.add(r7)
            goto L_0x004e
        L_0x0391:
            if (r2 == 0) goto L_0x040a
            java.util.List r0 = r5.A01
            if (r0 != 0) goto L_0x039d
            java.util.ArrayList r0 = X.AnonymousClass000.A13()
            r5.A01 = r0
        L_0x039d:
            r0.add(r2)
            boolean r0 = r6.A0E()
            if (r0 == 0) goto L_0x0017
            r14.add(r5)
            goto L_0x0012
        L_0x03ab:
            java.lang.String r0 = r6.A0I()
            if (r0 == 0) goto L_0x03be
            X.CYo r2 = new X.CYo
            r2.<init>(r3, r0)
            int r0 = r5.A00
            int r0 = r0 + 1
            r5.A00 = r0
            goto L_0x004e
        L_0x03be:
            r2 = r4
            goto L_0x004e
        L_0x03c1:
            r0 = 43
            boolean r0 = r6.A0F(r0)
            if (r0 == 0) goto L_0x03cd
            java.lang.Integer r3 = X.AnonymousClass00R.A0C
            goto L_0x003e
        L_0x03cd:
            r3 = r4
            goto L_0x0041
        L_0x03d0:
            java.lang.String r1 = "Invalid \".class\" simpleSelectors"
            X.C1H r0 = new X.C1H
            r0.<init>(r1)
            throw r0
        L_0x03d8:
            java.lang.String r1 = "Invalid \"#id\" simpleSelectors"
            X.C1H r0 = new X.C1H
            r0.<init>(r1)
            throw r0
        L_0x03e0:
            X.C1H r0 = new X.C1H
            r0.<init>(r7)
            throw r0
        L_0x03e6:
            X.C1H r0 = new X.C1H
            r0.<init>(r7)
            throw r0
        L_0x03ec:
            X.C1H r0 = new X.C1H
            r0.<init>(r7)
            throw r0
        L_0x03f2:
            r0 = r22
            r6.A01 = r0
        L_0x03f6:
            r0 = r19
            java.lang.String r1 = X.C17900vP.A0A(r0, r8)
            X.C1H r0 = new X.C1H
            r0.<init>(r1)
            throw r0
        L_0x0402:
            java.lang.String r1 = "Invalid pseudo class"
            X.C1H r0 = new X.C1H
            r0.<init>(r1)
            throw r0
        L_0x040a:
            r0 = r23
            r6.A01 = r0
        L_0x040e:
            java.util.List r0 = r5.A01
            if (r0 == 0) goto L_0x041b
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x041b
            r14.add(r5)
        L_0x041b:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BO4.A01(X.BO4):java.util.ArrayList");
    }

    public String A0H() {
        char charAt;
        if (AnonymousClass000.A1T(this.A01, this.A00) || ((charAt = this.A03.charAt(this.A01)) != '\'' && charAt != '\"')) {
            return null;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        this.A01++;
        loop0:
        while (true) {
            int intValue = A09().intValue();
            while (intValue != -1 && intValue != charAt) {
                if (intValue == 92) {
                    intValue = A09().intValue();
                    if (intValue == -1) {
                        break loop0;
                    } else if (!(intValue == 10 || intValue == 13 || intValue == 12)) {
                        int A00 = A00(intValue);
                        if (A00 != -1) {
                            int i = 1;
                            do {
                                intValue = A09().intValue();
                                int A002 = A00(intValue);
                                if (A002 == -1) {
                                    break;
                                }
                                A00 = (A00 * 16) + A002;
                                i++;
                            } while (i <= 5);
                            A10.append((char) A00);
                        }
                    }
                }
                A10.append((char) intValue);
            }
        }
        return A10.toString();
    }

    public String A0I() {
        boolean A1T = AnonymousClass000.A1T(this.A01, this.A00);
        int i = this.A01;
        int i2 = i;
        if (!A1T) {
            int charAt = this.A03.charAt(i);
            if (charAt == 45) {
                charAt = A06();
            }
            if (charAt >= 65 && (charAt <= 90 || (charAt < 97 ? charAt == 95 : charAt <= 122))) {
                while (true) {
                    int A06 = A06();
                    if (A06 >= 65) {
                        if (A06 > 90) {
                            if (A06 < 97) {
                                if (A06 != 95) {
                                    break;
                                }
                            } else if (A06 > 122) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else if (A06 >= 48) {
                        if (A06 > 57) {
                            break;
                        }
                    } else if (A06 != 45) {
                        break;
                    }
                }
                i2 = this.A01;
            }
            this.A01 = i;
        }
        if (i2 == i) {
            return null;
        }
        String substring = this.A03.substring(i, i2);
        this.A01 = i2;
        return substring;
    }
}
