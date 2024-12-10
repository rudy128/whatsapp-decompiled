package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Iterator;

/* renamed from: X.6yF  reason: invalid class name and case insensitive filesystem */
public final class C139116yF {
    public final AnonymousClass11S A00;
    public final AnonymousClass1TG A01;
    public final C24641Lc A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass1M9 A04;

    public static final AnonymousClass206 A00(C63372sx r7, C139116yF r8) {
        Object obj;
        AnonymousClass206 r6 = null;
        if (r7 != null && r7.A01() > 0) {
            synchronized (r7) {
                r6 = r7.A07;
            }
            if (r6 == null) {
                Iterator it = r8.A01.A04(r7.A0A, -1).iterator();
                while (true) {
                    r6 = null;
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (r7.A0E((AnonymousClass206) obj, C18020vd.A05(C18040vf.A02, r8.A02.A01, 8880))) {
                        break;
                    }
                }
                AnonymousClass206 r4 = (AnonymousClass206) obj;
                if (r4 != null) {
                    r7.A07 = r4;
                    return r4;
                }
            }
        }
        return r6;
    }

    public final AnonymousClass6JB A01(C63372sx r18, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        AnonymousClass1E7 A0E;
        String str;
        AnonymousClass1E7 A05;
        String str2;
        AnonymousClass206 r12;
        C63372sx r9 = r18;
        C18070vi.A0d(r9, 0);
        UserJid userJid = r9.A0A;
        boolean A0Z = C22971Dz.A0Z(userJid);
        AnonymousClass1M9 r0 = this.A04;
        if (A0Z) {
            A0E = (AnonymousClass1E7) r0.A03.A01.get();
        } else {
            A0E = r0.A0E(userJid);
        }
        AnonymousClass206 r13 = null;
        if (A0E == null || (A05 = A0E.A05()) == null) {
            str = "Could not fetch contact info based on StatusInfo.";
        } else if (A05.A0B() || C22971Dz.A0Z(userJid)) {
            AnonymousClass1TG r3 = this.A01;
            AnonymousClass206 A032 = r3.A03(userJid);
            if (A032 == null) {
                str = "Could not fetch last status message based on StatusInfo.";
            } else {
                if (C22971Dz.A0Z(userJid)) {
                    C63322ss A002 = r3.A0E.A00(A032);
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("ts = ");
                    A10.append(A032.A0I);
                    A10.append(" statusinfoTs = ");
                    A10.append(r9.A04());
                    A10.append(" campaignId = ");
                    A10.append(A002.A04);
                    A10.append(" 1stseents = ");
                    A10.append(A002.A01);
                    A10.append("  expts = ");
                    String A0u = C17880vN.A0u(A10, A002.A00);
                    if (A032.A0I <= 10000) {
                        r3.A00.A0G("StatusPSA/TS", A0u, true);
                    }
                }
                if (A032.A0I > 10000) {
                    C133606p3 r2 = (C133606p3) this.A03.get();
                    long j = A032.A0I;
                    if (z5) {
                        str2 = C108965cb.A0q(r2.A00, r2.A01, j);
                        C18070vi.A0X(str2);
                    } else {
                        str2 = r2.A00(j);
                    }
                } else {
                    str2 = " ";
                }
                if (!z3) {
                    r12 = null;
                } else if (z4) {
                    r12 = A032;
                } else {
                    r12 = A00(r9, this);
                    if (r12 == null) {
                        r13 = r3.A02(userJid);
                    }
                }
                return new AnonymousClass6JB(r9, A05, A032, r12, r13, str2, z, z2);
            }
        } else {
            str = "User is not a contact";
        }
        Log.e(str);
        return null;
    }

    public C139116yF(AnonymousClass11S r1, AnonymousClass1M9 r2, AnonymousClass1TG r3, C24641Lc r4, AnonymousClass00H r5) {
        C18070vi.A0w(r1, r2, r3, r5, r4);
        this.A00 = r1;
        this.A04 = r2;
        this.A01 = r3;
        this.A03 = r5;
        this.A02 = r4;
    }
}
