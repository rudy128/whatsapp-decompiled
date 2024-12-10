package com.whatsapp.mediaview;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C160898Aj;
import X.C17900vP;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import com.whatsapp.util.Log;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.mediaview.MediaViewCurrentMessageViewModel$preloadItemsAsync$1", f = "MediaViewCurrentMessageViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class MediaViewCurrentMessageViewModel$preloadItemsAsync$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ int $currentPosition;
    public final /* synthetic */ C160898Aj $messagesNavigator;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaViewCurrentMessageViewModel$preloadItemsAsync$1(C160898Aj r2, C30391dr r3, int i) {
        super(2, r3);
        this.$currentPosition = i;
        this.$messagesNavigator = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new MediaViewCurrentMessageViewModel$preloadItemsAsync$1(this.$messagesNavigator, r5, this.$currentPosition);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            try {
                int i = this.$currentPosition;
                int i2 = i - 1;
                int i3 = i + 1;
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("MediaViewCurrentMessageViewModel/preloadItemsAsync/currentPosition = ");
                A10.append(i);
                A10.append(" ; previous = ");
                A10.append(i2);
                C17900vP.A0j(" ; next = ", A10, i3);
                this.$messagesNavigator.BUg(i2);
                this.$messagesNavigator.BUg(i3);
            } catch (Exception e) {
                Log.e("MediaViewCurrentMessageViewModel/preloadItemsAsync/exception", e);
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MediaViewCurrentMessageViewModel$preloadItemsAsync$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
