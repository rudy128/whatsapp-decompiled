package X;

/* renamed from: X.8R9  reason: invalid class name */
public final class AnonymousClass8R9 extends C180259Lt {
    public final long A00;
    public final C180739Ns A01;
    public final C19450yE A02;

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof C180259Lt)) {
                return false;
            }
            AnonymousClass8R9 r7 = (AnonymousClass8R9) ((C180259Lt) obj);
            if (this.A00 != r7.A00 || !this.A02.equals(r7.A02) || !this.A01.equals(r7.A01)) {
                return false;
            }
        }
        return true;
    }

    public AnonymousClass8R9(C180739Ns r2, C19450yE r3, long j) {
        this.A00 = j;
        if (r3 != null) {
            this.A02 = r3;
            this.A01 = r2;
            return;
        }
        throw AnonymousClass000.A0s("Null transportContext");
    }

    public int hashCode() {
        return ((((1000003 ^ AnonymousClass000.A0I(this.A00)) * 1000003) ^ this.A02.hashCode()) * 1000003) ^ this.A01.hashCode();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PersistedEvent{id=");
        A10.append(this.A00);
        A10.append(", transportContext=");
        A10.append(this.A02);
        A10.append(", event=");
        return AnonymousClass8BX.A0d(this.A01, A10);
    }
}
