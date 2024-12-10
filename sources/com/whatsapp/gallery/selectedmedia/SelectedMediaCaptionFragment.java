package com.whatsapp.gallery.selectedmedia;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass01E;
import X.AnonymousClass02V;
import X.AnonymousClass1BI;
import X.AnonymousClass1DF;
import X.AnonymousClass1DT;
import X.AnonymousClass1FL;
import X.AnonymousClass1GP;
import X.AnonymousClass20F;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass3NL;
import X.AnonymousClass3SU;
import X.AnonymousClass3Vl;
import X.AnonymousClass3XV;
import X.AnonymousClass5ST;
import X.AnonymousClass5SU;
import X.AnonymousClass74J;
import X.C102645Hg;
import X.C102665Hi;
import X.C102675Hj;
import X.C102685Hk;
import X.C102695Hl;
import X.C104225Ni;
import X.C104235Nj;
import X.C106915Xr;
import X.C108515bp;
import X.C117275zV;
import X.C18000vb;
import X.C18070vi;
import X.C18100vl;
import X.C19830z4;
import X.C22791Df;
import X.C22931Dv;
import X.C28931bI;
import X.C72453Mb;
import X.C72463Mc;
import X.C73173Rg;
import X.C84084Hu;
import X.C89944dH;
import X.C90334du;
import X.C91494fm;
import X.C91604fx;
import X.C91644g1;
import X.C92094gk;
import X.C96804oR;
import X.C96824oT;
import X.C99274sY;
import android.animation.LayoutTransition;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.LockableCoodinatorLayout;
import com.whatsapp.WaImageButton;
import com.whatsapp.WaTextView;
import com.whatsapp.emoji.search.EmojiSearchKeyboardContainer;
import com.whatsapp.gallery.GalleryTabHostFragment;
import com.whatsapp.gallery.viewmodel.GalleryTabsViewModel;
import com.whatsapp.mediacomposer.ui.caption.CaptionFragment;
import com.whatsapp.mediacomposer.viewmodel.MediaJidViewModel;
import com.whatsapp.mediacomposer.viewmodel.MediaViewOnceViewModel;
import com.whatsapp.mentions.MentionableEntry;
import java.util.Iterator;
import java.util.List;

public final class SelectedMediaCaptionFragment extends Hilt_SelectedMediaCaptionFragment {
    public WaImageButton A00;
    public WaTextView A01;
    public C18000vb A02;
    public C108515bp A03;
    public C28931bI A04;
    public AnonymousClass00H A05;
    public AnonymousClass00H A06;
    public AnonymousClass00H A07;
    public boolean A08;
    public final C73173Rg A09 = new C73173Rg(this, 5);
    public final C18100vl A0A;
    public final C18100vl A0B;
    public final C18100vl A0C = AnonymousClass1DF.A01(new C102645Hg(this));

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        WaTextView A0U = AnonymousClass3MW.A0U(view, 2131435172);
        this.A01 = A0U;
        if (A0U != null) {
            A0U.setText(String.valueOf(((GalleryTabsViewModel) this.A06.getValue()).A0T().size()));
        }
        this.A00 = (WaImageButton) view.findViewById(2131435171);
        this.A04 = C72453Mb.A0s(view, 2131434180);
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            C18000vb r1 = this.A02;
            if (r1 != null) {
                recyclerView.A0r(new AnonymousClass3XV(r1));
                C18000vb r12 = this.A02;
                if (r12 != null) {
                    recyclerView.setItemAnimator(new AnonymousClass3Vl(r12));
                }
            }
            AnonymousClass3MW.A1M();
            throw null;
        }
        C18100vl r4 = this.A06;
        C22791Df.A00(((GalleryTabsViewModel) r4.getValue()).A06).A0A(A1G(), new C91604fx(this, 17));
        C91644g1.A00(A1G(), ((GalleryTabsViewModel) r4.getValue()).A05, new AnonymousClass5ST(this), 33);
        A01(this);
    }

    public static final void A01(SelectedMediaCaptionFragment selectedMediaCaptionFragment) {
        WaImageButton waImageButton;
        View view = selectedMediaCaptionFragment.A0B;
        if (view == null || (waImageButton = (WaImageButton) view.findViewById(2131435171)) == null) {
            waImageButton = null;
        } else {
            C18000vb r2 = selectedMediaCaptionFragment.A02;
            if (r2 != null) {
                AnonymousClass3NL.A01(waImageButton.getContext(), waImageButton, r2, 2131232506);
                C84084Hu.A00(waImageButton, new AnonymousClass5SU(selectedMediaCaptionFragment));
            } else {
                AnonymousClass3MW.A1M();
                throw null;
            }
        }
        selectedMediaCaptionFragment.A00 = waImageButton;
    }

    public final void A26() {
        String str;
        CaptionFragment captionFragment;
        GalleryTabsViewModel galleryTabsViewModel = (GalleryTabsViewModel) this.A06.getValue();
        Fragment A0O = A1E().A0O(2131428837);
        if (!(A0O instanceof CaptionFragment) || (captionFragment = (CaptionFragment) A0O) == null) {
            str = null;
        } else {
            str = captionFragment.A26().getCaptionStringText();
        }
        AnonymousClass1DT r0 = galleryTabsViewModel.A03;
        if (str == null) {
            str = "";
        }
        r0.A0F(str);
    }

    public SelectedMediaCaptionFragment() {
        super(2131625439);
        this.A00 = false;
        AnonymousClass20F A15 = AnonymousClass3MW.A15(MediaJidViewModel.class);
        this.A0A = C99274sY.A00(new C102665Hi(this), new C102675Hj(this), new C104225Ni(this), A15);
        AnonymousClass20F A152 = AnonymousClass3MW.A15(MediaViewOnceViewModel.class);
        this.A0B = C99274sY.A00(new C102685Hk(this), new C102695Hl(this), new C104235Nj(this), A152);
    }

    public static final void A00(SelectedMediaCaptionFragment selectedMediaCaptionFragment) {
        boolean z;
        AnonymousClass74J A0d = C72463Mc.A0d(selectedMediaCaptionFragment);
        EmojiSearchKeyboardContainer emojiSearchKeyboardContainer = A0d.A0A;
        if (emojiSearchKeyboardContainer == null || emojiSearchKeyboardContainer.getVisibility() != 0) {
            z = false;
        } else {
            z = true;
            EmojiSearchKeyboardContainer emojiSearchKeyboardContainer2 = A0d.A0A;
            if (emojiSearchKeyboardContainer2 != null) {
                emojiSearchKeyboardContainer2.A03();
            }
        }
        if (!z) {
            if (C72463Mc.A0d(selectedMediaCaptionFragment).A0U()) {
                C72463Mc.A0d(selectedMediaCaptionFragment).A0D();
            } else {
                return;
            }
        }
        selectedMediaCaptionFragment.A09.A06(false);
    }

    public void A1v() {
        CaptionFragment captionFragment;
        AnonymousClass1GP supportFragmentManager;
        List A042;
        Object obj;
        LockableCoodinatorLayout lockableCoodinatorLayout;
        C106915Xr r3;
        super.A1v();
        Fragment A0O = A1E().A0O(2131428837);
        if ((A0O instanceof CaptionFragment) && (captionFragment = (CaptionFragment) A0O) != null) {
            GalleryTabHostFragment galleryTabHostFragment = null;
            captionFragment.A26().setLayoutTransition((LayoutTransition) null);
            captionFragment.A2A(AnonymousClass000.A0h());
            captionFragment.A28();
            C18100vl r4 = this.A0B;
            if (((MediaViewOnceViewModel) r4.getValue()).A0T() == -1) {
                ((MediaViewOnceViewModel) r4.getValue()).A0V();
            }
            C22791Df.A00(((MediaViewOnceViewModel) r4.getValue()).A00).A0A(captionFragment.A1G(), new C91494fm(this, captionFragment, 19));
            C96804oR r42 = new C96804oR(this, captionFragment);
            captionFragment.A29(r42);
            captionFragment.A26().A03 = r42;
            MentionableEntry mentionableEntry = captionFragment.A26().A0B;
            AnonymousClass3Ma.A1D(mentionableEntry, r42, 11);
            C90334du.A00(mentionableEntry, r42, 21);
            this.A03 = r42;
            if (C72463Mc.A0d(this).A0E == null) {
                View A17 = A17();
                View A052 = C18070vi.A05(A17, 2131430314);
                KeyboardPopupLayout keyboardPopupLayout = (KeyboardPopupLayout) C18070vi.A05(A17, 2131430312);
                keyboardPopupLayout.A0A = true;
                C72463Mc.A0d(this).A0L(A1D(), A1D(), A052, captionFragment.A25(), (CoordinatorLayout) null, keyboardPopupLayout, captionFragment.A26().A0B, (EmojiSearchKeyboardContainer) C28931bI.A00(A17, 2131430335).A02(), (AnonymousClass3SU) null, false);
                AnonymousClass74J A0d = C72463Mc.A0d(this);
                AnonymousClass00H r2 = this.A07;
                if (r2 != null) {
                    A0d.A0M(A1E(), ((C19830z4) r2.get()).A08());
                    C72463Mc.A0d(this).A0N(new C92094gk(captionFragment, 7));
                    AnonymousClass02V BVe = A1D().BVe();
                    C73173Rg r22 = this.A09;
                    C18070vi.A0d(r22, 0);
                    BVe.A06(r22);
                    AnonymousClass00H r23 = this.A05;
                    if (r23 != null) {
                        C117275zV r43 = (C117275zV) r23.get();
                        AnonymousClass1FL A1B = captionFragment.A1B();
                        if (!(A1B instanceof C106915Xr) || (r3 = (C106915Xr) A1B) == null) {
                            lockableCoodinatorLayout = null;
                        } else {
                            lockableCoodinatorLayout = (LockableCoodinatorLayout) AnonymousClass3MY.A0H((AnonymousClass01E) r3, 2131434744);
                        }
                        r43.A00 = lockableCoodinatorLayout;
                    } else {
                        C18070vi.A11("expressionsTrayController");
                        throw null;
                    }
                } else {
                    C18070vi.A11("waSharedPreferences");
                    throw null;
                }
            }
            C89944dH.A00(captionFragment.A25(), this, 31);
            AnonymousClass1FL A1B2 = captionFragment.A1B();
            if (A1B2 != null && (supportFragmentManager = A1B2.getSupportFragmentManager()) != null && (A042 = supportFragmentManager.A0U.A04()) != null) {
                Iterator it = A042.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (obj instanceof GalleryTabHostFragment) {
                        break;
                    }
                }
                if (obj instanceof GalleryTabHostFragment) {
                    galleryTabHostFragment = obj;
                }
                GalleryTabHostFragment galleryTabHostFragment2 = galleryTabHostFragment;
                if (galleryTabHostFragment2 != null) {
                    ViewGroup A0D = AnonymousClass3MW.A0D(galleryTabHostFragment2.A17(), 2131432483);
                    View A0C2 = AnonymousClass3MX.A0C(galleryTabHostFragment2.A17(), 2131431072);
                    C22931Dv r24 = AnonymousClass1BI.A00;
                    AnonymousClass1BI A012 = C22931Dv.A01(GalleryTabHostFragment.A0B(galleryTabHostFragment2));
                    C18100vl r5 = galleryTabHostFragment2.A0o;
                    String str = (String) ((GalleryTabsViewModel) r5.getValue()).A03.A06();
                    if (str == null) {
                        str = "";
                    }
                    List list = ((GalleryTabsViewModel) r5.getValue()).A02;
                    MentionableEntry mentionableEntry2 = captionFragment.A26().A0B;
                    if (mentionableEntry2.A0O(A012)) {
                        mentionableEntry2.A0M(A0D, A012, false, true, true, false);
                        mentionableEntry2.A0C = new C96824oT(galleryTabHostFragment2, mentionableEntry2);
                        mentionableEntry2.A04 = A0C2;
                        mentionableEntry2.A05 = A0C2;
                        mentionableEntry2.setMentionableText(str, list);
                        mentionableEntry2.setSelection(mentionableEntry2.getSelectionEnd());
                    }
                }
            }
        }
    }
}
