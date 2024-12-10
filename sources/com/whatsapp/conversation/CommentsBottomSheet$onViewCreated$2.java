package com.whatsapp.conversation;

import X.AnonymousClass000;
import X.AnonymousClass1KB;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.AnonymousClass4UD;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.CommentsBottomSheet$onViewCreated$2", f = "CommentsBottomSheet.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CommentsBottomSheet$onViewCreated$2 extends C30431dv implements AnonymousClass1OS {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ CommentsBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommentsBottomSheet$onViewCreated$2(CommentsBottomSheet commentsBottomSheet, C30391dr r3) {
        super(2, r3);
        this.this$0 = commentsBottomSheet;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        CommentsBottomSheet$onViewCreated$2 commentsBottomSheet$onViewCreated$2 = new CommentsBottomSheet$onViewCreated$2(this.this$0, r4);
        commentsBottomSheet$onViewCreated$2.L$0 = obj;
        return commentsBottomSheet$onViewCreated$2;
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            AnonymousClass4UD r4 = (AnonymousClass4UD) this.L$0;
            if (r4.A02) {
                this.this$0.A28();
            } else {
                CommentsBottomSheet commentsBottomSheet = this.this$0;
                Integer num = r4.A01;
                if (num != null) {
                    int intValue = num.intValue();
                    AnonymousClass1KB r0 = commentsBottomSheet.A02;
                    if (r0 != null) {
                        r0.A08(intValue, 1);
                    }
                    AnonymousClass3MW.A1C();
                    throw null;
                }
                Integer num2 = r4.A00;
                if (num2 != null) {
                    int intValue2 = num2.intValue();
                    AnonymousClass1KB r02 = commentsBottomSheet.A02;
                    if (r02 != null) {
                        r02.A08(intValue2, 1);
                    }
                    AnonymousClass3MW.A1C();
                    throw null;
                }
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CommentsBottomSheet$onViewCreated$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
