package com.whatsapp.ptt;

import X.AnonymousClass000;
import X.AnonymousClass1FL;
import X.AnonymousClass1GP;
import X.AnonymousClass1OS;
import X.C17880vN;
import X.C18070vi;
import X.C20098A7b;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import android.os.Bundle;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.ptt.TranscriptionOnboardingBottomSheetFragment$showNetworkSelectionDialog$2", f = "TranscriptionOnboardingBottomSheetFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class TranscriptionOnboardingBottomSheetFragment$showNetworkSelectionDialog$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ long $fileSizeInMBs;
    public int label;
    public final /* synthetic */ TranscriptionOnboardingBottomSheetFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TranscriptionOnboardingBottomSheetFragment$showNetworkSelectionDialog$2(TranscriptionOnboardingBottomSheetFragment transcriptionOnboardingBottomSheetFragment, C30391dr r3, long j) {
        super(2, r3);
        this.this$0 = transcriptionOnboardingBottomSheetFragment;
        this.$fileSizeInMBs = j;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new TranscriptionOnboardingBottomSheetFragment$showNetworkSelectionDialog$2(this.this$0, r6, this.$fileSizeInMBs);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            AnonymousClass1GP supportFragmentManager = this.this$0.A1D().getSupportFragmentManager();
            AnonymousClass1FL A1D = this.this$0.A1D();
            C18070vi.A0z(A1D, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
            long j = this.$fileSizeInMBs;
            TranscriptionOnboardingBottomSheetFragment transcriptionOnboardingBottomSheetFragment = this.this$0;
            C18070vi.A0d(transcriptionOnboardingBottomSheetFragment, 2);
            if (j > 0) {
                TranscriptionNetworkDialogFragment transcriptionNetworkDialogFragment = new TranscriptionNetworkDialogFragment(A1D);
                transcriptionNetworkDialogFragment.A00 = transcriptionOnboardingBottomSheetFragment;
                Bundle A0D = C17880vN.A0D();
                A0D.putLong("file_size_in_mbs", j);
                transcriptionNetworkDialogFragment.A1R(A0D);
                C20098A7b.A01(transcriptionNetworkDialogFragment, supportFragmentManager);
                return C27621Wu.A00;
            }
            throw AnonymousClass000.A0k("File size must be greater than 0 MBs");
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((TranscriptionOnboardingBottomSheetFragment$showNetworkSelectionDialog$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
