package X;

import android.util.Base64;
import com.whatsapp.jid.UserJid;

/* renamed from: X.6yc  reason: invalid class name and case insensitive filesystem */
public class C139306yc {
    public static final byte[] A09 = Base64.decode("UtfZhxytgNVaD5/UqJ8DNtx9FNSWzywusKGQuB+BmLY=", 2);
    public final AnonymousClass11P A00;
    public final C18030ve A01;
    public final C52232aa A02;
    public final C52242ab A03;
    public final AnonymousClass10I A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass1DC A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;

    public C139306yc(AnonymousClass11P r1, C18030ve r2, C52232aa r3, C52242ab r4, AnonymousClass1DC r5, AnonymousClass10I r6, AnonymousClass00H r7, AnonymousClass00H r8, AnonymousClass00H r9) {
        this.A00 = r1;
        this.A01 = r2;
        this.A04 = r6;
        this.A08 = r7;
        this.A03 = r4;
        this.A05 = r8;
        this.A07 = r9;
        this.A02 = r3;
        this.A06 = r5;
    }

    public boolean A00(UserJid userJid) {
        if (!C22971Dz.A0T(userJid)) {
            C18030ve r2 = this.A01;
            C18040vf r1 = C18040vf.A02;
            if (C18020vd.A05(r1, r2, 2966) && C18020vd.A05(r1, r2, 3336)) {
                this.A07.get();
                if (((AnonymousClass12B) this.A08.get()).A01(userJid)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
}
