package X;

import android.view.ViewPropertyAnimator;
import com.whatsapp.WaImageView;
import com.whatsapp.calling.banner.viewmodel.MinimizedCallBannerUseCase;
import com.whatsapp.calling.banner.viewmodel.MinimizedCallBannerViewModel;
import com.whatsapp.calling.callconfirmationsheet.ui.CallConfirmationSheet;
import java.util.List;

/* renamed from: X.5Ac  reason: invalid class name */
public class AnonymousClass5Ac extends C445423v implements C36001nB {
    public final int A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass5Ac(java.lang.Object r8, int r9) {
        /*
            r7 = this;
            r0 = r7
            r7.A00 = r9
            if (r9 == 0) goto L_0x0012
            java.lang.Class<com.whatsapp.calling.callconfirmationsheet.ui.CallConfirmationSheet> r3 = com.whatsapp.calling.callconfirmationsheet.ui.CallConfirmationSheet.class
            java.lang.String r5 = "updateUiStateAndParticipantList(Lcom/whatsapp/calling/callconfirmationsheet/data/CallConfirmationSheetUiState;Lcom/whatsapp/calling/callconfirmationsheet/data/ParticipantList;)V"
            r6 = 4
            r1 = 3
            java.lang.String r4 = "updateUiStateAndParticipantList"
        L_0x000d:
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L_0x0012:
            java.lang.Class<com.whatsapp.calling.banner.viewmodel.MinimizedCallBannerViewModel> r3 = com.whatsapp.calling.banner.viewmodel.MinimizedCallBannerViewModel.class
            java.lang.String r5 = "onAudioLevelsUpdated(Lcom/whatsapp/calling/calldatasource/ParticipantAudioLevels;Lcom/whatsapp/calling/banner/data/MinimizedCallBannerViewState;)Lcom/whatsapp/calling/banner/data/MinimizedCallBannerViewState;"
            r6 = 4
            r1 = 3
            java.lang.String r4 = "onAudioLevelsUpdated"
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5Ac.<init>(java.lang.Object, int):void");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        ViewPropertyAnimator animate;
        Object obj4 = obj2;
        if (this.A00 != 0) {
            AnonymousClass4T3 r6 = (AnonymousClass4T3) obj4;
            CallConfirmationSheet callConfirmationSheet = (CallConfirmationSheet) this.receiver;
            callConfirmationSheet.A2M((C87154Um) obj);
            List list = r6.A00;
            C28931bI r1 = callConfirmationSheet.A05;
            int i2 = 0;
            if (r1 != null) {
                r1.A04(C72453Mb.A07(AnonymousClass000.A1a(list) ? 1 : 0));
            }
            C28931bI r12 = callConfirmationSheet.A04;
            if (r12 != null) {
                if (!AnonymousClass000.A1a(list)) {
                    i2 = 8;
                }
                r12.A04(i2);
            }
            AnonymousClass00H r0 = callConfirmationSheet.A06;
            if (r0 != null) {
                C41251w3 r5 = (C41251w3) r0.get();
                float f = 180.0f;
                if (list.size() == r5.A0Q() || r6.A01) {
                    WaImageView waImageView = callConfirmationSheet.A00;
                    if (waImageView != null) {
                        if (!AnonymousClass000.A1a(list)) {
                            f = 0.0f;
                        }
                        waImageView.setRotation(f);
                    }
                    r5.A0W(list);
                } else {
                    WaImageView waImageView2 = callConfirmationSheet.A00;
                    if (!(waImageView2 == null || (animate = waImageView2.animate()) == null)) {
                        if (!AnonymousClass000.A1a(list)) {
                            f = 0.0f;
                        }
                        animate.rotation(f);
                    }
                    r5.A0V(new C21446AkD(callConfirmationSheet, 48), list);
                }
                return C27621Wu.A00;
            }
            AnonymousClass3MW.A1B();
            throw null;
        }
        AnonymousClass4MD r15 = (AnonymousClass4MD) obj;
        C106715Wx r62 = (C106715Wx) obj4;
        MinimizedCallBannerViewModel minimizedCallBannerViewModel = (MinimizedCallBannerViewModel) this.receiver;
        if (r15 == null || !(r62 instanceof C93284ij)) {
            return r62;
        }
        C93284ij r3 = (C93284ij) r62;
        if (!(r3.A03 instanceof C93274ii)) {
            return r62;
        }
        AnonymousClass4XH r52 = (AnonymousClass4XH) ((MinimizedCallBannerUseCase) minimizedCallBannerViewModel.A04.get()).A0A.get();
        AnonymousClass4OM r4 = r52.A00;
        if (r4 != null) {
            int A0H = C200410p.A0H(r15.A01, r4.A02.A0A);
            int[] iArr = r15.A00;
            if (A0H < 0 || A0H >= iArr.length) {
                i = 0;
            } else {
                i = iArr[A0H];
            }
            r4.A00 = (float) i;
        } else {
            r4 = null;
        }
        return new C93284ij(r3.A02, r3.A00, r3.A01, AnonymousClass4XH.A00(r4, r52), r3.A04, r3.A05, r3.A06);
    }
}
