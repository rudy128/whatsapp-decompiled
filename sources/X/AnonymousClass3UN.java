package X;

import android.graphics.Bitmap;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.3UN  reason: invalid class name */
public final class AnonymousClass3UN extends AnonymousClass1J2 {
    public UserJid A00;
    public UserJid A01;
    public List A02;
    public final C139166yK A03;
    public final C136036tA A04;
    public final C41111vp A05 = AnonymousClass3MW.A0n(new AnonymousClass4YU((Bitmap) null, (UserJid) null, (List) null, true));
    public final AnonymousClass10I A06;
    public final Runnable A07;

    public AnonymousClass3UN(C139166yK r4, UserJid userJid, C136036tA r6, AnonymousClass10I r7) {
        C18070vi.A0f(r7, 3, r4);
        this.A00 = userJid;
        this.A04 = r6;
        this.A06 = r7;
        this.A03 = r4;
        AnonymousClass7RC r1 = new AnonymousClass7RC(this, 10);
        this.A07 = r1;
        this.A06.CGF(r1);
    }

    public void A0S() {
        this.A06.CEz(this.A07);
    }
}
