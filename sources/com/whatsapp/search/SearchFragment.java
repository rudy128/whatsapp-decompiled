package com.whatsapp.search;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass10I;
import X.AnonymousClass118;
import X.AnonymousClass11C;
import X.AnonymousClass11P;
import X.AnonymousClass198;
import X.AnonymousClass1BI;
import X.AnonymousClass1DS;
import X.AnonymousClass1DT;
import X.AnonymousClass1E7;
import X.AnonymousClass1FL;
import X.AnonymousClass1GP;
import X.AnonymousClass1HS;
import X.AnonymousClass1IV;
import X.AnonymousClass1K1;
import X.AnonymousClass1K2;
import X.AnonymousClass1KB;
import X.AnonymousClass1L9;
import X.AnonymousClass1LU;
import X.AnonymousClass1M6;
import X.AnonymousClass1MC;
import X.AnonymousClass1NN;
import X.AnonymousClass1Nb;
import X.AnonymousClass1Q9;
import X.AnonymousClass1VT;
import X.AnonymousClass1WP;
import X.AnonymousClass27t;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.AnonymousClass3NW;
import X.AnonymousClass4M1;
import X.AnonymousClass4XB;
import X.AnonymousClass4ZG;
import X.AnonymousClass68H;
import X.AnonymousClass6R7;
import X.AnonymousClass6XP;
import X.AnonymousClass6ZJ;
import X.AnonymousClass73Z;
import X.AnonymousClass77Z;
import X.AnonymousClass7AP;
import X.AnonymousClass7AR;
import X.AnonymousClass7D5;
import X.AnonymousClass7E0;
import X.AnonymousClass7FF;
import X.AnonymousClass7FG;
import X.AnonymousClass7ID;
import X.AnonymousClass7OI;
import X.AnonymousClass7S4;
import X.AnonymousClass7S6;
import X.AnonymousClass7SC;
import X.AnonymousClass88M;
import X.C000200d;
import X.C108715cB;
import X.C108955ca;
import X.C108965cb;
import X.C108985cd;
import X.C109005cf;
import X.C109105cp;
import X.C111255jJ;
import X.C111295jU;
import X.C112355lL;
import X.C112735lx;
import X.C115945w6;
import X.C116315wx;
import X.C124956aG;
import X.C124966aH;
import X.C131326ku;
import X.C133666pH;
import X.C138036wQ;
import X.C142627Ae;
import X.C146527Pl;
import X.C146777Qo;
import X.C147387Sy;
import X.C17880vN;
import X.C17890vO;
import X.C17900vP;
import X.C18000vb;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C19880zA;
import X.C20045A4o;
import X.C20135A8w;
import X.C219217x;
import X.C22621Co;
import X.C22801Dg;
import X.C22851Dl;
import X.C22971Dz;
import X.C23181Fa;
import X.C23331Fp;
import X.C23520Bik;
import X.C23581Gv;
import X.C23621Gz;
import X.C24071It;
import X.C24671Lf;
import X.C25161Nd;
import X.C25221Nj;
import X.C25231Nk;
import X.C25741Pl;
import X.C27201Vd;
import X.C27871Xy;
import X.C28261Zr;
import X.C28741ap;
import X.C30801eX;
import X.C31131f4;
import X.C31161f7;
import X.C31191fA;
import X.C32011gU;
import X.C33251iW;
import X.C34171k3;
import X.C34771l3;
import X.C36921og;
import X.C36961ok;
import X.C36981om;
import X.C37451pZ;
import X.C37731q2;
import X.C38751rp;
import X.C39711tW;
import X.C42701yb;
import X.C441322g;
import X.C446324e;
import X.C47192Hl;
import X.C60442o2;
import X.C70863Cu;
import X.C72453Mb;
import X.C92864i2;
import X.C99354sg;
import X.CW0;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.whatsapp.HomeActivity;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.search.views.ProgressView;
import com.whatsapp.search.views.TokenizedSearchInput;
import com.whatsapp.text.FinalBackspaceAwareEntry;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.topbar.WDSToolbar;
import java.util.List;

public class SearchFragment extends Hilt_SearchFragment {
    public ValueAnimator A00;
    public View A01;
    public ViewGroup A02;
    public Toolbar A03;
    public C22851Dl A04;
    public RecyclerView A05;
    public LottieAnimationView A06;
    public C23520Bik A07;
    public C19880zA A08;
    public C19880zA A09;
    public AnonymousClass1L9 A0A;
    public C36981om A0B;
    public C36961ok A0C;
    public C124956aG A0D;
    public C124966aH A0E;
    public AnonymousClass1KB A0F;
    public C33251iW A0G;
    public AnonymousClass1HS A0H;
    public AnonymousClass1MC A0I;
    public C24671Lf A0J;
    public C27201Vd A0K;
    public C25161Nd A0L;
    public C31131f4 A0M;
    public C108715cB A0N;
    public AnonymousClass11C A0O;
    public AnonymousClass11P A0P;
    public AnonymousClass118 A0Q;
    public C18000vb A0R;
    public C30801eX A0S;
    public C22621Co A0T;
    public AnonymousClass1NN A0U;
    public AnonymousClass1Q9 A0V;
    public AnonymousClass1WP A0W;
    public C18030ve A0X;
    public AnonymousClass1BI A0Y;
    public C36921og A0Z;
    public C112355lL A0a;
    public C111295jU A0b;
    public ProgressView A0c;
    public TokenizedSearchInput A0d;
    public AnonymousClass1Nb A0e;
    public C34771l3 A0f;
    public C111255jJ A0g;
    public AnonymousClass198 A0h;
    public AnonymousClass10I A0i;
    public AnonymousClass88M A0j;
    public AnonymousClass1VT A0k;
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
    public AnonymousClass00H A1B;
    public Runnable A1C;
    public C37451pZ A1D;
    public C37731q2 A1E;
    public C142627Ae A1F;
    public AnonymousClass68H A1G;
    public C27871Xy A1H = C27871Xy.GONE;
    public boolean A1I;
    public final PhoneStateListener A1J = new AnonymousClass3NW(this, 2);
    public final C39711tW A1K = new C112735lx(this, 14);
    public final AnonymousClass1M6 A1L = new C92864i2(this, 4);
    public final C34171k3 A1M = new C116315wx(this, 1);
    public final C23581Gv A1N = new AnonymousClass7E0(this, 9);
    public final C28741ap A1O = new AnonymousClass7FF(this, 4);
    public final C25231Nk A1P = new AnonymousClass7FG(this, 2);
    public final C25221Nj A1Q = new AnonymousClass7ID(this, 4);
    public final AnonymousClass1IV A1R = new AnonymousClass7OI(this, 3);

    private void A01(Bundle bundle) {
        C27871Xy r0;
        WDSToolbar wDSToolbar;
        int i;
        if (bundle == null || (i = bundle.getInt("toolbar_divider_state", -1)) <= 0) {
            Toolbar toolbar = this.A03;
            C18070vi.A0d(toolbar, 0);
            if (!(toolbar instanceof WDSToolbar) || (wDSToolbar = (WDSToolbar) toolbar) == null || (r0 = wDSToolbar.A06) == null) {
                r0 = C27871Xy.GONE;
            }
        } else {
            r0 = C27871Xy.values()[i];
        }
        this.A1H = r0;
    }

    public static void A06(SearchFragment searchFragment) {
        SearchFragment searchFragment2 = searchFragment;
        AnonymousClass1FL A1B2 = searchFragment.A1B();
        if (A1B2 != null) {
            ((C38751rp) searchFragment.A0z.get()).A00(true);
            AnonymousClass4ZG r5 = (AnonymousClass4ZG) searchFragment.A12.get();
            AnonymousClass1GP supportFragmentManager = A1B2.getSupportFragmentManager();
            Integer num = AnonymousClass00R.A18;
            C18070vi.A0d(supportFragmentManager, 0);
            AnonymousClass4ZG.A01(supportFragmentManager, r5, new C99354sg(searchFragment2, supportFragmentManager, r5, num, 18), 18);
        }
    }

    public void A1Q(Bundle bundle) {
        C22801Dg r5;
        AnonymousClass118 r4;
        C32011gU r3;
        C18000vb r2;
        C138036wQ r1;
        C111295jU r6;
        int i;
        int i2;
        int i3;
        int i4;
        String string;
        this.A0X = true;
        C111295jU r32 = this.A0b;
        AnonymousClass1FL A1D2 = A1D();
        r32.A0j.A0A(A1D2, new AnonymousClass7AP(r32, 6));
        AnonymousClass7AR.A01(A1D2, r32.A0h, r32, 33);
        AnonymousClass7AR.A01(A1D2, r32.A0g, r32, 34);
        AnonymousClass7AR.A01(A1D2, r32.A0X, r32, 35);
        AnonymousClass7AR.A01(A1D2, r32.A0W, r32, 36);
        AnonymousClass7AR.A01(A1D2, r32.A0Y, r32, 37);
        AnonymousClass7AR.A01(A1D2, r32.A0V, r32, 38);
        A01(bundle);
        Bundle bundle2 = this.A06;
        if (bundle2 != null && bundle2.containsKey("INBOX_FILTER")) {
            String string2 = this.A06.getString("INBOX_FILTER");
            switch (string2.hashCode()) {
                case -1730152220:
                    if (string2.equals("CONTACTS_FILTER")) {
                        A07(this);
                        this.A0b.A0o(new AnonymousClass77Z(0, 2131434871, 2131890393, 2131232184));
                        return;
                    }
                    return;
                case -817912192:
                    if (string2.equals("FAVORITES_FILTER")) {
                        A07(this);
                        r6 = this.A0b;
                        r6.A19.A01(C17880vN.A0i(), (Integer) null, (Integer) null, (String) null, 22);
                        i = 2131434885;
                        i2 = 2131890395;
                        i3 = 2131233299;
                        i4 = 5;
                        break;
                    } else {
                        return;
                    }
                case 72525144:
                    if (string2.equals("GROUP_FILTER")) {
                        A07(this);
                        r6 = this.A0b;
                        r6.A19.A01(C17880vN.A0i(), (Integer) null, (Integer) null, (String) null, 3);
                        i = 2131434893;
                        i2 = 2131890397;
                        i3 = 2131231956;
                        i4 = 4;
                        break;
                    } else {
                        return;
                    }
                case 1184498283:
                    if (string2.equals("CUSTOM_LIST_FILTER") && C72453Mb.A1W(this.A0w) && this.A06.containsKey("INBOX_CUSTOM_LIST_FILTER") && (string = this.A06.getString("INBOX_CUSTOM_LIST_FILTER")) != null && !string.isEmpty()) {
                        A07(this);
                        C111295jU r0 = this.A0b;
                        r0.A0o(new AnonymousClass77Z(string, 6, 2131434912, 2131890398, 2131233505));
                        r5 = r0.A0h;
                        r4 = r0.A0s;
                        r3 = r0.A0z;
                        r2 = r0.A0t;
                        r1 = r0.A1A;
                        break;
                    } else {
                        return;
                    }
                    break;
                case 1827283464:
                    if (string2.equals("UNREAD_FILTER")) {
                        A07(this);
                        this.A0b.A0f();
                        return;
                    }
                    return;
                default:
                    return;
            }
            r6.A0o(new AnonymousClass77Z(i4, i, i2, i3));
            r5 = r6.A0h;
            r4 = r6.A0s;
            r3 = r6.A0z;
            r2 = r6.A0t;
            r1 = r6.A1A;
            r5.A0F(new C147387Sy(r4, r2, r3, r1));
        }
    }

    public static void A03(AnonymousClass1BI r4, SearchFragment searchFragment) {
        C112355lL r3 = searchFragment.A0a;
        if (r3 != null) {
            int i = 0;
            while (true) {
                C147387Sy r1 = r3.A0S;
                if (i < r1.size()) {
                    if (r4.equals(C108955ca.A0o(r1, i))) {
                        r3.A0G(i);
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public static void A07(SearchFragment searchFragment) {
        LinearLayout linearLayout;
        View view;
        View view2 = searchFragment.A0B;
        if (view2 != null && (linearLayout = (LinearLayout) view2.getParent()) != null) {
            C146777Qo r3 = new C146777Qo((Object) searchFragment, 10);
            ViewParent parent = linearLayout.getParent();
            ValueAnimator valueAnimator = null;
            if ((parent instanceof FrameLayout) && (view = (View) parent) != null) {
                valueAnimator = AnonymousClass6XP.A00(linearLayout, new C70863Cu(linearLayout, (Runnable) r3), view.getHeight());
            }
            searchFragment.A00 = valueAnimator;
            if (valueAnimator != null) {
                valueAnimator.start();
            }
        }
    }

    public static void A08(SearchFragment searchFragment) {
        if (!searchFragment.A0M.A0C()) {
            searchFragment.A0M.A06();
        }
    }

    public static void A09(SearchFragment searchFragment) {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) searchFragment.A05.getLayoutManager();
        if (linearLayoutManager != null) {
            C111295jU r1 = searchFragment.A0b;
            Integer valueOf = Integer.valueOf(linearLayoutManager.A1N() + 24);
            AnonymousClass1DT r12 = r1.A0i;
            if (!C108965cb.A1W(r12, valueOf)) {
                r12.A0E(valueOf);
            }
            C111295jU r13 = searchFragment.A0b;
            Integer valueOf2 = Integer.valueOf(linearLayoutManager.A1P());
            AnonymousClass1DT r14 = r13.A0j;
            if (!C108965cb.A1W(r14, valueOf2)) {
                r14.A0E(valueOf2);
            }
        }
    }

    public static void A0A(SearchFragment searchFragment, Runnable runnable, int i, int i2, int i3, int i4, boolean z) {
        String str;
        int i5;
        Bundle bundle = searchFragment.A06;
        if (bundle != null) {
            if (z) {
                str = "enter_duration_ms";
                i5 = 500;
            } else {
                str = "exit_duration_ms";
                i5 = 250;
            }
            int i6 = bundle.getInt(str, i5);
            C23621Gz r6 = new C23621Gz();
            if (searchFragment.A02 != null) {
                int i7 = bundle.getInt("x", 0);
                int i8 = bundle.getInt("y", 0);
                float hypot = (float) Math.hypot((double) (i3 - i), (double) (i4 - i2));
                float f = 0.0f;
                if (!z) {
                    f = hypot;
                    hypot = 0.0f;
                }
                Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(searchFragment.A02, i7, i8, f, hypot);
                createCircularReveal.setDuration((long) i6);
                createCircularReveal.setInterpolator(r6);
                createCircularReveal.addListener(new C109105cp(searchFragment, runnable, 3));
                createCircularReveal.start();
            }
        }
    }

    public static boolean A0B(SearchFragment searchFragment) {
        if (!AnonymousClass3MW.A0X(searchFragment.A0o).A0F() || !C108985cd.A1X(searchFragment)) {
            return false;
        }
        return true;
    }

    public boolean A1m(MenuItem menuItem) {
        if (!this.A1E.A03(menuItem, this, A1D())) {
            return false;
        }
        A08(this);
        return true;
    }

    public void A20(Bundle bundle) {
        AnonymousClass1Q9 r1 = this.A0V;
        C18070vi.A0d(bundle, 0);
        bundle.putLong("ephemeral_session_start", r1.A00);
        bundle.putInt("toolbar_divider_state", this.A1H.ordinal());
    }

    private void A00(int i) {
        Context A1n;
        TelephonyManager telephonyManager;
        if (A0B(this) && !((C219217x) this.A1B.get()).A0J() && (A1n = A1n()) != null && (telephonyManager = (TelephonyManager) A1n.getSystemService("phone")) != null) {
            telephonyManager.listen(this.A1J, i);
        }
    }

    public static void A02(C115945w6 r13, AnonymousClass1E7 r14, SearchFragment searchFragment) {
        String str;
        AnonymousClass1BI A002;
        int i;
        Integer num;
        AnonymousClass1FL A1B2 = searchFragment.A1B();
        if (A1B2 != null && (str = r13.A02) != null && (A002 = AnonymousClass1E7.A00(r14)) != null) {
            boolean isEmpty = TextUtils.isEmpty(str);
            AnonymousClass6R7 r3 = r13.A01;
            if (r3 == null) {
                r3 = AnonymousClass6R7.TYPEAHEAD;
            }
            if (r3 == AnonymousClass6R7.NULL_STATE) {
                i = 25;
                num = AnonymousClass00R.A0N;
            } else {
                i = 22;
                if (r3 != AnonymousClass6R7.USER_INPUT) {
                    num = AnonymousClass00R.A0Y;
                } else if (isEmpty) {
                    num = AnonymousClass00R.A0C;
                } else {
                    num = AnonymousClass00R.A0j;
                }
            }
            String A0Q2 = C17890vO.A0Q();
            if (!isEmpty) {
                searchFragment.A0G.A0S(A002, r3, num, str, r13.A03, A0Q2);
            }
            searchFragment.A1A.get();
            searchFragment.A0Q.A00.startActivity(AnonymousClass1LU.A0h(A1B2, A002, num, A0Q2, i, r13.A00));
        }
    }

    public static void A04(Jid jid, SearchFragment searchFragment) {
        if (C22971Dz.A0T(jid)) {
            if (C18020vd.A05(C18040vf.A02, searchFragment.A0X, 4178)) {
                Log.w(AnonymousClass001.A1E(jid, "Click on LID from search; jid = ", AnonymousClass000.A10()), new Throwable());
            }
        }
    }

    public static void A05(SearchFragment searchFragment) {
        C23331Fp r2 = (C23331Fp) searchFragment.A1B();
        searchFragment.A0b.A0h(2);
        if (r2 != null && !r2.isFinishing()) {
            HomeActivity homeActivity = (HomeActivity) r2;
            homeActivity.A0C.setBackgroundResource(2131232920);
            homeActivity.A07.setVisibility(4);
        }
    }

    public void A1j() {
        C17900vP.A0Y(this, "SearchFragment/onStop ", AnonymousClass000.A10());
        super.A1j();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x040e, code lost:
        if (r6.A01() == false) goto L_0x0410;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View A1q(android.os.Bundle r44, android.view.LayoutInflater r45, android.view.ViewGroup r46) {
        /*
            r43 = this;
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "SearchFragment/onCreateView "
            r0 = r43
            X.C17900vP.A0Y(r0, r1, r2)
            X.198 r1 = r0.A0h     // Catch:{ IOException -> 0x0010 }
            r1.A00()     // Catch:{ IOException -> 0x0010 }
        L_0x0010:
            r1 = 2131626787(0x7f0e0b23, float:1.888082E38)
            r3 = r45
            r2 = r46
            android.view.View r2 = X.AnonymousClass3MX.A09(r3, r2, r1)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.A02 = r2
            r1 = 2131434659(0x7f0b1ca3, float:1.8491138E38)
            androidx.recyclerview.widget.RecyclerView r1 = X.AnonymousClass3MX.A0Q(r2, r1)
            r0.A05 = r1
            android.view.ViewGroup r2 = r0.A02
            r1 = 2131430073(0x7f0b0ab9, float:1.8481837E38)
            android.view.View r1 = r2.findViewById(r1)
            r0.A01 = r1
            X.5jU r5 = r0.A0b
            X.10I r3 = r5.A1Q     // Catch:{ Exception -> 0x0042 }
            r2 = 14
            X.7Qo r1 = new X.7Qo     // Catch:{ Exception -> 0x0042 }
            r1.<init>((X.C111295jU) r5, (int) r2)     // Catch:{ Exception -> 0x0042 }
            r3.CGF(r1)     // Catch:{ Exception -> 0x0042 }
            goto L_0x0083
        L_0x0042:
            r4 = move-exception
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x0068 }
            java.lang.String r1 = "SearchViewModel/warmContacts/"
            r3.append(r1)     // Catch:{ Exception -> 0x0068 }
            X.10I r1 = r5.A1Q     // Catch:{ Exception -> 0x0068 }
            java.lang.String r2 = "null"
            if (r1 != 0) goto L_0x0053
            r1 = r2
        L_0x0053:
            r3.append(r1)     // Catch:{ Exception -> 0x0068 }
            java.lang.String r1 = "/"
            r3.append(r1)     // Catch:{ Exception -> 0x0068 }
            X.6q8 r1 = r5.A14     // Catch:{ Exception -> 0x0068 }
            if (r1 == 0) goto L_0x0060
            r2 = r1
        L_0x0060:
            java.lang.String r1 = X.C17890vO.A0V(r2, r3)     // Catch:{ Exception -> 0x0068 }
            com.whatsapp.util.Log.e(r1, r4)     // Catch:{ Exception -> 0x0068 }
            goto L_0x0083
        L_0x0068:
            r3 = move-exception
            X.190 r4 = r5.A0o
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "SearchViewModel/warmContacts/error when logging: "
            r2.append(r1)
            r2.append(r3)
            java.lang.String r1 = ","
            java.lang.String r3 = X.AnonymousClass001.A1E(r5, r1, r2)
            r2 = 1
            java.lang.String r1 = "SearchViewModel-warm-contacts"
            r4.A0G(r1, r3, r2)
        L_0x0083:
            boolean r1 = r0.A1I
            r9 = 1
            if (r1 != 0) goto L_0x00b7
            android.view.ViewGroup r1 = r0.A02
            if (r1 == 0) goto L_0x00b5
            X.5jU r1 = r0.A0b
            if (r1 == 0) goto L_0x0093
            r1.A0h(r9)
        L_0x0093:
            X.10I r4 = r0.A0i
            r1 = 8
            X.7Qo r3 = new X.7Qo
            r3.<init>((java.lang.Object) r0, (int) r1)
            r1 = 50
            X.25d r1 = r4.CGv(r3, r1)
            r0.A1C = r1
            X.00H r1 = r0.A0y
            java.lang.Object r1 = r1.get()
            X.1rX r1 = (X.C38581rX) r1
            boolean r1 = r1.A02()
            if (r1 == 0) goto L_0x02a5
            A05(r0)
        L_0x00b5:
            r0.A1I = r9
        L_0x00b7:
            X.1KB r3 = r0.A0F
            androidx.recyclerview.widget.RecyclerView r1 = r0.A05
            X.7Ae r2 = new X.7Ae
            r2.<init>(r1, r3)
            r0.A1F = r2
            X.1Fw r1 = r0.A0L
            r1.A05(r2)
            X.1Fw r2 = r0.A0L
            X.5jU r1 = r0.A0b
            r2.A05(r1)
            X.88M r2 = r0.A0j
            X.10I r1 = r0.A0i
            X.2Py r1 = X.AnonymousClass68H.A01(r1)
            X.68H r1 = r2.BGh(r1)
            r0.A1G = r1
            X.5jU r1 = r0.A0b
            X.A8w r1 = r1.A02
            if (r1 != 0) goto L_0x0299
            r6 = 0
        L_0x00e3:
            X.0ve r1 = r0.A0X
            boolean r1 = X.C20135A8w.A08(r1)
            if (r1 == 0) goto L_0x0167
            if (r6 == 0) goto L_0x0167
            X.6aG r2 = r0.A0D
            X.5jU r1 = r0.A0b
            X.A8w r1 = r1.A02
            if (r1 == 0) goto L_0x0296
            X.00H r1 = r1.A0I
            java.lang.Object r1 = r1.get()
            X.A2R r1 = (X.A2R) r1
            X.APP r1 = r1.A04
            X.9uP r1 = r1.A02
            X.1wy r5 = r1.A04
            X.C18070vi.A0X(r5)
        L_0x0106:
            X.1na r8 = r2.A00
            X.10E r2 = r8.A02
            X.0ve r18 = X.AnonymousClass10E.A8r(r2)
            X.17x r17 = X.AnonymousClass3Ma.A0b(r2)
            X.10G r7 = r2.A00
            X.00S r1 = r7.A1B
            java.lang.Object r4 = r1.get()
            X.9Xq r4 = (X.C183279Xq) r4
            X.00S r1 = r2.A9I
            java.lang.Object r3 = r1.get()
            X.19T r3 = (X.AnonymousClass19T) r3
            X.1K1 r1 = r8.A00
            X.9kC r13 = X.AnonymousClass1K1.A0Y(r1)
            X.00S r1 = r7.A0l
            java.lang.Object r2 = r1.get()
            X.8vd r2 = (X.C173728vd) r2
            X.00S r1 = r7.A0j
            java.lang.Object r1 = r1.get()
            X.9d4 r1 = (X.C185739d4) r1
            X.APB r10 = new X.APB
            r11 = r0
            r12 = r5
            r14 = r1
            r15 = r6
            r16 = r2
            r19 = r4
            r20 = r3
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            X.5jU r3 = r0.A0b
            r1 = 38
            X.AGu r2 = new X.AGu
            r2.<init>(r10, r1)
            X.A8w r1 = r3.A02
            if (r1 == 0) goto L_0x0167
            X.00H r1 = r1.A0I
            java.lang.Object r1 = r1.get()
            X.A2R r1 = (X.A2R) r1
            X.APP r1 = r1.A04
            X.9uP r1 = r1.A02
            X.1wy r1 = r1.A04
            r1.A0A(r0, r2)
        L_0x0167:
            X.6aH r2 = r0.A0E
            X.7Ae r1 = r0.A1F
            r20 = r1
            X.5jU r1 = r0.A0b
            r19 = r1
            X.1pZ r1 = r0.A1D
            r17 = r1
            X.1FL r16 = r0.A1B()
            X.1Fw r15 = r0.A0L
            X.68H r14 = r0.A1G
            X.00H r1 = r0.A0m
            java.lang.Object r13 = r1.get()
            X.73Z r13 = (X.AnonymousClass73Z) r13
            X.1na r1 = r2.A00
            X.10E r3 = r1.A02
            X.11P r30 = X.AnonymousClass10E.A6O(r3)
            X.0ve r33 = X.AnonymousClass10E.A8r(r3)
            X.190 r18 = X.AnonymousClass3MY.A0N(r3)
            X.10I r41 = X.AnonymousClass10E.AL1(r3)
            X.118 r31 = X.AnonymousClass3MZ.A0l(r3)
            X.1gU r34 = X.AnonymousClass3MY.A0d(r3)
            X.10G r2 = r3.A00
            X.00S r4 = r2.A2r
            java.lang.Object r12 = r4.get()
            X.1wR r12 = (X.C41461wR) r12
            X.0vb r32 = X.AnonymousClass10E.A6Q(r3)
            X.1Me r27 = X.AnonymousClass3MZ.A0g(r3)
            X.00S r3 = r3.A0x
            java.lang.Object r11 = r3.get()
            X.1pj r11 = (X.C37551pj) r11
            X.1K1 r3 = r1.A00
            X.00S r4 = r3.A1l
            java.lang.Object r10 = r4.get()
            X.1nz r10 = (X.C36491nz) r10
            X.00S r4 = r2.A2s
            java.lang.Object r8 = r4.get()
            X.733 r8 = (X.AnonymousClass733) r8
            X.00S r4 = r3.A4n
            java.lang.Object r6 = r4.get()
            X.1rX r6 = (X.C38581rX) r6
            X.6wQ r40 = X.AnonymousClass1K1.A1n(r3)
            X.00S r3 = r2.A0m
            java.lang.Object r5 = r3.get()
            X.6jD r5 = (X.C130306jD) r5
            X.00S r3 = r2.A1S
            java.lang.Object r4 = r3.get()
            X.1og r4 = (X.C36921og) r4
            X.1nZ r1 = r1.A01
            X.00S r3 = r1.A0x
            java.lang.Object r3 = r3.get()
            X.6aJ r3 = (X.C124986aJ) r3
            X.3Kk r23 = X.AnonymousClass3MZ.A0T(r2)
            X.00S r2 = r1.A0y
            java.lang.Object r2 = r2.get()
            X.6aK r2 = (X.C124996aK) r2
            X.00S r1 = r1.A0z
            java.lang.Object r1 = r1.get()
            X.6aL r1 = (X.C125006aL) r1
            X.5lL r7 = new X.5lL
            r25 = r13
            r26 = r5
            r28 = r17
            r29 = r8
            r35 = r6
            r36 = r4
            r37 = r12
            r38 = r20
            r39 = r19
            r42 = r14
            r17 = r15
            r19 = r10
            r20 = r3
            r21 = r2
            r22 = r1
            r24 = r11
            r15 = r7
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
            r0.A0a = r7
            r2 = 19
            X.7AR r1 = new X.7AR
            r1.<init>(r0, r2)
            r0.A04 = r1
            X.1l3 r1 = r0.A0f
            r3 = 1
            r2 = 0
            X.C18070vi.A0d(r1, r2)
            X.5jJ r1 = X.C108995ce.A0S(r0, r1)
            r0.A0g = r1
            X.1DT r6 = r1.A04
            X.1q9 r5 = r0.A1G()
            r1 = 13
            X.7AH r4 = new X.7AH
            r4.<init>(r7, r0, r1)
            r6.A0A(r5, r4)
            X.1Fw r5 = r0.A0L
            X.5jJ r4 = r0.A0g
            r5.A05(r4)
            X.5lL r8 = r0.A0a
            android.content.Context r7 = r0.A1n()
            android.content.Context r6 = r0.A1n()
            r5 = 2130969386(0x7f04032a, float:1.7547452E38)
            r4 = 2131100378(0x7f0602da, float:1.7813136E38)
            int r6 = X.AnonymousClass3MZ.A02(r6, r7, r5, r4)
            android.content.Context r5 = r0.A1n()
            r4 = 1056964608(0x3f000000, float:0.5)
            int r4 = X.C62762rw.A01(r5, r4)
            X.5lr r5 = new X.5lr
            r5.<init>(r8, r6, r4)
            androidx.recyclerview.widget.RecyclerView r4 = r0.A05
            r4.A0r(r5)
            X.0zA r5 = r0.A09
            boolean r4 = r5.A07()
            if (r4 == 0) goto L_0x02ae
            r5.A03()
            java.lang.String r0 = "generateNewSession"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x0296:
            r5 = 0
            goto L_0x0106
        L_0x0299:
            X.00H r1 = r1.A0I
            java.lang.Object r1 = r1.get()
            X.A2R r1 = (X.A2R) r1
            X.APP r6 = r1.A04
            goto L_0x00e3
        L_0x02a5:
            android.view.ViewGroup r2 = r0.A02
            r1 = 14
            X.C1420978d.A00(r2, r0, r1)
            goto L_0x00b5
        L_0x02ae:
            android.content.Context r13 = r0.A14()
            X.5lL r4 = r0.A0a
            com.whatsapp.search.SearchGridLayoutManager r5 = new com.whatsapp.search.SearchGridLayoutManager
            r5.<init>(r13, r4)
            androidx.recyclerview.widget.RecyclerView r4 = r0.A05
            r4.A0R = r9
            r4.setLayoutManager(r5)
            androidx.recyclerview.widget.RecyclerView r5 = r0.A05
            X.5lL r4 = r0.A0a
            r5.setAdapter(r4)
            androidx.recyclerview.widget.RecyclerView r6 = r0.A05
            X.7Ae r5 = r0.A1F
            java.util.List r4 = r6.A0K
            if (r4 != 0) goto L_0x02d5
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            r6.A0K = r4
        L_0x02d5:
            r4.add(r5)
            androidx.recyclerview.widget.RecyclerView r7 = r0.A05
            X.0vb r6 = r0.A0R
            android.content.res.Resources r5 = X.AnonymousClass3MZ.A09(r0)
            r4 = 2131168539(0x7f070d1b, float:1.7951383E38)
            int r5 = r5.getDimensionPixelSize(r4)
            X.28M r4 = new X.28M
            r4.<init>(r6, r5)
            r7.A0r(r4)
            androidx.recyclerview.widget.RecyclerView r7 = r0.A05
            X.5lL r6 = r0.A0a
            X.ALr r5 = new X.ALr
            r5.<init>(r0, r9)
            X.BM2 r4 = new X.BM2
            r4.<init>(r13, r7, r5, r6)
            r7.A0r(r4)
            androidx.recyclerview.widget.RecyclerView r5 = r0.A05
            r4 = 0
            r5.setItemAnimator(r4)
            X.00H r4 = r0.A0y
            java.lang.Object r4 = r4.get()
            X.1rX r4 = (X.C38581rX) r4
            boolean r4 = r4.A03()
            if (r4 == 0) goto L_0x0329
            X.00H r4 = r0.A0x
            java.lang.Object r4 = r4.get()
            X.6nA r4 = (X.AnonymousClass6nA) r4
            X.1DT r6 = r4.A00()
            X.1q9 r5 = r0.A1G()
            r4 = 28
            X.AnonymousClass7AR.A01(r5, r6, r0, r4)
        L_0x0329:
            X.1om r5 = r0.A0B
            X.7Ei r4 = new X.7Ei
            r4.<init>(r0, r9)
            X.1px r8 = r5.A00(r13, r4)
            android.content.Context r5 = r0.A1n()
            X.11P r9 = r0.A0P
            X.1KB r6 = r0.A0F
            X.10I r12 = r0.A0i
            X.1Co r10 = r0.A0T
            X.1Nb r11 = r0.A0e
            X.1Nd r7 = r0.A0L
            X.1py r4 = new X.1py
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            X.1ok r12 = r0.A0C
            X.1GP r14 = r0.A0I
            r17 = r3
            r15 = r4
            r16 = r8
            r18 = r3
            X.1q2 r4 = r12.A01(r13, r14, r15, r16, r17, r18)
            r0.A1E = r4
            androidx.recyclerview.widget.RecyclerView r4 = r0.A05
            r4.setOnCreateContextMenuListener(r0)
            android.view.ViewGroup r5 = r0.A02
            r4 = 2131436270(0x7f0b22ee, float:1.8494406E38)
            android.view.View r8 = r5.findViewById(r4)
            androidx.appcompat.widget.Toolbar r8 = (androidx.appcompat.widget.Toolbar) r8
            r0.A03 = r8
            X.0vb r7 = r0.A0R
            r6 = 2131231675(0x7f0803bb, float:1.8079438E38)
            r5 = 2130971091(0x7f0409d3, float:1.755091E38)
            r4 = 2131102420(0x7f060ad4, float:1.7817277E38)
            android.graphics.drawable.Drawable r5 = X.AnonymousClass4aX.A03(r13, r5, r4, r6)
            X.3cP r4 = new X.3cP
            r4.<init>(r5, r7)
            r8.setNavigationIcon((android.graphics.drawable.Drawable) r4)
            androidx.appcompat.widget.Toolbar r5 = r0.A03
            r4 = 2131898718(0x7f12315e, float:1.9432362E38)
            r5.setNavigationContentDescription((int) r4)
            androidx.appcompat.widget.Toolbar r6 = r0.A03
            r5 = 48
            X.AFS r4 = new X.AFS
            r4.<init>(r0, r5)
            r6.setNavigationOnClickListener(r4)
            androidx.appcompat.widget.Toolbar r6 = r0.A03
            android.content.res.Resources r5 = X.AnonymousClass3MZ.A09(r0)
            r4 = 2131168550(0x7f070d26, float:1.7951405E38)
            int r4 = r5.getDimensionPixelSize(r4)
            r6.setContentInsetStartWithNavigation(r4)
            androidx.appcompat.widget.Toolbar r5 = r0.A03
            r4 = 2131434904(0x7f0b1d98, float:1.8491635E38)
            android.view.View r7 = r5.findViewById(r4)
            com.whatsapp.search.views.TokenizedSearchInput r7 = (com.whatsapp.search.views.TokenizedSearchInput) r7
            r0.A0d = r7
            X.5jU r8 = r0.A0b
            r7.A0F = r8
            X.1Dg r4 = r8.A0g
            X.C108965cb.A13(r0, r4, r7, r1)
            X.1DS r5 = r8.A0X
            r4 = 14
            X.C108965cb.A13(r0, r5, r7, r4)
            X.1DS r5 = r8.A0W
            r4 = 15
            X.C108965cb.A13(r0, r5, r7, r4)
            X.1DT r5 = r8.A0k
            r4 = 16
            X.C108965cb.A13(r0, r5, r7, r4)
            X.1DS r6 = r8.A0Y
            r5 = 12
            X.7AP r4 = new X.7AP
            r4.<init>(r7, r5)
            r6.A0A(r0, r4)
            X.1DS r5 = r8.A0V
            X.7AP r4 = new X.7AP
            r4.<init>(r7, r1)
            r5.A0A(r0, r4)
            X.1Dg r4 = r8.A0c
            r1 = 17
            X.C108965cb.A13(r0, r4, r7, r1)
            X.1Dg r4 = r8.A0b
            r1 = 18
            X.C108965cb.A13(r0, r4, r7, r1)
            r7.A0L()
            X.5jU r1 = r0.A0b
            X.1rX r6 = r1.A10
            X.0ve r4 = r6.A01
            X.0vf r5 = X.C18040vf.A01
            r1 = 8294(0x2066, float:1.1622E-41)
            boolean r1 = X.C18020vd.A05(r5, r4, r1)
            if (r1 == 0) goto L_0x0410
            boolean r4 = r6.A01()
            r1 = 1
            if (r4 != 0) goto L_0x0411
        L_0x0410:
            r1 = 0
        L_0x0411:
            if (r1 == 0) goto L_0x0429
            com.whatsapp.search.views.TokenizedSearchInput r6 = r0.A0d
            com.whatsapp.WaImageButton r1 = r6.A04
            if (r1 != 0) goto L_0x0429
            r1 = 2131434905(0x7f0b1d99, float:1.8491637E38)
            android.view.View r4 = X.C72453Mb.A0S(r6, r1)
            com.whatsapp.WaImageButton r4 = (com.whatsapp.WaImageButton) r4
            r6.A04 = r4
            android.view.View$OnClickListener r1 = r6.A0U
            r4.setOnClickListener(r1)
        L_0x0429:
            boolean r1 = A0B(r0)
            if (r1 == 0) goto L_0x0434
            com.whatsapp.search.views.TokenizedSearchInput r1 = r0.A0d
            r1.A0M()
        L_0x0434:
            r6 = 2131103368(0x7f060e88, float:1.78192E38)
            androidx.appcompat.widget.Toolbar r4 = r0.A03
            android.content.Context r1 = r0.A14()
            X.AnonymousClass3MX.A1A(r1, r4, r6)
            r1 = r44
            r0.A01(r1)
            androidx.appcompat.widget.Toolbar r4 = r0.A03
            X.1Xy r1 = X.C27871Xy.GONE
            X.C28261Zr.A01(r4, r1)
            android.content.Context r4 = r0.A14()
            X.4CM r1 = X.AnonymousClass4CM.NORMAL
            X.4S0 r7 = new X.4S0
            r7.<init>(r4, r1)
            boolean r1 = X.C108985cd.A1X(r0)
            android.content.Context r8 = r0.A14()
            androidx.appcompat.widget.Toolbar r6 = r0.A03
            if (r1 == 0) goto L_0x05c6
            X.C18070vi.A0d(r6, r3)
            android.content.res.Resources r4 = r8.getResources()
            r1 = 2131169545(0x7f071109, float:1.7953423E38)
            int r4 = r4.getDimensionPixelSize(r1)
            int r1 = X.AnonymousClass3MZ.A01(r8, r1)
            X.C109005cf.A0N(r8, r6, r4, r1, r2)
            androidx.appcompat.widget.Toolbar r6 = r0.A03
            android.content.Context r4 = r0.A14()
            r1 = 2131232897(0x7f080881, float:1.8081916E38)
            X.AnonymousClass3MY.A0v(r4, r6, r1)
            com.whatsapp.search.views.TokenizedSearchInput r1 = r0.A0d
            r1.setIsMetaAiSearchEnabled(r3)
        L_0x0489:
            androidx.appcompat.widget.Toolbar r1 = r0.A03
            android.graphics.drawable.Drawable r1 = r1.getNavigationIcon()
            android.graphics.drawable.Drawable r3 = r7.A00(r1)
            androidx.appcompat.widget.Toolbar r1 = r0.A03
            r1.setNavigationIcon((android.graphics.drawable.Drawable) r3)
            androidx.appcompat.widget.Toolbar r1 = r0.A03
            r1.setContentInsetStartWithNavigation(r2)
            android.view.View r3 = r0.A01
            r1 = 8
            r3.setVisibility(r1)
            android.view.ViewGroup r3 = r0.A02
            r1 = 2131435521(0x7f0b2001, float:1.8492887E38)
            X.AnonymousClass3MY.A1A(r3, r1, r2)
            android.content.Context r3 = r0.A14()
            r1 = 2131103154(0x7f060db2, float:1.7818766E38)
            android.content.res.ColorStateList r3 = X.C19740yt.A03(r3, r1)
            com.whatsapp.search.views.TokenizedSearchInput r1 = r0.A0d
            com.whatsapp.WaImageView r1 = r1.A0Z
            r1.setImageTintList(r3)
            com.whatsapp.search.views.TokenizedSearchInput r1 = r0.A0d
            r1.setGridToggleTintListOnInflate(r3)
            boolean r1 = X.C108985cd.A1X(r0)
            if (r1 == 0) goto L_0x0584
            android.view.ViewGroup r3 = r0.A02
            r1 = 2131432735(0x7f0b151f, float:1.8487236E38)
            android.view.View r1 = X.AnonymousClass1HF.A06(r3, r1)
            com.airbnb.lottie.LottieAnimationView r1 = (com.airbnb.lottie.LottieAnimationView) r1
            r0.A06 = r1
            X.00H r1 = r0.A15
            java.lang.Object r1 = r1.get()
            X.1rl r1 = (X.C38711rl) r1
            java.lang.Integer r8 = r1.A01()
            com.airbnb.lottie.LottieAnimationView r3 = r0.A06
            int r1 = r8.intValue()
            switch(r1) {
                case 0: goto L_0x05bc;
                case 1: goto L_0x05c1;
                default: goto L_0x04eb;
            }
        L_0x04eb:
            r1 = 2131232271(0x7f08060f, float:1.8080647E38)
        L_0x04ee:
            r3.setImageResource(r1)
            com.airbnb.lottie.LottieAnimationView r1 = r0.A06
            android.view.ViewGroup$MarginLayoutParams r6 = X.AnonymousClass3MW.A0B(r1)
            android.content.Context r4 = r0.A14()
            java.lang.Integer r3 = X.AnonymousClass00R.A01
            r1 = 2131169465(0x7f0710b9, float:1.795326E38)
            if (r8 != r3) goto L_0x0505
            r1 = 2131169467(0x7f0710bb, float:1.7953265E38)
        L_0x0505:
            int r1 = X.AnonymousClass3MZ.A01(r4, r1)
            r6.height = r1
            r6.width = r1
            android.content.Context r1 = r0.A14()
            if (r8 != r3) goto L_0x05b9
            android.content.res.Resources r3 = r1.getResources()
            r1 = 2131169540(0x7f071104, float:1.7953413E38)
            int r1 = r3.getDimensionPixelSize(r1)
        L_0x051e:
            r6.bottomMargin = r1
            com.airbnb.lottie.LottieAnimationView r1 = r0.A06
            r1.setLayoutParams(r6)
            com.airbnb.lottie.LottieAnimationView r7 = r0.A06
            android.content.Context r6 = r0.A14()
            java.lang.Integer r4 = X.AnonymousClass00R.A00
            if (r8 != r4) goto L_0x05a6
            r6 = 0
        L_0x0530:
            r7.setColorFilter(r6)
            com.airbnb.lottie.LottieAnimationView r1 = r0.A06
            r1.setVisibility(r2)
            X.00H r1 = r0.A0y
            java.lang.Object r1 = r1.get()
            X.1rX r1 = (X.C38581rX) r1
            X.0ve r3 = r1.A01
            r2 = 8600(0x2198, float:1.2051E-41)
            X.0vf r1 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r1, r3, r2)
            if (r1 == 0) goto L_0x0584
            boolean r1 = X.C39761tb.A03()
            if (r1 != 0) goto L_0x0584
            X.00H r1 = r0.A0o
            X.1UD r1 = X.AnonymousClass3MW.A0X(r1)
            X.0ve r2 = r1.A00
            r1 = 12455(0x30a7, float:1.7453E-41)
            boolean r1 = X.C18020vd.A05(r5, r2, r1)
            if (r1 == 0) goto L_0x0584
            X.00H r1 = r0.A15
            java.lang.Object r1 = r1.get()
            X.1rl r1 = (X.C38711rl) r1
            java.lang.Integer r1 = r1.A01()
            if (r1 != r4) goto L_0x0584
            X.118 r1 = r0.A0Q
            android.content.Context r2 = r1.A00
            r1 = 2132017198(0x7f14002e, float:1.9672668E38)
            X.1tg r3 = X.C39771tc.A06(r2, r1)
            r2 = 2
            X.7Aw r1 = new X.7Aw
            r1.<init>(r0, r2)
            r3.A02(r1)
        L_0x0584:
            android.view.ViewGroup r2 = r0.A02
            r1 = 2131434180(0x7f0b1ac4, float:1.8490167E38)
            android.view.View r1 = X.AnonymousClass1HF.A06(r2, r1)
            com.whatsapp.search.views.ProgressView r1 = (com.whatsapp.search.views.ProgressView) r1
            r0.A0c = r1
            androidx.recyclerview.widget.RecyclerView r2 = r0.A05
            X.1tW r1 = r0.A1K
            r2.A0t(r1)
            X.1HS r1 = r0.A0H
            boolean r1 = r1.A01()
            if (r1 != 0) goto L_0x05a3
            X.C109005cf.A0T(r0)
        L_0x05a3:
            android.view.ViewGroup r0 = r0.A02
            return r0
        L_0x05a6:
            r3 = 2130971978(0x7f040d4a, float:1.755271E38)
            r1 = 2131103152(0x7f060db0, float:1.7818762E38)
            int r3 = X.AnonymousClass3Ma.A00(r6, r3, r1)
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuffColorFilter r6 = new android.graphics.PorterDuffColorFilter
            r6.<init>(r3, r1)
            goto L_0x0530
        L_0x05b9:
            r1 = 0
            goto L_0x051e
        L_0x05bc:
            r1 = 2131232644(0x7f080784, float:1.8081403E38)
            goto L_0x04ee
        L_0x05c1:
            r1 = 2131233363(0x7f080a53, float:1.8082861E38)
            goto L_0x04ee
        L_0x05c6:
            X.AnonymousClass6YG.A00(r8, r6)
            androidx.appcompat.widget.Toolbar r3 = r0.A03
            X.1Xq r1 = r7.A01()
            r3.setBackground(r1)
            com.whatsapp.search.views.TokenizedSearchInput r1 = r0.A0d
            r1.setIsMetaAiSearchEnabled(r2)
            goto L_0x0489
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.search.SearchFragment.A1q(android.os.Bundle, android.view.LayoutInflater, android.view.ViewGroup):android.view.View");
    }

    public void A1r() {
        C17900vP.A0Y(this, "SearchFragment/onDestroy ", AnonymousClass000.A10());
        if (this.A0j) {
            this.A0W.A03((AnonymousClass1BI) null, C17890vO.A0U(this));
        }
        C17880vN.A0V(this.A0t).unregisterObserver(this.A1O);
        this.A0J.unregisterObserver(this.A1N);
        C17880vN.A0V(this.A0u).unregisterObserver(this.A1M);
        this.A0U.unregisterObserver(this.A1P);
        C17880vN.A0V(this.A0q).unregisterObserver(this.A1L);
        C17880vN.A0V(this.A0v).unregisterObserver(this.A1Q);
        this.A0k.unregisterObserver(this.A1R);
        super.A1r();
    }

    public void A1s() {
        C17900vP.A0Y(this, "SearchFragment/onDestroyView ", AnonymousClass000.A10());
        Toolbar toolbar = this.A03;
        if (toolbar != null) {
            C28261Zr.A01(toolbar, this.A1H);
        }
        Runnable runnable = this.A1C;
        if (runnable != null) {
            this.A0i.CEz(runnable);
        }
        ValueAnimator valueAnimator = this.A00;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        A08(this);
        TokenizedSearchInput tokenizedSearchInput = this.A0d;
        FinalBackspaceAwareEntry finalBackspaceAwareEntry = tokenizedSearchInput.A0b;
        AnonymousClass4M1 r1 = tokenizedSearchInput.A0a;
        List list = finalBackspaceAwareEntry.A00;
        if (list != null) {
            list.remove(r1);
        }
        finalBackspaceAwareEntry.setOnFocusChangeListener((View.OnFocusChangeListener) null);
        finalBackspaceAwareEntry.setOnEditorActionListener((TextView.OnEditorActionListener) null);
        finalBackspaceAwareEntry.setOnKeyListener((View.OnKeyListener) null);
        RecyclerView recyclerView = this.A05;
        C142627Ae r12 = this.A1F;
        List list2 = recyclerView.A0K;
        if (list2 != null) {
            list2.remove(r12);
        }
        this.A05.A0u(this.A1K);
        this.A0L.A06(this.A1F);
        this.A1D.A02();
        this.A1G.A0A();
        this.A02 = null;
        A00(0);
        super.A1s();
    }

    public void A1t() {
        C22801Dg r0;
        C17900vP.A0Y(this, "SearchFragment/onPause ", AnonymousClass000.A10());
        C111295jU r2 = this.A0b;
        C22851Dl r1 = this.A04;
        if (C111295jU.A0G(r2)) {
            r0 = r2.A0a;
        } else {
            r0 = r2.A0h;
        }
        r0.A0D(r1);
        super.A1t();
    }

    public void A1u() {
        C22801Dg r1;
        C17900vP.A0Y(this, "SearchFragment/onResume ", AnonymousClass000.A10());
        C111295jU r12 = this.A0b;
        if (C111295jU.A0G(r12)) {
            r1 = r12.A0a;
        } else {
            r1 = r12.A0h;
        }
        r1.A0A(this, this.A04);
        super.A1u();
    }

    public void A1v() {
        C17900vP.A0Y(this, "SearchFragment/onStart ", AnonymousClass000.A10());
        C112355lL r3 = this.A0a;
        int i = 0;
        while (true) {
            C147387Sy r1 = r3.A0S;
            if (i < r1.size()) {
                if (C108955ca.A0o(r1, i) instanceof C441322g) {
                    r3.A0G(i);
                }
                i++;
            } else {
                super.A1v();
                return;
            }
        }
    }

    public void A1w(int i, int i2, Intent intent) {
        super.A1w(i, i2, intent);
        C37731q2 r1 = this.A1E;
        if (r1.A02 != null && i == r1.A06) {
            r1.A01();
        } else if (i == 158 && A0B(this) && ((C219217x) this.A1B.get()).A09()) {
            C47192Hl r0 = new C47192Hl();
            AnonymousClass3MZ.A1T(r0, 18);
            AnonymousClass4XB.A00(r0, (AnonymousClass4XB) this.A13.get(), 76);
            A06(this);
        }
    }

    public void A1x(Context context) {
        super.A1x(context);
        this.A1D = this.A0K.A06(context.getApplicationContext(), "search-fragment");
    }

    public void A1z(Bundle bundle) {
        C17900vP.A0Y(this, "SearchFragment/onCreate ", AnonymousClass000.A10());
        Bundle bundle2 = bundle;
        super.A1z(bundle2);
        this.A1I = AnonymousClass000.A1W(bundle2);
        C23331Fp r4 = (C23331Fp) A1B();
        if (r4 != null && !r4.isFinishing()) {
            AnonymousClass1Q9 r3 = this.A0V;
            if (bundle != null) {
                r3.A00 = bundle2.getLong("ephemeral_session_start", -1);
            }
            this.A0W.A02((AnonymousClass1BI) null, C17890vO.A0U(this));
            HomeActivity homeActivity = (HomeActivity) r4;
            C111295jU r0 = (C111295jU) new C24071It(new AnonymousClass27t(homeActivity, homeActivity.A0Z, this.A1D), homeActivity).A00(C111295jU.class);
            this.A0b = r0;
            AnonymousClass7AR.A00(this, r0.A0d, 29);
            AnonymousClass7AR.A00(this, this.A0b.A0Z, 16);
            AnonymousClass7AR.A00(this, this.A0b.A0e, 20);
            C17880vN.A0V(this.A0t).registerObserver(this.A1O);
            this.A0J.registerObserver(this.A1N);
            C17880vN.A0V(this.A0u).registerObserver(this.A1M);
            this.A0U.registerObserver(this.A1P);
            C17880vN.A0V(this.A0q).registerObserver(this.A1L);
            C17880vN.A0V(this.A0v).registerObserver(this.A1Q);
            this.A0k.registerObserver(this.A1R);
            A00(32);
            AnonymousClass7AR.A00(this, this.A0b.A0U, 21);
            AnonymousClass7AR.A00(this, this.A0b.A0f, 22);
            AnonymousClass7AR.A00(this, this.A0b.A1O, 23);
            AnonymousClass7AR.A00(this, this.A0b.A1K, 24);
            AnonymousClass7AR.A00(this, this.A0b.A1E, 25);
            AnonymousClass7AR.A00(this, this.A0b.A1G, 26);
            AnonymousClass7AR.A00(this, this.A0b.A1F, 27);
            AnonymousClass7AR.A00(this, this.A0b.A1J, 30);
            AnonymousClass7AR.A00(this, this.A0b.A0X, 31);
            AnonymousClass7AR.A00(this, this.A0b.A0g, 32);
            AnonymousClass7AR.A00(this, this.A0b.A0W, 9);
            AnonymousClass7AR.A00(this, this.A0b.A0Y, 10);
            AnonymousClass7AR.A00(this, this.A0b.A0V, 11);
            AnonymousClass7AR.A00(this, this.A0b.A1H, 12);
            AnonymousClass7AR.A00(this, this.A0b.A1L, 13);
            AnonymousClass7AR.A00(this, this.A0b.A1N, 14);
            AnonymousClass7AR.A00(this, this.A0b.A1P, 15);
            AnonymousClass7AR.A00(this, this.A0b.A1D, 17);
            AnonymousClass7AR.A00(this, this.A0b.A1M, 18);
            C111295jU r7 = this.A0b;
            if (r7.A02 == null && C20135A8w.A08(r7.A0y)) {
                AnonymousClass6ZJ r1 = r7.A0p;
                C22801Dg r37 = r7.A0g;
                AnonymousClass1DS r16 = r7.A0X;
                AnonymousClass1DS r15 = r7.A0W;
                AnonymousClass1DS r14 = r7.A0Y;
                AnonymousClass7SC r9 = new AnonymousClass7SC(r7, 1);
                AnonymousClass7S6 r6 = new AnonymousClass7S6(r7, 1);
                AnonymousClass7S4 r5 = new AnonymousClass7S4(r7, 18);
                AnonymousClass1DT r13 = r7.A0j;
                AnonymousClass1DT r12 = r7.A12.A03;
                C22801Dg r42 = r7.A0h;
                AnonymousClass1DT r11 = r7.A13.A02;
                AnonymousClass1K2 r02 = r1.A00;
                AnonymousClass10E r17 = r02.A01;
                AnonymousClass11P A6O = AnonymousClass10E.A6O(r17);
                C18030ve A8r = AnonymousClass10E.A8r(r17);
                AnonymousClass10I AL1 = AnonymousClass10E.AL1(r17);
                C18000vb A6Q = AnonymousClass10E.A6Q(r17);
                AnonymousClass1KB A122 = AnonymousClass10E.A12(r17);
                AnonymousClass10G r18 = r17.A00;
                AnonymousClass00H A002 = C000200d.A00(r18.A0k);
                AnonymousClass00H A003 = C000200d.A00(r18.A0i);
                AnonymousClass1K1 r03 = r02.A00;
                AnonymousClass1DT r19 = r13;
                AnonymousClass1DT r20 = r12;
                C22801Dg r21 = r42;
                AnonymousClass1DS r172 = r15;
                AnonymousClass1DS r182 = r14;
                C22801Dg r152 = r37;
                C20135A8w a8w = new C20135A8w(r152, r16, r172, r182, r19, r20, r21, r11, (C131326ku) r03.A3g.get(), A122, (C133666pH) r18.A4J.get(), A6O, A6Q, A8r, (CW0) r18.A31.get(), AL1, A002, A003, r03.A0N, r5, r6, r9);
                r7.A02 = a8w;
                AnonymousClass7AP.A01(a8w.A07, r42, r7, 5);
            }
            ((AnonymousClass73Z) this.A0m.get()).A00 = new AnonymousClass7D5(this, 3);
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.1LU, java.lang.Object] */
    public void A26(AnonymousClass1BI r5) {
        Integer valueOf;
        C446324e A012;
        if (C22971Dz.A0d(r5)) {
            this.A0i.CGF(new C146527Pl(this, r5, 13));
        }
        A08(this);
        Intent A1x = new Object().A1x(A14(), r5, 0);
        if (C42701yb.A01(r5) && (r5 instanceof UserJid) && (A012 = ((C25741Pl) this.A0p.get()).A01((UserJid) r5)) != null && A012.A0I) {
            A1x.putExtra("bot_metrics_entrypoint", "AISEARCH_TYPE_AHEAD_RESULT_CHATLIST");
            A1x.putExtra("bot_metrics_destination_id", C17890vO.A0Q());
        }
        if (((C31191fA) this.A0s.get()).A0M(r5)) {
            A1x.putExtra("chatlockEntryPoint", 7);
        }
        ((C31161f7) this.A14.get()).A02(r5);
        if (C20045A4o.A01(this.A0X)) {
            A1x.putExtra("args_conversation_screen_entry_point", 6).putExtra("args_chat_search_result_type", this.A0b.A0W(r5)).putExtra("args_chat_search_type", this.A0b.A0U());
            AnonymousClass77Z A0a2 = this.A0b.A0a();
            if (!(A0a2 == null || (valueOf = Integer.valueOf(A0a2.A01)) == null)) {
                A1x.putExtra("args_chat_search_smart_filter_id", valueOf);
            }
        }
        C60442o2.A00(A1x, this.A0P, C108955ca.A0x(this));
        AnonymousClass1FL A1B2 = A1B();
        if (A1B2 instanceof C23181Fa) {
            ((C23181Fa) A1B2).BhJ(A1x);
        } else {
            A1k(A1x);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!this.A0H.A01()) {
            C109005cf.A0T(this);
        }
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        AnonymousClass1BI r2 = this.A0Y;
        if (r2 != null) {
            this.A1E.A02(contextMenu, r2, true, true);
        }
    }
}
