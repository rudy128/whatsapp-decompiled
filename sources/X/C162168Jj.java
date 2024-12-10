package X;

/* renamed from: X.8Jj  reason: invalid class name and case insensitive filesystem */
public final class C162168Jj extends C180129Lg {
    public final A6Y A00;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A00.equals(((C162168Jj) obj).A00);
    }

    public C162168Jj(A6Y a6y) {
        this.A00 = a6y;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, 846803280);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Failure {mOutputData=");
        return AnonymousClass8BX.A0c(this.A00, A10);
    }

    public C162168Jj() {
        this(A6Y.A01);
    }
}
