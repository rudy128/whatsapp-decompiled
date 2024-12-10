package X;

import java.util.ArrayDeque;
import java.util.Deque;

/* renamed from: X.CjO  reason: case insensitive filesystem */
public final class C25636CjO {
    public final Deque A00 = new ArrayDeque(16);

    public static final long A00(C25636CjO cjO) {
        Deque deque = cjO.A00;
        if (deque.isEmpty()) {
            return 0;
        }
        return C17880vN.A05(deque.peek());
    }

    public final void A01() {
        Deque deque = this.A00;
        if (!deque.isEmpty()) {
            Object[] A1b = AnonymousClass3MW.A1b();
            AnonymousClass000.A1L(A1b, deque.size());
            C17890vO.A1M(A1b, A00(this));
            throw C17880vN.A0f(String.format("data item not completed, stackSize: %s scope: %s", A1b));
        }
    }
}
