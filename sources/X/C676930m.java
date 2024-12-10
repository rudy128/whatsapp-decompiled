package X;

import com.whatsapp.data.ConversationDeleteWorker;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.30m  reason: invalid class name and case insensitive filesystem */
public class C676930m implements AnonymousClass3MJ {
    public final /* synthetic */ ConversationDeleteWorker A00;
    public final /* synthetic */ C56192h3 A01;

    public C676930m(ConversationDeleteWorker conversationDeleteWorker, C56192h3 r2) {
        this.A00 = conversationDeleteWorker;
        this.A01 = r2;
    }

    public void Buc() {
        ConversationDeleteWorker.A0C.addAndGet(-1);
        ConversationDeleteWorker.A00(this.A00);
    }

    public void C21(int i) {
        this.A00.A0C(this.A01.A07, i);
    }

    public void C6A() {
        int max;
        ConversationDeleteWorker.A0C.addAndGet(1);
        AnonymousClass1BI r4 = this.A01.A07;
        ConversationDeleteWorker conversationDeleteWorker = this.A00;
        ConcurrentHashMap concurrentHashMap = ConversationDeleteWorker.A0B;
        concurrentHashMap.putIfAbsent(r4, new C53292cI());
        C53292cI r3 = (C53292cI) concurrentHashMap.get(r4);
        int A02 = conversationDeleteWorker.A02.A02(r4);
        synchronized (r3) {
            int i = r3.A01;
            max = Math.max(0, A02 - i);
            r3.A01 = i + max;
        }
        ConversationDeleteWorker.A0D.addAndGet(max);
    }

    public boolean CMS() {
        return AnonymousClass000.A1S(this.A00.A03, -256);
    }
}
