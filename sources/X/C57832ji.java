package X;

import android.database.SQLException;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.2ji  reason: invalid class name and case insensitive filesystem */
public final class C57832ji {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;

    public final boolean A00() {
        PhoneUserJid A002;
        C28791au A05;
        AnonymousClass1Cd r0 = (AnonymousClass1Cd) this.A04.get();
        r0.A06();
        if (r0.A08 && (A002 = AnonymousClass11S.A00(C17880vN.A0H(this.A03))) != null) {
            Set A0S = C200410p.A0S(new UserJid[]{AnonymousClass1E5.A00, A002});
            ArrayList A0E = C29351c6.A0E(A0S);
            Iterator it = A0S.iterator();
            while (it.hasNext()) {
                C17880vN.A1R(A0E, AnonymousClass1DL.A02(C17880vN.A0S(it), this.A02));
            }
            ArrayList A0E2 = C29351c6.A0E(A0E);
            Iterator it2 = A0E.iterator();
            while (it2.hasNext()) {
                A0E2.add(String.valueOf(C17890vO.A07(it2)));
            }
            String[] A1b = C17890vO.A1b(A0E2, 0);
            try {
                A05 = ((C24711Lj) this.A01.get()).A00.A05();
                C23141Ev r3 = ((C28801av) A05).A02;
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("jid_row_id IN ");
                r3.A04("jid_map", AnonymousClass000.A0y(AnonymousClass1H2.A00(A1b.length), A10), "DELETE_SELF_PN_MAPPINGS", A1b);
                A05.close();
                ((C24751Ln) this.A00.get()).A0O();
                return true;
            } catch (SQLException e) {
                Log.e("JidMapStore/deleteSelfPNMappings", e);
            } catch (Throwable th) {
                AnonymousClass0DT.A00(th, th);
            }
        }
        return false;
        throw th;
    }

    public C57832ji(AnonymousClass00H r1, AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5) {
        C18070vi.A0w(r1, r2, r3, r4, r5);
        this.A02 = r1;
        this.A03 = r2;
        this.A01 = r3;
        this.A00 = r4;
        this.A04 = r5;
    }
}
