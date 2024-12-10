package X;

import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.90C  reason: invalid class name */
public final class AnonymousClass90C extends C195919u9 implements C22579BDz, BE0 {
    public BBM A00;
    public String A01;
    public final AnonymousClass00H A02;

    public void BCf(String str) {
        C18070vi.A0d(str, 0);
        this.A01 = str;
    }

    public void BLG(Map map) {
        Object obj;
        Object obj2;
        if (map != null) {
            obj = map.get("account_compliance_status");
        } else {
            obj = null;
        }
        if (map != null) {
            obj2 = map.get("last_screen");
        } else {
            obj2 = null;
        }
        if (obj != null) {
            BBM bbm = this.A00;
            if (bbm == null) {
                C18070vi.A11("resourceResultCallback");
                throw null;
            }
            AnonymousClass1D6[] r1 = new AnonymousClass1D6[2];
            AnonymousClass1D6.A03("account_compliance_status", obj, r1, 0);
            AnonymousClass1D6.A03("last_screen", obj2, r1, 1);
            bbm.C7V(AnonymousClass1D7.A0B(r1));
            return;
        }
        Log.e("NativeP2mLiteDoComplianceResource/finish: resultComplianceStatus can't be null");
        BBM bbm2 = this.A00;
        if (bbm2 == null) {
            C18070vi.A11("resourceResultCallback");
            throw null;
        } else {
            bbm2.Btu(C19980A1q.A03, (Map) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass90C(C176198zw r1, AnonymousClass00H r2) {
        super(r1);
        C18070vi.A0j(r2, r1);
        this.A02 = r2;
    }
}
