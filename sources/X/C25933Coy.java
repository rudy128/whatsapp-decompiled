package X;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.Coy  reason: case insensitive filesystem */
public final class C25933Coy {
    public final Map A00;

    public C25933Coy(String str, String str2) {
        C18070vi.A0d(str2, 3);
        HashMap A11 = C17880vN.A11();
        this.A00 = A11;
        A11.put("composer_session_id", str);
        A11.put("player_session_id", str2);
    }

    public static final void A00(C25933Coy coy, Map map) {
        HashMap A11 = C17880vN.A11();
        A11.putAll(coy.A00);
        if (map != null) {
            A11.putAll(map);
        }
        HashMap A112 = C17880vN.A11();
        A01("debug_message", A11, A112);
        A01("media_composition_hash", A11, A112);
        A01("reason", A11, A112);
        A01("retry_attempt_number", A11, A112);
        A01("decoder_debug_info", A11, A112);
        A11.put("debug_info", A112.toString());
    }

    public static void A01(Object obj, AbstractMap abstractMap, AbstractMap abstractMap2) {
        if (abstractMap.containsKey(obj)) {
            abstractMap2.put(obj, abstractMap.get(obj));
        }
    }
}
