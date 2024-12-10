package X;

/* renamed from: X.8qG  reason: invalid class name and case insensitive filesystem */
public final class C170588qG extends C20126A8l {
    public static final C62382rJ A02 = C62382rJ.A03;
    public final AnonymousClass9Jm A00;
    public final String[] A01;

    public C170588qG(C19999A2n a2n, AnonymousClass9Jm r13, String str, long j) {
        super(A02, a2n, str, "regular", 7, j, false);
        this.A00 = r13;
        String[] A1Y = C17880vN.A1Y();
        A1Y[0] = "usernameChatStartMode";
        this.A01 = A1Y;
    }

    public C163398Uv A08() {
        C163398Uv A08 = super.A08();
        C23624Bmt A0N = AnonymousClass8YR.DEFAULT_INSTANCE.A0N();
        AnonymousClass9Jm r0 = this.A00;
        AnonymousClass8YR r1 = (AnonymousClass8YR) C17880vN.A0G(A0N);
        r1.chatStartMode_ = r0.value;
        r1.bitField0_ |= 1;
        C166378cn A0O = AnonymousClass8BS.A0O(A08);
        AnonymousClass8YR r12 = (AnonymousClass8YR) A0N.A0C();
        int i = C166378cn.AGENT_ACTION_FIELD_NUMBER;
        r12.getClass();
        A0O.usernameChatStartMode_ = r12;
        A0O.bitField1_ |= 2097152;
        return A08;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("UsernameChatStartModeMutation(chatStartMode=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
