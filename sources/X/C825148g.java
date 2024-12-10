package X;

import android.view.View;

/* renamed from: X.48g  reason: invalid class name and case insensitive filesystem */
public class C825148g extends C38471rL {
    public final int A00;
    public final Object A01;

    public C825148g(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(View view, Object obj, int i) {
        view.setOnClickListener(new C825148g(obj, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: com.whatsapp.group.GroupChatInfoActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: com.whatsapp.identity.IdentityVerificationActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v31, resolved type: com.whatsapp.group.GroupChatInfoActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v24, resolved type: com.whatsapp.group.GroupChatInfoActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v25, resolved type: com.whatsapp.group.GroupChatInfoActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v47, resolved type: com.whatsapp.group.GroupChatInfoActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v48, resolved type: com.whatsapp.group.GroupChatInfoActivity} */
    /* JADX WARNING: type inference failed for: r2v22, types: [X.1LU, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x033a, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x044b, code lost:
        r0 = "waIntents";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x04e3, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x04e7, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x05f8, code lost:
        r4.startActivity(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x05fb, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x0645, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x0649, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x0753, code lost:
        X.AnonymousClass3MW.A1S(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x0756, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0217, code lost:
        r3.startActivity(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x021a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x025d, code lost:
        ((androidx.fragment.app.DialogFragment) r0).A28();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0262, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(android.view.View r11) {
        /*
            r10 = this;
            int r0 = r10.A00
            switch(r0) {
                case 0: goto L_0x074d;
                case 1: goto L_0x0334;
                case 2: goto L_0x0745;
                case 3: goto L_0x06fa;
                case 4: goto L_0x06cc;
                case 5: goto L_0x06bb;
                case 6: goto L_0x069f;
                case 7: goto L_0x0665;
                case 8: goto L_0x0659;
                case 9: goto L_0x0637;
                case 10: goto L_0x0263;
                case 11: goto L_0x022f;
                case 12: goto L_0x0227;
                case 13: goto L_0x062d;
                case 14: goto L_0x021b;
                case 15: goto L_0x0625;
                case 16: goto L_0x0605;
                case 17: goto L_0x05fc;
                case 18: goto L_0x05e2;
                case 19: goto L_0x01eb;
                case 20: goto L_0x0192;
                case 21: goto L_0x0576;
                case 22: goto L_0x055c;
                case 23: goto L_0x054f;
                case 24: goto L_0x0046;
                case 25: goto L_0x053b;
                case 26: goto L_0x0528;
                case 27: goto L_0x012a;
                case 28: goto L_0x051f;
                case 29: goto L_0x0515;
                case 30: goto L_0x050d;
                case 31: goto L_0x04d7;
                case 32: goto L_0x0104;
                case 33: goto L_0x04c2;
                case 34: goto L_0x0481;
                case 35: goto L_0x044f;
                case 36: goto L_0x041c;
                case 37: goto L_0x040d;
                case 38: goto L_0x002e;
                case 39: goto L_0x03e1;
                case 40: goto L_0x00dc;
                case 41: goto L_0x03d1;
                case 42: goto L_0x03b1;
                case 43: goto L_0x0365;
                case 44: goto L_0x034d;
                case 45: goto L_0x002a;
                case 46: goto L_0x0084;
                case 47: goto L_0x0057;
                case 48: goto L_0x0342;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r10.A01
            X.7By r2 = (X.C143087By) r2
            com.whatsapp.location.DragBottomSheetIndicator r0 = r2.A0J
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0023
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r2.A0G
            int r1 = r0.A0J
            r0 = 5
            if (r1 != r0) goto L_0x0023
            com.google.android.material.bottomsheet.BottomSheetBehavior r3 = r2.A0F
            int r2 = r3.A0J
            r1 = 3
            r0 = 4
            if (r2 != r0) goto L_0x0024
            r3.A0W(r1)
        L_0x0023:
            return
        L_0x0024:
            if (r2 != r1) goto L_0x0023
            r3.A0W(r0)
            return
        L_0x002a:
            java.lang.Object r0 = r10.A01
            goto L_0x025d
        L_0x002e:
            java.lang.Object r0 = r10.A01
            com.whatsapp.interop.ui.InteropSystemAboutBottomSheet r0 = (com.whatsapp.interop.ui.InteropSystemAboutBottomSheet) r0
            X.1FL r3 = r0.A1D()
            X.129 r1 = r0.A01
            if (r1 == 0) goto L_0x033e
            java.lang.String r0 = "369709382495539"
            android.net.Uri r0 = r1.A03(r0)
            android.content.Intent r0 = X.AnonymousClass3MY.A07(r0)
            goto L_0x0217
        L_0x0046:
            java.lang.Object r3 = r10.A01
            com.whatsapp.group.GroupChatInfoActivity r3 = (com.whatsapp.group.GroupChatInfoActivity) r3
            android.content.Context r2 = r3.getApplicationContext()
            X.1EC r1 = r3.A1K
            r0 = 1
            android.content.Intent r0 = X.AnonymousClass1LU.A0o(r2, r1, r0)
            goto L_0x0217
        L_0x0057:
            java.lang.Object r1 = r10.A01
            X.7By r1 = (X.C143087By) r1
            boolean r0 = r1.A0T
            if (r0 != 0) goto L_0x0023
            android.app.Activity r2 = r1.A05
            X.6q5 r1 = new X.6q5
            r1.<init>(r2)
            r0 = 2131232061(0x7f08053d, float:1.808022E38)
            r1.A01 = r0
            java.lang.String[] r0 = X.C27091Ur.A09
            r1.A01(r0)
            r0 = 2131894348(0x7f12204c, float:1.9423498E38)
            r1.A03 = r0
            r0 = 2131894349(0x7f12204d, float:1.94235E38)
            r1.A02 = r0
            android.content.Intent r1 = r1.A00()
            r0 = 35
            r2.startActivityForResult(r1, r0)
            return
        L_0x0084:
            java.lang.Object r3 = r10.A01
            com.whatsapp.languageselector.LanguageSelectorBottomSheet r3 = (com.whatsapp.languageselector.LanguageSelectorBottomSheet) r3
            X.9bd r0 = r3.A08
            if (r0 == 0) goto L_0x0023
            com.whatsapp.BottomSheetListView r0 = r3.A01
            android.widget.ListAdapter r2 = r0.getAdapter()
            X.3Og r2 = (X.C72933Og) r2
            boolean r0 = r2 instanceof X.AnonymousClass42U
            if (r0 == 0) goto L_0x00d0
            r0 = r2
            X.42U r0 = (X.AnonymousClass42U) r0
            int r1 = r0.A00
        L_0x009d:
            java.util.List r0 = r2.A00
            java.lang.Object r0 = r0.get(r1)
            X.4To r0 = (X.C86914To) r0
            X.9bd r3 = r3.A08
            java.lang.String r2 = r0.A01
            com.whatsapp.languageselector.LanguageSelectorBottomSheet r0 = r3.A00
            r0.A28()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "https://youtu.be/"
            r1.append(r0)
            com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment r3 = r3.A01
            java.lang.String r0 = com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment.A00(r3, r2)
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            java.lang.String r2 = "android.intent.action.VIEW"
            android.net.Uri r1 = android.net.Uri.parse(r0)
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r2, r1)
            r3.A1k(r0)
            return
        L_0x00d0:
            boolean r0 = r2 instanceof X.AnonymousClass42T
            if (r0 == 0) goto L_0x00da
            r0 = r2
            X.42T r0 = (X.AnonymousClass42T) r0
            int r1 = r0.A00
            goto L_0x009d
        L_0x00da:
            r1 = 0
            goto L_0x009d
        L_0x00dc:
            java.lang.Object r0 = r10.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.1FL r0 = r0.A1B()
            if (r0 == 0) goto L_0x0023
            X.1GP r0 = r0.getSupportFragmentManager()
            if (r0 == 0) goto L_0x0023
            X.1jj r2 = new X.1jj
            r2.<init>(r0)
            r1 = 2131431776(0x7f0b1160, float:1.848529E38)
            com.whatsapp.interopui.setting.InteropSettingsOptinFragment r0 = new com.whatsapp.interopui.setting.InteropSettingsOptinFragment
            r0.<init>()
            r2.A09(r0, r1)
            r0 = 0
            r2.A0H(r0)
            r2.A01()
            return
        L_0x0104:
            java.lang.Object r4 = r10.A01
            X.5Xu r4 = (X.C106945Xu) r4
            com.whatsapp.group.GroupPermissionsActivity r4 = (com.whatsapp.group.GroupPermissionsActivity) r4
            X.1EC r3 = r4.A06
            if (r3 == 0) goto L_0x0023
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.group.HistorySettingActivity"
            android.content.Intent r1 = r2.setClassName(r1, r0)
            java.lang.String r0 = "group_jid"
            X.AnonymousClass3MY.A12(r1, r3, r0)
            r0 = 335544320(0x14000000, float:6.4623485E-27)
            r1.setFlags(r0)
            r4.startActivity(r1)
            return
        L_0x012a:
            java.lang.Object r3 = r10.A01
            com.whatsapp.group.GroupChatInfoActivity r3 = (com.whatsapp.group.GroupChatInfoActivity) r3
            X.1CJ r1 = r3.A0H
            X.1EC r0 = r3.A4l()
            int r1 = r1.A06(r0)
            r0 = 2
            if (r1 == r0) goto L_0x0156
            r0 = 6
            if (r1 == r0) goto L_0x0156
            r0 = 2131897319(0x7f122be7, float:1.9429524E38)
            r3.BhQ(r0)
            r0 = 2131432025(0x7f0b1259, float:1.8485796E38)
            android.view.View r0 = X.C110885hR.A0A(r3, r0)
            r1 = 8
            r0.setVisibility(r1)
            X.1bI r0 = r3.A1g
            r0.A04(r1)
            return
        L_0x0156:
            X.1EC r0 = r3.A1K
            X.C17960vV.A07(r0)
            X.00H r0 = r3.A1p
            X.1kb r1 = X.AnonymousClass3MW.A0Z(r0)
            X.1EC r0 = r3.A1K
            X.1EC r7 = r1.A05(r0)
            if (r7 == 0) goto L_0x0023
            X.1EC r6 = r3.A1K
            X.00H r0 = r3.A1o
            java.lang.Object r5 = r0.get()
            X.00H r0 = r3.A24
            java.lang.Object r8 = r0.get()
            r9 = 41
            X.3Cr r4 = new X.3Cr
            r4.<init>((java.lang.Object) r5, (java.lang.Object) r6, (java.lang.Object) r7, (java.lang.Object) r8, (int) r9)
            X.1Me r1 = r3.A0d
            X.1E7 r0 = r3.A0u
            java.lang.String r2 = r1.A0I(r0)
            X.2hM r1 = r3.A0K
            X.1E7 r0 = r3.A0u
            X.A4i r0 = r1.A00(r3, r0, r4, r2)
            r0.A02()
            return
        L_0x0192:
            java.lang.Object r5 = r10.A01
            com.whatsapp.group.GroupChatInfoActivity r5 = (com.whatsapp.group.GroupChatInfoActivity) r5
            X.1E7 r0 = r5.A0u
            X.1BI r0 = r0.A0J
            java.util.Set r3 = java.util.Collections.singleton(r0)
            X.00H r0 = r5.A1r
            java.lang.Object r0 = r0.get()
            com.whatsapp.favorite.FavoriteManager r0 = (com.whatsapp.favorite.FavoriteManager) r0
            boolean r2 = r0.A08(r3)
            r1 = 0
            r4 = 2
            X.00H r0 = r5.A1r
            java.lang.Object r0 = r0.get()
            com.whatsapp.favorite.FavoriteManager r0 = (com.whatsapp.favorite.FavoriteManager) r0
            if (r2 == 0) goto L_0x01d9
            r0.A06(r1, r1, r3, r4)
            X.1a8 r3 = r5.A1H
            X.0ve r2 = r3.A01
            X.0vf r1 = X.C18040vf.A01
            r0 = 10197(0x27d5, float:1.4289E-41)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x0023
            boolean r0 = r3.A05()
            if (r0 != 0) goto L_0x0023
            com.whatsapp.favorites.FavoriteEducationBottomSheetFragment r0 = new com.whatsapp.favorites.FavoriteEducationBottomSheetFragment
            r0.<init>()
            X.C72473Md.A1A(r0, r4)
            r5.CMl(r0)
            return
        L_0x01d9:
            boolean r0 = r0.A09(r3)
            if (r0 == 0) goto L_0x0023
            X.00H r0 = r5.A1r
            java.lang.Object r0 = r0.get()
            com.whatsapp.favorite.FavoriteManager r0 = (com.whatsapp.favorite.FavoriteManager) r0
            r0.A05(r1, r3, r4)
            return
        L_0x01eb:
            java.lang.Object r3 = r10.A01
            com.whatsapp.group.GroupChatInfoActivity r3 = (com.whatsapp.group.GroupChatInfoActivity) r3
            X.1QO r1 = r3.A1P
            r0 = 0
            boolean r0 = r1.A04(r0)
            if (r0 == 0) goto L_0x0023
            X.1QS r0 = r3.A1Q
            X.BD1 r0 = r0.A06()
            java.lang.Class r0 = r0.BWe()
            if (r0 == 0) goto L_0x0023
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r3, r0)
            X.1E7 r0 = r3.A0u
            X.1BI r0 = r0.A0J
            java.lang.String r1 = X.C22971Dz.A06(r0)
            java.lang.String r0 = "extra_jid"
            android.content.Intent r0 = r2.putExtra(r0, r1)
        L_0x0217:
            r3.startActivity(r0)
            return
        L_0x021b:
            java.lang.Object r0 = r10.A01
            com.whatsapp.glasses.BluetoothPermissionDialogFragment r0 = (com.whatsapp.glasses.BluetoothPermissionDialogFragment) r0
            android.app.Dialog r0 = r0.A00
            if (r0 == 0) goto L_0x0023
            r0.dismiss()
            return
        L_0x0227:
            java.lang.Object r0 = r10.A01
            com.whatsapp.gifsearch.GifSearchContainer r0 = (com.whatsapp.gifsearch.GifSearchContainer) r0
            com.whatsapp.WaEditText r0 = r0.A06
            goto L_0x033a
        L_0x022f:
            java.lang.Object r2 = r10.A01
            com.whatsapp.gifsearch.GifSearchContainer r2 = (com.whatsapp.gifsearch.GifSearchContainer) r2
            X.4UI r0 = r2.A0A
            if (r0 == 0) goto L_0x023b
            r0.A02()
            return
        L_0x023b:
            com.whatsapp.WaEditText r1 = r2.A06
            if (r1 == 0) goto L_0x0246
            X.1L4 r0 = r2.getImeUtils()
            r0.A01(r1)
        L_0x0246:
            r0 = 8
            r2.setVisibility(r0)
            X.6zz r1 = r2.A0G
            if (r1 == 0) goto L_0x0256
            X.18K r0 = r2.getWamRuntime()
            X.C83734Gl.A00(r0, r1)
        L_0x0256:
            r0 = 0
            r2.A0G = r0
            X.85A r0 = r2.A0F
            if (r0 == 0) goto L_0x0023
        L_0x025d:
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A28()
            return
        L_0x0263:
            java.lang.Object r3 = r10.A01
            X.5z4 r3 = (X.C117015z4) r3
            int r0 = r3.A00
            if (r0 != 0) goto L_0x0276
            X.5Zk r0 = r3.A09
            if (r0 == 0) goto L_0x0276
            boolean r0 = r0.Bf8()
            if (r0 != 0) goto L_0x0276
            return
        L_0x0276:
            r3.CFm()
            int r0 = r3.A00
            if (r0 != 0) goto L_0x028a
            com.whatsapp.emoji.search.EmojiSearchProvider r1 = r3.A0N
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x028a
            X.6nB r0 = r3.A0A
            if (r0 == 0) goto L_0x028a
            r0.A00(r1)
        L_0x028a:
            int r1 = r3.A00
            r0 = 1
            if (r1 == r0) goto L_0x0296
            r0 = 2
            if (r1 == r0) goto L_0x02b9
            r0 = 3
            if (r1 == r0) goto L_0x02b9
            return
        L_0x0296:
            X.7Hs r2 = r3.A09
            if (r2 == 0) goto L_0x0023
            X.18O r1 = r3.A07
            X.18R r0 = X.AnonymousClass18O.A0k
            boolean r0 = r1.A09(r0)
            if (r0 == 0) goto L_0x0306
            X.7MX r3 = r2.A04
            if (r3 == 0) goto L_0x0306
            X.1Fe r1 = r3.A02
            if (r1 == 0) goto L_0x0023
            X.5z4 r0 = r3.A00
            if (r0 == 0) goto L_0x0023
            r0 = 1
            r3.A07 = r0
            com.whatsapp.picker.search.GifSearchDialogFragment r0 = new com.whatsapp.picker.search.GifSearchDialogFragment
            r0.<init>()
            goto L_0x02f7
        L_0x02b9:
            X.6q9 r5 = r3.A0A
            if (r5 == 0) goto L_0x0023
            com.whatsapp.emoji.search.EmojiSearchProvider r0 = r3.A0N
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0023
            X.7MX r0 = r5.A03
            if (r0 == 0) goto L_0x0023
            X.6CF r4 = r5.A05
            if (r4 == 0) goto L_0x02e5
            X.7MX r3 = r4.A07
            if (r3 == 0) goto L_0x02e5
            X.6Hy r0 = r4.A0A
            r2 = 0
            if (r0 == 0) goto L_0x0304
            java.util.List r1 = r0.A06
        L_0x02d6:
            X.6Hx r0 = r4.A0B
            if (r0 == 0) goto L_0x02dc
            java.util.List r2 = r0.A02
        L_0x02dc:
            X.722 r0 = r4.A0c
            java.util.ArrayList r0 = r0.A02(r1, r2)
            r3.A03(r0)
        L_0x02e5:
            X.7MX r3 = r5.A03
            X.1Fe r1 = r3.A02
            if (r1 == 0) goto L_0x0023
            X.5z4 r0 = r3.A00
            if (r0 == 0) goto L_0x0023
            r0 = 1
            r3.A07 = r0
            com.whatsapp.picker.search.StickerSearchDialogFragment r0 = new com.whatsapp.picker.search.StickerSearchDialogFragment
            r0.<init>()
        L_0x02f7:
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r1.CMj(r0)
            X.5z4 r0 = r3.A00
            if (r0 == 0) goto L_0x0023
            r0.dismiss()
            return
        L_0x0304:
            r1 = r2
            goto L_0x02d6
        L_0x0306:
            X.4NM r5 = r2.A02
            if (r5 == 0) goto L_0x0023
            X.6zz r4 = r2.A08
            X.5z4 r1 = r5.A01
            com.whatsapp.WaEditText r0 = r1.A0M
            r1.A08(r0)
            X.3xv r3 = r5.A02
            X.1bI r0 = r3.A04
            if (r0 == 0) goto L_0x0321
            android.view.View r2 = r0.A02()
            com.whatsapp.gifsearch.GifSearchContainer r2 = (com.whatsapp.gifsearch.GifSearchContainer) r2
            if (r2 != 0) goto L_0x0329
        L_0x0321:
            com.whatsapp.gifsearch.GifSearchContainer r2 = r3.A02
            X.C17960vV.A05(r2)
            X.C18070vi.A0X(r2)
        L_0x0329:
            android.app.Activity r1 = r5.A00
            X.4nO r0 = new X.4nO
            r0.<init>(r3, r4)
            r2.A02(r1, r3, r4, r0)
            return
        L_0x0334:
            java.lang.Object r0 = r10.A01
            com.whatsapp.emoji.search.EmojiSearchKeyboardContainer r0 = (com.whatsapp.emoji.search.EmojiSearchKeyboardContainer) r0
            com.whatsapp.InterceptingEditText r0 = r0.A04
        L_0x033a:
            if (r0 == 0) goto L_0x0023
            goto L_0x0753
        L_0x033e:
            java.lang.String r0 = "faqLinkFactory"
            goto L_0x04e3
        L_0x0342:
            java.lang.Object r0 = r10.A01
            X.7By r0 = (X.C143087By) r0
            android.app.Activity r1 = r0.A05
            r0 = 2
            X.AnonymousClass4Yv.A01(r1, r0)
            return
        L_0x034d:
            java.lang.Object r1 = r10.A01
            com.whatsapp.labelitem.view.bottomsheet.AddToListFragment r1 = (com.whatsapp.labelitem.view.bottomsheet.AddToListFragment) r1
            com.whatsapp.labelitem.view.AddToListViewModel r0 = X.AnonymousClass3MY.A0c(r1)
            X.00H r0 = r0.A0K
            boolean r0 = X.C72453Mb.A1W(r0)
            if (r0 == 0) goto L_0x0361
            r1.A28()
            return
        L_0x0361:
            com.whatsapp.labelitem.view.bottomsheet.AddToListFragment.A00(r1)
            return
        L_0x0365:
            java.lang.Object r6 = r10.A01
            com.whatsapp.invites.ViewGroupInviteActivity r6 = (com.whatsapp.invites.ViewGroupInviteActivity) r6
            boolean r0 = r6.A0N
            if (r0 == 0) goto L_0x037c
            com.whatsapp.jid.UserJid r1 = r6.A0G
            X.C17960vV.A07(r1)
            X.23S r0 = r6.A0I
            com.whatsapp.invites.RevokeInviteDialogFragment r0 = X.C83874Gz.A00(r1, r0)
            r6.CMl(r0)
            return
        L_0x037c:
            X.23S r0 = r6.A0I
            int r0 = r0.A00
            boolean r2 = X.C17890vO.A1R(r0)
            android.widget.TextView r1 = r6.A04
            r0 = 2131891538(0x7f121552, float:1.9417799E38)
            if (r2 == 0) goto L_0x038e
            r0 = 2131891540(0x7f121554, float:1.9417803E38)
        L_0x038e:
            r1.setText(r0)
            android.view.ViewGroup r0 = r6.A02
            r5 = 0
            r0.setVisibility(r5)
            android.view.ViewGroup r1 = r6.A01
            r0 = 4
            r1.setVisibility(r0)
            X.10I r4 = r6.A05
            X.11P r3 = r6.A05
            X.12M r2 = r6.A0E
            X.2fB r1 = r6.A0H
            X.C17960vV.A07(r1)
            X.49Q r0 = new X.49Q
            r0.<init>(r3, r2, r6, r1)
            X.AnonymousClass3MW.A1T(r0, r4, r5)
            return
        L_0x03b1:
            java.lang.Object r3 = r10.A01
            com.whatsapp.interopui.setting.InteropSettingsOptinFragment r3 = (com.whatsapp.interopui.setting.InteropSettingsOptinFragment) r3
            X.00H r0 = r3.A05
            if (r0 == 0) goto L_0x044b
            r0.get()
            X.1FL r0 = r3.A1D()
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.interopui.optin.InteropOptInSelectIntegratorsActivity"
            r2.setClassName(r1, r0)
            r3.A1k(r2)
            return
        L_0x03d1:
            r0 = 0
            X.C18070vi.A0d(r11, r0)
            java.lang.Object r1 = r10.A01
            com.whatsapp.interopui.setting.InteropSettingsMainFragment r1 = (com.whatsapp.interopui.setting.InteropSettingsMainFragment) r1
            android.content.Context r0 = X.AnonymousClass3MY.A04(r11)
            com.whatsapp.interopui.setting.InteropSettingsMainFragment.A00(r0, r1)
            return
        L_0x03e1:
            java.lang.Object r1 = r10.A01
            com.whatsapp.interopui.setting.InteropReachNotificationSettingsActivity r1 = (com.whatsapp.interopui.setting.InteropReachNotificationSettingsActivity) r1
            r0 = 2131895379(0x7f122453, float:1.942559E38)
            r1.CNA(r0)
            X.0vl r0 = r1.A03
            java.lang.Object r2 = r0.getValue()
            com.whatsapp.interopui.notification.InteropNotifOptInViewModel r2 = (com.whatsapp.interopui.notification.InteropNotifOptInViewModel) r2
            java.lang.Object r0 = r0.getValue()
            com.whatsapp.interopui.notification.InteropNotifOptInViewModel r0 = (com.whatsapp.interopui.notification.InteropNotifOptInViewModel) r0
            X.1G1 r0 = r0.A05
            boolean r0 = X.C72463Mc.A1a(r0)
            r1 = r0 ^ 1
            X.1G1 r0 = r2.A06
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            com.whatsapp.interopui.notification.InteropNotifOptInViewModel.A00(r2, r0, r1)
            return
        L_0x040d:
            java.lang.Object r2 = r10.A01
            com.whatsapp.identity.IdentityVerificationActivity r2 = (com.whatsapp.identity.IdentityVerificationActivity) r2
            X.0z4 r1 = r2.A0A
            java.lang.String r0 = "security_notifications_alert_timestamp"
            r1.A1i(r0)
            com.whatsapp.identity.IdentityVerificationActivity.A0q(r2)
            return
        L_0x041c:
            java.lang.Object r4 = r10.A01
            com.whatsapp.identity.IdentityVerificationActivity r4 = (com.whatsapp.identity.IdentityVerificationActivity) r4
            X.1LU r0 = r4.A0I
            if (r0 == 0) goto L_0x044b
            X.1E7 r0 = r4.A0D
            if (r0 != 0) goto L_0x042c
            java.lang.String r0 = "contact"
            goto L_0x0645
        L_0x042c:
            com.whatsapp.jid.Jid r2 = X.AnonymousClass1E7.A01(r0)
            if (r2 == 0) goto L_0x0446
            android.content.Intent r3 = X.C17880vN.A0A()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.identity.ScanQrCodeActivity"
            r3.setClassName(r1, r0)
            java.lang.String r0 = "jid"
            X.AnonymousClass3MY.A12(r3, r2, r0)
            goto L_0x05f8
        L_0x0446:
            java.lang.IllegalStateException r1 = X.C17880vN.A0g()
            throw r1
        L_0x044b:
            java.lang.String r0 = "waIntents"
            goto L_0x04e3
        L_0x044f:
            java.lang.Object r0 = r10.A01
            com.whatsapp.group.view.custom.GroupDetailsCard r0 = (com.whatsapp.group.view.custom.GroupDetailsCard) r0
            X.1L9 r4 = r0.getActivityUtils()
            android.content.Context r3 = r0.getContext()
            X.1LU r2 = new X.1LU
            r2.<init>()
            android.content.Context r1 = r0.getContext()
            X.1E7 r0 = r0.A0C
            if (r0 != 0) goto L_0x046c
            java.lang.String r0 = "groupChat"
            goto L_0x0645
        L_0x046c:
            X.1BI r0 = X.AnonymousClass1E7.A00(r0)
            android.content.Intent r2 = X.AnonymousClass3MY.A06(r1, r2, r0)
            java.lang.String r1 = "args_conversation_screen_entry_point"
            r0 = 5
            android.content.Intent r1 = r2.putExtra(r1, r0)
            java.lang.String r0 = "GroupChatInfoActivity"
            r4.A0B(r3, r1, r0)
            return
        L_0x0481:
            java.lang.Object r4 = r10.A01
            com.whatsapp.group.newgroup.NewGroup r4 = (com.whatsapp.group.newgroup.NewGroup) r4
            X.00H r0 = r4.A0c
            java.lang.Object r1 = r0.get()
            X.4Zv r1 = (X.C88474Zv) r1
            r0 = 13
            X.C88474Zv.A01(r1, r0)
            X.4QD r2 = r4.A0O
            X.1GP r1 = r4.getSupportFragmentManager()
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.0z4 r0 = r2.A00
            boolean r0 = X.C87474Vs.A00(r1, r0)
            if (r0 == 0) goto L_0x04b7
            X.4QD r3 = r4.A0O
            X.1GP r2 = r4.getSupportFragmentManager()
            java.util.concurrent.atomic.AtomicReference r0 = r4.A0y
            java.lang.Object r1 = r0.get()
            X.1BI r1 = (X.AnonymousClass1BI) r1
            r0 = 2
            r3.A00(r2, r1, r0)
            return
        L_0x04b7:
            int r2 = r4.A00
            X.1GP r1 = r4.getSupportFragmentManager()
            r0 = 1
            com.whatsapp.ephemeral.ChangeEphemeralSettingsDialog.A00(r1, r2, r0)
            return
        L_0x04c2:
            java.lang.Object r0 = r10.A01
            com.whatsapp.group.newgroup.NewGroup r0 = (com.whatsapp.group.newgroup.NewGroup) r0
            X.1GP r2 = r0.getSupportFragmentManager()
            boolean r1 = r0.A0m
            r0 = 0
            com.whatsapp.group.newgroup.GroupVisibilitySettingDialog r1 = X.C83814Gt.A00(r0, r1)
            java.lang.String r0 = "GROUP_VISIBILITY_DIALOG"
            X.C20098A7b.A03(r1, r2, r0)
            return
        L_0x04d7:
            java.lang.Object r5 = r10.A01
            com.whatsapp.group.GroupPermissionsActivity r5 = (com.whatsapp.group.GroupPermissionsActivity) r5
            X.1EC r4 = r5.A06
            X.5c5 r0 = r5.A05
            if (r0 != 0) goto L_0x04e8
            java.lang.String r0 = "viewModel"
        L_0x04e3:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x04e8:
            java.util.ArrayList r3 = r0.BMd()
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r5.getPackageName()
            java.lang.String r0 = "com.whatsapp.group.EditGroupAdminsSelector"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "gid"
            X.AnonymousClass3MY.A12(r2, r4, r0)
            java.lang.String r1 = "selected"
            java.util.ArrayList r0 = X.C22971Dz.A0B(r3)
            r2.putExtra(r1, r0)
            r0 = 17
            r5.startActivityForResult(r2, r0)
            return
        L_0x050d:
            java.lang.Object r0 = r10.A01
            com.whatsapp.group.GroupParticipantsSearchFragment r0 = (com.whatsapp.group.GroupParticipantsSearchFragment) r0
            r0.A26()
            return
        L_0x0515:
            java.lang.Object r0 = r10.A01
            X.40Z r0 = (X.AnonymousClass40Z) r0
            com.whatsapp.group.GroupChatInfoActivity r0 = r0.A09
            r0.openContextMenu(r11)
            return
        L_0x051f:
            java.lang.Object r1 = r10.A01
            com.whatsapp.group.GroupChatInfoActivity r1 = (com.whatsapp.group.GroupChatInfoActivity) r1
            r0 = 2
            com.whatsapp.group.GroupChatInfoActivity.A1H(r1, r0)
            return
        L_0x0528:
            java.lang.Object r3 = r10.A01
            com.whatsapp.group.GroupChatInfoActivity r3 = (com.whatsapp.group.GroupChatInfoActivity) r3
            X.11t r2 = r3.A0a
            X.1EC r1 = r3.A1L
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = X.C110885hR.A0A(r3, r0)
            r2.CAm(r3, r0, r1)
            return
        L_0x053b:
            java.lang.Object r2 = r10.A01
            com.whatsapp.group.GroupChatInfoActivity r2 = (com.whatsapp.group.GroupChatInfoActivity) r2
            android.content.Context r1 = r2.getApplicationContext()
            X.1EC r0 = r2.A1K
            android.content.Intent r1 = X.AnonymousClass1LU.A0t(r1, r0)
            r0 = 16
            r2.startActivityForResult(r1, r0)
            return
        L_0x054f:
            java.lang.Object r3 = r10.A01
            com.whatsapp.group.GroupChatInfoActivity r3 = (com.whatsapp.group.GroupChatInfoActivity) r3
            X.689 r2 = r3.A1N
            X.1EC r1 = r3.A1K
            r0 = 0
            r2.A08(r3, r1, r0)
            return
        L_0x055c:
            java.lang.Object r2 = r10.A01
            com.whatsapp.group.GroupChatInfoActivity r2 = (com.whatsapp.group.GroupChatInfoActivity) r2
            X.3zh r1 = r2.A10
            if (r1 == 0) goto L_0x056a
            java.lang.Boolean r0 = X.AnonymousClass000.A0i()
            r1.A0C = r0
        L_0x056a:
            X.1RK r0 = r2.A0w
            X.Af0 r1 = r0.A04()
            r0 = 13
            X.C98334qx.A00(r1, r10, r0)
            return
        L_0x0576:
            java.lang.Object r5 = r10.A01
            com.whatsapp.group.GroupChatInfoActivity r5 = (com.whatsapp.group.GroupChatInfoActivity) r5
            X.3zh r2 = r5.A10
            r1 = 1
            if (r2 == 0) goto L_0x0585
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r2.A00 = r0
        L_0x0585:
            boolean r0 = X.AnonymousClass3MZ.A1a(r5)
            r2 = 0
            if (r0 == 0) goto L_0x05de
            X.1EC r1 = r5.A1K
            X.C17960vV.A07(r1)
            X.1Rj r0 = r5.A1S
            r0.A0A(r1)
            X.00H r0 = r5.A1o
            java.lang.Object r1 = r0.get()
            X.1mk r1 = (X.C35751mk) r1
            X.1EC r0 = r5.A1K
            r1.A00(r0)
            X.00H r0 = r5.A0W
            X.1xo r1 = X.AnonymousClass3MX.A0i(r0)
            X.1EC r0 = r5.A1K
            boolean r0 = r1.A03(r0)
            if (r0 == 0) goto L_0x05b7
            r0 = 8
            X.AnonymousClass4Yv.A01(r5, r0)
            return
        L_0x05b7:
            r0 = 2131895077(0x7f122325, float:1.9424977E38)
            r5.CNA(r0)
            X.10I r1 = r5.A05
            X.1kk r7 = r5.A0t
            X.00H r0 = r5.A1p
            X.1kb r6 = X.AnonymousClass3MW.A0Z(r0)
            X.1EC r0 = r5.A1K
            java.util.Set r8 = java.util.Collections.singleton(r0)
            r0 = 3
            X.4fJ r4 = new X.4fJ
            r4.<init>(r10, r0)
            X.2PS r3 = new X.2PS
            r3.<init>(r4, r5, r6, r7, r8)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r1.CGD(r3, r0)
            return
        L_0x05de:
            X.AnonymousClass4Yv.A01(r5, r1)
            return
        L_0x05e2:
            java.lang.Object r4 = r10.A01
            com.whatsapp.group.GroupChatInfoActivity r4 = (com.whatsapp.group.GroupChatInfoActivity) r4
            X.3zh r1 = r4.A10
            if (r1 == 0) goto L_0x05f0
            java.lang.Boolean r0 = X.AnonymousClass000.A0i()
            r1.A09 = r0
        L_0x05f0:
            X.1E7 r0 = r4.A0u
            X.1BI r0 = r0.A0J
            android.content.Intent r3 = X.AnonymousClass1LU.A0s(r4, r0)
        L_0x05f8:
            r4.startActivity(r3)
            return
        L_0x05fc:
            java.lang.Object r1 = r10.A01
            com.whatsapp.group.GroupChatInfoActivity r1 = (com.whatsapp.group.GroupChatInfoActivity) r1
            r0 = 1
            com.whatsapp.group.GroupChatInfoActivity.A1L(r1, r0)
            return
        L_0x0605:
            java.lang.Object r3 = r10.A01
            com.whatsapp.group.GroupChangedParticipantsBottomSheet r3 = (com.whatsapp.group.GroupChangedParticipantsBottomSheet) r3
            android.widget.FrameLayout r0 = r3.A01
            r2 = 0
            if (r0 == 0) goto L_0x0617
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            if (r1 == 0) goto L_0x0617
            r0 = -2
            r1.height = r0
        L_0x0617:
            android.widget.LinearLayout r0 = r3.A02
            X.C72453Mb.A1C(r0)
            android.view.View r0 = r3.A00
            X.C72453Mb.A1D(r0)
            com.whatsapp.group.GroupChangedParticipantsBottomSheet.A01(r3, r2)
            return
        L_0x0625:
            java.lang.Object r0 = r10.A01
            com.whatsapp.group.GroupAdminPickerActivity r0 = (com.whatsapp.group.GroupAdminPickerActivity) r0
            com.whatsapp.group.GroupAdminPickerActivity.A03(r0)
            return
        L_0x062d:
            java.lang.Object r1 = r10.A01
            com.whatsapp.gifsearch.GifSearchContainer r1 = (com.whatsapp.gifsearch.GifSearchContainer) r1
            java.lang.String r0 = r1.A0N
            com.whatsapp.gifsearch.GifSearchContainer.A00(r1, r0)
            return
        L_0x0637:
            java.lang.Object r3 = r10.A01
            X.3yN r3 = (X.C80923yN) r3
            java.util.List r0 = X.C42011xT.A0I
            X.5bo r2 = r3.A02
            X.4nD r1 = r3.A00
            if (r1 != 0) goto L_0x064a
            java.lang.String r0 = "row"
        L_0x0645:
            X.C18070vi.A11(r0)
            r1 = 0
            throw r1
        L_0x064a:
            X.0vp r0 = r3.A04
            java.lang.Object r0 = X.C72463Mc.A0m(r0)
            android.view.View r0 = (android.view.View) r0
            X.C18070vi.A0X(r0)
            r2.C0V(r0, r1)
            return
        L_0x0659:
            java.lang.Object r1 = r10.A01
            X.3yM r1 = (X.C80913yM) r1
            java.util.List r0 = X.C42011xT.A0I
            X.5bo r0 = r1.A00
            r0.Bl2()
            return
        L_0x0665:
            java.lang.Object r4 = r10.A01
            X.3yL r4 = (X.C80903yL) r4
            java.util.List r0 = X.C42011xT.A0I
            android.view.View r1 = r4.A00
            android.content.Context r3 = r1.getContext()
            X.00H r0 = r4.A02
            r0.get()
            android.content.Context r0 = r1.getContext()
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.stickers.store.StickerStoreActivity"
            r2.setClassName(r1, r0)
            r3.startActivity(r2)
            X.00H r0 = r4.A01
            java.lang.Object r3 = r0.get()
            X.A59 r3 = (X.A59) r3
            r0 = 49
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r1 = 1
            r0 = 10
            r3.A03(r2, r1, r0)
            return
        L_0x069f:
            java.lang.Object r0 = r10.A01
            com.whatsapp.expressionstray.expression.avatars.AvatarExpressionsFragment r0 = (com.whatsapp.expressionstray.expression.avatars.AvatarExpressionsFragment) r0
            X.0vl r0 = r0.A0V
            java.lang.Object r4 = r0.getValue()
            com.whatsapp.expressionstray.expression.avatars.AvatarExpressionsViewModel r4 = (com.whatsapp.expressionstray.expression.avatars.AvatarExpressionsViewModel) r4
            X.1OX r3 = X.C41561wd.A00(r4)
            X.0wl r2 = r4.A0I
            r1 = 0
            com.whatsapp.expressionstray.expression.avatars.AvatarExpressionsViewModel$onCreateAvatarButton$1 r0 = new com.whatsapp.expressionstray.expression.avatars.AvatarExpressionsViewModel$onCreateAvatarButton$1
            r0.<init>(r4, r1)
            X.AnonymousClass3MW.A1X(r2, r0, r3)
            return
        L_0x06bb:
            java.lang.Object r0 = r10.A01
            com.whatsapp.events.EventInfoFragment r0 = (com.whatsapp.events.EventInfoFragment) r0
            X.0vl r0 = r0.A0C
            java.lang.Object r1 = r0.getValue()
            X.3Va r1 = (X.C73353Va) r1
            r0 = 1
            r1.A0U(r0)
            return
        L_0x06cc:
            java.lang.Object r5 = r10.A01
            androidx.fragment.app.Fragment r5 = (androidx.fragment.app.Fragment) r5
            X.3Rj r4 = X.AnonymousClass4a6.A03(r5)
            r0 = 2131890057(0x7f120f89, float:1.9414795E38)
            r4.A0D(r0)
            r3 = 2131898593(0x7f1230e1, float:1.9432108E38)
            X.1q9 r2 = r5.A1G()
            r1 = 15
            X.4fx r0 = new X.4fx
            r0.<init>(r5, r1)
            r4.A0g(r2, r0, r3)
            r2 = 2131892908(0x7f121aac, float:1.9420578E38)
            X.1q9 r1 = r5.A1G()
            r0 = 0
            r4.A0e(r1, r0, r2)
            r4.A0C()
            return
        L_0x06fa:
            java.lang.Object r2 = r10.A01
            com.whatsapp.events.EventCreateOrEditFragment r2 = (com.whatsapp.events.EventCreateOrEditFragment) r2
            X.3VY r3 = r2.A0M
            r1 = 0
            if (r3 != 0) goto L_0x0709
            java.lang.String r0 = "eventCreateOrEditViewModel"
            X.C18070vi.A11(r0)
            throw r1
        L_0x0709:
            com.whatsapp.WaEditText r0 = r2.A0C
            if (r0 == 0) goto L_0x0743
            android.text.Editable r0 = r0.getText()
        L_0x0711:
            java.lang.String r5 = java.lang.String.valueOf(r0)
            X.0vl r0 = r2.A0t
            java.lang.Object r0 = X.AnonymousClass3MX.A14(r0)
            java.util.Calendar r0 = (java.util.Calendar) r0
            java.util.Date r0 = r0.getTime()
            long r7 = r0.getTime()
            java.lang.Long r4 = com.whatsapp.events.EventCreateOrEditFragment.A00(r2)
            com.whatsapp.WaEditText r0 = r2.A06
            if (r0 == 0) goto L_0x0731
            android.text.Editable r1 = r0.getText()
        L_0x0731:
            java.lang.String r6 = java.lang.String.valueOf(r1)
            com.whatsapp.wds.components.toggle.WDSSwitch r0 = r2.A0c
            if (r0 == 0) goto L_0x0741
            boolean r9 = r0.isChecked()
        L_0x073d:
            r3.A0V(r4, r5, r6, r7, r9)
            return
        L_0x0741:
            r9 = 0
            goto L_0x073d
        L_0x0743:
            r0 = r1
            goto L_0x0711
        L_0x0745:
            java.lang.Object r0 = r10.A01
            X.5Zm r0 = (X.C107385Zm) r0
            r0.Bm8()
            return
        L_0x074d:
            java.lang.Object r0 = r10.A01
            com.whatsapp.emoji.search.EmojiSearchContainer r0 = (com.whatsapp.emoji.search.EmojiSearchContainer) r0
            com.whatsapp.InterceptingEditText r0 = r0.A04
        L_0x0753:
            X.AnonymousClass3MW.A1S(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C825148g.A04(android.view.View):void");
    }
}
