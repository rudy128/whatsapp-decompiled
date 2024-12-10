package X;

import java.util.function.BiConsumer;

public final class DWD implements BiConsumer {
    public final /* synthetic */ C25817CmU A00;

    public DWD(C25817CmU cmU) {
        this.A00 = cmU;
    }

    public /* bridge */ /* synthetic */ void accept(Object obj, Object obj2) {
        String str = (String) obj;
        Float f = (Float) obj2;
        C18070vi.A0h(str, f);
        int hashCode = str.hashCode();
        if (hashCode != -1869180586) {
            if (hashCode == 1140019018 && str.equals("video_eis_latency")) {
                this.A00.A05 = f;
            }
        } else if (str.equals("video_encoding_latency")) {
            this.A00.A06 = f;
        }
    }
}
