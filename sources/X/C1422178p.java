package X;

import android.view.View;
import com.whatsapp.voipcalling.VoipCallControlBottomSheetV2;

/* renamed from: X.78p  reason: invalid class name and case insensitive filesystem */
public class C1422178p implements View.OnTouchListener {
    public float A00;
    public float A01;
    public final /* synthetic */ VoipCallControlBottomSheetV2 A02;

    public C1422178p(VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2) {
        this.A02 = voipCallControlBottomSheetV2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00bb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r11, android.view.MotionEvent r12) {
        /*
            r10 = this;
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r4 = r10.A02
            X.73c r0 = r4.A0K
            r3 = 1
            if (r0 == 0) goto L_0x00a5
            boolean r2 = r0.A07()
            X.6lg r0 = r4.A0b
            if (r0 == 0) goto L_0x0170
            com.whatsapp.voipcalling.VoipActivityV2 r1 = r0.A00
            boolean r0 = r1.A2K
            if (r0 != 0) goto L_0x0023
            com.whatsapp.contact.picker.ContactPickerFragment r0 = r1.A16
            if (r0 != 0) goto L_0x0023
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r0 = r1.A0g
            X.1DT r0 = r0.A0M
            java.lang.Object r0 = r0.A06()
            if (r0 == 0) goto L_0x0170
        L_0x0023:
            r9 = 1
        L_0x0024:
            float r6 = r12.getX()
            float r5 = r12.getY()
            X.1FL r0 = r4.A1B()
            if (r0 == 0) goto L_0x00b9
            if (r2 != 0) goto L_0x00b9
            int r0 = com.whatsapp.voipcalling.VoipCallControlBottomSheetV2.A00(r4)
            float r0 = (float) r0
            float r0 = r0 + r5
            r12.setLocation(r6, r0)
            X.1FL r0 = r4.A1B()
            r0.dispatchTouchEvent(r12)
            X.6lg r0 = r4.A0b
            if (r0 == 0) goto L_0x00b9
            java.util.ArrayList r1 = X.AnonymousClass000.A13()
            com.whatsapp.voipcalling.VoipActivityV2 r8 = r0.A00
            boolean r0 = r8.A2D
            if (r0 != 0) goto L_0x006a
            android.widget.ImageButton r0 = r8.A0H
            X.C17960vV.A05(r0)
            r1.add(r0)
            android.view.View r0 = r8.A0C
            X.C17960vV.A05(r0)
            r1.add(r0)
            android.view.ViewGroup r0 = r8.A0G
            X.C17960vV.A05(r0)
            r1.add(r0)
        L_0x006a:
            X.8At r0 = r8.A0n
            if (r0 == 0) goto L_0x0077
            android.view.View r0 = r0.BZs()
            if (r0 == 0) goto L_0x0077
            r1.add(r0)
        L_0x0077:
            X.1bI r0 = r8.A1V
            android.view.View r0 = r0.A02()
            r1.add(r0)
            android.graphics.Rect r7 = X.AnonymousClass3MW.A07()
            java.util.Iterator r2 = r1.iterator()
        L_0x0088:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00a6
            android.view.View r0 = X.AnonymousClass3MX.A0E(r2)
            r0.getGlobalVisibleRect(r7)
            float r0 = r12.getX()
            int r1 = (int) r0
            float r0 = r12.getY()
            int r0 = (int) r0
            boolean r0 = r7.contains(r1, r0)
            if (r0 == 0) goto L_0x0088
        L_0x00a5:
            return r3
        L_0x00a6:
            X.1bI r1 = r8.A1T
            android.view.View r0 = r1.A00
            if (r0 == 0) goto L_0x00b9
            android.view.View r0 = r1.A02()
            com.whatsapp.calling.header.ui.CallScreenHeaderView r0 = (com.whatsapp.calling.header.ui.CallScreenHeaderView) r0
            boolean r0 = r0.A0A(r12)
            if (r0 == 0) goto L_0x00b9
            return r3
        L_0x00b9:
            if (r9 != 0) goto L_0x00a5
            int r0 = r12.getAction()
            r2 = 0
            if (r0 != 0) goto L_0x0121
            r10.A00 = r6
            r10.A01 = r5
        L_0x00c6:
            com.whatsapp.calling.views.VoipCallControlBottomSheetDragIndicator r0 = r4.A0S
            if (r0 == 0) goto L_0x0146
            X.73c r0 = r4.A0K
            boolean r0 = r0.A08()
            if (r0 != 0) goto L_0x0146
            int r0 = r12.getAction()
            if (r0 == r3) goto L_0x00de
            int r0 = r12.getAction()
            if (r0 != 0) goto L_0x0146
        L_0x00de:
            com.whatsapp.calling.views.VoipCallControlBottomSheetDragIndicator r1 = r4.A0S
            android.view.View r0 = r4.A07
            int r0 = r0.getTop()
            float r8 = (float) r0
            float r8 = r8 - r5
            int r7 = r12.getAction()
            int r0 = r1.A01
            if (r0 != 0) goto L_0x00fd
            android.content.res.Resources r9 = r1.getResources()
            r0 = 2131165615(0x7f0701af, float:1.7945452E38)
            int r0 = r9.getDimensionPixelSize(r0)
            r1.A01 = r0
        L_0x00fd:
            int r0 = r1.getLeft()
            float r0 = (float) r0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0143
            int r0 = r1.getRight()
            float r0 = (float) r0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0143
            int r0 = r1.A01
            float r0 = (float) r0
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0143
            boolean r0 = com.whatsapp.calling.views.VoipCallControlBottomSheetDragIndicator.A01(r1, r7)
            if (r0 == 0) goto L_0x0146
            r10.A00 = r2
            r10.A01 = r2
            return r3
        L_0x0121:
            int r1 = r12.getAction()
            r0 = 2
            if (r1 != r0) goto L_0x00c6
            float r0 = r10.A00
            float r0 = X.C108945cZ.A00(r6, r0)
            float r1 = r4.A03
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x013e
            float r0 = r10.A01
            float r0 = X.C108945cZ.A00(r5, r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00c6
        L_0x013e:
            r10.A00 = r2
            r10.A01 = r2
            goto L_0x00c6
        L_0x0143:
            r0 = 0
            r1.A03 = r0
        L_0x0146:
            int r0 = r12.getAction()
            if (r0 != r3) goto L_0x00a5
            float r0 = r10.A00
            float r0 = X.C108945cZ.A00(r6, r0)
            float r1 = r4.A03
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x00a5
            float r0 = r10.A01
            float r0 = X.C108945cZ.A00(r5, r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x00a5
            com.whatsapp.calling.controls.viewmodel.BottomSheetViewModel r0 = r4.A0M
            boolean r0 = r0.A01
            if (r0 != 0) goto L_0x00a5
            r10.A00 = r2
            r10.A01 = r2
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2.A03(r4)
            return r3
        L_0x0170:
            r9 = 0
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1422178p.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
