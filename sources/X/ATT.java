package X;

import com.whatsapp.jid.UserJid;
import java.nio.charset.Charset;

public final class ATT implements B84 {
    public final UserJid A00;
    public final AnonymousClass205 A01;

    public ATT(UserJid userJid, AnonymousClass205 r2) {
        this.A01 = r2;
        this.A00 = userJid;
    }

    public byte[] BMI() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(this.A01.A01);
        A10.append(0);
        String A0y = AnonymousClass000.A0y(this.A00.getRawString(), A10);
        Charset charset = C19620yd.A0C;
        C18070vi.A0Z(charset);
        return C18070vi.A1A(A0y, charset);
    }
}
