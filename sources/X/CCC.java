package X;

import java.util.Map;

public abstract class CCC {
    public static Object A00(C25681CkC ckC, Map map) {
        if (!map.containsKey("initial_lispy")) {
            return map.get("initial");
        }
        try {
            return CCJ.A00(C199029zJ.A01, new C26972DNu((E9O) null, C17880vN.A0s("initial_lispy", map), ckC.A06, -1), ckC);
        } catch (C27230Da9 e) {
            C25913CoX.A00((DOZ) null, "StateModule", "Exception gettin initial_lispy value", e);
            return null;
        }
    }
}
