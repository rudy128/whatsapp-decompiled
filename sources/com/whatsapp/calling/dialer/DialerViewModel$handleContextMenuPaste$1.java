package com.whatsapp.calling.dialer;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.dialer.DialerViewModel$handleContextMenuPaste$1", f = "DialerViewModel.kt", i = {}, l = {176}, m = "invokeSuspend", n = {}, s = {})
public final class DialerViewModel$handleContextMenuPaste$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $clipText;
    public int label;
    public final /* synthetic */ DialerViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialerViewModel$handleContextMenuPaste$1(DialerViewModel dialerViewModel, String str, C30391dr r4) {
        super(2, r4);
        this.this$0 = dialerViewModel;
        this.$clipText = str;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new DialerViewModel$handleContextMenuPaste$1(this.this$0, this.$clipText, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            DialerHelper dialerHelper = this.this$0.A04;
            String str = this.$clipText;
            this.label = 1;
            obj = C30451dy.A00(this, dialerHelper.A04, new DialerHelper$sanitizePastedString$2(str, (C30391dr) null));
            if (obj == r5) {
                return r5;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        String str2 = (String) obj;
        if (str2 == null) {
            str2 = "";
        }
        int length = str2.length();
        if (1 <= length && length < 33) {
            StringBuilder sb = this.this$0.A0C;
            C18070vi.A0d(sb, 0);
            sb.setLength(0);
            DialerViewModel dialerViewModel = this.this$0;
            dialerViewModel.A0C.append(str2);
            DialerViewModel.A03(dialerViewModel);
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((DialerViewModel$handleContextMenuPaste$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
