package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.AbstractMap;
import java.util.Map;

/* renamed from: X.90F  reason: invalid class name */
public final class AnonymousClass90F extends C195919u9 implements C22579BDz, BE0 {
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
        Object obj2;
        if (map == null || (obj2 = map.get("action")) == null || !"on_back_pressed".equals(obj2)) {
            if (map != null) {
                obj = map.get("account_compliance_status");
                if (map.containsKey("error")) {
                    Object obj3 = map.get("error");
                    C18070vi.A0z(obj3, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.Any>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, kotlin.Any> }");
                    AbstractMap abstractMap = (AbstractMap) obj3;
                    Object obj4 = abstractMap.get(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                    AnonymousClass8BR.A1I(obj4);
                    String str = (String) obj4;
                    Object obj5 = abstractMap.get("code");
                    C18070vi.A0z(obj5, "null cannot be cast to non-null type kotlin.Int");
                    Integer num = (Integer) obj5;
                    BBM bbm = this.A01;
                    if (bbm != null) {
                        bbm.Btu(new C19980A1q(num, str, (String) null), (Map) null);
                    }
                    BBM bbm2 = this.A01;
                    if (bbm2 != null) {
                        bbm2.Btu(C19980A1q.A03, map);
                        return;
                    }
                    return;
                }
            } else {
                obj = null;
            }
            BBM bbm3 = this.A01;
            if (bbm3 != null) {
                bbm3.C7V(C108975cc.A0h("account_compliance_status", obj));
                return;
            }
            return;
        }
        A2V a2v = (A2V) this.A05.get();
        String str2 = this.A02;
        if (str2 == null) {
            C18070vi.A11("observerId");
            throw null;
        } else {
            a2v.A02(str2).A02(new C21106Aea("br_p2m_checkout_add_card:AddCardUserInfoCollectionScreen", (String) null, false));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass90F(C189309is r1, AnonymousClass118 r2, C176198zw r3, AnonymousClass00H r4) {
        super(r3);
        C18070vi.A0s(r2, r4, r3, r1);
        this.A03 = r2;
        this.A05 = r4;
        this.A04 = r1;
    }
}
