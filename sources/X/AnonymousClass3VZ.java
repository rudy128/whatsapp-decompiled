package X;

import com.whatsapp.jid.Jid;
import java.util.Set;

/* renamed from: X.3VZ  reason: invalid class name */
public final class AnonymousClass3VZ extends AnonymousClass1J2 implements C72153Kv {
    public final AnonymousClass1DT A00 = AnonymousClass3MW.A0L();
    public final C49502Qs A01;
    public final AnonymousClass1RL A02;
    public final Jid A03;
    public final AnonymousClass10I A04;

    public void A0S() {
        Set set = this.A02.A08;
        synchronized (set) {
            set.remove(this);
        }
    }

    public void C0U(C62412rM r3, AnonymousClass1E2 r4) {
        Boolean bool;
        if (C18070vi.A18(r4, this.A03) && (bool = r3.A01) != null) {
            this.A00.A0E(bool);
        }
    }

    public AnonymousClass3VZ(C49502Qs r2, AnonymousClass1RL r3, Jid jid, AnonymousClass10I r5) {
        C18070vi.A0j(r5, r3);
        this.A04 = r5;
        this.A02 = r3;
        this.A03 = jid;
        this.A01 = r2;
    }
}
