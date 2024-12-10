package X;

import java.util.LinkedHashMap;

/* renamed from: X.5Gz  reason: invalid class name and case insensitive filesystem */
public final class C102575Gz extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C95134lk this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102575Gz(C95134lk r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        LinkedHashMap A13 = C17880vN.A13();
        int i = 0;
        for (Object next : this.this$0.A01()) {
            int i2 = i + 1;
            if (i < 0) {
                AnonymousClass1ZU.A0B();
                throw null;
            }
            C17880vN.A1P(Integer.valueOf(AnonymousClass000.A0M(next)), A13, i);
            i = i2;
        }
        return A13;
    }
}
