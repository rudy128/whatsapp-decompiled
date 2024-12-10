package X;

/* renamed from: X.6qw  reason: invalid class name and case insensitive filesystem */
public final class C134656qw {
    public final C58852lM A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C134656qw) {
                C134656qw r5 = (C134656qw) obj;
                if (this.A01 != r5.A01 || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, AnonymousClass3MX.A03(this.A01));
    }

    public C134656qw(C58852lM r1, boolean z) {
        this.A01 = z;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("EmojiCacheKey(hasStroke=");
        A10.append(this.A01);
        A10.append(", emojiIdList=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
