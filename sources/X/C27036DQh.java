package X;

import android.app.Activity;
import android.os.Build;
import android.view.Window;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.DQh  reason: case insensitive filesystem */
public class C27036DQh implements C39641tP {
    public boolean A00 = false;
    public boolean A01 = true;
    public Integer A02;
    public final AnonymousClass19T A03;
    public final Map A04 = C17880vN.A11();
    public final E7W A05;
    public final AnonymousClass18K A06;

    public void C4b(Window window, int i, boolean z, boolean z2) {
        this.A00 = z2;
        this.A01 = z;
        if (z2 || z) {
            this.A05.BJv(window);
            this.A02 = Integer.valueOf(i);
        }
    }

    public void C4c() {
        Integer num = this.A02;
        if (num != null) {
            this.A05.BIc(num.intValue());
        }
        this.A02 = null;
    }

    public void report() {
        if (this.A01) {
            Map map = this.A04;
            Iterator A15 = AnonymousClass000.A15(map);
            while (A15.hasNext()) {
                Map.Entry A16 = AnonymousClass000.A16(A15);
                C46642Fi r8 = new C46642Fi();
                C24966CRq cRq = (C24966CRq) A16.getValue();
                r8.A03 = Long.valueOf(cRq.A03);
                r8.A02 = (Integer) A16.getKey();
                long j = cRq.A03;
                if (j > 0) {
                    double d = (double) j;
                    r8.A00 = Double.valueOf((cRq.A01 * 60000.0d) / d);
                    r8.A01 = Double.valueOf((cRq.A00 * 60000.0d) / d);
                }
                this.A06.CC7(r8);
            }
            map.clear();
        }
    }

    public C27036DQh(Activity activity, C214215x r5, AnonymousClass18K r6, AnonymousClass19T r7, AnonymousClass00H r8) {
        E7W dbv;
        this.A03 = r7;
        this.A06 = r6;
        COZ coz = new COZ(this, r7);
        if (Build.VERSION.SDK_INT < 26) {
            dbv = new DBU(activity, r5, coz);
        } else {
            dbv = new DBV(coz, r8);
        }
        this.A05 = dbv;
    }
}
