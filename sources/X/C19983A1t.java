package X;

/* renamed from: X.A1t  reason: case insensitive filesystem */
public final class C19983A1t {
    public final A2S A00;
    public final AnonymousClass1EC A01;
    public final Integer A02;
    public final boolean A03 = true;

    public C19983A1t(A2S a2s, AnonymousClass1EC r3, Integer num) {
        this.A01 = r3;
        this.A02 = num;
        this.A00 = a2s;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C19983A1t) {
                C19983A1t a1t = (C19983A1t) obj;
                if (!C18070vi.A18(this.A01, a1t.A01) || this.A03 != a1t.A03 || !C18070vi.A18(this.A02, a1t.A02) || !C18070vi.A18(this.A00, a1t.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass0DV.A00(AnonymousClass000.A0L(this.A01), this.A03) + AnonymousClass001.A0k(this.A02)) * 31) + C17880vN.A02(this.A00);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("GroupInfoDataEnvelope {\n      |  isTruncated=");
        A10.append(this.A03);
        A10.append(",\n      |  size=");
        A10.append(this.A02);
        A10.append("\n      |  groupInfo=");
        A10.append(this.A00);
        return AnonymousClass1Y7.A02(AnonymousClass000.A0y("\n      |}", A10));
    }

    public C19983A1t(AnonymousClass1EC r3, Integer num) {
        this.A01 = r3;
        this.A02 = num;
        this.A00 = null;
    }
}
