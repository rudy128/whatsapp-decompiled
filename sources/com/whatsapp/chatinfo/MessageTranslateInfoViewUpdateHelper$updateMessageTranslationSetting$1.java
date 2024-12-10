package com.whatsapp.chatinfo;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass1Y1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass48j;
import X.AnonymousClass4OR;
import X.C18070vi;
import X.C23761Hn;
import X.C23771Ho;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import X.C42551yM;
import X.C98494rF;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.whatsapp.ListItemWithLeftIcon;
import com.whatsapp.wds.components.toggle.WDSSwitch;
import java.util.Locale;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.chatinfo.MessageTranslateInfoViewUpdateHelper$updateMessageTranslationSetting$1", f = "MessageTranslateInfoViewUpdateHelper.kt", i = {}, l = {43}, m = "invokeSuspend", n = {}, s = {})
public final class MessageTranslateInfoViewUpdateHelper$updateMessageTranslationSetting$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ AnonymousClass4OR this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MessageTranslateInfoViewUpdateHelper$updateMessageTranslationSetting$1(AnonymousClass4OR r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new MessageTranslateInfoViewUpdateHelper$updateMessageTranslationSetting$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new MessageTranslateInfoViewUpdateHelper$updateMessageTranslationSetting$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C23771Ho r3 = C23761Hn.A01;
            MessageTranslateInfoViewUpdateHelper$updateMessageTranslationSetting$1$chatSettings$1 messageTranslateInfoViewUpdateHelper$updateMessageTranslationSetting$1$chatSettings$1 = new MessageTranslateInfoViewUpdateHelper$updateMessageTranslationSetting$1$chatSettings$1(this.this$0, (C30391dr) null);
            this.label = 1;
            obj = C30451dy.A00(this, r3, messageTranslateInfoViewUpdateHelper$updateMessageTranslationSetting$1$chatSettings$1);
            if (obj == r5) {
                return r5;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        C18070vi.A0a(obj);
        C42551yM r12 = (C42551yM) obj;
        TextView A0E = AnonymousClass3Ma.A0E(this.this$0.A02, 2131432091);
        C98494rF A00 = C98494rF.A00();
        View findViewById = this.this$0.A02.findViewById(2131432689);
        A00.element = findViewById;
        if (findViewById == null) {
            AnonymousClass4OR r0 = this.this$0;
            ListItemWithLeftIcon listItemWithLeftIcon = r0.A02;
            findViewById = new WDSSwitch(r0.A00, (AttributeSet) null, 0, 6, (AnonymousClass1Y1) null);
            findViewById.setId(2131432689);
            findViewById.setLayoutParams(AnonymousClass3Ma.A0D());
            listItemWithLeftIcon.A08(findViewById);
            A00.element = findViewById;
        }
        AnonymousClass3MY.A0w(this.this$0.A00, findViewById, 2131896025);
        ((CompoundButton) A00.element).setChecked(r12.A0P);
        ((View) A00.element).setEnabled(true);
        ((View) A00.element).setClickable(true);
        ((CompoundButton) A00.element).setOnCheckedChangeListener(this.this$0.A01);
        if (r12.A0P) {
            Context context = this.this$0.A00;
            Object[] A1b = AnonymousClass3MW.A1b();
            A1b[0] = new Locale.Builder().setLanguage(r12.A0M).build().getDisplayName();
            A1b[1] = new Locale.Builder().setLanguage(r12.A0N).build().getDisplayName();
            AnonymousClass3MY.A0y(context, A0E, A1b, 2131895908);
            A0E.setVisibility(0);
        } else {
            A0E.setVisibility(8);
        }
        AnonymousClass4OR r2 = this.this$0;
        AnonymousClass48j.A00(r2.A02, A00, r2, r12, 4);
        return C27621Wu.A00;
    }
}
