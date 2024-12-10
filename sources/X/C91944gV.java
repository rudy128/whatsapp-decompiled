package X;

import android.graphics.Color;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.wds.components.banners.WDSBanner;
import java.util.Map;

/* renamed from: X.4gV  reason: invalid class name and case insensitive filesystem */
public abstract class C91944gV implements C28582E8t {
    public AnonymousClass5YR A00;
    public boolean A01;
    public final FrameLayout A02;
    public final C36621oC A03;
    public final C189349iw A04;
    public final C18030ve A05;
    public final AnonymousClass10I A06;
    public final C18100vl A07 = AnonymousClass1DF.A01(new AnonymousClass5BG(this));
    public final C18100vl A08 = AnonymousClass1DF.A01(new AnonymousClass5BH(this));

    public void A01(C195759tr r6) {
        AnonymousClass5YR r4;
        if (this instanceof C75693iH) {
            r4 = r6.A0A;
        } else if (this instanceof C75713iJ) {
            r4 = r6.A09;
        } else if (this instanceof C75703iI) {
            r4 = r6.A08;
        } else if (this instanceof C75743iM) {
            r4 = r6.A01;
        } else {
            r4 = r6.A02;
        }
        if (A04() && r4 != null) {
            if (this.A00 == null) {
                this.A02.addView(C72453Mb.A0T(this.A07));
            }
            this.A00 = r4;
            C18100vl r3 = this.A07;
            if (AnonymousClass3MX.A14(r3) instanceof WDSBanner) {
                View A0T = C72453Mb.A0T(r3);
                C18070vi.A0z(A0T, "null cannot be cast to non-null type com.whatsapp.wds.components.banners.WDSBanner");
                A03(r6, r4, (WDSBanner) A0T);
            } else {
                A02(r6, (C85634Od) this.A08.getValue(), this.A00);
            }
            C72453Mb.A0T(r3).setVisibility(0);
            AnonymousClass5YR r32 = this.A00;
            if (r32 != null) {
                this.A06.CGF(new C21453AkK(this, r32, 35));
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x006c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(X.C195759tr r10, X.C85634Od r11, X.AnonymousClass5YR r12) {
        /*
            r9 = this;
            r0 = 0
            X.C18070vi.A0d(r11, r0)
            r2 = 0
            if (r12 == 0) goto L_0x00bd
            r0 = r12
            X.Ai4 r0 = (X.C21319Ai4) r0
            X.9gz r6 = r0.A07
            if (r6 == 0) goto L_0x00bd
            android.widget.FrameLayout r5 = r9.A02
            android.content.res.Resources r4 = r5.getResources()
            android.widget.TextView r3 = r11.A04
            X.9fz r0 = r6.A01
            if (r0 == 0) goto L_0x00ba
            java.lang.String r7 = r0.A02
            boolean r0 = X.AnonymousClass1EG.A0H(r7)
            if (r0 != 0) goto L_0x00ba
            android.content.Context r8 = r5.getContext()
            android.content.Context r2 = r5.getContext()
            r1 = 2130968627(0x7f040033, float:1.7545913E38)
            r0 = 2131099690(0x7f06002a, float:1.781174E38)
            int r2 = X.AnonymousClass3MZ.A02(r2, r8, r1, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = r6.A05
            r1.append(r0)
            java.lang.String r0 = " <b><font color=\""
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = "\">"
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = "</b></font>"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)
        L_0x0057:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r3.setText(r0)
            r0 = 5
            r3.setTextDirection(r0)
            android.content.Context r0 = r5.getContext()
            boolean r3 = X.C28281Zt.A0B(r0)
            X.9e0 r2 = r6.A04
            if (r2 == 0) goto L_0x008d
            if (r3 == 0) goto L_0x00b7
            byte[] r0 = r2.A01
        L_0x0070:
            if (r0 == 0) goto L_0x008d
            X.C18070vi.A0b(r4)
            android.graphics.Bitmap r1 = X.C72473Md.A0E(r0)
            if (r1 == 0) goto L_0x008d
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            r0.<init>(r4, r1)
            android.widget.ImageView r1 = r11.A02
            r1.setImageDrawable(r0)
            java.lang.String r0 = r2.A00
            r1.setContentDescription(r0)
            r0 = 1
            r9.A01 = r0
        L_0x008d:
            android.view.View r1 = r11.A00
            int r0 = r9.A00(r12, r3)
            r1.setBackgroundColor(r0)
            X.5VE r2 = new X.5VE
            r2.<init>(r10, r9, r12)
            r1 = 18
            X.AFU r0 = new X.AFU
            r0.<init>((java.lang.Object) r2, (int) r1)
            r5.setOnClickListener(r0)
            android.widget.ImageView r3 = r11.A03
            X.5VD r2 = new X.5VD
            r2.<init>(r10, r9, r12)
            r1 = 19
            X.AFU r0 = new X.AFU
            r0.<init>((java.lang.Object) r2, (int) r1)
            r3.setOnClickListener(r0)
            return
        L_0x00b7:
            byte[] r0 = r2.A02
            goto L_0x0070
        L_0x00ba:
            java.lang.String r0 = r6.A05
            goto L_0x0057
        L_0x00bd:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "InAppBannerQP/setViewProperties viewHolder:"
            r1.append(r0)
            r1.append(r11)
            java.lang.String r0 = " primaryCreative:"
            r1.append(r0)
            if (r12 == 0) goto L_0x00d4
            X.Ai4 r12 = (X.C21319Ai4) r12
            X.9gz r2 = r12.A07
        L_0x00d4:
            r1.append(r2)
            X.C17890vO.A0w(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91944gV.A02(X.9tr, X.4Od, X.5YR):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0061 A[SYNTHETIC, Splitter:B:27:0x0061] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0071 A[Catch:{ Exception -> 0x0086 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x009b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(X.C195759tr r18, X.AnonymousClass5YR r19, com.whatsapp.wds.components.banners.WDSBanner r20) {
        /*
            r17 = this;
            r0 = 0
            r5 = r20
            X.C18070vi.A0d(r5, r0)
            com.whatsapp.TextEmojiLabel r1 = r5.A00
            if (r1 == 0) goto L_0x000e
            r0 = 5
            r1.setTextDirection(r0)
        L_0x000e:
            r6 = r19
            r8 = r6
            X.Ai4 r8 = (X.C21319Ai4) r8
            X.9gz r4 = r8.A07
            r3 = r17
            if (r4 == 0) goto L_0x00b4
            android.content.Context r7 = X.AnonymousClass3MY.A04(r5)
            X.9fz r0 = r4.A01
            if (r0 == 0) goto L_0x005e
            java.lang.String r2 = r0.A02
            boolean r0 = X.AnonymousClass1EG.A0H(r2)
            if (r0 != 0) goto L_0x005e
            java.lang.String r1 = r4.A05
            java.lang.String r0 = ""
            if (r1 != 0) goto L_0x0030
            r1 = r0
        L_0x0030:
            if (r2 == 0) goto L_0x0033
            r0 = r2
        L_0x0033:
            android.text.Spanned r2 = X.AnonymousClass4W6.A01(r7, r1, r0)
        L_0x0037:
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            X.9ZF r8 = r8.A06
            r11 = 0
            if (r8 == 0) goto L_0x005c
            java.util.Map r1 = r8.A00
            java.lang.String r0 = "wa_wds_icon"
            java.lang.String r10 = X.C17880vN.A0s(r0, r1)
        L_0x0046:
            X.9e0 r0 = r4.A04
            if (r0 == 0) goto L_0x004c
            byte[] r11 = r0.A02
        L_0x004c:
            android.content.res.Resources r7 = X.AnonymousClass3MX.A05(r5)
            r1 = 1
            r9 = 0
            r12 = 0
            if (r10 == 0) goto L_0x0071
            int r0 = r10.length()
            if (r0 == 0) goto L_0x0071
            goto L_0x0061
        L_0x005c:
            r10 = r11
            goto L_0x0046
        L_0x005e:
            java.lang.String r2 = r4.A05
            goto L_0x0037
        L_0x0061:
            r3.A01 = r1     // Catch:{ Exception -> 0x0086 }
            r0 = 2
            byte[] r0 = android.util.Base64.decode(r10, r0)     // Catch:{ Exception -> 0x0086 }
            X.C18070vi.A0X(r0)     // Catch:{ Exception -> 0x0086 }
            X.4AF r1 = new X.4AF     // Catch:{ Exception -> 0x0086 }
            r1.<init>(r7, r0)     // Catch:{ Exception -> 0x0086 }
            goto L_0x007a
        L_0x0071:
            if (r11 == 0) goto L_0x0099
            r3.A01 = r1     // Catch:{ Exception -> 0x007c }
            X.4AF r1 = new X.4AF     // Catch:{ Exception -> 0x007c }
            r1.<init>(r7, r11)     // Catch:{ Exception -> 0x007c }
        L_0x007a:
            r12 = r1
            goto L_0x0099
        L_0x007c:
            r7 = move-exception
            r3.A01 = r9
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "BaseBannerQP/Error converting legacy icon"
            goto L_0x008f
        L_0x0086:
            r7 = move-exception
            r3.A01 = r9
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "BaseBannerQP/Error converting wds icon"
        L_0x008f:
            r1.append(r0)
            java.lang.String r0 = r7.getMessage()
            X.C17890vO.A19(r1, r0)
        L_0x0099:
            if (r2 == 0) goto L_0x00b4
            X.4XT r1 = new X.4XT
            r1.<init>()
            boolean r0 = r3 instanceof X.C75723iK
            if (r0 == 0) goto L_0x00db
            if (r12 == 0) goto L_0x00d8
            X.4AB r11 = new X.4AB
            r11.<init>(r12)
        L_0x00ab:
            r1.A02 = r11
            java.lang.String r0 = r4.A06
            r1.A04 = r0
            X.AnonymousClass4XT.A00(r5, r1, r2)
        L_0x00b4:
            X.5VE r2 = new X.5VE
            r4 = r18
            r2.<init>(r4, r3, r6)
            r1 = 16
            X.AFU r0 = new X.AFU
            r0.<init>((java.lang.Object) r2, (int) r1)
            r5.setOnClickListener(r0)
            X.5VD r2 = new X.5VD
            r2.<init>(r4, r3, r6)
            r1 = 17
            X.AFU r0 = new X.AFU
            r0.<init>((java.lang.Object) r2, (int) r1)
            r5.setOnDismissListener((android.view.View.OnClickListener) r0)
            r5.A07()
            return
        L_0x00d8:
            X.4A8 r11 = X.AnonymousClass4A8.A00
            goto L_0x00ab
        L_0x00db:
            if (r8 == 0) goto L_0x0109
            java.util.Map r7 = r8.A00
            java.lang.String r0 = "wa_wds_style"
            java.lang.Object r7 = r7.get(r0)
        L_0x00e5:
            java.lang.String r0 = "default"
            boolean r0 = X.C18070vi.A18(r7, r0)
            if (r0 != 0) goto L_0x010e
            java.lang.String r0 = "warning"
            boolean r0 = X.C18070vi.A18(r7, r0)
            if (r0 == 0) goto L_0x010e
            if (r12 == 0) goto L_0x010b
            r13 = 2130971844(0x7f040cc4, float:1.7552438E38)
            r14 = 2131102986(0x7f060d0a, float:1.7818425E38)
            r15 = 2130971846(0x7f040cc6, float:1.7552442E38)
            r16 = 2131102988(0x7f060d0c, float:1.781843E38)
            X.4AA r11 = new X.4AA
            r11.<init>(r12, r13, r14, r15, r16)
            goto L_0x00ab
        L_0x0109:
            r7 = 0
            goto L_0x00e5
        L_0x010b:
            X.4A9 r11 = X.AnonymousClass4A9.A00
            goto L_0x00ab
        L_0x010e:
            if (r12 == 0) goto L_0x0116
            X.4AC r11 = new X.4AC
            r11.<init>(r12)
            goto L_0x00ab
        L_0x0116:
            X.4A7 r11 = X.AnonymousClass4A7.A00
            goto L_0x00ab
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91944gV.A03(X.9tr, X.5YR, com.whatsapp.wds.components.banners.WDSBanner):void");
    }

    public boolean CLk() {
        return false;
    }

    public void CQJ() {
    }

    public int A00(AnonymousClass5YR r6, boolean z) {
        String str;
        AnonymousClass9ZF r4 = ((C21319Ai4) r6).A06;
        FrameLayout frameLayout = this.A02;
        int A022 = AnonymousClass3MZ.A02(frameLayout.getContext(), frameLayout.getContext(), 2130968767, 2131099836);
        if (r4 != null) {
            Map map = r4.A00;
            if (z) {
                str = "colors_DarkBackground";
            } else {
                str = "colors_LightBackground";
            }
            String A0s = C17880vN.A0s(str, map);
            if (!AnonymousClass1EG.A0H(A0s)) {
                try {
                    return Color.parseColor(C17890vO.A0Z(A0s, AnonymousClass000.A10(), '#'));
                } catch (IllegalArgumentException unused) {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("InAppBannerQP/Illegal Argument exception parsing color:");
                    A10.append(A0s);
                    A10.append(", isDarkMode?");
                    A10.append(z);
                    C17890vO.A0w(A10);
                }
            }
        }
        return A022;
    }

    public boolean A04() {
        if (this instanceof C75693iH) {
            return ((C75693iH) this).A00;
        }
        if (this instanceof C75713iJ) {
            return ((C75713iJ) this).A00;
        }
        if (this instanceof C75703iI) {
            return ((C75703iI) this).A00;
        }
        if (!(this instanceof C75743iM)) {
            return ((C75733iL) this).A00;
        }
        return C18020vd.A05(C18040vf.A02, ((C75743iM) this).A02, 3712);
    }

    public void Bcv() {
        C72453Mb.A0T(this.A07).setVisibility(8);
    }

    public C91944gV(FrameLayout frameLayout, C36621oC r3, C189349iw r4, C18030ve r5, AnonymousClass10I r6) {
        C18070vi.A0w(r3, frameLayout, r6, r4, r5);
        this.A03 = r3;
        this.A02 = frameLayout;
        this.A06 = r6;
        this.A04 = r4;
        this.A05 = r5;
    }
}
