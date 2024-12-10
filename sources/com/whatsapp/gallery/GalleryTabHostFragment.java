package com.whatsapp.gallery;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass02V;
import X.AnonymousClass02n;
import X.AnonymousClass10I;
import X.AnonymousClass112;
import X.AnonymousClass118;
import X.AnonymousClass11C;
import X.AnonymousClass11P;
import X.AnonymousClass1BI;
import X.AnonymousClass1DF;
import X.AnonymousClass1FL;
import X.AnonymousClass1KB;
import X.AnonymousClass1LU;
import X.AnonymousClass1PM;
import X.AnonymousClass20F;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass4aX;
import X.AnonymousClass6ZQ;
import X.AnonymousClass72S;
import X.AnonymousClass73D;
import X.AnonymousClass745;
import X.AnonymousClass747;
import X.AnonymousClass778;
import X.AnonymousClass7AT;
import X.AnonymousClass7DY;
import X.AnonymousClass7FZ;
import X.AnonymousClass7NZ;
import X.AnonymousClass87Y;
import X.AnonymousClass88L;
import X.AnonymousClass8B2;
import X.AnonymousClass8B4;
import X.C009805p;
import X.C108945cZ;
import X.C108955ca;
import X.C108965cb;
import X.C108975cc;
import X.C108995ce;
import X.C113825np;
import X.C136156tM;
import X.C136166tN;
import X.C138086wV;
import X.C138286wp;
import X.C138446x5;
import X.C138766xe;
import X.C139226yS;
import X.C139266yY;
import X.C139416yo;
import X.C139506yx;
import X.C1423479c;
import X.C146747Ql;
import X.C150817lI;
import X.C150827lJ;
import X.C150837lK;
import X.C150847lL;
import X.C150857lM;
import X.C150867lN;
import X.C150877lO;
import X.C150887lP;
import X.C150897lQ;
import X.C150907lR;
import X.C150917lS;
import X.C150937lU;
import X.C150947lV;
import X.C150957lW;
import X.C150967lX;
import X.C150977lY;
import X.C150987lZ;
import X.C150997la;
import X.C151007lb;
import X.C151017lc;
import X.C151027ld;
import X.C151037le;
import X.C151047lf;
import X.C151057lg;
import X.C151067lh;
import X.C151077li;
import X.C155957ta;
import X.C155967tb;
import X.C155977tc;
import X.C155987td;
import X.C155997te;
import X.C158207zu;
import X.C1589282o;
import X.C1589382p;
import X.C1599186j;
import X.C1606389i;
import X.C17880vN;
import X.C17890vO;
import X.C18000vb;
import X.C18010vc;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C18100vl;
import X.C23401Fx;
import X.C24771Lp;
import X.C26521Sl;
import X.C28931bI;
import X.C29351c6;
import X.C29431cG;
import X.C34501ka;
import X.C38391rD;
import X.C41731wy;
import X.C58432kg;
import X.C60242nd;
import X.C72453Mb;
import X.C72463Mc;
import X.C74743cP;
import X.C99274sY;
import X.C99434so;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.whatsapp.WaMediaThumbnailView;
import com.whatsapp.gallery.viewmodel.GalleryTabsViewModel;
import com.whatsapp.gallerypicker.GalleryDropdownFilterFragment;
import com.whatsapp.gallerypicker.GalleryPickerBottomSheetActivity;
import com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel;
import com.whatsapp.mediacomposer.viewmodel.MediaJidViewModel;
import com.whatsapp.mediacomposer.viewmodel.MediaQualityViewModel;
import com.whatsapp.mediacomposer.viewmodel.MediaViewOnceViewModel;
import com.whatsapp.wds.components.fab.WDSFab;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class GalleryTabHostFragment extends Hilt_GalleryTabHostFragment implements C1606389i, AnonymousClass8B4 {
    public static boolean A18;
    public long A00;
    public View A01;
    public Toolbar A02;
    public RecyclerView A03;
    public ViewPager2 A04;
    public AnonymousClass6ZQ A05;
    public AnonymousClass1KB A06;
    public C24771Lp A07;
    public AnonymousClass1PM A08;
    public AnonymousClass11C A09;
    public AnonymousClass11P A0A;
    public AnonymousClass118 A0B;
    public C18000vb A0C;
    public C18030ve A0D;
    public GalleryDropdownFilterFragment A0E;
    public C34501ka A0F;
    public AnonymousClass87Y A0G;
    public C58432kg A0H;
    public C18010vc A0I;
    public AnonymousClass7FZ A0J;
    public C26521Sl A0K;
    public AnonymousClass10I A0L;
    public WDSFab A0M;
    public AnonymousClass00H A0N;
    public AnonymousClass00H A0O;
    public AnonymousClass00H A0P;
    public AnonymousClass00H A0Q;
    public AnonymousClass00H A0R;
    public AnonymousClass00H A0S;
    public AnonymousClass00H A0T;
    public AnonymousClass00H A0U;
    public AnonymousClass00H A0V;
    public AnonymousClass00H A0W;
    public AnonymousClass00H A0X;
    public AnonymousClass00H A0Y;
    public AnonymousClass00H A0Z;
    public AnonymousClass00H A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e = true;
    public boolean A0f;
    public boolean A0g = true;
    public C28931bI A0h;
    public final Handler A0i;
    public final AnonymousClass02n A0j;
    public final AnonymousClass73D A0k = new AnonymousClass73D();
    public final Set A0l;
    public final C18100vl A0m;
    public final C18100vl A0n;
    public final C18100vl A0o;
    public final C18100vl A0p;
    public final C18100vl A0q;
    public final C18100vl A0r;
    public final C18100vl A0s;
    public final C18100vl A0t;
    public final C18100vl A0u;
    public final C18100vl A0v;
    public final C18100vl A0w;
    public final C18100vl A0x;
    public final C18100vl A0y;
    public final C18100vl A0z;
    public final C18100vl A10;
    public final C18100vl A11;
    public final C18100vl A12;
    public final C18100vl A13;
    public final C18100vl A14;
    public final C18100vl A15;
    public final int A16;
    public final C138446x5 A17 = new C138446x5();

    private final void A0D(Activity activity, AnonymousClass1BI r11, List list) {
        String str;
        Activity activity2 = activity;
        AnonymousClass1PM r1 = this.A08;
        if (r1 != null) {
            AnonymousClass1BI r5 = r11;
            if (AnonymousClass747.A04(r1, r11, list.size())) {
                AnonymousClass00H r0 = this.A0Y;
                if (r0 != null) {
                    r0.get();
                    Intent A0Q2 = AnonymousClass1LU.A0Q(activity2, (Uri) list.get(0), r5, (String) null, (String) null, false);
                    C18070vi.A0X(A0Q2);
                    activity.startActivityForResult(A0Q2, 36);
                    return;
                }
                str = "waIntents";
            } else if (activity instanceof AnonymousClass88L) {
                ((AnonymousClass88L) activity2).CHW(C17880vN.A10(list));
                return;
            } else {
                Intent A0A2 = C17880vN.A0A();
                A0A2.putExtra("bucket_uri", C108955ca.A0B(this).getData());
                A0A2.putParcelableArrayListExtra("android.intent.extra.STREAM", C17880vN.A10(list));
                C72453Mb.A16(activity, A0A2);
                return;
            }
        } else {
            str = "verifiedNameManager";
        }
        C18070vi.A11(str);
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d8, code lost:
        r0 = r11.A06(r14);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0M(com.whatsapp.gallery.GalleryTabHostFragment r11, X.AnonymousClass8B2 r12, java.lang.String r13, java.util.List r14, java.util.List r15) {
        /*
            r10 = r11
            X.7DY r8 = A05(r11)
            java.util.ArrayList r2 = X.C29351c6.A0E(r14)
            java.util.Iterator r1 = r14.iterator()
        L_0x000d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0017
            X.C108995ce.A1P(r2, r1)
            goto L_0x000d
        L_0x0017:
            java.util.ArrayList r7 = X.C17880vN.A10(r2)
            java.util.Set r0 = X.C29431cG.A12(r7)
            A0g(r11, r0)
            A0e(r11, r13, r7, r15)
            if (r8 == 0) goto L_0x007c
            X.1FU r0 = r8.A0H
            if (r0 == 0) goto L_0x007c
            boolean r0 = r14.isEmpty()
            if (r0 != 0) goto L_0x011f
            X.6wp r6 = r11.A06(r14)
            java.util.ArrayList r12 = X.C29351c6.A0E(r14)
            java.util.Iterator r1 = r14.iterator()
        L_0x003d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0047
            X.C108995ce.A1P(r12, r1)
            goto L_0x003d
        L_0x0047:
            java.lang.String r4 = r6.A03
            if (r4 == 0) goto L_0x0077
            android.view.View r3 = r6.A01
            if (r3 == 0) goto L_0x0077
            r0 = 1
            X.0yx[] r2 = new X.C19760yx[r0]
            X.0yx r1 = new X.0yx
            r1.<init>(r3, r4)
            r0 = 0
            r2[r0] = r1
            java.util.ArrayList r13 = X.AnonymousClass1ZU.A06(r2)
        L_0x005e:
            android.graphics.Bitmap r9 = r6.A00
            X.8B2 r11 = r6.A02
            X.5np r0 = r10.A07()
            if (r0 == 0) goto L_0x0075
            com.whatsapp.gallery.GalleryRecentsFragment r0 = X.C113825np.A00(r0)
            if (r0 == 0) goto L_0x0075
            boolean r15 = r0.A0A
        L_0x0070:
            r14 = 4
            r8.A0r(r9, r10, r11, r12, r13, r14, r15)
            return
        L_0x0075:
            r15 = 0
            goto L_0x0070
        L_0x0077:
            java.util.ArrayList r13 = X.AnonymousClass000.A13()
            goto L_0x005e
        L_0x007c:
            r3 = 101(0x65, float:1.42E-43)
            r4 = 0
            if (r12 == 0) goto L_0x00d2
            int r0 = r14.size()
            boolean r0 = r11.A0o(r0)
            if (r0 == 0) goto L_0x00d2
            X.0ve r2 = r11.A0D
            if (r2 == 0) goto L_0x00ce
            r1 = 10968(0x2ad8, float:1.537E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x00d2
            X.6wp r6 = r11.A06(r14)
            android.net.Uri r1 = r12.BLl()
            X.6yo r0 = r11.A08(r7)
            r0.A06 = r1
            r0.A07 = r1
            android.content.Intent r5 = r0.A01()
            X.1FL r2 = r11.A1B()
            if (r2 == 0) goto L_0x00ca
            android.view.View r1 = r6.A01
            if (r1 == 0) goto L_0x00ca
            java.lang.String r0 = r6.A03
            if (r0 == 0) goto L_0x00ca
            android.app.ActivityOptions r1 = X.C123546Uw.A00(r2, r1, r0)
            X.5hM r0 = new X.5hM
            r0.<init>(r1)
            android.app.ActivityOptions r0 = r0.A00
            android.os.Bundle r4 = r0.toBundle()
        L_0x00ca:
            r11.A1P(r5, r3, r4)
            return
        L_0x00ce:
            X.AnonymousClass3MW.A1A()
            throw r4
        L_0x00d2:
            X.1FL r2 = r11.A1B()
            if (r2 == 0) goto L_0x00f3
            X.6wp r0 = r11.A06(r14)
            android.view.View r1 = r0.A01
            if (r1 == 0) goto L_0x00f3
            java.lang.String r0 = r0.A03
            if (r0 == 0) goto L_0x00f3
            android.app.ActivityOptions r1 = X.C123546Uw.A00(r2, r1, r0)
            X.5hM r0 = new X.5hM
            r0.<init>(r1)
            android.app.ActivityOptions r0 = r0.A00
            android.os.Bundle r4 = r0.toBundle()
        L_0x00f3:
            java.util.ArrayList r2 = X.C29351c6.A0E(r14)
            java.util.Iterator r1 = r14.iterator()
        L_0x00fb:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0105
            X.C108995ce.A1P(r2, r1)
            goto L_0x00fb
        L_0x0105:
            java.util.ArrayList r0 = X.C17880vN.A10(r2)
            X.6yo r0 = r11.A08(r0)
            android.content.Intent r2 = r0.A01()
            if (r12 == 0) goto L_0x011c
            android.net.Uri r1 = r12.BLl()
            java.lang.String r0 = "preselected_image_uri"
            r2.putExtra(r0, r1)
        L_0x011c:
            r11.A1P(r2, r3, r4)
        L_0x011f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallery.GalleryTabHostFragment.A0M(com.whatsapp.gallery.GalleryTabHostFragment, X.8B2, java.lang.String, java.util.List, java.util.List):void");
    }

    public static final boolean A0r(GalleryTabHostFragment galleryTabHostFragment, String str) {
        Intent intent;
        AnonymousClass1FL A1B = galleryTabHostFragment.A1B();
        if (A1B == null || (intent = A1B.getIntent()) == null || !intent.hasExtra(str)) {
            return false;
        }
        return intent.getBooleanExtra(str, false);
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return AnonymousClass3MX.A0B(layoutInflater, viewGroup, 2131625435, false);
    }

    /* JADX WARNING: type inference failed for: r12v1, types: [X.1Dh, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x031f, code lost:
        if (java.lang.Integer.valueOf(r8) != null) goto L_0x0321;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A21(android.os.Bundle r53, android.view.View r54) {
        /*
            r52 = this;
            r1 = 0
            r7 = r54
            X.C18070vi.A0d(r7, r1)
            r0 = r52
            X.11P r2 = r0.A0A
            if (r2 == 0) goto L_0x0616
            long r2 = android.os.SystemClock.elapsedRealtime()
            r0.A00 = r2
            X.0vl r11 = r0.A0o
            com.whatsapp.gallery.viewmodel.GalleryTabsViewModel r6 = X.C108945cZ.A0g(r11)
            X.1FL r3 = r0.A1B()
            r2 = 0
            if (r3 == 0) goto L_0x002e
            android.content.Intent r5 = r3.getIntent()
            if (r5 == 0) goto L_0x002e
            java.lang.String r4 = "gallery_picker_action"
            r3 = -1
            int r3 = r5.getIntExtra(r4, r3)
            r6.A00 = r3
        L_0x002e:
            boolean r3 = X.AnonymousClass000.A1W(r53)
            r0.A0d = r3
            X.7DY r26 = A05(r0)
            X.118 r3 = r0.A0B
            if (r3 == 0) goto L_0x0610
            android.content.res.Resources r24 = X.AnonymousClass3MW.A05(r3)
            int r48 = A00(r0)
            X.0vl r10 = r0.A0r
            boolean r49 = X.C72453Mb.A1a(r10)
            java.lang.String r43 = A0B(r0)
            java.lang.String r44 = A0A(r0)
            boolean r50 = r0.A0k()
            long r22 = A04(r0)
            java.lang.String r45 = A0C(r0)
            int r21 = A01(r0)
            android.content.Intent r6 = X.C108995ce.A0D(r0)
            r20 = 0
            if (r6 == 0) goto L_0x0077
            java.lang.String r5 = "skip_max_items_new_limit"
            boolean r4 = r6.hasExtra(r5)
            r3 = 1
            if (r4 != r3) goto L_0x0077
            boolean r20 = r6.getBooleanExtra(r5, r1)
        L_0x0077:
            X.1FL r3 = r0.A1B()
            r46 = 0
            if (r3 == 0) goto L_0x008b
            android.content.Intent r3 = r3.getIntent()
            if (r3 == 0) goto L_0x008b
            java.lang.String r4 = "mentions"
            java.lang.String r46 = X.C108995ce.A0W(r3, r4)
        L_0x008b:
            android.content.Intent r4 = X.C108995ce.A0D(r0)
            r19 = 0
            if (r4 == 0) goto L_0x00a3
            java.lang.String r3 = "is_in_multi_select_mode_only"
            boolean r5 = r4.hasExtra(r3)
            if (r5 == 0) goto L_0x00a3
            boolean r3 = r4.getBooleanExtra(r3, r1)
            boolean r19 = X.C108975cc.A1B(r3)
        L_0x00a3:
            android.content.Intent r6 = X.C108995ce.A0D(r0)
            r8 = 0
            if (r6 == 0) goto L_0x00b8
            java.lang.String r5 = "picker_open_time"
            boolean r4 = r6.hasExtra(r5)
            r3 = 1
            if (r4 != r3) goto L_0x00b8
            long r8 = r6.getLongExtra(r5, r8)
        L_0x00b8:
            X.1FL r3 = r0.A1B()
            if (r3 == 0) goto L_0x05f1
            android.content.Intent r6 = r3.getIntent()
            r5 = 1
            if (r6 == 0) goto L_0x05f1
            java.lang.String r4 = "should_send_media"
            boolean r3 = r6.hasExtra(r4)
            if (r3 != r5) goto L_0x05f1
            boolean r18 = r6.getBooleanExtra(r4, r5)
        L_0x00d1:
            X.1FL r3 = r0.A1B()
            if (r3 == 0) goto L_0x05ed
            android.content.Intent r6 = r3.getIntent()
            if (r6 == 0) goto L_0x05ed
            java.lang.String r5 = "should_hide_caption_view"
            boolean r4 = r6.hasExtra(r5)
            r3 = 1
            if (r4 != r3) goto L_0x05ed
            boolean r17 = r6.getBooleanExtra(r5, r1)
        L_0x00ea:
            android.content.Intent r6 = X.C108995ce.A0D(r0)
            r16 = 0
            if (r6 == 0) goto L_0x00ff
            java.lang.String r5 = "should_set_gallery_result"
            boolean r4 = r6.hasExtra(r5)
            r3 = 1
            if (r4 != r3) goto L_0x00ff
            boolean r16 = r6.getBooleanExtra(r5, r1)
        L_0x00ff:
            int r15 = A02(r0)
            boolean r14 = r0.A0n()
            X.1FL r3 = r0.A1B()
            if (r3 == 0) goto L_0x05ea
            android.content.Intent r6 = r3.getIntent()
            if (r6 == 0) goto L_0x05ea
            java.lang.String r5 = "disable_shared_activity_transition_animation"
            boolean r4 = r6.hasExtra(r5)
            r3 = 1
            if (r4 != r3) goto L_0x05ea
            boolean r13 = r6.getBooleanExtra(r5, r1)
        L_0x0120:
            boolean r51 = A0q(r0)
            java.lang.String r3 = "send_media_preview_params_as_result"
            boolean r12 = A0r(r0, r3)
            X.1FL r3 = r0.A1B()
            if (r3 == 0) goto L_0x05e6
            android.content.Intent r5 = r3.getIntent()
            if (r5 == 0) goto L_0x05e6
            java.lang.String r4 = "standalone_add_button_provider_key"
            boolean r6 = r5.hasExtra(r4)
            r3 = 1
            if (r6 != r3) goto L_0x05e6
            java.lang.String r47 = r5.getStringExtra(r4)
        L_0x0143:
            java.lang.String r3 = "apply_rotation_on_not_send"
            boolean r5 = A0r(r0, r3)
            com.whatsapp.gallery.viewmodel.GalleryTabsViewModel r3 = X.C108945cZ.A0g(r11)
            int r4 = r3.A00
            java.lang.Integer r40 = java.lang.Integer.valueOf(r4)
            r3 = -1
            if (r4 != r3) goto L_0x0158
            r40 = 0
        L_0x0158:
            java.lang.String r3 = "enable_template_tool"
            boolean r3 = A0r(r0, r3)
            X.C18070vi.A0b(r24)
            java.lang.Long r41 = java.lang.Long.valueOf(r22)
            java.lang.Integer r38 = java.lang.Integer.valueOf(r21)
            java.lang.Boolean r28 = java.lang.Boolean.valueOf(r20)
            java.lang.Boolean r29 = java.lang.Boolean.valueOf(r19)
            java.lang.Boolean r30 = java.lang.Boolean.valueOf(r14)
            java.lang.Long r42 = java.lang.Long.valueOf(r8)
            java.lang.Boolean r31 = java.lang.Boolean.valueOf(r18)
            java.lang.Boolean r32 = java.lang.Boolean.valueOf(r17)
            java.lang.Boolean r33 = java.lang.Boolean.valueOf(r16)
            java.lang.Boolean r34 = java.lang.Boolean.valueOf(r13)
            java.lang.Integer r39 = java.lang.Integer.valueOf(r15)
            java.lang.Boolean r35 = java.lang.Boolean.valueOf(r12)
            java.lang.Boolean r36 = java.lang.Boolean.valueOf(r5)
            java.lang.Boolean r37 = java.lang.Boolean.valueOf(r3)
            X.5np r3 = new X.5np
            r27 = r0
            r23 = r3
            r25 = r0
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51)
            r4 = 2131431076(0x7f0b0ea4, float:1.848387E38)
            android.view.View r5 = r7.findViewById(r4)
            androidx.viewpager2.widget.ViewPager2 r5 = (androidx.viewpager2.widget.ViewPager2) r5
            r5.setAdapter(r3)
            X.0vl r3 = r0.A11
            java.lang.Object r3 = r3.getValue()
            X.C6T r3 = (X.C6T) r3
            r5.A04(r3)
            android.view.View r4 = r5.getChildAt(r1)
            boolean r3 = r4 instanceof androidx.recyclerview.widget.RecyclerView
            if (r3 == 0) goto L_0x01c8
            if (r4 == 0) goto L_0x01c8
            r4.setNestedScrollingEnabled(r1)
        L_0x01c8:
            r0.A04 = r5
            boolean r3 = A0q(r0)
            if (r3 == 0) goto L_0x05c6
            X.1GP r3 = r0.A1E()
            java.lang.String r6 = "gallery_filter_fragment"
            androidx.fragment.app.Fragment r3 = r3.A0Q(r6)
            if (r3 != 0) goto L_0x05b2
            com.whatsapp.gallerypicker.GalleryDropdownFilterFragment r8 = new com.whatsapp.gallerypicker.GalleryDropdownFilterFragment
            r8.<init>()
            r3 = 3
            X.1D6[] r5 = new X.AnonymousClass1D6[r3]
            int r3 = A00(r0)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            java.lang.String r3 = "include"
            X.AnonymousClass1D6.A03(r3, r4, r5, r1)
            java.lang.Object r4 = r10.getValue()
            java.lang.String r3 = "is_coming_from_chat"
            X.C108985cd.A1G(r3, r4, r5)
            X.0vl r3 = r0.A0p
            boolean r3 = X.C72453Mb.A1a(r3)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            java.lang.String r3 = "picker_redesign"
            X.C72463Mc.A1I(r3, r4, r5)
            X.AnonymousClass3MX.A1I(r8, r5)
            com.whatsapp.gallery.viewmodel.GalleryTabsViewModel r5 = X.C108945cZ.A0g(r11)
            X.00H r3 = r5.A08
            java.lang.Object r4 = r3.get()
            java.util.Map r4 = (java.util.Map) r4
            int r3 = r5.A00
            java.lang.Object r3 = X.AnonymousClass000.A0w(r4, r3)
            X.8A9 r3 = (X.AnonymousClass8A9) r3
            if (r3 == 0) goto L_0x0235
            java.lang.Integer r3 = r3.BaU()
            if (r3 == 0) goto L_0x0235
            int r5 = r3.intValue()
            android.os.Bundle r4 = r8.A06
            if (r4 == 0) goto L_0x0235
            java.lang.String r3 = "arg_action_picker_title"
            r4.putInt(r3, r5)
        L_0x0235:
            X.1jj r4 = X.C72453Mb.A0Y(r0)
            r3 = 2131436270(0x7f0b22ee, float:1.8494406E38)
            r4.A0C(r8, r6, r3)
            r4.A01()
            r0.A0E = r8
        L_0x0244:
            X.0vl r3 = r0.A0n
            java.lang.Object r3 = r3.getValue()
            com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel r3 = (com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel) r3
            X.1Dg r6 = r3.A04
            X.1q9 r5 = r0.A1G()
            X.7zv r4 = new X.7zv
            r4.<init>(r0)
            r3 = 32
            X.AnonymousClass7AT.A01(r5, r6, r4, r3)
        L_0x025c:
            r0.A0G(r7, r1)
            r3 = 2131436270(0x7f0b22ee, float:1.8494406E38)
            android.view.View r8 = X.AnonymousClass3MX.A0C(r7, r3)
            androidx.appcompat.widget.Toolbar r8 = (androidx.appcompat.widget.Toolbar) r8
            A0H(r8, r0)
            r4 = 24
            X.4dH r3 = new X.4dH
            r3.<init>(r0, r4)
            r8.setNavigationOnClickListener(r3)
            android.content.Context r6 = r8.getContext()
            android.content.Context r5 = r8.getContext()
            r4 = 2130969991(0x7f040587, float:1.754868E38)
            r3 = 2131101077(0x7f060595, float:1.7814553E38)
            int r3 = X.AnonymousClass3MZ.A02(r5, r6, r4, r3)
            r8.setTitleTextColor((int) r3)
            android.view.Menu r4 = r8.getMenu()
            X.C18070vi.A0X(r4)
            boolean r3 = A0q(r0)
            if (r3 == 0) goto L_0x058c
            androidx.viewpager2.widget.ViewPager2 r3 = r0.A04
            if (r3 == 0) goto L_0x0589
            int r3 = r3.A00
        L_0x029d:
            A0J(r0, r3)
        L_0x02a0:
            r4 = 3
            X.79q r3 = new X.79q
            r3.<init>(r0, r4)
            r8.A0C = r3
            X.1FL r3 = r0.A1D()
            boolean r3 = r3 instanceof com.whatsapp.gallerypicker.GalleryPickerBottomSheetActivity
            if (r3 == 0) goto L_0x02d5
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            java.lang.String r3 = "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams"
            X.C18070vi.A0z(r9, r3)
            android.view.ViewGroup$MarginLayoutParams r9 = (android.view.ViewGroup.MarginLayoutParams) r9
            android.content.res.Resources r4 = X.AnonymousClass3MZ.A09(r0)
            r3 = 2131169533(0x7f0710fd, float:1.7953399E38)
            int r6 = r4.getDimensionPixelSize(r3)
            int r5 = r9.leftMargin
            int r4 = r9.rightMargin
            int r3 = r9.bottomMargin
            r9.setMargins(r5, r6, r4, r3)
            r8.setLayoutParams(r9)
            r8.requestLayout()
        L_0x02d5:
            int r4 = A02(r0)
            r3 = 2
            if (r4 == r3) goto L_0x0574
            r3 = 15
            if (r4 == r3) goto L_0x0574
            r3 = 18
            if (r4 == r3) goto L_0x0574
            r3 = 56
            if (r4 == r3) goto L_0x0574
            r3 = 58
            if (r4 == r3) goto L_0x0574
            r3 = 7
            if (r4 == r3) goto L_0x0574
            r3 = 8
            if (r4 == r3) goto L_0x0574
            r3 = 12
            if (r4 == r3) goto L_0x0574
            r3 = 13
            if (r4 == r3) goto L_0x0574
        L_0x02fb:
            boolean r3 = A0q(r0)
            if (r3 != 0) goto L_0x039d
            X.1FL r3 = r0.A1B()
            r12 = 0
            if (r3 == 0) goto L_0x056c
            android.content.Intent r5 = r3.getIntent()
            if (r5 == 0) goto L_0x056c
            java.lang.String r4 = "default_tab"
            boolean r3 = r5.hasExtra(r4)
            if (r3 == 0) goto L_0x056c
            r3 = 1
            int r8 = r5.getIntExtra(r4, r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            if (r3 == 0) goto L_0x056c
        L_0x0321:
            X.0vl r4 = r0.A0n
            java.lang.Object r3 = r4.getValue()
            com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel r3 = (com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel) r3
            X.1DT r3 = r3.A09
            X.AnonymousClass3MX.A1J(r3, r8)
            X.1FL r3 = r0.A1B()
            boolean r3 = r3 instanceof com.whatsapp.gallerypicker.GalleryPicker
            if (r3 == 0) goto L_0x0396
            java.lang.Integer r3 = com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel.A00(r4)
            if (r3 == 0) goto L_0x0396
            int r9 = r3.intValue()
            X.1FL r3 = r0.A1B()
            r5 = -1
            if (r3 == 0) goto L_0x0569
            android.content.Intent r4 = r3.getIntent()
            if (r4 == 0) goto L_0x0569
            java.lang.String r3 = "media_sharing_user_journey_chat_type"
            int r3 = r4.getIntExtra(r3, r5)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r3)
        L_0x0357:
            X.1FL r3 = r0.A1B()
            if (r3 == 0) goto L_0x036d
            android.content.Intent r4 = r3.getIntent()
            if (r4 == 0) goto L_0x036d
            java.lang.String r3 = "media_sharing_user_journey_start_target"
            int r3 = r4.getIntExtra(r3, r5)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r3)
        L_0x036d:
            int r3 = A03(r0)
            if (r3 <= 0) goto L_0x0396
            X.A4v r6 = X.C108985cd.A0b(r0)
            int r5 = A03(r0)
            if (r12 == 0) goto L_0x0565
            int r4 = r12.intValue()
            if (r4 <= 0) goto L_0x0565
        L_0x0383:
            if (r10 != 0) goto L_0x0393
            X.1Dv r3 = X.AnonymousClass1BI.A00
            java.lang.String r3 = A0B(r0)
            X.1BI r3 = X.C22931Dv.A01(r3)
            java.lang.Integer r10 = X.AnonymousClass6WK.A00(r3)
        L_0x0393:
            r6.A03(r10, r9, r5, r4)
        L_0x0396:
            androidx.viewpager2.widget.ViewPager2 r3 = r0.A04
            if (r3 == 0) goto L_0x039d
            r3.A03(r8, r1)
        L_0x039d:
            X.0vl r8 = r0.A0x
            java.lang.Object r5 = r8.getValue()
            com.whatsapp.mediacomposer.viewmodel.MediaQualityViewModel r5 = (com.whatsapp.mediacomposer.viewmodel.MediaQualityViewModel) r5
            boolean r3 = r0.A0l()
            if (r3 == 0) goto L_0x0562
            X.0vl r3 = r0.A0u
            java.lang.Object r3 = r3.getValue()
            X.6wV r3 = (X.C138086wV) r3
            boolean r3 = X.C138766xe.A00(r3)
            if (r3 != 0) goto L_0x0562
            boolean r3 = r0.A0m()
            if (r3 != 0) goto L_0x0562
            X.6kY r3 = com.whatsapp.mediacomposer.viewmodel.MediaJidViewModel.A00(r0)
            X.0vl r3 = r3.A09
            boolean r3 = X.C72453Mb.A1a(r3)
            if (r3 != 0) goto L_0x0562
            X.00H r3 = r0.A0Z
            if (r3 == 0) goto L_0x0601
            X.0z4 r3 = X.C17880vN.A0K(r3)
            int r4 = r3.A0F()
        L_0x03d7:
            X.1DT r3 = r5.A01
            X.AnonymousClass3MX.A1J(r3, r4)
            com.whatsapp.gallery.viewmodel.GalleryTabsViewModel r3 = X.C108945cZ.A0g(r11)
            X.1DT r5 = r3.A05
            X.1q9 r4 = r0.A1G()
            X.7zx r3 = new X.7zx
            r3.<init>(r0)
            r6 = 32
            X.AnonymousClass7AT.A01(r4, r5, r3, r6)
            boolean r3 = A0q(r0)
            if (r3 != 0) goto L_0x0408
            com.whatsapp.gallery.viewmodel.GalleryTabsViewModel r3 = X.C108945cZ.A0g(r11)
            X.1DT r5 = r3.A04
            X.1q9 r4 = r0.A1G()
            X.7zy r3 = new X.7zy
            r3.<init>(r0)
            X.AnonymousClass7AT.A01(r4, r5, r3, r6)
        L_0x0408:
            X.0vl r3 = r0.A0q
            boolean r3 = X.C72453Mb.A1a(r3)
            if (r3 == 0) goto L_0x0439
            X.00H r3 = r0.A0S
            if (r3 == 0) goto L_0x05fb
            java.lang.Object r5 = r3.get()
            X.6q7 r5 = (X.C134146q7) r5
            X.6kY r4 = com.whatsapp.mediacomposer.viewmodel.MediaJidViewModel.A00(r0)
            X.0vl r3 = r0.A0u
            java.lang.Object r3 = r3.getValue()
            X.6wV r3 = (X.C138086wV) r3
            A02(r0)
            r5.A01(r3, r4, r1, r1)
            X.00H r3 = r0.A0S
            if (r3 == 0) goto L_0x05fb
            java.lang.Object r4 = r3.get()
            X.6q7 r4 = (X.C134146q7) r4
            r3 = 1
            r4.A02 = r3
        L_0x0439:
            com.whatsapp.gallery.viewmodel.GalleryTabsViewModel r6 = X.C108945cZ.A0g(r11)
            X.1q9 r5 = r0.A1G()
            r3 = 21
            X.7AO r4 = new X.7AO
            r4.<init>(r0, r3)
            X.1DT r3 = r6.A06
            X.1Dg r3 = X.C22791Df.A00(r3)
            r3.A0A(r5, r4)
            java.lang.Object r6 = r8.getValue()
            com.whatsapp.mediacomposer.viewmodel.MediaQualityViewModel r6 = (com.whatsapp.mediacomposer.viewmodel.MediaQualityViewModel) r6
            X.1q9 r5 = r0.A1G()
            r3 = 25
            X.7AO r4 = new X.7AO
            r4.<init>(r0, r3)
            X.1DT r3 = r6.A01
            X.1Dg r3 = X.C22791Df.A00(r3)
            r3.A0A(r5, r4)
            X.7DY r3 = A05(r0)
            if (r3 == 0) goto L_0x0474
            r0.A29(r1)
        L_0x0474:
            com.whatsapp.gallery.viewmodel.GalleryTabsViewModel r6 = X.C108945cZ.A0g(r11)
            X.1FL r5 = r0.A1B()
            if (r5 == 0) goto L_0x048c
            X.1OX r4 = X.C41561wd.A00(r6)
            X.0wl r3 = r6.A0A
            com.whatsapp.gallery.viewmodel.GalleryTabsViewModel$evaluateGoogleIntent$1 r1 = new com.whatsapp.gallery.viewmodel.GalleryTabsViewModel$evaluateGoogleIntent$1
            r1.<init>(r5, r6, r2)
            X.AnonymousClass3MW.A1X(r3, r1, r4)
        L_0x048c:
            java.lang.String r3 = A0A(r0)
            X.1DT r1 = r6.A03
            if (r3 != 0) goto L_0x0496
            java.lang.String r3 = ""
        L_0x0496:
            r1.A0F(r3)
            X.1FL r1 = r0.A1B()
            if (r1 == 0) goto L_0x04ba
            android.content.Intent r5 = r1.getIntent()
            if (r5 == 0) goto L_0x04ba
            java.lang.String r4 = "mentions"
            boolean r3 = r5.hasExtra(r4)
            r1 = 1
            if (r3 != r1) goto L_0x04ba
            java.lang.String r1 = r5.getStringExtra(r4)
            if (r1 == 0) goto L_0x04ba
            java.util.ArrayList r1 = X.AnonymousClass4aJ.A03(r1)
            if (r1 != 0) goto L_0x04bc
        L_0x04ba:
            X.0wS r1 = X.C18460wS.A00
        L_0x04bc:
            r6.A02 = r1
            r1 = 2131431072(0x7f0b0ea0, float:1.8483863E38)
            android.view.View r6 = X.C18070vi.A05(r7, r1)
            r1 = 2131435132(0x7f0b1e7c, float:1.8492098E38)
            android.view.View r3 = r6.findViewById(r1)
            r1 = 5
            X.C1422478s.A00(r3, r1)
            X.1FL r3 = r0.A1B()
            boolean r1 = r3 instanceof com.whatsapp.gallerypicker.GalleryPickerBottomSheetActivity
            if (r1 == 0) goto L_0x0528
            r1 = r3
            X.1FU r1 = (X.AnonymousClass1FU) r1
            if (r1 == 0) goto L_0x0528
            com.whatsapp.gallerypicker.GalleryPickerBottomSheetActivity r3 = (com.whatsapp.gallerypicker.GalleryPickerBottomSheetActivity) r3
            if (r3 == 0) goto L_0x0528
            com.google.android.material.bottomsheet.BottomSheetBehavior r5 = r3.A00
            if (r5 == 0) goto L_0x05f5
            android.view.View r2 = r1.A00
            r1 = 2131431065(0x7f0b0e99, float:1.8483849E38)
            android.view.View r4 = X.C18070vi.A05(r2, r1)
            android.graphics.Rect r3 = X.AnonymousClass3MW.A07()
            X.5qQ r1 = new X.5qQ
            r1.<init>(r3, r6, r0)
            r5.A0Z(r1)
            r2 = 37
            X.3C4 r1 = new X.3C4
            r1.<init>(r0, r6, r3, r2)
            r4.post(r1)
            X.0vl r1 = r0.A0p
            boolean r1 = X.C72453Mb.A1a(r1)
            if (r1 == 0) goto L_0x0528
            X.1Dh r12 = new X.1Dh
            r12.<init>()
            android.view.View r1 = r0.A0B
            if (r1 == 0) goto L_0x0528
            android.view.ViewTreeObserver r2 = r1.getViewTreeObserver()
            if (r2 == 0) goto L_0x0528
            X.792 r1 = new X.792
            r7 = r1
            r8 = r3
            r9 = r6
            r10 = r5
            r11 = r0
            r7.<init>(r8, r9, r10, r11, r12)
            r2.addOnGlobalLayoutListener(r1)
        L_0x0528:
            X.0vl r1 = r0.A0p
            boolean r1 = X.C72453Mb.A1a(r1)
            if (r1 == 0) goto L_0x0561
            X.0vl r3 = r0.A10
            com.whatsapp.mediacomposer.viewmodel.MediaViewOnceViewModel r2 = X.C108945cZ.A0l(r3)
            X.0vl r1 = r0.A0y
            java.lang.Object r1 = r1.getValue()
            X.6UD r1 = (X.AnonymousClass6UD) r1
            r2.A03 = r1
            com.whatsapp.mediacomposer.viewmodel.MediaViewOnceViewModel r1 = X.C108945cZ.A0l(r3)
            X.0vl r0 = r0.A0u
            java.lang.Object r0 = r0.getValue()
            X.6wV r0 = (X.C138086wV) r0
            r1.A01 = r0
            com.whatsapp.mediacomposer.viewmodel.MediaViewOnceViewModel r2 = X.C108945cZ.A0l(r3)
            r1 = 0
            X.7JR r0 = new X.7JR
            r0.<init>(r1)
            r2.A02 = r0
            com.whatsapp.mediacomposer.viewmodel.MediaViewOnceViewModel r0 = X.C108945cZ.A0l(r3)
            r0.A0V()
        L_0x0561:
            return
        L_0x0562:
            r4 = 0
            goto L_0x03d7
        L_0x0565:
            r4 = 25
            goto L_0x0383
        L_0x0569:
            r10 = r2
            goto L_0x0357
        L_0x056c:
            X.0vl r3 = r0.A0m
            int r8 = X.C72453Mb.A0I(r3)
            goto L_0x0321
        L_0x0574:
            boolean r3 = A0q(r0)
            if (r3 != 0) goto L_0x02fb
            X.0vl r3 = r0.A0n
            java.lang.Object r3 = r3.getValue()
            com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel r3 = (com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel) r3
            X.1DT r3 = r3.A09
            X.AnonymousClass3MX.A1J(r3, r1)
            goto L_0x039d
        L_0x0589:
            r3 = 0
            goto L_0x029d
        L_0x058c:
            r3 = 2131432784(0x7f0b1550, float:1.8487335E38)
            android.view.MenuItem r3 = r4.findItem(r3)
            android.view.SubMenu r4 = r3.getSubMenu()
            int r6 = A00(r0)
            X.118 r5 = r0.A0B
            if (r5 == 0) goto L_0x060a
            X.82I r3 = new X.82I
            r3.<init>(r4, r0)
            X.6Lu r4 = new X.6Lu
            r4.<init>(r0, r5, r3, r6)
            X.10I r3 = r0.A0L
            if (r3 == 0) goto L_0x0607
            X.AnonymousClass3MW.A1T(r4, r3, r1)
            goto L_0x02a0
        L_0x05b2:
            X.1GP r3 = r0.A1E()
            androidx.fragment.app.Fragment r4 = r3.A0Q(r6)
            boolean r3 = r4 instanceof com.whatsapp.gallerypicker.GalleryDropdownFilterFragment
            if (r3 == 0) goto L_0x05c4
            com.whatsapp.gallerypicker.GalleryDropdownFilterFragment r4 = (com.whatsapp.gallerypicker.GalleryDropdownFilterFragment) r4
        L_0x05c0:
            r0.A0E = r4
            goto L_0x0244
        L_0x05c4:
            r4 = r2
            goto L_0x05c0
        L_0x05c6:
            r3 = 2131431073(0x7f0b0ea1, float:1.8483865E38)
            X.1bI r3 = X.C72453Mb.A0s(r7, r3)
            android.view.View r6 = r3.A02()
            com.google.android.material.tabs.TabLayout r6 = (com.google.android.material.tabs.TabLayout) r6
            androidx.viewpager2.widget.ViewPager2 r5 = r0.A04
            if (r5 == 0) goto L_0x025c
            X.4gP r4 = new X.4gP
            r4.<init>(r5, r1)
            X.6pt r3 = new X.6pt
            r3.<init>(r5, r6, r4)
            r3.A00()
            goto L_0x025c
        L_0x05e6:
            r47 = r2
            goto L_0x0143
        L_0x05ea:
            r13 = 0
            goto L_0x0120
        L_0x05ed:
            r17 = 0
            goto L_0x00ea
        L_0x05f1:
            r18 = 1
            goto L_0x00d1
        L_0x05f5:
            java.lang.String r0 = "contentSheetBehaviour"
            X.C18070vi.A11(r0)
            throw r2
        L_0x05fb:
            java.lang.String r0 = "optimisticUploadController"
            X.C18070vi.A11(r0)
            throw r2
        L_0x0601:
            java.lang.String r0 = "waSharedPreferences"
            X.C18070vi.A11(r0)
            throw r2
        L_0x0607:
            java.lang.String r0 = "waWorkers"
            goto L_0x060c
        L_0x060a:
            java.lang.String r0 = "waContext"
        L_0x060c:
            X.C18070vi.A11(r0)
            throw r2
        L_0x0610:
            java.lang.String r0 = "waContext"
            X.C18070vi.A11(r0)
            throw r2
        L_0x0616:
            java.lang.String r0 = "time"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallery.GalleryTabHostFragment.A21(android.os.Bundle, android.view.View):void");
    }

    public C136156tM A26() {
        String str;
        Intent intent;
        AnonymousClass1FL A1D = A1D();
        AnonymousClass778 A092 = A09();
        Boolean bool = null;
        if (A092 != null) {
            str = A092.A02;
        } else {
            str = null;
        }
        AnonymousClass778 A093 = A09();
        if (A093 != null) {
            bool = A093.A00;
        }
        String A0B2 = A0B(this);
        AnonymousClass1FL A1B = A1B();
        int i = 10;
        if (!(A1B == null || (intent = A1B.getIntent()) == null)) {
            i = intent.getIntExtra("sticker_picker_origin", 10);
        }
        return new C136156tM(this, A1D, bool, str, A0B2, i);
    }

    private final C113825np A07() {
        C38391rD r1;
        ViewPager2 viewPager2 = this.A04;
        if (viewPager2 != null) {
            r1 = viewPager2.A04.A0B;
        } else {
            r1 = null;
        }
        if (r1 instanceof C113825np) {
            return (C113825np) r1;
        }
        return null;
    }

    private final void A0G(View view, boolean z) {
        int i;
        View A022;
        View A023;
        boolean z2 = true;
        if (z || !C72453Mb.A1a(this.A0p)) {
            C28931bI r1 = this.A0h;
            if (r1 == null || r1.A00 == null || (A022 = r1.A02()) == null || A022.getId() != this.A16) {
                z2 = false;
            } else {
                C28931bI r0 = this.A0h;
                if (r0 != null) {
                    r0.A04(8);
                }
            }
            i = 2131431066;
            if (C72453Mb.A1a(this.A0t)) {
                i = 2131431067;
            }
        } else {
            C28931bI r12 = this.A0h;
            if (!(r12 == null || r12.A00 == null || (A023 = r12.A02()) == null)) {
                int id = A023.getId();
                int i2 = 2131431066;
                if (C72453Mb.A1a(this.A0t)) {
                    i2 = 2131431067;
                }
                if (id == i2) {
                    C28931bI r02 = this.A0h;
                    if (r02 != null) {
                        r02.A04(8);
                    }
                    i = this.A16;
                }
            }
            z2 = false;
            i = this.A16;
        }
        C28931bI A0s2 = C72453Mb.A0s(view, i);
        A0s2.A07(new AnonymousClass7NZ(this, view, 0));
        if (z2) {
            A0s2.A04(0);
        }
        this.A0h = A0s2;
    }

    public static final void A0H(Toolbar toolbar, GalleryTabHostFragment galleryTabHostFragment) {
        int i;
        int i2;
        galleryTabHostFragment.A02 = toolbar;
        C139226yS r2 = (C139226yS) GalleryPickerViewModel.A0C(galleryTabHostFragment.A0n);
        if (!(galleryTabHostFragment.A1D() instanceof GalleryPickerBottomSheetActivity) || (A0q(galleryTabHostFragment) && r2 != null && r2.A02 == 9 && r2.A04 != null)) {
            i = 2131231675;
            i2 = 2131898718;
        } else {
            i = 2131231814;
            i2 = 2131898783;
        }
        String A0n2 = AnonymousClass3MY.A0n(galleryTabHostFragment, i2);
        Drawable A042 = AnonymousClass4aX.A04(toolbar.getContext(), toolbar.getContext(), 2130971979, 2131103154, i);
        C18070vi.A0X(A042);
        C18000vb r1 = galleryTabHostFragment.A0C;
        if (r1 != null) {
            toolbar.setNavigationIcon((Drawable) new C74743cP(A042, r1));
            toolbar.setNavigationContentDescription((CharSequence) A0n2);
            return;
        }
        AnonymousClass3MW.A1M();
        throw null;
    }

    public static final void A0f(GalleryTabHostFragment galleryTabHostFragment, Set set) {
        if (C72453Mb.A1a(galleryTabHostFragment.A0q)) {
            ArrayList A132 = AnonymousClass000.A13();
            for (Object next : set) {
                if (((AnonymousClass8B2) next).getType() == 0) {
                    A132.add(next);
                }
            }
            ArrayList A0D2 = C29351c6.A0D(A132);
            Iterator it = A132.iterator();
            while (it.hasNext()) {
                C108995ce.A1P(A0D2, it);
            }
            C41731wy A012 = ((C139266yY) galleryTabHostFragment.A0v.getValue()).A01(galleryTabHostFragment.A1G(), A0D2);
            AnonymousClass7AT.A01(galleryTabHostFragment.A1G(), A012, new C1589382p(A012, galleryTabHostFragment, A0D2), 32);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        if (r2.A04 == null) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0h(com.whatsapp.gallery.GalleryTabHostFragment r7, boolean r8) {
        /*
            X.0vl r6 = r7.A0n
            java.lang.Object r2 = com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel.A0C(r6)
            X.6yS r2 = (X.C139226yS) r2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L_0x0017
            int r1 = r2.A02
            r0 = 9
            if (r1 != r0) goto L_0x0017
            java.lang.String r0 = r2.A04
            r3 = 1
            if (r0 != 0) goto L_0x0018
        L_0x0017:
            r3 = 0
        L_0x0018:
            if (r8 == 0) goto L_0x0031
            java.lang.Integer r0 = com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel.A00(r6)
            if (r0 == 0) goto L_0x0031
            int r2 = r0.intValue()
            X.A4v r1 = X.C108985cd.A0b(r7)
            r0 = 12
            if (r3 == 0) goto L_0x002e
            r0 = 64
        L_0x002e:
            X.C108955ca.A1Q(r1, r0, r5, r2)
        L_0x0031:
            X.5np r0 = r7.A07()
            if (r0 == 0) goto L_0x0049
            com.whatsapp.gallery.GalleryRecentsFragment r0 = X.C113825np.A00(r0)
            boolean r0 = r0.A0A
            if (r0 != r5) goto L_0x0049
            boolean r0 = A0p(r7)
            if (r0 != 0) goto L_0x0049
            A0I(r7)
            return
        L_0x0049:
            if (r3 == 0) goto L_0x0080
            java.lang.Object r5 = r6.getValue()
            com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel r5 = (com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel) r5
            X.1DT r0 = r5.A05
            java.lang.Object r1 = r0.A06()
            X.6TQ r1 = (X.AnonymousClass6TQ) r1
            boolean r0 = r1 instanceof X.C1188165j
            r4 = 0
            if (r0 == 0) goto L_0x007a
            X.65j r1 = (X.C1188165j) r1
            java.util.List r0 = r1.A00
            java.util.Iterator r3 = r0.iterator()
        L_0x0066:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x007a
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.6yS r0 = (X.C139226yS) r0
            int r1 = r0.A02
            r0 = 9
            if (r1 != r0) goto L_0x0066
            r4 = r2
        L_0x007a:
            X.1DT r0 = r5.A08
            r0.A0F(r4)
            return
        L_0x0080:
            r3 = -1
            if (r8 == 0) goto L_0x00af
            X.0vl r0 = r7.A0r
            boolean r0 = X.C72453Mb.A1a(r0)
            if (r0 == 0) goto L_0x00b3
            X.0ve r2 = r7.A0D
            if (r2 == 0) goto L_0x00d1
            r1 = 11376(0x2c70, float:1.5941E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x00b3
            android.content.Intent r1 = X.C17880vN.A0A()
            java.lang.String r0 = "result_extra_discard_selection"
            android.content.Intent r1 = r1.putExtra(r0, r4)
            X.C18070vi.A0X(r1)
            X.1FL r0 = r7.A1B()
            if (r0 == 0) goto L_0x00af
            r0.setResult(r3, r1)
        L_0x00af:
            X.C72463Mc.A1A(r7)
            return
        L_0x00b3:
            X.1FL r0 = r7.A1B()
            if (r0 == 0) goto L_0x00af
            android.content.Intent r1 = r0.getIntent()
            if (r1 == 0) goto L_0x00af
            java.lang.String r0 = "photo_update_surface_type"
            int r0 = r1.getIntExtra(r0, r3)
            if (r0 != r5) goto L_0x00af
            X.1FL r0 = r7.A1B()
            if (r0 == 0) goto L_0x00af
            r0.setResult(r4)
            goto L_0x00af
        L_0x00d1:
            X.AnonymousClass3MW.A1A()
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallery.GalleryTabHostFragment.A0h(com.whatsapp.gallery.GalleryTabHostFragment, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f0, code lost:
        if (r0.A00 != null) goto L_0x00f2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0j(com.whatsapp.gallery.GalleryTabHostFragment r7, boolean r8, boolean r9) {
        /*
            if (r9 == 0) goto L_0x00e4
            X.0vl r0 = r7.A0p
            boolean r0 = X.C72453Mb.A1a(r0)
            if (r0 == 0) goto L_0x00e4
            X.6x5 r5 = r7.A17
            X.1bI r6 = r7.A0h
            com.whatsapp.wds.components.fab.WDSFab r4 = r7.A0M
            if (r6 == 0) goto L_0x0061
            boolean r0 = r5.A03
            if (r0 == r8) goto L_0x0061
            r5.A03 = r8
            boolean r0 = r5.A02
            if (r0 == 0) goto L_0x0058
            r3 = r8 ^ 1
            android.view.ViewPropertyAnimator r0 = r5.A01
            if (r0 == 0) goto L_0x0025
            r0.cancel()
        L_0x0025:
            android.view.ViewPropertyAnimator r0 = r5.A00
            if (r0 == 0) goto L_0x002c
            r0.cancel()
        L_0x002c:
            r2 = 0
            int r0 = X.C72453Mb.A07(r3)
            android.view.View r0 = X.AnonymousClass3MY.A0I(r6, r0)
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.setAlpha(r1)
            if (r4 == 0) goto L_0x0055
            r0 = r3 ^ 1
            if (r0 != 0) goto L_0x0042
            r2 = 8
        L_0x0042:
            r4.setVisibility(r2)
            r4.setAlpha(r1)
            float r0 = X.C108975cc.A00(r3)
            r4.setScaleX(r0)
            if (r3 == 0) goto L_0x0052
            r1 = 0
        L_0x0052:
            r4.setScaleY(r1)
        L_0x0055:
            r0 = 0
            r5.A02 = r0
        L_0x0058:
            boolean r0 = r5.A03
            if (r0 == 0) goto L_0x0062
            if (r4 != 0) goto L_0x00aa
            X.C138446x5.A00(r7, r5, r6)
        L_0x0061:
            return
        L_0x0062:
            android.view.View r2 = X.AnonymousClass3MX.A0D(r6)
            int r0 = r2.getHeight()
            if (r0 != 0) goto L_0x0079
            int r1 = r2.getWidth()
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            X.C72473Md.A12(r2, r1, r0)
            int r0 = r2.getMeasuredHeight()
        L_0x0079:
            float r1 = (float) r0
            android.view.View r0 = r6.A02()
            android.view.ViewPropertyAnimator r0 = r0.animate()
            android.view.ViewPropertyAnimator r2 = r0.translationY(r1)
            r0 = 100
            android.view.ViewPropertyAnimator r1 = r2.setDuration(r0)
            android.view.animation.Interpolator r0 = r5.A04
            android.view.ViewPropertyAnimator r1 = r1.setInterpolator(r0)
            r0 = 41
            X.7Ql r0 = X.C146747Ql.A00(r5, r0)
            android.view.ViewPropertyAnimator r2 = r1.withStartAction(r0)
            r1 = 38
            X.3C4 r0 = new X.3C4
            r0.<init>(r6, r4, r5, r1)
            android.view.ViewPropertyAnimator r0 = r2.withEndAction(r0)
            r5.A00 = r0
            goto L_0x00de
        L_0x00aa:
            android.view.ViewPropertyAnimator r0 = r4.animate()
            r1 = 0
            android.view.ViewPropertyAnimator r0 = r0.alpha(r1)
            android.view.ViewPropertyAnimator r0 = r0.scaleY(r1)
            android.view.ViewPropertyAnimator r2 = r0.scaleX(r1)
            r0 = 100
            android.view.ViewPropertyAnimator r1 = r2.setDuration(r0)
            android.view.animation.Interpolator r0 = r5.A04
            android.view.ViewPropertyAnimator r1 = r1.setInterpolator(r0)
            r0 = 42
            X.7Ql r0 = X.C146747Ql.A00(r5, r0)
            android.view.ViewPropertyAnimator r0 = r1.withStartAction(r0)
            r8 = 39
            X.3Cr r3 = new X.3Cr
            r3.<init>((java.lang.Object) r4, (java.lang.Object) r5, (java.lang.Object) r6, (java.lang.Object) r7, (int) r8)
            android.view.ViewPropertyAnimator r0 = r0.withEndAction(r3)
            r5.A01 = r0
        L_0x00de:
            if (r0 == 0) goto L_0x0061
            r0.start()
            return
        L_0x00e4:
            r2 = 0
            r1 = 0
            if (r8 != 0) goto L_0x00f2
            r1 = 8
            X.1bI r0 = r7.A0h
            if (r0 == 0) goto L_0x0102
            android.view.View r0 = r0.A00
            if (r0 == 0) goto L_0x0102
        L_0x00f2:
            X.1bI r0 = r7.A0h
            if (r0 == 0) goto L_0x0110
            android.view.View r0 = r0.A02()
            if (r0 == 0) goto L_0x0110
            int r0 = r0.getVisibility()
            if (r0 != r1) goto L_0x0110
        L_0x0102:
            com.whatsapp.wds.components.fab.WDSFab r1 = r7.A0M
            if (r1 == 0) goto L_0x0061
            r0 = r8 ^ 1
            if (r0 != 0) goto L_0x010c
            r2 = 8
        L_0x010c:
            r1.setVisibility(r2)
            return
        L_0x0110:
            X.1bI r0 = r7.A0h
            if (r0 == 0) goto L_0x0102
            android.view.View r0 = r0.A02()
            if (r0 == 0) goto L_0x0102
            r0.setVisibility(r1)
            goto L_0x0102
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallery.GalleryTabHostFragment.A0j(com.whatsapp.gallery.GalleryTabHostFragment, boolean, boolean):void");
    }

    private final boolean A0l() {
        String str;
        AnonymousClass00H r0 = this.A0O;
        if (r0 != null) {
            if (!C108945cZ.A0j(r0).A03(A0m())) {
                AnonymousClass00H r02 = this.A0X;
                if (r02 == null) {
                    str = "videoQuality";
                } else if (C139506yx.A00(r02)) {
                    return true;
                } else {
                    return false;
                }
            }
            return true;
        }
        str = "imageQuality";
        C18070vi.A11(str);
        throw null;
    }

    private final boolean A0m() {
        C18100vl r1 = this.A0w;
        if (!C72453Mb.A1a(((MediaJidViewModel) r1.getValue()).A0T().A0D) || C72453Mb.A1a(((MediaJidViewModel) r1.getValue()).A0T().A0A)) {
            return false;
        }
        return true;
    }

    private final boolean A0o(int i) {
        RecyclerView recyclerView;
        if (!AnonymousClass745.A00 || C108965cb.A0P(this).A0T().size() != 1 || (recyclerView = this.A03) == null || recyclerView.getChildCount() != 1 || i != 1 || this.A0B == null) {
            return false;
        }
        return true;
    }

    public final AnonymousClass00H A27() {
        AnonymousClass00H r0 = this.A0R;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("mediaSharingUserJourneyLogger");
        throw null;
    }

    public void A28(List list) {
        Uri uri;
        AnonymousClass1BI A022 = AnonymousClass1BI.A00.A02(A0B(this));
        if (A0n() && AnonymousClass000.A1a(list) && A022 != null) {
            ArrayList A0D2 = C29351c6.A0D(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C108995ce.A1P(A0D2, it);
            }
            A0D(A1D(), A022, C17880vN.A10(A0D2));
        } else if (A0k()) {
            C18100vl r1 = this.A0o;
            List list2 = C108945cZ.A0g(r1).A02;
            String A1F = C108945cZ.A1F(C108945cZ.A0g(r1).A03);
            if (A1F == null) {
                A1F = "";
            }
            A0M(this, (AnonymousClass8B2) null, A1F, list, list2);
        } else {
            ArrayList A0D3 = C29351c6.A0D(list);
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C108995ce.A1P(A0D3, it2);
            }
            ArrayList A102 = C17880vN.A10(A0D3);
            AnonymousClass1FL A1D = A1D();
            Intent A0A2 = C17880vN.A0A();
            Intent intent = A1D.getIntent();
            Uri uri2 = null;
            if (intent != null) {
                uri = intent.getData();
            } else {
                uri = null;
            }
            A0A2.putExtra("bucket_uri", uri);
            A0A2.putParcelableArrayListExtra("android.intent.extra.STREAM", A102);
            if (A102.size() == 1) {
                uri2 = (Uri) A102.get(0);
            }
            A0A2.setData(uri2);
            A1D.setResult(-1, A0A2);
            C72463Mc.A1A(this);
        }
    }

    public void A29(boolean z) {
        Menu menu;
        MenuItem findItem;
        this.A0g = z;
        Toolbar toolbar = this.A02;
        if (toolbar != null && (menu = toolbar.getMenu()) != null && (findItem = menu.findItem(2131432784)) != null) {
            findItem.setEnabled(z);
        }
    }

    /* JADX WARNING: type inference failed for: r2v5, types: [java.lang.Object, X.02h] */
    public GalleryTabHostFragment() {
        AnonymousClass20F A152 = AnonymousClass3MW.A15(GalleryTabsViewModel.class);
        this.A0o = C99274sY.A00(new C151017lc(this), new C151027ld(this), new C155977tc(this), A152);
        AnonymousClass20F A153 = AnonymousClass3MW.A15(GalleryPickerViewModel.class);
        this.A0n = C99274sY.A00(new C151037le(this), new C151047lf(this), new C155987td(this), A153);
        AnonymousClass20F A154 = AnonymousClass3MW.A15(MediaQualityViewModel.class);
        this.A0x = C99274sY.A00(new C151057lg(this), new C151067lh(this), new C155997te(this), A154);
        this.A0y = AnonymousClass1DF.A01(new C150907lR(this));
        C150897lQ r4 = new C150897lQ(this);
        AnonymousClass20F A155 = AnonymousClass3MW.A15(MediaJidViewModel.class);
        this.A0w = C99274sY.A00(new C150977lY(this), new C150987lZ(this), new C155957ta(this, r4), A155);
        this.A0u = AnonymousClass1DF.A01(new C150877lO(this));
        this.A15 = AnonymousClass1DF.A01(new C151077li(this));
        this.A0v = AnonymousClass1DF.A01(new C150887lP(this));
        AnonymousClass20F A156 = AnonymousClass3MW.A15(MediaViewOnceViewModel.class);
        this.A10 = C99274sY.A00(new C150997la(this), new C151007lb(this), new C155967tb(this), A156);
        this.A13 = AnonymousClass1DF.A01(new C150957lW(this));
        this.A12 = AnonymousClass1DF.A01(new C150947lV(this));
        this.A0j = CDw(new C1423479c(this, 4), new Object());
        this.A0i = C17890vO.A0D();
        this.A0z = AnonymousClass1DF.A01(new C150917lS(this));
        this.A14 = AnonymousClass1DF.A01(new C150967lX(this));
        this.A11 = AnonymousClass1DF.A01(new C150937lU(this));
        this.A0p = AnonymousClass1DF.A01(new C150827lJ(this));
        this.A0s = AnonymousClass1DF.A01(new C150857lM(this));
        this.A0t = AnonymousClass1DF.A01(new C150867lN(this));
        this.A16 = 2131431075;
        this.A0q = AnonymousClass1DF.A01(new C150837lK(this));
        this.A0m = AnonymousClass1DF.A01(new C150817lI(this));
        this.A0r = AnonymousClass1DF.A01(new C150847lL(this));
        this.A0l = C17880vN.A14();
    }

    public static final int A00(GalleryTabHostFragment galleryTabHostFragment) {
        Intent intent;
        AnonymousClass1FL A1B = galleryTabHostFragment.A1B();
        int i = 7;
        if (A1B == null || (intent = A1B.getIntent()) == null) {
            return 7;
        }
        Bundle bundle = galleryTabHostFragment.A06;
        if (bundle != null) {
            i = bundle.getInt("include", 7);
        }
        return intent.getIntExtra("include", i);
    }

    public static final int A01(GalleryTabHostFragment galleryTabHostFragment) {
        Intent A0D2 = C108995ce.A0D(galleryTabHostFragment);
        if (A0D2 == null || !A0D2.hasExtra("max_items")) {
            C18030ve r2 = galleryTabHostFragment.A0D;
            if (r2 != null) {
                return C18020vd.A00(C18040vf.A02, r2, 2614);
            }
            AnonymousClass3MW.A1A();
            throw null;
        }
        C18030ve r22 = galleryTabHostFragment.A0D;
        if (r22 != null) {
            return A0D2.getIntExtra("max_items", C18020vd.A00(C18040vf.A02, r22, 2614));
        }
        AnonymousClass3MW.A1A();
        throw null;
    }

    public static final int A02(GalleryTabHostFragment galleryTabHostFragment) {
        Intent A0D2 = C108995ce.A0D(galleryTabHostFragment);
        if (A0D2 == null || !A0D2.hasExtra("origin")) {
            return 1;
        }
        return A0D2.getIntExtra("origin", 1);
    }

    public static final int A03(GalleryTabHostFragment galleryTabHostFragment) {
        Intent intent;
        AnonymousClass1FL A1B = galleryTabHostFragment.A1B();
        if (A1B == null || (intent = A1B.getIntent()) == null) {
            return -1;
        }
        return intent.getIntExtra("media_sharing_user_journey_origin", -1);
    }

    public static final long A04(GalleryTabHostFragment galleryTabHostFragment) {
        Intent A0D2 = C108995ce.A0D(galleryTabHostFragment);
        if (A0D2 == null || !A0D2.hasExtra("quoted_message_row_id")) {
            return 0;
        }
        return A0D2.getLongExtra("quoted_message_row_id", 0);
    }

    public static final AnonymousClass7DY A05(GalleryTabHostFragment galleryTabHostFragment) {
        C1599186j r2;
        AnonymousClass1FL A1B = galleryTabHostFragment.A1B();
        if (!(A1B instanceof C1599186j) || (r2 = (C1599186j) A1B) == null) {
            return null;
        }
        return r2.BO9();
    }

    private final C138286wp A06(List list) {
        View view;
        if (!A0o(list.size())) {
            return new C138286wp((Bitmap) null, (View) null, (AnonymousClass8B2) null, (String) null);
        }
        RecyclerView recyclerView = this.A03;
        if (recyclerView != null) {
            view = C60242nd.A00(recyclerView);
        } else {
            view = null;
        }
        View A002 = C60242nd.A00(C108955ca.A0H(view));
        C18070vi.A0z(A002, "null cannot be cast to non-null type com.whatsapp.WaMediaThumbnailView");
        WaMediaThumbnailView waMediaThumbnailView = (WaMediaThumbnailView) A002;
        String A0H2 = C18070vi.A0H(C108975cc.A09(list, 0));
        C18070vi.A0d(waMediaThumbnailView, 1);
        return new C138286wp(waMediaThumbnailView.A00, waMediaThumbnailView, waMediaThumbnailView.A01, A0H2);
    }

    private final C139416yo A08(ArrayList arrayList) {
        boolean z;
        boolean z2;
        boolean z3;
        Intent intent;
        Intent intent2;
        Intent intent3;
        Intent intent4;
        int A022 = A02(this);
        C139416yo r2 = new C139416yo(A1D());
        if (this.A0A != null) {
            r2.A03 = SystemClock.elapsedRealtime() - this.A00;
            Intent A0D2 = C108995ce.A0D(this);
            boolean z4 = false;
            if (A0D2 != null && A0D2.hasExtra("number_from_url")) {
                z4 = A0D2.getBooleanExtra("number_from_url", false);
            }
            r2.A0N = z4;
            r2.A0D = A0B(this);
            r2.A00 = A01(this) - ((C38391rD) this.A14.getValue()).A0Q();
            Intent A0D3 = C108995ce.A0D(this);
            boolean z5 = false;
            if (A0D3 != null && A0D3.hasExtra("skip_max_items_new_limit")) {
                z5 = A0D3.getBooleanExtra("skip_max_items_new_limit", false);
            }
            r2.A0T = z5;
            r2.A01 = A022;
            Intent A0D4 = C108995ce.A0D(this);
            long j = 0;
            if (A0D4 != null && A0D4.hasExtra("picker_open_time")) {
                j = A0D4.getLongExtra("picker_open_time", 0);
            }
            r2.A04 = j;
            r2.A0E = A0C(this);
            r2.A05 = A04(this);
            r2.A0O = AnonymousClass000.A1S(A022, 20);
            AnonymousClass1FL A1B = A1B();
            if (A1B == null || (intent4 = A1B.getIntent()) == null || !intent4.hasExtra("should_send_media")) {
                z = true;
            } else {
                z = intent4.getBooleanExtra("should_send_media", true);
            }
            r2.A0S = z;
            AnonymousClass1FL A1B2 = A1B();
            if (A1B2 == null || (intent3 = A1B2.getIntent()) == null || !intent3.hasExtra("should_hide_caption_view")) {
                z2 = false;
            } else {
                z2 = intent3.getBooleanExtra("should_hide_caption_view", false);
            }
            r2.A0R = z2;
            AnonymousClass1FL A1B3 = A1B();
            if (A1B3 == null || (intent2 = A1B3.getIntent()) == null || !intent2.hasExtra("send")) {
                z3 = true;
            } else {
                z3 = intent2.getBooleanExtra("send", true);
            }
            r2.A0P = z3;
            r2.A0I = arrayList;
            r2.A0C = A0A(this);
            C139416yo.A00(this.A0k, r2);
            r2.A0A = Integer.valueOf(MediaQualityViewModel.A00(this));
            r2.A0B = Integer.valueOf(C108945cZ.A0l(this.A10).A0T());
            r2.A0J = A0r(this, "apply_rotation_on_not_send");
            AnonymousClass1FL A1B4 = A1B();
            String str = null;
            if (!(A1B4 == null || (intent = A1B4.getIntent()) == null)) {
                str = C108995ce.A0W(intent, "standalone_add_button_provider_key");
            }
            r2.A0F = str;
            r2.A0Q = A0r(this, "send_media_preview_params_as_result");
            r2.A0L = A0r(this, "enable_template_tool");
            return r2;
        }
        C18070vi.A11("time");
        throw null;
    }

    private final AnonymousClass778 A09() {
        Intent intent;
        Object obj;
        AnonymousClass1FL A1B = A1B();
        Parcelable parcelable = null;
        if (A1B == null || (intent = A1B.getIntent()) == null) {
            return null;
        }
        if (AnonymousClass112.A09()) {
            obj = intent.getParcelableExtra("fun_sticker_data", AnonymousClass778.class);
        } else {
            Parcelable parcelableExtra = intent.getParcelableExtra("fun_sticker_data");
            if (parcelableExtra instanceof AnonymousClass778) {
                parcelable = parcelableExtra;
            }
            obj = (AnonymousClass778) parcelable;
        }
        return (AnonymousClass778) ((Parcelable) obj);
    }

    public static final String A0A(GalleryTabHostFragment galleryTabHostFragment) {
        Intent intent;
        String A1F = C108945cZ.A1F(C108965cb.A0P(galleryTabHostFragment).A03);
        if (A1F != null && A1F.length() != 0) {
            return A1F;
        }
        AnonymousClass1FL A1B = galleryTabHostFragment.A1B();
        if (A1B == null || (intent = A1B.getIntent()) == null) {
            return null;
        }
        return C108995ce.A0W(intent, "android.intent.extra.TEXT");
    }

    public static final String A0B(GalleryTabHostFragment galleryTabHostFragment) {
        Intent intent;
        AnonymousClass1FL A1B = galleryTabHostFragment.A1B();
        if (A1B == null || (intent = A1B.getIntent()) == null) {
            return null;
        }
        return C108995ce.A0W(intent, "jid");
    }

    public static final String A0C(GalleryTabHostFragment galleryTabHostFragment) {
        Intent intent;
        AnonymousClass1FL A1B = galleryTabHostFragment.A1B();
        if (A1B == null || (intent = A1B.getIntent()) == null) {
            return null;
        }
        return C108995ce.A0W(intent, "quoted_group_jid");
    }

    public static final void A0E(Rect rect, View view, GalleryTabHostFragment galleryTabHostFragment) {
        View view2;
        int i;
        if (view.getLocalVisibleRect(rect)) {
            ViewParent parent = view.getParent();
            if ((parent instanceof View) && (view2 = (View) parent) != null) {
                view2.getLocalVisibleRect(rect);
                View A0A2 = AnonymousClass3MW.A0A(galleryTabHostFragment.A15);
                C18070vi.A0X(A0A2);
                ViewGroup.LayoutParams layoutParams = A0A2.getLayoutParams();
                C18070vi.A0z(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                int height = A0A2.getHeight() + marginLayoutParams.bottomMargin + marginLayoutParams.topMargin;
                Toolbar toolbar = galleryTabHostFragment.A02;
                if (toolbar != null) {
                    ViewGroup.LayoutParams layoutParams2 = toolbar.getLayoutParams();
                    C18070vi.A0z(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    i = toolbar.getHeight() + marginLayoutParams2.bottomMargin + marginLayoutParams2.topMargin;
                } else {
                    i = 0;
                }
                int i2 = height + i;
                ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                if (layoutParams3 != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                    marginLayoutParams3.bottomMargin = view2.getHeight() - Math.max(rect.height(), i2);
                    view.setLayoutParams(marginLayoutParams3);
                    return;
                }
                throw AnonymousClass000.A0s("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
        }
    }

    public static final void A0F(View view, GalleryTabHostFragment galleryTabHostFragment, boolean z) {
        RecyclerView recyclerView;
        view.setEnabled(z);
        if ((view instanceof RecyclerView) && (recyclerView = (RecyclerView) view) != null) {
            recyclerView.suppressLayout(!z);
        }
        if (view instanceof ViewGroup) {
            Iterator A002 = C99434so.A00(view, 1);
            while (A002.hasNext()) {
                A0F(AnonymousClass3MX.A0E(A002), galleryTabHostFragment, z);
            }
        }
    }

    public static final void A0I(GalleryTabHostFragment galleryTabHostFragment) {
        C113825np A072 = galleryTabHostFragment.A07();
        if (A072 != null) {
            GalleryRecentsFragment A002 = C113825np.A00(A072);
            if (false != A002.A0A) {
                A002.A0D.clear();
            }
            A002.A0A = false;
            A002.A0D.clear();
            GalleryRecentsFragment.A01(A002);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003d, code lost:
        if (((X.C38391rD) r5.A14.getValue()).A0Q() == 0) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0057, code lost:
        if (A0q(r5) != false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r0.A00, 8882) != false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0J(com.whatsapp.gallery.GalleryTabHostFragment r5, int r6) {
        /*
            boolean r0 = A0p(r5)
            if (r0 != 0) goto L_0x0023
            boolean r0 = r5.A2A()
            if (r0 == 0) goto L_0x00d1
            int r1 = A01(r5)
            r0 = 1
            if (r1 <= r0) goto L_0x00d1
            X.7FZ r0 = r5.A0J
            if (r0 == 0) goto L_0x00d4
            X.0ve r2 = r0.A00
            r1 = 8882(0x22b2, float:1.2446E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x00d1
        L_0x0023:
            r0 = 1
        L_0x0024:
            r3 = 1
            r2 = 0
            if (r0 != 0) goto L_0x003f
            if (r6 != 0) goto L_0x003f
            boolean r0 = r5.A2A()
            if (r0 == 0) goto L_0x003f
            X.0vl r0 = r5.A14
            java.lang.Object r0 = r0.getValue()
            X.1rD r0 = (X.C38391rD) r0
            int r0 = r0.A0Q()
            r1 = 1
            if (r0 == 0) goto L_0x0040
        L_0x003f:
            r1 = 0
        L_0x0040:
            androidx.appcompat.widget.Toolbar r0 = r5.A02
            if (r0 == 0) goto L_0x005d
            android.view.Menu r0 = r0.getMenu()
            if (r0 == 0) goto L_0x005d
            android.view.MenuItem r2 = r0.getItem(r2)
            if (r2 == 0) goto L_0x005d
            if (r1 == 0) goto L_0x0059
            boolean r1 = A0q(r5)
            r0 = 1
            if (r1 == 0) goto L_0x005a
        L_0x0059:
            r0 = 0
        L_0x005a:
            r2.setVisible(r0)
        L_0x005d:
            androidx.appcompat.widget.Toolbar r0 = r5.A02
            if (r0 == 0) goto L_0x007c
            android.view.Menu r0 = r0.getMenu()
            if (r0 == 0) goto L_0x007c
            android.view.MenuItem r1 = r0.getItem(r3)
            if (r1 == 0) goto L_0x007c
            boolean r0 = r5.A0c
            if (r0 == 0) goto L_0x00cf
            if (r6 != r3) goto L_0x00cf
            boolean r0 = A0q(r5)
            if (r0 != 0) goto L_0x00cf
        L_0x0079:
            r1.setVisible(r3)
        L_0x007c:
            androidx.appcompat.widget.Toolbar r0 = r5.A02
            if (r0 == 0) goto L_0x00cc
            android.view.Menu r1 = r0.getMenu()
            if (r1 == 0) goto L_0x00cc
            r0 = 2
            android.view.MenuItem r4 = r1.getItem(r0)
            if (r4 == 0) goto L_0x00cc
            X.0vl r0 = r5.A0p
            boolean r0 = X.C72453Mb.A1a(r0)
            r3 = 0
            if (r0 == 0) goto L_0x00b1
            boolean r0 = r5.A0l()
            if (r0 == 0) goto L_0x00b1
            X.1FL r0 = r5.A1B()
            r2 = 1
            if (r0 == 0) goto L_0x00cd
            android.content.Intent r1 = r0.getIntent()
            if (r1 == 0) goto L_0x00cd
            java.lang.String r0 = "force_non_hd_toggle"
            boolean r0 = r1.getBooleanExtra(r0, r3)
            if (r0 != r2) goto L_0x00cd
        L_0x00b1:
            r0 = 0
        L_0x00b2:
            r4.setVisible(r0)
            androidx.appcompat.widget.Toolbar r1 = r5.A02
            if (r1 == 0) goto L_0x00cc
            int r0 = r4.getItemId()
            android.view.View r1 = r1.findViewById(r0)
            if (r1 == 0) goto L_0x00cc
            r1.setLongClickable(r3)
            r0 = 2131886140(0x7f12003c, float:1.940685E38)
            X.AnonymousClass1Y5.A02(r1, r0)
        L_0x00cc:
            return
        L_0x00cd:
            r0 = 1
            goto L_0x00b2
        L_0x00cf:
            r3 = 0
            goto L_0x0079
        L_0x00d1:
            r0 = 0
            goto L_0x0024
        L_0x00d4:
            java.lang.String r0 = "mediaTray"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallery.GalleryTabHostFragment.A0J(com.whatsapp.gallery.GalleryTabHostFragment, int):void");
    }

    public static final void A0d(GalleryTabHostFragment galleryTabHostFragment, AnonymousClass1BI r5, List list) {
        if (galleryTabHostFragment.A1b() && !galleryTabHostFragment.A0Z && !galleryTabHostFragment.A0j) {
            AnonymousClass1FL A1B = galleryTabHostFragment.A1B();
            if (A1B == null || !A1B.isFinishing()) {
                AnonymousClass7AT.A01(galleryTabHostFragment.A1G(), ((C139266yY) galleryTabHostFragment.A0v.getValue()).A01(galleryTabHostFragment.A1G(), list), new C1589282o(galleryTabHostFragment, r5, list), 32);
            }
        }
    }

    public static final void A0e(GalleryTabHostFragment galleryTabHostFragment, String str, List list, List list2) {
        Uri uri = (Uri) C29431cG.A0c(list);
        if (uri != null) {
            AnonymousClass72S A022 = galleryTabHostFragment.A0k.A02(uri);
            C58432kg r1 = galleryTabHostFragment.A0H;
            if (r1 != null) {
                r1.A01(A022.A0H(), list2);
                A022.A0S(A022.A0H());
                A022.A0P(str);
                return;
            }
            C18070vi.A11("mentionState");
            throw null;
        }
    }

    public static final void A0g(GalleryTabHostFragment galleryTabHostFragment, Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            galleryTabHostFragment.A0k.A02(C108945cZ.A0M(it));
        }
        AnonymousClass73D r3 = galleryTabHostFragment.A0k;
        Iterator it2 = r3.A04().iterator();
        while (it2.hasNext()) {
            Uri uri = ((AnonymousClass72S) it2.next()).A0X;
            if (!set.contains(uri)) {
                r3.A03(uri);
            }
        }
    }

    public static final void A0i(GalleryTabHostFragment galleryTabHostFragment, boolean z) {
        C113825np A072 = galleryTabHostFragment.A07();
        if (A072 != null) {
            GalleryRecentsFragment A002 = C113825np.A00(A072);
            if (!z && z != A002.A0A) {
                A002.A0D.clear();
            }
            A002.A0A = z;
        }
    }

    private final boolean A0k() {
        Intent intent;
        AnonymousClass1FL A1B;
        Intent intent2;
        AnonymousClass1FL A1B2 = A1B();
        if (A1B2 == null || (intent = A1B2.getIntent()) == null || !intent.hasExtra("preview") || ((A1B = A1B()) != null && (intent2 = A1B.getIntent()) != null && intent2.getBooleanExtra("preview", true))) {
            return true;
        }
        return false;
    }

    private final boolean A0n() {
        Intent intent;
        AnonymousClass1FL A1B;
        Intent intent2;
        AnonymousClass1FL A1B2 = A1B();
        if (A1B2 == null || (intent = A1B2.getIntent()) == null || !intent.hasExtra("is_send_as_document") || (A1B = A1B()) == null || (intent2 = A1B.getIntent()) == null) {
            return false;
        }
        return C108975cc.A1B(intent2.getBooleanExtra("is_send_as_document", false) ? 1 : 0);
    }

    public static final boolean A0p(GalleryTabHostFragment galleryTabHostFragment) {
        Intent intent;
        if (!galleryTabHostFragment.A2A() || A01(galleryTabHostFragment) <= 1) {
            return false;
        }
        AnonymousClass1FL A1B = galleryTabHostFragment.A1B();
        if (A1B != null && (intent = A1B.getIntent()) != null && intent.getBooleanExtra("force_non_multitype_by_default", false)) {
            return false;
        }
        if (C72453Mb.A1a(galleryTabHostFragment.A0p) || C72453Mb.A1a(galleryTabHostFragment.A0s)) {
            return true;
        }
        AnonymousClass7FZ r0 = galleryTabHostFragment.A0J;
        if (r0 != null) {
            if (C18020vd.A05(C18040vf.A02, r0.A00, 4261)) {
                return true;
            }
            return false;
        }
        C18070vi.A11("mediaTray");
        throw null;
    }

    public static final boolean A0q(GalleryTabHostFragment galleryTabHostFragment) {
        Intent intent;
        AnonymousClass1FL A1B = galleryTabHostFragment.A1B();
        if (A1B == null || (intent = A1B.getIntent()) == null) {
            return false;
        }
        return intent.getBooleanExtra("picker_redesign", false);
    }

    public void A1s() {
        super.A1s();
        ((C136166tN) this.A0z.getValue()).A00();
        View view = this.A01;
        if (view != null) {
            view.setOnClickListener((View.OnClickListener) null);
        }
        this.A01 = null;
        ViewPager2 viewPager2 = this.A04;
        if (viewPager2 != null) {
            viewPager2.setAdapter((C38391rD) null);
        }
        ViewPager2 viewPager22 = this.A04;
        if (viewPager22 != null) {
            viewPager22.A05.A00.remove(this.A11.getValue());
        }
        this.A04 = null;
        this.A0h = null;
        RecyclerView recyclerView = this.A03;
        if (recyclerView != null) {
            recyclerView.setAdapter((C38391rD) null);
        }
        this.A03 = null;
        this.A02 = null;
        this.A0M = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0108, code lost:
        if (r5 == null) goto L_0x010a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x01ff  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1w(int r10, int r11, android.content.Intent r12) {
        /*
            r9 = this;
            X.7DY r3 = A05(r9)
            if (r3 == 0) goto L_0x001f
            X.1FU r0 = r3.A0H
            if (r0 == 0) goto L_0x001f
            X.1FL r0 = r9.A1B()
            if (r0 == 0) goto L_0x008e
            android.content.Intent r2 = r0.getIntent()
            if (r2 == 0) goto L_0x008e
            java.lang.String r1 = "gallery_picker_action"
            r0 = -1
            int r0 = r2.getIntExtra(r1, r0)
            if (r0 != 0) goto L_0x008e
        L_0x001f:
            r0 = 101(0x65, float:1.42E-43)
            r3 = -1
            if (r10 != r0) goto L_0x0197
            if (r11 == r3) goto L_0x020e
            java.lang.String r6 = "view_once_selection"
            r4 = 0
            r2 = 1
            if (r11 == 0) goto L_0x00e5
            if (r11 != r2) goto L_0x0251
            X.0vl r0 = r9.A0p
            boolean r0 = X.C72453Mb.A1a(r0)
            if (r0 == 0) goto L_0x0063
            X.0vl r0 = r9.A0x
            java.lang.Object r5 = r0.getValue()
            com.whatsapp.mediacomposer.viewmodel.MediaQualityViewModel r5 = (com.whatsapp.mediacomposer.viewmodel.MediaQualityViewModel) r5
            if (r12 == 0) goto L_0x008c
            java.lang.String r0 = "media_quality_selection"
            int r1 = r12.getIntExtra(r0, r4)
        L_0x0046:
            X.1DT r0 = r5.A01
            X.AnonymousClass3MX.A1J(r0, r1)
            X.0vl r1 = r9.A10
            com.whatsapp.mediacomposer.viewmodel.MediaViewOnceViewModel r0 = X.C108945cZ.A0l(r1)
            if (r12 == 0) goto L_0x0057
            int r3 = r12.getIntExtra(r6, r3)
        L_0x0057:
            X.1DT r0 = r0.A00
            X.AnonymousClass3MX.A1J(r0, r3)
            com.whatsapp.mediacomposer.viewmodel.MediaViewOnceViewModel r0 = X.C108945cZ.A0l(r1)
            r0.A0V()
        L_0x0063:
            if (r12 == 0) goto L_0x00dd
            X.73D r1 = r9.A0k
            android.os.Bundle r0 = r12.getExtras()
            r1.A05(r0)
            java.lang.String r0 = "android.intent.extra.STREAM"
            java.util.ArrayList r0 = r12.getParcelableArrayListExtra(r0)
            if (r0 == 0) goto L_0x0097
            java.util.ArrayList r3 = X.C29351c6.A0D(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x007e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0092
            java.lang.Object r0 = r1.next()
            X.C108955ca.A1U(r0, r3)
            goto L_0x007e
        L_0x008c:
            r1 = 3
            goto L_0x0046
        L_0x008e:
            r3.A0q(r10, r11, r12)
            goto L_0x001f
        L_0x0092:
            java.util.Set r8 = X.C29431cG.A12(r3)
            goto L_0x0098
        L_0x0097:
            r8 = 0
        L_0x0098:
            X.5np r0 = r9.A07()
            if (r0 == 0) goto L_0x00dd
            if (r8 == 0) goto L_0x00dd
            com.whatsapp.gallery.GalleryRecentsFragment r7 = X.C113825np.A00(r0)
            int r1 = r8.size()
            java.util.Map r6 = r7.A0D
            int r0 = r6.size()
            if (r1 == r0) goto L_0x00dd
            java.util.LinkedHashMap r5 = X.C17880vN.A13()
            java.util.Iterator r3 = X.AnonymousClass000.A15(r6)
        L_0x00b8:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00d4
            java.util.Map$Entry r1 = X.AnonymousClass000.A16(r3)
            java.lang.Object r0 = r1.getKey()
            java.lang.String r0 = r0.toString()
            boolean r0 = r8.contains(r0)
            if (r0 == 0) goto L_0x00b8
            X.C108985cd.A1T(r1, r5)
            goto L_0x00b8
        L_0x00d4:
            r6.clear()
            r6.putAll(r5)
            com.whatsapp.gallery.GalleryRecentsFragment.A01(r7)
        L_0x00dd:
            android.view.View r0 = r9.A0B
            if (r0 == 0) goto L_0x0251
            r9.A0G(r0, r2)
            goto L_0x014b
        L_0x00e5:
            if (r12 == 0) goto L_0x010a
            java.lang.String r1 = "selected_media_quality"
            boolean r0 = r12.hasExtra(r1)
            if (r0 != r2) goto L_0x0102
            r9.A0e = r4
            X.0vl r0 = r9.A0x
            java.lang.Object r0 = r0.getValue()
            com.whatsapp.mediacomposer.viewmodel.MediaQualityViewModel r0 = (com.whatsapp.mediacomposer.viewmodel.MediaQualityViewModel) r0
            int r1 = r12.getIntExtra(r1, r4)
            X.1DT r0 = r0.A01
            X.AnonymousClass3MX.A1J(r0, r1)
        L_0x0102:
            java.lang.String r0 = "result_extra_composer_media_selection"
            java.util.ArrayList r5 = r12.getParcelableArrayListExtra(r0)
            if (r5 != 0) goto L_0x010c
        L_0x010a:
            X.0wS r5 = X.C18460wS.A00
        L_0x010c:
            X.0vl r0 = r9.A0p
            boolean r0 = X.C72453Mb.A1a(r0)
            if (r0 != 0) goto L_0x015b
            A0I(r9)
            android.view.View r0 = r9.A0B
            if (r0 == 0) goto L_0x0251
            r9.A0G(r0, r4)
            X.1FL r0 = r9.A1B()
            if (r0 == 0) goto L_0x014b
            android.content.Intent r1 = r0.getIntent()
            if (r1 == 0) goto L_0x014b
            java.lang.String r0 = "maintain_selection_state_on_cancel"
            boolean r0 = r1.getBooleanExtra(r0, r4)
            if (r0 != r2) goto L_0x014b
            int r0 = A01(r9)
            if (r0 <= r2) goto L_0x014b
            X.5np r0 = r9.A07()
            if (r0 == 0) goto L_0x014b
            com.whatsapp.gallery.GalleryRecentsFragment r1 = X.C113825np.A00(r0)
            if (r1 == 0) goto L_0x014b
            java.util.Set r0 = X.C29431cG.A12(r5)
            r1.A2I(r0)
        L_0x014b:
            com.whatsapp.gallery.viewmodel.GalleryTabsViewModel r0 = X.C108965cb.A0P(r9)
            java.util.Set r0 = r0.A0T()
            boolean r0 = X.C108945cZ.A1U(r0)
            A0j(r9, r0, r4)
            return
        L_0x015b:
            if (r12 == 0) goto L_0x0161
            int r3 = r12.getIntExtra(r6, r3)
        L_0x0161:
            X.0vl r1 = r9.A10
            com.whatsapp.mediacomposer.viewmodel.MediaViewOnceViewModel r0 = X.C108945cZ.A0l(r1)
            X.1DT r0 = r0.A00
            X.AnonymousClass3MX.A1J(r0, r3)
            com.whatsapp.mediacomposer.viewmodel.MediaViewOnceViewModel r0 = X.C108945cZ.A0l(r1)
            r0.A0V()
            A0I(r9)
            android.view.View r0 = r9.A0B
            if (r0 == 0) goto L_0x0251
            r9.A0G(r0, r4)
            int r0 = A01(r9)
            if (r0 <= r2) goto L_0x0251
            X.5np r0 = r9.A07()
            if (r0 == 0) goto L_0x0251
            com.whatsapp.gallery.GalleryRecentsFragment r1 = X.C113825np.A00(r0)
            if (r1 == 0) goto L_0x0251
            java.util.Set r0 = X.C29431cG.A12(r5)
            r1.A2I(r0)
            return
        L_0x0197:
            r0 = 91
            if (r10 != r0) goto L_0x01e3
            if (r11 != r3) goto L_0x0251
            boolean r0 = r9.A0k()
            if (r0 == 0) goto L_0x01f9
            if (r12 == 0) goto L_0x0251
            java.lang.String r0 = "android.intent.extra.STREAM"
            java.util.ArrayList r2 = r12.getParcelableArrayListExtra(r0)
            if (r2 != 0) goto L_0x01bb
            android.net.Uri r1 = r12.getData()
            if (r1 == 0) goto L_0x0251
            r0 = 1
            java.util.ArrayList r2 = X.C17880vN.A0z(r0)
            r2.add(r1)
        L_0x01bb:
            X.1Dv r1 = X.AnonymousClass1BI.A00
            java.lang.String r0 = A0B(r9)
            X.1BI r1 = r1.A02(r0)
            boolean r0 = r9.A0n()
            if (r0 == 0) goto L_0x01d5
            if (r1 == 0) goto L_0x01d5
            X.1FL r0 = r9.A1D()
            r9.A0D(r0, r1, r2)
            return
        L_0x01d5:
            X.6yo r0 = r9.A08(r2)
            android.content.Intent r1 = r0.A01()
            r0 = 90
            r9.startActivityForResult(r1, r0)
            return
        L_0x01e3:
            r0 = 90
            if (r10 != r0) goto L_0x0203
            if (r11 == r3) goto L_0x01f9
            r1 = 2
            if (r11 != r1) goto L_0x0251
            X.1FL r0 = r9.A1B()
            if (r0 == 0) goto L_0x01f5
            r0.setResult(r1)
        L_0x01f5:
            X.C72463Mc.A1A(r9)
            return
        L_0x01f9:
            X.1FL r0 = r9.A1B()
            if (r0 == 0) goto L_0x01f5
            r0.setResult(r3, r12)
            goto L_0x01f5
        L_0x0203:
            r0 = 104(0x68, float:1.46E-43)
            if (r10 != r0) goto L_0x0251
            if (r11 != r3) goto L_0x0251
            X.1FL r1 = r9.A1B()
            goto L_0x024c
        L_0x020e:
            X.1FL r1 = r9.A1B()
            boolean r0 = r1 instanceof com.whatsapp.camera.CameraActivity
            if (r0 == 0) goto L_0x021b
            if (r1 == 0) goto L_0x021b
            r1.finish()
        L_0x021b:
            X.1FL r0 = r9.A1B()
            if (r0 == 0) goto L_0x0244
            android.content.Intent r5 = r0.getIntent()
            r4 = 0
            if (r5 == 0) goto L_0x0244
            java.lang.String r2 = "should_set_gallery_result"
            boolean r1 = r5.hasExtra(r2)
            r0 = 1
            if (r1 != r0) goto L_0x0244
            boolean r0 = r5.getBooleanExtra(r2, r4)
            if (r0 == 0) goto L_0x0244
            X.1FL r1 = r9.A1B()
            boolean r0 = r1 instanceof com.whatsapp.gallerypicker.GalleryPicker
            if (r0 == 0) goto L_0x0244
            if (r1 == 0) goto L_0x0244
            r1.setResult(r3, r12)
        L_0x0244:
            X.1FL r1 = r9.A1B()
            boolean r0 = r1 instanceof com.whatsapp.gallerypicker.GalleryPicker
            if (r0 == 0) goto L_0x0251
        L_0x024c:
            if (r1 == 0) goto L_0x0251
            r1.finish()
        L_0x0251:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallery.GalleryTabHostFragment.A1w(int, int, android.content.Intent):void");
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        if (C138766xe.A00((C138086wV) this.A0u.getValue()) && !A18) {
            C18030ve r2 = this.A0D;
            if (r2 == null) {
                AnonymousClass3MW.A1A();
            } else if (C18020vd.A05(C18040vf.A02, r2, 12870)) {
                A18 = true;
                AnonymousClass10I r1 = this.A0L;
                if (r1 != null) {
                    r1.CGF(C146747Ql.A00(this, 36));
                } else {
                    AnonymousClass3MW.A1G();
                }
            }
            throw null;
        }
        AnonymousClass02V BVe = A1D().BVe();
        C158207zu r12 = new C158207zu(this);
        C18070vi.A0d(BVe, 0);
        BVe.A09(new C009805p(r12), this);
    }

    public void A23(boolean z) {
        super.A23(z);
        if (!A0q(this) && this.A0L.A02.A00(C23401Fx.RESUMED)) {
            ViewPager2 viewPager2 = this.A04;
            if (viewPager2 == null || viewPager2.A00 != 0) {
                this.A0b = true;
                if (viewPager2 == null) {
                    return;
                }
            }
            viewPager2.A03(0, true);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0023, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r2, 5643) == false) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A2A() {
        /*
            r4 = this;
            java.lang.String r0 = A0B(r4)
            r3 = 0
            if (r0 == 0) goto L_0x0026
            X.1Dt r0 = com.whatsapp.jid.Jid.Companion
            java.lang.String r0 = A0B(r4)
            com.whatsapp.jid.Jid r0 = X.C22911Dt.A00(r0)
            boolean r0 = X.C22971Dz.A0V(r0)
            if (r0 == 0) goto L_0x0026
            X.0ve r2 = r4.A0D
            if (r2 == 0) goto L_0x0050
            r1 = 5643(0x160b, float:7.908E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 != 0) goto L_0x0026
        L_0x0025:
            return r3
        L_0x0026:
            int r1 = A01(r4)
            r0 = 1
            if (r1 <= r0) goto L_0x0025
            boolean r0 = r4.A0k()
            if (r0 != 0) goto L_0x004e
            X.1FL r0 = r4.A1B()
            if (r0 == 0) goto L_0x0025
            android.content.Intent r2 = r0.getIntent()
            if (r2 == 0) goto L_0x0025
            java.lang.String r1 = "is_in_multi_select_mode_only"
            boolean r0 = r2.hasExtra(r1)
            if (r0 == 0) goto L_0x0025
            boolean r1 = r2.getBooleanExtra(r1, r3)
            r0 = 1
            if (r1 != r0) goto L_0x0025
        L_0x004e:
            r3 = 1
            return r3
        L_0x0050:
            X.AnonymousClass3MW.A1A()
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallery.GalleryTabHostFragment.A2A():boolean");
    }

    public void BYp(AnonymousClass73D r2, Collection collection) {
        C18070vi.A0h(collection, r2);
        C113825np A072 = A07();
        if (A072 != null) {
            A072.BYp(r2, collection);
        }
    }

    public void By8(ArrayList arrayList) {
        AnonymousClass1FL A1B = A1B();
        if (A1B != null) {
            A1B.setResult(-1);
        }
        C72463Mc.A1A(this);
    }

    public void CDn() {
        C113825np A072 = A07();
        if (A072 != null) {
            A072.CDn();
        }
    }

    public void CKe(AnonymousClass73D r2, Collection collection, Collection collection2) {
        C18070vi.A0n(collection, collection2, r2);
        C113825np A072 = A07();
        if (A072 != null) {
            A072.CKe(r2, collection, collection2);
        }
    }
}
