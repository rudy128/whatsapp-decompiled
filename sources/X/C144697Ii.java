package X;

import com.whatsapp.jid.UserJid;
import java.util.Map;
import java.util.Set;

/* renamed from: X.7Ii  reason: invalid class name and case insensitive filesystem */
public class C144697Ii implements C72393Lt {
    public final /* synthetic */ C143087By A00;

    public C144697Ii(C143087By r1) {
        this.A00 = r1;
    }

    public void C2c(C60072nL r7) {
        C54392e4 r1;
        C143087By r5 = this.A00;
        C27131Uv r3 = r5.A14;
        AnonymousClass1BI r2 = r5.A0I;
        UserJid userJid = r7.A06;
        synchronized (r3.A0T) {
            Map map = (Map) C27131Uv.A05(r3).get(r2);
            if (map != null) {
                if (userJid == null) {
                    r1 = (C54392e4) map.get(r2);
                } else {
                    r1 = (C54392e4) map.get(userJid);
                }
                if (r1 != null) {
                    if (C27131Uv.A0G(r1.A00, AnonymousClass11P.A01(r3.A0D))) {
                        C143087By.A0B(r5, r7);
                    }
                }
            }
        }
    }

    public void C2f(AnonymousClass1BI r3) {
        C143087By r1 = this.A00;
        if (r1.A0I.equals(r3)) {
            C143087By.A06(r1);
        }
    }

    public void C2g(AnonymousClass1BI r4, UserJid userJid) {
        C143087By r2 = this.A00;
        if (r2.A0I.equals(r4)) {
            if (userJid == null) {
                userJid = C22941Dw.A00(r4);
            }
            C60072nL r0 = r2.A0Q;
            if (r0 != null && r0.A06.equals(userJid)) {
                r2.A0Q = null;
            }
            Set set = r2.A1E;
            synchronized (set) {
                set.add(userJid);
            }
            C143087By.A06(r2);
        }
    }
}
