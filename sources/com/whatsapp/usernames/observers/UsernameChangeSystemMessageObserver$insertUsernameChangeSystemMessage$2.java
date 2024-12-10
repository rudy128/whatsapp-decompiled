package com.whatsapp.usernames.observers;

import X.AnonymousClass000;
import X.AnonymousClass122;
import X.AnonymousClass1BI;
import X.AnonymousClass1OS;
import X.C143057Bv;
import X.C1771997q;
import X.C17880vN;
import X.C18070vi;
import X.C190329kl;
import X.C27621Wu;
import X.C29691ci;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C436420i;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.usernames.observers.UsernameChangeSystemMessageObserver$insertUsernameChangeSystemMessage$2", f = "UsernameChangeSystemMessageObserver.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class UsernameChangeSystemMessageObserver$insertUsernameChangeSystemMessage$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $newUsername;
    public final /* synthetic */ String $oldUsername;
    public final /* synthetic */ UserJid $userJid;
    public int label;
    public final /* synthetic */ C143057Bv this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UsernameChangeSystemMessageObserver$insertUsernameChangeSystemMessage$2(UserJid userJid, C143057Bv r3, String str, String str2, C30391dr r6) {
        super(2, r6);
        this.this$0 = r3;
        this.$userJid = userJid;
        this.$oldUsername = str;
        this.$newUsername = str2;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        return new UsernameChangeSystemMessageObserver$insertUsernameChangeSystemMessage$2(this.$userJid, this.this$0, this.$oldUsername, this.$newUsername, r8);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            C29691ci A0A = this.this$0.A00.A0A(this.$userJid);
            if (A0A != null) {
                C143057Bv r2 = this.this$0;
                AnonymousClass1BI A08 = A0A.A08();
                C18070vi.A0X(A08);
                String str = this.$oldUsername;
                String str2 = this.$newUsername;
                C436420i A00 = ((C190329kl) r2.A04.get()).A00(C17880vN.A0Z(A08, r2.A02), 165, System.currentTimeMillis());
                C18070vi.A0z(A00, "null cannot be cast to non-null type com.whatsapp.protocol.message.FMessageSystemUsernameChange");
                C1771997q r1 = (C1771997q) A00;
                C18070vi.A0d(str, 0);
                r1.A01 = str;
                C18070vi.A0d(str2, 0);
                r1.A00 = str2;
                ((AnonymousClass122) this.this$0.A05.getValue()).BBM(r1);
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((UsernameChangeSystemMessageObserver$insertUsernameChangeSystemMessage$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
