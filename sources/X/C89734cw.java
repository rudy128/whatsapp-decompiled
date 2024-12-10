package X;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.acceptinvitelink.AcceptInviteLinkActivity;
import com.whatsapp.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.4cw  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C89734cw implements View.OnClickListener {
    public final /* synthetic */ AcceptInviteLinkActivity A00;
    public final /* synthetic */ AnonymousClass4PG A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;

    /* JADX WARNING: type inference failed for: r1v7, types: [X.1LU, java.lang.Object] */
    public final void onClick(View view) {
        AcceptInviteLinkActivity acceptInviteLinkActivity = this.A00;
        boolean z = this.A03;
        AnonymousClass4PG r2 = this.A01;
        String str = this.A02;
        Log.i("acceptlink/confirmation/ok");
        if (z) {
            Intent A06 = AnonymousClass3MY.A06(acceptInviteLinkActivity, new Object(), r2.A05);
            C60442o2.A00(A06, acceptInviteLinkActivity.A05, "AcceptInviteLinkActivity");
            acceptInviteLinkActivity.A3q(A06, true);
            return;
        }
        AnonymousClass1EC r4 = r2.A05;
        int i = r2.A02;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("acceptlink/sendjoin/");
        A10.append(str);
        C17900vP.A0Y(r4, " ", A10);
        TextView A0L = AnonymousClass3MX.A0L(acceptInviteLinkActivity, 2131434197);
        int i2 = 2131891537;
        if (i == 1) {
            i2 = 2131891539;
        }
        A0L.setText(i2);
        acceptInviteLinkActivity.findViewById(2131434180).setVisibility(0);
        acceptInviteLinkActivity.findViewById(2131431263).setVisibility(4);
        AnonymousClass3MX.A1H(acceptInviteLinkActivity, 2131430516, 4);
        AtomicReference atomicReference = acceptInviteLinkActivity.A0O;
        atomicReference.set(r4);
        AnonymousClass3MW.A1T(new AnonymousClass49O(acceptInviteLinkActivity, acceptInviteLinkActivity.A05, acceptInviteLinkActivity.A0C, str, i), acceptInviteLinkActivity.A05, 0);
        if (acceptInviteLinkActivity.getIntent().getBooleanExtra("is_invite_from_referrer", false)) {
            C81133yk r22 = new C81133yk();
            AnonymousClass1EC r1 = (AnonymousClass1EC) atomicReference.get();
            if (r1 != null) {
                r22.A00 = Integer.valueOf(acceptInviteLinkActivity.A0E.A00(r1));
            }
            acceptInviteLinkActivity.A0A.CC7(r22);
        }
    }

    public /* synthetic */ C89734cw(AcceptInviteLinkActivity acceptInviteLinkActivity, AnonymousClass4PG r2, String str, boolean z) {
        this.A00 = acceptInviteLinkActivity;
        this.A03 = z;
        this.A01 = r2;
        this.A02 = str;
    }
}
