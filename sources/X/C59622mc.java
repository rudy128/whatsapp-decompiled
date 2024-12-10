package X;

/* renamed from: X.2mc  reason: invalid class name and case insensitive filesystem */
public final class C59622mc {
    public final String A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C59622mc) {
                C59622mc r5 = (C59622mc) obj;
                if (!(this.A01 == r5.A01 && this.A02 == r5.A02 && this.A03 == r5.A03 && C18070vi.A18(this.A00, r5.A00))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = 1237;
        if (this.A01) {
            i = 1231;
        }
        return AnonymousClass0DV.A00(AnonymousClass0DV.A00(i * 31, this.A02), this.A03) + C17900vP.A00(this.A00);
    }

    public C59622mc(String str, boolean z, boolean z2, boolean z3) {
        this.A01 = z;
        this.A02 = z2;
        this.A03 = z3;
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SupportPayload(isAiMessage=");
        A10.append(this.A01);
        A10.append(", shouldShowSystemMessage=");
        A10.append(this.A02);
        A10.append(", shouldUploadClientLogs=");
        A10.append(this.A03);
        A10.append(", ticketID=");
        return C17900vP.A0B(this.A00, A10);
    }
}
