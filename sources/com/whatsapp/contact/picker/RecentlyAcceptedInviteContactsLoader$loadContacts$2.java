package com.whatsapp.contact.picker;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass1b2;
import X.B28;
import X.C22175Ayr;
import X.C27621Wu;
import X.C29431cG;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C58402kd;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.contact.picker.RecentlyAcceptedInviteContactsLoader$loadContacts$2", f = "RecentlyAcceptedInviteContactsLoader.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class RecentlyAcceptedInviteContactsLoader$loadContacts$2 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ RecentlyAcceptedInviteContactsLoader this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecentlyAcceptedInviteContactsLoader$loadContacts$2(RecentlyAcceptedInviteContactsLoader recentlyAcceptedInviteContactsLoader, C30391dr r3) {
        super(2, r3);
        this.this$0 = recentlyAcceptedInviteContactsLoader;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new RecentlyAcceptedInviteContactsLoader$loadContacts$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new RecentlyAcceptedInviteContactsLoader$loadContacts$2(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            return AnonymousClass1b2.A08(AnonymousClass1b2.A09(B28.A00, AnonymousClass1b2.A0A(new C22175Ayr(this.this$0), C29431cG.A0V(((C58402kd) this.this$0.A01.get()).A00()))));
        }
        throw AnonymousClass000.A0l();
    }
}
