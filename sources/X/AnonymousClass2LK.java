package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.2LK  reason: invalid class name */
public final class AnonymousClass2LK extends AnonymousClass11D {
    public final AnonymousClass00H A00 = C217517g.A00(32801);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2LK(AnonymousClass00H r3) {
        super(r3, C18150vq.A00(), false);
        C18070vi.A0d(r3, 1);
    }

    /* renamed from: A00 */
    public void registerObserver(C134226qF r6) {
        C18070vi.A0d(r6, 0);
        super.registerObserver(r6);
        Iterator A0i = C17890vO.A0i(new HashMap(((AnonymousClass167) this.A00.get()).A01));
        while (A0i.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A0i);
            String A0x = C17880vN.A0x(A16);
            int A0M = AnonymousClass000.A0M(A16.getValue());
            C18070vi.A0d(A0x, 0);
            notifyAllObservers(new C97024on(A0x, A0M, 0));
        }
    }
}
