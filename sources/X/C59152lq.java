package X;

/* renamed from: X.2lq  reason: invalid class name and case insensitive filesystem */
public final class C59152lq {
    public final long A00;
    public final String A01;

    public C59152lq(String str, long j) {
        C18070vi.A0d(str, 1);
        this.A01 = str;
        this.A00 = j;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C59152lq) {
                C59152lq r8 = (C59152lq) obj;
                if (!C18070vi.A18(this.A01, r8.A01) || this.A00 != r8.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass001.A0J(this.A00, C17880vN.A03(this.A01));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PollSnapshotOption(optionName=");
        A10.append(this.A01);
        A10.append(", voteCount=");
        return C17900vP.A0E(A10, this.A00);
    }
}
