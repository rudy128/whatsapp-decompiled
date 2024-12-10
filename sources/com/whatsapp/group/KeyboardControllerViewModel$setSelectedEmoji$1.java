package com.whatsapp.group;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C117025z5;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C43291zZ;
import X.C72233Ld;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.group.KeyboardControllerViewModel$setSelectedEmoji$1", f = "KeyboardControllerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class KeyboardControllerViewModel$setSelectedEmoji$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ int[] $emoji;
    public final /* synthetic */ Resources $resources;
    public final /* synthetic */ C72233Ld $retry;
    public int label;
    public final /* synthetic */ KeyboardControllerViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KeyboardControllerViewModel$setSelectedEmoji$1(Resources resources, C72233Ld r3, KeyboardControllerViewModel keyboardControllerViewModel, C30391dr r5, int[] iArr) {
        super(2, r5);
        this.$emoji = iArr;
        this.this$0 = keyboardControllerViewModel;
        this.$resources = resources;
        this.$retry = r3;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        int[] iArr = this.$emoji;
        return new KeyboardControllerViewModel$setSelectedEmoji$1(this.$resources, this.$retry, this.this$0, r8, iArr);
    }

    public final Object invokeSuspend(Object obj) {
        KeyboardControllerViewModel keyboardControllerViewModel;
        int i;
        if (this.label == 0) {
            C30691eM.A01(obj);
            C117025z5 r3 = new C117025z5(this.$emoji);
            long A00 = C43291zZ.A00(r3, false);
            BitmapDrawable A06 = this.this$0.A02.A06(this.$resources, this.$retry, r3, A00);
            if (A06 != null) {
                keyboardControllerViewModel = this.this$0;
                i = 0;
            } else {
                boolean A1O = AnonymousClass000.A1O((A00 > -1 ? 1 : (A00 == -1 ? 0 : -1)));
                A06 = null;
                keyboardControllerViewModel = this.this$0;
                i = 2;
                if (!A1O) {
                    i = 1;
                }
            }
            keyboardControllerViewModel.A0T(A06, i);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((KeyboardControllerViewModel$setSelectedEmoji$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
