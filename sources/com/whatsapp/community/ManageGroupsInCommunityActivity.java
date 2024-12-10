package com.whatsapp.community;

import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass11E;
import X.AnonymousClass1CJ;
import X.AnonymousClass1E7;
import X.AnonymousClass1EC;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1K1;
import X.AnonymousClass1M9;
import X.AnonymousClass1MW;
import X.AnonymousClass1MZ;
import X.AnonymousClass1PU;
import X.AnonymousClass1VD;
import X.AnonymousClass1VU;
import X.AnonymousClass1VW;
import X.AnonymousClass1Y5;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3X3;
import X.AnonymousClass48m;
import X.AnonymousClass4DZ;
import X.AnonymousClass4J1;
import X.AnonymousClass4J2;
import X.AnonymousClass5XB;
import X.C000200d;
import X.C003401n;
import X.C110885hR;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C21437Ak4;
import X.C24921Me;
import X.C27201Vd;
import X.C36331ni;
import X.C36401np;
import X.C37451pZ;
import X.C39441t5;
import X.C56372hM;
import X.C72043Kk;
import X.C72463Mc;
import X.C72473Md;
import X.C72483Me;
import X.C77033p1;
import X.C84284Iw;
import X.C88114Yj;
import X.C91004ez;
import X.C91584fv;
import X.C93934jm;
import X.C98764rg;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Spinner;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.wds.components.list.footer.WDSSectionFooter;
import java.util.ArrayList;

public class ManageGroupsInCommunityActivity extends AnonymousClass1FY {
    public int A00;
    public long A01;
    public View A02;
    public Spinner A03;
    public C003401n A04;
    public RecyclerView A05;
    public C84284Iw A06;
    public AnonymousClass4J1 A07;
    public C56372hM A08;
    public C72043Kk A09;
    public C77033p1 A0A;
    public AnonymousClass3X3 A0B;
    public AnonymousClass1VW A0C;
    public AnonymousClass1M9 A0D;
    public C24921Me A0E;
    public C27201Vd A0F;
    public AnonymousClass1CJ A0G;
    public AnonymousClass1MZ A0H;
    public AnonymousClass1MW A0I;
    public AnonymousClass1VU A0J;
    public AnonymousClass1EC A0K;
    public AnonymousClass1VD A0L;
    public C36331ni A0M;
    public AnonymousClass1PU A0N;
    public C36401np A0O;
    public AnonymousClass00H A0P;
    public AnonymousClass00H A0Q;
    public AnonymousClass00H A0R;
    public AnonymousClass00H A0S;
    public AnonymousClass00H A0T;
    public boolean A0U;
    public boolean A0V;
    public final AnonymousClass5XB A0W;

    public ManageGroupsInCommunityActivity() {
        this(0);
        this.A0W = new C93934jm(this, 0);
    }

    public static void A03(ManageGroupsInCommunityActivity manageGroupsInCommunityActivity) {
        String string;
        AnonymousClass4DZ r6;
        C39441t5 r7;
        C98764rg r8;
        String str;
        if (C18020vd.A05(C18040vf.A02, manageGroupsInCommunityActivity.A0E, 3829)) {
            WDSSectionFooter wDSSectionFooter = (WDSSectionFooter) C110885hR.A0A(manageGroupsInCommunityActivity, 2131432475);
            boolean z = manageGroupsInCommunityActivity.A0U;
            boolean z2 = ((AnonymousClass1E7) manageGroupsInCommunityActivity.A0A.A0F.A06()).A0e;
            if (z) {
                int i = 2131891969;
                if (z2) {
                    i = 2131891967;
                }
                string = manageGroupsInCommunityActivity.getString(i);
                r6 = AnonymousClass4DZ.A03;
                r7 = new C39441t5(manageGroupsInCommunityActivity.A0E);
                r8 = new C98764rg((Object) manageGroupsInCommunityActivity, 2);
                str = "community_settings_link";
            } else {
                int i2 = 2131891968;
                if (z2) {
                    i2 = 2131891966;
                }
                string = manageGroupsInCommunityActivity.getString(i2);
                r6 = AnonymousClass4DZ.A02;
                r7 = new C39441t5(manageGroupsInCommunityActivity.A0E);
                r8 = new C98764rg((Object) manageGroupsInCommunityActivity, 3);
                str = "learn-more";
            }
            wDSSectionFooter.setFooterTextWithLink(string, str, r6, r7, r8);
            C18030ve r2 = manageGroupsInCommunityActivity.A0E;
            AnonymousClass1Y5.A0C(wDSSectionFooter.A01.A01, manageGroupsInCommunityActivity.A08, r2);
            wDSSectionFooter.setVisibility(0);
        }
    }

    public static boolean A0Q(ManageGroupsInCommunityActivity manageGroupsInCommunityActivity) {
        int A0A2 = C72463Mc.A0A(manageGroupsInCommunityActivity.A0A.A0w);
        C18030ve r0 = AnonymousClass3MW.A0Z(manageGroupsInCommunityActivity.A0P).A07;
        C18040vf r1 = C18040vf.A02;
        if (A0A2 < C18020vd.A00(r1, r0, 1238) + 1) {
            return false;
        }
        String format = manageGroupsInCommunityActivity.A00.A0L().format((long) C18020vd.A00(r1, AnonymousClass3MW.A0Z(manageGroupsInCommunityActivity.A0P).A07, 1238));
        Toast.makeText(manageGroupsInCommunityActivity, manageGroupsInCommunityActivity.A00.A0H(format, new Object[]{format}, 2131755347), 0).show();
        return true;
    }

    public void A2y() {
        if (!this.A0V) {
            this.A0V = true;
            AnonymousClass1K1 A0K2 = C72473Md.A0K(this);
            AnonymousClass10E r3 = A0K2.AAQ;
            C72483Me.A0q(r3, this);
            AnonymousClass10G r2 = r3.A00;
            AnonymousClass1FB.A0K(r3, r2, this, r2.A45);
            AnonymousClass1FB.A0L(r3, r2, this, r2.A5A);
            this.A0O = AnonymousClass3MY.A0e(r2);
            this.A0T = AnonymousClass3MW.A0s(r3);
            this.A0G = AnonymousClass3Ma.A0d(r3);
            this.A0F = AnonymousClass3MZ.A0i(r3);
            this.A0S = C000200d.A00(r3.A6N);
            this.A0C = AnonymousClass3MZ.A0e(r3);
            this.A0D = AnonymousClass10E.A4z(r3);
            this.A0E = AnonymousClass3MZ.A0g(r3);
            this.A0N = AnonymousClass3MZ.A12(r3);
            this.A0M = AnonymousClass10E.AKo(r3);
            this.A0J = AnonymousClass3MZ.A0s(r3);
            this.A0P = C000200d.A00(r3.A2L);
            this.A0R = AnonymousClass3MX.A10(r3);
            this.A0L = (AnonymousClass1VD) r3.A9J.get();
            this.A0H = AnonymousClass3MY.A0V(r3);
            this.A0I = AnonymousClass3MZ.A0p(r3);
            this.A06 = (C84284Iw) A0K2.A1Z.get();
            this.A0Q = C000200d.A00(r3.A2M);
            this.A07 = (AnonymousClass4J1) A0K2.A1u.get();
            this.A09 = AnonymousClass3MZ.A0T(r2);
            this.A08 = (C56372hM) A0K2.A1v.get();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 10) {
            super.onActivityResult(i, i2, intent);
            return;
        }
        if (i2 == -1) {
            if (intent != null && intent.getExtras() != null) {
                ArrayList<String> stringArrayList = intent.getExtras().getStringArrayList("selected_jids");
                ArrayList<String> stringArrayList2 = intent.getExtras().getStringArrayList("hidden_groups_jids");
                boolean z = intent.getExtras().getBoolean("is_suggest_mode", false);
                if (stringArrayList != null && !stringArrayList.isEmpty()) {
                    if (!AnonymousClass3MW.A1Y(this)) {
                        int i3 = 2131892439;
                        if (AnonymousClass11E.A02(getApplicationContext())) {
                            i3 = 2131892440;
                        }
                        this.A05.A05(i3);
                        return;
                    }
                    this.A01 = SystemClock.uptimeMillis();
                    int i4 = 2131893530;
                    if (z) {
                        i4 = 2131896618;
                    }
                    CNB(i4, 2131895077);
                    C77033p1 r2 = this.A0A;
                    r2.A10.execute(new C21437Ak4(r2, this.A0K, stringArrayList, stringArrayList2, 5, z));
                    return;
                }
            } else {
                return;
            }
        } else if (i2 != -10) {
            return;
        }
        this.A05.A05(2131892926);
    }

    /* JADX WARNING: type inference failed for: r0v21, types: [X.4Yj, java.lang.Object] */
    public void onCreate(Bundle bundle) {
        Integer num;
        super.onCreate(bundle);
        AnonymousClass1EC A0Y = C72473Md.A0Y(getIntent(), "parent_group_jid");
        this.A0K = A0Y;
        this.A0U = this.A0H.A0K(A0Y);
        this.A00 = getIntent().getIntExtra("group_create_entry_point", 14);
        setContentView(2131624133);
        C110885hR.A0A(this, 2131429223).setVisibility(8);
        this.A02 = findViewById(2131427605);
        C003401n A0S2 = C72463Mc.A0S(this, AnonymousClass3Ma.A0F(this));
        this.A04 = A0S2;
        A0S2.A0Y(true);
        this.A04.A0W(true);
        C003401n r3 = this.A04;
        int i = 2131886485;
        if (this.A0U) {
            i = 2131891843;
        }
        r3.A0M(i);
        View findViewById = findViewById(2131427603);
        AnonymousClass48m.A00(findViewById, this, 7);
        AnonymousClass3MY.A0w(this, findViewById, 2131889088);
        AnonymousClass1Y5.A07(findViewById, "Button");
        View findViewById2 = findViewById(2131427602);
        AnonymousClass48m.A00(findViewById2, this, 8);
        AnonymousClass3MY.A0w(this, findViewById2, 2131891625);
        AnonymousClass1Y5.A07(findViewById2, "Button");
        C37451pZ A062 = this.A0F.A06(this, "add-groups-to-community");
        C84284Iw r6 = this.A06;
        AnonymousClass1EC r5 = this.A0K;
        ? obj = new Object();
        C88114Yj.A00(obj);
        this.A0A = C77033p1.A00(this, r6, obj, r5, 2);
        RecyclerView recyclerView = (RecyclerView) C110885hR.A0A(this, 2131427656);
        this.A05 = recyclerView;
        recyclerView.setPadding(recyclerView.getPaddingLeft(), this.A05.getPaddingTop(), this.A05.getPaddingRight(), getResources().getDimensionPixelSize(2131168782));
        this.A03 = (Spinner) C110885hR.A0A(this, 2131427604);
        AnonymousClass3Ma.A15(this, this.A05);
        AnonymousClass4J1 r4 = this.A07;
        if (this.A0U) {
            num = AnonymousClass00R.A01;
        } else {
            num = AnonymousClass00R.A00;
        }
        AnonymousClass3X3 r62 = new AnonymousClass3X3((AnonymousClass4J2) r4.A00.A00.A1t.get(), this.A0W, A062, num, AnonymousClass00R.A00);
        this.A0B = r62;
        this.A05.setAdapter(r62);
        A03(this);
        AnonymousClass1Y5.A0A(findViewById(2131431334), true);
        this.A03.setVisibility(0);
        this.A05.setVisibility(8);
        C91584fv.A00(this, this.A0A.A0x, 37);
        C91584fv.A00(this, this.A0A.A0w, 38);
        C91584fv.A00(this, this.A0A.A0G, 39);
        C91584fv.A00(this, this.A0A.A0F, 40);
        C91584fv.A00(this, this.A0A.A0H, 41);
        C91584fv.A00(this, this.A0A.A0I, 42);
    }

    public ManageGroupsInCommunityActivity(int i) {
        this.A0V = false;
        C91004ez.A00(this, 3);
    }
}
