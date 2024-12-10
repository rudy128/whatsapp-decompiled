package com.whatsapp.reportinfra.repo;

import X.AnonymousClass000;
import X.AnonymousClass1EC;
import X.AnonymousClass1OS;
import X.C17890vO;
import X.C191179m9;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import com.whatsapp.reportinfra.xmpp.SpamReportXmppClient;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.reportinfra.repo.SpamReportRepo$sendGroupSpamReport$2", f = "SpamReportRepo.kt", i = {}, l = {139}, m = "invokeSuspend", n = {}, s = {})
public final class SpamReportRepo$sendGroupSpamReport$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1EC $groupJid;
    public final /* synthetic */ String $reportOrigin;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ SpamReportRepo this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SpamReportRepo$sendGroupSpamReport$2(AnonymousClass1EC r2, SpamReportRepo spamReportRepo, String str, C30391dr r5) {
        super(2, r5);
        this.this$0 = spamReportRepo;
        this.$groupJid = r2;
        this.$reportOrigin = str;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        SpamReportRepo$sendGroupSpamReport$2 spamReportRepo$sendGroupSpamReport$2 = new SpamReportRepo$sendGroupSpamReport$2(this.$groupJid, this.this$0, this.$reportOrigin, r6);
        spamReportRepo$sendGroupSpamReport$2.L$0 = obj;
        return spamReportRepo$sendGroupSpamReport$2;
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            SpamReportXmppClient spamReportXmppClient = (SpamReportXmppClient) this.this$0.A0C.get();
            AnonymousClass1EC r3 = this.$groupJid;
            String str = this.$reportOrigin;
            this.label = 1;
            String A0T = C17890vO.A0T(spamReportXmppClient.A03);
            obj = SpamReportXmppClient.A00(((C191179m9) spamReportXmppClient.A01.get()).A00(r3, A0T, str, (List) this.L$0), spamReportXmppClient, A0T, this, 98);
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
        return ((SpamReportRepo$sendGroupSpamReport$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
