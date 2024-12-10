package X;

import android.view.View;

public class AFE implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public AFE(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x02f0, code lost:
        r1 = (X.BIJ) r10.A01;
        r1.A03(r1.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x02f9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x03d6, code lost:
        r0.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x03d9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x05f0, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x05f4, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x017d, code lost:
        if (r1 == false) goto L_0x017f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0191, code lost:
        r1.A09(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0195, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01ef, code lost:
        if (r1.size() != 0) goto L_0x01f1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r11) {
        /*
            r10 = this;
            int r0 = r10.A00
            switch(r0) {
                case 0: goto L_0x0216;
                case 1: goto L_0x021e;
                case 2: goto L_0x023f;
                case 3: goto L_0x0011;
                case 4: goto L_0x0085;
                case 5: goto L_0x00ab;
                case 6: goto L_0x00c5;
                case 7: goto L_0x00d3;
                case 8: goto L_0x0254;
                case 9: goto L_0x01cf;
                case 10: goto L_0x0106;
                case 11: goto L_0x013c;
                case 12: goto L_0x0260;
                case 13: goto L_0x028e;
                case 14: goto L_0x02ac;
                case 15: goto L_0x0152;
                case 16: goto L_0x02e5;
                case 17: goto L_0x0166;
                case 18: goto L_0x0010;
                case 19: goto L_0x02f0;
                case 20: goto L_0x02ed;
                case 21: goto L_0x02fa;
                case 22: goto L_0x03d2;
                case 23: goto L_0x0306;
                case 24: goto L_0x019b;
                case 25: goto L_0x0005;
                case 26: goto L_0x0005;
                case 27: goto L_0x034a;
                case 28: goto L_0x0364;
                case 29: goto L_0x037d;
                case 30: goto L_0x01a7;
                case 31: goto L_0x0386;
                case 32: goto L_0x03b5;
                case 33: goto L_0x03bf;
                case 34: goto L_0x01bf;
                case 35: goto L_0x03c5;
                case 36: goto L_0x03d2;
                case 37: goto L_0x03da;
                case 38: goto L_0x04de;
                case 39: goto L_0x03eb;
                case 40: goto L_0x040c;
                case 41: goto L_0x0477;
                case 42: goto L_0x0487;
                case 43: goto L_0x0569;
                case 44: goto L_0x0490;
                case 45: goto L_0x05d5;
                case 46: goto L_0x0498;
                case 47: goto L_0x04a0;
                case 48: goto L_0x04ae;
                case 49: goto L_0x04b6;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r10.A01
            X.4aN r0 = (X.AnonymousClass4aN) r0
            android.view.View r1 = r0.A0D
            r0 = 8
            r1.setVisibility(r0)
        L_0x0010:
            return
        L_0x0011:
            java.lang.Object r4 = r10.A01
            com.facebook.smartcapture.ui.DefaultCaptureOverlayFragment r4 = (com.facebook.smartcapture.ui.DefaultCaptureOverlayFragment) r4
            com.facebook.smartcapture.ui.PhotoRequirementsView r5 = r4.A08
            if (r5 == 0) goto L_0x0072
            r0 = 1
            r5.A02 = r0
            r5.removeAllViews()
            android.content.Context r3 = r5.getContext()
            X.C18070vi.A0b(r3)
            r0 = 2130971020(0x7f04098c, float:1.7550767E38)
            int r1 = X.AnonymousClass6VZ.A00(r3, r0)
            r0 = 120(0x78, float:1.68E-43)
            int r2 = X.AnonymousClass1Z2.A06(r1, r0)
            android.view.View r1 = r5.A00
            X.C18070vi.A0b(r1)
            X.8DG r0 = new X.8DG
            r0.<init>(r3, r1, r2)
            r5.A01 = r0
            r5.addView(r0)
            X.8DG r3 = r5.A01
            X.C18070vi.A0b(r3)
            r0 = 1
            r3.setFocusableInTouchMode(r0)
            r3.requestFocus()
            android.view.View r0 = r3.A01
            android.view.ViewPropertyAnimator r1 = r0.animate()
            r0 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r2 = r1.alpha(r0)
            r0 = 250(0xfa, double:1.235E-321)
            android.view.ViewPropertyAnimator r0 = r2.setDuration(r0)
            r0.start()
            android.view.View r0 = r3.A02
            android.view.ViewTreeObserver r2 = r0.getViewTreeObserver()
            r1 = 0
            X.AFi r0 = new X.AFi
            r0.<init>(r3, r1)
            r2.addOnPreDrawListener(r0)
        L_0x0072:
            X.BVO r0 = r4.A00
            if (r0 == 0) goto L_0x0010
            java.lang.String r2 = "show_photo_requirements"
            java.lang.Object[] r1 = X.AnonymousClass3MW.A1b()
            java.lang.String r0 = "button_name"
            X.AnonymousClass8BS.A1B(r0, r2, r1)
            X.C24568C9p.A00(r1)
            return
        L_0x0085:
            java.lang.Object r3 = r10.A01
            com.facebook.smartcapture.ui.CaptureOverlayFragment r3 = (com.facebook.smartcapture.ui.CaptureOverlayFragment) r3
            X.BVO r0 = r3.A00
            if (r0 == 0) goto L_0x009b
            java.lang.String r2 = "capture_step_back_button"
            java.lang.Object[] r1 = X.AnonymousClass3MW.A1b()
            java.lang.String r0 = "button_name"
            X.AnonymousClass8BS.A1B(r0, r2, r1)
            X.C24568C9p.A00(r1)
        L_0x009b:
            java.lang.ref.WeakReference r0 = r3.A00
            if (r0 == 0) goto L_0x0010
            java.lang.Object r0 = r0.get()
            X.E4u r0 = (X.C28510E4u) r0
            if (r0 == 0) goto L_0x0010
            r0.Bnx()
            return
        L_0x00ab:
            java.lang.Object r0 = r10.A01
            com.facebook.smartcapture.ui.CaptureOverlayFragment r0 = (com.facebook.smartcapture.ui.CaptureOverlayFragment) r0
            java.lang.ref.WeakReference r0 = r0.A00
            if (r0 == 0) goto L_0x0010
            java.lang.Object r0 = r0.get()
            X.E4u r0 = (X.C28510E4u) r0
            if (r0 == 0) goto L_0x0010
            com.facebook.smartcapture.view.IdCaptureActivity r0 = (com.facebook.smartcapture.view.IdCaptureActivity) r0
            X.DEn r1 = r0.A03
            if (r1 != 0) goto L_0x04d5
            java.lang.String r0 = "presenter"
            goto L_0x05f0
        L_0x00c5:
            java.lang.Object r0 = r10.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.1FL r0 = r0.A1B()
            if (r0 == 0) goto L_0x0010
            r0.onBackPressed()
            return
        L_0x00d3:
            java.lang.Object r0 = r10.A01
            com.facebook.smartcapture.view.SelfiePhotoCaptureActivity r0 = (com.facebook.smartcapture.view.SelfiePhotoCaptureActivity) r0
            X.CXR r5 = r0.A01
            if (r5 == 0) goto L_0x0010
            java.lang.String r1 = r5.A06
            if (r1 == 0) goto L_0x0010
            boolean r0 = r5.A04
            if (r0 != 0) goto L_0x0010
            X.C63502tC.A01(r1)
            r4 = 0
            r5.A04 = r4
            r3 = 1
            r5.A04 = r3
            com.facebook.smartcapture.camera.PhotoCameraFragment r0 = r5.A00
            X.DAX r2 = new X.DAX
            r2.<init>(r5)
            X.CSm r1 = new X.CSm
            r1.<init>()
            r1.A03 = r4
            r1.A05 = r3
            r1.A04 = r4
            X.EDL r0 = r0.A25()
            r0.CP0(r1, r2)
            return
        L_0x0106:
            java.lang.Object r5 = r10.A01
            X.5gz r5 = (X.C110745gz) r5
            boolean r0 = r5.A03
            if (r0 == 0) goto L_0x0010
            boolean r0 = r5.isShowing()
            if (r0 == 0) goto L_0x0010
            boolean r0 = r5.A05
            if (r0 != 0) goto L_0x0134
            android.content.Context r4 = r5.getContext()
            r3 = 1
            int[] r2 = new int[r3]
            r1 = 16843611(0x101035b, float:2.3695965E-38)
            r0 = 0
            r2[r0] = r1
            android.content.res.TypedArray r1 = r4.obtainStyledAttributes(r2)
            boolean r0 = r1.getBoolean(r0, r3)
            r5.A04 = r0
            r1.recycle()
            r5.A05 = r3
        L_0x0134:
            boolean r0 = r5.A04
            if (r0 == 0) goto L_0x0010
            r5.cancel()
            return
        L_0x013c:
            java.lang.Object r3 = r10.A01
            com.google.android.material.datepicker.MaterialCalendar r3 = (com.google.android.material.datepicker.MaterialCalendar) r3
            java.lang.Integer r2 = r3.A0A
            java.lang.Integer r1 = X.AnonymousClass00R.A01
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            if (r2 != r1) goto L_0x014c
            r3.A26(r0)
            return
        L_0x014c:
            if (r2 != r0) goto L_0x0010
            r3.A26(r1)
            return
        L_0x0152:
            java.lang.Object r1 = r10.A01
            X.Bin r1 = (X.Bin) r1
            android.widget.EditText r0 = r1.A02
            if (r0 == 0) goto L_0x0010
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x0163
            r0.clear()
        L_0x0163:
            X.BIm r1 = r1.A02
            goto L_0x0191
        L_0x0166:
            java.lang.Object r3 = r10.A01
            X.8RJ r3 = (X.AnonymousClass8RJ) r3
            android.widget.EditText r0 = r3.A00
            if (r0 == 0) goto L_0x0010
            int r2 = r0.getSelectionEnd()
            android.widget.EditText r0 = r3.A00
            if (r0 == 0) goto L_0x017f
            android.text.method.TransformationMethod r0 = r0.getTransformationMethod()
            boolean r1 = r0 instanceof android.text.method.PasswordTransformationMethod
            r0 = 1
            if (r1 != 0) goto L_0x0180
        L_0x017f:
            r0 = 0
        L_0x0180:
            android.widget.EditText r1 = r3.A00
            if (r0 == 0) goto L_0x0196
            r0 = 0
        L_0x0185:
            r1.setTransformationMethod(r0)
            if (r2 < 0) goto L_0x018f
            android.widget.EditText r0 = r3.A00
            r0.setSelection(r2)
        L_0x018f:
            X.BIm r1 = r3.A02
        L_0x0191:
            r0 = 0
            r1.A09(r0)
            return
        L_0x0196:
            android.text.method.PasswordTransformationMethod r0 = android.text.method.PasswordTransformationMethod.getInstance()
            goto L_0x0185
        L_0x019b:
            java.lang.Object r0 = r10.A01
            X.4aN r0 = (X.AnonymousClass4aN) r0
            X.5ai r0 = r0.A02
            if (r0 == 0) goto L_0x0010
            r0.BmC()
            return
        L_0x01a7:
            java.lang.Object r3 = r10.A01
            com.whatsapp.HomeActivity r3 = (com.whatsapp.HomeActivity) r3
            X.1LE r0 = r3.A05
            r2 = 1
            X.0z4 r1 = r0.A00
            java.lang.String r0 = "bottom_nav_tooltip_seen"
            r1.A1w(r0, r2)
            X.1bI r1 = r3.A0y
            if (r1 == 0) goto L_0x0010
            r0 = 8
            r1.A04(r0)
            return
        L_0x01bf:
            java.lang.Object r1 = r10.A01
            com.whatsapp.WaButtonWithLoader r1 = (com.whatsapp.WaButtonWithLoader) r1
            boolean r0 = r1.A04
            if (r0 != 0) goto L_0x0010
            android.view.View$OnClickListener r0 = r1.A00
            if (r0 == 0) goto L_0x0010
            r0.onClick(r1)
            return
        L_0x01cf:
            java.lang.Object r3 = r10.A01
            com.google.android.exoplayer2.ui.TrackSelectionView r3 = (com.google.android.exoplayer2.ui.TrackSelectionView) r3
            android.widget.CheckedTextView r2 = r3.A07
            if (r11 != r2) goto L_0x01fc
            r1 = 1
        L_0x01d8:
            r3.A00 = r1
            android.util.SparseArray r1 = r3.A05
            r1.clear()
            boolean r0 = r3.A00
            r2.setChecked(r0)
            android.widget.CheckedTextView r2 = r3.A06
            boolean r0 = r3.A00
            if (r0 != 0) goto L_0x01f1
            int r1 = r1.size()
            r0 = 1
            if (r1 == 0) goto L_0x01f2
        L_0x01f1:
            r0 = 0
        L_0x01f2:
            r2.setChecked(r0)
            java.lang.String r0 = "array-length"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x01fc:
            android.widget.CheckedTextView r0 = r3.A06
            r1 = 0
            if (r11 == r0) goto L_0x01d8
            r3.A00 = r1
            java.lang.Object r0 = r11.getTag()
            if (r0 == 0) goto L_0x0210
            java.lang.String r0 = "groupIndex"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x0210:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>()
            throw r0
        L_0x0216:
            java.lang.Object r0 = r10.A01
            androidx.preference.Preference r0 = (androidx.preference.Preference) r0
            r0.A0D(r11)
            return
        L_0x021e:
            java.lang.Object r3 = r10.A01
            X.CiW r3 = (X.C25591CiW) r3
            X.CIm r0 = r3.A03
            X.D8A r1 = r0.A00
            X.C0B r0 = X.C0B.FULL_SCREEN
            X.BEZ r0 = r1.A05
            if (r0 == 0) goto L_0x022f
            r0.dismiss()
        L_0x022f:
            r0 = 6
            r1.A00 = r0
            android.os.Handler r2 = r3.A02
            r1 = 32
            X.AkX r0 = new X.AkX
            r0.<init>((java.lang.Object) r3, (int) r1)
            r2.post(r0)
            return
        L_0x023f:
            java.lang.Object r0 = r10.A01
            X.Cig r0 = (X.C25601Cig) r0
            X.CIm r0 = r0.A03
            X.D8A r1 = r0.A00
            X.C0B r0 = X.C0B.FULL_SCREEN
            X.BEZ r0 = r1.A05
            if (r0 == 0) goto L_0x0250
            r0.dismiss()
        L_0x0250:
            r0 = 6
            r1.A00 = r0
            return
        L_0x0254:
            java.lang.Object r1 = r10.A01
            X.8DG r1 = (X.AnonymousClass8DG) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            r1.A00()
            return
        L_0x0260:
            java.lang.Object r4 = r10.A01
            com.google.android.material.datepicker.MaterialDatePicker r4 = (com.google.android.material.datepicker.MaterialDatePicker) r4
            java.util.LinkedHashSet r0 = r4.A0O
            java.util.Iterator r3 = r0.iterator()
        L_0x026a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x028a
            java.lang.Object r1 = r3.next()
            X.B4i r1 = (X.C22355B4i) r1
            X.BDX r0 = com.google.android.material.datepicker.MaterialDatePicker.A01(r4)
            X.AJN r0 = (X.AJN) r0
            java.lang.Long r2 = r0.A01
            X.AJP r1 = (X.AJP) r1
            X.1Di r1 = r1.A00
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            r1.invoke(r2)
            goto L_0x026a
        L_0x028a:
            r4.A28()
            return
        L_0x028e:
            java.lang.Object r2 = r10.A01
            com.google.android.material.datepicker.MaterialDatePicker r2 = (com.google.android.material.datepicker.MaterialDatePicker) r2
            java.util.LinkedHashSet r0 = r2.A0N
            java.util.Iterator r1 = r0.iterator()
        L_0x0298:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x02a8
            java.lang.Object r0 = r1.next()
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r0.onClick(r11)
            goto L_0x0298
        L_0x02a8:
            r2.A28()
            return
        L_0x02ac:
            java.lang.Object r3 = r10.A01
            com.google.android.material.datepicker.MaterialDatePicker r3 = (com.google.android.material.datepicker.MaterialDatePicker) r3
            android.widget.Button r1 = r3.A02
            X.BDX r0 = com.google.android.material.datepicker.MaterialDatePicker.A01(r3)
            X.AJN r0 = (X.AJN) r0
            java.lang.Long r0 = r0.A01
            boolean r0 = X.AnonymousClass000.A1W(r0)
            r1.setEnabled(r0)
            com.google.android.material.internal.CheckableImageButton r0 = r3.A04
            r0.toggle()
            com.google.android.material.internal.CheckableImageButton r0 = r3.A04
            boolean r2 = r0.isChecked()
            android.content.Context r1 = r0.getContext()
            r0 = 2131899238(0x7f123366, float:1.9433416E38)
            if (r2 == 0) goto L_0x02d8
            r0 = 2131899236(0x7f123364, float:1.9433412E38)
        L_0x02d8:
            java.lang.String r1 = r1.getString(r0)
            com.google.android.material.internal.CheckableImageButton r0 = r3.A04
            r0.setContentDescription(r1)
            com.google.android.material.datepicker.MaterialDatePicker.A02(r3)
            return
        L_0x02e5:
            java.lang.Object r0 = r10.A01
            X.Bio r0 = (X.Bio) r0
            X.Bio.A00(r0)
            return
        L_0x02ed:
            r0 = 1
            X.CHU.A00 = r0
        L_0x02f0:
            java.lang.Object r1 = r10.A01
            X.BIJ r1 = (X.BIJ) r1
            int r0 = r1.A01
            r1.A03(r0)
            return
        L_0x02fa:
            java.lang.Object r1 = r10.A01
            android.widget.EditText r1 = (android.widget.EditText) r1
            int r0 = X.AnonymousClass3Ma.A03(r1)
            r1.setSelection(r0)
            return
        L_0x0306:
            java.lang.Object r2 = r10.A01
            com.whatsapp.DisplayExceptionDialogFactory$LoginFailedDialogFragment r2 = (com.whatsapp.DisplayExceptionDialogFactory$LoginFailedDialogFragment) r2
            java.lang.String r0 = "LoginFailedDialogFragment/onCreateDialog/remove current account"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1FL r3 = r2.A1D()
            X.00H r0 = r2.A0C
            X.1cN r0 = X.C17880vN.A0I(r0)
            X.2rb r1 = r0.A03()
            X.0z4 r0 = r2.A08
            int r6 = r0.A0E()
            if (r1 != 0) goto L_0x0338
            X.11O r0 = r2.A09
            java.lang.String r2 = r0.A01()
            r1 = 0
            r0 = 0
            android.content.Intent r0 = X.AnonymousClass1LU.A1Y(r3, r0, r2, r6, r1)
        L_0x0331:
            r3.startActivity(r0)
            r3.finishAffinity()
            return
        L_0x0338:
            long r8 = android.os.SystemClock.elapsedRealtime()
            X.11O r0 = r2.A09
            java.lang.String r5 = r0.A01()
            r4 = 0
            r7 = 10
            android.content.Intent r0 = X.AnonymousClass1LU.A1X(r3, r4, r5, r6, r7, r8)
            goto L_0x0331
        L_0x034a:
            java.lang.Object r0 = r10.A01
            X.8Bb r0 = (X.C161028Bb) r0
            android.app.Activity r1 = r0.A00
            java.lang.String r0 = "android.settings.DATE_SETTINGS"
            android.content.Intent r0 = X.C108945cZ.A0G(r0)
            r1.startActivity(r0)
            r1.finish()
            int r0 = android.os.Process.myPid()
            android.os.Process.killProcess(r0)
            return
        L_0x0364:
            java.lang.Object r2 = r10.A01
            X.8Bb r2 = (X.C161028Bb) r2
            java.lang.String r0 = "android.intent.action.VIEW"
            android.content.Intent r1 = X.C108945cZ.A0G(r0)
            java.lang.String r0 = X.C19620yd.A05
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r1.setData(r0)
            android.app.Activity r0 = r2.A00
            r0.startActivity(r1)
            goto L_0x03d6
        L_0x037d:
            java.lang.Object r1 = r10.A01
            com.whatsapp.HomeActivity r1 = (com.whatsapp.HomeActivity) r1
            r0 = 1
            r1.A4s(r0)
            return
        L_0x0386:
            java.lang.Object r4 = r10.A01
            com.whatsapp.HomeActivity r4 = (com.whatsapp.HomeActivity) r4
            android.content.Intent r3 = X.C17880vN.A0A()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.settings.SettingsTabActivity"
            r3.setClassName(r1, r0)
            X.00H r0 = r4.A1I
            java.lang.Object r0 = r0.get()
            X.1rm r0 = (X.C38721rm) r0
            X.0ve r2 = r0.A01
            r1 = 5288(0x14a8, float:7.41E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x03b1
            r0 = 28
            r4.startActivityForResult(r3, r0)
            return
        L_0x03b1:
            r4.startActivity(r3)
            return
        L_0x03b5:
            java.lang.Object r0 = r10.A01
            com.whatsapp.HomeActivity r0 = (com.whatsapp.HomeActivity) r0
            com.whatsapp.CircleWaImageView r0 = r0.A0X
            r0.callOnClick()
            return
        L_0x03bf:
            java.lang.Object r0 = r10.A01
            X.AnonymousClass3MW.A1V(r0)
            return
        L_0x03c5:
            java.lang.Object r1 = r10.A01
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.String r0 = "acceptlink/confirmation/ok"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1.finish()
            return
        L_0x03d2:
            java.lang.Object r0 = r10.A01
            android.app.Activity r0 = (android.app.Activity) r0
        L_0x03d6:
            r0.finish()
            return
        L_0x03da:
            java.lang.Object r1 = r10.A01
            android.content.Context r1 = (android.content.Context) r1
            java.lang.String r0 = "delete-account/changenumber"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.content.Intent r0 = X.AnonymousClass1LU.A00(r1)
            r1.startActivity(r0)
            return
        L_0x03eb:
            java.lang.Object r2 = r10.A01
            com.whatsapp.account.delete.DeleteAccountFeedback r2 = (com.whatsapp.account.delete.DeleteAccountFeedback) r2
            android.widget.EditText r0 = r2.A03
            r0.clearFocus()
            android.view.View r0 = r2.getCurrentFocus()
            if (r0 == 0) goto L_0x0403
            X.1L4 r1 = r2.A09
            android.view.View r0 = r2.getCurrentFocus()
            r1.A01(r0)
        L_0x0403:
            r0 = 1
            r2.A08 = r0
            X.0Iy r0 = r2.A05
            r0.A00()
            return
        L_0x040c:
            java.lang.Object r5 = r10.A01
            com.whatsapp.account.delete.DeleteAccountFeedback r5 = (com.whatsapp.account.delete.DeleteAccountFeedback) r5
            android.widget.EditText r0 = r5.A03
            int r0 = X.AnonymousClass3Ma.A03(r0)
            if (r0 <= 0) goto L_0x042b
            android.widget.EditText r0 = r5.A03
            int r1 = X.AnonymousClass3Ma.A03(r0)
            r0 = 5
            if (r1 >= r0) goto L_0x042b
            X.1KB r2 = r5.A05
            r1 = 2131889361(0x7f120cd1, float:1.9413383E38)
            r0 = 0
            r2.A08(r1, r0)
            return
        L_0x042b:
            int r4 = r5.A01
            r1 = 1
            android.widget.EditText r0 = r5.A03
            if (r4 != r1) goto L_0x0458
            java.lang.String r4 = X.AnonymousClass3Ma.A12(r0)
            r3 = 1
            com.whatsapp.account.delete.DeleteAccountFeedback$ChangeNumberMessageDialogFragment r2 = new com.whatsapp.account.delete.DeleteAccountFeedback$ChangeNumberMessageDialogFragment
            r2.<init>()
            android.os.Bundle r1 = X.C17880vN.A0D()
            java.lang.String r0 = "deleteReason"
            r1.putInt(r0, r3)
            java.lang.String r0 = "additionalComments"
            r1.putString(r0, r4)
            r2.A1R(r1)
            r5.A06 = r2
            X.1GP r1 = r5.getSupportFragmentManager()
            r0 = 0
            r2.A2C(r1, r0)
            return
        L_0x0458:
            java.lang.String r3 = X.AnonymousClass3Ma.A12(r0)
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r5.getPackageName()
            java.lang.String r0 = "com.whatsapp.account.delete.DeleteAccountConfirmation"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "deleteReason"
            r2.putExtra(r0, r4)
            java.lang.String r0 = "additionalComments"
            r2.putExtra(r0, r3)
            r5.startActivity(r2)
            return
        L_0x0477:
            java.lang.Object r3 = r10.A01
            X.1FY r3 = (X.AnonymousClass1FY) r3
            X.1L9 r2 = r3.A01
            r1 = 1
            r0 = 0
            android.content.Intent r0 = X.AnonymousClass1LU.A1V(r3, r0, r0, r1)
            r2.A08(r3, r0)
            return
        L_0x0487:
            java.lang.Object r1 = r10.A01
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 1
            X.AnonymousClass4Yv.A01(r1, r0)
            return
        L_0x0490:
            java.lang.Object r0 = r10.A01
            com.whatsapp.accountswitching.ui.AccountSwitchingNotAvailableFragment r0 = (com.whatsapp.accountswitching.ui.AccountSwitchingNotAvailableFragment) r0
            com.whatsapp.accountswitching.ui.AccountSwitchingNotAvailableFragment.A00(r0)
            return
        L_0x0498:
            java.lang.Object r0 = r10.A01
            X.5Wc r0 = (X.C106505Wc) r0
            X.AnonymousClass3R4.setUpButtonOnClickListener$lambda$7(r0, r11)
            return
        L_0x04a0:
            java.lang.Object r1 = r10.A01
            X.4hj r1 = (X.C92684hj) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.0vk r0 = r1.A00
            r0.invoke()
            return
        L_0x04ae:
            java.lang.Object r0 = r10.A01
            com.whatsapp.audiopicker.AudioPickerActivity r0 = (com.whatsapp.audiopicker.AudioPickerActivity) r0
            r0.A4c()
            return
        L_0x04b6:
            java.lang.Object r2 = r10.A01
            com.whatsapp.audiopicker.AudioPickerActivity r2 = (com.whatsapp.audiopicker.AudioPickerActivity) r2
            android.widget.RelativeLayout r1 = r2.A02
            r0 = 8
            r1.setVisibility(r0)
            java.util.LinkedHashMap r0 = r2.A0K
            boolean r0 = r0.isEmpty()
            r1 = 1
            if (r0 != 0) goto L_0x04cf
            android.widget.ImageButton r0 = r2.A01
            X.AnonymousClass71W.A00(r0, r1, r1)
        L_0x04cf:
            X.4VZ r0 = r2.A0D
            r0.A05(r1)
            return
        L_0x04d5:
            java.lang.Integer r0 = X.AnonymousClass00R.A04
            r1.A04 = r0
            r0 = 1
            X.C26805DEn.A00(r1, r0)
            return
        L_0x04de:
            java.lang.Object r3 = r10.A01
            com.whatsapp.account.delete.DeleteAccountConfirmation r3 = (com.whatsapp.account.delete.DeleteAccountConfirmation) r3
            r4 = 0
            X.11E r0 = r3.A07
            boolean r0 = r0.A09()
            if (r0 != 0) goto L_0x04f5
            java.lang.String r0 = "DeleteAccountConfirmation/no-connectivity"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 2
            X.AnonymousClass4Yv.A01(r3, r0)
            return
        L_0x04f5:
            r0 = 1
            X.AnonymousClass4Yv.A01(r3, r0)
            android.os.Handler r2 = r3.A00
            if (r2 != 0) goto L_0x0501
            java.lang.String r0 = "timeoutHandler"
            goto L_0x05f0
        L_0x0501:
            r0 = 60000(0xea60, double:2.9644E-319)
            r2.sendEmptyMessageDelayed(r4, r0)
            X.1Mn r2 = r3.A08
            if (r2 == 0) goto L_0x0565
            X.0vb r0 = r3.A00
            java.lang.String r8 = r0.A05()
            X.0vb r0 = r3.A00
            java.lang.String r7 = r0.A04()
            android.content.Intent r1 = r3.getIntent()
            java.lang.String r0 = "additionalComments"
            java.lang.String r6 = r1.getStringExtra(r0)
            android.content.Intent r1 = r3.getIntent()
            java.lang.String r5 = "deleteReason"
            r0 = -1
            int r4 = r1.getIntExtra(r5, r0)
            java.lang.String r0 = "sendmethods/sendremoveaccount"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.00H r0 = r2.A01
            X.1OZ r3 = X.C17880vN.A0U(r0)
            r2 = 0
            r1 = 27
            r0 = 0
            android.os.Message r2 = android.os.Message.obtain(r0, r2, r1, r2)
            android.os.Bundle r1 = r2.getData()
            java.lang.String r0 = "lg"
            r1.putString(r0, r8)
            android.os.Bundle r1 = r2.getData()
            java.lang.String r0 = "lc"
            r1.putString(r0, r7)
            android.os.Bundle r1 = r2.getData()
            java.lang.String r0 = "userFeedback"
            r1.putString(r0, r6)
            android.os.Bundle r0 = r2.getData()
            r0.putInt(r5, r4)
            r3.A0M(r2)
            return
        L_0x0565:
            java.lang.String r0 = "sendMethods"
            goto L_0x05f0
        L_0x0569:
            java.lang.Object r5 = r10.A01
            com.whatsapp.accountswitching.ui.AccountSwitchingBottomSheet r5 = (com.whatsapp.accountswitching.ui.AccountSwitchingBottomSheet) r5
            java.lang.String r0 = "AccountSwitchingBottomSheet/setupAddAccount/add account tapped"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.00H r0 = r5.A0C
            if (r0 == 0) goto L_0x05d2
            X.1cN r0 = X.C17880vN.A0I(r0)
            boolean r0 = r0.A0G()
            if (r0 == 0) goto L_0x059a
            X.1FL r2 = r5.A1B()
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.DialogActivity"
            X.C18070vi.A0z(r2, r0)
            X.1FU r2 = (X.AnonymousClass1FU) r2
            int r1 = r5.A00
            java.lang.String r0 = r5.A0F
            com.whatsapp.accountswitching.ui.AddAccountBottomSheet r0 = X.C83444Fd.A00(r0, r1)
            r2.CMl(r0)
        L_0x0596:
            r5.A28()
            return
        L_0x059a:
            X.00H r0 = r5.A0D
            if (r0 == 0) goto L_0x05ee
            java.lang.Object r3 = X.C18070vi.A0E(r0)
            X.739 r3 = (X.AnonymousClass739) r3
            int r2 = r5.A00
            r1 = 0
            r0 = 3
            r3.A04(r1, r2, r0)
            X.00H r0 = r5.A0E
            if (r0 == 0) goto L_0x05cc
            java.lang.Object r4 = r0.get()
            X.2qm r4 = (X.C62092qm) r4
            android.content.Context r3 = X.AnonymousClass3MY.A04(r11)
            int r2 = r5.A00
            X.1DC r0 = r5.A0A
            if (r0 == 0) goto L_0x05c6
            r1 = 0
            java.lang.String r0 = r5.A0F
            r4.A01(r3, r0, r2, r1)
            goto L_0x0596
        L_0x05c6:
            java.lang.String r0 = "systemFeatures"
            X.C18070vi.A11(r0)
            throw r1
        L_0x05cc:
            java.lang.String r0 = "addAccountNavigator"
            X.C18070vi.A11(r0)
            throw r1
        L_0x05d2:
            java.lang.String r0 = "accountSwitcher"
            goto L_0x05f0
        L_0x05d5:
            java.lang.Object r4 = r10.A01
            com.whatsapp.accountswitching.ui.AccountSwitchingNotAvailableFragment r4 = (com.whatsapp.accountswitching.ui.AccountSwitchingNotAvailableFragment) r4
            X.00H r0 = r4.A01
            if (r0 == 0) goto L_0x05ee
            java.lang.Object r3 = X.C18070vi.A0E(r0)
            X.739 r3 = (X.AnonymousClass739) r3
            r2 = 0
            r1 = 7
            r0 = 21
            r3.A04(r2, r1, r0)
            r4.A29()
            return
        L_0x05ee:
            java.lang.String r0 = "accountSwitchingLogger"
        L_0x05f0:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AFE.onClick(android.view.View):void");
    }
}
