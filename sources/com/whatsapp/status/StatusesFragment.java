package com.whatsapp.status;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass10I;
import X.AnonymousClass118;
import X.AnonymousClass11C;
import X.AnonymousClass11N;
import X.AnonymousClass11P;
import X.AnonymousClass11Q;
import X.AnonymousClass11S;
import X.AnonymousClass126;
import X.AnonymousClass178;
import X.AnonymousClass19Y;
import X.AnonymousClass1BI;
import X.AnonymousClass1DC;
import X.AnonymousClass1DT;
import X.AnonymousClass1E5;
import X.AnonymousClass1EG;
import X.AnonymousClass1F9;
import X.AnonymousClass1FL;
import X.AnonymousClass1HF;
import X.AnonymousClass1KB;
import X.AnonymousClass1L9;
import X.AnonymousClass1LU;
import X.AnonymousClass1M9;
import X.AnonymousClass1Nb;
import X.AnonymousClass1TF;
import X.AnonymousClass1TG;
import X.AnonymousClass1WR;
import X.AnonymousClass2HK;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass48o;
import X.AnonymousClass4aX;
import X.AnonymousClass6L7;
import X.AnonymousClass6LR;
import X.AnonymousClass6MY;
import X.AnonymousClass6QD;
import X.AnonymousClass79M;
import X.AnonymousClass7AE;
import X.AnonymousClass7AH;
import X.AnonymousClass7AP;
import X.AnonymousClass7E0;
import X.AnonymousClass7FH;
import X.AnonymousClass7FX;
import X.AnonymousClass7M3;
import X.AnonymousClass7M5;
import X.AnonymousClass7MA;
import X.AnonymousClass7PJ;
import X.AnonymousClass7RH;
import X.AnonymousClass7S5;
import X.AnonymousClass884;
import X.C108945cZ;
import X.C108955ca;
import X.C108965cb;
import X.C108985cd;
import X.C108995ce;
import X.C109045cj;
import X.C110285fE;
import X.C123416Uj;
import X.C134116q4;
import X.C136856uW;
import X.C139186yN;
import X.C139586z5;
import X.C1410574c;
import X.C143707Em;
import X.C146177Oc;
import X.C1596785l;
import X.C1603187z;
import X.C1603688e;
import X.C17880vN;
import X.C17890vO;
import X.C18000vb;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C18180vt;
import X.C19620yd;
import X.C19830z4;
import X.C19880zA;
import X.C21467AkY;
import X.C219217x;
import X.C221618v;
import X.C22791Df;
import X.C22941Dw;
import X.C22971Dz;
import X.C23291Fl;
import X.C23311Fn;
import X.C23401Fx;
import X.C23471Gk;
import X.C23501Gn;
import X.C23571Gu;
import X.C23581Gv;
import X.C23721Hj;
import X.C24621La;
import X.C24631Lb;
import X.C24641Lc;
import X.C24661Le;
import X.C24671Lf;
import X.C24681Lg;
import X.C24921Me;
import X.C27201Vd;
import X.C27251Vi;
import X.C29201bm;
import X.C30141dS;
import X.C32741hg;
import X.C34011jl;
import X.C34041jo;
import X.C34601kl;
import X.C34611km;
import X.C34621kn;
import X.C36271nc;
import X.C36431ns;
import X.C37451pZ;
import X.C38561rU;
import X.C39451t6;
import X.C39991ty;
import X.C40011u0;
import X.C40021u1;
import X.C40071u7;
import X.C41701wv;
import X.C41751x0;
import X.C41821x7;
import X.C49822Sb;
import X.C50142Th;
import X.C51582Yv;
import X.C55872gV;
import X.C56092gt;
import X.C56622hl;
import X.C63372sx;
import X.C72453Mb;
import X.C72463Mc;
import X.C72813Np;
import X.C89974dK;
import X.C90594eK;
import X.CY4;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Space;
import android.widget.TextView;
import androidx.fragment.app.ListFragment;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.EmptyTellAFriendView;
import com.whatsapp.bridge.wfal.WfalManager;
import com.whatsapp.collections.observablelistview.ObservableListView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Deprecated
public class StatusesFragment extends Hilt_StatusesFragment implements AnonymousClass1F9, C34011jl, C29201bm, C23291Fl, AnonymousClass884, C34041jo, C34601kl, C34611km, C34621kn {
    public AnimatorSet A00;
    public AnimatorSet A01;
    public View A02;
    public C19880zA A03;
    public C19880zA A04;
    public C19880zA A05;
    public C19880zA A06;
    public C19880zA A07;
    public C19880zA A08;
    public C23721Hj A09;
    public AnonymousClass1L9 A0A;
    public C56622hl A0B;
    public C51582Yv A0C;
    public AnonymousClass1KB A0D;
    public AnonymousClass11S A0E;
    public C36271nc A0F;
    public C27251Vi A0G;
    public AnonymousClass1M9 A0H;
    public C24671Lf A0I;
    public C24921Me A0J;
    public C37451pZ A0K;
    public C27201Vd A0L;
    public C36431ns A0M;
    public AnonymousClass11Q A0N;
    public AnonymousClass11C A0O;
    public AnonymousClass11N A0P;
    public AnonymousClass11P A0Q;
    public AnonymousClass118 A0R;
    public C219217x A0S;
    public C19830z4 A0T;
    public C18000vb A0U;
    public C24681Lg A0V;
    public AnonymousClass1TG A0W;
    public C24631Lb A0X;
    public C24661Le A0Y;
    public C18030ve A0Z;
    public AnonymousClass126 A0a;
    public AnonymousClass1Nb A0b;
    public C90594eK A0c;
    public C24641Lc A0d;
    public C110285fE A0e;
    public C40071u7 A0f;
    public C40011u0 A0g;
    public AnonymousClass1TF A0h;
    public C40021u1 A0i;
    public C139586z5 A0j;
    public C139186yN A0k = new C139186yN();
    public C32741hg A0l;
    public C41751x0 A0m;
    public AnonymousClass6LR A0n;
    public AnonymousClass1DC A0o;
    public AnonymousClass10I A0p;
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
    public AnonymousClass00H A12 = C221618v.A00(AnonymousClass178.class);
    public AnonymousClass00H A13;
    public AnonymousClass00H A14;
    public AnonymousClass00H A15;
    public AnonymousClass00H A16;
    public AnonymousClass00H A17;
    public AnonymousClass00H A18;
    public CharSequence A19;
    public List A1A;
    public List A1B = AnonymousClass000.A13();
    public List A1C = AnonymousClass000.A13();
    public boolean A1D;
    public boolean A1E = true;
    public boolean A1F;
    public boolean A1G = false;
    public boolean A1H;
    public View A1I;
    public AnonymousClass7AE A1J;
    public AnonymousClass6MY A1K;
    public final List A1L = AnonymousClass000.A13();
    public final List A1M = AnonymousClass000.A13();
    public final List A1N = AnonymousClass000.A13();
    public final List A1O = AnonymousClass000.A13();
    public final Set A1P = C17880vN.A12();
    public final C23581Gv A1Q = new AnonymousClass7E0(this, 10);
    public final C23501Gn A1R = new C143707Em(this, 5);
    public final AnonymousClass1WR A1S = new AnonymousClass7FH(this, 9);
    public final C1596785l A1T = new AnonymousClass7M3(this, 0);
    public final C1603688e A1U = new C146177Oc(this);
    public final C123416Uj A1V = new AnonymousClass6QD(this);
    public final Runnable A1W = new AnonymousClass7RH(this, 4);

    public static void A0B(StatusesFragment statusesFragment, List list, boolean z) {
        boolean A032;
        C56092gt r0;
        StatusesFragment statusesFragment2 = statusesFragment;
        AnonymousClass1FL A1B2 = statusesFragment.A1B();
        if (A1B2 != null) {
            statusesFragment.A1D = z;
            C41701wv r4 = (C41701wv) statusesFragment.A0y.get();
            if (z) {
                A032 = C41701wv.A00(A1B2, statusesFragment2, (AnonymousClass7MA) r4.A06.getValue(), r4, "status_fragment", list);
            } else {
                A032 = r4.A03(A1B2, statusesFragment2, "status_fragment", list);
            }
            if (!A032 && !((C41701wv) statusesFragment2.A0y.get()).A02.A0G() && (r0 = statusesFragment2.A0l.A00) != null) {
                r0.A01 = 4;
            }
        }
    }

    public void A27() {
        C17890vO.A0t(this.A1K);
        C24661Le r5 = this.A0Y;
        C24641Lc r8 = this.A0d;
        AnonymousClass1Nb r7 = this.A0b;
        WfalManager wfalManager = (WfalManager) this.A14.get();
        AnonymousClass1TG r3 = this.A0W;
        C32741hg r10 = this.A0l;
        AnonymousClass6MY r1 = new AnonymousClass6MY(wfalManager, r3, this.A0X, r5, (CY4) this.A0s.get(), r7, r8, this, r10, (C30141dS) this.A17.get(), this.A13, this.A18);
        this.A1K = r1;
        C17890vO.A0u(r1, this.A0p);
    }

    public /* synthetic */ void BBR(C23571Gu r2) {
        C18070vi.A0d(r2, 1);
        r2.BlE();
    }

    public String BUM() {
        return null;
    }

    public C90594eK BZQ(int i, int i2, boolean z) {
        View findViewById = A1D().findViewById(2131433403);
        ArrayList A132 = AnonymousClass000.A13();
        A132.add(A1D().findViewById(2131430767));
        A132.add(A1D().findViewById(2131430769));
        C90594eK r2 = new C90594eK(findViewById, (AnonymousClass1F9) this, this.A0O, (List) A132, i, i2, z);
        this.A0c = r2;
        r2.A07(new AnonymousClass7RH(this, 1));
        return this.A0c;
    }

    public int Ba6() {
        return 300;
    }

    public String BaZ() {
        return null;
    }

    public void BrY(boolean z) {
    }

    public /* synthetic */ void Buy() {
    }

    public void C6m(C139186yN r9) {
        this.A1K = null;
        this.A0k = r9;
        C32741hg r0 = this.A0l;
        Map map = r9.A04;
        Map map2 = r0.A0P;
        map2.clear();
        map2.putAll(map);
        if (r9.A01.size() == 0) {
            this.A1E = true;
        }
        C110285fE.A00(this);
        long j = 0;
        int i = 0;
        for (C63372sx r1 : this.A0k.A02) {
            i++;
            if (r1.A03() > j) {
                j = r1.A03();
            }
        }
        AnonymousClass1FL A1B2 = A1B();
        if (A1B2 instanceof C23311Fn) {
            ((C23311Fn) A1B2).CRN(j, i);
        }
        C32741hg r2 = this.A0l;
        C56092gt r12 = r2.A00;
        if (r12 != null && !r12.A05 && r12.A08) {
            r2.A0H(r9.A05, this.A0k.A02.size());
        }
        A07(this);
        A09(this);
        this.A1J.A00();
        C17890vO.A0t(this.A0n);
        AnonymousClass6LR r13 = new AnonymousClass6LR(this.A0W, this);
        this.A0n = r13;
        C17890vO.A0u(r13, this.A0p);
    }

    public /* synthetic */ void CI2(ImageView imageView) {
        C49822Sb.A00(imageView);
    }

    public /* synthetic */ void CKb() {
    }

    public boolean COp() {
        return true;
    }

    public static String A01(StatusesFragment statusesFragment) {
        C139186yN r0 = statusesFragment.A0k;
        if (r0 == null || r0.A05.isEmpty()) {
            return null;
        }
        return AnonymousClass1EG.A08(",", (String[]) statusesFragment.A0k.A05.keySet().toArray(new String[0]));
    }

    private void A02() {
        if (this.A1G) {
            this.A0l.A0E(AnonymousClass000.A0i());
            if (this.A1K == null) {
                this.A0l.A0H(this.A0k.A05, this.A0k.A02.size());
                this.A0l.A09(new AnonymousClass2HK(), this.A0k, false, false);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0020, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r5.A0Z, 4905) == false) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A03() {
        /*
            r5 = this;
            X.11S r0 = r5.A0E
            boolean r0 = r0.A0N()
            if (r0 == 0) goto L_0x002b
            X.11Q r0 = r5.A0N
            android.content.SharedPreferences r1 = X.AnonymousClass11Q.A01(r0)
            java.lang.String r0 = "post_status_in_companion"
            boolean r0 = X.C17880vN.A1W(r1, r0)
            if (r0 == 0) goto L_0x0022
            X.0ve r2 = r5.A0Z
            r1 = 4905(0x1329, float:6.873E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 != 0) goto L_0x002b
        L_0x0022:
            com.whatsapp.status.StatusCompanionModeUnavailableDialogFragment r0 = new com.whatsapp.status.StatusCompanionModeUnavailableDialogFragment
            r0.<init>()
            X.C137086ut.A01(r0, r5)
            return
        L_0x002b:
            X.1hg r0 = r5.A0l
            r4 = 4
            r0.A07(r4)
            X.0ve r1 = r5.A0Z
            r0 = 7558(0x1d86, float:1.0591E-41)
            X.0vf r2 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r2, r1, r0)
            if (r0 == 0) goto L_0x0042
            r0 = 2
            r5.A04(r0)
            return
        L_0x0042:
            X.0ve r1 = r5.A0Z
            r0 = 9977(0x26f9, float:1.3981E-41)
            boolean r2 = X.C18020vd.A05(r2, r1, r0)
            android.content.Context r1 = r5.A14()
            r0 = 5
            if (r2 == 0) goto L_0x0053
            r0 = 22
        L_0x0053:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r1.getPackageName()
            java.lang.String r0 = "com.whatsapp.textstatuscomposer.TextStatusComposerActivityV2"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "camera_origin"
            r2.putExtra(r0, r4)
            if (r3 == 0) goto L_0x0074
            java.lang.String r1 = "entry_point"
            int r0 = r3.intValue()
            r2.putExtra(r1, r0)
        L_0x0074:
            r5.A1k(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.StatusesFragment.A03():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r2 == false) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A04(int r13) {
        /*
            r12 = this;
            X.0ve r2 = r12.A0Z
            r1 = 9977(0x26f9, float:1.3981E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r2 = X.C18020vd.A05(r0, r2, r1)
            r0 = 2
            r9 = r13
            if (r13 != r0) goto L_0x0012
            r1 = 22
            if (r2 != 0) goto L_0x0013
        L_0x0012:
            r1 = 5
        L_0x0013:
            android.content.Context r2 = r12.A14()
            X.1cg r0 = X.C29671cg.A00
            java.lang.String r7 = r0.getRawString()
            java.lang.Integer r4 = X.C17880vN.A0k()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            r3 = 0
            r10 = 32
            r11 = 9
            r5 = r4
            r8 = r3
            android.content.Intent r0 = X.AnonymousClass1LU.A0S(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.A1k(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.StatusesFragment.A04(int):void");
    }

    public static void A06(ListView listView, StatusesFragment statusesFragment) {
        if (statusesFragment.A1I == null) {
            statusesFragment.A1I = new Space(statusesFragment.A1n());
            statusesFragment.A1I.setLayoutParams(new AbsListView.LayoutParams(-1, AnonymousClass3MZ.A09(statusesFragment).getDimensionPixelSize(2131166996)));
        }
        listView.removeHeaderView(statusesFragment.A1I);
        listView.addHeaderView(statusesFragment.A1I);
    }

    public static void A07(StatusesFragment statusesFragment) {
        int i;
        int i2;
        View view = statusesFragment.A0B;
        if (view != null) {
            if (statusesFragment.A0k.A00()) {
                if (statusesFragment.A1K != null) {
                    AnonymousClass3MY.A1B(view, 2131431632, 0);
                    AnonymousClass3MY.A1B(view, 2131434939, 8);
                } else if (statusesFragment.A0H.A0y()) {
                    AnonymousClass3MY.A1B(view, 2131431632, 8);
                    AnonymousClass3MY.A1B(view, 2131434939, 8);
                    AnonymousClass3MY.A1B(view, 2131437067, 0);
                    AnonymousClass3MY.A1B(view, 2131435716, 8);
                    AnonymousClass3MY.A1B(view, 2131429490, 8);
                    TextView A0E2 = C17880vN.A0E(view, 2131437067);
                    Context context = A0E2.getContext();
                    String A1H2 = statusesFragment.A1H(2131898527);
                    A0E2.setText(C72813Np.A02(A0E2.getPaint(), AnonymousClass4aX.A08(AnonymousClass3MX.A06(context, 2131232140), AnonymousClass3Ma.A00(context, 2130971113, 2131102439)), A1H2, "%s"));
                    return;
                } else {
                    if (C72463Mc.A1W(statusesFragment.A0t)) {
                        ViewGroup A0C2 = AnonymousClass3MW.A0C(view, 2131435716);
                        if (A0C2.getChildCount() == 0) {
                            EmptyTellAFriendView emptyTellAFriendView = new EmptyTellAFriendView(statusesFragment.A1n());
                            A0C2.addView(emptyTellAFriendView);
                            emptyTellAFriendView.setInviteButtonClickListener(new C89974dK(statusesFragment, 39));
                        }
                        A0C2.setVisibility(0);
                        i2 = 2131429490;
                    } else {
                        ViewGroup A0D2 = AnonymousClass3MW.A0D(view, 2131429490);
                        if (A0D2.getChildCount() == 0) {
                            AnonymousClass3MZ.A0E(statusesFragment).inflate(2131625201, A0D2, true);
                            AnonymousClass48o.A00(A0D2.findViewById(2131428611), statusesFragment, 48);
                        }
                        A0D2.setVisibility(0);
                        i2 = 2131435716;
                    }
                    AnonymousClass3MY.A1B(view, i2, 8);
                    AnonymousClass3MY.A1B(view, 2131431632, 8);
                    AnonymousClass3MY.A1B(view, 2131434939, 8);
                    i = 2131437067;
                    AnonymousClass3MY.A1B(view, i, 8);
                }
            } else if (!TextUtils.isEmpty(statusesFragment.A19)) {
                AnonymousClass3MY.A1B(view, 2131431632, 8);
                AnonymousClass3MY.A1B(view, 2131434939, 0);
                C17880vN.A0E(view, 2131434939).setText(AnonymousClass3MX.A16(statusesFragment, statusesFragment.A19, new Object[1], 0, 2131895497));
            } else {
                return;
            }
            AnonymousClass3MY.A1B(view, 2131437067, 8);
            AnonymousClass3MY.A1B(view, 2131435716, 8);
            i = 2131429490;
            AnonymousClass3MY.A1B(view, i, 8);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0020, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r9.A0Z, 4905) == false) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A08(com.whatsapp.status.StatusesFragment r9) {
        /*
            X.11S r0 = r9.A0E
            boolean r0 = r0.A0N()
            if (r0 == 0) goto L_0x002b
            X.11Q r0 = r9.A0N
            android.content.SharedPreferences r1 = X.AnonymousClass11Q.A01(r0)
            java.lang.String r0 = "post_status_in_companion"
            boolean r0 = X.C17880vN.A1W(r1, r0)
            if (r0 == 0) goto L_0x0022
            X.0ve r2 = r9.A0Z
            r1 = 4905(0x1329, float:6.873E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 != 0) goto L_0x002b
        L_0x0022:
            com.whatsapp.status.StatusCompanionModeUnavailableDialogFragment r0 = new com.whatsapp.status.StatusCompanionModeUnavailableDialogFragment
            r0.<init>()
            X.C137086ut.A01(r0, r9)
        L_0x002a:
            return
        L_0x002b:
            X.1hg r1 = r9.A0l
            r0 = 3
            r1.A06(r0)
            X.17x r1 = r9.A0S
            r0 = 33
            boolean r0 = X.AnonymousClass74O.A0R(r9, r1, r0)
            if (r0 == 0) goto L_0x002a
            X.1Vi r6 = r9.A0G
            X.1FL r5 = r9.A1B()
            X.C17960vV.A07(r5)
            r4 = r5
            X.1FR r4 = (X.AnonymousClass1FR) r4
            X.1Gn r3 = r9.A1R
            r2 = 33
            r1 = 3659(0xe4b, float:5.127E-42)
            X.C18070vi.A0o(r5, r4, r3)
            X.17x r0 = r6.A00
            boolean r0 = X.AnonymousClass74O.A0J(r5, r0, r2)
            if (r0 == 0) goto L_0x002a
            boolean r0 = X.C27251Vi.A00(r5, r4, r6, r3, r1)
            if (r0 == 0) goto L_0x002a
            android.view.View r0 = r9.A02
            if (r0 == 0) goto L_0x006e
            X.0z4 r0 = r9.A0T
            r0.A16()
            android.view.View r1 = r9.A02
            r0 = 8
            r1.setVisibility(r0)
        L_0x006e:
            X.0ve r2 = r9.A0Z
            r1 = 7558(0x1d86, float:1.0591E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x007f
            r0 = 1
            r9.A04(r0)
            return
        L_0x007f:
            android.content.Context r1 = r9.A1n()
            X.1cg r0 = X.C29671cg.A00
            java.lang.String r3 = r0.getRawString()
            r5 = 4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            r4 = 0
            r8 = 0
            r6 = 32
            r7 = 9
            android.content.Intent r0 = X.AnonymousClass1LU.A1I(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.A1k(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.StatusesFragment.A08(com.whatsapp.status.StatusesFragment):void");
    }

    public static void A09(StatusesFragment statusesFragment) {
        Long l;
        AnonymousClass1KB r0 = statusesFragment.A0D;
        Runnable runnable = statusesFragment.A1W;
        r0.A0I(runnable);
        if (!statusesFragment.A0k.A00() && statusesFragment.A1B() != null) {
            C139186yN r5 = statusesFragment.A0k;
            Iterator it = r5.A02.iterator();
            Long l2 = null;
            if (it.hasNext()) {
                l2 = C108995ce.A0U(it);
                while (it.hasNext()) {
                    Long A0U2 = C108995ce.A0U(it);
                    if (l2.compareTo(A0U2) < 0) {
                        l2 = A0U2;
                    }
                }
            }
            long j = 0;
            if (l2 != null) {
                long longValue = l2.longValue();
                if (longValue < 0) {
                    longValue = 0;
                }
                j = longValue;
            }
            Iterator it2 = r5.A03.iterator();
            if (it2.hasNext()) {
                Long A0U3 = C108995ce.A0U(it2);
                while (it2.hasNext()) {
                    Long A0U4 = C108995ce.A0U(it2);
                    if (A0U3.compareTo(A0U4) < 0) {
                        A0U3 = A0U4;
                    }
                }
                if (A0U3 != null) {
                    long longValue2 = A0U3.longValue();
                    if (longValue2 < j) {
                        longValue2 = j;
                    }
                    j = longValue2;
                }
            }
            Iterator it3 = r5.A01.iterator();
            if (it3.hasNext()) {
                Long A0U5 = C108995ce.A0U(it3);
                loop2:
                while (true) {
                    l = A0U5;
                    while (true) {
                        if (!it3.hasNext()) {
                            break loop2;
                        }
                        A0U5 = C108995ce.A0U(it3);
                        if (l.compareTo(A0U5) < 0) {
                        }
                    }
                }
                if (l != null) {
                    long longValue3 = l.longValue();
                    if (longValue3 < j) {
                        longValue3 = j;
                    }
                    j = longValue3;
                }
            }
            C63372sx r02 = r5.A00;
            if (r02 != null) {
                long A042 = r02.A04();
                if (A042 < j) {
                    A042 = j;
                }
                j = A042;
            }
            C108995ce.A1B(statusesFragment.A0D, runnable, j);
        }
    }

    public void A1j() {
        Log.i("statusesFragment/onStop");
        super.A1j();
        ((AnonymousClass178) this.A12.get()).A02(this);
    }

    public void A1r() {
        Object value;
        Log.i("statusesFragment/onDestroy");
        super.A1r();
        C139586z5 r2 = this.A0j;
        C30141dS r1 = r2.A02;
        if (!r1.A00() && !C108985cd.A1Y(r1) && (value = r2.A05.getValue()) != null) {
            C108965cb.A1L(((AnonymousClass7FX) r2.A03.get()).A01, value);
        }
        C41821x7 A122 = C108945cZ.A12(this.A16);
        C136856uW r22 = (C136856uW) A122.A03.get();
        r22.A00 = null;
        r22.A03 = false;
        C17880vN.A0V(r22.A06).unregisterObserver(r22.A04);
        ((C55872gV) A122.A04.get()).A01 = null;
        this.A0K.A02();
        this.A0I.unregisterObserver(this.A1Q);
        this.A0V.unregisterObserver(this.A1S);
        C17880vN.A0V(this.A0x).unregisterObserver(this.A1T);
        C17880vN.A0V(this.A15).unregisterObserver(this.A1V);
        C17880vN.A0V(this.A0q).unregisterObserver(this.A1U);
        this.A0D.A0I(this.A1W);
        C17890vO.A0t(this.A1K);
        C17890vO.A0t(this.A0n);
        List list = this.A1O;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.A0R.A00.revokeUriPermission(C108945cZ.A0M(it), 1);
        }
        list.clear();
    }

    public void A1t() {
        Log.i("statusesFragment/onPause");
        ((C41701wv) this.A0y.get()).A03.A09(this);
        this.A0m.A04();
        C90594eK r0 = this.A0c;
        if (r0 != null) {
            r0.A01();
        }
        super.A1t();
    }

    public void A1v() {
        Log.i("statusesFragment/onStart");
        super.A1v();
        if (this.A09.A00) {
            A02();
        }
        ((AnonymousClass178) this.A12.get()).A01(this);
        ((C136856uW) C108945cZ.A12(this.A16).A03.get()).A03();
        A09(this);
    }

    public void A1w(int i, int i2, Intent intent) {
        C56092gt r0;
        if (i != 33) {
            if (i == 35) {
                if (this.A1D) {
                    C139586z5 r2 = this.A0j;
                    ((AnonymousClass7FX) r2.A03.get()).A02();
                    r2.A01().A03 = true;
                    r2.A01().A04 = false;
                    C139586z5.A00(r2);
                }
                this.A0l.A04();
                if (this.A1D) {
                    ((C41701wv) this.A0y.get()).A01(intent);
                }
            } else if (i != 151) {
            } else {
                if (i2 == -1) {
                    A0B(this, ((AnonymousClass7FX) this.A0j.A03.get()).A01(), this.A1D);
                } else if (i2 == 0 && (r0 = this.A0l.A00) != null) {
                    r0.A01 = 4;
                }
            }
        } else if (i2 == -1) {
            A08(this);
        }
    }

    public void A1y(Bundle bundle) {
        boolean z;
        String str;
        Log.i("statusesFragment/onActivityCreated");
        C108955ca.A0Z(this).A02.A0E.markerPoint(453128091, 1, "CREATE_ACTIVITY_START");
        this.A0X = true;
        A1Z(true);
        ListFragment.A00(this);
        ListView listView = this.A04;
        listView.setFastScrollEnabled(false);
        listView.setScrollbarFadingEnabled(true);
        listView.setOnItemClickListener(new AnonymousClass6L7(this.A0Q, this));
        listView.setOnItemLongClickListener(new AnonymousClass79M(this, 2));
        if (!C17890vO.A0B(this.A0T).getBoolean("show_statuses_education", true) || this.A0E.A0N()) {
            this.A0g.A00.get();
            A06(listView, this);
        } else {
            C24621La r9 = this.A0Y.A04;
            AnonymousClass1DT A0S2 = C108945cZ.A0S();
            synchronized (r9.A01) {
                Map map = r9.A02;
                if (map.containsKey("status_distribution")) {
                    str = C17880vN.A0s("status_distribution", map);
                    z = true;
                } else {
                    z = false;
                    str = null;
                }
            }
            if (z) {
                A0S2.A0E(str);
            } else {
                r9.A00.CGF(new C21467AkY(A0S2, r9));
            }
            C22791Df.A01(A0S2, new AnonymousClass7S5(1)).A0A(A1G(), new AnonymousClass7AH(listView, this, 17));
        }
        AnonymousClass3MY.A1B(A17(), 2131431632, 0);
        C110285fE r0 = new C110285fE(this);
        this.A0e = r0;
        A25(r0);
        this.A0I.registerObserver(this.A1Q);
        this.A0V.registerObserver(this.A1S);
        C17880vN.A0V(this.A0x).registerObserver(this.A1T);
        C17880vN.A0V(this.A15).registerObserver(this.A1V);
        C17880vN.A0V(this.A0q).registerObserver(this.A1U);
        ((C136856uW) C108945cZ.A12(this.A16).A03.get()).A01();
        A27();
        AnonymousClass19Y r2 = C108955ca.A0Z(this).A02.A0E;
        r2.markerPoint(453128091, 1, "CREATE_ACTIVITY_END");
        r2.markerEnd(453128091, 1, 2);
    }

    public void A1z(Bundle bundle) {
        Object value;
        Log.i("statusesFragment/onCreate");
        C108955ca.A0Z(this).A01();
        this.A0K = this.A0L.A06(A1n(), "status-fragment");
        super.A1z(bundle);
        AnonymousClass1KB r5 = this.A0D;
        AnonymousClass10I r8 = this.A0p;
        this.A1J = new AnonymousClass7AE(this, r5, this.A0W, this.A0Y, r8);
        ArrayList A132 = AnonymousClass000.A13();
        A132.add(A1D().findViewById(2131430767));
        A132.add(A1D().findViewById(2131430769));
        boolean z = true;
        View view = (View) A132.get(1);
        if (view != null && (view instanceof ImageView)) {
            if (C18020vd.A05(C18040vf.A01, this.A0Z, 1874)) {
                this.A0f = new C40071u7((ImageView) view, this.A0D, this.A0P, this.A0T, this.A0p);
            }
        }
        this.A1H = true;
        if (bundle == null || !bundle.getBoolean("SHARE_CTA_VISIBILITY_SI_KEY", false)) {
            z = false;
        }
        this.A0r.get();
        this.A0r.get();
        C139586z5 A002 = this.A0B.A00(AnonymousClass00R.A00, z);
        this.A0j = A002;
        C30141dS r1 = A002.A02;
        if (!r1.A00() && !C108985cd.A1Y(r1) && (value = A002.A05.getValue()) != null) {
            C72453Mb.A1Q(((AnonymousClass7FX) A002.A03.get()).A01, value);
        }
        if (bundle != null) {
            this.A1D = bundle.getBoolean("WAS_FB_SHARE_BUTTON_ATTEMPTED_SI_KEY", false);
        }
        if (C108985cd.A1a(this.A17)) {
            ((C55872gV) C108945cZ.A12(this.A16).A04.get()).A01 = new AnonymousClass7PJ(this, 0);
        }
        this.A0h.A00.get();
        C108955ca.A0Z(this).A00();
    }

    public void A20(Bundle bundle) {
        bundle.putBoolean("WAS_FB_SHARE_BUTTON_ATTEMPTED_SI_KEY", this.A1D);
        bundle.putBoolean("SHARE_CTA_VISIBILITY_SI_KEY", this.A0j.A01.A04);
    }

    public void A22(Menu menu, MenuInflater menuInflater) {
        if (!this.A0E.A0N()) {
            menu.add(2, 2131432640, 0, 2131899454).setIcon(C50142Th.A00(this, 2131232070));
        }
        this.A0h.A00.get();
    }

    public void BCQ(C23471Gk r2) {
        this.A19 = r2.A02;
        C110285fE.A00(this);
    }

    public C23401Fx BPx() {
        return this.A0L.A02;
    }

    public void CKa(boolean z) {
        this.A1F = z;
        C110285fE.A00(this);
    }

    public void CKd(boolean z, boolean z2) {
        this.A1G = z;
        if (z) {
            C19830z4 r1 = this.A0T;
            C17880vN.A1D(C19830z4.A00(r1), "status_tab_last_opened_time", AnonymousClass11P.A01(this.A0Q));
            AnonymousClass3MX.A0u(this.A0u).A02((AnonymousClass1BI) null, 17);
            A02();
            if (C18020vd.A05(C18040vf.A02, this.A0Z, 249)) {
                this.A0p.CGF(new AnonymousClass7RH(this, 3));
            }
            C40071u7 r0 = this.A0f;
            if (r0 != null) {
                r0.A00();
                return;
            }
            return;
        }
        C139586z5 r2 = this.A0j;
        if (r2.A01().A04) {
            ((AnonymousClass7FX) r2.A03.get()).A02();
            C56092gt r02 = ((C32741hg) r2.A04.get()).A00;
            if (r02 != null) {
                r02.A00 = 1;
            }
            r2.A01().A03 = false;
            r2.A01().A04 = false;
            C139586z5.A00(r2);
        }
        this.A0l.A04();
        if (this.A1H) {
            this.A1E = true;
            C110285fE.A00(this);
        }
        this.A0p.CGF(new AnonymousClass7RH(this, 2));
        if (C108985cd.A1a(this.A17)) {
            ((C136856uW) C108945cZ.A12(this.A16).A03.get()).A02();
        }
    }

    public static void A05(Animator.AnimatorListener animatorListener, StatusesFragment statusesFragment, boolean z) {
        View view;
        ArrayList A132 = AnonymousClass000.A13();
        for (int i = 0; i < statusesFragment.A0e.getCount(); i++) {
            if (statusesFragment.A0e.getItemViewType(i) == 0) {
                AnonymousClass7M5 r3 = (AnonymousClass7M5) ((C1603187z) statusesFragment.A0e.A03.A1B.get(i));
                AnonymousClass1Nb r2 = statusesFragment.A0b;
                UserJid userJid = r3.A01.A0A;
                if (!(!r2.A0a(userJid).A0U || userJid == AnonymousClass1E5.A00 || (view = r3.A00) == null)) {
                    if (z) {
                        view.measure(0, 0);
                    }
                    int measuredHeight = view.getMeasuredHeight();
                    int[] A1W2 = C108945cZ.A1W();
                    if (z) {
                        A1W2[0] = 0;
                        A1W2[1] = measuredHeight;
                    } else {
                        A1W2[0] = measuredHeight;
                        A1W2[1] = 0;
                    }
                    ValueAnimator ofInt = ValueAnimator.ofInt(A1W2);
                    ofInt.addListener(new C109045cj(view, measuredHeight, 0));
                    ofInt.addUpdateListener(new C1410574c(1, view, z));
                    A132.add(ofInt);
                }
            }
        }
        AnimatorSet A0B2 = C108945cZ.A0B();
        statusesFragment.A00 = A0B2;
        C108955ca.A1A(A0B2);
        statusesFragment.A00.setDuration(250);
        statusesFragment.A00.addListener(animatorListener);
        statusesFragment.A00.playTogether(A132);
        statusesFragment.A00.start();
    }

    public static void A0A(StatusesFragment statusesFragment, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C134116q4) statusesFragment.A0z.get()).A00(statusesFragment.A0W.A03(((C63372sx) it.next()).A0A));
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Iterator it3 = statusesFragment.A0W.A04(((C63372sx) it2.next()).A0A, -1).iterator();
            while (it3.hasNext()) {
                ((C134116q4) statusesFragment.A0z.get()).A00(C17880vN.A0Y(it3));
            }
        }
    }

    public static boolean A0C(AnonymousClass1BI r2, StatusesFragment statusesFragment) {
        if (!C22971Dz.A0d(r2) || !statusesFragment.A0e.A02.containsKey(C22941Dw.A00(r2))) {
            return false;
        }
        return true;
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C39991ty A0Z2 = C108955ca.A0Z(this);
        A0Z2.A01.A09("StatusesFragment_onCreateView");
        A0Z2.A02.A0E.markerPoint(453128091, 1, "CREATE_VIEW_START");
        View inflate = layoutInflater.inflate(2131627086, viewGroup, false);
        ObservableListView observableListView = (ObservableListView) AnonymousClass1HF.A06(inflate, 16908298);
        C39991ty A0Z3 = C108955ca.A0Z(this);
        C18070vi.A0d(observableListView, 0);
        observableListView.A09.A02(A0Z3);
        observableListView.A08.A02(A0Z3);
        C38561rU.A00(inflate, this);
        C39991ty A0Z4 = C108955ca.A0Z(this);
        A0Z4.A01.A08("StatusesFragment_onCreateView");
        A0Z4.A02.A0E.markerPoint(453128091, 1, "CREATE_VIEW_END");
        return inflate;
    }

    public void A1u() {
        C108955ca.A0Z(this).A01.A09("StatusesFragment_onResume");
        Log.i("statusesFragment/onResume");
        super.A1u();
        this.A0m.A03();
        AnonymousClass7AP.A00(this, ((C41701wv) this.A0y.get()).A03, 17);
        this.A0M.A01(this);
        C108955ca.A0Z(this).A01.A08("StatusesFragment_onResume");
    }

    public void A21(Bundle bundle, View view) {
        ListFragment.A00(this);
        boolean A052 = C18020vd.A05(C18040vf.A02, this.A0Z, 7724);
        C36431ns r2 = this.A0M;
        ListFragment.A00(this);
        ListView listView = this.A04;
        int i = 2131625153;
        if (A052) {
            i = 2131625154;
        }
        View A002 = r2.A00(this, i);
        if (A002 != null) {
            listView.addFooterView(A002);
        }
        ListFragment.A00(this);
        ListView listView2 = this.A04;
        int dimensionPixelSize = AnonymousClass3MZ.A09(this).getDimensionPixelSize(2131168897);
        C18070vi.A0d(listView2, 0);
        C39451t6 r1 = new C39451t6(AnonymousClass3MY.A04(listView2), dimensionPixelSize);
        r1.setImportantForAccessibility(2);
        listView2.addFooterView(r1, (Object) null, false);
    }

    public void A23(boolean z) {
        super.A23(z);
        if (this.A04 >= 7 && z) {
            this.A0M.A01(this);
        }
    }

    public boolean A24(MenuItem menuItem) {
        if (menuItem.getItemId() == 2131432600) {
            A08(this);
            return true;
        } else if (menuItem.getItemId() == 2131432640) {
            A1k(AnonymousClass1LU.A06(A1n()));
            return true;
        } else if (menuItem.getItemId() == 2131432601) {
            A03();
            return true;
        } else if (this.A05.A07()) {
            menuItem.getItemId();
            this.A07.A03();
            throw AnonymousClass000.A0s("getMenuItemBusinessToolsId");
        } else {
            this.A0h.A00.get();
            return false;
        }
    }

    public /* synthetic */ boolean BBu() {
        return false;
    }

    public /* synthetic */ boolean BLg() {
        return false;
    }

    public String BSb() {
        return "status_fragment";
    }

    public String BUK() {
        return A1H(2131899161);
    }

    public Drawable BUL() {
        return AnonymousClass4aX.A04(A1n(), A14(), 2130971957, 2131103410, 2131232195);
    }

    public /* synthetic */ RecyclerView BY0() {
        return null;
    }

    public C18180vt BYS() {
        return C19620yd.A01;
    }

    public String BYl() {
        return A1H(2131892003);
    }

    public Drawable BYm() {
        return AnonymousClass4aX.A04(A1n(), A14(), 2130969548, 2131100584, 2131231876);
    }

    public /* synthetic */ String BYn() {
        return null;
    }

    public /* synthetic */ boolean Buz() {
        return false;
    }

    public void C4p() {
        A03();
    }

    public /* synthetic */ boolean C4q() {
        return false;
    }

    public /* synthetic */ boolean isEmpty() {
        return false;
    }

    public /* synthetic */ void BxX(int i, int i2) {
        A08(this);
    }
}
