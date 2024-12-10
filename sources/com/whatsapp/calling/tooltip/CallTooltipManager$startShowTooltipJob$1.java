package com.whatsapp.calling.tooltip;

import X.AnonymousClass000;
import X.AnonymousClass00R;
import X.AnonymousClass1D6;
import X.AnonymousClass1DT;
import X.AnonymousClass1OS;
import X.AnonymousClass1Y5;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass4ZV;
import X.AnonymousClass6RC;
import X.AnonymousClass72C;
import X.AnonymousClass735;
import X.AnonymousClass7R9;
import X.C103905Mc;
import X.C139796zS;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C62882s9;
import X.C76603ne;
import X.C87294Va;
import X.C90334du;
import X.C90884en;
import android.content.Context;
import android.view.View;
import android.widget.PopupWindow;
import com.whatsapp.WaTextView;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.tooltip.CallTooltipManager$startShowTooltipJob$1", f = "CallTooltipManager.kt", i = {}, l = {247}, m = "invokeSuspend", n = {}, s = {})
public final class CallTooltipManager$startShowTooltipJob$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C87294Va $config;
    public int label;
    public final /* synthetic */ AnonymousClass735 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallTooltipManager$startShowTooltipJob$1(AnonymousClass735 r2, C87294Va r3, C30391dr r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$config = r3;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new CallTooltipManager$startShowTooltipJob$1(this.this$0, this.$config, r5);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass1DT r3;
        AnonymousClass6RC A05;
        Integer num;
        View findViewById;
        int i;
        int i2;
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i3 = this.label;
        if (i3 == 0) {
            C30691eM.A01(obj);
            this.this$0.A04.A0F(new C139796zS(this.$config.A05(), AnonymousClass00R.A00));
            long A04 = this.$config.A04();
            this.label = 1;
            if (C62882s9.A00(this, A04) == r5) {
                return r5;
            }
        } else if (i3 == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        View A00 = AnonymousClass735.A00(this.this$0, this.$config);
        if (A00 == null || (findViewById = A00.findViewById(this.$config.A01())) == null || !findViewById.isShown() || !this.$config.A0C(A00, (AnonymousClass72C) this.this$0.A0B.A06())) {
            C87294Va r1 = this.$config;
            r1.A09();
            r3 = this.this$0.A04;
            A05 = r1.A05();
            num = AnonymousClass00R.A0N;
        } else {
            AnonymousClass4ZV r52 = this.this$0.A08;
            C87294Va r0 = this.$config;
            Integer A07 = r0.A07();
            int A02 = r0.A02();
            long A03 = r0.A03();
            float A002 = r0.A00();
            if (r0 instanceof C76603ne) {
                i = 2131233125;
                i2 = 2131103198;
            } else {
                i = 0;
                i2 = 2131103232;
            }
            C18070vi.A0d(A07, 1);
            C103905Mc r12 = new C103905Mc(this.this$0, this.$config);
            WaTextView waTextView = r52.A02;
            waTextView.setText(A02);
            waTextView.setGravity(17);
            Context context = r52.A00;
            AnonymousClass3MX.A1C(context, waTextView, i2);
            AnonymousClass1Y5.A00(context, r52.A03, context.getString(A02));
            AnonymousClass4ZV.A01(r52, A07, i);
            PopupWindow popupWindow = r52.A01;
            popupWindow.setOnDismissListener(new C90884en(r12, 1));
            popupWindow.setOutsideTouchable(true);
            C90334du.A00(waTextView, r52, 8);
            AnonymousClass1D6 A003 = AnonymousClass4ZV.A00(findViewById, A00, r52, A07, A002);
            int A042 = AnonymousClass3MZ.A04(A003);
            int A0M = AnonymousClass000.A0M(A003.second);
            popupWindow.setAnimationStyle(2132083059);
            popupWindow.showAtLocation(A00, 8388659, A042, A0M);
            A00.postDelayed(new AnonymousClass7R9((Object) r52, 2), A03);
            this.$config.A0A();
            r3 = this.this$0.A04;
            A05 = this.$config.A05();
            num = AnonymousClass00R.A01;
        }
        r3.A0F(new C139796zS(A05, num));
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CallTooltipManager$startShowTooltipJob$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
