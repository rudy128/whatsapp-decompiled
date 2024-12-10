package com.whatsapp.newsletter.insights;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1BI;
import X.AnonymousClass1DF;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1K1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3VG;
import X.AnonymousClass43Z;
import X.AnonymousClass43a;
import X.AnonymousClass4VW;
import X.AnonymousClass5TZ;
import X.AnonymousClass74D;
import X.C102955Il;
import X.C102965Im;
import X.C102975In;
import X.C102985Io;
import X.C102995Ip;
import X.C134026pt;
import X.C17960vV;
import X.C18070vi;
import X.C18100vl;
import X.C27871Xy;
import X.C28261Zr;
import X.C30361do;
import X.C72453Mb;
import X.C72473Md;
import X.C72483Me;
import X.C73633Ws;
import X.C84394Ji;
import X.C84414Jk;
import X.C84424Jl;
import X.C84434Jm;
import X.C91014f0;
import X.C91634g0;
import X.C91774gE;
import X.C91864gN;
import X.C91884gP;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import java.util.LinkedHashSet;
import java.util.Map;

public final class NewsletterInsightsActivity extends AnonymousClass1FY {
    public ViewPager2 A00;
    public C84394Ji A01;
    public C84414Jk A02;
    public C84424Jl A03;
    public C84434Jm A04;
    public C73633Ws A05;
    public AnonymousClass3VG A06;
    public AnonymousClass74D A07;
    public AnonymousClass00H A08;
    public boolean A09;
    public final C18100vl A0A;
    public final C18100vl A0B;
    public final C18100vl A0C;
    public final C18100vl A0D;
    public final C18100vl A0E;

    public NewsletterInsightsActivity() {
        this(0);
        this.A0B = AnonymousClass1DF.A01(new C102965Im(this));
        this.A0D = AnonymousClass1DF.A01(new C102985Io(this));
        this.A0E = AnonymousClass1DF.A01(new C102995Ip(this));
        this.A0A = AnonymousClass1DF.A01(new C102955Il(this));
        this.A0C = AnonymousClass1DF.A01(new C102975In(this));
    }

    public void onConfigurationChanged(Configuration configuration) {
        C18070vi.A0d(configuration, 0);
        super.onConfigurationChanged(configuration);
        int i = configuration.orientation;
        if (i == 2 || i == 1) {
            ViewPager2 viewPager2 = this.A00;
            if (viewPager2 == null) {
                C18070vi.A11("viewPager");
                throw null;
            }
            int i2 = viewPager2.A00;
            int i3 = i2 - 1;
            if (i3 < 0) {
                i3 = 0;
            }
            viewPager2.A03(i3, false);
            viewPager2.A03(i2, false);
        }
    }

    public static final void A03(NewsletterInsightsActivity newsletterInsightsActivity, boolean z) {
        AnonymousClass3VG r1 = newsletterInsightsActivity.A06;
        if (r1 == null) {
            C18070vi.A11("newsletterInsightsViewModel");
            throw null;
        } else {
            r1.A0V((LinkedHashSet) newsletterInsightsActivity.A0C.getValue(), z);
        }
    }

    public void A2y() {
        if (!this.A09) {
            this.A09 = true;
            AnonymousClass1K1 A0K = C72473Md.A0K(this);
            AnonymousClass10E r2 = A0K.AAQ;
            C72483Me.A0q(r2, this);
            AnonymousClass10G r1 = r2.A00;
            AnonymousClass1FB.A0K(r2, r1, this, r1.A45);
            AnonymousClass1FB.A0L(r2, r1, this, r1.A5A);
            this.A02 = (C84414Jk) A0K.A2y.get();
            this.A03 = (C84424Jl) A0K.A2z.get();
            this.A08 = AnonymousClass3MX.A11(r2);
            this.A01 = (C84394Ji) A0K.A2x.get();
            this.A07 = (AnonymousClass74D) r2.A7M.get();
            this.A04 = (C84434Jm) A0K.A30.get();
        }
    }

    public void A3K() {
        int i;
        AnonymousClass4VW r1 = (AnonymousClass4VW) AnonymousClass000.A0w(AnonymousClass3MW.A12(this.A0A), C72453Mb.A0I(this.A0D));
        if (r1 != null) {
            AnonymousClass00H r0 = this.A08;
            if (r0 != null) {
                C30361do r3 = (C30361do) C18070vi.A0E(r0);
                if (r1 instanceof AnonymousClass43Z) {
                    i = 102;
                } else if (r1 instanceof AnonymousClass43a) {
                    i = 103;
                } else {
                    i = 104;
                }
                C18100vl r02 = C30361do.A0C;
                r3.A02((AnonymousClass1BI) null, i);
                return;
            }
            C18070vi.A11("navigationTimeSpentManager");
            throw null;
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        setContentView(2131626206);
        C84394Ji r2 = this.A01;
        if (r2 != null) {
            Object value = this.A0B.getValue();
            C17960vV.A07(value);
            C18070vi.A0X(value);
            this.A06 = (AnonymousClass3VG) C91774gE.A00(this, r2, value, 14).A00(AnonymousClass3VG.class);
            setTitle(2131892680);
            C72473Md.A18(this);
            Toolbar toolbar = this.A02;
            if (toolbar != null) {
                C28261Zr.A01(toolbar, C27871Xy.GONE);
            }
            this.A00 = (ViewPager2) AnonymousClass3MY.A0H(this, 2131431697);
            TabLayout tabLayout = (TabLayout) findViewById(2131431692);
            AnonymousClass3VG r0 = this.A06;
            if (r0 == null) {
                str = "newsletterInsightsViewModel";
            } else {
                C91634g0.A00(this, r0.A01, new AnonymousClass5TZ(this), 2);
                C73633Ws r4 = new C73633Ws(this);
                ViewPager2 viewPager2 = this.A00;
                if (viewPager2 != null) {
                    viewPager2.setAdapter(r4);
                    viewPager2.setOffscreenPageLimit(r4.A0Q());
                    viewPager2.A03(C72453Mb.A0I(this.A0D), false);
                    A03(this, false);
                    this.A05 = r4;
                    ViewPager2 viewPager22 = this.A00;
                    if (viewPager22 != null) {
                        new C134026pt(viewPager22, tabLayout, new C91884gP(this, 1)).A00();
                        tabLayout.A0E(new C91864gN(this));
                        return;
                    }
                }
                C18070vi.A11("viewPager");
                throw null;
            }
        } else {
            str = "newsletterInsightsViewModelFactory";
        }
        C18070vi.A11(str);
        throw null;
    }

    public void onDestroy() {
        String str;
        if (isFinishing()) {
            Map A12 = AnonymousClass3MW.A12(this.A0A);
            ViewPager2 viewPager2 = this.A00;
            if (viewPager2 == null) {
                str = "viewPager";
            } else {
                AnonymousClass4VW r0 = (AnonymousClass4VW) AnonymousClass000.A0w(A12, viewPager2.A00);
                if (r0 != null) {
                    int A002 = r0.A00();
                    if (Integer.valueOf(A002) != null) {
                        AnonymousClass74D r1 = this.A07;
                        if (r1 != null) {
                            r1.A0E(AnonymousClass3MX.A0o(this.A0B), (Integer) null, (Integer) null, A002, 2, C72453Mb.A0K(this.A0E));
                        } else {
                            str = "newsletterLogging";
                        }
                    }
                }
            }
            C18070vi.A11(str);
            throw null;
        }
        this.A05 = null;
        super.onDestroy();
    }

    public NewsletterInsightsActivity(int i) {
        this.A09 = false;
        C91014f0.A00(this, 49);
    }
}
