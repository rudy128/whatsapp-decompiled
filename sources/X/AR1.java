package X;

import com.whatsapp.passkeys.PasskeyExistsCache;

public final class AR1 implements C72143Ku {
    public final PasskeyExistsCache A00;

    public AR1(PasskeyExistsCache passkeyExistsCache) {
        C18070vi.A0d(passkeyExistsCache, 1);
        this.A00 = passkeyExistsCache;
    }

    public void C0w(C171888sR r2) {
        C18070vi.A0d(r2, 0);
        r2.A0Z = Boolean.valueOf(this.A00.A03.getValue() instanceof C20741AWw);
    }
}
