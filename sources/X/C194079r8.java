package X;

/* renamed from: X.9r8  reason: invalid class name and case insensitive filesystem */
public final class C194079r8 {
    public final C1774998v A00;
    public final C195319t9 A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C194079r8) {
                C194079r8 r5 = (C194079r8) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, AnonymousClass000.A0L(this.A00));
    }

    public C194079r8(C1774998v r1, C195319t9 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PushPayloadWithMetadata(payload=");
        A10.append(this.A00);
        A10.append(", metadata=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
