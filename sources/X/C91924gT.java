package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.4gT  reason: invalid class name and case insensitive filesystem */
public final class C91924gT implements C28582E8t {
    public View A00;
    public final ViewGroup A01;
    public final C19830z4 A02;
    public final C26031Qo A03;
    public final C18030ve A04;
    public final C36401np A05;
    public final AnonymousClass1LU A06;

    public void Bcv() {
        View view = this.A00;
        if (view != null) {
            this.A01.removeView(view);
            this.A00 = null;
        }
    }

    public boolean CLk() {
        if (this.A02.A0c() != null) {
            if (!C18020vd.A05(C18040vf.A02, this.A04, 9876)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public C91924gT(ViewGroup viewGroup, C19830z4 r3, C26031Qo r4, C18030ve r5, AnonymousClass1LU r6, C36401np r7) {
        C18070vi.A0w(viewGroup, r5, r7, r6, r4);
        C18070vi.A0d(r3, 6);
        this.A01 = viewGroup;
        this.A04 = r5;
        this.A05 = r7;
        this.A06 = r6;
        this.A03 = r4;
        this.A02 = r3;
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [android.view.View, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v1, types: [android.view.View, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void CQJ() {
        /*
            r11 = this;
            boolean r0 = r11.CLk()
            if (r0 == 0) goto L_0x0170
            android.view.View r1 = r11.A00
            if (r1 == 0) goto L_0x000f
            android.view.ViewGroup r0 = r11.A01
            r0.removeView(r1)
        L_0x000f:
            X.0z4 r3 = r11.A02
            java.lang.String r1 = r3.A0c()
            com.whatsapp.infra.graphql.generated.usermetadata.enums.GraphQLXWA2BrigadingState r0 = com.whatsapp.infra.graphql.generated.usermetadata.enums.GraphQLXWA2BrigadingState.DETECTED
            java.lang.String r0 = r0.toString()
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x0093
            android.view.ViewGroup r3 = r11.A01
            android.view.LayoutInflater r1 = X.AnonymousClass3MZ.A0D(r3)
            r0 = 2131624334(0x7f0e018e, float:1.8875845E38)
            r5 = 0
            android.view.View r10 = r1.inflate(r0, r3, r5)
            java.lang.String r9 = "null cannot be cast to non-null type com.whatsapp.wds.components.banners.WDSBanner"
            X.C18070vi.A0z(r10, r9)
            r2 = r10
            com.whatsapp.wds.components.banners.WDSBanner r2 = (com.whatsapp.wds.components.banners.WDSBanner) r2
            X.4XT r1 = new X.4XT
            r1.<init>()
            X.4A9 r0 = X.AnonymousClass4A9.A00
            r1.A02 = r0
            r0 = 2131887439(0x7f12054f, float:1.9409485E38)
            r1.A01 = r0
            r4 = 2131887441(0x7f120551, float:1.940949E38)
            r1.A00 = r4
            r1.A05 = r5
            X.4Os r0 = r1.A01()
            r2.setState(r0)
            com.whatsapp.TextEmojiLabel r1 = r2.A01
            if (r1 == 0) goto L_0x005b
            r0 = 2
            r1.setMaxLines(r0)
        L_0x005b:
            android.content.Context r1 = r2.getContext()
            java.lang.Object[] r0 = X.AnonymousClass3MW.A1a()
            java.lang.String r8 = "open-settings"
            java.lang.String r7 = X.AnonymousClass3Ma.A10(r1, r8, r0, r5, r4)
            com.whatsapp.TextEmojiLabel r6 = r2.A00
            if (r6 == 0) goto L_0x0081
            X.1np r5 = r11.A05
            android.content.Context r4 = r2.getContext()
            r1 = 14
            X.Ajr r0 = new X.Ajr
            r0.<init>(r11, r1)
            android.text.SpannableStringBuilder r0 = r5.A05(r4, r0, r7, r8)
            r6.setText(r0)
        L_0x0081:
            com.whatsapp.TextEmojiLabel r1 = r2.A00
            if (r1 == 0) goto L_0x008a
            X.0ve r0 = r11.A04
            X.AnonymousClass3Ma.A1I(r1, r0)
        L_0x008a:
            X.C18070vi.A0z(r10, r9)
        L_0x008d:
            r11.A00 = r2
            r3.addView(r2)
        L_0x0092:
            return
        L_0x0093:
            com.whatsapp.infra.graphql.generated.usermetadata.enums.GraphQLXWA2BrigadingState r0 = com.whatsapp.infra.graphql.generated.usermetadata.enums.GraphQLXWA2BrigadingState.ENFORCED
            java.lang.String r0 = r0.toString()
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x0113
            android.view.ViewGroup r3 = r11.A01
            android.view.LayoutInflater r1 = X.AnonymousClass3MZ.A0D(r3)
            r0 = 2131624334(0x7f0e018e, float:1.8875845E38)
            r5 = 0
            android.view.View r9 = r1.inflate(r0, r3, r5)
            java.lang.String r8 = "null cannot be cast to non-null type com.whatsapp.wds.components.banners.WDSBanner"
            X.C18070vi.A0z(r9, r8)
            r2 = r9
            com.whatsapp.wds.components.banners.WDSBanner r2 = (com.whatsapp.wds.components.banners.WDSBanner) r2
            X.4XT r1 = new X.4XT
            r1.<init>()
            X.4A9 r0 = X.AnonymousClass4A9.A00
            r1.A02 = r0
            r0 = 2131887439(0x7f12054f, float:1.9409485E38)
            r1.A01 = r0
            r4 = 2131887440(0x7f120550, float:1.9409487E38)
            r1.A00 = r4
            X.4Os r0 = r1.A01()
            r2.setState(r0)
            com.whatsapp.TextEmojiLabel r1 = r2.A01
            if (r1 == 0) goto L_0x00d7
            r0 = 2
            r1.setMaxLines(r0)
        L_0x00d7:
            android.content.Context r1 = r2.getContext()
            java.lang.Object[] r0 = X.AnonymousClass3MW.A1a()
            java.lang.String r10 = "open-settings"
            java.lang.String r7 = X.AnonymousClass3Ma.A10(r1, r10, r0, r5, r4)
            com.whatsapp.TextEmojiLabel r6 = r2.A00
            if (r6 == 0) goto L_0x00fd
            X.1np r5 = r11.A05
            android.content.Context r4 = r2.getContext()
            r1 = 15
            X.Ajr r0 = new X.Ajr
            r0.<init>(r11, r1)
            android.text.SpannableStringBuilder r0 = r5.A05(r4, r0, r7, r10)
            r6.setText(r0)
        L_0x00fd:
            com.whatsapp.TextEmojiLabel r1 = r2.A00
            if (r1 == 0) goto L_0x0106
            X.0ve r0 = r11.A04
            X.AnonymousClass3Ma.A1I(r1, r0)
        L_0x0106:
            X.5BI r0 = new X.5BI
            r0.<init>(r11)
            r2.setOnDismissListener((X.C18090vk) r0)
            X.C18070vi.A0z(r9, r8)
            goto L_0x008d
        L_0x0113:
            com.whatsapp.infra.graphql.generated.usermetadata.enums.GraphQLXWA2BrigadingState r0 = com.whatsapp.infra.graphql.generated.usermetadata.enums.GraphQLXWA2BrigadingState.NOT_ENFORCED
            java.lang.String r0 = r0.toString()
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x0159
            android.view.ViewGroup r3 = r11.A01
            android.view.LayoutInflater r1 = X.AnonymousClass3MZ.A0D(r3)
            r0 = 2131624334(0x7f0e018e, float:1.8875845E38)
            android.view.View r2 = X.AnonymousClass3MX.A09(r1, r3, r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.wds.components.banners.WDSBanner"
            X.C18070vi.A0z(r2, r0)
            com.whatsapp.wds.components.banners.WDSBanner r2 = (com.whatsapp.wds.components.banners.WDSBanner) r2
            X.4XT r1 = new X.4XT
            r1.<init>()
            r0 = 2131231801(0x7f080439, float:1.8079693E38)
            X.AnonymousClass4AC.A00(r1, r0)
            r0 = 2131887437(0x7f12054d, float:1.9409481E38)
            r1.A01 = r0
            r0 = 2131887438(0x7f12054e, float:1.9409483E38)
            r1.A00 = r0
            X.4Os r0 = r1.A01()
            r2.setState(r0)
            X.5BJ r0 = new X.5BJ
            r0.<init>(r11)
            r2.setOnDismissListener((X.C18090vk) r0)
            goto L_0x008d
        L_0x0159:
            com.whatsapp.infra.graphql.generated.usermetadata.enums.GraphQLXWA2BrigadingState r0 = com.whatsapp.infra.graphql.generated.usermetadata.enums.GraphQLXWA2BrigadingState.NOT_DETECTED
            java.lang.String r0 = r0.toString()
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x0178
            r2 = 0
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r3)
            java.lang.String r0 = "brigading_banner_state"
            X.C17880vN.A1E(r1, r0, r2)
            goto L_0x0174
        L_0x0170:
            android.view.View r0 = r11.A00
            if (r0 == 0) goto L_0x0092
        L_0x0174:
            r11.Bcv()
            return
        L_0x0178:
            X.1Qo r2 = r11.A03
            X.3xD r1 = X.C80463xD.A00
            java.lang.String r0 = r3.A0c()
            r2.A00(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91924gT.CQJ():void");
    }
}
