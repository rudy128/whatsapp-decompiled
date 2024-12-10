package X;

/* renamed from: X.6OO  reason: invalid class name */
public final class AnonymousClass6OO extends AnonymousClass6OF {
    public final String errorMessage;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass6OO) && C18070vi.A18(this.errorMessage, ((AnonymousClass6OO) obj).errorMessage));
    }

    public int hashCode() {
        return C17900vP.A00(this.errorMessage);
    }

    public AnonymousClass6OO(String str) {
        this.errorMessage = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("EligibilitySessionDataValidationError(errorMessage=");
        return C17900vP.A0B(this.errorMessage, A10);
    }

    public AnonymousClass6OO() {
        this((String) null);
    }
}
