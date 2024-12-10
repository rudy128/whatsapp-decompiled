package com.whatsapp.group;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass11S;
import X.AnonymousClass1EC;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1M9;
import X.AnonymousClass1MZ;
import X.AnonymousClass3L6;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3NF;
import X.AnonymousClass49J;
import X.AnonymousClass4aX;
import X.C000200d;
import X.C17880vN;
import X.C17890vO;
import X.C17960vV;
import X.C18000vb;
import X.C20103A7h;
import X.C23581Gv;
import X.C24261Jm;
import X.C24671Lf;
import X.C24921Me;
import X.C25221Nj;
import X.C27201Vd;
import X.C28741ap;
import X.C37451pZ;
import X.C37891qK;
import X.C41501wV;
import X.C54832em;
import X.C63312sr;
import X.C63872tp;
import X.C72043Kk;
import X.C72463Mc;
import X.C72473Md;
import X.C72483Me;
import X.C73483Wd;
import X.C74493bl;
import X.C74743cP;
import X.C825148g;
import X.C89944dH;
import X.C90014dO;
import X.C90334du;
import X.C90584eJ;
import X.C91014f0;
import X.C91184fH;
import X.C94164k9;
import X.C95414mC;
import X.C96294nc;
import X.C96314ne;
import android.graphics.PointF;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.List;

public class GroupAdminPickerActivity extends AnonymousClass1FY {
    public ColorDrawable A00;
    public View A01;
    public View A02;
    public BottomSheetBehavior A03;
    public C72043Kk A04;
    public AnonymousClass1M9 A05;
    public C24671Lf A06;
    public C24921Me A07;
    public C37451pZ A08;
    public C27201Vd A09;
    public C18000vb A0A;
    public AnonymousClass1MZ A0B;
    public C54832em A0C;
    public C73483Wd A0D;
    public AnonymousClass1EC A0E;
    public AnonymousClass00H A0F;
    public AnonymousClass00H A0G;
    public AnonymousClass00H A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public List A0M;
    public View A0N;
    public View A0O;
    public SearchView A0P;
    public AnonymousClass49J A0Q;
    public boolean A0R;
    public final View.OnClickListener A0S;
    public final C23581Gv A0T;
    public final C28741ap A0U;
    public final AnonymousClass3L6 A0V;
    public final C25221Nj A0W;

    public GroupAdminPickerActivity() {
        this(0);
        this.A0T = new C94164k9(this, 19);
        this.A0U = new C95414mC(this, 14);
        this.A0W = new C96314ne(this, 19);
        this.A0V = new C96294nc(this, 14);
        this.A0S = new C89944dH(this, 45);
    }

    public static void A0c(GroupAdminPickerActivity groupAdminPickerActivity, String str) {
        GroupAdminPickerActivity groupAdminPickerActivity2 = groupAdminPickerActivity;
        groupAdminPickerActivity2.A0I = str;
        C17890vO.A0t(groupAdminPickerActivity2.A0Q);
        AnonymousClass49J r1 = new AnonymousClass49J(groupAdminPickerActivity2.A07, groupAdminPickerActivity2.A0A, groupAdminPickerActivity2, str, groupAdminPickerActivity2.A0M);
        groupAdminPickerActivity2.A0Q = r1;
        C17890vO.A0u(r1, groupAdminPickerActivity2.A05);
    }

    public static boolean A0d(GroupAdminPickerActivity groupAdminPickerActivity, UserJid userJid) {
        if (userJid != null) {
            Iterator it = groupAdminPickerActivity.A0M.iterator();
            while (it.hasNext()) {
                if (userJid.equals(C72473Md.A0X(it))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void A0Q(GroupAdminPickerActivity groupAdminPickerActivity) {
        groupAdminPickerActivity.A01.setPadding(0, 0, 0, 0);
        ((C37891qK) groupAdminPickerActivity.A01.getLayoutParams()).A00((C41501wV) null);
        groupAdminPickerActivity.A00.setColor(AnonymousClass3Ma.A00(groupAdminPickerActivity, 2130970012, 2131101104));
        groupAdminPickerActivity.A0P.A0H();
        groupAdminPickerActivity.A0O.setVisibility(8);
        groupAdminPickerActivity.A02.setVisibility(0);
    }

    public static void A0V(GroupAdminPickerActivity groupAdminPickerActivity) {
        C63872tp A0C2;
        if (groupAdminPickerActivity.A0L == null || groupAdminPickerActivity.A0J == null) {
            AnonymousClass1MZ r0 = groupAdminPickerActivity.A0B;
            AnonymousClass1EC r1 = groupAdminPickerActivity.A0E;
            C17960vV.A07(r1);
            A0C2 = r0.A08.A0C(r1);
        } else {
            C54832em r02 = groupAdminPickerActivity.A0C;
            A0C2 = (C63872tp) r02.A00.get(groupAdminPickerActivity.A0E);
        }
        groupAdminPickerActivity.A0M = C17880vN.A0z(A0C2.A06());
        Iterator it = A0C2.A0K().iterator();
        while (it.hasNext()) {
            AnonymousClass11S r03 = groupAdminPickerActivity.A02;
            UserJid userJid = ((C63312sr) it.next()).A04;
            if (!r03.A0O(userJid)) {
                groupAdminPickerActivity.A0M.add(groupAdminPickerActivity.A05.A0H(userJid));
            }
        }
    }

    public void A2y() {
        if (!this.A0R) {
            this.A0R = true;
            AnonymousClass10E A0L2 = C72473Md.A0L(this);
            C72483Me.A0q(A0L2, this);
            AnonymousClass10G r1 = A0L2.A00;
            AnonymousClass1FB.A0K(A0L2, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L2, r1, this, r1.A5A);
            this.A09 = AnonymousClass3MZ.A0i(A0L2);
            this.A05 = AnonymousClass10E.A4z(A0L2);
            this.A07 = AnonymousClass3MZ.A0g(A0L2);
            this.A0A = AnonymousClass10E.A6Q(A0L2);
            this.A06 = AnonymousClass3Ma.A0S(A0L2);
            this.A0F = C000200d.A00(A0L2.A2A);
            this.A0C = (C54832em) A0L2.AkC.get();
            this.A0G = C000200d.A00(A0L2.A4m);
            this.A0B = AnonymousClass3MY.A0V(A0L2);
            this.A0H = C000200d.A00(A0L2.A4u);
            this.A04 = AnonymousClass3MZ.A0T(r1);
        }
    }

    public void onBackPressed() {
        if (this.A02.getVisibility() == 0) {
            A03(this);
        } else {
            this.A03.A0W(4);
        }
    }

    public static void A03(GroupAdminPickerActivity groupAdminPickerActivity) {
        groupAdminPickerActivity.A01.setPadding(0, groupAdminPickerActivity.getResources().getDimensionPixelSize(2131165297), 0, 0);
        ((C37891qK) groupAdminPickerActivity.A01.getLayoutParams()).A00(groupAdminPickerActivity.A03);
        groupAdminPickerActivity.A00.setColor(2130706432);
        groupAdminPickerActivity.A0O.setVisibility(0);
        groupAdminPickerActivity.A02.setVisibility(8);
        A0c(groupAdminPickerActivity, (String) null);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131625474);
        getWindow().addFlags(Integer.MIN_VALUE);
        View findViewById = findViewById(2131428345);
        this.A01 = findViewById;
        this.A03 = BottomSheetBehavior.A02(findViewById);
        C90584eJ.A00(this.A01.getViewTreeObserver(), this, 24);
        this.A0N = findViewById(2131428018);
        PointF pointF = new PointF();
        C90014dO.A00(this.A0N, this, pointF, 36);
        C90334du.A00(this.A0N, pointF, 20);
        ColorDrawable colorDrawable = new ColorDrawable(2130706432);
        this.A00 = colorDrawable;
        this.A0N.setBackground(colorDrawable);
        AlphaAnimation A0Q2 = C72463Mc.A0Q();
        A0Q2.setDuration((long) getResources().getInteger(17694720));
        this.A0N.startAnimation(A0Q2);
        this.A03.A0a(new C74493bl(this, AnonymousClass3MZ.A00(this)));
        this.A0O = findViewById(2131436230);
        View findViewById2 = findViewById(2131434898);
        this.A02 = findViewById2;
        findViewById2.setBackgroundResource(2131232920);
        SearchView searchView = (SearchView) this.A02.findViewById(2131434976);
        this.A0P = searchView;
        C72463Mc.A0y(this, C17880vN.A0E(searchView, 2131434969), 2130971105, 2131102431);
        this.A0P.setIconifiedByDefault(false);
        this.A0P.setQueryHint(getString(2131895602));
        AnonymousClass3MW.A0H(this.A0P, 2131434914).setImageDrawable(new AnonymousClass3NF(C24261Jm.A00(this, 2131231675), this));
        C91184fH.A00(this.A0P, this, 5);
        ImageView A0H2 = AnonymousClass3MW.A0H(this.A02, 2131434851);
        C74743cP.A03(AnonymousClass4aX.A03(this, 2130970284, 2131101275, 2131231675), A0H2, this.A0A);
        C825148g.A00(A0H2, this, 15);
        C89944dH.A00(findViewById(2131434858), this, 44);
        RecyclerView recyclerView = (RecyclerView) findViewById(2131432069);
        AnonymousClass3Ma.A15(this, recyclerView);
        this.A08 = this.A09.A06(this, "group-admin-picker-activity");
        getIntent().getStringExtra("gid");
        this.A0E = C72473Md.A0Y(getIntent(), "gid");
        this.A0L = getIntent().getStringExtra("subgroup_subject");
        this.A0K = getIntent().getStringExtra("subgroup_request_message");
        this.A0J = getIntent().getStringExtra("parent_group_jid");
        A0V(this);
        C73483Wd r1 = new C73483Wd(this);
        this.A0D = r1;
        r1.A01 = this.A0M;
        r1.A00 = C20103A7h.A03(r1.A02.A0A, (String) null);
        r1.notifyDataSetChanged();
        recyclerView.setAdapter(this.A0D);
        C17880vN.A0V(this.A0F).registerObserver(this.A0U);
        this.A06.registerObserver(this.A0T);
        AnonymousClass3MW.A0e(this.A0G).A00(this.A0V);
        C17880vN.A0V(this.A0H).registerObserver(this.A0W);
    }

    public void onDestroy() {
        super.onDestroy();
        C17880vN.A0V(this.A0F).unregisterObserver(this.A0U);
        this.A06.unregisterObserver(this.A0T);
        AnonymousClass3MW.A0e(this.A0G).A01(this.A0V);
        C17880vN.A0V(this.A0H).unregisterObserver(this.A0W);
        this.A08.A02();
        C54832em r0 = this.A0C;
        r0.A00.remove(this.A0E);
        C17890vO.A0t(this.A0Q);
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        if (bundle.getBoolean("search")) {
            A0Q(this);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("search", AnonymousClass000.A1P(this.A02.getVisibility()));
    }

    public GroupAdminPickerActivity(int i) {
        this.A0R = false;
        C91014f0.A00(this, 15);
    }
}
