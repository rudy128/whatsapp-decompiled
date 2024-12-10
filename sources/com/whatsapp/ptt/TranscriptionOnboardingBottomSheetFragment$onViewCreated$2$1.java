package com.whatsapp.ptt;

import X.AnonymousClass000;
import X.AnonymousClass11E;
import X.AnonymousClass1LR;
import X.AnonymousClass1OS;
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

@DebugMetadata(c = "com.whatsapp.ptt.TranscriptionOnboardingBottomSheetFragment$onViewCreated$2$1", f = "TranscriptionOnboardingBottomSheetFragment.kt", i = {}, l = {91}, m = "invokeSuspend", n = {}, s = {})
public final class TranscriptionOnboardingBottomSheetFragment$onViewCreated$2$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ long $fileSizeInMBs;
    public int label;
    public final /* synthetic */ TranscriptionOnboardingBottomSheetFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TranscriptionOnboardingBottomSheetFragment$onViewCreated$2$1(TranscriptionOnboardingBottomSheetFragment transcriptionOnboardingBottomSheetFragment, C30391dr r3, long j) {
        super(2, r3);
        this.this$0 = transcriptionOnboardingBottomSheetFragment;
        this.$fileSizeInMBs = j;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new TranscriptionOnboardingBottomSheetFragment$onViewCreated$2$1(this.this$0, r6, this.$fileSizeInMBs);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        boolean z;
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass11E r0 = this.this$0.A03;
            if (r0 != null) {
                AnonymousClass1LR A04 = r0.A04();
                if (A04 != null) {
                    z = A04.A06;
                } else {
                    z = false;
                }
                TranscriptionOnboardingBottomSheetFragment transcriptionOnboardingBottomSheetFragment = this.this$0;
                if (z) {
                    TranscriptionOnboardingBottomSheetFragment.A00(transcriptionOnboardingBottomSheetFragment, true);
                } else {
                    long j = this.$fileSizeInMBs;
                    this.label = 1;
                    C18600wl r2 = transcriptionOnboardingBottomSheetFragment.A0D;
                    if (r2 == null) {
                        str = "mainDispatcher";
                    } else if (C30451dy.A00(this, r2, new TranscriptionOnboardingBottomSheetFragment$showNetworkSelectionDialog$2(transcriptionOnboardingBottomSheetFragment, (C30391dr) null, j)) == r6) {
                        return r6;
                    }
                }
            } else {
                str = "connectivityStateProvider";
            }
            C18070vi.A11(str);
            throw null;
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((TranscriptionOnboardingBottomSheetFragment$onViewCreated$2$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
