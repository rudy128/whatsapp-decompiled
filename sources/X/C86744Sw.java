package X;

/* renamed from: X.4Sw  reason: invalid class name and case insensitive filesystem */
public final class C86744Sw {
    public final int A00;
    public final AnonymousClass4ZN A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C86744Sw) {
                C86744Sw r5 = (C86744Sw) obj;
                if (this.A00 != r5.A00 || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, this.A00 * 31);
    }

    public C86744Sw(AnonymousClass4ZN r1, int i) {
        this.A00 = i;
        this.A01 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("InstructionQueueItem(rendererIndex=");
        A10.append(this.A00);
        A10.append(", stringProvider=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
