package com.whatsapp.usernames;

import X.AnonymousClass1OS;
import X.C130756jx;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.usernames.UsernameSearchManager$setSearchSource$2$1", f = "UsernameSearchManager.kt", i = {}, l = {57, 58}, m = "invokeSuspend", n = {}, s = {})
public final class UsernameSearchManager$setSearchSource$2$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $username;
    public final /* synthetic */ String $usernamePin;
    public int label;
    public final /* synthetic */ C130756jx this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UsernameSearchManager$setSearchSource$2$1(C130756jx r2, String str, String str2, C30391dr r5) {
        super(2, r5);
        this.this$0 = r2;
        this.$username = str;
        this.$usernamePin = str2;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new UsernameSearchManager$setSearchSource$2$1(this.this$0, this.$username, this.$usernamePin, r6);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0039 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            X.1g4 r6 = X.C31751g4.COROUTINE_SUSPENDED
            int r1 = r7.label
            r2 = 2
            r0 = 1
            if (r1 == 0) goto L_0x0012
            if (r1 == r0) goto L_0x0020
            if (r1 != r2) goto L_0x003a
            X.C30691eM.A01(r8)
        L_0x000f:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0012:
            X.C30691eM.A01(r8)
            r7.label = r0
            r0 = 800(0x320, double:3.953E-321)
            java.lang.Object r0 = X.C62882s9.A00(r7, r0)
            if (r0 != r6) goto L_0x0023
            return r6
        L_0x0020:
            X.C30691eM.A01(r8)
        L_0x0023:
            X.6jx r5 = r7.this$0
            java.lang.String r4 = r7.$username
            java.lang.String r3 = r7.$usernamePin
            r7.label = r2
            X.0wl r2 = r5.A07
            r1 = 0
            com.whatsapp.usernames.UsernameSearchManager$queryUsername$2 r0 = new com.whatsapp.usernames.UsernameSearchManager$queryUsername$2
            r0.<init>(r5, r4, r3, r1)
            java.lang.Object r0 = X.C30451dy.A00(r7, r2, r0)
            if (r0 != r6) goto L_0x000f
            return r6
        L_0x003a:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.usernames.UsernameSearchManager$setSearchSource$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((UsernameSearchManager$setSearchSource$2$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
