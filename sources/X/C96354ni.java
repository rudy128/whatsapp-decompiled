package X;

import com.whatsapp.jid.GroupJid;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.4ni  reason: invalid class name and case insensitive filesystem */
public class C96354ni implements AnonymousClass3L7 {
    public final /* synthetic */ C77033p1 A00;

    public C96354ni(C77033p1 r1) {
        this.A00 = r1;
    }

    public void Bsy(Integer num) {
        if (num != null) {
            C77033p1 r4 = this.A00;
            int intValue = num.intValue();
            if (intValue == 403) {
                ArrayList A13 = AnonymousClass000.A13();
                C34511kb r6 = r4.A0N;
                AnonymousClass1EC r5 = r4.A0q;
                Iterator it = r6.A08(r5).iterator();
                while (it.hasNext()) {
                    GroupJid groupJid = ((A2B) it.next()).A02;
                    if (groupJid instanceof AnonymousClass1EC) {
                        A13.add(groupJid);
                    }
                }
                r6.A0M(r5);
                r4.A0k.A0h(A13, false);
            } else if (intValue == 404 && !r4.A0p.A00(r4.A04)) {
                r4.A0N.A0L(r4.A0q);
            } else {
                return;
            }
            AnonymousClass3MX.A1K(r4.A12, intValue);
        }
    }
}
