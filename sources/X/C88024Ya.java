package X;

import java.util.List;

/* renamed from: X.4Ya  reason: invalid class name and case insensitive filesystem */
public final class C88024Ya {
    public final List A00;
    public final List A01;
    public final List A02;
    public final List A03;
    public final boolean A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C88024Ya) {
                C88024Ya r5 = (C88024Ya) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || this.A04 != r5.A04 || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C88024Ya() {
        /*
            r6 = this;
            X.0wS r1 = X.C18460wS.A00
            r5 = 0
            r0 = r6
            r2 = r1
            r3 = r1
            r4 = r1
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C88024Ya.<init>():void");
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A02, AnonymousClass000.A0N(this.A03, AnonymousClass000.A0N(this.A00, AnonymousClass0DV.A00(AnonymousClass000.A0L(this.A01), this.A04))));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ViewState(lists=");
        A10.append(this.A01);
        A10.append(", isEdit=");
        A10.append(this.A04);
        A10.append(", listRows=");
        A10.append(this.A00);
        A10.append(", uiRows=");
        A10.append(this.A03);
        A10.append(", staticRows=");
        return AnonymousClass001.A1F(this.A02, A10);
    }

    public C88024Ya(List list, List list2, List list3, List list4, boolean z) {
        this.A01 = list;
        this.A04 = z;
        this.A00 = list2;
        this.A03 = list3;
        this.A02 = list4;
    }
}
