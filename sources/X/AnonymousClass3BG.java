package X;

import java.nio.charset.Charset;

/* renamed from: X.3BG  reason: invalid class name */
public class AnonymousClass3BG implements AnonymousClass00H {
    public final int A00;
    public final Object A01;

    public AnonymousClass3BG(C18010vc r1, int i) {
        this.A00 = i;
        this.A01 = r1;
    }

    public final Object get() {
        String str;
        int i = this.A00;
        C18010vc r1 = (C18010vc) this.A01;
        switch (i) {
            case 0:
                str = C19620yd.A09;
                break;
            case 1:
                str = "server_prop_preferences";
                break;
            case 2:
                Charset charset = C35521mN.A08;
                str = "ab-props";
                break;
            default:
                Charset charset2 = C35521mN.A08;
                str = C19620yd.A09;
                break;
        }
        return r1.A05(str);
    }
}
