package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.2Dy  reason: invalid class name and case insensitive filesystem */
public final class C46282Dy extends C20126A8l {
    public final UserJid A00;
    public final boolean A01;
    public final String[] A02;

    public C46282Dy(C19999A2n a2n, UserJid userJid, String str, long j, boolean z, boolean z2) {
        super(C62382rJ.A03, a2n, str, "regular_high", 7, j, z2);
        this.A00 = userJid;
        this.A01 = z;
        String[] A1Z = C17880vN.A1Z();
        A1Z[0] = "userStatusMute";
        C17880vN.A1J(userJid, A1Z, 1);
        this.A02 = A1Z;
    }

    public C163398Uv A08() {
        C23624Bmt A0N = AnonymousClass8YQ.DEFAULT_INSTANCE.A0N();
        boolean z = this.A01;
        AnonymousClass8YQ r1 = (AnonymousClass8YQ) C17880vN.A0G(A0N);
        r1.bitField0_ |= 1;
        r1.muted_ = z;
        C163398Uv A08 = super.A08();
        C166378cn r2 = (C166378cn) C17880vN.A0G(A08);
        AnonymousClass8YQ r12 = (AnonymousClass8YQ) A0N.A0C();
        int i = C166378cn.AGENT_ACTION_FIELD_NUMBER;
        r12.getClass();
        r2.userStatusMuteAction_ = r12;
        r2.bitField0_ |= 8388608;
        return A08;
    }

    public String A0B() {
        return "userStatusMute";
    }

    public String[] A0F() {
        return this.A02;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("UserStatusMuteMutation{userJid=");
        A10.append(this.A00);
        A10.append(", rowId=");
        A10.append(this.A07);
        A10.append(", isMuted=");
        A10.append(this.A01);
        A10.append(", timestamp=");
        A10.append(this.A04);
        A10.append(", keyId=");
        A10.append(this.A00);
        return C17890vO.A0b(A10);
    }
}
