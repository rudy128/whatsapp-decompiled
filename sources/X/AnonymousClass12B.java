package X;

import com.whatsapp.jid.UserJid;
import java.util.Set;

/* renamed from: X.12B  reason: invalid class name */
public final class AnonymousClass12B implements C201511a {
    public Set A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass190 A02;
    public final AnonymousClass11S A03;
    public final AnonymousClass1MN A04;
    public final Object A05 = new Object();

    public AnonymousClass12B(AnonymousClass190 r2, AnonymousClass11S r3, AnonymousClass1MN r4, AnonymousClass00H r5) {
        C18070vi.A0d(r2, 1);
        C18070vi.A0d(r3, 2);
        C18070vi.A0d(r4, 3);
        C18070vi.A0d(r5, 4);
        this.A02 = r2;
        this.A03 = r3;
        this.A04 = r4;
        this.A01 = r5;
    }

    public final boolean A01(UserJid userJid) {
        boolean contains;
        C18070vi.A0d(userJid, 0);
        if (this.A03.A0O(userJid)) {
            this.A01.get();
            return false;
        }
        synchronized (this.A05) {
            if (this.A00 == null) {
                A00(this);
            }
            Set set = this.A00;
            if (set == null) {
                C18070vi.A11("hostedUserJids");
                throw null;
            }
            contains = set.contains(userJid);
        }
        return contains;
    }

    public static final void A00(AnonymousClass12B r4) {
        if (C22781De.A03()) {
            r4.A02.A0G("hostedjids-load-mainthread", (String) null, true);
            synchronized (r4.A05) {
                r4.A00 = r4.A04.A04();
            }
        } else {
            synchronized (r4.A05) {
                r4.A00 = r4.A04.A04();
            }
        }
        if (r4.A00 == null) {
            C18070vi.A11("hostedUserJids");
            throw null;
        }
    }
}
