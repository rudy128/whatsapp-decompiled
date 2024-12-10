package X;

/* renamed from: X.4rH  reason: invalid class name and case insensitive filesystem */
public final class C98514rH implements Comparable {
    public final C108915cV A00;
    public final Object A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C98514rH) {
                C98514rH r5 = (C98514rH) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C98514rH r4 = (C98514rH) obj;
        C18070vi.A0d(r4, 0);
        C108915cV r2 = this.A00;
        C108915cV r1 = r4.A00;
        C18070vi.A0z(r1, "null cannot be cast to non-null type com.whatsapp.conversation.banner.ConversationBanner");
        return r2.compareTo(r1);
    }

    public int hashCode() {
        return AnonymousClass000.A0L(this.A00) + AnonymousClass001.A0k(this.A01);
    }

    public C98514rH(C108915cV r1, Object obj) {
        this.A00 = r1;
        this.A01 = obj;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BannerQueueItem(banner=");
        A10.append(this.A00);
        A10.append(", data=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
