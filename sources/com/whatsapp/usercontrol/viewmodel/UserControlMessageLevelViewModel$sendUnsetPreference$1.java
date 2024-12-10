package com.whatsapp.usercontrol.viewmodel;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.usercontrol.viewmodel.UserControlMessageLevelViewModel$sendUnsetPreference$1", f = "UserControlMessageLevelViewModel.kt", i = {0}, l = {264}, m = "invokeSuspend", n = {"userJid"}, s = {"L$0"})
public final class UserControlMessageLevelViewModel$sendUnsetPreference$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ boolean $isInterested;
    public Object L$0;
    public Object L$1;
    public boolean Z$0;
    public int label;
    public final /* synthetic */ UserControlMessageLevelViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserControlMessageLevelViewModel$sendUnsetPreference$1(UserControlMessageLevelViewModel userControlMessageLevelViewModel, C30391dr r3, boolean z) {
        super(2, r3);
        this.this$0 = userControlMessageLevelViewModel;
        this.$isInterested = z;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new UserControlMessageLevelViewModel$sendUnsetPreference$1(this.this$0, r5, this.$isInterested);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            X.1g4 r3 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r10.label
            r1 = 1
            if (r0 == 0) goto L_0x0041
            if (r0 != r1) goto L_0x007e
            boolean r9 = r10.Z$0
            java.lang.Object r2 = r10.L$1
            com.whatsapp.usercontrol.viewmodel.UserControlMessageLevelViewModel r2 = (com.whatsapp.usercontrol.viewmodel.UserControlMessageLevelViewModel) r2
            java.lang.Object r5 = r10.L$0
            com.whatsapp.jid.Jid r5 = (com.whatsapp.jid.Jid) r5
            X.C30691eM.A01(r11)
        L_0x0016:
            X.1ml r3 = r2.A05
            X.206 r2 = r2.A00
            r0 = 0
            X.C18070vi.A0d(r5, r0)
            X.63p r4 = new X.63p
            r4.<init>()
            java.lang.Integer r0 = X.AnonymousClass3MY.A0g()
            r4.A01 = r0
            java.lang.Integer r0 = X.C17880vN.A0j()
            r4.A02 = r0
            if (r2 != 0) goto L_0x003c
            r0 = 0
        L_0x0032:
            r4.A06 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r4.A00 = r0
            r2 = 0
            goto L_0x0071
        L_0x003c:
            java.lang.String r0 = X.C20120A8f.A04(r2)
            goto L_0x0032
        L_0x0041:
            X.C30691eM.A01(r11)
            com.whatsapp.usercontrol.viewmodel.UserControlMessageLevelViewModel r2 = r10.this$0
            X.6rX r0 = r2.A01
            if (r0 == 0) goto L_0x0092
            com.whatsapp.jid.UserJid r5 = r0.A00
            if (r5 == 0) goto L_0x0092
            boolean r9 = r10.$isInterested
            X.00H r0 = r2.A0D
            java.lang.Object r6 = r0.get()
            X.6gg r6 = (X.C128786gg) r6
            r10.L$0 = r5
            r10.L$1 = r2
            r10.Z$0 = r9
            r10.label = r1
            java.lang.String r7 = "unset_preference"
            X.0wl r0 = r6.A02
            r8 = 0
            com.whatsapp.usercontrol.protocol.UpdatePreferenceProtocolApi$sendUpdatePreference$2 r4 = new com.whatsapp.usercontrol.protocol.UpdatePreferenceProtocolApi$sendUpdatePreference$2
            r4.<init>(r5, r6, r7, r8, r9)
            java.lang.Object r0 = X.C30451dy.A00(r10, r0, r4)
            if (r0 != r3) goto L_0x0016
            return r3
        L_0x0071:
            java.lang.String r0 = r5.user     // Catch:{ NumberFormatException -> 0x0083 }
            if (r0 == 0) goto L_0x0083
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x0083 }
            java.lang.Long r2 = java.lang.Long.valueOf(r0)     // Catch:{ NumberFormatException -> 0x0083 }
            goto L_0x0083
        L_0x007e:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0083:
            r4.A03 = r2
            X.10I r0 = r3.A04
            r6 = 7
            X.7RT r2 = new X.7RT
            r5 = r5
            r7 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            r0.CGF(r2)
        L_0x0092:
            com.whatsapp.usercontrol.viewmodel.UserControlMessageLevelViewModel r0 = r10.this$0
            X.0ve r2 = r0.A06
            r1 = 12855(0x3237, float:1.8014E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x00a8
            com.whatsapp.usercontrol.viewmodel.UserControlMessageLevelViewModel r2 = r10.this$0
            X.1KB r1 = r2.A04
            r0 = 0
            X.AnonymousClass7RJ.A00(r1, r2, r0)
        L_0x00a8:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.usercontrol.viewmodel.UserControlMessageLevelViewModel$sendUnsetPreference$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((UserControlMessageLevelViewModel$sendUnsetPreference$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
