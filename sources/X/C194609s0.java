package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.9s0  reason: invalid class name and case insensitive filesystem */
public final class C194609s0 {
    public final List A00;
    public final Map A01;
    public final Map A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C194609s0) {
                C194609s0 r5 = (C194609s0) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass000.A0L(this.A01) + AnonymousClass001.A0k(this.A02)) * 31) + C17880vN.A02(this.A00);
    }

    public C194609s0(List list, Map map, Map map2) {
        this.A01 = map;
        this.A02 = map2;
        this.A00 = list;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MessageParticipantsEncNodeData(broadcastListEphemeralSettings=");
        A10.append(this.A01);
        A10.append(", participantEncryptedMessages=");
        A10.append(this.A02);
        A10.append(", additionalParticipants=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
