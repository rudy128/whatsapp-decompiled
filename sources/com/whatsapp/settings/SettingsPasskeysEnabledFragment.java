package com.whatsapp.settings;

import X.AnonymousClass00H;
import X.AnonymousClass20F;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass5PB;
import X.C103635Lb;
import X.C103645Lc;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C18100vl;
import X.C30391dr;
import X.C72453Mb;
import X.C86174Qo;
import X.C90094dW;
import X.C99274sY;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.TextEmojiLabel;

public final class SettingsPasskeysEnabledFragment extends Hilt_SettingsPasskeysEnabledFragment {
    public C18030ve A00;
    public AnonymousClass00H A01;
    public AnonymousClass00H A02;
    public AnonymousClass00H A03;
    public final C18100vl A04;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        String str;
        int i;
        C18070vi.A0d(layoutInflater, 0);
        View inflate = layoutInflater.inflate(2131625387, viewGroup, false);
        C18070vi.A0b(inflate);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) AnonymousClass3MX.A0C(inflate, 2131433456);
        AnonymousClass00H r0 = this.A01;
        if (r0 != null) {
            ((C86174Qo) r0.get()).A00(A14(), textEmojiLabel);
            TextView A0W = C72453Mb.A0W(inflate, 2131435300);
            C18030ve r1 = this.A00;
            if (r1 != null) {
                C18040vf r2 = C18040vf.A02;
                if (C18020vd.A05(r2, r1, 9168)) {
                    A0W.setText(A1H(2131898874));
                    A0W.setTextColor(AnonymousClass3MZ.A09(this).getColor(2131103172));
                    i = 28;
                } else {
                    i = 29;
                }
                C90094dW.A00(A0W, this, i);
                C18030ve r12 = this.A00;
                if (r12 != null) {
                    if (C18020vd.A05(r2, r12, 9464)) {
                        TextView A0W2 = C72453Mb.A0W(inflate, 2131435299);
                        AnonymousClass3MX.A1Q(new SettingsPasskeysEnabledFragment$initPasskeyContext$1(A0W2, this, (C30391dr) null), AnonymousClass3MZ.A0H(this));
                    }
                    return inflate;
                }
            }
            str = "abProps";
        } else {
            str = "descriptionHelper";
        }
        C18070vi.A11(str);
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.whatsapp.settings.SettingsPasskeysEnabledFragment r7, X.C30391dr r8) {
        /*
            boolean r0 = r8 instanceof X.C100814v7
            if (r0 == 0) goto L_0x0093
            r6 = r8
            X.4v7 r6 = (X.C100814v7) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0093
            int r2 = r2 - r1
            r6.label = r2
        L_0x0012:
            java.lang.Object r1 = r6.result
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r6.label
            r2 = 1
            if (r0 == 0) goto L_0x005e
            if (r0 != r2) goto L_0x009a
            java.lang.Object r4 = r6.L$2
            java.lang.Object r3 = r6.L$1
            X.9mj r3 = (X.C191519mj) r3
            java.lang.Object r7 = r6.L$0
            X.C30691eM.A01(r1)
        L_0x0028:
            X.9MT r1 = (X.AnonymousClass9MT) r1
            boolean r0 = r1 instanceof X.C175348yZ
            if (r0 == 0) goto L_0x0046
            java.lang.String r0 = "SettingsPasskeys/revokePasskey/success"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1 = 0
            r0 = 15
            r3.A00(r1, r1, r0)
            r1 = 22
        L_0x003b:
            X.7Pl r0 = new X.7Pl
            r0.<init>(r7, r4, r1)
            X.C26176Ctu.A01(r0)
        L_0x0043:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0046:
            boolean r0 = r1 instanceof X.C175338yY
            if (r0 == 0) goto L_0x0043
            X.8yY r1 = (X.C175338yY) r1
            java.lang.Object r2 = r1.A00
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.String r0 = "SettingsPasskeys/revokePasskey/error"
            com.whatsapp.util.Log.e(r0, r2)
            r1 = 0
            r0 = 16
            r3.A00(r1, r2, r0)
            r1 = 23
            goto L_0x003b
        L_0x005e:
            X.C30691eM.A01(r1)
            java.lang.String r0 = "SettingsPasskeys/revokePasskey"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0vl r1 = r7.A04
            java.lang.Object r0 = r1.getValue()
            com.whatsapp.settings.SettingsPasskeysViewModel r0 = (com.whatsapp.settings.SettingsPasskeysViewModel) r0
            X.9mj r3 = r0.A00
            if (r3 == 0) goto L_0x009f
            X.1FL r4 = r7.A1B()
            if (r4 != 0) goto L_0x007e
            java.lang.String r0 = "SettingsPasskeys/no activity bound"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0043
        L_0x007e:
            java.lang.Object r0 = r1.getValue()
            com.whatsapp.settings.SettingsPasskeysViewModel r0 = (com.whatsapp.settings.SettingsPasskeysViewModel) r0
            r6.L$0 = r7
            r6.L$1 = r3
            r6.L$2 = r4
            r6.label = r2
            java.lang.Object r1 = r0.A0U(r6)
            if (r1 != r5) goto L_0x0028
            return r5
        L_0x0093:
            X.4v7 r6 = new X.4v7
            r6.<init>(r7, r8)
            goto L_0x0012
        L_0x009a:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x009f:
            java.lang.String r0 = "logger"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.settings.SettingsPasskeysEnabledFragment.A00(com.whatsapp.settings.SettingsPasskeysEnabledFragment, X.1dr):java.lang.Object");
    }

    public SettingsPasskeysEnabledFragment() {
        AnonymousClass20F A15 = AnonymousClass3MW.A15(SettingsPasskeysViewModel.class);
        this.A04 = C99274sY.A00(new C103635Lb(this), new C103645Lc(this), new AnonymousClass5PB(this), A15);
    }
}
