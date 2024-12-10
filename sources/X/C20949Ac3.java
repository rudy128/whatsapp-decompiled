package X;

/* renamed from: X.Ac3  reason: case insensitive filesystem */
public final class C20949Ac3 implements AnonymousClass25D {
    public final AnonymousClass6R7 A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C20949Ac3) {
                C20949Ac3 ac3 = (C20949Ac3) obj;
                if (!C18070vi.A18(this.A01, ac3.A01) || this.A00 != ac3.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final C164378Yp A00() {
        AnonymousClass9KF r0;
        C23624Bmt A0N = C164378Yp.DEFAULT_INSTANCE.A0N();
        String str = this.A01;
        C164378Yp r1 = (C164378Yp) C17880vN.A0G(A0N);
        r1.bitField0_ |= 1;
        r1.sessionId_ = str;
        int ordinal = this.A00.ordinal();
        if (ordinal == 0) {
            r0 = AnonymousClass9KF.NULL_STATE;
        } else if (ordinal == 1) {
            r0 = AnonymousClass9KF.TYPEAHEAD;
        } else if (ordinal == 2) {
            r0 = AnonymousClass9KF.USER_INPUT;
        } else if (ordinal == 3) {
            r0 = AnonymousClass9KF.EMU_FLASH;
        } else if (ordinal == 4) {
            r0 = AnonymousClass9KF.VOICE;
        } else {
            throw AnonymousClass3MW.A14();
        }
        C164378Yp r12 = (C164378Yp) C17880vN.A0G(A0N);
        r12.sessionSource_ = r0.value;
        r12.bitField0_ |= 2;
        return (C164378Yp) A0N.A0C();
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, C17880vN.A03(this.A01));
    }

    public C20949Ac3(AnonymousClass6R7 r1, String str) {
        this.A01 = str;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BotSessionMetadata(sessionId=");
        A10.append(this.A01);
        A10.append(", sessionSource=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
