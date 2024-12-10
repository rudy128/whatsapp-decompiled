package X;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.net.ssl.SSLSession;

/* renamed from: X.18d  reason: invalid class name and case insensitive filesystem */
public class C219818d extends LinkedHashMap<C58602kx, SSLSession> {
    public final /* synthetic */ C219618b this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C219818d(C219618b r4) {
        super(64, 0.75f, true);
        this.this$0 = r4;
    }

    public boolean removeEldestEntry(Map.Entry entry) {
        if (size() > this.this$0.A02) {
            return true;
        }
        return false;
    }
}
