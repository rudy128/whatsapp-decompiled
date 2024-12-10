package com.whatsapp.instrumentation.ui;

import X.AnonymousClass1LC;
import X.AnonymousClass3KQ;
import X.C18030ve;
import X.C36401np;
import X.C36531o3;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ConfirmFragment extends Hilt_ConfirmFragment {
    public AnonymousClass1LC A00;
    public C36531o3 A01;
    public C18030ve A02;
    public AnonymousClass3KQ A03;
    public C36401np A04;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(2131625713, viewGroup, false);
    }

    public void A1x(Context context) {
        super.A1x(context);
        if (context instanceof AnonymousClass3KQ) {
            this.A03 = (AnonymousClass3KQ) context;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c6, code lost:
        if (r7 == 4) goto L_0x00c8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A21(android.os.Bundle r9, android.view.View r10) {
        /*
            r8 = this;
            r0 = 2131431723(0x7f0b112b, float:1.8485183E38)
            android.view.View r2 = r10.findViewById(r0)
            r1 = 17
            X.4dI r0 = new X.4dI
            r0.<init>(r8, r1)
            r2.setOnClickListener(r0)
            android.os.Bundle r1 = r8.A06
            if (r1 == 0) goto L_0x014c
            java.lang.String r0 = "content_variant"
            int r7 = r1.getInt(r0)
        L_0x001b:
            r0 = 2131431717(0x7f0b1125, float:1.8485171E38)
            android.widget.TextView r1 = X.C17880vN.A0E(r10, r0)
            if (r1 == 0) goto L_0x002a
            r0 = 2131891374(0x7f1214ae, float:1.9417466E38)
            r1.setText(r0)
        L_0x002a:
            r0 = 2131431718(0x7f0b1126, float:1.8485173E38)
            android.widget.TextView r1 = X.C17880vN.A0E(r10, r0)
            if (r1 == 0) goto L_0x0039
            r0 = 2131891375(0x7f1214af, float:1.9417468E38)
            r1.setText(r0)
        L_0x0039:
            r0 = 2131431721(0x7f0b1129, float:1.848518E38)
            android.widget.TextView r1 = X.C17880vN.A0E(r10, r0)
            r6 = 2
            if (r1 == 0) goto L_0x004e
            r0 = 2131891379(0x7f1214b3, float:1.9417476E38)
            if (r7 != r6) goto L_0x004b
            r0 = 2131891382(0x7f1214b6, float:1.9417482E38)
        L_0x004b:
            r1.setText(r0)
        L_0x004e:
            r0 = 2131431719(0x7f0b1127, float:1.8485175E38)
            android.widget.TextView r1 = X.C17880vN.A0E(r10, r0)
            if (r1 == 0) goto L_0x005d
            r0 = 2131891376(0x7f1214b0, float:1.941747E38)
            r1.setText(r0)
        L_0x005d:
            if (r7 == r6) goto L_0x00b7
            r0 = 4
            if (r7 == r0) goto L_0x00b7
            r5 = 1
            if (r7 == r5) goto L_0x00b7
            r0 = 2131431722(0x7f0b112a, float:1.8485181E38)
            android.widget.TextView r1 = X.C17880vN.A0E(r10, r0)
            if (r1 == 0) goto L_0x0074
            r0 = 2131891380(0x7f1214b4, float:1.9417478E38)
            r1.setText(r0)
        L_0x0074:
            r0 = 2131431720(0x7f0b1128, float:1.8485177E38)
            android.widget.TextView r1 = X.C17880vN.A0E(r10, r0)
            if (r1 == 0) goto L_0x0083
            r0 = 2131891377(0x7f1214b1, float:1.9417472E38)
            r1.setText(r0)
        L_0x0083:
            X.1LC r1 = r8.A00
            java.lang.String r0 = "https://faq.whatsapp.com/general/security-and-privacy/how-to-use-whatsapp-on-ray-ban-stories/"
            android.net.Uri r0 = r1.A00(r0)
            java.lang.String r4 = r0.toString()
            r0 = 2131431724(0x7f0b112c, float:1.8485185E38)
            android.widget.TextView r3 = X.C17880vN.A0E(r10, r0)
            if (r3 == 0) goto L_0x00a7
            r2 = 2131891385(0x7f1214b9, float:1.9417489E38)
            r3.setText(r2)
            X.0ve r1 = r8.A02
            java.lang.Object[] r0 = X.AnonymousClass000.A1b(r4, r5)
            X.C50182Tl.A00(r3, r1, r0, r2)
        L_0x00a7:
            r0 = 2131431723(0x7f0b112b, float:1.8485183E38)
            android.widget.TextView r1 = X.C17880vN.A0E(r10, r0)
            if (r1 == 0) goto L_0x00b6
            r0 = 2131891383(0x7f1214b7, float:1.9417485E38)
        L_0x00b3:
            r1.setText(r0)
        L_0x00b6:
            return
        L_0x00b7:
            r0 = 2131431722(0x7f0b112a, float:1.8485181E38)
            android.widget.TextView r1 = X.C17880vN.A0E(r10, r0)
            r2 = 4
            if (r1 == 0) goto L_0x00ce
            if (r7 == r6) goto L_0x00c8
            r0 = 2131891380(0x7f1214b4, float:1.9417478E38)
            if (r7 != r2) goto L_0x00cb
        L_0x00c8:
            r0 = 2131891381(0x7f1214b5, float:1.941748E38)
        L_0x00cb:
            r1.setText(r0)
        L_0x00ce:
            r0 = 2131431720(0x7f0b1128, float:1.8485177E38)
            android.widget.TextView r1 = X.C17880vN.A0E(r10, r0)
            if (r1 == 0) goto L_0x00dd
            r0 = 2131891378(0x7f1214b2, float:1.9417474E38)
            r1.setText(r0)
        L_0x00dd:
            r0 = 2131431724(0x7f0b112c, float:1.8485185E38)
            android.widget.TextView r3 = X.C17880vN.A0E(r10, r0)
            if (r3 == 0) goto L_0x0118
            r4 = 1
            if (r7 != r4) goto L_0x0125
            r2 = 2131891386(0x7f1214ba, float:1.941749E38)
            java.lang.String r7 = "whatsapp-smart-glasses-learn-more"
        L_0x00ef:
            X.1np r6 = r8.A04
            android.content.Context r5 = r8.A14()
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r0 = 0
            java.lang.String r4 = "learn-more"
            r1[r0] = r4
            java.lang.String r2 = r8.A1I(r2, r1)
            r1 = 26
            X.7Qs r0 = new X.7Qs
            r0.<init>(r1, r7, r8)
            android.text.SpannableStringBuilder r2 = r6.A05(r5, r0, r2, r4)
            X.0ve r1 = r8.A02
            X.1t5 r0 = new X.1t5
            r0.<init>(r1)
            r3.setMovementMethod(r0)
            r3.setText(r2)
        L_0x0118:
            r0 = 2131431723(0x7f0b112b, float:1.8485183E38)
            android.widget.TextView r1 = X.C17880vN.A0E(r10, r0)
            if (r1 == 0) goto L_0x00b6
            r0 = 2131891384(0x7f1214b8, float:1.9417487E38)
            goto L_0x00b3
        L_0x0125:
            if (r7 == r6) goto L_0x0145
            if (r7 == r2) goto L_0x0145
            X.1LC r1 = r8.A00
            java.lang.String r0 = "https://faq.whatsapp.com/836703167795647"
            android.net.Uri r0 = r1.A00(r0)
            java.lang.String r0 = r0.toString()
            r2 = 2131891386(0x7f1214ba, float:1.941749E38)
            r3.setText(r2)
            X.0ve r1 = r8.A02
            java.lang.Object[] r0 = X.AnonymousClass000.A1b(r0, r4)
            X.C50182Tl.A00(r3, r1, r0, r2)
            goto L_0x0118
        L_0x0145:
            r2 = 2131891393(0x7f1214c1, float:1.9417505E38)
            java.lang.String r7 = "whatsapp-smart-glasses-learn-more-rbm"
            goto L_0x00ef
        L_0x014c:
            r7 = 0
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.instrumentation.ui.ConfirmFragment.A21(android.os.Bundle, android.view.View):void");
    }
}
