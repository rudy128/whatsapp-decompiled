package X;

import com.whatsapp.util.LRUCache;
import java.util.Map;

/* renamed from: X.2P2  reason: invalid class name */
public final class AnonymousClass2P2 extends C24741Lm {
    public String A00;
    public String A01;
    public final C18030ve A02;
    public final C52272ae A03;
    public final Map A04 = new LRUCache(20);
    public final AnonymousClass10I A05;

    public String BZc() {
        String A0t;
        synchronized (this) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("funnelIdCache: ");
            A0t = C17880vN.A0t(A10, this.A04.size());
        }
        return A0t;
    }

    public void C9L(C122516Qr r2, boolean z) {
        synchronized (this) {
            this.A04.clear();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2P2(C18030ve r3, C52272ae r4, C24571Kv r5, AnonymousClass10I r6) {
        super(r5);
        C18070vi.A0s(r4, r6, r5, r3);
        this.A03 = r4;
        this.A05 = r6;
        this.A02 = r3;
    }
}
