package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.B0o  reason: case insensitive filesystem */
public final class C22260B0o extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ List $cartItems;
    public final /* synthetic */ AnonymousClass9XU this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22260B0o(AnonymousClass9XU r2, List list) {
        super(1);
        this.$cartItems = list;
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass84T r9 = (AnonymousClass84T) obj;
        C18070vi.A0d(r9, 0);
        List list = this.$cartItems;
        AnonymousClass9XU r4 = this.this$0;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C194209rM A0J = AnonymousClass8BR.A0J(it);
            r9.put(AnonymousClass84U.A00(new C22277B1f(A0J.A01, r4, list, A0J.A00)));
        }
        return C27621Wu.A00;
    }
}
