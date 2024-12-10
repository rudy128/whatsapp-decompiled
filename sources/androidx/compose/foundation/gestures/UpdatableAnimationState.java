package androidx.compose.foundation.gestures;

import X.AnonymousClass074;
import X.AnonymousClass0MW;
import X.C16000rY;
import X.C16830tI;

public final class UpdatableAnimationState {
    public static final AnonymousClass074 A05;
    public float A00;
    public long A01 = Long.MIN_VALUE;
    public AnonymousClass074 A02 = A05;
    public boolean A03;
    public final C16830tI A04;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.074] */
    static {
        ? obj = new Object();
        obj.A00 = 0.0f;
        A05 = obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007a A[Catch:{ all -> 0x00cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007d A[Catch:{ all -> 0x00cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009d A[Catch:{ all -> 0x00cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a9 A[Catch:{ all -> 0x00cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.C30391dr r13, X.C18090vk r14, X.C22821Di r15) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof X.C07630bV
            if (r0 == 0) goto L_0x0030
            r7 = r13
            X.0bV r7 = (X.C07630bV) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0030
            int r2 = r2 - r1
            r7.label = r2
        L_0x0012:
            java.lang.Object r10 = r7.result
            X.1g4 r6 = X.AnonymousClass3F6.A03()
            int r0 = r7.label
            r11 = 0
            r5 = 0
            r2 = -9223372036854775808
            r8 = 2
            r9 = 1
            if (r0 == 0) goto L_0x004a
            if (r0 == r9) goto L_0x003b
            if (r0 != r8) goto L_0x0036
            java.lang.Object r14 = r7.L$1
            X.0vk r14 = (X.C18090vk) r14
            java.lang.Object r4 = r7.L$0
            androidx.compose.foundation.gestures.UpdatableAnimationState r4 = (androidx.compose.foundation.gestures.UpdatableAnimationState) r4
            goto L_0x00be
        L_0x0030:
            X.0bV r7 = new X.0bV
            r7.<init>(r12, r13)
            goto L_0x0012
        L_0x0036:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x003b:
            float r1 = r7.F$0
            java.lang.Object r14 = r7.L$2
            X.0vk r14 = (X.C18090vk) r14
            java.lang.Object r15 = r7.L$1
            X.1Di r15 = (X.C22821Di) r15
            java.lang.Object r4 = r7.L$0
            androidx.compose.foundation.gestures.UpdatableAnimationState r4 = (androidx.compose.foundation.gestures.UpdatableAnimationState) r4
            goto L_0x0093
        L_0x004a:
            X.C30691eM.A01(r10)
            boolean r0 = r12.A03
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00d9
            X.0wh r1 = r7.getContext()
            X.0aN r0 = X.C17870vM.A00
            X.0wi r0 = r1.get(r0)
            X.0vM r0 = (X.C17870vM) r0
            if (r0 == 0) goto L_0x0069
            float r1 = r0.BYY()
        L_0x0065:
            r12.A03 = r9
            r4 = r12
            goto L_0x006c
        L_0x0069:
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0065
        L_0x006c:
            float r0 = r4.A00     // Catch:{ all -> 0x00cf }
            float r10 = java.lang.Math.abs(r0)     // Catch:{ all -> 0x00cf }
            r0 = 1008981770(0x3c23d70a, float:0.01)
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r0 = 0
            if (r10 >= 0) goto L_0x007b
            r0 = 1
        L_0x007b:
            if (r0 != 0) goto L_0x009f
            X.0jY r0 = new X.0jY     // Catch:{ all -> 0x00cf }
            r0.<init>(r4, r15, r1)     // Catch:{ all -> 0x00cf }
            r7.L$0 = r4     // Catch:{ all -> 0x00cf }
            r7.L$1 = r15     // Catch:{ all -> 0x00cf }
            r7.L$2 = r14     // Catch:{ all -> 0x00cf }
            r7.F$0 = r1     // Catch:{ all -> 0x00cf }
            r7.label = r9     // Catch:{ all -> 0x00cf }
            java.lang.Object r0 = X.C04460Nm.A02(r7, r0)     // Catch:{ all -> 0x00cf }
            if (r0 != r6) goto L_0x0096
            goto L_0x009e
        L_0x0093:
            X.C30691eM.A01(r10)     // Catch:{ all -> 0x00cf }
        L_0x0096:
            r14.invoke()     // Catch:{ all -> 0x00cf }
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x006c
            goto L_0x009f
        L_0x009e:
            return r6
        L_0x009f:
            float r0 = r4.A00     // Catch:{ all -> 0x00cf }
            float r0 = java.lang.Math.abs(r0)     // Catch:{ all -> 0x00cf }
            int r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r0 == 0) goto L_0x00c4
            X.0jB r1 = new X.0jB     // Catch:{ all -> 0x00cf }
            r1.<init>(r4, r15)     // Catch:{ all -> 0x00cf }
            r7.L$0 = r4     // Catch:{ all -> 0x00cf }
            r7.L$1 = r14     // Catch:{ all -> 0x00cf }
            r0 = 0
            r7.L$2 = r0     // Catch:{ all -> 0x00cf }
            r7.label = r8     // Catch:{ all -> 0x00cf }
            java.lang.Object r0 = X.C04460Nm.A02(r7, r1)     // Catch:{ all -> 0x00cf }
            if (r0 != r6) goto L_0x00c1
            return r6
        L_0x00be:
            X.C30691eM.A01(r10)     // Catch:{ all -> 0x00cf }
        L_0x00c1:
            r14.invoke()     // Catch:{ all -> 0x00cf }
        L_0x00c4:
            r4.A01 = r2
            X.074 r0 = A05
            r4.A02 = r0
            r4.A03 = r5
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x00cf:
            r1 = move-exception
            r4.A01 = r2
            X.074 r0 = A05
            r4.A02 = r0
            r4.A03 = r5
            throw r1
        L_0x00d9:
            java.lang.String r0 = "animateToZero called while previous animation is running"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.UpdatableAnimationState.A00(X.1dr, X.0vk, X.1Di):java.lang.Object");
    }

    public UpdatableAnimationState(C16000rY r3) {
        this.A04 = r3.CRk(AnonymousClass0MW.A02);
    }
}
