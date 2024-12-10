package com.whatsapp.quickcontact;

import X.A5G;
import X.A7Y;
import X.AQ9;
import X.AU6;
import X.Af2;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass112;
import X.AnonymousClass12L;
import X.AnonymousClass18K;
import X.AnonymousClass1BI;
import X.AnonymousClass1CJ;
import X.AnonymousClass1DC;
import X.AnonymousClass1E7;
import X.AnonymousClass1EC;
import X.AnonymousClass1HQ;
import X.AnonymousClass1HS;
import X.AnonymousClass1IV;
import X.AnonymousClass1LU;
import X.AnonymousClass1M9;
import X.AnonymousClass1MB;
import X.AnonymousClass1MZ;
import X.AnonymousClass1PU;
import X.AnonymousClass1TA;
import X.AnonymousClass1TD;
import X.AnonymousClass1VP;
import X.AnonymousClass1VT;
import X.AnonymousClass1VU;
import X.AnonymousClass1VW;
import X.AnonymousClass1Xr;
import X.AnonymousClass1Y5;
import X.AnonymousClass1Z2;
import X.AnonymousClass2Q4;
import X.AnonymousClass3L6;
import X.AnonymousClass3MX;
import X.AnonymousClass3Ma;
import X.AnonymousClass48Z;
import X.AnonymousClass48o;
import X.AnonymousClass4Z9;
import X.AnonymousClass4ZR;
import X.AnonymousClass5X3;
import X.AnonymousClass689;
import X.AnonymousClass733;
import X.AnonymousClass745;
import X.AnonymousClass795;
import X.AnonymousClass7RB;
import X.AnonymousClass8BR;
import X.AnonymousClass8BV;
import X.AnonymousClass8BW;
import X.C108955ca;
import X.C108975cc;
import X.C111255jJ;
import X.C1411074h;
import X.C166898eH;
import X.C178119Bw;
import X.C17880vN;
import X.C17890vO;
import X.C17960vV;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C18180vt;
import X.C19620yd;
import X.C19740yt;
import X.C19880zA;
import X.C20292AFa;
import X.C203411t;
import X.C20542APb;
import X.C20543APc;
import X.C21050Adg;
import X.C21051Adh;
import X.C21134Af3;
import X.C222219b;
import X.C22791Df;
import X.C22941Dw;
import X.C22971Dz;
import X.C23581Gv;
import X.C24671Lf;
import X.C24921Me;
import X.C25811Ps;
import X.C27131Uv;
import X.C27141Uw;
import X.C27171Va;
import X.C27191Vc;
import X.C28931bI;
import X.C34191k5;
import X.C34771l3;
import X.C35311m1;
import X.C40811vJ;
import X.C40981vc;
import X.C43421zm;
import X.C59822mw;
import X.C64732vF;
import X.C65062vm;
import X.C72043Kk;
import X.C72453Mb;
import X.C825848y;
import X.C825948z;
import X.C88764ak;
import X.C91614fy;
import X.C99204sR;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.common.dextricks.StringTreeSet;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.FloatingChildLayout;
import com.whatsapp.util.Log;

public class QuickContactActivity extends C166898eH implements AnonymousClass5X3 {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public View A07;
    public ImageView A08;
    public C19880zA A09;
    public C19880zA A0A;
    public C72043Kk A0B;
    public AnonymousClass1HQ A0C;
    public AnonymousClass1VP A0D;
    public AnonymousClass1HS A0E;
    public C203411t A0F;
    public AnonymousClass1VW A0G;
    public AnonymousClass1M9 A0H;
    public C24671Lf A0I;
    public C24921Me A0J;
    public C27191Vc A0K;
    public C27171Va A0L;
    public AnonymousClass733 A0M;
    public AnonymousClass1TD A0N;
    public AnonymousClass1CJ A0O;
    public AnonymousClass1MZ A0P;
    public AnonymousClass1TA A0Q;
    public C59822mw A0R;
    public AnonymousClass1E7 A0S;
    public AnonymousClass1VU A0T;
    public C18030ve A0U;
    public AnonymousClass12L A0V;
    public AnonymousClass18K A0W;
    public AnonymousClass1MB A0X;
    public AnonymousClass1LU A0Y;
    public GroupJid A0Z;
    public AnonymousClass1EC A0a;
    public C27131Uv A0b;
    public AnonymousClass689 A0c;
    public A5G A0d;
    public C35311m1 A0e;
    public C34771l3 A0f;
    public C111255jJ A0g;
    public FloatingChildLayout A0h;
    public AnonymousClass1PU A0i;
    public AnonymousClass1DC A0j;
    public C178119Bw A0k;
    public AnonymousClass1VT A0l;
    public AnonymousClass2Q4 A0m;
    public AnonymousClass00H A0n;
    public AnonymousClass00H A0o;
    public AnonymousClass00H A0p;
    public AnonymousClass00H A0q;
    public AnonymousClass00H A0r;
    public AnonymousClass00H A0s;
    public AnonymousClass00H A0t;
    public AnonymousClass00H A0u;
    public AnonymousClass00H A0v;
    public AnonymousClass00H A0w;
    public AnonymousClass00H A0x;
    public boolean A0y;
    public boolean A0z;
    public C825848y A10;
    public C825948z A11;
    public C28931bI A12;
    public C88764ak A13;
    public final C23581Gv A14 = new AQ9(this, 6);
    public final AnonymousClass3L6 A15 = new AU6(this, 2);
    public final C40981vc A16 = new C21051Adh(this, 2);
    public final C34191k5 A17 = new Af2(this, 1);
    public final AnonymousClass1IV A18 = new C21134Af3(this, 1);

    public static void A0V(QuickContactActivity quickContactActivity, boolean z) {
        if (z) {
            FloatingChildLayout floatingChildLayout = quickContactActivity.A0h;
            if (floatingChildLayout.A01 == 1) {
                floatingChildLayout.A01 = 3;
                ValueAnimator valueAnimator = floatingChildLayout.A05;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{StringTreeSet.OFFSET_BASE_ENCODING, 0});
                    floatingChildLayout.A05 = ofInt;
                    ofInt.addUpdateListener(new C1411074h(floatingChildLayout, 36));
                    floatingChildLayout.A05.setDuration((long) floatingChildLayout.A0B).start();
                } else {
                    floatingChildLayout.A05.reverse();
                }
            }
            FloatingChildLayout floatingChildLayout2 = quickContactActivity.A0h;
            AnonymousClass7RB r4 = new AnonymousClass7RB((Object) quickContactActivity, 44);
            int i = floatingChildLayout2.A02;
            if (i == 1 || i == 2) {
                floatingChildLayout2.A02 = 3;
                View view = floatingChildLayout2.A07;
                if (view != null) {
                    view.invalidate();
                }
                FloatingChildLayout.A00(floatingChildLayout2, r4, true);
                return;
            }
        }
        quickContactActivity.finish();
        quickContactActivity.overridePendingTransition(0, 0);
    }

    public int A31() {
        return 78318969;
    }

    public void onBackPressed() {
        A0V(this, true);
    }

    public static void A03(QuickContactActivity quickContactActivity) {
        AnonymousClass2Q4 r0 = quickContactActivity.A0m;
        if (r0 != null) {
            C178119Bw A042 = quickContactActivity.A0N.A04(r0.A01());
            if (A042 != null) {
                quickContactActivity.A0k = A042;
                return;
            }
            C825848y r2 = new C825848y(new C20542APb(quickContactActivity), quickContactActivity.A0N, quickContactActivity.A0m.A01());
            quickContactActivity.A10 = r2;
            quickContactActivity.A05.CGM(r2, new Void[0]);
        }
    }

    public static void A0Q(QuickContactActivity quickContactActivity) {
        AnonymousClass1M9 r1 = quickContactActivity.A0H;
        AnonymousClass1BI A0l2 = AnonymousClass3MX.A0l(C72453Mb.A0u(quickContactActivity));
        C17960vV.A07(A0l2);
        AnonymousClass1E7 A0H2 = r1.A0H(A0l2);
        quickContactActivity.A0S = A0H2;
        quickContactActivity.A0a = (AnonymousClass1EC) A0H2.A06(AnonymousClass1EC.class);
        quickContactActivity.A0Z = GroupJid.Companion.A03(quickContactActivity.getIntent().getStringExtra("gjid"));
    }

    public static boolean A0c(QuickContactActivity quickContactActivity) {
        C19880zA r1 = quickContactActivity.A09;
        if ((!r1.A07() || !((C25811Ps) r1.A03()).A0D(quickContactActivity.A0S.A0J)) && !quickContactActivity.A0S.A0E()) {
            return false;
        }
        return true;
    }

    public /* synthetic */ void A4b() {
        Intent A112;
        Intent A113;
        if (!this.A0y) {
            AnonymousClass1E7 r2 = this.A0S;
            if (r2.A0g && r2.A0F()) {
                AnonymousClass1MZ r22 = this.A0P;
                AnonymousClass1EC r0 = this.A0a;
                C17960vV.A07(r0);
                if (!r22.A0J(r0)) {
                    BhQ(2131890332);
                    return;
                }
            }
            AnonymousClass1BI r6 = this.A0S.A0J;
            C17960vV.A07(r6);
            UserJid A002 = C22941Dw.A00(r6);
            if (!AnonymousClass745.A00) {
                if (!C18020vd.A05(C18040vf.A02, this.A0U, 9156) || A002 == null) {
                    A113 = AnonymousClass1LU.A11(getApplicationContext(), r6, (String) null, 0.0f, 0, 0, 0, 0, false);
                } else {
                    A113 = AnonymousClass1LU.A1F(this, A002, this.A0z, false);
                }
                startActivity(A113);
            } else {
                String stringExtra = getIntent().getStringExtra("transition_name");
                if (stringExtra == null) {
                    stringExtra = new AnonymousClass4ZR(this).A02(2131899529);
                }
                boolean A1C = C108975cc.A1C(Build.VERSION.SDK_INT, 24);
                int intExtra = getIntent().getIntExtra("status_bar_color", C19740yt.A00(this, AnonymousClass4Z9.A01(this, false)));
                int intExtra2 = getIntent().getIntExtra("navigation_bar_color", AnonymousClass3Ma.A00(this, 2130970285, 2131101276));
                AnonymousClass1Xr.A04(this.A08, stringExtra);
                if (!C18020vd.A05(C18040vf.A02, this.A0U, 9156) || A002 == null) {
                    Context applicationContext = getApplicationContext();
                    float f = 0.0f;
                    if (A1C) {
                        f = 0.5f;
                    }
                    A112 = AnonymousClass1LU.A11(applicationContext, r6, stringExtra, f, getWindow().getStatusBarColor(), intExtra, getWindow().getNavigationBarColor(), intExtra2, false);
                } else {
                    A112 = AnonymousClass1LU.A1F(this, A002, this.A0z, false);
                }
                startActivity(A112, AnonymousClass745.A05(this, this.A08, stringExtra));
                if (!A1C) {
                    C17890vO.A0D().postDelayed(new AnonymousClass7RB((Object) this, 39), (long) getResources().getInteger(17694721));
                    return;
                }
            }
            A0V(this, false);
        }
    }

    public void onCreate(Bundle bundle) {
        if (AnonymousClass745.A00) {
            getWindow().requestFeature(12);
        }
        super.onCreate(bundle);
        setTitle(2131898700);
        Intent intent = getIntent();
        AnonymousClass8BW.A0y(this);
        getWindow().setStatusBarColor(AnonymousClass1Z2.A03(1.0f, intent.getIntExtra("status_bar_color", C19740yt.A00(this, AnonymousClass4Z9.A01(this, false))), 2130706432));
        if (AnonymousClass112.A04()) {
            getWindow().setNavigationBarColor(AnonymousClass1Z2.A03(1.0f, AnonymousClass3Ma.A00(this, 2130970285, 2131101276), 2130706432));
        }
        getWindow().setFlags(A7Y.A0F, A7Y.A0F);
        A0Q(this);
        this.A0z = AnonymousClass3Ma.A1V(this.A02, this.A0S);
        A5G a5g = new A5G(this);
        this.A0d = a5g;
        a5g.A00.setContentView(2131626662);
        this.A02 = findViewById(2131431794);
        this.A08 = AnonymousClass3MX.A0I(this, 2131433831);
        this.A12 = AnonymousClass3Ma.A0x(this, 2131431258);
        this.A04 = findViewById(2131432671);
        this.A00 = findViewById(2131427879);
        this.A06 = findViewById(2131436740);
        this.A07 = findViewById(2131436868);
        this.A01 = findViewById(2131428722);
        this.A03 = findViewById(2131431868);
        this.A05 = findViewById(2131427520);
        if (this.A0a != null && this.A0d.A05()) {
            if (this.A0Q.A07(this.A0a)) {
                this.A0m = this.A0Q.A02(this.A0a);
                A03(this);
            } else {
                C825948z r2 = new C825948z(new C20543APc(this), this.A0Q, this.A0a);
                this.A11 = r2;
                this.A05.CGM(r2, new Void[0]);
            }
            if (this.A0R == null && C40811vJ.A0W(this.A0U)) {
                this.A0e.A03(this.A0a, new C21050Adg(this));
            }
        }
        A5G a5g2 = this.A0d;
        QuickContactActivity quickContactActivity = a5g2.A00;
        AnonymousClass3Ma.A1A(quickContactActivity.A04, a5g2, 35);
        quickContactActivity.A00.setOnTouchListener(new C64732vF(0.2f, 0.0f, 0.2f, 0.0f));
        quickContactActivity.A06.setOnTouchListener(new C64732vF(0.2f, 0.0f, 0.2f, 0.0f));
        quickContactActivity.A01.setOnTouchListener(new C64732vF(0.2f, 0.0f, 0.2f, 0.0f));
        quickContactActivity.A00.setOnClickListener(new AnonymousClass48Z(5, quickContactActivity, false));
        quickContactActivity.A06.setOnClickListener(new AnonymousClass48Z(5, quickContactActivity, true));
        View view = quickContactActivity.A07;
        if (view != null) {
            view.setOnTouchListener(new C64732vF(0.2f, 0.0f, 0.2f, 0.0f));
            AnonymousClass48o.A00(quickContactActivity.A07, quickContactActivity, 0);
        }
        AnonymousClass3Ma.A1A(quickContactActivity.A01, a5g2, 36);
        AnonymousClass3Ma.A1A(quickContactActivity.A03, a5g2, 37);
        AnonymousClass3Ma.A1A(quickContactActivity.A05, a5g2, 38);
        a5g2.A02();
        a5g2.A03();
        AnonymousClass3Ma.A1A(quickContactActivity.findViewById(2131431626), a5g2, 33);
        AnonymousClass1E7 r7 = quickContactActivity.A0S;
        if (r7.A10 || r7.A0F() || C22971Dz.A0N(quickContactActivity.A0S.A0J)) {
            AnonymousClass3MX.A1H(quickContactActivity, 2131428625, 0);
            quickContactActivity.A02.setVisibility(8);
        } else {
            AnonymousClass3MX.A1H(quickContactActivity, 2131428625, 8);
            if (quickContactActivity.A0S.A0H != null) {
                quickContactActivity.A02.setVisibility(0);
            }
            quickContactActivity.A02.setVisibility(8);
        }
        AnonymousClass3Ma.A1A(quickContactActivity.A02, a5g2, 34);
        a5g2.A04();
        FloatingChildLayout floatingChildLayout = (FloatingChildLayout) findViewById(2131430908);
        this.A0h = floatingChildLayout;
        floatingChildLayout.A06 = new C20292AFa(this, 1);
        floatingChildLayout.setImportantForAccessibility(2);
        int intExtra = getIntent().getIntExtra("position_top", getResources().getDimensionPixelOffset(2131168406));
        Rect sourceBounds = intent.getSourceBounds();
        this.A0h.A04 = intExtra;
        if (sourceBounds != null) {
            int intExtra2 = getIntent().getIntExtra("animation_style", 2);
            if (intExtra2 == 1) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                int i = displayMetrics.heightPixels;
                int i2 = displayMetrics.widthPixels;
                int min = Math.min(i2 / 4, i / 4);
                int i3 = (i - min) / 2;
                sourceBounds.top = i3;
                sourceBounds.bottom = i3 + min;
                int i4 = (i2 - min) / 2;
                sourceBounds.left = i4;
                sourceBounds.right = i4 + min;
                this.A0h.setChildTargetScreen(sourceBounds);
                FloatingChildLayout floatingChildLayout2 = this.A0h;
                floatingChildLayout2.A03 = 0;
                floatingChildLayout2.A00 = 0.0f;
            } else {
                this.A0h.setChildTargetScreen(sourceBounds);
                FloatingChildLayout floatingChildLayout3 = this.A0h;
                if (intExtra2 == 2) {
                    floatingChildLayout3.A03 = 1;
                } else {
                    floatingChildLayout3.A03 = 2;
                }
            }
        }
        boolean booleanExtra = getIntent().getBooleanExtra("show_get_direction", false);
        TextView A0L2 = AnonymousClass3MX.A0L(this, 2131430003);
        A0L2.setVisibility(C72453Mb.A07(booleanExtra ? 1 : 0));
        if (booleanExtra) {
            C43421zm.A04(A0L2);
            AnonymousClass3Ma.A1A(findViewById(2131430003), this, 31);
        }
        AnonymousClass3Ma.A1A(this.A08, this, 32);
        AnonymousClass1Y5.A02(this.A08, 2131896793);
        this.A0y = true;
        FloatingChildLayout floatingChildLayout4 = this.A0h;
        floatingChildLayout4.getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass795(new AnonymousClass7RB((Object) this, 43), floatingChildLayout4, 7));
        this.A0I.registerObserver(this.A14);
        if (this.A0S.A0F()) {
            ((C27141Uw) this.A0s.get()).A00(this.A15);
        }
        C17880vN.A0V(this.A0o).registerObserver(this.A17);
        this.A0l.registerObserver(this.A18);
        C17880vN.A0V(this.A0v).registerObserver(this.A16);
        Jid A062 = this.A0S.A06(AnonymousClass1BI.class);
        C19880zA r1 = this.A0A;
        if (r1.A07()) {
            if (A062 != null) {
                r1.A03();
                throw AnonymousClass000.A0s("initSmbLabelScroller");
            }
            AnonymousClass3MX.A1H(this, 2131434280, 8);
        } else if (A062 != null) {
            UserJid A002 = C22941Dw.A00(A062);
            if (A002 == null) {
                Log.e("UserJid should not be null");
            } else {
                C34771l3 r12 = this.A0f;
                C18070vi.A0d(r12, 0);
                this.A0g = (C111255jJ) AnonymousClass8BR.A0C(new C65062vm(r12, true), this).A00(C111255jJ.class);
                getLifecycle().A05(this.A0g);
                C111255jJ r22 = this.A0g;
                C22791Df.A01(r22.A04, new C99204sR(A002, r22, 7)).A0A(this, new C91614fy(this, 11));
            }
        }
        if (!this.A0z) {
            C18030ve r13 = this.A0U;
            C18040vf r23 = C18040vf.A02;
            if (C18020vd.A05(r23, r13, 9852) && !A0c(this) && !this.A0S.A0F() && this.A0S.A0g) {
                AnonymousClass8BV.A11(this);
                if (AnonymousClass112.A0A() && C18020vd.A05(r23, this.A0U, 12040)) {
                    this.A13 = new C88764ak(this, this.A0S, this.A0W, 1);
                }
            }
        }
        A39(this.A00, this.A05);
    }

    public C222219b A33() {
        C222219b A33 = super.A33();
        A33.A04 = true;
        A33.A00(C108955ca.A0x(this), 18);
        return A33;
    }

    public void A3I() {
        super.A3I();
        if (this.A13 != null) {
            try {
                registerScreenCaptureCallback(getMainExecutor(), this.A13);
            } catch (IllegalStateException e) {
                this.A13 = null;
                Log.e((Throwable) e);
            }
        }
    }

    public C18180vt BYS() {
        return C19620yd.A02;
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0I.unregisterObserver(this.A14);
        if (this.A0S.A0F()) {
            ((C27141Uw) this.A0s.get()).A01(this.A15);
        }
        C17880vN.A0V(this.A0o).unregisterObserver(this.A17);
        this.A0l.unregisterObserver(this.A18);
        C17880vN.A0V(this.A0v).unregisterObserver(this.A16);
        C825948z r0 = this.A11;
        if (r0 != null) {
            r0.A0B(true);
            this.A11 = null;
        }
        C825848y r02 = this.A10;
        if (r02 != null) {
            r02.A0B(true);
            this.A10 = null;
        }
    }

    public void onStop() {
        super.onStop();
        C88764ak r0 = this.A13;
        if (r0 != null) {
            try {
                unregisterScreenCaptureCallback(r0);
            } catch (IllegalStateException e) {
                Log.e((Throwable) e);
            }
        }
    }
}
