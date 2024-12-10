package X;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: X.4gW  reason: invalid class name and case insensitive filesystem */
public class C91954gW implements C28582E8t {
    public View A00;
    public final FrameLayout A01;
    public final C19830z4 A02;
    public final AnonymousClass1L9 A03;
    public final C87594We A04;
    public final C18030ve A05;
    public final AnonymousClass18K A06;

    private View A00() {
        int i;
        View view = this.A00;
        if (view != null) {
            return view;
        }
        boolean A052 = C18020vd.A05(C18040vf.A01, this.A05, 5332);
        FrameLayout frameLayout = this.A01;
        LayoutInflater A0D = AnonymousClass3MZ.A0D(frameLayout);
        if (A052) {
            i = 2131624274;
        } else {
            i = 2131625037;
        }
        View inflate = A0D.inflate(i, frameLayout, false);
        this.A00 = inflate;
        return inflate;
    }

    public void A01(int i) {
        C170888qp r1 = new C170888qp();
        r1.A01 = 39;
        r1.A00 = Integer.valueOf(i);
        this.A06.CC7(r1);
    }

    public boolean A02() {
        if (C18020vd.A05(C18040vf.A02, this.A05, 3283)) {
            AnonymousClass00H r3 = this.A02.A00;
            if (!C17880vN.A0B(r3).getBoolean("smb_enforcement_bottomsheet_shown", false) || !C17880vN.A0B(r3).getBoolean("should_show_smb_enforcement_banner", false)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public void Bcv() {
        C72453Mb.A1B(this.A00);
    }

    public boolean CLk() {
        if (C18020vd.A05(C18040vf.A02, this.A05, 2986)) {
            AnonymousClass00H r3 = this.A02.A00;
            if (!C17880vN.A0B(r3).getBoolean("smb_enforcement_bottomsheet_shown", false) || !C17880vN.A0B(r3).getBoolean("should_show_smb_enforcement_banner", false)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public C91954gW(FrameLayout frameLayout, AnonymousClass1L9 r2, C87594We r3, C19830z4 r4, C18030ve r5, AnonymousClass18K r6) {
        this.A05 = r5;
        this.A06 = r6;
        this.A03 = r2;
        this.A01 = frameLayout;
        this.A02 = r4;
        this.A04 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0207, code lost:
        if (r9 != null) goto L_0x008c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0092  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void CQJ() {
        /*
            r13 = this;
            boolean r0 = r13.CLk()
            if (r0 != 0) goto L_0x000c
            boolean r0 = r13.A02()
            if (r0 == 0) goto L_0x0019
        L_0x000c:
            android.view.View r0 = r13.A00
            if (r0 != 0) goto L_0x0019
            android.widget.FrameLayout r1 = r13.A01
            android.view.View r0 = r13.A00()
            r1.addView(r0)
        L_0x0019:
            android.widget.FrameLayout r8 = r13.A01
            android.content.Context r7 = r8.getContext()
            android.content.res.Resources r6 = r8.getResources()
            android.view.View r5 = r13.A00()
            X.4We r1 = r13.A04
            X.0z4 r0 = r1.A00
            java.lang.String r10 = r0.A0a()
            X.C18070vi.A0X(r10)
            r4 = 0
            X.0ve r3 = r1.A01
            r0 = 2951(0xb87, float:4.135E-42)
            java.lang.String r0 = r3.A0I(r0)
            android.net.Uri r12 = android.net.Uri.parse(r0)
            java.lang.String r11 = "biz_enforce_download_boost_post"
            boolean r0 = X.AnonymousClass1YF.A0Y(r10, r11, r4)
            r2 = 2952(0xb88, float:4.137E-42)
            if (r0 == 0) goto L_0x0051
            java.lang.String r0 = r3.A0I(r2)
            android.net.Uri r12 = android.net.Uri.parse(r0)
        L_0x0051:
            r1 = 3283(0xcd3, float:4.6E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r3, r1)
            if (r0 == 0) goto L_0x00a8
            r9 = 1
            java.lang.String[] r1 = new java.lang.String[r9]
            java.lang.String r0 = "|"
            r1[r4] = r0
            java.util.List r1 = X.AnonymousClass1YF.A0S(r10, r1, r4)
            java.lang.String[] r0 = new java.lang.String[r4]
            java.lang.Object[] r1 = r1.toArray(r0)
            java.lang.String[] r1 = (java.lang.String[]) r1
            int r0 = r1.length
            if (r0 == 0) goto L_0x020b
            r10 = r1[r4]
            java.lang.String r0 = "biz_enforce_download_reminder"
            boolean r0 = X.AnonymousClass1YF.A0Y(r10, r0, r4)
            if (r0 == 0) goto L_0x01b7
            int r1 = r10.length()
            r0 = 29
            if (r1 <= r0) goto L_0x01b7
            r0 = 30
        L_0x0085:
            java.lang.String r9 = r10.substring(r0)
            X.C18070vi.A0X(r9)
        L_0x008c:
            int r0 = r9.length()
            if (r0 == 0) goto L_0x00a8
            java.lang.String r0 = r3.A0I(r2)
            android.net.Uri r0 = android.net.Uri.parse(r0)
            android.net.Uri$Builder r1 = r0.buildUpon()
            java.lang.String r0 = "en_id"
            android.net.Uri$Builder r0 = r1.appendQueryParameter(r0, r9)
            android.net.Uri r12 = r0.build()
        L_0x00a8:
            X.C18070vi.A0b(r12)
            android.content.Intent r1 = X.AnonymousClass3MY.A07(r12)
            r0 = 6
            X.4dV r10 = new X.4dV
            r10.<init>((java.lang.Object) r13, (java.lang.Object) r7, (java.lang.Object) r1, (int) r0)
            r0 = 23
            X.AFU r9 = new X.AFU
            r9.<init>((java.lang.Object) r13, (int) r0)
            boolean r0 = r5 instanceof com.whatsapp.wds.components.banners.WDSBanner
            r3 = 1
            if (r0 == 0) goto L_0x00fe
            com.whatsapp.wds.components.banners.WDSBanner r5 = (com.whatsapp.wds.components.banners.WDSBanner) r5
            X.4XT r2 = new X.4XT
            r2.<init>()
            r0 = 2131896199(0x7f122787, float:1.9427253E38)
            r2.A01 = r0
            android.content.Context r1 = r8.getContext()
            r0 = 2131896205(0x7f12278d, float:1.9427265E38)
            android.text.Spanned r0 = X.AnonymousClass4W6.A00(r1, r0)
            r2.A03 = r0
            r0 = 2131233206(0x7f0809b6, float:1.8082543E38)
            X.AnonymousClass4AC.A00(r2, r0)
            r2.A05 = r3
            X.4Os r0 = r2.A01()
            r5.setState(r0)
            boolean r0 = X.C22891Dp.A02
            if (r0 != 0) goto L_0x00fa
            r5.A08()
        L_0x00f0:
            r5.setOnClickListener(r10)
            r5.setOnDismissListener((android.view.View.OnClickListener) r9)
        L_0x00f6:
            r13.A01(r3)
            return
        L_0x00fa:
            r5.A07()
            goto L_0x00f0
        L_0x00fe:
            android.content.Context r2 = r5.getContext()
            r1 = 2130968767(0x7f0400bf, float:1.7546197E38)
            r0 = 2131099836(0x7f0600bc, float:1.7812036E38)
            X.C72463Mc.A0x(r2, r6, r5, r1, r0)
            r0 = 2131428069(0x7f0b02e5, float:1.8477772E38)
            android.widget.ImageView r2 = X.AnonymousClass3MW.A0G(r5, r0)
            r1 = 2130968768(0x7f0400c0, float:1.7546199E38)
            r0 = 2131099837(0x7f0600bd, float:1.7812038E38)
            int r0 = X.AnonymousClass1YL.A00(r7, r1, r0)
            android.content.res.ColorStateList r0 = X.C19740yt.A03(r7, r0)
            X.AnonymousClass1HF.A0L(r0, r2)
            r1 = 0
            r0 = 2131233206(0x7f0809b6, float:1.8082543E38)
            android.graphics.drawable.Drawable r0 = X.C40501uo.A00(r1, r6, r0)
            android.graphics.drawable.Drawable r0 = X.C27831Xu.A02(r0)
            r2.setImageDrawable(r0)
            r0 = 2131428078(0x7f0b02ee, float:1.847779E38)
            android.widget.TextView r2 = X.AnonymousClass3MW.A0J(r5, r0)
            r0 = 2131896199(0x7f122787, float:1.9427253E38)
            r2.setText(r0)
            r0 = 2131896198(0x7f122786, float:1.942725E38)
            java.lang.String r0 = r7.getString(r0)
            android.text.SpannableStringBuilder r2 = X.AnonymousClass3MW.A09(r0)
            r0 = 2131896200(0x7f122788, float:1.9427255E38)
            java.lang.String r0 = r7.getString(r0)
            android.text.SpannableString r11 = new android.text.SpannableString
            r11.<init>(r0)
            r12 = 2130971981(0x7f040d4d, float:1.7552716E38)
            r0 = 2131101293(0x7f06066d, float:1.7814992E38)
            int r0 = X.AnonymousClass3Ma.A00(r7, r12, r0)
            android.text.style.ForegroundColorSpan r7 = new android.text.style.ForegroundColorSpan
            r7.<init>(r0)
            int r0 = r11.length()
            r12 = 33
            r11.setSpan(r7, r4, r0, r12)
            X.BGo r7 = new X.BGo
            r7.<init>()
            int r0 = r11.length()
            r11.setSpan(r7, r4, r0, r12)
            java.lang.String r0 = " "
            android.text.SpannableStringBuilder r0 = r2.append(r0)
            r0.append(r11)
            r0 = 2131428063(0x7f0b02df, float:1.847776E38)
            com.whatsapp.TextEmojiLabel r0 = X.AnonymousClass3MX.A0V(r5, r0)
            r0.A0R(r2)
            r8.setOnClickListener(r10)
            r2 = 2131100288(0x7f060280, float:1.7812953E38)
            r0 = 2131231822(0x7f08044e, float:1.8079736E38)
            android.graphics.drawable.Drawable r0 = X.C40501uo.A00(r1, r6, r0)
            android.graphics.drawable.Drawable r1 = X.C27831Xu.A02(r0)
            int r0 = r6.getColor(r2)
            X.C27831Xu.A0C(r1, r0)
            r0 = 2131428811(0x7f0b05cb, float:1.8479277E38)
            android.widget.ImageView r0 = X.AnonymousClass3MW.A0G(r5, r0)
            r0.setImageDrawable(r1)
            r0.setOnClickListener(r9)
            r5.setVisibility(r4)
            goto L_0x00f6
        L_0x01b7:
            boolean r0 = X.AnonymousClass1YF.A0Y(r10, r11, r4)
            if (r0 == 0) goto L_0x01c9
            int r1 = r10.length()
            r0 = 31
            if (r1 <= r0) goto L_0x01c9
            r0 = 32
            goto L_0x0085
        L_0x01c9:
            java.lang.String r0 = "biz_enforce_download_create"
            boolean r0 = X.AnonymousClass1YF.A0Y(r10, r0, r4)
            if (r0 == 0) goto L_0x01dd
            int r1 = r10.length()
            r0 = 27
            if (r1 <= r0) goto L_0x01dd
            r0 = 28
            goto L_0x0085
        L_0x01dd:
            java.lang.String r0 = "biz_enforce_download"
            boolean r0 = X.AnonymousClass1YF.A0Y(r10, r0, r4)
            if (r0 == 0) goto L_0x020b
            int r1 = r10.length()
            r0 = 20
            if (r1 <= r0) goto L_0x020b
            java.util.List r0 = X.C87594We.A02
            boolean r0 = r0.contains(r10)
            if (r0 != 0) goto L_0x020b
            java.lang.String[] r1 = new java.lang.String[r9]
            java.lang.String r0 = "_"
            r1[r4] = r0
            java.util.List r1 = X.AnonymousClass1YF.A0S(r10, r1, r4)
            int r0 = X.AnonymousClass3MX.A02(r1, r9)
            java.lang.String r9 = X.C17880vN.A0w(r1, r0)
            if (r9 == 0) goto L_0x00a8
            goto L_0x008c
        L_0x020b:
            java.lang.String r9 = ""
            goto L_0x008c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91954gW.CQJ():void");
    }
}
