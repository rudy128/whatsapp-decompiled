package X;

/* renamed from: X.4jy  reason: invalid class name and case insensitive filesystem */
public final class C94054jy implements AnonymousClass5XE {
    public final AnonymousClass206 A00;
    public final AnonymousClass4ZN A01;

    public C94054jy(AnonymousClass206 r2, AnonymousClass4ZN r3) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
        this.A01 = r3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C94054jy) {
                C94054jy r5 = (C94054jy) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0L(this.A00) + AnonymousClass001.A0k(this.A01);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Message(message=");
        A10.append(this.A00);
        A10.append(", chatName=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
