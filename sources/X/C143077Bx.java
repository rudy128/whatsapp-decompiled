package X;

import com.whatsapp.service.RestoreChatConnectionWorker;
import com.whatsapp.suggestions.NewChatSuggestedContactsPrefetchViewModel;
import com.whatsapp.suggestions.NewChatSuggestedContactsPrefetchViewModel$xmppStateObserver$1$onHandlerConnected$1;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.7Bx  reason: invalid class name and case insensitive filesystem */
public class C143077Bx implements C26181Rd {
    public final int A00;
    public final Object A01;

    public C143077Bx(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public /* synthetic */ void BvR() {
        switch (this.A00) {
            case 0:
                return;
            case 1:
                ((RestoreChatConnectionWorker) this.A01).A01.A05(new C162178Jk());
                return;
            default:
                NewChatSuggestedContactsPrefetchViewModel newChatSuggestedContactsPrefetchViewModel = (NewChatSuggestedContactsPrefetchViewModel) this.A01;
                C108965cb.A1L(newChatSuggestedContactsPrefetchViewModel.A04, this);
                AnonymousClass3MW.A1X((C18560wh) C18070vi.A0E(newChatSuggestedContactsPrefetchViewModel.A02), new NewChatSuggestedContactsPrefetchViewModel$xmppStateObserver$1$onHandlerConnected$1(newChatSuggestedContactsPrefetchViewModel, (C30391dr) null), C41561wd.A00(newChatSuggestedContactsPrefetchViewModel));
                return;
        }
    }

    public void BvV() {
        if (this.A00 == 0) {
            ((CountDownLatch) this.A01).countDown();
        }
    }

    public /* synthetic */ void BvS() {
    }

    public /* synthetic */ void BvT() {
    }

    public /* synthetic */ void BvU() {
    }
}
