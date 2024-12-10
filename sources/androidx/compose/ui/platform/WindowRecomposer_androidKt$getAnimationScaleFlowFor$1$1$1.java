package androidx.compose.ui.platform;

import X.AnonymousClass04O;
import X.AnonymousClass1G2;
import X.AnonymousClass1OS;
import X.C108485bm;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1", f = "WindowRecomposer.android.kt", i = {0, 1}, l = {115, 121}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
public final class WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Uri $animationScaleUri;
    public final /* synthetic */ Context $applicationContext;
    public final /* synthetic */ C108485bm $channel;
    public final /* synthetic */ AnonymousClass04O $contentObserver;
    public final /* synthetic */ ContentResolver $resolver;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(ContentResolver contentResolver, Context context, Uri uri, AnonymousClass04O r5, C30391dr r6, C108485bm r7) {
        super(2, r6);
        this.$resolver = contentResolver;
        this.$animationScaleUri = uri;
        this.$contentObserver = r5;
        this.$channel = r7;
        this.$applicationContext = context;
    }

    /* renamed from: A00 */
    public final Object invoke(C30391dr r3, AnonymousClass1G2 r4) {
        return ((WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1) create(r4, r3)).invokeSuspend(C27621Wu.A00);
    }

    public final C30391dr create(Object obj, C30391dr r9) {
        WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 = new WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(this.$resolver, this.$applicationContext, this.$animationScaleUri, this.$contentObserver, r9, this.$channel);
        windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1.L$0 = obj;
        return windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0056 A[Catch:{ all -> 0x0085 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            X.1g4 r6 = X.AnonymousClass3F6.A03()
            int r0 = r8.label
            r5 = 2
            r4 = 1
            if (r0 == 0) goto L_0x0025
            if (r0 == r4) goto L_0x001c
            if (r0 != r5) goto L_0x0017
            java.lang.Object r7 = r8.L$1
            X.DXm r7 = (X.C27177DXm) r7
            java.lang.Object r3 = r8.L$0
            X.1G2 r3 = (X.AnonymousClass1G2) r3
            goto L_0x003d
        L_0x0017:
            java.lang.IllegalStateException r2 = X.AnonymousClass000.A0l()
            throw r2
        L_0x001c:
            java.lang.Object r7 = r8.L$1
            X.DXm r7 = (X.C27177DXm) r7
            java.lang.Object r3 = r8.L$0
            X.1G2 r3 = (X.AnonymousClass1G2) r3
            goto L_0x004d
        L_0x0025:
            X.C30691eM.A01(r9)
            java.lang.Object r3 = r8.L$0
            X.1G2 r3 = (X.AnonymousClass1G2) r3
            android.content.ContentResolver r7 = r8.$resolver
            android.net.Uri r2 = r8.$animationScaleUri
            X.04O r1 = r8.$contentObserver
            r0 = 0
            r7.registerContentObserver(r2, r0, r1)
            X.5bm r0 = r8.$channel     // Catch:{ all -> 0x0085 }
            X.DXm r7 = r0.Bh9()     // Catch:{ all -> 0x0085 }
            goto L_0x0040
        L_0x003d:
            X.C30691eM.A01(r9)     // Catch:{ all -> 0x0085 }
        L_0x0040:
            r8.L$0 = r3     // Catch:{ all -> 0x0085 }
            r8.L$1 = r7     // Catch:{ all -> 0x0085 }
            r8.label = r4     // Catch:{ all -> 0x0085 }
            java.lang.Object r9 = r7.A01(r8)     // Catch:{ all -> 0x0085 }
            if (r9 != r6) goto L_0x0050
            goto L_0x0079
        L_0x004d:
            X.C30691eM.A01(r9)     // Catch:{ all -> 0x0085 }
        L_0x0050:
            boolean r0 = X.AnonymousClass000.A1Y(r9)     // Catch:{ all -> 0x0085 }
            if (r0 == 0) goto L_0x007b
            r7.A00()     // Catch:{ all -> 0x0085 }
            android.content.Context r0 = r8.$applicationContext     // Catch:{ all -> 0x0085 }
            android.content.ContentResolver r2 = r0.getContentResolver()     // Catch:{ all -> 0x0085 }
            java.lang.String r1 = "animator_duration_scale"
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = android.provider.Settings.Global.getFloat(r2, r1, r0)     // Catch:{ all -> 0x0085 }
            java.lang.Float r0 = new java.lang.Float     // Catch:{ all -> 0x0085 }
            r0.<init>(r1)     // Catch:{ all -> 0x0085 }
            r8.L$0 = r3     // Catch:{ all -> 0x0085 }
            r8.L$1 = r7     // Catch:{ all -> 0x0085 }
            r8.label = r5     // Catch:{ all -> 0x0085 }
            java.lang.Object r0 = r3.BJt(r0, r8)     // Catch:{ all -> 0x0085 }
            if (r0 != r6) goto L_0x0040
            goto L_0x007a
        L_0x0079:
            return r6
        L_0x007a:
            return r6
        L_0x007b:
            android.content.ContentResolver r1 = r8.$resolver
            X.04O r0 = r8.$contentObserver
            r1.unregisterContentObserver(r0)
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0085:
            r2 = move-exception
            android.content.ContentResolver r1 = r8.$resolver
            X.04O r0 = r8.$contentObserver
            r1.unregisterContentObserver(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
