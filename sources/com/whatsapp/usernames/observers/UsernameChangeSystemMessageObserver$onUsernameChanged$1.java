package com.whatsapp.usernames.observers;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C143057Bv;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.usernames.observers.UsernameChangeSystemMessageObserver$onUsernameChanged$1", f = "UsernameChangeSystemMessageObserver.kt", i = {}, l = {56}, m = "invokeSuspend", n = {}, s = {})
public final class UsernameChangeSystemMessageObserver$onUsernameChanged$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $newUsername;
    public final /* synthetic */ String $oldUsername;
    public final /* synthetic */ UserJid $userJid;
    public int label;
    public final /* synthetic */ C143057Bv this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UsernameChangeSystemMessageObserver$onUsernameChanged$1(UserJid userJid, C143057Bv r3, String str, String str2, C30391dr r6) {
        super(2, r6);
        this.this$0 = r3;
        this.$userJid = userJid;
        this.$oldUsername = str;
        this.$newUsername = str2;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        return new UsernameChangeSystemMessageObserver$onUsernameChanged$1(this.$userJid, this.this$0, this.$oldUsername, this.$newUsername, r8);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C143057Bv r5 = this.this$0;
            UserJid userJid = this.$userJid;
            String str = this.$oldUsername;
            String str2 = this.$newUsername;
            this.label = 1;
            if (C30451dy.A00(this, r5.A06, new UsernameChangeSystemMessageObserver$insertUsernameChangeSystemMessage$2(userJid, r5, str, str2, (C30391dr) null)) == r2) {
                return r2;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((UsernameChangeSystemMessageObserver$onUsernameChanged$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
