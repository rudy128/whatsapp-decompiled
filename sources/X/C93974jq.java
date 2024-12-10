package X;

import java.util.List;

/* renamed from: X.4jq  reason: invalid class name and case insensitive filesystem */
public final class C93974jq implements C108855cP {
    public final C135666sZ A00;
    public final AnonymousClass4ZN A01;
    public final List A02;
    public final C22821Di A03;
    public final C22821Di A04;
    public final boolean A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C93974jq) {
                C93974jq r5 = (C93974jq) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A01, r5.A01) || this.A05 != r5.A05) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public AnonymousClass4ZN BOV() {
        return this.A01;
    }

    public List BSU() {
        return this.A02;
    }

    public C135666sZ BUk() {
        return this.A00;
    }

    public C22821Di BVf() {
        return this.A03;
    }

    public C22821Di BVi() {
        return this.A04;
    }

    public boolean BgO() {
        return this.A05;
    }

    public int hashCode() {
        return C17880vN.A01((AnonymousClass000.A0N(this.A02, AnonymousClass000.A0N(this.A04, AnonymousClass000.A0N(this.A03, AnonymousClass000.A0L(this.A00)))) + C17880vN.A02(this.A01)) * 31, this.A05);
    }

    public C93974jq(C135666sZ r1, AnonymousClass4ZN r2, List list, C22821Di r4, C22821Di r5, boolean z) {
        this.A00 = r1;
        this.A03 = r4;
        this.A04 = r5;
        this.A02 = list;
        this.A01 = r2;
        this.A05 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("DocumentMessage(messageModel=");
        A10.append(this.A00);
        A10.append(", onClick=");
        A10.append(this.A03);
        A10.append(", onLongClick=");
        A10.append(this.A04);
        A10.append(", highlightTerms=");
        A10.append(this.A02);
        A10.append(", chatName=");
        A10.append(this.A01);
        A10.append(", isSelected=");
        return C17900vP.A0F(A10, this.A05);
    }
}
