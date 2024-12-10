package X;

/* renamed from: X.3oV  reason: invalid class name and case insensitive filesystem */
public final class C76833oV extends AnonymousClass4EF {
    public final AnonymousClass1BI A00;

    public C76833oV(AnonymousClass1BI r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C76833oV) && C18070vi.A18(this.A00, ((C76833oV) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("DisableChatLock(chatJid=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
