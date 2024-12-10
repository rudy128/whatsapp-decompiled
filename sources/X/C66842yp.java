package X;

import com.whatsapp.jid.UserJid;
import java.util.HashMap;

/* renamed from: X.2yp  reason: invalid class name and case insensitive filesystem */
public final class C66842yp implements AnonymousClass1UP {
    public C53372cQ A00;
    public final HashMap A01 = C17880vN.A11();
    public final C26861Tt A02;
    public final AnonymousClass11P A03;

    public C66842yp(C26861Tt r2, AnonymousClass11P r3) {
        C18070vi.A0d(r3, 1);
        this.A03 = r3;
        this.A02 = r2;
    }

    public void BcQ(AnonymousClass2R1 r6, String str, int i, long j) {
        if (j > 0) {
            long A012 = AnonymousClass11P.A01(this.A03) + j;
            C26861Tt r4 = this.A02;
            r4.A02(A012);
            if (i == 503) {
                C17900vP.A0l("contactsyncmanager/handleSyncContactError need global backoff=", AnonymousClass000.A10(), j);
                r4.A03(A012);
            } else if (r6.A00() && i == 429) {
                C17900vP.A0l("contactsyncmanager/handleSyncContactError/deltaSync need backoff=", AnonymousClass000.A10(), j);
                C17880vN.A1D(C26861Tt.A00(r4).edit(), "delta_sync_backoff", A012);
            }
        }
    }

    public void BcR(C53372cQ r7, String str) {
        Long l;
        for (C188829i3 r2 : r7.A01) {
            UserJid userJid = r2.A0D;
            if (userJid != null) {
                this.A01.put(userJid, r2);
            }
        }
        A00 a00 = r7.A00.A08;
        if (!(a00 == null || (l = a00.A02) == null)) {
            C17880vN.A1D(C26861Tt.A00(this.A02).edit(), "reachability_sync_backoff", AnonymousClass11P.A01(this.A03) + l.longValue());
        }
        this.A00 = r7;
    }

    public void BcS(int i, String str, long j) {
        throw AnonymousClass04E.createAndThrow();
    }
}
