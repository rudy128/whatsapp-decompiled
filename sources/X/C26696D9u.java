package X;

import android.os.SystemClock;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.D9u  reason: case insensitive filesystem */
public final class C26696D9u implements C28570E8b, C28409E0a {
    public static C26696D9u A0A;
    public static final AnonymousClass1IX A0B = AnonymousClass1IX.of(1400000L, 990000L, 730000L, 510000L, 230000L);
    public static final AnonymousClass1IX A0C;
    public static final AnonymousClass1IX A0D;
    public static final AnonymousClass1IX A0E = AnonymousClass1IX.of(5700000L, 3700000L, 2300000L, 1700000L, 990000L);
    public static final AnonymousClass1IX A0F = AnonymousClass1IX.of(2800000L, 1800000L, 1400000L, 1100000L, 870000L);
    public static final AnonymousClass1IX A0G = AnonymousClass1IX.of(4400000L, 3200000L, 2300000L, 1600000L, 810000L);
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public Map A06;
    public final C25737Cl7 A07;
    public final CJ5 A08;
    public final C28617EAp A09;

    public /* bridge */ /* synthetic */ void Bn4(C26115Csd csd, Object obj, int i, boolean z) {
        synchronized (this) {
            this.A02 += (long) i;
        }
    }

    public /* bridge */ /* synthetic */ void C9A(C26115Csd csd, Object obj, boolean z) {
        synchronized (this) {
            C26056CrS.A03(AnonymousClass000.A1R(this.A01));
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int i = (int) (elapsedRealtime - this.A03);
            this.A05 += (long) i;
            long j = this.A04;
            long j2 = this.A02;
            this.A04 = j + j2;
            if (i > 0) {
                float f = (((float) j2) * 8000.0f) / ((float) i);
                C25737Cl7 cl7 = this.A07;
                cl7.A01((int) Math.sqrt((double) j2), f);
                if (this.A05 >= 2000 || this.A04 >= 524288) {
                    cl7.A00();
                }
                this.A00++;
            }
            int i2 = this.A01 - 1;
            this.A01 = i2;
            if (i2 > 0) {
                this.A03 = elapsedRealtime;
            }
            this.A02 = 0;
        }
    }

    public /* bridge */ /* synthetic */ void C9E(C26115Csd csd, Object obj, boolean z, boolean z2) {
        synchronized (this) {
            int i = this.A01;
            if (i == 0) {
                this.A03 = SystemClock.elapsedRealtime();
            }
            this.A01 = i + 1;
        }
    }

    static {
        Long valueOf = Long.valueOf(SearchActionVerificationClientService.MS_TO_NS);
        A0C = AnonymousClass1IX.of(2100000L, 1400000L, valueOf, 890000L, 640000L);
        A0D = AnonymousClass1IX.of(2600000L, 1700000L, 1300000L, valueOf, 700000L);
    }

    public C26696D9u(C28617EAp eAp, Map map) {
        this.A08 = new CJ5();
        this.A07 = new C25737Cl7();
        this.A09 = eAp;
        this.A06 = map;
        this.A00 = 0;
    }

    @Deprecated
    public C26696D9u() {
        this(C28617EAp.A00, Collections.emptyMap());
    }
}
