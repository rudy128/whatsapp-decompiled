package com.whatsapp.payments.ui;

import X.AFF;
import X.AFQ;
import X.AnonymousClass11C;
import X.AnonymousClass1FY;
import X.AnonymousClass1HF;
import X.AnonymousClass1KB;
import X.AnonymousClass1L9;
import X.AnonymousClass3MW;
import X.AnonymousClass8BR;
import X.AnonymousClass8BS;
import X.B95;
import X.BD4;
import X.C176108zn;
import X.C17880vN;
import X.C18030ve;
import X.C18070vi;
import X.C20157A9t;
import X.C20834AaC;
import X.C22373B5c;
import X.C26302CxJ;
import X.C72453Mb;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.TextEmojiLabel;

public final class PaymentsWarmWelcomeBottomSheet extends Hilt_PaymentsWarmWelcomeBottomSheet {
    public BD4 A00;
    public B95 A01;
    public C22373B5c A02;
    public final C20157A9t A03 = new Object();

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return layoutInflater.inflate(2131626440, viewGroup, false);
    }

    public void A21(Bundle bundle, View view) {
        C18030ve r5;
        AnonymousClass1KB r4;
        AnonymousClass1L9 r3;
        AnonymousClass11C r2;
        String str;
        String A0f;
        View view2 = view;
        C18070vi.A0d(view2, 0);
        super.A21(bundle, view2);
        if (A15().containsKey("bundle_key_title")) {
            AnonymousClass3MW.A0J(view2, 2131433716).setText(A15().getInt("bundle_key_title"));
        }
        String A0y = AnonymousClass8BR.A0y(A15());
        String string = A15().getString("bundle_screen_name");
        ImageView A0G = AnonymousClass3MW.A0G(view2, 2131433711);
        int i = 8;
        if (A15().containsKey("bundle_key_image")) {
            A0G.setImageResource(A15().getInt("bundle_key_image"));
        } else {
            A0G.setVisibility(8);
        }
        if (A15().containsKey("bundle_key_headline")) {
            AnonymousClass3MW.A0J(view2, 2131433715).setText(A15().getInt("bundle_key_headline"));
        }
        TextEmojiLabel A0c = C72453Mb.A0c(view2, 2131433713);
        if (A15().containsKey("bundle_key_body")) {
            A0c.setText(A15().getInt("bundle_key_body"));
        }
        C22373B5c b5c = this.A02;
        if (b5c != null) {
            C20834AaC aaC = (C20834AaC) b5c;
            int i2 = aaC.A00;
            Context context = A0c.getContext();
            if (i2 != 0) {
                AnonymousClass1FY r14 = (AnonymousClass1FY) aaC.A01;
                r5 = r14.A0E;
                r4 = r14.A05;
                r3 = r14.A01;
                r2 = r14.A08;
                str = "learn-more";
                A0f = C17880vN.A0q(r14, str, AnonymousClass3MW.A1a(), 0, 2131893485);
            } else {
                C176108zn r0 = (C176108zn) aaC.A01;
                r5 = r0.A0B;
                r4 = r0.A02;
                r3 = r0.A01;
                r2 = r0.A07;
                str = "learn-more";
                A0f = AnonymousClass8BS.A0f(r0.A04, str, AnonymousClass3MW.A1a(), 0, 2131893485);
            }
            AnonymousClass11C r20 = r2;
            TextEmojiLabel textEmojiLabel = A0c;
            AnonymousClass1KB r18 = r4;
            AnonymousClass1L9 r17 = r3;
            C26302CxJ.A0K(context, Uri.parse("https://faq.whatsapp.com/1516690435411169/?cms_platform=android&country=BR"), r17, r18, textEmojiLabel, r20, r5, A0f, str);
        }
        View A06 = AnonymousClass1HF.A06(view2, 2131433710);
        if (this.A02 == null) {
            i = 0;
        }
        A06.setVisibility(i);
        AnonymousClass1HF.A06(view2, 2131433714).setOnClickListener(new AFF(this, string, A0y));
        AFQ.A00(AnonymousClass1HF.A06(view2, 2131433709), this, 29);
        BD4 bd4 = this.A00;
        if (bd4 != null) {
            if (string == null) {
                string = "";
            }
            bd4.BiL((Integer) null, string, A0y, 0);
            return;
        }
        C18070vi.A11("paymentUIEventLogger");
        throw null;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C18070vi.A0d(dialogInterface, 0);
        this.A03.onDismiss(dialogInterface);
    }
}
