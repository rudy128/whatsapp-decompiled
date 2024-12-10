package com.whatsapp.bot.metaai.imagineme;

import X.AnonymousClass000;
import X.AnonymousClass1G1;
import X.AnonymousClass1OR;
import X.AnonymousClass1OS;
import X.AnonymousClass3Ma;
import X.AnonymousClass4DH;
import X.AnonymousClass5WM;
import X.C18070vi;
import X.C18600wl;
import X.C23401Fx;
import X.C25691Pg;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C37801q9;
import X.C87334Ve;
import X.C99624tC;
import com.whatsapp.extensions.FlowExtKt$debounceSelectively$1;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.bot.metaai.imagineme.ImagineMeOnboardingCameraFragment$onViewCreated$1", f = "ImagineMeOnboardingCameraFragment.kt", i = {}, l = {159}, m = "invokeSuspend", n = {}, s = {})
public final class ImagineMeOnboardingCameraFragment$onViewCreated$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ ImagineMeOnboardingCameraFragment this$0;

    @DebugMetadata(c = "com.whatsapp.bot.metaai.imagineme.ImagineMeOnboardingCameraFragment$onViewCreated$1$1", f = "ImagineMeOnboardingCameraFragment.kt", i = {}, l = {181}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.bot.metaai.imagineme.ImagineMeOnboardingCameraFragment$onViewCreated$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r4) {
            return new AnonymousClass1(r4);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return new AnonymousClass1((C30391dr) obj2).invokeSuspend(C27621Wu.A00);
        }

        public final Object invokeSuspend(Object obj) {
            C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C30691eM.A01(obj);
                AnonymousClass1G1 r10 = AnonymousClass3Ma.A0O(ImagineMeOnboardingCameraFragment.this).A0N;
                AnonymousClass4DH[] r2 = new AnonymousClass4DH[3];
                r2[0] = AnonymousClass4DH.DETECTOR_READY;
                r2[1] = AnonymousClass4DH.POSE_FIND_FACE;
                List A0O = C18070vi.A0O(AnonymousClass4DH.POSE_TOO_MANY_FACES, r2, 2);
                C18600wl r9 = ImagineMeOnboardingCameraFragment.this.A0M;
                if (r9 != null) {
                    C18070vi.A0d(r10, 0);
                    AnonymousClass5WM r22 = new AnonymousClass5WM(AnonymousClass1OR.A00, new FlowExtKt$debounceSelectively$1(A0O, (C30391dr) null, r9, r10, 200), C25691Pg.SUSPEND, -2);
                    C99624tC A00 = C99624tC.A00(ImagineMeOnboardingCameraFragment.this, 16);
                    this.label = 1;
                    if (r22.BFC(this, A00) == r3) {
                        return r3;
                    }
                } else {
                    C18070vi.A11("defaultDispatcher");
                    throw null;
                }
            } else if (i == 1) {
                C30691eM.A01(obj);
            } else {
                throw AnonymousClass000.A0l();
            }
            return C27621Wu.A00;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImagineMeOnboardingCameraFragment$onViewCreated$1(ImagineMeOnboardingCameraFragment imagineMeOnboardingCameraFragment, C30391dr r3) {
        super(2, r3);
        this.this$0 = imagineMeOnboardingCameraFragment;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new ImagineMeOnboardingCameraFragment$onViewCreated$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new ImagineMeOnboardingCameraFragment$onViewCreated$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C37801q9 A1G = this.this$0.A1G();
            C23401Fx r3 = C23401Fx.STARTED;
            final ImagineMeOnboardingCameraFragment imagineMeOnboardingCameraFragment = this.this$0;
            AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (C87334Ve.A01(r3, A1G, this, r0) == r6) {
                return r6;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }
}
