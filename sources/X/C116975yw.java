package X;

import com.whatsapp.jid.PhoneUserJid;

/* renamed from: X.5yw  reason: invalid class name and case insensitive filesystem */
public final class C116975yw extends C20126A8l {
    public static final C62382rJ A03 = C62382rJ.A03;
    public final AnonymousClass1E2 A00;
    public final PhoneUserJid A01;
    public final String[] A02;

    public C116975yw(C19999A2n a2n, AnonymousClass1E2 r13, PhoneUserJid phoneUserJid, String str, long j) {
        super(A03, a2n, str, "regular", 7, j, false);
        this.A00 = r13;
        this.A01 = phoneUserJid;
        String[] A1Z = C17880vN.A1Z();
        A1Z[0] = "pnForLidChat";
        C17880vN.A1J(r13, A1Z, 1);
        this.A02 = A1Z;
    }

    public C163398Uv A08() {
        C163398Uv A08 = super.A08();
        C23624Bmt A0N = AnonymousClass8YF.DEFAULT_INSTANCE.A0N();
        String rawString = this.A01.getRawString();
        AnonymousClass8YF r1 = (AnonymousClass8YF) C17880vN.A0G(A0N);
        rawString.getClass();
        r1.bitField0_ |= 1;
        r1.pnJid_ = rawString;
        C166378cn r2 = (C166378cn) C17880vN.A0G(A08);
        AnonymousClass8YF r12 = (AnonymousClass8YF) A0N.A0C();
        int i = C166378cn.AGENT_ACTION_FIELD_NUMBER;
        r12.getClass();
        r2.pnForLidChatAction_ = r12;
        r2.bitField0_ |= Integer.MIN_VALUE;
        return A08;
    }

    public String A0B() {
        return "pnForLidChat";
    }

    public String[] A0F() {
        return this.A02;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PnForLidChatMutation(lidUserJid=");
        A10.append(this.A00);
        A10.append(", phoneUserJid=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
