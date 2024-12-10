package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;

public final class DlO extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AnonymousClass1GV $listener;
    public final /* synthetic */ C24746CIi this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DlO(AnonymousClass1GV r2, C24746CIi cIi) {
        super(0);
        this.this$0 = cIi;
        this.$listener = r2;
    }

    /* JADX INFO: finally extract failed */
    public /* bridge */ /* synthetic */ Object invoke() {
        EAn eAn = this.this$0.A00;
        AnonymousClass1GV r5 = this.$listener;
        D7F d7f = (D7F) eAn;
        C18070vi.A0d(r5, 0);
        ReentrantLock reentrantLock = D7F.A06;
        reentrantLock.lock();
        try {
            CopyOnWriteArrayList copyOnWriteArrayList = d7f.A04;
            Iterator it = copyOnWriteArrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                CWP cwp = (CWP) it.next();
                if (C18070vi.A18(cwp.A01, r5)) {
                    copyOnWriteArrayList.remove(cwp);
                    break;
                }
            }
            reentrantLock.unlock();
            return C27621Wu.A00;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
