package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.3HK  reason: invalid class name */
public final class AnonymousClass3HK extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AnonymousClass28H this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3HK(AnonymousClass28H r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.this$0.A05;
        int i = 0;
        if (!(copyOnWriteArrayList instanceof Collection) || !copyOnWriteArrayList.isEmpty()) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                if ((it.next() instanceof C41551wc) && (i = i + 1) < 0) {
                    AnonymousClass1ZU.A0A();
                    throw null;
                }
            }
        }
        return Integer.valueOf(i);
    }
}
