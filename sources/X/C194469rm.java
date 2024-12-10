package X;

/* renamed from: X.9rm  reason: invalid class name and case insensitive filesystem */
public final class C194469rm {
    public final AnonymousClass206 A00;
    public final int A01;
    public final AnonymousClass20E A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C194469rm) {
                C194469rm r5 = (C194469rm) obj;
                if (this.A01 != r5.A01 || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, ((this.A01 * 31) + this.A02.hashCode()) * 31);
    }

    public C194469rm(AnonymousClass206 r1, AnonymousClass20E r2, int i) {
        this.A01 = i;
        this.A02 = r2;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ParsingResult(messageType=");
        A10.append(this.A01);
        A10.append(", parser=");
        A10.append(this.A02);
        A10.append(", parsedMessage=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
