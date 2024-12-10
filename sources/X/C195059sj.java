package X;

/* renamed from: X.9sj  reason: invalid class name and case insensitive filesystem */
public final class C195059sj {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195059sj) {
                C195059sj r5 = (C195059sj) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((C17900vP.A00(this.A00) * 31) + C17900vP.A00(this.A01)) * 31) + C17900vP.A00(this.A03)) * 31) + C108955ca.A06(this.A02);
    }

    public C195059sj(String str, String str2, String str3, String str4) {
        this.A00 = str;
        this.A01 = str2;
        this.A03 = str3;
        this.A02 = str4;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MessageResponseV2Data(flowId=");
        A10.append(this.A00);
        A10.append(", flowName=");
        A10.append(this.A01);
        A10.append(", title=");
        A10.append(this.A03);
        A10.append(", responsePayload=");
        return C17900vP.A0B(this.A02, A10);
    }
}
