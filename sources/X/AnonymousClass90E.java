package X;

import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.90E  reason: invalid class name */
public final class AnonymousClass90E extends C195919u9 implements C22579BDz, BE0 {
    public BBM A00;
    public String A01;
    public final AnonymousClass1KB A02;
    public final AnonymousClass118 A03;
    public final AnonymousClass1QS A04;
    public final AnonymousClass10I A05;

    public void BCf(String str) {
        C18070vi.A0d(str, 0);
        this.A01 = str;
    }

    public void BLG(Map map) {
        if (map == null) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append(new C28237Dtx(AnonymousClass3MW.A15(getClass()), 0));
            C17890vO.A19(A10, "/finish: result is null");
            this.A00 = null;
            return;
        }
        BBM bbm = this.A00;
        this.A00 = null;
        if (bbm != null) {
            bbm.C7V(map);
        } else {
            Log.e("FcsNativeFlowNpciCommonLibraryResource/finish: callback is null");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass90E(AnonymousClass1KB r1, AnonymousClass118 r2, AnonymousClass1QS r3, C176198zw r4, AnonymousClass10I r5) {
        super(r4);
        C18070vi.A0w(r1, r2, r5, r3, r4);
        this.A02 = r1;
        this.A03 = r2;
        this.A05 = r5;
        this.A04 = r3;
    }
}
