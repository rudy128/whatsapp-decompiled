package X;

/* renamed from: X.6qt  reason: invalid class name and case insensitive filesystem */
public final class C134626qt {
    public final String A00;
    public final boolean A01;

    public C134626qt(boolean z, String str) {
        C18070vi.A0d(str, 3);
        this.A00 = str;
        this.A01 = z;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C134626qt) {
                C134626qt r5 = (C134626qt) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(C17890vO.A02(this.A00, 1509390), this.A01);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        C108975cc.A17(A10, "GenAIImagineReportFeedbackParams(actorId=");
        A10.append(", clientMutationId=");
        A10.append("123");
        A10.append(", responseId=");
        A10.append(this.A00);
        A10.append(", isImagineMe=");
        return C17900vP.A0F(A10, this.A01);
    }
}
