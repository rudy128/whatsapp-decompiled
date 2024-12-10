package X;

import java.util.ArrayList;

/* renamed from: X.17U  reason: invalid class name */
public class AnonymousClass17U implements AnonymousClass17T {
    public AnonymousClass3M7 A00;
    public C1599286k A01;
    public boolean A02;
    public boolean A03;

    public int getBackgroundColorRes() {
        boolean z = false;
        if (this.A00 != null) {
            z = true;
        }
        C17960vV.A0F(z, "VoipReturnToCallBannerBridgeImpl/getBackgroudColor no banner when get background color");
        AnonymousClass3M7 r0 = this.A00;
        if (r0 != null) {
            return r0.getBackgroundColorRes();
        }
        return 0;
    }

    public void setVisibilityChangeListener(C1599286k r2) {
        this.A01 = r2;
        AnonymousClass3M7 r0 = this.A00;
        if (r0 != null) {
            r0.setVisibilityChangeListener(r2);
        }
    }

    public static C135166rl A00(C178119Bw r4) {
        ArrayList A0B = r4.A0B();
        boolean A0W = r4.A0W();
        boolean z = true;
        boolean z2 = false;
        if (A0B.size() == 0) {
            z2 = true;
        }
        if (A0B.size() <= 2) {
            z = false;
        }
        return new C135166rl(A0W, z2, z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: X.5g1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: com.whatsapp.calling.views.VoipReturnToCallBanner} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: X.3RI} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: com.whatsapp.calling.views.VoipReturnToCallBanner} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: com.whatsapp.calling.views.VoipReturnToCallBanner} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: com.whatsapp.calling.views.VoipReturnToCallBanner} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: com.whatsapp.calling.views.VoipReturnToCallBanner} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View BHS(X.AnonymousClass01E r4, X.AnonymousClass11S r5, X.C135166rl r6, X.C18030ve r7, X.AnonymousClass1BI r8) {
        /*
            r3 = this;
            boolean r0 = X.C40811vJ.A0G(r5, r7)
            if (r0 == 0) goto L_0x0056
            r0 = 0
            X.C18070vi.A0d(r4, r0)
            X.3RI r2 = new X.3RI
            r2.<init>(r4, r8)
            X.1It r1 = new X.1It
            r1.<init>(r4)
            java.lang.Class<com.whatsapp.calling.banner.viewmodel.MinimizedCallBannerViewModel> r0 = com.whatsapp.calling.banner.viewmodel.MinimizedCallBannerViewModel.class
            X.1J2 r0 = r1.A00(r0)
            com.whatsapp.calling.banner.viewmodel.MinimizedCallBannerViewModel r0 = (com.whatsapp.calling.banner.viewmodel.MinimizedCallBannerViewModel) r0
            r2.setViewModel(r0)
            com.whatsapp.calling.banner.viewmodel.MinimizedCallBannerViewModel r1 = r2.getViewModel()
            X.1BI r0 = r1.A00
            boolean r0 = X.C18070vi.A18(r0, r8)
            if (r0 != 0) goto L_0x0037
            r1.A00 = r8
            X.00H r0 = r1.A04
            java.lang.Object r0 = r0.get()
            com.whatsapp.calling.banner.viewmodel.MinimizedCallBannerUseCase r0 = (com.whatsapp.calling.banner.viewmodel.MinimizedCallBannerUseCase) r0
            r0.A00 = r8
        L_0x0037:
            r3.A00 = r2
            if (r6 == 0) goto L_0x003e
            r2.setCallLogData(r6)
        L_0x003e:
            X.3M7 r1 = r3.A00
            if (r1 == 0) goto L_0x0055
            boolean r0 = r3.A02
            r1.setShouldHideBanner(r0)
            X.3M7 r1 = r3.A00
            boolean r0 = r3.A03
            r1.setShouldHideCallDuration(r0)
            X.3M7 r1 = r3.A00
            X.86k r0 = r3.A01
            r1.setVisibilityChangeListener(r0)
        L_0x0055:
            return r2
        L_0x0056:
            boolean r0 = X.C40811vJ.A0C(r5, r7)
            if (r0 == 0) goto L_0x007e
            X.1It r1 = new X.1It
            r1.<init>(r4)
            java.lang.Class<com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatCallingViewModel> r0 = com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatCallingViewModel.class
            X.1J2 r1 = r1.A00(r0)
            com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatCallingViewModel r1 = (com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatCallingViewModel) r1
            r0 = 0
            X.C18070vi.A0d(r4, r0)
            r0 = 1
            X.C18070vi.A0d(r1, r0)
            X.5g1 r2 = new X.5g1
            r2.<init>(r4)
            r2.setAudioChatViewModel(r1, r4)
            com.whatsapp.calling.views.VoipReturnToCallBanner r0 = r2.A06
            r0.A0D = r8
            goto L_0x0037
        L_0x007e:
            r0 = 0
            com.whatsapp.calling.views.VoipReturnToCallBanner r2 = new com.whatsapp.calling.views.VoipReturnToCallBanner
            r2.<init>(r4, r0)
            r2.A0D = r8
            goto L_0x0037
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass17U.BHS(X.01E, X.11S, X.6rl, X.0ve, X.1BI):android.view.View");
    }
}
