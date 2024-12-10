package com.whatsapp.softenforcementsmb;

import X.AnonymousClass000;
import X.AnonymousClass11P;
import X.AnonymousClass1HF;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass86E;
import X.C127756es;
import X.C140056zs;
import X.C17880vN;
import X.C17900vP;
import X.C18070vi;
import X.C36171nS;
import X.C89974dK;
import X.C90444e5;
import X.C99734tN;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;

public class SMBSoftEnforcementEducationFragment extends Hilt_SMBSoftEnforcementEducationFragment implements AnonymousClass86E {
    public static final Map A08 = new C99734tN(1);
    public AnonymousClass11P A00;
    public C127756es A01;
    public C36171nS A02;
    public C140056zs A03;
    public long A04;
    public View A05;
    public ScrollView A06;
    public Integer A07 = C17880vN.A0j();

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        String string = this.A06.getString("notification");
        try {
            this.A03 = new C140056zs(C17880vN.A16(string));
        } catch (JSONException e) {
            C17900vP.A0h("Error deserializing SMBSoftEnforcementNotification:", string, AnonymousClass000.A10(), e);
        }
        View A09 = AnonymousClass3MX.A09(layoutInflater, viewGroup, 2131626974);
        TextView A0E = C17880vN.A0E(A09, 2131435497);
        this.A06 = (ScrollView) AnonymousClass1HF.A06(A09, 2131435502);
        this.A05 = AnonymousClass1HF.A06(A09, 2131435495);
        Map map = A08;
        boolean containsKey = map.containsKey(this.A03.A07);
        if (containsKey) {
            AnonymousClass3MY.A1X(A1H(AnonymousClass000.A0M(map.get(this.A03.A07))), A0E);
        } else {
            A0E.setText(2131896223);
        }
        ScrollView scrollView = this.A06;
        scrollView.getViewTreeObserver().addOnGlobalLayoutListener(new C90444e5(this, this.A05, scrollView, 5));
        TextView A0J = AnonymousClass3MW.A0J(this.A06, 2131435501);
        int i = 2131896221;
        if (containsKey) {
            i = 2131896222;
        }
        A0J.setText(i);
        C89974dK.A00(AnonymousClass1HF.A06(A09, 2131435504), this, 31);
        View A062 = AnonymousClass1HF.A06(A09, 2131435494);
        C127756es r4 = this.A01;
        Context A1n = A1n();
        C140056zs r2 = this.A03;
        boolean A16 = C18070vi.A16(A1n, r2);
        AnonymousClass3Ma.A1F(A062, r4, r2, A1n, 43);
        this.A02.A02(this.A03, Integer.valueOf(A16 ? 1 : 0), (Long) null);
        this.A04 = System.currentTimeMillis();
        return A09;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.A02.A02(this.A03, this.A07, Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - this.A04)));
        super.onDismiss(dialogInterface);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ScrollView scrollView = this.A06;
        scrollView.getViewTreeObserver().addOnGlobalLayoutListener(new C90444e5(this, this.A05, scrollView, 5));
    }
}
