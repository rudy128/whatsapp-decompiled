package com.whatsapp.labelitem.view.bottomsheet;

import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass1BI;
import X.AnonymousClass1DS;
import X.AnonymousClass1FL;
import X.AnonymousClass1KW;
import X.AnonymousClass1NH;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3X4;
import X.AnonymousClass4KA;
import X.C000200d;
import X.C130096is;
import X.C146447Pd;
import X.C18070vi;
import X.C18090vk;
import X.C18100vl;
import X.C19890zB;
import X.C21399AjS;
import X.C27142DWd;
import X.C28931bI;
import X.C60032nH;
import X.C72453Mb;
import X.C825148g;
import X.C89954dI;
import X.C90664eR;
import X.C90674eS;
import X.C90684eT;
import X.C91644g1;
import X.C99154sM;
import X.C99244sV;
import android.app.Application;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.WaTextView;
import com.whatsapp.labelitem.view.AddToListViewModel;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.ArrayList;

public class AddToListFragment extends Hilt_AddToListFragment {
    public NestedScrollView A00;
    public RecyclerView A01;
    public AnonymousClass4KA A02;
    public WaTextView A03;
    public AnonymousClass3X4 A04;
    public AddLabelView A05;
    public NewLabelView A06;
    public C28931bI A07;
    public WDSButton A08;
    public AnonymousClass00H A09;
    public AnonymousClass00H A0A;
    public AnonymousClass00H A0B;
    public AnonymousClass00H A0C;
    public String A0D;
    public AnonymousClass1OS A0E;
    public final C18100vl A0F = C99154sM.A01(this, 45);

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        View inflate = layoutInflater.inflate(2131624189, viewGroup, false);
        this.A01 = AnonymousClass3MX.A0Q(inflate, 2131432069);
        this.A08 = AnonymousClass3MW.A0r(inflate, 2131434785);
        this.A03 = AnonymousClass3MW.A0U(inflate, 2131436208);
        this.A06 = (NewLabelView) inflate.findViewById(2131432977);
        this.A05 = (AddLabelView) inflate.findViewById(2131427608);
        this.A00 = (NestedScrollView) inflate.findViewById(2131434831);
        this.A07 = C72453Mb.A0s(inflate, 2131430073);
        return inflate;
    }

    public void A1r() {
        this.A01 = null;
        this.A08 = null;
        this.A03 = null;
        this.A05 = null;
        this.A06 = null;
        this.A00 = null;
        this.A07 = null;
        super.A1r();
    }

    public void A21(Bundle bundle, View view) {
        String str;
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        ViewTreeObserver viewTreeObserver3;
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        C18100vl r2 = this.A0F;
        r2.getValue();
        WaTextView waTextView = this.A03;
        if (waTextView != null) {
            AddToListViewModel addToListViewModel = (AddToListViewModel) r2.getValue();
            C130096is r0 = addToListViewModel.A00;
            if (r0 != null) {
                Application application = addToListViewModel.A01;
                r0.A04.get();
                waTextView.setText(C18070vi.A0F(application, 2131888311));
            } else {
                str = "addToListManager";
                C18070vi.A11(str);
                throw null;
            }
        }
        AnonymousClass4KA r02 = this.A02;
        if (r02 != null) {
            C99154sM r11 = new C99154sM(this, 44);
            AnonymousClass10E r03 = r02.A00.A02;
            AnonymousClass1KW A0f = AnonymousClass3Ma.A0f(r03);
            AnonymousClass00H A0z = AnonymousClass3MX.A0z(r03);
            AnonymousClass3X4 r6 = new AnonymousClass3X4(C19890zB.A00, AnonymousClass10E.A6Q(r03), A0f, A0z, r11);
            this.A04 = r6;
            RecyclerView recyclerView = this.A01;
            if (recyclerView != null) {
                recyclerView.setAdapter(r6);
            }
            AddLabelView addLabelView = this.A05;
            if (addLabelView != null) {
                addLabelView.A00();
            }
            if (C72453Mb.A1W(((AddToListViewModel) r2.getValue()).A0K)) {
                WDSButton wDSButton = this.A08;
                if (wDSButton != null) {
                    wDSButton.setText(2131891574);
                }
                WDSButton wDSButton2 = this.A08;
                if (wDSButton2 != null) {
                    wDSButton2.setEnabled(true);
                }
            }
            WDSButton wDSButton3 = this.A08;
            if (wDSButton3 != null) {
                C825148g.A00(wDSButton3, this, 44);
            }
            C18090vk r04 = ((AddToListViewModel) r2.getValue()).A0P;
            C18070vi.A0d(r04, 0);
            C91644g1.A00(A1G(), (AnonymousClass1DS) r04.invoke(), C99244sV.A00(this, 40), 44);
            C18090vk r05 = ((AddToListViewModel) r2.getValue()).A0R;
            C18070vi.A0d(r05, 0);
            C91644g1.A00(A1G(), (AnonymousClass1DS) r05.invoke(), C99244sV.A00(this, 41), 44);
            C18090vk r06 = ((AddToListViewModel) r2.getValue()).A0S;
            C18070vi.A0d(r06, 0);
            C91644g1.A00(A1G(), (AnonymousClass1DS) r06.invoke(), C99244sV.A00(this, 42), 44);
            C18090vk r07 = ((AddToListViewModel) r2.getValue()).A0T;
            C18070vi.A0d(r07, 0);
            C91644g1.A00(A1G(), (AnonymousClass1DS) r07.invoke(), C99244sV.A00(this, 43), 44);
            C18090vk r08 = ((AddToListViewModel) r2.getValue()).A0Q;
            C18070vi.A0d(r08, 0);
            C91644g1.A00(A1G(), (AnonymousClass1DS) r08.invoke(), C99244sV.A00(this, 44), 44);
            C18090vk r09 = ((AddToListViewModel) r2.getValue()).A0O;
            C18070vi.A0d(r09, 0);
            C91644g1.A00(A1G(), (AnonymousClass1DS) r09.invoke(), C99244sV.A00(this, 45), 44);
            C18090vk r010 = ((AddToListViewModel) r2.getValue()).A0N;
            C18070vi.A0d(r010, 0);
            C91644g1.A00(A1G(), (AnonymousClass1DS) r010.invoke(), C99244sV.A00(this, 46), 44);
            AddLabelView addLabelView2 = this.A05;
            if (addLabelView2 != null) {
                C89954dI.A00(addLabelView2, this, 37);
            }
            NewLabelView newLabelView = this.A06;
            if (newLabelView != null) {
                newLabelView.setOnCancelListener(new C99154sM(this, 43));
            }
            NewLabelView newLabelView2 = this.A06;
            if (newLabelView2 != null) {
                newLabelView2.setOnConfirmListener(new C27142DWd(this, 0));
            }
            NestedScrollView nestedScrollView = this.A00;
            if (!(nestedScrollView == null || (viewTreeObserver3 = nestedScrollView.getViewTreeObserver()) == null)) {
                viewTreeObserver3.addOnScrollChangedListener(new C90684eT(this, 3));
            }
            NestedScrollView nestedScrollView2 = this.A00;
            if (!(nestedScrollView2 == null || (viewTreeObserver2 = nestedScrollView2.getViewTreeObserver()) == null)) {
                viewTreeObserver2.removeOnScrollChangedListener(new C90674eS());
            }
            NestedScrollView nestedScrollView3 = this.A00;
            if (!(nestedScrollView3 == null || (viewTreeObserver = nestedScrollView3.getViewTreeObserver()) == null)) {
                C90664eR.A00(viewTreeObserver, this, 6);
            }
            AddToListViewModel addToListViewModel2 = (AddToListViewModel) r2.getValue();
            addToListViewModel2.A0D.CGF(new C146447Pd(addToListViewModel2, 37));
            return;
        }
        str = "addToListAdapterFactory";
        C18070vi.A11(str);
        throw null;
    }

    public void onConfigurationChanged(Configuration configuration) {
        ViewTreeObserver viewTreeObserver;
        C18070vi.A0d(configuration, 0);
        super.onConfigurationChanged(configuration);
        NestedScrollView nestedScrollView = this.A00;
        if (nestedScrollView != null && (viewTreeObserver = nestedScrollView.getViewTreeObserver()) != null) {
            C90664eR.A00(viewTreeObserver, this, 6);
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C18070vi.A0d(dialogInterface, 0);
        if (C72453Mb.A1W(AnonymousClass3MY.A0c(this).A0K)) {
            A00(this);
        }
        super.onDismiss(dialogInterface);
    }

    public static final void A00(AddToListFragment addToListFragment) {
        String str;
        AddToListViewModel A0c = AnonymousClass3MY.A0c(addToListFragment);
        AnonymousClass1FL A1D = addToListFragment.A1D();
        AnonymousClass3X4 r1 = addToListFragment.A04;
        if (r1 == null) {
            C18070vi.A11("adapter");
            throw null;
        }
        ArrayList arrayList = r1.A01;
        ArrayList arrayList2 = r1.A00;
        Bundle bundle = addToListFragment.A06;
        if (bundle != null) {
            str = bundle.getString("key_ctwa_jid");
        } else {
            str = null;
        }
        String str2 = addToListFragment.A0D;
        int i = addToListFragment.A15().getInt("arg_entry_point", -1);
        Integer valueOf = Integer.valueOf(i);
        if (i == -1) {
            valueOf = null;
        }
        AnonymousClass1OS r8 = addToListFragment.A0E;
        C18070vi.A0j(arrayList, arrayList2);
        A0c.A04.A07(0, 2131891749);
        A0c.A0D.CGF(new C21399AjS(A0c, arrayList, arrayList2, valueOf, r8, A1D, str, str2, 0));
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        Bundle bundle2 = this.A06;
        if (bundle2 != null) {
            if (bundle2.containsKey("key_entry_point")) {
                this.A0D = bundle2.getString("key_entry_point");
            }
            if (bundle2.containsKey("key_chat_jids")) {
                ArrayList A1A = AnonymousClass3MZ.A1A(bundle2, AnonymousClass1BI.class, "key_chat_jids");
                AddToListViewModel A0c = AnonymousClass3MY.A0c(this);
                AnonymousClass10E r1 = A0c.A03.A00.A00;
                AnonymousClass00H A0z = AnonymousClass3MX.A0z(r1);
                AnonymousClass00H A002 = C000200d.A00(r1.A5m);
                A0c.A00 = new C130096is(AnonymousClass3Ma.A0e(r1), (AnonymousClass1NH) r1.A5b.get(), (C60032nH) r1.A5a.get(), A0z, A002, A1A);
                A0c.A0M.getValue();
            }
        }
    }
}
