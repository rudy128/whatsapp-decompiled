package com.whatsapp.usernames;

import X.AnonymousClass000;
import X.AnonymousClass1E1;
import X.AnonymousClass1OS;
import X.AnonymousClass4OG;
import X.C17890vO;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.usernames.ContactUsernameProvider$getUsernameForAccountUserJid$2", f = "ContactUsernameProvider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ContactUsernameProvider$getUsernameForAccountUserJid$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1E1 $accountUserJid;
    public int label;
    public final /* synthetic */ AnonymousClass4OG this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContactUsernameProvider$getUsernameForAccountUserJid$2(AnonymousClass1E1 r2, AnonymousClass4OG r3, C30391dr r4) {
        super(2, r4);
        this.this$0 = r3;
        this.$accountUserJid = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new ContactUsernameProvider$getUsernameForAccountUserJid$2(this.$accountUserJid, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            String BMn = this.this$0.A00.BMn(this.$accountUserJid);
            if (BMn == null) {
                return null;
            }
            if (BMn.length() <= 0 || BMn.charAt(0) != '@') {
                return C17890vO.A0Z(BMn, AnonymousClass000.A10(), '@');
            }
            return BMn;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ContactUsernameProvider$getUsernameForAccountUserJid$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
