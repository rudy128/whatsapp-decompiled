package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.util.Pair;
import com.whatsapp.registration.directmigration.MigrationRequesterBroadcastReceiver;
import java.io.File;
import java.io.Serializable;

/* renamed from: X.2PL  reason: invalid class name */
public class AnonymousClass2PL extends A34 {
    public final C27361Vu A00;

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        C27361Vu r3 = this.A00;
        AnonymousClass1Cd r0 = r3.A03;
        r0.A06();
        long length = r0.A03.length();
        AnonymousClass72N r2 = (AnonymousClass72N) r3.A05.get();
        AnonymousClass1Ez r6 = new AnonymousClass1Ez(false);
        long A01 = C64062u9.A01((C42621yT) null, r2.A00.A00.A0I());
        File databasePath = r2.A01.A00.getDatabasePath("stickers.db");
        C18070vi.A0X(databasePath);
        long length2 = A01 + databasePath.length();
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("StickerDBStorage/getStickerFilesSize: took = ");
        A10.append(r6.A02());
        C17900vP.A0m(" ms for total file size of = ", A10, length2);
        Context context = r3.A01.A00;
        return new Pair(C17880vN.A0o(((length2 + length) * 3) + C17880vN.A0e(context.getFilesDir(), "wallpaper.jpg").length() + context.getDatabasePath("chatsettings.db").length(), 10000000), Long.valueOf(length));
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        Pair pair = (Pair) obj;
        C27361Vu r5 = this.A00;
        C17900vP.A0f("InterAppCommunicationManager/sendProviderToRequesterBroadcast/action = ", "com.whatsapp.registration.directmigration.providerAppMigrationSpaceNeededAction", AnonymousClass000.A10());
        Intent A0A = C17880vN.A0A();
        A0A.setComponent(new ComponentName("com.whatsapp.w4b", MigrationRequesterBroadcastReceiver.class.getName()));
        A0A.addFlags(32);
        A0A.setAction("com.whatsapp.registration.directmigration.providerAppMigrationSpaceNeededAction");
        if (pair != null) {
            A0A.putExtra("extra_min_storage_needed", (Serializable) pair.first);
            A0A.putExtra("extra_msg_db_size", (Serializable) pair.second);
        }
        r5.A01.A00.sendBroadcast(A0A, "com.whatsapp.permission.REGISTRATION");
    }

    public AnonymousClass2PL(C27361Vu r1) {
        this.A00 = r1;
    }
}
