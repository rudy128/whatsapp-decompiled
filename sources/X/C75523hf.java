package X;

/* renamed from: X.3hf  reason: invalid class name and case insensitive filesystem */
public final class C75523hf extends C99704tK {
    public final String errorMessage;

    public C75523hf() {
        this((String) null);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C75523hf) && C18070vi.A18(this.errorMessage, ((C75523hf) obj).errorMessage));
    }

    public int hashCode() {
        return C17900vP.A00(this.errorMessage);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CameraProcessorSetUpFailed(errorMessage=");
        return C17900vP.A0B(this.errorMessage, A10);
    }

    public C75523hf(String str) {
        super(str, (Throwable) null, 1);
        this.errorMessage = str;
    }
}
