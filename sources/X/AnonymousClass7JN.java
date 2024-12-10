package X;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Handler;
import android.view.View;
import com.whatsapp.mediacomposer.MediaComposerActivity;
import com.whatsapp.mediacomposer.bottombar.BottomBarView;
import com.whatsapp.mediacomposer.bottombar.filterswipe.FilterSwipeView;
import com.whatsapp.mediacomposer.ui.caption.CaptionFragment;
import com.whatsapp.mediacomposer.ui.caption.CaptionView;
import com.whatsapp.mediacomposer.viewmodel.MediaJidViewModel;
import com.whatsapp.mediacomposer.viewmodel.MediaViewOnceViewModel;
import com.whatsapp.status.privacy.StatusPrivacyBottomSheetDialogFragment;

/* renamed from: X.7JN  reason: invalid class name */
public final class AnonymousClass7JN implements C108515bp, AnonymousClass87N, B8E, B8G {
    public AnonymousClass898 A00;
    public AnonymousClass85E A01;
    public boolean A02 = false;
    public final C19830z4 A03;
    public final C18000vb A04;
    public final C18030ve A05;
    public final AnonymousClass7JS A06;
    public final BottomBarView A07;
    public final C127436eM A08;
    public final AnonymousClass8AQ A09;
    public final C135286rx A0A;
    public final AnonymousClass7J3 A0B;
    public final CaptionFragment A0C;
    public final AnonymousClass11P A0D;
    public final MediaViewOnceViewModel A0E;

    public /* synthetic */ void onDismiss() {
    }

    public static CaptionView A00(MediaComposerActivity mediaComposerActivity) {
        return mediaComposerActivity.A0a.A0C.A26();
    }

    public static void A01(MediaComposerActivity mediaComposerActivity) {
        mediaComposerActivity.A0a.A0B.A09.notifyDataSetChanged();
    }

    public static void A02(AnonymousClass7JN r2) {
        C18030ve r1 = r2.A05;
        C18070vi.A0d(r1, 0);
        if (C25291Nq.A04(r1, 11620)) {
            r2.A07.A05.A04(8);
        }
    }

    public void A03() {
        if (this.A06.A0G()) {
            AnonymousClass7J3 r2 = this.A0B;
            C108985cd.A0G(r2.A05).withStartAction(C108945cZ.A0X(r2, 4));
        }
        BottomBarView bottomBarView = this.A07;
        C108985cd.A0G(bottomBarView).withStartAction(new AnonymousClass7RA((Object) bottomBarView, 49));
    }

    public void A04() {
        if (this.A06.A0G()) {
            AnonymousClass7J3 r2 = this.A0B;
            C108985cd.A0F(r2.A05).withEndAction(C108945cZ.A0X(r2, 3));
        }
        BottomBarView bottomBarView = this.A07;
        C108985cd.A0F(bottomBarView).withEndAction(C108945cZ.A0X(bottomBarView, 0));
    }

    public void A05() {
        FilterSwipeView filterSwipeView = this.A08.A01;
        filterSwipeView.A00.clearAnimation();
        filterSwipeView.setFilterSwipeTextVisibility(8);
    }

    public void A06(CharSequence charSequence) {
        String str;
        CaptionFragment captionFragment = this.A0C;
        if (charSequence == null || charSequence.length() == 0) {
            CaptionView A26 = captionFragment.A26();
            A26.setCaptionText((CharSequence) null);
            AnonymousClass3MY.A0w(A26.getContext(), A26, 2131886466);
            return;
        }
        AnonymousClass11C r3 = captionFragment.A00;
        if (r3 != null) {
            C18010vc r2 = captionFragment.A02;
            if (r2 != null) {
                CharSequence A0D2 = C26302CxJ.A0D(r3, r2, charSequence, captionFragment.A26().A0B.getCurrentTextColor(), true);
                Context context = captionFragment.A26().getContext();
                Paint captionPaint = captionFragment.A26().getCaptionPaint();
                AnonymousClass1KW r0 = captionFragment.A01;
                if (r0 != null) {
                    CharSequence A032 = C43251zV.A03(context, captionPaint, r0, A0D2);
                    CaptionView A262 = captionFragment.A26();
                    A262.setCaptionText(A032);
                    A262.setContentDescription(charSequence);
                    return;
                }
                str = "emojiLoader";
            } else {
                str = "sharedPreferencesFactory";
            }
        } else {
            str = "systemServices";
        }
        C18070vi.A11(str);
        throw null;
    }

    public void A07(boolean z) {
        if (z) {
            AnonymousClass7J3 r2 = this.A0B;
            C108985cd.A0G(r2.A05).withStartAction(C108945cZ.A0X(r2, 4));
        }
        BottomBarView bottomBarView = this.A07;
        C108985cd.A0G(bottomBarView).withStartAction(new AnonymousClass7RA((Object) bottomBarView, 49));
    }

    public void A08(boolean z) {
        if (z) {
            AnonymousClass7J3 r2 = this.A0B;
            C108985cd.A0F(r2.A05).withEndAction(C108945cZ.A0X(r2, 3));
        }
        BottomBarView bottomBarView = this.A07;
        C108985cd.A0F(bottomBarView).withEndAction(C108945cZ.A0X(bottomBarView, 0));
    }

    public void A09(boolean z) {
        this.A0A.A01.setClickable(z);
        CaptionView A26 = this.A0C.A26();
        A26.setClickable(z);
        A26.setAddButtonClickable(z);
        A26.setViewOnceButtonClickable(z);
    }

    public void A0A(boolean z) {
        this.A07.setVisibility(0);
        AnonymousClass7J3 r0 = this.A0B;
        r0.A05.setVisibility(C72453Mb.A07(z ? 1 : 0));
    }

    public void A0B(boolean z, boolean z2) {
        BottomBarView bottomBarView = this.A07;
        View findViewById = bottomBarView.findViewById(2131428837);
        if (!z || z2) {
            C137286vD.A01(findViewById, this.A04);
        } else {
            C137286vD.A00(findViewById, this.A04);
        }
        C135286rx r0 = this.A0A;
        bottomBarView.getAbProps();
        r0.A02(z, z2);
    }

    public void Bkz() {
        this.A00.Bkz();
    }

    public void Bns() {
        AnonymousClass898 r0 = this.A00;
        if (r0 != null) {
            MediaComposerActivity.A12((MediaComposerActivity) r0);
        }
    }

    public void C2i(boolean z) {
        AnonymousClass898 r4 = this.A00;
        if (r4 != null) {
            MediaComposerActivity mediaComposerActivity = (MediaComposerActivity) r4;
            AnonymousClass8AQ r0 = mediaComposerActivity.A0c;
            if (r0 == null || r0.isEnabled()) {
                C108965cb.A0f(mediaComposerActivity).A02(C17880vN.A0k(), 1, mediaComposerActivity.A0X.A06());
                mediaComposerActivity.A1U = true;
                if (MediaComposerActivity.A1G(mediaComposerActivity)) {
                    if (C18020vd.A05(C18040vf.A02, mediaComposerActivity.A0E, 6132)) {
                        if (C108975cc.A1H(mediaComposerActivity.A1D)) {
                            MediaComposerActivity.A11(mediaComposerActivity);
                            return;
                        }
                        mediaComposerActivity.A1U = z;
                        StatusPrivacyBottomSheetDialogFragment A002 = C124126Xd.A00("media_composer", AnonymousClass3Ma.A1Z(AnonymousClass72B.A01(mediaComposerActivity.A0w), AnonymousClass6R1.DISABLED));
                        A002.A08 = mediaComposerActivity;
                        C108945cZ.A0u(mediaComposerActivity.A1C).A04(A002.A15(), mediaComposerActivity.A0X.A0B());
                        mediaComposerActivity.CMl(A002);
                        Dialog dialog = A002.A03;
                        if (dialog != null) {
                            C17960vV.A07(dialog);
                            dialog.setOnDismissListener(new AnonymousClass759(mediaComposerActivity, 4));
                            return;
                        }
                        return;
                    }
                }
                MediaComposerActivity.A1E(mediaComposerActivity, z);
            }
        }
    }

    public void C54() {
        MediaComposerActivity mediaComposerActivity = (MediaComposerActivity) this.A00;
        if (!C108975cc.A1H(mediaComposerActivity.A1D) || mediaComposerActivity.A1t.get() != C122506Qq.GONE || C72453Mb.A1a(MediaJidViewModel.A03(mediaComposerActivity).A0H)) {
            C72463Mc.A1F(C108965cb.A0f(mediaComposerActivity), 46, mediaComposerActivity.A0X.A06());
            AnonymousClass7JS.A05(mediaComposerActivity);
            mediaComposerActivity.A4c();
            return;
        }
        MediaComposerActivity.A11(mediaComposerActivity);
    }

    public void C6h() {
        AnonymousClass898 r0 = this.A00;
        if (r0 != null) {
            r0.C6h();
        }
        this.A07.setStatusMentionsToolTipVisible(false);
    }

    public void C8c(int i) {
        Uri A0A2;
        MediaComposerActivity mediaComposerActivity = (MediaComposerActivity) this.A01;
        if (C138766xe.A00(mediaComposerActivity.A0h)) {
            C108955ca.A1Q(C108965cb.A0f(mediaComposerActivity), 67, 1, mediaComposerActivity.A0X.A06());
            C116345x6 r0 = mediaComposerActivity.A0Z;
            if (r0 != null) {
                mediaComposerActivity.A0S.A0J(C116345x6.A00(r0, i), false);
            }
        } else if (mediaComposerActivity.A1V || mediaComposerActivity.A0X.A07() != i) {
            C108955ca.A1Q(C108965cb.A0f(mediaComposerActivity), 32, 1, mediaComposerActivity.A0X.A06());
            mediaComposerActivity.A1V = false;
            mediaComposerActivity.A1W = true;
            C116345x6 r02 = mediaComposerActivity.A0Z;
            if (r02 != null) {
                mediaComposerActivity.A0S.setCurrentItem(C116345x6.A00(r02, i));
            }
            C112155l1 r03 = mediaComposerActivity.A0a.A0B.A09;
            r03.A00 = false;
            r03.notifyDataSetChanged();
            Handler handler = mediaComposerActivity.A1o;
            handler.removeCallbacksAndMessages((Object) null);
            AnonymousClass7RA r2 = new AnonymousClass7RA((Object) mediaComposerActivity, 47);
            mediaComposerActivity.A1N = r2;
            handler.postDelayed(r2, 500);
        } else {
            C108955ca.A1Q(C108965cb.A0f(mediaComposerActivity), 40, 1, mediaComposerActivity.A0X.A06());
            if (mediaComposerActivity.A1N == null && (A0A2 = mediaComposerActivity.A0X.A0A()) != null) {
                MediaComposerActivity.A0u(A0A2, mediaComposerActivity);
            }
        }
    }

    public void CAB() {
        this.A0E.A0U();
    }

    public void onCaptionLayoutClicked(View view) {
        MediaComposerActivity mediaComposerActivity = (MediaComposerActivity) this.A00;
        C72463Mc.A1F(C108965cb.A0f(mediaComposerActivity), 10, mediaComposerActivity.A0X.A06());
        MediaComposerActivity.A13(mediaComposerActivity);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0062, code lost:
        if (r10.A0M == false) goto L_0x0064;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass7JN(X.AnonymousClass11P r6, X.C19830z4 r7, X.C18000vb r8, X.C18030ve r9, X.AnonymousClass7JS r10, com.whatsapp.mediacomposer.bottombar.BottomBarView r11, X.C127436eM r12, X.AnonymousClass8AQ r13, X.C135286rx r14, X.AnonymousClass7J3 r15, com.whatsapp.mediacomposer.ui.caption.CaptionFragment r16, com.whatsapp.mediacomposer.viewmodel.MediaViewOnceViewModel r17, X.C131126kY r18) {
        /*
            r5 = this;
            r5.<init>()
            r0 = 0
            r5.A02 = r0
            r5.A05 = r9
            r5.A07 = r11
            r5.A06 = r10
            r2 = r16
            r5.A0C = r2
            r5.A09 = r13
            r5.A08 = r12
            r5.A0B = r15
            r5.A0A = r14
            r5.A03 = r7
            r5.A0D = r6
            r0 = r17
            r5.A0E = r0
            r5.A04 = r8
            r4 = r18
            java.util.List r3 = r4.A06
            X.77K r1 = r10.A0B()
            r0 = 1
            r13.CKJ(r1, r3, r0)
            boolean r0 = r10.A0J()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A2A(r0)
            int r0 = r10.A08()
            r11.getAbProps()
            r3 = 0
            r14.A01(r0)
            androidx.recyclerview.widget.RecyclerView r2 = r15.A05
            X.0vb r1 = r15.A06
            X.5lc r0 = new X.5lc
            r0.<init>(r1)
            r2.A0r(r0)
            android.content.Context r0 = r15.A04
            X.C72463Mc.A0z(r0, r2, r3)
            X.0vl r0 = r4.A0C
            boolean r2 = X.C72453Mb.A1a(r0)
            boolean r0 = r10.A0J
            if (r0 == 0) goto L_0x0064
            boolean r1 = r10.A0M
            r0 = 1
            if (r1 != 0) goto L_0x0065
        L_0x0064:
            r0 = 0
        L_0x0065:
            r5.A0B(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7JN.<init>(X.11P, X.0z4, X.0vb, X.0ve, X.7JS, com.whatsapp.mediacomposer.bottombar.BottomBarView, X.6eM, X.8AQ, X.6rx, X.7J3, com.whatsapp.mediacomposer.ui.caption.CaptionFragment, com.whatsapp.mediacomposer.viewmodel.MediaViewOnceViewModel, X.6kY):void");
    }
}
