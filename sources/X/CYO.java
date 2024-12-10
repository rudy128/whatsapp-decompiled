package X;

public final class CYO {
    public final C26050CrK A00;
    public final DFL A01;

    public boolean equals(Object obj) {
        if (!(obj instanceof CYO)) {
            return false;
        }
        CYO cyo = (CYO) obj;
        if (this.A01 != cyo.A01 || !this.A00.equals(cyo.A00)) {
            return false;
        }
        return true;
    }

    public CYO(C26050CrK crK, DFL dfl) {
        this.A01 = dfl;
        this.A00 = crK;
    }

    public int hashCode() {
        Object[] A1b = AnonymousClass3MW.A1b();
        A1b[0] = this.A01;
        return AnonymousClass000.A0P(this.A00, A1b, 1);
    }
}
