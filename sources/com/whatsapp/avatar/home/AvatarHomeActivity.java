package com.whatsapp.avatar.home;

import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1DF;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1K1;
import X.AnonymousClass1Y5;
import X.AnonymousClass1YQ;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4aX;
import X.AnonymousClass6RP;
import X.AnonymousClass79Z;
import X.AnonymousClass7AT;
import X.AnonymousClass7E0;
import X.AnonymousClass7L9;
import X.AnonymousClass7RK;
import X.AnonymousClass7xV;
import X.AnonymousClass7xW;
import X.C000200d;
import X.C003401n;
import X.C108945cZ;
import X.C108955ca;
import X.C108975cc;
import X.C108985cd;
import X.C109005cf;
import X.C114315qV;
import X.C115345tr;
import X.C115415ty;
import X.C132586n5;
import X.C133856pc;
import X.C148137gx;
import X.C148147gy;
import X.C18070vi;
import X.C18100vl;
import X.C23581Gv;
import X.C24671Lf;
import X.C28281Zt;
import X.C36361nl;
import X.C39351sv;
import X.C43531zx;
import X.C72453Mb;
import X.C74743cP;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.bottomsheet.LockableBottomSheetBehavior;
import com.whatsapp.components.MainChildCoordinatorLayout;
import com.whatsapp.productinfra.avatar.squid.AvatarSquidConfiguration;
import com.whatsapp.productinfra.avatar.squid.AvatarSquidUpsellView;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.button.WDSButton;

public final class AvatarHomeActivity extends AnonymousClass1FY {
    public View A00;
    public View A01;
    public View A02;
    public FrameLayout A03;
    public LinearLayout A04;
    public LinearLayout A05;
    public LinearLayout A06;
    public AnonymousClass1YQ A07;
    public CircularProgressBar A08;
    public C36361nl A09;
    public WaImageView A0A;
    public WaImageView A0B;
    public WaTextView A0C;
    public WaTextView A0D;
    public WaTextView A0E;
    public C132586n5 A0F;
    public LockableBottomSheetBehavior A0G;
    public MainChildCoordinatorLayout A0H;
    public C24671Lf A0I;
    public AvatarSquidConfiguration A0J;
    public AvatarSquidUpsellView A0K;
    public AnonymousClass00H A0L;
    public WaTextView A0M;
    public WDSButton A0N;
    public boolean A0O;
    public final C18100vl A0P;
    public final C18100vl A0Q;
    public final C23581Gv A0R;

    public void CBt(String str) {
        C18070vi.A0d(str, 0);
        if (str.equals("avatar_delete_dialog_tag")) {
            AvatarHomeViewModel avatarHomeViewModel = (AvatarHomeViewModel) this.A0Q.getValue();
            Log.i("onConfirmDeleteAvatarClicked");
            avatarHomeViewModel.A00.A0F(new C115415ty(C115345tr.A00, true, false, false));
            C108975cc.A0L(avatarHomeViewModel.A03).A03((Boolean) null, 25);
            ((C133856pc) avatarHomeViewModel.A05.get()).A01(new AnonymousClass7L9(avatarHomeViewModel, 0));
        }
    }

    public static final void A03(AvatarHomeActivity avatarHomeActivity) {
        WaTextView waTextView = avatarHomeActivity.A0C;
        if (waTextView != null) {
            AnonymousClass3MZ.A1J(waTextView, avatarHomeActivity, 13);
            WaTextView waTextView2 = avatarHomeActivity.A0C;
            if (waTextView2 != null) {
                waTextView2.setClickable(true);
                WaTextView waTextView3 = avatarHomeActivity.A0D;
                String str = "createProfilePhotoTextView";
                if (waTextView3 != null) {
                    AnonymousClass3MZ.A1J(waTextView3, avatarHomeActivity, 14);
                    WaTextView waTextView4 = avatarHomeActivity.A0D;
                    if (waTextView4 != null) {
                        waTextView4.setClickable(true);
                        WaTextView waTextView5 = avatarHomeActivity.A0E;
                        str = "deleteAvatarTextView";
                        if (waTextView5 != null) {
                            AnonymousClass3MZ.A1J(waTextView5, avatarHomeActivity, 15);
                            WaTextView waTextView6 = avatarHomeActivity.A0E;
                            if (waTextView6 != null) {
                                waTextView6.setClickable(true);
                                LinearLayout linearLayout = avatarHomeActivity.A06;
                                if (linearLayout != null) {
                                    AnonymousClass3MZ.A1J(linearLayout, avatarHomeActivity, 7);
                                    LinearLayout linearLayout2 = avatarHomeActivity.A06;
                                    if (linearLayout2 != null) {
                                        linearLayout2.setClickable(true);
                                        return;
                                    }
                                }
                                C18070vi.A11("containerPrivacy");
                                throw null;
                            }
                        }
                    }
                }
                C18070vi.A11(str);
                throw null;
            }
        }
        C18070vi.A11("browseStickersTextView");
        throw null;
    }

    public static final void A0V(AvatarHomeActivity avatarHomeActivity, boolean z) {
        MainChildCoordinatorLayout mainChildCoordinatorLayout = avatarHomeActivity.A0H;
        if (mainChildCoordinatorLayout == null) {
            C18070vi.A11("coordinatorLayout");
            throw null;
        } else {
            mainChildCoordinatorLayout.post(new AnonymousClass7RK(7, (Object) avatarHomeActivity, z));
        }
    }

    private final boolean A0c() {
        LockableBottomSheetBehavior lockableBottomSheetBehavior = this.A0G;
        if (lockableBottomSheetBehavior == null) {
            return false;
        }
        int i = lockableBottomSheetBehavior.A0J;
        if (Integer.valueOf(i) == null) {
            return false;
        }
        if (i != 5 && i != 3) {
            return false;
        }
        lockableBottomSheetBehavior.A0W(4);
        return true;
    }

    public void A2y() {
        if (!this.A0O) {
            this.A0O = true;
            AnonymousClass1K1 A0K2 = C108955ca.A0K(this);
            AnonymousClass10E A0A2 = C109005cf.A0A(A0K2, this);
            AnonymousClass1FB.A0M(A0A2, this);
            AnonymousClass10G r1 = A0A2.A00;
            C109005cf.A0d(A0A2, r1, this);
            C109005cf.A0e(A0A2, r1, this, r1.A5A);
            this.A0L = C000200d.A00(A0K2.A09);
            this.A0F = (C132586n5) r1.A6N.get();
            this.A0J = (AvatarSquidConfiguration) A0A2.ADx.get();
            this.A0I = AnonymousClass3Ma.A0S(A0A2);
            this.A09 = C108985cd.A0N(A0A2);
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        int dimensionPixelSize;
        Resources resources;
        int i;
        A2r(9);
        super.onCreate(bundle);
        setContentView(2131624018);
        this.A0H = (MainChildCoordinatorLayout) AnonymousClass3MY.A0C(this, 2131429666);
        this.A04 = (LinearLayout) AnonymousClass3MY.A0C(this, 2131427964);
        this.A05 = (LinearLayout) AnonymousClass3MY.A0C(this, 2131427966);
        this.A03 = (FrameLayout) AnonymousClass3MY.A0C(this, 2131427993);
        LinearLayout linearLayout = (LinearLayout) AnonymousClass3MY.A0C(this, 2131427980);
        this.A06 = linearLayout;
        if (linearLayout != null) {
            TextView A0J2 = AnonymousClass3MW.A0J(linearLayout, 2131427982);
            A0J2.setPaintFlags(A0J2.getPaintFlags() | 8);
            this.A02 = AnonymousClass3MY.A0C(this, 2131427947);
            this.A0B = (WaImageView) AnonymousClass3MY.A0C(this, 2131427974);
            if (C72453Mb.A08(this) != 2) {
                LinearLayout linearLayout2 = this.A04;
                if (linearLayout2 == null) {
                    str = "containerAvatarSheet";
                    C18070vi.A11(str);
                    throw null;
                }
                BottomSheetBehavior A022 = BottomSheetBehavior.A02(linearLayout2);
                C18070vi.A0z(A022, "null cannot be cast to non-null type com.whatsapp.bottomsheet.LockableBottomSheetBehavior<android.widget.LinearLayout?>");
                LockableBottomSheetBehavior lockableBottomSheetBehavior = (LockableBottomSheetBehavior) A022;
                this.A0G = lockableBottomSheetBehavior;
                if (lockableBottomSheetBehavior != null) {
                    C114315qV.A00(lockableBottomSheetBehavior, this, 2);
                }
            }
            AvatarSquidConfiguration avatarSquidConfiguration = this.A0J;
            if (avatarSquidConfiguration != null) {
                if (avatarSquidConfiguration.A00() != AnonymousClass6RP.DISABLED) {
                    WaImageView waImageView = this.A0B;
                    if (waImageView != null) {
                        waImageView.setImageResource(2131232485);
                        this.A0K = (AvatarSquidUpsellView) findViewById(2131427965);
                    }
                    str = "newUserAvatarImage";
                } else {
                    int A082 = C72453Mb.A08(this);
                    Resources resources2 = getResources();
                    if (A082 == 1) {
                        dimensionPixelSize = resources2.getDimensionPixelSize(2131165418);
                        resources = getResources();
                        i = 2131169543;
                    } else {
                        dimensionPixelSize = resources2.getDimensionPixelSize(2131165419);
                        resources = getResources();
                        i = 2131169541;
                    }
                    int dimensionPixelSize2 = resources.getDimensionPixelSize(i);
                    int dimensionPixelSize3 = getResources().getDimensionPixelSize(2131169539);
                    WaImageView waImageView2 = this.A0B;
                    if (waImageView2 != null) {
                        C43531zx.A03(waImageView2, new C39351sv(0, dimensionPixelSize2, 0, dimensionPixelSize3));
                        WaImageView waImageView3 = this.A0B;
                        if (waImageView3 != null) {
                            AnonymousClass3MX.A1F(waImageView3, dimensionPixelSize);
                        }
                    }
                    C18070vi.A11("newUserAvatarImage");
                    throw null;
                }
                WaImageView waImageView4 = (WaImageView) AnonymousClass3MY.A0C(this, 2131427994);
                AnonymousClass3MZ.A1J(waImageView4, this, 9);
                this.A0A = waImageView4;
                this.A08 = (CircularProgressBar) AnonymousClass3MY.A0C(this, 2131427995);
                this.A0C = (WaTextView) AnonymousClass3MY.A0C(this, 2131427948);
                this.A0D = (WaTextView) AnonymousClass3MY.A0C(this, 2131427951);
                this.A0E = (WaTextView) AnonymousClass3MY.A0C(this, 2131427952);
                WaTextView waTextView = this.A0C;
                if (waTextView == null) {
                    str = "browseStickersTextView";
                } else {
                    AnonymousClass1Y5.A07(waTextView, "Button");
                    WaTextView waTextView2 = this.A0D;
                    str = "createProfilePhotoTextView";
                    if (waTextView2 != null) {
                        AnonymousClass1Y5.A07(waTextView2, "Button");
                        WaTextView waTextView3 = this.A0D;
                        if (waTextView3 != null) {
                            AnonymousClass1Y5.A07(waTextView3, "Button");
                            LinearLayout linearLayout3 = this.A06;
                            if (linearLayout3 != null) {
                                AnonymousClass1Y5.A07(linearLayout3, "Button");
                                this.A01 = AnonymousClass3MY.A0C(this, 2131427981);
                                WDSButton wDSButton = (WDSButton) AnonymousClass3MY.A0C(this, 2131427950);
                                AnonymousClass3MZ.A1J(wDSButton, this, 10);
                                this.A0N = wDSButton;
                                AnonymousClass1YQ r4 = (AnonymousClass1YQ) AnonymousClass3MY.A0C(this, 2131427962);
                                AnonymousClass3MZ.A1J(r4, this, 11);
                                C74743cP.A03(AnonymousClass4aX.A03(this, 2130970828, 2131102239, 2131231878), r4, this.A00);
                                this.A07 = r4;
                                this.A00 = AnonymousClass3MY.A0C(this, 2131427963);
                                WaTextView waTextView4 = (WaTextView) AnonymousClass3MY.A0C(this, 2131428007);
                                AnonymousClass3MZ.A1J(waTextView4, this, 12);
                                this.A0M = waTextView4;
                                setTitle(2131886902);
                                C003401n supportActionBar = getSupportActionBar();
                                if (supportActionBar != null) {
                                    supportActionBar.A0M(2131886902);
                                    supportActionBar.A0W(true);
                                }
                                C18100vl r3 = this.A0Q;
                                AnonymousClass7AT.A01(this, ((AvatarHomeViewModel) AnonymousClass7AT.A00(this, ((AvatarHomeViewModel) r3.getValue()).A00, r3, new AnonymousClass7xW(this), 0)).A01, new AnonymousClass7xV(this), 0);
                                WaImageView waImageView5 = this.A0B;
                                if (waImageView5 != null) {
                                    AnonymousClass3MY.A0w(this, waImageView5, 2131886836);
                                    WaImageView waImageView6 = this.A0A;
                                    if (waImageView6 == null) {
                                        str = "avatarSetImageView";
                                    } else {
                                        AnonymousClass3MY.A0w(this, waImageView6, 2131886839);
                                        C132586n5 r0 = this.A0F;
                                        if (r0 != null) {
                                            r0.A00(this);
                                            if (C72453Mb.A1a(this.A0P)) {
                                                C24671Lf r1 = this.A0I;
                                                if (r1 != null) {
                                                    r1.registerObserver(this.A0R);
                                                    if (C108945cZ.A0o(((AvatarHomeViewModel) r3.getValue()).A06).A01()) {
                                                        WaTextView waTextView5 = this.A0D;
                                                        if (waTextView5 != null) {
                                                            waTextView5.setText(getResources().getString(2131886833));
                                                            return;
                                                        }
                                                    } else {
                                                        return;
                                                    }
                                                } else {
                                                    str = "contactObservers";
                                                }
                                            } else {
                                                return;
                                            }
                                        } else {
                                            str = "avatarPrefetchInvoker";
                                        }
                                    }
                                }
                                str = "newUserAvatarImage";
                            }
                        }
                    }
                }
            } else {
                str = "avatarSquidConfiguration";
            }
            C18070vi.A11(str);
            throw null;
        }
        str = "containerPrivacy";
        C18070vi.A11(str);
        throw null;
    }

    public AvatarHomeActivity(int i) {
        this.A0O = false;
        AnonymousClass79Z.A00(this, 15);
    }

    public static final void A0Q(AvatarHomeActivity avatarHomeActivity) {
        C003401n supportActionBar = avatarHomeActivity.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0E();
        }
        boolean z = !C28281Zt.A0B(avatarHomeActivity);
        MainChildCoordinatorLayout mainChildCoordinatorLayout = avatarHomeActivity.A0H;
        if (mainChildCoordinatorLayout == null) {
            C18070vi.A11("coordinatorLayout");
            throw null;
        } else {
            mainChildCoordinatorLayout.postDelayed(new AnonymousClass7RK(6, (Object) avatarHomeActivity, z), 250);
        }
    }

    public boolean A2w() {
        if (!A0c()) {
            return super.A2w();
        }
        return false;
    }

    public void onBackPressed() {
        if (!A0c()) {
            super.onBackPressed();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        if (C72453Mb.A1a(this.A0P)) {
            C24671Lf r1 = this.A0I;
            if (r1 != null) {
                r1.unregisterObserver(this.A0R);
            } else {
                C18070vi.A11("contactObservers");
                throw null;
            }
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (C72453Mb.A0B(menuItem) != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        if (A0c()) {
            return true;
        }
        finish();
        return true;
    }

    public AvatarHomeActivity() {
        this(0);
        this.A0Q = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new C148147gy(this));
        this.A0R = new AnonymousClass7E0(this, 2);
        this.A0P = AnonymousClass1DF.A01(new C148137gx(this));
    }
}
