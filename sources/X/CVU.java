package X;

import java.util.Map;

public final class CVU {
    public final Map A00;

    public final C25224CbL A00() {
        Map map;
        Object obj = this.A00.get("dynamicMemoryHandlingInfo");
        if (!(obj instanceof Map) || (map = (Map) obj) == null) {
            return null;
        }
        return C25353CeC.A00(map);
    }

    public CVU(Map map) {
        this.A00 = map;
    }
}
