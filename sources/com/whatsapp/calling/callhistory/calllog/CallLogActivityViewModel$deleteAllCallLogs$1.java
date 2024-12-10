package com.whatsapp.calling.callhistory.calllog;

import X.AnonymousClass000;
import X.AnonymousClass1G4;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.C18460wS;
import X.C192619oh;
import X.C27621Wu;
import X.C29351c6;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C36321nh;
import X.C93374is;
import com.whatsapp.jid.GroupJid;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.callhistory.calllog.CallLogActivityViewModel$deleteAllCallLogs$1", f = "CallLogActivityViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CallLogActivityViewModel$deleteAllCallLogs$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ CallLogActivityViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallLogActivityViewModel$deleteAllCallLogs$1(CallLogActivityViewModel callLogActivityViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = callLogActivityViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new CallLogActivityViewModel$deleteAllCallLogs$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new CallLogActivityViewModel$deleteAllCallLogs$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        Object value;
        if (this.label == 0) {
            C30691eM.A01(obj);
            CallLogActivityViewModel callLogActivityViewModel = this.this$0;
            Integer num = callLogActivityViewModel.A0N;
            Integer A0v = AnonymousClass3MW.A0v(46);
            Boolean bool = callLogActivityViewModel.A0M;
            C36321nh r0 = GroupJid.Companion;
            ((C192619oh) this.this$0.A0I.get()).A01(C36321nh.A00(callLogActivityViewModel.A0F), bool, num, A0v);
            CallLogActivityViewModel callLogActivityViewModel2 = this.this$0;
            AnonymousClass1G4 r3 = callLogActivityViewModel2.A0T;
            do {
                value = r3.getValue();
                ArrayList<C93374is> A13 = AnonymousClass000.A13();
                for (Object next : (List) value) {
                    if (next instanceof C93374is) {
                        A13.add(next);
                    }
                }
                ArrayList A0D = C29351c6.A0D(A13);
                for (C93374is r02 : A13) {
                    A0D.add(r02.A06);
                }
                callLogActivityViewModel2.A09.A0C(A0D);
                AnonymousClass3MY.A1Y(callLogActivityViewModel2.A0X, false);
            } while (!r3.BFK(value, C18460wS.A00));
            CallLogActivityViewModel callLogActivityViewModel3 = this.this$0;
            if (callLogActivityViewModel3.A0b) {
                callLogActivityViewModel3.A0G.A0E(C27621Wu.A00);
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }
}
