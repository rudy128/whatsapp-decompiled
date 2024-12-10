package com.whatsapp.usercontrol.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass10I;
import X.AnonymousClass1D6;
import X.AnonymousClass1OS;
import X.AnonymousClass206;
import X.C1184763p;
import X.C128786gg;
import X.C135026rX;
import X.C17880vN;
import X.C18070vi;
import X.C20120A8f;
import X.C21455AkM;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import X.C35761ml;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.usercontrol.protocol.UpdatePreferenceProtocolApi$sendUpdatePreference$2;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.usercontrol.viewmodel.UserControlMessageLevelViewModel$sendUpdatePreference$1", f = "UserControlMessageLevelViewModel.kt", i = {0}, l = {243}, m = "invokeSuspend", n = {"userJid"}, s = {"L$0"})
public final class UserControlMessageLevelViewModel$sendUpdatePreference$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ boolean $isInterested;
    public Object L$0;
    public Object L$1;
    public boolean Z$0;
    public int label;
    public final /* synthetic */ UserControlMessageLevelViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserControlMessageLevelViewModel$sendUpdatePreference$1(UserControlMessageLevelViewModel userControlMessageLevelViewModel, C30391dr r3, boolean z) {
        super(2, r3);
        this.this$0 = userControlMessageLevelViewModel;
        this.$isInterested = z;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new UserControlMessageLevelViewModel$sendUpdatePreference$1(this.this$0, r5, this.$isInterested);
    }

    public final Object invokeSuspend(Object obj) {
        UserControlMessageLevelViewModel userControlMessageLevelViewModel;
        UserJid userJid;
        boolean z;
        Jid jid;
        C1184763p r3;
        AnonymousClass10I r2;
        int i;
        String A04;
        String A042;
        C31751g4 r32 = C31751g4.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            C30691eM.A01(obj);
            userControlMessageLevelViewModel = this.this$0;
            C135026rX r0 = userControlMessageLevelViewModel.A01;
            if (!(r0 == null || (userJid = r0.A00) == null)) {
                z = this.$isInterested;
                C128786gg r7 = (C128786gg) C18070vi.A0E(userControlMessageLevelViewModel.A0D);
                this.L$0 = userJid;
                this.L$1 = userControlMessageLevelViewModel;
                this.Z$0 = z;
                this.label = 1;
                obj = C30451dy.A00(this, r7.A02, new UpdatePreferenceProtocolApi$sendUpdatePreference$2(userJid, r7, "set_preference", (C30391dr) null, z));
                jid = userJid;
                if (obj == r32) {
                    return r32;
                }
            }
            return C27621Wu.A00;
        } else if (i2 == 1) {
            z = this.Z$0;
            userControlMessageLevelViewModel = (UserControlMessageLevelViewModel) this.L$1;
            C30691eM.A01(obj);
            jid = (Jid) this.L$0;
        } else {
            throw AnonymousClass000.A0l();
        }
        AnonymousClass1D6 r12 = (AnonymousClass1D6) obj;
        C35761ml r4 = userControlMessageLevelViewModel.A05;
        AnonymousClass206 r5 = userControlMessageLevelViewModel.A00;
        boolean A1Y = AnonymousClass000.A1Y(r12.first);
        String str = (String) r12.second;
        C18070vi.A0d(jid, 0);
        if (z) {
            r3.A01 = C17880vN.A0h();
            r3.A02 = C17880vN.A0i();
            r3.A00 = Boolean.valueOf(A1Y);
            r3.A05 = str;
            if (r5 == null) {
                A042 = null;
            } else {
                A042 = C20120A8f.A04(r5);
            }
            r3.A06 = A042;
            Long l = null;
            try {
                String str2 = jid.user;
                if (str2 != null) {
                    l = Long.valueOf(Long.parseLong(str2));
                }
            } catch (NumberFormatException unused) {
            }
            r3.A03 = l;
            r2 = r4.A04;
            i = 36;
        } else {
            r3 = new C1184763p();
            Integer A0i = C17880vN.A0i();
            r3.A01 = A0i;
            r3.A02 = A0i;
            r3.A00 = Boolean.valueOf(A1Y);
            r3.A05 = str;
            if (r5 == null) {
                A04 = null;
            } else {
                A04 = C20120A8f.A04(r5);
            }
            r3.A06 = A04;
            Long l2 = null;
            try {
                String str3 = jid.user;
                if (str3 != null) {
                    l2 = Long.valueOf(Long.parseLong(str3));
                }
            } catch (NumberFormatException unused2) {
            }
            r3.A03 = l2;
            r2 = r4.A04;
            i = 37;
        }
        r2.CGF(new C21455AkM(r4, r3, jid, i));
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((UserControlMessageLevelViewModel$sendUpdatePreference$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
