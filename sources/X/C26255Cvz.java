package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Cvz  reason: case insensitive filesystem */
public class C26255Cvz {
    public C24303Bz0 A00;
    public Integer A01;
    public boolean A02 = false;

    public static int A00(C22761BNy bNy, List list, int i) {
        int i2 = 0;
        if (i >= 0) {
            Object obj = list.get(i);
            E7L e7l = bNy.A00;
            if (obj == e7l) {
                for (Object obj2 : e7l.BOi()) {
                    if (obj2 != bNy) {
                        i2++;
                    }
                }
            }
            return -1;
        }
        return i2;
    }

    public static boolean A05(C24424C2z c2z, C25046CVa cVa, List list, int i, int i2) {
        C25046CVa cVa2 = cVa;
        int i3 = i2;
        C25115CYo cYo = (C25115CYo) cVa2.A01.get(i);
        List list2 = list;
        C22761BNy bNy = (C22761BNy) list.get(i2);
        C24424C2z c2z2 = c2z;
        if (A06(c2z, cYo, bNy)) {
            Integer num = cYo.A00;
            if (num == AnonymousClass00R.A00) {
                if (i == 0) {
                    return true;
                }
                while (i3 > 0) {
                    i3--;
                    if (A05(c2z, cVa2, list, i - 1, i3)) {
                        return true;
                    }
                }
            } else if (num == AnonymousClass00R.A01) {
                return A05(c2z, cVa2, list, i - 1, i2 - 1);
            } else {
                int A002 = A00(bNy, list, i2);
                if (A002 > 0) {
                    return A04(c2z2, cVa2, (C22761BNy) bNy.A00.BOi().get(A002 - 1), list2, i - 1, i3);
                }
            }
        }
        return false;
    }

    public C26255Cvz() {
        C24303Bz0 bz0 = C24303Bz0.screen;
        Integer num = AnonymousClass00R.A00;
        this.A00 = bz0;
        this.A01 = num;
    }

    /* JADX WARNING: type inference failed for: r0v28, types: [X.C63, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x02a3, code lost:
        r11.A02 = true;
        r4.A01(A01(r10, r11));
        r11.A02 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0131, code lost:
        if (r7.toString() != null) goto L_0x0144;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0157, code lost:
        if (r10.A0G(")") == false) goto L_0x0133;
     */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01e1 A[Catch:{ C1H -> 0x02cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0293 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C25130CZd A01(X.BO4 r10, X.C26255Cvz r11) {
        /*
            X.CZd r4 = new X.CZd
            r4.<init>()
        L_0x0005:
            int r1 = r10.A01     // Catch:{ C1H -> 0x02cb }
            int r0 = r10.A00     // Catch:{ C1H -> 0x02cb }
            boolean r0 = X.AnonymousClass000.A1T(r1, r0)     // Catch:{ C1H -> 0x02cb }
            if (r0 != 0) goto L_0x02db
            java.lang.String r0 = "<!--"
            boolean r0 = r10.A0G(r0)     // Catch:{ C1H -> 0x02cb }
            if (r0 != 0) goto L_0x0005
            java.lang.String r0 = "-->"
            boolean r0 = r10.A0G(r0)     // Catch:{ C1H -> 0x02cb }
            if (r0 != 0) goto L_0x0005
            r0 = 64
            boolean r0 = r10.A0F(r0)     // Catch:{ C1H -> 0x02cb }
            if (r0 == 0) goto L_0x01b6
            java.lang.String r1 = r10.A0I()     // Catch:{ C1H -> 0x02cb }
            r10.A0D()     // Catch:{ C1H -> 0x02cb }
            if (r1 == 0) goto L_0x01ad
            boolean r0 = r11.A02     // Catch:{ C1H -> 0x02cb }
            java.lang.String r3 = "Invalid @media rule: expected '}' at end of rule set"
            r6 = 0
            r7 = 1
            if (r0 != 0) goto L_0x0178
            java.lang.String r0 = "media"
            boolean r0 = r1.equals(r0)     // Catch:{ C1H -> 0x02cb }
            if (r0 == 0) goto L_0x0075
            java.util.ArrayList r1 = A02(r10)     // Catch:{ C1H -> 0x02cb }
            r0 = 123(0x7b, float:1.72E-43)
            boolean r0 = r10.A0F(r0)     // Catch:{ C1H -> 0x02cb }
            if (r0 == 0) goto L_0x006c
            r10.A0D()     // Catch:{ C1H -> 0x02cb }
            X.Bz0 r5 = r11.A00     // Catch:{ C1H -> 0x02cb }
            java.util.Iterator r2 = r1.iterator()     // Catch:{ C1H -> 0x02cb }
        L_0x0055:
            boolean r0 = r2.hasNext()     // Catch:{ C1H -> 0x02cb }
            if (r0 == 0) goto L_0x0067
            java.lang.Object r1 = r2.next()     // Catch:{ C1H -> 0x02cb }
            X.Bz0 r0 = X.C24303Bz0.all     // Catch:{ C1H -> 0x02cb }
            if (r1 == r0) goto L_0x02a3
            if (r1 != r5) goto L_0x0055
            goto L_0x02a3
        L_0x0067:
            A01(r10, r11)     // Catch:{ C1H -> 0x02cb }
            goto L_0x02ae
        L_0x006c:
            java.lang.String r0 = "Invalid @media rule: missing rule set"
            X.C1H r1 = new X.C1H     // Catch:{ C1H -> 0x02cb }
            r1.<init>(r0)     // Catch:{ C1H -> 0x02cb }
            goto L_0x02c5
        L_0x0075:
            java.lang.String r0 = "import"
            boolean r0 = r1.equals(r0)     // Catch:{ C1H -> 0x02cb }
            if (r0 == 0) goto L_0x0178
            int r1 = r10.A01     // Catch:{ C1H -> 0x02cb }
            int r0 = r10.A00     // Catch:{ C1H -> 0x02cb }
            boolean r0 = X.AnonymousClass000.A1T(r1, r0)     // Catch:{ C1H -> 0x02cb }
            if (r0 != 0) goto L_0x0135
            int r8 = r10.A01     // Catch:{ C1H -> 0x02cb }
            java.lang.String r0 = "url("
            boolean r0 = r10.A0G(r0)     // Catch:{ C1H -> 0x02cb }
            if (r0 == 0) goto L_0x0135
            r10.A0D()     // Catch:{ C1H -> 0x02cb }
            java.lang.String r0 = r10.A0H()     // Catch:{ C1H -> 0x02cb }
            if (r0 != 0) goto L_0x0144
            java.lang.StringBuilder r7 = X.AnonymousClass000.A10()     // Catch:{ C1H -> 0x02cb }
        L_0x009e:
            int r1 = r10.A01     // Catch:{ C1H -> 0x02cb }
            int r0 = r10.A00     // Catch:{ C1H -> 0x02cb }
            boolean r0 = X.AnonymousClass000.A1T(r1, r0)     // Catch:{ C1H -> 0x02cb }
            if (r0 != 0) goto L_0x0127
            java.lang.String r9 = r10.A03     // Catch:{ C1H -> 0x02cb }
            int r0 = r10.A01     // Catch:{ C1H -> 0x02cb }
            char r2 = r9.charAt(r0)     // Catch:{ C1H -> 0x02cb }
            r0 = 39
            if (r2 == r0) goto L_0x0127
            r0 = 34
            if (r2 == r0) goto L_0x0127
            r0 = 40
            if (r2 == r0) goto L_0x0127
            r0 = 41
            if (r2 == r0) goto L_0x0127
            boolean r0 = X.C25854CnG.A02(r2)     // Catch:{ C1H -> 0x02cb }
            if (r0 != 0) goto L_0x0127
            boolean r0 = java.lang.Character.isISOControl(r2)     // Catch:{ C1H -> 0x02cb }
            if (r0 != 0) goto L_0x0127
            int r0 = r10.A01     // Catch:{ C1H -> 0x02cb }
            int r1 = r0 + 1
            r10.A01 = r1     // Catch:{ C1H -> 0x02cb }
            r0 = 92
            if (r2 != r0) goto L_0x0121
            int r0 = r10.A00     // Catch:{ C1H -> 0x02cb }
            boolean r0 = X.AnonymousClass000.A1T(r1, r0)     // Catch:{ C1H -> 0x02cb }
            if (r0 != 0) goto L_0x009e
            int r0 = r1 + 1
            r10.A01 = r0     // Catch:{ C1H -> 0x02cb }
            char r2 = r9.charAt(r1)     // Catch:{ C1H -> 0x02cb }
            r0 = 10
            if (r2 == r0) goto L_0x009e
            r0 = 13
            if (r2 == r0) goto L_0x009e
            r0 = 12
            if (r2 == r0) goto L_0x009e
            int r1 = X.BO4.A00(r2)     // Catch:{ C1H -> 0x02cb }
            r6 = -1
            if (r1 == r6) goto L_0x0121
            r5 = 1
        L_0x00fa:
            int r2 = r10.A01     // Catch:{ C1H -> 0x02cb }
            int r0 = r10.A00     // Catch:{ C1H -> 0x02cb }
            boolean r0 = X.AnonymousClass000.A1T(r2, r0)     // Catch:{ C1H -> 0x02cb }
            if (r0 != 0) goto L_0x011f
            int r0 = r10.A01     // Catch:{ C1H -> 0x02cb }
            char r0 = r9.charAt(r0)     // Catch:{ C1H -> 0x02cb }
            int r2 = X.BO4.A00(r0)     // Catch:{ C1H -> 0x02cb }
            if (r2 == r6) goto L_0x011f
            int r0 = r10.A01     // Catch:{ C1H -> 0x02cb }
            int r0 = r0 + 1
            r10.A01 = r0     // Catch:{ C1H -> 0x02cb }
            int r1 = r1 * 16
            int r1 = r1 + r2
            int r5 = r5 + 1
            r0 = 5
            if (r5 > r0) goto L_0x011f
            goto L_0x00fa
        L_0x011f:
            char r0 = (char) r1     // Catch:{ C1H -> 0x02cb }
            goto L_0x0122
        L_0x0121:
            char r0 = (char) r2     // Catch:{ C1H -> 0x02cb }
        L_0x0122:
            r7.append(r0)     // Catch:{ C1H -> 0x02cb }
            goto L_0x009e
        L_0x0127:
            int r0 = r7.length()     // Catch:{ C1H -> 0x02cb }
            if (r0 == 0) goto L_0x0133
            java.lang.String r0 = r7.toString()     // Catch:{ C1H -> 0x02cb }
            if (r0 != 0) goto L_0x0144
        L_0x0133:
            r10.A01 = r8     // Catch:{ C1H -> 0x02cb }
        L_0x0135:
            java.lang.String r0 = r10.A0H()     // Catch:{ C1H -> 0x02cb }
            if (r0 != 0) goto L_0x0159
            java.lang.String r0 = "Invalid @import rule: expected string or url()"
            X.C1H r1 = new X.C1H     // Catch:{ C1H -> 0x02cb }
            r1.<init>(r0)     // Catch:{ C1H -> 0x02cb }
            goto L_0x02c5
        L_0x0144:
            r10.A0D()     // Catch:{ C1H -> 0x02cb }
            int r1 = r10.A01     // Catch:{ C1H -> 0x02cb }
            int r0 = r10.A00     // Catch:{ C1H -> 0x02cb }
            boolean r0 = X.AnonymousClass000.A1T(r1, r0)     // Catch:{ C1H -> 0x02cb }
            if (r0 != 0) goto L_0x0159
            java.lang.String r0 = ")"
            boolean r0 = r10.A0G(r0)     // Catch:{ C1H -> 0x02cb }
            if (r0 == 0) goto L_0x0133
        L_0x0159:
            r10.A0D()     // Catch:{ C1H -> 0x02cb }
            A02(r10)     // Catch:{ C1H -> 0x02cb }
            int r1 = r10.A01     // Catch:{ C1H -> 0x02cb }
            int r0 = r10.A00     // Catch:{ C1H -> 0x02cb }
            boolean r0 = X.AnonymousClass000.A1T(r1, r0)     // Catch:{ C1H -> 0x02cb }
            if (r0 != 0) goto L_0x02c6
            r0 = 59
            boolean r0 = r10.A0F(r0)     // Catch:{ C1H -> 0x02cb }
            if (r0 != 0) goto L_0x02c6
            X.C1H r1 = new X.C1H     // Catch:{ C1H -> 0x02cb }
            r1.<init>(r3)     // Catch:{ C1H -> 0x02cb }
            goto L_0x02c5
        L_0x0178:
            java.lang.Object[] r2 = new java.lang.Object[r7]     // Catch:{ C1H -> 0x02cb }
            r2[r6] = r1     // Catch:{ C1H -> 0x02cb }
            java.lang.String r1 = "Ignoring @%s rule"
            java.lang.String r0 = "CSSParser"
            X.BE7.A1M(r1, r0, r2)     // Catch:{ C1H -> 0x02cb }
            r2 = 0
        L_0x0184:
            int r1 = r10.A01     // Catch:{ C1H -> 0x02cb }
            int r0 = r10.A00     // Catch:{ C1H -> 0x02cb }
            boolean r0 = X.AnonymousClass000.A1T(r1, r0)     // Catch:{ C1H -> 0x02cb }
            if (r0 != 0) goto L_0x02c6
            java.lang.Integer r0 = r10.A09()     // Catch:{ C1H -> 0x02cb }
            int r1 = r0.intValue()     // Catch:{ C1H -> 0x02cb }
            r0 = 59
            if (r1 == r0) goto L_0x01a9
            r0 = 123(0x7b, float:1.72E-43)
            if (r1 != r0) goto L_0x01a1
            int r2 = r2 + 1
            goto L_0x0184
        L_0x01a1:
            r0 = 125(0x7d, float:1.75E-43)
            if (r1 != r0) goto L_0x0184
            if (r2 <= 0) goto L_0x0184
            int r2 = r2 + -1
        L_0x01a9:
            if (r2 != 0) goto L_0x0184
            goto L_0x02c6
        L_0x01ad:
            java.lang.String r0 = "Invalid '@' rule"
            X.C1H r1 = new X.C1H     // Catch:{ C1H -> 0x02cb }
            r1.<init>(r0)     // Catch:{ C1H -> 0x02cb }
            goto L_0x02c5
        L_0x01b6:
            java.util.ArrayList r8 = X.BO4.A01(r10)     // Catch:{ C1H -> 0x02cb }
            if (r8 == 0) goto L_0x02db
            boolean r0 = r8.isEmpty()     // Catch:{ C1H -> 0x02cb }
            if (r0 != 0) goto L_0x02db
            r0 = 123(0x7b, float:1.72E-43)
            boolean r0 = r10.A0F(r0)     // Catch:{ C1H -> 0x02cb }
            if (r0 == 0) goto L_0x029b
            r10.A0D()     // Catch:{ C1H -> 0x02cb }
            X.DS2 r5 = new X.DS2     // Catch:{ C1H -> 0x02cb }
            r5.<init>()     // Catch:{ C1H -> 0x02cb }
        L_0x01d2:
            java.lang.String r2 = r10.A0I()     // Catch:{ C1H -> 0x02cb }
            r10.A0D()     // Catch:{ C1H -> 0x02cb }
            r0 = 58
            boolean r0 = r10.A0F(r0)     // Catch:{ C1H -> 0x02cb }
            if (r0 == 0) goto L_0x0293
            r10.A0D()     // Catch:{ C1H -> 0x02cb }
            int r1 = r10.A01     // Catch:{ C1H -> 0x02cb }
            int r0 = r10.A00     // Catch:{ C1H -> 0x02cb }
            boolean r0 = X.AnonymousClass000.A1T(r1, r0)     // Catch:{ C1H -> 0x02cb }
            if (r0 != 0) goto L_0x028b
            int r3 = r10.A01     // Catch:{ C1H -> 0x02cb }
            r6 = r3
            java.lang.String r1 = r10.A03     // Catch:{ C1H -> 0x02cb }
            char r7 = r1.charAt(r3)     // Catch:{ C1H -> 0x02cb }
        L_0x01f7:
            r0 = -1
            if (r7 == r0) goto L_0x021d
            r0 = 59
            if (r7 == r0) goto L_0x021d
            r0 = 125(0x7d, float:1.75E-43)
            if (r7 == r0) goto L_0x021d
            r0 = 33
            if (r7 == r0) goto L_0x021d
            r0 = 10
            if (r7 == r0) goto L_0x021d
            r0 = 13
            if (r7 == r0) goto L_0x021d
            boolean r0 = X.C25854CnG.A02(r7)     // Catch:{ C1H -> 0x02cb }
            if (r0 != 0) goto L_0x0218
            int r0 = r10.A01     // Catch:{ C1H -> 0x02cb }
            int r6 = r0 + 1
        L_0x0218:
            int r7 = r10.A06()     // Catch:{ C1H -> 0x02cb }
            goto L_0x01f7
        L_0x021d:
            int r0 = r10.A01     // Catch:{ C1H -> 0x02cb }
            if (r0 <= r3) goto L_0x0289
            java.lang.String r1 = r1.substring(r3, r6)     // Catch:{ C1H -> 0x02cb }
            if (r1 == 0) goto L_0x028b
            r10.A0D()     // Catch:{ C1H -> 0x02cb }
            r0 = 33
            boolean r0 = r10.A0F(r0)     // Catch:{ C1H -> 0x02cb }
            if (r0 == 0) goto L_0x0240
            r10.A0D()     // Catch:{ C1H -> 0x02cb }
            java.lang.String r0 = "important"
            boolean r0 = r10.A0G(r0)     // Catch:{ C1H -> 0x02cb }
            if (r0 == 0) goto L_0x0281
            r10.A0D()     // Catch:{ C1H -> 0x02cb }
        L_0x0240:
            r0 = 59
            r10.A0F(r0)     // Catch:{ C1H -> 0x02cb }
            X.C26296Cx9.A0H(r5, r2, r1)     // Catch:{ C1H -> 0x02cb }
            r10.A0D()     // Catch:{ C1H -> 0x02cb }
            int r1 = r10.A01     // Catch:{ C1H -> 0x02cb }
            int r0 = r10.A00     // Catch:{ C1H -> 0x02cb }
            boolean r0 = X.AnonymousClass000.A1T(r1, r0)     // Catch:{ C1H -> 0x02cb }
            if (r0 != 0) goto L_0x025d
            r0 = 125(0x7d, float:1.75E-43)
            boolean r0 = r10.A0F(r0)     // Catch:{ C1H -> 0x02cb }
            if (r0 == 0) goto L_0x01d2
        L_0x025d:
            r10.A0D()     // Catch:{ C1H -> 0x02cb }
            java.util.Iterator r3 = r8.iterator()     // Catch:{ C1H -> 0x02cb }
        L_0x0264:
            boolean r0 = r3.hasNext()     // Catch:{ C1H -> 0x02cb }
            if (r0 == 0) goto L_0x0005
            java.lang.Object r2 = r3.next()     // Catch:{ C1H -> 0x02cb }
            X.CVa r2 = (X.C25046CVa) r2     // Catch:{ C1H -> 0x02cb }
            java.lang.Integer r1 = r11.A01     // Catch:{ C1H -> 0x02cb }
            X.C63 r0 = new X.C63     // Catch:{ C1H -> 0x02cb }
            r0.<init>()     // Catch:{ C1H -> 0x02cb }
            r0.A00 = r2     // Catch:{ C1H -> 0x02cb }
            r0.A01 = r5     // Catch:{ C1H -> 0x02cb }
            r0.A02 = r1     // Catch:{ C1H -> 0x02cb }
            r4.A00(r0)     // Catch:{ C1H -> 0x02cb }
            goto L_0x0264
        L_0x0281:
            java.lang.String r0 = "Malformed rule set: found unexpected '!'"
            X.C1H r1 = new X.C1H     // Catch:{ C1H -> 0x02cb }
            r1.<init>(r0)     // Catch:{ C1H -> 0x02cb }
            goto L_0x02c5
        L_0x0289:
            r10.A01 = r3     // Catch:{ C1H -> 0x02cb }
        L_0x028b:
            java.lang.String r0 = "Expected property value"
            X.C1H r1 = new X.C1H     // Catch:{ C1H -> 0x02cb }
            r1.<init>(r0)     // Catch:{ C1H -> 0x02cb }
            goto L_0x02c5
        L_0x0293:
            java.lang.String r0 = "Expected ':'"
            X.C1H r1 = new X.C1H     // Catch:{ C1H -> 0x02cb }
            r1.<init>(r0)     // Catch:{ C1H -> 0x02cb }
            goto L_0x02c5
        L_0x029b:
            java.lang.String r0 = "Malformed rule block: expected '{'"
            X.C1H r1 = new X.C1H     // Catch:{ C1H -> 0x02cb }
            r1.<init>(r0)     // Catch:{ C1H -> 0x02cb }
            goto L_0x02c5
        L_0x02a3:
            r11.A02 = r7     // Catch:{ C1H -> 0x02cb }
            X.CZd r0 = A01(r10, r11)     // Catch:{ C1H -> 0x02cb }
            r4.A01(r0)     // Catch:{ C1H -> 0x02cb }
            r11.A02 = r6     // Catch:{ C1H -> 0x02cb }
        L_0x02ae:
            int r1 = r10.A01     // Catch:{ C1H -> 0x02cb }
            int r0 = r10.A00     // Catch:{ C1H -> 0x02cb }
            boolean r0 = X.AnonymousClass000.A1T(r1, r0)     // Catch:{ C1H -> 0x02cb }
            if (r0 != 0) goto L_0x02c6
            r0 = 125(0x7d, float:1.75E-43)
            boolean r0 = r10.A0F(r0)     // Catch:{ C1H -> 0x02cb }
            if (r0 != 0) goto L_0x02c6
            X.C1H r1 = new X.C1H     // Catch:{ C1H -> 0x02cb }
            r1.<init>(r3)     // Catch:{ C1H -> 0x02cb }
        L_0x02c5:
            throw r1     // Catch:{ C1H -> 0x02cb }
        L_0x02c6:
            r10.A0D()     // Catch:{ C1H -> 0x02cb }
            goto L_0x0005
        L_0x02cb:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "CSS parser terminated early due to error: "
            java.lang.String r1 = X.C17900vP.A0C(r0, r1, r2)
            java.lang.String r0 = "CSSParser"
            android.util.Log.e(r0, r1)
        L_0x02db:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26255Cvz.A01(X.BO4, X.Cvz):X.CZd");
    }

    public static boolean A04(C24424C2z c2z, C25046CVa cVa, C22761BNy bNy, List list, int i, int i2) {
        C25115CYo cYo = (C25115CYo) cVa.A01.get(i);
        if (A06(c2z, cYo, bNy)) {
            Integer num = cYo.A00;
            if (num == AnonymousClass00R.A00) {
                if (i != 0) {
                    while (i2 >= 0) {
                        if (!A05(c2z, cVa, list, i - 1, i2)) {
                            i2--;
                        }
                    }
                }
                return true;
            } else if (num == AnonymousClass00R.A01) {
                return A05(c2z, cVa, list, i - 1, i2);
            } else {
                int A002 = A00(bNy, list, i2);
                if (A002 > 0) {
                    return A04(c2z, cVa, (C22761BNy) bNy.A00.BOi().get(A002 - 1), list, i - 1, i2);
                }
            }
        }
        return false;
    }

    public static boolean A06(C24424C2z c2z, C25115CYo cYo, C22761BNy bNy) {
        boolean equals;
        List list;
        String str = cYo.A01;
        if (str == null || str.equals(AnonymousClass8BS.A0n(bNy.A00()))) {
            List<CP4> list2 = cYo.A02;
            if (list2 != null) {
                for (CP4 cp4 : list2) {
                    String str2 = cp4.A01;
                    if (str2.equals(PublicKeyCredentialControllerUtility.JSON_KEY_ID)) {
                        equals = cp4.A02.equals(bNy.A03);
                        continue;
                    } else if (str2.equals("class") && (list = bNy.A04) != null) {
                        equals = list.contains(cp4.A02);
                        continue;
                    }
                    if (!equals) {
                        return false;
                    }
                }
            }
            List<C28487E3r> list3 = cYo.A03;
            if (list3 == null) {
                return true;
            }
            for (C28487E3r Bj6 : list3) {
                if (!Bj6.Bj6(c2z, bNy)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static ArrayList A02(BO4 bo4) {
        ArrayList A13 = AnonymousClass000.A13();
        while (!AnonymousClass000.A1T(bo4.A01, bo4.A00)) {
            String str = null;
            int i = bo4.A01;
            String str2 = bo4.A03;
            char charAt = str2.charAt(i);
            if (charAt < 'A' || (charAt > 'Z' && (charAt < 'a' || charAt > 'z'))) {
                bo4.A01 = i;
            } else {
                while (true) {
                    int A06 = bo4.A06();
                    if (A06 < 65 || (A06 > 90 && (A06 < 97 || A06 > 122))) {
                        str = str2.substring(i, bo4.A01);
                    }
                }
                str = str2.substring(i, bo4.A01);
            }
            if (str == null) {
                break;
            }
            try {
                A13.add(C24303Bz0.valueOf(str));
            } catch (IllegalArgumentException unused) {
            }
            if (!bo4.A0E()) {
                break;
            }
        }
        return A13;
    }

    public static boolean A03(C24424C2z c2z, C25046CVa cVa, C22761BNy bNy) {
        ArrayList A13 = AnonymousClass000.A13();
        C22761BNy bNy2 = bNy;
        for (E7L e7l = bNy.A00; e7l != null; e7l = ((C24482C5y) e7l).A00) {
            A13.add(0, e7l);
        }
        int size = A13.size() - 1;
        C25046CVa cVa2 = cVa;
        int A0C = C72463Mc.A0C(cVa.A01);
        List list = cVa.A01;
        C24424C2z c2z2 = c2z;
        if (A0C == 1) {
            return A06(c2z, (C25115CYo) list.get(0), bNy);
        }
        return A04(c2z2, cVa2, bNy2, A13, C72463Mc.A0C(list) - 1, size);
    }
}
