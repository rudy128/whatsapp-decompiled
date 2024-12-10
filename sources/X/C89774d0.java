package X;

import android.os.Bundle;
import android.view.View;
import com.whatsapp.systemstatus.SystemStatusActivity;
import java.util.ArrayList;

/* renamed from: X.4d0  reason: invalid class name and case insensitive filesystem */
public class C89774d0 implements View.OnClickListener {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public C89774d0(Object obj, Object obj2, String str, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A04 = str;
        this.A03 = obj2;
        this.A01 = i;
    }

    public final void onClick(View view) {
        String str;
        if (this.A00 != 0) {
            SystemStatusActivity systemStatusActivity = (SystemStatusActivity) this.A02;
            String str2 = this.A04;
            C98494rF r4 = (C98494rF) this.A03;
            int i = this.A01;
            C18070vi.A0f(r4, 2, view);
            C132216mP r2 = systemStatusActivity.A00;
            if (r2 != null) {
                AnonymousClass1MB r0 = systemStatusActivity.A01;
                if (r0 != null) {
                    boolean A002 = r0.A00();
                    Integer valueOf = Integer.valueOf(i);
                    Bundle bundleExtra = systemStatusActivity.getIntent().getBundleExtra("com.whatsapp.SystemStatusActivity.describeProblemBundle");
                    systemStatusActivity.startActivity(r2.A00.A00(bundleExtra, (AnonymousClass770) null, valueOf, str2, (String) r4.element, (ArrayList) null, (ArrayList) null, A002));
                    systemStatusActivity.finish();
                    return;
                }
                str = "supportGatingUtils";
            } else {
                str = "sendFeedback";
            }
            C18070vi.A11(str);
            throw null;
        }
        AnonymousClass1FP r22 = (AnonymousClass1FP) this.A02;
        String str3 = this.A04;
        r22.A05.CGF(new C70783Cm(r22, this.A03, str3, this.A01, 0));
    }
}
