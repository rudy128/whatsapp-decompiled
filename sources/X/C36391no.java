package X;

import java.util.Set;

/* renamed from: X.1no  reason: invalid class name and case insensitive filesystem */
public class C36391no implements C36381nn {
    public final AnonymousClass00H A00;
    public final AnonymousClass11S A01;
    public final C18000vb A02;

    public Set BX2(AnonymousClass1BI r3, AnonymousClass206 r4, String str) {
        if (str == null || r4.A0v.A02) {
            return null;
        }
        return A00(r3, str);
    }

    public C36391no(AnonymousClass11S r1, C18000vb r2, AnonymousClass00H r3) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = r3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00a0 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Set A00(X.AnonymousClass1BI r14, java.lang.String r15) {
        /*
            r13 = this;
            android.net.Uri r0 = android.net.Uri.parse(r15)
            java.lang.String r3 = r0.getHost()
            if (r3 != 0) goto L_0x000c
            r8 = 0
        L_0x000b:
            return r8
        L_0x000c:
            boolean r0 = X.C22971Dz.A0T(r14)
            java.lang.String r7 = "ZZ"
            if (r0 != 0) goto L_0x003e
            r6 = r7
            if (r14 == 0) goto L_0x003e
            X.00H r4 = r13.A00     // Catch:{ 1Mf -> 0x003f }
            java.lang.Object r2 = r4.get()     // Catch:{ 1Mf -> 0x003f }
            X.1yi r2 = (X.C42771yi) r2     // Catch:{ 1Mf -> 0x003f }
            X.1yi r0 = X.C42771yi.A00()     // Catch:{ 1Mf -> 0x003f }
            java.lang.String r1 = X.AnonymousClass17K.A00(r0, r14)     // Catch:{ 1Mf -> 0x003f }
            r0 = 0
            X.1ym r2 = r2.A0H(r1, r0)     // Catch:{ 1Mf -> 0x003f }
            int r0 = r2.countryCode_     // Catch:{ 1Mf -> 0x003f }
            java.lang.String r1 = java.lang.Integer.toString(r0)     // Catch:{ 1Mf -> 0x003f }
            r4.get()     // Catch:{ 1Mf -> 0x003f }
            java.lang.String r0 = X.C42771yi.A03(r2)     // Catch:{ 1Mf -> 0x003f }
            java.lang.String r6 = X.AnonymousClass1K3.A01(r1, r0)     // Catch:{ 1Mf -> 0x003f }
            goto L_0x003f
        L_0x003e:
            r6 = r7
        L_0x003f:
            X.11S r0 = r13.A01
            r0.A0I()
            com.whatsapp.Me r0 = r0.A00
            if (r0 == 0) goto L_0x0050
            java.lang.String r1 = r0.cc
            java.lang.String r0 = r0.number
            java.lang.String r7 = X.AnonymousClass1K3.A01(r1, r0)
        L_0x0050:
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>()
            X.0vb r0 = r13.A02
            java.util.Locale r4 = r0.A0N()
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            if (r1 < r0) goto L_0x0076
            android.os.LocaleList r2 = android.os.LocaleList.getDefault()
            r1 = 0
        L_0x0066:
            int r0 = r2.size()
            if (r1 >= r0) goto L_0x0076
            java.util.Locale r0 = r2.get(r1)
            r9.add(r0)
            int r1 = r1 + 1
            goto L_0x0066
        L_0x0076:
            r9.add(r4)
            java.util.HashSet r0 = X.C62982sJ.A03
            java.lang.String r0 = "\\."
            java.lang.String[] r10 = r3.split(r0)
            int r5 = r10.length
            r8 = 0
            r4 = 0
            r3 = r8
            r2 = 0
            r0 = 0
        L_0x0087:
            r12 = 1
            if (r2 >= r5) goto L_0x00a0
            r1 = r10[r2]
            java.util.regex.Pattern r0 = X.C62982sJ.A00
            java.util.regex.Matcher r0 = r0.matcher(r1)
            boolean r0 = r0.matches()
            r12 = r12 ^ r0
            if (r12 == 0) goto L_0x009c
            if (r3 != 0) goto L_0x000b
            r3 = r1
        L_0x009c:
            int r2 = r2 + 1
            r0 = r12
            goto L_0x0087
        L_0x00a0:
            if (r3 == 0) goto L_0x000b
            if (r0 != 0) goto L_0x000b
            int r2 = r3.length()
            r10 = 2
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r10)
            r5 = 0
        L_0x00af:
            if (r5 >= r2) goto L_0x00e0
            int r11 = r3.codePointAt(r5)
            if (r12 == 0) goto L_0x00c4
            java.util.HashSet r12 = X.C62982sJ.A03
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            boolean r0 = r12.contains(r0)
            r12 = 1
            if (r0 != 0) goto L_0x00da
        L_0x00c4:
            r12 = 0
            android.util.SparseArray r0 = X.C62982sJ.A01
            java.lang.Object r0 = r0.get(r11)
            if (r0 == 0) goto L_0x00da
            int r0 = r1.size()
            if (r0 >= r10) goto L_0x000b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            r1.add(r0)
        L_0x00da:
            int r0 = java.lang.Character.charCount(r11)
            int r5 = r5 + r0
            goto L_0x00af
        L_0x00e0:
            if (r12 == 0) goto L_0x0125
            java.util.HashSet r1 = X.C62982sJ.A04
            boolean r0 = r1.contains(r7)
            if (r0 != 0) goto L_0x000b
            boolean r0 = r1.contains(r6)
            if (r0 != 0) goto L_0x000b
            java.util.Iterator r5 = r9.iterator()
        L_0x00f4:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x010d
            java.lang.Object r0 = r5.next()
            java.util.Locale r0 = (java.util.Locale) r0
            java.lang.String r1 = r0.getLanguage()
            java.util.HashSet r0 = X.C62982sJ.A05
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x00f4
            return r8
        L_0x010d:
            java.util.HashSet r8 = new java.util.HashSet
            r8.<init>(r2)
        L_0x0112:
            if (r4 >= r2) goto L_0x000b
            int r1 = r3.codePointAt(r4)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r8.add(r0)
            int r0 = java.lang.Character.charCount(r1)
            int r4 = r4 + r0
            goto L_0x0112
        L_0x0125:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x000b
            int r0 = r1.size()
            X.016 r5 = new X.016
            r5.<init>((int) r0)
            java.util.Iterator r10 = r1.iterator()
        L_0x0138:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x017f
            java.lang.Object r4 = r10.next()
            java.lang.Number r4 = (java.lang.Number) r4
            int r1 = r4.intValue()
            android.util.SparseArray r0 = X.C62982sJ.A01
            java.lang.Object r3 = r0.get(r1)
            X.2cD r3 = (X.C53242cD) r3
            java.util.Collection r1 = r3.A01
            boolean r0 = r1.contains(r7)
            if (r0 != 0) goto L_0x0138
            boolean r0 = r1.contains(r6)
            if (r0 != 0) goto L_0x0138
            java.util.Iterator r2 = r9.iterator()
        L_0x0162:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x017b
            java.lang.Object r0 = r2.next()
            java.util.Locale r0 = (java.util.Locale) r0
            java.lang.String r1 = r0.getLanguage()
            java.util.Collection r0 = r3.A00
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0162
            goto L_0x0138
        L_0x017b:
            r5.add(r4)
            goto L_0x0138
        L_0x017f:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x000b
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36391no.A00(X.1BI, java.lang.String):java.util.Set");
    }
}
