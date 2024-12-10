package X;

import com.whatsapp.jid.UserJid;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.5yS  reason: invalid class name and case insensitive filesystem */
public final class C116685yS extends C42601yR {
    public final /* synthetic */ C111255jJ A00;

    public C116685yS(C111255jJ r1) {
        this.A00 = r1;
    }

    public /* bridge */ /* synthetic */ Object A02() {
        C111255jJ r4 = this.A00;
        Map A0C = ((C24661Le) r4.A0E.get()).A0C();
        C18070vi.A0X(A0C);
        if (r4.A0I.compareAndSet(false, true)) {
            Map map = (Map) r4.A04.A06();
            if (map == null) {
                map = AnonymousClass1D7.A0I();
            }
            Set<UserJid> keySet = map.keySet();
            synchronized (r4) {
                LinkedHashSet A14 = C17880vN.A14();
                for (UserJid userJid : keySet) {
                    if (!A0C.containsKey(userJid)) {
                        A14.add(userJid);
                    }
                }
                A14.addAll(A0C.keySet());
                C111255jJ.A05(r4, A14);
            }
        }
        return A0C;
    }
}
