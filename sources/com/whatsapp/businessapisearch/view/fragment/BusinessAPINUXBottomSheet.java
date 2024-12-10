package com.whatsapp.businessapisearch.view.fragment;

import X.AFN;
import X.AnonymousClass11C;
import X.AnonymousClass1HF;
import X.AnonymousClass1KB;
import X.AnonymousClass1L9;
import X.AnonymousClass1LU;
import X.AnonymousClass1YL;
import X.AnonymousClass3Ma;
import X.AnonymousClass86E;
import X.C18030ve;
import X.C18070vi;
import X.C19740yt;
import X.C21446AkD;
import X.C36401np;
import X.C72453Mb;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.TextEmojiLabel;

public final class BusinessAPINUXBottomSheet extends Hilt_BusinessAPINUXBottomSheet implements AnonymousClass86E {
    public AnonymousClass1L9 A00;
    public AnonymousClass1KB A01;
    public AnonymousClass11C A02;
    public C18030ve A03;
    public AnonymousClass1LU A04;
    public C36401np A05;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        String str;
        C18070vi.A0d(layoutInflater, 0);
        View inflate = layoutInflater.inflate(2131625349, viewGroup, false);
        AnonymousClass1HF.A0L(C19740yt.A03(A14(), AnonymousClass1YL.A00(A14(), 2130971786, 2131102904)), inflate);
        View A052 = C18070vi.A05(inflate, 2131428437);
        TextEmojiLabel A0c = C72453Mb.A0c(inflate, 2131433246);
        C18030ve r0 = this.A03;
        if (r0 != null) {
            AnonymousClass3Ma.A1L(r0, A0c);
            C36401np r6 = this.A05;
            if (r6 != null) {
                A0c.setText(r6.A05(inflate.getContext(), new C21446AkD(this, 11), A1H(2131886971), "learn-more"));
                AnonymousClass1HF.A06(inflate, 2131433235).setOnClickListener(new AFN(this, 1));
                A052.setOnClickListener(new AFN(this, 2));
                return inflate;
            }
            str = "linkifier";
        } else {
            str = "abProps";
        }
        C18070vi.A11(str);
        throw null;
    }

    public void A2K(View view) {
        C18070vi.A0d(view, 0);
        super.A2K(view);
        BottomSheetBehavior A022 = BottomSheetBehavior.A02(view);
        C18070vi.A0X(A022);
        A022.A0d(true);
    }
}
