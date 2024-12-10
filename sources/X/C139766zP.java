package X;

/* renamed from: X.6zP  reason: invalid class name and case insensitive filesystem */
public final class C139766zP {
    public final C123406Ui A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C139766zP) && C18070vi.A18(this.A00, ((C139766zP) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C139766zP(C123406Ui r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("UserControlMessageLevelState(messagePreviewState=");
        return AnonymousClass001.A1F(this.A00, A10);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.6Ui, java.lang.Object] */
    public C139766zP() {
        this(new Object());
    }
}
