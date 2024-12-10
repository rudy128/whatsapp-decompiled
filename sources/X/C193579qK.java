package X;

/* renamed from: X.9qK  reason: invalid class name and case insensitive filesystem */
public final class C193579qK {
    public final long A00;
    public final AnonymousClass1BI A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C193579qK) {
                C193579qK r8 = (C193579qK) obj;
                if (!C18070vi.A18(this.A01, r8.A01) || this.A00 != r8.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass001.A0J(this.A00, AnonymousClass000.A0L(this.A01));
    }

    public C193579qK(AnonymousClass1BI r1, long j) {
        this.A01 = r1;
        this.A00 = j;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("DwellTimeState(currentChatJid=");
        A10.append(this.A01);
        A10.append(", startTime=");
        return C17900vP.A0E(A10, this.A00);
    }
}
