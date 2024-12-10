package X;

/* renamed from: X.1Mf  reason: invalid class name and case insensitive filesystem */
public final class C24931Mf extends Exception {
    public final C49422Qk errorType;
    public final String message;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24931Mf(C49422Qk r2, String str) {
        super(str);
        C18070vi.A0d(r2, 1);
        C18070vi.A0d(str, 2);
        this.errorType = r2;
        this.message = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C24931Mf) {
                C24931Mf r5 = (C24931Mf) obj;
                if (this.errorType != r5.errorType || !C18070vi.A18(this.message, r5.message)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.errorType.hashCode() * 31) + this.message.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Error type: ");
        sb.append(this.errorType);
        sb.append(". ");
        sb.append(this.message);
        return sb.toString();
    }

    public String getMessage() {
        return this.message;
    }
}
