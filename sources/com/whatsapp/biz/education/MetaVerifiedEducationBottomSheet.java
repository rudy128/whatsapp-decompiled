package com.whatsapp.biz.education;

import X.AnonymousClass00H;
import X.AnonymousClass129;
import X.AnonymousClass1LC;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3Ma;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C183959aB;
import X.C18600wl;
import X.C189759jn;
import X.C19740yt;
import X.C19880zA;
import X.C21445AkC;
import X.C21461AkS;
import X.C36401np;
import X.C72463Mc;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.wds.components.button.WDSButton;

public final class MetaVerifiedEducationBottomSheet extends Hilt_MetaVerifiedEducationBottomSheet {
    public C19880zA A00;
    public C19880zA A01;
    public C19880zA A02;
    public C19880zA A03;
    public C19880zA A04;
    public TextEmojiLabel A05;
    public AnonymousClass1LC A06;
    public C183959aB A07;
    public C18030ve A08;
    public AnonymousClass129 A09;
    public C36401np A0A;
    public C189759jn A0B;
    public WDSButton A0C;
    public WDSButton A0D;
    public AnonymousClass00H A0E;
    public AnonymousClass00H A0F;
    public C18600wl A0G;
    public C18600wl A0H;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return AnonymousClass3MX.A0A(layoutInflater, viewGroup, 2131626063);
    }

    public void A21(Bundle bundle, View view) {
        String str;
        Context context;
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        this.A0C = AnonymousClass3MW.A0r(view, 2131434057);
        this.A0D = AnonymousClass3MW.A0r(view, 2131434999);
        this.A05 = AnonymousClass3MX.A0W(view, 2131429945);
        Context A14 = A14();
        C18030ve r2 = this.A08;
        if (r2 != null) {
            int i = 2131103274;
            if (C18020vd.A05(C18040vf.A02, r2, 5276)) {
                i = 2131102905;
            }
            int A002 = C19740yt.A00(A14, i);
            ImageView A0H2 = AnonymousClass3MW.A0H(view, 2131432746);
            if (A0H2 != null) {
                A0H2.setImageResource(2131233475);
                A0H2.setColorFilter(A002);
            }
            C183959aB r4 = this.A07;
            if (r4 != null) {
                r4.A01.execute(new C21461AkS(r4, 27, A15().getInt("referral")));
                C36401np r22 = this.A0A;
                if (r22 != null) {
                    View view2 = this.A0B;
                    Context context2 = null;
                    if (view2 != null) {
                        context = view2.getContext();
                    } else {
                        context = null;
                    }
                    String A1H = A1H(2131892232);
                    View view3 = this.A0B;
                    if (view3 != null) {
                        context2 = view3.getContext();
                    }
                    SpannableStringBuilder A062 = r22.A06(context, new C21445AkC(this, 3), A1H, "learn-more", C72463Mc.A02(context2));
                    TextEmojiLabel textEmojiLabel = this.A05;
                    if (textEmojiLabel != null) {
                        C18030ve r0 = this.A08;
                        if (r0 != null) {
                            AnonymousClass3Ma.A1L(r0, textEmojiLabel);
                        }
                    }
                    TextEmojiLabel textEmojiLabel2 = this.A05;
                    if (textEmojiLabel2 != null) {
                        textEmojiLabel2.setText(A062);
                    }
                    WDSButton wDSButton = this.A0C;
                    if (wDSButton != null) {
                        wDSButton.setText(2131899101);
                        AnonymousClass3Ma.A1C(wDSButton, this, 33);
                    }
                    WDSButton wDSButton2 = this.A0D;
                    if (wDSButton2 != null) {
                        wDSButton2.setText(2131890770);
                        AnonymousClass3Ma.A1C(wDSButton2, this, 32);
                        return;
                    }
                    return;
                }
                str = "linkifier";
            } else {
                str = "metaVerifiedEducationLogger";
            }
            C18070vi.A11(str);
            throw null;
        }
        str = "abProps";
        C18070vi.A11(str);
        throw null;
    }

    public void A1s() {
        super.A1s();
        this.A0C = null;
        this.A0D = null;
        this.A05 = null;
    }
}
