package com.whatsapp.status.messageregistration;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass206;
import X.AnonymousClass724;
import X.C108945cZ;
import X.C120646Es;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.status.messageregistration.FMessageStatusMentionReply$fetchThumbnailFromOriginalStatusMentionMessage$1$1$1", f = "FMessageStatusMentionReply.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class FMessageStatusMentionReply$fetchThumbnailFromOriginalStatusMentionMessage$1$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass206 $it;
    public final /* synthetic */ WeakReference $quotedMessageFrameWeak;
    public final /* synthetic */ WeakReference $replyRendererWeak;
    public int label;
    public final /* synthetic */ C120646Es this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FMessageStatusMentionReply$fetchThumbnailFromOriginalStatusMentionMessage$1$1$1(AnonymousClass206 r2, C120646Es r3, WeakReference weakReference, WeakReference weakReference2, C30391dr r6) {
        super(2, r6);
        this.this$0 = r3;
        this.$it = r2;
        this.$quotedMessageFrameWeak = weakReference;
        this.$replyRendererWeak = weakReference2;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        return new FMessageStatusMentionReply$fetchThumbnailFromOriginalStatusMentionMessage$1$1$1(this.$it, this.this$0, this.$quotedMessageFrameWeak, this.$replyRendererWeak, r8);
    }

    public final Object invokeSuspend(Object obj) {
        View A0O;
        if (this.label == 0) {
            C30691eM.A01(obj);
            AnonymousClass206 r3 = this.$it;
            C18070vi.A0b(r3);
            WeakReference weakReference = this.$quotedMessageFrameWeak;
            AnonymousClass724 r2 = (AnonymousClass724) this.$replyRendererWeak.get();
            if (!(r2 == null || (A0O = C108945cZ.A0O(weakReference)) == null)) {
                r2.A03(A0O, r3, true);
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FMessageStatusMentionReply$fetchThumbnailFromOriginalStatusMentionMessage$1$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
