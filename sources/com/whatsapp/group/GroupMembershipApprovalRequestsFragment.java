package com.whatsapp.group;

import X.AH1;
import X.AnonymousClass00R;
import X.AnonymousClass11C;
import X.AnonymousClass11T;
import X.AnonymousClass1EC;
import X.AnonymousClass1KB;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3Ma;
import X.AnonymousClass8BR;
import X.AnonymousClass8GR;
import X.AnonymousClass9VT;
import X.C161778Hs;
import X.C18030ve;
import X.C18070vi;
import X.C20336AGs;
import X.C22194AzA;
import X.C22195AzB;
import X.C24921Me;
import X.C36401np;
import X.C42941yz;
import X.C72453Mb;
import X.C72463Mc;
import X.C72473Md;
import X.C91514fo;
import X.C91544fr;
import X.C91604fx;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.util.Log;

public final class GroupMembershipApprovalRequestsFragment extends Hilt_GroupMembershipApprovalRequestsFragment {
    public AnonymousClass9VT A00;
    public AnonymousClass1KB A01;
    public C24921Me A02;
    public AnonymousClass11C A03;
    public C18030ve A04;
    public C161778Hs A05;
    public AnonymousClass8GR A06;
    public AnonymousClass1EC A07;
    public C36401np A08;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return layoutInflater.inflate(2131625508, viewGroup, false);
    }

    public void A21(Bundle bundle, View view) {
        String str;
        C18070vi.A0d(view, 0);
        ViewStub viewStub = (ViewStub) AnonymousClass3MX.A0C(view, 2131433158);
        viewStub.setLayoutResource(2131625509);
        View inflate = viewStub.inflate();
        C18070vi.A0X(inflate);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) AnonymousClass3MX.A0C(inflate, 2131433157);
        AnonymousClass3Ma.A1L(textEmojiLabel.getAbProps(), textEmojiLabel);
        C72473Md.A1C(textEmojiLabel);
        RecyclerView recyclerView = (RecyclerView) AnonymousClass3MX.A0C(view, 2131433759);
        AnonymousClass3Ma.A15(recyclerView.getContext(), recyclerView);
        recyclerView.setAdapter(A25());
        try {
            C42941yz r0 = AnonymousClass1EC.A01;
            Bundle bundle2 = this.A06;
            if (bundle2 != null) {
                str = bundle2.getString("gid");
            } else {
                str = null;
            }
            this.A07 = C42941yz.A01(str);
            C161778Hs A25 = A25();
            AnonymousClass1EC r02 = this.A07;
            if (r02 != null) {
                A25.A00 = r02;
                this.A06 = (AnonymousClass8GR) AnonymousClass8BR.A0C(new AH1(this, 0), A1D()).A00(AnonymousClass8GR.class);
                A25().A02 = new C22194AzA(this);
                A25().A03 = new C22195AzB(this);
                AnonymousClass8GR r03 = this.A06;
                if (r03 != null) {
                    r03.A02.A0A(A1G(), new C91514fo(recyclerView, this, inflate, 10));
                    AnonymousClass8GR r04 = this.A06;
                    if (r04 != null) {
                        r04.A03.A0A(A1G(), new C91544fr(this, inflate, textEmojiLabel, recyclerView, 1));
                        AnonymousClass8GR r05 = this.A06;
                        if (r05 != null) {
                            r05.A04.A0A(A1G(), new C20336AGs(this, 3));
                            AnonymousClass8GR r06 = this.A06;
                            if (r06 != null) {
                                r06.A0H.A0A(A1G(), new C20336AGs(this, 4));
                                AnonymousClass8GR r07 = this.A06;
                                if (r07 != null) {
                                    r07.A0G.A0A(A1G(), new C20336AGs(this, 5));
                                    AnonymousClass8GR r08 = this.A06;
                                    if (r08 != null) {
                                        r08.A0I.A0A(A1G(), new C91604fx(this, 36));
                                        AnonymousClass8GR r09 = this.A06;
                                        if (r09 != null) {
                                            r09.A0F.A0A(A1G(), new C20336AGs(this, 6));
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                C18070vi.A11("viewModel");
            } else {
                C18070vi.A11("groupJid");
            }
            throw null;
        } catch (AnonymousClass11T e) {
            Log.e("GroupPendingParticipants started with invalid jid ", e);
            C72463Mc.A1A(this);
        }
    }

    public final C161778Hs A25() {
        C161778Hs r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("membershipApprovalRequestsAdapter");
        throw null;
    }

    public void A22(Menu menu, MenuInflater menuInflater) {
        boolean A15 = C18070vi.A15(menu, menuInflater);
        AnonymousClass8GR r0 = this.A06;
        if (r0 == null) {
            AnonymousClass3MW.A1H();
            throw null;
        }
        Integer num = r0.A01;
        int i = 2131432518;
        int i2 = 2131891048;
        if (num == AnonymousClass00R.A01) {
            i = 2131432519;
            i2 = 2131891049;
        }
        menu.add(A15 ? 1 : 0, i, A15, i2).setShowAsAction(A15);
    }

    public boolean A24(MenuItem menuItem) {
        AnonymousClass8GR r1;
        Integer num;
        int A0B = C72453Mb.A0B(menuItem);
        if (A0B == 2131432518) {
            r1 = this.A06;
            if (r1 != null) {
                num = AnonymousClass00R.A01;
            }
            C18070vi.A11("viewModel");
            throw null;
        } else if (A0B != 2131432519) {
            return false;
        } else {
            r1 = this.A06;
            if (r1 != null) {
                num = AnonymousClass00R.A00;
            }
            C18070vi.A11("viewModel");
            throw null;
        }
        AnonymousClass8GR.A03(r1, num);
        return false;
    }
}
