package X;

import java.security.NoSuchAlgorithmException;

/* renamed from: X.6AW  reason: invalid class name */
public final class AnonymousClass6AW extends AnonymousClass6SB {
    public final NoSuchAlgorithmException throwable;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass6AW) && C18070vi.A18(this.throwable, ((AnonymousClass6AW) obj).throwable));
    }

    public int hashCode() {
        return this.throwable.hashCode();
    }

    public AnonymousClass6AW(NoSuchAlgorithmException noSuchAlgorithmException) {
        this.throwable = noSuchAlgorithmException;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ModelHashAlgorithmError(throwable=");
        return AnonymousClass001.A1F(this.throwable, A10);
    }
}
