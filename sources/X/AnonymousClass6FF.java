package X;

/* renamed from: X.6FF  reason: invalid class name */
public final class AnonymousClass6FF extends C39611tM {
    public final C18090vk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6FF(C18090vk r3) {
        super(AnonymousClass3MY.A0f(), 36);
        C18070vi.A0d(r3, 1);
        this.A00 = r3;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass6FF) && C18070vi.A18(this.A00, ((AnonymousClass6FF) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("LockedChatsEntrypointItem(onClickListener=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
