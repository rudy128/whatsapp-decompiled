package X;

import android.app.Activity;
import android.os.Bundle;

/* renamed from: X.4fb  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C91384fb implements AnonymousClass1XI {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C79783w1 A01;
    public final /* synthetic */ AnonymousClass206 A02;

    public final void Bv0(String str, Bundle bundle) {
        int i;
        C108875cR r3;
        C79783w1 r4 = this.A01;
        Activity activity = this.A00;
        AnonymousClass206 r2 = this.A02;
        C18070vi.A0f(str, 3, bundle);
        AnonymousClass1FU r32 = (AnonymousClass1FU) activity;
        if (str.equals("share_request_key") && (i = bundle.getInt("extra_share_action_id", -1)) != -1) {
            r4.A02.A00(r32, r2, i);
            if ((r32 instanceof C108875cR) && (r3 = (C108875cR) r32) != null) {
                r3.BLL();
            }
        }
    }

    public /* synthetic */ C91384fb(Activity activity, C79783w1 r2, AnonymousClass206 r3) {
        this.A01 = r2;
        this.A00 = activity;
        this.A02 = r3;
    }
}
