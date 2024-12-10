package X;

import java.util.Map;

/* renamed from: X.90G  reason: invalid class name */
public final class AnonymousClass90G extends C195919u9 implements C22579BDz, BE0 {
    public C192289o7 A00;
    public BBM A01;
    public String A02;
    public final AnonymousClass118 A03;
    public final C189309is A04;
    public final AnonymousClass00H A05;

    public void BCf(String str) {
        C18070vi.A0d(str, 0);
        this.A02 = str;
        this.A00 = this.A04.A00(str);
    }

    public void BLG(Map map) {
        Object obj;
        Object obj2 = null;
        if (map == null || (obj = map.get("action")) == null || !"on_back_pressed".equals(obj)) {
            if (map != null) {
                obj2 = map.get("kyc_status");
            }
            BBM bbm = this.A01;
            if (bbm != null) {
                bbm.C7V(C108975cc.A0h("kyc_status", obj2));
                return;
            }
            return;
        }
        A2V a2v = (A2V) this.A05.get();
        String str = this.A02;
        if (str == null) {
            C18070vi.A11("observerId");
            throw null;
        } else {
            a2v.A02(str).A02(new C21106Aea("br_p2m_checkout_add_card:AddCardUserInfoCollectionScreen", (String) null, false));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass90G(C189309is r1, AnonymousClass118 r2, C176198zw r3, AnonymousClass00H r4) {
        super(r3);
        C18070vi.A0s(r2, r4, r3, r1);
        this.A03 = r2;
        this.A05 = r4;
        this.A04 = r1;
    }
}
