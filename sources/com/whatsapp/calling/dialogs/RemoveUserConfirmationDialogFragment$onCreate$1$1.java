package com.whatsapp.calling.dialogs;

import X.AnonymousClass000;
import X.AnonymousClass1E7;
import X.AnonymousClass1M9;
import X.AnonymousClass1OS;
import X.AnonymousClass3MY;
import X.C17960vV;
import X.C18070vi;
import X.C24921Me;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.dialogs.RemoveUserConfirmationDialogFragment$onCreate$1$1", f = "RemoveUserConfirmationDialogFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class RemoveUserConfirmationDialogFragment$onCreate$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ UserJid $it;
    public int label;
    public final /* synthetic */ RemoveUserConfirmationDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RemoveUserConfirmationDialogFragment$onCreate$1$1(RemoveUserConfirmationDialogFragment removeUserConfirmationDialogFragment, UserJid userJid, C30391dr r4) {
        super(2, r4);
        this.this$0 = removeUserConfirmationDialogFragment;
        this.$it = userJid;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new RemoveUserConfirmationDialogFragment$onCreate$1$1(this.this$0, this.$it, r5);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        if (this.label == 0) {
            C30691eM.A01(obj);
            AnonymousClass1M9 r1 = this.this$0.A00;
            if (r1 != null) {
                AnonymousClass1E7 A0H = r1.A0H(this.$it);
                RemoveUserConfirmationDialogFragment removeUserConfirmationDialogFragment = this.this$0;
                C24921Me r0 = removeUserConfirmationDialogFragment.A01;
                if (r0 != null) {
                    String A0q = AnonymousClass3MY.A0q(r0, A0H);
                    C17960vV.A07(A0q);
                    removeUserConfirmationDialogFragment.A02 = A0q;
                    return C27621Wu.A00;
                }
                str = "waContactNames";
            } else {
                str = "contactManager";
            }
            C18070vi.A11(str);
            throw null;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((RemoveUserConfirmationDialogFragment$onCreate$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
