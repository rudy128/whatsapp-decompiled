package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.B3e  reason: case insensitive filesystem */
public final class C22327B3e extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ C22526BBj $callback;
    public final /* synthetic */ String $currentScreen;
    public final /* synthetic */ Map $input;
    public final /* synthetic */ AnonymousClass9C1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22327B3e(C22526BBj bBj, AnonymousClass9C1 r3, String str, Map map) {
        super(2);
        this.$input = map;
        this.$callback = bBj;
        this.this$0 = r3;
        this.$currentScreen = str;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        String A02;
        Map map;
        Object obj3;
        String str = (String) obj2;
        if (AnonymousClass000.A1Y(obj)) {
            Object obj4 = this.$input.get("flow_token");
            AnonymousClass8BR.A1I(obj4);
            Object obj5 = this.$input.get("action_payload");
            C18070vi.A0z(obj5, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
            Object obj6 = ((Map) obj5).get("business_payload");
            Map map2 = null;
            if (obj6 instanceof Map) {
                map = (Map) obj6;
            } else {
                map = null;
            }
            if (map != null) {
                obj3 = map.get("data");
            } else {
                obj3 = null;
            }
            if (obj3 instanceof Map) {
                map2 = (Map) obj3;
            }
            LinkedHashMap A0C = AnonymousClass1D7.A0C(AnonymousClass1D6.A01("flow_token", obj4));
            if (map2 != null) {
                A0C.putAll(map2);
            }
            AnonymousClass1D6[] r2 = new AnonymousClass1D6[3];
            AnonymousClass1D6.A03("data", C108975cc.A0h("extension_message_response", C108975cc.A0h("params", A0C)), r2, 0);
            AnonymousClass1D6.A03("data_channel_navigation", false, r2, 1);
            C72463Mc.A1I("screen", "SUCCESS", r2);
            LinkedHashMap A0B = AnonymousClass1D7.A0B(r2);
            C22526BBj bBj = this.$callback;
            if (bBj != null) {
                bBj.BAi(A0B);
            }
        } else {
            boolean A18 = C18070vi.A18(str, "extensions-integrity-check-failed");
            AnonymousClass9C1 r0 = this.this$0;
            if (A18) {
                A02 = r0.A00.A01(2131890453);
            } else {
                A02 = ((C20052A4y) r0.A01.get()).A02();
            }
            C18070vi.A0b(A02);
            C22526BBj bBj2 = this.$callback;
            if (bBj2 != null) {
                if (str == null) {
                    str = "";
                }
                this.this$0.A01.get();
                bBj2.BAh(str, A02, C20052A4y.A00(A02, this.$currentScreen));
            }
        }
        return C27621Wu.A00;
    }
}
