package com.whatsapp.conversation.themes.viewModel;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import android.content.Context;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.themes.viewModel.ChatThemeViewModel$onMessageColorChecked$1", f = "ChatThemeViewModel.kt", i = {0, 0, 0}, l = {348}, m = "invokeSuspend", n = {"destination$iv$iv", "newBundle", "index$iv$iv"}, s = {"L$2", "L$4", "I$2"})
public final class ChatThemeViewModel$onMessageColorChecked$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ int $dimLevel;
    public final /* synthetic */ int $position;
    public int I$0;
    public int I$1;
    public int I$2;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public int label;
    public final /* synthetic */ ChatThemeViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatThemeViewModel$onMessageColorChecked$1(Context context, ChatThemeViewModel chatThemeViewModel, C30391dr r4, int i, int i2) {
        super(2, r4);
        this.this$0 = chatThemeViewModel;
        this.$position = i;
        this.$context = context;
        this.$dimLevel = i2;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        return new ChatThemeViewModel$onMessageColorChecked$1(this.$context, this.this$0, r8, this.$position, this.$dimLevel);
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x003f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            X.1g4 r14 = X.C31751g4.COROUTINE_SUSPENDED
            r13 = r17
            int r0 = r13.label
            r12 = 1
            if (r0 == 0) goto L_0x0097
            if (r0 != r12) goto L_0x00b6
            int r1 = r13.I$2
            int r11 = r13.I$1
            int r10 = r13.I$0
            java.lang.Object r9 = r13.L$6
            java.util.Collection r9 = (java.util.Collection) r9
            java.lang.Object r8 = r13.L$5
            X.1DS r8 = (X.AnonymousClass1DS) r8
            java.lang.Object r7 = r13.L$4
            java.lang.Object r6 = r13.L$3
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r3 = r13.L$2
            java.util.Collection r3 = (java.util.Collection) r3
            java.lang.Object r5 = r13.L$1
            android.content.Context r5 = (android.content.Context) r5
            java.lang.Object r4 = r13.L$0
            com.whatsapp.conversation.themes.viewModel.ChatThemeViewModel r4 = (com.whatsapp.conversation.themes.viewModel.ChatThemeViewModel) r4
            X.C30691eM.A01(r18)
        L_0x002e:
            X.4aW r2 = r4.A0T
            X.1BI r0 = r4.A0Q
            r2.A0G(r5, r0, r11)
        L_0x0035:
            r9.add(r7)
            r9 = r3
        L_0x0039:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00bc
            java.lang.Object r15 = r6.next()
            int r16 = r1 + 1
            if (r1 >= 0) goto L_0x004c
            X.AnonymousClass1ZU.A0B()
            r0 = 0
            throw r0
        L_0x004c:
            X.4VO r15 = (X.AnonymousClass4VO) r15
            boolean r3 = X.AnonymousClass000.A1T(r1, r10)
            X.1DT r0 = r4.A0H
            java.lang.Object r2 = r0.A06()
            X.4SC r2 = (X.AnonymousClass4SC) r2
            if (r2 != 0) goto L_0x005e
            X.4SC r2 = r15.A01
        L_0x005e:
            X.C18070vi.A0b(r2)
            X.4Zr r1 = r15.A00
            r0 = 0
            X.4VO r7 = new X.4VO
            r7.<init>(r1, r2, r0, r3)
            if (r3 == 0) goto L_0x0093
            X.5by r3 = r4.A0L
            X.4Zr r2 = r15.A00
            X.1BI r1 = r4.A0Q
            r13.L$0 = r4
            r13.L$1 = r5
            r13.L$2 = r9
            r13.L$3 = r6
            r13.L$4 = r7
            r13.L$5 = r8
            r13.L$6 = r9
            r13.I$0 = r10
            r13.I$1 = r11
            r0 = r16
            r13.I$2 = r0
            r13.label = r12
            java.lang.Object r0 = r3.CGn(r2, r1, r13)
            if (r0 == r14) goto L_0x00c1
            r3 = r9
            r1 = r16
            goto L_0x002e
        L_0x0093:
            r3 = r9
            r1 = r16
            goto L_0x0035
        L_0x0097:
            X.C30691eM.A01(r18)
            com.whatsapp.conversation.themes.viewModel.ChatThemeViewModel r0 = r13.this$0
            X.1DT r8 = r0.A0G
            java.util.List r0 = X.AnonymousClass3MW.A10(r8)
            if (r0 == 0) goto L_0x00bb
            int r10 = r13.$position
            com.whatsapp.conversation.themes.viewModel.ChatThemeViewModel r4 = r13.this$0
            android.content.Context r5 = r13.$context
            int r11 = r13.$dimLevel
            java.util.ArrayList r9 = X.C29351c6.A0D(r0)
            java.util.Iterator r6 = r0.iterator()
            r1 = 0
            goto L_0x0039
        L_0x00b6:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x00bb:
            r9 = 0
        L_0x00bc:
            r8.A0E(r9)
            X.1Wu r14 = X.C27621Wu.A00
        L_0x00c1:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.themes.viewModel.ChatThemeViewModel$onMessageColorChecked$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ChatThemeViewModel$onMessageColorChecked$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
