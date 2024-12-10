package X;

import java.util.Iterator;

/* renamed from: X.DpF  reason: case insensitive filesystem */
public final class C27978DpF extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C26012CqT this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27978DpF(C26012CqT cqT) {
        super(1);
        this.this$0 = cqT;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C18070vi.A0d(obj, 0);
        C26012CqT cqT = this.this$0;
        synchronized (cqT.A07) {
            Iterator it = cqT.A0A.iterator();
            while (it.hasNext()) {
                if (C18070vi.A18((CQJ) it.next(), obj)) {
                    it.remove();
                }
            }
        }
        return C27621Wu.A00;
    }
}
