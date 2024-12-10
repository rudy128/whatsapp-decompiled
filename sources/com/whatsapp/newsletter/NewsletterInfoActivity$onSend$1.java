package com.whatsapp.newsletter;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass1OS;
import X.AnonymousClass1OX;
import X.AnonymousClass3MX;
import X.C18070vi;
import X.C27621Wu;
import X.C29681ch;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C86164Qm;
import X.C96944of;
import com.whatsapp.newsletter.multiadmin.NewsletterAdminInvitationHandler$inviteAdminsForChannel$1;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.newsletter.NewsletterInfoActivity$onSend$1", f = "NewsletterInfoActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class NewsletterInfoActivity$onSend$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $caption;
    public final /* synthetic */ List $inviteeJids;
    public final /* synthetic */ C29681ch $newsletterJid;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ NewsletterInfoActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterInfoActivity$onSend$1(C29681ch r2, NewsletterInfoActivity newsletterInfoActivity, String str, List list, C30391dr r6) {
        super(2, r6);
        this.this$0 = newsletterInfoActivity;
        this.$newsletterJid = r2;
        this.$inviteeJids = list;
        this.$caption = str;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        NewsletterInfoActivity newsletterInfoActivity = this.this$0;
        NewsletterInfoActivity$onSend$1 newsletterInfoActivity$onSend$1 = new NewsletterInfoActivity$onSend$1(this.$newsletterJid, newsletterInfoActivity, this.$caption, this.$inviteeJids, r8);
        newsletterInfoActivity$onSend$1.L$0 = obj;
        return newsletterInfoActivity$onSend$1;
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            AnonymousClass1OX r3 = (AnonymousClass1OX) this.L$0;
            AnonymousClass00H r0 = this.this$0.A0y;
            if (r0 != null) {
                C29681ch r5 = this.$newsletterJid;
                List list = this.$inviteeJids;
                C96944of r6 = new C96944of(r5, this.this$0, this.$caption, 0);
                C18070vi.A0n(r3, r5, list);
                AnonymousClass3MX.A1Q(new NewsletterAdminInvitationHandler$inviteAdminsForChannel$1(r5, r6, (C86164Qm) r0.get(), list, (C30391dr) null), r3);
                return C27621Wu.A00;
            }
            C18070vi.A11("newsletterAdminInvitationHandler");
            throw null;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((NewsletterInfoActivity$onSend$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
