package com.whatsapp.avatar.profilephotocf;

import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass112;
import X.AnonymousClass17O;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1K1;
import X.AnonymousClass1YL;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass795;
import X.AnonymousClass79Z;
import X.AnonymousClass7AT;
import X.C000200d;
import X.C003401n;
import X.C108945cZ;
import X.C108955ca;
import X.C108965cb;
import X.C108975cc;
import X.C109005cf;
import X.C110885hR;
import X.C111755kN;
import X.C122486Qo;
import X.C137526vb;
import X.C148267hA;
import X.C148277hB;
import X.C148287hC;
import X.C155107sD;
import X.C157577xj;
import X.C157587xk;
import X.C157597xl;
import X.C157607xm;
import X.C18070vi;
import X.C18100vl;
import X.C19740yt;
import X.C201811d;
import X.C28281Zt;
import X.C72453Mb;
import X.C72483Me;
import X.C99274sY;
import X.C99434so;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.whatsapp.collections.AutoFitGridLayoutManager;
import com.whatsapp.productinfra.avatar.coinflip.AvatarCoinFlipProfilePhotoImageView;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.Iterator;

public final class AvatarCoinFlipProfilePhotoActivity extends AnonymousClass1FY {
    public View A00;
    public ProgressBar A01;
    public Toolbar A02;
    public ShimmerFrameLayout A03;
    public AvatarCoinFlipProfilePhotoImageView A04;
    public WDSButton A05;
    public AnonymousClass00H A06;
    public AnonymousClass00H A07;
    public View A08;
    public boolean A09;
    public final C111755kN A0A;
    public final C111755kN A0B;
    public final AnonymousClass00H A0C;
    public final C18100vl A0D;

    public boolean onCreateOptionsMenu(Menu menu) {
        C18070vi.A0d(menu, 0);
        getMenuInflater().inflate(2131820544, menu);
        C137526vb.A01(menu, true);
        Iterator A002 = C99434so.A00(menu, 0);
        while (A002.hasNext()) {
            Drawable icon = ((MenuItem) A002.next()).getIcon();
            if (icon != null) {
                icon.setTint(C72483Me.A03(this));
            }
        }
        return super.onCreateOptionsMenu(menu);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A03(android.graphics.Bitmap r11, android.graphics.Bitmap r12, com.whatsapp.avatar.profilephotocf.AvatarCoinFlipProfilePhotoActivity r13, X.C30391dr r14) {
        /*
            boolean r0 = r14 instanceof X.C147457Tf
            if (r0 == 0) goto L_0x0061
            r4 = r14
            X.7Tf r4 = (X.C147457Tf) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0061
            int r2 = r2 - r1
            r4.label = r2
        L_0x0012:
            java.lang.Object r3 = r4.result
            X.1g4 r2 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r4.label
            r1 = 0
            r10 = 1
            if (r0 == 0) goto L_0x0033
            if (r0 != r10) goto L_0x0067
            java.lang.Object r13 = r4.L$0
            com.whatsapp.avatar.profilephotocf.AvatarCoinFlipProfilePhotoActivity r13 = (com.whatsapp.avatar.profilephotocf.AvatarCoinFlipProfilePhotoActivity) r13
            X.C30691eM.A01(r3)
        L_0x0025:
            X.00H r0 = r13.A0C
            java.lang.Object r0 = X.C18070vi.A0E(r0)
            X.17O r0 = (X.AnonymousClass17O) r0
            r0.A01()
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0033:
            X.C30691eM.A01(r3)
            X.00H r0 = r13.A0C
            java.lang.Object r5 = X.C18070vi.A0E(r0)
            X.17O r5 = (X.AnonymousClass17O) r5
            android.view.View r8 = r13.A08
            if (r8 != 0) goto L_0x0048
            java.lang.String r0 = "avatarPoseView"
        L_0x0044:
            X.C18070vi.A11(r0)
            throw r1
        L_0x0048:
            com.whatsapp.productinfra.avatar.coinflip.AvatarCoinFlipProfilePhotoImageView r9 = r13.A04
            if (r9 != 0) goto L_0x004f
            java.lang.String r0 = "avatarPose"
            goto L_0x0044
        L_0x004f:
            r6 = r11
            r7 = r12
            r5.A02(r6, r7, r8, r9, r10)
            r4.L$0 = r13
            r4.label = r10
            r0 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r0 = X.C62882s9.A00(r4, r0)
            if (r0 != r2) goto L_0x0025
            return r2
        L_0x0061:
            X.7Tf r4 = new X.7Tf
            r4.<init>(r13, r14)
            goto L_0x0012
        L_0x0067:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.avatar.profilephotocf.AvatarCoinFlipProfilePhotoActivity.A03(android.graphics.Bitmap, android.graphics.Bitmap, com.whatsapp.avatar.profilephotocf.AvatarCoinFlipProfilePhotoActivity, X.1dr):java.lang.Object");
    }

    public void A2y() {
        if (!this.A09) {
            this.A09 = true;
            AnonymousClass1K1 A0K = C108955ca.A0K(this);
            AnonymousClass10E A0A2 = C109005cf.A0A(A0K, this);
            AnonymousClass1FB.A0M(A0A2, this);
            AnonymousClass10G r1 = A0A2.A00;
            C109005cf.A0d(A0A2, r1, this);
            C109005cf.A0e(A0A2, r1, this, r1.A5A);
            this.A06 = C000200d.A00(A0K.A09);
            this.A07 = AnonymousClass3MW.A0s(A0A2);
        }
    }

    public AvatarCoinFlipProfilePhotoActivity(int i) {
        this.A09 = false;
        AnonymousClass79Z.A00(this, 18);
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        setContentView(2131624017);
        Toolbar toolbar = (Toolbar) AnonymousClass3MY.A0C(this, 2131436270);
        setSupportActionBar(toolbar);
        C109005cf.A0O(this, toolbar, this.A00);
        toolbar.setTitle(2131886830);
        toolbar.setTouchscreenBlocksFocus(false);
        this.A02 = toolbar;
        if (AnonymousClass112.A01()) {
            C28281Zt.A05(this, AnonymousClass1YL.A00(this, 2130969989, 2131101074));
            C28281Zt.A0A(getWindow(), !C28281Zt.A0B(this));
        }
        WDSButton wDSButton = (WDSButton) AnonymousClass3MY.A0C(this, 2131427989);
        AnonymousClass3MZ.A1J(wDSButton, this, 18);
        this.A05 = wDSButton;
        C003401n supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0M(2131886830);
        }
        C111755kN r2 = this.A0A;
        r2.A00 = C19740yt.A00(this, 2131102239);
        RecyclerView recyclerView = (RecyclerView) C110885hR.A0A(this, 2131427949);
        C108965cb.A14(r2, recyclerView);
        recyclerView.A0R = true;
        C108965cb.A0z(recyclerView.getContext(), recyclerView);
        C111755kN r1 = this.A0B;
        r1.A00 = C19740yt.A00(this, 2131102239);
        RecyclerView recyclerView2 = (RecyclerView) C110885hR.A0A(this, 2131427977);
        C108965cb.A14(r1, recyclerView2);
        recyclerView2.A0R = true;
        recyclerView2.setLayoutManager(new AutoFitGridLayoutManager(this, recyclerView2.getResources().getDimensionPixelSize(2131165415)));
        this.A08 = AnonymousClass3MY.A0C(this, 2131427978);
        AvatarCoinFlipProfilePhotoImageView avatarCoinFlipProfilePhotoImageView = (AvatarCoinFlipProfilePhotoImageView) AnonymousClass3MY.A0C(this, 2131427976);
        AnonymousClass3MZ.A1J(avatarCoinFlipProfilePhotoImageView, this, 19);
        this.A04 = avatarCoinFlipProfilePhotoImageView;
        this.A00 = AnonymousClass3MY.A0C(this, 2131433990);
        this.A01 = (ProgressBar) AnonymousClass3MY.A0C(this, 2131434137);
        this.A03 = (ShimmerFrameLayout) AnonymousClass3MY.A0C(this, 2131433991);
        AvatarCoinFlipProfilePhotoImageView avatarCoinFlipProfilePhotoImageView2 = this.A04;
        if (avatarCoinFlipProfilePhotoImageView2 == null) {
            str = "avatarPose";
        } else {
            AnonymousClass3MY.A0w(this, avatarCoinFlipProfilePhotoImageView2, 2131886862);
            Toolbar toolbar2 = this.A02;
            if (toolbar2 == null) {
                str = "toolbar";
            } else {
                toolbar2.setNavigationContentDescription((CharSequence) getString(2131898643));
                C18100vl r3 = this.A0D;
                AnonymousClass7AT.A01(this, ((AvatarCoinFlipProfilePhotoViewModel) AnonymousClass7AT.A00(this, C108945cZ.A0Q(((AvatarCoinFlipProfilePhotoViewModel) r3.getValue()).A0E), r3, new C157597xl(this), 3)).A04, new C157587xk(this), 3);
                if (C72453Mb.A08(this) == 2) {
                    View view = this.A00;
                    if (view == null) {
                        str = "poseLayout";
                    } else {
                        AnonymousClass795.A00(view.getViewTreeObserver(), new C148267hA(this), view, 1);
                        return;
                    }
                } else {
                    return;
                }
            }
        }
        C18070vi.A11(str);
        throw null;
    }

    public void onDestroy() {
        super.onDestroy();
        ((AnonymousClass17O) this.A0C.get()).A00();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (C72453Mb.A0B(menuItem) == 2131432493) {
            AvatarCoinFlipProfilePhotoViewModel avatarCoinFlipProfilePhotoViewModel = (AvatarCoinFlipProfilePhotoViewModel) this.A0D.getValue();
            C108975cc.A0L(avatarCoinFlipProfilePhotoViewModel.A07).A03((Boolean) null, 5);
            avatarCoinFlipProfilePhotoViewModel.A04.A0F(C122486Qo.AVATAR_EDITOR);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public AvatarCoinFlipProfilePhotoActivity() {
        this(0);
        this.A0C = C201811d.A00(32849);
        this.A0D = C99274sY.A00(new C148287hC(this), new C148277hB(this), new C155107sD(this), AnonymousClass3MW.A15(AvatarCoinFlipProfilePhotoViewModel.class));
        this.A0A = new C111755kN(new C157577xj(this), 2131625745);
        this.A0B = new C111755kN(new C157607xm(this), 2131625746);
    }
}
