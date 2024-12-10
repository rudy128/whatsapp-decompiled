package com.whatsapp.businessdirectory.view.fragment;

import X.A36;
import X.A5L;
import X.AAC;
import X.AEQ;
import X.AFN;
import X.AGI;
import X.APC;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass01T;
import X.AnonymousClass02n;
import X.AnonymousClass16K;
import X.AnonymousClass1DT;
import X.AnonymousClass1FL;
import X.AnonymousClass1HF;
import X.AnonymousClass1LU;
import X.AnonymousClass1XN;
import X.AnonymousClass3MX;
import X.AnonymousClass8BR;
import X.AnonymousClass8Ev;
import X.AnonymousClass8FD;
import X.AnonymousClass8FJ;
import X.AnonymousClass8IA;
import X.AnonymousClass9VM;
import X.BAZ;
import X.C005102e;
import X.C108365ba;
import X.C108945cZ;
import X.C161448Dt;
import X.C169238ka;
import X.C173738ve;
import X.C173768vh;
import X.C173788vj;
import X.C17880vN;
import X.C18000vb;
import X.C185719d2;
import X.C192189nx;
import X.C20079A6f;
import X.C20335AGr;
import X.C20531AOq;
import X.C21446AkD;
import X.C219217x;
import X.C22552BCj;
import X.C23391Fw;
import X.C37361pP;
import X.C37801q9;
import X.C38391rD;
import X.C40751vD;
import X.C41731wy;
import X.C56492hY;
import X.C56502hZ;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.chip.Chip;
import com.whatsapp.businessdirectory.view.activity.BusinessDirectoryActivity;
import com.whatsapp.businessdirectory.view.custom.FilterBottomSheetDialogFragment;
import com.whatsapp.jid.Jid;
import java.util.Iterator;
import java.util.Set;

public class BusinessDirectorySearchFragment extends Hilt_BusinessDirectorySearchFragment implements C22552BCj, C108365ba, BAZ {
    public Chip A00;
    public C56492hY A01;
    public C56502hZ A02;
    public AnonymousClass9VM A03;
    public C40751vD A04;
    public C173738ve A05;
    public C192189nx A06;
    public AAC A07;
    public C173768vh A08;
    public APC A09;
    public AnonymousClass8FD A0A;
    public C219217x A0B;
    public C18000vb A0C;
    public AnonymousClass1LU A0D;
    public AnonymousClass1XN A0E;
    public AnonymousClass8IA A0F;
    public AnonymousClass00H A0G;
    public AnonymousClass00H A0H;
    public RecyclerView A0I;
    public C169238ka A0J;
    public final AnonymousClass01T A0K = new C161448Dt(this, 1);
    public final AnonymousClass02n A0L = CDw(new AGI((Object) this, 1), new Object());

    public static BusinessDirectorySearchFragment A01() {
        BusinessDirectorySearchFragment businessDirectorySearchFragment = new BusinessDirectorySearchFragment();
        Bundle A0D2 = C17880vN.A0D();
        A0D2.putBoolean("FORCE_ROOT_CATEGORIES", true);
        businessDirectorySearchFragment.A1R(A0D2);
        return businessDirectorySearchFragment;
    }

    public void A1Q(Bundle bundle) {
        this.A0X = true;
        Fragment A0Q = A1E().A0Q("filter-bottom-sheet");
        if (A0Q != null) {
            ((FilterBottomSheetDialogFragment) A0Q).A02 = this;
        }
        this.A09.A00();
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        this.A0J = this.A01.A00((AnonymousClass16K) this.A0H.get());
        boolean z = A00(this).A0F;
        boolean z2 = A15().getBoolean("FORCE_ROOT_CATEGORIES");
        String string = A15().getString("argument_business_list_search_state");
        this.A0A = (AnonymousClass8FD) AnonymousClass8BR.A0C(new AnonymousClass8Ev(bundle, this, this.A03, (AEQ) A15().getParcelable("INITIAL_CATEGORY"), (Jid) A15().getParcelable("directory_biz_chaining_jid"), string, z2, z), this).A00(AnonymousClass8FD.class);
        C56502hZ r2 = this.A02;
        AnonymousClass1LU r7 = this.A0D;
        APC A002 = r2.A00(this, this.A0J, this.A07, this, r7);
        this.A09 = A002;
        this.A06.A00(A002);
    }

    public void A20(Bundle bundle) {
        AnonymousClass8FD r3 = this.A0A;
        C37361pP r2 = r3.A0C;
        r2.A04("saved_search_state_stack", C17880vN.A10(r3.A05));
        r2.A04("saved_second_level_category", r3.A0T.A06());
        r2.A04("saved_parent_category", r3.A0S.A06());
        r2.A04("saved_search_state", Integer.valueOf(r3.A02));
        r2.A04("saved_force_root_category", Boolean.valueOf(r3.A06));
        r2.A04("saved_consumer_home_type", Integer.valueOf(r3.A01));
        r3.A0K.A0A(r2);
    }

    public void BL4() {
        this.A0A.A0N.A00.A0H();
    }

    public void Bmp() {
        this.A0A.A0W(62);
    }

    public void BtI() {
        this.A0A.A0N.A04();
    }

    public void BxF() {
        C20531AOq aOq = this.A0A.A0N;
        aOq.A05.A02(true);
        aOq.A00.A0H();
    }

    public void BxJ() {
        this.A0A.A0N.A05();
    }

    public void BxK() {
        this.A0A.BxL();
    }

    public void BxM(C185719d2 r2) {
        this.A0A.A0N.A07(r2);
    }

    public void Bym(Set set) {
        AnonymousClass8FD r5 = this.A0A;
        A36 a36 = r5.A0K;
        a36.A01 = set;
        r5.A0E.A02((Boolean) null, A5L.A01(r5), a36.A06(), 46);
        AnonymousClass8FD.A0C(r5);
        this.A0A.A0W(64);
    }

    public void C0Z() {
        this.A0A.Boe(0);
    }

    public void C40() {
        this.A0A.A0N.A00.A0H();
    }

    public void CRJ() {
        AnonymousClass8FJ r2 = this.A0A.A0N.A00;
        C21446AkD.A01(r2.A08, r2, 21);
    }

    public static BusinessDirectoryActivity A00(BusinessDirectorySearchFragment businessDirectorySearchFragment) {
        if (businessDirectorySearchFragment.A1D() instanceof BusinessDirectoryActivity) {
            return (BusinessDirectoryActivity) businessDirectorySearchFragment.A1D();
        }
        throw AnonymousClass000.A0n("BusinessDirectorySearchFragment should be attached to BusinessDirectoryActivity");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0061, code lost:
        r1.setTitle(r3.A1H(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0068, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r3.A1D().setTitle(r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(com.whatsapp.businessdirectory.view.fragment.BusinessDirectorySearchFragment r3, java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r2 = 0
            switch(r0) {
                case -1126816384: goto L_0x0052;
                case 23561082: goto L_0x0042;
                case 1014375387: goto L_0x002f;
                case 2044323616: goto L_0x0010;
                default: goto L_0x0008;
            }
        L_0x0008:
            X.1FL r0 = r3.A1D()
            r0.setTitle(r4)
        L_0x000f:
            return
        L_0x0010:
            java.lang.String r0 = "business_chaining"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0008
            android.os.Bundle r1 = r3.A15()
            java.lang.String r0 = "directory_biz_chaining_name"
            java.lang.String r1 = r1.getString(r0)
            if (r1 == 0) goto L_0x000f
            r0 = 2131887074(0x7f1203e2, float:1.9408745E38)
            java.lang.String r0 = X.AnonymousClass3MY.A0o(r3, r1, r2, r0)
            A02(r3, r0)
            return
        L_0x002f:
            java.lang.String r0 = "product_name"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0008
            com.whatsapp.businessdirectory.view.activity.BusinessDirectoryActivity r1 = A00(r3)
            r0 = 2131887091(0x7f1203f3, float:1.940878E38)
            r1.setTitle(r0)
            return
        L_0x0042:
            java.lang.String r0 = "all_categories"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0008
            X.1FL r1 = r3.A1D()
            r0 = 2131887018(0x7f1203aa, float:1.9408631E38)
            goto L_0x0061
        L_0x0052:
            java.lang.String r0 = "nearby_business"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0008
            X.1FL r1 = r3.A1D()
            r0 = 2131887048(0x7f1203c8, float:1.9408692E38)
        L_0x0061:
            java.lang.String r0 = r3.A1H(r0)
            r1.setTitle(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.businessdirectory.view.fragment.BusinessDirectorySearchFragment.A02(com.whatsapp.businessdirectory.view.fragment.BusinessDirectorySearchFragment, java.lang.String):void");
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass1DT r4;
        View inflate = layoutInflater.inflate(2131625350, viewGroup, false);
        this.A0I = C108945cZ.A0U(inflate, 2131434911);
        this.A00 = (Chip) AnonymousClass1HF.A06(inflate, 2131436544);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(A1n(), 1, false);
        this.A0F = new C173788vj(this, 1);
        this.A0I.setLayoutManager(linearLayoutManager);
        this.A0I.A0t(this.A0F);
        this.A0I.setAdapter(this.A08);
        boolean A032 = this.A0E.A03();
        C23391Fw r1 = this.A0L;
        if (A032) {
            r1.A05(this.A0J);
            C169238ka r12 = this.A0J;
            r12.A02 = C17880vN.A0j();
            r4 = r12.A04;
        } else {
            r1.A05(this.A07);
            r4 = this.A07.A00;
        }
        C37801q9 A1G = A1G();
        APC apc = this.A09;
        apc.getClass();
        C20335AGr.A00(A1G, r4, apc, 3);
        C20335AGr.A00(A1G(), this.A0A.A0V, this, 15);
        C41731wy r42 = this.A0A.A0Q;
        C37801q9 A1G2 = A1G();
        APC apc2 = this.A09;
        apc2.getClass();
        C20335AGr.A00(A1G2, r42, apc2, 6);
        C20335AGr.A00(A1G(), this.A0A.A0B, this, 16);
        C20335AGr.A00(A1G(), this.A0A.A0R, this, 17);
        C20335AGr.A00(A1G(), this.A0A.A08, this, 18);
        C20335AGr.A00(A1G(), this.A0A.A0U, this, 19);
        C20335AGr.A00(A1G(), this.A0A.A0A, this, 20);
        A1D().BVe().A09(this.A0K, A1G());
        AFN.A00(this.A00, this, 25);
        AnonymousClass8FD r2 = this.A0A;
        if (r2.A0N.A00.A00 != 4) {
            AnonymousClass3MX.A1K(r2.A0V, 0);
        }
        return inflate;
    }

    public void A1r() {
        super.A1r();
        this.A06.A01(this.A09);
        Iterator it = this.A0K.A02.iterator();
        while (it.hasNext()) {
            ((C005102e) it.next()).cancel();
        }
        AnonymousClass1FL A1B = A1B();
        if (A1B == null || A1B.isFinishing()) {
            this.A0A.A0H.A00();
        }
    }

    public void A1s() {
        super.A1s();
        RecyclerView recyclerView = this.A0I;
        if (recyclerView != null) {
            recyclerView.A0u(this.A0F);
            this.A0I.setAdapter((C38391rD) null);
            this.A0I = null;
        }
    }

    public void A1u() {
        C20079A6f a6f;
        super.A1u();
        AnonymousClass8FD r2 = this.A0A;
        AnonymousClass8FD.A0B(r2);
        Iterator it = r2.A0W.iterator();
        if (it.hasNext()) {
            it.next();
            throw AnonymousClass000.A0s("isVisibilityChanged");
        }
        C20531AOq aOq = r2.A0N;
        if (aOq.A09() && (a6f = aOq.A00.A01) != null && !a6f.equals(a6f)) {
            AnonymousClass8FJ r22 = aOq.A00;
            C21446AkD.A01(r22.A08, r22, 21);
        }
    }
}
