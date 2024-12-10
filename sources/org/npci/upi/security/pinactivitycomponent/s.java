package org.npci.upi.security.pinactivitycomponent;

import X.AnonymousClass000;
import X.AnonymousClass1FL;
import X.AnonymousClass3MZ;
import X.AnonymousClass78M;
import X.AnonymousClass8Do;
import X.B6S;
import X.C161188Cd;
import X.C17880vN;
import X.C17890vO;
import X.C192349oE;
import X.C19740yt;
import X.C21357Aim;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Timer;
import org.npci.upi.security.pinactivitycomponent.widget.FormItemEditText;

public abstract class s extends Fragment implements B6S {
    public int A00 = -1;
    public int A01 = 2;
    public Context A02;
    public CountDownTimer A03 = null;
    public ArrayList A04 = AnonymousClass000.A13();
    public Timer A05 = null;
    public boolean A06 = false;
    public boolean A07 = false;
    public C192349oE A08;
    public Handler A09;
    public Runnable A0A;
    public Timer A0B;

    public void A1x(Context context) {
        super.A1x(context);
        this.A02 = context;
        this.A08 = new C192349oE(context);
    }

    public AnonymousClass8Do A25(Boolean bool, String str, String str2, String str3, int i, int i2) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        AnonymousClass8Do r2 = new AnonymousClass8Do(A1B(), this.A02);
        r2.setActionBarPositionTop(true);
        layoutParams.width = -2;
        FormItemEditText formItemEditText = r2.A0G;
        formItemEditText.setCharSize(0.0f);
        formItemEditText.setSpace((float) ((int) (15.0f * ((float) (AnonymousClass3MZ.A09(this).getDisplayMetrics().densityDpi / 160)))));
        formItemEditText.setFontSize((float) ((int) (24.0f * ((float) (AnonymousClass3MZ.A09(this).getDisplayMetrics().densityDpi / 160)))));
        formItemEditText.setMargin(new int[]{80, (int) (25.0f * ((float) (AnonymousClass3MZ.A09(this).getDisplayMetrics().densityDpi / 160))), 80, 0});
        formItemEditText.setLineStrokeCentered(true);
        formItemEditText.setLineStrokeSelected((float) ((int) (2.0f * ((float) (AnonymousClass3MZ.A09(this).getDisplayMetrics().densityDpi / 160)))));
        formItemEditText.setColorStates(C19740yt.A03(A1B(), 2131101065));
        r2.setLayoutParams(layoutParams);
        r2.setInputLength(i2);
        r2.A0H = this;
        r2.setTitle(str);
        r2.A01 = i;
        r2.setEducationalText(str2);
        r2.A0F = str3;
        if (((GetCredential) this.A02).A0D.A0K) {
            r2.setForgotUpi(bool);
            return r2;
        }
        r2.setForgotUpi(false);
        return r2;
    }

    public void A28(AnonymousClass8Do r8) {
        r8.BAJ((Drawable) null, (View.OnClickListener) null, "", false, false);
        r8.A00(r8.A05, false);
        this.A03 = new C161188Cd(this, r8).start();
        r8.A01();
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:45:0x0087=Splitter:B:45:0x0087, B:26:0x004d=Splitter:B:26:0x004d} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A27(X.C190839lb r9) {
        /*
            r8 = this;
            java.lang.String r6 = "otp_type_aadhaar"
            java.lang.String r3 = "AADHAAR"
            int r1 = r8.A00     // Catch:{ Exception -> 0x00ba }
            r0 = -1
            if (r1 == r0) goto L_0x00ba
            java.util.ArrayList r7 = r8.A04     // Catch:{ Exception -> 0x00ba }
            boolean r0 = r8.A06     // Catch:{ Exception -> 0x00ba }
            if (r0 == 0) goto L_0x0011
            int r1 = r1 + -1
        L_0x0011:
            X.8Do r0 = X.AnonymousClass8BR.A1C(r7, r1)     // Catch:{ Exception -> 0x00ba }
            boolean r0 = r0.isShown()     // Catch:{ Exception -> 0x00ba }
            if (r0 == 0) goto L_0x0024
            boolean r1 = r8.A06     // Catch:{ Exception -> 0x00ba }
            int r0 = r8.A00     // Catch:{ Exception -> 0x00ba }
            if (r1 == 0) goto L_0x0026
            int r0 = r0 + -1
            goto L_0x0026
        L_0x0024:
            int r0 = r8.A00     // Catch:{ Exception -> 0x00ba }
        L_0x0026:
            X.8Do r5 = X.AnonymousClass8BR.A1C(r7, r0)     // Catch:{ Exception -> 0x00ba }
            boolean r0 = r8.A06     // Catch:{ Exception -> 0x00ba }
            r1 = 1
            java.lang.String r4 = "otp_type_bank"
            java.lang.String r2 = ""
            if (r0 == 0) goto L_0x007d
            java.lang.String r0 = r5.A0F     // Catch:{ Exception -> 0x00ba }
            boolean r0 = r0.equals(r3)     // Catch:{ Exception -> 0x00ba }
            if (r0 == 0) goto L_0x0064
            java.lang.String r0 = r9.A00     // Catch:{ Exception -> 0x00ba }
            boolean r0 = r0.contains(r3)     // Catch:{ Exception -> 0x00ba }
            if (r0 == 0) goto L_0x0064
            X.9oE r0 = r8.A08     // Catch:{ Exception -> 0x00ba }
            android.content.SharedPreferences r0 = r0.A01     // Catch:{ Exception -> 0x004c }
            java.lang.String r3 = r0.getString(r6, r2)     // Catch:{ Exception -> 0x004c }
            goto L_0x004d
        L_0x004c:
            r3 = 0
        L_0x004d:
            boolean r0 = r3.isEmpty()     // Catch:{ Exception -> 0x00ba }
            if (r0 != 0) goto L_0x00ba
            r8.A07 = r1     // Catch:{ Exception -> 0x00ba }
            r5.setText(r3)     // Catch:{ Exception -> 0x00ba }
            X.9oE r0 = r8.A08     // Catch:{ Exception -> 0x00ba }
            android.content.SharedPreferences r0 = r0.A01     // Catch:{ Exception -> 0x00ba }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ Exception -> 0x00ba }
            r0.putString(r6, r2)     // Catch:{ Exception -> 0x00ba }
            goto L_0x00b7
        L_0x0064:
            java.lang.String r3 = r5.A0F     // Catch:{ Exception -> 0x00ba }
            java.lang.String r0 = "SMS"
            boolean r0 = r3.equals(r0)     // Catch:{ Exception -> 0x00ba }
            if (r0 == 0) goto L_0x00ba
            boolean r0 = r8.A07     // Catch:{ Exception -> 0x00ba }
            if (r0 != 0) goto L_0x00ba
            X.9oE r0 = r8.A08     // Catch:{ Exception -> 0x00ba }
            android.content.SharedPreferences r0 = r0.A01     // Catch:{ Exception -> 0x007b }
            java.lang.String r3 = r0.getString(r4, r2)     // Catch:{ Exception -> 0x007b }
            goto L_0x00a1
        L_0x007b:
            r3 = 0
            goto L_0x00a1
        L_0x007d:
            X.9oE r0 = r8.A08     // Catch:{ Exception -> 0x00ba }
            android.content.SharedPreferences r0 = r0.A01     // Catch:{ Exception -> 0x0086 }
            java.lang.String r3 = r0.getString(r4, r2)     // Catch:{ Exception -> 0x0086 }
            goto L_0x0087
        L_0x0086:
            r3 = 0
        L_0x0087:
            boolean r0 = r3.isEmpty()     // Catch:{ Exception -> 0x00ba }
            if (r0 != 0) goto L_0x00ba
            r8.A07 = r1     // Catch:{ Exception -> 0x00ba }
            boolean r1 = r8.A06     // Catch:{ Exception -> 0x00ba }
            int r0 = r8.A00     // Catch:{ Exception -> 0x00ba }
            if (r1 == 0) goto L_0x0097
            int r0 = r0 + -1
        L_0x0097:
            java.lang.Object r0 = r7.get(r0)     // Catch:{ Exception -> 0x00ba }
            X.BDB r0 = (X.BDB) r0     // Catch:{ Exception -> 0x00ba }
            r0.setText(r3)     // Catch:{ Exception -> 0x00ba }
            goto L_0x00a9
        L_0x00a1:
            boolean r0 = r3.isEmpty()     // Catch:{ Exception -> 0x00ba }
            if (r0 != 0) goto L_0x00ba
            r8.A07 = r1     // Catch:{ Exception -> 0x00ba }
        L_0x00a9:
            r5.setText(r3)     // Catch:{ Exception -> 0x00ba }
            X.9oE r0 = r8.A08     // Catch:{ Exception -> 0x00ba }
            android.content.SharedPreferences r0 = r0.A01     // Catch:{ Exception -> 0x00ba }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ Exception -> 0x00ba }
            r0.putString(r4, r2)     // Catch:{ Exception -> 0x00ba }
        L_0x00b7:
            r0.commit()     // Catch:{ Exception -> 0x00ba }
        L_0x00ba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.npci.upi.security.pinactivitycomponent.s.A27(X.9lb):void");
    }

    public void A1r() {
        Runnable runnable;
        super.A1r();
        Timer timer = this.A05;
        if (timer != null) {
            try {
                timer.cancel();
            } catch (Exception unused) {
            }
        }
        CountDownTimer countDownTimer = this.A03;
        if (countDownTimer != null) {
            try {
                countDownTimer.cancel();
            } catch (Exception unused2) {
            }
        }
        Timer timer2 = this.A0B;
        if (timer2 != null) {
            try {
                timer2.cancel();
            } catch (Exception unused3) {
            }
        }
        Handler handler = this.A09;
        if (handler != null && (runnable = this.A0A) != null) {
            handler.removeCallbacks(runnable);
        }
    }

    public void A21(Bundle bundle, View view) {
        AnonymousClass1FL A1B = A1B();
        if (A1B instanceof GetCredential) {
            GetCredential getCredential = (GetCredential) A1B;
            getCredential.A0F = this;
            this.A01 = getCredential.A0D.A00;
        }
    }

    public void A26(String str) {
        View findViewById = A1B().findViewById(2131433968);
        findViewById.setVisibility(0);
        findViewById.setAnimation(AnimationUtils.loadAnimation(A1n(), 2130772046));
        C17880vN.A0E(findViewById, 2131433985).setText(str);
        findViewById.findViewById(2131433970).setOnClickListener(new AnonymousClass78M(findViewById, this, 33));
        this.A0B = new Timer();
        Handler A0D = C17890vO.A0D();
        this.A09 = A0D;
        C21357Aim aim = new C21357Aim(this, findViewById, 12);
        this.A0A = aim;
        A0D.postDelayed(aim, 3000);
    }
}
