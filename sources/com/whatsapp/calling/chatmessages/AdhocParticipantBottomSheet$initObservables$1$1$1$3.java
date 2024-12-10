package com.whatsapp.calling.chatmessages;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import com.whatsapp.TextEmojiLabel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.chatmessages.AdhocParticipantBottomSheet$initObservables$1$1$1$3", f = "AdhocParticipantBottomSheet.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AdhocParticipantBottomSheet$initObservables$1$1$1$3 extends C30431dv implements AnonymousClass1OS {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ AdhocParticipantBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AdhocParticipantBottomSheet$initObservables$1$1$1$3(AdhocParticipantBottomSheet adhocParticipantBottomSheet, C30391dr r3) {
        super(2, r3);
        this.this$0 = adhocParticipantBottomSheet;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        AdhocParticipantBottomSheet$initObservables$1$1$1$3 adhocParticipantBottomSheet$initObservables$1$1$1$3 = new AdhocParticipantBottomSheet$initObservables$1$1$1$3(this.this$0, r4);
        adhocParticipantBottomSheet$initObservables$1$1$1$3.L$0 = obj;
        return adhocParticipantBottomSheet$initObservables$1$1$1$3;
    }

    public final Object invokeSuspend(Object obj) {
        TextEmojiLabel textEmojiLabel;
        if (this.label == 0) {
            C30691eM.A01(obj);
            String str = (String) this.L$0;
            if (!(str == null || (textEmojiLabel = this.this$0.A05) == null)) {
                textEmojiLabel.setText(str);
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AdhocParticipantBottomSheet$initObservables$1$1$1$3) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
