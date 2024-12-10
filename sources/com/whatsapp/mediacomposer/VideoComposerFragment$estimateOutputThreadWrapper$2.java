package com.whatsapp.mediacomposer;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C18070vi;
import X.C18090vk;
import X.C18600wl;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import com.whatsapp.util.Log;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.mediacomposer.VideoComposerFragment$estimateOutputThreadWrapper$2", f = "VideoComposerFragment.kt", i = {}, l = {1806}, m = "invokeSuspend", n = {}, s = {})
public final class VideoComposerFragment$estimateOutputThreadWrapper$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C18090vk $callback;
    public int label;
    public final /* synthetic */ VideoComposerFragment this$0;

    @DebugMetadata(c = "com.whatsapp.mediacomposer.VideoComposerFragment$estimateOutputThreadWrapper$2$1", f = "VideoComposerFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.mediacomposer.VideoComposerFragment$estimateOutputThreadWrapper$2$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r4) {
            return new AnonymousClass1(r4, r2);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return new AnonymousClass1((C30391dr) obj2, r2).invokeSuspend(C27621Wu.A00);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                C30691eM.A01(obj);
                r2.invoke();
                return C27621Wu.A00;
            }
            throw AnonymousClass000.A0l();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VideoComposerFragment$estimateOutputThreadWrapper$2(VideoComposerFragment videoComposerFragment, C30391dr r3, C18090vk r4) {
        super(2, r3);
        this.this$0 = videoComposerFragment;
        this.$callback = r4;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new VideoComposerFragment$estimateOutputThreadWrapper$2(this.this$0, r5, this.$callback);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            VideoComposerFragment videoComposerFragment = this.this$0;
            VideoComposerFragment.A04(videoComposerFragment);
            if (videoComposerFragment.A0d) {
                VideoComposerFragment.A03(videoComposerFragment);
            }
            C18600wl r3 = this.this$0.A0c;
            if (r3 != null) {
                final C18090vk r2 = this.$callback;
                AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
                this.label = 1;
                if (C30451dy.A00(this, r3, r0) == r5) {
                    return r5;
                }
            } else {
                C18070vi.A11("mainDispatcher");
                throw null;
            }
        } else if (i == 1) {
            try {
                C30691eM.A01(obj);
            } catch (CancellationException e) {
                Log.e("VideoComposerFragment/estimateOutputThreadWrapper/Cancelled", e);
            }
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((VideoComposerFragment$estimateOutputThreadWrapper$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
