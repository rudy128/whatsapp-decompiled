package X;

import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.90D  reason: invalid class name */
public final class AnonymousClass90D extends C195919u9 implements C22579BDz, BE0 {
    public BBM A00;
    public String A01;
    public final AnonymousClass00H A02;

    public void BCf(String str) {
        C18070vi.A0d(str, 0);
        this.A01 = str;
    }

    public void BLG(Map map) {
        Object obj;
        String str;
        if (map != null) {
            obj = map.get("result_code");
        } else {
            obj = null;
        }
        if (obj != null) {
            BBM bbm = this.A00;
            if (bbm == null) {
                C18070vi.A11("resourceResultCallback");
                throw null;
            }
            if (obj.equals(-1)) {
                str = "SUCCESS";
            } else {
                str = "DISMISSED";
            }
            bbm.C7V(C108975cc.A0h("result", str));
            return;
        }
        Log.e("NativeP2mLiteHppCheckoutResource/finish: resultCode can't be null");
        BBM bbm2 = this.A00;
        if (bbm2 == null) {
            C18070vi.A11("resourceResultCallback");
            throw null;
        } else {
            bbm2.Btu(C19980A1q.A03, (Map) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass90D(C176198zw r1, AnonymousClass00H r2) {
        super(r1);
        C18070vi.A0j(r2, r1);
        this.A02 = r2;
    }
}
