package com.whatsapp.contact.picker.viewmodels;

import X.AnonymousClass000;
import X.AnonymousClass1EC;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.AnonymousClass3U0;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C36321nh;
import X.C72463Mc;
import X.C81233yu;
import X.C81673zc;
import com.whatsapp.jid.GroupJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.contact.picker.viewmodels.AddGroupParticipantsSelectorViewModel$maybeLogAddMemberPageOpened$1", f = "AddGroupParticipantsSelectorViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AddGroupParticipantsSelectorViewModel$maybeLogAddMemberPageOpened$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ int $entryPoint;
    public final /* synthetic */ AnonymousClass1EC $gid;
    public int label;
    public final /* synthetic */ AnonymousClass3U0 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddGroupParticipantsSelectorViewModel$maybeLogAddMemberPageOpened$1(AnonymousClass3U0 r2, AnonymousClass1EC r3, C30391dr r4, int i) {
        super(2, r4);
        this.$entryPoint = i;
        this.$gid = r3;
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        int i = this.$entryPoint;
        return new AddGroupParticipantsSelectorViewModel$maybeLogAddMemberPageOpened$1(this.this$0, this.$gid, r6, i);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            C81233yu r2 = new C81233yu();
            r2.A00 = AnonymousClass3MW.A0v(this.$entryPoint);
            AnonymousClass1EC r1 = this.$gid;
            if (r1 != null) {
                C36321nh r0 = GroupJid.Companion;
                if (C36321nh.A02(r1.user)) {
                    r2.A01 = r1.getRawString();
                }
            }
            this.this$0.A05.CC7(r2);
            C72463Mc.A1E(new C81673zc(), this.this$0.A06, 90, 0, true);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AddGroupParticipantsSelectorViewModel$maybeLogAddMemberPageOpened$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
