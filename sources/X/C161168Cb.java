package X;

import android.os.CountDownTimer;
import android.widget.TextView;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;
import com.whatsapp.registration.phonenumberentry.RegisterPhone;

/* renamed from: X.8Cb  reason: invalid class name and case insensitive filesystem */
public class C161168Cb extends CountDownTimer {
    public final int A00 = 0;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C161168Cb(PinBottomSheetDialogFragment pinBottomSheetDialogFragment, long j) {
        super(j, 1000);
        this.A01 = pinBottomSheetDialogFragment;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0187, code lost:
        if (r3 == 30) goto L_0x0162;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x008e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onFinish() {
        /*
            r18 = this;
            r13 = r18
            int r0 = r13.A00
            if (r0 == 0) goto L_0x0198
            java.lang.Object r12 = r13.A01
            com.whatsapp.registration.phonenumberentry.RegisterPhone r12 = (com.whatsapp.registration.phonenumberentry.RegisterPhone) r12
            X.9gv r0 = r12.A0L
            android.widget.EditText r0 = r0.A02
            android.text.Editable r0 = r0.getText()
            java.lang.String r11 = X.C17900vP.A08(r0)
            X.9gv r0 = r12.A0L
            android.widget.EditText r0 = r0.A03
            android.text.Editable r0 = r0.getText()
            java.lang.String r10 = X.C17900vP.A08(r0)
            if (r11 == 0) goto L_0x0194
            if (r10 == 0) goto L_0x0194
            java.lang.String r9 = ""
            boolean r0 = r11.equals(r9)
            if (r0 != 0) goto L_0x0194
            X.1LA r1 = r12.A04
            java.lang.String r0 = r12.A0u
            java.lang.String r8 = X.A9B.A0E(r1, r10, r11, r0)
            if (r8 == 0) goto L_0x0194
            X.1LA r0 = r12.A04
            java.lang.String r3 = X.A9B.A0D(r0, r11, r8)
            int r1 = r3.length()
            int r0 = r8.length()
            if (r1 < r0) goto L_0x0194
            r2 = 2131894999(0x7f1222d7, float:1.9424819E38)
            r7 = 1
            java.lang.Object[] r1 = new java.lang.Object[r7]
            X.0vb r0 = r12.A00
            java.lang.String r0 = r0.A0G(r3)
            r6 = 0
            java.lang.String r5 = X.C17880vN.A0q(r12, r0, r1, r6, r2)
            X.1LA r0 = r12.A04
            java.lang.String r1 = X.C63942tw.A03(r0, r11, r10)
            int r0 = r11.length()
            java.lang.String r0 = r8.substring(r0)
            java.lang.String r4 = "\\D"
            java.lang.String r3 = r0.replaceAll(r4, r9)
            java.lang.String r17 = r1.replaceAll(r4, r9)
            int r2 = r17.length()
            int r1 = r3.length()
            int r0 = r2 - r1
            int r16 = java.lang.Math.abs(r0)
            r0 = r16
            if (r0 != r7) goto L_0x008f
            if (r2 <= r1) goto L_0x008f
        L_0x0085:
            r14 = -1
        L_0x0086:
            boolean r0 = r12.A0x
            if (r0 == 0) goto L_0x00c6
            int r0 = r12.A01
            if (r0 != r14) goto L_0x00c6
            return
        L_0x008f:
            r1 = 0
            r14 = 0
        L_0x0091:
            if (r1 < r2) goto L_0x0096
            if (r16 != 0) goto L_0x00b4
            goto L_0x0085
        L_0x0096:
            char r15 = r5.charAt(r14)     // Catch:{ StringIndexOutOfBoundsException -> 0x018e }
            char r0 = r3.charAt(r1)     // Catch:{ StringIndexOutOfBoundsException -> 0x018e }
            if (r15 == r0) goto L_0x00a3
            int r14 = r14 + 1
            goto L_0x0096
        L_0x00a3:
            r0 = r17
            char r15 = r0.charAt(r1)     // Catch:{ StringIndexOutOfBoundsException -> 0x018e }
            char r0 = r3.charAt(r1)     // Catch:{ StringIndexOutOfBoundsException -> 0x018e }
            if (r15 != r0) goto L_0x00c1
            int r14 = r14 + 1
            int r1 = r1 + 1
            goto L_0x0091
        L_0x00b4:
            char r1 = r5.charAt(r14)     // Catch:{ StringIndexOutOfBoundsException -> 0x018e }
            char r0 = r3.charAt(r2)     // Catch:{ StringIndexOutOfBoundsException -> 0x018e }
            if (r1 == r0) goto L_0x00c1
            int r14 = r14 + 1
            goto L_0x00b4
        L_0x00c1:
            r0 = -2
            if (r14 != r0) goto L_0x0086
            goto L_0x0194
        L_0x00c6:
            r12.A01 = r14
            int r1 = r5.length()
            int r0 = r1 + -2
            if (r14 != r0) goto L_0x018a
            com.whatsapp.registration.phonenumberentry.RegisterPhone.A1D = r7
        L_0x00d2:
            android.widget.ScrollView r2 = r12.A0C
            android.widget.TextView r0 = r12.A0D
            int r0 = r0.getBottom()
            r2.scrollTo(r6, r0)
            android.text.SpannableString r2 = new android.text.SpannableString
            r2.<init>(r5)
            X.8Cz r0 = new X.8Cz
            r0.<init>(r13, r11, r8)
            r3 = 17
            r2.setSpan(r0, r6, r1, r3)
            android.widget.TextView r1 = r12.A0D
            android.text.method.MovementMethod r0 = android.text.method.LinkMovementMethod.getInstance()
            r1.setMovementMethod(r0)
            r0 = -1
            if (r14 == r0) goto L_0x0104
            r0 = -65536(0xffffffffffff0000, float:NaN)
            android.text.style.ForegroundColorSpan r1 = new android.text.style.ForegroundColorSpan
            r1.<init>(r0)
            int r0 = r14 + 1
            r2.setSpan(r1, r14, r0, r3)
        L_0x0104:
            java.lang.String r0 = r2.toString()
            java.lang.String r3 = r0.replaceAll(r4, r9)
            java.lang.String r5 = r10.replaceAll(r4, r9)
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()
            java.lang.String r0 = "RegisterPhone/suggested/cc/"
            r4.append(r0)
            r4.append(r11)
            java.lang.String r0 = " pn="
            r4.append(r0)
            r4.append(r5)
            java.lang.String r0 = " suggest="
            r4.append(r0)
            r4.append(r8)
            java.lang.String r0 = " s="
            r4.append(r0)
            java.lang.String r0 = r12.A0u
            r4.append(r0)
            java.lang.String r0 = " disp="
            r4.append(r0)
            r4.append(r3)
            java.lang.String r0 = " same="
            r4.append(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r11)
            X.1LA r0 = r12.A04
            java.lang.String r0 = X.C63942tw.A03(r0, r11, r5)
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            boolean r0 = r3.equals(r0)
            X.C17900vP.A0r(r4, r0)
            r12.A10 = r7
            int r3 = r12.A00
            r1 = 31
            if (r3 != r1) goto L_0x0185
            r1 = 32
        L_0x0162:
            r12.A00 = r1
        L_0x0164:
            android.widget.TextView r1 = r12.A0D
            android.widget.TextView$BufferType r0 = android.widget.TextView.BufferType.SPANNABLE
            r1.setText(r2, r0)
            r1 = 0
            r0 = 1065353216(0x3f800000, float:1.0)
            android.view.animation.AlphaAnimation r2 = new android.view.animation.AlphaAnimation
            r2.<init>(r1, r0)
            r0 = 150(0x96, double:7.4E-322)
            r2.setDuration(r0)
            android.widget.TextView r0 = r12.A0D
            r0.startAnimation(r2)
            android.widget.TextView r0 = r12.A0D
            r0.setVisibility(r6)
            r12.A0x = r7
            return
        L_0x0185:
            r0 = 30
            if (r3 != r0) goto L_0x0164
            goto L_0x0162
        L_0x018a:
            com.whatsapp.registration.phonenumberentry.RegisterPhone.A1E = r7
            goto L_0x00d2
        L_0x018e:
            r1 = move-exception
            java.lang.String r0 = "RegistrationUtils/getIndexOfDifference/skip"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0194:
            r12.A4n()
            return
        L_0x0198:
            java.lang.Object r2 = r13.A01
            com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment r2 = (com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment) r2
            r0 = 0
            r2.A01 = r0
            android.widget.TextView r1 = r2.A03
            r0 = 4
            r1.setVisibility(r0)
            com.whatsapp.CodeInputField r1 = r2.A04
            r0 = 0
            r1.setErrorState(r0)
            com.whatsapp.CodeInputField r1 = r2.A04
            r0 = 1
            r1.setEnabled(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C161168Cb.onFinish():void");
    }

    public void onTick(long j) {
        if (this.A00 == 0) {
            PinBottomSheetDialogFragment pinBottomSheetDialogFragment = (PinBottomSheetDialogFragment) this.A01;
            TextView textView = pinBottomSheetDialogFragment.A03;
            Object[] A1a = AnonymousClass3MW.A1a();
            A1a[0] = C64052u8.A0D(pinBottomSheetDialogFragment.A06, (String) null, C17880vN.A04(j));
            AnonymousClass8BT.A18(textView, pinBottomSheetDialogFragment, A1a, 2131893688);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C161168Cb(RegisterPhone registerPhone) {
        super(200, 200);
        this.A01 = registerPhone;
    }
}
