package X;

import com.whatsapp.util.LRUCache;

/* renamed from: X.9AX  reason: invalid class name */
public final class AnonymousClass9AX extends C24741Lm {
    public final LRUCache A00 = new LRUCache(200);
    public final LRUCache A01 = new LRUCache(10);
    public final AnonymousClass190 A02;

    public final void A0A() {
        synchronized (this) {
            LRUCache lRUCache = this.A01;
            LRUCache lRUCache2 = this.A00;
            lRUCache.clear();
            lRUCache2.clear();
        }
    }

    public String BZc() {
        String A0V;
        synchronized (this) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("BusinessSearchQueryCache=");
            A10.append(Integer.valueOf(this.A01.size()));
            A10.append(',');
            A0V = C17890vO.A0V(Integer.valueOf(this.A00.size()), A10);
        }
        return A0V;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9AX(AnonymousClass190 r3, C24571Kv r4) {
        super(r4);
        C18070vi.A0j(r4, r3);
        this.A02 = r3;
        A09();
    }

    public void C9L(C122516Qr r1, boolean z) {
        A0A();
    }
}
