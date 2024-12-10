package com.whatsapp.group;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1BI;
import X.AnonymousClass1CJ;
import X.AnonymousClass1E7;
import X.AnonymousClass1EC;
import X.AnonymousClass1FB;
import X.AnonymousClass1K1;
import X.AnonymousClass1LU;
import X.AnonymousClass1MW;
import X.AnonymousClass1MZ;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3gf;
import X.AnonymousClass4CC;
import X.AnonymousClass4GT;
import X.AnonymousClass4SL;
import X.AnonymousClass4aU;
import X.C000200d;
import X.C146987Rj;
import X.C17880vN;
import X.C17900vP;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C19880zA;
import X.C19890zB;
import X.C22971Dz;
import X.C24921Me;
import X.C25511Om;
import X.C30391dr;
import X.C32101gd;
import X.C34001jj;
import X.C37581pm;
import X.C42751yg;
import X.C58402kd;
import X.C72453Mb;
import X.C72463Mc;
import X.C72473Md;
import X.C72483Me;
import X.C74803cp;
import X.C81673zc;
import X.C825448t;
import X.C83794Gr;
import X.C84964Ln;
import X.C88474Zv;
import X.C91014f0;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.whatsapp.community.CommunityMembersDirectory;
import com.whatsapp.community.CommunityMembersDirectory$getCommunityContacts$1;
import com.whatsapp.group.membersuggestions.GroupMemberSuggestionsViewModel;
import com.whatsapp.group.membersuggestions.GroupMemberSuggestionsViewModel$logContactSelectionChangeSuggestionsEnabled$1;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.search.WDSSearchBar;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;

public class GroupMembersSelector extends AnonymousClass3gf {
    public C19880zA A00;
    public C32101gd A01;
    public AnonymousClass1CJ A02;
    public AnonymousClass1MZ A03;
    public AnonymousClass1MW A04;
    public C825448t A05;
    public GroupMemberSuggestionsViewModel A06;
    public AnonymousClass1EC A07;
    public AnonymousClass00H A08;
    public AnonymousClass00H A09;
    public AnonymousClass00H A0A;
    public AnonymousClass00H A0B;
    public List A0C;
    public List A0D;
    public List A0E;
    public boolean A0F;
    public int A0G;
    public List A0H;
    public boolean A0I;
    public boolean A0J;

    public GroupMembersSelector() {
        this(0);
        this.A0F = false;
        this.A0J = false;
        this.A06 = null;
    }

    public static void A0z(GroupMembersSelector groupMembersSelector, boolean z) {
        ArrayList A042;
        String rawString;
        groupMembersSelector.A05 = null;
        boolean z2 = z;
        if (groupMembersSelector.A0J) {
            Intent A0A2 = C17880vN.A0A();
            Intent putExtra = A0A2.putExtra("duplicate_ug_exists", z).putExtra("selected", C22971Dz.A0B(groupMembersSelector.A0E)).putExtra("entry_point", groupMembersSelector.getIntent().getIntExtra("entry_point", -1));
            AnonymousClass1EC r0 = groupMembersSelector.A07;
            if (r0 == null) {
                rawString = null;
            } else {
                rawString = r0.getRawString();
            }
            putExtra.putExtra("parent_group_jid_to_link", rawString);
            C72453Mb.A16(groupMembersSelector, A0A2);
            return;
        }
        C34001jj A0H2 = AnonymousClass3Ma.A0H(groupMembersSelector);
        ArrayList A4p = groupMembersSelector.A4p();
        int i = groupMembersSelector.A0G;
        AnonymousClass1EC r4 = groupMembersSelector.A07;
        Bundle bundleExtra = groupMembersSelector.getIntent().getBundleExtra("fMessageKeyBundle");
        if (bundleExtra == null) {
            A042 = null;
        } else {
            A042 = AnonymousClass4aU.A04(bundleExtra);
        }
        A0H2.A0B(C83794Gr.A00(r4, AnonymousClass3MY.A09(groupMembersSelector).getString("appended_message"), A4p, A042, i, z2, AnonymousClass3MY.A09(groupMembersSelector).getBoolean("include_captions"), false), (String) null);
        A0H2.A04();
    }

    public void A4y(AnonymousClass4SL r9, AnonymousClass1E7 r10) {
        AnonymousClass1E7 r4 = r10;
        super.A4y(r9, r10);
        C42751yg A0D2 = this.A08.A0D(r10, 7);
        if (A0D2.A00 == AnonymousClass00R.A0Y) {
            r9.A03.A0R(C24921Me.A01(this.A08, r10, true).A01);
        }
        r9.A04.A04(A0D2, r4, this.A0S, 7, r10.A0P());
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [X.1LU, java.lang.Object] */
    public void onActivityResult(int i, int i2, Intent intent) {
        Intent A062;
        if (i != 1) {
            if (i != 150) {
                super.onActivityResult(i, i2, intent);
                return;
            } else if (i2 != -1) {
                Log.i("groupmembersselector/permissions denied");
            } else {
                return;
            }
        } else if (i2 == -1) {
            if (intent != null) {
                AnonymousClass1EC A0Y = C72473Md.A0Y(intent, "group_jid");
                Bundle bundleExtra = intent.getBundleExtra("new_group_result_bundle");
                C17900vP.A0Y(A0Y, "groupmembersselector/group created ", AnonymousClass000.A10());
                if (this.A02.A0P(A0Y) && !Bed()) {
                    C17900vP.A0Y(A0Y, "groupmembersselector/opening conversation", AnonymousClass000.A10());
                    if (this.A07 == null || this.A0G == 10) {
                        A062 = AnonymousClass3MY.A06(this, new Object(), A0Y);
                    } else {
                        new Object();
                        A062 = C72473Md.A0A(this, A0Y, 0);
                    }
                    if (bundleExtra != null) {
                        A062.putExtra("new_group_result_bundle", bundleExtra);
                    }
                    this.A01.A09(this, A062);
                }
            }
            startActivity(AnonymousClass1LU.A02(this));
        } else {
            return;
        }
        finish();
    }

    public static List A0y(GroupMembersSelector groupMembersSelector) {
        Collection collection;
        if (groupMembersSelector.A0H == null) {
            groupMembersSelector.A0H = AnonymousClass000.A13();
            C32101gd r4 = groupMembersSelector.A01;
            AnonymousClass1EC r3 = groupMembersSelector.A07;
            C37581pm A0H2 = AnonymousClass3MZ.A0H(groupMembersSelector);
            CommunityMembersDirectory communityMembersDirectory = (CommunityMembersDirectory) r4;
            C18070vi.A0d(r3, 0);
            try {
                collection = (Collection) AnonymousClass4GT.A00(A0H2.A01, new CommunityMembersDirectory$getCommunityContacts$1(communityMembersDirectory, r3, (C30391dr) null));
            } catch (CancellationException e) {
                Log.e((Throwable) e);
                collection = C25511Om.A00;
            }
            groupMembersSelector.A0H.addAll(collection);
        }
        return groupMembersSelector.A0H;
    }

    public void A2y() {
        if (!this.A0I) {
            this.A0I = true;
            AnonymousClass1K1 A0K = C72473Md.A0K(this);
            AnonymousClass10E r3 = A0K.AAQ;
            C72483Me.A0q(r3, this);
            AnonymousClass10G r1 = r3.A00;
            AnonymousClass1FB.A0K(r3, r1, this, r1.A45);
            AnonymousClass1FB.A0L(r3, r1, this, r1.A5A);
            C74803cp.A0t(A0K, r3, r1, this, A0K.A63);
            C74803cp.A0s(A0K, r3, r1, this);
            this.A02 = AnonymousClass3Ma.A0d(r3);
            this.A00 = C19890zB.A00;
            this.A01 = AnonymousClass10E.A46(r3);
            this.A04 = AnonymousClass3MZ.A0p(r3);
            this.A03 = AnonymousClass3MY.A0V(r3);
            this.A0A = AnonymousClass3MX.A11(r3);
            this.A0B = C000200d.A00(r3.Ag3);
            this.A08 = C000200d.A00(A0K.A48);
            this.A09 = C000200d.A00(A0K.A4B);
        }
    }

    public void A3K() {
        AnonymousClass3MX.A0u(this.A0A).A02((AnonymousClass1BI) null, 89);
    }

    public void A4u(int i) {
        if (i <= 0) {
            getSupportActionBar().A0L(2131886494);
        } else {
            super.A4u(i);
        }
    }

    public void A55(ArrayList arrayList) {
        super.A55(arrayList);
        Iterator it = ((C58402kd) this.A0B.get()).A00().iterator();
        while (it.hasNext()) {
            AnonymousClass1E7 A0E2 = this.A06.A0E(C17880vN.A0Q(it));
            if (A0E2 != null && A0E2.A10 && !arrayList.contains(A0E2)) {
                arrayList.add(A0E2);
            }
        }
        if (this.A0C == null) {
            ArrayList A13 = AnonymousClass000.A13();
            this.A0C = A13;
            this.A06.A0v(A13);
            Collections.sort(this.A0C, new C146987Rj(this.A08, this.A0F));
        }
        arrayList.addAll(this.A0C);
        if (this.A02.A06(this.A07) == 1) {
            arrayList.addAll(A0y(this));
        }
    }

    public void A57(List list) {
        if (list.isEmpty() && !TextUtils.isEmpty(this.A0R)) {
            A56(list);
        }
        super.A57(list);
    }

    public void A59(List list) {
        super.A59(list);
        A5A(list);
    }

    public void BEb(AnonymousClass1E7 r7) {
        super.BEb(r7);
        this.A0F = true;
        GroupMemberSuggestionsViewModel groupMemberSuggestionsViewModel = this.A06;
        if (groupMemberSuggestionsViewModel != null) {
            AnonymousClass3MW.A1X(groupMemberSuggestionsViewModel.A05, new GroupMemberSuggestionsViewModel$logContactSelectionChangeSuggestionsEnabled$1(r7, groupMemberSuggestionsViewModel, (C30391dr) null, 89), C72453Mb.A12(groupMemberSuggestionsViewModel, r7));
            return;
        }
        C88474Zv r4 = (C88474Zv) this.A08.get();
        C18070vi.A0d(r7, 0);
        C81673zc r2 = new C81673zc();
        int i = 5;
        if (r7.A0y) {
            i = 3;
        }
        C72463Mc.A1E(r2, r4, 89, i, false);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent() != null) {
            this.A07 = AnonymousClass1EC.A01.A02(getIntent().getStringExtra("parent_group_jid_to_link"));
            this.A0G = getIntent().getIntExtra("entry_point", 15);
            this.A0J = AnonymousClass3MY.A1a(getIntent(), "return_result");
        }
        if (bundle == null && !AnonymousClass3MX.A1W(this.A0E) && !C72463Mc.A1W(this.A0L)) {
            C72453Mb.A15(this, 2131894317, 2131894316);
        }
        WDSSearchBar wDSSearchBar = this.A0H;
        if (wDSSearchBar != null) {
            wDSSearchBar.A08.setTrailingButtonIcon(AnonymousClass4CC.A00);
            this.A0H.A08.setHint(2131895490);
        }
        if (this.A02.A06(this.A07) != 1) {
            if (C18020vd.A05(C18040vf.A02, ((C84964Ln) this.A09.get()).A00, 7809) && this.A06 == null) {
                GroupMemberSuggestionsViewModel groupMemberSuggestionsViewModel = (GroupMemberSuggestionsViewModel) AnonymousClass3MW.A0N(this).A00(GroupMemberSuggestionsViewModel.class);
                this.A06 = groupMemberSuggestionsViewModel;
                groupMemberSuggestionsViewModel.A0U(C25511Om.A00, 92);
            }
        }
        C72463Mc.A1E(new C81673zc(), (C88474Zv) this.A08.get(), 89, 0, true);
    }

    public GroupMembersSelector(int i) {
        this.A0I = false;
        C91014f0.A00(this, 17);
    }
}
