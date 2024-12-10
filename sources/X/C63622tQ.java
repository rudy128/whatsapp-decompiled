package X;

import android.os.SystemClock;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.2tQ  reason: invalid class name and case insensitive filesystem */
public abstract class C63622tQ {
    public int A00 = -1;
    public long A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final AnonymousClass190 A05;
    public final AnonymousClass1CP A06;
    public final AnonymousClass1N7 A07;
    public final Integer A08;
    public final Integer A09;
    public final String A0A;
    public final boolean A0B;
    public final AnonymousClass11P A0C;
    public final AnonymousClass1Be A0D;
    public final AnonymousClass18K A0E;
    public final Map A0F = C17880vN.A13();

    public C63622tQ(AnonymousClass190 r18, AnonymousClass11P r19, AnonymousClass1CP r20, C18030ve r21, AnonymousClass18K r22, AnonymousClass1N7 r23, Integer num, Integer num2, String str, int i, long j, long j2) {
        boolean z = true;
        Boolean bool = C17960vV.A01;
        this.A0C = r19;
        this.A05 = r18;
        AnonymousClass18K r9 = r22;
        this.A0E = r9;
        this.A07 = r23;
        this.A06 = r20;
        this.A0A = str;
        this.A03 = j;
        this.A02 = i;
        this.A00 = 1;
        long j3 = j2;
        this.A01 = j3;
        this.A04 = j3;
        AnonymousClass1Be BDn = r9.BDn(A03(new C57532jE(0, 0, 0), -1), (C18180vt) null);
        this.A0D = BDn;
        this.A08 = num;
        this.A09 = num2;
        this.A0B = (BDn.A00 == null || ((1 << i) & C18020vd.A00(C18040vf.A02, r21, 7856)) == 0) ? false : z;
        A00(1);
        A00(0);
    }

    public static void A02(C63622tQ r14, int i, int i2, long j) {
        C57532jE r12;
        long longValue;
        C63622tQ r6 = r14;
        AnonymousClass1Be r4 = r14.A0D;
        int i3 = i;
        int i4 = i2;
        long j2 = j;
        if (r4 == null || r4.A00 == null) {
            r6.A01((C57532jE) null, i3, i4, j2);
            return;
        }
        if (r14.A0B) {
            AnonymousClass1CP r5 = r14.A06;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append(r14.A02);
            A10.append("-");
            A10.append(r14.A03);
            AnonymousClass1CR A012 = r5.A01(AnonymousClass001.A1I("-", A10, i));
            long j3 = -1;
            Number number = (Number) A012.A02.get("msgstore.db");
            if (number == null) {
                longValue = -1;
            } else {
                longValue = number.longValue();
            }
            Number number2 = (Number) A012.A03.get("msgstore.db");
            if (number2 != null) {
                j3 = number2.longValue();
            }
            r12 = new C57532jE(j2, longValue, j3);
        } else {
            r12 = new C57532jE(j2, -1, -1);
        }
        r6.A01(r12, i3, i4, j2);
        Map map = r6.A0F;
        C17880vN.A1O(r12, map, i3);
        if (i3 == 0) {
            Iterator A15 = AnonymousClass000.A15(map);
            while (A15.hasNext()) {
                Map.Entry A16 = AnonymousClass000.A16(A15);
                r6.A0E.CC8(r6.A03((C57532jE) A16.getValue(), AnonymousClass000.A0M(A16.getKey())), r4);
            }
        }
    }

    public abstract AnonymousClass184 A03(C57532jE r1, int i);

    public abstract String A04();

    public synchronized void A05(int i) {
        int i2 = this.A00;
        if (i == i2) {
            AnonymousClass190 r3 = this.A05;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("tag=");
            A10.append(A04());
            A10.append(" stage=");
            A10.append(i);
            r3.A0G("loggable_stanza_invalid_stage_begin", AnonymousClass001.A1I(" currentStage=", A10, i2), true);
        } else {
            long uptimeMillis = SystemClock.uptimeMillis();
            A02(this, i2, i, uptimeMillis - this.A01);
            this.A00 = i;
            this.A01 = uptimeMillis;
            A00(i);
        }
    }

    public abstract void A06(AnonymousClass2H4 r1);

    private void A00(int i) {
        if (this.A0B) {
            AnonymousClass1CP r4 = this.A06;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append(this.A02);
            A10.append("-");
            A10.append(this.A03);
            String A1I = AnonymousClass001.A1I("-", A10, i);
            C18070vi.A0d(A1I, 0);
            AnonymousClass1CP.A00(r4, A1I, false);
        }
    }

    private void A01(C57532jE r4, int i, int i2, long j) {
        if (i2 != 0) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append(A04());
            A10.append("/onStageComplete stage=");
            A10.append(i);
            A10.append("->");
            A10.append(i2);
            A10.append(" id=");
            A10.append(this.A03);
            A10.append("/");
            A10.append(this.A0A);
            A10.append(" ");
            A10.append(j);
            A10.append("ms");
            if (r4 != null) {
                A10.append("; db=");
                A10.append(r4.A00);
                A10.append('/');
                A10.append(r4.A01);
            }
            if (i2 == -1) {
                Log.i(A10.toString());
            }
        }
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("id=");
        A10.append(this.A03);
        A10.append("/");
        A10.append(this.A0A);
        A10.append("; currentStage=");
        A10.append(this.A00);
        A10.append("; loggableStanzaType=");
        A10.append(this.A02);
        A10.append("; offlineCount=");
        A10.append(this.A08);
        A10.append("; stanzaAttrsHash=");
        return C17890vO.A0V(this.A09, A10);
    }
}
