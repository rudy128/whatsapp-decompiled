package X;

import com.whatsapp.jid.UserJid;
import java.util.Random;

/* renamed from: X.71A  reason: invalid class name */
public final class AnonymousClass71A {
    public final AnonymousClass1M9 A00;
    public final AnonymousClass18K A01;
    public final C24641Lc A02;

    public static final AnonymousClass642 A00(UserJid userJid, AnonymousClass71A r4, Boolean bool, Boolean bool2, Integer num, Long l, String str) {
        AnonymousClass1E7 A0E;
        AnonymousClass1E7 A0E2;
        AnonymousClass642 r2 = new AnonymousClass642();
        if (l == null) {
            l = Long.valueOf(new Random().nextLong());
        }
        r2.A07 = l;
        r2.A00 = bool;
        r2.A01 = bool2;
        r2.A08 = str;
        r2.A05 = num;
        Boolean bool3 = null;
        if (!(userJid == null || (A0E2 = r4.A00.A0E(userJid)) == null)) {
            bool3 = Boolean.valueOf(A0E2.A0C());
        }
        r2.A03 = bool3;
        Boolean bool4 = null;
        if (!(userJid == null || (A0E = r4.A00.A0E(userJid)) == null)) {
            bool4 = Boolean.valueOf(A0E.A0B());
        }
        r2.A04 = bool4;
        if (userJid != null) {
            r2.A09 = userJid.user;
        }
        return r2;
    }

    public static final AnonymousClass643 A01(UserJid userJid, AnonymousClass71A r5, Boolean bool, Boolean bool2, Integer num, Long l, String str) {
        AnonymousClass643 r3 = new AnonymousClass643();
        if (l == null) {
            l = Long.valueOf(new Random().nextLong());
        }
        r3.A07 = l;
        r3.A00 = bool;
        r3.A01 = bool2;
        r3.A08 = str;
        r3.A05 = num;
        Boolean bool3 = null;
        AnonymousClass1M9 r2 = r5.A00;
        AnonymousClass1E7 A0E = r2.A0E(userJid);
        if (A0E != null) {
            bool3 = Boolean.valueOf(A0E.A0C());
        }
        r3.A02 = bool3;
        Boolean bool4 = null;
        AnonymousClass1E7 A0E2 = r2.A0E(userJid);
        if (A0E2 != null) {
            bool4 = Boolean.valueOf(A0E2.A0B());
        }
        r3.A03 = bool4;
        r3.A09 = userJid.user;
        return r3;
    }

    public AnonymousClass71A(AnonymousClass1M9 r1, AnonymousClass18K r2, C24641Lc r3) {
        C18070vi.A0o(r2, r1, r3);
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }
}
