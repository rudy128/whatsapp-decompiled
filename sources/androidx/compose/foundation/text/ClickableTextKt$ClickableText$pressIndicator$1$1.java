package androidx.compose.foundation.text;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass3F6;
import X.C10940jE;
import X.C17330uU;
import X.C17730v8;
import X.C22821Di;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.text.ClickableTextKt$ClickableText$pressIndicator$1$1", f = "ClickableText.kt", i = {}, l = {82}, m = "invokeSuspend", n = {}, s = {})
public final class ClickableTextKt$ClickableText$pressIndicator$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C17330uU $layoutResult;
    public final /* synthetic */ C22821Di $onClick;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClickableTextKt$ClickableText$pressIndicator$1$1(C17330uU r2, C30391dr r3, C22821Di r4) {
        super(2, r3);
        this.$layoutResult = r2;
        this.$onClick = r4;
    }

    /* renamed from: A00 */
    public final Object invoke(C17730v8 r3, C30391dr r4) {
        return ((ClickableTextKt$ClickableText$pressIndicator$1$1) create(r3, r4)).invokeSuspend(C27621Wu.A00);
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        ClickableTextKt$ClickableText$pressIndicator$1$1 clickableTextKt$ClickableText$pressIndicator$1$1 = new ClickableTextKt$ClickableText$pressIndicator$1$1(this.$layoutResult, r5, this.$onClick);
        clickableTextKt$ClickableText$pressIndicator$1$1.L$0 = obj;
        return clickableTextKt$ClickableText$pressIndicator$1$1;
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 A03 = AnonymousClass3F6.A03();
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C10940jE r0 = new C10940jE(this.$layoutResult, this.$onClick);
            this.label = 1;
            if (TapGestureDetectorKt.A0A((C17730v8) this.L$0, this, r0, TapGestureDetectorKt.A00) == A03) {
                return A03;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }
}
