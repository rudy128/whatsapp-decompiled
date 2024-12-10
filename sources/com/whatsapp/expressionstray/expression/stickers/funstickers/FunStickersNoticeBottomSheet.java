package com.whatsapp.expressionstray.expression.stickers.funstickers;

import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass1GP;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass71D;
import X.AnonymousClass78H;
import X.AnonymousClass7PS;
import X.C108955ca;
import X.C108975cc;
import X.C133806pW;
import X.C150447kh;
import X.C155857tQ;
import X.C18070vi;
import X.C72453Mb;
import X.C88414Zp;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.List;

public final class FunStickersNoticeBottomSheet extends Hilt_FunStickersNoticeBottomSheet {
    public AnonymousClass00H A00;

    public void A21(Bundle bundle, View view) {
        int i;
        TextView A0C;
        View view2 = view;
        C18070vi.A0d(view2, 0);
        super.A21(bundle, view2);
        Object A0y = AnonymousClass3Ma.A0y(AnonymousClass00R.A0C, new C155857tQ(this));
        int A0I = C72453Mb.A0I(C88414Zp.A03(this, "stickerOrigin", 10));
        AnonymousClass00H r0 = this.A00;
        if (r0 != null) {
            AnonymousClass71D r11 = (AnonymousClass71D) r0.get();
            AnonymousClass1GP A0O = AnonymousClass3MX.A0O(A1D());
            Integer valueOf = Integer.valueOf(A0I);
            C150447kh r12 = new C150447kh(this);
            AnonymousClass00H r5 = r11.A01;
            if (((C133806pW) r5.get()).A01() && (A0C = C108975cc.A0C(view2)) != null) {
                A0C.setText(2131890563);
            }
            LinearLayout linearLayout = (LinearLayout) view2.findViewById(2131430031);
            if (linearLayout != null) {
                int dimensionPixelSize = linearLayout.getResources().getDimensionPixelSize(2131166868);
                List<AnonymousClass7PS> list = r11.A02;
                int i2 = 0;
                for (AnonymousClass7PS r8 : list) {
                    int i3 = i2 + 1;
                    if (i2 == AnonymousClass3MX.A01(list)) {
                        i = linearLayout.getResources().getDimensionPixelSize(2131166869);
                    } else {
                        i = dimensionPixelSize;
                    }
                    AnonymousClass71D.A01(AnonymousClass71D.A00(AnonymousClass3MY.A04(linearLayout), r8, -1.0f), linearLayout, r11, (Integer) null, dimensionPixelSize, i);
                    i2 = i3;
                }
                AnonymousClass71D r18 = r11;
                LinearLayout linearLayout2 = linearLayout;
                AnonymousClass71D.A01(C108955ca.A0G(AnonymousClass3MZ.A0D(view2), linearLayout, 2131625404, false), linearLayout2, r18, (Integer) null, 0, linearLayout.getResources().getDimensionPixelSize(2131166870));
                int A002 = AnonymousClass3MX.A00(linearLayout.getResources(), 2131166521, dimensionPixelSize);
                if (((C133806pW) r5.get()).A01()) {
                    AnonymousClass71D.A01(AnonymousClass71D.A00(AnonymousClass3MY.A04(linearLayout), new AnonymousClass7PS((Object) null, (Object) null, 2131890551), 12.0f), linearLayout2, r18, Integer.valueOf(A002), dimensionPixelSize, AnonymousClass3Ma.A02(linearLayout, 2131166870));
                }
                LinearLayout linearLayout3 = linearLayout;
                AnonymousClass71D r6 = r11;
                AnonymousClass71D.A01(AnonymousClass71D.A00(AnonymousClass3MY.A04(linearLayout), new AnonymousClass7PS((Object) null, (Object) null, 2131890553), 12.0f), linearLayout3, r6, Integer.valueOf(A002), dimensionPixelSize, 0);
            }
            View findViewById = view2.findViewById(2131431112);
            if (findViewById != null) {
                findViewById.setOnClickListener(new AnonymousClass78H(r11, r12, A0y, A0O, valueOf, 3));
                return;
            }
            return;
        }
        C18070vi.A11("noticeBuilder");
        throw null;
    }
}
