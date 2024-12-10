package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.2it  reason: invalid class name and case insensitive filesystem */
public final class C57322it {
    public final AnonymousClass1M9 A00;
    public final C25111Mx A01;

    public final boolean A00(UserJid userJid) {
        C53122c1 A06;
        Long l;
        AnonymousClass1E7 A0E;
        if (userJid != null && (A0E = this.A00.A0E(userJid)) != null && A0E.A0B()) {
            return true;
        }
        C25111Mx r7 = this.A01;
        if (userJid == null || (A06 = r7.A06(userJid)) == null || (l = A06.A01) == null) {
            return false;
        }
        long longValue = l.longValue();
        C18030ve r4 = r7.A04;
        C18040vf r1 = C18040vf.A02;
        if (longValue >= C25111Mx.A00(r7, (long) C18020vd.A00(r1, r4, 865), (long) C18020vd.A00(r1, r4, 3802))) {
            return true;
        }
        return false;
    }

    public C57322it(AnonymousClass1M9 r1, C25111Mx r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
