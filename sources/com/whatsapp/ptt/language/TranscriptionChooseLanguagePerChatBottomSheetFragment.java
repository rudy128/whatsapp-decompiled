package com.whatsapp.ptt.language;

import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass7RB;
import X.C127126dq;
import X.C18070vi;
import X.C25351CeA;
import X.C25550Cho;
import X.C36401np;
import X.C72473Md;
import X.C88534a3;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.Iterator;
import java.util.Locale;

public final class TranscriptionChooseLanguagePerChatBottomSheetFragment extends Hilt_TranscriptionChooseLanguagePerChatBottomSheetFragment {
    public WaTextView A00;
    public C127126dq A01;
    public C36401np A02;
    public C88534a3 A03;
    public String A04;
    public WDSButton A05;

    public void A21(Bundle bundle, View view) {
        String str;
        Object obj;
        String str2;
        String str3;
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        C88534a3 r0 = this.A03;
        if (r0 != null) {
            Iterator it = r0.A05().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C18070vi.A18(((C25550Cho) obj).A01, this.A04)) {
                    break;
                }
            }
            C25550Cho cho = (C25550Cho) obj;
            if (cho == null || (str3 = cho.A01) == null || (str2 = C25351CeA.A01(Locale.forLanguageTag(str3))) == null) {
                str2 = "";
            }
            WaTextView A0T = AnonymousClass3MW.A0T(view, 2131436382);
            C36401np r4 = this.A02;
            if (r4 != null) {
                SpannableStringBuilder A06 = r4.A06(A0T.getContext(), new AnonymousClass7RB((Object) this, 4), AnonymousClass3MY.A0o(this, str2, 0, 2131897105), "per-chat-choose-language", 2131102731);
                C72473Md.A1D(A0T);
                A0T.setText(A06);
                this.A00 = A0T;
                WDSButton A0q = AnonymousClass3MW.A0q(view, 2131436383);
                this.A05 = A0q;
                if (A0q != null) {
                    AnonymousClass3Ma.A1A(A0q, this, 12);
                    return;
                }
                return;
            }
            str = "linkifier";
        } else {
            str = "pttTranscriptionConfig";
        }
        C18070vi.A11(str);
        throw null;
    }

    public void A1s() {
        WDSButton wDSButton = this.A05;
        if (wDSButton != null) {
            wDSButton.setOnClickListener((View.OnClickListener) null);
        }
        this.A05 = null;
        WaTextView waTextView = this.A00;
        if (waTextView != null) {
            waTextView.setOnClickListener((View.OnClickListener) null);
        }
        this.A00 = null;
        super.A1s();
    }

    public int A2F() {
        return 2131627222;
    }
}
