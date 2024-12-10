package X;

import java.util.Iterator;

/* renamed from: X.DpG  reason: case insensitive filesystem */
public final class C27979DpG extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ CYP this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27979DpG(CYP cyp) {
        super(1);
        this.this$0 = cyp;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C18070vi.A0d(obj, 0);
        CYP cyp = this.this$0;
        synchronized (cyp.A00) {
            Iterator it = cyp.A01.iterator();
            while (it.hasNext()) {
                if (C18070vi.A18((COA) it.next(), obj)) {
                    it.remove();
                }
            }
        }
        return C27621Wu.A00;
    }
}
