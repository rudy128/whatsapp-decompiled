package com.whatsapp.conversation.banner.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C108915cV;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.banner.viewmodel.ConversationBannersViewModel$updateBannerStateWhenBannerIsHidden$1$1", f = "ConversationBannersViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ConversationBannersViewModel$updateBannerStateWhenBannerIsHidden$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C108915cV $nextBanner;
    public final /* synthetic */ Object $nextData;
    public int label;
    public final /* synthetic */ ConversationBannersViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationBannersViewModel$updateBannerStateWhenBannerIsHidden$1$1(C108915cV r2, ConversationBannersViewModel conversationBannersViewModel, Object obj, C30391dr r5) {
        super(2, r5);
        this.this$0 = conversationBannersViewModel;
        this.$nextBanner = r2;
        this.$nextData = obj;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new ConversationBannersViewModel$updateBannerStateWhenBannerIsHidden$1$1(this.$nextBanner, this.this$0, this.$nextData, r6);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            ConversationBannersViewModel conversationBannersViewModel = this.this$0;
            C108915cV r1 = this.$nextBanner;
            C18070vi.A0z(r1, "null cannot be cast to non-null type com.whatsapp.conversation.banner.AsyncBanner<kotlin.Any>");
            ConversationBannersViewModel.A00(r1, conversationBannersViewModel, this.$nextData);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ConversationBannersViewModel$updateBannerStateWhenBannerIsHidden$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
