package X;

import java.util.List;

/* renamed from: X.DRu  reason: case insensitive filesystem */
public final class C27069DRu implements CharSequence {
    public final String A00;
    public final List A01;
    public final List A02;
    public final List A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C27069DRu) {
                C27069DRu dRu = (C27069DRu) obj;
                if (!C18070vi.A18(this.A00, dRu.A00) || !C18070vi.A18(this.A03, dRu.A03) || !C18070vi.A18(this.A02, dRu.A02) || !C18070vi.A18(this.A01, dRu.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C27069DRu(java.util.List r3, int r4, java.lang.String r5) {
        /*
            r2 = this;
            r0 = r4 & 2
            if (r0 == 0) goto L_0x0006
            X.0wS r3 = X.C18460wS.A00
        L_0x0006:
            boolean r1 = r3.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x000e
            r3 = r0
        L_0x000e:
            r2.<init>(r5, r3, r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27069DRu.<init>(java.util.List, int, java.lang.String):void");
    }

    /* renamed from: A00 */
    public C27069DRu subSequence(int i, int i2) {
        if (i > i2) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("start (");
            A10.append(i);
            A10.append(") should be less or equal to end (");
            throw AnonymousClass000.A0k(AnonymousClass001.A1L(A10, i2));
        } else if (i == 0 && i2 == this.A00.length()) {
            return this;
        } else {
            return new C27069DRu(C108955ca.A0q(i, i2, this.A00), C26069Crj.A01(this.A03, i, i2), C26069Crj.A01(this.A02, i, i2), C26069Crj.A01(this.A01, i, i2));
        }
    }

    public final C27069DRu A01(C27069DRu dRu) {
        C27068DRt dRt = new C27068DRt(this);
        dRt.A02(dRu);
        return dRt.A00();
    }

    public final String A02() {
        return this.A00;
    }

    public final List A03() {
        List list = this.A03;
        if (list == null) {
            return C18460wS.A00;
        }
        return list;
    }

    /* JADX WARNING: type inference failed for: r5v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A04(int r11) {
        /*
            r10 = this;
            java.lang.String r8 = "androidx.compose.foundation.text.inlineContent"
            r7 = 0
            java.util.List r6 = r10.A01
            if (r6 == 0) goto L_0x0037
            java.util.ArrayList r5 = X.AnonymousClass000.A14(r6)
            int r4 = r6.size()
            r3 = 0
        L_0x0010:
            if (r3 >= r4) goto L_0x0039
            java.lang.Object r2 = r6.get(r3)
            r9 = r2
            X.CrE r9 = (X.C26047CrE) r9
            java.lang.Object r0 = r9.A02
            boolean r0 = r0 instanceof java.lang.String
            if (r0 == 0) goto L_0x0034
            java.lang.String r0 = r9.A03
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0034
            int r1 = r9.A01
            int r0 = r9.A00
            boolean r0 = X.C26069Crj.A02(r7, r11, r1, r0)
            if (r0 == 0) goto L_0x0034
            r5.add(r2)
        L_0x0034:
            int r3 = r3 + 1
            goto L_0x0010
        L_0x0037:
            X.0wS r5 = X.C18460wS.A00
        L_0x0039:
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<kotlin.String>>"
            X.C18070vi.A0z(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27069DRu.A04(int):java.util.List");
    }

    public final boolean A05(int i) {
        List list = this.A01;
        if (list == null) {
            return false;
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            C26047CrE crE = (C26047CrE) list.get(i2);
            if ((crE.A02 instanceof String) && "androidx.compose.foundation.text.inlineContent".equals(crE.A03) && C26069Crj.A02(0, i, crE.A01, crE.A00)) {
                return true;
            }
        }
        return false;
    }

    public final /* bridge */ char charAt(int i) {
        return this.A00.charAt(i);
    }

    public int hashCode() {
        int i = 0;
        int A032 = (((C17880vN.A03(this.A00) + AnonymousClass001.A0l(this.A03)) * 31) + AnonymousClass001.A0l(this.A02)) * 31;
        List list = this.A01;
        if (list != null) {
            i = list.hashCode();
        }
        return A032 + i;
    }

    public final /* bridge */ int length() {
        return this.A00.length();
    }

    public String toString() {
        return this.A00;
    }

    public C27069DRu(String str, List list, List list2, List list3) {
        this.A00 = str;
        this.A03 = list;
        this.A02 = list2;
        this.A01 = list3;
        if (list2 != null) {
            int i = 0;
            List A0y = C29431cG.A0y(list2, new DUR(0));
            if (A0y != null) {
                int size = A0y.size();
                int i2 = -1;
                while (i < size) {
                    C26047CrE crE = (C26047CrE) A0y.get(i);
                    if (crE.A01 >= i2) {
                        int i3 = crE.A00;
                        if (i3 <= this.A00.length()) {
                            i2 = crE.A00;
                            i++;
                        } else {
                            StringBuilder A10 = AnonymousClass000.A10();
                            A10.append("ParagraphStyle range [");
                            BE8.A1D(A10, crE.A01);
                            A10.append(i3);
                            throw AnonymousClass001.A12(") is out of boundary", A10);
                        }
                    } else {
                        throw AnonymousClass000.A0k("ParagraphStyle should not overlap");
                    }
                }
            }
        }
    }
}
