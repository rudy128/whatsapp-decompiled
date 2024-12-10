package com.whatsapp.usernames;

import X.AnonymousClass000;
import X.AnonymousClass1E1;
import X.AnonymousClass1OS;
import X.AnonymousClass4OG;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import com.whatsapp.jid.PhoneUserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.usernames.ContactUsernameProvider$getUsernameForPn$2", f = "ContactUsernameProvider.kt", i = {}, l = {46}, m = "invokeSuspend", n = {}, s = {})
public final class ContactUsernameProvider$getUsernameForPn$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ PhoneUserJid $phoneUserJid;
    public int label;
    public final /* synthetic */ AnonymousClass4OG this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContactUsernameProvider$getUsernameForPn$2(PhoneUserJid phoneUserJid, AnonymousClass4OG r3, C30391dr r4) {
        super(2, r4);
        this.this$0 = r3;
        this.$phoneUserJid = phoneUserJid;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new ContactUsernameProvider$getUsernameForPn$2(this.$phoneUserJid, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass1E1 A0A = this.this$0.A01.A0A(this.$phoneUserJid);
            if (A0A == null) {
                return null;
            }
            AnonymousClass4OG r3 = this.this$0;
            this.label = 1;
            obj = C30451dy.A00(this, r3.A02, new ContactUsernameProvider$getUsernameForAccountUserJid$2(A0A, r3, (C30391dr) null));
            if (obj == r5) {
                return r5;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return obj;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ContactUsernameProvider$getUsernameForPn$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
