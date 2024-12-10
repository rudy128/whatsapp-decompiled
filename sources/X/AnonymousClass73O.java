package X;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Timer;

/* renamed from: X.73O  reason: invalid class name */
public class AnonymousClass73O {
    public static final HashMap A0O = C17880vN.A11();
    public boolean A00;
    public boolean A01;
    public byte[] A02;
    public byte[] A03;
    public final C19880zA A04;
    public final AnonymousClass1KB A05;
    public final AnonymousClass11S A06;
    public final AnonymousClass1M9 A07;
    public final C24671Lf A08;
    public final C24791Lr A09;
    public final C26881Tv A0A;
    public final AnonymousClass11P A0B;
    public final AnonymousClass121 A0C;
    public final AnonymousClass1MZ A0D;
    public final AnonymousClass1R3 A0E;
    public final AnonymousClass1BI A0F;
    public final AnonymousClass7T8 A0G;
    public final C27001Ui A0H;
    public final AnonymousClass1PQ A0I;
    public final Long A0J;
    public final long A0K = SystemClock.elapsedRealtime();
    public final AnonymousClass18K A0L;
    public final C27031Ul A0M;
    public final boolean A0N;

    public static boolean A02(AnonymousClass1BI r3) {
        if (r3 != null) {
            Iterator A0j = C17890vO.A0j(A0O);
            while (A0j.hasNext()) {
                if (r3.equals(((AnonymousClass73O) A0j.next()).A0F)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void A00(AnonymousClass1BI r3, AnonymousClass73O r4, int i) {
        r4.A0A.A00(r4.A07.A0H(r3));
        r4.A08.A00(r3);
        r4.A0H.A01(r3, i);
        AnonymousClass1KB r2 = r4.A05;
        int i2 = 2131890333;
        if (C22971Dz.A0e(r3)) {
            i2 = 2131890330;
        }
        r2.A08(i2, 0);
    }

    public static void A01(AnonymousClass73O r5, int i) {
        int length;
        AnonymousClass63X r4 = new AnonymousClass63X();
        byte[] bArr = r5.A02;
        int i2 = 0;
        if (bArr == null) {
            length = 0;
        } else {
            length = bArr.length;
        }
        byte[] bArr2 = r5.A03;
        if (bArr2 != null) {
            i2 = bArr2.length;
        }
        r4.A01 = Double.valueOf((double) (length + i2));
        r4.A03 = C108945cZ.A1B(SystemClock.elapsedRealtime(), r5.A0K);
        r4.A02 = Integer.valueOf(i);
        boolean z = r5.A0N;
        r4.A00 = Boolean.valueOf(z);
        if (z) {
            C18100vl r3 = r5.A0M.A01;
            r4.A05 = C17880vN.A0C(r3).getString("pref_squid_version", (String) null);
            r4.A04 = C17880vN.A0C(r3).getString("pref_avatar_art_revision", (String) null);
        }
        r5.A0L.CC7(r4);
    }

    public AnonymousClass73O(C19880zA r5, AnonymousClass1KB r6, AnonymousClass11S r7, AnonymousClass1M9 r8, C24671Lf r9, C24791Lr r10, C26881Tv r11, AnonymousClass11P r12, AnonymousClass121 r13, AnonymousClass1MZ r14, AnonymousClass1R3 r15, AnonymousClass18K r16, AnonymousClass1BI r17, C27031Ul r18, C27001Ui r19, AnonymousClass1PQ r20, byte[] bArr, byte[] bArr2, boolean z) {
        this.A0B = r12;
        this.A05 = r6;
        this.A06 = r7;
        this.A0L = r16;
        this.A07 = r8;
        this.A08 = r9;
        this.A0E = r15;
        this.A09 = r10;
        this.A0A = r11;
        this.A0H = r19;
        this.A0I = r20;
        this.A0C = r13;
        this.A0M = r18;
        this.A04 = r5;
        this.A0D = r14;
        this.A0F = r17;
        this.A02 = bArr;
        this.A03 = bArr2;
        this.A0N = z;
        Long A0m = C108955ca.A0m();
        this.A0J = A0m;
        A0O.put(A0m.toString(), this);
        AnonymousClass7T8 r3 = new AnonymousClass7T8(this);
        this.A0G = r3;
        new Timer().schedule(r3, 32000);
    }
}
