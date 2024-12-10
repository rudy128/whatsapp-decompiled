package X;

import android.os.SystemClock;
import com.whatsapp.messaging.MessageClient$RetriableIqProtocol$resubmit$1$1;
import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.Acm  reason: case insensitive filesystem */
public final class C20994Acm implements AnonymousClass1O5 {
    public final int A00;
    public final long A01 = SystemClock.elapsedRealtime();
    public final AnonymousClass11P A02;
    public final AnonymousClass1O5 A03;
    public final C29621ca A04;
    public final AnonymousClass1NV A05;
    public final String A06;
    public final long A07;
    public final /* synthetic */ AnonymousClass1OZ A08;

    private final void A01(C186019dW r13) {
        AnonymousClass1OZ r9 = this.A08;
        Map map = r9.A09;
        synchronized (map) {
            String str = this.A06;
            AnonymousClass1OX r2 = r9.A0B;
            map.put(str, C30451dy.A02(AnonymousClass00R.A00, AnonymousClass1OR.A00, new MessageClient$RetriableIqProtocol$resubmit$1$1(r13, this, r9, (C29621ca) null, (C30391dr) null), r2));
            C56062gq r4 = (C56062gq) r9.A04.A03.get(str);
            if (r4 != null) {
                r4.A08++;
            }
        }
    }

    public void BrD(String str) {
        C18070vi.A0d(str, 0);
        C186019dW A002 = A00(this.A04);
        if (A002 != null) {
            AnonymousClass1O5 r1 = this.A03;
            this.A05.A00();
            C22384B5n CM9 = r1.CM9(str);
            if (C18070vi.A18(CM9, C20958AcC.A00)) {
                A01(A002);
                return;
            } else if (!C18070vi.A18(CM9, C20957AcB.A00)) {
                return;
            }
        }
        A02(this, (C29621ca) null);
    }

    public C20994Acm(AnonymousClass11P r3, AnonymousClass1OZ r4, AnonymousClass1O5 r5, C29621ca r6, AnonymousClass1NV r7, String str, int i, long j) {
        this.A08 = r4;
        this.A02 = r3;
        this.A00 = i;
        this.A06 = str;
        this.A04 = r6;
        this.A03 = r5;
        this.A07 = j;
        this.A05 = r7;
    }

    private final C186019dW A00(C29621ca r11) {
        Long A042;
        Long l = null;
        String A0Q = r11.A0Q("backoff", (String) null);
        if (!(A0Q == null || (A042 = AnonymousClass1YD.A04(A0Q)) == null)) {
            l = Long.valueOf(A042.longValue() * 1000);
        }
        Long A012 = this.A05.A01();
        if (A012 == null) {
            return null;
        }
        long longValue = A012.longValue();
        if (l != null) {
            longValue = l.longValue();
        }
        long elapsedRealtime = this.A07 - (SystemClock.elapsedRealtime() - this.A01);
        if (longValue < elapsedRealtime) {
            return new C186019dW(this, longValue, elapsedRealtime);
        }
        return null;
    }

    public static final void A02(C20994Acm acm, C29621ca r7) {
        AnonymousClass19Y r5 = acm.A08.A08;
        String str = acm.A06;
        r5.markerAnnotate(154475307, str.hashCode(), "retry", acm.A05.A00());
        AnonymousClass1O5 r0 = acm.A03;
        if (r7 != null) {
            r0.Bt9(r7, str);
        } else {
            r0.BrD(str);
        }
    }

    public void Bt9(C29621ca r6, String str) {
        Integer A032;
        C18070vi.A0h(str, r6);
        String A022 = C29621ca.A02(r6, "code");
        if (A022 == null || (A032 = AnonymousClass1YD.A03(A022)) == null) {
            Log.e("MessageClient/RetriableIqProtocol/onError no error code received");
        } else {
            C186019dW A002 = A00(r6);
            if (A002 != null) {
                AnonymousClass1O5 r1 = this.A03;
                this.A05.A00();
                int intValue = A032.intValue();
                new C194069r7(r6, intValue);
                C22384B5n CM9 = r1.CM9(str);
                if (C18070vi.A18(CM9, C20958AcC.A00)) {
                    C25411Oc r12 = AnonymousClass1OZ.A0K;
                    if (r12.A00 <= intValue && intValue <= r12.A01 && !AnonymousClass1OZ.A0J.contains(A032)) {
                        A01(A002);
                        return;
                    }
                } else if (!C18070vi.A18(CM9, C20957AcB.A00)) {
                    return;
                }
            }
        }
        A02(this, r6);
    }

    public void C7Z(C29621ca r6, String str) {
        C18070vi.A0h(str, r6);
        this.A08.A08.markerAnnotate(154475307, str.hashCode(), "retry", this.A05.A00());
        this.A03.C7Z(r6, str);
    }

    public /* synthetic */ C22384B5n CM9(String str) {
        return C20958AcC.A00;
    }
}
