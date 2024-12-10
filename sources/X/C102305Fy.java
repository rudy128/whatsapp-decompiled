package X;

import com.whatsapp.conversation.CommentsBottomSheet;

/* renamed from: X.5Fy  reason: invalid class name and case insensitive filesystem */
public final class C102305Fy extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ CommentsBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102305Fy(CommentsBottomSheet commentsBottomSheet) {
        super(0);
        this.this$0 = commentsBottomSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        CommentsBottomSheet commentsBottomSheet = this.this$0;
        AnonymousClass4K6 r4 = commentsBottomSheet.A01;
        if (r4 != null) {
            Object value = commentsBottomSheet.A0U.getValue();
            Object A14 = AnonymousClass3MX.A14(this.this$0.A0Y);
            C18070vi.A0d(value, 1);
            return new C91784gF(value, r4, A14, 0);
        }
        C18070vi.A11("commentsBottomSheetViewModelFactory");
        throw null;
    }
}
