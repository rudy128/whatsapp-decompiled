package com.whatsapp.conversation.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass1E7;
import X.AnonymousClass1G4;
import X.AnonymousClass1OS;
import X.AnonymousClass3VA;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C88044Yc;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.viewmodel.CommentsBottomSheetViewModel$refreshSendPermission$1$1", f = "CommentsBottomSheetViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CommentsBottomSheetViewModel$refreshSendPermission$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1E7 $groupContact;
    public int label;
    public final /* synthetic */ AnonymousClass3VA this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommentsBottomSheetViewModel$refreshSendPermission$1$1(AnonymousClass3VA r2, AnonymousClass1E7 r3, C30391dr r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$groupContact = r3;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new CommentsBottomSheetViewModel$refreshSendPermission$1$1(this.this$0, this.$groupContact, r5);
    }

    public final Object invokeSuspend(Object obj) {
        Object value;
        C88044Yc r0;
        int A00;
        if (this.label == 0) {
            C30691eM.A01(obj);
            AnonymousClass3VA r4 = this.this$0;
            AnonymousClass1G4 r3 = r4.A0Q;
            AnonymousClass1E7 r2 = this.$groupContact;
            do {
                value = r3.getValue();
                r0 = (C88044Yc) value;
                A00 = AnonymousClass3VA.A00(r4, r2);
            } while (!r3.BFK(value, new C88044Yc(r0.A01, r0.A02, r0.A03, r0.A04, A00, r0.A05)));
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CommentsBottomSheetViewModel$refreshSendPermission$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
