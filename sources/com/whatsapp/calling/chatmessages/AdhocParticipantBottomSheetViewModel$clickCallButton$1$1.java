package com.whatsapp.calling.chatmessages;

import X.AnonymousClass000;
import X.AnonymousClass1G4;
import X.AnonymousClass1OS;
import X.AnonymousClass1VP;
import X.AnonymousClass4UT;
import X.C178119Bw;
import X.C27621Wu;
import X.C29351c6;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C72483Me;
import android.content.Context;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.chatmessages.AdhocParticipantBottomSheetViewModel$clickCallButton$1$1", f = "AdhocParticipantBottomSheetViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AdhocParticipantBottomSheetViewModel$clickCallButton$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C178119Bw $callLog;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ boolean $launchVideo;
    public int label;
    public final /* synthetic */ AdhocParticipantBottomSheetViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AdhocParticipantBottomSheetViewModel$clickCallButton$1$1(Context context, AdhocParticipantBottomSheetViewModel adhocParticipantBottomSheetViewModel, C178119Bw r4, C30391dr r5, boolean z) {
        super(2, r5);
        this.this$0 = adhocParticipantBottomSheetViewModel;
        this.$context = context;
        this.$callLog = r4;
        this.$launchVideo = z;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        return new AdhocParticipantBottomSheetViewModel$clickCallButton$1$1(this.$context, this.this$0, this.$callLog, r8, this.$launchVideo);
    }

    public final Object invokeSuspend(Object obj) {
        int A06;
        if (this.label == 0) {
            C30691eM.A01(obj);
            ArrayList<AnonymousClass4UT> A13 = AnonymousClass000.A13();
            for (Object next : (Iterable) this.this$0.A0I.getValue()) {
                if (((AnonymousClass4UT) next).A01) {
                    A13.add(next);
                }
            }
            ArrayList A0D = C29351c6.A0D(A13);
            for (AnonymousClass4UT r0 : A13) {
                A0D.add(r0.A02);
            }
            if (AnonymousClass000.A1a(A0D)) {
                AdhocParticipantBottomSheetViewModel adhocParticipantBottomSheetViewModel = this.this$0;
                AnonymousClass1VP r3 = adhocParticipantBottomSheetViewModel.A06;
                Context context = this.$context;
                C178119Bw r1 = this.$callLog;
                if (adhocParticipantBottomSheetViewModel.A0J) {
                    A06 = adhocParticipantBottomSheetViewModel.A03;
                    if (A06 != 4) {
                        A06 = 21;
                    }
                } else {
                    A06 = C72483Me.A06(r1);
                }
                r3.CNx(context, A0D, A06, this.$launchVideo);
            }
            AnonymousClass1G4 r12 = this.this$0.A0E;
            C27621Wu r02 = C27621Wu.A00;
            r12.setValue(r02);
            return r02;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AdhocParticipantBottomSheetViewModel$clickCallButton$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
