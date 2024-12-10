package X;

import java.util.Iterator;

/* renamed from: X.5T2  reason: invalid class name */
public final class AnonymousClass5T2 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AnonymousClass3X7 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5T2(AnonymousClass3X7 r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C18070vi.A0d(obj, 0);
        AnonymousClass3X7 r0 = this.this$0;
        AnonymousClass1DT r4 = r0.A00;
        Iterator it = r0.A09.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            AnonymousClass5Y3 r1 = (AnonymousClass5Y3) it.next();
            if ((r1 instanceof C96674oE) && C18070vi.A18(((C96674oE) r1).A00, obj)) {
                break;
            }
            i++;
        }
        AnonymousClass3MX.A1K(r4, i);
        return C27621Wu.A00;
    }
}
