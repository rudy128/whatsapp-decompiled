package com.whatsapp.usercontrol.view;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass206;
import X.C108965cb;
import X.C1184763p;
import X.C121596Kp;
import X.C122666Rg;
import X.C135026rX;
import X.C138056wS;
import X.C17880vN;
import X.C20120A8f;
import X.C21450AkH;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C35761ml;
import X.C35771mm;
import X.C83864Gy;
import android.content.Context;
import com.whatsapp.jid.UserJid;
import com.whatsapp.usercontrol.viewmodel.UserControlMessageLevelViewModel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.usercontrol.view.UserControlBaseFragment$onActionClicked$1", f = "UserControlBaseFragment.kt", i = {}, l = {191}, m = "invokeSuspend", n = {}, s = {})
public final class UserControlBaseFragment$onActionClicked$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C122666Rg $action;
    public int label;
    public final /* synthetic */ UserControlBaseFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserControlBaseFragment$onActionClicked$1(C122666Rg r2, UserControlBaseFragment userControlBaseFragment, C30391dr r4) {
        super(2, r4);
        this.this$0 = userControlBaseFragment;
        this.$action = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new UserControlBaseFragment$onActionClicked$1(this.$action, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        UserJid userJid;
        String A04;
        UserJid userJid2;
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            UserControlMessageLevelViewModel A0e = C108965cb.A0e(this.this$0);
            C122666Rg r3 = this.$action;
            Context A14 = this.this$0.A14();
            this.label = 1;
            int ordinal = r3.ordinal();
            if (ordinal == 3 || ordinal == 4) {
                if (UserControlMessageLevelViewModel.A00(A14, r3, A0e, this) == r4) {
                    return r4;
                }
            } else if (ordinal == 12) {
                A0e.A09.A0F(C121596Kp.A00);
                C135026rX r0 = A0e.A01;
                if (r0 != null) {
                    userJid = r0.A00;
                    if (userJid != null) {
                        C138056wS.A00(A14, userJid, "quick_action", ((C35771mm) A0e.A07.A01.get()).A08(userJid));
                    }
                } else {
                    userJid = null;
                }
                A0e.A05.A01(userJid, A0e.A00, "quick_action", (String) null, 0, true, false);
            } else if (ordinal == 13) {
                C135026rX r02 = A0e.A01;
                if (!(r02 == null || (userJid2 = r02.A00) == null)) {
                    A14.startActivity(C83864Gy.A00(A14, userJid2, "feedback_not_interested_block", false, false, false, false, true, true));
                }
                C35761ml r5 = A0e.A05;
                AnonymousClass206 r1 = A0e.A00;
                C1184763p r42 = new C1184763p();
                r42.A01 = C17880vN.A0k();
                r42.A02 = C17880vN.A0i();
                if (r1 == null) {
                    A04 = null;
                } else {
                    A04 = C20120A8f.A04(r1);
                }
                r42.A06 = A04;
                r42.A00 = true;
                r5.A04.CGF(new C21450AkH(r5, r42, 46));
                A0e.A09.A0F(C121596Kp.A00);
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((UserControlBaseFragment$onActionClicked$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
