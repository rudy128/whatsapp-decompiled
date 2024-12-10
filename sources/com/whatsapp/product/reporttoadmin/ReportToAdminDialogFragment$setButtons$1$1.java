package com.whatsapp.product.reporttoadmin;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass1BI;
import X.AnonymousClass1EC;
import X.AnonymousClass1KB;
import X.AnonymousClass1OS;
import X.AnonymousClass206;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C823946i;
import com.whatsapp.reporttoadmin.xmpp.RtaXmppClient;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.product.reporttoadmin.ReportToAdminDialogFragment$setButtons$1$1", f = "ReportToAdminDialogFragment.kt", i = {}, l = {75}, m = "invokeSuspend", n = {}, s = {})
public final class ReportToAdminDialogFragment$setButtons$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $key;
    public int label;
    public final /* synthetic */ ReportToAdminDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReportToAdminDialogFragment$setButtons$1$1(ReportToAdminDialogFragment reportToAdminDialogFragment, String str, C30391dr r4) {
        super(2, r4);
        this.this$0 = reportToAdminDialogFragment;
        this.$key = str;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new ReportToAdminDialogFragment$setButtons$1$1(this.this$0, this.$key, r5);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass00H r0 = this.this$0.A05;
            if (r0 != null) {
                RtaXmppClient rtaXmppClient = (RtaXmppClient) r0.get();
                AnonymousClass206 r02 = this.this$0.A02;
                if (r02 == null) {
                    str = "selectedMessage";
                } else {
                    AnonymousClass1BI r1 = r02.A0v.A00;
                    C18070vi.A0z(r1, "null cannot be cast to non-null type com.whatsapp.jid.PermanentGroupJid");
                    String str2 = this.$key;
                    this.label = 1;
                    obj = rtaXmppClient.A01((AnonymousClass1EC) r1, str2, this);
                    if (obj == r4) {
                        return r4;
                    }
                }
            } else {
                str = "rtaXmppClient";
            }
            C18070vi.A11(str);
            throw null;
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        boolean z = obj instanceof C823946i;
        AnonymousClass1KB r12 = this.this$0.A00;
        if (r12 != null) {
            int i2 = 2131895222;
            if (z) {
                i2 = 2131895229;
            }
            r12.A08(i2, 1);
            return C27621Wu.A00;
        }
        str = "globalUI";
        C18070vi.A11(str);
        throw null;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ReportToAdminDialogFragment$setButtons$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
