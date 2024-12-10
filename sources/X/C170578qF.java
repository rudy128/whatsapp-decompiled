package X;

import com.facebook.msys.mci.DefaultCrypto;

/* renamed from: X.8qF  reason: invalid class name and case insensitive filesystem */
public final class C170578qF extends C20126A8l {
    public static final C62382rJ A02 = C62382rJ.A03;
    public final C164288Yg A00;
    public final String[] A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C170578qF(C19999A2n a2n, C164288Yg r13, String str, long j) {
        super(A02, a2n, str, "regular_low", 7, j, false);
        C18070vi.A0d(r13, 4);
        this.A00 = r13;
        String[] A1Y = C17880vN.A1Y();
        A1Y[0] = "setting_chatLock";
        this.A01 = A1Y;
    }

    public C163398Uv A08() {
        C163398Uv A08 = super.A08();
        C164288Yg r2 = this.A00;
        C166378cn A0O = AnonymousClass8BS.A0O(A08);
        int i = C166378cn.AGENT_ACTION_FIELD_NUMBER;
        A0O.chatLockSettings_ = r2;
        A0O.bitField1_ |= DefaultCrypto.BUFFER_SIZE;
        return A08;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ChatLockSettingsMutation(settings= ");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
