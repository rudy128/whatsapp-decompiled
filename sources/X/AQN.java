package X;

import android.content.Context;
import com.whatsapp.jid.UserJid;

public final class AQN implements AnonymousClass5ZX {
    public final C195529tU A00;
    public final A8Q A01;
    public final AnonymousClass122 A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;

    public void CBR(Context context, AnonymousClass5XY r11, AnonymousClass206 r12, C20285AEt aEt, int i) {
        AnonymousClass206 r5 = r12;
        UserJid A0I = r12.A0I();
        if (A0I != null) {
            ((A5M) this.A03.get()).A02(A0I, r12, 5);
        }
        C20285AEt aEt2 = aEt;
        AER aer = aEt.A07;
        if (aer != null) {
            int i2 = aEt.A00;
            if (i2 == 2 || i2 == 6) {
                this.A00.A02(aer.A00).A09(new C21121Aep(context, this, r5, aEt2, aer, 0));
            }
        }
    }

    public AQN(C195529tU r1, A8Q a8q, AnonymousClass122 r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7) {
        C18070vi.A0w(r3, r4, a8q, r1, r5);
        C18070vi.A0l(r6, r7);
        this.A02 = r3;
        this.A05 = r4;
        this.A01 = a8q;
        this.A00 = r1;
        this.A04 = r5;
        this.A06 = r6;
        this.A03 = r7;
    }
}
