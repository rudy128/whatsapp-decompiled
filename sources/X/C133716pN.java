package X;

import com.whatsapp.Me;
import com.whatsapp.productinfra.avatar.squid.AvatarSquidConfiguration;
import com.whatsapp.voipcalling.CallLinkInfo;

/* renamed from: X.6pN  reason: invalid class name and case insensitive filesystem */
public final class C133716pN {
    public final C18030ve A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass11S A02;
    public final AvatarSquidConfiguration A03;

    public final String A00() {
        String A0p;
        if (C18020vd.A05(C18040vf.A02, this.A00, 4501)) {
            AnonymousClass11S r0 = this.A02;
            r0.A0I();
            Me me = r0.A00;
            if (me == null || (A0p = C108965cb.A0p(me)) == null) {
                return "";
            }
            return A0p;
        }
        return "";
    }

    public C133716pN(AnonymousClass11S r1, C18030ve r2, AvatarSquidConfiguration avatarSquidConfiguration, AnonymousClass00H r4) {
        C18070vi.A0s(r2, r1, r4, avatarSquidConfiguration);
        this.A00 = r2;
        this.A02 = r1;
        this.A01 = r4;
        this.A03 = avatarSquidConfiguration;
    }

    public final String A01() {
        Integer num;
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(CallLinkInfo.DEFAULT_CALL_LINK_CALL_ID);
        A10.append(",");
        A10.append("weights");
        C18030ve r4 = this.A00;
        C18040vf r1 = C18040vf.A02;
        if (C18020vd.A05(r1, r4, 4196)) {
            A10.append(",");
            A10.append("animated");
        }
        if (C18020vd.A05(r1, r4, 7949)) {
            A10.append(",");
            A10.append("squidF");
        }
        if (this.A03.A03()) {
            A10.append(",");
            num = AnonymousClass00R.A0j;
        } else {
            A10.append(",");
            num = AnonymousClass00R.A0N;
        }
        switch (num.intValue()) {
            case 3:
                str = "smallhead";
                break;
            case 4:
                str = "squidF";
                break;
            default:
                str = "style2";
                break;
        }
        A10.append(str);
        String A0v = C108955ca.A0v(r4, 6112);
        if (A0v.length() > 0) {
            A10.append(",");
            A10.append(A0v);
        }
        return C18070vi.A0H(A10);
    }
}
