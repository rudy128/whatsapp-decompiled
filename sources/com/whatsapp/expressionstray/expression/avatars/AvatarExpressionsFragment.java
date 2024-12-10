package com.whatsapp.expressionstray.expression.avatars;

import X.A59;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass118;
import X.AnonymousClass11P;
import X.AnonymousClass1BI;
import X.AnonymousClass1DF;
import X.AnonymousClass1HF;
import X.AnonymousClass1OB;
import X.AnonymousClass1OR;
import X.AnonymousClass1OS;
import X.AnonymousClass1OX;
import X.AnonymousClass20F;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4I5;
import X.AnonymousClass4Z6;
import X.AnonymousClass612;
import X.AnonymousClass6RP;
import X.AnonymousClass6UU;
import X.AnonymousClass6UV;
import X.AnonymousClass7k1;
import X.AnonymousClass7z1;
import X.AnonymousClass7z2;
import X.AnonymousClass841;
import X.AnonymousClass874;
import X.AnonymousClass876;
import X.AnonymousClass877;
import X.AnonymousClass88B;
import X.C108945cZ;
import X.C108955ca;
import X.C108965cb;
import X.C108975cc;
import X.C108995ce;
import X.C111635k2;
import X.C111835kV;
import X.C117335zb;
import X.C1177360t;
import X.C1177460u;
import X.C120406Do;
import X.C120426Dq;
import X.C125906bs;
import X.C132866nk;
import X.C138756xd;
import X.C1417976z;
import X.C1418377d;
import X.C147207Sf;
import X.C150007jy;
import X.C150017jz;
import X.C150027k0;
import X.C150037k2;
import X.C150047k3;
import X.C150057k4;
import X.C150067k5;
import X.C150077k6;
import X.C155637t4;
import X.C155647t5;
import X.C155657t6;
import X.C155667t7;
import X.C17960vV;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C18090vk;
import X.C18100vl;
import X.C18600wl;
import X.C201811d;
import X.C22821Di;
import X.C23661Hd;
import X.C25291Nq;
import X.C25311Ns;
import X.C26092CsA;
import X.C26631Sw;
import X.C27183DXs;
import X.C28931bI;
import X.C30391dr;
import X.C30451dy;
import X.C37581pm;
import X.C37961qT;
import X.C37971qU;
import X.C38251qy;
import X.C41561wd;
import X.C72453Mb;
import X.C825148g;
import X.C88604aC;
import X.C99274sY;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.AutoFitGridRecyclerView;
import com.whatsapp.WaImageView;
import com.whatsapp.expressionstray.search.ExpressionsSearchViewModel;
import com.whatsapp.expressionstray.search.ExpressionsSearchViewModel$onStickerSelected$1;
import com.whatsapp.media.GridLayoutManagerNonPredictiveAnimations;
import com.whatsapp.productinfra.avatar.squid.AvatarSquidConfiguration;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.topbar.WDSToolbar;

public final class AvatarExpressionsFragment extends Hilt_AvatarExpressionsFragment implements AnonymousClass88B, AnonymousClass877, AnonymousClass874, AnonymousClass876 {
    public View A00;
    public View A01;
    public ViewStub A02;
    public CoordinatorLayout A03;
    public RecyclerView A04;
    public C25311Ns A05;
    public WaImageView A06;
    public AnonymousClass11P A07;
    public AnonymousClass118 A08;
    public C23661Hd A09;
    public AvatarStickersCategoriesView A0A;
    public ExpressionsSearchViewModel A0B;
    public C111835kV A0C;
    public AnonymousClass6UU A0D;
    public AvatarSquidConfiguration A0E;
    public C26631Sw A0F;
    public C28931bI A0G;
    public AnonymousClass00H A0H;
    public AnonymousClass00H A0I;
    public AnonymousClass00H A0J;
    public AnonymousClass00H A0K;
    public AnonymousClass00H A0L;
    public boolean A0M;
    public boolean A0N;
    public View A0O;
    public View A0P;
    public GridLayoutManager A0Q;
    public final AnonymousClass00H A0R = C201811d.A00(32773);
    public final C18100vl A0S;
    public final C18100vl A0T;
    public final C18100vl A0U;
    public final C18100vl A0V;
    public final AnonymousClass1OS A0W;
    public final AnonymousClass00H A0X = C201811d.A00(65552);

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        int i = 2131624249;
        if (C108975cc.A1F(this)) {
            i = 2131624250;
        }
        return layoutInflater.inflate(i, viewGroup, false);
    }

    public void A21(Bundle bundle, View view) {
        boolean z;
        C18070vi.A0d(view, 0);
        this.A01 = AnonymousClass1HF.A06(view, 2131428011);
        this.A04 = C108945cZ.A0U(view, 2131431853);
        this.A0A = (AvatarStickersCategoriesView) AnonymousClass1HF.A06(view, 2131428919);
        this.A0G = C28931bI.A00(view, 2131427991);
        this.A00 = AnonymousClass1HF.A06(view, 2131428004);
        this.A06 = AnonymousClass3MW.A0R(view, 2131433164);
        this.A03 = (CoordinatorLayout) AnonymousClass1HF.A06(view, 2131435506);
        ViewStub A0E2 = AnonymousClass3MW.A0E(view, 2131433139);
        View inflate = A0E2.inflate();
        this.A0O = AnonymousClass1HF.A06(inflate, 2131433137);
        this.A0P = AnonymousClass1HF.A06(inflate, 2131427970);
        AvatarSquidConfiguration avatarSquidConfiguration = this.A0E;
        if (avatarSquidConfiguration != null) {
            if (avatarSquidConfiguration.A00() != AnonymousClass6RP.DISABLED) {
                ImageView A0C2 = AnonymousClass3Ma.A0C(inflate, 2131427967);
                ImageView A0C3 = AnonymousClass3Ma.A0C(inflate, 2131427968);
                ImageView A0C4 = AnonymousClass3Ma.A0C(inflate, 2131427969);
                A0C2.setImageResource(2131231706);
                A0C3.setImageResource(2131231707);
                A0C4.setImageResource(2131231708);
            }
            this.A02 = A0E2;
            if (C108975cc.A1F(this)) {
                A00();
                A01();
            } else {
                A01();
                A00();
            }
            Configuration configuration = AnonymousClass3MZ.A09(this).getConfiguration();
            C18070vi.A0X(configuration);
            A02(configuration);
            C37581pm A0H2 = AnonymousClass3MZ.A0H(this);
            AvatarExpressionsFragment$observeState$1 avatarExpressionsFragment$observeState$1 = new AvatarExpressionsFragment$observeState$1(this, (C30391dr) null);
            AnonymousClass1OR r3 = AnonymousClass1OR.A00;
            Integer num = AnonymousClass00R.A00;
            C30451dy.A02(num, r3, avatarExpressionsFragment$observeState$1, A0H2);
            C30451dy.A02(num, r3, new AvatarExpressionsFragment$observeStarredStickerSideEffects$1(this, (C30391dr) null), AnonymousClass3MZ.A0H(this));
            C30451dy.A02(num, r3, new AvatarExpressionsFragment$observeAvatarEvent$1(this, (C30391dr) null), AnonymousClass3MZ.A0H(this));
            Bundle bundle2 = this.A06;
            if (bundle2 != null && bundle2.getBoolean("isCollapsed")) {
                BpD();
            }
            Bundle bundle3 = this.A06;
            if (bundle3 != null) {
                z = bundle3.getBoolean("isSelected");
            } else {
                z = false;
            }
            CJE(z);
            return;
        }
        C18070vi.A11("squidConfiguration");
        throw null;
    }

    public void Bo3(AnonymousClass6UV r8) {
        int i;
        AnonymousClass6UU A032;
        A59 A0e;
        int i2;
        C1177360t r1;
        C111835kV r4 = this.A0C;
        if (r4 != null) {
            int A0Q2 = r4.A0Q();
            i = 0;
            while (true) {
                if (i >= A0Q2) {
                    break;
                }
                Object A0U2 = r4.A0U(i);
                if ((A0U2 instanceof C1177360t) && (r1 = (C1177360t) A0U2) != null && (r1.A00 instanceof AnonymousClass612) && C18070vi.A18(((AnonymousClass612) r1.A00).A00, r8)) {
                    break;
                }
                i++;
            }
        }
        i = 0;
        RecyclerView recyclerView = this.A04;
        if (recyclerView != null) {
            recyclerView.A0c();
        }
        GridLayoutManager gridLayoutManager = this.A0Q;
        if (gridLayoutManager != null) {
            gridLayoutManager.A1a(i, 0);
        }
        C111835kV r0 = this.A0C;
        if (r0 != null && (A032 = ((C138756xd) r0.A0U(i)).A03()) != null) {
            if (!this.A0M) {
                if (r8 instanceof C120406Do) {
                    AnonymousClass00H r02 = this.A0H;
                    if (r02 != null) {
                        A0e = C108945cZ.A0e(r02);
                        i2 = 27;
                    }
                    C18070vi.A11("expressionUserJourneyLogger");
                    throw null;
                }
                boolean A18 = C18070vi.A18(r8, C120426Dq.A00);
                AnonymousClass00H r03 = this.A0H;
                if (r03 != null) {
                    A0e = C108945cZ.A0e(r03);
                    i2 = 4;
                    if (A18) {
                        i2 = 21;
                    }
                }
                C18070vi.A11("expressionUserJourneyLogger");
                throw null;
                A0e.A03(Integer.valueOf(i2), 1, 3);
            }
            this.A0M = false;
            this.A0D = A032;
            C108965cb.A0M(this).A0T(A032);
        }
    }

    public void C6w(AnonymousClass1BI r9, C1418377d r10, Integer num, int i) {
        AnonymousClass1OX A002;
        C18600wl r0;
        AnonymousClass1OS avatarExpressionsViewModel$onStickerSelected$1;
        C1418377d r4 = r10;
        Integer num2 = num;
        int i2 = i;
        if (r10 == null) {
            C17960vV.A0F(false, "Sticker was null, should not happen.");
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("onStickerSelected(sticker=null, origin=");
            A10.append(num);
            A10.append(", position=");
            Log.e(AnonymousClass001.A1L(A10, i));
            return;
        }
        ExpressionsSearchViewModel expressionsSearchViewModel = this.A0B;
        if (expressionsSearchViewModel != null) {
            A002 = C41561wd.A00(expressionsSearchViewModel);
            r0 = expressionsSearchViewModel.A0K;
            avatarExpressionsViewModel$onStickerSelected$1 = new ExpressionsSearchViewModel$onStickerSelected$1(expressionsSearchViewModel, r4, num2, (C30391dr) null, i2);
        } else {
            AvatarExpressionsViewModel A0M2 = C108965cb.A0M(this);
            A002 = C41561wd.A00(A0M2);
            r0 = A0M2.A0I;
            avatarExpressionsViewModel$onStickerSelected$1 = new AvatarExpressionsViewModel$onStickerSelected$1(A0M2, r4, num2, (C30391dr) null, i2);
        }
        AnonymousClass3MW.A1X(r0, avatarExpressionsViewModel$onStickerSelected$1, A002);
    }

    public void onConfigurationChanged(Configuration configuration) {
        C18070vi.A0d(configuration, 0);
        super.onConfigurationChanged(configuration);
        A00();
        A03(this);
        A02(configuration);
    }

    private final void A01() {
        GridLayoutManager gridLayoutManager;
        C37971qU r2;
        C18100vl r3 = this.A0S;
        if (C72453Mb.A1a(r3)) {
            C18100vl A002 = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new C150027k0(new C150037k2(this)));
            this.A0B = (ExpressionsSearchViewModel) C99274sY.A00(new AnonymousClass7k1(A002), new C155647t5(this, A002), new C155637t4(A002), AnonymousClass3MW.A15(ExpressionsSearchViewModel.class)).getValue();
        }
        AvatarExpressionsViewModel A0M2 = C108965cb.A0M(this);
        C18100vl r1 = this.A0T;
        A0M2.A01 = C72453Mb.A1a(r1);
        boolean z = !C72453Mb.A1a(r1);
        C18030ve r9 = this.A02;
        C18070vi.A0W(r9);
        AnonymousClass00H r13 = this.A0L;
        if (r13 != null) {
            AnonymousClass00H r14 = this.A0H;
            if (r14 != null) {
                AnonymousClass00H r15 = this.A0J;
                if (r15 != null) {
                    boolean A052 = C18020vd.A05(C18040vf.A02, this.A02, 8138);
                    C26631Sw r10 = this.A0F;
                    if (r10 != null) {
                        C25311Ns r5 = this.A05;
                        if (r5 != null) {
                            int i = 6;
                            if (C72453Mb.A1a(r3)) {
                                i = 1;
                            }
                            C18030ve r12 = this.A02;
                            C18070vi.A0W(r12);
                            boolean A042 = C25291Nq.A04(r12, 9860);
                            AnonymousClass1OS r32 = this.A0W;
                            AnonymousClass00H r0 = this.A0I;
                            if (r0 != null) {
                                C111835kV r4 = new C111835kV(r5, (C1417976z) null, (C125906bs) null, (C132866nk) C18070vi.A0E(r0), r9, r10, this, (WDSToolbar) null, r13, r14, r15, (Integer) null, (C18090vk) null, (C18090vk) null, (C18090vk) null, new AnonymousClass7z1(this), new AnonymousClass7z2(this), (C22821Di) null, (C22821Di) null, (C22821Di) null, (C22821Di) null, (C22821Di) null, r32, i, A052, false, z, A042, false);
                                this.A0C = r4;
                                RecyclerView recyclerView = this.A04;
                                if (recyclerView != null) {
                                    C37961qT r22 = recyclerView.A0C;
                                    if ((r22 instanceof C37971qU) && (r2 = (C37971qU) r22) != null) {
                                        r2.A00 = false;
                                    }
                                    recyclerView.setAdapter(r4);
                                }
                                AvatarStickersCategoriesView avatarStickersCategoriesView = this.A0A;
                                if (avatarStickersCategoriesView != null) {
                                    avatarStickersCategoriesView.A00 = this;
                                }
                                RecyclerView recyclerView2 = this.A04;
                                if (recyclerView2 != null) {
                                    AnonymousClass11P r42 = this.A07;
                                    if (r42 != null) {
                                        C18030ve r33 = this.A02;
                                        Resources A092 = AnonymousClass3MZ.A09(this);
                                        if (C108975cc.A1F(this)) {
                                            gridLayoutManager = this.A0Q;
                                        } else {
                                            C38251qy layoutManager = recyclerView2.getLayoutManager();
                                            C18070vi.A0z(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
                                            gridLayoutManager = (GridLayoutManager) layoutManager;
                                        }
                                        recyclerView2.A0t(new C1177460u(A092, gridLayoutManager, r42, this, this.A0C, r33, z));
                                        return;
                                    }
                                    C18070vi.A11("time");
                                    throw null;
                                }
                                return;
                            }
                            C18070vi.A11("shapeImageViewLoader");
                            throw null;
                        }
                        C18070vi.A11("referenceCountedFileManager");
                        throw null;
                    }
                    C18070vi.A11("stickerImageFileLoader");
                    throw null;
                }
                C18070vi.A11("stickerSizeCalculator");
                throw null;
            }
            C18070vi.A11("expressionUserJourneyLogger");
            throw null;
        }
        AnonymousClass3MW.A1F();
        throw null;
    }

    private final void A02(Configuration configuration) {
        int i;
        View view = this.A0O;
        if (view != null) {
            C825148g.A00(view, this, 6);
        }
        View view2 = this.A0O;
        if (view2 != null) {
            AnonymousClass3MW.A1Q(view2);
        }
        int i2 = configuration.orientation;
        View view3 = this.A0P;
        if (i2 == 1) {
            if (view3 != null) {
                i = 0;
            } else {
                return;
            }
        } else if (view3 != null) {
            i = 8;
        } else {
            return;
        }
        view3.setVisibility(i);
    }

    public static final void A03(AvatarExpressionsFragment avatarExpressionsFragment) {
        C38251qy r3;
        GridLayoutManager gridLayoutManager;
        AutoFitGridRecyclerView autoFitGridRecyclerView;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        GridLayoutManager gridLayoutManager2;
        C28931bI r0 = avatarExpressionsFragment.A0G;
        if (r0 != null && r0.A01() == 0) {
            boolean A1F = C108975cc.A1F(avatarExpressionsFragment);
            RecyclerView recyclerView3 = null;
            C28931bI r02 = avatarExpressionsFragment.A0G;
            if (!A1F) {
                if (r02 == null || (recyclerView = (RecyclerView) r02.A02()) == null) {
                    r3 = null;
                } else {
                    r3 = recyclerView.getLayoutManager();
                }
                if ((r3 instanceof GridLayoutManager) && (gridLayoutManager = (GridLayoutManager) r3) != null) {
                    gridLayoutManager.A01 = new C111635k2(gridLayoutManager, avatarExpressionsFragment, 4);
                    C28931bI r03 = avatarExpressionsFragment.A0G;
                    if (r03 != null) {
                        recyclerView3 = (RecyclerView) r03.A02();
                    }
                    if ((recyclerView3 instanceof AutoFitGridRecyclerView) && (autoFitGridRecyclerView = (AutoFitGridRecyclerView) recyclerView3) != null) {
                        autoFitGridRecyclerView.A00 = C72453Mb.A0I(avatarExpressionsFragment.A0U);
                    }
                }
            } else if (r02 != null && (recyclerView2 = (RecyclerView) r02.A02()) != null) {
                GridLayoutManagerNonPredictiveAnimations A0R2 = C108995ce.A0R(avatarExpressionsFragment);
                A0R2.A01 = new C111635k2(A0R2, avatarExpressionsFragment, 3);
                recyclerView2.setLayoutManager(A0R2);
                C38251qy layoutManager = recyclerView2.getLayoutManager();
                if ((layoutManager instanceof GridLayoutManagerNonPredictiveAnimations) && (gridLayoutManager2 = (GridLayoutManager) layoutManager) != null) {
                    int A092 = C72453Mb.A09(avatarExpressionsFragment.A14());
                    int A0I2 = C72453Mb.A0I(avatarExpressionsFragment.A0U);
                    C23661Hd r04 = avatarExpressionsFragment.A09;
                    if (r04 != null) {
                        int i = A092 / A0I2;
                        if (r04.A01()) {
                            i /= 2;
                        }
                        if (i < 1) {
                            i = 1;
                        }
                        gridLayoutManager2.A1g(i);
                        return;
                    }
                    C18070vi.A11("deviceUtils");
                    throw null;
                }
            }
        }
    }

    public void CJE(boolean z) {
        if (this.A0N == z && z) {
            AvatarExpressionsViewModel A0M2 = C108965cb.A0M(this);
            if (A0M2.A0L.getValue() instanceof C117335zb) {
                C108975cc.A0L(A0M2.A0A).A03((Boolean) null, 1);
            }
            AnonymousClass3MX.A1Q(new AvatarExpressionsViewModel$logAvatarTabImpression$1(A0M2, (C30391dr) null), C41561wd.A00(A0M2));
        }
        this.A0N = z;
        C111835kV r2 = this.A0C;
        if (r2 != null) {
            r2.A02 = z;
            r2.A00 = C72453Mb.A03(z ? 1 : 0);
            GridLayoutManager gridLayoutManager = this.A0Q;
            if (gridLayoutManager != null) {
                int A1N = gridLayoutManager.A1N();
                r2.A0J(A1N, gridLayoutManager.A1P() - A1N);
            }
        }
    }

    public AvatarExpressionsFragment() {
        C150077k6 r1 = new C150077k6(this);
        Integer num = AnonymousClass00R.A0C;
        C18100vl A002 = AnonymousClass1DF.A00(num, new C150047k3(r1));
        AnonymousClass20F A15 = AnonymousClass3MW.A15(AvatarExpressionsViewModel.class);
        this.A0V = C99274sY.A00(new C150057k4(A002), new C155667t7(this, A002), new C155657t6(A002), A15);
        this.A0W = new AnonymousClass841(this);
        this.A0S = AnonymousClass1DF.A00(num, new C150007jy(this));
        this.A0T = AnonymousClass1DF.A00(num, new C150017jz(this));
        this.A0U = AnonymousClass1DF.A00(num, new C150067k5(this));
    }

    private final void A00() {
        AutoFitGridRecyclerView autoFitGridRecyclerView;
        if (C108975cc.A1F(this)) {
            if (this.A0Q == null) {
                GridLayoutManager gridLayoutManager = new GridLayoutManager(A14(), -1, 1, false);
                gridLayoutManager.A01 = new C111635k2(gridLayoutManager, this, 1);
                this.A0Q = gridLayoutManager;
                RecyclerView recyclerView = this.A04;
                if (recyclerView != null) {
                    recyclerView.setLayoutManager(gridLayoutManager);
                }
            }
            GridLayoutManager gridLayoutManager2 = this.A0Q;
            if (gridLayoutManager2 != null) {
                int A092 = C72453Mb.A09(A14());
                int A0I2 = C72453Mb.A0I(this.A0U);
                C23661Hd r0 = this.A09;
                if (r0 != null) {
                    int i = A092 / A0I2;
                    if (r0.A01()) {
                        i /= 2;
                    }
                    if (i < 1) {
                        i = 1;
                    }
                    gridLayoutManager2.A1g(i);
                    return;
                }
                C18070vi.A11("deviceUtils");
                throw null;
            }
            return;
        }
        RecyclerView recyclerView2 = this.A04;
        C38251qy r2 = null;
        if (recyclerView2 != null) {
            r2 = recyclerView2.getLayoutManager();
        }
        C18070vi.A0z(r2, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        GridLayoutManager gridLayoutManager3 = (GridLayoutManager) r2;
        gridLayoutManager3.A01 = new C111635k2(gridLayoutManager3, this, 2);
        this.A0Q = gridLayoutManager3;
        RecyclerView recyclerView3 = this.A04;
        if ((recyclerView3 instanceof AutoFitGridRecyclerView) && (autoFitGridRecyclerView = (AutoFitGridRecyclerView) recyclerView3) != null) {
            autoFitGridRecyclerView.A00 = C72453Mb.A0I(this.A0U);
        }
    }

    public void A1s() {
        super.A1s();
        this.A01 = null;
        this.A02 = null;
        this.A04 = null;
        this.A0C = null;
        this.A0Q = null;
        this.A0A = null;
        this.A0G = null;
        this.A00 = null;
        this.A06 = null;
        this.A03 = null;
    }

    public void BpD() {
        AnonymousClass1OB r0;
        AvatarExpressionsViewModel A0M2 = C108965cb.A0M(this);
        AnonymousClass1OB r02 = A0M2.A00;
        if (r02 == null || !r02.Be2() || (r0 = A0M2.A00) == null || r0.BeK()) {
            C27183DXs A0I2 = C108955ca.A0I(new AvatarExpressionsViewModel$observeEverything$3(A0M2, (C30391dr) null), AnonymousClass4Z6.A00(new AvatarExpressionsViewModel$observeEverything$$inlined$flatMapLatest$1(A0M2, (C30391dr) null), C26092CsA.A02(new C147207Sf(A0M2, A0M2.A05.A07, 7))));
            C18600wl r3 = A0M2.A0I;
            A0M2.A00 = C88604aC.A03(C41561wd.A00(A0M2), AnonymousClass4I5.A00(r3, A0I2));
            if (A0M2.A07.A06() == null) {
                AnonymousClass3MW.A1X(r3, new AvatarExpressionsViewModel$getLoudlyCryingAvatarSticker$1(A0M2, (C30391dr) null), C41561wd.A00(A0M2));
                return;
            }
            return;
        }
        Log.e("AvatarExpressionsViewModel/data source is still being observed, no need to subscribe again.");
    }
}
