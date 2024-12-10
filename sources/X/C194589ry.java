package X;

import java.util.Map;

/* renamed from: X.9ry  reason: invalid class name and case insensitive filesystem */
public final class C194589ry {
    public final C194059r6 A00;
    public final C194609s0 A01;
    public final Map A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C194589ry) {
                C194589ry r5 = (C194589ry) obj;
                if (!C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, (AnonymousClass000.A0L(this.A02) + AnonymousClass001.A0k(this.A00)) * 31);
    }

    public C194589ry(C194059r6 r1, C194609s0 r2, Map map) {
        this.A02 = map;
        this.A00 = r1;
        this.A01 = r2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("EncryptedMessagesData(deviceEncryptedMessages=");
        A10.append(this.A02);
        A10.append(", commonEncryptedMessage=");
        A10.append(this.A00);
        A10.append(", participantsData=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
