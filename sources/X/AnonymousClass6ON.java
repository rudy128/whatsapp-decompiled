package X;

/* renamed from: X.6ON  reason: invalid class name */
public final class AnonymousClass6ON extends AnonymousClass6OF {
    public final String errorMessage;

    public AnonymousClass6ON(String str) {
        this.errorMessage = null;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass6ON) && C18070vi.A18(this.errorMessage, ((AnonymousClass6ON) obj).errorMessage));
    }

    public int hashCode() {
        return C17900vP.A00(this.errorMessage);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("EligibilityPurposeEncryptionValidationError(errorMessage=");
        return C17900vP.A0B(this.errorMessage, A10);
    }

    public AnonymousClass6ON() {
        this((String) null);
    }
}
