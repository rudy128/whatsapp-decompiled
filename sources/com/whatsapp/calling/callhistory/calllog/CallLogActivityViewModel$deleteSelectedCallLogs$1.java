package com.whatsapp.calling.callhistory.calllog;

import X.AnonymousClass000;
import X.AnonymousClass1G4;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.C106725Wy;
import X.C17880vN;
import X.C192619oh;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C36321nh;
import X.C93374is;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.callhistory.calllog.CallLogActivityViewModel$deleteSelectedCallLogs$1", f = "CallLogActivityViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CallLogActivityViewModel$deleteSelectedCallLogs$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ CallLogActivityViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallLogActivityViewModel$deleteSelectedCallLogs$1(CallLogActivityViewModel callLogActivityViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = callLogActivityViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new CallLogActivityViewModel$deleteSelectedCallLogs$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new CallLogActivityViewModel$deleteSelectedCallLogs$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        Object value;
        ArrayList A13;
        if (this.label == 0) {
            C30691eM.A01(obj);
            if (C17880vN.A1X(this.this$0.A0P)) {
                CallLogActivityViewModel callLogActivityViewModel = this.this$0;
                Integer num = callLogActivityViewModel.A0N;
                Integer A0v = AnonymousClass3MW.A0v(46);
                Boolean bool = callLogActivityViewModel.A0M;
                C36321nh r0 = GroupJid.Companion;
                ((C192619oh) this.this$0.A0I.get()).A01(C36321nh.A00(callLogActivityViewModel.A0F), bool, num, A0v);
                CallLogActivityViewModel callLogActivityViewModel2 = this.this$0;
                callLogActivityViewModel2.A09.A0C(C17880vN.A10(callLogActivityViewModel2.A0P));
                CallLogActivityViewModel callLogActivityViewModel3 = this.this$0;
                AnonymousClass1G4 r7 = callLogActivityViewModel3.A0T;
                do {
                    value = r7.getValue();
                    A13 = AnonymousClass000.A13();
                    for (Object next : (List) value) {
                        C106725Wy r2 = (C106725Wy) next;
                        if (!(r2 instanceof C93374is) || !callLogActivityViewModel3.A0P.contains(((C93374is) r2).A06)) {
                            A13.add(next);
                        }
                    }
                } while (!r7.BFK(value, A13));
                CallLogActivityViewModel callLogActivityViewModel4 = this.this$0;
                callLogActivityViewModel4.A0P.clear();
                CallLogActivityViewModel.A09(callLogActivityViewModel4);
                CallLogActivityViewModel callLogActivityViewModel5 = this.this$0;
                AnonymousClass3MY.A1Y(callLogActivityViewModel5.A0X, callLogActivityViewModel5.A0V());
            } else {
                Log.e("CallLogActivityViewModel/onActionItemClicked/delete: no calls selected");
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }
}
