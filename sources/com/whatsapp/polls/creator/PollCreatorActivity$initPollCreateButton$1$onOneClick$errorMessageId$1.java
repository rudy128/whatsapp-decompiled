package com.whatsapp.polls.creator;

import X.AnonymousClass000;
import X.AnonymousClass1BI;
import X.AnonymousClass1OS;
import X.AnonymousClass1YF;
import X.AnonymousClass8BR;
import X.C1769596k;
import X.C17880vN;
import X.C18070vi;
import X.C18100vl;
import X.C22971Dz;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C72453Mb;
import X.C88184Yq;
import android.content.Intent;
import com.whatsapp.jid.Jid;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.polls.creator.PollCreatorActivity$initPollCreateButton$1$onOneClick$errorMessageId$1", f = "PollCreatorActivity.kt", i = {}, l = {277}, m = "invokeSuspend", n = {}, s = {})
public final class PollCreatorActivity$initPollCreateButton$1$onOneClick$errorMessageId$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1BI $chatJidNonNull;
    public int label;
    public final /* synthetic */ PollCreatorActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PollCreatorActivity$initPollCreateButton$1$onOneClick$errorMessageId$1(AnonymousClass1BI r2, PollCreatorActivity pollCreatorActivity, C30391dr r4) {
        super(2, r4);
        this.this$0 = pollCreatorActivity;
        this.$chatJidNonNull = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new PollCreatorActivity$initPollCreateButton$1$onOneClick$errorMessageId$1(this.$chatJidNonNull, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            boolean A0a = C22971Dz.A0a((Jid) this.this$0.A07.getValue());
            PollCreatorActivity pollCreatorActivity = this.this$0;
            C18100vl r0 = pollCreatorActivity.A0E;
            if (A0a) {
                PollCreatorViewModel A0d = AnonymousClass8BR.A0d(r0);
                Intent A0A = C17880vN.A0A();
                A0A.putExtra("poll_name", PollCreatorViewModel.A00(A0d));
                List<C1769596k> list = A0d.A0D;
                ArrayList A13 = AnonymousClass000.A13();
                for (C1769596k r02 : list) {
                    String str2 = r02.A00;
                    if (!AnonymousClass1YF.A0T(str2)) {
                        A13.add(str2);
                    }
                }
                A0A.putStringArrayListExtra("poll_options", C17880vN.A10(A13));
                C1769596k r03 = (C1769596k) A0d.A03.A06();
                if (r03 != null) {
                    str = r03.A00;
                } else {
                    str = null;
                }
                A0A.putExtra("poll_correct_option", str);
                A0A.putExtra("poll_is_single_choice", !C72453Mb.A1Y((Boolean) A0d.A05.A06()));
                A0A.putExtra("poll_type", C72453Mb.A1Y((Boolean) A0d.A07.A06()) ? 1 : 0);
                pollCreatorActivity.setResult(-1, A0A);
                this.this$0.finish();
                this.this$0.overridePendingTransition(0, 2130772059);
                return C27621Wu.A00;
            }
            PollCreatorViewModel A0d2 = AnonymousClass8BR.A0d(r0);
            PollCreatorActivity pollCreatorActivity2 = this.this$0;
            AnonymousClass1BI r2 = this.$chatJidNonNull;
            long A0K = C72453Mb.A0K(pollCreatorActivity2.A0F);
            this.label = 1;
            if (A0d2.A0U(r2, this, A0K) == r5) {
                return r5;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        C88184Yq r1 = this.this$0.A03;
        if (r1 != null) {
            r1.A03(10);
            this.this$0.setResult(-1);
            this.this$0.finish();
            this.this$0.overridePendingTransition(0, 2130772059);
            return C27621Wu.A00;
        }
        C18070vi.A11("conversationAttachmentEventLogger");
        throw null;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((PollCreatorActivity$initPollCreateButton$1$onOneClick$errorMessageId$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
