package X;

import android.content.Context;
import android.content.Intent;

/* renamed from: X.6q5  reason: invalid class name and case insensitive filesystem */
public final class C134126q5 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public String A05;
    public boolean A06;
    public boolean A07;
    public int[] A08;
    public int[] A09;
    public int[] A0A;
    public String[] A0B;
    public String[] A0C;
    public final Context A0D;

    public C134126q5(Context context) {
        C18070vi.A0d(context, 1);
        this.A0D = context;
    }

    public final void A01(String[] strArr) {
        C18070vi.A0d(strArr, 0);
        this.A0C = strArr;
    }

    public final Intent A00() {
        Intent A0A2 = C17880vN.A0A();
        A0A2.setClassName(this.A0D.getPackageName(), "com.whatsapp.RequestPermissionActivity");
        A0A2.putExtra("drawable_id", this.A01);
        A0A2.putExtra("drawable_ids", this.A09);
        A0A2.putExtra("message_id", this.A02);
        A0A2.putExtra("message_params_id", this.A0A);
        A0A2.putExtra("formatted_message_html", this.A05);
        A0A2.putExtra("cancel_button_message_id", this.A00);
        A0A2.putExtra("perm_denial_message_id", this.A03);
        A0A2.putExtra("perm_denial_message_params_id", this.A08);
        A0A2.putExtra("permissions", this.A0C);
        A0A2.putExtra("force_ui", this.A06);
        A0A2.putExtra("minimal_partial_permissions", this.A0B);
        A0A2.putExtra("title_id", this.A04);
        A0A2.putExtra("hide_permissions_rationale", this.A07);
        return A0A2;
    }
}
