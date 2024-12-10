package X;

/* renamed from: X.4ho  reason: invalid class name and case insensitive filesystem */
public final class C92734ho implements C106595Wl {
    public final boolean A00;

    public C92734ho() {
        this(false);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C92734ho) && this.A00 == ((C92734ho) obj).A00);
    }

    public int hashCode() {
        if (this.A00) {
            return 1231;
        }
        return 1237;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Shown(isHighlighted=");
        return C17900vP.A0F(A10, this.A00);
    }

    public C92734ho(boolean z) {
        this.A00 = z;
    }
}
