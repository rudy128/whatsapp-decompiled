package X;

import java.util.concurrent.CopyOnWriteArrayList;
import org.whispersystems.curve25519.NativeVOPRFExtension;

/* renamed from: X.2tE  reason: invalid class name and case insensitive filesystem */
public class C63512tE {
    public NativeVOPRFExtension A00;
    public final int A01;
    public final C23651Hc A02;
    public final C54102db A03;
    public final C63732tb A04;
    public final AnonymousClass37D A05;
    public final AnonymousClass11P A06;
    public final C18030ve A07;
    public final C200710s A08;
    public final String A09;
    public final CopyOnWriteArrayList A0A;
    public volatile int A0B;
    public volatile long A0C;
    public volatile String A0D;
    public volatile boolean A0E;
    public volatile boolean A0F = false;
    public volatile byte[] A0G;
    public volatile byte[] A0H;

    public static synchronized void A00(C63512tE r5) {
        synchronized (r5) {
            r5.A0D = null;
            r5.A0G = null;
            r5.A0B = 0;
            r5.A0F = false;
            r5.A0E = false;
            C63732tb r3 = r5.A04;
            C63732tb.A03(r3, "original_token_string", (String) null);
            C63732tb.A03(r3, "next_original_token_string", (String) null);
            C63732tb.A02(r3, "base_timestamp", 0);
            C63732tb.A02(r3, "time_to_live_in_seconds", 0);
            C63732tb.A03(r3, "blinding_factor_string", (String) null);
            C63732tb.A01(r3, "redeem_count", -1);
            C63732tb.A03(r3, "shared_secret_string", (String) null);
        }
    }

    public static synchronized void A02(C63512tE r4, boolean z) {
        synchronized (r4) {
            r4.A0E = false;
            C63732tb r2 = r4.A04;
            C63732tb.A03(r2, "blinding_factor_string", (String) null);
            if (r4.A0F) {
                C63732tb.A03(r2, "next_original_token_string", (String) null);
            } else {
                C63732tb.A03(r2, "original_token_string", (String) null);
            }
            r4.A0F = false;
            r4.A0G = null;
            if (!z) {
                r4.A0D = null;
                r4.A0B = 0;
            }
        }
    }

    public static void A01(C63512tE r5, int i) {
        int i2 = r5.A0B;
        C63732tb r3 = r5.A04;
        if (i2 < C63732tb.A00(r3).getInt("max_sign_retry_count", 0)) {
            r5.A0B++;
            r5.A08.A05(new C70613Bu(r5, 30), C17890vO.A05(C63732tb.A00(r3), "sign_retry_interval_sec") * ((long) r5.A0B) * ((long) r5.A0B) * 1000);
            return;
        }
        int i3 = 10;
        if (i == 5) {
            i3 = 9;
        }
        r3.A04(i3);
        A02(r5, false);
    }

    public C63512tE(C23651Hc r3, C54102db r4, C63732tb r5, AnonymousClass37D r6, AnonymousClass11P r7, C18030ve r8, AnonymousClass10I r9, String str) {
        this.A06 = r7;
        this.A07 = r8;
        this.A04 = r5;
        this.A09 = str;
        this.A05 = r6;
        r6.A00 = this;
        this.A03 = r4;
        this.A02 = r3;
        this.A0A = new CopyOnWriteArrayList();
        this.A08 = C200710s.A00(r9);
        this.A01 = str.equals("WA_BizDirectorySearch") ? 2 : 1;
    }
}
