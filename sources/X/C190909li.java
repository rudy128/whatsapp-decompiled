package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.LRUCache;
import java.util.Map;

/* renamed from: X.9li  reason: invalid class name and case insensitive filesystem */
public final class C190909li {
    public final C18030ve A00;
    public final AnonymousClass00H A01;
    public final Map A02 = C17880vN.A11();
    public final Map A03 = new LRUCache(500);

    public final void A00(UserJid userJid) {
        synchronized (this) {
            UserJid A012 = A76.A01(C20114A7x.A08, this.A00, userJid, this.A01);
            Map map = this.A02;
            map.get(A012);
            map.remove(A012);
        }
    }

    public C190909li(C18030ve r3, AnonymousClass00H r4) {
        C18070vi.A0j(r3, r4);
        this.A00 = r3;
        this.A01 = r4;
    }
}
