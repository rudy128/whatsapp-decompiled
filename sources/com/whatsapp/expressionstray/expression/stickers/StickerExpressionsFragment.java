package com.whatsapp.expressionstray.expression.stickers;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass11P;
import X.AnonymousClass184;
import X.AnonymousClass1BI;
import X.AnonymousClass1DF;
import X.AnonymousClass1FL;
import X.AnonymousClass1HF;
import X.AnonymousClass1KB;
import X.AnonymousClass1OR;
import X.AnonymousClass1OS;
import X.AnonymousClass1OX;
import X.AnonymousClass1SB;
import X.AnonymousClass20F;
import X.AnonymousClass28O;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3NL;
import X.AnonymousClass4I5;
import X.AnonymousClass611;
import X.AnonymousClass63N;
import X.AnonymousClass6UU;
import X.AnonymousClass6g1;
import X.AnonymousClass73B;
import X.AnonymousClass78O;
import X.AnonymousClass7zC;
import X.AnonymousClass7zD;
import X.AnonymousClass7zE;
import X.AnonymousClass7zF;
import X.AnonymousClass7zG;
import X.AnonymousClass844;
import X.AnonymousClass874;
import X.AnonymousClass876;
import X.AnonymousClass88B;
import X.C108945cZ;
import X.C108955ca;
import X.C108965cb;
import X.C108975cc;
import X.C108995ce;
import X.C111635k2;
import X.C111805kS;
import X.C111835kV;
import X.C1177360t;
import X.C125906bs;
import X.C125916bt;
import X.C132866nk;
import X.C133806pW;
import X.C139076yA;
import X.C139496yw;
import X.C1417976z;
import X.C1418377d;
import X.C1420978d;
import X.C1424879q;
import X.C147967gg;
import X.C150297kS;
import X.C150307kT;
import X.C150317kU;
import X.C150327kV;
import X.C150337kW;
import X.C150347kX;
import X.C150357kY;
import X.C150367kZ;
import X.C150377ka;
import X.C150387kb;
import X.C150397kc;
import X.C150407kd;
import X.C155817tM;
import X.C155827tN;
import X.C155837tO;
import X.C155847tP;
import X.C17880vN;
import X.C17960vV;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C18100vl;
import X.C18460wS;
import X.C18600wl;
import X.C201811d;
import X.C218617r;
import X.C22821Di;
import X.C25291Nq;
import X.C25311Ns;
import X.C26631Sw;
import X.C30391dr;
import X.C30451dy;
import X.C36711oL;
import X.C37581pm;
import X.C37961qT;
import X.C37971qU;
import X.C38251qy;
import X.C39711tW;
import X.C41561wd;
import X.C41681wt;
import X.C72453Mb;
import X.C72483Me;
import X.C99274sY;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.AutoFitGridRecyclerView;
import com.whatsapp.WaImageView;
import com.whatsapp.expressionstray.search.ExpressionsSearchViewModel;
import com.whatsapp.expressionstray.search.ExpressionsSearchViewModel$onStickerSelected$1;
import com.whatsapp.media.GridLayoutManagerNonPredictiveAnimations;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.topbar.WDSToolbar;
import java.util.HashMap;
import java.util.List;

public final class StickerExpressionsFragment extends Hilt_StickerExpressionsFragment implements AnonymousClass88B, AnonymousClass874, AnonymousClass876 {
    public long A00;
    public View A01;
    public View A02;
    public View A03;
    public CoordinatorLayout A04;
    public GridLayoutManager A05;
    public RecyclerView A06;
    public RecyclerView A07;
    public C218617r A08;
    public AnonymousClass1KB A09;
    public C25311Ns A0A;
    public AnonymousClass11P A0B;
    public C111805kS A0C;
    public C139076yA A0D;
    public ExpressionsSearchViewModel A0E;
    public C111835kV A0F;
    public AnonymousClass6UU A0G;
    public C26631Sw A0H;
    public AnonymousClass1SB A0I;
    public WDSToolbar A0J;
    public AnonymousClass00H A0K;
    public AnonymousClass00H A0L;
    public AnonymousClass00H A0M;
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
    public boolean A0X;
    public View A0Y;
    public WaImageView A0Z;
    public final AnonymousClass00H A0a = C201811d.A00(32773);
    public final C18100vl A0b;
    public final C18100vl A0c;
    public final C18100vl A0d;
    public final C18100vl A0e;
    public final C18100vl A0f;
    public final AnonymousClass00H A0g = C201811d.A00(49491);
    public final AnonymousClass00H A0h = C201811d.A00(65552);
    public final AnonymousClass1OS A0i;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        int i = 2131627096;
        if (C108975cc.A1F(this)) {
            i = 2131627097;
        }
        return layoutInflater.inflate(i, viewGroup, false);
    }

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        this.A06 = C108945cZ.A0U(view, 2131431853);
        this.A07 = C108945cZ.A0U(view, 2131433395);
        this.A03 = AnonymousClass1HF.A06(view, 2131436441);
        this.A0Z = AnonymousClass3MW.A0R(view, 2131427497);
        this.A01 = AnonymousClass1HF.A06(view, 2131435789);
        this.A02 = AnonymousClass1HF.A06(view, 2131435790);
        this.A0Y = AnonymousClass1HF.A06(view, 2131431113);
        this.A04 = (CoordinatorLayout) AnonymousClass1HF.A06(view, 2131435506);
        C18030ve r1 = this.A02;
        C18070vi.A0W(r1);
        if (C25291Nq.A04(r1, 8964)) {
            this.A0J = (WDSToolbar) AnonymousClass1HF.A06(view, 2131432852);
            A03(this, 0);
            WDSToolbar wDSToolbar = this.A0J;
            if (wDSToolbar != null) {
                AnonymousClass3NL.A02(wDSToolbar.getContext(), wDSToolbar, this.A01, 2131233243);
                wDSToolbar.setNavigationContentDescription((CharSequence) A1H(2131898783));
                wDSToolbar.A0N(2131820593);
                C18030ve r12 = wDSToolbar.A03;
                if (r12 == null || !C25291Nq.A04(r12, 11793)) {
                    wDSToolbar.getMenu().removeItem(2131427650);
                }
                wDSToolbar.setNavigationOnClickListener(new AnonymousClass78O(this, 38));
                wDSToolbar.A0C = new C1424879q(this, 1);
            }
        }
        if (C108975cc.A1F(this)) {
            A00();
            A01();
        } else {
            A01();
            A00();
        }
        C37581pm A0H2 = AnonymousClass3MZ.A0H(this);
        StickerExpressionsFragment$observeState$1 stickerExpressionsFragment$observeState$1 = new StickerExpressionsFragment$observeState$1(this, (C30391dr) null);
        AnonymousClass1OR r4 = AnonymousClass1OR.A00;
        Integer num = AnonymousClass00R.A00;
        C30451dy.A02(num, r4, stickerExpressionsFragment$observeState$1, A0H2);
        C30451dy.A02(num, r4, new StickerExpressionsFragment$observeStarredStickerSideEffects$1(this, (C30391dr) null), AnonymousClass3MZ.A0H(this));
        C30451dy.A02(num, r4, new StickerExpressionsFragment$observeStickerManagementStickerSideEffects$1(this, (C30391dr) null), AnonymousClass3MZ.A0H(this));
        C30451dy.A02(num, r4, new StickerExpressionsFragment$observeExpressionsUiSideEffects$1(this, (C30391dr) null), AnonymousClass3MZ.A0H(this));
        C30451dy.A02(num, r4, new StickerExpressionsFragment$observeShapeStickersLayoutData$1(this, (C30391dr) null), AnonymousClass3MZ.A0H(this));
        Bundle bundle2 = this.A06;
        if (bundle2 != null && bundle2.getBoolean("isCollapsed")) {
            BpD();
        }
        if (!C72453Mb.A1a(this.A0b)) {
            C18030ve r13 = this.A02;
            C18070vi.A0W(r13);
            if (C25291Nq.A04(r13, 8964)) {
                WaImageView waImageView = this.A0Z;
                if (waImageView != null) {
                    waImageView.setVisibility(0);
                }
                WaImageView waImageView2 = this.A0Z;
                if (waImageView2 != null) {
                    waImageView2.setOnClickListener(new AnonymousClass78O(this, 39));
                    return;
                }
                return;
            }
        }
        C72453Mb.A1D(this.A0Z);
    }

    public void C6w(AnonymousClass1BI r12, C1418377d r13, Integer num, int i) {
        AnonymousClass1OX A002;
        C18600wl r0;
        AnonymousClass1OS stickerExpressionsViewModel$onStickerSelected$1;
        String str;
        String str2;
        AnonymousClass73B r02;
        C1418377d r7 = r13;
        if (r13 == null) {
            C17960vV.A0F(false, "Sticker was null, should not happen.");
            Log.e("null sticker selected, can't send.");
            return;
        }
        RecyclerView recyclerView = this.A06;
        int i2 = i;
        if (recyclerView != null) {
            recyclerView.A0c();
            recyclerView.A0f(i);
        }
        Integer num2 = num;
        if (this.A0E != null) {
            if (num != null && num.intValue() == 1) {
                StickerExpressionsViewModel A0P2 = C108955ca.A0P(this);
                StickerExpressionsViewModel.A0B(A0P2, (Long) null);
                HashMap hashMap = A0P2.A0a;
                AnonymousClass63N r1 = (AnonymousClass63N) hashMap.get(A0P2.A01);
                if (r1 == null) {
                    r1 = new AnonymousClass63N();
                }
                AnonymousClass73B r03 = r13.A04;
                if (r03 != null) {
                    str = r03.A02;
                } else {
                    str = null;
                }
                if (C18070vi.A18(str, "Giphy")) {
                    r1.A00 = AnonymousClass3MY.A0f();
                } else {
                    AnonymousClass73B r04 = r13.A04;
                    if (r04 != null) {
                        str2 = r04.A02;
                    } else {
                        str2 = null;
                    }
                    if (C18070vi.A18(str2, "Tenor")) {
                        r1.A00 = 1;
                    } else if (r13.A0P || ((r02 = r13.A04) != null && r02.A03)) {
                        r1.A00 = C17880vN.A0i();
                    } else {
                        r1.A00 = C17880vN.A0j();
                    }
                }
                A0P2.A0F.CC7(r1);
                C41681wt.A03(hashMap).remove(A0P2.A01);
                A0P2.A01 = null;
            }
            ExpressionsSearchViewModel expressionsSearchViewModel = this.A0E;
            if (expressionsSearchViewModel != null) {
                A002 = C41561wd.A00(expressionsSearchViewModel);
                r0 = expressionsSearchViewModel.A0K;
                stickerExpressionsViewModel$onStickerSelected$1 = new ExpressionsSearchViewModel$onStickerSelected$1(expressionsSearchViewModel, r7, num2, (C30391dr) null, i2);
            } else {
                return;
            }
        } else {
            StickerExpressionsViewModel A0P3 = C108955ca.A0P(this);
            A002 = C41561wd.A00(A0P3);
            r0 = A0P3.A0h;
            stickerExpressionsViewModel$onStickerSelected$1 = new StickerExpressionsViewModel$onStickerSelected$1(A0P3, r7, num2, (C30391dr) null, i2);
        }
        AnonymousClass3MW.A1X(r0, stickerExpressionsViewModel$onStickerSelected$1, A002);
    }

    public void onConfigurationChanged(Configuration configuration) {
        C18070vi.A0d(configuration, 0);
        super.onConfigurationChanged(configuration);
        A00();
    }

    private final void A01() {
        C125916bt r2;
        AnonymousClass1FL A1B;
        C37971qU r3;
        C18100vl r5 = this.A0f;
        C18100vl r46 = this.A0b;
        ((StickerExpressionsViewModel) r5.getValue()).A08 = C72453Mb.A1a(r46);
        C18100vl r20 = this.A0d;
        ((StickerExpressionsViewModel) r5.getValue()).A00 = C72453Mb.A0I(r20);
        if (C72453Mb.A1a(r46)) {
            C18100vl A002 = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new C150327kV(new C150347kX(this)));
            AnonymousClass20F A15 = AnonymousClass3MW.A15(ExpressionsSearchViewModel.class);
            this.A0E = (ExpressionsSearchViewModel) C99274sY.A00(new C150337kW(A002), new C155827tN(this, A002), new C155817tM(A002), A15).getValue();
        }
        ((StickerExpressionsViewModel) r5.getValue()).A0T();
        C18030ve r21 = this.A02;
        C18070vi.A0W(r21);
        AnonymousClass00H r0 = this.A0W;
        AnonymousClass00H r18 = r0;
        if (r0 != null) {
            AnonymousClass00H A2H = A2H();
            AnonymousClass00H r02 = this.A0T;
            AnonymousClass00H r17 = r02;
            if (r02 != null) {
                AnonymousClass00H r03 = this.A0O;
                if (r03 != null) {
                    boolean A003 = ((C133806pW) r03.get()).A00();
                    boolean A1S = AnonymousClass000.A1S(C72453Mb.A0I(r20), 7);
                    C26631Sw r04 = this.A0H;
                    C26631Sw r16 = r04;
                    if (r04 != null) {
                        C25311Ns r15 = this.A0A;
                        if (r15 != null) {
                            int i = 6;
                            if (C72453Mb.A1a(r46)) {
                                i = 1;
                            }
                            C18030ve r1 = this.A02;
                            C18070vi.A0W(r1);
                            boolean A042 = C25291Nq.A04(r1, 9860);
                            AnonymousClass1OS r19 = this.A0i;
                            AnonymousClass00H r05 = this.A0R;
                            if (r05 != null) {
                                C132866nk r7 = (C132866nk) C18070vi.A0E(r05);
                                C150357kY r14 = new C150357kY(this);
                                C147967gg r13 = new C147967gg(this, 2);
                                C150367kZ r12 = new C150367kZ(this);
                                AnonymousClass7zD r11 = new AnonymousClass7zD(this);
                                AnonymousClass7zE r10 = new AnonymousClass7zE(this);
                                AnonymousClass00H r06 = this.A0S;
                                if (r06 != null) {
                                    C125906bs r52 = new C125906bs(this);
                                    AnonymousClass7zF r4 = new AnonymousClass7zF(this);
                                    AnonymousClass7zG r32 = new AnonymousClass7zG(this);
                                    AnonymousClass7zC r22 = new AnonymousClass7zC(this);
                                    AnonymousClass1OS r39 = r19;
                                    AnonymousClass00H r25 = r18;
                                    AnonymousClass00H r27 = r17;
                                    C25311Ns r172 = r15;
                                    C1417976z r182 = (C1417976z) ((AnonymousClass6g1) r06.get()).A02.getValue();
                                    C111835kV r162 = new C111835kV(r172, r182, r52, r7, r21, r16, this, this.A0J, r25, A2H, r27, Integer.valueOf(C72453Mb.A0I(r20)), r14, r13, r12, (C22821Di) null, (C22821Di) null, r11, r10, r4, r32, r22, r39, i, false, A003, A1S, A042, false);
                                    this.A0F = r162;
                                    RecyclerView recyclerView = this.A06;
                                    if (recyclerView != null) {
                                        C37961qT r33 = recyclerView.A0C;
                                        if ((r33 instanceof C37971qU) && (r3 = (C37971qU) r33) != null) {
                                            r3.A00 = false;
                                        }
                                        recyclerView.setAdapter(r162);
                                    }
                                    C18030ve r23 = this.A02;
                                    C18040vf r53 = C18040vf.A02;
                                    if (C18020vd.A05(r53, r23, 9475)) {
                                        AnonymousClass00H r07 = this.A0U;
                                        if (r07 != null) {
                                            r2 = (C125916bt) r07.get();
                                        } else {
                                            C18070vi.A11("stickerTrayIconLoader");
                                            throw null;
                                        }
                                    } else {
                                        r2 = null;
                                    }
                                    C111805kS r08 = new C111805kS(this, r2);
                                    this.A0C = r08;
                                    RecyclerView recyclerView2 = this.A07;
                                    if (recyclerView2 != null) {
                                        recyclerView2.setAdapter(r08);
                                        recyclerView2.setNestedScrollingEnabled(false);
                                        recyclerView2.setItemAnimator((C37961qT) null);
                                        C108965cb.A0z(recyclerView2.getContext(), recyclerView2);
                                    }
                                    RecyclerView recyclerView3 = this.A06;
                                    if (recyclerView3 != null) {
                                        recyclerView3.A0t((C39711tW) this.A0c.getValue());
                                    }
                                    View view = this.A0Y;
                                    if (view != null) {
                                        view.setOnClickListener(new AnonymousClass78O(this, 40));
                                    }
                                    RecyclerView recyclerView4 = this.A06;
                                    if (recyclerView4 != null && (A1B = A1B()) != null && C18020vd.A05(r53, this.A02, 10070)) {
                                        int i2 = 40;
                                        if (C72453Mb.A1a(r46)) {
                                            i2 = 41;
                                        }
                                        AnonymousClass00H r09 = this.A0M;
                                        if (r09 != null) {
                                            C36711oL r110 = ((C139496yw) r09.get()).A00;
                                            r110.A02(A1B);
                                            recyclerView4.A0t(new AnonymousClass28O(A1B, r110, i2));
                                            return;
                                        }
                                        C18070vi.A11("expressionsTrayPerformanceLogger");
                                        throw null;
                                    }
                                    return;
                                }
                                C18070vi.A11("shapeStickerLayoutDataProvider");
                                throw null;
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
                C18070vi.A11("funStickerManager");
                throw null;
            }
            C18070vi.A11("stickerSizeCalculator");
            throw null;
        }
        AnonymousClass3MW.A1F();
        throw null;
    }

    public static final void A03(StickerExpressionsFragment stickerExpressionsFragment, int i) {
        String A0W2;
        WDSToolbar wDSToolbar = stickerExpressionsFragment.A0J;
        if (wDSToolbar != null) {
            if (i == 0) {
                Context A1n = stickerExpressionsFragment.A1n();
                A0W2 = null;
                if (A1n != null) {
                    A0W2 = A1n.getString(2131898930);
                }
            } else {
                A0W2 = C72483Me.A0W(AnonymousClass3MZ.A09(stickerExpressionsFragment), i, 2131755267);
            }
            wDSToolbar.setTitle((CharSequence) A0W2);
        }
    }

    public static final void A04(StickerExpressionsFragment stickerExpressionsFragment, AnonymousClass6UU r7, boolean z) {
        int i;
        C1177360t r1;
        C111835kV r5 = stickerExpressionsFragment.A0F;
        if (r5 != null) {
            int A0Q2 = r5.A0Q();
            i = 0;
            while (true) {
                if (i >= A0Q2) {
                    break;
                }
                Object A0U2 = r5.A0U(i);
                if ((A0U2 instanceof C1177360t) && (r1 = (C1177360t) A0U2) != null && C18070vi.A18(r1.A00.A00(), r7.A00())) {
                    break;
                }
                i++;
            }
        }
        i = 0;
        GridLayoutManager gridLayoutManager = stickerExpressionsFragment.A05;
        if (gridLayoutManager != null) {
            gridLayoutManager.A1a(i, 0);
        }
        StickerExpressionsViewModel A0P2 = C108955ca.A0P(stickerExpressionsFragment);
        AnonymousClass3MW.A1X(A0P2.A0g, new StickerExpressionsViewModel$updateSelectedStickerPack$1(A0P2, r7, (C30391dr) null, z), C41561wd.A00(A0P2));
    }

    public static final void A05(StickerExpressionsFragment stickerExpressionsFragment, String str, boolean z) {
        AnonymousClass6UU r1;
        C1177360t r12;
        if (str != null) {
            C111835kV r4 = stickerExpressionsFragment.A0F;
            if (r4 != null) {
                int A0Q2 = r4.A0Q();
                int i = 0;
                while (true) {
                    if (i >= A0Q2) {
                        break;
                    }
                    Object A0U2 = r4.A0U(i);
                    if ((A0U2 instanceof C1177360t) && (r12 = (C1177360t) A0U2) != null) {
                        r1 = r12.A00;
                        if (C18070vi.A18(r1.A00(), str)) {
                            break;
                        }
                    }
                    i++;
                }
            }
            r1 = new AnonymousClass611(str);
            A04(stickerExpressionsFragment, r1, z);
        }
    }

    public static final void A06(StickerExpressionsFragment stickerExpressionsFragment, List list) {
        int A0D2 = C72453Mb.A0D(stickerExpressionsFragment.A01);
        View view = stickerExpressionsFragment.A02;
        if (view != null) {
            view.setVisibility(A0D2);
        }
        C111835kV r0 = stickerExpressionsFragment.A0F;
        if (r0 != null) {
            r0.A0W(list);
        }
        C111805kS r1 = stickerExpressionsFragment.A0C;
        if (r1 != null) {
            r1.A0W(C18460wS.A00);
        }
    }

    public void A1Y(boolean z) {
        CJE(!z);
    }

    public final AnonymousClass00H A2H() {
        AnonymousClass00H r0 = this.A0L;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("expressionUserJourneyLogger");
        throw null;
    }

    public void CJE(boolean z) {
        GridLayoutManager gridLayoutManager;
        C111835kV r2 = this.A0F;
        if (r2 != null) {
            r2.A02 = z;
            r2.A00 = C72453Mb.A03(z ? 1 : 0);
            if (z && (gridLayoutManager = this.A05) != null) {
                int A1N = gridLayoutManager.A1N();
                r2.A0J(A1N, gridLayoutManager.A1P() - A1N);
            }
        }
    }

    public StickerExpressionsFragment() {
        C150407kd r1 = new C150407kd(this);
        Integer num = AnonymousClass00R.A0C;
        C18100vl A002 = AnonymousClass1DF.A00(num, new C150377ka(r1));
        AnonymousClass20F A15 = AnonymousClass3MW.A15(StickerExpressionsViewModel.class);
        this.A0f = C99274sY.A00(new C150387kb(A002), new C155847tP(this, A002), new C155837tO(A002), A15);
        this.A0b = AnonymousClass1DF.A00(num, new C150297kS(this));
        this.A0d = AnonymousClass1DF.A00(num, new C150317kU(this));
        this.A0c = AnonymousClass1DF.A01(new C150307kT(this));
        this.A0e = AnonymousClass1DF.A01(new C150397kc(this));
        this.A0i = new AnonymousClass844(this);
    }

    private final void A00() {
        AutoFitGridRecyclerView autoFitGridRecyclerView;
        if (C108975cc.A1F(this)) {
            if (this.A05 == null) {
                GridLayoutManagerNonPredictiveAnimations A0R2 = C108995ce.A0R(this);
                A0R2.A01 = new C111635k2(A0R2, this, 6);
                this.A05 = A0R2;
                RecyclerView recyclerView = this.A06;
                if (recyclerView != null) {
                    recyclerView.setLayoutManager(A0R2);
                }
            }
            RecyclerView recyclerView2 = this.A06;
            if (recyclerView2 != null) {
                C1420978d.A00(recyclerView2, this, 7);
                return;
            }
            return;
        }
        RecyclerView recyclerView3 = this.A06;
        C38251qy r2 = null;
        if (recyclerView3 != null && recyclerView3.getLayoutManager() == null) {
            recyclerView3.setLayoutManager(C108995ce.A0R(this));
        }
        RecyclerView recyclerView4 = this.A06;
        if (recyclerView4 != null) {
            r2 = recyclerView4.getLayoutManager();
        }
        C18070vi.A0z(r2, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        GridLayoutManager gridLayoutManager = (GridLayoutManager) r2;
        gridLayoutManager.A01 = new C111635k2(gridLayoutManager, this, 6);
        this.A05 = gridLayoutManager;
        RecyclerView recyclerView5 = this.A06;
        if ((recyclerView5 instanceof AutoFitGridRecyclerView) && (autoFitGridRecyclerView = (AutoFitGridRecyclerView) recyclerView5) != null) {
            autoFitGridRecyclerView.A00 = C72453Mb.A0I(this.A0e);
        }
    }

    public static final void A02(StickerExpressionsFragment stickerExpressionsFragment) {
        StickerExpressionsViewModel A0P2 = C108955ca.A0P(stickerExpressionsFragment);
        AnonymousClass3MW.A1X(A0P2.A0h, new StickerExpressionsViewModel$exitStickerMultiSelectMode$1(A0P2, (C30391dr) null), C41561wd.A00(A0P2));
        A03(stickerExpressionsFragment, 0);
    }

    public void A1s() {
        super.A1s();
        this.A06 = null;
        this.A0F = null;
        this.A07 = null;
        this.A0C = null;
        this.A05 = null;
        this.A01 = null;
        this.A02 = null;
        this.A04 = null;
        this.A0Z = null;
        this.A03 = null;
        this.A0J = null;
        C26631Sw r0 = this.A0H;
        if (r0 != null) {
            r0.A04();
            A02(this);
            this.A0Y = null;
            if (this.A0E != null) {
                C18100vl r4 = this.A0f;
                ((StickerExpressionsViewModel) r4.getValue()).A08 = false;
                StickerExpressionsViewModel stickerExpressionsViewModel = (StickerExpressionsViewModel) r4.getValue();
                StickerExpressionsViewModel.A0B(stickerExpressionsViewModel, (Long) null);
                HashMap hashMap = stickerExpressionsViewModel.A0a;
                AnonymousClass184 r1 = (AnonymousClass184) hashMap.get(stickerExpressionsViewModel.A01);
                if (r1 == null) {
                    r1 = new AnonymousClass63N();
                }
                if (hashMap.get(stickerExpressionsViewModel.A01) != null) {
                    stickerExpressionsViewModel.A0F.CC7(r1);
                }
                C41681wt.A03(hashMap).remove(stickerExpressionsViewModel.A01);
                stickerExpressionsViewModel.A01 = null;
                StickerExpressionsViewModel stickerExpressionsViewModel2 = (StickerExpressionsViewModel) r4.getValue();
                stickerExpressionsViewModel2.A03 = null;
                stickerExpressionsViewModel2.A04 = null;
                stickerExpressionsViewModel2.A02 = null;
                stickerExpressionsViewModel2.A05 = null;
                stickerExpressionsViewModel2.A01 = null;
                stickerExpressionsViewModel2.A0a.clear();
                ((StickerExpressionsViewModel) r4.getValue()).A0T();
                return;
            }
            return;
        }
        C18070vi.A11("stickerImageFileLoader");
        throw null;
    }

    public void BpD() {
        StickerExpressionsViewModel A0P2 = C108955ca.A0P(this);
        C108995ce.A13(A0P2, new StickerExpressionsViewModel$startDataFlows$1(A0P2, (C30391dr) null), AnonymousClass4I5.A00(A0P2.A0h, A0P2.A0G.A01));
        if (C25291Nq.A04(A0P2.A0E, 9754)) {
            AnonymousClass3MW.A1X(A0P2.A0g, new StickerExpressionsViewModel$downloadFeaturedPackIfNecessary$1(A0P2, (C30391dr) null), C41561wd.A00(A0P2));
        } else {
            AnonymousClass3MX.A1Q(new StickerExpressionsViewModel$downloadInitialStickerPacksIfNecessary$1(A0P2, (C30391dr) null), C41561wd.A00(A0P2));
        }
        A02(this);
    }
}
