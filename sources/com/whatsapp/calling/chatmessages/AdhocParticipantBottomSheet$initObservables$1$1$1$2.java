package com.whatsapp.calling.chatmessages;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.chatmessages.AdhocParticipantBottomSheet$initObservables$1$1$1$2", f = "AdhocParticipantBottomSheet.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AdhocParticipantBottomSheet$initObservables$1$1$1$2 extends C30431dv implements AnonymousClass1OS {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ AdhocParticipantBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AdhocParticipantBottomSheet$initObservables$1$1$1$2(AdhocParticipantBottomSheet adhocParticipantBottomSheet, C30391dr r3) {
        super(2, r3);
        this.this$0 = adhocParticipantBottomSheet;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        AdhocParticipantBottomSheet$initObservables$1$1$1$2 adhocParticipantBottomSheet$initObservables$1$1$1$2 = new AdhocParticipantBottomSheet$initObservables$1$1$1$2(this.this$0, r4);
        adhocParticipantBottomSheet$initObservables$1$1$1$2.L$0 = obj;
        return adhocParticipantBottomSheet$initObservables$1$1$1$2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        r0 = r3.this$0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            int r0 = r3.label
            if (r0 != 0) goto L_0x001d
            X.C30691eM.A01(r4)
            java.lang.Object r2 = r3.L$0
            X.4ZN r2 = (X.AnonymousClass4ZN) r2
            if (r2 == 0) goto L_0x001a
            com.whatsapp.calling.chatmessages.AdhocParticipantBottomSheet r0 = r3.this$0
            android.widget.TextView r1 = r0.A00
            if (r1 == 0) goto L_0x001a
            android.content.Context r0 = r0.A14()
            X.AnonymousClass4ZN.A01(r0, r1, r2)
        L_0x001a:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x001d:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.chatmessages.AdhocParticipantBottomSheet$initObservables$1$1$1$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AdhocParticipantBottomSheet$initObservables$1$1$1$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
