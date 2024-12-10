package X;

import android.os.SystemClock;
import java.util.Map;

/* renamed from: X.9uD  reason: invalid class name and case insensitive filesystem */
public abstract class C195949uD {
    public final AnonymousClass19Y A00;
    public final AnonymousClass11P A01;
    public final Map A02;

    public final void A03(int i, String str, String str2) {
        int i2;
        C18070vi.A0d(str2, 2);
        AnonymousClass19Y r1 = this.A00;
        if (this instanceof C167128fS) {
            i2 = 22413317;
        } else {
            i2 = 22413316;
        }
        r1.markerAnnotate(i2, i, str, str2);
    }

    public final void A02(int i, String str) {
        int i2;
        AnonymousClass19Y r1 = this.A00;
        if (this instanceof C167128fS) {
            i2 = 22413317;
        } else {
            i2 = 22413316;
        }
        r1.markerPoint(i2, i, str);
    }

    public final void A04(int i, short s) {
        int i2;
        AnonymousClass19Y r1 = this.A00;
        if (this instanceof C167128fS) {
            i2 = 22413317;
        } else {
            i2 = 22413316;
        }
        r1.markerEnd(i2, i, s);
    }

    public final void A05(A4D a4d, int i) {
        String str = a4d.A01;
        C18070vi.A0X(str);
        A03(i, "delivery_session_id", str);
        String str2 = a4d.A00;
        C18070vi.A0X(str2);
        A03(i, "effect_session_id", str2);
        A03(i, "event_timestamp_ms", String.valueOf(SystemClock.uptimeMillis()));
        C187149fL r2 = (C187149fL) this.A02.get(str);
        if (r2 != null) {
            A03(i, "session", r2.A03);
            A03(i, "product_session_id", a4d.A04);
            A03(i, "product_name", a4d.A03);
            String str3 = r2.A00;
            if (str3.length() > 0) {
                A03(i, "effect_id", str3);
                A03(i, "effect_instance_id", r2.A01);
                A03(i, "effect_name", r2.A02);
                A03(i, "effect_type", r2.A04);
            }
        }
    }

    public C195949uD(AnonymousClass11P r1, AnonymousClass19Y r2, Map map) {
        this.A01 = r1;
        this.A00 = r2;
        this.A02 = map;
    }
}
