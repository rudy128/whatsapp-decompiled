package X;

import java.util.List;

/* renamed from: X.Dfl  reason: case insensitive filesystem */
public final class C27456Dfl extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C26595D5j this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27456Dfl(C26595D5j d5j) {
        super(0);
        this.this$0 = d5j;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Object A0p;
        float f;
        List list = this.this$0.A01;
        if (list.isEmpty()) {
            A0p = null;
        } else {
            A0p = C108955ca.A0p(list);
            float BUy = ((C25182CaY) A0p).A02.BUy();
            int A01 = AnonymousClass3MX.A01(list);
            int i = 1;
            if (1 <= A01) {
                while (true) {
                    Object obj = list.get(i);
                    float BUy2 = ((C25182CaY) obj).A02.BUy();
                    if (Float.compare(BUy, BUy2) < 0) {
                        A0p = obj;
                        BUy = BUy2;
                    }
                    if (i == A01) {
                        break;
                    }
                    i++;
                }
            }
        }
        C25182CaY caY = (C25182CaY) A0p;
        if (caY != null) {
            f = caY.A02.BUy();
        } else {
            f = 0.0f;
        }
        return Float.valueOf(f);
    }
}
