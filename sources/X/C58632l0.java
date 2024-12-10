package X;

import android.os.Parcelable;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2l0  reason: invalid class name and case insensitive filesystem */
public final class C58632l0 {
    public final AnonymousClass1CJ A00;
    public final AnonymousClass1MZ A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;

    public final AnonymousClass1EC A00(AnonymousClass1EC r3) {
        C18070vi.A0d(r3, 0);
        A2B A022 = ((C34511kb) this.A02.get()).A08.A02(r3);
        if (A022 == null) {
            return null;
        }
        Parcelable.Creator creator = AnonymousClass1EC.CREATOR;
        return C42941yz.A00(A022.A02);
    }

    public final List A01(GroupJid groupJid, List list) {
        C18070vi.A0d(list, 1);
        if (groupJid == null || !((C59742mo) this.A03.get()).A02.A0R(groupJid)) {
            return list;
        }
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Jid A0S = C17880vN.A0S(it);
            if (!C22971Dz.A0T(A0S)) {
                A13.add(A0S);
            }
        }
        return A13;
    }

    public C58632l0(AnonymousClass1CJ r1, AnonymousClass1MZ r2, AnonymousClass00H r3, AnonymousClass00H r4) {
        C18070vi.A0s(r1, r3, r4, r2);
        this.A00 = r1;
        this.A03 = r3;
        this.A02 = r4;
        this.A01 = r2;
    }
}
