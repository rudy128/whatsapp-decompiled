package X;

import com.whatsapp.util.Log;
import java.util.Set;

/* renamed from: X.2jt  reason: invalid class name and case insensitive filesystem */
public final class C57942jt {
    public final AnonymousClass195 A00;
    public final C18030ve A01;
    public final C219017v A02;
    public final C29791cs A03;
    public final C29811cu A04;
    public final AnonymousClass00H A05;

    public final boolean A00() {
        boolean z;
        if (!C18020vd.A05(C18040vf.A01, this.A01, 3531)) {
            return false;
        }
        if (!this.A03.A03()) {
            C219017v.A01(this.A02);
            return false;
        }
        C219017v r2 = this.A02;
        if (r2.A0J.A01() || this.A00.A00) {
            return false;
        }
        AnonymousClass00H r3 = this.A05;
        Set set = ((C29971dB) r3.get()).A0G;
        synchronized (set) {
            z = !set.isEmpty();
        }
        if (z) {
            return false;
        }
        if (((C29971dB) r3.get()).A0B()) {
            if (((C29971dB) r3.get()).A05 == null) {
                return false;
            }
            r3.get();
        }
        C36281nd r22 = r2.A07;
        if (r22 != null) {
            r22.CHR(false, 7);
        } else {
            Log.i("MessageHandler/onDoLogout ignoring due to null sending channel");
        }
        C29971dB r1 = (C29971dB) r3.get();
        if (!r1.A07 && C29971dB.A03(r1, "xmpp-bg-to-logout")) {
            r1.A07 = true;
        }
        C29811cu.A01(this.A04, 3);
        return true;
    }

    public C57942jt(AnonymousClass195 r2, C18030ve r3, C219017v r4, C29791cs r5, C29811cu r6, AnonymousClass00H r7) {
        C18070vi.A0w(r3, r7, r4, r5, r2);
        C18070vi.A0d(r6, 6);
        this.A01 = r3;
        this.A05 = r7;
        this.A02 = r4;
        this.A03 = r5;
        this.A00 = r2;
        this.A04 = r6;
    }
}
