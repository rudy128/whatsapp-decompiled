package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CZ2 {
    public boolean A00;
    public final ArrayList A01 = AnonymousClass000.A13();
    public final Map A02 = BE8.A0q();
    public final Map A03 = new HashMap(1);
    public final C28552E7c[] A04;

    public E4f A00(C9Z c9z) {
        E4f e4f = (E4f) this.A02.get(c9z);
        if (e4f != null) {
            return e4f;
        }
        throw AnonymousClass000.A0k("CoreComponent not available. Did you add specify component dependency or the plugin configuration?");
    }

    public void A01(E4f e4f) {
        this.A02.put(e4f.BTh(), e4f);
        this.A01.add(e4f);
    }

    public CZ2(C28552E7c[] e7cArr) {
        this.A04 = e7cArr;
    }
}
