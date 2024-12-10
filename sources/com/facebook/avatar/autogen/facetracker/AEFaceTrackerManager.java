package com.facebook.avatar.autogen.facetracker;

import X.AnonymousClass1OS;
import X.AnonymousClass1OW;
import X.AnonymousClass1OX;
import X.AnonymousClass1OY;
import X.AnonymousClass3MX;
import X.C18070vi;
import X.C23871Hy;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.CUB;
import X.DAS;
import X.E48;
import android.content.Context;
import com.facebook.jni.HybridData;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.DebugMetadata;

public final class AEFaceTrackerManager implements E48 {
    public static AEFaceTrackerManager A02;
    public static DAS A03;
    public final AnonymousClass1OX A00;
    public final Context A01;
    public HybridData mHybridData;

    @DebugMetadata(c = "com.facebook.avatar.autogen.facetracker.AEFaceTrackerManager$1", f = "AEFaceTrackerManager.kt", i = {}, l = {53}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.facebook.avatar.autogen.facetracker.AEFaceTrackerManager$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r4) {
            return new AnonymousClass1(r4);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return new AnonymousClass1((C30391dr) obj2).invokeSuspend(C27621Wu.A00);
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x005e  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x006e  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                X.1g4 r6 = X.C31751g4.COROUTINE_SUSPENDED
                int r0 = r7.label
                r4 = 0
                java.lang.String r5 = "AEFaceTrackerManager"
                r1 = 1
                if (r0 == 0) goto L_0x0015
                if (r0 != r1) goto L_0x0010
                X.C30691eM.A01(r8)     // Catch:{ C1C -> 0x0039, 4tV -> 0x0046 }
                goto L_0x006b
            L_0x0010:
                java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
                throw r0
            L_0x0015:
                X.C30691eM.A01(r8)
                com.facebook.avatar.autogen.facetracker.AEFaceTrackerManager r0 = com.facebook.avatar.autogen.facetracker.AEFaceTrackerManager.this     // Catch:{ C1C -> 0x0039, 4tV -> 0x0046 }
                r7.label = r1     // Catch:{ C1C -> 0x0039, 4tV -> 0x0046 }
                X.1OX r3 = r0.A00     // Catch:{ C1C -> 0x0039, 4tV -> 0x0046 }
                com.facebook.avatar.autogen.facetracker.AEFaceTrackerManager$getModels$modelFetching$1 r2 = new com.facebook.avatar.autogen.facetracker.AEFaceTrackerManager$getModels$modelFetching$1     // Catch:{ C1C -> 0x0039, 4tV -> 0x0046 }
                r2.<init>(r0, r4)     // Catch:{ C1C -> 0x0039, 4tV -> 0x0046 }
                X.1OR r1 = X.AnonymousClass1OR.A00     // Catch:{ C1C -> 0x0039, 4tV -> 0x0046 }
                java.lang.Integer r0 = X.AnonymousClass00R.A00     // Catch:{ C1C -> 0x0039, 4tV -> 0x0046 }
                X.5WH r0 = X.C30451dy.A01(r0, r1, r2, r3)     // Catch:{ C1C -> 0x0039, 4tV -> 0x0046 }
                com.facebook.avatar.autogen.facetracker.AEFaceTrackerManager$getModels$2 r2 = new com.facebook.avatar.autogen.facetracker.AEFaceTrackerManager$getModels$2     // Catch:{ C1C -> 0x0039, 4tV -> 0x0046 }
                r2.<init>(r4, r0)     // Catch:{ C1C -> 0x0039, 4tV -> 0x0046 }
                r0 = 8000(0x1f40, double:3.9525E-320)
                java.lang.Object r0 = X.AnonymousClass4Z5.A00(r7, r2, r0)     // Catch:{ C1C -> 0x0039, 4tV -> 0x0046 }
                if (r0 != r6) goto L_0x006b
                return r6
            L_0x0039:
                r1 = move-exception
                java.lang.String r0 = "Failed to fetch facetracker models"
                X.C26294Cx6.A09(r5, r0, r1)
                X.DAS r0 = com.facebook.avatar.autogen.facetracker.AEFaceTrackerManager.A03
                if (r0 == 0) goto L_0x0069
                java.lang.Integer r2 = X.AnonymousClass00R.A0N
                goto L_0x0052
            L_0x0046:
                r1 = move-exception
                java.lang.String r0 = "Timeout fetching facetracker models"
                X.C26294Cx6.A09(r5, r0, r1)
                X.DAS r0 = com.facebook.avatar.autogen.facetracker.AEFaceTrackerManager.A03
                if (r0 == 0) goto L_0x0069
                java.lang.Integer r2 = X.AnonymousClass00R.A0Y
            L_0x0052:
                X.CkI r0 = r0.A04
                X.COL r1 = r0.A07
                int r0 = r2.intValue()
                int r0 = 3 - r0
                if (r0 == 0) goto L_0x006e
                java.lang.String r3 = "model_fetch_timeout"
            L_0x0060:
                X.DOZ r2 = r1.A00
                X.DFL r1 = r1.A01
                r0 = 36
                X.CCY.A00(r2, r1, r3, r0)
            L_0x0069:
                com.facebook.avatar.autogen.facetracker.AEFaceTrackerManager.A02 = r4
            L_0x006b:
                X.1Wu r0 = X.C27621Wu.A00
                return r0
            L_0x006e:
                java.lang.String r3 = "model_fetch_failed"
                goto L_0x0060
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.avatar.autogen.facetracker.AEFaceTrackerManager.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    private final native boolean checkImageValid(byte[] bArr, byte[] bArr2, int i, int i2);

    private final native HybridData initHybrid(Map map);

    private final native AEFaceTrackerResult processImageBuffer(byte[] bArr, int i, int i2, float f, int i3, int i4, int i5, int i6, int i7, int i8);

    public final boolean checkImage(String str) {
        C18070vi.A0d(str, 0);
        return false;
    }

    public final void destroy() {
        AnonymousClass1OW.A04((CancellationException) null, this.A00);
        A02 = null;
        A03 = null;
    }

    public AEFaceTrackerManager(Context context) {
        this.A01 = context;
        AnonymousClass1OY A022 = AnonymousClass1OW.A02(C23871Hy.A01);
        this.A00 = A022;
        AnonymousClass3MX.A1Q(new AnonymousClass1((C30391dr) null), A022);
    }

    public void C1e(CUB cub) {
    }
}
