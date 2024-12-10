package X;

import android.content.ComponentName;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import com.whatsapp.registration.directmigration.MigrationProviderOrderedBroadcastReceiver;
import com.whatsapp.util.Log;

/* renamed from: X.1Vu  reason: invalid class name and case insensitive filesystem */
public class C27361Vu {
    public Handler A00;
    public final AnonymousClass118 A01;
    public final C19830z4 A02;
    public final AnonymousClass1Cd A03;
    public final AnonymousClass10I A04;
    public final AnonymousClass00H A05;

    public static void A00(Bundle bundle, C27361Vu r5, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("InterAppCommunicationManager/sendRequesterToProviderOrderedBroadcast/action = ");
        sb.append(str);
        Log.i(sb.toString());
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.whatsapp.w4b", MigrationProviderOrderedBroadcastReceiver.class.getName()));
        intent.setAction(str);
        intent.addFlags(32);
        new AnonymousClass3C5(r5, intent, bundle, 34).run();
    }

    public void A01() {
        String string = ((SharedPreferences) this.A02.A00.get()).getString("registration_sibling_app_country_code", (String) null);
        StringBuilder sb = new StringBuilder();
        sb.append("InterAppCommunicationManager/migrateFromConsumerAppFlowEnabled/sibling-country-code = ");
        sb.append(string);
        Log.i(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("InterAppCommunicationManager/smbIsCapableOfMigratingFromConsumer=");
        sb2.append(false);
        Log.i(sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append("InterAppCommunicationManager/migrateFromConsumerAppFlowEnabled = ");
        sb3.append(false);
        Log.i(sb3.toString());
    }

    public void A02() {
        Bundle bundle = new Bundle();
        StringBuilder sb = new StringBuilder();
        sb.append("InterAppCommunicationManager/smbIsCapableOfMigratingFromConsumer=");
        sb.append(false);
        Log.i(sb.toString());
        bundle.putBoolean("database_migration_is_enabled_on_requester_side", false);
        Log.i("InterAppCommunicationManager/sendInitialMigrationInfoNeededBroadcast/sendInitialMigrationInfoNeededBroadcast");
        A00(bundle, this, "com.whatsapp.registration.directmigration.initialMigrationInfoAction");
    }

    public C27361Vu(AnonymousClass118 r1, C19830z4 r2, AnonymousClass1Cd r3, AnonymousClass10I r4, AnonymousClass00H r5) {
        this.A01 = r1;
        this.A04 = r4;
        this.A05 = r5;
        this.A03 = r3;
        this.A02 = r2;
    }
}
