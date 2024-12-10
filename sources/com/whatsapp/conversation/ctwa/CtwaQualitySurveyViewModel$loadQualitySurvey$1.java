package com.whatsapp.conversation.ctwa;

import X.AnonymousClass000;
import X.AnonymousClass1BI;
import X.AnonymousClass1OS;
import X.C22941Dw;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.ctwa.CtwaQualitySurveyViewModel$loadQualitySurvey$1", f = "CtwaQualitySurveyViewModel.kt", i = {0}, l = {83}, m = "invokeSuspend", n = {"userJid"}, s = {"L$0"})
public final class CtwaQualitySurveyViewModel$loadQualitySurvey$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1BI $chatJid;
    public final /* synthetic */ int $conversationEntryPoint;
    public final /* synthetic */ boolean $hasUnreadMessages;
    public Object L$0;
    public int label;
    public final /* synthetic */ CtwaQualitySurveyViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CtwaQualitySurveyViewModel$loadQualitySurvey$1(CtwaQualitySurveyViewModel ctwaQualitySurveyViewModel, AnonymousClass1BI r3, C30391dr r4, int i, boolean z) {
        super(2, r4);
        this.$chatJid = r3;
        this.this$0 = ctwaQualitySurveyViewModel;
        this.$conversationEntryPoint = i;
        this.$hasUnreadMessages = z;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        return new CtwaQualitySurveyViewModel$loadQualitySurvey$1(this.this$0, this.$chatJid, r8, this.$conversationEntryPoint, this.$hasUnreadMessages);
    }

    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C22941Dw r0 = UserJid.Companion;
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CtwaQualitySurveyViewModel$loadQualitySurvey$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
