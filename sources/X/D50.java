package X;

import android.view.View;

public final class D50 implements View.OnTouchListener {
    public C24483C5z A00;

    /* JADX WARNING: Code restructure failed: missing block: B:217:0x058f, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00c8, code lost:
        if (r0.A08 == -1) goto L_0x00ca;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x025f  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0337  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x03cd  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x040b  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x04d6  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0535  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x0568  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00c0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r31, android.view.MotionEvent r32) {
        /*
            r30 = this;
            r6 = 1
            r1 = r32
            X.C18070vi.A0d(r1, r6)
            r0 = r30
            X.C5z r14 = r0.A00
            if (r14 == 0) goto L_0x0594
            monitor-enter(r14)
            X.CWV r0 = r14.A00     // Catch:{ all -> 0x0590 }
            if (r0 != 0) goto L_0x0013
            goto L_0x0593
        L_0x0013:
            X.CwN r2 = r0.A00     // Catch:{ all -> 0x0590 }
            if (r2 == 0) goto L_0x058d
            java.lang.ref.WeakReference r0 = r2.A0C     // Catch:{ all -> 0x0590 }
            r11 = 0
            if (r0 == 0) goto L_0x058d
            X.D4f r0 = r2.A07     // Catch:{ all -> 0x0590 }
            if (r0 == 0) goto L_0x058d
            X.CPP r0 = r2.A06     // Catch:{ all -> 0x0590 }
            if (r0 == 0) goto L_0x058d
            X.CW9 r0 = r2.A08     // Catch:{ all -> 0x0590 }
            if (r0 == 0) goto L_0x058d
            android.view.ScaleGestureDetector r0 = r2.A05     // Catch:{ all -> 0x0590 }
            if (r0 == 0) goto L_0x058d
            X.CU3 r0 = r2.A09     // Catch:{ all -> 0x0590 }
            if (r0 == 0) goto L_0x058d
            X.CqX r0 = r2.A0A     // Catch:{ all -> 0x0590 }
            if (r0 == 0) goto L_0x058d
            java.util.Set r0 = r2.A0N     // Catch:{ all -> 0x0590 }
            boolean r0 = r0.remove(r1)     // Catch:{ all -> 0x0590 }
            if (r0 != 0) goto L_0x058d
            android.view.MotionEvent r1 = android.view.MotionEvent.obtain(r1)     // Catch:{ all -> 0x0590 }
            int r0 = r1.getAction()     // Catch:{ all -> 0x0590 }
            if (r0 != 0) goto L_0x005e
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0590 }
            long r3 = r2.A02     // Catch:{ all -> 0x0590 }
            long r9 = r7 - r3
            int r0 = android.view.ViewConfiguration.getDoubleTapTimeout()     // Catch:{ all -> 0x0590 }
            long r3 = (long) r0     // Catch:{ all -> 0x0590 }
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x005a
            X.C26273CwN.A02(r2)     // Catch:{ all -> 0x0590 }
        L_0x005a:
            r2.A02 = r7     // Catch:{ all -> 0x0590 }
            r2.A0E = r11     // Catch:{ all -> 0x0590 }
        L_0x005e:
            java.util.List r0 = r2.A0H     // Catch:{ all -> 0x0590 }
            r0.add(r1)     // Catch:{ all -> 0x0590 }
            java.lang.ref.WeakReference r0 = r2.A0C     // Catch:{ all -> 0x0590 }
            android.view.View r0 = X.C108945cZ.A0O(r0)     // Catch:{ all -> 0x0590 }
            r4 = 0
            if (r0 == 0) goto L_0x00af
            float r3 = X.C108945cZ.A03(r0)     // Catch:{ all -> 0x0590 }
            float r4 = X.C108945cZ.A04(r0)     // Catch:{ all -> 0x0590 }
        L_0x0074:
            X.D4f r0 = r2.A07     // Catch:{ all -> 0x0590 }
            r0.A01 = r3     // Catch:{ all -> 0x0590 }
            r0.A02 = r4     // Catch:{ all -> 0x0590 }
            X.CPP r0 = r2.A06     // Catch:{ all -> 0x0590 }
            r0.A00 = r3     // Catch:{ all -> 0x0590 }
            r0.A01 = r4     // Catch:{ all -> 0x0590 }
            X.CW9 r0 = r2.A08     // Catch:{ all -> 0x0590 }
            r0.A00 = r3     // Catch:{ all -> 0x0590 }
            r0.A01 = r4     // Catch:{ all -> 0x0590 }
            android.view.ScaleGestureDetector r0 = r2.A05     // Catch:{ all -> 0x0590 }
            r0.onTouchEvent(r1)     // Catch:{ all -> 0x0590 }
            X.CU3 r0 = r2.A09     // Catch:{ all -> 0x0590 }
            int r9 = r1.getActionMasked()     // Catch:{ all -> 0x0590 }
            java.lang.Boolean r3 = r0.A09     // Catch:{ all -> 0x0590 }
            r8 = 2
            r10 = 0
            if (r3 == 0) goto L_0x01f0
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0590 }
            if (r3 == 0) goto L_0x01f0
            int r3 = r1.getActionIndex()     // Catch:{ all -> 0x0590 }
            int r5 = r1.getPointerId(r3)     // Catch:{ all -> 0x0590 }
            int r4 = r0.A07     // Catch:{ all -> 0x0590 }
            if (r5 == r4) goto L_0x00b1
            int r3 = r0.A08     // Catch:{ all -> 0x0590 }
            r7 = 0
            if (r5 != r3) goto L_0x00b2
            goto L_0x00b1
        L_0x00af:
            r3 = 0
            goto L_0x0074
        L_0x00b1:
            r7 = 1
        L_0x00b2:
            if (r9 == 0) goto L_0x01a3
            r3 = 3
            if (r9 == r3) goto L_0x01a3
            if (r9 == r6) goto L_0x01a3
            r3 = 6
            if (r9 != r3) goto L_0x00c0
            if (r7 == 0) goto L_0x0256
            goto L_0x01a3
        L_0x00c0:
            if (r9 != r8) goto L_0x0256
            r5 = -1
            if (r4 == r5) goto L_0x00ca
            int r3 = r0.A08     // Catch:{ all -> 0x0590 }
            r4 = 1
            if (r3 != r5) goto L_0x00cb
        L_0x00ca:
            r4 = 0
        L_0x00cb:
            int r3 = r1.getPointerCount()     // Catch:{ all -> 0x0590 }
            if (r3 < r8) goto L_0x00d2
            r10 = 1
        L_0x00d2:
            if (r7 == 0) goto L_0x0256
            if (r10 == 0) goto L_0x0256
            if (r4 == 0) goto L_0x0256
            int r3 = r0.A07     // Catch:{ IllegalArgumentException -> 0x0256 }
            int r3 = r1.findPointerIndex(r3)     // Catch:{ IllegalArgumentException -> 0x0256 }
            float r10 = r1.getX(r3)     // Catch:{ IllegalArgumentException -> 0x0256 }
            int r3 = r0.A07     // Catch:{ IllegalArgumentException -> 0x0256 }
            int r3 = r1.findPointerIndex(r3)     // Catch:{ IllegalArgumentException -> 0x0256 }
            float r9 = r1.getY(r3)     // Catch:{ IllegalArgumentException -> 0x0256 }
            int r3 = r0.A08     // Catch:{ IllegalArgumentException -> 0x0256 }
            int r3 = r1.findPointerIndex(r3)     // Catch:{ IllegalArgumentException -> 0x0256 }
            float r16 = r1.getX(r3)     // Catch:{ IllegalArgumentException -> 0x0256 }
            int r3 = r0.A08     // Catch:{ IllegalArgumentException -> 0x0256 }
            int r3 = r1.findPointerIndex(r3)     // Catch:{ IllegalArgumentException -> 0x0256 }
            float r15 = r1.getY(r3)     // Catch:{ IllegalArgumentException -> 0x0256 }
            float r13 = r0.A04     // Catch:{ all -> 0x0590 }
            float r3 = r0.A03     // Catch:{ all -> 0x0590 }
            float r13 = r13 - r3
            float r12 = r0.A06     // Catch:{ all -> 0x0590 }
            float r3 = r0.A05     // Catch:{ all -> 0x0590 }
            float r12 = r12 - r3
            float r5 = r16 - r10
            float r4 = r15 - r9
            float r3 = X.AnonymousClass000.A01(r13, r4, r12, r5)     // Catch:{ all -> 0x0590 }
            double r7 = (double) r3     // Catch:{ all -> 0x0590 }
            float r3 = X.AnonymousClass000.A00(r13, r5, r12, r4)     // Catch:{ all -> 0x0590 }
            double r3 = (double) r3     // Catch:{ all -> 0x0590 }
            double r3 = java.lang.Math.atan2(r7, r3)     // Catch:{ all -> 0x0590 }
            float r5 = (float) r3     // Catch:{ all -> 0x0590 }
            r0.A02 = r5     // Catch:{ all -> 0x0590 }
            float r10 = r10 + r16
            r3 = 1073741824(0x40000000, float:2.0)
            float r10 = r10 / r3
            r0.A00 = r10     // Catch:{ all -> 0x0590 }
            float r9 = r9 + r15
            float r9 = r9 / r3
            r0.A01 = r9     // Catch:{ all -> 0x0590 }
            X.CPP r10 = r0.A0A     // Catch:{ all -> 0x0590 }
            X.CwN r8 = r10.A02     // Catch:{ all -> 0x0590 }
            java.util.Map r4 = r8.A0K     // Catch:{ all -> 0x0590 }
            com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture$GestureType r3 = com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture.GestureType.ROTATE     // Catch:{ all -> 0x0590 }
            boolean r3 = r4.containsKey(r3)     // Catch:{ all -> 0x0590 }
            if (r3 != 0) goto L_0x0145
            float r7 = java.lang.Math.abs(r5)     // Catch:{ all -> 0x0590 }
            r3 = 1028443341(0x3d4ccccd, float:0.05)
            int r3 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x0145
            goto L_0x0256
        L_0x0145:
            r8.A0E = r6     // Catch:{ all -> 0x0590 }
            float r7 = r0.A00     // Catch:{ all -> 0x0590 }
            float r9 = r0.A01     // Catch:{ all -> 0x0590 }
            com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture$GestureType r3 = com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture.GestureType.ROTATE     // Catch:{ all -> 0x0590 }
            boolean r0 = r4.containsKey(r3)     // Catch:{ all -> 0x0590 }
            if (r0 == 0) goto L_0x0165
            java.lang.Object r0 = r4.get(r3)     // Catch:{ all -> 0x0590 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x0590 }
            long r3 = r0.longValue()     // Catch:{ all -> 0x0590 }
            boolean r0 = X.C26273CwN.A08(r8, r3)     // Catch:{ all -> 0x0590 }
            if (r0 == 0) goto L_0x0185
            goto L_0x0256
        L_0x0165:
            long r3 = X.C26273CwN.A00(r8, r3)     // Catch:{ all -> 0x0590 }
            com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture$GestureState r21 = com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture.GestureState.BEGAN     // Catch:{ all -> 0x0590 }
            float r12 = r10.A00     // Catch:{ all -> 0x0590 }
            float r0 = r10.A01     // Catch:{ all -> 0x0590 }
            com.facebook.cameracore.mediapipeline.services.touch.implementation.RotationGesture r15 = new com.facebook.cameracore.mediapipeline.services.touch.implementation.RotationGesture     // Catch:{ all -> 0x0590 }
            r16 = r3
            r18 = r5
            r19 = r7
            r20 = r9
            r22 = r6
            r23 = r12
            r24 = r0
            r15.<init>(r16, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x0590 }
            X.C26273CwN.A05(r8, r15)     // Catch:{ all -> 0x0590 }
        L_0x0185:
            com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture$GestureState r21 = com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture.GestureState.CHANGED     // Catch:{ all -> 0x0590 }
            float r12 = r10.A00     // Catch:{ all -> 0x0590 }
            float r0 = r10.A01     // Catch:{ all -> 0x0590 }
            com.facebook.cameracore.mediapipeline.services.touch.implementation.RotationGesture r15 = new com.facebook.cameracore.mediapipeline.services.touch.implementation.RotationGesture     // Catch:{ all -> 0x0590 }
            r16 = r3
            r18 = r5
            r19 = r7
            r20 = r9
            r22 = r6
            r23 = r12
            r24 = r0
            r15.<init>(r16, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x0590 }
            X.C26273CwN.A05(r8, r15)     // Catch:{ all -> 0x0590 }
            goto L_0x0256
        L_0x01a3:
            r3 = -1
            r0.A07 = r3     // Catch:{ all -> 0x0590 }
            r0.A08 = r3     // Catch:{ all -> 0x0590 }
            X.CPP r13 = r0.A0A     // Catch:{ all -> 0x0590 }
            X.CwN r12 = r13.A02     // Catch:{ all -> 0x0590 }
            java.util.Map r4 = r12.A0K     // Catch:{ all -> 0x0590 }
            com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture$GestureType r7 = com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture.GestureType.ROTATE     // Catch:{ all -> 0x0590 }
            boolean r3 = r4.containsKey(r7)     // Catch:{ all -> 0x0590 }
            if (r3 == 0) goto L_0x01ee
            java.lang.Object r3 = r4.get(r7)     // Catch:{ all -> 0x0590 }
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ all -> 0x0590 }
            long r3 = r3.longValue()     // Catch:{ all -> 0x0590 }
            boolean r5 = X.C26273CwN.A08(r12, r3)     // Catch:{ all -> 0x0590 }
            if (r5 == 0) goto L_0x01cc
            java.util.Set r3 = r12.A0O     // Catch:{ all -> 0x0590 }
            r3.add(r7)     // Catch:{ all -> 0x0590 }
            goto L_0x01ee
        L_0x01cc:
            float r10 = r0.A02     // Catch:{ all -> 0x0590 }
            float r9 = r0.A00     // Catch:{ all -> 0x0590 }
            float r8 = r0.A01     // Catch:{ all -> 0x0590 }
            com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture$GestureState r21 = com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture.GestureState.ENDED     // Catch:{ all -> 0x0590 }
            float r7 = r13.A00     // Catch:{ all -> 0x0590 }
            float r5 = r13.A01     // Catch:{ all -> 0x0590 }
            com.facebook.cameracore.mediapipeline.services.touch.implementation.RotationGesture r15 = new com.facebook.cameracore.mediapipeline.services.touch.implementation.RotationGesture     // Catch:{ all -> 0x0590 }
            r16 = r3
            r18 = r10
            r19 = r9
            r20 = r8
            r22 = r6
            r23 = r7
            r24 = r5
            r15.<init>(r16, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x0590 }
            X.C26273CwN.A05(r12, r15)     // Catch:{ all -> 0x0590 }
        L_0x01ee:
            r3 = 0
            goto L_0x0254
        L_0x01f0:
            r3 = 5
            if (r9 != r3) goto L_0x0256
            int r3 = r1.getPointerCount()     // Catch:{ all -> 0x0590 }
            if (r3 != r8) goto L_0x0256
            int r3 = r1.getPointerId(r11)     // Catch:{ all -> 0x0590 }
            r0.A07 = r3     // Catch:{ all -> 0x0590 }
            int r3 = r1.getPointerId(r6)     // Catch:{ all -> 0x0590 }
            r0.A08 = r3     // Catch:{ all -> 0x0590 }
            int r3 = r0.A07     // Catch:{ IllegalArgumentException -> 0x0256 }
            int r3 = r1.findPointerIndex(r3)     // Catch:{ IllegalArgumentException -> 0x0256 }
            float r3 = r1.getX(r3)     // Catch:{ IllegalArgumentException -> 0x0256 }
            r0.A03 = r3     // Catch:{ IllegalArgumentException -> 0x0256 }
            int r3 = r0.A07     // Catch:{ IllegalArgumentException -> 0x0256 }
            int r3 = r1.findPointerIndex(r3)     // Catch:{ IllegalArgumentException -> 0x0256 }
            float r3 = r1.getY(r3)     // Catch:{ IllegalArgumentException -> 0x0256 }
            r0.A05 = r3     // Catch:{ IllegalArgumentException -> 0x0256 }
            int r3 = r0.A08     // Catch:{ IllegalArgumentException -> 0x0256 }
            int r3 = r1.findPointerIndex(r3)     // Catch:{ IllegalArgumentException -> 0x0256 }
            float r3 = r1.getX(r3)     // Catch:{ IllegalArgumentException -> 0x0256 }
            r0.A04 = r3     // Catch:{ IllegalArgumentException -> 0x0256 }
            int r3 = r0.A08     // Catch:{ IllegalArgumentException -> 0x0256 }
            int r3 = r1.findPointerIndex(r3)     // Catch:{ IllegalArgumentException -> 0x0256 }
            float r7 = r1.getY(r3)     // Catch:{ IllegalArgumentException -> 0x0256 }
            r0.A06 = r7     // Catch:{ IllegalArgumentException -> 0x0256 }
            r3 = 0
            r0.A02 = r3     // Catch:{ all -> 0x0590 }
            float r5 = r0.A03     // Catch:{ all -> 0x0590 }
            float r3 = r0.A04     // Catch:{ all -> 0x0590 }
            float r5 = r5 + r3
            r4 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r4
            r0.A00 = r5     // Catch:{ all -> 0x0590 }
            float r3 = r0.A05     // Catch:{ all -> 0x0590 }
            float r3 = r3 + r7
            float r3 = r3 / r4
            r0.A01 = r3     // Catch:{ all -> 0x0590 }
            X.CPP r3 = r0.A0A     // Catch:{ all -> 0x0590 }
            X.CwN r3 = r3.A02     // Catch:{ all -> 0x0590 }
            java.util.Set r4 = r3.A0Q     // Catch:{ all -> 0x0590 }
            com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture$GestureType r3 = com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture.GestureType.ROTATE     // Catch:{ all -> 0x0590 }
            java.lang.Boolean r3 = X.BE8.A0V(r3, r4)     // Catch:{ all -> 0x0590 }
        L_0x0254:
            r0.A09 = r3     // Catch:{ all -> 0x0590 }
        L_0x0256:
            X.CqX r0 = r2.A0A     // Catch:{ all -> 0x0590 }
            int r5 = r1.getActionMasked()     // Catch:{ all -> 0x0590 }
            r7 = 0
            if (r5 == 0) goto L_0x0337
            r3 = 2
            if (r5 == r3) goto L_0x029a
            r3 = 5
            if (r5 != r3) goto L_0x03c3
            java.lang.Boolean r3 = r0.A08     // Catch:{ all -> 0x0590 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0590 }
            if (r3 == 0) goto L_0x0296
            int r8 = r1.getActionIndex()     // Catch:{ all -> 0x0590 }
            int r3 = r1.getPointerId(r8)     // Catch:{ all -> 0x0590 }
            long r3 = (long) r3     // Catch:{ all -> 0x0590 }
            float r13 = r1.getX(r8)     // Catch:{ all -> 0x0590 }
            float r12 = r1.getY(r8)     // Catch:{ all -> 0x0590 }
            java.util.Map r10 = r0.A0J     // Catch:{ all -> 0x0590 }
            java.lang.Long r9 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x0590 }
            java.lang.Float r15 = java.lang.Float.valueOf(r13)     // Catch:{ all -> 0x0590 }
            java.lang.Float r8 = java.lang.Float.valueOf(r12)     // Catch:{ all -> 0x0590 }
            android.util.Pair r8 = X.C108945cZ.A0N(r15, r8)     // Catch:{ all -> 0x0590 }
            r10.put(r9, r8)     // Catch:{ all -> 0x0590 }
            r0.A02(r13, r12, r3)     // Catch:{ all -> 0x0590 }
        L_0x0296:
            r0.A0E = r11     // Catch:{ all -> 0x0590 }
            goto L_0x03c3
        L_0x029a:
            java.lang.Boolean r3 = r0.A08     // Catch:{ all -> 0x0590 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0590 }
            if (r3 == 0) goto L_0x036f
            r4 = 0
        L_0x02a3:
            int r3 = r1.getPointerCount()     // Catch:{ all -> 0x0590 }
            if (r4 >= r3) goto L_0x036f
            int r3 = r1.getPointerId(r4)     // Catch:{ all -> 0x0590 }
            long r8 = (long) r3     // Catch:{ all -> 0x0590 }
            java.util.Map r3 = r0.A0J     // Catch:{ all -> 0x0590 }
            java.lang.Object r10 = X.C108965cb.A0o(r3, r8)     // Catch:{ all -> 0x0590 }
            android.util.Pair r10 = (android.util.Pair) r10     // Catch:{ all -> 0x0590 }
            if (r10 == 0) goto L_0x0333
            java.lang.Object r3 = r10.first     // Catch:{ all -> 0x0590 }
            java.lang.Float r3 = (java.lang.Float) r3     // Catch:{ all -> 0x0590 }
            float r16 = r3.floatValue()     // Catch:{ all -> 0x0590 }
            java.lang.Object r3 = r10.second     // Catch:{ all -> 0x0590 }
            java.lang.Float r3 = (java.lang.Float) r3     // Catch:{ all -> 0x0590 }
            float r15 = r3.floatValue()     // Catch:{ all -> 0x0590 }
            float r20 = r1.getX(r4)     // Catch:{ all -> 0x0590 }
            float r21 = r1.getY(r4)     // Catch:{ all -> 0x0590 }
            X.CW9 r3 = r0.A0H     // Catch:{ all -> 0x0590 }
            com.facebook.cameracore.mediapipeline.services.touch.interfaces.TouchEvent$TouchEventType r24 = com.facebook.cameracore.mediapipeline.services.touch.interfaces.TouchEvent.TouchEventType.MOVE     // Catch:{ all -> 0x0590 }
            long r25 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0590 }
            float r13 = r3.A00     // Catch:{ all -> 0x0590 }
            float r10 = r3.A01     // Catch:{ all -> 0x0590 }
            com.facebook.cameracore.mediapipeline.services.touch.interfaces.TouchEvent r12 = new com.facebook.cameracore.mediapipeline.services.touch.interfaces.TouchEvent     // Catch:{ all -> 0x0590 }
            r19 = r12
            r22 = r8
            r27 = r6
            r28 = r13
            r29 = r10
            r19.<init>(r20, r21, r22, r24, r25, r27, r28, r29)     // Catch:{ all -> 0x0590 }
            X.CwN r10 = r3.A02     // Catch:{ all -> 0x0590 }
            X.C26273CwN.A06(r10, r12)     // Catch:{ all -> 0x0590 }
            java.util.Map r12 = r10.A0J     // Catch:{ all -> 0x0590 }
            java.lang.Long r9 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x0590 }
            boolean r8 = r12.containsKey(r9)     // Catch:{ all -> 0x0590 }
            if (r8 == 0) goto L_0x0333
            java.lang.Object r13 = r12.get(r9)     // Catch:{ all -> 0x0590 }
            java.lang.Long r13 = (java.lang.Long) r13     // Catch:{ all -> 0x0590 }
            long r8 = r13.longValue()     // Catch:{ all -> 0x0590 }
            int r12 = r12.size()     // Catch:{ all -> 0x0590 }
            if (r12 != r6) goto L_0x0318
            boolean r12 = X.C26273CwN.A08(r10, r8)     // Catch:{ all -> 0x0590 }
            if (r12 == 0) goto L_0x0318
            java.util.Set r3 = r10.A0P     // Catch:{ all -> 0x0590 }
            r3.add(r13)     // Catch:{ all -> 0x0590 }
            goto L_0x0333
        L_0x0318:
            float r18 = r20 - r16
            float r19 = r21 - r15
            com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture$GestureState r22 = com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture.GestureState.CHANGED     // Catch:{ all -> 0x0590 }
            float r13 = r3.A00     // Catch:{ all -> 0x0590 }
            float r12 = r3.A01     // Catch:{ all -> 0x0590 }
            com.facebook.cameracore.mediapipeline.services.touch.implementation.RawTouchGesture r3 = new com.facebook.cameracore.mediapipeline.services.touch.implementation.RawTouchGesture     // Catch:{ all -> 0x0590 }
            r23 = r6
            r24 = r13
            r25 = r12
            r15 = r3
            r16 = r8
            r15.<init>(r16, r18, r19, r20, r21, r22, r23, r24, r25)     // Catch:{ all -> 0x0590 }
            X.C26273CwN.A05(r10, r3)     // Catch:{ all -> 0x0590 }
        L_0x0333:
            int r4 = r4 + 1
            goto L_0x02a3
        L_0x0337:
            java.lang.Boolean r3 = r0.A08     // Catch:{ all -> 0x0590 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0590 }
            if (r3 == 0) goto L_0x0364
            int r3 = r1.getPointerId(r11)     // Catch:{ all -> 0x0590 }
            long r3 = (long) r3     // Catch:{ all -> 0x0590 }
            float r13 = r1.getX()     // Catch:{ all -> 0x0590 }
            float r12 = r1.getY()     // Catch:{ all -> 0x0590 }
            java.util.Map r10 = r0.A0J     // Catch:{ all -> 0x0590 }
            java.lang.Long r9 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x0590 }
            java.lang.Float r15 = java.lang.Float.valueOf(r13)     // Catch:{ all -> 0x0590 }
            java.lang.Float r8 = java.lang.Float.valueOf(r12)     // Catch:{ all -> 0x0590 }
            android.util.Pair r8 = X.C108945cZ.A0N(r15, r8)     // Catch:{ all -> 0x0590 }
            r10.put(r9, r8)     // Catch:{ all -> 0x0590 }
            r0.A02(r13, r12, r3)     // Catch:{ all -> 0x0590 }
        L_0x0364:
            r0.A0E = r6     // Catch:{ all -> 0x0590 }
            r0.A09 = r7     // Catch:{ all -> 0x0590 }
            r0.A0A = r7     // Catch:{ all -> 0x0590 }
            r0.A0C = r7     // Catch:{ all -> 0x0590 }
            r0.A0D = r7     // Catch:{ all -> 0x0590 }
            goto L_0x03c3
        L_0x036f:
            int r3 = r1.getPointerCount()     // Catch:{ all -> 0x0590 }
            if (r3 <= r6) goto L_0x0377
            r0.A0E = r11     // Catch:{ all -> 0x0590 }
        L_0x0377:
            java.lang.Boolean r3 = r0.A07     // Catch:{ all -> 0x0590 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0590 }
            if (r3 == 0) goto L_0x03a9
            android.view.MotionEvent r9 = r0.A05     // Catch:{ all -> 0x0590 }
            float r4 = r1.getX()     // Catch:{ all -> 0x0590 }
            float r3 = r9.getX()     // Catch:{ all -> 0x0590 }
            float r4 = r4 - r3
            int r8 = (int) r4     // Catch:{ all -> 0x0590 }
            float r4 = r1.getY()     // Catch:{ all -> 0x0590 }
            float r3 = r9.getY()     // Catch:{ all -> 0x0590 }
            float r4 = r4 - r3
            int r3 = (int) r4     // Catch:{ all -> 0x0590 }
            int r8 = r8 * r8
            int r3 = r3 * r3
            int r8 = r8 + r3
            int r3 = r0.A04     // Catch:{ all -> 0x0590 }
            if (r8 <= r3) goto L_0x03a9
            android.os.Handler r4 = r0.A0F     // Catch:{ all -> 0x0590 }
            java.lang.Runnable r3 = r0.A0I     // Catch:{ all -> 0x0590 }
            r4.removeCallbacks(r3)     // Catch:{ all -> 0x0590 }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r11)     // Catch:{ all -> 0x0590 }
            r0.A07 = r3     // Catch:{ all -> 0x0590 }
        L_0x03a9:
            java.lang.Boolean r3 = r0.A06     // Catch:{ all -> 0x0590 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0590 }
            if (r3 == 0) goto L_0x03c3
            int r3 = r1.getPointerId(r11)     // Catch:{ all -> 0x0590 }
            if (r3 != 0) goto L_0x03c3
            float r3 = r1.getX()     // Catch:{ all -> 0x0590 }
            r0.A00 = r3     // Catch:{ all -> 0x0590 }
            float r3 = r1.getY()     // Catch:{ all -> 0x0590 }
            r0.A01 = r3     // Catch:{ all -> 0x0590 }
        L_0x03c3:
            android.view.GestureDetector r3 = r0.A0G     // Catch:{ all -> 0x0590 }
            r3.onTouchEvent(r1)     // Catch:{ all -> 0x0590 }
            if (r5 == r6) goto L_0x040b
            r3 = 3
            if (r5 == r3) goto L_0x040b
            r3 = 6
            if (r5 != r3) goto L_0x04d2
            java.lang.Boolean r3 = r0.A08     // Catch:{ all -> 0x0590 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0590 }
            if (r3 == 0) goto L_0x04d2
            int r8 = r1.getActionIndex()     // Catch:{ all -> 0x0590 }
            int r3 = r1.getPointerId(r8)     // Catch:{ all -> 0x0590 }
            long r3 = (long) r3     // Catch:{ all -> 0x0590 }
            java.util.Map r5 = r0.A0J     // Catch:{ all -> 0x0590 }
            java.lang.Object r7 = X.C108965cb.A0o(r5, r3)     // Catch:{ all -> 0x0590 }
            android.util.Pair r7 = (android.util.Pair) r7     // Catch:{ all -> 0x0590 }
            if (r7 == 0) goto L_0x04d2
            java.lang.Object r5 = r7.first     // Catch:{ all -> 0x0590 }
            java.lang.Float r5 = (java.lang.Float) r5     // Catch:{ all -> 0x0590 }
            float r16 = r5.floatValue()     // Catch:{ all -> 0x0590 }
            java.lang.Object r5 = r7.second     // Catch:{ all -> 0x0590 }
            java.lang.Float r5 = (java.lang.Float) r5     // Catch:{ all -> 0x0590 }
            float r17 = r5.floatValue()     // Catch:{ all -> 0x0590 }
            float r18 = r1.getX(r8)     // Catch:{ all -> 0x0590 }
            float r19 = r1.getY(r8)     // Catch:{ all -> 0x0590 }
            r15 = r0
            r20 = r3
            X.C26016CqX.A00(r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x0590 }
            goto L_0x04d2
        L_0x040b:
            java.lang.Boolean r3 = r0.A08     // Catch:{ all -> 0x0590 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0590 }
            if (r3 == 0) goto L_0x0444
            int r9 = r1.getActionIndex()     // Catch:{ all -> 0x0590 }
            int r3 = r1.getPointerId(r9)     // Catch:{ all -> 0x0590 }
            long r3 = (long) r3     // Catch:{ all -> 0x0590 }
            java.util.Map r5 = r0.A0J     // Catch:{ all -> 0x0590 }
            java.lang.Object r8 = X.C108965cb.A0o(r5, r3)     // Catch:{ all -> 0x0590 }
            android.util.Pair r8 = (android.util.Pair) r8     // Catch:{ all -> 0x0590 }
            if (r8 == 0) goto L_0x0444
            java.lang.Object r5 = r8.first     // Catch:{ all -> 0x0590 }
            java.lang.Float r5 = (java.lang.Float) r5     // Catch:{ all -> 0x0590 }
            float r16 = r5.floatValue()     // Catch:{ all -> 0x0590 }
            java.lang.Object r5 = r8.second     // Catch:{ all -> 0x0590 }
            java.lang.Float r5 = (java.lang.Float) r5     // Catch:{ all -> 0x0590 }
            float r17 = r5.floatValue()     // Catch:{ all -> 0x0590 }
            float r18 = r1.getX(r9)     // Catch:{ all -> 0x0590 }
            float r19 = r1.getY(r9)     // Catch:{ all -> 0x0590 }
            r15 = r0
            r20 = r3
            X.C26016CqX.A00(r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x0590 }
        L_0x0444:
            java.lang.Float r4 = r0.A0C     // Catch:{ all -> 0x0590 }
            if (r4 == 0) goto L_0x0483
            java.lang.Float r3 = r0.A0A     // Catch:{ all -> 0x0590 }
            if (r3 == 0) goto L_0x0483
            X.CW9 r8 = r0.A0H     // Catch:{ all -> 0x0590 }
            float r20 = r3.floatValue()     // Catch:{ all -> 0x0590 }
            java.lang.Float r3 = r0.A0B     // Catch:{ all -> 0x0590 }
            float r21 = r3.floatValue()     // Catch:{ all -> 0x0590 }
            float r13 = r4.floatValue()     // Catch:{ all -> 0x0590 }
            java.lang.Float r3 = r0.A0D     // Catch:{ all -> 0x0590 }
            float r12 = r3.floatValue()     // Catch:{ all -> 0x0590 }
            X.CwN r5 = r8.A02     // Catch:{ all -> 0x0590 }
            java.util.Map r4 = r5.A0K     // Catch:{ all -> 0x0590 }
            com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture$GestureType r10 = com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture.GestureType.PAN     // Catch:{ all -> 0x0590 }
            boolean r3 = r4.containsKey(r10)     // Catch:{ all -> 0x0590 }
            if (r3 == 0) goto L_0x0483
            java.lang.Object r3 = r4.get(r10)     // Catch:{ all -> 0x0590 }
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ all -> 0x0590 }
            long r3 = r3.longValue()     // Catch:{ all -> 0x0590 }
            boolean r9 = X.C26273CwN.A08(r5, r3)     // Catch:{ all -> 0x0590 }
            if (r9 == 0) goto L_0x050c
            java.util.Set r3 = r5.A0O     // Catch:{ all -> 0x0590 }
            r3.add(r10)     // Catch:{ all -> 0x0590 }
        L_0x0483:
            r0.A09 = r7     // Catch:{ all -> 0x0590 }
            float r12 = r0.A00     // Catch:{ all -> 0x0590 }
            float r10 = r0.A01     // Catch:{ all -> 0x0590 }
            java.lang.Boolean r3 = r0.A06     // Catch:{ all -> 0x0590 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0590 }
            boolean r3 = X.AnonymousClass000.A1O(r3)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r11)     // Catch:{ all -> 0x0590 }
            if (r3 == 0) goto L_0x04be
            r0.A06 = r9     // Catch:{ all -> 0x0590 }
            X.CW9 r13 = r0.A0H     // Catch:{ all -> 0x0590 }
            X.CwN r11 = r13.A02     // Catch:{ all -> 0x0590 }
            java.util.Map r4 = r11.A0K     // Catch:{ all -> 0x0590 }
            com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture$GestureType r8 = com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture.GestureType.LONG_PRESS     // Catch:{ all -> 0x0590 }
            boolean r3 = r4.containsKey(r8)     // Catch:{ all -> 0x0590 }
            if (r3 == 0) goto L_0x04be
            java.lang.Object r3 = r4.get(r8)     // Catch:{ all -> 0x0590 }
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ all -> 0x0590 }
            long r3 = r3.longValue()     // Catch:{ all -> 0x0590 }
            boolean r5 = X.C26273CwN.A08(r11, r3)     // Catch:{ all -> 0x0590 }
            if (r5 == 0) goto L_0x04f1
            java.util.Set r3 = r11.A0O     // Catch:{ all -> 0x0590 }
            r3.add(r8)     // Catch:{ all -> 0x0590 }
        L_0x04be:
            android.os.Handler r4 = r0.A0F     // Catch:{ all -> 0x0590 }
            java.lang.Runnable r3 = r0.A0I     // Catch:{ all -> 0x0590 }
            r4.removeCallbacks(r3)     // Catch:{ all -> 0x0590 }
            r0.A07 = r9     // Catch:{ all -> 0x0590 }
            r0.A0E = r6     // Catch:{ all -> 0x0590 }
            r3 = 0
            r0.A02 = r3     // Catch:{ all -> 0x0590 }
            r0.A03 = r3     // Catch:{ all -> 0x0590 }
            r0.A0C = r7     // Catch:{ all -> 0x0590 }
            r0.A0D = r7     // Catch:{ all -> 0x0590 }
        L_0x04d2:
            int r0 = r2.A00     // Catch:{ all -> 0x0590 }
            if (r0 != 0) goto L_0x052d
            boolean r0 = r2.A0E     // Catch:{ all -> 0x0590 }
            if (r0 == 0) goto L_0x0528
            int r0 = r2.A01     // Catch:{ all -> 0x0590 }
            if (r0 > 0) goto L_0x0528
            java.util.List r3 = r2.A0I     // Catch:{ all -> 0x0590 }
            boolean r0 = r3.isEmpty()     // Catch:{ all -> 0x0590 }
            if (r0 != 0) goto L_0x058d
            r3.add(r1)     // Catch:{ all -> 0x0590 }
            android.os.Handler r1 = r2.A0F     // Catch:{ all -> 0x0590 }
            r0 = 4
            X.C27082DTh.A01(r1, r2, r0)     // Catch:{ all -> 0x0590 }
            goto L_0x058b
        L_0x04f1:
            com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture$GestureState r20 = com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture.GestureState.ENDED     // Catch:{ all -> 0x0590 }
            float r8 = r13.A00     // Catch:{ all -> 0x0590 }
            float r5 = r13.A01     // Catch:{ all -> 0x0590 }
            com.facebook.cameracore.mediapipeline.services.touch.implementation.LongPressGesture r15 = new com.facebook.cameracore.mediapipeline.services.touch.implementation.LongPressGesture     // Catch:{ all -> 0x0590 }
            r16 = r3
            r18 = r12
            r19 = r10
            r21 = r6
            r22 = r8
            r23 = r5
            r15.<init>(r16, r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x0590 }
            X.C26273CwN.A05(r11, r15)     // Catch:{ all -> 0x0590 }
            goto L_0x04be
        L_0x050c:
            float r18 = r20 - r13
            float r19 = r21 - r12
            com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture$GestureState r22 = com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture.GestureState.ENDED     // Catch:{ all -> 0x0590 }
            float r9 = r8.A00     // Catch:{ all -> 0x0590 }
            float r8 = r8.A01     // Catch:{ all -> 0x0590 }
            com.facebook.cameracore.mediapipeline.services.touch.implementation.PanGesture r15 = new com.facebook.cameracore.mediapipeline.services.touch.implementation.PanGesture     // Catch:{ all -> 0x0590 }
            r23 = r6
            r24 = r9
            r25 = r8
            r16 = r3
            r15.<init>(r16, r18, r19, r20, r21, r22, r23, r24, r25)     // Catch:{ all -> 0x0590 }
            X.C26273CwN.A05(r5, r15)     // Catch:{ all -> 0x0590 }
            goto L_0x0483
        L_0x0528:
            java.util.List r0 = r2.A0I     // Catch:{ all -> 0x0590 }
            r0.add(r1)     // Catch:{ all -> 0x0590 }
        L_0x052d:
            java.util.Set r4 = r2.A0O     // Catch:{ all -> 0x0590 }
            int r0 = r4.size()     // Catch:{ all -> 0x0590 }
            if (r0 <= 0) goto L_0x0560
            java.util.Iterator r3 = r4.iterator()     // Catch:{ all -> 0x0590 }
        L_0x0539:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0590 }
            if (r0 == 0) goto L_0x055d
            java.lang.Object r1 = r3.next()     // Catch:{ all -> 0x0590 }
            java.util.Map r0 = r2.A0K     // Catch:{ all -> 0x0590 }
            java.lang.Object r1 = r0.remove(r1)     // Catch:{ all -> 0x0590 }
            if (r1 == 0) goto L_0x0539
            java.util.Map r0 = r2.A0L     // Catch:{ all -> 0x0590 }
            java.lang.Object r1 = r0.remove(r1)     // Catch:{ all -> 0x0590 }
            if (r1 == 0) goto L_0x0539
            X.ByT r0 = X.C24270ByT.GESTURE_IS_HANDLED_BY_ENGINE     // Catch:{ all -> 0x0590 }
            if (r1 != r0) goto L_0x0539
            int r0 = r2.A00     // Catch:{ all -> 0x0590 }
            int r0 = r0 - r6
            r2.A00 = r0     // Catch:{ all -> 0x0590 }
            goto L_0x0539
        L_0x055d:
            r4.clear()     // Catch:{ all -> 0x0590 }
        L_0x0560:
            java.util.Set r4 = r2.A0P     // Catch:{ all -> 0x0590 }
            boolean r0 = r4.isEmpty()     // Catch:{ all -> 0x0590 }
            if (r0 != 0) goto L_0x058b
            java.util.Iterator r3 = r4.iterator()     // Catch:{ all -> 0x0590 }
        L_0x056c:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0590 }
            if (r0 == 0) goto L_0x0588
            java.lang.Object r1 = r3.next()     // Catch:{ all -> 0x0590 }
            java.util.Map r0 = r2.A0L     // Catch:{ all -> 0x0590 }
            java.lang.Object r1 = r0.remove(r1)     // Catch:{ all -> 0x0590 }
            if (r1 == 0) goto L_0x056c
            X.ByT r0 = X.C24270ByT.GESTURE_IS_HANDLED_BY_ENGINE     // Catch:{ all -> 0x0590 }
            if (r1 != r0) goto L_0x056c
            int r0 = r2.A00     // Catch:{ all -> 0x0590 }
            int r0 = r0 - r6
            r2.A00 = r0     // Catch:{ all -> 0x0590 }
            goto L_0x056c
        L_0x0588:
            r4.clear()     // Catch:{ all -> 0x0590 }
        L_0x058b:
            r0 = 1
            goto L_0x058e
        L_0x058d:
            r0 = 0
        L_0x058e:
            monitor-exit(r14)
            return r0
        L_0x0590:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
        L_0x0593:
            monitor-exit(r14)
        L_0x0594:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.D50.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
