package com.whatsapp.gallery;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass11P;
import X.AnonymousClass1DC;
import X.AnonymousClass1DF;
import X.AnonymousClass1KB;
import X.AnonymousClass1Q5;
import X.AnonymousClass1ZT;
import X.AnonymousClass1b2;
import X.AnonymousClass20F;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass4a6;
import X.AnonymousClass65B;
import X.AnonymousClass72S;
import X.AnonymousClass73D;
import X.AnonymousClass7AT;
import X.AnonymousClass7DY;
import X.AnonymousClass8AA;
import X.AnonymousClass8B2;
import X.C108945cZ;
import X.C108955ca;
import X.C108975cc;
import X.C108985cd;
import X.C108995ce;
import X.C109005cf;
import X.C112775m1;
import X.C139226yS;
import X.C1422678u;
import X.C147047Rp;
import X.C150737lA;
import X.C150747lB;
import X.C150757lC;
import X.C150767lD;
import X.C150777lE;
import X.C150787lF;
import X.C150797lG;
import X.C150807lH;
import X.C155927tX;
import X.C155937tY;
import X.C155947tZ;
import X.C158187zs;
import X.C1590583b;
import X.C1606389i;
import X.C160878Ah;
import X.C17880vN;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C18100vl;
import X.C20050A4v;
import X.C23401Fx;
import X.C27354DcQ;
import X.C29431cG;
import X.C37961qT;
import X.C72453Mb;
import X.C72463Mc;
import X.C73203Rj;
import X.C83724Gk;
import X.C99274sY;
import X.C99434so;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.gallery.viewmodel.GalleryTabsViewModel;
import com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel;
import com.whatsapp.media.WamediaManager;
import com.whatsapp.mediacomposer.viewmodel.MediaViewOnceViewModel;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class GalleryRecentsFragment extends Hilt_GalleryRecentsFragment implements AnonymousClass8AA, C1606389i {
    public AnonymousClass7DY A00;
    public AnonymousClass11P A01;
    public GalleryTabHostFragment A02;
    public C112775m1 A03;
    public WamediaManager A04;
    public AnonymousClass1Q5 A05;
    public AnonymousClass1DC A06;
    public AnonymousClass00H A07;
    public AnonymousClass00H A08;
    public AnonymousClass00H A09;
    public boolean A0A;
    public boolean A0B;
    public final List A0C = AnonymousClass000.A13();
    public final Map A0D = C17880vN.A13();
    public final C18100vl A0E;
    public final C18100vl A0F;
    public final C18100vl A0G;
    public final C18100vl A0H;
    public final C18100vl A0I;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return AnonymousClass3MX.A0B(layoutInflater, viewGroup, 2131625431, false);
    }

    public void A20(Bundle bundle) {
        C18070vi.A0d(bundle, 0);
        super.A20(bundle);
        bundle.putBoolean("multi_select_enabled", this.A0A);
    }

    public void A21(Bundle bundle, View view) {
        RecyclerView recyclerView;
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        RecyclerView recyclerView2 = this.A07;
        if (recyclerView2 != null) {
            C72463Mc.A0v(view.getContext(), view.getContext(), recyclerView2, 2130970490, 2131101850);
        }
        RecyclerView recyclerView3 = this.A07;
        if (recyclerView3 != null) {
            C1422678u.A00(recyclerView3, this, 14);
        }
        Bundle bundle2 = this.A06;
        boolean z = false;
        if (bundle2 != null) {
            z = bundle2.getBoolean("picker_redesign", false);
        }
        if (z) {
            RecyclerView recyclerView4 = this.A07;
            if (recyclerView4 != null) {
                recyclerView4.setItemAnimator((C37961qT) null);
            }
            AnonymousClass7AT.A01(A1G(), ((GalleryPickerViewModel) this.A0E.getValue()).A08, new C158187zs(this), 31);
        } else if (C72453Mb.A1a(this.A0f) && (recyclerView = this.A07) != null) {
            recyclerView.setItemAnimator((C37961qT) null);
        }
        CDn();
        C112775m1 r1 = new C112775m1(A27(), this);
        this.A03 = r1;
        RecyclerView recyclerView5 = this.A07;
        if (recyclerView5 != null) {
            recyclerView5.A12.add(r1);
        }
        if (bundle != null && bundle.containsKey("multi_select_enabled")) {
            boolean z2 = bundle.getBoolean("multi_select_enabled");
            if (!z2 && z2 != this.A0A) {
                this.A0D.clear();
            }
            this.A0A = z2;
        }
    }

    public void BwD(AnonymousClass8B2 r5, AnonymousClass65B r6) {
        Integer A002 = GalleryPickerViewModel.A00(this.A0E);
        if (A002 != null) {
            int intValue = A002.intValue();
            AnonymousClass00H r0 = this.A08;
            if (r0 != null) {
                C108955ca.A1Q((C20050A4v) r0.get(), C109005cf.A04(r5), 1, intValue);
            } else {
                C18070vi.A11("mediaSharingUserJourneyLogger");
                throw null;
            }
        }
        if (r6.A0A() || !C72453Mb.A1a(this.A0H)) {
            Bundle bundle = this.A06;
            if (bundle != null && bundle.getBoolean("picker_redesign", false) && this.A0D.size() == 1 && !C108945cZ.A0g(this.A0F).A0T().contains(r5) && C108945cZ.A0l(this.A0I).A0T() == 3) {
                C73203Rj A032 = AnonymousClass4a6.A03(this);
                A032.A0E(2131897904);
                A032.A0D(2131897905);
                C73203Rj.A06(A032);
                AnonymousClass3MY.A1G(A032);
            } else if (Bf1()) {
                A03(this, r5);
            } else {
                Bundle bundle2 = this.A06;
                if (bundle2 == null || !bundle2.getBoolean("is_send_as_document", false)) {
                    this.A0D.put(r5.BLl(), r5);
                }
                GalleryTabHostFragment galleryTabHostFragment = this.A02;
                if (galleryTabHostFragment != null) {
                    galleryTabHostFragment.A28(C18070vi.A0M(r5));
                }
            }
        }
    }

    public boolean BwJ(AnonymousClass8B2 r6, AnonymousClass65B r7) {
        GalleryTabHostFragment galleryTabHostFragment;
        Integer A002 = GalleryPickerViewModel.A00(this.A0E);
        if (A002 != null) {
            int intValue = A002.intValue();
            AnonymousClass00H r0 = this.A08;
            if (r0 != null) {
                ((C20050A4v) r0.get()).A02(Integer.valueOf(C109005cf.A04(r6)), 4, intValue);
            } else {
                C18070vi.A11("mediaSharingUserJourneyLogger");
                throw null;
            }
        }
        Boolean bool = null;
        if (!r7.A0A() && C72453Mb.A1a(this.A0H)) {
            return true;
        }
        if (!C108985cd.A1W(this, r6) && this.A03 != null && this.A0D.size() < A00() && (galleryTabHostFragment = this.A02) != null && galleryTabHostFragment.A2A()) {
            AnonymousClass3MY.A1L(C108945cZ.A0g(this.A0F).A04, true);
            C112775m1 r1 = this.A03;
            if (!(r1 == null || this.A07 == null)) {
                int A012 = RecyclerView.A01(r7);
                r1.A04 = true;
                r1.A03 = A012;
                r1.A00 = C108945cZ.A06(r7);
            }
        }
        GalleryTabHostFragment galleryTabHostFragment2 = this.A02;
        if (galleryTabHostFragment2 != null) {
            bool = Boolean.valueOf(galleryTabHostFragment2.A2A());
        }
        if (C18070vi.A19(bool, true)) {
            return A03(this, r6);
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0060, code lost:
        if (X.C18070vi.A18(X.C108965cb.A0P(r6).A0T(), X.C29431cG.A0v(r5, r5.size() - 1)) == false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00cc, code lost:
        if (com.whatsapp.gallery.GalleryTabHostFragment.A0p(r6) != false) goto L_0x00ce;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(com.whatsapp.gallery.GalleryRecentsFragment r11) {
        /*
            com.whatsapp.gallery.GalleryTabHostFragment r6 = r11.A02
            if (r6 == 0) goto L_0x009e
            java.util.Map r0 = r11.A0D
            java.util.Collection r0 = r0.values()
            java.util.List r0 = X.C29431cG.A0q(r0)
            java.util.Set r5 = X.C29431cG.A12(r0)
            r10 = 0
            boolean r0 = com.whatsapp.gallery.GalleryTabHostFragment.A0q(r6)
            r4 = 1
            if (r0 != 0) goto L_0x00c1
            androidx.appcompat.widget.Toolbar r9 = r6.A02
            if (r9 == 0) goto L_0x0043
            boolean r0 = X.C108945cZ.A1U(r5)
            if (r0 != r4) goto L_0x00ad
            com.whatsapp.gallery.GalleryTabHostFragment.A0i(r6, r4)
            X.0vb r8 = r6.A0C
            if (r8 == 0) goto L_0x0135
            r7 = 2131755262(0x7f1000fe, float:1.9141398E38)
            int r0 = r5.size()
            long r0 = (long) r0
            java.lang.Object[] r3 = new java.lang.Object[r4]
            int r2 = r5.size()
            X.C17880vN.A1T(r3, r2, r10)
            java.lang.String r0 = r8.A0K(r3, r7, r0)
        L_0x0040:
            r9.setTitle((java.lang.CharSequence) r0)
        L_0x0043:
            r2 = 0
            boolean r0 = X.C108945cZ.A1U(r5)
            if (r0 == 0) goto L_0x0062
            com.whatsapp.gallery.viewmodel.GalleryTabsViewModel r0 = X.C108965cb.A0P(r6)
            java.util.Set r1 = r0.A0T()
            int r0 = r5.size()
            int r0 = r0 - r4
            java.util.List r0 = X.C29431cG.A0v(r5, r0)
            boolean r0 = X.C18070vi.A18(r1, r0)
            r1 = 1
            if (r0 != 0) goto L_0x0063
        L_0x0062:
            r1 = 0
        L_0x0063:
            X.0vl r0 = r6.A14
            java.lang.Object r0 = r0.getValue()
            X.5l8 r0 = (X.C112225l8) r0
            r0.A0V(r5)
            com.whatsapp.gallery.viewmodel.GalleryTabsViewModel r0 = X.C108965cb.A0P(r6)
            X.1DT r0 = r0.A06
            r0.A0E(r5)
            if (r1 == 0) goto L_0x0095
            X.7FZ r0 = r6.A0J
            if (r0 == 0) goto L_0x012f
            X.0ve r2 = r0.A00
            r1 = 8882(0x22b2, float:1.2446E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0095
            androidx.recyclerview.widget.RecyclerView r1 = r6.A03
            if (r1 == 0) goto L_0x0095
            int r0 = r5.size()
            int r0 = r0 - r4
            r1.A0f(r0)
        L_0x0095:
            androidx.viewpager2.widget.ViewPager2 r0 = r6.A04
            if (r0 == 0) goto L_0x00ab
            int r0 = r0.A00
        L_0x009b:
            com.whatsapp.gallery.GalleryTabHostFragment.A0J(r6, r0)
        L_0x009e:
            java.util.Map r0 = r11.A0D
            int r0 = r0.size()
            r11.A2D(r0)
            r11.A2B()
            return
        L_0x00ab:
            r0 = 0
            goto L_0x009b
        L_0x00ad:
            boolean r0 = com.whatsapp.gallery.GalleryTabHostFragment.A0p(r6)
            com.whatsapp.gallery.GalleryTabHostFragment.A0i(r6, r0)
            android.os.Bundle r1 = r6.A06
            if (r1 == 0) goto L_0x00bf
            java.lang.String r0 = "gallery_picker_title"
            java.lang.String r0 = r1.getString(r0)
            goto L_0x0040
        L_0x00bf:
            r0 = 0
            goto L_0x0040
        L_0x00c1:
            boolean r0 = X.C108945cZ.A1U(r5)
            if (r0 != 0) goto L_0x00ce
            boolean r1 = com.whatsapp.gallery.GalleryTabHostFragment.A0p(r6)
            r0 = 0
            if (r1 == 0) goto L_0x00cf
        L_0x00ce:
            r0 = 1
        L_0x00cf:
            com.whatsapp.gallery.GalleryTabHostFragment.A0i(r6, r0)
            boolean r0 = X.C108945cZ.A1U(r5)
            if (r0 == 0) goto L_0x0043
            X.0vl r0 = r6.A0w
            java.lang.Object r2 = r0.getValue()
            com.whatsapp.mediacomposer.viewmodel.MediaJidViewModel r2 = (com.whatsapp.mediacomposer.viewmodel.MediaJidViewModel) r2
            X.1Dv r1 = X.AnonymousClass1BI.A00
            java.lang.String r0 = com.whatsapp.gallery.GalleryTabHostFragment.A0B(r6)
            X.1BI r0 = r1.A02(r0)
            if (r0 == 0) goto L_0x012c
            java.util.List r0 = X.C18070vi.A0M(r0)
        L_0x00f0:
            r2.A0U(r0)
            int r0 = r5.size()
            r3 = -1
            if (r0 <= r4) goto L_0x0114
            r2 = 0
        L_0x00fb:
            r5.size()
            X.0vl r1 = r6.A10
            com.whatsapp.mediacomposer.viewmodel.MediaViewOnceViewModel r0 = X.C108945cZ.A0l(r1)
            X.1DT r0 = r0.A00
            X.AnonymousClass3MX.A1J(r0, r2)
            if (r2 != r3) goto L_0x0043
            com.whatsapp.mediacomposer.viewmodel.MediaViewOnceViewModel r0 = X.C108945cZ.A0l(r1)
            r0.A0V()
            goto L_0x0043
        L_0x0114:
            X.0vl r2 = r6.A10
            com.whatsapp.mediacomposer.viewmodel.MediaViewOnceViewModel r0 = X.C108945cZ.A0l(r2)
            int r1 = r0.A0T()
            r0 = 3
            if (r1 == r0) goto L_0x0123
            r2 = -1
            goto L_0x00fb
        L_0x0123:
            com.whatsapp.mediacomposer.viewmodel.MediaViewOnceViewModel r0 = X.C108945cZ.A0l(r2)
            int r2 = r0.A0T()
            goto L_0x00fb
        L_0x012c:
            X.0wS r0 = X.C18460wS.A00
            goto L_0x00f0
        L_0x012f:
            java.lang.String r0 = "mediaTray"
            X.C18070vi.A11(r0)
            throw r2
        L_0x0135:
            X.AnonymousClass3MW.A1M()
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallery.GalleryRecentsFragment.A01(com.whatsapp.gallery.GalleryRecentsFragment):void");
    }

    public static final boolean A02(Uri uri, GalleryRecentsFragment galleryRecentsFragment, String str) {
        Map map = galleryRecentsFragment.A0D;
        if (map.containsKey(uri)) {
            return true;
        }
        Bundle bundle = galleryRecentsFragment.A06;
        if (bundle == null || !bundle.getBoolean("picker_redesign", false)) {
            return false;
        }
        List<AnonymousClass8B2> A0t = C29431cG.A0t(map.values());
        if ((A0t instanceof Collection) && A0t.isEmpty()) {
            return false;
        }
        for (AnonymousClass8B2 r1 : A0t) {
            if (r1 != null && r1.BQD() != null && str != null && C18070vi.A18(r1.BQD(), str)) {
                return true;
            }
        }
        return false;
    }

    public final void A2I(Set set) {
        C160878Ah r5 = this.A0G;
        if (r5 != null) {
            this.A0F.getValue();
            C27354DcQ A012 = AnonymousClass1ZT.A01();
            int count = r5.getCount();
            for (int i = 0; i < count; i++) {
                AnonymousClass8B2 BUY = r5.BUY(i);
                if (BUY != null && set.contains(BUY.BLl())) {
                    A012.add(BUY);
                }
            }
            Iterator it = AnonymousClass1ZT.A02(A012).iterator();
            while (it.hasNext()) {
                AnonymousClass8B2 r2 = (AnonymousClass8B2) it.next();
                this.A0D.put(r2.BLl(), r2);
            }
            A01(this);
        }
    }

    public boolean BeG() {
        Bundle bundle;
        C160878Ah r0;
        Bundle bundle2 = this.A06;
        if (bundle2 != null && bundle2.getBoolean("picker_redesign", false) && (bundle = this.A06) != null && bundle.getBoolean("is_coming_from_chat", false)) {
            C18100vl r2 = this.A0E;
            C139226yS r02 = (C139226yS) GalleryPickerViewModel.A0C(r2);
            if ((r02 != null && r02.A02 == 3) || (GalleryPickerViewModel.A0C(r2) == null && ((r0 = this.A0G) == null || r0.getCount() == 0))) {
                C18030ve A27 = A27();
                AnonymousClass1DC r03 = this.A06;
                if (r03 == null) {
                    C18070vi.A11("systemFeatures");
                    throw null;
                } else if (!C83724Gk.A00(A27, r03)) {
                    return false;
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean Bf1() {
        if (this.A0A || (!this.A0D.isEmpty())) {
            return true;
        }
        return false;
    }

    public boolean BjF() {
        return C108975cc.A1C(this.A0D.size(), A00());
    }

    public void CDn() {
        if (this.A0L.A02.A00(C23401Fx.CREATED)) {
            A2F(false, true);
        }
    }

    public void CMv() {
        Toast toast = this.A06;
        if (toast != null) {
            toast.cancel();
        }
        AnonymousClass1KB A26 = A26();
        Resources A092 = AnonymousClass3MZ.A09(this);
        Object[] A1a = AnonymousClass3MW.A1a();
        AnonymousClass000.A1L(A1a, A00());
        Toast A032 = A26.A03(A092.getString(2131896124, A1a));
        A032.show();
        this.A06 = A032;
    }

    public GalleryRecentsFragment() {
        AnonymousClass20F A15 = AnonymousClass3MW.A15(GalleryTabsViewModel.class);
        this.A0F = C99274sY.A00(new C150757lC(this), new C150767lD(this), new C155927tX(this), A15);
        AnonymousClass20F A152 = AnonymousClass3MW.A15(GalleryPickerViewModel.class);
        this.A0E = C99274sY.A00(new C150777lE(this), new C150787lF(this), new C155937tY(this), A152);
        AnonymousClass20F A153 = AnonymousClass3MW.A15(MediaViewOnceViewModel.class);
        this.A0I = C99274sY.A00(new C150797lG(this), new C150807lH(this), new C155947tZ(this), A153);
        this.A0B = true;
        this.A0H = AnonymousClass1DF.A01(new C150747lB(this));
        this.A0G = AnonymousClass1DF.A01(new C150737lA(this));
    }

    private final int A00() {
        Intent A0D2 = C108995ce.A0D(this);
        if (A0D2 == null || !A0D2.hasExtra("max_items")) {
            return C18020vd.A00(C18040vf.A02, A27(), 2614);
        }
        return A0D2.getIntExtra("max_items", C18020vd.A00(C18040vf.A02, A27(), 2614));
    }

    public static final boolean A03(GalleryRecentsFragment galleryRecentsFragment, AnonymousClass8B2 r9) {
        Bundle bundle;
        String BQD;
        Object obj;
        int A002 = galleryRecentsFragment.A00();
        Map map = galleryRecentsFragment.A0D;
        if (map.size() >= A002) {
            A002 = C108955ca.A0B(galleryRecentsFragment).getIntExtra("max_items", C18020vd.A00(C18040vf.A02, galleryRecentsFragment.A27(), 2693));
        }
        Uri BLl = r9.BLl();
        if (A02(BLl, galleryRecentsFragment, r9.BQD())) {
            if (map.remove(BLl) == null && (bundle = galleryRecentsFragment.A06) != null && bundle.getBoolean("picker_redesign", false) && (BQD = r9.BQD()) != null) {
                Iterator A0o = C29431cG.A0o(map.values());
                while (true) {
                    obj = null;
                    if (!A0o.hasNext()) {
                        break;
                    }
                    obj = A0o.next();
                    AnonymousClass8B2 r1 = (AnonymousClass8B2) obj;
                    if (r1 != null && r1.BQD() != null && C18070vi.A18(r1.BQD(), BQD)) {
                        break;
                    }
                }
                AnonymousClass8B2 r2 = (AnonymousClass8B2) obj;
                if (r2 != null) {
                    map.remove(r2.BLl());
                }
            }
        } else if (map.size() >= A002) {
            Toast toast = galleryRecentsFragment.A06;
            if (toast != null) {
                toast.cancel();
            }
            AnonymousClass1KB A26 = galleryRecentsFragment.A26();
            Resources A092 = AnonymousClass3MZ.A09(galleryRecentsFragment);
            Object[] objArr = new Object[1];
            boolean A1b = C72453Mb.A1b(objArr, A002);
            Toast A032 = A26.A03(A092.getString(2131896124, objArr));
            A032.show();
            galleryRecentsFragment.A06 = A032;
            return A1b;
        } else {
            map.put(BLl, r9);
        }
        A01(galleryRecentsFragment);
        return true;
    }

    public void A1s() {
        super.A1s();
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null) {
            C147047Rp r2 = new C147047Rp(AnonymousClass1b2.A0B(AnonymousClass1b2.A0C(C1590583b.A00, new C99434so(recyclerView, 1))));
            while (r2.hasNext()) {
                ((ImageView) r2.next()).setImageDrawable((Drawable) null);
            }
        }
    }

    public void A1v() {
        super.A1v();
        A01(this);
    }

    public Integer A2A(AnonymousClass8B2 r7) {
        Bundle bundle;
        if (!C108985cd.A1W(this, r7)) {
            return null;
        }
        Iterator A0o = C29431cG.A0o(C29431cG.A0q(this.A0D.values()));
        int i = 0;
        while (true) {
            if (!A0o.hasNext()) {
                i = -1;
                break;
            }
            AnonymousClass8B2 r3 = (AnonymousClass8B2) A0o.next();
            if (C18070vi.A18(r3, r7) || ((bundle = this.A06) != null && bundle.getBoolean("picker_redesign", false) && r3.BQD() != null && r7.BQD() != null && C18070vi.A18(r3.BQD(), r7.BQD()))) {
                break;
            }
            i++;
        }
        return Integer.valueOf(i);
    }

    public void BYp(AnonymousClass73D r5, Collection collection) {
        C18070vi.A0h(collection, r5);
        AnonymousClass73D r3 = new AnonymousClass73D();
        collection.clear();
        Iterator A15 = AnonymousClass000.A15(this.A0D);
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            collection.add(A16.getKey());
            r3.A06(new AnonymousClass72S((Uri) A16.getKey()));
        }
        Map map = r3.A00;
        synchronized (map) {
            map.clear();
            map.putAll(r5.A00);
        }
    }

    public void CHD(AnonymousClass8B2 r2) {
        if (!C108985cd.A1W(this, r2)) {
            A03(this, r2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (r5.containsAll(r12) == false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void CKe(X.AnonymousClass73D r11, java.util.Collection r12, java.util.Collection r13) {
        /*
            r10 = this;
            X.C18070vi.A0h(r12, r13)
            java.util.List r5 = r10.A0C
            int r1 = r5.size()
            int r0 = r12.size()
            if (r1 != r0) goto L_0x0016
            boolean r0 = r5.containsAll(r12)
            r9 = 1
            if (r0 != 0) goto L_0x0017
        L_0x0016:
            r9 = 0
        L_0x0017:
            java.util.Map r4 = r10.A0D
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x0028
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L_0x0028
            if (r9 == 0) goto L_0x0028
            return
        L_0x0028:
            java.util.LinkedHashMap r3 = X.C17880vN.A13()
            java.util.Iterator r2 = X.AnonymousClass000.A15(r4)
        L_0x0030:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0048
            java.util.Map$Entry r1 = X.AnonymousClass000.A16(r2)
            java.lang.Object r0 = r1.getKey()
            boolean r0 = r13.contains(r0)
            if (r0 == 0) goto L_0x0030
            X.C108985cd.A1T(r1, r3)
            goto L_0x0030
        L_0x0048:
            java.util.LinkedHashMap r3 = X.AnonymousClass1D7.A08(r3)
            java.util.Iterator r8 = r13.iterator()
        L_0x0050:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00b3
            java.lang.Object r6 = r8.next()
            boolean r0 = r3.containsKey(r6)
            if (r0 != 0) goto L_0x0050
            X.7DY r1 = r10.A00
            if (r1 == 0) goto L_0x00b1
            r0 = 0
            X.C18070vi.A0d(r6, r0)
            X.6u4 r2 = r1.A15
            boolean r0 = r2.A04
            if (r0 == 0) goto L_0x008e
            java.util.List r0 = r2.A08
            java.util.Iterator r1 = r0.iterator()
        L_0x0074:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x008e
            java.lang.Object r7 = r1.next()
            X.8B2 r7 = (X.AnonymousClass8B2) r7
            android.net.Uri r0 = r7.BLl()
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0074
        L_0x008a:
            r3.put(r6, r7)
            goto L_0x0050
        L_0x008e:
            X.8Ah r0 = r2.A02
            if (r0 == 0) goto L_0x00b1
            r1 = 0
        L_0x0093:
            X.8Ah r0 = r2.A02
            int r0 = r0.getCount()
            if (r1 >= r0) goto L_0x00b1
            X.8Ah r0 = r2.A02
            X.8B2 r7 = r0.BUY(r1)
            if (r7 == 0) goto L_0x00ae
            android.net.Uri r0 = r7.BLl()
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x00ae
            goto L_0x008a
        L_0x00ae:
            int r1 = r1 + 1
            goto L_0x0093
        L_0x00b1:
            r7 = 0
            goto L_0x008a
        L_0x00b3:
            r4.clear()
            r4.putAll(r3)
            if (r9 != 0) goto L_0x00c4
            r5.clear()
            r5.addAll(r12)
            r10.CDn()
        L_0x00c4:
            A01(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallery.GalleryRecentsFragment.CKe(X.73D, java.util.Collection, java.util.Collection):void");
    }

    public void CQF(AnonymousClass8B2 r2) {
        if (C108985cd.A1W(this, r2)) {
            A03(this, r2);
        }
    }
}
