package X;

/* renamed from: X.4TS  reason: invalid class name */
public final class AnonymousClass4TS {
    public final int A00;
    public final AnonymousClass21X A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4TS) {
                AnonymousClass4TS r5 = (AnonymousClass4TS) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0L(this.A01) + this.A00;
    }

    public AnonymousClass4TS(AnonymousClass21X r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MediaSource(message=");
        A10.append(this.A01);
        A10.append(", loopCount=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
