package X;

import android.app.Activity;
import java.util.HashMap;
import java.util.Map;

public final class AM4 implements BAC {
    public final /* synthetic */ long A00;
    public final /* synthetic */ Activity A01;
    public final /* synthetic */ AnonymousClass8nx A02;
    public final /* synthetic */ AnonymousClass1BI A03;
    public final /* synthetic */ C20271AEe A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ HashMap A08;
    public final /* synthetic */ HashMap A09;

    public AM4(Activity activity, AnonymousClass8nx r2, AnonymousClass1BI r3, C20271AEe aEe, String str, String str2, String str3, HashMap hashMap, HashMap hashMap2, long j) {
        this.A02 = r2;
        this.A01 = activity;
        this.A06 = str;
        this.A00 = j;
        this.A03 = r3;
        this.A05 = str2;
        this.A09 = hashMap;
        this.A04 = aEe;
        this.A07 = str3;
        this.A08 = hashMap2;
    }

    public void onSuccess() {
        AnonymousClass8nx r2 = this.A02;
        Activity activity = this.A01;
        activity.runOnUiThread(new C21385AjE(activity, r2, this.A03, this.A05, this.A06, this.A09, this.A00));
    }

    public void Bts(Map map) {
        C17900vP.A0X(map, "onFailure", AnonymousClass000.A10());
        if (map.containsKey("validation_errors")) {
            C20271AEe aEe = this.A04;
            HashMap A012 = A3M.A01(aEe.A00);
            A012.put("validation_errors", map.get("validation_errors"));
            A012.remove("saved_addresses");
            AnonymousClass8nx r2 = this.A02;
            Activity activity = this.A01;
            HashMap A002 = AnonymousClass8nx.A00(activity, r2, aEe, A012);
            r2.A0I(activity, aEe, this.A06, this.A07, this.A08, A002, this.A00);
            return;
        }
        AnonymousClass8nx r22 = this.A02;
        Activity activity2 = this.A01;
        activity2.runOnUiThread(new C21385AjE(activity2, r22, this.A03, this.A05, this.A06, this.A09, this.A00));
    }
}
