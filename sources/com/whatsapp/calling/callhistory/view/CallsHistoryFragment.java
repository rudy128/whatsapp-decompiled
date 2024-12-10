package com.whatsapp.calling.callhistory.view;

import X.A09;
import X.AnonymousClass00H;
import X.AnonymousClass01E;
import X.AnonymousClass02B;
import X.AnonymousClass02H;
import X.AnonymousClass10I;
import X.AnonymousClass11C;
import X.AnonymousClass11P;
import X.AnonymousClass11S;
import X.AnonymousClass11T;
import X.AnonymousClass126;
import X.AnonymousClass1BI;
import X.AnonymousClass1Bd;
import X.AnonymousClass1DC;
import X.AnonymousClass1E7;
import X.AnonymousClass1EC;
import X.AnonymousClass1FL;
import X.AnonymousClass1FU;
import X.AnonymousClass1HS;
import X.AnonymousClass1KB;
import X.AnonymousClass1L9;
import X.AnonymousClass1LU;
import X.AnonymousClass1M9;
import X.AnonymousClass1MZ;
import X.AnonymousClass1TA;
import X.AnonymousClass1TD;
import X.AnonymousClass1V9;
import X.AnonymousClass1VP;
import X.AnonymousClass1Xr;
import X.AnonymousClass1Y5;
import X.AnonymousClass28K;
import X.AnonymousClass28W;
import X.AnonymousClass2G9;
import X.AnonymousClass2PJ;
import X.AnonymousClass3C8;
import X.AnonymousClass74O;
import X.C1408673j;
import X.C178119Bw;
import X.C17960vV;
import X.C18000vb;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C192539oZ;
import X.C192619oh;
import X.C194279rT;
import X.C195199sx;
import X.C19880zA;
import X.C22941Dw;
import X.C22971Dz;
import X.C23471Gk;
import X.C23571Gu;
import X.C23661Hd;
import X.C24001Il;
import X.C24261Jm;
import X.C24901Mc;
import X.C27081Uq;
import X.C27201Vd;
import X.C28931bI;
import X.C29201bm;
import X.C30191dX;
import X.C30361do;
import X.C34011jl;
import X.C34031jn;
import X.C34041jo;
import X.C35401mB;
import X.C35411mC;
import X.C35421mD;
import X.C35431mE;
import X.C35441mF;
import X.C35451mG;
import X.C35471mI;
import X.C35481mJ;
import X.C36271nc;
import X.C36401np;
import X.C36431ns;
import X.C37451pZ;
import X.C37911qO;
import X.C38391rD;
import X.C40751vD;
import X.C40811vJ;
import X.C40971vb;
import X.C41121vq;
import X.C41261w4;
import X.C42941yz;
import X.C449025f;
import X.C49822Sb;
import X.C50142Th;
import X.C61472pk;
import X.C66552yM;
import X.C66562yN;
import X.C70483Bg;
import X.C70563Bp;
import X.C87384Vj;
import X.C89444cT;
import X.C92744hq;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.EmptyTellAFriendView;
import com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentViewModel;
import com.whatsapp.calling.fragment.CallConfirmationFragment;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public class CallsHistoryFragment extends Hilt_CallsHistoryFragment implements C34011jl, C29201bm, C34031jn, C34041jo {
    public View A00;
    public View A01;
    public AnonymousClass02B A02;
    public RecyclerView A03;
    public C19880zA A04;
    public C19880zA A05;
    public C19880zA A06;
    public AnonymousClass1L9 A07;
    public AnonymousClass1KB A08;
    public AnonymousClass11S A09;
    public C36271nc A0A;
    public C40751vD A0B;
    public CallsHistoryFragmentViewModel A0C;
    public AnonymousClass1VP A0D;
    public AnonymousClass1V9 A0E;
    public AnonymousClass1HS A0F;
    public AnonymousClass1M9 A0G;
    public C37451pZ A0H;
    public C37451pZ A0I;
    public C27201Vd A0J;
    public C36431ns A0K;
    public AnonymousClass11C A0L;
    public AnonymousClass11P A0M;
    public C18000vb A0N;
    public AnonymousClass1TD A0O;
    public AnonymousClass1MZ A0P;
    public AnonymousClass1TA A0Q;
    public C27081Uq A0R;
    public C23661Hd A0S;
    public C18030ve A0T;
    public AnonymousClass126 A0U;
    public AnonymousClass1Bd A0V;
    public C24901Mc A0W;
    public C36401np A0X;
    public AnonymousClass1DC A0Y;
    public C28931bI A0Z;
    public C28931bI A0a;
    public C28931bI A0b;
    public C28931bI A0c;
    public C28931bI A0d;
    public C28931bI A0e;
    public AnonymousClass10I A0f;
    public AnonymousClass00H A0g;
    public AnonymousClass00H A0h;
    public AnonymousClass00H A0i;
    public AnonymousClass00H A0j;
    public AnonymousClass00H A0k;
    public AnonymousClass00H A0l;
    public AnonymousClass00H A0m;
    public AnonymousClass00H A0n;
    public AnonymousClass00H A0o;
    public AnonymousClass00H A0p;
    public AnonymousClass00H A0q;
    public AnonymousClass00H A0r;
    public boolean A0s;
    public boolean A0t = false;
    public boolean A0u = true;
    public boolean A0v = false;
    public C28931bI[] A0w;
    public C37911qO A0x;
    public C28931bI A0y;
    public CharSequence A0z = "";
    public boolean A10 = false;
    public final C35401mB A11 = new C35401mB(this);
    public final C35411mC A12 = new C35411mC(this);
    public final C35421mD A13 = new C35421mD(this);
    public final C35441mF A14 = new C35441mF(this);
    public final C35451mG A15 = new C35451mG(this);
    public final C35471mI A16 = new C35471mI(this);
    public final C35481mJ A17 = new C35481mJ(this);
    public final Runnable A18 = new C449025f((Object) this, 28);
    public final HashMap A19 = new HashMap();
    public final HashMap A1A = new HashMap();
    public final AnonymousClass02H A1B = new C35431mE(this);

    public static void A0A(CallsHistoryFragment callsHistoryFragment, AnonymousClass1E7 r7, long j) {
        String str;
        CallsHistoryFragment callsHistoryFragment2 = callsHistoryFragment;
        Context A1n = callsHistoryFragment.A1n();
        if (A1n == null) {
            str = "CallsHistoryFragmentV2/openPrecallLobby context is null";
        } else {
            AnonymousClass1BI r1 = r7.A0J;
            Parcelable.Creator creator = AnonymousClass1EC.CREATOR;
            AnonymousClass1EC A002 = C42941yz.A00(r1);
            if (A002 == null) {
                str = "CallsHistoryFragmentV2/openPrecallLobby group jid is null";
            } else {
                callsHistoryFragment.A0f.CGN(new AnonymousClass3C8(callsHistoryFragment2, A1n, A002, 1, j));
                return;
            }
        }
        Log.w(str);
    }

    public void A1w(int i, int i2, Intent intent) {
        if (i2 == -1) {
            boolean z = false;
            if (i != 10) {
                if (i == 150) {
                    this.A0s = true;
                    A03();
                } else if (i == 157) {
                    this.A0s = true;
                    A00(this, false);
                }
            } else if (intent != null) {
                ((C195199sx) this.A0q.get()).A01();
                try {
                    String stringExtra = intent.getStringExtra("contact");
                    C22941Dw r0 = UserJid.Companion;
                    UserJid A032 = C22941Dw.A03(stringExtra);
                    int intExtra = intent.getIntExtra("call_type", 1);
                    AnonymousClass1VP r3 = this.A0D;
                    AnonymousClass1E7 A0H2 = this.A0G.A0H(A032);
                    AnonymousClass1FL A1D = A1D();
                    if (intExtra == 2) {
                        z = true;
                    }
                    r3.CNw(A1D, A0H2, 3, z);
                } catch (AnonymousClass11T unused) {
                    Log.e("callsHistory/callPicker failed to get selected contact");
                }
            }
        }
    }

    public /* synthetic */ void BBR(C23571Gu r2) {
        C18070vi.A0d(r2, 1);
        r2.BlE();
    }

    public boolean BBu() {
        return true;
    }

    public void BIh() {
        this.A0u = false;
    }

    public void BJx() {
        this.A0u = true;
    }

    public boolean BLg() {
        return true;
    }

    public String BUM() {
        return null;
    }

    public int Ba6() {
        return 400;
    }

    public String BaZ() {
        return null;
    }

    public /* synthetic */ void CI2(ImageView imageView) {
        C49822Sb.A00(imageView);
    }

    public /* synthetic */ void CKb() {
    }

    public boolean COp() {
        return true;
    }

    public static int A00(CallsHistoryFragment callsHistoryFragment, boolean z) {
        if (!((C30191dX) callsHistoryFragment.A0i.get()).A00()) {
            if (!C18020vd.A05(C18040vf.A02, callsHistoryFragment.A0T, 5868)) {
                if (!z || callsHistoryFragment.A1n() == null) {
                    return 0;
                }
                callsHistoryFragment.startActivityForResult(AnonymousClass74O.A02(callsHistoryFragment.A14(), 2131894325, 2131894326, false), 157);
                return 0;
            }
        }
        callsHistoryFragment.A0E.A00(38, 15);
        callsHistoryFragment.A0r.get();
        Context A142 = callsHistoryFragment.A14();
        Intent intent = new Intent();
        intent.setClassName(A142.getPackageName(), "com.whatsapp.calling.favorite.FavoritePicker");
        callsHistoryFragment.A1k(intent);
        return 0;
    }

    private void A03() {
        this.A0r.get();
        AnonymousClass1FL A1B2 = A1B();
        C18070vi.A0d(A1B2, 1);
        boolean z = true;
        if (!this.A0s || this.A09.A0N()) {
            z = false;
        }
        Boolean valueOf = Boolean.valueOf(z);
        Intent intent = new Intent();
        intent.setClassName(A1B2.getPackageName(), "com.whatsapp.contact.picker.ContactPicker");
        intent.putExtra("source_surface", 1);
        intent.putExtra("call_picker", true);
        if (valueOf != null) {
            intent.putExtra("request_sync", valueOf);
        }
        startActivityForResult(intent, 10);
        this.A0s = false;
    }

    public static void A05(View view, CallsHistoryFragment callsHistoryFragment, AnonymousClass1BI r4) {
        callsHistoryFragment.A0r.get();
        A09 a09 = new A09(view, r4, 6);
        a09.A02 = AnonymousClass1Xr.A02(view);
        a09.A01(callsHistoryFragment.A1B());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003b, code lost:
        if (X.C40811vJ.A0E(r2.A0O, r2.A0h) == false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A09(com.whatsapp.calling.callhistory.view.CallsHistoryFragment r3, int r4) {
        /*
            X.0ve r2 = r3.A0T
            if (r2 == 0) goto L_0x0010
            X.0vf r1 = X.C18040vf.A01
            r0 = 11202(0x2bc2, float:1.5697E-41)
            boolean r1 = X.C18020vd.A05(r1, r2, r0)
            r0 = 1
            if (r1 != r0) goto L_0x0010
        L_0x000f:
            return
        L_0x0010:
            boolean r0 = r3.A1b()
            if (r0 == 0) goto L_0x000f
            android.view.View r0 = r3.A0B
            if (r0 == 0) goto L_0x000f
            r0 = 1
            if (r4 == r0) goto L_0x003d
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentViewModel r0 = r3.A0C
            boolean r0 = r0.A0c()
            if (r0 != 0) goto L_0x003d
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentViewModel r2 = r3.A0C
            X.2yF r0 = r2.A02
            if (r0 == 0) goto L_0x0059
            java.util.ArrayList r0 = r2.A0E
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0059
            X.0ve r1 = r2.A0h
            X.11S r0 = r2.A0O
            boolean r0 = X.C40811vJ.A0E(r0, r1)
            if (r0 != 0) goto L_0x0059
        L_0x003d:
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentViewModel r0 = r3.A0C
            java.util.ArrayList r0 = r0.A0p
            boolean r2 = r0.isEmpty()
            android.content.Context r0 = r3.A14()
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131167215(0x7f0707ef, float:1.7948697E38)
            if (r2 == 0) goto L_0x0055
            r0 = 2131166996(0x7f070714, float:1.7948253E38)
        L_0x0055:
            r1.getDimensionPixelSize(r0)
            return
        L_0x0059:
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentViewModel r0 = r3.A0C
            X.2yK r1 = r0.A05
            if (r1 == 0) goto L_0x0068
            java.util.ArrayList r0 = r0.A0E
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0068
            goto L_0x003d
        L_0x0068:
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentViewModel r1 = r3.A0C
            X.2yG r0 = r1.A03
            if (r0 == 0) goto L_0x000f
            java.util.ArrayList r0 = r1.A0E
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x000f
            goto L_0x003d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.callhistory.view.CallsHistoryFragment.A09(com.whatsapp.calling.callhistory.view.CallsHistoryFragment, int):void");
    }

    public static boolean A0C(C41121vq r1) {
        if (r1 instanceof C66562yN) {
            return ((C66562yN) r1).A02;
        }
        if (r1 instanceof C66552yM) {
            return ((C66552yM) r1).A02;
        }
        return false;
    }

    public static boolean A0D(CallsHistoryFragment callsHistoryFragment) {
        if (!callsHistoryFragment.A1A.isEmpty() || !callsHistoryFragment.A19.isEmpty()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003c, code lost:
        if (r0 != false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
        if (r8.getBoolean("request_sync", false) == false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View A1q(android.os.Bundle r8, android.view.LayoutInflater r9, android.view.ViewGroup r10) {
        /*
            r7 = this;
            X.1Bd r0 = r7.A0V
            java.lang.String r3 = "CallsHistoryFragmentV2_onCreateView"
            r0.A09(r3)
            java.lang.String r0 = "CallsHistoryFragmentV2/onCreateView"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r4 = 0
            if (r8 == 0) goto L_0x0018
            java.lang.String r0 = "request_sync"
            boolean r1 = r8.getBoolean(r0, r4)
            r0 = 1
            if (r1 != 0) goto L_0x0019
        L_0x0018:
            r0 = 0
        L_0x0019:
            r7.A0s = r0
            X.0ve r2 = r7.A0T
            if (r2 == 0) goto L_0x0060
            X.0vf r1 = X.C18040vf.A01
            r0 = 11291(0x2c1b, float:1.5822E-41)
            boolean r6 = X.C18020vd.A05(r1, r2, r0)
        L_0x0027:
            X.0ve r5 = r7.A0T
            X.11S r2 = r7.A09
            r1 = 9148(0x23bc, float:1.2819E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r5, r1)
            if (r0 != 0) goto L_0x003e
            boolean r0 = X.C40811vJ.A0D(r2, r5)
            r2 = 2132083060(0x7f150174, float:1.9806252E38)
            if (r0 == 0) goto L_0x0041
        L_0x003e:
            r2 = 2132083061(0x7f150175, float:1.9806254E38)
        L_0x0041:
            android.content.Context r1 = r7.A14()
            X.01k r0 = new X.01k
            r0.<init>(r1, r2)
            android.view.LayoutInflater r1 = r9.cloneInContext(r0)
            r0 = 2131624467(0x7f0e0213, float:1.8876115E38)
            if (r6 == 0) goto L_0x0056
            r0 = 2131624468(0x7f0e0214, float:1.8876117E38)
        L_0x0056:
            android.view.View r1 = r1.inflate(r0, r10, r4)
            X.1Bd r0 = r7.A0V
            r0.A08(r3)
            return r1
        L_0x0060:
            r6 = 0
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.callhistory.view.CallsHistoryFragment.A1q(android.os.Bundle, android.view.LayoutInflater, android.view.ViewGroup):android.view.View");
    }

    public void A1u() {
        this.A0V.A09("CallsHistoryFragmentV2_onResume");
        this.A0X = true;
        this.A0C.A0X();
        this.A0V.A08("CallsHistoryFragmentV2_onResume");
    }

    public void A20(Bundle bundle) {
        bundle.putBoolean("request_sync", this.A0s);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0096, code lost:
        if (r0 != false) goto L_0x0098;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A21(android.os.Bundle r9, android.view.View r10) {
        /*
            r8 = this;
            java.lang.String r0 = "CallsHistoryFragmentV2/onViewCreated"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1It r1 = new X.1It
            r1.<init>(r8)
            java.lang.Class<com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentViewModel> r0 = com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentViewModel.class
            X.1J2 r0 = r1.A00(r0)
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentViewModel r0 = (com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentViewModel) r0
            r8.A0C = r0
            X.1vp r2 = r0.A0k
            X.1q9 r1 = r8.A1G()
            r6 = 2
            X.2vi r0 = new X.2vi
            r0.<init>(r8, r6)
            r2.A0A(r1, r0)
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentViewModel r0 = r8.A0C
            X.1DT r2 = r0.A0M
            X.1q9 r1 = r8.A1G()
            r5 = 3
            X.2vi r0 = new X.2vi
            r0.<init>(r8, r5)
            r2.A0A(r1, r0)
            X.1FL r0 = r8.A1B()
            android.content.Intent r0 = r0.getIntent()
            r3 = 1
            if (r0 == 0) goto L_0x0064
            java.lang.String r1 = X.C28901bF.A01
            X.1FL r0 = r8.A1B()
            android.content.Intent r0 = r0.getIntent()
            java.lang.String r0 = r0.getAction()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0064
            X.0ve r2 = r8.A0T
            r1 = 8656(0x21d0, float:1.213E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0064
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentViewModel r0 = r8.A0C
            r0.A0b(r3)
        L_0x0064:
            android.view.View r1 = r8.A17()
            r0 = 2131428771(0x7f0b05a3, float:1.8479196E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r1, r0)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            r8.A03 = r0
            X.1Vd r2 = r8.A0J
            android.content.Context r1 = r8.A14()
            java.lang.String r0 = "calls-fragment-single"
            X.1pZ r0 = r2.A06(r1, r0)
            r8.A0I = r0
            X.0ve r2 = r8.A0T
            X.11S r1 = r8.A09
            r0 = 9148(0x23bc, float:1.2819E-41)
            X.0vf r4 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r4, r2, r0)
            if (r0 != 0) goto L_0x0098
            boolean r0 = X.C40811vJ.A0D(r1, r2)
            r1 = 2131168739(0x7f070de3, float:1.7951788E38)
            if (r0 == 0) goto L_0x009b
        L_0x0098:
            r1 = 2131166076(0x7f07037c, float:1.7946387E38)
        L_0x009b:
            X.1Vd r7 = r8.A0J
            android.content.Context r0 = r8.A14()
            android.content.res.Resources r0 = r0.getResources()
            int r2 = r0.getDimensionPixelSize(r1)
            r1 = 0
            java.lang.String r0 = "calls-fragment-multi"
            X.1pZ r0 = r7.A08(r0, r1, r2)
            r8.A0H = r0
            androidx.recyclerview.widget.RecyclerView r2 = r8.A03
            X.1FL r1 = r8.A1B()
            androidx.recyclerview.widget.LinearLayoutManager r0 = new androidx.recyclerview.widget.LinearLayoutManager
            r0.<init>(r1)
            r2.setLayoutManager(r0)
            androidx.recyclerview.widget.RecyclerView r1 = r8.A03
            X.00H r0 = r8.A0m
            java.lang.Object r0 = r0.get()
            X.1rD r0 = (X.C38391rD) r0
            r1.setAdapter(r0)
            X.00H r0 = r8.A0m
            java.lang.Object r1 = r0.get()
            X.1w4 r1 = (X.C41261w4) r1
            X.1mB r0 = r8.A11
            r1.A00 = r0
            X.00H r0 = r8.A0m
            java.lang.Object r1 = r0.get()
            X.1w4 r1 = (X.C41261w4) r1
            X.1mC r0 = r8.A12
            r1.A01 = r0
            X.00H r0 = r8.A0m
            java.lang.Object r1 = r0.get()
            X.1w4 r1 = (X.C41261w4) r1
            X.1mD r0 = r8.A13
            r1.A02 = r0
            X.00H r0 = r8.A0m
            java.lang.Object r1 = r0.get()
            X.1w4 r1 = (X.C41261w4) r1
            X.1pZ r0 = r8.A0I
            r1.A08 = r0
            X.00H r0 = r8.A0m
            java.lang.Object r1 = r0.get()
            X.1w4 r1 = (X.C41261w4) r1
            X.1pZ r0 = r8.A0H
            r1.A07 = r0
            X.00H r0 = r8.A0m
            java.lang.Object r1 = r0.get()
            X.1w4 r1 = (X.C41261w4) r1
            java.lang.Runnable r0 = r8.A18
            r1.A09 = r0
            X.00H r0 = r8.A0m
            java.lang.Object r1 = r0.get()
            X.1w4 r1 = (X.C41261w4) r1
            java.util.HashMap r0 = r8.A1A
            java.util.Set r0 = r0.keySet()
            r2 = 0
            X.C18070vi.A0d(r0, r2)
            r1.A0B = r0
            X.00H r0 = r8.A0m
            java.lang.Object r1 = r0.get()
            X.1w4 r1 = (X.C41261w4) r1
            java.util.HashMap r0 = r8.A19
            java.util.Set r0 = r0.keySet()
            X.C18070vi.A0d(r0, r2)
            r1.A0A = r0
            X.00H r0 = r8.A0m
            java.lang.Object r1 = r0.get()
            X.1w4 r1 = (X.C41261w4) r1
            X.1mF r0 = r8.A14
            r1.A03 = r0
            X.00H r0 = r8.A0m
            java.lang.Object r1 = r0.get()
            X.1w4 r1 = (X.C41261w4) r1
            X.1mI r0 = r8.A16
            r1.A05 = r0
            X.00H r0 = r8.A0m
            java.lang.Object r7 = r0.get()
            X.1w4 r7 = (X.C41261w4) r7
            r1 = 17
            X.3Dm r0 = new X.3Dm
            r0.<init>(r8, r1)
            r7.A0C = r0
            X.00H r0 = r8.A0m
            java.lang.Object r7 = r0.get()
            X.1w4 r7 = (X.C41261w4) r7
            r1 = 18
            X.3Dm r0 = new X.3Dm
            r0.<init>(r8, r1)
            r7.A0D = r0
            X.00H r0 = r8.A0m
            java.lang.Object r1 = r0.get()
            X.1w4 r1 = (X.C41261w4) r1
            X.1mG r0 = r8.A15
            r1.A04 = r0
            X.0ve r1 = r8.A0T
            r0 = 8711(0x2207, float:1.2207E-41)
            int r0 = X.C18020vd.A00(r4, r1, r0)
            if (r0 != r3) goto L_0x019b
            X.00H r0 = r8.A0m
            java.lang.Object r1 = r0.get()
            X.1w4 r1 = (X.C41261w4) r1
            X.1w9 r0 = new X.1w9
            r0.<init>(r8)
            r1.A0E = r0
        L_0x019b:
            X.0ve r1 = r8.A0T
            r0 = 4119(0x1017, float:5.772E-42)
            boolean r0 = X.C18020vd.A05(r4, r1, r0)
            if (r0 == 0) goto L_0x01b1
            X.00H r0 = r8.A0m
            java.lang.Object r1 = r0.get()
            X.1w4 r1 = (X.C41261w4) r1
            X.1mJ r0 = r8.A17
            r1.A06 = r0
        L_0x01b1:
            androidx.recyclerview.widget.RecyclerView r1 = r8.A03
            r0 = 0
            r1.setItemAnimator(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r8.A03
            r0.setScrollbarFadingEnabled(r3)
            X.C38561rU.A00(r10, r8)
            r0 = 2131428765(0x7f0b059d, float:1.8479184E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r10, r0)
            X.1bI r1 = new X.1bI
            r1.<init>(r0)
            r8.A0Z = r1
            r4 = 4
            X.3AR r0 = new X.3AR
            r0.<init>(r8, r4)
            r1.A07(r0)
            r0 = 2131429491(0x7f0b0873, float:1.8480656E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r10, r0)
            X.1bI r1 = new X.1bI
            r1.<init>(r0)
            r8.A0a = r1
            r7 = 0
            X.3AR r0 = new X.3AR
            r0.<init>(r8, r2)
            r1.A07(r0)
            r0 = 2131428770(0x7f0b05a2, float:1.8479194E38)
            android.view.View r1 = X.AnonymousClass1HF.A06(r10, r0)
            X.1bI r0 = new X.1bI
            r0.<init>(r1)
            r8.A0b = r0
            r0 = 2131434943(0x7f0b1dbf, float:1.8491714E38)
            android.view.View r1 = X.AnonymousClass1HF.A06(r10, r0)
            X.1bI r0 = new X.1bI
            r0.<init>(r1)
            r8.A0y = r0
            r0 = 2131434941(0x7f0b1dbd, float:1.849171E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r10, r0)
            X.1bI r1 = new X.1bI
            r1.<init>(r0)
            r8.A0d = r1
            X.3AR r0 = new X.3AR
            r0.<init>(r8, r3)
            r1.A07(r0)
            r0 = 2131437063(0x7f0b2607, float:1.8496014E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r10, r0)
            X.1bI r1 = new X.1bI
            r1.<init>(r0)
            r8.A0e = r1
            X.3AR r0 = new X.3AR
            r0.<init>(r8, r6)
            r1.A07(r0)
            r0 = 16908292(0x1020004, float:2.387724E-38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r10, r0)
            r8.A00 = r0
            r0 = 2131433166(0x7f0b16ce, float:1.848811E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r10, r0)
            X.1bI r1 = new X.1bI
            r1.<init>(r0)
            r8.A0c = r1
            X.3AR r0 = new X.3AR
            r0.<init>(r8, r5)
            r1.A07(r0)
            r0 = 6
            X.1bI[] r2 = new X.C28931bI[r0]
            X.1bI r0 = r8.A0Z
            r2[r7] = r0
            X.1bI r0 = r8.A0a
            r2[r3] = r0
            X.1bI r0 = r8.A0b
            r2[r6] = r0
            X.1bI r0 = r8.A0y
            r2[r5] = r0
            X.1bI r0 = r8.A0d
            r2[r4] = r0
            r1 = 5
            X.1bI r0 = r8.A0e
            r2[r1] = r0
            r8.A0w = r2
            androidx.recyclerview.widget.RecyclerView r0 = r8.A03
            r8.A01 = r0
            r8.A1Z(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.callhistory.view.CallsHistoryFragment.A21(android.os.Bundle, android.view.View):void");
    }

    public void A22(Menu menu, MenuInflater menuInflater) {
        C18030ve r1 = this.A0T;
        C18040vf r2 = C18040vf.A02;
        if (!C18020vd.A05(r2, r1, 4023)) {
            menu.add(3, 2131432537, 0, 2131888318).setIcon(C50142Th.A00(this, 2131231845));
        }
        if (this.A05.A07() && C18020vd.A05(r2, this.A0T, 852)) {
            C18030ve r12 = this.A0U.A0U;
            if (!C18020vd.A05(r2, r12, 2574)) {
                return;
            }
            if (!C18020vd.A05(r2, r12, 12122) || !C18020vd.A05(r2, r12, 12124)) {
                this.A05.A03();
                throw new NullPointerException("getMenuItemBusinessToolsId");
            }
        }
    }

    public void A26() {
        if (this.A0F.A01()) {
            Log.w("voip/CallsFragment tried to start outgoing call from active voip call");
            this.A08.A08(2131889960, 0);
            return;
        }
        C18030ve r1 = this.A0T;
        C18040vf r3 = C18040vf.A02;
        if (!C18020vd.A05(r3, r1, 5868) && !((C30191dX) this.A0i.get()).A00()) {
            AnonymousClass74O.A0F(this, 2131894315, 2131894314);
        } else if (C18020vd.A00(r3, this.A0T, 5370) > 0) {
            C18030ve r12 = this.A0T;
            if (C18020vd.A00(r3, r12, 5370) > 0 && C18020vd.A05(r3, r12, 5757)) {
                C1408673j r32 = (C1408673j) this.A0n.get();
                r32.A02.execute(new C70563Bp(r32, 14));
            }
            this.A0r.get();
            Intent className = new Intent().setClassName(A14().getPackageName(), "com.whatsapp.calling.callhistory.group.GroupCallParticipantPicker");
            C18070vi.A0X(className);
            className.putExtra("hidden_jids", 0);
            className.putExtra("call_from_ui", 44);
            A1k(className);
            C192539oZ r2 = (C192539oZ) this.A0l.get();
            r2.A00();
            r2.A01((Integer) null, (Integer) null, 11);
        } else {
            A03();
        }
    }

    public void BCQ(C23471Gk r3) {
        String str = r3.A02;
        this.A0z = str;
        this.A0C.A0Y.filter(str);
    }

    public Drawable BUL() {
        boolean z = true;
        if (C18020vd.A00(C18040vf.A02, this.A0T, 5370) != 1) {
            z = false;
        }
        Context A142 = A14();
        int i = 2131231649;
        if (z) {
            i = 2131233191;
        }
        return C24261Jm.A00(A142, i);
    }

    public Drawable BYm() {
        C18030ve r2 = this.A0T;
        C23661Hd r1 = this.A0S;
        if (r1.A01() || r1.A02(true) || !C18020vd.A05(C18040vf.A02, r2, 8607)) {
            return null;
        }
        Drawable A002 = C24261Jm.A00(A14(), 2131231633);
        C17960vV.A07(A002);
        return A002;
    }

    public void Buy() {
        if (!this.A0t) {
            this.A0t = true;
            CallsHistoryFragmentViewModel callsHistoryFragmentViewModel = this.A0C;
            if (!callsHistoryFragmentViewModel.A0I) {
                callsHistoryFragmentViewModel.A0I = true;
                C40971vb r3 = callsHistoryFragmentViewModel.A0R;
                r3.A01();
                C18030ve r1 = callsHistoryFragmentViewModel.A0h;
                if (C40811vJ.A0W(r1)) {
                    r3.A02();
                }
                if (C40811vJ.A0D(callsHistoryFragmentViewModel.A0O, r1)) {
                    AnonymousClass2PJ r12 = r3.A04;
                    if (r12 != null) {
                        r12.A0B(true);
                    }
                    AnonymousClass2PJ r2 = new AnonymousClass2PJ(r3);
                    r3.A04 = r2;
                    r3.A0R.CGD(r2, new Void[0]);
                }
            }
            CallsHistoryFragmentViewModel callsHistoryFragmentViewModel2 = this.A0C;
            if (!callsHistoryFragmentViewModel2.A0Q.A06()) {
                callsHistoryFragmentViewModel2.A05 = null;
            } else {
                callsHistoryFragmentViewModel2.A0P.A01(new C92744hq(callsHistoryFragmentViewModel2, 1));
            }
        }
        if (this.A0x == null) {
            this.A0x = new AnonymousClass28K(this, 1);
            ((C38391rD) this.A0m.get()).CDq(this.A0x);
        }
        this.A10 = true;
        if (!isEmpty()) {
            ((C24001Il) this.A0o.get()).A02(400, false);
        }
    }

    public void CKa(boolean z) {
        C61472pk r2 = (C61472pk) this.A0C.A0o.get();
        if (z) {
            r2.A00 = UUID.randomUUID();
            r2.A01 = true;
            AnonymousClass2G9 A002 = C61472pk.A00(r2);
            A002.A01 = 0;
            A002.A03 = 0;
            r2.A02.CC7(A002);
            return;
        }
        r2.A00 = null;
    }

    public void CKd(boolean z, boolean z2) {
        View view;
        EmptyTellAFriendView emptyTellAFriendView;
        this.A0C.A0b(z);
        if (z) {
            ((C30361do) this.A0k.get()).A02((AnonymousClass1BI) null, 15);
            C192539oZ r3 = (C192539oZ) this.A0l.get();
            AnonymousClass00H r2 = r3.A02;
            String obj = UUID.randomUUID().toString();
            C18070vi.A0X(obj);
            r3.A00 = new C194279rT(r2, obj, (String) null);
            r3.A01((Integer) null, (Integer) null, 10);
            if (this.A0v && (view = this.A01) != null && (emptyTellAFriendView = (EmptyTellAFriendView) view.findViewById(2131428766)) != null) {
                emptyTellAFriendView.setImage(2131233635);
                this.A0v = false;
            }
        }
    }

    public boolean isEmpty() {
        C17960vV.A0F(this.A10, "isEmpty should be called after onFragmentAsyncInit for accuracy");
        CallsHistoryFragmentViewModel callsHistoryFragmentViewModel = this.A0C;
        if (!callsHistoryFragmentViewModel.A0r.isEmpty() || !callsHistoryFragmentViewModel.A0p.isEmpty()) {
            return false;
        }
        return true;
    }

    public static int A01(C178119Bw r1) {
        if (r1.A0N()) {
            return 24;
        }
        if (r1.A0Q()) {
            return 21;
        }
        if (r1.A04.A03) {
            return 23;
        }
        return 22;
    }

    private void A02() {
        if (!A0D(this)) {
            AnonymousClass1FL A1B2 = A1B();
            if (A1B2 == null) {
                Log.w("CallsHistoryFragmentV2/toggleItemSelection activity null for # items selected");
                return;
            }
            int size = this.A1A.size() + this.A19.size();
            AnonymousClass1Y5.A00(A1B2, this.A0L, A14().getResources().getQuantityString(2131755256, size, new Object[]{Integer.valueOf(size)}));
        }
    }

    public static void A04(View view, CallsHistoryFragment callsHistoryFragment) {
        if ((callsHistoryFragment.A14().getResources().getConfiguration().screenLayout & 15) == 1) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.gravity = 48;
                view.setLayoutParams(layoutParams2);
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), 0);
            }
        }
    }

    public static void A06(C70483Bg r13, CallsHistoryFragment callsHistoryFragment, AnonymousClass1E7 r15) {
        boolean z;
        ArrayList arrayList;
        AnonymousClass1BI r8;
        int i;
        String str;
        Intent intent;
        Integer valueOf;
        Boolean valueOf2;
        Context A1n = callsHistoryFragment.A1n();
        if (A1n == null) {
            str = "CallsHistoryFragmentV2/launchCallLogInfoPage/onViewHolderClicked context null";
        } else {
            List<C178119Bw> A032 = r13.A03();
            if (A032.isEmpty()) {
                str = "CallsHistoryFragmentV2/launchCallLogInfoPage/onViewHolderClicked no calls registered for item";
            } else {
                boolean z2 = false;
                C178119Bw r2 = (C178119Bw) A032.get(0);
                C178119Bw A0C2 = C18070vi.A0C(r13);
                if (A0C2 != null) {
                    z = A0C2.A0J;
                } else {
                    z = false;
                }
                if (!r13.A04() || r15 != null) {
                    arrayList = new ArrayList();
                    for (C178119Bw A092 : A032) {
                        arrayList.add(A092.A09());
                    }
                    if (r15 == null || !r13.A04()) {
                        AnonymousClass1E7 A012 = r13.A01();
                        if (A012 == null) {
                            str = "CallsHistoryFragmentV2/launchCallLogInfoPage/onViewHolderClicked no contact registered for call group";
                        } else {
                            r8 = A012.A0J;
                            i = 1;
                        }
                    } else {
                        r8 = r15.A0J;
                        i = 3;
                    }
                    if (!C40811vJ.A0a(callsHistoryFragment.A0T, r8, false)) {
                        boolean A052 = C18020vd.A05(C18040vf.A02, callsHistoryFragment.A0T, 8848);
                        AnonymousClass00H r0 = callsHistoryFragment.A0r;
                        if (A052) {
                            r0.get();
                            valueOf = Integer.valueOf(i);
                            valueOf2 = Boolean.valueOf(z);
                            intent = AnonymousClass1LU.A0e(A1n, r8, valueOf2, valueOf, arrayList, z2);
                            C192539oZ r3 = (C192539oZ) callsHistoryFragment.A0l.get();
                            r3.A00();
                            Integer valueOf3 = Integer.valueOf(A01(r2));
                            Integer valueOf4 = Integer.valueOf(i);
                            r3.A01(valueOf3, valueOf4, 15);
                            C192619oh r5 = (C192619oh) callsHistoryFragment.A0g.get();
                            r5.A00();
                            r5.A01(r2.A0C, Boolean.valueOf(r2.A0J), valueOf4, 45);
                            callsHistoryFragment.A1k(intent);
                            return;
                        }
                        r0.get();
                        boolean A0W2 = ((C178119Bw) A032.get(0)).A0W();
                        intent = new Intent();
                        intent.setClassName(A1n.getPackageName(), "com.whatsapp.calling.callhistory.CallLogActivity");
                        intent.putExtra("jid", C22971Dz.A06(r8));
                        intent.putExtra("calls", arrayList);
                        intent.putExtra("is_voice_chat", A0W2);
                        C192539oZ r32 = (C192539oZ) callsHistoryFragment.A0l.get();
                        r32.A00();
                        Integer valueOf32 = Integer.valueOf(A01(r2));
                        Integer valueOf42 = Integer.valueOf(i);
                        r32.A01(valueOf32, valueOf42, 15);
                        C192619oh r52 = (C192619oh) callsHistoryFragment.A0g.get();
                        r52.A00();
                        r52.A01(r2.A0C, Boolean.valueOf(r2.A0J), valueOf42, 45);
                        callsHistoryFragment.A1k(intent);
                        return;
                    }
                } else {
                    i = 2;
                    if (r13.A04()) {
                        if (r2.A0B != null) {
                            z2 = true;
                        }
                        r8 = null;
                        if (C40811vJ.A0a(callsHistoryFragment.A0T, (AnonymousClass1BI) null, Boolean.valueOf(z2))) {
                            arrayList = new ArrayList();
                            arrayList.add(r2.A04);
                        }
                    }
                    callsHistoryFragment.A0r.get();
                    C89444cT A093 = r2.A09();
                    intent = new Intent();
                    intent.setClassName(A1n.getPackageName(), "com.whatsapp.calling.callhistory.group.GroupCallLogActivity");
                    intent.putExtra("call_log_key", A093);
                    C192539oZ r322 = (C192539oZ) callsHistoryFragment.A0l.get();
                    r322.A00();
                    Integer valueOf322 = Integer.valueOf(A01(r2));
                    Integer valueOf422 = Integer.valueOf(i);
                    r322.A01(valueOf322, valueOf422, 15);
                    C192619oh r522 = (C192619oh) callsHistoryFragment.A0g.get();
                    r522.A00();
                    r522.A01(r2.A0C, Boolean.valueOf(r2.A0J), valueOf422, 45);
                    callsHistoryFragment.A1k(intent);
                    return;
                }
                callsHistoryFragment.A0r.get();
                valueOf = Integer.valueOf(i);
                valueOf2 = Boolean.valueOf(z);
                z2 = true;
                intent = AnonymousClass1LU.A0e(A1n, r8, valueOf2, valueOf, arrayList, z2);
                C192539oZ r3222 = (C192539oZ) callsHistoryFragment.A0l.get();
                r3222.A00();
                Integer valueOf3222 = Integer.valueOf(A01(r2));
                Integer valueOf4222 = Integer.valueOf(i);
                r3222.A01(valueOf3222, valueOf4222, 15);
                C192619oh r5222 = (C192619oh) callsHistoryFragment.A0g.get();
                r5222.A00();
                r5222.A01(r2.A0C, Boolean.valueOf(r2.A0J), valueOf4222, 45);
                callsHistoryFragment.A1k(intent);
                return;
            }
        }
        Log.w(str);
    }

    public static void A07(AnonymousClass28W r4, CallsHistoryFragment callsHistoryFragment) {
        AnonymousClass02B r0;
        C41121vq A0B2 = r4.A0B();
        if (A0B2 == null) {
            Log.w("CallsHistoryFragmentV2/toggleFavoriteSelection view holder not bound");
            return;
        }
        AnonymousClass1BI BTb = A0B2.BTb();
        C17960vV.A07(BTb);
        String rawString = BTb.getRawString();
        HashMap hashMap = callsHistoryFragment.A19;
        boolean containsKey = hashMap.containsKey(rawString);
        if (containsKey) {
            hashMap.remove(rawString);
            if (A0D(callsHistoryFragment) && callsHistoryFragment.A02 != null && !AnonymousClass1Y5.A0D(callsHistoryFragment.A0L.A0M()) && (r0 = callsHistoryFragment.A02) != null) {
                r0.A05();
            }
        } else {
            hashMap.put(rawString, r4);
            if (callsHistoryFragment.A02 == null) {
                AnonymousClass1FL A1B2 = callsHistoryFragment.A1B();
                if (A1B2 instanceof AnonymousClass01E) {
                    callsHistoryFragment.A02 = ((AnonymousClass01E) A1B2).COJ(callsHistoryFragment.A1B);
                }
            }
        }
        r4.A0D(!containsKey, true, true);
        AnonymousClass02B r02 = callsHistoryFragment.A02;
        if (r02 != null) {
            r02.A06();
        }
        Set keySet = hashMap.keySet();
        C18070vi.A0d(keySet, 0);
        ((C41261w4) callsHistoryFragment.A0m.get()).A0A = keySet;
        callsHistoryFragment.A02();
    }

    public static void A08(AnonymousClass28W r4, CallsHistoryFragment callsHistoryFragment) {
        AnonymousClass02B r0;
        String str;
        C41121vq A0B2 = r4.A0B();
        if (A0B2 == null) {
            str = "CallsHistoryFragmentV2/toggleItemSelection view holder not bound";
        } else {
            C70483Bg BO2 = A0B2.BO2();
            if (BO2 == null) {
                str = "CallsHistoryFragmentV2/toggleItemSelection call group is null";
            } else {
                String A022 = BO2.A02();
                HashMap hashMap = callsHistoryFragment.A1A;
                boolean containsKey = hashMap.containsKey(A022);
                if (containsKey) {
                    hashMap.remove(A022);
                    if (A0D(callsHistoryFragment) && callsHistoryFragment.A02 != null && !AnonymousClass1Y5.A0D(callsHistoryFragment.A0L.A0M()) && (r0 = callsHistoryFragment.A02) != null) {
                        r0.A05();
                    }
                } else {
                    hashMap.put(A022, r4);
                    if (callsHistoryFragment.A02 == null) {
                        AnonymousClass1FL A1B2 = callsHistoryFragment.A1B();
                        if (A1B2 instanceof AnonymousClass01E) {
                            callsHistoryFragment.A02 = ((AnonymousClass01E) A1B2).COJ(callsHistoryFragment.A1B);
                        }
                    }
                }
                r4.A0D(!containsKey, true, true);
                AnonymousClass02B r02 = callsHistoryFragment.A02;
                if (r02 != null) {
                    r02.A06();
                }
                Set keySet = hashMap.keySet();
                C18070vi.A0d(keySet, 0);
                ((C41261w4) callsHistoryFragment.A0m.get()).A0B = keySet;
                callsHistoryFragment.A02();
                return;
            }
        }
        Log.w(str);
    }

    public static void A0B(CallsHistoryFragment callsHistoryFragment, AnonymousClass1E7 r7, boolean z) {
        AnonymousClass1FL A1B2 = callsHistoryFragment.A1B();
        if (A1B2 instanceof AnonymousClass1FU) {
            int i = 16;
            if (!TextUtils.isEmpty(callsHistoryFragment.A0C.A0Y.A01)) {
                i = 35;
            }
            AnonymousClass1FU r5 = (AnonymousClass1FU) A1B2;
            if (r7.A0F()) {
                if (C18020vd.A05(C18040vf.A02, callsHistoryFragment.A0T, 7175)) {
                    Jid A062 = r7.A06(AnonymousClass1EC.class);
                    C17960vV.A07(A062);
                    r5.CMk(C87384Vj.A01((AnonymousClass1EC) A062, i, z), "CallConfirmationSheet");
                    return;
                }
            }
            CallConfirmationFragment.A01(r5, r7, Integer.valueOf(i), z);
            return;
        }
        Log.e("Cannot call group contact since activity is not a dialog activity");
    }

    public void A1s() {
        Log.i("voip/CallsHistoryFragmentV2/onDestroyView");
        this.A0I.A02();
        this.A0H.A02();
        if (this.A10 && this.A0x != null) {
            ((C38391rD) this.A0m.get()).A01.unregisterObserver(this.A0x);
            this.A0x = null;
        }
        this.A0X = true;
        this.A00 = null;
        this.A03 = null;
        this.A0c = null;
        this.A01 = null;
    }

    public boolean A24(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 2131432596) {
            A26();
            return true;
        } else if (itemId == 2131432537 && this.A04 >= 7) {
            new CallsHistoryClearCallLogDialogFragment().A2C(A1F(), (String) null);
            return true;
        } else if (!this.A04.A07()) {
            return false;
        } else {
            this.A05.A03();
            throw new NullPointerException("getMenuItemBusinessToolsId");
        }
    }

    public String BUK() {
        return A1H(2131892001);
    }

    public RecyclerView BY0() {
        return this.A03;
    }

    public String BYl() {
        return A1H(2131889408);
    }

    public /* synthetic */ String BYn() {
        return null;
    }

    public boolean Buz() {
        return this.A10;
    }

    public void C4p() {
        Context A1n = A1n();
        if (A1n == null) {
            Log.w("CallsHistoryFragmentV2/onSecondAction context null");
            return;
        }
        C18030ve r2 = this.A0T;
        C23661Hd r1 = this.A0S;
        if (!r1.A01() && !r1.A02(true) && C18020vd.A05(C18040vf.A02, r2, 8607)) {
            this.A0r.get();
            Intent intent = new Intent();
            intent.setClassName(A1n.getPackageName(), "com.whatsapp.calling.dialer.DialerActivity");
            A1k(intent);
            this.A0E.A00(55, 15);
            C192539oZ r22 = (C192539oZ) this.A0l.get();
            r22.A00();
            r22.A01((Integer) null, (Integer) null, 12);
        }
    }

    public /* synthetic */ boolean C4q() {
        return false;
    }

    public /* synthetic */ void BxX(int i, int i2) {
        A26();
    }
}
