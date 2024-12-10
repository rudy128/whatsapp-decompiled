package X;

import com.whatsapp.jid.UserJid;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.96v  reason: invalid class name and case insensitive filesystem */
public final class C1770196v extends A5T {
    public static final List A02 = C18070vi.A0M("FB_Ads");
    public final C18030ve A00;
    public final AnonymousClass11P A01;

    public C194329rY A08(UserJid userJid) {
        C194329rY r5;
        C18030ve r2 = this.A00;
        C18040vf r1 = C18040vf.A02;
        if (C18020vd.A05(r1, r2, 10182) && (r5 = (C194329rY) super.A02(userJid)) != null) {
            int A002 = C18020vd.A00(r1, r2, 10465);
            if (r5.A00 >= System.currentTimeMillis() - TimeUnit.SECONDS.toMillis((long) A002)) {
                return r5;
            }
            A05(r5.A01);
        }
        return null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1770196v(AnonymousClass190 r3, AnonymousClass11P r4, C18030ve r5, C18010vc r6) {
        super(r3, (AnonymousClass16B) AnonymousClass12Q.A01(49161), r6, "ctwa_ad_id_store");
        C18070vi.A0s(r3, r6, r5, r4);
        this.A00 = r5;
        this.A01 = r4;
    }
}
