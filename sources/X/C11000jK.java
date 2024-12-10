package X;

import java.util.List;

/* renamed from: X.0jK  reason: invalid class name and case insensitive filesystem */
public final class C11000jK extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C98494rF $awaiter;
    public final /* synthetic */ C05650Vd this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11000jK(C05650Vd r2, C98494rF r3) {
        super(1);
        this.this$0 = r2;
        this.$awaiter = r3;
    }

    public final void A00() {
        C05650Vd r1 = this.this$0;
        Object A00 = r1.A03;
        C98494rF r0 = this.$awaiter;
        synchronized (A00) {
            List A01 = r1.A01;
            Object obj = r0.element;
            if (obj == null) {
                C18070vi.A11("awaiter");
                throw null;
            }
            A01.remove((C03440Ie) obj);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A00();
        return C27621Wu.A00;
    }
}
