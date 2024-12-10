package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.whatsapp.wabloks.ui.WaFcsPreloadedBloksActivity;

/* renamed from: X.5d9  reason: invalid class name and case insensitive filesystem */
public class C109295d9 extends BroadcastReceiver {
    public final /* synthetic */ WaFcsPreloadedBloksActivity A00;

    public C109295d9(WaFcsPreloadedBloksActivity waFcsPreloadedBloksActivity) {
        this.A00 = waFcsPreloadedBloksActivity;
    }

    public void onReceive(Context context, Intent intent) {
        int i;
        A2X a2x;
        if (intent.getAction() != null && intent.getAction().equals("com.whatsapp.payments.phoenix.action.launch_activity_for_phoenix_result")) {
            if (TextUtils.isEmpty(intent.getStringExtra("app_to_app_partner_app_package")) || TextUtils.isEmpty(intent.getStringExtra("app_to_app_partner_intent_action"))) {
                i = 0;
                a2x = this.A00.A00;
            } else {
                Intent intent2 = C108945cZ.A0G(intent.getStringExtra("app_to_app_partner_intent_action")).setPackage(intent.getStringExtra("app_to_app_partner_app_package"));
                if (!TextUtils.isEmpty(intent.getStringExtra("app_to_app_request_payload"))) {
                    intent2.putExtra("android.intent.extra.TEXT", intent.getStringExtra("app_to_app_request_payload"));
                }
                WaFcsPreloadedBloksActivity waFcsPreloadedBloksActivity = this.A00;
                if (intent2.resolveActivity(waFcsPreloadedBloksActivity.getPackageManager()) == null) {
                    i = 0;
                    a2x = waFcsPreloadedBloksActivity.A00;
                } else {
                    waFcsPreloadedBloksActivity.startActivityForResult(intent2, 100);
                    return;
                }
            }
            if (a2x != null) {
                a2x.A02(new AnonymousClass7NT(i, (Bundle) null));
            }
        }
    }
}
