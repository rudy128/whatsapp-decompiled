package com.whatsapp.conversation.themes.viewModel;

import X.AnonymousClass000;
import X.AnonymousClass1BI;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.AnonymousClass4VO;
import X.C108605by;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C88434Zr;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.themes.viewModel.ChatThemeViewModel$saveSelectedMessageColor$1", f = "ChatThemeViewModel.kt", i = {}, l = {481}, m = "invokeSuspend", n = {}, s = {})
public final class ChatThemeViewModel$saveSelectedMessageColor$1 extends C30431dv implements AnonymousClass1OS {
    public Object L$0;
    public int label;
    public final /* synthetic */ ChatThemeViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatThemeViewModel$saveSelectedMessageColor$1(ChatThemeViewModel chatThemeViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = chatThemeViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new ChatThemeViewModel$saveSelectedMessageColor$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new ChatThemeViewModel$saveSelectedMessageColor$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            List A10 = AnonymousClass3MW.A10(this.this$0.A0G);
            if (A10 != null) {
                Iterator it = A10.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (((AnonymousClass4VO) obj2).A03) {
                        break;
                    }
                }
                AnonymousClass4VO r3 = (AnonymousClass4VO) obj2;
                if (r3 != null) {
                    ChatThemeViewModel chatThemeViewModel = this.this$0;
                    C108605by r2 = chatThemeViewModel.A0L;
                    C88434Zr r1 = r3.A00;
                    AnonymousClass1BI r0 = chatThemeViewModel.A0Q;
                    this.L$0 = r3;
                    this.label = 1;
                    if (r2.CGn(r1, r0, this) == r5) {
                        return r5;
                    }
                }
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }
}
