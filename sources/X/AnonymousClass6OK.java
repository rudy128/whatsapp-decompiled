package X;

/* renamed from: X.6OK  reason: invalid class name */
public final class AnonymousClass6OK extends AnonymousClass6OF {
    public final int errorCode;
    public final String errorMessage = null;

    public AnonymousClass6OK(int i) {
        this.errorCode = i;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6OK) {
                AnonymousClass6OK r5 = (AnonymousClass6OK) obj;
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
        A10.append("EligibilityGenericError(errorCode=");
        A10.append(this.errorCode);
        A10.append(", errorMessage=");
        return C17900vP.A0B(this.errorMessage, A10);
    }
}
