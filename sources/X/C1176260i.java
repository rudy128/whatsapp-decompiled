package X;

/* renamed from: X.60i  reason: invalid class name and case insensitive filesystem */
public final class C1176260i extends C138756xd {
    public final AnonymousClass6UU A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C1176260i) && C18070vi.A18(this.A00, ((C1176260i) obj).A00));
    }

    public C1176260i(AnonymousClass6UU r1) {
        this.A00 = r1;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, -476019818);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AvatarSquidUpsell(id=");
        C138756xd.A02(A10, "id-avatar-squid-upsell");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
