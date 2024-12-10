package com.whatsapp.reportinfra.repo;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass206;
import X.C17890vO;
import X.C189739jl;
import X.C27621Wu;
import X.C29671cg;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import com.whatsapp.reportinfra.xmpp.SpamReportXmppClient;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.reportinfra.repo.SpamReportRepo$sendStatusSpamReport$2", f = "SpamReportRepo.kt", i = {}, l = {169}, m = "invokeSuspend", n = {}, s = {})
public final class SpamReportRepo$sendStatusSpamReport$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $reportOrigin;
    public final /* synthetic */ C29671cg $statusJid;
    public final /* synthetic */ AnonymousClass206 $statusMessage;
    public int label;
    public final /* synthetic */ SpamReportRepo this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SpamReportRepo$sendStatusSpamReport$2(C29671cg r2, AnonymousClass206 r3, SpamReportRepo spamReportRepo, String str, C30391dr r6) {
        super(2, r6);
        this.this$0 = spamReportRepo;
        this.$statusJid = r2;
        this.$statusMessage = r3;
        this.$reportOrigin = str;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        return new SpamReportRepo$sendStatusSpamReport$2(this.$statusJid, this.$statusMessage, this.this$0, this.$reportOrigin, r8);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            SpamReportXmppClient spamReportXmppClient = (SpamReportXmppClient) this.this$0.A0C.get();
            C29671cg r4 = this.$statusJid;
            AnonymousClass206 r3 = this.$statusMessage;
            String str = this.$reportOrigin;
            this.label = 1;
            String A0T = C17890vO.A0T(spamReportXmppClient.A03);
            obj = SpamReportXmppClient.A00(((C189739jl) spamReportXmppClient.A05.get()).A00(r4, r3, A0T, str), spamReportXmppClient, A0T, this, 98);
            if (obj == r6) {
                return r6;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return obj;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((SpamReportRepo$sendStatusSpamReport$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
