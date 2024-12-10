package X;

import android.view.View;

public class AFB implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public AFB(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: com.whatsapp.biz.product.view.fragment.ProductBottomSheet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: X.5mu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: X.8Io} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: com.whatsapp.bot.BonsaiSystemMessageBottomSheet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v27, resolved type: com.whatsapp.biz.product.view.fragment.ProductBottomSheet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v182, resolved type: X.5mu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v183, resolved type: X.5mu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v28, resolved type: com.whatsapp.biz.product.view.fragment.ProductBottomSheet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v29, resolved type: com.whatsapp.biz.product.view.fragment.ProductBottomSheet} */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x028a, code lost:
        X.AnonymousClass3MX.A1Q(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x028d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0480, code lost:
        r1.invoke(java.lang.Integer.valueOf(r0.A05()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x048b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x04a4, code lost:
        r0 = "viewModel";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x04cf, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x04d3, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x04f1, code lost:
        r3.A29();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x04f4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        r1.invoke();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e7, code lost:
        r3 = r0.A01;
        r5 = r0.A02;
        r2 = r0.A00;
        r0 = X.C42011xT.A0I;
        r1 = X.AnonymousClass3Ma.A05(r3.A0H);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00f7, code lost:
        if ((r1 instanceof X.AnonymousClass1FL) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00f9, code lost:
        r1 = (X.AnonymousClass1FL) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00fb, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00fd, code lost:
        r4 = X.AnonymousClass3MX.A0O(r1);
        r1 = r2.A0H;
        r3 = r3.A0A.BNr();
        X.C18070vi.A0d(r1, 2);
        r2 = X.C17880vN.A0D();
        r2.putString("extra_product_id", r1);
        r2.putString("extra_product_owner_jid", r5.getRawString());
        r2.putParcelable("extra_business_profile", r3);
        r1 = new com.whatsapp.biz.product.view.fragment.ProductBottomSheet();
        r1.A1R(r2);
        r1.A2C(r4, "ProductBottomSheet");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0131, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0164, code lost:
        r2.C2L(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0167, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r13) {
        /*
            r12 = this;
            int r0 = r12.A00
            switch(r0) {
                case 0: goto L_0x01cf;
                case 1: goto L_0x0173;
                case 2: goto L_0x048c;
                case 3: goto L_0x0477;
                case 4: goto L_0x0471;
                case 5: goto L_0x0467;
                case 6: goto L_0x0471;
                case 7: goto L_0x0453;
                case 8: goto L_0x005c;
                case 9: goto L_0x00d1;
                case 10: goto L_0x00af;
                case 11: goto L_0x0412;
                case 12: goto L_0x03f6;
                case 13: goto L_0x03ee;
                case 14: goto L_0x03e6;
                case 15: goto L_0x0471;
                case 16: goto L_0x03cb;
                case 17: goto L_0x0354;
                case 18: goto L_0x034c;
                case 19: goto L_0x01b2;
                case 20: goto L_0x04a7;
                case 21: goto L_0x032b;
                case 22: goto L_0x0471;
                case 23: goto L_0x031a;
                case 24: goto L_0x0312;
                case 25: goto L_0x030a;
                case 26: goto L_0x0302;
                case 27: goto L_0x02fa;
                case 28: goto L_0x0055;
                case 29: goto L_0x0055;
                case 30: goto L_0x02ec;
                case 31: goto L_0x02e4;
                case 32: goto L_0x02d6;
                case 33: goto L_0x02ce;
                case 34: goto L_0x02b2;
                case 35: goto L_0x028e;
                case 36: goto L_0x034c;
                case 37: goto L_0x0005;
                case 38: goto L_0x0005;
                case 39: goto L_0x03e6;
                case 40: goto L_0x026b;
                case 41: goto L_0x024a;
                case 42: goto L_0x0237;
                case 43: goto L_0x03e6;
                case 44: goto L_0x0040;
                case 45: goto L_0x0471;
                case 46: goto L_0x022b;
                case 47: goto L_0x000d;
                case 48: goto L_0x0201;
                case 49: goto L_0x0471;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r12.A01
            X.0vk r1 = (X.C18090vk) r1
        L_0x0009:
            r1.invoke()
        L_0x000c:
            return
        L_0x000d:
            java.lang.Object r1 = r12.A01
            X.5vo r1 = (X.C115805vo) r1
            java.util.List r0 = X.C42011xT.A0I
            X.6dg r3 = r1.A00
            if (r3 == 0) goto L_0x000c
            X.5vy r0 = r3.A01
            androidx.recyclerview.widget.RecyclerView r2 = r0.A01
            X.1rD r0 = r2.A0B
            if (r0 == 0) goto L_0x000c
            int r0 = r0.A0Q()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r1 = r0.intValue()
            r0 = 1
            if (r1 <= r0) goto L_0x000c
            android.view.View r0 = r3.A00
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165304(0x7f070078, float:1.7944821E38)
            int r1 = r1.getDimensionPixelSize(r0)
            r0 = 0
            r2.A0l(r1, r0)
            return
        L_0x0040:
            java.lang.Object r0 = r12.A01
            X.1FL r0 = (X.AnonymousClass1FL) r0
            X.1GP r2 = r0.getSupportFragmentManager()
            int r0 = r2.A0K()
            if (r0 <= 0) goto L_0x000c
            java.lang.String r1 = "ai_home_search_fragment"
            r0 = 1
            r2.A0v(r1, r0)
            return
        L_0x0055:
            java.lang.Object r1 = r12.A01
            X.0vk r1 = (X.C18090vk) r1
            java.util.List r0 = X.C42011xT.A0I
            goto L_0x0009
        L_0x005c:
            java.lang.Object r11 = r12.A01
            com.whatsapp.biz.catalog.view.widgets.QuantitySelector r11 = (com.whatsapp.biz.catalog.view.widgets.QuantitySelector) r11
            X.9cw r0 = r11.A05
            if (r0 != 0) goto L_0x00e7
            boolean r0 = r11.A0B
            if (r0 != 0) goto L_0x000c
            long r7 = r11.A01
            long r1 = r11.A00
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00a7
            boolean r0 = r11.A0C
            r9 = 1
            if (r0 == 0) goto L_0x00a0
            r5 = 0
            r3 = 2000(0x7d0, double:9.88E-321)
            r1 = 0
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            long r7 = r7 + r9
            r11.A01 = r7
            if (r0 != 0) goto L_0x009c
            com.whatsapp.biz.catalog.view.widgets.QuantitySelector.A00(r11)
        L_0x0085:
            android.os.Handler r2 = r11.A0E
            r2.removeCallbacksAndMessages(r1)
            r1 = 47
            X.Ajr r0 = new X.Ajr
            r0.<init>(r11, r1)
            r2.postDelayed(r0, r3)
        L_0x0094:
            X.B7O r2 = r11.A04
            if (r2 == 0) goto L_0x000c
            long r0 = r11.A01
            goto L_0x0164
        L_0x009c:
            com.whatsapp.biz.catalog.view.widgets.QuantitySelector.A03(r11)
            goto L_0x0085
        L_0x00a0:
            long r7 = r7 + r9
            r11.A01 = r7
            com.whatsapp.biz.catalog.view.widgets.QuantitySelector.A03(r11)
            goto L_0x0094
        L_0x00a7:
            X.B7N r0 = r11.A03
            if (r0 == 0) goto L_0x000c
            r0.Bwd(r1)
            return
        L_0x00af:
            java.lang.Object r1 = r12.A01
            com.whatsapp.biz.catalog.view.widgets.QuantitySelector r1 = (com.whatsapp.biz.catalog.view.widgets.QuantitySelector) r1
            X.9cw r0 = r1.A05
            if (r0 != 0) goto L_0x00e7
            boolean r0 = r1.A0B
            if (r0 != 0) goto L_0x000c
            com.whatsapp.biz.catalog.view.widgets.QuantitySelector.A00(r1)
            android.os.Handler r3 = r1.A0E
            r0 = 0
            r3.removeCallbacksAndMessages(r0)
            r0 = 47
            X.Ajr r2 = new X.Ajr
            r2.<init>(r1, r0)
            r0 = 2000(0x7d0, double:9.88E-321)
            r3.postDelayed(r2, r0)
            return
        L_0x00d1:
            java.lang.Object r4 = r12.A01
            com.whatsapp.biz.catalog.view.widgets.QuantitySelector r4 = (com.whatsapp.biz.catalog.view.widgets.QuantitySelector) r4
            X.9cw r0 = r4.A05
            if (r0 == 0) goto L_0x0132
            X.0ve r2 = r4.A08
            r1 = 4983(0x1377, float:6.983E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0132
            X.9cw r0 = r4.A05
        L_0x00e7:
            X.8jQ r3 = r0.A01
            com.whatsapp.jid.UserJid r5 = r0.A02
            X.AEv r2 = r0.A00
            java.util.List r0 = X.C42011xT.A0I
            android.view.View r0 = r3.A0H
            android.app.Activity r1 = X.AnonymousClass3Ma.A05(r0)
            boolean r0 = r1 instanceof X.AnonymousClass1FL
            if (r0 == 0) goto L_0x000c
            X.1FL r1 = (X.AnonymousClass1FL) r1
            if (r1 == 0) goto L_0x000c
            X.1GP r4 = X.AnonymousClass3MX.A0O(r1)
            java.lang.String r1 = r2.A0H
            X.BBt r0 = r3.A0A
            X.AEW r3 = r0.BNr()
            r0 = 2
            X.C18070vi.A0d(r1, r0)
            android.os.Bundle r2 = X.C17880vN.A0D()
            java.lang.String r0 = "extra_product_id"
            r2.putString(r0, r1)
            java.lang.String r1 = r5.getRawString()
            java.lang.String r0 = "extra_product_owner_jid"
            r2.putString(r0, r1)
            java.lang.String r0 = "extra_business_profile"
            r2.putParcelable(r0, r3)
            com.whatsapp.biz.product.view.fragment.ProductBottomSheet r1 = new com.whatsapp.biz.product.view.fragment.ProductBottomSheet
            r1.<init>()
            r1.A1R(r2)
            java.lang.String r0 = "ProductBottomSheet"
            r1.A2C(r4, r0)
            return
        L_0x0132:
            boolean r0 = r4.A0B
            if (r0 != 0) goto L_0x000c
            long r2 = r4.A01
            r0 = 1
            long r2 = r2 - r0
            r4.A01 = r2
            com.whatsapp.biz.catalog.view.widgets.QuantitySelector.A03(r4)
            boolean r0 = r4.A0C
            if (r0 == 0) goto L_0x015e
            long r5 = r4.A01
            r2 = 0
            r1 = 0
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            android.os.Handler r3 = r4.A0E
            if (r0 <= 0) goto L_0x0168
            r3.removeCallbacksAndMessages(r1)
            r0 = 47
            X.Ajr r2 = new X.Ajr
            r2.<init>(r4, r0)
            r0 = 2000(0x7d0, double:9.88E-321)
            r3.postDelayed(r2, r0)
        L_0x015e:
            X.B7O r2 = r4.A04
            if (r2 == 0) goto L_0x000c
            long r0 = r4.A01
        L_0x0164:
            r2.C2L(r0)
            return
        L_0x0168:
            r3.removeCallbacksAndMessages(r1)
            long r2 = r4.A01
            long r0 = r4.A00
            r4.A04(r2, r0)
            goto L_0x015e
        L_0x0173:
            java.lang.Object r2 = r12.A01
            com.whatsapp.biz.catalog.view.fragments.LinkedCatalogLearnMoreBottomSheet r2 = (com.whatsapp.biz.catalog.view.fragments.LinkedCatalogLearnMoreBottomSheet) r2
            X.8r3 r1 = new X.8r3
            r1.<init>()
            java.lang.Integer r0 = X.C17880vN.A0l()
            r1.A00 = r0
            r0 = 74
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A02 = r0
            java.lang.Integer r0 = X.C17880vN.A0h()
            r1.A01 = r0
            java.lang.String r0 = "manage_connected_catalog"
            r1.A03 = r0
            X.18K r0 = r2.A04
            if (r0 == 0) goto L_0x04a1
            r0.CC7(r1)
            r2.A28()
            android.content.Context r0 = r2.A1n()
            if (r0 == 0) goto L_0x000c
            X.0zA r0 = r2.A00
            if (r0 == 0) goto L_0x049e
            r0.A03()
            java.lang.String r0 = "getCatalogSettingsActivity"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x01b2:
            java.lang.Object r3 = r12.A01
            com.whatsapp.biz.product.view.fragment.ProductBottomSheet r3 = (com.whatsapp.biz.product.view.fragment.ProductBottomSheet) r3
            com.whatsapp.biz.product.viewmodel.ProductBottomSheetViewModel r0 = r3.A06
            if (r0 == 0) goto L_0x04a4
            com.whatsapp.jid.UserJid r2 = r0.A03
            if (r2 == 0) goto L_0x000c
            X.AEv r0 = r0.A02
            if (r0 == 0) goto L_0x01cd
            java.lang.String r1 = r0.A0H
        L_0x01c4:
            r0 = 1
            com.whatsapp.biz.cart.view.fragment.CartFragment r0 = X.AnonymousClass9PJ.A00(r2, r1, r0)
            X.C137086ut.A01(r0, r3)
            return
        L_0x01cd:
            r1 = 0
            goto L_0x01c4
        L_0x01cf:
            java.lang.Object r2 = r12.A01
            X.8F8 r2 = (X.AnonymousClass8F8) r2
            java.util.List r0 = X.C42011xT.A0I
            X.1DT r1 = r2.A07
            com.whatsapp.jid.UserJid r4 = r2.A0O
            X.AO1 r0 = new X.AO1
            r0.<init>(r4)
            r1.A0F(r0)
            X.9lj r3 = r2.A0J
            r5 = 0
            r9 = 2
            r10 = 0
            r11 = 1
            X.0ve r2 = r3.A02
            r1 = 1514(0x5ea, float:2.122E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x000c
            X.10I r0 = r3.A03
            r7 = r5
            r8 = r5
            X.AjU r2 = new X.AjU
            r6 = r5
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r0.CGF(r2)
            return
        L_0x0201:
            java.lang.Object r5 = r12.A01
            com.whatsapp.bot.metaai.imageinput.disclosure.MetaAiImageInputDisclosureBottomSheet r5 = (com.whatsapp.bot.metaai.imageinput.disclosure.MetaAiImageInputDisclosureBottomSheet) r5
            X.0vk r0 = r5.A04
            if (r0 == 0) goto L_0x020c
            r0.invoke()
        L_0x020c:
            X.00H r0 = r5.A02
            if (r0 == 0) goto L_0x0227
            java.lang.Object r4 = r0.get()
            X.1Po r4 = (X.C25771Po) r4
            r3 = 0
            r2 = 12
            r1 = 1
            int r0 = r4.A02()
            r4.A04(r3, r2, r0, r1)
            r5.A05 = r1
            r5.A28()
            return
        L_0x0227:
            java.lang.String r0 = "mediaInputActionsLogger"
            goto L_0x04cf
        L_0x022b:
            java.lang.Object r1 = r12.A01
            X.5vp r1 = (X.C115815vp) r1
            java.util.List r0 = X.C42011xT.A0I
            X.86c r0 = r1.A02
            r0.C41()
            return
        L_0x0237:
            java.lang.Object r1 = r12.A01
            com.whatsapp.bot.creation.QuickCreateFragment r1 = (com.whatsapp.bot.creation.QuickCreateFragment) r1
            X.1q9 r0 = r1.A1G()
            X.1pm r3 = X.AnonymousClass2SS.A00(r0)
            r0 = 0
            com.whatsapp.bot.creation.QuickCreateFragment$setupButton$2$1 r2 = new com.whatsapp.bot.creation.QuickCreateFragment$setupButton$2$1
            r2.<init>(r1, r0)
            goto L_0x028a
        L_0x024a:
            java.lang.Object r2 = r12.A01
            com.whatsapp.bot.creation.QuickCreateFragment r2 = (com.whatsapp.bot.creation.QuickCreateFragment) r2
            X.0vl r0 = r2.A0B
            java.lang.Object r0 = r0.getValue()
            com.whatsapp.bot.creation.viewmodel.AiCreationViewModel r0 = (com.whatsapp.bot.creation.viewmodel.AiCreationViewModel) r0
            X.1pP r1 = r0.A00
            java.lang.String r0 = "generated_image"
            r1.A03(r0)
            X.0vl r0 = r2.A0C
            java.lang.Object r1 = r0.getValue()
            X.3U6 r1 = (X.AnonymousClass3U6) r1
            X.4Xs r0 = X.C87944Xs.A00
            r1.A0T(r0)
            return
        L_0x026b:
            java.lang.Object r4 = r12.A01
            com.whatsapp.bot.creation.EditAvatarFragment r4 = (com.whatsapp.bot.creation.EditAvatarFragment) r4
            r1 = 0
            com.whatsapp.components.button.ThumbnailButton r0 = r4.A04
            X.C72453Mb.A1D(r0)
            android.widget.ProgressBar r0 = r4.A00
            if (r0 == 0) goto L_0x027c
            r0.setVisibility(r1)
        L_0x027c:
            X.1q9 r0 = r4.A1G()
            X.1pm r3 = X.AnonymousClass2SS.A00(r0)
            r0 = 0
            com.whatsapp.bot.creation.EditAvatarFragment$onViewCreated$2$1 r2 = new com.whatsapp.bot.creation.EditAvatarFragment$onViewCreated$2$1
            r2.<init>(r4, r0)
        L_0x028a:
            X.AnonymousClass3MX.A1Q(r2, r3)
            return
        L_0x028e:
            java.lang.Object r2 = r12.A01
            com.whatsapp.bot.botmemory.MemoryActivity r2 = (com.whatsapp.bot.botmemory.MemoryActivity) r2
            X.0vl r1 = r2.A08
            java.lang.Object r0 = r1.getValue()
            com.whatsapp.bot.botmemory.MemoryViewModel r0 = (com.whatsapp.bot.botmemory.MemoryViewModel) r0
            X.1G1 r0 = r0.A04
            java.lang.Object r0 = r0.getValue()
            boolean r0 = r0 instanceof X.C115755vh
            if (r0 == 0) goto L_0x02ae
            java.lang.Object r0 = r1.getValue()
            com.whatsapp.bot.botmemory.MemoryViewModel r0 = (com.whatsapp.bot.botmemory.MemoryViewModel) r0
            r0.A0T()
            return
        L_0x02ae:
            r2.finish()
            return
        L_0x02b2:
            java.lang.Object r3 = r12.A01
            com.whatsapp.bot.BonsaiSystemMessageBottomSheet r3 = (com.whatsapp.bot.BonsaiSystemMessageBottomSheet) r3
            X.0vl r0 = r3.A00
            r0.getValue()
            X.1FL r2 = r3.A1B()
            if (r2 == 0) goto L_0x04f1
            java.lang.String r0 = "https://www.facebook.com/privacy/guide/genai?entry_point=whatsapp_genai"
            android.net.Uri r1 = android.net.Uri.parse(r0)
            java.lang.String r0 = "android.intent.action.VIEW"
            X.AnonymousClass8BT.A14(r2, r1, r0)
            goto L_0x04f1
        L_0x02ce:
            java.lang.Object r0 = r12.A01
            X.8k7 r0 = (X.AnonymousClass8k7) r0
            r0.onBackPressed()
            return
        L_0x02d6:
            java.lang.Object r0 = r12.A01
            X.9ky r0 = (X.C190459ky) r0
            r2 = 0
            r5 = 0
            r1 = 0
            r4 = r2
            r3 = r2
            r0.A00(r1, r2, r3, r4, r5)
            return
        L_0x02e4:
            java.lang.Object r0 = r12.A01
            android.app.Dialog r0 = (android.app.Dialog) r0
            r0.show()
            return
        L_0x02ec:
            java.lang.Object r1 = r12.A01
            android.widget.CompoundButton r1 = (android.widget.CompoundButton) r1
            boolean r0 = r1.isChecked()
            r0 = r0 ^ 1
            r1.setChecked(r0)
            return
        L_0x02fa:
            java.lang.Object r0 = r12.A01
            com.whatsapp.bizintegrity.utils.BizIntegrityFragment r0 = (com.whatsapp.bizintegrity.utils.BizIntegrityFragment) r0
            r0.A2K()
            return
        L_0x0302:
            java.lang.Object r0 = r12.A01
            com.whatsapp.bizintegrity.utils.BizIntegrityFragment r0 = (com.whatsapp.bizintegrity.utils.BizIntegrityFragment) r0
            r0.A2L()
            return
        L_0x030a:
            java.lang.Object r0 = r12.A01
            com.whatsapp.bizintegrity.smbsuspicious.SMBSuspiciousSenderUrlClickWarningSheet r0 = (com.whatsapp.bizintegrity.smbsuspicious.SMBSuspiciousSenderUrlClickWarningSheet) r0
            com.whatsapp.bizintegrity.smbsuspicious.SMBSuspiciousSenderUrlClickWarningSheet.A01(r0)
            return
        L_0x0312:
            java.lang.Object r0 = r12.A01
            com.whatsapp.bizintegrity.smbsuspicious.SMBSuspiciousSenderUrlClickWarningSheet r0 = (com.whatsapp.bizintegrity.smbsuspicious.SMBSuspiciousSenderUrlClickWarningSheet) r0
            com.whatsapp.bizintegrity.smbsuspicious.SMBSuspiciousSenderUrlClickWarningSheet.A02(r0)
            return
        L_0x031a:
            java.lang.Object r1 = r12.A01
            com.whatsapp.bizintegrity.marketingoptout.MarketingOptOutReasonsFragment r1 = (com.whatsapp.bizintegrity.marketingoptout.MarketingOptOutReasonsFragment) r1
            r0 = 2131428132(0x7f0b0324, float:1.84779E38)
            android.view.View r0 = r13.findViewById(r0)
            android.widget.RadioButton r0 = (android.widget.RadioButton) r0
            com.whatsapp.bizintegrity.marketingoptout.MarketingOptOutReasonsFragment.A00(r0, r1)
            return
        L_0x032b:
            java.lang.Object r0 = r12.A01
            com.whatsapp.biz.product.view.fragment.ProductBottomSheet r0 = (com.whatsapp.biz.product.view.fragment.ProductBottomSheet) r0
            com.whatsapp.biz.product.viewmodel.ProductBottomSheetViewModel r3 = r0.A06
            r2 = 0
            if (r3 != 0) goto L_0x0338
            X.AnonymousClass3MW.A1H()
            throw r2
        L_0x0338:
            com.whatsapp.biz.catalog.view.variants.VariantsCarouselBaseFragment r0 = r0.A04
            if (r0 == 0) goto L_0x0342
            com.whatsapp.biz.catalog.view.variants.VariantsCarouselFragmentViewModel r0 = r0.A02
            if (r0 == 0) goto L_0x0348
            java.util.List r2 = r0.A03
        L_0x0342:
            r0 = 1
            r3.A0U(r2, r0)
            return
        L_0x0348:
            X.AnonymousClass3MW.A1H()
            throw r2
        L_0x034c:
            java.lang.Object r0 = r12.A01
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A29()
            return
        L_0x0354:
            java.lang.Object r2 = r12.A01
            X.8jP r2 = (X.C168648jP) r2
            X.A2u r3 = r2.A4f()
            java.lang.String r1 = "ProductBaseActivity"
            r0 = 774774794(0x2e2e200a, float:3.9591476E-11)
            java.lang.String r4 = "cart_add_tag"
            r3.A01(r0, r4, r1)
            X.A2u r3 = r2.A4f()
            X.11S r1 = r2.A02
            com.whatsapp.jid.UserJid r0 = r2.A4e()
            boolean r0 = r1.A0O(r0)
            r1 = r0 ^ 1
            java.lang.String r0 = "IsConsumer"
            r3.A05(r4, r0, r1)
            X.A2u r3 = r2.A4f()
            java.lang.String r1 = "EntryPoint"
            java.lang.String r0 = "Product"
            r3.A04(r4, r1, r0)
            X.AEv r1 = r2.A0K
            X.AEv r0 = r2.A0J
            X.AEv r3 = X.AnonymousClass9PQ.A00(r1, r0)
            X.1bI r0 = r2.A0h
            r8 = 0
            if (r0 == 0) goto L_0x03a9
            android.view.View r0 = r0.A02()
            androidx.fragment.app.FragmentContainerView r0 = (androidx.fragment.app.FragmentContainerView) r0
            if (r0 == 0) goto L_0x03a9
            androidx.fragment.app.Fragment r0 = r0.getFragment()
            com.whatsapp.biz.catalog.view.variants.VariantsCarouselBaseFragment r0 = (com.whatsapp.biz.catalog.view.variants.VariantsCarouselBaseFragment) r0
            if (r0 == 0) goto L_0x03a9
            com.whatsapp.biz.catalog.view.variants.VariantsCarouselFragmentViewModel r0 = r0.A02
            if (r0 == 0) goto L_0x03c7
            java.util.List r8 = r0.A03
        L_0x03a9:
            X.8GC r0 = r2.A4d()
            com.whatsapp.jid.UserJid r4 = r2.A4e()
            java.lang.String r5 = r2.A10
            java.lang.String r6 = r2.A12
            java.lang.String r7 = r2.A0z
            r9 = 1
            if (r3 != 0) goto L_0x03c1
            X.1DT r0 = r0.A07
            X.C72463Mc.A1B(r0)
            return
        L_0x03c1:
            X.9p3 r2 = r0.A0D
            r2.A01(r3, r4, r5, r6, r7, r8, r9)
            return
        L_0x03c7:
            X.AnonymousClass3MW.A1H()
            throw r8
        L_0x03cb:
            java.lang.Object r3 = r12.A01
            X.8jP r3 = (X.C168648jP) r3
            X.2UJ r0 = r3.A0a
            if (r0 == 0) goto L_0x03e2
            com.whatsapp.jid.UserJid r2 = r3.A4e()
            java.lang.String r1 = r3.A11
            r0 = 1
            com.whatsapp.biz.cart.view.fragment.CartFragment r0 = X.AnonymousClass9PJ.A00(r2, r1, r0)
            r3.CMl(r0)
            return
        L_0x03e2:
            java.lang.String r0 = "orderFragments"
            goto L_0x04cf
        L_0x03e6:
            java.lang.Object r0 = r12.A01
            X.1FU r0 = (X.AnonymousClass1FU) r0
            r0.onBackPressed()
            return
        L_0x03ee:
            java.lang.Object r0 = r12.A01
            X.AVS r0 = (X.AVS) r0
            X.AVS.A00(r0)
            return
        L_0x03f6:
            java.lang.Object r2 = r12.A01
            com.whatsapp.biz.education.fragment.MetaVerifiedBusinessAccountEducationBottomSheet r2 = (com.whatsapp.biz.education.fragment.MetaVerifiedBusinessAccountEducationBottomSheet) r2
            X.00H r0 = r2.A05
            if (r0 == 0) goto L_0x040e
            java.lang.Object r1 = r0.get()
            X.9jn r1 = (X.C189759jn) r1
            java.lang.String r0 = "consumer_meta_verified_business_account_education"
            android.content.Intent r0 = r1.A00(r0)
            r2.A1k(r0)
            return
        L_0x040e:
            java.lang.String r0 = "playStoreIntentUtilsLazy"
            goto L_0x04cf
        L_0x0412:
            java.lang.Object r5 = r12.A01
            com.whatsapp.biz.education.VerifiedBusinessEducationBottomSheet r5 = (com.whatsapp.biz.education.VerifiedBusinessEducationBottomSheet) r5
            X.00H r0 = r5.A04
            if (r0 == 0) goto L_0x0450
            java.lang.Object r4 = r0.get()
            X.Cgm r4 = (X.C25491Cgm) r4
            android.os.Bundle r1 = r5.A15()
            java.lang.String r0 = "biz_owner_jid"
            java.lang.String r3 = r1.getString(r0)
            if (r3 == 0) goto L_0x044b
            r2 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0 = 3
            X.C25491Cgm.A00(r4, r1, r3, r2, r0)
            X.00H r0 = r5.A03
            if (r0 == 0) goto L_0x0447
            X.1o3 r2 = X.AnonymousClass3MW.A0a(r0)
            X.1FL r1 = r5.A1D()
            java.lang.String r0 = "meta-verified-business"
            r2.A01(r1, r0)
            return
        L_0x0447:
            java.lang.String r0 = "contextualHelpHandler"
            goto L_0x04cf
        L_0x044b:
            java.lang.IllegalArgumentException r0 = X.C17890vO.A0K()
            throw r0
        L_0x0450:
            java.lang.String r0 = "metaVerifiedInteractionLogger"
            goto L_0x04cf
        L_0x0453:
            java.lang.Object r2 = r12.A01
            android.view.View r2 = (android.view.View) r2
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131897724(0x7f122d7c, float:1.9430346E38)
            java.lang.String r1 = r1.getString(r0)
            r0 = -1
            X.AnonymousClass8BS.A15(r2, r1, r0)
            return
        L_0x0467:
            java.lang.Object r0 = r12.A01
            X.8Io r0 = (X.C161998Io) r0
            X.AnonymousClass3MX.A1O(r0)
            X.1Di r1 = r0.A03
            goto L_0x0480
        L_0x0471:
            java.lang.Object r0 = r12.A01
            X.AnonymousClass3MW.A1V(r0)
            return
        L_0x0477:
            java.lang.Object r0 = r12.A01
            X.5mu r0 = (X.C113325mu) r0
            X.AnonymousClass3MX.A1O(r0)
            X.1Di r1 = r0.A03
        L_0x0480:
            int r0 = r0.A05()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.invoke(r0)
            return
        L_0x048c:
            java.lang.Object r1 = r12.A01
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            java.lang.String r0 = "https://faq.whatsapp.com/1057141349534704"
            android.net.Uri r0 = android.net.Uri.parse(r0)
            android.content.Intent r0 = X.AnonymousClass3MY.A07(r0)
            r1.A1k(r0)
            return
        L_0x049e:
            java.lang.String r0 = "smbActivities"
            goto L_0x04cf
        L_0x04a1:
            java.lang.String r0 = "wamRuntime"
            goto L_0x04cf
        L_0x04a4:
            java.lang.String r0 = "viewModel"
            goto L_0x04cf
        L_0x04a7:
            java.lang.Object r3 = r12.A01
            com.whatsapp.biz.product.view.fragment.ProductBottomSheet r3 = (com.whatsapp.biz.product.view.fragment.ProductBottomSheet) r3
            X.00H r0 = r3.A0H
            if (r0 == 0) goto L_0x04fc
            r0.get()
            android.content.Context r1 = r13.getContext()
            r0 = 0
            android.content.Intent r5 = X.AnonymousClass1LU.A1n(r1, r0, r0)
            com.whatsapp.jid.UserJid r6 = r3.A08
            java.lang.String r2 = "productOwnerJid"
            if (r6 == 0) goto L_0x04f8
            com.whatsapp.biz.product.viewmodel.ProductBottomSheetViewModel r0 = r3.A06
            if (r0 == 0) goto L_0x04a4
            java.lang.String r9 = r0.A04
            if (r9 != 0) goto L_0x04d4
            java.lang.String r9 = r3.A0I
            if (r9 != 0) goto L_0x04d4
            java.lang.String r0 = "productId"
        L_0x04cf:
            X.C18070vi.A11(r0)
        L_0x04d2:
            r0 = 0
            throw r0
        L_0x04d4:
            X.00H r0 = r3.A0E
            if (r0 == 0) goto L_0x04f5
            java.lang.Object r1 = r0.get()
            X.11S r1 = (X.AnonymousClass11S) r1
            com.whatsapp.jid.UserJid r0 = r3.A08
            if (r0 == 0) goto L_0x04f8
            boolean r11 = r1.A0O(r0)
            android.content.Context r4 = r13.getContext()
            r10 = 11
            r7 = 0
            r8 = r7
            X.C20057A5g.A01(r4, r5, r6, r7, r8, r9, r10, r11)
        L_0x04f1:
            r3.A29()
            return
        L_0x04f5:
            java.lang.String r0 = "meManager"
            goto L_0x04cf
        L_0x04f8:
            X.C18070vi.A11(r2)
            goto L_0x04d2
        L_0x04fc:
            java.lang.String r0 = "waIntents"
            goto L_0x04cf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AFB.onClick(android.view.View):void");
    }
}
