package com.whatsapp.calling.chatmessages;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C72473Md;
import android.widget.TextView;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.chatmessages.AdhocParticipantBottomSheet$initObservables$1$1$1$5", f = "AdhocParticipantBottomSheet.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AdhocParticipantBottomSheet$initObservables$1$1$1$5 extends C30431dv implements AnonymousClass1OS {
    public /* synthetic */ int I$0;
    public int label;
    public final /* synthetic */ AdhocParticipantBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AdhocParticipantBottomSheet$initObservables$1$1$1$5(AdhocParticipantBottomSheet adhocParticipantBottomSheet, C30391dr r3) {
        super(2, r3);
        this.this$0 = adhocParticipantBottomSheet;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        AdhocParticipantBottomSheet$initObservables$1$1$1$5 adhocParticipantBottomSheet$initObservables$1$1$1$5 = new AdhocParticipantBottomSheet$initObservables$1$1$1$5(this.this$0, r4);
        adhocParticipantBottomSheet$initObservables$1$1$1$5.I$0 = AnonymousClass000.A0M(obj);
        return adhocParticipantBottomSheet$initObservables$1$1$1$5;
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            int i = this.I$0;
            TextView textView = this.this$0.A01;
            boolean z = true;
            if (textView != null) {
                textView.setEnabled(AnonymousClass000.A1R(i));
            }
            TextView textView2 = this.this$0.A02;
            if (textView2 != null) {
                if (i <= 0) {
                    z = false;
                }
                textView2.setEnabled(z);
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AdhocParticipantBottomSheet$initObservables$1$1$1$5) C72473Md.A0l(obj, obj2, this)).invokeSuspend(C27621Wu.A00);
    }
}
