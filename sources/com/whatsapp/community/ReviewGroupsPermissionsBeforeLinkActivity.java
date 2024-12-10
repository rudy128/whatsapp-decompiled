package com.whatsapp.community;

import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass02n;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass11C;
import X.AnonymousClass1CJ;
import X.AnonymousClass1DF;
import X.AnonymousClass1E7;
import X.AnonymousClass1EC;
import X.AnonymousClass1F9;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1K1;
import X.AnonymousClass1M9;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3NL;
import X.AnonymousClass3X3;
import X.AnonymousClass4J1;
import X.AnonymousClass4J2;
import X.AnonymousClass4WS;
import X.AnonymousClass5VK;
import X.AnonymousClass5XB;
import X.AnonymousClass5XC;
import X.C000200d;
import X.C005702m;
import X.C101985Es;
import X.C101995Et;
import X.C104005Mm;
import X.C18070vi;
import X.C18100vl;
import X.C18460wS;
import X.C22971Dz;
import X.C24071It;
import X.C27201Vd;
import X.C30391dr;
import X.C37451pZ;
import X.C37961qT;
import X.C38391rD;
import X.C72453Mb;
import X.C72473Md;
import X.C72483Me;
import X.C73303Uh;
import X.C89894dC;
import X.C90594eK;
import X.C91004ez;
import X.C91074f6;
import X.C91374fa;
import X.C93934jm;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public final class ReviewGroupsPermissionsBeforeLinkActivity extends AnonymousClass1FY {
    public RecyclerView A00;
    public AnonymousClass4J1 A01;
    public AnonymousClass5XC A02;
    public C73303Uh A03;
    public AnonymousClass1M9 A04;
    public C27201Vd A05;
    public AnonymousClass1CJ A06;
    public AnonymousClass00H A07;
    public AnonymousClass00H A08;
    public AnonymousClass00H A09;
    public boolean A0A;
    public final AnonymousClass02n A0B;
    public final AnonymousClass5XB A0C;
    public final C18100vl A0D;
    public final C18100vl A0E;
    public final C18100vl A0F;

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.02h] */
    public ReviewGroupsPermissionsBeforeLinkActivity() {
        this(0);
        this.A0B = C91074f6.A00(this, new Object(), 2);
        this.A0D = AnonymousClass1DF.A01(new C101985Es(this));
        this.A0F = AnonymousClass1DF.A00(AnonymousClass00R.A01, new C104005Mm(this));
        this.A0E = AnonymousClass1DF.A01(new C101995Et(this));
        this.A0C = new C93934jm(this, 1);
    }

    public static final void A03(Bundle bundle, ReviewGroupsPermissionsBeforeLinkActivity reviewGroupsPermissionsBeforeLinkActivity) {
        C18070vi.A0d(bundle, 2);
        C73303Uh r3 = reviewGroupsPermissionsBeforeLinkActivity.A03;
        if (r3 == null) {
            AnonymousClass3MW.A1H();
            throw null;
        }
        String string = bundle.getString("group_jid_raw_key");
        boolean z = bundle.getBoolean("is_hidden_subgroup_result");
        Jid A0n = AnonymousClass3MX.A0n(string);
        if (A0n == null) {
            Log.e("ReviewGroupsPermissionsBeforeLinkViewModel/Group jid is null");
            return;
        }
        Set set = r3.A00;
        if (z) {
            set.add(A0n);
        } else {
            set.remove(A0n);
        }
        C73303Uh.A00(r3);
    }

    public static final void A0Q(C005702m r6, ReviewGroupsPermissionsBeforeLinkActivity reviewGroupsPermissionsBeforeLinkActivity) {
        Intent intent;
        Bundle extras;
        C18070vi.A0d(r6, 1);
        if (r6.A00 == -1 && (intent = r6.A01) != null && (extras = intent.getExtras()) != null && extras.getBoolean("has_permissions_changed")) {
            View view = reviewGroupsPermissionsBeforeLinkActivity.A00;
            C18070vi.A0X(view);
            String A0F2 = C18070vi.A0F(reviewGroupsPermissionsBeforeLinkActivity, 2131894504);
            List emptyList = Collections.emptyList();
            C18070vi.A0X(emptyList);
            AnonymousClass11C r3 = reviewGroupsPermissionsBeforeLinkActivity.A08;
            C18070vi.A0W(r3);
            new C90594eK(view, (AnonymousClass1F9) reviewGroupsPermissionsBeforeLinkActivity, r3, A0F2, emptyList, 2000, false).A03();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        C18070vi.A0d(bundle, 0);
        super.onSaveInstanceState(bundle);
        C73303Uh r0 = this.A03;
        if (r0 == null) {
            AnonymousClass3MW.A1H();
            throw null;
        } else {
            bundle.putStringArrayList("groups_to_be_hidden_jids", C22971Dz.A0B(r0.A01));
        }
    }

    public void A2y() {
        if (!this.A0A) {
            this.A0A = true;
            AnonymousClass1K1 A0K = C72473Md.A0K(this);
            AnonymousClass10E r2 = A0K.AAQ;
            C72483Me.A0q(r2, this);
            AnonymousClass10G r1 = r2.A00;
            AnonymousClass1FB.A0K(r2, r1, this, r1.A45);
            AnonymousClass1FB.A0L(r2, r1, this, r1.A5A);
            this.A06 = AnonymousClass3Ma.A0d(r2);
            this.A07 = C000200d.A00(r2.A2M);
            this.A04 = AnonymousClass10E.A4z(r2);
            this.A05 = AnonymousClass3MZ.A0i(r2);
            this.A08 = AnonymousClass3MX.A10(r2);
            this.A01 = (AnonymousClass4J1) A0K.A1u.get();
            this.A02 = (AnonymousClass5XC) A0K.A1w.get();
            this.A09 = AnonymousClass3MW.A0s(r2);
        }
    }

    public static final void A0V(ReviewGroupsPermissionsBeforeLinkActivity reviewGroupsPermissionsBeforeLinkActivity) {
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        String str;
        String A0k;
        List list;
        ArrayList<String> stringArrayList;
        super.onCreate(bundle);
        setContentView(2131624098);
        C89894dC.A00(findViewById(2131434694), this, 22);
        ImageView A0I = AnonymousClass3MX.A0I(this, 2131434690);
        C89894dC.A00(A0I, this, 23);
        AnonymousClass3NL.A01(this, A0I, this.A00, 2131231675);
        TextView A0L = AnonymousClass3MX.A0L(this, 2131434693);
        AnonymousClass1CJ r1 = this.A06;
        if (r1 != null) {
            C18100vl r6 = this.A0F;
            String A0F2 = r1.A0F(AnonymousClass3MX.A0m(r6));
            C18100vl r2 = this.A0D;
            int size = ((List) AnonymousClass3MX.A14(r2)).size();
            if (A0F2 != null) {
                Resources resources = getResources();
                Object[] A1b = AnonymousClass3MW.A1b();
                A1b[0] = NumberFormat.getInstance(this.A00.A0N()).format(Integer.valueOf(size));
                A1b[1] = A0F2;
                A0k = resources.getQuantityString(2131755204, size, A1b);
            } else {
                A0k = C72473Md.A0k(getResources(), size, 2131755209);
            }
            C18070vi.A0a(A0k);
            A0L.setText(A0k);
            TextView A0L2 = AnonymousClass3MX.A0L(this, 2131434691);
            int size2 = ((List) AnonymousClass3MX.A14(r2)).size();
            boolean A1a = C72453Mb.A1a(this.A0E);
            Resources resources2 = getResources();
            int i = 2131755363;
            if (A1a) {
                i = 2131755063;
            }
            String quantityString = resources2.getQuantityString(i, size2);
            C18070vi.A0a(quantityString);
            A0L2.setText(quantityString);
            ImageView A0I2 = AnonymousClass3MX.A0I(this, 2131434692);
            int dimensionPixelSize = getResources().getDimensionPixelSize(2131165951);
            AnonymousClass1M9 r0 = this.A04;
            if (r0 != null) {
                AnonymousClass1E7 A0A2 = r0.A03.A0A(AnonymousClass3MX.A0m(r6));
                if (A0A2 != null) {
                    C27201Vd r12 = this.A05;
                    if (r12 != null) {
                        r12.A06(this, "review-linked-group-permissions").A0A(A0I2, A0A2, dimensionPixelSize);
                    }
                    str = "contactPhotos";
                }
                C27201Vd r13 = this.A05;
                if (r13 != null) {
                    C37451pZ A062 = r13.A06(this, "review-group-permissions");
                    View findViewById = findViewById(2131432053);
                    RecyclerView recyclerView = (RecyclerView) findViewById;
                    AnonymousClass4J1 r02 = this.A01;
                    if (r02 != null) {
                        Integer num = AnonymousClass00R.A0C;
                        recyclerView.setAdapter(new AnonymousClass3X3((AnonymousClass4J2) r02.A00.A00.A1t.get(), this.A0C, A062, num, AnonymousClass00R.A01));
                        recyclerView.setItemAnimator((C37961qT) null);
                        AnonymousClass3Ma.A15(this, recyclerView);
                        C18070vi.A0X(findViewById);
                        this.A00 = recyclerView;
                        if (bundle == null || (stringArrayList = bundle.getStringArrayList("groups_to_be_hidden_jids")) == null) {
                            list = C18460wS.A00;
                        } else {
                            list = C22971Dz.A0A(AnonymousClass1EC.class, stringArrayList);
                            C18070vi.A0b(list);
                        }
                        AnonymousClass5XC r3 = this.A02;
                        if (r3 != null) {
                            List list2 = (List) AnonymousClass3MX.A14(r2);
                            C18070vi.A0d(list2, 1);
                            AnonymousClass4WS r14 = new AnonymousClass4WS();
                            AnonymousClass5VK r03 = new AnonymousClass5VK(r3, list2, list);
                            Class<C73303Uh> cls = C73303Uh.class;
                            this.A03 = (C73303Uh) new C24071It(AnonymousClass4WS.A00(r14, cls, r03), this).A00(cls);
                            AnonymousClass3MX.A1Q(new ReviewGroupsPermissionsBeforeLinkActivity$onCreate$4(this, (C30391dr) null), AnonymousClass3MZ.A0H(this));
                            getSupportFragmentManager().A0t(new C91374fa(this, 10), this, "RESULT_KEY");
                            return;
                        }
                        C18070vi.A11("reviewGroupsPermissionsBeforeLinkViewModelFactory");
                        throw null;
                    }
                    str = "manageSubgroupsAdapterFactory";
                }
                str = "contactPhotos";
            } else {
                str = "contactManager";
            }
        } else {
            str = "chatsCache";
        }
        C18070vi.A11(str);
        throw null;
    }

    public void onDestroy() {
        super.onDestroy();
        RecyclerView recyclerView = this.A00;
        if (recyclerView == null) {
            C18070vi.A11("groupsToLinkRecyclerView");
            throw null;
        } else {
            recyclerView.setAdapter((C38391rD) null);
        }
    }

    public ReviewGroupsPermissionsBeforeLinkActivity(int i) {
        this.A0A = false;
        C91004ez.A00(this, 6);
    }
}
