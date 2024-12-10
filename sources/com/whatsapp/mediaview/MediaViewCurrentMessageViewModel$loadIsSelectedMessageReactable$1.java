package com.whatsapp.mediaview;

import X.AnonymousClass000;
import X.AnonymousClass1DT;
import X.AnonymousClass1OS;
import X.AnonymousClass21V;
import X.C135816so;
import X.C18070vi;
import X.C18600wl;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.mediaview.MediaViewCurrentMessageViewModel$loadIsSelectedMessageReactable$1", f = "MediaViewCurrentMessageViewModel.kt", i = {}, l = {149}, m = "invokeSuspend", n = {}, s = {})
public final class MediaViewCurrentMessageViewModel$loadIsSelectedMessageReactable$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C135816so $selectedMessage;
    public int label;
    public final /* synthetic */ MediaViewCurrentMessageViewModel this$0;

    @DebugMetadata(c = "com.whatsapp.mediaview.MediaViewCurrentMessageViewModel$loadIsSelectedMessageReactable$1$1", f = "MediaViewCurrentMessageViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.mediaview.MediaViewCurrentMessageViewModel$loadIsSelectedMessageReactable$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r6) {
            return new AnonymousClass1(r2, mediaViewCurrentMessageViewModel, r6, A02);
        }

        public final Object invokeSuspend(Object obj) {
            AnonymousClass21V r0;
            if (this.label == 0) {
                C30691eM.A01(obj);
                C135816so r6 = (C135816so) mediaViewCurrentMessageViewModel.A00.A06();
                AnonymousClass21V r1 = r2.A01;
                if (r6 != null) {
                    r0 = r6.A01;
                } else {
                    r0 = null;
                }
                if (C18070vi.A18(r1, r0)) {
                    AnonymousClass1DT r5 = mediaViewCurrentMessageViewModel.A00;
                    boolean z = A02;
                    r5.A0F(new C135816so(r6.A00, r6.A01, r6.A02, z));
                }
                return C27621Wu.A00;
            }
            throw AnonymousClass000.A0l();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaViewCurrentMessageViewModel$loadIsSelectedMessageReactable$1(C135816so r2, MediaViewCurrentMessageViewModel mediaViewCurrentMessageViewModel, C30391dr r4) {
        super(2, r4);
        this.this$0 = mediaViewCurrentMessageViewModel;
        this.$selectedMessage = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new MediaViewCurrentMessageViewModel$loadIsSelectedMessageReactable$1(this.$selectedMessage, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r7 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            final boolean A02 = this.this$0.A03.A02(this.$selectedMessage.A01);
            final MediaViewCurrentMessageViewModel mediaViewCurrentMessageViewModel = this.this$0;
            C18600wl r3 = mediaViewCurrentMessageViewModel.A07;
            final C135816so r2 = this.$selectedMessage;
            AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (C30451dy.A00(this, r3, r0) == r7) {
                return r7;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MediaViewCurrentMessageViewModel$loadIsSelectedMessageReactable$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
