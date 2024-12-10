package X;

import android.content.Context;
import android.view.OrientationEventListener;

/* renamed from: X.5dz  reason: invalid class name and case insensitive filesystem */
public class C109775dz extends OrientationEventListener {
    public int A00 = -1;
    public final C125686bW A01;

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00eb, code lost:
        if (r12 >= 300) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x011d, code lost:
        if (r2 == 3) goto L_0x011f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onOrientationChanged(int r12) {
        /*
            r11 = this;
            r1 = -1
            if (r12 == r1) goto L_0x0141
            r0 = 330(0x14a, float:4.62E-43)
            if (r12 >= r0) goto L_0x00f0
            r0 = 30
            if (r12 < r0) goto L_0x00f0
            r0 = 60
            if (r12 < r0) goto L_0x00ed
            r0 = 120(0x78, float:1.68E-43)
            if (r12 >= r0) goto L_0x00d9
            r2 = 1
        L_0x0014:
            int r0 = r11.A00
            if (r2 == r0) goto L_0x0141
            if (r2 == r1) goto L_0x0141
            r11.A00 = r2
            X.6bW r0 = r11.A01
            X.7DY r4 = r0.A00
            r1 = 1
            if (r2 == r1) goto L_0x0027
            r0 = 3
            if (r2 == r0) goto L_0x0027
            r1 = 0
        L_0x0027:
            r4.A0j = r1
            X.1FU r0 = r4.A0H
            if (r0 == 0) goto L_0x0141
            boolean r0 = r4.A0t()
            if (r0 != 0) goto L_0x0141
            X.741 r5 = r4.A0M
            if (r5 != 0) goto L_0x003e
            java.lang.String r0 = "cameraActionsController"
        L_0x0039:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x003e:
            int r0 = r5.A02
            float r0 = X.C88234Yw.A00(r0)
            float r3 = X.C88234Yw.A00(r2)
            X.1D6 r1 = X.C88234Yw.A01(r0, r3)
            java.lang.Object r0 = r1.first
            float r7 = X.AnonymousClass000.A04(r0)
            java.lang.Object r0 = r1.second
            float r6 = X.AnonymousClass000.A04(r0)
            android.view.animation.RotateAnimation r8 = X.AnonymousClass741.A00(r7, r6)
            com.whatsapp.WaImageView r1 = r5.A0K
            android.view.animation.RotateAnimation r0 = X.AnonymousClass741.A00(r7, r6)
            r1.startAnimation(r0)
            com.whatsapp.wds.components.button.WDSButton r0 = r5.A0U
            r0.startAnimation(r8)
            com.whatsapp.wds.components.button.WDSButton r1 = r5.A09
            if (r1 == 0) goto L_0x0075
            android.view.animation.RotateAnimation r0 = X.AnonymousClass741.A00(r7, r6)
            r1.startAnimation(r0)
        L_0x0075:
            X.6fp r0 = r5.A0N
            X.0vk r0 = r0.A01
            java.lang.Object r0 = r0.invoke()
            boolean r0 = X.AnonymousClass000.A1Y(r0)
            if (r0 == 0) goto L_0x0088
            com.whatsapp.wds.components.button.WDSButton r0 = r5.A0T
            r0.startAnimation(r8)
        L_0x0088:
            X.1bI r1 = r5.A0Q
            android.view.View r0 = r1.A00
            if (r0 == 0) goto L_0x00a5
            android.view.View r1 = X.AnonymousClass3MX.A0D(r1)
            boolean r0 = r1.isLaidOut()
            if (r0 == 0) goto L_0x00d0
            boolean r0 = r1.isLayoutRequested()
            if (r0 != 0) goto L_0x00d0
            android.view.animation.RotateAnimation r0 = X.AnonymousClass741.A00(r7, r6)
            r1.startAnimation(r0)
        L_0x00a5:
            android.view.View r1 = r5.A0H
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x00b4
            android.view.animation.RotateAnimation r0 = X.AnonymousClass741.A00(r7, r6)
            r1.startAnimation(r0)
        L_0x00b4:
            r5.A00 = r6
            r5.A02 = r2
            boolean r1 = r5.A0A
            r0 = 1
            if (r1 != 0) goto L_0x00c7
            r5.A0A = r0
        L_0x00bf:
            X.6zv r1 = r4.A0T
            if (r1 != 0) goto L_0x00f3
            java.lang.String r0 = "recordingController"
            goto L_0x0039
        L_0x00c7:
            if (r2 == r0) goto L_0x00cc
            r0 = 3
            if (r2 != r0) goto L_0x00bf
        L_0x00cc:
            X.AnonymousClass7DY.A0H(r4)
            goto L_0x00bf
        L_0x00d0:
            X.78a r0 = new X.78a
            r0.<init>(r5, r7, r6)
            r1.addOnLayoutChangeListener(r0)
            goto L_0x00a5
        L_0x00d9:
            r0 = 150(0x96, float:2.1E-43)
            if (r12 < r0) goto L_0x00ed
            r0 = 210(0xd2, float:2.94E-43)
            if (r12 >= r0) goto L_0x00e4
            r2 = 2
            goto L_0x0014
        L_0x00e4:
            r0 = 240(0xf0, float:3.36E-43)
            if (r12 < r0) goto L_0x00ed
            r0 = 300(0x12c, float:4.2E-43)
            r2 = 3
            if (r12 < r0) goto L_0x0014
        L_0x00ed:
            r2 = -1
            goto L_0x0014
        L_0x00f0:
            r2 = 0
            goto L_0x0014
        L_0x00f3:
            boolean r7 = r4.A0f
            X.6u4 r0 = r4.A15
            boolean r9 = r0.A01()
            X.3hQ r6 = r4.A0N
            com.whatsapp.camera.recording.RecordingView r5 = r1.A06
            r5.setRotation(r3)
            android.view.ViewGroup$LayoutParams r3 = r5.getLayoutParams()
            X.1sZ r3 = (X.C39151sZ) r3
            r0 = 1
            r1 = -1
            r10 = 0
            if (r2 != r0) goto L_0x012b
            r3.A0T = r10
            r3.A0p = r10
            r3.A0l = r1
        L_0x0113:
            r3.A0B = r10
        L_0x0115:
            r5.setLayoutParams(r3)
            r0 = 1
            if (r2 == r0) goto L_0x011f
            r0 = 3
            r8 = 0
            if (r2 != r0) goto L_0x0120
        L_0x011f:
            r8 = 1
        L_0x0120:
            r5.A01(r6, r7, r8, r9, r10)
            X.3ho r0 = r4.A0O
            if (r0 == 0) goto L_0x0141
            r0.A0c(r2)
            return
        L_0x012b:
            r0 = 3
            if (r2 != r0) goto L_0x0135
            r3.A0T = r1
            r3.A0p = r10
            r3.A0l = r10
            goto L_0x0113
        L_0x0135:
            r3.A0T = r10
            r0 = 2131428777(0x7f0b05a9, float:1.8479208E38)
            r3.A0p = r0
            r3.A0l = r10
            r3.A0B = r1
            goto L_0x0115
        L_0x0141:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C109775dz.onOrientationChanged(int):void");
    }

    public C109775dz(Context context, C125686bW r3) {
        super(context);
        this.A01 = r3;
    }
}
