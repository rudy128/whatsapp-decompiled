package com.whatsapp.inappsupport.ui;

import X.AnonymousClass000;
import X.AnonymousClass1L9;
import X.AnonymousClass1Y5;
import X.C17960vV;
import X.C18070vi;
import X.C72963Ol;
import X.C89454cU;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import java.util.ArrayList;

public final class SupportTopicsFragment extends Hilt_SupportTopicsFragment {
    public C89454cU A00;
    public SupportTopicsActivity A01;
    public ArrayList A02;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ArrayList arrayList;
        C18070vi.A0d(layoutInflater, 0);
        int i = 0;
        View inflate = layoutInflater.inflate(2131627158, viewGroup, false);
        View findViewById = inflate.findViewById(2131436308);
        SupportTopicsActivity supportTopicsActivity = this.A01;
        if (supportTopicsActivity == null || supportTopicsActivity.A00 != 2) {
            i = 8;
        }
        findViewById.setVisibility(i);
        AnonymousClass1Y5.A0A(findViewById, true);
        AbsListView absListView = (AbsListView) inflate.findViewById(2131436307);
        SupportTopicsActivity supportTopicsActivity2 = this.A01;
        if (!(supportTopicsActivity2 == null || (arrayList = this.A02) == null)) {
            absListView.setAdapter(new C72963Ol(supportTopicsActivity2, arrayList));
        }
        return inflate;
    }

    public void A1x(Context context) {
        C18070vi.A0d(context, 0);
        if (AnonymousClass1L9.A00(context) instanceof SupportTopicsActivity) {
            Activity A002 = AnonymousClass1L9.A00(context);
            C18070vi.A0z(A002, "null cannot be cast to non-null type com.whatsapp.inappsupport.ui.SupportTopicsActivity");
            this.A01 = (SupportTopicsActivity) A002;
            super.A1x(context);
            return;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SupportTopicsFragment");
        A10.append(" can only be used with ");
        throw AnonymousClass000.A0o("SupportTopicsActivity", A10);
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        this.A00 = (C89454cU) A15().getParcelable("parent_topic");
        ArrayList parcelableArrayList = A15().getParcelableArrayList("topics");
        C17960vV.A07(parcelableArrayList);
        this.A02 = parcelableArrayList;
    }
}
