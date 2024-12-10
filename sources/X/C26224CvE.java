package X;

import java.util.List;

/* renamed from: X.CvE  reason: case insensitive filesystem */
public final class C26224CvE {
    public static final C16680sp A03 = new AnonymousClass0W3(C28116Dra.A00, C28216DtY.A00);
    public final long A00;
    public final C27069DRu A01;
    public final C26260Cw5 A02;

    public static /* synthetic */ C26224CvE A00(C27069DRu dRu, C26224CvE cvE, int i, long j) {
        C26260Cw5 cw5 = null;
        if ((i & 1) != 0) {
            dRu = cvE.A01;
        }
        if ((i & 2) != 0) {
            j = cvE.A00;
        }
        if ((i & 4) != 0) {
            cw5 = cvE.A02;
        }
        return new C26224CvE(dRu, cw5, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26224CvE)) {
            return false;
        }
        C26224CvE cvE = (C26224CvE) obj;
        return this.A00 == cvE.A00 && C18070vi.A18(this.A02, cvE.A02) && C18070vi.A18(this.A01, cvE.A01);
    }

    public final long A01() {
        return this.A00;
    }

    public final C27069DRu A02() {
        return this.A01;
    }

    public final C26260Cw5 A03() {
        return this.A02;
    }

    public final String A04() {
        return this.A01.A00;
    }

    public int hashCode() {
        int i;
        int A0K = AnonymousClass001.A0K(this.A00, AnonymousClass000.A0L(this.A01));
        C26260Cw5 cw5 = this.A02;
        if (cw5 != null) {
            i = AnonymousClass000.A0I(cw5.A00);
        } else {
            i = 0;
        }
        return A0K + i;
    }

    public C26224CvE(C27069DRu dRu, C26260Cw5 cw5, long j) {
        C26260Cw5 cw52;
        this.A01 = dRu;
        int length = dRu.A00.length();
        int A0G = AnonymousClass000.A0G(j);
        int A032 = C28851b7.A03(A0G, 0, length);
        int A0H = AnonymousClass000.A0H(j);
        int A033 = C28851b7.A03(A0H, 0, length);
        this.A00 = (A032 == A0G && A033 == A0H) ? j : C25858CnM.A02(A032, A033);
        if (cw5 != null) {
            long j2 = cw5.A00;
            int A0G2 = AnonymousClass000.A0G(j2);
            int A034 = C28851b7.A03(A0G2, 0, length);
            int A0H2 = AnonymousClass000.A0H(j2);
            int A035 = C28851b7.A03(A0H2, 0, length);
            cw52 = new C26260Cw5((A034 == A0G2 && A035 == A0H2) ? j2 : C25858CnM.A02(A034, A035));
        } else {
            cw52 = null;
        }
        this.A02 = cw52;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("TextFieldValue(text='");
        A10.append(this.A01);
        A10.append("', selection=");
        long j = this.A00;
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("TextRange(");
        BE8.A1D(A102, AnonymousClass000.A0G(j));
        A10.append(AnonymousClass001.A1L(A102, AnonymousClass000.A0H(j)));
        A10.append(", composition=");
        return AnonymousClass001.A1F(this.A02, A10);
    }

    public C26224CvE(String str, long j) {
        this(new C27069DRu((List) null, 6, str), (C26260Cw5) null, j);
    }

    public /* synthetic */ C26224CvE(C27069DRu dRu, long j) {
        this(dRu, (C26260Cw5) null, j);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C26224CvE(String str, int i, long j) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? C26260Cw5.A01 : j);
    }
}
