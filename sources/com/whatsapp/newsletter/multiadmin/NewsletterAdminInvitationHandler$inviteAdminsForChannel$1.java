package com.whatsapp.newsletter.multiadmin;

import X.AnonymousClass000;
import X.AnonymousClass10E;
import X.AnonymousClass1OS;
import X.AnonymousClass3Ma;
import X.AnonymousClass4KJ;
import X.AnonymousClass4RH;
import X.AnonymousClass5VX;
import X.AnonymousClass5Y9;
import X.C107095Yj;
import X.C108125bA;
import X.C18070vi;
import X.C20131A8r;
import X.C27621Wu;
import X.C29681ch;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C72453Mb;
import X.C821443f;
import X.C85194Ml;
import X.C86164Qm;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.newsletter.multiadmin.NewsletterAdminInvitationHandler$inviteAdminsForChannel$1", f = "NewsletterAdminInvitationHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class NewsletterAdminInvitationHandler$inviteAdminsForChannel$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C108125bA $callback;
    public final /* synthetic */ List $inviteeJids;
    public final /* synthetic */ C29681ch $newsletterJid;
    public int label;
    public final /* synthetic */ C86164Qm this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterAdminInvitationHandler$inviteAdminsForChannel$1(C29681ch r2, C108125bA r3, C86164Qm r4, List list, C30391dr r6) {
        super(2, r6);
        this.this$0 = r4;
        this.$inviteeJids = list;
        this.$newsletterJid = r2;
        this.$callback = r3;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        return new NewsletterAdminInvitationHandler$inviteAdminsForChannel$1(this.$newsletterJid, this.$callback, this.this$0, this.$inviteeJids, r8);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            ArrayList A13 = AnonymousClass000.A13();
            C107095Yj r0 = this.this$0.A00;
            if (r0 != null) {
                r0.cancel();
            }
            this.this$0.A01.A07(2131891464, 2131891463);
            for (UserJid userJid : this.$inviteeJids) {
                C86164Qm r4 = this.this$0;
                C29681ch r8 = this.$newsletterJid;
                AnonymousClass5VX r02 = new AnonymousClass5VX(this.$callback, r4, A13, this.$inviteeJids);
                AnonymousClass4RH r1 = r4.A02;
                C85194Ml r12 = new C85194Ml(userJid, r02);
                C18070vi.A0h(r8, userJid);
                if (C72453Mb.A1X(r1.A06)) {
                    AnonymousClass4KJ r03 = r1.A02;
                    if (r03 != null) {
                        AnonymousClass10E r13 = r03.A00.A00;
                        new C821443f(AnonymousClass3Ma.A0l(r13), r8, userJid, (AnonymousClass5Y9) r13.A7S.get(), (C20131A8r) r13.A7I.get(), r12, AnonymousClass10E.AL1(r13)).A01();
                    } else {
                        C18070vi.A11("newsletterAdminInviteHandler");
                        throw null;
                    }
                }
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((NewsletterAdminInvitationHandler$inviteAdminsForChannel$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
