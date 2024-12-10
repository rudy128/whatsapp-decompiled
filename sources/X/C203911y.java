package X;

import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.Map;
import java.util.Set;

/* renamed from: X.11y  reason: invalid class name and case insensitive filesystem */
public class C203911y implements C201511a {
    public final C19880zA A00;
    public final AnonymousClass190 A01;
    public final C51432Yg A02;
    public final C32521hK A03;
    public final AnonymousClass11S A04;
    public final C25001Mm A05;
    public final C23651Hc A06;
    public final AnonymousClass1M9 A07;
    public final AnonymousClass11P A08;
    public final AnonymousClass1P3 A09;
    public final AnonymousClass1CJ A0A;
    public final C26141Qz A0B;
    public final AnonymousClass1MZ A0C;
    public final AnonymousClass1WO A0D;
    public final C32331h1 A0E;
    public final C26111Qw A0F;
    public final AnonymousClass1RK A0G;
    public final C18030ve A0H;
    public final C25931Qe A0I;
    public final AnonymousClass1O2 A0J;
    public final AnonymousClass1PT A0K;
    public final AnonymousClass1W9 A0L;
    public final C200710s A0M;
    public final AnonymousClass00H A0N;
    public final AnonymousClass00H A0O;
    public final AnonymousClass00H A0P;
    public final AnonymousClass00H A0Q;
    public final AnonymousClass00H A0R;
    public final AnonymousClass00H A0S;
    public final AnonymousClass00H A0T;
    public final AnonymousClass00H A0U;
    public final AnonymousClass00H A0V;
    public final AnonymousClass00H A0W;

    public C203911y(C19880zA r4, AnonymousClass190 r5, C51432Yg r6, C32521hK r7, AnonymousClass11S r8, C25001Mm r9, C23651Hc r10, AnonymousClass1M9 r11, AnonymousClass11P r12, AnonymousClass1P3 r13, AnonymousClass1CJ r14, C26141Qz r15, AnonymousClass1MZ r16, AnonymousClass1WO r17, C32331h1 r18, C26111Qw r19, AnonymousClass1RK r20, C18030ve r21, C25931Qe r22, AnonymousClass1O2 r23, AnonymousClass1PT r24, AnonymousClass1W9 r25, AnonymousClass10I r26, AnonymousClass00H r27, AnonymousClass00H r28, AnonymousClass00H r29, AnonymousClass00H r30, AnonymousClass00H r31, AnonymousClass00H r32, AnonymousClass00H r33, AnonymousClass00H r34, AnonymousClass00H r35, AnonymousClass00H r36) {
        C200710s r1 = new C200710s(r26, true);
        Boolean bool = C17960vV.A01;
        this.A08 = r12;
        this.A0H = r21;
        this.A01 = r5;
        this.A04 = r8;
        this.A0A = r14;
        this.A05 = r9;
        this.A0S = r27;
        this.A0K = r24;
        this.A07 = r11;
        this.A0W = r28;
        this.A0N = r29;
        this.A0P = r30;
        this.A0J = r23;
        this.A06 = r10;
        this.A03 = r7;
        this.A09 = r13;
        this.A0E = r18;
        this.A0T = r33;
        this.A0F = r19;
        this.A0B = r15;
        this.A0G = r20;
        this.A0L = r25;
        this.A0U = r31;
        this.A00 = r4;
        this.A0O = r32;
        this.A0I = r22;
        this.A0C = r16;
        this.A02 = r6;
        this.A0V = r34;
        this.A0R = r35;
        this.A0D = r17;
        this.A0Q = r36;
        this.A0M = r1;
    }

    public static void A00(C203911y r14, C136506tv r15, C26981Ug r16, Runnable runnable) {
        boolean z;
        Set set;
        StringBuilder sb = new StringBuilder();
        sb.append("SendMessageMethods/sending message: ");
        C136506tv r13 = r15;
        sb.append(r15);
        Log.i(sb.toString());
        AnonymousClass206 r5 = r15.A05;
        C203911y r12 = r14;
        if (r5.A0w()) {
            r14.A02(r5);
            return;
        }
        Handler handler = r14.A03.A00;
        handler.removeMessages(0);
        handler.removeMessages(1);
        handler.removeMessages(2);
        Jid jid = r15.A03;
        DeviceJid deviceJid = jid;
        Jid jid2 = jid;
        if (jid == null) {
            Jid jid3 = r5.A0v.A00;
            C17960vV.A07(jid3);
            jid2 = jid3;
        }
        AnonymousClass3AO r152 = new AnonymousClass3AO(r12, r13, r16, runnable);
        AnonymousClass190 r3 = r12.A01;
        boolean z2 = false;
        if (AnonymousClass25A.A0L(r3, r12.A04, r12.A0A, r12.A0C, r5) && r5.A0y() && r12.A06.A07) {
            AnonymousClass1O2 r0 = r12.A0J;
            AnonymousClass205 r7 = r5.A0v;
            Map map = r0.A03;
            synchronized (map) {
                Pair pair = (Pair) map.get(r7);
                z = false;
                if (!(pair == null || (set = (Set) pair.first) == null || !set.contains(AnonymousClass1O2.A00(deviceJid, r7)))) {
                    z = true;
                }
            }
            if (!z && !r5.A19) {
                z2 = true;
            }
        }
        if (!z2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SendMessageMethods/Dropping send message: ");
            sb2.append(r13);
            Log.i(sb2.toString());
            r152.BrF((Object) null);
        } else if (C22971Dz.A0V(jid2)) {
            r3.A0G("Attempting to send message with invalid jid", (String) null, true);
            r152.BrC(new Exception("Attempting to send message with invalid jid"));
        } else {
            r12.A0J.A03(deviceJid, r5);
            if (!r12.A06.A02() && !r13.A08) {
                ((C219017v) r12.A0T.get()).A0B(1, true, false, false, false);
            }
            if (r5.A12 == 0) {
                r5.A12 = SystemClock.uptimeMillis();
            }
            if (r13.A07 || r13.A08) {
                AnonymousClass1PT r1 = r12.A0K;
                int i = r5.A1H;
                if (r1.A0b) {
                    r1.A0G.A04(r5.A0v.A01.hashCode(), 5, i, r5.A0u);
                }
            }
            r12.A0M.execute(new C146617Py(r12, r13, jid2, r152, 0));
        }
    }

    public void A01(AnonymousClass206 r3) {
        A00(this, new C136506tv(new C130816k3(this.A08, r3)), (C26981Ug) null, (Runnable) null);
    }

    public void A02(AnonymousClass206 r4) {
        this.A0M.execute(new C70643By(this, r4, 45));
    }

    public void A03(boolean z) {
        ((C219017v) this.A0T.get()).A16 = !z;
        ((AnonymousClass1OZ) this.A0S.get()).A0G(C63902ts.A05(z), (String) null);
    }
}
