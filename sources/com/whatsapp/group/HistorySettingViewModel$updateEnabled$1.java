package com.whatsapp.group;

import X.AnonymousClass000;
import X.AnonymousClass1EC;
import X.AnonymousClass1G4;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C86834Tg;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.group.HistorySettingViewModel$updateEnabled$1", f = "HistorySettingViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class HistorySettingViewModel$updateEnabled$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ HistorySettingViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HistorySettingViewModel$updateEnabled$1(HistorySettingViewModel historySettingViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = historySettingViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new HistorySettingViewModel$updateEnabled$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new HistorySettingViewModel$updateEnabled$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        Object value;
        if (this.label == 0) {
            C30691eM.A01(obj);
            HistorySettingViewModel historySettingViewModel = this.this$0;
            AnonymousClass1EC r5 = historySettingViewModel.A01;
            if (r5 != null) {
                AnonymousClass1G4 r4 = historySettingViewModel.A08;
                do {
                    value = r4.getValue();
                } while (!r4.BFK(value, new C86834Tg(((C86834Tg) value).A00, historySettingViewModel.A04.A0K(r5))));
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }
}
