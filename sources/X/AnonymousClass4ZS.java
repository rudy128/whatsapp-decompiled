package X;

import android.content.res.Resources;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.4ZS  reason: invalid class name */
public class AnonymousClass4ZS {
    public final C18000vb A00;
    public final C18100vl A01 = AnonymousClass1DF.A01(new DWU(8));

    public AnonymousClass4ZS(C18000vb r3) {
        C18070vi.A0d(r3, 1);
        this.A00 = r3;
    }

    private final String A00(Resources resources, String str, int i) {
        int i2;
        Object[] objArr;
        Object[] objArr2;
        if (i != 3) {
            if (i == 4) {
                i2 = 2131896139;
            } else if (i == 6) {
                i2 = 2131896138;
            } else if (i == 8) {
                i2 = 2131896137;
            } else if (i == 9) {
                i2 = 2131896136;
                objArr = new Object[1];
                objArr2 = new Object[]{str};
            } else {
                throw new C99674tH(AnonymousClass001.A1I("Invalid multiplier: ", AnonymousClass000.A10(), i));
            }
            objArr = new Object[1];
            objArr2 = new Object[]{str, this.A00.A0N()};
        } else {
            i2 = 2131896140;
            objArr = new Object[1];
            objArr2 = new Object[]{str, this.A00.A0N()};
        }
        Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
        String format = String.format((Locale) null, "%s", Arrays.copyOf(copyOf, copyOf.length));
        C18070vi.A0X(format);
        String A0x = AnonymousClass3MW.A0x(resources, format, objArr, 0, i2);
        C18070vi.A0b(A0x);
        return A0x;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0074, code lost:
        if (r2 != null) goto L_0x0076;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x018d A[EDGE_INSN: B:80:0x018d->B:76:0x018d ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A02(android.content.res.Resources r20, java.lang.Integer r21, boolean r22) {
        /*
            r19 = this;
            r11 = 1
            r2 = r21
            if (r21 != 0) goto L_0x0008
            java.lang.String r2 = ""
        L_0x0007:
            return r2
        L_0x0008:
            int r7 = r2.intValue()
            int r10 = java.lang.Math.abs(r7)
            r0 = 1000(0x3e8, float:1.401E-42)
            r8 = r19
            if (r10 >= r0) goto L_0x0038
            X.0vb r1 = r8.A00
            java.util.Locale r0 = r1.A0N()
            java.text.NumberFormat r0 = java.text.NumberFormat.getNumberInstance(r0)
            java.lang.String r2 = r0.format(r2)
            X.C18070vi.A0b(r2)
            boolean r0 = X.AnonymousClass3MW.A1Z(r1)
            if (r0 == 0) goto L_0x0007
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            r0 = 8206(0x200e, float:1.1499E-41)
            java.lang.String r2 = X.C17890vO.A0Z(r2, r1, r0)
            return r2
        L_0x0038:
            X.0vb r0 = r8.A00
            java.util.Locale r4 = r0.A0N()
            X.C18070vi.A0X(r4)
            X.0vl r1 = r8.A01
            java.lang.Object r0 = r1.getValue()
            java.util.Set r0 = (java.util.Set) r0
            boolean r0 = r0.contains(r4)
            if (r0 != 0) goto L_0x0076
            java.lang.Object r0 = r1.getValue()
            java.util.Set r0 = (java.util.Set) r0
            java.util.Iterator r3 = r0.iterator()
        L_0x0059:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00b3
            java.lang.Object r2 = r3.next()
            r0 = r2
            java.util.Locale r0 = (java.util.Locale) r0
            java.lang.String r1 = r0.getLanguage()
            java.lang.String r0 = r4.getLanguage()
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x0059
            if (r2 == 0) goto L_0x00b3
        L_0x0076:
            java.lang.Integer r9 = X.AnonymousClass00R.A00
        L_0x0078:
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            java.lang.String r6 = "%d"
            r12 = 0
            r2 = 4621819117588971520(0x4024000000000000, double:10.0)
            r13 = r20
            if (r9 != r0) goto L_0x00b6
            r4 = 4652007308841189376(0x408f400000000000, double:1000.0)
            r0 = 4616189618054758400(0x4010000000000000, double:4.0)
            double r17 = java.lang.Math.pow(r2, r0)
            int r0 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
            if (r0 >= 0) goto L_0x00b6
            double r4 = (double) r10
            r14 = 3
            r0 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r15 = java.lang.Math.pow(r2, r0)
            int r0 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r0 < 0) goto L_0x00b6
            int r0 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
            if (r0 >= 0) goto L_0x00b6
            java.lang.Object[] r3 = new java.lang.Object[r11]
            double r0 = (double) r7
            double r0 = r0 / r15
            int r2 = (int) r0
            X.C17880vN.A1T(r3, r2, r12)
            java.lang.String r0 = r8.A01(r6, r3)
            java.lang.String r2 = r8.A00(r13, r0, r14)
            return r2
        L_0x00b3:
            java.lang.Integer r9 = X.AnonymousClass00R.A01
            goto L_0x0078
        L_0x00b6:
            double r6 = (double) r7
            int r17 = r9.intValue()
            if (r17 == 0) goto L_0x018a
            r9 = 3
        L_0x00be:
            double r0 = (double) r9
            double r2 = java.lang.Math.pow(r2, r0)
            double r4 = (double) r10
            double r4 = java.lang.Math.log10(r4)
            double r4 = java.lang.Math.floor(r4)
            double r4 = r4 / r0
            double r0 = java.lang.Math.floor(r4)
            double r0 = java.lang.Math.pow(r2, r0)
            double r4 = r6 / r0
            double r15 = java.lang.Math.abs(r4)
            int r9 = r9 - r11
            double r2 = (double) r9
            r0 = 4621819117588971520(0x4024000000000000, double:10.0)
            double r1 = java.lang.Math.pow(r0, r2)
            r14 = 10
            int r0 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0146
            boolean r0 = java.lang.Double.isNaN(r4)
            if (r0 != 0) goto L_0x00ff
            boolean r0 = java.lang.Double.isInfinite(r4)
            if (r0 != 0) goto L_0x00ff
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0141
            double r4 = java.lang.Math.floor(r4)
        L_0x00ff:
            r0 = 4621819117588971520(0x4024000000000000, double:10.0)
            double r0 = r0 * r4
            double r0 = java.lang.Math.floor(r0)
            int r2 = (int) r0
            int r2 = r2 % r14
            if (r2 != 0) goto L_0x013e
            java.lang.String r2 = "%.0f"
        L_0x010c:
            java.lang.Object[] r1 = new java.lang.Object[r11]
            java.lang.Double r0 = java.lang.Double.valueOf(r4)
            r1[r12] = r0
            java.lang.String r10 = r8.A01(r2, r1)
            r9 = 0
            r5 = 1
        L_0x011a:
            if (r17 == 0) goto L_0x013c
            r4 = 3
        L_0x011d:
            int r1 = r4 + r9
            if (r17 == 0) goto L_0x0139
            r0 = 9
        L_0x0123:
            if (r1 > r0) goto L_0x018d
            double r2 = (double) r4
            r0 = 4621819117588971520(0x4024000000000000, double:10.0)
            double r0 = java.lang.Math.pow(r0, r2)
            int r2 = (int) r0
            int r5 = r5 * r2
            double r0 = (double) r5
            double r11 = java.lang.Math.abs(r6)
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 > 0) goto L_0x018d
            int r9 = r9 + r4
            goto L_0x011a
        L_0x0139:
            r0 = 8
            goto L_0x0123
        L_0x013c:
            r4 = 4
            goto L_0x011d
        L_0x013e:
            java.lang.String r2 = "%.1f"
            goto L_0x010c
        L_0x0141:
            double r4 = java.lang.Math.ceil(r4)
            goto L_0x00ff
        L_0x0146:
            r0 = 4621819117588971520(0x4024000000000000, double:10.0)
            double r4 = r4 * r0
            if (r22 == 0) goto L_0x016e
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r9 = r4 % r0
            r1 = -4620693217682128896(0xbfe0000000000000, double:-0.5)
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            boolean r3 = X.AnonymousClass000.A1P(r0)
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0169
            if (r3 == 0) goto L_0x0169
            double r0 = java.lang.Math.floor(r4)
            int r2 = (int) r0
        L_0x0164:
            double r4 = (double) r2
        L_0x0165:
            r0 = 4621819117588971520(0x4024000000000000, double:10.0)
            double r4 = r4 / r0
            goto L_0x00ff
        L_0x0169:
            int r2 = X.C22339B3q.A00(r4)
            goto L_0x0164
        L_0x016e:
            boolean r0 = java.lang.Double.isNaN(r4)
            if (r0 != 0) goto L_0x0165
            boolean r0 = java.lang.Double.isInfinite(r4)
            if (r0 != 0) goto L_0x0165
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0185
            double r4 = java.lang.Math.floor(r4)
            goto L_0x0165
        L_0x0185:
            double r4 = java.lang.Math.ceil(r4)
            goto L_0x0165
        L_0x018a:
            r9 = 4
            goto L_0x00be
        L_0x018d:
            java.lang.String r2 = r8.A00(r13, r10, r9)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4ZS.A02(android.content.res.Resources, java.lang.Integer, boolean):java.lang.String");
    }

    private final String A01(String str, Object... objArr) {
        C18000vb r0 = this.A00;
        Locale A0N = r0.A0N();
        if (AnonymousClass3MW.A1Z(r0)) {
            str = C17890vO.A0Z(str, AnonymousClass000.A10(), 8206);
        }
        Object[] copyOf = Arrays.copyOf(objArr, 1);
        String format = String.format(A0N, str, Arrays.copyOf(copyOf, copyOf.length));
        C18070vi.A0X(format);
        return format;
    }
}
