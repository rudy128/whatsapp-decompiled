package com.whatsapp.conversation;

import X.AnonymousClass118;
import X.AnonymousClass1DF;
import X.AnonymousClass1HS;
import X.AnonymousClass1YL;
import X.AnonymousClass3MZ;
import X.AnonymousClass3UY;
import X.AnonymousClass4CA;
import X.AnonymousClass4S0;
import X.AnonymousClass5G8;
import X.AnonymousClass5G9;
import X.AnonymousClass783;
import X.AnonymousClass8Dv;
import X.C17900vP;
import X.C18030ve;
import X.C18070vi;
import X.C18100vl;
import X.C28281Zt;
import X.C90134da;
import X.C90944et;
import X.C91194fI;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.wds.components.search.WDSConversationSearchView;
import java.util.Calendar;

public final class ConversationSearchFragment extends Hilt_ConversationSearchFragment {
    public DatePickerDialog.OnDateSetListener A00;
    public AnonymousClass1HS A01;
    public AnonymousClass3UY A02;
    public AnonymousClass118 A03;
    public C18030ve A04;
    public WDSConversationSearchView A05;
    public boolean A06;
    public final AnonymousClass4CA A07 = new AnonymousClass4CA(this, 0);
    public final C18100vl A08 = AnonymousClass1DF.A01(new AnonymousClass5G8(this));
    public final C18100vl A09 = AnonymousClass1DF.A01(new AnonymousClass5G9(this));

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Toolbar toolbar;
        C17900vP.A0Y(this, "CallsSearchFragment/onCreateView ", AnonymousClass3MZ.A19(layoutInflater, 0));
        View inflate = layoutInflater.inflate(2131624966, viewGroup, false);
        WDSConversationSearchView wDSConversationSearchView = (WDSConversationSearchView) inflate.findViewById(2131434976);
        this.A05 = wDSConversationSearchView;
        if (wDSConversationSearchView != null) {
            wDSConversationSearchView.setHint((CharSequence) A1H(2131895489));
        }
        WDSConversationSearchView wDSConversationSearchView2 = this.A05;
        if (wDSConversationSearchView2 != null) {
            AnonymousClass4CA r1 = this.A07;
            C18070vi.A0d(r1, 0);
            wDSConversationSearchView2.A01.addTextChangedListener(r1);
        }
        WDSConversationSearchView wDSConversationSearchView3 = this.A05;
        if (!(wDSConversationSearchView3 == null || (toolbar = wDSConversationSearchView3.A03) == null)) {
            toolbar.setNavigationOnClickListener(new AnonymousClass783(this, 48));
        }
        WDSConversationSearchView wDSConversationSearchView4 = this.A05;
        if (wDSConversationSearchView4 != null) {
            wDSConversationSearchView4.setOnFocusChangeListener(new C90134da(this, 2));
        }
        WDSConversationSearchView wDSConversationSearchView5 = this.A05;
        if (wDSConversationSearchView5 != null) {
            Toolbar toolbar2 = wDSConversationSearchView5.A03;
            toolbar2.A0N(2131820558);
            Menu menu = toolbar2.getMenu();
            C18070vi.A0X(menu);
            int size = menu.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    MenuItem item = menu.getItem(i);
                    AnonymousClass4S0 r12 = wDSConversationSearchView5.A07;
                    if (r12 == null) {
                        break;
                    }
                    item.setIcon(r12.A00(item.getIcon()));
                    i++;
                } else {
                    AnonymousClass4S0 r13 = wDSConversationSearchView5.A07;
                    if (r13 != null) {
                        toolbar2.setOverflowIcon(r13.A00(toolbar2.getOverflowIcon()));
                    }
                }
            }
            C18070vi.A11("style");
            throw null;
        }
        WDSConversationSearchView wDSConversationSearchView6 = this.A05;
        if (wDSConversationSearchView6 != null) {
            wDSConversationSearchView6.A01();
        }
        WDSConversationSearchView wDSConversationSearchView7 = this.A05;
        if (wDSConversationSearchView7 != null) {
            wDSConversationSearchView7.setOnSearchByDateListener(new AnonymousClass783(this, 49));
        }
        WDSConversationSearchView wDSConversationSearchView8 = this.A05;
        if (wDSConversationSearchView8 != null) {
            Toolbar toolbar3 = wDSConversationSearchView8.A03;
            if (toolbar3 != null) {
                toolbar3.A0C = new C91194fI(this, 1);
            }
            EditText editText = wDSConversationSearchView8.A01;
            if (editText != null) {
                editText.setOnEditorActionListener(new C90944et(this, 2));
            }
        }
        return inflate;
    }

    public void onConfigurationChanged(Configuration configuration) {
        C18070vi.A0d(configuration, 0);
        super.onConfigurationChanged(configuration);
        A27();
    }

    public final void A27() {
        AnonymousClass1HS r0 = this.A01;
        if (r0 == null) {
            C18070vi.A11("voipCallState");
            throw null;
        } else if (!r0.A01()) {
            C28281Zt.A06(A1D(), AnonymousClass1YL.A00(A1n(), 2130969148, 2131100157));
        }
    }

    public void A1u() {
        super.A1u();
        A27();
    }

    public final void A26() {
        Calendar instance = Calendar.getInstance();
        C18070vi.A0X(instance);
        C18100vl r4 = this.A08;
        ((AnonymousClass8Dv) r4.getValue()).A01.updateDate(instance.get(1), instance.get(2), instance.get(5));
        ((Dialog) r4.getValue()).show();
    }
}
