package com.whatsapp.usernames;

import X.AnonymousClass000;
import X.AnonymousClass1BI;
import X.AnonymousClass1DS;
import X.AnonymousClass1DT;
import X.AnonymousClass1E1;
import X.AnonymousClass1E2;
import X.AnonymousClass1OS;
import X.AnonymousClass4OG;
import X.C18600wl;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import com.whatsapp.jid.PhoneUserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.usernames.ContactUsernameProvider$getUsernameForJid$1$1", f = "ContactUsernameProvider.kt", i = {}, l = {35, 36}, m = "invokeSuspend", n = {}, s = {})
public final class ContactUsernameProvider$getUsernameForJid$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1BI $chatJid;
    public final /* synthetic */ AnonymousClass1DT $it;
    public Object L$0;
    public int label;
    public final /* synthetic */ AnonymousClass4OG this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContactUsernameProvider$getUsernameForJid$1$1(AnonymousClass1DT r2, AnonymousClass1BI r3, AnonymousClass4OG r4, C30391dr r5) {
        super(2, r5);
        this.$it = r2;
        this.$chatJid = r3;
        this.this$0 = r4;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new ContactUsernameProvider$getUsernameForJid$1$1(this.$it, this.$chatJid, this.this$0, r6);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass1DS r5;
        C18600wl r3;
        AnonymousClass1OS contactUsernameProvider$getUsernameForPn$2;
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            r5 = this.$it;
            AnonymousClass1BI r4 = this.$chatJid;
            if (r4 instanceof AnonymousClass1E2) {
                AnonymousClass4OG r1 = this.this$0;
                this.L$0 = r5;
                this.label = 1;
                r3 = r1.A02;
                contactUsernameProvider$getUsernameForPn$2 = new ContactUsernameProvider$getUsernameForAccountUserJid$2((AnonymousClass1E1) r4, r1, (C30391dr) null);
            } else if (r4 instanceof PhoneUserJid) {
                AnonymousClass4OG r12 = this.this$0;
                this.L$0 = r5;
                this.label = 2;
                r3 = r12.A02;
                contactUsernameProvider$getUsernameForPn$2 = new ContactUsernameProvider$getUsernameForPn$2((PhoneUserJid) r4, r12, (C30391dr) null);
            } else {
                obj = null;
            }
            obj = C30451dy.A00(this, r3, contactUsernameProvider$getUsernameForPn$2);
            if (obj == r6) {
                return r6;
            }
        } else if (i == 1 || i == 2) {
            r5 = (AnonymousClass1DS) this.L$0;
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        r5.A0E(obj);
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ContactUsernameProvider$getUsernameForJid$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
