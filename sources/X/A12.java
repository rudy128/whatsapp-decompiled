package X;

import android.app.Activity;
import android.content.Intent;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Display;

public class A12 {
    public DisplayManager.DisplayListener A00;
    public B8W A01;
    public final AnonymousClass118 A02;
    public final C18030ve A03;

    public static void A00(Activity activity) {
        if (activity != null) {
            Intent A0A = C17880vN.A0A();
            A0A.setClassName(activity.getPackageName(), "com.whatsapp.payments.ui.IndiaUpiPaymentsBlockScreenShareActivity");
            A0A.addFlags(536870912);
            activity.finish();
            activity.startActivity(A0A);
        }
    }

    public void A01(B8W b8w) {
        if (!C18020vd.A05(C18040vf.A02, this.A03, 1734)) {
            return;
        }
        if (A02()) {
            b8w.C4W();
            return;
        }
        this.A01 = b8w;
        DisplayManager displayManager = (DisplayManager) this.A02.A00.getSystemService("display");
        DisplayManager.DisplayListener displayListener = this.A00;
        if (displayListener == null) {
            displayListener = new AA8(displayManager, this);
            this.A00 = displayListener;
        }
        displayManager.registerDisplayListener(displayListener, (Handler) null);
    }

    public boolean A02() {
        Display[] displays = ((DisplayManager) this.A02.A00.getSystemService("display")).getDisplays();
        int length = displays.length;
        if (length <= 1) {
            return false;
        }
        int i = 1;
        while ((displays[i].getFlags() & 2) <= 0) {
            i++;
            if (i >= length) {
                return false;
            }
        }
        return true;
    }

    public A12(AnonymousClass118 r1, C18030ve r2) {
        this.A03 = r2;
        this.A02 = r1;
    }
}
