package X;

import com.whatsapp.productinfra.avatar.squid.AvatarSquidConfiguration;

/* renamed from: X.6mn  reason: invalid class name and case insensitive filesystem */
public final class C132436mn {
    public final C18030ve A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;

    public final C27356DcS A00() {
        C27356DcS dcS = new C27356DcS();
        boolean A002 = C138986y1.A00(this.A02);
        dcS.add("expresso");
        if (A002) {
            dcS.add("SOCIAL_STICKERS");
        }
        C18030ve r1 = this.A00;
        C18040vf r2 = C18040vf.A02;
        if (C18020vd.A05(r2, r1, 7949)) {
            dcS.add("squidF");
        }
        if (C18020vd.A00(r2, C17880vN.A0P(((AvatarSquidConfiguration) this.A01.get()).A01), 7925) == 3) {
            dcS.add("style2");
        }
        return AnonymousClass1AO.A00(dcS);
    }

    public C132436mn(C18030ve r1, AnonymousClass00H r2, AnonymousClass00H r3) {
        C18070vi.A0o(r1, r2, r3);
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }
}
