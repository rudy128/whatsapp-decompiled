package X;

import java.util.function.BiConsumer;

public final class DWC implements BiConsumer {
    public final /* synthetic */ C25817CmU A00;

    public DWC(C25817CmU cmU) {
        this.A00 = cmU;
    }

    public /* bridge */ /* synthetic */ void accept(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        C18070vi.A0h(str, str2);
        if (str.hashCode() == 3711 && str.equals("ts")) {
            this.A00.A0C = str2;
        }
    }
}
