package com.whatsapp.group;

import X.AnonymousClass000;
import X.AnonymousClass00R;
import X.AnonymousClass10I;
import X.AnonymousClass1DF;
import X.AnonymousClass1HF;
import X.AnonymousClass1M9;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3Ma;
import X.AnonymousClass3NB;
import X.AnonymousClass49N;
import X.AnonymousClass4aX;
import X.C104325Ns;
import X.C17890vO;
import X.C18000vb;
import X.C18070vi;
import X.C18100vl;
import X.C20103A7h;
import X.C24261Jm;
import X.C24921Me;
import X.C27201Vd;
import X.C37451pZ;
import X.C72043Kk;
import X.C72453Mb;
import X.C72463Mc;
import X.C73493We;
import X.C74743cP;
import X.C825148g;
import X.C88414Zp;
import X.C89944dH;
import X.C91184fH;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.WaTextView;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class GroupChangedParticipantsBottomSheet extends Hilt_GroupChangedParticipantsBottomSheet {
    public View A00;
    public FrameLayout A01;
    public LinearLayout A02;
    public SearchView A03;
    public C72043Kk A04;
    public AnonymousClass1M9 A05;
    public C24921Me A06;
    public C37451pZ A07;
    public C27201Vd A08;
    public C18000vb A09;
    public C73493We A0A;
    public AnonymousClass10I A0B;
    public String A0C;
    public WaTextView A0D;
    public AnonymousClass49N A0E;
    public List A0F = AnonymousClass000.A13();
    public final C18100vl A0G = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new C104325Ns(this));
    public final C18100vl A0H = C88414Zp.A02(this, "changed_participants_title");
    public final int A0I = 2131625485;

    public static final void A01(GroupChangedParticipantsBottomSheet groupChangedParticipantsBottomSheet, String str) {
        String str2;
        GroupChangedParticipantsBottomSheet groupChangedParticipantsBottomSheet2 = groupChangedParticipantsBottomSheet;
        String str3 = str;
        groupChangedParticipantsBottomSheet2.A0C = str;
        C17890vO.A0t(groupChangedParticipantsBottomSheet2.A0E);
        C24921Me r2 = groupChangedParticipantsBottomSheet2.A06;
        if (r2 != null) {
            C18000vb r3 = groupChangedParticipantsBottomSheet2.A09;
            if (r3 != null) {
                AnonymousClass49N r1 = new AnonymousClass49N(r2, r3, groupChangedParticipantsBottomSheet2, groupChangedParticipantsBottomSheet2, str3, groupChangedParticipantsBottomSheet2.A0F);
                groupChangedParticipantsBottomSheet2.A0E = r1;
                AnonymousClass10I r0 = groupChangedParticipantsBottomSheet2.A0B;
                if (r0 != null) {
                    C17890vO.A0u(r1, r0);
                    return;
                }
                str2 = "waWorkers";
            } else {
                str2 = "whatsAppLocale";
            }
        } else {
            str2 = "waContactNames";
        }
        C18070vi.A11(str2);
        throw null;
    }

    public void A20(Bundle bundle) {
        C18070vi.A0d(bundle, 0);
        super.A20(bundle);
        View view = this.A00;
        boolean z = false;
        if (view != null && view.getVisibility() == 0) {
            z = true;
        }
        bundle.putBoolean("search", z);
    }

    public void A21(Bundle bundle, View view) {
        String str;
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        if (bundle != null && bundle.getBoolean("search")) {
            A00(this);
        }
        this.A02 = AnonymousClass3MX.A0K(view, 2131436230);
        View A062 = AnonymousClass1HF.A06(view, 2131434898);
        this.A00 = A062;
        if (A062 != null) {
            A062.setBackgroundResource(2131232920);
            this.A03 = (SearchView) AnonymousClass1HF.A06(A062, 2131434976);
        }
        SearchView searchView = this.A03;
        C18070vi.A0b(searchView);
        TextView A0E2 = AnonymousClass3Ma.A0E(searchView, 2131434969);
        C72463Mc.A0w(view.getContext(), view.getContext(), A0E2, 2130971105, 2131102431);
        SearchView searchView2 = this.A03;
        if (searchView2 != null) {
            searchView2.setIconifiedByDefault(false);
        }
        SearchView searchView3 = this.A03;
        if (searchView3 != null) {
            searchView3.setQueryHint(A1H(2131899369));
        }
        SearchView searchView4 = this.A03;
        C18070vi.A0b(searchView4);
        View A063 = AnonymousClass1HF.A06(searchView4, 2131434914);
        C18070vi.A0z(A063, "null cannot be cast to non-null type android.widget.ImageView");
        ((ImageView) A063).setImageDrawable(new AnonymousClass3NB(C24261Jm.A00(view.getContext(), 2131231675)));
        SearchView searchView5 = this.A03;
        if (searchView5 != null) {
            C91184fH.A00(searchView5, this, 6);
        }
        View view2 = this.A00;
        C18070vi.A0b(view2);
        ImageView A0C2 = AnonymousClass3Ma.A0C(view2, 2131434851);
        C18000vb r5 = this.A09;
        if (r5 != null) {
            C74743cP.A03(AnonymousClass4aX.A04(A1n(), view.getContext(), 2130970284, 2131101275, 2131231675), A0C2, r5);
            C825148g.A00(A0C2, this, 16);
            C89944dH.A00(C18070vi.A05(view, 2131434858), this, 46);
            RecyclerView recyclerView = (RecyclerView) C18070vi.A05(view, 2131429016);
            C27201Vd r2 = this.A08;
            if (r2 != null) {
                this.A07 = r2.A06(view.getContext(), "group-participants-changed-activity");
                WaTextView A0T = AnonymousClass3MW.A0T(view, 2131429017);
                this.A0D = A0T;
                if (A0T != null) {
                    C72453Mb.A1G(A0T, this.A0H);
                }
                WaTextView waTextView = this.A0D;
                if (waTextView != null) {
                    waTextView.setVisibility(0);
                }
                C18100vl r3 = this.A0G;
                if (AnonymousClass3MW.A11(r3).isEmpty()) {
                    Log.e("GroupChangedParticipantsActivity/empty changed participants jids");
                } else {
                    List list = this.A0F;
                    AnonymousClass1M9 r1 = this.A05;
                    if (r1 != null) {
                        list.addAll(r1.A0P((Collection) r3.getValue()).values());
                    } else {
                        str = "contactManager";
                    }
                }
                Dialog dialog = this.A03;
                C18070vi.A0z(dialog, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
                this.A01 = (FrameLayout) dialog.findViewById(2131429948);
                C73493We r32 = new C73493We(this);
                this.A0A = r32;
                List list2 = this.A0F;
                C18070vi.A0d(list2, 0);
                r32.A01 = list2;
                C18000vb r0 = r32.A02.A09;
                if (r0 != null) {
                    ArrayList A032 = C20103A7h.A03(r0, (String) null);
                    C18070vi.A0X(A032);
                    r32.A00 = A032;
                    r32.notifyDataSetChanged();
                    C73493We r02 = this.A0A;
                    if (r02 == null) {
                        AnonymousClass3MW.A1B();
                        throw null;
                    } else {
                        recyclerView.setAdapter(r02);
                        return;
                    }
                } else {
                    AnonymousClass3MW.A1M();
                    throw null;
                }
            } else {
                str = "contactPhotos";
            }
        } else {
            str = "whatsAppLocale";
        }
        C18070vi.A11(str);
        throw null;
    }

    public static final void A00(GroupChangedParticipantsBottomSheet groupChangedParticipantsBottomSheet) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        View view = groupChangedParticipantsBottomSheet.A0B;
        if (!(view == null || (layoutParams = view.getLayoutParams()) == null)) {
            int i = layoutParams.height;
            FrameLayout frameLayout = groupChangedParticipantsBottomSheet.A01;
            if (!(frameLayout == null || (layoutParams2 = frameLayout.getLayoutParams()) == null)) {
                layoutParams2.height = i;
            }
        }
        SearchView searchView = groupChangedParticipantsBottomSheet.A03;
        if (searchView != null) {
            searchView.A0H();
        }
        C72453Mb.A1D(groupChangedParticipantsBottomSheet.A02);
        View view2 = groupChangedParticipantsBottomSheet.A00;
        if (view2 != null) {
            view2.setVisibility(0);
        }
    }

    public int A2F() {
        return this.A0I;
    }

    public void A1s() {
        super.A1s();
        this.A03 = null;
        this.A0D = null;
        this.A00 = null;
        this.A02 = null;
        C37451pZ r0 = this.A07;
        if (r0 != null) {
            r0.A02();
        }
        this.A07 = null;
        C17890vO.A0t(this.A0E);
    }
}
