package com.whatsapp.newsletter;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass4RH;
import X.C18070vi;
import X.C27621Wu;
import X.C29681ch;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C76823oU;
import X.C96914oc;
import com.whatsapp.newsletter.mex.GetNewsletterAdminMetadataJob;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.newsletter.NewsletterInfoViewModel$fetchAdminMetadata$1", f = "NewsletterInfoViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class NewsletterInfoViewModel$fetchAdminMetadata$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ boolean $includeAdminCount;
    public final /* synthetic */ boolean $includeCapabilities;
    public final /* synthetic */ boolean $includePendingAdmins;
    public final /* synthetic */ C29681ch $jid;
    public int label;
    public final /* synthetic */ C76823oU this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterInfoViewModel$fetchAdminMetadata$1(C29681ch r2, C76823oU r3, C30391dr r4, boolean z, boolean z2, boolean z3) {
        super(2, r4);
        this.this$0 = r3;
        this.$jid = r2;
        this.$includeAdminCount = z;
        this.$includePendingAdmins = z2;
        this.$includeCapabilities = z3;
    }

    public final C30391dr create(Object obj, C30391dr r9) {
        return new NewsletterInfoViewModel$fetchAdminMetadata$1(this.$jid, this.this$0, r9, this.$includeAdminCount, this.$includePendingAdmins, this.$includeCapabilities);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            C76823oU r0 = this.this$0;
            AnonymousClass4RH r1 = r0.A0E;
            C29681ch r3 = this.$jid;
            boolean z = this.$includeAdminCount;
            boolean z2 = this.$includePendingAdmins;
            boolean z3 = this.$includeCapabilities;
            C96914oc r4 = new C96914oc(r3, r0);
            C18070vi.A0d(r3, 0);
            r1.A05.A01(new GetNewsletterAdminMetadataJob(r3, r4, z2, z, z3));
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((NewsletterInfoViewModel$fetchAdminMetadata$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
