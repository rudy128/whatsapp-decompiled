package com.whatsapp.polls.creator;

import X.AG1;
import X.AnonymousClass00H;
import X.AnonymousClass1BI;
import X.AnonymousClass1DT;
import X.AnonymousClass1GP;
import X.AnonymousClass1L4;
import X.AnonymousClass1Xr;
import X.AnonymousClass1YL;
import X.AnonymousClass22H;
import X.AnonymousClass3Ma;
import X.AnonymousClass3NL;
import X.AnonymousClass4Yv;
import X.AnonymousClass8BR;
import X.AnonymousClass8HN;
import X.AnonymousClass9P2;
import X.AnonymousClass9V5;
import X.AnonymousClass9V6;
import X.BM5;
import X.C003401n;
import X.C1183863g;
import X.C136736uJ;
import X.C1406072e;
import X.C166938eL;
import X.C18070vi;
import X.C18100vl;
import X.C181769Rt;
import X.C19880zA;
import X.C20098A7b;
import X.C20338AGu;
import X.C20339AGv;
import X.C21528Alb;
import X.C21535Ali;
import X.C21728Are;
import X.C38391rD;
import X.C72453Mb;
import X.C72463Mc;
import X.C88184Yq;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

public class PollCreatorActivity extends C166938eL {
    public C19880zA A00;
    public AnonymousClass9V5 A01;
    public AnonymousClass9V6 A02;
    public C88184Yq A03;
    public AnonymousClass00H A04;
    public AnonymousClass00H A05;
    public BottomSheetBehavior A06;
    public final C18100vl A07 = C21528Alb.A00(this, 45);
    public final C18100vl A08 = C21528Alb.A00(this, 46);
    public final C18100vl A09 = C21528Alb.A00(this, 48);
    public final C18100vl A0A = C21528Alb.A00(this, 39);
    public final C18100vl A0B = C21528Alb.A00(this, 40);
    public final C18100vl A0C = C21528Alb.A00(this, 42);
    public final C18100vl A0D = C21528Alb.A00(this, 41);
    public final C18100vl A0E = C21528Alb.A00(this, 43);
    public final C18100vl A0F = C21528Alb.A00(this, 47);
    public final C18100vl A0G = C21528Alb.A00(this, 44);

    public void BkF(String str) {
        C18070vi.A0d(str, 0);
        if (str.equals("discard_edits")) {
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        setTitle(2131889094);
        C003401n supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0M(2131889094);
        }
        C18100vl r5 = this.A09;
        int i = 2131626476;
        if (C72453Mb.A1a(r5)) {
            i = 2131626477;
        }
        setContentView(i);
        C003401n A0S = C72463Mc.A0S(this, AnonymousClass3Ma.A0G(this));
        A0S.A0W(true);
        C18100vl r7 = this.A0E;
        AnonymousClass1DT r8 = AnonymousClass8BR.A0d(r7).A06;
        C18100vl r4 = this.A0C;
        C20339AGv.A00(this, r8, new C21728Are(r4.getValue(), 48), 46);
        C20339AGv.A00(this, AnonymousClass8BR.A0d(r7).A02, C21535Ali.A00(this, 29), 46);
        if (this.A00 != null) {
            C20339AGv.A00(this, AnonymousClass8BR.A0d(r7).A0C, C21535Ali.A00(this, 30), 46);
            C20338AGu.A00(this, AnonymousClass8BR.A0d(r7).A0B, 8);
            C20339AGv.A00(this, AnonymousClass8BR.A0d(r7).A0A, C21535Ali.A00(this, 31), 46);
            C20339AGv.A00(this, AnonymousClass8BR.A0d(r7).A04, new C21728Are(this, 49), 46);
            String stringExtra = getIntent().getStringExtra("entry_string_text");
            if (!(stringExtra == null || stringExtra.length() == 0)) {
                AnonymousClass8BR.A0d(r7).A09.A00 = stringExtra;
                getIntent().removeExtra("entry_string_text");
            }
            CompoundButton compoundButton = (CompoundButton) this.A0A.getValue();
            compoundButton.setText(2131896158);
            compoundButton.setOnCheckedChangeListener(new AG1(this, 1));
            if (this.A00 != null) {
                C18100vl r72 = this.A0D;
                AnonymousClass1Xr.A05((View) r72.getValue(), false);
                new BM5(new AnonymousClass8HN(this)).A0D((RecyclerView) r72.getValue());
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, 1, false);
                RecyclerView recyclerView = (RecyclerView) r72.getValue();
                recyclerView.setLayoutManager(linearLayoutManager);
                recyclerView.setAdapter((C38391rD) r4.getValue());
                ImageView A0C2 = AnonymousClass3Ma.A0C(this.A00, 2131433923);
                C18070vi.A0W(this.A0E);
                AnonymousClass3NL.A01(A0C2.getContext(), A0C2, this.A00, 2131232506);
                AnonymousClass3Ma.A1D(A0C2, this, 46);
                AnonymousClass1BI r42 = (AnonymousClass1BI) this.A07.getValue();
                if (r42 != null) {
                    AnonymousClass00H r0 = this.A05;
                    if (r0 != null) {
                        C1406072e r3 = (C1406072e) r0.get();
                        C1183863g r1 = new C1183863g();
                        r1.A04 = 1;
                        C1406072e.A00(r1, r42, r3);
                        C1406072e.A01(r1, r42, (AnonymousClass22H) null);
                        r3.A00.CC7(r1);
                    } else {
                        str = "pollEventStatLogger";
                        C18070vi.A11(str);
                        throw null;
                    }
                }
                if (C72453Mb.A1a(r5)) {
                    View A052 = C18070vi.A05(this.A00, 2131432239);
                    this.A06 = new BottomSheetBehavior();
                    AnonymousClass00H r02 = this.A04;
                    if (r02 != null) {
                        BottomSheetBehavior bottomSheetBehavior = this.A06;
                        AnonymousClass1L4 r10 = this.A09;
                        C18070vi.A0W(r10);
                        ((C136736uJ) r02.get()).A02(A052, bottomSheetBehavior, this, r10, (Float) null, true, true);
                        C181769Rt.A00(this, A0S);
                        AnonymousClass00H r03 = this.A04;
                        if (r03 != null) {
                            ((C136736uJ) r03.get()).A03(this.A06, false);
                            return;
                        } else {
                            C18070vi.A11("mediaAttachmentUtils");
                            throw null;
                        }
                    } else {
                        str = "mediaAttachmentUtils";
                        C18070vi.A11(str);
                        throw null;
                    }
                } else {
                    return;
                }
            }
        }
        str = "pollCreatorHelper";
        C18070vi.A11(str);
        throw null;
    }

    public void onBackPressed() {
        C18100vl r1 = this.A0E;
        if (AnonymousClass8BR.A0d(r1).A09.A00.length() != 0 || !AnonymousClass8BR.A0d(r1).A0V()) {
            A0Q();
        } else {
            super.onBackPressed();
        }
    }

    private final void A0Q() {
        if (!AnonymousClass4Yv.A02(this)) {
            C20098A7b.A01(AnonymousClass9P2.A00((AnonymousClass1GP) null, 2131894686, 2131894698, 2131894685, Integer.valueOf(AnonymousClass1YL.A00(this, 2130970924, 2131102368)), "discard_edits", (String) null, (Object[]) null, 2131894684), getSupportFragmentManager());
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C88184Yq r1 = this.A03;
        if (r1 != null) {
            r1.A02(10);
        } else {
            C18070vi.A11("conversationAttachmentEventLogger");
            throw null;
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (C72453Mb.A0B(menuItem) != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        C18100vl r1 = this.A0E;
        if (AnonymousClass8BR.A0d(r1).A09.A00.length() != 0 || !AnonymousClass8BR.A0d(r1).A0V()) {
            A0Q();
            return true;
        }
        finish();
        return true;
    }

    public void onResume() {
        super.onResume();
        if (this.A00 == null) {
            C18070vi.A11("pollCreatorHelper");
            throw null;
        }
    }
}
