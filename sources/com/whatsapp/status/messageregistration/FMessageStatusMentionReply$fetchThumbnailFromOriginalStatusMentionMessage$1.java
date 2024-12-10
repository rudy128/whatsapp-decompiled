package com.whatsapp.status.messageregistration;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass206;
import X.C108945cZ;
import X.C120646Es;
import X.C18600wl;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import java.lang.ref.WeakReference;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.status.messageregistration.FMessageStatusMentionReply$fetchThumbnailFromOriginalStatusMentionMessage$1", f = "FMessageStatusMentionReply.kt", i = {}, l = {103}, m = "invokeSuspend", n = {}, s = {})
public final class FMessageStatusMentionReply$fetchThumbnailFromOriginalStatusMentionMessage$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass206 $quotedMessage;
    public final /* synthetic */ WeakReference $quotedMessageFrameWeak;
    public final /* synthetic */ WeakReference $replyRendererWeak;
    public Object L$0;
    public int label;
    public final /* synthetic */ C120646Es this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FMessageStatusMentionReply$fetchThumbnailFromOriginalStatusMentionMessage$1(AnonymousClass206 r2, C120646Es r3, WeakReference weakReference, WeakReference weakReference2, C30391dr r6) {
        super(2, r6);
        this.this$0 = r3;
        this.$quotedMessage = r2;
        this.$quotedMessageFrameWeak = weakReference;
        this.$replyRendererWeak = weakReference2;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        return new FMessageStatusMentionReply$fetchThumbnailFromOriginalStatusMentionMessage$1(this.$quotedMessage, this.this$0, this.$quotedMessageFrameWeak, this.$replyRendererWeak, r8);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass206 A0K;
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass206 A0s = C108945cZ.A0s(this.$quotedMessage.A0v, this.this$0.A01);
            if (!(A0s == null || (A0K = A0s.A0K()) == null)) {
                C120646Es r6 = this.this$0;
                WeakReference weakReference = this.$quotedMessageFrameWeak;
                WeakReference weakReference2 = this.$replyRendererWeak;
                C18600wl r0 = r6.A03;
                FMessageStatusMentionReply$fetchThumbnailFromOriginalStatusMentionMessage$1$1$1 fMessageStatusMentionReply$fetchThumbnailFromOriginalStatusMentionMessage$1$1$1 = new FMessageStatusMentionReply$fetchThumbnailFromOriginalStatusMentionMessage$1$1$1(A0K, r6, weakReference, weakReference2, (C30391dr) null);
                this.L$0 = A0K;
                this.label = 1;
                if (C30451dy.A00(this, r0, fMessageStatusMentionReply$fetchThumbnailFromOriginalStatusMentionMessage$1$1$1) == r3) {
                    return r3;
                }
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FMessageStatusMentionReply$fetchThumbnailFromOriginalStatusMentionMessage$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
