package androidx.fragment.app;

import X.AnonymousClass019;
import X.AnonymousClass02j;
import X.AnonymousClass02n;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass10I;
import X.AnonymousClass118;
import X.AnonymousClass11C;
import X.AnonymousClass11P;
import X.AnonymousClass11Q;
import X.AnonymousClass11S;
import X.AnonymousClass126;
import X.AnonymousClass12L;
import X.AnonymousClass18K;
import X.AnonymousClass1Bd;
import X.AnonymousClass1CJ;
import X.AnonymousClass1Cd;
import X.AnonymousClass1DC;
import X.AnonymousClass1DS;
import X.AnonymousClass1DT;
import X.AnonymousClass1F9;
import X.AnonymousClass1FC;
import X.AnonymousClass1FD;
import X.AnonymousClass1FE;
import X.AnonymousClass1FL;
import X.AnonymousClass1GA;
import X.AnonymousClass1GB;
import X.AnonymousClass1GO;
import X.AnonymousClass1GP;
import X.AnonymousClass1K1;
import X.AnonymousClass1KB;
import X.AnonymousClass1KW;
import X.AnonymousClass1L4;
import X.AnonymousClass1L9;
import X.AnonymousClass1M9;
import X.AnonymousClass1MB;
import X.AnonymousClass1MC;
import X.AnonymousClass1MZ;
import X.AnonymousClass1NH;
import X.AnonymousClass1NN;
import X.AnonymousClass1Nb;
import X.AnonymousClass1PU;
import X.AnonymousClass1PW;
import X.AnonymousClass1QB;
import X.AnonymousClass1QO;
import X.AnonymousClass1R5;
import X.AnonymousClass1RK;
import X.AnonymousClass1VD;
import X.AnonymousClass1VT;
import X.AnonymousClass1XN;
import X.AnonymousClass1ZG;
import X.AnonymousClass1ZI;
import X.AnonymousClass27F;
import X.AnonymousClass27i;
import X.C000200d;
import X.C005302h;
import X.C1406772n;
import X.C18000vb;
import X.C18030ve;
import X.C18070vi;
import X.C18140vp;
import X.C18600wl;
import X.C19830z4;
import X.C19880zA;
import X.C199610h;
import X.C21466AkX;
import X.C21471Akc;
import X.C22621Co;
import X.C23381Fv;
import X.C23391Fw;
import X.C23401Fx;
import X.C23631Ha;
import X.C23651Hc;
import X.C24051Ir;
import X.C24081Iu;
import X.C24671Lf;
import X.C24791Lr;
import X.C24901Mc;
import X.C24921Me;
import X.C25161Nd;
import X.C25181Nf;
import X.C25491Ok;
import X.C26144Ct7;
import X.C26550D3n;
import X.C26587D5b;
import X.C26911Ty;
import X.C27201Vd;
import X.C27231Vg;
import X.C29781cr;
import X.C30251dd;
import X.C32531hL;
import X.C32791hl;
import X.C33451iq;
import X.C34051jq;
import X.C34061jr;
import X.C34281kE;
import X.C34291kF;
import X.C34391kP;
import X.C34591kk;
import X.C34771l3;
import X.C35841mt;
import X.C36241nZ;
import X.C36261nb;
import X.C36271nc;
import X.C36451nu;
import X.C36461nv;
import X.C36491nz;
import X.C36501o0;
import X.C36511o1;
import X.C36521o2;
import X.C36531o3;
import X.C36711oL;
import X.C36731oN;
import X.C36741oO;
import X.C36751oP;
import X.C36761oQ;
import X.C36781oS;
import X.C36801oU;
import X.C36841oY;
import X.C36861oa;
import X.C36871ob;
import X.C36881oc;
import X.C36891od;
import X.C36901oe;
import X.C36911of;
import X.C36921og;
import X.C36931oh;
import X.C36951oj;
import X.C36961ok;
import X.C36971ol;
import X.C36981om;
import X.C36991on;
import X.C37281pG;
import X.C37311pJ;
import X.C37331pL;
import X.C37801q9;
import X.C39461t7;
import X.C449025f;
import X.C451627m;
import X.C451727n;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.suggestions.SuggestionsEngine;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class Fragment implements AnonymousClass1FC, AnonymousClass1F9, AnonymousClass1FD, AnonymousClass1FE, AnonymousClass019, ComponentCallbacks, View.OnCreateContextMenuListener {
    public static final Object A0r = new Object();
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04 = -1;
    public int A05;
    public Bundle A06;
    public Bundle A07;
    public Bundle A08;
    public SparseArray A09;
    public LayoutInflater A0A;
    public View A0B;
    public ViewGroup A0C;
    public C35841mt A0D;
    public Fragment A0E;
    public Fragment A0F;
    public AnonymousClass1GO A0G;
    public AnonymousClass1GP A0H = new AnonymousClass1GP();
    public AnonymousClass1GP A0I;
    public C37801q9 A0J;
    public C23401Fx A0K = C23401Fx.RESUMED;
    public C23391Fw A0L;
    public AnonymousClass1DT A0M = new AnonymousClass1DS();
    public C24051Ir A0N;
    public AnonymousClass1GA A0O;
    public Boolean A0P = null;
    public Boolean A0Q;
    public Runnable A0R = new C449025f(this, 2);
    public String A0S;
    public String A0T;
    public String A0U = null;
    public String A0V = UUID.randomUUID().toString();
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h = true;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public boolean A0l;
    public boolean A0m;
    public boolean A0n = true;
    public final ArrayList A0o = new ArrayList();
    public final AtomicInteger A0p = new AtomicInteger();
    public final C34051jq A0q = new C34061jr(this);

    public Animation A18(int i, boolean z) {
        return null;
    }

    public void A1K() {
        this.A0X = true;
    }

    @Deprecated
    public void A1O(int i, String[] strArr, int[] iArr) {
    }

    public void A1Q(Bundle bundle) {
        this.A0X = true;
    }

    public void A1Y(boolean z) {
    }

    public void A1j() {
        this.A0X = true;
    }

    public void A1k(Intent intent) {
        AnonymousClass1GO r1 = this.A0G;
        if (r1 != null) {
            C18070vi.A0d(intent, 1);
            r1.A01.startActivity(intent, (Bundle) null);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" not attached to Activity");
        throw new IllegalStateException(sb.toString());
    }

    @Deprecated
    public void A1p(Activity activity) {
        this.A0X = true;
    }

    public void A1r() {
        this.A0X = true;
    }

    public void A1s() {
        this.A0X = true;
    }

    public void A1t() {
        this.A0X = true;
    }

    public void A1u() {
        this.A0X = true;
    }

    public void A1v() {
        this.A0X = true;
    }

    @Deprecated
    public void A1w(int i, int i2, Intent intent) {
        if (AnonymousClass1GP.A0G(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(this);
            sb.append(" received the following in onActivityResult(): requestCode: ");
            sb.append(i);
            sb.append(" resultCode: ");
            sb.append(i2);
            sb.append(" data: ");
            sb.append(intent);
            Log.v("FragmentManager", sb.toString());
        }
    }

    public void A1x(Context context) {
        this.A0X = true;
        AnonymousClass1GO r0 = this.A0G;
        if (r0 != null) {
            Activity activity = r0.A00;
            this.A0X = false;
            A1p(activity);
        }
    }

    @Deprecated
    public void A1y(Bundle bundle) {
        this.A0X = true;
    }

    public void A1z(Bundle bundle) {
        this.A0X = true;
        A1L();
        AnonymousClass1GP r2 = this.A0H;
        if (r2.A00 < 1) {
            r2.A0J = false;
            r2.A0K = false;
            r2.A0A.A01 = false;
            AnonymousClass1GP.A0B(r2, 1);
        }
    }

    public void A20(Bundle bundle) {
    }

    public void A21(Bundle bundle, View view) {
    }

    @Deprecated
    public void A22(Menu menu, MenuInflater menuInflater) {
    }

    @Deprecated
    public boolean A24(MenuItem menuItem) {
        return false;
    }

    public final AnonymousClass02n CDw(AnonymousClass02j r8, C005302h r9) {
        C26587D5b d5b = new C26587D5b(this, 0);
        if (this.A04 <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            AnonymousClass27i r1 = new AnonymousClass27i(r8, r9, d5b, this, atomicReference);
            if (this.A04 >= 0) {
                r1.A00();
            } else {
                this.A0o.add(r1);
            }
            return new AnonymousClass27F(r9, this, atomicReference);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
        throw new IllegalStateException(sb.toString());
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.A0X = true;
    }

    public void onLowMemory() {
        this.A0X = true;
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i) {
        A1P(intent, i, (Bundle) null);
    }

    private int A0J() {
        Fragment fragment;
        C23401Fx r1 = this.A0K;
        if (r1 == C23401Fx.INITIALIZED || (fragment = this.A0E) == null) {
            return r1.ordinal();
        }
        return Math.min(r1.ordinal(), fragment.A0J());
    }

    public static C35841mt A0K(Fragment fragment) {
        C35841mt r0 = fragment.A0D;
        if (r0 != null) {
            return r0;
        }
        C35841mt r02 = new C35841mt();
        fragment.A0D = r02;
        return r02;
    }

    public static Fragment A0L(Fragment fragment, boolean z) {
        String str;
        if (z) {
            C34281kE r0 = C34281kE.A01;
            C451627m r3 = new C451627m(fragment);
            C34281kE.A03(r3);
            C34291kF A002 = C34281kE.A00(fragment);
            if (A002.A01.contains(C34391kP.DETECT_TARGET_FRAGMENT_USAGE) && C34281kE.A04(A002, fragment.getClass(), r3.getClass())) {
                C34281kE.A02(A002, r3);
            }
        }
        Fragment fragment2 = fragment.A0F;
        if (fragment2 != null) {
            return fragment2;
        }
        AnonymousClass1GP r02 = fragment.A0I;
        if (r02 == null || (str = fragment.A0U) == null) {
            return null;
        }
        return r02.A0U.A00(str);
    }

    private void A0M() {
        this.A0L = new C23391Fw(this);
        this.A0O = new AnonymousClass1GA(this);
        this.A0N = null;
        ArrayList arrayList = this.A0o;
        C34051jq r1 = this.A0q;
        if (arrayList.contains(r1)) {
            return;
        }
        if (this.A04 >= 0) {
            r1.A00();
        } else {
            arrayList.add(r1);
        }
    }

    public static void A0N(C19880zA r1, AnonymousClass1K1 r2, C36241nZ r3, AnonymousClass10E r4, ConversationsFragment conversationsFragment) {
        conversationsFragment.A37 = C000200d.A00(r2.A0q);
        conversationsFragment.A3K = C000200d.A00(r2.A4l);
        conversationsFragment.A0i = (C36881oc) r3.A0b.get();
        conversationsFragment.A0z = (C36841oY) r4.A4f.get();
        conversationsFragment.A0Q = r1;
        conversationsFragment.A0j = (C36891od) r3.A0c.get();
        conversationsFragment.A0k = (C36901oe) r3.A0d.get();
        conversationsFragment.A3G = C000200d.A00(r4.A5c);
        conversationsFragment.A2t = C000200d.A00(r4.A1G);
        conversationsFragment.A0X = r1;
        conversationsFragment.A2s = C000200d.A00(r4.A1C);
        conversationsFragment.A2G = (C30251dd) r4.A7X.get();
    }

    public static void A0O(C19880zA r1, AnonymousClass1K1 r2, C36241nZ r3, AnonymousClass10G r4, ConversationsFragment conversationsFragment) {
        conversationsFragment.A0l = (C36911of) r3.A0f.get();
        conversationsFragment.A2F = (C36921og) r4.A1S.get();
        conversationsFragment.A14 = (C36931oh) r2.A3o.get();
        conversationsFragment.A0m = (C36951oj) r3.A0g.get();
        conversationsFragment.A0V = r1;
        conversationsFragment.A3Y = C000200d.A00(r3.A1d);
        conversationsFragment.A0U = r1;
        conversationsFragment.A0n = (C36961ok) r3.A0h.get();
        conversationsFragment.A2n = C000200d.A00(r2.A0E);
        conversationsFragment.A35 = C000200d.A00(r4.A16);
        conversationsFragment.A2D = (C36971ol) r4.A0o.get();
        conversationsFragment.A0h = (C36981om) r2.A1p.get();
        conversationsFragment.A0o = (C36991on) r3.A0i.get();
    }

    public static void A0P(C19880zA r2, AnonymousClass1K1 r3, AnonymousClass10E r4, AnonymousClass10G r5, ConversationsFragment conversationsFragment) {
        Object obj = r4.A5J.get();
        C199610h.A04(obj);
        conversationsFragment.A0R = new C23631Ha(obj);
        conversationsFragment.A0d = r2;
        conversationsFragment.A2L = (C37281pG) r5.A2H.get();
        conversationsFragment.A3Q = C000200d.A00(r4.A8b);
        conversationsFragment.A3R = C000200d.A00(r5.A3r);
        conversationsFragment.A24 = (AnonymousClass1KW) r4.A3d.get();
        conversationsFragment.A1G = (C37311pJ) r3.A4y.get();
        conversationsFragment.A0S = r2;
        conversationsFragment.A2h = (C37331pL) r5.A33.get();
        conversationsFragment.A2q = C000200d.A00(r4.A19);
        conversationsFragment.A2r = C000200d.A00(r4.A1B);
    }

    public static void A0Q(C19880zA r1, AnonymousClass1K1 r2, AnonymousClass10E r3, AnonymousClass10G r4, ConversationsFragment conversationsFragment) {
        conversationsFragment.A2j = C000200d.A00(r3.A0F);
        conversationsFragment.A3D = C000200d.A00(r3.A59);
        conversationsFragment.A3V = C000200d.A00(r4.A4X);
        conversationsFragment.A1I = (C36531o3) r3.A2n.get();
        conversationsFragment.A1x = (AnonymousClass1NN) r3.A2q.get();
        conversationsFragment.A2H = (AnonymousClass1R5) r3.A8A.get();
        conversationsFragment.A2I = (AnonymousClass1QO) r3.A8G.get();
        conversationsFragment.A2Q = (AnonymousClass1VD) r3.A9J.get();
        conversationsFragment.A17 = AnonymousClass10E.A48(r3);
        conversationsFragment.A2y = C000200d.A00(r3.A2A);
        conversationsFragment.A30 = C000200d.A00(r3.A2F);
        conversationsFragment.A3J = C000200d.A00(r2.A4n);
        conversationsFragment.A3X = C000200d.A00(r4.A4a);
        conversationsFragment.A0a = r1;
        conversationsFragment.A11 = AnonymousClass1K1.A08(r2);
    }

    public static void A0R(C19880zA r1, AnonymousClass1K1 r2, AnonymousClass10E r3, AnonymousClass10G r4, ConversationsFragment conversationsFragment) {
        conversationsFragment.A2O = (C36731oN) r4.A56.get();
        conversationsFragment.A32 = C000200d.A00(r3.A2L);
        conversationsFragment.A3P = C000200d.A00(r3.A7s);
        conversationsFragment.A2b = (C36741oO) r4.A1L.get();
        conversationsFragment.A1z = (AnonymousClass1MZ) r3.A4t.get();
        conversationsFragment.A1R = (C36751oP) r4.A37.get();
        conversationsFragment.A3E = C000200d.A00(r3.A5U);
        conversationsFragment.A3H = C000200d.A00(r2.A4W);
        conversationsFragment.A3b = C000200d.A00(r4.A59);
        conversationsFragment.A3d = C000200d.A00(r3.ABj);
        conversationsFragment.A0Z = r1;
        conversationsFragment.A2k = C000200d.A00(r3.A0j);
        conversationsFragment.A1w = (C25181Nf) r3.A2o.get();
        conversationsFragment.A2u = C000200d.A00(r3.A1K);
    }

    public static void A0T(C19880zA r2, C36241nZ r3, AnonymousClass10E r4, AnonymousClass10G r5, ConversationsFragment conversationsFragment) {
        conversationsFragment.A3L = C000200d.A00(r5.A3E);
        conversationsFragment.A2W = new C36761oQ((C18030ve) r3.A2Q.A04.get());
        conversationsFragment.A1c = (C36781oS) r5.A19.get();
        conversationsFragment.A3S = C000200d.A00(r4.A8f);
        conversationsFragment.A2T = (C34771l3) r5.A0E.get();
        conversationsFragment.A0y = (C36801oU) r4.A4c.get();
        conversationsFragment.A3B = C000200d.A00(r4.A4u);
        conversationsFragment.A0T = r2;
        conversationsFragment.A34 = C000200d.A00(r3.A06);
        conversationsFragment.A1n = (AnonymousClass11Q) r4.A2T.get();
        conversationsFragment.A10 = (C36861oa) r4.A4g.get();
        conversationsFragment.A3M = C000200d.A00(r5.A3F);
        conversationsFragment.A36 = C000200d.A00(r5.A17);
    }

    public static void A0U(C19880zA r1, AnonymousClass10E r2, AnonymousClass10G r3, ConversationsFragment conversationsFragment) {
        conversationsFragment.A1A = (C24921Me) r2.ABX.get();
        conversationsFragment.A1t = (C18000vb) r2.ABz.get();
        conversationsFragment.A1y = (AnonymousClass1QB) r2.A4T.get();
        conversationsFragment.A2l = C000200d.A00(r2.A0p);
        conversationsFragment.A3Z = C000200d.A00(r3.A50);
        conversationsFragment.A0c = r1;
        conversationsFragment.A2a = (C27231Vg) r2.A0N.get();
        conversationsFragment.A16 = (AnonymousClass1MC) r2.A21.get();
        conversationsFragment.A19 = (C24671Lf) r2.A2g.get();
        conversationsFragment.A28 = (AnonymousClass126) r2.A4h.get();
        conversationsFragment.A1F = (C36261nb) r3.A2t.get();
        conversationsFragment.A2Y = AnonymousClass10E.AKo(r2);
        conversationsFragment.A0x = (C23651Hc) r2.ACD.get();
    }

    public static void A0V(C19880zA r0, AnonymousClass10E r1, ConversationsFragment conversationsFragment) {
        conversationsFragment.A0b = r0;
        conversationsFragment.A18 = (AnonymousClass1M9) r1.A2f.get();
        conversationsFragment.A2c = (AnonymousClass1PU) r1.A4j.get();
        conversationsFragment.A2K = (AnonymousClass1Bd) r1.AA7.get();
        conversationsFragment.A2e = (AnonymousClass1DC) r1.A95.get();
        conversationsFragment.A1o = (AnonymousClass11C) r1.AAp.get();
    }

    public static void A0W(AnonymousClass1K1 r1, AnonymousClass10E r2, AnonymousClass10G r3, ConversationsFragment conversationsFragment) {
        conversationsFragment.A0f = (C36491nz) r1.A1l.get();
        conversationsFragment.A0g = (C36501o0) r1.A1m.get();
        conversationsFragment.A1C = (C24791Lr) r2.A2h.get();
        conversationsFragment.A2B = (AnonymousClass1MB) r2.AAb.get();
        conversationsFragment.A22 = (C34591kk) r2.AB5.get();
        conversationsFragment.A2z = C000200d.A00(r2.A2B);
        conversationsFragment.A3a = C000200d.A00(r3.A55);
    }

    public static void A0Y(AnonymousClass1K1 r0, AnonymousClass10G r1, ConversationsFragment conversationsFragment) {
        conversationsFragment.A2J = (C36871ob) r0.A5Q.get();
        conversationsFragment.A3O = C000200d.A00(r1.A3f);
    }

    public static void A0Z(C36241nZ r1, AnonymousClass10E r2, AnonymousClass10G r3, ConversationsFragment conversationsFragment) {
        conversationsFragment.A12 = (C26911Ty) r2.A1J.get();
        conversationsFragment.A23 = (AnonymousClass1RK) r2.A2R.get();
        conversationsFragment.A3A = C000200d.A00(r2.A4K);
        conversationsFragment.A33 = C000200d.A00(r2.A2b);
        conversationsFragment.A3F = C000200d.A00(r1.A1E);
        conversationsFragment.A3N = C000200d.A00(r3.A3U);
        conversationsFragment.A3W = C000200d.A00(r2.AA1);
        conversationsFragment.A3e = C000200d.A00(r3.A5J);
        conversationsFragment.A3j = (C18600wl) r2.A9E.get();
        conversationsFragment.A1J = (C32791hl) r2.A2t.get();
        conversationsFragment.A2M = (C36711oL) r3.A4N.get();
    }

    public static void A0a(C36241nZ r0, AnonymousClass10G r1, ConversationsFragment conversationsFragment) {
        conversationsFragment.A3T = C000200d.A00(r0.A1Y);
        conversationsFragment.A3C = C000200d.A00(r1.A2c);
    }

    public final Bundle A15() {
        Bundle bundle = this.A06;
        if (bundle != null) {
            return bundle;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" does not have any arguments.");
        throw new IllegalStateException(sb.toString());
    }

    public final LayoutInflater A16() {
        LayoutInflater layoutInflater = this.A0A;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        LayoutInflater A1o = A1o((Bundle) null);
        this.A0A = A1o;
        return A1o;
    }

    public final View A17() {
        View view = this.A0B;
        if (view != null) {
            return view;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not return a View from onCreateView() or this was called before onCreateView().");
        throw new IllegalStateException(sb.toString());
    }

    public final Fragment A19() {
        Fragment fragment = this.A0E;
        if (fragment != null) {
            return fragment;
        }
        Context A1n = A1n();
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        if (A1n == null) {
            sb.append(this);
            sb.append(" is not attached to any Fragment or host");
            throw new IllegalStateException(sb.toString());
        }
        sb.append(this);
        sb.append(" is not a child Fragment, it is directly attached to ");
        sb.append(A1n());
        throw new IllegalStateException(sb.toString());
    }

    public Fragment A1A(String str) {
        if (str.equals(this.A0V)) {
            return this;
        }
        return this.A0H.A0U.A01(str);
    }

    public final AnonymousClass1FL A1B() {
        AnonymousClass1GO r0 = this.A0G;
        if (r0 == null) {
            return null;
        }
        return (AnonymousClass1FL) r0.A00;
    }

    public final AnonymousClass1FL A1C() {
        AnonymousClass1GO r0 = this.A0G;
        if (r0 == null) {
            return null;
        }
        return r0.A04;
    }

    public final AnonymousClass1GP A1E() {
        if (this.A0G != null) {
            return this.A0H;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" has not been attached yet.");
        throw new IllegalStateException(sb.toString());
    }

    public final AnonymousClass1GP A1F() {
        AnonymousClass1GP r0 = this.A0I;
        if (r0 != null) {
            return r0;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" not associated with a fragment manager.");
        throw new IllegalStateException(sb.toString());
    }

    public C37801q9 A1G() {
        C37801q9 r0 = this.A0J;
        if (r0 != null) {
            return r0;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't access the Fragment View's LifecycleOwner for ");
        sb.append(this);
        sb.append(" when getView() is null i.e., before onCreateView() or after onDestroyView()");
        throw new IllegalStateException(sb.toString());
    }

    public void A1L() {
        Bundle bundle;
        Bundle bundle2 = this.A07;
        if (bundle2 != null && (bundle = bundle2.getBundle("childFragmentManager")) != null) {
            this.A0H.A0f(bundle);
            AnonymousClass1GP r2 = this.A0H;
            r2.A0J = false;
            r2.A0K = false;
            r2.A0A.A01 = false;
            AnonymousClass1GP.A0B(r2, 1);
        }
    }

    public void A1M() {
        if (this.A0D != null && A0K(this).A0E) {
            if (this.A0G == null) {
                A0K(this).A0E = false;
            } else if (Looper.myLooper() != this.A0G.A02.getLooper()) {
                this.A0G.A02.postAtFrontOfQueue(new C21466AkX((Object) this, 7));
            } else {
                A1X(true);
            }
        }
    }

    public void A1N(int i, int i2, int i3, int i4) {
        if (this.A0D != null || i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
            A0K(this).A01 = i;
            A0K(this).A02 = i2;
            A0K(this).A04 = i3;
            A0K(this).A05 = i4;
        }
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [X.76m, java.lang.Object] */
    @Deprecated
    public void A1P(Intent intent, int i, Bundle bundle) {
        if (this.A0G != null) {
            AnonymousClass1GP A1F = A1F();
            if (A1F.A03 != null) {
                String str = this.A0V;
                ? obj = new Object();
                obj.A01 = str;
                obj.A00 = i;
                A1F.A0C.addLast(obj);
                if (bundle != null) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
                }
                A1F.A03.A02((C1406772n) null, intent);
                return;
            }
            AnonymousClass1GO r1 = A1F.A08;
            C18070vi.A0d(intent, 1);
            if (i == -1) {
                r1.A01.startActivity(intent, bundle);
                return;
            }
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" not attached to Activity");
        throw new IllegalStateException(sb.toString());
    }

    public void A1R(Bundle bundle) {
        AnonymousClass1GP r0 = this.A0I;
        if (r0 == null || !r0.A0z()) {
            this.A06 = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added and state has been saved");
    }

    public void A1S(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.A0H.A0a();
        this.A0i = true;
        this.A0J = new C37801q9(this, Bba(), new C449025f(this, 1));
        View A1q = A1q(bundle, layoutInflater, viewGroup);
        this.A0B = A1q;
        C37801q9 r0 = this.A0J;
        if (A1q != null) {
            r0.A00();
            if (AnonymousClass1GP.A0G(3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Setting ViewLifecycleOwner on View ");
                sb.append(this.A0B);
                sb.append(" for Fragment ");
                sb.append(this);
                Log.d("FragmentManager", sb.toString());
            }
            AnonymousClass1ZG.A01(this.A0B, this.A0J);
            ViewTreeViewModelStoreOwner.A01(this.A0B, this.A0J);
            AnonymousClass1ZI.A01(this.A0B, this.A0J);
            this.A0M.A0F(this.A0J);
        } else if (r0.A00 != null) {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        } else {
            this.A0J = null;
        }
    }

    public void A1T(Menu menu) {
        if (!this.A0c) {
            this.A0H.A0g(menu);
        }
    }

    public void A1U(C26550D3n d3n) {
        Bundle bundle;
        if (this.A0I == null) {
            if (d3n == null || (bundle = d3n.A00) == null) {
                bundle = null;
            }
            this.A07 = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added");
    }

    @Deprecated
    public void A1V(Fragment fragment, int i) {
        AnonymousClass1GP r0;
        if (fragment != null) {
            C34281kE r02 = C34281kE.A01;
            C451727n r3 = new C451727n(this, fragment, i);
            C34281kE.A03(r3);
            C34291kF A002 = C34281kE.A00(this);
            if (A002.A01.contains(C34391kP.DETECT_TARGET_FRAGMENT_USAGE) && C34281kE.A04(A002, getClass(), r3.getClass())) {
                C34281kE.A02(A002, r3);
            }
        }
        AnonymousClass1GP r1 = this.A0I;
        if (fragment != null) {
            r0 = fragment.A0I;
        } else {
            r0 = null;
        }
        if (r1 == null || r0 == null || r1 == r0) {
            Fragment fragment2 = fragment;
            while (fragment2 != null) {
                if (!fragment2.equals(this)) {
                    fragment2 = A0L(fragment2, false);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Setting ");
                    sb.append(fragment);
                    sb.append(" as the target of ");
                    sb.append(this);
                    sb.append(" would create a target cycle");
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            if (fragment == null) {
                this.A0U = null;
                this.A0F = null;
            } else if (this.A0I == null || fragment.A0I == null) {
                this.A0U = null;
                this.A0F = fragment;
            } else {
                this.A0U = fragment.A0V;
                this.A0F = null;
            }
            this.A05 = i;
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Fragment ");
        sb2.append(fragment);
        sb2.append(" must share the same FragmentManager to be set as a target fragment");
        throw new IllegalArgumentException(sb2.toString());
    }

    public void A1X(boolean z) {
        ViewGroup viewGroup;
        AnonymousClass1GP r0;
        C35841mt r1 = this.A0D;
        if (r1 != null) {
            r1.A0E = false;
        }
        if (this.A0B != null && (viewGroup = this.A0C) != null && (r0 = this.A0I) != null) {
            C39461t7 A022 = C39461t7.A02(viewGroup, r0);
            A022.A09();
            if (z) {
                this.A0G.A02.post(new C21471Akc((Object) this, (Object) A022, 5));
            } else {
                A022.A07();
            }
        }
    }

    @Deprecated
    public void A1Z(boolean z) {
        if (this.A0b != z) {
            this.A0b = z;
            if (A1b() && !A1c()) {
                this.A0G.A04.invalidateOptionsMenu();
            }
        }
    }

    public void A1a(boolean z) {
        if (this.A0h != z) {
            this.A0h = z;
            if (this.A0b && A1b() && !A1c()) {
                this.A0G.A04.invalidateOptionsMenu();
            }
        }
    }

    public final boolean A1b() {
        if (this.A0G == null || !this.A0W) {
            return false;
        }
        return true;
    }

    public final boolean A1c() {
        Fragment fragment;
        if (this.A0c) {
            return true;
        }
        if (this.A0I == null || (fragment = this.A0E) == null || !fragment.A1c()) {
            return false;
        }
        return true;
    }

    public final boolean A1d() {
        Fragment fragment;
        if (!this.A0h) {
            return false;
        }
        if (this.A0I == null || (fragment = this.A0E) == null || fragment.A1d()) {
            return true;
        }
        return false;
    }

    public boolean A1f(Menu menu) {
        boolean z = false;
        if (this.A0c) {
            return false;
        }
        if (this.A0b && this.A0h) {
            A1l(menu);
            z = true;
        }
        return z | this.A0H.A10(menu);
    }

    public boolean A1g(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.A0c) {
            return false;
        }
        if (this.A0b && this.A0h) {
            A22(menu, menuInflater);
            z = true;
        }
        return z | this.A0H.A11(menu, menuInflater);
    }

    public boolean A1h(MenuItem menuItem) {
        if (this.A0c) {
            return false;
        }
        if (A1m(menuItem)) {
            return true;
        }
        return this.A0H.A12(menuItem);
    }

    public boolean A1i(MenuItem menuItem) {
        if (this.A0c) {
            return false;
        }
        if (!this.A0b || !this.A0h || !A24(menuItem)) {
            return this.A0H.A13(menuItem);
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c4, code lost:
        if (r1.A0p.isEmpty() == false) goto L_0x00c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d1, code lost:
        r1 = (com.whatsapp.ConversationFragment) r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0028, code lost:
        if (r3.A0s.A0N() != false) goto L_0x002a;
     */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1l(android.view.Menu r9) {
        /*
            r8 = this;
            boolean r0 = r8 instanceof com.whatsapp.conversationslist.ConversationsFragment
            if (r0 == 0) goto L_0x00a3
            r3 = r8
            com.whatsapp.conversationslist.ConversationsFragment r3 = (com.whatsapp.conversationslist.ConversationsFragment) r3
            r0 = 2131432611(0x7f0b14a3, float:1.8486984E38)
            android.view.MenuItem r2 = r9.findItem(r0)
            if (r2 == 0) goto L_0x003f
            X.1QO r1 = r3.A2I
            r0 = 0
            boolean r0 = r1.A04(r0)
            if (r0 != 0) goto L_0x0021
            X.1QO r0 = r3.A2I
            boolean r0 = r0.A0H()
            if (r0 == 0) goto L_0x002a
        L_0x0021:
            X.11S r0 = r3.A0s
            boolean r1 = r0.A0N()
            r0 = 1
            if (r1 == 0) goto L_0x002b
        L_0x002a:
            r0 = 0
        L_0x002b:
            r2.setVisible(r0)
            X.1QO r0 = r3.A2I
            boolean r1 = r0.A01()
            r0 = 2131893788(0x7f121e1c, float:1.9422362E38)
            if (r1 == 0) goto L_0x003c
            r0 = 2131893789(0x7f121e1d, float:1.9422364E38)
        L_0x003c:
            r2.setTitle(r0)
        L_0x003f:
            X.1ol r5 = r3.A2D
            X.1FL r4 = r3.A1D()
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            r3.<init>()
            java.util.Set r0 = r5.A02
            java.util.Iterator r7 = r0.iterator()
        L_0x0050:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0088
            java.lang.Object r6 = r7.next()
            X.1q7 r6 = (X.C37781q7) r6
            java.lang.String r2 = "MarketingMessagesOptionsMenuAsyncLoader"
            java.util.concurrent.ConcurrentHashMap r1 = r5.A03
            boolean r0 = r1.containsKey(r2)
            if (r0 == 0) goto L_0x0084
            r1.get(r2)
            X.0zA r1 = r6.A01
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x0050
            X.0zA r0 = r6.A00
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x0050
            r1.A03()
            java.lang.String r1 = "getMenuItemPremiumMessagesId"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x0084:
            r3.add(r6)
            goto L_0x0050
        L_0x0088:
            boolean r0 = r3.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00cc
            X.00H r0 = r5.A01
            java.lang.Object r2 = r0.get()
            X.10I r2 = (X.AnonymousClass10I) r2
            r1 = 34
            X.7R0 r0 = new X.7R0
            r0.<init>(r5, r4, r3, r1)
            r2.CGN(r0)
            return
        L_0x00a3:
            boolean r0 = r8 instanceof com.whatsapp.calling.callhistory.view.CallsHistoryFragment
            if (r0 == 0) goto L_0x00cd
            r1 = r8
            com.whatsapp.calling.callhistory.view.CallsHistoryFragment r1 = (com.whatsapp.calling.callhistory.view.CallsHistoryFragment) r1
            r0 = 2131432537(0x7f0b1459, float:1.8486834E38)
            android.view.MenuItem r2 = r9.findItem(r0)
            if (r2 == 0) goto L_0x00cc
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentViewModel r1 = r1.A0C
            java.util.LinkedHashMap r0 = r1.A0r
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00c6
            java.util.ArrayList r0 = r1.A0p
            boolean r1 = r0.isEmpty()
            r0 = 1
            if (r1 != 0) goto L_0x00c7
        L_0x00c6:
            r0 = 0
        L_0x00c7:
            r0 = r0 ^ 1
            r2.setVisible(r0)
        L_0x00cc:
            return
        L_0x00cd:
            boolean r0 = r8 instanceof com.whatsapp.ConversationFragment
            if (r0 == 0) goto L_0x00cc
            r1 = r8
            com.whatsapp.ConversationFragment r1 = (com.whatsapp.ConversationFragment) r1
            X.3tk r0 = r1.A02
            if (r0 == 0) goto L_0x00cc
            X.4aY r0 = r0.A04
            androidx.appcompat.widget.Toolbar r0 = r0.A0f
            if (r0 == 0) goto L_0x00cc
            android.view.Menu r3 = r0.getMenu()
            X.3tk r0 = r1.A02
            X.4aY r2 = r0.A04
            java.util.Set r0 = r2.A7q
            java.util.Iterator r1 = r0.iterator()
        L_0x00ec:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00fc
            java.lang.Object r0 = r1.next()
            X.5bH r0 = (X.C108185bH) r0
            r0.C1Y(r3)
            goto L_0x00ec
        L_0x00fc:
            X.5cQ r0 = r2.A2Q
            r0.C7w(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.Fragment.A1l(android.view.Menu):void");
    }

    public boolean A1m(MenuItem menuItem) {
        if (!(this instanceof ConversationsFragment)) {
            return false;
        }
        ConversationsFragment conversationsFragment = (ConversationsFragment) this;
        if (conversationsFragment.A1a.A03(menuItem, conversationsFragment, conversationsFragment.A1D())) {
            return true;
        }
        return false;
    }

    public Context A1n() {
        AnonymousClass1GO r0 = this.A0G;
        if (r0 == null) {
            return null;
        }
        return r0.A01;
    }

    public LayoutInflater A1o(Bundle bundle) {
        AnonymousClass1GO r0 = this.A0G;
        if (r0 != null) {
            AnonymousClass1FL r1 = r0.A04;
            LayoutInflater cloneInContext = r1.getLayoutInflater().cloneInContext(r1);
            cloneInContext.setFactory2(this.A0H.A0S);
            return cloneInContext;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i = this.A02;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005a, code lost:
        if (r6 != false) goto L_0x005c;
     */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A23(boolean r6) {
        /*
            r5 = this;
            X.1kE r0 = X.C34281kE.A01
            X.1kH r3 = new X.1kH
            r3.<init>(r5, r6)
            X.C34281kE.A03(r3)
            X.1kF r2 = X.C34281kE.A00(r5)
            java.util.Set r1 = r2.A01
            X.1kP r0 = X.C34391kP.DETECT_SET_USER_VISIBLE_HINT
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0029
            java.lang.Class r1 = r5.getClass()
            java.lang.Class r0 = r3.getClass()
            boolean r0 = X.C34281kE.A04(r2, r1, r0)
            if (r0 == 0) goto L_0x0029
            X.C34281kE.A02(r2, r3)
        L_0x0029:
            boolean r0 = r5.A0n
            r4 = 5
            if (r0 != 0) goto L_0x0053
            if (r6 == 0) goto L_0x0053
            int r0 = r5.A04
            if (r0 >= r4) goto L_0x0053
            X.1GP r3 = r5.A0I
            if (r3 == 0) goto L_0x0053
            boolean r0 = r5.A1b()
            if (r0 == 0) goto L_0x0053
            boolean r0 = r5.A0g
            if (r0 == 0) goto L_0x0053
            X.1mr r2 = r3.A0U(r5)
            androidx.fragment.app.Fragment r1 = r2.A02
            boolean r0 = r1.A0Y
            if (r0 == 0) goto L_0x0053
            boolean r0 = r3.A0G
            if (r0 == 0) goto L_0x006a
            r0 = 1
            r3.A0H = r0
        L_0x0053:
            r5.A0n = r6
            int r0 = r5.A04
            if (r0 >= r4) goto L_0x005c
            r0 = 1
            if (r6 == 0) goto L_0x005d
        L_0x005c:
            r0 = 0
        L_0x005d:
            r5.A0Y = r0
            android.os.Bundle r0 = r5.A07
            if (r0 == 0) goto L_0x0069
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            r5.A0Q = r0
        L_0x0069:
            return
        L_0x006a:
            r0 = 0
            r1.A0Y = r0
            r2.A03()
            goto L_0x0053
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.Fragment.A23(boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        if (r2 == null) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0021, code lost:
        if (X.AnonymousClass1GP.A0G(3) == false) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("Could not find Application instance from Context ");
        r1.append(A14().getApplicationContext());
        r1.append(", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
        android.util.Log.d("FragmentManager", r1.toString());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C24051Ir BQR() {
        /*
            r3 = this;
            X.1GP r0 = r3.A0I
            if (r0 == 0) goto L_0x0059
            X.1Ir r1 = r3.A0N
            if (r1 != 0) goto L_0x004f
            android.content.Context r0 = r3.A14()
            android.content.Context r2 = r0.getApplicationContext()
        L_0x0010:
            boolean r0 = r2 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L_0x0057
            boolean r0 = r2 instanceof android.app.Application
            if (r0 == 0) goto L_0x0050
            android.app.Application r2 = (android.app.Application) r2
            if (r2 != 0) goto L_0x0046
        L_0x001c:
            r0 = 3
            boolean r0 = X.AnonymousClass1GP.A0G(r0)
            if (r0 == 0) goto L_0x0046
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Could not find Application instance from Context "
            r1.append(r0)
            android.content.Context r0 = r3.A14()
            android.content.Context r0 = r0.getApplicationContext()
            r1.append(r0)
            java.lang.String r0 = ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "FragmentManager"
            android.util.Log.d(r0, r1)
        L_0x0046:
            android.os.Bundle r0 = r3.A06
            X.1pM r1 = new X.1pM
            r1.<init>(r2, r0, r3)
            r3.A0N = r1
        L_0x004f:
            return r1
        L_0x0050:
            android.content.ContextWrapper r2 = (android.content.ContextWrapper) r2
            android.content.Context r2 = r2.getBaseContext()
            goto L_0x0010
        L_0x0057:
            r2 = 0
            goto L_0x001c
        L_0x0059:
            java.lang.String r1 = "Can't access ViewModels from detached fragment"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.Fragment.BQR():X.1Ir");
    }

    public final AnonymousClass1GB BYX() {
        return this.A0O.A01;
    }

    public C24081Iu Bba() {
        AnonymousClass1GP r2 = this.A0I;
        if (r2 == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        } else if (A0J() != 1) {
            HashMap hashMap = r2.A0A.A04;
            C24081Iu r1 = (C24081Iu) hashMap.get(this.A0V);
            if (r1 != null) {
                return r1;
            }
            C24081Iu r12 = new C24081Iu();
            hashMap.put(this.A0V, r12);
            return r12;
        } else {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.A0V);
        int i = this.A03;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.A0T;
        if (str != null) {
            sb.append(" tag=");
            sb.append(str);
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [X.1DT, X.1DS] */
    public Fragment() {
        A0M();
    }

    public static void A0S(C19880zA r1, C36241nZ r2, AnonymousClass10E r3, AnonymousClass10G r4, ConversationsFragment conversationsFragment) {
        conversationsFragment.A1f = AnonymousClass10G.A4A(r4);
        conversationsFragment.A2Z = (C36451nu) r3.A0G.get();
        conversationsFragment.A1B = (C25491Ok) r3.A1F.get();
        conversationsFragment.A2R = (AnonymousClass1Nb) r3.A2E.get();
        conversationsFragment.A13 = (C36461nv) r4.A3c.get();
        conversationsFragment.A2V = (SuggestionsEngine) r2.A1e.get();
        conversationsFragment.A1p = (C29781cr) r3.AAq.get();
        conversationsFragment.A2P = (C33451iq) r3.ABJ.get();
        conversationsFragment.A0v = (C32531hL) r3.ABm.get();
        conversationsFragment.A2o = C000200d.A00(r3.A12);
        conversationsFragment.A2p = C000200d.A00(r3.A14);
        conversationsFragment.A0Y = r1;
    }

    public static void A0X(AnonymousClass1K1 r1, AnonymousClass10E r2, AnonymousClass10G r3, ConversationsFragment conversationsFragment, C18140vp r5) {
        conversationsFragment.A0W = (C19880zA) r5.get();
        conversationsFragment.A29 = (C36511o1) r1.A4C.get();
        conversationsFragment.A21 = (AnonymousClass1Cd) r2.A6i.get();
        conversationsFragment.A1s = (C19830z4) r2.ABl.get();
        conversationsFragment.A2w = C000200d.A00(r2.A24);
        conversationsFragment.A2m = C000200d.A00(r2.A0x);
        conversationsFragment.A2v = C000200d.A00(r2.A1U);
        conversationsFragment.A3U = C000200d.A00(r2.A4Z);
        conversationsFragment.A2E = (AnonymousClass1XN) r3.A0d.get();
        conversationsFragment.A1H = (C36521o2) r2.A2l.get();
        conversationsFragment.A1K = (C25161Nd) r2.A2v.get();
        conversationsFragment.A2x = C000200d.A00(r2.A25);
        conversationsFragment.A39 = C000200d.A00(r2.A4J);
    }

    public static void A0b(AnonymousClass10E r1, AnonymousClass10G r2, ConversationsFragment conversationsFragment) {
        conversationsFragment.A00 = AnonymousClass10G.A8i(r2);
        conversationsFragment.A1r = (AnonymousClass118) r1.ABY.get();
        conversationsFragment.A1q = (AnonymousClass11P) r1.AAv.get();
        conversationsFragment.A25 = (C18030ve) r1.A04.get();
        conversationsFragment.A0r = (AnonymousClass1KB) r1.A4b.get();
        conversationsFragment.A2d = (AnonymousClass1L4) r2.A2e.get();
        conversationsFragment.A0s = (AnonymousClass11S) r1.A63.get();
        conversationsFragment.A2f = (AnonymousClass10I) r1.AC1.get();
        conversationsFragment.A15 = (AnonymousClass1PW) r1.A13.get();
        conversationsFragment.A1v = (AnonymousClass1CJ) r1.A2H.get();
    }

    public static void A0c(AnonymousClass10E r1, AnonymousClass10G r2, ConversationsFragment conversationsFragment, C18140vp r4) {
        conversationsFragment.A27 = (AnonymousClass18K) r4.get();
        conversationsFragment.A1u = (C22621Co) r1.A27.get();
        conversationsFragment.A2X = (C24901Mc) r1.AA5.get();
        conversationsFragment.A0t = (C36271nc) r2.A4x.get();
        conversationsFragment.A26 = (AnonymousClass12L) r1.A90.get();
        conversationsFragment.A3I = C000200d.A00(r1.A5n);
        conversationsFragment.A3c = C000200d.A00(r1.ABd);
        conversationsFragment.A0e = (AnonymousClass1L9) r1.A0E.get();
        conversationsFragment.A2g = (AnonymousClass1VT) r1.A1X.get();
        conversationsFragment.A1E = (C27201Vd) r1.A2j.get();
        conversationsFragment.A20 = (AnonymousClass1NH) r1.A5b.get();
        conversationsFragment.A2i = C000200d.A00(r2.A00);
    }

    public final Context A14() {
        Context A1n = A1n();
        if (A1n != null) {
            return A1n;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" not attached to a context.");
        throw new IllegalStateException(sb.toString());
    }

    public final AnonymousClass1FL A1D() {
        AnonymousClass1FL A1B = A1B();
        if (A1B != null) {
            return A1B;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" not attached to an activity.");
        throw new IllegalStateException(sb.toString());
    }

    public final String A1H(int i) {
        return A14().getResources().getString(i);
    }

    public final String A1I(int i, Object... objArr) {
        return A14().getResources().getString(i, objArr);
    }

    public void A1J() {
        A0M();
        this.A0S = this.A0V;
        this.A0V = UUID.randomUUID().toString();
        this.A0W = false;
        this.A0j = false;
        this.A0a = false;
        this.A0f = false;
        this.A0k = false;
        this.A00 = 0;
        this.A0I = null;
        this.A0H = new AnonymousClass1GP();
        this.A0G = null;
        this.A03 = 0;
        this.A01 = 0;
        this.A0T = null;
        this.A0c = false;
        this.A0Z = false;
    }

    public void A1W(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.A03));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.A01));
        printWriter.print(" mTag=");
        printWriter.println(this.A0T);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.A04);
        printWriter.print(" mWho=");
        printWriter.print(this.A0V);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.A00);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.A0W);
        printWriter.print(" mRemoving=");
        printWriter.print(this.A0j);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.A0a);
        printWriter.print(" mInLayout=");
        printWriter.println(this.A0f);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.A0c);
        printWriter.print(" mDetached=");
        printWriter.print(this.A0Z);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.A0h);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.A0b);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.A0l);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.A0n);
        if (this.A0I != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.A0I);
        }
        if (this.A0G != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.A0G);
        }
        if (this.A0E != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.A0E);
        }
        if (this.A06 != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.A06);
        }
        if (this.A07 != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.A07);
        }
        if (this.A09 != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.A09);
        }
        if (this.A08 != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.A08);
        }
        Fragment A0L2 = A0L(this, false);
        if (A0L2 != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(A0L2);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.A05);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        C35841mt r0 = this.A0D;
        if (r0 == null) {
            z = false;
        } else {
            z = r0.A0F;
        }
        printWriter.println(z);
        C35841mt r02 = this.A0D;
        if (!(r02 == null || r02.A01 == 0)) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            C35841mt r03 = this.A0D;
            if (r03 == null) {
                i4 = 0;
            } else {
                i4 = r03.A01;
            }
            printWriter.println(i4);
        }
        C35841mt r04 = this.A0D;
        if (!(r04 == null || r04.A02 == 0)) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            C35841mt r05 = this.A0D;
            if (r05 == null) {
                i3 = 0;
            } else {
                i3 = r05.A02;
            }
            printWriter.println(i3);
        }
        C35841mt r06 = this.A0D;
        if (!(r06 == null || r06.A04 == 0)) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            C35841mt r07 = this.A0D;
            if (r07 == null) {
                i2 = 0;
            } else {
                i2 = r07.A04;
            }
            printWriter.println(i2);
        }
        C35841mt r08 = this.A0D;
        if (!(r08 == null || r08.A05 == 0)) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            C35841mt r09 = this.A0D;
            if (r09 == null) {
                i = 0;
            } else {
                i = r09.A05;
            }
            printWriter.println(i);
        }
        if (this.A0C != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.A0C);
        }
        if (this.A0B != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.A0B);
        }
        if (A1n() != null) {
            C26144Ct7.A00(this).A04(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        StringBuilder sb = new StringBuilder();
        sb.append("Child ");
        sb.append(this.A0H);
        sb.append(":");
        printWriter.println(sb.toString());
        AnonymousClass1GP r2 = this.A0H;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("  ");
        r2.A0x(sb2.toString(), fileDescriptor, printWriter, strArr);
    }

    public final boolean A1e() {
        View view;
        if (!A1b() || A1c() || (view = this.A0B) == null || view.getWindowToken() == null || this.A0B.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        if (r3 == null) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (X.AnonymousClass1GP.A0G(3) == false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("Could not find Application instance from Context ");
        r1.append(A14().getApplicationContext());
        r1.append(", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        android.util.Log.d("FragmentManager", r1.toString());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C24091Iv BQQ() {
        /*
            r4 = this;
            android.content.Context r0 = r4.A14()
            android.content.Context r3 = r0.getApplicationContext()
        L_0x0008:
            boolean r0 = r3 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L_0x0063
            boolean r0 = r3 instanceof android.app.Application
            if (r0 == 0) goto L_0x005c
            if (r3 != 0) goto L_0x003c
        L_0x0012:
            r0 = 3
            boolean r0 = X.AnonymousClass1GP.A0G(r0)
            if (r0 == 0) goto L_0x003c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Could not find Application instance from Context "
            r1.append(r0)
            android.content.Context r0 = r4.A14()
            android.content.Context r0 = r0.getApplicationContext()
            r1.append(r0)
            java.lang.String r0 = ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "FragmentManager"
            android.util.Log.d(r0, r1)
        L_0x003c:
            X.1Iw r2 = new X.1Iw
            r2.<init>()
            if (r3 == 0) goto L_0x0048
            X.1GH r0 = X.C24131Iz.A02
            r2.A01(r0, r3)
        L_0x0048:
            X.1GH r0 = X.AnonymousClass1GG.A01
            r2.A01(r0, r4)
            X.1GH r0 = X.AnonymousClass1GG.A02
            r2.A01(r0, r4)
            android.os.Bundle r1 = r4.A06
            if (r1 == 0) goto L_0x005b
            X.1GH r0 = X.AnonymousClass1GG.A00
            r2.A01(r0, r1)
        L_0x005b:
            return r2
        L_0x005c:
            android.content.ContextWrapper r3 = (android.content.ContextWrapper) r3
            android.content.Context r3 = r3.getBaseContext()
            goto L_0x0008
        L_0x0063:
            r3 = 0
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.Fragment.BQQ():X.1Iv");
    }

    public C23381Fv getLifecycle() {
        return this.A0L;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        A1D().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }
}
