package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.whatsapp.wabloks.commerce.ui.viewmodel.WaBkFlowsLayoutViewModel;

/* renamed from: X.Ajb  reason: case insensitive filesystem */
public final /* synthetic */ class C21408Ajb implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C190469kz A01;
    public final /* synthetic */ C172408tN A02;
    public final /* synthetic */ AS6 A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;

    public final void run() {
        Intent intent;
        Bundle extras;
        Fragment A0Q;
        boolean z = this.A07;
        Activity activity = this.A00;
        C190469kz r2 = this.A01;
        String str = this.A04;
        boolean z2 = this.A08;
        AS6 as6 = this.A03;
        String str2 = this.A05;
        C172408tN r5 = this.A02;
        String str3 = this.A06;
        if (z) {
            Fragment A0Q2 = ((AnonymousClass1FL) activity).getSupportFragmentManager().A0Q("extensions_bottom_sheet_container");
            if (!(A0Q2 == null || (A0Q = A0Q2.A1E().A0Q("BK_FRAGMENT")) == null)) {
                ((WaBkFlowsLayoutViewModel) AnonymousClass3MW.A0N(A0Q).A00(WaBkFlowsLayoutViewModel.class)).A0W(r5, str, (String) null, str3, as6.A0C);
            }
            if (r2 != null) {
                r2.A00("failure", A3M.A01(str));
            }
            if (z2 && (intent = as6.A00.getIntent()) != null && (extras = intent.getExtras()) != null) {
                String string = extras.getString("chat_id");
                String string2 = extras.getString("message_id");
                String string3 = extras.getString("action_name");
                if (string2 != null && string3 != null) {
                    as6.A0A.CGF(new C21367Aiw(as6, string, string2, string3, 4));
                }
            }
        } else if (r2 != null) {
            r2.A00("success", A3M.A01(str2));
        }
    }

    public /* synthetic */ C21408Ajb(Activity activity, C190469kz r2, C172408tN r3, AS6 as6, String str, String str2, String str3, boolean z, boolean z2) {
        this.A07 = z;
        this.A00 = activity;
        this.A01 = r2;
        this.A04 = str;
        this.A08 = z2;
        this.A03 = as6;
        this.A05 = str2;
        this.A02 = r3;
        this.A06 = str3;
    }
}
