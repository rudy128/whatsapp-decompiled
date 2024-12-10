package X;

/* renamed from: X.6OJ  reason: invalid class name */
public final class AnonymousClass6OJ extends C147347Su {
    public final int errorCode;
    public final String errorMessage;

    public AnonymousClass6OJ(int i) {
        this.errorCode = i;
        this.errorMessage = null;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6OJ) {
                AnonymousClass6OJ r5 = (AnonymousClass6OJ) obj;
                if (this.errorCode != r5.errorCode || !C18070vi.A18(this.errorMessage, r5.errorMessage)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.errorCode * 31) + C17900vP.A00(this.errorMessage);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CrosspostGenericError(errorCode=");
        A10.append(this.errorCode);
        A10.append(", errorMessage=");
        return C17900vP.A0B(this.errorMessage, A10);
    }

    public AnonymousClass6OJ() {
        this(-1);
    }
}
