package X;

import com.whatsapp.jid.UserJid;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1MA  reason: invalid class name */
public class AnonymousClass1MA extends C24741Lm {
    public final C24851Lx A00;
    public final AnonymousClass00H A01;
    public final Map A02 = Collections.synchronizedMap(new HashMap());
    public final int A03;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r1 = r5.A02;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0B(X.AnonymousClass1E7 r6) {
        /*
            r5 = this;
            java.lang.Class<X.1BI> r0 = X.AnonymousClass1BI.class
            com.whatsapp.jid.Jid r4 = r6.A06(r0)
            X.1BI r4 = (X.AnonymousClass1BI) r4
            if (r4 == 0) goto L_0x0017
            java.util.Map r1 = r5.A02
            java.lang.Object r0 = r1.get(r4)
            if (r0 == 0) goto L_0x0017
            if (r0 == r6) goto L_0x0017
            r1.remove(r4)
        L_0x0017:
            X.1Lx r3 = r5.A00
            X.0ve r2 = r3.A01
            X.0vf r1 = X.C18040vf.A01
            r0 = 8573(0x217d, float:1.2013E-41)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x0036
            boolean r0 = X.C22971Dz.A0d(r4)
            if (r0 == 0) goto L_0x0036
            java.util.Map r1 = r5.A02
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            com.whatsapp.jid.UserJid r0 = r3.A01(r4)
            r1.remove(r0)
        L_0x0036:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1MA.A0B(X.1E7):void");
    }

    public void A0C(AnonymousClass1BI r6) {
        Map map = this.A02;
        map.remove(r6);
        C24851Lx r3 = this.A00;
        if (C18020vd.A05(C18040vf.A01, r3.A01, 8573) && C22971Dz.A0d(r6)) {
            map.remove(r3.A01((UserJid) r6));
        }
    }

    public String BZc() {
        StringBuilder sb = new StringBuilder();
        sb.append("ContactCache/");
        sb.append(this.A02.size());
        return sb.toString();
    }

    public AnonymousClass1MA(C24851Lx r3, C18030ve r4, C24571Kv r5, AnonymousClass00H r6) {
        super(r5);
        this.A01 = r6;
        int A002 = C18020vd.A00(C18040vf.A02, r4, 7864);
        this.A03 = A002;
        this.A00 = r3;
        if (A002 >= 0) {
            A09();
        }
    }

    public AnonymousClass1E7 A0A(AnonymousClass1BI r2) {
        Object obj;
        if (C22971Dz.A0Z(r2)) {
            obj = this.A01.get();
        } else {
            obj = this.A02.get(r2);
        }
        return (AnonymousClass1E7) obj;
    }

    public void C9L(C122516Qr r3, boolean z) {
        if (r3.ordinal() >= this.A03) {
            this.A02.clear();
        }
    }
}
