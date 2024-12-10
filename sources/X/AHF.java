package X;

import com.whatsapp.jid.UserJid;

public class AHF implements C24051Ir {
    public final B7A A00;
    public final UserJid A01;

    public /* synthetic */ AnonymousClass1J2 BGl(C24091Iv r2, Class cls) {
        return C60282nh.A00(this, cls);
    }

    public static AnonymousClass1J2 A00(AnonymousClass1FD r2, B7A b7a, UserJid userJid) {
        return new C24071It(new AHF(b7a, userJid), r2).A00(AnonymousClass8F7.class);
    }

    public AnonymousClass1J2 BG9(Class cls) {
        return this.A00.BGH(this.A01);
    }

    public AHF(B7A b7a, UserJid userJid) {
        this.A00 = b7a;
        this.A01 = userJid;
    }
}
