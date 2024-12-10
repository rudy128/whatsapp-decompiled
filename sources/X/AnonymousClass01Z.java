package X;

import android.content.Context;
import android.content.IntentFilter;
import android.os.PowerManager;

/* renamed from: X.01Z  reason: invalid class name */
public class AnonymousClass01Z extends AnonymousClass01Y {
    public final PowerManager A00;
    public final /* synthetic */ AnonymousClass01V A01;

    public int A00() {
        return this.A00.isPowerSaveMode() ? 2 : 1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass01Z(Context context, AnonymousClass01V r4) {
        super(r4);
        this.A01 = r4;
        this.A00 = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    public IntentFilter A01() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
        return intentFilter;
    }

    public void A04() {
        AnonymousClass01V.A0Q(this.A01, true, true);
    }
}
