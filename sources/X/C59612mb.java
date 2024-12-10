package X;

import java.util.Map;

/* renamed from: X.2mb  reason: invalid class name and case insensitive filesystem */
public final class C59612mb {
    public final C54762ef A00;
    public final AnonymousClass37L A01;
    public final Map A02;
    public final Map A03;

    public C59612mb(C54762ef r2, AnonymousClass37L r3, Map map, Map map2) {
        C18070vi.A0d(map2, 4);
        this.A01 = r3;
        this.A03 = map;
        this.A00 = r2;
        this.A02 = map2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C59612mb) {
                C59612mb r5 = (C59612mb) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A02, AnonymousClass000.A0N(this.A00, AnonymousClass000.A0N(this.A03, AnonymousClass000.A0L(this.A01))));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("StanzaConfig(connectionThreadRequests=");
        A10.append(this.A01);
        A10.append(", pendingServerRequests=");
        A10.append(this.A03);
        A10.append(", companionXmppReadInterceptor=");
        A10.append(this.A00);
        A10.append(", ackKickSeenIds=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}
