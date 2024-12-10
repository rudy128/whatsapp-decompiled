package com.whatsapp.gallery;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass10I;
import X.AnonymousClass118;
import X.AnonymousClass11C;
import X.AnonymousClass1DF;
import X.AnonymousClass1FL;
import X.AnonymousClass1KB;
import X.AnonymousClass1OX;
import X.AnonymousClass1Q5;
import X.AnonymousClass1Y5;
import X.AnonymousClass20F;
import X.AnonymousClass3MW;
import X.AnonymousClass7FZ;
import X.AnonymousClass7H9;
import X.AnonymousClass7HA;
import X.AnonymousClass7HB;
import X.AnonymousClass7HQ;
import X.AnonymousClass858;
import X.AnonymousClass87B;
import X.AnonymousClass8A8;
import X.AnonymousClass8B2;
import X.C108975cc;
import X.C109355dJ;
import X.C136166tN;
import X.C139176yM;
import X.C139226yS;
import X.C146747Ql;
import X.C146847Qv;
import X.C151107ll;
import X.C151117lm;
import X.C151127ln;
import X.C151137lo;
import X.C151147lp;
import X.C151157lq;
import X.C151177ls;
import X.C151187lt;
import X.C151197lu;
import X.C151207lv;
import X.C151217lw;
import X.C151227lx;
import X.C156007tf;
import X.C156017tg;
import X.C1600686z;
import X.C160878Ah;
import X.C17880vN;
import X.C17890vO;
import X.C17900vP;
import X.C18000vb;
import X.C18030ve;
import X.C18070vi;
import X.C18100vl;
import X.C200710s;
import X.C219217x;
import X.C24771Lp;
import X.C25291Nq;
import X.C29431cG;
import X.C30391dr;
import X.C30451dy;
import X.C38391rD;
import X.C41561wd;
import X.C72453Mb;
import X.C86504Rw;
import X.C99274sY;
import android.database.ContentObserver;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.gallery.viewmodel.MediaGalleryFragmentViewModel;
import com.whatsapp.gallery.viewmodel.MediaGalleryFragmentViewModel$cacheMedia$1;
import com.whatsapp.gallerypicker.MediaPickerFragment;
import com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel;
import com.whatsapp.media.WamediaManager;
import com.whatsapp.scroller.RecyclerFastScroller;
import com.whatsapp.storage.StorageUsageMediaGalleryFragment;
import com.whatsapp.util.Log;
import java.text.Format;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

public abstract class MediaGalleryFragmentBase extends Hilt_MediaGalleryFragmentBase implements AnonymousClass8A8 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public Drawable A05;
    public Toast A06;
    public RecyclerView A07;
    public AnonymousClass1KB A08;
    public C24771Lp A09;
    public AnonymousClass11C A0A;
    public AnonymousClass118 A0B;
    public C219217x A0C;
    public C1600686z A0D;
    public C18000vb A0E;
    public C18030ve A0F;
    public C160878Ah A0G;
    public C136166tN A0H;
    public RecyclerFastScroller A0I;
    public AnonymousClass7FZ A0J;
    public C200710s A0K;
    public AnonymousClass10I A0L;
    public AnonymousClass00H A0M;
    public AnonymousClass00H A0N;
    public AnonymousClass00H A0O;
    public AnonymousClass00H A0P;
    public AnonymousClass00H A0Q;
    public AnonymousClass00H A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public View A0V;
    public View A0W;
    public View A0X;
    public C38391rD A0Y;
    public final ContentObserver A0Z;
    public final AnonymousClass858 A0a;
    public final List A0b;
    public final C18100vl A0c;
    public final C18100vl A0d;
    public final C18100vl A0e;
    public final C18100vl A0f;
    public final C18100vl A0g = AnonymousClass1DF.A01(new C151147lp(this));
    public final C18100vl A0h = AnonymousClass1DF.A01(new C151157lq(this));
    public final C18100vl A0i;
    public final C18100vl A0j;
    public final C18100vl A0k;
    public final Handler A0l;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return layoutInflater.inflate(2131625573, viewGroup, false);
    }

    public void A20(Bundle bundle) {
        C18070vi.A0d(bundle, 0);
        bundle.putInt("sort_type", this.A03);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0239, code lost:
        X.C18070vi.A11("pickerActionsProviderMap");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0243, code lost:
        r0 = "ioDispatcher";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0246, code lost:
        r0 = "serialDispatcher";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00c4, code lost:
        if (r9 != null) goto L_0x00c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00de, code lost:
        if (r0 != null) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x015f, code lost:
        if (r2 == 1) goto L_0x0161;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0032, code lost:
        if (r13 != null) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0196, code lost:
        if (r0 != null) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01b9, code lost:
        if (r9 != null) goto L_0x01bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01fa, code lost:
        if (r0 != null) goto L_0x01fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x020f, code lost:
        if (r0 != null) goto L_0x01fc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0117  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A21(android.os.Bundle r13, android.view.View r14) {
        /*
            r12 = this;
            r4 = 0
            X.C18070vi.A0d(r14, r4)
            java.lang.String r0 = "MediaGalleryFragmentBase/onViewCreated"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r5 = r12
            X.0vl r0 = r12.A0i
            java.lang.Object r0 = r0.getValue()
            com.whatsapp.gallery.viewmodel.MediaGalleryFragmentViewModel r0 = (com.whatsapp.gallery.viewmodel.MediaGalleryFragmentViewModel) r0
            X.1DT r3 = r0.A04
            X.1q9 r2 = r12.A1G()
            X.7zz r1 = new X.7zz
            r1.<init>(r12)
            r0 = 33
            X.AnonymousClass7AT.A01(r2, r3, r1, r0)
            X.10I r1 = r12.A0L
            if (r1 == 0) goto L_0x0254
            X.10s r0 = new X.10s
            r0.<init>(r1, r4)
            r12.A0K = r0
            if (r13 != 0) goto L_0x0034
            android.os.Bundle r13 = r12.A06
            r0 = 0
            if (r13 == 0) goto L_0x003a
        L_0x0034:
            java.lang.String r0 = "sort_type"
            int r0 = r13.getInt(r0, r4)
        L_0x003a:
            r12.A03 = r0
            int r1 = r12.A02
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r1)
            r12.A05 = r0
            android.content.Context r1 = r12.A14()
            r0 = 2131103204(0x7f060de4, float:1.7818868E38)
            int r0 = X.C19740yt.A00(r1, r0)
            r12.A02 = r0
            android.content.res.Resources r1 = X.AnonymousClass3MZ.A09(r12)
            X.0vl r0 = r12.A0k
            int r0 = X.C72453Mb.A0I(r0)
            int r0 = r1.getDimensionPixelSize(r0)
            r12.A04 = r0
            boolean r0 = r12 instanceof com.whatsapp.storage.StorageUsageMediaGalleryFragment
            r12.A0T = r0
            r0 = 2131433150(0x7f0b16be, float:1.8488078E38)
            android.view.View r0 = r14.findViewById(r0)
            r12.A0V = r0
            r0 = 2131431063(0x7f0b0e97, float:1.8483845E38)
            android.view.View r0 = r14.findViewById(r0)
            r12.A0W = r0
            r0 = 2131433152(0x7f0b16c0, float:1.8488082E38)
            android.view.View r0 = r14.findViewById(r0)
            r12.A0X = r0
            r0 = 2131431234(0x7f0b0f42, float:1.8484191E38)
            android.view.ViewStub r2 = X.AnonymousClass3MW.A0F(r14, r0)
            boolean r1 = r12.A2G()
            r0 = 2131627387(0x7f0e0d7b, float:1.8882037E38)
            if (r1 == 0) goto L_0x0094
            r0 = 2131627366(0x7f0e0d66, float:1.8881994E38)
        L_0x0094:
            android.view.View r1 = X.AnonymousClass3MY.A0G(r2, r0)
            java.lang.String r0 = "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView"
            X.C18070vi.A0z(r1, r0)
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            r12.A07 = r1
            boolean r0 = r12.A2G()
            if (r0 == 0) goto L_0x019d
            X.0vl r0 = r12.A0f
            boolean r0 = X.C72453Mb.A1a(r0)
            if (r0 == 0) goto L_0x019d
            X.0ve r3 = r12.A27()
            X.10I r7 = r12.A0L
            if (r7 == 0) goto L_0x0232
            X.00H r8 = r12.A0Q
            if (r8 == 0) goto L_0x024d
            boolean r0 = r12 instanceof com.whatsapp.gallery.GalleryRecentsFragment
            if (r0 == 0) goto L_0x019a
            r0 = r5
            com.whatsapp.gallery.GalleryRecentsFragment r0 = (com.whatsapp.gallery.GalleryRecentsFragment) r0
            X.00H r9 = r0.A09
            if (r9 == 0) goto L_0x0239
        L_0x00c6:
            java.lang.Integer r10 = r12.A29()
            X.00H r0 = r12.A0R
            if (r0 == 0) goto L_0x0236
            java.lang.Object r4 = r0.get()
            X.18K r4 = (X.AnonymousClass18K) r4
            X.0vl r0 = r12.A0g
            boolean r0 = X.C72453Mb.A1a(r0)
            if (r0 == 0) goto L_0x0194
            X.00H r0 = r12.A0N
            if (r0 == 0) goto L_0x0243
        L_0x00e0:
            java.lang.Object r11 = r0.get()
            X.0wl r11 = (X.C18600wl) r11
            X.C18070vi.A0b(r11)
            X.65N r2 = new X.65N
            r6 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
        L_0x00ef:
            X.1rD r2 = (X.C38391rD) r2
        L_0x00f1:
            r12.A0Y = r2
            androidx.recyclerview.widget.RecyclerView r0 = r12.A07
            if (r0 == 0) goto L_0x00fa
            r0.setAdapter(r2)
        L_0x00fa:
            X.0vl r0 = r12.A0f
            boolean r0 = X.C72453Mb.A1a(r0)
            if (r0 == 0) goto L_0x010a
            androidx.recyclerview.widget.RecyclerView r1 = r12.A07
            if (r1 == 0) goto L_0x010a
            r0 = 0
            r1.setItemAnimator(r0)
        L_0x010a:
            r0 = 2131434841(0x7f0b1d59, float:1.8491507E38)
            android.view.View r1 = X.AnonymousClass1HF.A06(r14, r0)
            com.whatsapp.scroller.RecyclerFastScroller r1 = (com.whatsapp.scroller.RecyclerFastScroller) r1
            X.0vb r0 = r12.A0E
            if (r0 == 0) goto L_0x022f
            boolean r0 = X.AnonymousClass3MW.A1Z(r0)
            r1.A09 = r0
            androidx.recyclerview.widget.RecyclerView r0 = r12.A07
            r1.setRecyclerView(r0)
            r12.A0I = r1
            android.content.Context r0 = r12.A1n()
            android.widget.ImageView r3 = new android.widget.ImageView
            r3.<init>(r0)
            X.0vb r2 = r12.A0E
            if (r2 == 0) goto L_0x022f
            android.content.Context r1 = r12.A14()
            r0 = 2131231481(0x7f0802f9, float:1.8079044E38)
            X.AnonymousClass3NL.A01(r1, r3, r2, r0)
            com.whatsapp.scroller.RecyclerFastScroller r0 = r12.A0I
            if (r0 == 0) goto L_0x0142
            r0.setThumbView(r3)
        L_0x0142:
            com.whatsapp.scroller.RecyclerFastScroller r2 = r12.A0I
            if (r2 == 0) goto L_0x0154
            X.0vl r0 = r12.A0c
            android.view.View r1 = X.C72453Mb.A0T(r0)
            X.7Lw r0 = new X.7Lw
            r0.<init>(r12)
            r2.setBubbleView(r1, r0)
        L_0x0154:
            com.whatsapp.scroller.RecyclerFastScroller r3 = r12.A0I
            if (r3 == 0) goto L_0x0165
            int r2 = r12.A03
            if (r2 == 0) goto L_0x0161
            r1 = 1
            r0 = 8
            if (r2 != r1) goto L_0x0162
        L_0x0161:
            r0 = 0
        L_0x0162:
            r3.setVisibility(r0)
        L_0x0165:
            X.1Lp r4 = r12.A09
            if (r4 == 0) goto L_0x022c
            X.11C r3 = r12.A0A
            if (r3 == 0) goto L_0x0258
            android.os.Handler r2 = X.C17890vO.A0D()
            java.lang.String r1 = "image-loader-media-gallery-fragment"
            X.6tN r0 = new X.6tN
            r0.<init>(r2, r4, r3, r1)
            r12.A0H = r0
            X.00H r0 = r12.A0M
            if (r0 == 0) goto L_0x0229
            java.lang.Object r1 = r0.get()
            X.4Rw r1 = (X.C86504Rw) r1
            X.1FL r0 = r12.A1D()
            r1.A00(r14, r0)
            X.7lr r0 = new X.7lr
            r0.<init>(r12)
            X.AnonymousClass6WQ.A00(r14, r12, r0)
            return
        L_0x0194:
            X.00H r0 = r12.A0P
            if (r0 == 0) goto L_0x0246
            goto L_0x00e0
        L_0x019a:
            r9 = 0
            goto L_0x00c6
        L_0x019d:
            boolean r0 = r12.A2G()
            r1 = 1
            if (r0 == 0) goto L_0x01d6
            X.0ve r3 = r12.A27()
            X.10I r7 = r12.A0L
            if (r7 == 0) goto L_0x023f
            X.00H r8 = r12.A0Q
            if (r8 == 0) goto L_0x024d
            boolean r0 = r12 instanceof com.whatsapp.gallery.GalleryRecentsFragment
            if (r0 == 0) goto L_0x01d4
            r0 = r5
            com.whatsapp.gallery.GalleryRecentsFragment r0 = (com.whatsapp.gallery.GalleryRecentsFragment) r0
            X.00H r9 = r0.A09
            if (r9 == 0) goto L_0x0239
        L_0x01bb:
            java.lang.Integer r10 = r12.A29()
            X.00H r0 = r12.A0R
            if (r0 == 0) goto L_0x0236
            java.lang.Object r4 = r0.get()
            X.18K r4 = (X.AnonymousClass18K) r4
            X.5lI r2 = new X.5lI
            r6 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r2.A0K(r1)
            goto L_0x00f1
        L_0x01d4:
            r9 = 0
            goto L_0x01bb
        L_0x01d6:
            X.0vl r0 = r12.A0f
            boolean r0 = X.C72453Mb.A1a(r0)
            if (r0 == 0) goto L_0x0212
            boolean r0 = r12.A2G()
            if (r0 != 0) goto L_0x0212
            X.0ve r3 = r12.A27()
            X.10I r6 = r12.A0L
            if (r6 == 0) goto L_0x0249
            X.00H r7 = r12.A0Q
            if (r7 == 0) goto L_0x024d
            X.0vl r0 = r12.A0g
            boolean r0 = X.C72453Mb.A1a(r0)
            if (r0 == 0) goto L_0x020d
            X.00H r0 = r12.A0N
            if (r0 == 0) goto L_0x0243
        L_0x01fc:
            java.lang.Object r8 = r0.get()
            X.0wl r8 = (X.C18600wl) r8
            X.C18070vi.A0b(r8)
            r4 = r12
            X.65M r2 = new X.65M
            r2.<init>(r3, r4, r5, r6, r7, r8)
            goto L_0x00ef
        L_0x020d:
            X.00H r0 = r12.A0P
            if (r0 == 0) goto L_0x0246
            goto L_0x01fc
        L_0x0212:
            X.0ve r3 = r12.A27()
            X.10I r6 = r12.A0L
            if (r6 == 0) goto L_0x0250
            X.00H r7 = r12.A0Q
            if (r7 == 0) goto L_0x024d
            r4 = r12
            X.65O r2 = new X.65O
            r2.<init>(r3, r4, r5, r6, r7)
            r2.A0K(r1)
            goto L_0x00ef
        L_0x0229:
            java.lang.String r0 = "galleryPartialPermissionProvider"
            goto L_0x025a
        L_0x022c:
            java.lang.String r0 = "caches"
            goto L_0x025a
        L_0x022f:
            java.lang.String r0 = "whatsAppLocale"
            goto L_0x025a
        L_0x0232:
            X.AnonymousClass3MW.A1G()
            goto L_0x025d
        L_0x0236:
            java.lang.String r0 = "wamRuntime"
            goto L_0x025a
        L_0x0239:
            java.lang.String r0 = "pickerActionsProviderMap"
            X.C18070vi.A11(r0)
            goto L_0x025d
        L_0x023f:
            X.AnonymousClass3MW.A1G()
            goto L_0x025d
        L_0x0243:
            java.lang.String r0 = "ioDispatcher"
            goto L_0x025a
        L_0x0246:
            java.lang.String r0 = "serialDispatcher"
            goto L_0x025a
        L_0x0249:
            X.AnonymousClass3MW.A1G()
            goto L_0x025d
        L_0x024d:
            java.lang.String r0 = "videoMetaFactory"
            goto L_0x025a
        L_0x0250:
            X.AnonymousClass3MW.A1G()
            goto L_0x025d
        L_0x0254:
            X.AnonymousClass3MW.A1G()
            goto L_0x025d
        L_0x0258:
            java.lang.String r0 = "systemServices"
        L_0x025a:
            X.C18070vi.A11(r0)
        L_0x025d:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallery.MediaGalleryFragmentBase.A21(android.os.Bundle, android.view.View):void");
    }

    public boolean BeG() {
        return false;
    }

    public static final void A05(AnonymousClass8B2 r5, MediaGalleryFragmentBase mediaGalleryFragmentBase) {
        if (r5 != null) {
            C72453Mb.A0X(mediaGalleryFragmentBase.A0d).setText(((Format) mediaGalleryFragmentBase.A0e.getValue()).format(new Date(r5.BQH())));
        }
    }

    public static final void A06(MediaGalleryFragmentBase mediaGalleryFragmentBase) {
        C160878Ah r5 = mediaGalleryFragmentBase.A0G;
        if (r5 != null && mediaGalleryFragmentBase.A0T) {
            mediaGalleryFragmentBase.A0S = false;
            mediaGalleryFragmentBase.A2B();
            MediaGalleryFragmentViewModel mediaGalleryFragmentViewModel = (MediaGalleryFragmentViewModel) mediaGalleryFragmentBase.A0i.getValue();
            C30391dr A0j2 = C108975cc.A0j(mediaGalleryFragmentViewModel.A01);
            AnonymousClass1OX A002 = C41561wd.A00(mediaGalleryFragmentViewModel);
            mediaGalleryFragmentViewModel.A01 = C30451dy.A02(AnonymousClass00R.A00, mediaGalleryFragmentViewModel.A08, new MediaGalleryFragmentViewModel$cacheMedia$1(r5, mediaGalleryFragmentViewModel, A0j2), A002);
        }
    }

    public static final void A07(MediaGalleryFragmentBase mediaGalleryFragmentBase) {
        Log.i("MediaGalleryFragmentBase/refreshPartialPermissionBanner");
        AnonymousClass00H r0 = mediaGalleryFragmentBase.A0M;
        if (r0 != null) {
            ((C86504Rw) r0.get()).A01(new C151187lt(mediaGalleryFragmentBase));
        } else {
            C18070vi.A11("galleryPartialPermissionProvider");
            throw null;
        }
    }

    public void A1r() {
        Log.i("MediaGalleryFragmentBase/onDestroy");
        super.A1r();
        Toast toast = this.A06;
        if (toast != null) {
            toast.cancel();
        }
        this.A06 = null;
        ((MediaGalleryFragmentViewModel) this.A0i.getValue()).A0T();
        C200710s r0 = this.A0K;
        if (r0 != null) {
            r0.A03();
        }
        this.A0S = false;
        C136166tN r02 = this.A0H;
        if (r02 != null) {
            r02.A00();
        }
        this.A0H = null;
        C160878Ah r1 = this.A0G;
        if (r1 != null) {
            r1.unregisterContentObserver(this.A0Z);
        }
        AnonymousClass10I r12 = this.A0L;
        if (r12 != null) {
            r12.CGF(C146747Ql.A00(this, 39));
            this.A0Y = null;
            this.A01 = 0;
            return;
        }
        AnonymousClass3MW.A1G();
        throw null;
    }

    public final AnonymousClass1KB A26() {
        AnonymousClass1KB r0 = this.A08;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1C();
        throw null;
    }

    public final C18030ve A27() {
        C18030ve r0 = this.A0F;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1A();
        throw null;
    }

    public AnonymousClass87B A28() {
        String str;
        int i;
        AnonymousClass87B r4;
        String str2;
        if (this instanceof StorageUsageMediaGalleryFragment) {
            return ((StorageUsageMediaGalleryFragment) this).A0E;
        }
        if (this instanceof MediaPickerFragment) {
            MediaPickerFragment mediaPickerFragment = (MediaPickerFragment) this;
            AnonymousClass1FL A1B = mediaPickerFragment.A1B();
            if (A1B == null) {
                return null;
            }
            Uri data = A1B.getIntent().getData();
            C18030ve A27 = mediaPickerFragment.A27();
            AnonymousClass00H r0 = mediaPickerFragment.A0O;
            if (r0 != null) {
                C139176yM r5 = (C139176yM) C18070vi.A0E(r0);
                AnonymousClass11C r3 = mediaPickerFragment.A0A;
                if (r3 != null) {
                    WamediaManager wamediaManager = mediaPickerFragment.A0A;
                    if (wamediaManager != null) {
                        AnonymousClass1Q5 r7 = mediaPickerFragment.A0B;
                        if (r7 != null) {
                            return new AnonymousClass7HB(data, r3, A27, r5, wamediaManager, r7, mediaPickerFragment.A00, mediaPickerFragment.A0I, C72453Mb.A1a(mediaPickerFragment.A0R));
                        }
                        str2 = "perfTimerFactory";
                    } else {
                        str2 = "wamediaManager";
                    }
                } else {
                    str2 = "systemServices";
                }
            } else {
                str2 = "mediaManager";
            }
            C18070vi.A11(str2);
            throw null;
        } else if (this instanceof MediaGalleryFragment) {
            return new AnonymousClass7H9(this, 0);
        } else {
            GalleryRecentsFragment galleryRecentsFragment = (GalleryRecentsFragment) this;
            Uri uri = null;
            if (!galleryRecentsFragment.A1b()) {
                return null;
            }
            Bundle bundle = galleryRecentsFragment.A06;
            if ((bundle == null || bundle.getInt("include", 7) == 7) && GalleryPickerViewModel.A0C(galleryRecentsFragment.A0E) == null) {
                AnonymousClass00H r02 = galleryRecentsFragment.A0O;
                if (r02 != null) {
                    r4 = new AnonymousClass7HA((C139176yM) C18070vi.A0E(r02), galleryRecentsFragment.A0C, C72453Mb.A1a(galleryRecentsFragment.A0G));
                }
                str = "mediaManager";
                C18070vi.A11(str);
                throw null;
            }
            C18030ve A272 = galleryRecentsFragment.A27();
            AnonymousClass00H r03 = galleryRecentsFragment.A0O;
            if (r03 != null) {
                C139176yM r8 = (C139176yM) C18070vi.A0E(r03);
                AnonymousClass11C r6 = galleryRecentsFragment.A0A;
                if (r6 != null) {
                    WamediaManager wamediaManager2 = galleryRecentsFragment.A04;
                    if (wamediaManager2 != null) {
                        AnonymousClass1Q5 r10 = galleryRecentsFragment.A05;
                        if (r10 != null) {
                            C18100vl r1 = galleryRecentsFragment.A0E;
                            C139226yS r04 = (C139226yS) GalleryPickerViewModel.A0C(r1);
                            if (r04 != null) {
                                uri = C139226yS.A00(r04);
                            }
                            C139226yS r05 = (C139226yS) GalleryPickerViewModel.A0C(r1);
                            if (r05 != null) {
                                i = r05.A01;
                            } else {
                                Bundle bundle2 = galleryRecentsFragment.A06;
                                i = 7;
                                if (bundle2 != null) {
                                    i = bundle2.getInt("include", 7);
                                }
                            }
                            r4 = new AnonymousClass7HB(uri, r6, A272, r8, wamediaManager2, r10, i, false, C72453Mb.A1a(galleryRecentsFragment.A0G));
                        } else {
                            str = "perfTimerFactory";
                        }
                    } else {
                        str = "wamediaManager";
                    }
                } else {
                    str = "systemServices";
                }
                C18070vi.A11(str);
                throw null;
            }
            str = "mediaManager";
            C18070vi.A11(str);
            throw null;
            return r4;
        }
    }

    public Integer A29() {
        Bundle bundle;
        Bundle bundle2;
        if (!(this instanceof GalleryRecentsFragment) || (bundle = this.A06) == null || !bundle.containsKey("picker_action") || (bundle2 = this.A06) == null) {
            return null;
        }
        return Integer.valueOf(bundle2.getInt("picker_action", -1));
    }

    public Integer A2A(AnonymousClass8B2 r4) {
        if (!(this instanceof MediaPickerFragment)) {
            return null;
        }
        HashSet hashSet = ((MediaPickerFragment) this).A0Q;
        Uri BLl = r4.BLl();
        if (C29431cG.A18(hashSet, BLl)) {
            return Integer.valueOf(C29431cG.A0t(hashSet).indexOf(BLl));
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0052, code lost:
        if (r7 != false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0066, code lost:
        if (r7 != false) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x007a, code lost:
        if (r1 != true) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
        if (r1.getCount() <= 0) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A2C() {
        /*
            r8 = this;
            X.8Ah r1 = r8.A0G
            if (r1 == 0) goto L_0x0096
            X.17x r0 = r8.A0C
            if (r0 == 0) goto L_0x00ae
            java.lang.Integer r0 = r0.A05()
            java.lang.Integer r5 = X.AnonymousClass00R.A01
            r3 = 0
            if (r0 == r5) goto L_0x0018
            int r0 = r1.getCount()
            r4 = 1
            if (r0 > 0) goto L_0x0019
        L_0x0018:
            r4 = 0
        L_0x0019:
            android.view.View r1 = r8.A0V
            r2 = 8
            if (r1 == 0) goto L_0x0028
            r0 = r4 ^ 1
            int r0 = X.C72453Mb.A07(r0)
            r1.setVisibility(r0)
        L_0x0028:
            X.17x r0 = r8.A0C
            if (r0 == 0) goto L_0x00ae
            java.lang.Integer r0 = r0.A05()
            boolean r7 = X.AnonymousClass000.A1Z(r0, r5)
            android.view.View r1 = r8.A0W
            if (r4 == 0) goto L_0x0097
            if (r1 == 0) goto L_0x003d
            r1.setVisibility(r2)
        L_0x003d:
            android.view.View r0 = r8.A0X
            if (r0 == 0) goto L_0x0044
            r0.setVisibility(r2)
        L_0x0044:
            androidx.recyclerview.widget.RecyclerView r6 = r8.A07
            if (r6 == 0) goto L_0x0088
            if (r4 != 0) goto L_0x0085
            boolean r0 = r8.BeG()
            r5 = 1
            if (r0 == 0) goto L_0x0054
            r4 = 1
            if (r7 == 0) goto L_0x0055
        L_0x0054:
            r4 = 0
        L_0x0055:
            X.0vl r1 = r8.A0j
            java.lang.Object r0 = r1.getValue()
            X.8A9 r0 = (X.AnonymousClass8A9) r0
            if (r0 == 0) goto L_0x0068
            boolean r0 = r0.BED()
            if (r0 != r5) goto L_0x0068
            r2 = 1
            if (r7 == 0) goto L_0x0069
        L_0x0068:
            r2 = 0
        L_0x0069:
            java.lang.Object r0 = r1.getValue()
            X.8A9 r0 = (X.AnonymousClass8A9) r0
            if (r0 == 0) goto L_0x007c
            java.util.List r0 = r0.BS7()
            boolean r1 = X.AnonymousClass000.A1a(r0)
            r0 = 1
            if (r1 == r5) goto L_0x007d
        L_0x007c:
            r0 = 0
        L_0x007d:
            if (r4 != 0) goto L_0x0085
            if (r2 != 0) goto L_0x0085
            if (r0 != 0) goto L_0x0085
            r3 = 8
        L_0x0085:
            r6.setVisibility(r3)
        L_0x0088:
            android.view.View r0 = r8.A0W
            if (r0 == 0) goto L_0x008f
            r0.requestLayout()
        L_0x008f:
            android.view.View r0 = r8.A0X
            if (r0 == 0) goto L_0x0096
            r0.requestLayout()
        L_0x0096:
            return
        L_0x0097:
            if (r1 == 0) goto L_0x00a0
            int r0 = X.C72453Mb.A0J(r7)
            r1.setVisibility(r0)
        L_0x00a0:
            android.view.View r1 = r8.A0X
            if (r1 == 0) goto L_0x0044
            r0 = r7 ^ 1
            int r0 = X.C72453Mb.A07(r0)
            r1.setVisibility(r0)
            goto L_0x0044
        L_0x00ae:
            java.lang.String r0 = "waPermissionsHelper"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallery.MediaGalleryFragmentBase.A2C():void");
    }

    public final void A2E(boolean z) {
        View findViewById;
        View view = this.A0B;
        if (view != null && (findViewById = view.findViewById(2131434181)) != null) {
            findViewById.setVisibility(C72453Mb.A07(z ? 1 : 0));
        }
    }

    public boolean A2G() {
        if ((this instanceof StorageUsageMediaGalleryFragment) || (this instanceof MediaPickerFragment) || (this instanceof MediaGalleryFragment)) {
            return false;
        }
        if (BeG() || this.A0j.getValue() != null || C25291Nq.A04(A27(), 10030)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A2H(int r5) {
        /*
            r4 = this;
            boolean r0 = r4 instanceof com.whatsapp.storage.StorageUsageMediaGalleryFragment
            if (r0 == 0) goto L_0x0029
            r3 = r4
            com.whatsapp.storage.StorageUsageMediaGalleryFragment r3 = (com.whatsapp.storage.StorageUsageMediaGalleryFragment) r3
            X.8Ah r0 = r3.A0G
            r2 = 0
            if (r0 == 0) goto L_0x0028
            X.8B2 r1 = r0.BUY(r5)
            boolean r0 = r1 instanceof X.AnonymousClass7H2
            if (r0 == 0) goto L_0x0028
            X.7H2 r1 = (X.AnonymousClass7H2) r1
            X.21V r1 = r1.A01
            if (r1 == 0) goto L_0x0028
            X.5cR r0 = com.whatsapp.storage.StorageUsageMediaGalleryFragment.A00(r3)
            if (r0 == 0) goto L_0x0028
            boolean r0 = r0.Bfa(r1)
            boolean r2 = X.C108975cc.A1B(r0)
        L_0x0028:
            return r2
        L_0x0029:
            boolean r0 = r4 instanceof com.whatsapp.gallerypicker.MediaPickerFragment
            if (r0 == 0) goto L_0x005e
            r1 = r4
            com.whatsapp.gallerypicker.MediaPickerFragment r1 = (com.whatsapp.gallerypicker.MediaPickerFragment) r1
            boolean r0 = r1 instanceof com.whatsapp.gallery.NewMediaPickerFragment
            if (r0 == 0) goto L_0x0045
            com.whatsapp.gallery.NewMediaPickerFragment r1 = (com.whatsapp.gallery.NewMediaPickerFragment) r1
            X.8Ah r0 = r1.A0G
            if (r0 == 0) goto L_0x008e
            java.util.Set r1 = r1.A05
            X.8B2 r0 = r0.BUY(r5)
            boolean r0 = X.C29431cG.A18(r1, r0)
            return r0
        L_0x0045:
            X.8Ah r0 = r1.A0G
            if (r0 == 0) goto L_0x005c
            X.8B2 r0 = r0.BUY(r5)
        L_0x004d:
            java.util.HashSet r1 = r1.A0Q
            if (r0 == 0) goto L_0x005a
            android.net.Uri r0 = r0.BLl()
        L_0x0055:
            boolean r0 = X.C29431cG.A18(r1, r0)
            return r0
        L_0x005a:
            r0 = 0
            goto L_0x0055
        L_0x005c:
            r0 = 0
            goto L_0x004d
        L_0x005e:
            boolean r0 = r4 instanceof com.whatsapp.gallery.MediaGalleryFragment
            if (r0 == 0) goto L_0x0099
            X.1FL r3 = r4.A1B()
            boolean r0 = r3 instanceof X.C108875cR
            if (r0 == 0) goto L_0x008e
            X.5cR r3 = (X.C108875cR) r3
            if (r3 == 0) goto L_0x008e
            X.8Ah r2 = r4.A0G
            X.7H7 r2 = (X.AnonymousClass7H7) r2
            if (r2 == 0) goto L_0x008e
            java.util.Map r0 = r2.A05
            java.lang.Object r1 = X.AnonymousClass000.A0w(r0, r5)
            X.7H2 r1 = (X.AnonymousClass7H2) r1
            X.5dH r0 = r2.A01
            if (r0 == 0) goto L_0x008c
            if (r1 != 0) goto L_0x0090
            boolean r0 = X.C22781De.A03()
            if (r0 != 0) goto L_0x008e
            X.7H2 r1 = X.AnonymousClass7H7.A00(r2, r5)
        L_0x008c:
            if (r1 != 0) goto L_0x0090
        L_0x008e:
            r0 = 0
            return r0
        L_0x0090:
            X.21V r0 = r1.A01
            if (r0 == 0) goto L_0x008e
            boolean r0 = r3.Bfa(r0)
            return r0
        L_0x0099:
            r1 = r4
            com.whatsapp.gallery.GalleryRecentsFragment r1 = (com.whatsapp.gallery.GalleryRecentsFragment) r1
            X.8Ah r0 = r1.A0G
            if (r0 == 0) goto L_0x008e
            X.8B2 r0 = r0.BUY(r5)
            if (r0 == 0) goto L_0x008e
            boolean r0 = X.C108985cd.A1W(r1, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallery.MediaGalleryFragmentBase.A2H(int):boolean");
    }

    public MediaGalleryFragmentBase() {
        Handler A0D2 = C17890vO.A0D();
        this.A0l = A0D2;
        this.A0b = AnonymousClass000.A13();
        this.A00 = 10;
        Integer num = AnonymousClass00R.A0C;
        this.A0j = AnonymousClass1DF.A00(num, new C151177ls(this));
        this.A0k = AnonymousClass1DF.A01(new C151227lx(this));
        this.A0f = AnonymousClass1DF.A01(new C151137lo(this));
        this.A0c = AnonymousClass1DF.A01(new C151107ll(this));
        this.A0d = AnonymousClass1DF.A01(new C151117lm(this));
        this.A0e = AnonymousClass1DF.A01(new C151127ln(this));
        this.A0a = new AnonymousClass7HQ(this);
        this.A0Z = new C109355dJ(A0D2, this, 0);
        C18100vl A002 = AnonymousClass1DF.A00(num, new C151207lv(new C151197lu(this)));
        AnonymousClass20F A15 = AnonymousClass3MW.A15(MediaGalleryFragmentViewModel.class);
        this.A0i = C99274sY.A00(new C151217lw(A002), new C156017tg(this, A002), new C156007tf(A002), A15);
    }

    public void A1u() {
        super.A1u();
        A2C();
        A07(this);
    }

    public final void A2B() {
        C38391rD r0;
        AnonymousClass1FL A1B = A1B();
        if (A1B != null && !A1B.isFinishing() && this.A0B != null && (r0 = this.A0Y) != null) {
            r0.notifyDataSetChanged();
        }
    }

    public final void A2D(int i) {
        String str;
        AnonymousClass1FL A1B = A1B();
        if (A1B != null) {
            AnonymousClass11C r6 = this.A0A;
            if (r6 != null) {
                C18000vb r5 = this.A0E;
                if (r5 != null) {
                    Object[] A1a = AnonymousClass3MW.A1a();
                    C17880vN.A1T(A1a, i, 0);
                    AnonymousClass1Y5.A00(A1B, r6, r5.A0K(A1a, 2131755256, (long) i));
                    return;
                }
                str = "whatsAppLocale";
            } else {
                str = "systemServices";
            }
            C18070vi.A11(str);
            throw null;
        }
    }

    public final void A2F(boolean z, boolean z2) {
        AnonymousClass1FL A1B = A1B();
        if (A1B != null && !A1B.isFinishing() && this.A0B != null) {
            C17900vP.A0n("MediaGalleryFragmentBase/rebake unmounted:", AnonymousClass000.A10(), z);
            ((MediaGalleryFragmentViewModel) this.A0i.getValue()).A0T();
            C200710s r0 = this.A0K;
            if (r0 != null) {
                r0.A03();
            }
            C160878Ah r1 = this.A0G;
            if (r1 != null) {
                r1.unregisterContentObserver(this.A0Z);
            }
            AnonymousClass10I r2 = this.A0L;
            if (r2 != null) {
                r2.CGF(new C146847Qv(this, 7, z, z2));
            } else {
                AnonymousClass3MW.A1G();
                throw null;
            }
        }
    }
}
