package X;

import androidx.window.extensions.embedding.SplitInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.DqB  reason: case insensitive filesystem */
public final class C28036DqB extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ E0R $embeddingCallback;
    public final /* synthetic */ D7H this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28036DqB(D7H d7h, E0R e0r) {
        super(1);
        this.$embeddingCallback = e0r;
        this.this$0 = d7h;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list = (List) obj;
        C18070vi.A0d(list, 0);
        ArrayList A13 = AnonymousClass000.A13();
        for (Object next : list) {
            if (next instanceof SplitInfo) {
                A13.add(next);
            }
        }
        E0R e0r = this.$embeddingCallback;
        List A09 = this.this$0.A00.A09(A13);
        D7G d7g = (D7G) e0r;
        d7g.A00 = A09;
        Iterator it = d7g.A01.A04.iterator();
        while (it.hasNext()) {
            ((CWP) it.next()).A00(A09);
        }
        return C27621Wu.A00;
    }
}
