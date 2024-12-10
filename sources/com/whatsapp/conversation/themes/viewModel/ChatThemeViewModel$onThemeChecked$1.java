package com.whatsapp.conversation.themes.viewModel;

import X.AnonymousClass000;
import X.AnonymousClass1BI;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass4D5;
import X.AnonymousClass4VO;
import X.C108605by;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C88434Zr;
import android.content.Context;
import java.io.IOException;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.themes.viewModel.ChatThemeViewModel$onThemeChecked$1", f = "ChatThemeViewModel.kt", i = {}, l = {319, 322}, m = "invokeSuspend", n = {}, s = {})
public final class ChatThemeViewModel$onThemeChecked$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ int $dimLevel;
    public final /* synthetic */ C88434Zr $messageColor;
    public final /* synthetic */ int $position;
    public final /* synthetic */ AnonymousClass4VO $selectedThemeBundle;
    public final /* synthetic */ AnonymousClass4D5 $shouldOverrideCustomisations;
    public Object L$0;
    public int label;
    public final /* synthetic */ ChatThemeViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatThemeViewModel$onThemeChecked$1(Context context, AnonymousClass4VO r3, C88434Zr r4, AnonymousClass4D5 r5, ChatThemeViewModel chatThemeViewModel, C30391dr r7, int i, int i2) {
        super(2, r7);
        this.this$0 = chatThemeViewModel;
        this.$position = i;
        this.$selectedThemeBundle = r3;
        this.$messageColor = r4;
        this.$context = context;
        this.$dimLevel = i2;
        this.$shouldOverrideCustomisations = r5;
    }

    public final C30391dr create(Object obj, C30391dr r11) {
        ChatThemeViewModel chatThemeViewModel = this.this$0;
        int i = this.$position;
        AnonymousClass4VO r2 = this.$selectedThemeBundle;
        C88434Zr r3 = this.$messageColor;
        return new ChatThemeViewModel$onThemeChecked$1(this.$context, r2, r3, this.$shouldOverrideCustomisations, chatThemeViewModel, r11, i, this.$dimLevel);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass4VO r7;
        AnonymousClass4VO r9;
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            try {
                List A10 = AnonymousClass3MW.A10(this.this$0.A0F);
                if (!(A10 == null || (r7 = (AnonymousClass4VO) A10.get(this.$position)) == null)) {
                    C88434Zr r3 = this.$messageColor;
                    ChatThemeViewModel chatThemeViewModel = this.this$0;
                    Context context = this.$context;
                    int i2 = this.$dimLevel;
                    AnonymousClass4D5 r10 = this.$shouldOverrideCustomisations;
                    if (C18070vi.A18(r7.A00, r3)) {
                        r9 = r7;
                    } else {
                        r9 = new AnonymousClass4VO(r3, r7.A01, r7.A02, r7.A03);
                    }
                    this.L$0 = r7;
                    this.label = 1;
                    if (ChatThemeViewModel.A04(context, r9, r10, chatThemeViewModel, this, i2) == r6) {
                        return r6;
                    }
                }
            } catch (IOException unused) {
                AnonymousClass3MY.A1M(this.this$0.A0W, false);
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else if (i == 2) {
            C30691eM.A01(obj);
            AnonymousClass3MY.A1M(this.this$0.A0W, true);
            this.this$0.A04 = true;
            return C27621Wu.A00;
        } else {
            throw AnonymousClass000.A0l();
        }
        AnonymousClass4VO r32 = this.$selectedThemeBundle;
        if (r32 != null) {
            ChatThemeViewModel chatThemeViewModel2 = this.this$0;
            C108605by r2 = chatThemeViewModel2.A0L;
            AnonymousClass1BI r1 = chatThemeViewModel2.A0Q;
            this.L$0 = null;
            this.label = 2;
            r2.CGm(r32, r1);
        }
        AnonymousClass3MY.A1M(this.this$0.A0W, true);
        this.this$0.A04 = true;
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ChatThemeViewModel$onThemeChecked$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
