package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.LinkedHashSet;

/* renamed from: X.9uK  reason: invalid class name and case insensitive filesystem */
public abstract class C196019uK {
    public Object A00;
    public final Context A01;
    public final Object A02 = C17880vN.A0p();
    public final LinkedHashSet A03 = C17880vN.A14();
    public final C71973Kb A04;

    public void A05() {
        AnonymousClass8KO r4 = (AnonymousClass8KO) this;
        A5Z A002 = A5Z.A00();
        String str = C182039Sv.A00;
        StringBuilder A10 = AnonymousClass000.A10();
        C17900vP.A0a(r4, A10);
        AnonymousClass8BW.A16(A002, ": registering receiver", str, A10);
        r4.A01.registerReceiver(r4.A00, r4.A07());
    }

    public void A06() {
        AnonymousClass8KO r4 = (AnonymousClass8KO) this;
        A5Z A002 = A5Z.A00();
        String str = C182039Sv.A00;
        StringBuilder A10 = AnonymousClass000.A10();
        C17900vP.A0a(r4, A10);
        AnonymousClass8BW.A16(A002, ": unregistering receiver", str, A10);
        r4.A01.unregisterReceiver(r4.A00);
    }

    public final void A03(Object obj) {
        synchronized (this.A02) {
            Object obj2 = this.A00;
            if (obj2 == null || !obj2.equals(obj)) {
                this.A00 = obj;
                ((C20367AHx) this.A04).A02.execute(new C21471Akc((Object) C29431cG.A0t(this.A03), (Object) this, 23));
            }
        }
    }

    public Object A04() {
        String action;
        int hashCode;
        if (this instanceof AnonymousClass8KL) {
            AnonymousClass8KO r0 = (AnonymousClass8KO) this;
            Intent registerReceiver = r0.A01.registerReceiver((BroadcastReceiver) null, r0.A07());
            boolean z = true;
            if (!(registerReceiver == null || registerReceiver.getAction() == null || ((action = registerReceiver.getAction()) != null && (hashCode = action.hashCode()) != -1181163412 && hashCode == -730838620 && action.equals("android.intent.action.DEVICE_STORAGE_OK")))) {
                z = false;
            }
            return Boolean.valueOf(z);
        } else if (this instanceof AnonymousClass8KN) {
            return C20091A6t.A01(((AnonymousClass8KN) this).A00);
        } else {
            Intent registerReceiver2 = this.A01.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            boolean z2 = false;
            if (registerReceiver2 == null) {
                A5Z.A00().A04(C182029Su.A00, "getInitialState - null intent received");
            } else {
                int intExtra = registerReceiver2.getIntExtra("status", -1);
                float intExtra2 = ((float) registerReceiver2.getIntExtra("level", -1)) / ((float) registerReceiver2.getIntExtra("scale", -1));
                if (intExtra == 1 || intExtra2 > 0.15f) {
                    z2 = true;
                }
            }
            return Boolean.valueOf(z2);
        }
    }

    public C196019uK(Context context, C71973Kb r3) {
        this.A04 = r3;
        this.A01 = AnonymousClass8BS.A02(context);
    }
}
