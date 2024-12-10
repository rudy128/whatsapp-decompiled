package com.whatsapp.calling.incallnotifbanner.viewmodel.mergers;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass6p5;
import X.AnonymousClass7C6;
import X.AnonymousClass7C7;
import X.C122636Rd;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.incallnotifbanner.viewmodel.mergers.ParticipantInvitationBannerMerger$merge$2", f = "ParticipantInvitationBannerMerger.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ParticipantInvitationBannerMerger$merge$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass7C7 $existingActionFeedback;
    public final /* synthetic */ AnonymousClass7C7 $newActionFeedback;
    public final /* synthetic */ List $userJids;
    public int label;
    public final /* synthetic */ AnonymousClass7C6 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ParticipantInvitationBannerMerger$merge$2(AnonymousClass7C7 r2, AnonymousClass7C7 r3, AnonymousClass7C6 r4, List list, C30391dr r6) {
        super(2, r6);
        this.this$0 = r4;
        this.$existingActionFeedback = r2;
        this.$userJids = list;
        this.$newActionFeedback = r3;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        AnonymousClass7C6 r3 = this.this$0;
        return new ParticipantInvitationBannerMerger$merge$2(this.$existingActionFeedback, this.$newActionFeedback, r3, this.$userJids, r8);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            AnonymousClass6p5 r5 = (AnonymousClass6p5) this.this$0.A00.get();
            C122636Rd r4 = this.$existingActionFeedback.A04;
            C122636Rd r3 = C122636Rd.A0E;
            List list = this.$userJids;
            int i = this.$newActionFeedback.A00;
            AnonymousClass1OS r0 = this.this$0.A01;
            if (r4 == r3) {
                return r5.A00(list, r0, i);
            }
            return r5.A01(list, r0, i);
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ParticipantInvitationBannerMerger$merge$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
