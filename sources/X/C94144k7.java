package X;

import android.os.SystemClock;
import com.whatsapp.jid.UserJid;
import java.util.Collection;

/* renamed from: X.4k7  reason: invalid class name and case insensitive filesystem */
public final class C94144k7 implements C23581Gv {
    public long A00;
    public final /* synthetic */ C78463sq A01;

    public /* synthetic */ void Bkk(UserJid userJid) {
    }

    public /* synthetic */ void Bm3() {
    }

    public /* synthetic */ void Bmh(Collection collection) {
    }

    public /* synthetic */ void Bpv() {
    }

    public /* synthetic */ void Bpw(UserJid userJid) {
    }

    public /* synthetic */ void Bq0(Collection collection) {
    }

    public /* synthetic */ void Bq1(Collection collection) {
    }

    public /* synthetic */ void Bq3(Collection collection) {
    }

    public /* synthetic */ void Bq4(Collection collection) {
    }

    public /* synthetic */ void Brx(UserJid userJid) {
    }

    public /* synthetic */ void BtU(UserJid userJid) {
    }

    public void C1w(AnonymousClass1BI r8) {
        C18070vi.A0d(r8, 0);
        C78463sq r5 = this.A01;
        if (r8.equals(r5.A0H.A0v.A00) && SystemClock.uptimeMillis() - this.A00 > 2000) {
            this.A00 = SystemClock.uptimeMillis();
            C78463sq.setupNewsletterIcon$default(r5, false, 1, (Object) null);
            C78463sq.A03(r5);
            C78463sq.A02(r5);
        }
    }

    public /* synthetic */ void C1z(AnonymousClass1BI r1) {
    }

    public C94144k7(C78463sq r1) {
        this.A01 = r1;
    }
}
