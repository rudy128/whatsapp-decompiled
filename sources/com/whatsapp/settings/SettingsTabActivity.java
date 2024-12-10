package com.whatsapp.settings;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass10I;
import X.AnonymousClass11S;
import X.AnonymousClass11V;
import X.AnonymousClass178;
import X.AnonymousClass17B;
import X.AnonymousClass18K;
import X.AnonymousClass19T;
import X.AnonymousClass1BI;
import X.AnonymousClass1DC;
import X.AnonymousClass1E7;
import X.AnonymousClass1F9;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1K1;
import X.AnonymousClass1KB;
import X.AnonymousClass1LU;
import X.AnonymousClass1M9;
import X.AnonymousClass1QJ;
import X.AnonymousClass1QO;
import X.AnonymousClass1QS;
import X.AnonymousClass1R2;
import X.AnonymousClass1UN;
import X.AnonymousClass1VW;
import X.AnonymousClass1VX;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3TE;
import X.AnonymousClass48o;
import X.AnonymousClass4SS;
import X.AnonymousClass4YE;
import X.AnonymousClass4aV;
import X.AnonymousClass5a6;
import X.AnonymousClass5a7;
import X.C000200d;
import X.C108095b7;
import X.C108575bv;
import X.C111795kR;
import X.C117045z7;
import X.C117055z8;
import X.C134196qC;
import X.C135946t1;
import X.C17880vN;
import X.C17890vO;
import X.C17900vP;
import X.C18000vb;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C18180vt;
import X.C19620yd;
import X.C19830z4;
import X.C19880zA;
import X.C19890zB;
import X.C20741AWw;
import X.C21428Ajv;
import X.C21448AkF;
import X.C21468AkZ;
import X.C221618v;
import X.C23291Fl;
import X.C23391Fw;
import X.C23401Fx;
import X.C23581Gv;
import X.C24261Jm;
import X.C24671Lf;
import X.C24921Me;
import X.C26166Ctg;
import X.C27201Vd;
import X.C28931bI;
import X.C29501cO;
import X.C31131f4;
import X.C31161f7;
import X.C31181f9;
import X.C33531iy;
import X.C36261nb;
import X.C36271nc;
import X.C37451pZ;
import X.C37961qT;
import X.C37971qU;
import X.C72453Mb;
import X.C72473Md;
import X.C72483Me;
import X.C72933Og;
import X.C80953yS;
import X.C80963yT;
import X.C81103yh;
import X.C81123yj;
import X.C83434Fc;
import X.C83444Fd;
import X.C86004Pu;
import X.C86014Pv;
import X.C87824Xf;
import X.C88624aF;
import X.C89974dK;
import X.C90594eK;
import X.C91034f2;
import X.C94164k9;
import X.C95294m0;
import X.C96614o8;
import X.C98844ro;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import com.whatsapp.languageselector.Hilt_LanguageSelectorBottomSheet;
import com.whatsapp.settings.securitycheckup.SecurityCheckupStatusRepository;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.banners.WDSBanner;
import com.whatsapp.wds.components.search.WDSSearchBar;
import java.util.List;

public class SettingsTabActivity extends AnonymousClass1FY implements C23291Fl, C108095b7, AnonymousClass5a6, AnonymousClass5a7 {
    public int A00;
    public long A01;
    public View A02;
    public View A03;
    public ImageView A04;
    public RecyclerView A05;
    public C19880zA A06;
    public C19880zA A07;
    public C19880zA A08;
    public C19880zA A09;
    public C19880zA A0A;
    public C19880zA A0B;
    public C19880zA A0C;
    public C19880zA A0D;
    public C36271nc A0E;
    public TextEmojiLabel A0F;
    public TextEmojiLabel A0G;
    public WaImageView A0H;
    public AnonymousClass1VW A0I;
    public AnonymousClass1M9 A0J;
    public C24671Lf A0K;
    public C24921Me A0L;
    public C37451pZ A0M;
    public C37451pZ A0N;
    public C27201Vd A0O;
    public C36261nb A0P;
    public C134196qC A0Q;
    public C31131f4 A0R;
    public AnonymousClass1E7 A0S;
    public C135946t1 A0T;
    public AnonymousClass18K A0U;
    public AnonymousClass1QJ A0V;
    public AnonymousClass1QO A0W;
    public AnonymousClass1QS A0X;
    public AnonymousClass1R2 A0Y;
    public AnonymousClass4SS A0Z;
    public AnonymousClass4YE A0a;
    public C111795kR A0b;
    public SecurityCheckupStatusRepository A0c;
    public AnonymousClass1DC A0d;
    public C28931bI A0e;
    public C28931bI A0f;
    public WDSBanner A0g;
    public C108575bv A0h;
    public WDSSearchBar A0i;
    public AnonymousClass00H A0j;
    public AnonymousClass00H A0k;
    public AnonymousClass00H A0l;
    public AnonymousClass00H A0m;
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
    public AnonymousClass00H A0y;
    public AnonymousClass00H A0z;
    public AnonymousClass00H A10;
    public AnonymousClass00H A11;
    public AnonymousClass00H A12;
    public AnonymousClass00H A13;
    public AnonymousClass00H A14;
    public AnonymousClass00H A15;
    public AnonymousClass00H A16;
    public AnonymousClass00H A17;
    public AnonymousClass00H A18;
    public AnonymousClass00H A19;
    public AnonymousClass00H A1A;
    public String A1B;
    public String A1C;
    public List A1D;
    public boolean A1E;
    public boolean A1F;
    public boolean A1G;
    public boolean A1H;
    public LinearLayout A1I;
    public TextEmojiLabel A1J;
    public C29501cO A1K;
    public AnonymousClass3TE A1L;
    public C90594eK A1M;
    public C108575bv A1N;
    public C108575bv A1O;
    public boolean A1P;
    public boolean A1Q;
    public final C23581Gv A1R;
    public final AnonymousClass11V A1S;

    public SettingsTabActivity() {
        this(0);
        this.A01 = 0;
        this.A1D = AnonymousClass000.A13();
        this.A1B = "";
        this.A1C = null;
        this.A1G = false;
        this.A18 = C221618v.A00(AnonymousClass178.class);
        this.A0r = C221618v.A00(AnonymousClass17B.class);
        this.A1R = new C94164k9(this, 25);
        this.A1S = new C95294m0(this, 3);
        this.A1K = null;
    }

    private void A03() {
        if (this.A1F && this.A1E && this.A0f != null) {
            Log.i("SettingsTabActivity/updatePushName");
            this.A1J = (TextEmojiLabel) findViewById(2131432353);
            Object obj = this.A0l.get();
            TextEmojiLabel textEmojiLabel = this.A0G;
            TextEmojiLabel textEmojiLabel2 = this.A1J;
            C28931bI r5 = this.A0f;
            C18070vi.A0o(textEmojiLabel, textEmojiLabel2, r5);
            textEmojiLabel.post(new C21468AkZ(this, textEmojiLabel, textEmojiLabel2, obj, r5, 9));
        }
    }

    public C90594eK BZQ(int i, int i2, boolean z) {
        C90594eK r0 = new C90594eK(this.A00, (AnonymousClass1F9) this, this.A08, (List) AnonymousClass000.A13(), i, i2, z);
        this.A1M = r0;
        return r0;
    }

    public void finish() {
        WDSSearchBar wDSSearchBar = this.A0i;
        if (wDSSearchBar == null || !AnonymousClass000.A1P(wDSSearchBar.A08.getVisibility())) {
            super.finish();
            return;
        }
        this.A0i.A02(true);
        A0V(this);
    }

    public static void A0V(SettingsTabActivity settingsTabActivity) {
        C111795kR r1 = settingsTabActivity.A0b;
        if (r1 != null) {
            r1.A0W((List) null);
        }
        C72453Mb.A1B(settingsTabActivity.A05);
        LinearLayout linearLayout = settingsTabActivity.A1I;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
    }

    public static void A0c(SettingsTabActivity settingsTabActivity) {
        C135946t1 r3;
        int i = 8;
        settingsTabActivity.A0F.setVisibility(8);
        if (settingsTabActivity.A1F) {
            View findViewById = settingsTabActivity.findViewById(2131432347);
            settingsTabActivity.A03 = findViewById;
            AnonymousClass1KB r4 = settingsTabActivity.A05;
            AnonymousClass10I r7 = settingsTabActivity.A05;
            r3 = new C117045z7(r4, settingsTabActivity.A00, settingsTabActivity.A0D, r7, AnonymousClass3MW.A0z(findViewById));
        } else {
            View A0I2 = AnonymousClass3MY.A0I(AnonymousClass3Ma.A0x(settingsTabActivity, 2131436081), 0);
            settingsTabActivity.A03 = A0I2;
            AnonymousClass1KB r42 = settingsTabActivity.A05;
            AnonymousClass10I r72 = settingsTabActivity.A05;
            r3 = new C117055z8(r42, settingsTabActivity.A00, settingsTabActivity.A0D, r72, AnonymousClass3MW.A0z(A0I2));
        }
        settingsTabActivity.A0T = r3;
        View view = settingsTabActivity.A03;
        if (view != null) {
            view.setVisibility(0);
            AnonymousClass48o.A00(settingsTabActivity.A03, settingsTabActivity, 28);
        }
        View findViewById2 = settingsTabActivity.findViewById(2131436084);
        if (settingsTabActivity.A03 != null && !settingsTabActivity.A1F) {
            i = 0;
        }
        findViewById2.setVisibility(i);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.whatsapp.languageselector.LanguageSelectorBottomSheet, com.whatsapp.languageselector.Hilt_LanguageSelectorBottomSheet, java.lang.Object, androidx.fragment.app.DialogFragment] */
    public static void A0d(SettingsTabActivity settingsTabActivity) {
        settingsTabActivity.A0U.CC7(new C80953yS());
        settingsTabActivity.A0U.CC7(new C80963yT());
        ? hilt_LanguageSelectorBottomSheet = new Hilt_LanguageSelectorBottomSheet();
        hilt_LanguageSelectorBottomSheet.A06 = settingsTabActivity;
        hilt_LanguageSelectorBottomSheet.A07 = settingsTabActivity;
        hilt_LanguageSelectorBottomSheet.A05 = new C96614o8(settingsTabActivity, hilt_LanguageSelectorBottomSheet, 2);
        settingsTabActivity.CMl(hilt_LanguageSelectorBottomSheet);
    }

    public static void A0q(SettingsTabActivity settingsTabActivity) {
        AnonymousClass1E7 r2 = settingsTabActivity.A0S;
        if (r2 != null) {
            C37451pZ r1 = settingsTabActivity.A0M;
            if (r1 != null) {
                r1.A07(settingsTabActivity.A04, r2);
                return;
            }
            return;
        }
        AnonymousClass1VW r12 = settingsTabActivity.A0I;
        ImageView imageView = settingsTabActivity.A04;
        int i = settingsTabActivity.A00;
        C18070vi.A0d(imageView, 0);
        r12.A0A(imageView, (AnonymousClass1VX) null, -1.0f, 2131231047, i);
    }

    public static void A0r(SettingsTabActivity settingsTabActivity) {
        WDSSearchBar wDSSearchBar = settingsTabActivity.A0i;
        if (wDSSearchBar == null || !AnonymousClass000.A1P(wDSSearchBar.A08.getVisibility()) || settingsTabActivity.A1B.isEmpty()) {
            A0V(settingsTabActivity);
            return;
        }
        C72453Mb.A1B(settingsTabActivity.A1I);
        C111795kR r1 = settingsTabActivity.A0b;
        if (r1 != null) {
            r1.A0W(settingsTabActivity.A1D);
        }
        RecyclerView recyclerView = settingsTabActivity.A05;
        if (recyclerView != null) {
            recyclerView.setVisibility(0);
            settingsTabActivity.A05.A0J(new C98844ro(settingsTabActivity, 26));
        }
    }

    public static void A0t(SettingsTabActivity settingsTabActivity, String str) {
        String str2 = settingsTabActivity.A1C;
        boolean equals = str.equals(str2);
        Integer A0h2 = C17880vN.A0h();
        if (!equals) {
            int i = 0;
            if (settingsTabActivity.A1F) {
                i = 4;
            }
            A0h2 = Integer.valueOf(i);
        }
        if (str2 == null || equals) {
            ((C86014Pv) settingsTabActivity.A14.get()).A00(((C87824Xf) settingsTabActivity.A16.get()).A01(str), A0h2);
        }
        if ("meta_verified_subscription" == str) {
            C19880zA r1 = settingsTabActivity.A0C;
            if (r1.A07()) {
                C19880zA.A02(r1);
                throw AnonymousClass000.A0s("logMetaVerifiedUserAction");
            }
        }
    }

    public static boolean A0u(SettingsTabActivity settingsTabActivity) {
        if (!(!settingsTabActivity.A0c.A03.A02().isEmpty())) {
            C18030ve r1 = settingsTabActivity.A0E;
            C18040vf r4 = C18040vf.A02;
            if (!C18020vd.A05(r4, r1, 5060) && !(settingsTabActivity.A0c.A02.A03.getValue() instanceof C20741AWw)) {
                AnonymousClass1UN A0g2 = AnonymousClass3MX.A0g(settingsTabActivity.A0v);
                if (!A0g2.A00.A0N()) {
                    C19830z4 r2 = A0g2.A02;
                    if (!C17880vN.A1W(C17890vO.A0B(r2), "native_contacts_upsell_banner_is_shown") && r2.A2K()) {
                        C18030ve r12 = A0g2.A04;
                        if (!AnonymousClass3MX.A1W(r12) || !C18020vd.A05(r4, r12, 8543)) {
                            return false;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void A2y() {
        if (!this.A1P) {
            this.A1P = true;
            AnonymousClass1K1 A0K2 = C72473Md.A0K(this);
            AnonymousClass10E r3 = A0K2.AAQ;
            C72483Me.A0q(r3, this);
            AnonymousClass10G r2 = r3.A00;
            AnonymousClass1FB.A0K(r3, r2, this, r2.A45);
            AnonymousClass1FB.A0L(r3, r2, this, r2.A5A);
            this.A0j = C000200d.A00(r3.A05);
            this.A0t = AnonymousClass3MX.A0z(r3);
            this.A17 = AnonymousClass3MW.A0s(r3);
            this.A0n = C000200d.A00(r2.A00);
            C19890zB r1 = C19890zB.A00;
            this.A0B = r1;
            this.A09 = r1;
            this.A0U = AnonymousClass3Ma.A0g(r3);
            this.A0E = (C36271nc) r2.A4x.get();
            this.A10 = C000200d.A00(r3.A9I);
            this.A0u = C000200d.A00(r3.AaL);
            this.A14 = C000200d.A00(r2.AGy);
            this.A08 = r1;
            this.A0O = AnonymousClass3MZ.A0i(r3);
            this.A0Y = (AnonymousClass1R2) r3.A8L.get();
            this.A07 = (C19880zA) r3.A7g.get();
            this.A0I = AnonymousClass3MZ.A0e(r3);
            this.A0J = AnonymousClass10E.A4z(r3);
            this.A15 = C000200d.A00(r2.AH0);
            this.A0d = AnonymousClass3MZ.A13(r3);
            this.A0L = AnonymousClass3MZ.A0g(r3);
            this.A0X = AnonymousClass3MZ.A0z(r3);
            this.A0K = AnonymousClass3Ma.A0S(r3);
            this.A0P = (C36261nb) r2.A2t.get();
            this.A19 = C000200d.A00(r3.ABv);
            this.A0s = C000200d.A00(r3.A59);
            this.A1A = C000200d.A00(r2.AJK);
            this.A0a = (AnonymousClass4YE) r2.AD4.get();
            this.A0Z = (AnonymousClass4SS) r2.A3V.get();
            this.A16 = C000200d.A00(A0K2.A5o);
            this.A0k = C000200d.A00(r3.A08);
            this.A0z = C000200d.A00(r2.AEr);
            this.A0o = C000200d.A00(r2.A6u);
            this.A0W = AnonymousClass3Ma.A0q(r3);
            this.A0V = (AnonymousClass1QJ) r3.A8F.get();
            this.A0m = C000200d.A00(r3.A0B);
            this.A0l = C000200d.A00(A0K2.A02);
            this.A0Q = (C134196qC) r2.A38.get();
            this.A0R = (C31131f4) r3.A6M.get();
            this.A0x = AnonymousClass3MX.A11(r3);
            this.A0q = C000200d.A00(A0K2.A0q);
            this.A0y = C000200d.A00(r2.A3f);
            this.A11 = C000200d.A00(r2.A4T);
            this.A0C = r1;
            this.A0D = r1;
            this.A0p = C000200d.A00(r3.AHp);
            this.A0A = r1;
            this.A13 = C000200d.A00(r2.AGw);
            this.A12 = C000200d.A00(A0K2.A5m);
            this.A0c = AnonymousClass1K1.A1o(A0K2);
            this.A0v = C000200d.A00(r3.A72);
            this.A0w = C000200d.A00(r2.A3I);
            this.A06 = r1;
        }
    }

    public void A3K() {
        AnonymousClass3MX.A0u(this.A0x).A02((AnonymousClass1BI) null, 22);
    }

    public C72933Og BMY() {
        C18000vb r3 = this.A00;
        return new C72933Og(this, r3, C26166Ctg.A02(this.A02, this.A08, r3, this.A0d), C26166Ctg.A04());
    }

    public String BSb() {
        return "settings_activity";
    }

    public C18180vt BYS() {
        return C19620yd.A02;
    }

    public void BwW() {
        if (this.A01 > 0) {
            C81103yh r6 = new C81103yh();
            r6.A00 = Long.valueOf(System.currentTimeMillis() - this.A01);
            this.A0U.CC7(r6);
            this.A01 = 0;
        }
    }

    public void BwX() {
        if (this.A1H) {
            this.A1H = false;
            finish();
            startActivity(getIntent());
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 200) {
            if (i2 == -1) {
                this.A07.A03();
                throw AnonymousClass000.A0s("getSubscriptionManagementIntent");
            }
        } else if (i == 300 && i2 == -1) {
            this.A05.A0K(new C21428Ajv(new C90594eK(this.A00, (AnonymousClass1F9) this, this.A08, (List) AnonymousClass000.A13(), 2131892098, 3500, false), 38), 800);
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:99|100|(1:102)) */
    /* JADX WARNING: Code restructure failed: missing block: B:100:?, code lost:
        r4 = new android.content.Intent(X.AnonymousClass9T6.A00);
        r4.setComponent(new android.content.ComponentName(X.C24717CHe.A00, "com.facebook.oxygen.appmanager.appinfo.AppInfoRedirectActivity"));
        r4.putExtra("package_name", getPackageName());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x05e4, code lost:
        if (r4.resolveActivityInfo(r11, 0) != null) goto L_0x05e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x02be, code lost:
        if (r9.A0W.A0H() != false) goto L_0x02c0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:99:0x05c4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r23) {
        /*
            r22 = this;
            boolean r0 = X.AnonymousClass745.A00
            r9 = r22
            if (r0 == 0) goto L_0x000f
            android.view.Window r1 = r9.getWindow()
            r0 = 12
            r1.requestFeature(r0)
        L_0x000f:
            r0 = r23
            super.onCreate(r0)
            X.0ve r0 = r9.A0E
            r2 = 4023(0xfb7, float:5.637E-42)
            X.0vf r8 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r8, r0, r2)
            r9.A1F = r0
            X.00H r0 = r9.A0k
            X.1cN r0 = X.C17880vN.A0I(r0)
            boolean r0 = r0.A0F()
            r9.A1E = r0
            boolean r0 = r9.A1F
            r1 = 2131899400(0x7f123408, float:1.9433745E38)
            if (r0 == 0) goto L_0x0036
            r1 = 2131895921(0x7f122671, float:1.9426689E38)
        L_0x0036:
            r9.setTitle(r1)
            r0 = 2131626582(0x7f0e0a56, float:1.8880404E38)
            r9.setContentView((int) r0)
            r0 = 2131429504(0x7f0b0880, float:1.8480683E38)
            android.view.View r0 = r9.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r9.A1I = r0
            androidx.appcompat.widget.Toolbar r0 = X.AnonymousClass3Ma.A0F(r9)
            X.01n r0 = X.C72463Mc.A0S(r9, r0)
            r0.A0M(r1)
            r7 = 1
            r0.A0W(r7)
            X.00H r0 = r9.A15
            java.lang.Object r0 = r0.get()
            X.4aF r0 = (X.C88624aF) r0
            r0.A04()
            r0 = 2131437029(0x7f0b25e5, float:1.8495945E38)
            android.view.View r0 = r9.findViewById(r0)
            com.whatsapp.wds.components.search.WDSSearchBar r0 = (com.whatsapp.wds.components.search.WDSSearchBar) r0
            r9.A0i = r0
            com.whatsapp.wds.components.search.WDSSearchView r3 = r0.A08
            r1 = 3
            X.4rB r0 = new X.4rB
            r0.<init>(r9, r1)
            r3.setOnQueryTextChangeListener(r0)
            com.whatsapp.wds.components.search.WDSSearchBar r0 = r9.A0i
            com.whatsapp.wds.components.search.WDSSearchView r1 = r0.A08
            X.4CB r0 = X.AnonymousClass4CB.A00
            r1.setTrailingButtonIcon(r0)
            r10 = 14
            X.4sW r1 = new X.4sW
            r1.<init>((java.lang.Object) r9, (int) r10)
            X.5kR r0 = new X.5kR
            r0.<init>(r1)
            r9.A0b = r0
            X.1E8 r0 = X.AnonymousClass3MY.A0P(r9)
            r9.A0S = r0
            if (r0 != 0) goto L_0x00ae
            java.lang.String r0 = "SettingsTabActivity/onCreate/no-me"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.00H r0 = r9.A17
            r0.get()
            android.content.Intent r0 = X.AnonymousClass1LU.A0A(r9)
            r9.startActivity(r0)
            r9.finish()
        L_0x00ad:
            return
        L_0x00ae:
            X.0ve r0 = r9.A0E
            r6 = 0
            X.C18070vi.A0d(r0, r6)
            X.4YE r3 = r9.A0a
            boolean r0 = r9.A1F
            X.3yi r1 = new X.3yi
            r1.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A00 = r0
            X.18K r0 = r3.A01
            r0.CC7(r1)
            boolean r5 = r9.A1F
            r0 = 2131436689(0x7f0b2491, float:1.8495256E38)
            android.view.View r13 = r9.findViewById(r0)
            r0 = 2131434139(0x7f0b1a9b, float:1.8490083E38)
            android.view.View r4 = r9.findViewById(r0)
            r0 = 2131435329(0x7f0b1f41, float:1.8492497E38)
            android.view.View r20 = r9.findViewById(r0)
            boolean r0 = r9.A1E
            if (r0 == 0) goto L_0x0157
            X.00H r0 = r9.A0k
            X.1cN r0 = X.C17880vN.A0I(r0)
            boolean r0 = r0.A0E()
            if (r0 == 0) goto L_0x0116
            X.0vb r1 = r9.A00
            X.1E8 r0 = X.AnonymousClass3MY.A0P(r9)
            X.C17960vV.A07(r0)
            java.lang.String r0 = X.AnonymousClass17K.A02(r0)
            java.lang.String r1 = r1.A0G(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0116
            r0 = 2131434159(0x7f0b1aaf, float:1.8490124E38)
            X.1bI r0 = X.AnonymousClass3Ma.A0x(r9, r0)
            android.view.View r0 = X.AnonymousClass3MY.A0I(r0, r6)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setText(r1)
        L_0x0116:
            r0 = 2131427443(0x7f0b0073, float:1.8476502E38)
            X.1bI r3 = X.AnonymousClass3Ma.A0x(r9, r0)
            r3.A04(r6)
            X.00H r0 = r9.A0k
            X.1cN r0 = X.C17880vN.A0I(r0)
            X.0z4 r0 = r0.A0A
            int r0 = r0.A0E()
            r1 = 9
            if (r0 > 0) goto L_0x0137
            r0 = 40
            X.C98254qp.A00(r3, r9, r0)
            r1 = 8
        L_0x0137:
            X.4dK r0 = new X.4dK
            r0.<init>(r9, r1)
            r3.A05(r0)
            android.view.View r1 = r3.A02()
            r0 = 2131432895(0x7f0b15bf, float:1.848756E38)
            X.1bI r0 = X.C72453Mb.A0s(r1, r0)
            r9.A0e = r0
            X.10I r3 = r9.A05
            r1 = 4
            X.49i r0 = new X.49i
            r0.<init>((java.lang.Object) r9, (int) r1)
            X.AnonymousClass3MW.A1T(r0, r3, r6)
        L_0x0157:
            java.lang.String r12 = "settings-activity-contact-photo"
            r11 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3 = 8
            if (r5 != 0) goto L_0x03d6
            r4.setVisibility(r6)
            r13.setVisibility(r3)
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131168294(0x7f070c26, float:1.7950886E38)
            int r1 = r1.getDimensionPixelSize(r0)
            r9.A00 = r1
            X.1Vd r0 = r9.A0O
            X.1pZ r0 = r0.A08(r12, r11, r1)
            r9.A0M = r0
            r0 = 2131434145(0x7f0b1aa1, float:1.8490096E38)
            android.widget.ImageView r0 = X.AnonymousClass3MX.A0I(r9, r0)
            r9.A04 = r0
            r0.setVisibility(r6)
            r0 = 2131434143(0x7f0b1a9f, float:1.8490092E38)
            android.view.View r0 = r9.findViewById(r0)
            com.whatsapp.TextEmojiLabel r0 = (com.whatsapp.TextEmojiLabel) r0
            r9.A0G = r0
            r0.setVisibility(r6)
            com.whatsapp.TextEmojiLabel r1 = r9.A0G
            X.11S r0 = r9.A02
            java.lang.String r0 = r0.A0D()
            r1.A0R(r0)
            r0 = 2131434148(0x7f0b1aa4, float:1.8490102E38)
            android.view.View r0 = r9.findViewById(r0)
            com.whatsapp.TextEmojiLabel r0 = (com.whatsapp.TextEmojiLabel) r0
            r9.A0F = r0
        L_0x01aa:
            X.0ve r1 = r9.A0E
            r0 = 4921(0x1339, float:6.896E-42)
            boolean r0 = X.C18020vd.A05(r8, r1, r0)
            if (r0 == 0) goto L_0x01ca
            A0c(r9)
            X.00H r0 = r9.A0u
            java.lang.Object r0 = r0.get()
            X.6uV r0 = (X.C136846uV) r0
            X.6sf r1 = r0.A00()
            if (r1 == 0) goto L_0x03be
            X.6t1 r0 = r9.A0T
            r0.A01(r1)
        L_0x01ca:
            if (r5 != 0) goto L_0x03a5
            r0 = 2131434146(0x7f0b1aa2, float:1.8490098E38)
            android.view.View r0 = r9.findViewById(r0)
            com.whatsapp.WaImageView r0 = (com.whatsapp.WaImageView) r0
            r9.A0H = r0
        L_0x01d7:
            boolean r0 = X.AnonymousClass3MX.A1V(r9)
            if (r0 != 0) goto L_0x039e
            com.whatsapp.WaImageView r1 = r9.A0H
            r0 = 11
            X.C89974dK.A00(r1, r9, r0)
            com.whatsapp.WaImageView r0 = r9.A0H
            r0.setVisibility(r6)
            com.whatsapp.WaImageView r1 = r9.A0H
            r0 = 2131895996(0x7f1226bc, float:1.942684E38)
            X.AnonymousClass3MY.A0w(r9, r1, r0)
            if (r5 != 0) goto L_0x0202
            com.whatsapp.WaImageView r2 = r9.A0H
            r1 = 2130970098(0x7f0405f2, float:1.7548897E38)
            r0 = 2131101221(0x7f060625, float:1.7814846E38)
            int r0 = X.AnonymousClass3Ma.A00(r9, r1, r0)
            X.AnonymousClass4aX.A0D(r2, r0)
        L_0x0202:
            r1 = 16
            X.48n r0 = new X.48n
            r0.<init>(r9, r6, r1)
            r4.setOnClickListener(r0)
            A0q(r9)
            X.1Lf r1 = r9.A0K
            X.1Gv r0 = r9.A1R
            r1.registerObserver(r0)
            if (r5 == 0) goto L_0x0332
            r0 = 2131435293(0x7f0b1f1d, float:1.8492424E38)
            android.view.View r5 = r9.findViewById(r0)
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            r0 = 2131427506(0x7f0b00b2, float:1.847663E38)
            android.view.View r11 = r9.findViewById(r0)
            r2 = 25
            r1 = 16
            X.48n r0 = new X.48n
            r0.<init>(r9, r2, r1)
            r11.setOnClickListener(r0)
            r0 = 2131427505(0x7f0b00b1, float:1.8476628E38)
            android.view.View r2 = r9.findViewById(r0)
            r0 = 29
            X.AnonymousClass48o.A00(r2, r9, r0)
            r0 = 2131427504(0x7f0b00b0, float:1.8476626E38)
            android.view.View r4 = r9.findViewById(r0)
            r0 = 30
            X.AnonymousClass48o.A00(r4, r9, r0)
            X.0ve r1 = r9.A0E
            r0 = 5903(0x170f, float:8.272E-42)
            boolean r0 = X.C18020vd.A05(r8, r1, r0)
            if (r0 == 0) goto L_0x0263
            r5.removeView(r11)
            r5.removeView(r2)
            r5.addView(r2, r6)
            r0 = 2
            r5.addView(r11, r0)
        L_0x0263:
            float r1 = X.AnonymousClass1ZO.A01(r9)
            float r0 = X.C72463Mc.A00(r9)
            float r1 = r1 / r0
            r0 = 1134559232(0x43a00000, float:320.0)
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r0 = 0
            if (r1 >= 0) goto L_0x0274
            r0 = 1
        L_0x0274:
            android.view.ViewGroup$MarginLayoutParams r2 = X.AnonymousClass3MW.A0B(r2)
            if (r0 == 0) goto L_0x037e
            r5.setOrientation(r7)
            r2.setMarginStart(r6)
            android.view.ViewGroup$MarginLayoutParams r0 = X.AnonymousClass3MW.A0B(r4)
            r0.setMarginStart(r6)
        L_0x0287:
            r0 = 2131434084(0x7f0b1a64, float:1.8489972E38)
            X.AnonymousClass3MX.A1H(r9, r0, r3)
            r0 = 2131435256(0x7f0b1ef8, float:1.849235E38)
            android.view.View r1 = r9.findViewById(r0)
            r0 = 31
            X.AnonymousClass48o.A00(r1, r9, r0)
            r0 = 2131435241(0x7f0b1ee9, float:1.8492319E38)
            android.view.View r1 = r9.findViewById(r0)
            boolean r0 = X.AnonymousClass3MX.A1V(r9)
            if (r0 == 0) goto L_0x0377
            r1.setVisibility(r3)
        L_0x02a9:
            X.1QO r0 = r9.A0W
            boolean r0 = r0.A04(r6)
            if (r0 != 0) goto L_0x02c0
            X.1QO r0 = r9.A0W
            X.1QJ r0 = r0.A04
            r0.A02()
            X.1QO r0 = r9.A0W
            boolean r0 = r0.A0H()
            if (r0 == 0) goto L_0x02f3
        L_0x02c0:
            boolean r0 = X.AnonymousClass3MX.A1V(r9)
            if (r0 != 0) goto L_0x02f3
            r0 = 2131435248(0x7f0b1ef0, float:1.8492333E38)
            android.view.View r4 = r9.findViewById(r0)
            X.5bv r4 = (X.C108575bv) r4
            r4.setVisibility(r6)
            r0 = 33
            X.AnonymousClass48o.A01(r4, r9, r0)
            X.1R2 r3 = r9.A0Y
            r1 = 2130971195(0x7f040a3b, float:1.7551122E38)
            r0 = 2131102531(0x7f060b43, float:1.7817503E38)
            int r2 = X.AnonymousClass1YL.A00(r9, r1, r0)
            r1 = 2131169467(0x7f0710bb, float:1.7953265E38)
            X.1QJ r0 = r9.A0V
            X.2tK r0 = r0.A02()
            X.26n r0 = r3.A0N(r9, r0, r2, r1)
            r4.setIcon((android.graphics.drawable.Drawable) r0)
        L_0x02f3:
            r1 = 2131435263(0x7f0b1eff, float:1.8492363E38)
            r0 = 2131233338(0x7f080a3a, float:1.808281E38)
            r9.A0Q(r1, r0)
            r1 = 2131435271(0x7f0b1f07, float:1.849238E38)
            r0 = 2131233235(0x7f0809d3, float:1.8082602E38)
            r9.A0Q(r1, r0)
            r1 = 2131435294(0x7f0b1f1e, float:1.8492426E38)
            r0 = 2131233382(0x7f080a66, float:1.80829E38)
            r9.A0Q(r1, r0)
            r1 = 2131435272(0x7f0b1f08, float:1.8492381E38)
            r0 = 2131233267(0x7f0809f3, float:1.8082667E38)
            r9.A0Q(r1, r0)
            r1 = 2131435290(0x7f0b1f1a, float:1.8492418E38)
            r0 = 2131233342(0x7f080a3e, float:1.8082819E38)
            r9.A0Q(r1, r0)
            r1 = 2131435288(0x7f0b1f18, float:1.8492414E38)
            r0 = 2131233318(0x7f080a26, float:1.808277E38)
            r9.A0Q(r1, r0)
            r1 = 2131435260(0x7f0b1efc, float:1.8492357E38)
            r0 = 2131233437(0x7f080a9d, float:1.8083011E38)
            r9.A0Q(r1, r0)
        L_0x0332:
            r0 = 2131435263(0x7f0b1eff, float:1.8492363E38)
            android.view.View r0 = r9.findViewById(r0)
            X.5bv r0 = (X.C108575bv) r0
            r9.A1N = r0
            r0 = 2131435288(0x7f0b1f18, float:1.8492414E38)
            android.view.View r1 = r9.findViewById(r0)
            X.5bv r1 = (X.C108575bv) r1
            r9.A1O = r1
            r0 = 40
            X.AnonymousClass48o.A01(r1, r9, r0)
            X.5bv r3 = r9.A1O
            X.0vb r2 = r9.A00
            r0 = 2131231968(0x7f0804e0, float:1.8080032E38)
            android.graphics.drawable.Drawable r1 = X.C24261Jm.A00(r9, r0)
            X.3cO r0 = new X.3cO
            r0.<init>(r1, r2)
            r3.setIcon((android.graphics.drawable.Drawable) r0)
            r0 = 2131435260(0x7f0b1efc, float:1.8492357E38)
            android.view.View r1 = r9.findViewById(r0)
            r3 = 8
            r0 = 7
            X.C89974dK.A00(r1, r9, r0)
            X.00H r0 = r9.A0z
            java.lang.Object r5 = r0.get()
            X.2fm r5 = (X.C55442fm) r5
            goto L_0x0590
        L_0x0377:
            r0 = 32
            X.AnonymousClass48o.A00(r1, r9, r0)
            goto L_0x02a9
        L_0x037e:
            r5.setOrientation(r6)
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131168656(0x7f070d90, float:1.795162E38)
            float r1 = r1.getDimension(r0)
            float r0 = X.C72463Mc.A00(r9)
            float r1 = r1 / r0
            int r1 = (int) r1
            r2.setMarginStart(r1)
            android.view.ViewGroup$MarginLayoutParams r0 = X.AnonymousClass3MW.A0B(r4)
            r0.setMarginStart(r1)
            goto L_0x0287
        L_0x039e:
            com.whatsapp.WaImageView r0 = r9.A0H
            r0.setVisibility(r3)
            goto L_0x0202
        L_0x03a5:
            r0 = 2131432355(0x7f0b13a3, float:1.8486465E38)
            android.view.View r0 = r9.findViewById(r0)
            com.whatsapp.WaImageView r0 = (com.whatsapp.WaImageView) r0
            r9.A0H = r0
            r0 = 2131432356(0x7f0b13a4, float:1.8486467E38)
            android.view.View r1 = r9.findViewById(r0)
            r0 = 10
            X.C89974dK.A00(r1, r9, r0)
            goto L_0x01d7
        L_0x03be:
            X.10I r2 = r9.A05
            r1 = 27
            X.4ro r0 = new X.4ro
            r0.<init>((com.whatsapp.settings.SettingsTabActivity) r9, (int) r1)
            r2.CGN(r0)
            boolean r0 = r9.A1F
            if (r0 != 0) goto L_0x01ca
            X.6t1 r1 = r9.A0T
            r0 = 0
            r1.A01(r0)
            goto L_0x01ca
        L_0x03d6:
            r0 = 2131432359(0x7f0b13a7, float:1.8486473E38)
            android.view.ViewStub r0 = X.AnonymousClass3MX.A0H(r9, r0)
            r0.inflate()
            X.00H r0 = r9.A0q
            java.lang.Object r0 = r0.get()
            X.1rm r0 = (X.C38721rm) r0
            X.0ve r1 = r0.A01
            boolean r0 = X.C18020vd.A05(r8, r1, r2)
            if (r0 == 0) goto L_0x0589
            r0 = 5235(0x1473, float:7.336E-42)
            boolean r0 = X.C18020vd.A05(r8, r1, r0)
            if (r0 == 0) goto L_0x0589
            X.00H r0 = r9.A0q
            java.lang.Object r0 = r0.get()
            X.1rm r0 = (X.C38721rm) r0
            X.0z4 r0 = r0.A00
            android.content.SharedPreferences r14 = X.C17890vO.A0B(r0)
            java.lang.String r2 = "create_group_banner_creation_time"
            r0 = 0
            long r18 = r14.getLong(r2, r0)
            int r14 = (r18 > r0 ? 1 : (r18 == r0 ? 0 : -1))
            boolean r17 = X.AnonymousClass000.A1P(r14)
            long r15 = java.lang.System.currentTimeMillis()
            java.util.concurrent.TimeUnit r14 = java.util.concurrent.TimeUnit.DAYS
            r0 = 7
            long r0 = r14.toMillis(r0)
            long r18 = r18 + r0
            int r1 = (r15 > r18 ? 1 : (r15 == r18 ? 0 : -1))
            r0 = 0
            if (r1 > 0) goto L_0x0428
            r0 = 1
        L_0x0428:
            if (r17 != 0) goto L_0x042c
            if (r0 == 0) goto L_0x0586
        L_0x042c:
            X.00H r0 = r9.A0q
            java.lang.Object r0 = r0.get()
            X.1rm r0 = (X.C38721rm) r0
            X.0z4 r0 = r0.A00
            android.content.SharedPreferences r1 = X.C17890vO.A0B(r0)
            java.lang.String r0 = "create_group_banner_dismissed"
            boolean r0 = r1.getBoolean(r0, r6)
            if (r0 != 0) goto L_0x0586
            X.00H r0 = r9.A0q
            java.lang.Object r0 = r0.get()
            X.1rm r0 = (X.C38721rm) r0
            X.0z4 r0 = r0.A00
            android.content.SharedPreferences r1 = X.C17890vO.A0B(r0)
            java.lang.String r0 = "create_group_tool_tip_perm_dismissed"
            boolean r0 = r1.getBoolean(r0, r6)
            if (r0 != 0) goto L_0x0586
            java.lang.String r0 = "SettingsTabActivity/shouldShowGroupCreationBanner/true"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.00H r0 = r9.A0q
            java.lang.Object r0 = r0.get()
            X.1rm r0 = (X.C38721rm) r0
            X.0z4 r0 = r0.A00
            android.content.SharedPreferences r14 = X.C17890vO.A0B(r0)
            r0 = 0
            long r15 = r14.getLong(r2, r0)
            int r14 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r14 != 0) goto L_0x048f
            java.lang.String r0 = "SettingsTabActivity/setupProfileSection/create group banner never created"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.00H r0 = r9.A0q
            java.lang.Object r14 = r0.get()
            X.1rm r14 = (X.C38721rm) r14
            long r0 = java.lang.System.currentTimeMillis()
            X.0z4 r14 = r14.A00
            android.content.SharedPreferences$Editor r14 = X.C19830z4.A00(r14)
            X.C17880vN.A1D(r14, r2, r0)
        L_0x048f:
            r0 = 2131432348(0x7f0b139c, float:1.848645E38)
            android.view.ViewStub r2 = X.AnonymousClass3MX.A0H(r9, r0)
            r2.inflate()
            r14 = 2131892467(0x7f1218f3, float:1.9419683E38)
            java.lang.Object[] r1 = new java.lang.Object[r7]
            r15 = 2130970817(0x7f0408c1, float:1.7550355E38)
            r0 = 2131102224(0x7f060a10, float:1.781688E38)
            int r0 = X.AnonymousClass1YL.A00(r9, r15, r0)
            java.lang.String r0 = X.AnonymousClass1EG.A03(r9, r0)
            r1[r6] = r0
            android.text.Spanned r1 = X.AnonymousClass1EG.A01(r9, r1, r14)
            r0 = 2131429710(0x7f0b094e, float:1.84811E38)
            android.widget.TextView r0 = X.AnonymousClass3MX.A0L(r9, r0)
            r0.setText(r1)
            r0 = 2131429707(0x7f0b094b, float:1.8481094E38)
            android.view.View r1 = r9.findViewById(r0)
            r0 = 5
            X.C89974dK.A00(r1, r9, r0)
            r0 = 2131429706(0x7f0b094a, float:1.8481092E38)
            android.view.View r1 = r9.findViewById(r0)
            r0 = 20
            X.AnonymousClass3MZ.A1P(r1, r9, r2, r0)
        L_0x04d3:
            r4.setVisibility(r3)
            r13.setVisibility(r3)
            r0 = r20
            r0.setVisibility(r6)
            r0 = 2131432354(0x7f0b13a2, float:1.8486463E38)
            r2 = 2131432354(0x7f0b13a2, float:1.8486463E38)
            android.view.View r4 = r9.findViewById(r0)
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131168288(0x7f070c20, float:1.7950874E38)
            int r1 = r1.getDimensionPixelSize(r0)
            r9.A00 = r1
            X.1Vd r0 = r9.A0O
            X.1pZ r0 = r0.A08(r12, r11, r1)
            r9.A0M = r0
            android.widget.ImageView r0 = X.AnonymousClass3MX.A0I(r9, r2)
            r9.A04 = r0
            r0 = 2131432351(0x7f0b139f, float:1.8486457E38)
            android.view.View r1 = r9.findViewById(r0)
            com.whatsapp.TextEmojiLabel r1 = (com.whatsapp.TextEmojiLabel) r1
            r9.A0G = r1
            X.11S r0 = r9.A02
            java.lang.String r0 = r0.A0D()
            r1.A0R(r0)
            r0 = 2131434157(0x7f0b1aad, float:1.849012E38)
            android.widget.TextView r2 = X.AnonymousClass3MX.A0L(r9, r0)
            X.0vb r1 = r9.A00
            X.1E8 r0 = X.AnonymousClass3MY.A0P(r9)
            X.C17960vV.A07(r0)
            java.lang.String r0 = X.AnonymousClass17K.A02(r0)
            java.lang.String r0 = r1.A0G(r0)
            r2.setText(r0)
            r0 = 2131432357(0x7f0b13a5, float:1.848647E38)
            android.view.View r0 = r9.findViewById(r0)
            com.whatsapp.TextEmojiLabel r0 = (com.whatsapp.TextEmojiLabel) r0
            r9.A0F = r0
            boolean r0 = r9.A1E
            if (r0 == 0) goto L_0x01aa
            X.00H r0 = r9.A0l
            java.lang.Object r2 = r0.get()
            X.2mz r2 = (X.C59852mz) r2
            r1 = 28
            com.whatsapp.TextEmojiLabel r0 = r9.A0G
            r2.A00(r9, r0, r1)
            r0 = 2131432346(0x7f0b139a, float:1.8486447E38)
            X.1bI r0 = X.AnonymousClass3Ma.A0x(r9, r0)
            r9.A0f = r0
            r0.A04(r6)
            r0 = 2131432352(0x7f0b13a0, float:1.848646E38)
            android.view.View r1 = r9.findViewById(r0)
            r0 = 6
            X.C89974dK.A00(r1, r9, r0)
            X.1bI r0 = r9.A0f
            android.view.View r1 = r0.A02()
            r0 = 2131432345(0x7f0b1399, float:1.8486445E38)
            X.1bI r0 = X.C72453Mb.A0s(r1, r0)
            r9.A0e = r0
            X.10I r2 = r9.A05
            r1 = 4
            X.49i r0 = new X.49i
            r0.<init>((java.lang.Object) r9, (int) r1)
            X.AnonymousClass3MW.A1T(r0, r2, r6)
            r9.A03()
            goto L_0x01aa
        L_0x0586:
            java.lang.String r0 = "SettingsTabActivity/shouldShowGroupCreationBanner/false"
            goto L_0x058b
        L_0x0589:
            java.lang.String r0 = "SettingsTabActivity/shouldShowGroupCreationBanner/isCreateGroupBannerEnabled is false"
        L_0x058b:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x04d3
        L_0x0590:
            android.content.pm.PackageManager r0 = r9.getPackageManager()     // Catch:{ Exception -> 0x05e7 }
            X.9mH r1 = new X.9mH     // Catch:{ Exception -> 0x05e7 }
            r1.<init>(r9, r0)     // Catch:{ Exception -> 0x05e7 }
            r0 = 24
            boolean r0 = r1.A00(r0)     // Catch:{ Exception -> 0x05e7 }
            if (r0 == 0) goto L_0x0644
            android.content.pm.PackageManager r11 = r9.getPackageManager()     // Catch:{ Exception -> 0x05e7 }
            if (r11 == 0) goto L_0x0644
            X.9mH r1 = new X.9mH     // Catch:{ Exception -> 0x05e7 }
            r1.<init>(r9, r11)     // Catch:{ Exception -> 0x05e7 }
            r0 = 18
            boolean r0 = r1.A00(r0)     // Catch:{ Exception -> 0x05e7 }
            if (r0 == 0) goto L_0x0644
            java.lang.String r2 = X.C24717CHe.A00     // Catch:{ Exception -> 0x05c4 }
            java.lang.String r1 = "com.facebook.oxygen.appmanager.appinfo.AppInfoRedirectActivity"
            android.content.ComponentName r0 = new android.content.ComponentName     // Catch:{ Exception -> 0x05c4 }
            r0.<init>(r2, r1)     // Catch:{ Exception -> 0x05c4 }
            int r0 = r11.getComponentEnabledSetting(r0)     // Catch:{ Exception -> 0x05c4 }
            if (r0 != r7) goto L_0x0644
            goto L_0x05f2
        L_0x05c4:
            java.lang.String r0 = X.AnonymousClass9T6.A00     // Catch:{ Exception -> 0x05e7 }
            android.content.Intent r4 = new android.content.Intent     // Catch:{ Exception -> 0x05e7 }
            r4.<init>(r0)     // Catch:{ Exception -> 0x05e7 }
            java.lang.String r2 = X.C24717CHe.A00     // Catch:{ Exception -> 0x05e7 }
            java.lang.String r1 = "com.facebook.oxygen.appmanager.appinfo.AppInfoRedirectActivity"
            android.content.ComponentName r0 = new android.content.ComponentName     // Catch:{ Exception -> 0x05e7 }
            r0.<init>(r2, r1)     // Catch:{ Exception -> 0x05e7 }
            r4.setComponent(r0)     // Catch:{ Exception -> 0x05e7 }
            java.lang.String r1 = "package_name"
            java.lang.String r0 = r9.getPackageName()     // Catch:{ Exception -> 0x05e7 }
            r4.putExtra(r1, r0)     // Catch:{ Exception -> 0x05e7 }
            android.content.pm.ActivityInfo r0 = r4.resolveActivityInfo(r11, r6)     // Catch:{ Exception -> 0x05e7 }
            if (r0 == 0) goto L_0x0644
            goto L_0x05f2
        L_0x05e7:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "PreloadsManager/isSettingsEnabled Exception: "
            X.C17900vP.A0X(r2, r0, r1)
            goto L_0x0644
        L_0x05f2:
            X.10I r2 = r5.A04
            r0 = 23
            X.Ak0 r1 = new X.Ak0
            r1.<init>(r5, r9, r0)
            java.lang.String r0 = "PreloadsManager/syncFirstPartySettings"
            r2.CGL(r1, r0)
            X.2pb r0 = r5.A02
            android.content.SharedPreferences r1 = X.C61392pb.A00(r0)
            java.lang.String r0 = "first_party_settings_restricted_mode"
            boolean r0 = r1.getBoolean(r0, r7)
            if (r0 != 0) goto L_0x0644
            X.2pb r0 = r5.A02
            android.content.SharedPreferences r1 = X.C61392pb.A00(r0)
            java.lang.String r0 = "first_party_settings_managed"
            boolean r0 = r1.getBoolean(r0, r6)
            if (r0 == 0) goto L_0x0644
            X.2pb r0 = r5.A02
            android.content.SharedPreferences r1 = X.C61392pb.A00(r0)
            java.lang.String r0 = "first_party_settings_updates_enabled"
            boolean r0 = r1.getBoolean(r0, r6)
            if (r0 == 0) goto L_0x0644
            r0 = 2131429504(0x7f0b0880, float:1.8480683E38)
            android.view.View r4 = X.C110885hR.A0A(r9, r0)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            X.2pb r0 = r5.A02
            android.content.SharedPreferences r1 = X.C61392pb.A00(r0)
            java.lang.String r0 = "tos_state"
            int r1 = r1.getInt(r0, r6)
            if (r1 == r7) goto L_0x0abd
            r0 = 5
            if (r1 == r0) goto L_0x0abd
        L_0x0644:
            X.00H r0 = r9.A19
            java.lang.Object r0 = r0.get()
            com.whatsapp.bridge.wfal.WfalManager r0 = (com.whatsapp.bridge.wfal.WfalManager) r0
            boolean r0 = com.whatsapp.bridge.wfal.WfalManager.A00(r0, r6)
            if (r0 == 0) goto L_0x06c1
            r0 = 2131431021(0x7f0b0e6d, float:1.848376E38)
            android.view.View r4 = r9.findViewById(r0)
            r0 = 2131429504(0x7f0b0880, float:1.8480683E38)
            android.view.ViewGroup r5 = X.AnonymousClass3MX.A0F(r9, r0)
            r2 = 0
        L_0x0661:
            int r0 = r5.getChildCount()
            if (r2 >= r0) goto L_0x06be
            android.view.View r0 = r5.getChildAt(r2)
            if (r0 != r4) goto L_0x0ab9
            android.view.ViewStub r1 = new android.view.ViewStub
            r1.<init>(r9)
            r5.addView(r1, r2)
            boolean r0 = X.C28281Zt.A0B(r9)
            if (r0 == 0) goto L_0x0681
            r0 = 2131102717(0x7f060bfd, float:1.781788E38)
            X.C19740yt.A00(r9, r0)
        L_0x0681:
            X.00H r0 = r9.A1A
            java.lang.Object r11 = r0.get()
            r0 = 2131627617(0x7f0e0e61, float:1.8882503E38)
            android.view.View r5 = X.AnonymousClass3MY.A0G(r1, r0)
            r0 = 2131437069(0x7f0b260d, float:1.8496026E38)
            android.view.View r2 = X.C18070vi.A05(r5, r0)
            r1 = 12
            X.7S8 r0 = new X.7S8
            r0.<init>(r9, r11, r1)
            X.C84084Hu.A00(r2, r0)
            X.C18070vi.A0b(r5)
            android.content.Intent r1 = r9.getIntent()
            X.C18070vi.A0d(r1, r6)
            X.C18070vi.A0d(r5, r7)
            java.lang.String r0 = "target_settings_wfal"
            boolean r0 = r1.getBooleanExtra(r0, r6)
            if (r0 == 0) goto L_0x06be
            r0 = 2131437069(0x7f0b260d, float:1.8496026E38)
            android.view.View r0 = X.C18070vi.A05(r5, r0)
            r0.callOnClick()
        L_0x06be:
            r4.setVisibility(r3)
        L_0x06c1:
            X.00H r0 = r9.A0o
            java.lang.Object r11 = r0.get()
            X.4Nj r11 = (X.C85434Nj) r11
            X.0ve r1 = r11.A00
            if (r1 == 0) goto L_0x0ae2
            r0 = 8318(0x207e, float:1.1656E-41)
            boolean r0 = X.C18020vd.A05(r8, r1, r0)
            if (r0 == 0) goto L_0x073c
            boolean r1 = r9.A1F
            r0 = 0
            if (r1 == 0) goto L_0x06db
            r0 = 4
        L_0x06db:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            r0 = 2131429504(0x7f0b0880, float:1.8480683E38)
            android.view.View r4 = X.C110885hR.A0A(r9, r0)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            X.C18070vi.A0d(r4, r7)
            android.view.LayoutInflater r1 = r9.getLayoutInflater()
            r0 = 2131624303(0x7f0e016f, float:1.8875782E38)
            android.view.View r2 = X.AnonymousClass3MX.A0B(r1, r4, r0, r6)
            r0 = 2131428289(0x7f0b03c1, float:1.8478218E38)
            android.view.View r1 = r2.findViewById(r0)
            r0 = 12
            X.C90084dV.A00(r1, r11, r2, r5, r0)
            r0 = 2131428288(0x7f0b03c0, float:1.8478216E38)
            android.view.View r1 = r2.findViewById(r0)
            r0 = 13
            X.C90084dV.A00(r1, r11, r2, r5, r0)
            X.00H r0 = r11.A03
            if (r0 == 0) goto L_0x0ae5
            r0.get()
            X.0ve r1 = r11.A00
            if (r1 == 0) goto L_0x0ae2
            r0 = 10794(0x2a2a, float:1.5126E-41)
            boolean r0 = X.C18020vd.A05(r8, r1, r0)
            if (r0 == 0) goto L_0x072e
            r0 = 2131428290(0x7f0b03c2, float:1.847822E38)
            android.view.View r0 = r2.findViewById(r0)
            r0.setVisibility(r6)
            X.C90084dV.A00(r0, r11, r2, r5, r10)
        L_0x072e:
            r0 = 2131431021(0x7f0b0e6d, float:1.848376E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r4, r0)
            int r0 = r4.indexOfChild(r0)
            r4.addView(r2, r0)
        L_0x073c:
            r0 = 2131428575(0x7f0b04df, float:1.8478798E38)
            android.view.View r1 = r9.findViewById(r0)
            X.5bv r1 = (X.C108575bv) r1
            r0 = 2131428576(0x7f0b04e0, float:1.84788E38)
            android.view.View r0 = r9.findViewById(r0)
            r1.setVisibility(r3)
            r0.setVisibility(r3)
            boolean r4 = r9.A1F
            r0 = 2131434084(0x7f0b1a64, float:1.8489972E38)
            android.view.View r2 = r9.findViewById(r0)
            X.5bv r2 = (X.C108575bv) r2
            r0 = 2131436688(0x7f0b2490, float:1.8495253E38)
            android.view.View r1 = r9.findViewById(r0)
            if (r4 != 0) goto L_0x0ab4
            r2.setVisibility(r6)
            r0 = 44
            X.AnonymousClass48o.A01(r2, r9, r0)
        L_0x076e:
            r1.setVisibility(r3)
            r0 = 2131435271(0x7f0b1f07, float:1.849238E38)
            android.view.View r1 = r9.findViewById(r0)
            X.5bv r1 = (X.C108575bv) r1
            r0 = 41
            X.AnonymousClass48o.A01(r1, r9, r0)
            r0 = 2131435272(0x7f0b1f08, float:1.8492381E38)
            android.view.View r1 = X.C110885hR.A0A(r9, r0)
            X.5bv r1 = (X.C108575bv) r1
            r0 = 2131896018(0x7f1226d2, float:1.9426885E38)
            r1.setText(r0)
            r0 = 42
            X.AnonymousClass48o.A01(r1, r9, r0)
            r0 = 2131435294(0x7f0b1f1e, float:1.8492426E38)
            android.view.View r1 = r9.findViewById(r0)
            r0 = 43
            X.AnonymousClass48o.A00(r1, r9, r0)
            boolean r0 = X.AnonymousClass3MX.A1V(r9)
            if (r0 == 0) goto L_0x0a7a
            r0 = 2131429311(0x7f0b07bf, float:1.8480291E38)
            android.view.View r2 = r9.findViewById(r0)
            X.5bv r2 = (X.C108575bv) r2
            r2.setVisibility(r6)
            r1 = 13
            X.4dK r0 = new X.4dK
            r0.<init>(r9, r1)
            r2.setOnClickListener(r0)
            X.5bv r0 = r9.A1N
            r0.setVisibility(r3)
            X.00H r0 = r9.A0p
            java.lang.Object r0 = r0.get()
            X.2km r0 = (X.C58492km) r0
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x081e
            boolean r0 = r9.A1F
            if (r0 == 0) goto L_0x0a68
            r0 = 2131432349(0x7f0b139d, float:1.8486453E38)
            android.view.ViewStub r0 = X.AnonymousClass3MX.A0H(r9, r0)
            r0.inflate()
            r0 = 2131432046(0x7f0b126e, float:1.8485838E38)
            android.view.View r0 = r9.findViewById(r0)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r1 = (android.widget.LinearLayout.LayoutParams) r1
            r0 = 17
            r1.gravity = r0
        L_0x07ed:
            X.0ve r12 = r9.A0E
            X.1KB r11 = r9.A05
            X.1L9 r10 = r9.A01
            X.11C r5 = r9.A08
            r0 = 2131432046(0x7f0b126e, float:1.8485838E38)
            android.view.View r4 = r9.findViewById(r0)
            com.whatsapp.TextEmojiLabel r4 = (com.whatsapp.TextEmojiLabel) r4
            r2 = 2131895918(0x7f12266e, float:1.9426683E38)
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.String r1 = "learn-more"
            java.lang.String r20 = X.C17880vN.A0q(r9, r1, r0, r6, r2)
            java.lang.String r0 = "https://faq.whatsapp.com/378279804439436"
            android.net.Uri r14 = android.net.Uri.parse(r0)
            r13 = r9
            r15 = r10
            r16 = r11
            r17 = r4
            r18 = r5
            r19 = r12
            r21 = r1
            X.C26302CxJ.A0K(r13, r14, r15, r16, r17, r18, r19, r20, r21)
        L_0x081e:
            boolean r0 = X.AnonymousClass3MX.A1V(r9)
            if (r0 != 0) goto L_0x086e
            X.0ve r1 = r9.A0E
            r0 = 1396(0x574, float:1.956E-42)
            boolean r0 = X.C18020vd.A05(r8, r1, r0)
            if (r0 == 0) goto L_0x086e
            r0 = 2131435265(0x7f0b1f01, float:1.8492367E38)
            android.view.View r4 = r9.findViewById(r0)
            X.5bv r4 = (X.C108575bv) r4
            r0 = 2131895803(0x7f1225fb, float:1.942645E38)
            r4.setText(r0)
            r0 = 2131895804(0x7f1225fc, float:1.9426451E38)
            java.lang.String r0 = r9.getString(r0)
            r4.setSubText(r0)
            r0 = r4
            android.view.View r0 = (android.view.View) r0
            X.AnonymousClass3MW.A1Q(r0)
            X.0ve r2 = r9.A0E
            X.0vf r1 = X.C18040vf.A01
            r0 = 9398(0x24b6, float:1.317E-41)
            boolean r1 = X.C18020vd.A05(r1, r2, r0)
            r0 = 2131232292(0x7f080624, float:1.808069E38)
            if (r1 == 0) goto L_0x085f
            r0 = 2131231709(0x7f0803dd, float:1.8079507E38)
        L_0x085f:
            android.graphics.drawable.Drawable r0 = X.C24261Jm.A00(r9, r0)
            r4.setIcon((android.graphics.drawable.Drawable) r0)
            r0 = 34
            X.AnonymousClass48o.A01(r4, r9, r0)
            r4.setVisibility(r6)
        L_0x086e:
            X.00H r0 = r9.A0t
            boolean r0 = X.C72453Mb.A1W(r0)
            if (r0 == 0) goto L_0x088b
            r0 = 2131435291(0x7f0b1f1b, float:1.849242E38)
            android.view.ViewStub r0 = X.AnonymousClass3MX.A0H(r9, r0)
            android.view.View r1 = r0.inflate()
            X.5bv r1 = (X.C108575bv) r1
            r0 = 36
            X.AnonymousClass48o.A01(r1, r9, r0)
            r1.setVisibility(r6)
        L_0x088b:
            X.00H r0 = r9.A0s
            java.lang.Object r0 = r0.get()
            X.1a8 r0 = (X.C28391a8) r0
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x08b6
            X.00H r0 = r9.A0t
            boolean r0 = X.C72453Mb.A1W(r0)
            if (r0 != 0) goto L_0x08b6
            r0 = 2131435277(0x7f0b1f0d, float:1.8492392E38)
            android.view.ViewStub r0 = X.AnonymousClass3MX.A0H(r9, r0)
            android.view.View r1 = r0.inflate()
            X.5bv r1 = (X.C108575bv) r1
            r0 = 35
            X.AnonymousClass48o.A01(r1, r9, r0)
            r1.setVisibility(r6)
        L_0x08b6:
            X.0ve r1 = r9.A0E
            r0 = 2090(0x82a, float:2.929E-42)
            boolean r0 = X.C18020vd.A05(r8, r1, r0)
            if (r0 != 0) goto L_0x08ca
            X.0ve r1 = r9.A0E
            r0 = 10127(0x278f, float:1.4191E-41)
            boolean r0 = X.C18020vd.A05(r8, r1, r0)
            if (r0 == 0) goto L_0x08ef
        L_0x08ca:
            r0 = 2131435306(0x7f0b1f2a, float:1.849245E38)
            android.view.View r2 = r9.findViewById(r0)
            X.5bv r2 = (X.C108575bv) r2
            X.0ve r1 = r9.A0E
            r0 = 2090(0x82a, float:2.929E-42)
            boolean r0 = X.C18020vd.A05(r8, r1, r0)
            if (r0 == 0) goto L_0x0a59
            r0 = 2131895176(0x7f122388, float:1.9425178E38)
        L_0x08e0:
            java.lang.String r0 = r9.getString(r0)
            r2.setSubText(r0)
        L_0x08e7:
            r2.setVisibility(r6)
            r0 = 37
            X.AnonymousClass48o.A01(r2, r9, r0)
        L_0x08ef:
            r0 = 2131435290(0x7f0b1f1a, float:1.8492418E38)
            android.view.View r0 = r9.findViewById(r0)
            X.5bv r0 = (X.C108575bv) r0
            r9.A0h = r0
            X.11S r0 = r9.A02
            r0.A0I()
            com.whatsapp.Me r4 = r0.A00
            X.5bv r0 = r9.A0h
            if (r4 != 0) goto L_0x0a21
            r0.setVisibility(r3)
        L_0x0908:
            r9.A1H = r6
            X.0vb r0 = r9.A00
            X.11V r1 = r9.A1S
            java.util.Set r0 = r0.A09
            r0.add(r1)
            r9.A1Q = r7
            boolean r0 = r9.A1E
            if (r0 == 0) goto L_0x092b
            X.3hN r0 = new X.3hN
            r0.<init>(r9)
            r9.A1K = r0
            X.00H r0 = r9.A0r
            X.10T r1 = X.C17880vN.A0V(r0)
            X.1cO r0 = r9.A1K
            r1.registerObserver(r0)
        L_0x092b:
            X.0ve r1 = r9.A0E
            r0 = 8815(0x226f, float:1.2352E-41)
            boolean r0 = X.C18020vd.A05(r8, r1, r0)
            if (r0 == 0) goto L_0x093b
            r0 = 2131431021(0x7f0b0e6d, float:1.848376E38)
            X.AnonymousClass3MX.A1H(r9, r0, r3)
        L_0x093b:
            X.0ve r1 = r9.A0E
            r0 = 10707(0x29d3, float:1.5004E-41)
            boolean r0 = X.C18020vd.A05(r8, r1, r0)
            if (r0 == 0) goto L_0x0977
            X.00H r0 = r9.A13
            r0.get()
            X.1It r1 = X.AnonymousClass3MW.A0N(r9)
            java.lang.Class<com.whatsapp.banner.SettingsBannerViewModelImpl> r0 = com.whatsapp.banner.SettingsBannerViewModelImpl.class
            X.1J2 r0 = r1.A00(r0)
            X.3TE r0 = (X.AnonymousClass3TE) r0
            r9.A1L = r0
            com.whatsapp.banner.SettingsBannerViewModelImpl r0 = (com.whatsapp.banner.SettingsBannerViewModelImpl) r0
            X.1DT r1 = r0.A00
            r0 = 28
            X.C91614fy.A00(r9, r1, r0)
            X.3TE r2 = r9.A1L
            com.whatsapp.banner.SettingsBannerViewModelImpl r2 = (com.whatsapp.banner.SettingsBannerViewModelImpl) r2
            X.1oD r0 = r2.A02
            boolean r0 = r0.A06()
            if (r0 == 0) goto L_0x0977
            X.1oI r1 = r2.A01
            X.4hq r0 = new X.4hq
            r0.<init>(r2, r6)
            r1.A01(r0)
        L_0x0977:
            X.00H r0 = r9.A18
            java.lang.Object r0 = r0.get()
            X.178 r0 = (X.AnonymousClass178) r0
            r0.A01(r9)
            android.content.Intent r3 = r9.getIntent()
            if (r3 == 0) goto L_0x099e
            java.lang.String r2 = "page"
            java.lang.String r1 = r3.getStringExtra(r2)
            if (r1 == 0) goto L_0x099e
            java.lang.String r0 = "language"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x099e
            A0d(r9)
            r3.removeExtra(r2)
        L_0x099e:
            android.content.Intent r3 = r9.getIntent()
            if (r3 == 0) goto L_0x09cb
            java.lang.String r0 = "account_switcher"
            boolean r2 = r3.getBooleanExtra(r0, r6)
            java.lang.String r0 = "account_switcher_add_account"
            boolean r1 = r3.getBooleanExtra(r0, r6)
            X.00H r0 = r9.A0m
            java.lang.Object r0 = r0.get()
            X.739 r0 = (X.AnonymousClass739) r0
            r0.A02()
            boolean r0 = r9.A1E
            if (r0 == 0) goto L_0x09fc
            if (r2 == 0) goto L_0x09f6
            java.lang.String r1 = "source"
            r0 = 7
            int r0 = r3.getIntExtra(r1, r0)
            A0s(r9, r0, r6)
        L_0x09cb:
            X.0ve r2 = r9.A0E
            android.content.Context r1 = r9.getApplicationContext()
            X.1DC r0 = r9.A0d
            boolean r0 = X.C124216Xm.A00(r1, r2, r0)
            r9.A1G = r0
            if (r0 == 0) goto L_0x00ad
            X.00H r0 = r9.A10
            java.lang.Object r0 = r0.get()
            X.19T r0 = (X.AnonymousClass19T) r0
            r2 = 552079648(0x20e81120, float:3.931366E-19)
            r0.markerStart(r2)
            X.00H r0 = r9.A10
            java.lang.Object r1 = r0.get()
            X.19T r1 = (X.AnonymousClass19T) r1
            r0 = 2
            r1.markerEnd(r2, r0)
            return
        L_0x09f6:
            if (r1 == 0) goto L_0x09cb
            A0s(r9, r7, r7)
            goto L_0x09cb
        L_0x09fc:
            if (r2 == 0) goto L_0x09cb
            X.00H r0 = r9.A0k
            X.1cN r0 = X.C17880vN.A0I(r0)
            X.11S r0 = r0.A06
            boolean r0 = r0.A0N()
            if (r0 != 0) goto L_0x0a1a
            java.lang.String r0 = "SettingsTabActivity/showAccountSwitcherNotAvailable"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.accountswitching.ui.AccountSwitchingNotAvailableFragment r0 = new com.whatsapp.accountswitching.ui.AccountSwitchingNotAvailableFragment
            r0.<init>()
            r9.CMl(r0)
            goto L_0x09cb
        L_0x0a1a:
            r0 = 2131891441(0x7f1214f1, float:1.9417602E38)
            r9.BhQ(r0)
            goto L_0x09cb
        L_0x0a21:
            r0.setVisibility(r6)
            boolean r0 = X.C26166Ctg.A04()
            if (r0 == 0) goto L_0x0a50
            r2 = 2131889394(0x7f120cf2, float:1.941345E38)
            java.lang.Object[] r1 = new java.lang.Object[r7]
            X.0vb r0 = r9.A00
            java.util.Locale r0 = r0.A0N()
            java.lang.String r0 = X.C25351CeA.A01(r0)
            java.lang.String r1 = X.C17880vN.A0q(r9, r0, r1, r6, r2)
        L_0x0a3d:
            X.5bv r0 = r9.A0h
            r0.setSubText(r1)
            X.5bv r2 = r9.A0h
            r1 = 21
            X.786 r0 = new X.786
            r0.<init>(r9, r4, r1)
            r2.setOnClickListener(r0)
            goto L_0x0908
        L_0x0a50:
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r1 = X.C25351CeA.A01(r0)
            goto L_0x0a3d
        L_0x0a59:
            X.0ve r1 = r9.A0E
            r0 = 10127(0x278f, float:1.4191E-41)
            boolean r0 = X.C18020vd.A05(r8, r1, r0)
            if (r0 == 0) goto L_0x08e7
            r0 = 2131896606(0x7f12291e, float:1.9428078E38)
            goto L_0x08e0
        L_0x0a68:
            r0 = 2131435287(0x7f0b1f17, float:1.8492412E38)
            android.view.ViewStub r1 = X.AnonymousClass3MX.A0H(r9, r0)
            r0 = 2131625824(0x7f0e0760, float:1.8878867E38)
            r1.setLayoutResource(r0)
            r1.inflate()
            goto L_0x07ed
        L_0x0a7a:
            X.10I r2 = r9.A05
            r1 = 22
            X.4ro r0 = new X.4ro
            r0.<init>((com.whatsapp.settings.SettingsTabActivity) r9, (int) r1)
            r2.CGN(r0)
            X.4SS r0 = r9.A0Z
            boolean r2 = r0.A00()
            X.00H r0 = r9.A12
            java.lang.Object r0 = r0.get()
            X.4Pu r0 = (X.C86004Pu) r0
            X.5bv r1 = r9.A1N
            if (r2 == 0) goto L_0x0aa7
            r0.A00(r1)
        L_0x0a9b:
            X.5bv r1 = r9.A1N
            X.4dK r0 = new X.4dK
            r0.<init>(r9, r10)
            r1.setOnClickListener(r0)
            goto L_0x081e
        L_0x0aa7:
            if (r1 == 0) goto L_0x0aae
            r0 = 0
            r1.setBadgeIcon(r0)
            goto L_0x0a9b
        L_0x0aae:
            java.lang.String r0 = "SettingsBadgeUtils/clearBadge cannot find component view"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0a9b
        L_0x0ab4:
            r2.setVisibility(r3)
            goto L_0x076e
        L_0x0ab9:
            int r2 = r2 + 1
            goto L_0x0661
        L_0x0abd:
            android.view.LayoutInflater r1 = r9.getLayoutInflater()
            r0 = 2131624197(0x7f0e0105, float:1.8875567E38)
            android.view.View r2 = r1.inflate(r0, r4, r6)
            r1 = 49
            X.AFT r0 = new X.AFT
            r0.<init>(r5, r9, r1)
            r2.setOnClickListener(r0)
            r0 = 2131431021(0x7f0b0e6d, float:1.848376E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r4, r0)
            int r0 = r4.indexOfChild(r0)
            r4.addView(r2, r0)
            goto L_0x0644
        L_0x0ae2:
            java.lang.String r0 = "abProps"
            goto L_0x0ae7
        L_0x0ae5:
            java.lang.String r0 = "systemFeatures"
        L_0x0ae7:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.settings.SettingsTabActivity.onCreate(android.os.Bundle):void");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (this.A1G) {
            AnonymousClass3MX.A07(menu, 2131432644, 2131896896).setIcon(C24261Jm.A00(this, 2131232135)).setShowAsAction(1);
        }
        AnonymousClass3MX.A07(menu, 2131432620, 2131899369).setIcon(C24261Jm.A00(this, 2131232271)).setShowAsAction(1);
        return super.onCreateOptionsMenu(menu);
    }

    public void onResume() {
        String A0D2;
        String A182;
        if (this.A1H) {
            this.A1H = false;
            finish();
            startActivity(getIntent());
        }
        super.onResume();
        this.A0S = AnonymousClass3MY.A0P(this);
        if (!this.A1F || !this.A1E) {
            Log.i("SettingsTabActivity/onResume/not eligible for updatePushName");
            this.A0G.A0R(this.A02.A0D());
        } else {
            TextEmojiLabel textEmojiLabel = this.A1J;
            if (textEmojiLabel == null || textEmojiLabel.getVisibility() != 0) {
                Log.i("SettingsTabActivity/onResume/pushNameSecondLine null or is GONE");
                A0D2 = this.A02.A0D();
                A182 = AnonymousClass3MZ.A18(this.A0G);
            } else {
                Log.i("SettingsTabActivity/onResume/pushNameSecondLine not null and is VISIBLE");
                A0D2 = this.A02.A0D();
                StringBuilder A102 = AnonymousClass000.A10();
                A102.append(AnonymousClass3MZ.A18(this.A0G));
                A182 = AnonymousClass000.A0y(AnonymousClass3MZ.A18(this.A1J), A102);
            }
            if (!A0D2.equals(A182)) {
                Log.i("SettingsTabActivity/onResume/name changed, need to update pushName components");
                this.A0G.A0R(this.A02.A0D());
                A03();
            }
        }
        if (!C18020vd.A05(C18040vf.A02, this.A0E, 4921)) {
            this.A0F.A0R(C72453Mb.A10(this.A0j));
        }
        boolean z = ((C31161f7) this.A0y.get()).A03;
        View view = this.A00;
        if (z) {
            C18030ve r15 = this.A0E;
            AnonymousClass1KB r13 = this.A05;
            AnonymousClass11S r12 = this.A02;
            AnonymousClass10I r11 = this.A05;
            C27201Vd r10 = this.A0O;
            AnonymousClass1M9 r9 = this.A0J;
            C24921Me r8 = this.A0L;
            C18000vb r7 = this.A00;
            C134196qC r6 = this.A0Q;
            C31131f4 r5 = this.A0R;
            AnonymousClass00H r4 = this.A0y;
            AnonymousClass00H r3 = this.A11;
            View view2 = this.A02;
            C31131f4 r24 = r5;
            C134196qC r23 = r6;
            C27201Vd r22 = r10;
            C37451pZ r21 = this.A0N;
            C24921Me r20 = r8;
            AnonymousClass1M9 r19 = r9;
            AnonymousClass11S r18 = r12;
            AnonymousClass1KB r17 = r13;
            View view3 = view2;
            View view4 = view;
            Pair A002 = AnonymousClass4aV.A00(this, view4, view3, r17, r18, r19, r20, r21, r22, r23, r24, r7, r15, this.A0F, r11, r4, r3, "settings-activity");
            this.A02 = (View) A002.first;
            this.A0N = (C37451pZ) A002.second;
        } else if (C31181f9.A00(view)) {
            AnonymousClass4aV.A03(this.A00, this.A0R, this.A0y);
        }
        ((C31161f7) this.A0y.get()).A00();
        boolean A012 = this.A0Z.A01();
        C86004Pu r0 = (C86004Pu) this.A12.get();
        C108575bv r1 = this.A1O;
        if (A012) {
            r0.A00(r1);
            AnonymousClass4SS r32 = this.A0Z;
            if (C18020vd.A05(C18040vf.A01, r32.A01, 1799)) {
                C33531iy r2 = r32.A04;
                r2.A04.execute(new C21448AkF(r2, 39));
            }
        } else if (r1 != null) {
            r1.setBadgeIcon((Drawable) null);
        } else {
            Log.e("SettingsBadgeUtils/clearBadge cannot find component view");
        }
        ((C88624aF) this.A15.get()).A04();
        if (this.A0g != null) {
            this.A05.CGN(new C98844ro(this, 23));
        }
    }

    public boolean onSearchRequested() {
        View findViewById;
        C81123yj r1 = new C81123yj();
        r1.A00 = Integer.valueOf(this.A1F ? 1 : 0);
        this.A0U.CC4(r1);
        WDSSearchBar wDSSearchBar = this.A0i;
        if (wDSSearchBar != null) {
            WDSSearchBar.A01(wDSSearchBar, true, true);
        }
        WDSSearchBar wDSSearchBar2 = this.A0i;
        if (wDSSearchBar2 != null) {
            findViewById = wDSSearchBar2.A08.A07;
        } else {
            findViewById = findViewById(2131434851);
        }
        C89974dK.A00(findViewById, this, 4);
        ViewStub A0H2 = AnonymousClass3MX.A0H(this, 2131435319);
        if (A0H2 != null && A0H2.findViewById(2131435320) == null) {
            RecyclerView recyclerView = (RecyclerView) A0H2.inflate();
            this.A05 = recyclerView;
            recyclerView.setAdapter(this.A0b);
            C37961qT r12 = this.A05.A0C;
            if (r12 instanceof C37971qU) {
                ((C37971qU) r12).A00 = false;
            }
        }
        A0r(this);
        return false;
    }

    private void A0Q(int i, int i2) {
        C108575bv r0 = (C108575bv) findViewById(i);
        if (r0 != null) {
            r0.setIcon(i2);
        }
    }

    public static void A0s(SettingsTabActivity settingsTabActivity, int i, boolean z) {
        DialogFragment A002;
        String str;
        C17900vP.A0n("SettingsTabActivity/showAccountSwitcher/showPrimaryCompanionOptions=", AnonymousClass000.A10(), z);
        if (z) {
            A002 = C83444Fd.A00("settings", i);
            str = "add_account_bottom_sheet_fragment";
        } else {
            A002 = C83434Fc.A00("settings", i);
            str = "account_switch_bottom_sheet_fragment";
        }
        settingsTabActivity.CMm(A002, str);
    }

    public C23401Fx BPx() {
        return ((C23391Fw) getLifecycle()).A02;
    }

    public void BwY() {
        this.A01 = System.currentTimeMillis();
    }

    public void onBackPressed() {
        if (isTaskRoot()) {
            this.A17.get();
            Intent A022 = AnonymousClass1LU.A02(this);
            A022.addFlags(268468224);
            finish();
            startActivity(A022);
            return;
        }
        super.onBackPressed();
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.A1Q) {
            this.A0K.unregisterObserver(this.A1R);
            C37451pZ r0 = this.A0M;
            if (r0 != null) {
                r0.A02();
            }
            C18000vb r02 = this.A00;
            r02.A09.remove(this.A1S);
        }
        AnonymousClass4aV.A01(this.A02, this.A0R);
        C37451pZ r03 = this.A0N;
        if (r03 != null) {
            r03.A02();
            this.A0N = null;
        }
        if (this.A1K != null) {
            C17880vN.A0V(this.A0r).unregisterObserver(this.A1K);
        }
        ((AnonymousClass178) this.A18.get()).A02(this);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
            return true;
        } else if (menuItem.getItemId() == 2131432644) {
            if (this.A1G) {
                ((AnonymousClass19T) this.A10.get()).markerStart(552090822);
                ((AnonymousClass19T) this.A10.get()).markerEnd(552090822, 2);
            }
            Intent A062 = AnonymousClass3MZ.A06(this.A17);
            A062.setClassName(getPackageName(), "com.whatsapp.thunderstorm.ThunderstormPermissionsActivity");
            startActivity(A062);
            return true;
        } else if (menuItem.getItemId() != 2131432620) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            onSearchRequested();
            return true;
        }
    }

    public void onPause() {
        super.onPause();
        AnonymousClass4aV.A06(this.A0R);
        ((C31161f7) this.A0y.get()).A01(this.A00);
    }

    public SettingsTabActivity(int i) {
        this.A1P = false;
        C91034f2.A00(this, 24);
    }
}
