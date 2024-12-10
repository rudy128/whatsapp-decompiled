package androidx.compose.ui.window;

import X.AnonymousClass1OS;
import X.BJD;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5", f = "AndroidPopup.android.kt", i = {0}, l = {303}, m = "invokeSuspend", n = {"$this$LaunchedEffect"}, s = {"L$0"})
public final class AndroidPopup_androidKt$Popup$5 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ BJD $popupLayout;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidPopup_androidKt$Popup$5(BJD bjd, C30391dr r3) {
        super(2, r3);
        this.$popupLayout = bjd;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        AndroidPopup_androidKt$Popup$5 androidPopup_androidKt$Popup$5 = new AndroidPopup_androidKt$Popup$5(this.$popupLayout, r4);
        androidPopup_androidKt$Popup$5.L$0 = obj;
        return androidPopup_androidKt$Popup$5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            X.1g4 r7 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r9.label
            r6 = 1
            if (r0 == 0) goto L_0x0045
            if (r0 != r6) goto L_0x0050
            java.lang.Object r5 = r9.L$0
            X.1OX r5 = (X.AnonymousClass1OX) r5
            X.C30691eM.A01(r10)
        L_0x0010:
            X.BJD r8 = r9.$popupLayout
            int[] r4 = r8.A0H
            r3 = 0
            r2 = r4[r3]
            r1 = r4[r6]
            android.view.View r0 = r8.A08
            r0.getLocationOnScreen(r4)
            r0 = r4[r3]
            if (r2 != r0) goto L_0x0026
            r0 = r4[r6]
            if (r1 == r0) goto L_0x0029
        L_0x0026:
            r8.A07()
        L_0x0029:
            boolean r0 = X.AnonymousClass1OW.A05(r5)
            if (r0 == 0) goto L_0x004d
            X.Drf r2 = X.C28121Drf.A00
            r9.L$0 = r5
            r9.label = r6
            X.0wh r1 = r9.getContext()
            X.0aO r0 = X.C17850vK.A00
            r1.get(r0)
            java.lang.Object r0 = X.C04460Nm.A02(r9, r2)
            if (r0 != r7) goto L_0x0010
            return r7
        L_0x0045:
            X.C30691eM.A01(r10)
            java.lang.Object r5 = r9.L$0
            X.1OX r5 = (X.AnonymousClass1OX) r5
            goto L_0x0029
        L_0x004d:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0050:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AndroidPopup_androidKt$Popup$5) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
