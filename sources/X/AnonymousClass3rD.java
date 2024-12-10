package X;

/* renamed from: X.3rD  reason: invalid class name */
public abstract class AnonymousClass3rD extends AnonymousClass4EO {
    public final AnonymousClass1E7 A00;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C18070vi.A14(this, obj)) {
            return false;
        }
        return C18070vi.A18(this.A00, ((AnonymousClass3rD) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass3rD(AnonymousClass1E7 r1) {
        this.A00 = r1;
    }
}
