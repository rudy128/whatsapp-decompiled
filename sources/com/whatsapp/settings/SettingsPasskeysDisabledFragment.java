package com.whatsapp.settings;

import X.AnonymousClass00H;
import X.AnonymousClass1HF;
import X.AnonymousClass1OB;
import X.AnonymousClass20F;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass48o;
import X.AnonymousClass4CF;
import X.AnonymousClass5LZ;
import X.AnonymousClass5PA;
import X.C103625La;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C18100vl;
import X.C86174Qo;
import X.C88494Zy;
import X.C99274sY;
import X.C99434so;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.wds.components.textlayout.WDSTextLayout;
import java.util.Iterator;
import java.util.List;

public final class SettingsPasskeysDisabledFragment extends Hilt_SettingsPasskeysDisabledFragment {
    public C18030ve A00;
    public AnonymousClass00H A01;
    public AnonymousClass00H A02;
    public AnonymousClass1OB A03;
    public final C18100vl A04;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        String str;
        List A002;
        C18070vi.A0d(layoutInflater, 0);
        View inflate = layoutInflater.inflate(2131624094, viewGroup, false);
        WDSTextLayout wDSTextLayout = (WDSTextLayout) C18070vi.A05(inflate, 2131433454);
        C18030ve r1 = this.A00;
        if (r1 != null) {
            C18040vf r4 = C18040vf.A02;
            if (C18020vd.A05(r4, r1, 9236)) {
                C18030ve r12 = this.A00;
                if (r12 != null) {
                    int A003 = C18020vd.A00(r4, r12, 10644);
                    if (A003 == 1) {
                        AnonymousClass3MY.A1J(this, wDSTextLayout, 2131893559);
                        C88494Zy[] r5 = new C88494Zy[3];
                        C88494Zy.A01(AnonymousClass3MY.A0n(this, 2131893553), (CharSequence) null, r5, 2131232392, 0);
                        C88494Zy.A02(A1H(2131893555), r5, 2131231910);
                        A002 = C88494Zy.A00(A1H(2131893557), r5, 2131233277);
                    } else if (A003 != 2) {
                        AnonymousClass3MY.A1J(this, wDSTextLayout, 2131893558);
                        C88494Zy[] r52 = new C88494Zy[3];
                        C88494Zy.A01(AnonymousClass3MY.A0n(this, 2131893552), (CharSequence) null, r52, 2131232392, 0);
                        C88494Zy.A02(A1H(2131893554), r52, 2131231910);
                        A002 = C88494Zy.A00(A1H(2131893557), r52, 2131233277);
                    } else {
                        AnonymousClass3MY.A1J(this, wDSTextLayout, 2131893560);
                        C88494Zy[] r53 = new C88494Zy[3];
                        C88494Zy.A01(AnonymousClass3MY.A0n(this, 2131893553), (CharSequence) null, r53, 2131232392, 0);
                        C88494Zy.A02(A1H(2131893556), r53, 2131231910);
                        A002 = C88494Zy.A00(A1H(2131893557), r53, 2131233277);
                    }
                    AnonymousClass4CF.A00(wDSTextLayout, A002);
                    View A06 = AnonymousClass1HF.A06(wDSTextLayout, 2131429513);
                    C18070vi.A0z(A06, "null cannot be cast to non-null type android.view.ViewGroup");
                    Iterator A004 = C99434so.A00(A06, 1);
                    while (A004.hasNext()) {
                        View A062 = AnonymousClass1HF.A06(AnonymousClass3MX.A0E(A004), 2131428481);
                        C18070vi.A0z(A062, "null cannot be cast to non-null type com.whatsapp.WaImageView");
                        ImageView imageView = (ImageView) A062;
                        imageView.setColorFilter(AnonymousClass3MZ.A02(imageView.getContext(), imageView.getContext(), 2130971950, 2131103050));
                    }
                }
            } else {
                AnonymousClass3MY.A1J(this, wDSTextLayout, 2131895962);
                C18070vi.A0b(inflate);
                TextEmojiLabel textEmojiLabel = (TextEmojiLabel) AnonymousClass3MX.A0C(inflate, 2131433456);
                AnonymousClass00H r0 = this.A01;
                if (r0 != null) {
                    ((C86174Qo) r0.get()).A00(A14(), textEmojiLabel);
                } else {
                    str = "descriptionHelper";
                    C18070vi.A11(str);
                    throw null;
                }
            }
            AnonymousClass3MY.A1I(this, wDSTextLayout, 2131895958);
            AnonymousClass48o.A02(wDSTextLayout, this, 26);
            return inflate;
        }
        str = "abProps";
        C18070vi.A11(str);
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.whatsapp.settings.SettingsPasskeysDisabledFragment r6, X.C30391dr r7) {
        /*
            boolean r0 = r7 instanceof X.C100714ux
            if (r0 == 0) goto L_0x0074
            r5 = r7
            X.4ux r5 = (X.C100714ux) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0074
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r4 = r5.result
            X.1g4 r3 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r5.label
            r2 = 1
            if (r0 == 0) goto L_0x0045
            if (r0 != r2) goto L_0x007a
            java.lang.Object r1 = r5.L$1
            java.lang.Object r6 = r5.L$0
            X.C30691eM.A01(r4)
        L_0x0024:
            boolean r0 = r4 instanceof X.C175348yZ
            if (r0 == 0) goto L_0x0039
            java.lang.String r0 = "SettingsPasskeys/createPasskey/success"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 7
            X.4ro r2 = new X.4ro
            r2.<init>((java.lang.Object) r1, (int) r0)
        L_0x0033:
            X.C26176Ctu.A01(r2)
        L_0x0036:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0039:
            boolean r0 = r4 instanceof X.C175338yY
            if (r0 == 0) goto L_0x0036
            r0 = 21
            X.7Pl r2 = new X.7Pl
            r2.<init>(r6, r4, r0)
            goto L_0x0033
        L_0x0045:
            X.C30691eM.A01(r4)
            java.lang.String r0 = "SettingsPasskeys/createPasskey"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1FL r1 = r6.A1B()
            if (r1 != 0) goto L_0x0058
            java.lang.String r0 = "SettingsPasskeys/no activity bound"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0058:
            X.AnonymousClass3MW.A1W(r1)
            X.01E r1 = (X.AnonymousClass01E) r1
            if (r1 == 0) goto L_0x0036
            X.0vl r0 = r6.A04
            java.lang.Object r0 = r0.getValue()
            com.whatsapp.settings.SettingsPasskeysViewModel r0 = (com.whatsapp.settings.SettingsPasskeysViewModel) r0
            r5.L$0 = r6
            r5.L$1 = r1
            r5.label = r2
            java.lang.Object r4 = r0.A0T(r1, r5)
            if (r4 != r3) goto L_0x0024
            return r3
        L_0x0074:
            X.4ux r5 = new X.4ux
            r5.<init>(r6, r7)
            goto L_0x0012
        L_0x007a:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.settings.SettingsPasskeysDisabledFragment.A00(com.whatsapp.settings.SettingsPasskeysDisabledFragment, X.1dr):java.lang.Object");
    }

    public SettingsPasskeysDisabledFragment() {
        AnonymousClass20F A15 = AnonymousClass3MW.A15(SettingsPasskeysViewModel.class);
        this.A04 = C99274sY.A00(new AnonymousClass5LZ(this), new C103625La(this), new AnonymousClass5PA(this), A15);
    }
}
