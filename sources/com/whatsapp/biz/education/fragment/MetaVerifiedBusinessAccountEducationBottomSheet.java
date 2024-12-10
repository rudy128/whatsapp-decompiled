package com.whatsapp.biz.education.fragment;

import X.AnonymousClass00H;
import X.AnonymousClass129;
import X.AnonymousClass1EG;
import X.AnonymousClass1HF;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.C17890vO;
import X.C18030ve;
import X.C18070vi;
import X.C21445AkC;
import X.C36401np;
import X.C72453Mb;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.TextEmojiLabel;
import java.util.Locale;

public final class MetaVerifiedBusinessAccountEducationBottomSheet extends Hilt_MetaVerifiedBusinessAccountEducationBottomSheet {
    public C18030ve A00;
    public AnonymousClass129 A01;
    public C36401np A02;
    public AnonymousClass00H A03;
    public AnonymousClass00H A04;
    public AnonymousClass00H A05;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return AnonymousClass3MX.A0A(layoutInflater, viewGroup, 2131626061);
    }

    public void A21(Bundle bundle, View view) {
        String str;
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        TextEmojiLabel A0c = C72453Mb.A0c(view, 2131429927);
        String string = A15().getString("verified_name");
        if (string != null) {
            SpannableString spannableString = new SpannableString(AnonymousClass3MY.A0o(this, string, 0, 2131892228));
            C36401np r7 = this.A02;
            if (r7 != null) {
                Context A1n = A1n();
                String A1H = A1H(2131899101);
                C21445AkC akC = new C21445AkC(this, 4);
                Object[] A1a = AnonymousClass3MW.A1a();
                A1a[0] = A1H;
                SpannableStringBuilder A0A = AnonymousClass3MY.A0A(A1n, r7, akC, String.format(Locale.US, "<a href='link'>%s</a>", AnonymousClass1EG.A0K(A1a)), "link");
                SpannableStringBuilder A09 = AnonymousClass3MW.A09(spannableString);
                A09.append(" ");
                A09.append(A0A);
                C18030ve r0 = this.A00;
                if (r0 != null) {
                    AnonymousClass3Ma.A1L(r0, A0c);
                    A0c.setText(A09);
                    AnonymousClass3MZ.A1I(AnonymousClass1HF.A06(view, 2131434059), this, 12);
                    AnonymousClass3MW.A0E(view, 2131428487).inflate();
                    return;
                }
                str = "abProps";
            } else {
                str = "linkifier";
            }
            C18070vi.A11(str);
            throw null;
        }
        throw C17890vO.A0K();
    }
}
