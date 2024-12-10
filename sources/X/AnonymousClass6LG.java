package X;

import android.view.View;

/* renamed from: X.6LG  reason: invalid class name */
public class AnonymousClass6LG extends C38471rL {
    public final int A00;
    public final Object A01;

    public AnonymousClass6LG(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(View view, Object obj, int i) {
        view.setOnClickListener(new AnonymousClass6LG(obj, i));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0213, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r4.A0E, 9678) != false) goto L_0x0215;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x03d1, code lost:
        r1.A01(r2, r3, r4, r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x03d4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x04e3, code lost:
        if (r5.A02() == false) goto L_0x04e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x055e, code lost:
        r3.A28();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0561, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x0562, code lost:
        r0 = "xFamilyUserFlowLogger";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x07a5, code lost:
        r0 = "statusLoggingConfig";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x07b2, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x07b6, code lost:
        throw null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:417:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(android.view.View r17) {
        /*
            r16 = this;
            r1 = r16
            int r0 = r1.A00
            r3 = r17
            switch(r0) {
                case 0: goto L_0x048d;
                case 1: goto L_0x0468;
                case 2: goto L_0x0450;
                case 3: goto L_0x0441;
                case 4: goto L_0x03dd;
                case 5: goto L_0x03d5;
                case 6: goto L_0x075c;
                case 7: goto L_0x06ee;
                case 8: goto L_0x01e1;
                case 9: goto L_0x01c9;
                case 10: goto L_0x03b9;
                case 11: goto L_0x03a0;
                case 12: goto L_0x0384;
                case 13: goto L_0x06d1;
                case 14: goto L_0x0178;
                case 15: goto L_0x0374;
                case 16: goto L_0x0361;
                case 17: goto L_0x033b;
                case 18: goto L_0x032f;
                case 19: goto L_0x014a;
                case 20: goto L_0x033b;
                case 21: goto L_0x032f;
                case 22: goto L_0x0014;
                case 23: goto L_0x0126;
                case 24: goto L_0x05bf;
                case 25: goto L_0x07a8;
                case 26: goto L_0x0327;
                case 27: goto L_0x02e3;
                case 28: goto L_0x02db;
                case 29: goto L_0x02cc;
                case 30: goto L_0x02af;
                case 31: goto L_0x00e9;
                case 32: goto L_0x00b4;
                case 33: goto L_0x0594;
                case 34: goto L_0x0076;
                case 35: goto L_0x02a7;
                case 36: goto L_0x0566;
                case 37: goto L_0x029f;
                case 38: goto L_0x0015;
                case 39: goto L_0x0293;
                case 40: goto L_0x0009;
                case 41: goto L_0x0009;
                case 42: goto L_0x0249;
                case 43: goto L_0x023f;
                case 44: goto L_0x0551;
                case 45: goto L_0x04fd;
                default: goto L_0x0009;
            }
        L_0x0009:
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            java.lang.Object r0 = r1.A01
            X.1Di r0 = (X.C22821Di) r0
            r0.invoke(r3)
        L_0x0014:
            return
        L_0x0015:
            java.lang.Object r4 = r1.A01
            com.whatsapp.twofactor.SetEmailFragment r4 = (com.whatsapp.twofactor.SetEmailFragment) r4
            java.lang.String r0 = "setemailfragment/submit"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            int r1 = r4.A00
            r0 = 1
            r3 = 2
            if (r1 == r0) goto L_0x0048
            if (r1 != r3) goto L_0x0014
            com.whatsapp.twofactor.TwoFactorAuthActivity r2 = r4.A05
            r1 = 0
            if (r2 == 0) goto L_0x003e
            java.lang.String r0 = r2.A04
            java.lang.String r1 = r2.A05
        L_0x002f:
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L_0x0040
            com.whatsapp.twofactor.TwoFactorAuthActivity r1 = r4.A05
            if (r1 == 0) goto L_0x0014
            r0 = 0
            r1.A4d(r0)
            return
        L_0x003e:
            r0 = r1
            goto L_0x002f
        L_0x0040:
            android.widget.TextView r1 = r4.A02
            if (r1 == 0) goto L_0x0014
            r0 = 2131897180(0x7f122b5c, float:1.9429242E38)
            goto L_0x0072
        L_0x0048:
            java.util.regex.Pattern r1 = android.util.Patterns.EMAIL_ADDRESS
            com.whatsapp.twofactor.TwoFactorAuthActivity r0 = r4.A05
            if (r0 == 0) goto L_0x0052
            java.lang.String r0 = r0.A04
            if (r0 != 0) goto L_0x0054
        L_0x0052:
            java.lang.String r0 = ""
        L_0x0054:
            java.util.regex.Matcher r0 = r1.matcher(r0)
            boolean r0 = r0.matches()
            if (r0 == 0) goto L_0x006b
            com.whatsapp.twofactor.TwoFactorAuthActivity r2 = r4.A05
            if (r2 == 0) goto L_0x0014
            com.whatsapp.twofactor.SetEmailFragment r1 = X.C83984Hk.A00(r3)
            r0 = 1
            r2.A4c(r1, r0)
            return
        L_0x006b:
            android.widget.TextView r1 = r4.A02
            if (r1 == 0) goto L_0x0014
            r0 = 2131897177(0x7f122b59, float:1.9429236E38)
        L_0x0072:
            r1.setText(r0)
            return
        L_0x0076:
            java.lang.Object r0 = r1.A01
            com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity r0 = (com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity) r0
            com.whatsapp.stickers.store.preview.StickerStorePackPreviewViewModel r5 = r0.A0B
            if (r5 != 0) goto L_0x0082
            java.lang.String r0 = "viewModel"
            goto L_0x07b2
        L_0x0082:
            X.1DT r2 = r5.A00
            java.lang.Object r1 = r2.A06()
            boolean r0 = r1 instanceof X.C145677Me
            r4 = 0
            if (r0 == 0) goto L_0x0014
            X.7Me r1 = (X.C145677Me) r1
            if (r1 == 0) goto L_0x0014
            X.725 r1 = r1.A00
            X.1DT r0 = r5.A01
            java.lang.Object r3 = r0.A06()
            X.22i r3 = (X.C441522i) r3
            if (r3 == 0) goto L_0x0014
            X.6IL r0 = new X.6IL
            r0.<init>(r1)
            r2.A0F(r0)
            X.1OX r2 = X.C41561wd.A00(r5)
            X.0wl r1 = r5.A06
            com.whatsapp.stickers.store.preview.StickerStorePackPreviewViewModel$retryDownloadingStickerPackZipFile$1 r0 = new com.whatsapp.stickers.store.preview.StickerStorePackPreviewViewModel$retryDownloadingStickerPackZipFile$1
            r0.<init>(r3, r5, r4)
            X.AnonymousClass3MW.A1X(r1, r0, r2)
            return
        L_0x00b4:
            java.lang.Object r4 = r1.A01
            com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity r4 = (com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity) r4
            X.00H r0 = r4.A0H
            if (r0 == 0) goto L_0x04f1
            X.A59 r3 = X.C108945cZ.A0e(r0)
            java.lang.Integer r2 = X.C108955ca.A0i()
            r1 = 1
            r0 = 8
            r3.A03(r2, r1, r0)
            com.whatsapp.stickers.store.preview.StickerStorePackPreviewViewModel r0 = r4.A0B
            r2 = 0
            if (r0 != 0) goto L_0x00d3
            X.AnonymousClass3MW.A1H()
            throw r2
        L_0x00d3:
            X.725 r1 = r0.A0T()
            if (r1 == 0) goto L_0x0014
            boolean r0 = r1.A0W
            if (r0 != 0) goto L_0x00e1
            java.lang.String r0 = r1.A03
            if (r0 == 0) goto L_0x0014
        L_0x00e1:
            com.whatsapp.stickers.store.ConfirmPackDeleteDialogFragment r0 = com.whatsapp.stickers.store.ConfirmPackDeleteDialogFragment.A00(r1)
            r4.CMk(r0, r2)
            return
        L_0x00e9:
            java.lang.Object r4 = r1.A01
            com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity r4 = (com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity) r4
            X.00H r0 = r4.A0H
            if (r0 == 0) goto L_0x04f1
            X.A59 r1 = X.C108945cZ.A0e(r0)
            java.lang.Integer r0 = X.AnonymousClass3MY.A0h()
            r3 = 1
            r2 = 8
            r1.A03(r0, r3, r2)
            com.whatsapp.stickers.store.preview.StickerStorePackPreviewViewModel r0 = r4.A0B
            r1 = 0
            if (r0 != 0) goto L_0x010a
            java.lang.String r0 = "viewModel"
        L_0x0106:
            X.C18070vi.A11(r0)
            throw r1
        L_0x010a:
            X.725 r5 = r0.A0T()
            if (r5 == 0) goto L_0x0014
            boolean r0 = r5.A09
            if (r0 == 0) goto L_0x011a
            boolean r0 = r5.A02()
            if (r0 == 0) goto L_0x0014
        L_0x011a:
            r5.A09 = r3
            com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity.A0V(r4)
            X.6RG r0 = r4.A03
            if (r0 != 0) goto L_0x0496
            java.lang.String r0 = "stickerPackPreviewSource"
            goto L_0x0106
        L_0x0126:
            java.lang.Object r0 = r1.A01
            X.72j r0 = (X.C1406472j) r0
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment r2 = r0.A03
            if (r2 == 0) goto L_0x0014
            java.util.List r1 = r2.A0w
            if (r1 == 0) goto L_0x0014
            int r0 = r2.A00
            X.206 r0 = X.AnonymousClass3MW.A0k(r1, r0)
            if (r0 == 0) goto L_0x0014
            X.70K r1 = r2.A2G(r0)
            boolean r0 = r1 instanceof X.C120896Gl
            if (r0 == 0) goto L_0x0014
            X.6Gl r1 = (X.C120896Gl) r1
            if (r1 == 0) goto L_0x0014
            r1.A0b()
            return
        L_0x014a:
            if (r17 == 0) goto L_0x0014
            java.lang.Object r1 = r1.A01
            X.6Gm r1 = (X.C120906Gm) r1
            android.content.Context r2 = r1.A0J()
            X.206 r4 = r1.A07
            r0 = 16
            X.6LG r5 = new X.6LG
            r5.<init>(r1, r0)
            r0 = 17
            X.6LG r6 = new X.6LG
            r6.<init>(r1, r0)
            r0 = 18
            X.6LG r7 = new X.6LG
            r7.<init>(r1, r0)
            X.1dS r9 = r1.A0E
            X.1x7 r8 = r1.A0D
            X.5h7 r1 = new X.5h7
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r1.A00()
            return
        L_0x0178:
            java.lang.Object r4 = r1.A01
            X.6Gm r4 = (X.C120906Gm) r4
            X.4Yp r0 = r4.A09
            X.206 r3 = r4.A07
            boolean r0 = r0.A04(r3)
            if (r0 == 0) goto L_0x0014
            X.6wL r5 = r4.A03
            java.lang.Integer r0 = X.C17880vN.A0k()
            X.62y r2 = new X.62y
            r2.<init>()
            r2.A01 = r0
            X.205 r1 = r3.A0v
            boolean r0 = r1.A02
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A00 = r0
            java.lang.Integer r0 = X.C137986wL.A00(r3)
            r2.A02 = r0
            X.00H r0 = r5.A01
            r0.get()
            X.1BI r0 = r1.A00
            int r0 = X.C63152sb.A00(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A03 = r0
            X.18K r0 = r5.A00
            r0.CC7(r2)
            X.1iW r2 = r4.A03
            android.content.Context r0 = r4.A0J()
            android.app.Activity r1 = X.AnonymousClass1L9.A00(r0)
            X.1L9 r0 = r4.A0E
            r2.A0K(r1, r0, r3)
            return
        L_0x01c9:
            java.lang.Object r0 = r1.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.1FL r1 = r0.A1B()
            X.89M r1 = (X.AnonymousClass89M) r1
            if (r1 == 0) goto L_0x0014
            r0 = 2
            com.whatsapp.status.playback.StatusPlaybackActivity r1 = (com.whatsapp.status.playback.StatusPlaybackActivity) r1
            r1.A02 = r0
            com.whatsapp.status.playback.StatusPlaybackActivity.A0q(r1)
            r1.finish()
            return
        L_0x01e1:
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            java.lang.Object r0 = r1.A01
            X.5f9 r0 = (X.C110235f9) r0
            X.6cl r0 = r0.A0B
            com.whatsapp.status.playback.MyStatusesActivity r4 = r0.A00
            java.lang.Object r5 = r3.getTag()
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.protocol.FMessage"
            X.C18070vi.A0z(r5, r0)
            X.206 r5 = (X.AnonymousClass206) r5
            r0 = 0
            X.C18070vi.A0d(r5, r0)
            X.02B r0 = r4.A00
            if (r0 == 0) goto L_0x0203
            r0.A05()
        L_0x0203:
            boolean r3 = X.AnonymousClass25A.A0p(r5)
            if (r3 == 0) goto L_0x022c
            X.0ve r2 = r4.A0E
            r1 = 9678(0x25ce, float:1.3562E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x022c
        L_0x0215:
            X.1iW r0 = r4.A0A
            if (r0 == 0) goto L_0x04f5
            r0.A0c(r5)
        L_0x021c:
            if (r3 != 0) goto L_0x0014
            X.1hg r4 = r4.A4c()
            r6 = 0
            java.lang.String r9 = "user_manual_retry"
            r10 = 0
            r8 = r6
            r7 = r6
            r4.A0D(r5, r6, r7, r8, r9, r10)
            return
        L_0x022c:
            int r0 = r5.A0u
            boolean r0 = X.AnonymousClass25A.A0H(r0)
            if (r0 == 0) goto L_0x0215
            X.1kd r1 = r4.A09
            if (r1 == 0) goto L_0x04f9
            r0 = r5
            X.21V r0 = (X.AnonymousClass21V) r0
            r1.A07(r0)
            goto L_0x021c
        L_0x023f:
            java.lang.Object r0 = r1.A01
            com.whatsapp.voipcalling.VoipActivityV2 r0 = (com.whatsapp.voipcalling.VoipActivityV2) r0
            com.whatsapp.calling.participantlist.viewmodel.ParticipantsListViewModel r0 = r0.A0r
            r0.A0T()
            return
        L_0x0249:
            java.lang.Object r12 = r1.A01
            com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity r12 = (com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity) r12
            X.10I r2 = r12.A05
            X.11P r6 = r12.A05
            X.1iW r5 = r12.A01
            X.0vb r7 = r12.A0F
            X.1LA r4 = r12.A00
            X.00H r0 = r12.A0N
            X.1W6 r11 = X.C17880vN.A0c(r0)
            X.1BI r8 = r12.A0H
            X.C17960vV.A07(r8)
            java.util.ArrayList r13 = r12.A0W
            java.util.ArrayList r14 = r12.A0X
            android.content.Intent r3 = r12.getIntent()
            java.lang.String r0 = "has_number_from_url"
            r1 = 0
            boolean r15 = r3.getBooleanExtra(r0, r1)
            android.content.Intent r3 = r12.getIntent()
            java.lang.String r0 = "quoted_message"
            android.os.Bundle r0 = r3.getBundleExtra(r0)
            X.205 r10 = X.AnonymousClass25A.A09(r0)
            X.1EC r9 = X.C108995ce.A0Q(r12)
            X.6MM r3 = new X.6MM
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            X.AnonymousClass3MW.A1T(r3, r2, r1)
            X.4Yq r1 = r12.A0B
            r0 = 9
            r1.A03(r0)
            return
        L_0x0293:
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            java.lang.Object r0 = r1.A01
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r0.onClick(r3)
            return
        L_0x029f:
            java.lang.Object r0 = r1.A01
            com.whatsapp.twofactor.SetCodeFragment r0 = (com.whatsapp.twofactor.SetCodeFragment) r0
            com.whatsapp.twofactor.SetCodeFragment.A00(r0)
            return
        L_0x02a7:
            java.lang.Object r0 = r1.A01
            android.app.Activity r0 = (android.app.Activity) r0
            X.AnonymousClass4aU.A05(r0)
            return
        L_0x02af:
            java.lang.Object r0 = r1.A01
            X.6IG r0 = (X.AnonymousClass6IG) r0
            com.whatsapp.stickers.store.StickerStoreMyTabFragment r1 = r0.A00
            X.00H r0 = r1.A02
            java.lang.Object r3 = r0.get()
            X.73V r3 = (X.AnonymousClass73V) r3
            X.1FU r2 = X.C108945cZ.A0Y(r1)
            java.lang.String r1 = "sticker_store_my_stickers"
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            r0 = 0
            r3.A04(r2, r1, r0)
            return
        L_0x02cc:
            java.lang.Object r0 = r1.A01
            X.6Hw r0 = (X.C121136Hw) r0
            com.whatsapp.stickers.stickerpack.StickerPackDownloader r2 = r0.A08
            X.725 r0 = r0.A04
            java.lang.String r1 = r0.A0H
            r0 = 0
            r2.A03(r1, r0)
            return
        L_0x02db:
            java.lang.Object r0 = r1.A01
            X.6CF r0 = (X.AnonymousClass6CF) r0
            r0.A07()
            return
        L_0x02e3:
            java.lang.Object r4 = r1.A01
            com.whatsapp.statuscomposer.composer.TextStatusComposerFragment r4 = (com.whatsapp.statuscomposer.composer.TextStatusComposerFragment) r4
            X.3TA r0 = r4.A0O
            java.lang.String r3 = "webPagePreviewViewModel"
            r2 = 0
            if (r0 == 0) goto L_0x0323
            java.lang.String r0 = r0.A0A
            java.lang.String r1 = java.lang.String.valueOf(r0)
            r4.A18 = r1
            X.6xY r0 = r4.A0o
            if (r0 != 0) goto L_0x0300
            java.lang.String r0 = "entryCallbacks"
            X.C18070vi.A11(r0)
            throw r2
        L_0x0300:
            r0.A02 = r1
            X.3TA r0 = r4.A0O
            if (r0 == 0) goto L_0x0323
            r0.A0b(r1)
            X.3TA r0 = r4.A0O
            if (r0 == 0) goto L_0x0323
            r4.A0N = r2
            com.whatsapp.statuscomposer.composer.TextStatusComposerFragment.A09(r4)
            com.whatsapp.status.widget.StatusEditText r1 = r4.A0l
            java.lang.String r0 = "entry"
            if (r1 != 0) goto L_0x031c
            X.C18070vi.A11(r0)
            throw r2
        L_0x031c:
            r0 = 0
            r1.A01 = r0
            r1.A0P()
            return
        L_0x0323:
            X.C18070vi.A11(r3)
            throw r2
        L_0x0327:
            java.lang.Object r0 = r1.A01
            com.whatsapp.status.privacy.StatusPrivacyBottomSheetDialogFragment r0 = (com.whatsapp.status.privacy.StatusPrivacyBottomSheetDialogFragment) r0
            r0.A2M()
            return
        L_0x032f:
            java.lang.Object r0 = r1.A01
            X.6Gn r0 = (X.AnonymousClass6Gn) r0
            X.6p9 r1 = r0.A0N
            X.206 r0 = r0.A07
            r1.A00(r0)
            return
        L_0x033b:
            java.lang.Object r0 = r1.A01
            X.6Gn r0 = (X.AnonymousClass6Gn) r0
            X.6p9 r2 = r0.A0N
            X.206 r1 = r0.A07
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment r3 = r2.A02
            X.205 r2 = r1.A0v
            X.C18070vi.A0W(r2)
            com.whatsapp.status.StatusDeleteDialogFragment r1 = new com.whatsapp.status.StatusDeleteDialogFragment
            r1.<init>()
            android.os.Bundle r0 = X.C17880vN.A0D()
            X.AnonymousClass4aU.A0A(r0, r2)
            r1.A1R(r0)
            X.C137086ut.A01(r1, r3)
            return
        L_0x0361:
            java.lang.Object r0 = r1.A01
            X.6Gm r0 = (X.C120906Gm) r0
            X.6p9 r1 = r0.A0N
            X.206 r2 = r0.A07
            X.72B r0 = r0.A0C
            r6 = 0
            X.6R1 r3 = r0.A02(r6)
            r5 = 1
            r4 = 9
            goto L_0x03d1
        L_0x0374:
            java.lang.Object r0 = r1.A01
            X.6Gp r0 = (X.AnonymousClass6Gp) r0
            com.google.android.material.bottomsheet.BottomSheetBehavior r2 = r0.A01
            int r1 = r2.A0J
            r0 = 3
            if (r1 != r0) goto L_0x0380
            r0 = 4
        L_0x0380:
            r2.A0W(r0)
            return
        L_0x0384:
            java.lang.Object r3 = r1.A01
            X.6Gl r3 = (X.C120896Gl) r3
            X.70R r2 = r3.A08
            android.view.View r1 = r2.A01()
            r0 = 0
            r1.setVisibility(r0)
            android.view.View r1 = r2.A01()
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.setAlpha(r0)
            r0 = 2
            X.C120896Gl.A01(r3, r0)
            return
        L_0x03a0:
            java.lang.Object r0 = r1.A01
            X.72l r0 = (X.C1406672l) r0
            X.6f3 r2 = r0.A0K
            X.72B r1 = r0.A0M
            r0 = 0
            X.6R1 r3 = r1.A02(r0)
            r4 = 8
            r6 = 1
            X.C18070vi.A0d(r3, r6)
            X.6p9 r1 = r2.A01
            X.206 r2 = r2.A00
            r5 = 0
            goto L_0x03d1
        L_0x03b9:
            java.lang.Object r0 = r1.A01
            X.72l r0 = (X.C1406672l) r0
            X.6f3 r2 = r0.A0K
            X.72B r1 = r0.A0M
            r0 = 0
            X.6R1 r3 = r1.A02(r0)
            r4 = 8
            r5 = 1
            X.C18070vi.A0d(r3, r5)
            X.6p9 r1 = r2.A01
            X.206 r2 = r2.A00
            r6 = 0
        L_0x03d1:
            r1.A01(r2, r3, r4, r5, r6)
            return
        L_0x03d5:
            java.lang.Object r0 = r1.A01
            com.whatsapp.status.playback.MyStatusesActivity r0 = (com.whatsapp.status.playback.MyStatusesActivity) r0
            com.whatsapp.status.playback.MyStatusesActivity.A11(r0)
            return
        L_0x03dd:
            java.lang.Object r4 = r1.A01
            com.whatsapp.status.playback.MessageReplyActivity r4 = (com.whatsapp.status.playback.MessageReplyActivity) r4
            boolean r0 = X.C108995ce.A1Z(r4)
            if (r0 == 0) goto L_0x03ed
            r0 = 106(0x6a, float:1.49E-43)
            X.AnonymousClass4Yv.A01(r4, r0)
            return
        L_0x03ed:
            X.0ve r0 = r4.A0E
            boolean r0 = X.C87544Vz.A01(r0)
            r3 = 5
            if (r0 == 0) goto L_0x0434
            X.5tO r0 = r4.A0R
            X.3d2 r1 = r0.A02
            X.5z4 r0 = r4.A0b
            if (r0 == 0) goto L_0x0415
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L_0x0415
            X.5z4 r0 = r4.A0b
            r0.dismiss()
        L_0x0409:
            if (r1 == 0) goto L_0x0434
            boolean r0 = r1.isShowing()
            if (r0 == 0) goto L_0x042d
            r1.A0E()
            return
        L_0x0415:
            boolean r0 = X.C108975cc.A1E(r4)
            if (r0 == 0) goto L_0x0409
            X.74J r0 = X.C108965cb.A0L(r4)
            boolean r0 = r0.A0U()
            if (r0 == 0) goto L_0x0409
            X.74J r0 = X.C108965cb.A0L(r4)
            r0.A0D()
            goto L_0x0409
        L_0x042d:
            X.5tO r1 = r4.A0R
            r0 = 0
            r1.A0J(r0)
            return
        L_0x0434:
            X.5tO r2 = r4.A0R
            android.view.View r1 = r4.A03
            boolean r0 = r4.A1Y
            if (r0 != 0) goto L_0x043d
            r3 = 2
        L_0x043d:
            r2.A0E(r1, r3)
            return
        L_0x0441:
            java.lang.Object r1 = r1.A01
            com.whatsapp.status.playback.MessageReplyActivity r1 = (com.whatsapp.status.playback.MessageReplyActivity) r1
            r0 = 3
            r1.A4b(r0)
            com.whatsapp.status.playback.MessageReplyActivity.A0z(r1)
            com.whatsapp.status.playback.MessageReplyActivity.A0w(r1)
            return
        L_0x0450:
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            java.lang.Object r0 = r1.A01
            X.71y r0 = (X.C1405571y) r0
            X.6pB r4 = r0.A03
            android.content.Context r3 = X.AnonymousClass3MY.A04(r3)
            java.lang.Integer r2 = X.AnonymousClass00R.A01
            java.lang.Integer r1 = X.AnonymousClass00R.A00
            java.lang.String r0 = "status_privacy_settings"
            r4.A01(r3, r2, r1, r0)
            return
        L_0x0468:
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            android.content.Context r4 = r3.getContext()
            X.C18070vi.A0b(r4)
            boolean r3 = X.AnonymousClass6YD.A00(r4)
            r2 = 0
            java.lang.Object r0 = r1.A01
            X.6hR r0 = (X.C129216hR) r0
            X.1L9 r1 = r0.A00
            if (r3 == 0) goto L_0x048a
            java.lang.String r0 = "fb://feed/"
        L_0x0482:
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r1.CGU(r4, r0, r2)
            return
        L_0x048a:
            java.lang.String r0 = "https://m.facebook.com"
            goto L_0x0482
        L_0x048d:
            java.lang.Object r1 = r1.A01
            X.6lR r1 = (X.C131646lR) r1
            r0 = 1
            r1.A00(r0)
            return
        L_0x0496:
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L_0x04a8;
                case 1: goto L_0x04a8;
                case 2: goto L_0x04a2;
                case 3: goto L_0x04a4;
                case 4: goto L_0x04a9;
                case 5: goto L_0x04a6;
                case 6: goto L_0x04a4;
                case 7: goto L_0x04a4;
                default: goto L_0x049d;
            }
        L_0x049d:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x04a2:
            r2 = 5
            goto L_0x04a9
        L_0x04a4:
            r2 = 1
            goto L_0x04a9
        L_0x04a6:
            r2 = 6
            goto L_0x04a9
        L_0x04a8:
            r2 = 2
        L_0x04a9:
            X.205 r0 = r4.A04
            if (r0 == 0) goto L_0x04af
            X.1BI r1 = r0.A00
        L_0x04af:
            int r3 = X.C64002u3.A04(r1)
            boolean r0 = r5.A0W
            if (r0 == 0) goto L_0x04c8
            boolean r0 = r5.A0V
            if (r0 == 0) goto L_0x04c8
            X.10I r2 = r4.A05
            r1 = 46
            X.3Cu r0 = new X.3Cu
            r0.<init>(r4, r3, r1, r5)
            r2.CGF(r0)
            return
        L_0x04c8:
            X.00H r0 = r4.A0M
            if (r0 == 0) goto L_0x04ed
            java.lang.Object r4 = r0.get()
            com.whatsapp.stickers.stickerpack.StickerPackDownloader r4 = (com.whatsapp.stickers.stickerpack.StickerPackDownloader) r4
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            java.lang.String r0 = r5.A03
            if (r0 == 0) goto L_0x04e5
            boolean r0 = r5.A02()
            r11 = 1
            if (r0 != 0) goto L_0x04e6
        L_0x04e5:
            r11 = 0
        L_0x04e6:
            r6 = 0
            r10 = r6
            r9 = r6
            r4.A02(r5, r6, r7, r8, r9, r10, r11)
            return
        L_0x04ed:
            java.lang.String r0 = "stickerPackDownloader"
            goto L_0x07b2
        L_0x04f1:
            java.lang.String r0 = "expressionUserJourneyLogger"
            goto L_0x07b2
        L_0x04f5:
            java.lang.String r0 = "userActions"
            goto L_0x07b2
        L_0x04f9:
            java.lang.String r0 = "sendMedia"
            goto L_0x07b2
        L_0x04fd:
            java.lang.Object r3 = r1.A01
            com.whatsapp.xfamily.crossposting.ui.bottomsheet.CrosspostingLinkingDisclosureBottomSheetDialogFragment r3 = (com.whatsapp.xfamily.crossposting.ui.bottomsheet.CrosspostingLinkingDisclosureBottomSheetDialogFragment) r3
            r0 = 1
            r3.A06 = r0
            X.1dR r1 = r3.A05
            if (r1 == 0) goto L_0x0562
            java.lang.String r0 = "TAP_NUX_CONTINUE"
            r1.A04(r0)
            X.6jZ r5 = r3.A03
            if (r5 == 0) goto L_0x054d
            X.1FL r7 = r3.A1B()
            if (r7 == 0) goto L_0x0548
            java.lang.Integer r6 = com.whatsapp.xfamily.crossposting.ui.bottomsheet.CrosspostingLinkingDisclosureBottomSheetDialogFragment.A07
            X.89c r2 = r3.A02
            r0 = 1
            java.lang.StringBuilder r1 = X.AnonymousClass3MZ.A19(r6, r0)
            java.lang.String r0 = "AccountLinkingLauncher/startAccountLinkingActivityForResult called by caller "
            r1.append(r0)
            java.lang.String r0 = X.AnonymousClass6YH.A00(r6)
            X.C108995ce.A1O(r1, r0)
            r5.A00 = r2
            X.1KB r0 = r5.A02
            X.6p4 r8 = new X.6p4
            r8.<init>(r0)
            r0 = 2131886429(0x7f12015d, float:1.9407437E38)
            r8.A01(r0)
            X.10I r0 = r5.A03
            r9 = 33
            X.7Py r4 = new X.7Py
            r4.<init>(r5, r6, r7, r8, r9)
            r0.CGF(r4)
            goto L_0x055e
        L_0x0548:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()
            throw r0
        L_0x054d:
            java.lang.String r0 = "accountLinkingLauncher"
            goto L_0x07b2
        L_0x0551:
            java.lang.Object r3 = r1.A01
            com.whatsapp.xfamily.crossposting.ui.bottomsheet.CrosspostingLinkingDisclosureBottomSheetDialogFragment r3 = (com.whatsapp.xfamily.crossposting.ui.bottomsheet.CrosspostingLinkingDisclosureBottomSheetDialogFragment) r3
            X.1dR r1 = r3.A05
            if (r1 == 0) goto L_0x0562
            java.lang.String r0 = "TAP_NUX_NOT_NOW"
            r1.A04(r0)
        L_0x055e:
            r3.A28()
            return
        L_0x0562:
            java.lang.String r0 = "xFamilyUserFlowLogger"
            goto L_0x07b2
        L_0x0566:
            java.lang.Object r4 = r1.A01
            com.whatsapp.twofactor.SecurityCheck2faSetupSuccessFragment r4 = (com.whatsapp.twofactor.SecurityCheck2faSetupSuccessFragment) r4
            X.1FL r3 = r4.A1D()
            X.00H r0 = r4.A00
            if (r0 == 0) goto L_0x0590
            android.content.Context r0 = X.C108955ca.A0A(r4, r0)
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.settings.securitycheckup.SettingsSecurityCheckupActivity"
            r2.setClassName(r1, r0)
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            android.content.Intent r0 = r2.addFlags(r0)
            r3.startActivity(r0)
            X.C108955ca.A1M(r4)
            return
        L_0x0590:
            java.lang.String r0 = "waIntents"
            goto L_0x07b2
        L_0x0594:
            java.lang.Object r3 = r1.A01
            com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity r3 = (com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity) r3
            X.00H r0 = r3.A0G
            if (r0 == 0) goto L_0x05bb
            X.6ue r1 = X.C108975cc.A0L(r0)
            r2 = 0
            r0 = 5
            r1.A03(r2, r0)
            X.00H r0 = r3.A0E
            if (r0 == 0) goto L_0x05b5
            java.lang.Object r1 = X.C18070vi.A0E(r0)
            X.73V r1 = (X.AnonymousClass73V) r1
            java.lang.String r0 = "sticker_store_pack_preview"
            r1.A04(r3, r0, r2)
            return
        L_0x05b5:
            java.lang.String r0 = "avatarEditorLauncher"
            X.C18070vi.A11(r0)
            throw r2
        L_0x05bb:
            java.lang.String r0 = "avatarLogger"
            goto L_0x07b2
        L_0x05bf:
            java.lang.Object r5 = r1.A01
            com.whatsapp.status.privacy.StatusPrivacyBottomSheetDialogFragment r5 = (com.whatsapp.status.privacy.StatusPrivacyBottomSheetDialogFragment) r5
            X.00H r0 = r5.A0F
            if (r0 == 0) goto L_0x07a5
            boolean r0 = X.C108985cd.A1Z(r0)
            java.lang.String r6 = "statusDistributionInfo"
            if (r0 == 0) goto L_0x060b
            X.1hg r0 = r5.A06
            if (r0 == 0) goto L_0x06cd
            X.77K r2 = r5.A02
            if (r2 == 0) goto L_0x06c8
            X.2tc r4 = X.C108965cb.A0Y(r0)
            boolean r0 = X.C63742tc.A03(r4)
            if (r0 == 0) goto L_0x060b
            X.2HA r3 = X.C63742tc.A00(r4)
            r0 = 26
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A03 = r0
            X.6ey r1 = r4.A02
            java.lang.Integer r0 = r1.A01
            r3.A02 = r0
            java.lang.Integer r0 = r1.A00
            r3.A01 = r0
            int r2 = r2.A00
            r1 = 1
            if (r2 == 0) goto L_0x0653
            r0 = 1
            r1 = 3
            if (r2 == r0) goto L_0x0653
            r1 = 2
            if (r2 == r1) goto L_0x0653
            r0 = 0
        L_0x0604:
            r3.A04 = r0
            X.18K r0 = r4.A01
            r0.CC7(r3)
        L_0x060b:
            X.6ew r0 = X.C108985cd.A0Y(r5)
            java.lang.String r1 = "tap_done_button"
            X.2nU r0 = r0.A00
            r0.A04(r1)
            X.1hg r1 = r5.A06
            if (r1 == 0) goto L_0x06cd
            X.77K r0 = r5.A02
            if (r0 == 0) goto L_0x06c8
            r1.A08(r0)
            boolean r0 = r5.A0K
            if (r0 == 0) goto L_0x06b9
            X.00H r1 = r5.A0O
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            java.lang.Object r0 = r1.get()
            X.6R1 r0 = (X.AnonymousClass6R1) r0
            if (r0 == 0) goto L_0x06b9
            int r1 = r0.ordinal()
            r0 = 1
            r4 = 0
            if (r1 == r0) goto L_0x066b
            r0 = 2
            if (r1 == r0) goto L_0x066b
            r0 = 3
            if (r1 != r0) goto L_0x06b9
            X.00H r0 = r5.A0H
            if (r0 == 0) goto L_0x0665
            java.lang.Object r3 = r0.get()
            com.whatsapp.bridge.wfal.WfalManager r3 = (com.whatsapp.bridge.wfal.WfalManager) r3
            X.77K r0 = r5.A02
            if (r0 != 0) goto L_0x0658
            X.C18070vi.A11(r6)
            throw r4
        L_0x0653:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            goto L_0x0604
        L_0x0658:
            boolean r2 = r0.A05
            boolean r1 = r0.A06
            X.6zR r0 = new X.6zR
            r0.<init>(r2, r1)
            r3.A04(r0)
            goto L_0x06b9
        L_0x0665:
            java.lang.String r0 = "wfalManager"
            X.C18070vi.A11(r0)
            throw r4
        L_0x066b:
            X.77K r0 = r5.A02
            if (r0 != 0) goto L_0x0673
            X.C18070vi.A11(r6)
            throw r4
        L_0x0673:
            boolean r3 = r0.A05
            X.00H r0 = r5.A0J
            if (r0 == 0) goto L_0x06ae
            X.1dR r2 = X.C108945cZ.A13(r0)
            r1 = 927605897(0x374a2489, float:1.2048645E-5)
            java.lang.String r0 = "TAP_AUDIENCE_SELECTOR_TOGGLE"
            r2.A06(r4, r0, r1)
            java.lang.Boolean r1 = X.C108945cZ.A1A(r3)
            java.lang.String r0 = "initial_auto_setting"
            r2.A02(r1, r0)
            java.lang.String r1 = "final_auto_setting"
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r2.A02(r0, r1)
            r2.A01()
            X.1mM r2 = r5.A0A
            if (r2 == 0) goto L_0x06a8
            java.lang.Integer r1 = com.whatsapp.status.privacy.StatusPrivacyBottomSheetDialogFragment.A0Q
            X.77K r0 = r5.A02
            if (r0 != 0) goto L_0x06b4
            X.C18070vi.A11(r6)
            throw r4
        L_0x06a8:
            java.lang.String r0 = "fbAccountManager"
            X.C18070vi.A11(r0)
            throw r4
        L_0x06ae:
            java.lang.String r0 = "xFamilyUserFlowLoggerLazy"
            X.C18070vi.A11(r0)
            throw r4
        L_0x06b4:
            boolean r0 = r0.A05
            r2.A05(r1, r0)
        L_0x06b9:
            X.883 r1 = r5.A08
            if (r1 == 0) goto L_0x06c4
            X.77K r0 = r5.A02
            if (r0 == 0) goto L_0x06c8
            r1.C6j(r0)
        L_0x06c4:
            r5.A28()
            return
        L_0x06c8:
            X.C18070vi.A11(r6)
            r0 = 0
            throw r0
        L_0x06cd:
            java.lang.String r0 = "statusesStatsManager"
            goto L_0x07b2
        L_0x06d1:
            java.lang.Object r2 = r1.A01
            X.6Gl r2 = (X.C120896Gl) r2
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r2.A01
            r0 = 4
            r1.A0W(r0)
            r2.A0N()
            X.70R r0 = r2.A08
            X.1bI r1 = r0.A0F
            if (r1 == 0) goto L_0x06ea
            r0 = 8
            r1.A04(r0)
            return
        L_0x06ea:
            java.lang.String r0 = "mentionsReceiverNuxPanel"
            goto L_0x07b2
        L_0x06ee:
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            java.lang.Object r0 = r1.A01
            X.5f9 r0 = (X.C110235f9) r0
            X.6cl r0 = r0.A0B
            com.whatsapp.status.playback.MyStatusesActivity r2 = r0.A00
            X.0Iy r0 = r2.A01
            if (r0 == 0) goto L_0x0703
            X.0Od r0 = r0.A04
            r0.A02()
        L_0x0703:
            java.lang.Object r7 = r3.getTag()
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.protocol.FMessage"
            X.C18070vi.A0z(r7, r0)
            X.206 r7 = (X.AnonymousClass206) r7
            android.content.Context r5 = X.AnonymousClass3MY.A04(r3)
            X.0zA r0 = r2.A04
            if (r0 == 0) goto L_0x0759
            r2.A4c()
            X.0vl r0 = r2.A14
            java.lang.Object r9 = r0.getValue()
            X.6no r9 = (X.C132886no) r9
            X.00H r0 = r2.A0Z
            if (r0 == 0) goto L_0x0756
            java.lang.Object r8 = X.C18070vi.A0E(r0)
            X.6mq r8 = (X.C132456mq) r8
            X.0zA r0 = r2.A02
            if (r0 == 0) goto L_0x0753
            X.5h8 r4 = new X.5h8
            r6 = r3
            r4.<init>(r5, r6, r7, r8, r9)
            r2.A01 = r4
            r1 = 1
            X.79m r0 = new X.79m
            r0.<init>(r2, r7, r1)
            r4.A01 = r0
            r4.A00()
            X.00H r0 = r2.A0f
            if (r0 == 0) goto L_0x0750
            java.lang.Object r0 = r0.get()
            X.72B r0 = (X.AnonymousClass72B) r0
            r0.A02(r1)
            return
        L_0x0750:
            java.lang.String r0 = "crosspostMigrationManager"
            goto L_0x07b2
        L_0x0753:
            java.lang.String r0 = "ctwaEntryPointConfigHelper"
            goto L_0x07b2
        L_0x0756:
            java.lang.String r0 = "advertiseGating"
            goto L_0x07b2
        L_0x0759:
            java.lang.String r0 = "smbLwiAnalytics"
            goto L_0x07b2
        L_0x075c:
            java.lang.Object r4 = r1.A01
            com.whatsapp.status.playback.MyStatusesActivity r4 = (com.whatsapp.status.playback.MyStatusesActivity) r4
            X.0ve r0 = r4.A0E
            r5 = 9977(0x26f9, float:1.3981E-41)
            X.0vf r3 = X.C18040vf.A02
            boolean r2 = X.C18020vd.A05(r3, r0, r5)
            X.00H r0 = r4.A0l
            if (r0 == 0) goto L_0x07a5
            boolean r0 = X.C108985cd.A1Z(r0)
            if (r0 == 0) goto L_0x0780
            X.1hg r1 = r4.A4c()
            r0 = 4
            if (r2 == 0) goto L_0x077d
            r0 = 14
        L_0x077d:
            r1.A07(r0)
        L_0x0780:
            X.0ve r0 = r4.A0E
            boolean r0 = X.C18020vd.A05(r3, r0, r5)
            r3 = 5
            if (r0 == 0) goto L_0x078b
            r3 = 20
        L_0x078b:
            X.00H r0 = r4.A0j
            if (r0 == 0) goto L_0x07a2
            java.lang.Object r2 = X.C18070vi.A0E(r0)
            X.2ku r2 = (X.C58572ku) r2
            r1 = 4
            r0 = 24
            android.content.Intent r1 = r2.A00(r4, r1, r3, r0)
            X.1L9 r0 = r4.A01
            r0.A0A(r4, r1)
            return
        L_0x07a2:
            java.lang.String r0 = "statusComposerActions"
            goto L_0x07b2
        L_0x07a5:
            java.lang.String r0 = "statusLoggingConfig"
            goto L_0x07b2
        L_0x07a8:
            java.lang.Object r4 = r1.A01
            com.whatsapp.status.privacy.StatusPrivacyBottomSheetDialogFragment r4 = (com.whatsapp.status.privacy.StatusPrivacyBottomSheetDialogFragment) r4
            X.77K r0 = r4.A02
            if (r0 != 0) goto L_0x07b7
            java.lang.String r0 = "statusDistributionInfo"
        L_0x07b2:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x07b7:
            int r0 = r0.A00
            r3 = 1
            r2 = 2
            if (r0 == r2) goto L_0x07bf
            r4.A0L = r3
        L_0x07bf:
            X.6ew r0 = X.C108985cd.A0Y(r4)
            java.lang.String r1 = "tap_my_contacts_except_entry"
            X.2nU r0 = r0.A00
            r0.A04(r1)
            X.00H r0 = r4.A0E
            if (r0 == 0) goto L_0x07db
            boolean r0 = X.C108975cc.A1H(r0)
            if (r0 == 0) goto L_0x07d7
            r4.A2N(r2)
        L_0x07d7:
            com.whatsapp.status.privacy.StatusPrivacyBottomSheetDialogFragment.A00(r4, r3)
            return
        L_0x07db:
            java.lang.String r0 = "statusConfig"
            goto L_0x07b2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6LG.A04(android.view.View):void");
    }
}
