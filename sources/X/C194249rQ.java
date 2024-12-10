package X;

/* renamed from: X.9rQ  reason: invalid class name and case insensitive filesystem */
public final class C194249rQ {
    public Long A00 = null;
    public String A01 = null;
    public boolean A02 = false;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C194249rQ) {
                C194249rQ r5 = (C194249rQ) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || this.A02 != r5.A02 || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0DV.A00(C17900vP.A00(this.A01) * 31, this.A02) + C17880vN.A02(this.A00);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("RecentMessageInfo(templateId=");
        A10.append(this.A01);
        A10.append(", didUserRespond=");
        A10.append(this.A02);
        A10.append(", messageTsRoundedToHour=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
