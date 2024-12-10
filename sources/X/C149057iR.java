package X;

import com.whatsapp.actionfeedback.priorityqueue.ActionFeedbackPriorityQueue;
import com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModelV2;

/* renamed from: X.7iR  reason: invalid class name and case insensitive filesystem */
public final class C149057iR extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ InCallBannerViewModelV2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C149057iR(InCallBannerViewModelV2 inCallBannerViewModelV2) {
        super(0);
        this.this$0 = inCallBannerViewModelV2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Object[] objArr = new E6S[3];
        objArr[0] = new Object();
        InCallBannerViewModelV2 inCallBannerViewModelV2 = this.this$0;
        objArr[1] = new AnonymousClass7C6(inCallBannerViewModelV2.A09, new C148027gm(inCallBannerViewModelV2, 0), inCallBannerViewModelV2.A0K);
        return new ActionFeedbackPriorityQueue(C18070vi.A0O(new AnonymousClass7C5(), objArr, 2));
    }
}
