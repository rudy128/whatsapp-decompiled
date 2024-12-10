package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.DRt  reason: case insensitive filesystem */
public final class C27068DRt implements Appendable {
    public final StringBuilder A00;
    public final List A01;
    public final List A02;
    public final List A03;
    public final List A04;

    public C27068DRt(int i) {
        this.A00 = BE6.A0t(16);
        this.A03 = AnonymousClass000.A13();
        this.A02 = AnonymousClass000.A13();
        this.A01 = AnonymousClass000.A13();
        this.A04 = AnonymousClass000.A13();
    }

    public final C27069DRu A00() {
        StringBuilder sb = this.A00;
        String obj = sb.toString();
        List list = this.A03;
        ArrayList A14 = AnonymousClass000.A14(list);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            A14.add(((C25250Cbp) list.get(i)).A00(sb.length()));
        }
        ArrayList arrayList = null;
        if (A14.isEmpty()) {
            A14 = null;
        }
        List list2 = this.A02;
        ArrayList A142 = AnonymousClass000.A14(list2);
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            A142.add(((C25250Cbp) list2.get(i2)).A00(sb.length()));
        }
        if (A142.isEmpty()) {
            A142 = null;
        }
        List list3 = this.A01;
        ArrayList A143 = AnonymousClass000.A14(list3);
        int size3 = list3.size();
        for (int i3 = 0; i3 < size3; i3++) {
            A143.add(((C25250Cbp) list3.get(i3)).A00(sb.length()));
        }
        if (!A143.isEmpty()) {
            arrayList = A143;
        }
        return new C27069DRu(obj, A14, A142, arrayList);
    }

    public final void A01(int i) {
        List list = this.A04;
        if (i >= list.size()) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append(i);
            C17890vO.A15(" should be less than ", A10, list);
            throw AnonymousClass000.A0m(A10);
        }
        while (AnonymousClass3MX.A01(list) >= i) {
            if (AnonymousClass000.A1a(list)) {
                ((C25250Cbp) list.remove(AnonymousClass3MX.A01(list))).A00 = this.A00.length();
            } else {
                throw AnonymousClass000.A0n("Nothing to pop.");
            }
        }
    }

    public final void A02(C27069DRu dRu) {
        StringBuilder sb = this.A00;
        int length = sb.length();
        sb.append(dRu.A00);
        List list = dRu.A03;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C26047CrE crE = (C26047CrE) list.get(i);
                A03((C26053CrN) crE.A02, crE.A01 + length, crE.A00 + length);
            }
        }
        List list2 = dRu.A02;
        if (list2 != null) {
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                C26047CrE crE2 = (C26047CrE) list2.get(i2);
                this.A02.add(new C25250Cbp(crE2.A02, "", crE2.A01 + length, crE2.A00 + length));
            }
        }
        List list3 = dRu.A01;
        if (list3 != null) {
            int size3 = list3.size();
            for (int i3 = 0; i3 < size3; i3++) {
                C26047CrE crE3 = (C26047CrE) list3.get(i3);
                this.A01.add(new C25250Cbp(crE3.A02, crE3.A03, crE3.A01 + length, crE3.A00 + length));
            }
        }
    }

    public final void A03(C26053CrN crN, int i, int i2) {
        this.A03.add(new C25250Cbp(crN, "", i, i2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0041, code lost:
        if (r15 >= r9.length()) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00ae, code lost:
        if (r15 >= r9.length()) goto L_0x00b0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Appendable append(java.lang.CharSequence r13, int r14, int r15) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof X.C27069DRu
            if (r0 == 0) goto L_0x0110
            X.DRu r13 = (X.C27069DRu) r13
            java.lang.StringBuilder r0 = r12.A00
            int r11 = r0.length()
            java.lang.String r9 = r13.A00
            r0.append(r9, r14, r15)
            java.util.List r5 = X.C26069Crj.A00(r13, r14, r15)
            r8 = 0
            if (r5 == 0) goto L_0x0035
            int r4 = r5.size()
            r3 = 0
        L_0x001d:
            if (r3 >= r4) goto L_0x0035
            java.lang.Object r0 = r5.get(r3)
            X.CrE r0 = (X.C26047CrE) r0
            java.lang.Object r2 = r0.A02
            X.CrN r2 = (X.C26053CrN) r2
            int r1 = r0.A01
            int r1 = r1 + r11
            int r0 = r0.A00
            int r0 = r0 + r11
            r12.A03(r2, r1, r0)
            int r3 = r3 + 1
            goto L_0x001d
        L_0x0035:
            if (r14 == r15) goto L_0x00a2
            java.util.List r7 = r13.A02
            if (r7 == 0) goto L_0x00a2
            if (r14 != 0) goto L_0x0067
            int r0 = r9.length()
            if (r15 < r0) goto L_0x0067
        L_0x0043:
            int r10 = r7.size()
            r6 = 0
        L_0x0048:
            if (r6 >= r10) goto L_0x00a2
            java.lang.Object r0 = r7.get(r6)
            X.CrE r0 = (X.C26047CrE) r0
            java.lang.Object r5 = r0.A02
            int r4 = r0.A01
            int r4 = r4 + r11
            int r3 = r0.A00
            int r3 = r3 + r11
            java.util.List r2 = r12.A02
            java.lang.String r1 = ""
            X.Cbp r0 = new X.Cbp
            r0.<init>(r5, r1, r4, r3)
            r2.add(r0)
            int r6 = r6 + 1
            goto L_0x0048
        L_0x0067:
            java.util.ArrayList r6 = X.AnonymousClass000.A14(r7)
            int r1 = r7.size()
            r5 = 0
            r0 = 0
        L_0x0071:
            if (r0 >= r1) goto L_0x0079
            X.C26047CrE.A00(r6, r7, r0, r14, r15)
            int r0 = r0 + 1
            goto L_0x0071
        L_0x0079:
            java.util.ArrayList r7 = X.C108975cc.A0g(r6)
            int r4 = r6.size()
        L_0x0081:
            if (r5 >= r4) goto L_0x0043
            java.lang.Object r1 = r6.get(r5)
            X.CrE r1 = (X.C26047CrE) r1
            java.lang.Object r3 = r1.A02
            int r0 = r1.A01
            int r2 = X.BE6.A07(r0, r14, r15)
            int r0 = r1.A00
            int r1 = X.BE6.A07(r0, r14, r15)
            X.CrE r0 = new X.CrE
            r0.<init>(r3, r2, r1)
            r7.add(r0)
            int r5 = r5 + 1
            goto L_0x0081
        L_0x00a2:
            if (r14 == r15) goto L_0x0115
            java.util.List r7 = r13.A01
            if (r7 == 0) goto L_0x0115
            if (r14 != 0) goto L_0x00d3
            int r0 = r9.length()
            if (r15 < r0) goto L_0x00d3
        L_0x00b0:
            int r6 = r7.size()
        L_0x00b4:
            if (r8 >= r6) goto L_0x0115
            java.lang.Object r0 = r7.get(r8)
            X.CrE r0 = (X.C26047CrE) r0
            java.util.List r5 = r12.A01
            java.lang.Object r4 = r0.A02
            int r3 = r0.A01
            int r3 = r3 + r11
            int r2 = r0.A00
            int r2 = r2 + r11
            java.lang.String r1 = r0.A03
            X.Cbp r0 = new X.Cbp
            r0.<init>(r4, r1, r3, r2)
            r5.add(r0)
            int r8 = r8 + 1
            goto L_0x00b4
        L_0x00d3:
            java.util.ArrayList r9 = X.AnonymousClass000.A14(r7)
            int r1 = r7.size()
            r6 = 0
            r0 = 0
        L_0x00dd:
            if (r0 >= r1) goto L_0x00e5
            X.C26047CrE.A00(r9, r7, r0, r14, r15)
            int r0 = r0 + 1
            goto L_0x00dd
        L_0x00e5:
            java.util.ArrayList r7 = X.C108975cc.A0g(r9)
            int r5 = r9.size()
        L_0x00ed:
            if (r6 >= r5) goto L_0x00b0
            java.lang.Object r1 = r9.get(r6)
            X.CrE r1 = (X.C26047CrE) r1
            java.lang.String r4 = r1.A03
            java.lang.Object r3 = r1.A02
            int r0 = r1.A01
            int r2 = X.BE6.A07(r0, r14, r15)
            int r0 = r1.A00
            int r1 = X.BE6.A07(r0, r14, r15)
            X.CrE r0 = new X.CrE
            r0.<init>(r3, r4, r2, r1)
            r7.add(r0)
            int r6 = r6 + 1
            goto L_0x00ed
        L_0x0110:
            java.lang.StringBuilder r0 = r12.A00
            r0.append(r13, r14, r15)
        L_0x0115:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27068DRt.append(java.lang.CharSequence, int, int):java.lang.Appendable");
    }

    public C27068DRt(C27069DRu dRu) {
        this(16);
        A02(dRu);
    }

    public /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) {
        if (charSequence instanceof C27069DRu) {
            A02((C27069DRu) charSequence);
            return this;
        }
        this.A00.append(charSequence);
        return this;
    }

    public C27068DRt() {
        this(16);
    }

    public /* bridge */ /* synthetic */ Appendable append(char c) {
        this.A00.append(c);
        return this;
    }
}
