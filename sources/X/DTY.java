package X;

import com.whatsapp.mediaview.PhotoView;

public class DTY implements Runnable {
    public long A00;
    public boolean A01;
    public final int A02;
    public final Object A03;

    public DTY(Object obj, int i, long j, boolean z) {
        this.A02 = i;
        this.A03 = obj;
        this.A00 = j;
        this.A01 = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00bb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r18 = this;
            r6 = r18
            int r0 = r6.A02
            switch(r0) {
                case 0: goto L_0x001d;
                case 1: goto L_0x01ad;
                case 2: goto L_0x01d0;
                case 3: goto L_0x0153;
                case 4: goto L_0x026f;
                case 5: goto L_0x0184;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r4 = r6.A03
            com.whatsapp.schedulecall.ScheduleCallBroadcastReceiver r4 = (com.whatsapp.schedulecall.ScheduleCallBroadcastReceiver) r4
            long r7 = r6.A00
            boolean r9 = r6.A01
            X.1Uq r0 = r4.A07
            X.2mw r5 = r0.A01(r7)
            if (r5 != 0) goto L_0x01a1
            java.lang.String r0 = "ScheduleCallBroadcastReceiver/onScheduleCallStart scheduled call not exist"
        L_0x0019:
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x001c:
            return
        L_0x001d:
            java.lang.Object r0 = r6.A03
            X.DB1 r0 = (X.DB1) r0
            X.CwN r5 = r0.A00
            long r3 = r6.A00
            boolean r2 = r6.A01
            r1 = 1
            r5.A0E = r1
            int r0 = r5.A01
            int r0 = r0 - r1
            r5.A01 = r0
            if (r2 == 0) goto L_0x00ef
            int r0 = r5.A00
            int r0 = r0 + 1
            r5.A00 = r0
            java.util.Map r2 = r5.A0L
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            X.ByT r0 = X.C24270ByT.GESTURE_IS_HANDLED_BY_ENGINE
            r2.put(r1, r0)
            java.util.Map r0 = r5.A0M
            java.lang.Object r6 = r0.remove(r1)
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L_0x0097
            r2 = 0
            r3 = 0
        L_0x004e:
            int r0 = r6.size()
            if (r3 >= r0) goto L_0x0075
            java.lang.Object r2 = r6.get(r3)
            com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture r2 = (com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture) r2
            X.CWV r0 = r5.A0G
            java.util.List r0 = r0.A03
            java.util.Iterator r1 = r0.iterator()
        L_0x0062:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0072
            java.lang.Object r0 = r1.next()
            com.facebook.cameracore.mediapipeline.services.touch.implementation.TouchGesturesDelegateWrapper r0 = (com.facebook.cameracore.mediapipeline.services.touch.implementation.TouchGesturesDelegateWrapper) r0
            r0.addGestureEvent(r2)
            goto L_0x0062
        L_0x0072:
            int r3 = r3 + 1
            goto L_0x004e
        L_0x0075:
            if (r2 == 0) goto L_0x00b2
            com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture$GestureState r1 = r2.gestureState
            com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture$GestureState r0 = com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture.GestureState.ENDED
            if (r1 == r0) goto L_0x0085
            com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture$GestureState r0 = com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture.GestureState.CANCELLED
            if (r1 == r0) goto L_0x0085
            com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture$GestureState r0 = com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture.GestureState.FAILED
            if (r1 != r0) goto L_0x00b2
        L_0x0085:
            com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture$GestureType r1 = r2.getGestureType()
            com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture$GestureType r0 = com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture.GestureType.RAW_TOUCH
            if (r1 != r0) goto L_0x00af
            long r0 = r2.id
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            X.C26273CwN.A07(r5, r0)
            goto L_0x00b2
        L_0x0097:
            java.util.Map r2 = r5.A0K
            com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture$GestureType r1 = com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture.GestureType.TAP
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x00b2
            java.lang.Object r0 = r2.get(r1)
            long r1 = X.C17880vN.A05(r0)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x00b2
            com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture$GestureType r1 = com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture.GestureType.TAP
        L_0x00af:
            X.C26273CwN.A04(r5, r1)
        L_0x00b2:
            java.util.List r0 = r5.A0I
            r0.clear()
            boolean r0 = r5.A0D
            if (r0 == 0) goto L_0x001c
            java.util.List r0 = r5.A0H
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>(r0)
            r0.clear()
            r0 = 0
            r5.A0D = r0
            java.util.Set r0 = r5.A0N
            r0.addAll(r1)
            java.util.Iterator r3 = r1.iterator()
        L_0x00d1:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x001c
            java.lang.Object r2 = r3.next()
            android.view.MotionEvent r2 = (android.view.MotionEvent) r2
            java.lang.ref.WeakReference r1 = r5.A0C
            if (r1 == 0) goto L_0x00d1
            java.lang.Object r0 = r1.get()
            if (r0 == 0) goto L_0x00d1
            android.view.View r0 = X.C108945cZ.A0O(r1)
            r0.dispatchTouchEvent(r2)
            goto L_0x00d1
        L_0x00ef:
            java.util.Map r2 = r5.A0L
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            X.ByT r0 = X.C24270ByT.GESTURE_IS_HANDLED_BY_CLIENT
            r2.put(r1, r0)
            java.util.Map r0 = r5.A0M
            java.lang.Object r1 = r0.remove(r1)
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x0137
            int r0 = X.AnonymousClass3MX.A01(r1)
            java.lang.Object r2 = r1.get(r0)
            com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture r2 = (com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture) r2
            if (r2 == 0) goto L_0x012f
            com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture$GestureState r1 = r2.gestureState
            com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture$GestureState r0 = com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture.GestureState.ENDED
            if (r1 == r0) goto L_0x011e
            com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture$GestureState r0 = com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture.GestureState.CANCELLED
            if (r1 == r0) goto L_0x011e
            com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture$GestureState r0 = com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture.GestureState.FAILED
            if (r1 != r0) goto L_0x012f
        L_0x011e:
            com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture$GestureType r1 = r2.getGestureType()
            com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture$GestureType r0 = com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture.GestureType.RAW_TOUCH
            if (r1 != r0) goto L_0x014f
            long r0 = r2.id
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            X.C26273CwN.A07(r5, r0)
        L_0x012f:
            int r0 = r5.A01
            if (r0 != 0) goto L_0x001c
            X.C26273CwN.A01(r5)
            return
        L_0x0137:
            java.util.Map r2 = r5.A0K
            com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture$GestureType r1 = com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture.GestureType.TAP
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x012f
            java.lang.Object r0 = r2.get(r1)
            long r1 = X.C17880vN.A05(r0)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x012f
            com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture$GestureType r1 = com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture.GestureType.TAP
        L_0x014f:
            X.C26273CwN.A04(r5, r1)
            goto L_0x012f
        L_0x0153:
            boolean r0 = r6.A01
            if (r0 != 0) goto L_0x001c
            long r3 = r6.A00
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0165
            long r3 = java.lang.System.currentTimeMillis()
            r6.A00 = r3
        L_0x0165:
            long r2 = X.AnonymousClass8BR.A04(r3)
            float r1 = (float) r2
            r0 = 0
            float r1 = r1 / r0
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x031a
            r0 = 1
            r6.A01 = r0
            java.lang.Object r1 = r6.A03
            android.view.View r1 = (android.view.View) r1
            r1.invalidate()
            boolean r0 = r6.A01
            if (r0 != 0) goto L_0x001c
            r1.post(r6)
            return
        L_0x0184:
            java.lang.Object r4 = r6.A03
            com.whatsapp.schedulecall.ScheduleCallBroadcastReceiver r4 = (com.whatsapp.schedulecall.ScheduleCallBroadcastReceiver) r4
            long r2 = r6.A00
            boolean r1 = r6.A01
            X.1Uq r0 = r4.A07
            X.2mw r2 = r0.A01(r2)
            if (r2 != 0) goto L_0x0198
            java.lang.String r0 = "ScheduleCallBroadcastReceiver/onAdvanceAlert scheduled call not exist"
            goto L_0x0019
        L_0x0198:
            if (r1 != 0) goto L_0x001c
            r1 = 1
            X.2jy r0 = r4.A03
            r0.A00(r2, r1)
            return
        L_0x01a1:
            X.1KB r0 = r4.A01
            r6 = 2
            X.3Ci r3 = new X.3Ci
            r3.<init>(r4, r5, r6, r7, r9)
            r0.A0J(r3)
            return
        L_0x01ad:
            java.lang.Object r5 = r6.A03
            X.A99 r5 = (X.A99) r5
            boolean r4 = r6.A01
            long r2 = r6.A00
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "VoiceService/actionCreateCallLinkForEvent isVideoCallLink: "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " eventStartTimeSec "
            r1.append(r0)
            X.C17890vO.A16(r1, r2)
            com.whatsapp.voipcalling.Voip.createCallLink(r4, r2)
            r5.A0V()
            return
        L_0x01d0:
            java.lang.Object r2 = r6.A03
            com.whatsapp.email.VerifyEmailActivity r2 = (com.whatsapp.email.VerifyEmailActivity) r2
            boolean r4 = r6.A01
            long r0 = r6.A00
            r7 = 0
            X.00H r3 = r2.A4b()
            java.lang.Object r8 = r3.get()
            X.9kJ r8 = (X.C190059kJ) r8
            java.lang.String r9 = r2.A0C
            int r11 = r2.A00
            r14 = 1
            r10 = 0
            r12 = 8
            r13 = 2
            r8.A00(r9, r10, r11, r12, r13, r14)
            X.AnonymousClass4Yv.A00(r2, r13)
            X.0z4 r3 = r2.A0A
            r3.A29(r4)
            X.0z4 r3 = r2.A0A
            r3.A28(r4)
            if (r4 == 0) goto L_0x021a
            r0 = 38
            X.4rM r3 = new X.4rM
            r3.<init>(r2, r0)
            X.05w r0 = X.A9B.A05(r2)
            if (r0 != 0) goto L_0x020f
            r3.run()
            return
        L_0x020f:
            r0.show()
            X.1KB r2 = r2.A05
            r0 = 1000(0x3e8, double:4.94E-321)
            r2.A0K(r3, r0)
            return
        L_0x021a:
            X.00H r3 = r2.A4b()
            java.lang.Object r8 = r3.get()
            X.9kJ r8 = (X.C190059kJ) r8
            java.lang.String r9 = r2.A0C
            int r3 = r2.A00
            java.lang.String r10 = "OTP_CODE_INPUT_ERROR"
            r11 = r3
            r14 = r13
            r8.A00(r9, r10, r11, r12, r13, r14)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
            long r5 = r3.toMillis(r0)
            X.11P r3 = r2.A05
            long r3 = X.AnonymousClass11P.A01(r3)
            long r5 = r5 + r3
            r2.A01 = r5
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            com.whatsapp.email.VerifyEmailActivity.A0V(r2, r3)
            r4 = 0
            int r3 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x0268
            r6 = 2131889665(0x7f120e01, float:1.9414E38)
            java.lang.Object[] r5 = X.AnonymousClass3MW.A1a()
            X.0vb r4 = r2.A00
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
            long r0 = r3.toMillis(r0)
            java.lang.String r0 = X.C64052u8.A0A(r4, r0)
            r5[r7] = r0
            java.lang.String r0 = r2.getString(r6, r5)
            r2.BhR(r0)
            return
        L_0x0268:
            r0 = 2131889664(0x7f120e00, float:1.9413998E38)
            r2.BhQ(r0)
            return
        L_0x026f:
            java.lang.Object r3 = r6.A03
            com.whatsapp.registration.email.VerifyEmail r3 = (com.whatsapp.registration.email.VerifyEmail) r3
            boolean r4 = r6.A01
            long r0 = r6.A00
            r10 = 0
            r2 = 2
            X.AnonymousClass4Yv.A00(r3, r2)
            X.00H r2 = r3.A4f()
            java.lang.Object r11 = r2.get()
            X.9kJ r11 = (X.C190059kJ) r11
            java.lang.String r12 = r3.A0N
            int r14 = r3.A00
            r7 = 1
            if (r4 == 0) goto L_0x02b4
            r17 = 1
            r13 = 0
        L_0x0290:
            r15 = 8
            r16 = 2
            r11.A00(r12, r13, r14, r15, r16, r17)
            X.0z4 r2 = r3.A0A
            r2.A29(r4)
            X.0z4 r2 = r3.A0A
            r2.A28(r4)
            if (r4 == 0) goto L_0x02c4
            r0 = 12
            X.Ajv r4 = new X.Ajv
            r4.<init>(r3, r0)
            X.05w r0 = X.A9B.A05(r3)
            if (r0 != 0) goto L_0x02b9
            r4.run()
            return
        L_0x02b4:
            r17 = 2
            java.lang.String r13 = "OTP_CODE_INPUT_ERROR"
            goto L_0x0290
        L_0x02b9:
            r0.show()
            X.1KB r2 = r3.A05
            r0 = 1000(0x3e8, double:4.94E-321)
            r2.A0K(r4, r0)
            return
        L_0x02c4:
            X.4VX r2 = r3.A09
            java.lang.String r4 = "codeInputBoxManager"
            if (r2 == 0) goto L_0x0315
            boolean r2 = r2.A06()
            if (r2 == 0) goto L_0x02d7
            X.4VX r2 = r3.A09
            if (r2 == 0) goto L_0x0315
            r2.A01()
        L_0x02d7:
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            long r8 = r2.toMillis(r0)
            X.11P r2 = r3.A05
            long r4 = X.AnonymousClass11P.A01(r2)
            long r8 = r8 + r4
            r3.A01 = r8
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            com.whatsapp.registration.email.VerifyEmail.A0c(r3, r2)
            r4 = 0
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x030e
            r6 = 2131889665(0x7f120e01, float:1.9414E38)
            java.lang.Object[] r5 = new java.lang.Object[r7]
            X.0vb r4 = r3.A00
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            long r0 = r2.toMillis(r0)
            java.lang.String r0 = X.C64052u8.A0A(r4, r0)
            r5[r10] = r0
            java.lang.String r0 = r3.getString(r6, r5)
            r3.BhR(r0)
            return
        L_0x030e:
            r0 = 2131889664(0x7f120e00, float:1.9413998E38)
            r3.BhQ(r0)
            return
        L_0x0315:
            X.C18070vi.A11(r4)
            r0 = 0
            throw r0
        L_0x031a:
            java.lang.String r0 = "left"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DTY.run():void");
    }

    public DTY(PhotoView photoView) {
        this.A02 = 3;
        this.A03 = photoView;
    }
}
