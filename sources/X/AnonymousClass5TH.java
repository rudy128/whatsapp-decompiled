package X;

import java.util.Iterator;

/* renamed from: X.5TH  reason: invalid class name */
public final class AnonymousClass5TH extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C73693Wy this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5TH(C73693Wy r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        long A05 = C17880vN.A05(obj);
        C73693Wy r0 = this.this$0;
        AnonymousClass1DT r5 = r0.A00;
        Iterator it = r0.A02.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            AnonymousClass5Y4 r1 = (AnonymousClass5Y4) it.next();
            if ((r1 instanceof C96764oN) && ((C96764oN) r1).A00.A03 == A05) {
                break;
            }
            i++;
        }
        AnonymousClass3MX.A1K(r5, i);
        return C27621Wu.A00;
    }
}
