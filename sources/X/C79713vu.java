package X;

import com.whatsapp.jid.GroupJid;

/* renamed from: X.3vu  reason: invalid class name and case insensitive filesystem */
public abstract class C79713vu extends C94974lU {
    public final AnonymousClass1L9 A00;
    public final C51852Zw A01;
    public final AnonymousClass1MZ A02;

    public boolean A02(AnonymousClass1FY r6, AnonymousClass206 r7) {
        if (this instanceof C80113wZ) {
            C80113wZ r4 = (C80113wZ) this;
            C18070vi.A0d(r7, 0);
            AnonymousClass1BI A0H = r7.A0H();
            if (A0H == null) {
                return false;
            }
            boolean A0M = r4.A00.A0M(A0H);
            AnonymousClass1MZ r1 = r4.A02;
            C36321nh r0 = GroupJid.Companion;
            C91644g1.A00(r6, r1.A03(A0H, C36321nh.A00(r7.A0v.A00)), new AnonymousClass5VW(r6, r4, r7, A0M), 20);
            return true;
        }
        AnonymousClass1BI A0H2 = r7.A0H();
        if (A0H2 == null) {
            return false;
        }
        AnonymousClass1MZ r12 = this.A02;
        C36321nh r02 = GroupJid.Companion;
        C91644g1.A00(r6, r12.A03(A0H2, C36321nh.A00(r7.A0v.A00)), new AnonymousClass5VW(r6, this, r7, false), 20);
        return true;
    }

    public boolean BRj() {
        return true;
    }

    public C79713vu(AnonymousClass1L9 r1, C51852Zw r2, AnonymousClass1MZ r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }
}
