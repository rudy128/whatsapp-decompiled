package com.whatsapp.avatar.profilephoto;

import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass112;
import X.AnonymousClass1DF;
import X.AnonymousClass1DT;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1K1;
import X.AnonymousClass1Y5;
import X.AnonymousClass1YL;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass795;
import X.AnonymousClass79Z;
import X.AnonymousClass7AT;
import X.C000200d;
import X.C003401n;
import X.C108955ca;
import X.C108965cb;
import X.C108975cc;
import X.C109005cf;
import X.C110885hR;
import X.C111785kQ;
import X.C115445u1;
import X.C115455u2;
import X.C115465u3;
import X.C115475u4;
import X.C140026zp;
import X.C146707Qh;
import X.C148157gz;
import X.C148167h0;
import X.C148177h1;
import X.C148187h2;
import X.C148197h3;
import X.C155097sC;
import X.C157537xf;
import X.C157547xg;
import X.C157557xh;
import X.C157567xi;
import X.C18070vi;
import X.C18100vl;
import X.C28281Zt;
import X.C72453Mb;
import X.C99274sY;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.Iterator;
import java.util.List;

public final class AvatarProfilePhotoActivity extends AnonymousClass1FY {
    public MenuItem A00;
    public View A01;
    public View A02;
    public View A03;
    public ProgressBar A04;
    public Toolbar A05;
    public ShimmerFrameLayout A06;
    public AvatarProfilePhotoImageView A07;
    public WDSButton A08;
    public AnonymousClass00H A09;
    public boolean A0A;
    public final C111785kQ A0B;
    public final C111785kQ A0C;
    public final C18100vl A0D;
    public final C18100vl A0E;
    public final C18100vl A0F;

    public boolean onCreateOptionsMenu(Menu menu) {
        View view;
        C18070vi.A0d(menu, 0);
        getMenuInflater().inflate(2131820545, menu);
        MenuItem findItem = menu.findItem(2131432494);
        this.A00 = findItem;
        if (findItem != null) {
            findItem.setIcon((Drawable) this.A0D.getValue());
        }
        MenuItem menuItem = this.A00;
        if ((menuItem instanceof View) && (view = (View) menuItem) != null) {
            AnonymousClass3MW.A1Q(view);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public void A2y() {
        if (!this.A0A) {
            this.A0A = true;
            AnonymousClass1K1 A0K = C108955ca.A0K(this);
            AnonymousClass10E A0A2 = C109005cf.A0A(A0K, this);
            AnonymousClass1FB.A0M(A0A2, this);
            AnonymousClass10G r1 = A0A2.A00;
            C109005cf.A0d(A0A2, r1, this);
            C109005cf.A0e(A0A2, r1, this, r1.A5A);
            this.A09 = C000200d.A00(A0K.A09);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        String str;
        boolean z;
        MenuItem menuItem2 = menuItem;
        int A0B2 = C72453Mb.A0B(menuItem2);
        if (A0B2 == 2131432494) {
            AvatarProfilePhotoViewModel avatarProfilePhotoViewModel = (AvatarProfilePhotoViewModel) this.A0F.getValue();
            Log.i("AvatarProfilePhotoViewModel/onSavePhotoClicked()");
            AnonymousClass1DT r2 = avatarProfilePhotoViewModel.A00;
            C140026zp r6 = (C140026zp) r2.A06();
            if (r6 == null) {
                str = "AvatarProfilePhotoViewModel/onSavePhotoClicked(null view state)";
            } else {
                C115445u1 r12 = r6.A01;
                C115475u4 r13 = r6.A00;
                if (r12 == null || r13 == null) {
                    str = "AvatarProfilePhotoViewModel/onSavePhotoClicked(null value)";
                } else {
                    Iterator it = r6.A03.iterator();
                    int i = 0;
                    int i2 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i2 = -1;
                            break;
                        }
                        C115465u3 r4 = (C115465u3) it.next();
                        if (r4 instanceof C115455u2) {
                            z = ((C115455u2) r4).A01;
                        } else {
                            z = ((C115445u1) r4).A04;
                        }
                        if (z) {
                            break;
                        }
                        i2++;
                    }
                    Iterator it2 = r6.A02.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (((C115475u4) it2.next()).A03) {
                                break;
                            }
                            i++;
                        } else {
                            i = -1;
                            break;
                        }
                    }
                    C140026zp A0D2 = C108975cc.A0D(r2);
                    List list = A0D2.A03;
                    List list2 = A0D2.A02;
                    C115475u4 r42 = A0D2.A00;
                    C115445u1 r5 = A0D2.A01;
                    boolean z2 = A0D2.A05;
                    boolean z3 = A0D2.A04;
                    C18070vi.A0e(list, 1, list2);
                    r2.A0F(new C140026zp(r42, r5, list, list2, true, z2, z3));
                    avatarProfilePhotoViewModel.A05.CGN(new C146707Qh(avatarProfilePhotoViewModel, r12, r13, i, i2, 1));
                }
            }
            Log.i(str);
        } else if (A0B2 == 16908332) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(menuItem2);
    }

    public AvatarProfilePhotoActivity(int i) {
        this.A0A = false;
        AnonymousClass79Z.A00(this, 17);
    }

    public void onCreate(Bundle bundle) {
        View view;
        super.onCreate(bundle);
        setContentView(2131624019);
        Toolbar A0F2 = AnonymousClass3Ma.A0F(this);
        setSupportActionBar(A0F2);
        C109005cf.A0O(this, A0F2, this.A00);
        A0F2.setTitle(2131886865);
        A0F2.setTouchscreenBlocksFocus(false);
        this.A05 = A0F2;
        if (AnonymousClass112.A01()) {
            C28281Zt.A05(this, AnonymousClass1YL.A00(this, 2130969989, 2131101074));
            C28281Zt.A0A(getWindow(), !C28281Zt.A0B(this));
        }
        WDSButton wDSButton = (WDSButton) C110885hR.A0A(this, 2131427984);
        AnonymousClass3MZ.A1J(wDSButton, this, 17);
        this.A08 = wDSButton;
        C003401n supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0M(2131886865);
        }
        C111785kQ r1 = this.A0C;
        RecyclerView recyclerView = (RecyclerView) C110885hR.A0A(this, 2131427977);
        C108965cb.A14(r1, recyclerView);
        recyclerView.setLayoutManager(new AvatarProfilePhotoActivity$setupRecyclerView$1$1(recyclerView.getContext()));
        C111785kQ r12 = this.A0B;
        RecyclerView recyclerView2 = (RecyclerView) C110885hR.A0A(this, 2131427949);
        C108965cb.A14(r12, recyclerView2);
        recyclerView2.setLayoutManager(new AvatarProfilePhotoActivity$setupRecyclerView$1$1(recyclerView2.getContext()));
        this.A07 = (AvatarProfilePhotoImageView) C110885hR.A0A(this, 2131427976);
        this.A02 = C110885hR.A0A(this, 2131433990);
        this.A04 = (ProgressBar) C110885hR.A0A(this, 2131434137);
        this.A06 = (ShimmerFrameLayout) C110885hR.A0A(this, 2131433991);
        this.A03 = C110885hR.A0A(this, 2131433992);
        this.A01 = C110885hR.A0A(this, 2131428020);
        AvatarProfilePhotoImageView avatarProfilePhotoImageView = this.A07;
        if (avatarProfilePhotoImageView != null) {
            AnonymousClass3MY.A0w(this, avatarProfilePhotoImageView, 2131886862);
        }
        View view2 = this.A03;
        if (view2 != null) {
            AnonymousClass3MY.A0w(this, view2, 2131886861);
        }
        View view3 = this.A01;
        if (view3 != null) {
            AnonymousClass3MY.A0w(this, view3, 2131886852);
        }
        WDSButton wDSButton2 = this.A08;
        if (wDSButton2 != null) {
            AnonymousClass3MY.A0w(this, wDSButton2, 2131898715);
        }
        Toolbar toolbar = this.A05;
        if (toolbar != null) {
            toolbar.setNavigationContentDescription((CharSequence) getString(2131898643));
        }
        View view4 = this.A03;
        if (view4 != null) {
            AnonymousClass1Y5.A0A(view4, true);
        }
        View view5 = this.A01;
        if (view5 != null) {
            AnonymousClass1Y5.A0A(view5, true);
        }
        C18100vl r3 = this.A0F;
        AnonymousClass7AT.A01(this, ((AvatarProfilePhotoViewModel) AnonymousClass7AT.A00(this, ((AvatarProfilePhotoViewModel) r3.getValue()).A00, r3, new C157557xh(this), 2)).A04, new C157547xg(this), 2);
        if (C72453Mb.A08(this) == 2 && (view = this.A02) != null) {
            AnonymousClass795.A00(view.getViewTreeObserver(), new C148177h1(this), view, 0);
        }
    }

    public AvatarProfilePhotoActivity() {
        this(0);
        this.A0F = C99274sY.A00(new C148197h3(this), new C148187h2(this), new C155097sC(this), AnonymousClass3MW.A15(AvatarProfilePhotoViewModel.class));
        this.A0C = new C111785kQ(new C157567xi(this));
        this.A0B = new C111785kQ(new C157537xf(this));
        Integer num = AnonymousClass00R.A0C;
        this.A0D = AnonymousClass1DF.A00(num, new C148157gz(this));
        this.A0E = AnonymousClass1DF.A00(num, new C148167h0(this));
    }
}
