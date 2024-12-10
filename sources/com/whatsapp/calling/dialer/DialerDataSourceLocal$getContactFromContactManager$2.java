package com.whatsapp.calling.dialer;

import X.AnonymousClass000;
import X.AnonymousClass17K;
import X.AnonymousClass1E7;
import X.AnonymousClass1OS;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C42771yi;
import X.C49392Qh;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.dialer.DialerDataSourceLocal$getContactFromContactManager$2", f = "DialerDataSourceLocal.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class DialerDataSourceLocal$getContactFromContactManager$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $enteredPhoneNumber;
    public int label;
    public final /* synthetic */ DialerDataSourceLocal this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialerDataSourceLocal$getContactFromContactManager$2(DialerDataSourceLocal dialerDataSourceLocal, String str, C30391dr r4) {
        super(2, r4);
        this.this$0 = dialerDataSourceLocal;
        this.$enteredPhoneNumber = str;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new DialerDataSourceLocal$getContactFromContactManager$2(this.this$0, this.$enteredPhoneNumber, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            AnonymousClass1E7 A0J = this.this$0.A00.A0J(this.$enteredPhoneNumber, true);
            if (A0J == null) {
                return null;
            }
            String str = this.$enteredPhoneNumber;
            C49392Qh A0D = C42771yi.A00().A0D(AnonymousClass17K.A02(A0J), str);
            C49392Qh[] r2 = new C49392Qh[2];
            r2[0] = C49392Qh.EXACT_MATCH;
            if (!C18070vi.A0O(C49392Qh.NSN_MATCH, r2, 1).contains(A0D)) {
                return null;
            }
            return A0J;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((DialerDataSourceLocal$getContactFromContactManager$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
