package com.whatsapp.conversation.conversationrow.message.reporttoadmin.messageslist;

import X.AnonymousClass000;
import X.AnonymousClass1EC;
import X.AnonymousClass1OS;
import X.AnonymousClass3Uj;
import X.C23761Hn;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import X.C42621yT;
import X.C55492fr;
import com.whatsapp.reporttoadmin.db.RtaMessagesDbRepo$getMessages$2;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.conversationrow.message.reporttoadmin.messageslist.ReportToAdminMessagesViewModel$refreshDb$1", f = "ReportToAdminMessagesViewModel.kt", i = {}, l = {149}, m = "invokeSuspend", n = {}, s = {})
public final class ReportToAdminMessagesViewModel$refreshDb$1 extends C30431dv implements AnonymousClass1OS {
    public Object L$0;
    public int label;
    public final /* synthetic */ AnonymousClass3Uj this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReportToAdminMessagesViewModel$refreshDb$1(AnonymousClass3Uj r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new ReportToAdminMessagesViewModel$refreshDb$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new ReportToAdminMessagesViewModel$refreshDb$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass3Uj r5;
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            r5 = this.this$0;
            C55492fr r4 = r5.A00;
            if (r4 != null) {
                AnonymousClass1EC r3 = r5.A06;
                this.L$0 = r5;
                this.label = 1;
                obj = C30451dy.A00(this, C23761Hn.A01, new RtaMessagesDbRepo$getMessages$2((C42621yT) null, r3, r4, (C30391dr) null));
                if (obj == r6) {
                    return r6;
                }
            }
            return C27621Wu.A00;
        } else if (i == 1) {
            r5 = (AnonymousClass3Uj) this.L$0;
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        r5.A01.A0E(obj);
        return C27621Wu.A00;
    }
}
