package androidx.compose.ui.platform;

import X.AnonymousClass0Y6;
import X.AnonymousClass1F9;
import X.AnonymousClass1OS;
import X.AnonymousClass1OX;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C98494rF;
import android.view.View;
import androidx.compose.runtime.Recomposer;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1", f = "WindowRecomposer.android.kt", i = {0}, l = {394}, m = "invokeSuspend", n = {"durationScaleJob"}, s = {"L$0"})
public final class WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Recomposer $recomposer;
    public final /* synthetic */ AnonymousClass0Y6 $self;
    public final /* synthetic */ AnonymousClass1F9 $source;
    public final /* synthetic */ C98494rF $systemDurationScaleSettingConsumer;
    public final /* synthetic */ View $this_createLifecycleAwareWindowRecomposer;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1(View view, Recomposer recomposer, AnonymousClass0Y6 r4, AnonymousClass1F9 r5, C30391dr r6, C98494rF r7) {
        super(2, r6);
        this.$systemDurationScaleSettingConsumer = r7;
        this.$recomposer = recomposer;
        this.$source = r5;
        this.$self = r4;
        this.$this_createLifecycleAwareWindowRecomposer = view;
    }

    /* renamed from: A00 */
    public final Object invoke(C30391dr r3, AnonymousClass1OX r4) {
        return ((WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1) create(r4, r3)).invokeSuspend(C27621Wu.A00);
    }

    public final C30391dr create(Object obj, C30391dr r9) {
        C98494rF r6 = this.$systemDurationScaleSettingConsumer;
        Recomposer recomposer = this.$recomposer;
        AnonymousClass1F9 r4 = this.$source;
        WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1 windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1 = new WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1(this.$this_createLifecycleAwareWindowRecomposer, recomposer, this.$self, r4, r9, r6);
        windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1.L$0 = obj;
        return windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0072  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            X.1g4 r6 = X.AnonymousClass3F6.A03()
            int r0 = r8.label
            r7 = 1
            r5 = 0
            if (r0 == 0) goto L_0x001b
            if (r0 != r7) goto L_0x0016
            java.lang.Object r5 = r8.L$0
            X.1OB r5 = (X.AnonymousClass1OB) r5
            X.C30691eM.A01(r9)     // Catch:{ all -> 0x0014 }
            goto L_0x005a
        L_0x0014:
            r2 = move-exception
            goto L_0x0070
        L_0x0016:
            java.lang.IllegalStateException r2 = X.AnonymousClass000.A0l()
            throw r2
        L_0x001b:
            X.C30691eM.A01(r9)
            java.lang.Object r4 = r8.L$0
            X.1OX r4 = (X.AnonymousClass1OX) r4
            X.4rF r0 = r8.$systemDurationScaleSettingConsumer     // Catch:{ all -> 0x006d }
            java.lang.Object r3 = r0.element     // Catch:{ all -> 0x006d }
            X.0WE r3 = (X.AnonymousClass0WE) r3     // Catch:{ all -> 0x006d }
            if (r3 == 0) goto L_0x004d
            android.view.View r0 = r8.$this_createLifecycleAwareWindowRecomposer     // Catch:{ all -> 0x006d }
            android.content.Context r0 = r0.getContext()     // Catch:{ all -> 0x006d }
            android.content.Context r0 = r0.getApplicationContext()     // Catch:{ all -> 0x006d }
            X.1G1 r2 = X.AnonymousClass0QD.A04(r0)     // Catch:{ all -> 0x006d }
            java.lang.Object r0 = r2.getValue()     // Catch:{ all -> 0x006d }
            float r0 = X.AnonymousClass000.A04(r0)     // Catch:{ all -> 0x006d }
            r3.A00(r0)     // Catch:{ all -> 0x006d }
            androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1 r1 = new androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1     // Catch:{ all -> 0x006d }
            r1.<init>(r3, r5, r2)     // Catch:{ all -> 0x006d }
            r0 = 3
            X.1e4 r5 = X.AnonymousClass4Z4.A02(r5, r5, r1, r4, r0)     // Catch:{ all -> 0x006d }
        L_0x004d:
            androidx.compose.runtime.Recomposer r0 = r8.$recomposer     // Catch:{ all -> 0x006f }
            r8.L$0 = r5     // Catch:{ all -> 0x006f }
            r8.label = r7     // Catch:{ all -> 0x006f }
            java.lang.Object r0 = r0.A0h(r8)     // Catch:{ all -> 0x006f }
            if (r0 != r6) goto L_0x005a
            return r6
        L_0x005a:
            if (r5 == 0) goto L_0x005f
            r5.BEM((java.util.concurrent.CancellationException) null)
        L_0x005f:
            X.1F9 r0 = r8.$source
            X.1Fv r1 = r0.getLifecycle()
            X.0Y6 r0 = r8.$self
            r1.A06(r0)
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x006d:
            r2 = move-exception
            goto L_0x0070
        L_0x006f:
            r2 = move-exception
        L_0x0070:
            if (r5 == 0) goto L_0x0075
            r5.BEM((java.util.concurrent.CancellationException) null)
        L_0x0075:
            X.1F9 r0 = r8.$source
            X.1Fv r1 = r0.getLifecycle()
            X.0Y6 r0 = r8.$self
            r1.A06(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
