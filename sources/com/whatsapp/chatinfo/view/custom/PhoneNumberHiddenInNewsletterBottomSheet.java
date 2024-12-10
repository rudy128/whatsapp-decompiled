package com.whatsapp.chatinfo.view.custom;

import X.AnonymousClass00H;
import X.AnonymousClass11S;
import X.AnonymousClass1L9;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.C18070vi;
import X.C36531o3;
import X.C46162Dk;
import X.C74793cj;
import android.view.View;

public class PhoneNumberHiddenInNewsletterBottomSheet extends Hilt_PhoneNumberHiddenInNewsletterBottomSheet {
    public AnonymousClass1L9 A00;
    public AnonymousClass11S A01;
    public AnonymousClass00H A02;

    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0159, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x015a, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x015d, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A21(android.os.Bundle r10, android.view.View r11) {
        /*
            r9 = this;
            r2 = 0
            X.C18070vi.A0d(r11, r2)
            super.A21(r10, r11)
            com.whatsapp.wds.components.button.WDSButton r1 = r9.A06
            if (r1 == 0) goto L_0x0011
            r0 = 2131899286(0x7f123396, float:1.9433514E38)
            r1.setText(r0)
        L_0x0011:
            com.whatsapp.wds.components.button.WDSButton r1 = r9.A07
            if (r1 == 0) goto L_0x001b
            r0 = 2131899101(0x7f1232dd, float:1.9433138E38)
            r1.setText(r0)
        L_0x001b:
            r7 = r9
            boolean r0 = r9 instanceof com.whatsapp.chatinfo.view.custom.CreatorPrivacyNewsletterBottomSheet
            if (r0 == 0) goto L_0x008f
            com.whatsapp.chatinfo.view.custom.CreatorPrivacyNewsletterBottomSheet r7 = (com.whatsapp.chatinfo.view.custom.CreatorPrivacyNewsletterBottomSheet) r7
            com.whatsapp.WaTextView r1 = r7.A04
            if (r1 == 0) goto L_0x0031
            X.2Dk r0 = com.whatsapp.chatinfo.view.custom.CreatorPrivacyNewsletterBottomSheet.A00(r7)
            if (r0 == 0) goto L_0x008d
            java.lang.String r0 = r0.A0T
        L_0x002e:
            r1.setText(r0)
        L_0x0031:
            com.whatsapp.WaTextView r1 = r7.A05
            if (r1 == 0) goto L_0x003b
            r0 = 2131894646(0x7f122176, float:1.9424103E38)
            r1.setText(r0)
        L_0x003b:
            android.content.Context r8 = r7.A1n()
            if (r8 == 0) goto L_0x008c
            com.whatsapp.ListItemWithLeftIcon r1 = r7.A00
            if (r1 == 0) goto L_0x0051
            r0 = 2131894638(0x7f12216e, float:1.9424086E38)
            X.C74793cj.A01(r8, r1, r0)
            r0 = 2131894637(0x7f12216d, float:1.9424084E38)
            X.C74793cj.A02(r8, r1, r0)
        L_0x0051:
            com.whatsapp.ListItemWithLeftIcon r1 = r7.A01
            if (r1 == 0) goto L_0x0061
            r0 = 2131894641(0x7f122171, float:1.9424093E38)
            X.C74793cj.A01(r8, r1, r0)
            r0 = 2131894640(0x7f122170, float:1.942409E38)
            X.C74793cj.A02(r8, r1, r0)
        L_0x0061:
            com.whatsapp.ListItemWithLeftIcon r6 = r7.A02
            if (r6 == 0) goto L_0x008c
            r0 = 2131894644(0x7f122174, float:1.9424099E38)
            X.C74793cj.A01(r8, r6, r0)
            X.1np r5 = r7.A04
            if (r5 == 0) goto L_0x0161
            r1 = 2131894643(0x7f122173, float:1.9424097E38)
            r4 = 1
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r3 = "learn-more"
            java.lang.String r2 = X.AnonymousClass3MX.A16(r7, r3, r0, r2, r1)
            r1 = 45
            X.7R9 r0 = new X.7R9
            r0.<init>((java.lang.Object) r7, (int) r1)
            android.text.SpannableStringBuilder r0 = r5.A05(r8, r0, r2, r3)
            X.C18070vi.A0X(r0)
            r6.A07(r0, r4)
        L_0x008c:
            return
        L_0x008d:
            r0 = 0
            goto L_0x002e
        L_0x008f:
            com.whatsapp.WaTextView r1 = r9.A04
            if (r1 == 0) goto L_0x009e
            X.11S r0 = r9.A01
            if (r0 == 0) goto L_0x015e
            java.lang.String r0 = r0.A0E()
            r1.setText(r0)
        L_0x009e:
            com.whatsapp.WaTextView r1 = r9.A05
            if (r1 == 0) goto L_0x00a8
            r0 = 2131894645(0x7f122175, float:1.94241E38)
            r1.setText(r0)
        L_0x00a8:
            android.content.Context r3 = r9.A1n()
            if (r3 == 0) goto L_0x00f4
            com.whatsapp.ListItemWithLeftIcon r1 = r9.A00
            if (r1 == 0) goto L_0x00b8
            r0 = 2131894639(0x7f12216f, float:1.9424088E38)
            X.C74793cj.A01(r3, r1, r0)
        L_0x00b8:
            com.whatsapp.ListItemWithLeftIcon r1 = r9.A00
            if (r1 == 0) goto L_0x00c2
            r0 = 2131899315(0x7f1233b3, float:1.9433573E38)
            X.C74793cj.A02(r3, r1, r0)
        L_0x00c2:
            com.whatsapp.ListItemWithLeftIcon r1 = r9.A01
            if (r1 == 0) goto L_0x00cc
            r0 = 2131894642(0x7f122172, float:1.9424095E38)
            X.C74793cj.A01(r3, r1, r0)
        L_0x00cc:
            com.whatsapp.ListItemWithLeftIcon r1 = r9.A01
            if (r1 == 0) goto L_0x00d6
            r0 = 2131899316(0x7f1233b4, float:1.9433575E38)
            X.C74793cj.A02(r3, r1, r0)
        L_0x00d6:
            com.whatsapp.wds.components.button.WDSButton r1 = r9.A07
            if (r1 == 0) goto L_0x00e0
            r0 = 2131886248(0x7f1200a8, float:1.940707E38)
            X.AnonymousClass3MY.A0w(r3, r1, r0)
        L_0x00e0:
            com.whatsapp.ListItemWithLeftIcon r1 = r9.A02
            if (r1 == 0) goto L_0x00ea
            r0 = 2131899318(0x7f1233b6, float:1.9433579E38)
            X.C74793cj.A01(r3, r1, r0)
        L_0x00ea:
            com.whatsapp.ListItemWithLeftIcon r1 = r9.A02
            if (r1 == 0) goto L_0x00f4
            r0 = 2131899317(0x7f1233b5, float:1.9433577E38)
            X.C74793cj.A02(r3, r1, r0)
        L_0x00f4:
            boolean r0 = X.C22891Dp.A02
            if (r0 == 0) goto L_0x008c
            X.11S r0 = r9.A01
            if (r0 == 0) goto L_0x015e
            java.lang.String r5 = r0.A0E()
            if (r5 == 0) goto L_0x008c
            com.whatsapp.WaTextView r0 = r9.A04
            X.C72453Mb.A1D(r0)
            X.1rd r4 = new X.1rd
            r4.<init>()
            com.whatsapp.WaImageView r0 = r9.A03
            if (r0 == 0) goto L_0x0113
            r0.setImageDrawable(r4)
        L_0x0113:
            android.content.res.Resources r0 = X.AnonymousClass3MZ.A09(r9)
            android.content.res.AssetManager r1 = r0.getAssets()
            java.lang.String r0 = "wds_anim_hide_number_android.json"
            java.io.InputStream r1 = r1.open(r0)
            X.C18070vi.A0X(r1)
            java.nio.charset.Charset r0 = X.C26571Sq.A05
            java.io.InputStreamReader r3 = new java.io.InputStreamReader
            r3.<init>(r1, r0)
            boolean r0 = r3 instanceof java.io.BufferedReader
            if (r0 != 0) goto L_0x0137
            r1 = 8192(0x2000, float:1.14794E-41)
            java.io.BufferedReader r0 = new java.io.BufferedReader
            r0.<init>(r3, r1)
            r3 = r0
        L_0x0137:
            java.lang.String r1 = X.C181849Sb.A00(r3)     // Catch:{ all -> 0x0157 }
            java.lang.String r0 = "+34•••••••89"
            java.lang.String r1 = X.AnonymousClass1YE.A07(r1, r0, r5, r2)     // Catch:{ all -> 0x0157 }
            r3.close()
            X.7Rq r0 = new X.7Rq
            r0.<init>(r1)
            X.1tg r1 = new X.1tg
            r1.<init>(r0, r2)
            X.7Ax r0 = new X.7Ax
            r0.<init>(r4, r9)
            r1.A02(r0)
            return
        L_0x0157:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0159 }
        L_0x0159:
            r0 = move-exception
            X.CDX.A00(r3, r1)
            throw r0
        L_0x015e:
            java.lang.String r0 = "meManager"
            goto L_0x0163
        L_0x0161:
            java.lang.String r0 = "linkifier"
        L_0x0163:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.chatinfo.view.custom.PhoneNumberHiddenInNewsletterBottomSheet.A21(android.os.Bundle, android.view.View):void");
    }

    public void onClick(View view) {
        String str;
        C46162Dk A002;
        C18070vi.A0d(view, 0);
        int id = view.getId();
        if (id != 2131433911) {
            if (id == 2131433912) {
                AnonymousClass00H r0 = this.A02;
                if (r0 != null) {
                    C36531o3 A0a = AnonymousClass3MW.A0a(r0);
                    if (!(this instanceof CreatorPrivacyNewsletterBottomSheet) || (A002 = CreatorPrivacyNewsletterBottomSheet.A00((CreatorPrivacyNewsletterBottomSheet) this)) == null || !A002.A0O()) {
                        str = "newsletter-security-and-privacy";
                    } else {
                        str = "newsletter-safety-and-privacy-channel-admins";
                    }
                    A0a.A01(A1D(), str);
                } else {
                    C18070vi.A11("contextualHelpHandler");
                    throw null;
                }
            } else {
                return;
            }
        }
        A29();
    }

    public static void A02(C74793cj r4, int i) {
        if (r4 != null) {
            r4.setIcon(i);
            r4.setIconColor(AnonymousClass3MZ.A02(r4.getContext(), r4.getContext(), 2130970098, 2131101221));
        }
    }
}
