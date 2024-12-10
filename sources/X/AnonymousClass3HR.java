package X;

import java.util.HashMap;
import java.util.Set;

/* renamed from: X.3HR  reason: invalid class name */
public final class AnonymousClass3HR extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AnonymousClass00H $handlers;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3HR(AnonymousClass00H r2) {
        super(0);
        this.$handlers = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Set<C60192nY> set = (Set) C18070vi.A0E(this.$handlers);
        C18070vi.A0d(set, 0);
        HashMap A11 = C17880vN.A11();
        for (C60192nY r1 : set) {
            String A0E = r1.A0E();
            C18070vi.A0X(A0E);
            A11.put(A0E, r1);
        }
        return A11;
    }
}
