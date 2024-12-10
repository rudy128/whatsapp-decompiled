package com.whatsapp.data;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass206;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C35191ln;
import X.C683232x;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.data.FMessageCommentInfoLazyLoader$getParentMessageCommentInfo$1", f = "FMessageCommentInfoLazyLoader.kt", i = {}, l = {65}, m = "invokeSuspend", n = {}, s = {})
public final class FMessageCommentInfoLazyLoader$getParentMessageCommentInfo$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass206 $parentCommentMessage;
    public int label;
    public final /* synthetic */ C683232x this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FMessageCommentInfoLazyLoader$getParentMessageCommentInfo$1(C683232x r2, AnonymousClass206 r3, C30391dr r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$parentCommentMessage = r3;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new FMessageCommentInfoLazyLoader$getParentMessageCommentInfo$1(this.this$0, this.$parentCommentMessage, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C35191ln r1 = this.this$0.A01;
            AnonymousClass206 r0 = this.$parentCommentMessage;
            this.label = 1;
            if (r1.BKM(r0, this) == r3) {
                return r3;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FMessageCommentInfoLazyLoader$getParentMessageCommentInfo$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
