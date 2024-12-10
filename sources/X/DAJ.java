package X;

public final class DAJ implements C28573E8e {
    public final String A00;
    public final boolean A01;

    public String Bb4() {
        return this.A00;
    }

    public boolean equals(Object obj) {
        if (!this.A01) {
            return super.equals(obj);
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || !C18070vi.A14(this, obj)) {
            return false;
        }
        return C18070vi.A18(this.A00, ((DAJ) obj).A00);
    }

    public int hashCode() {
        if (!this.A01) {
            return super.hashCode();
        }
        return this.A00.hashCode();
    }

    public DAJ(int i, boolean z) {
        this.A01 = z;
        this.A00 = AnonymousClass001.A1I("anim://", AnonymousClass000.A10(), i);
    }
}
