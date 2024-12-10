package X;

import com.whatsapp.voipcalling.CallState;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.34S  reason: invalid class name */
public final class AnonymousClass34S implements C160938Ar, AnonymousClass1IV {
    public final C30151dT A00;
    public final AnonymousClass00H A01;
    public final ConcurrentMap A02 = new ConcurrentHashMap();
    public final ConcurrentMap A03 = new ConcurrentHashMap();
    public final AtomicInteger A04 = new AtomicInteger(0);
    public final C18100vl A05 = new C18110vm(new AnonymousClass3HW(this));

    public static final String A03(int i) {
        if (i == 1) {
            return "p5222";
        }
        if (i == 2) {
            return "p443";
        }
        if (i != 3) {
            return "unknown";
        }
        return "p80";
    }

    public static final String A06(String str, String str2, String str3) {
        String[] strArr = new String[3];
        AnonymousClass001.A1Q(str, str2, strArr);
        strArr[2] = str3;
        return C29431cG.A0h("||", C200410p.A0P(strArr), (C22821Di) null);
    }

    public /* synthetic */ void Bmn() {
    }

    public void Bn7(C178119Bw r6) {
        C18070vi.A0d(r6, 0);
        C30151dT r4 = this.A00;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("callResult=");
        String A0t = C17880vN.A0t(A10, r6.A06);
        if (C30151dT.A04(r4)) {
            ((C200710s) r4.A05.getValue()).execute(new C146817Qs(34, A0t, r4));
        }
    }

    public /* synthetic */ void BnG(C178119Bw r1, boolean z) {
    }

    public /* synthetic */ void BnH(long j, boolean z, boolean z2, boolean z3, boolean z4) {
    }

    public /* synthetic */ void BnJ(C178119Bw r1) {
    }

    public /* synthetic */ void BnK(AnonymousClass1BI r1, CallState callState, String str) {
    }

    public /* synthetic */ void C5e() {
    }

    public static long A00(C30151dT r6) {
        C30351dn r62 = r6.A00;
        if (r62 != null) {
            return ((TimeUnit.NANOSECONDS.toMillis(r62.A09.currentMonotonicTimestampNanos() - r62.A08) / 1000) - ((long) r62.A02)) * 1000;
        }
        return 0;
    }

    private final AnonymousClass19Y A01() {
        Object value = this.A05.getValue();
        C18070vi.A0X(value);
        return (AnonymousClass19Y) value;
    }

    public static final String A05(Integer num) {
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        if (intValue == 2) {
            return "google";
        }
        if (intValue == 3) {
            return "hardcoded";
        }
        if (intValue == 4) {
            return "no_dns";
        }
        if (intValue == 1) {
            return "system";
        }
        return null;
    }

    private final void A0A(C62652rk r12, boolean z) {
        C30151dT r4 = this.A00;
        if (r4.A00 != null) {
            AnonymousClass19Y A012 = A01();
            AtomicInteger atomicInteger = this.A04;
            A012.markerAnnotate(125903041, atomicInteger.get(), "end_foreground_time_ms", r4.A05());
            long A013 = C17900vP.A01((Number) this.A02.get("drift_start_ms"));
            A01().markerAnnotate(125903041, atomicInteger.get(), "drift_ms", A00(r4) - A013);
        }
        AnonymousClass19Y A014 = A01();
        int andIncrement = this.A04.getAndIncrement();
        short s = 3;
        boolean z2 = z;
        if (z) {
            s = 2;
        }
        A014.markerEnd(125903041, andIncrement, s);
        String A042 = A04(r12, z);
        Long A0n = C17880vN.A0n(r12.A04);
        if (C30151dT.A04(r4)) {
            ((C200710s) r4.A05.getValue()).execute(new C146587Pv(r4, A0n, A042, 4, z2));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r1 = new java.util.concurrent.atomic.AtomicInteger(0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A0B(java.lang.String r4, java.lang.String r5) {
        /*
            r3 = this;
            java.util.concurrent.ConcurrentMap r2 = r3.A03
            java.lang.Object r1 = r2.get(r4)
            if (r1 != 0) goto L_0x0015
            r0 = 0
            java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
            r1.<init>(r0)
            java.lang.Object r0 = r2.putIfAbsent(r4, r1)
            if (r0 == 0) goto L_0x0015
            r1 = r0
        L_0x0015:
            java.util.concurrent.atomic.AtomicInteger r1 = (java.util.concurrent.atomic.AtomicInteger) r1
            int r2 = r1.getAndIncrement()
            if (r2 == 0) goto L_0x002a
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r4)
            r0 = 95
            r1.append(r0)
            java.lang.String r4 = X.C17880vN.A0t(r1, r2)
        L_0x002a:
            X.19Y r2 = r3.A01()
            java.util.concurrent.atomic.AtomicInteger r0 = r3.A04
            int r1 = r0.get()
            r0 = 125903041(0x78120c1, float:1.9429014E-34)
            r2.markerPoint((int) r0, (int) r1, (java.lang.String) r4, (java.lang.String) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass34S.A0B(java.lang.String, java.lang.String):void");
    }

    private final boolean A0C(int i) {
        if (i != 12) {
            return false;
        }
        A01().markerDrop(125903041, this.A04.get());
        return true;
    }

    public void Bpn(C62652rk r3) {
        if (!A0C(r3.A02)) {
            A09(A01(), r3, this.A04.get());
            A0A(r3, true);
        }
    }

    public void Bpo(C62652rk r6, int i, boolean z) {
        if (!A0C(r6.A02)) {
            AnonymousClass19Y A012 = A01();
            AtomicInteger atomicInteger = this.A04;
            A012.markerAnnotate(125903041, atomicInteger.get(), "login_failure", i);
            A01().markerAnnotate(125903041, atomicInteger.get(), "login_go_away", z);
            A0A(r6, false);
        }
    }

    public void Bpp() {
        C30151dT r5 = this.A00;
        if (C30151dT.A04(r5)) {
            ((C200710s) r5.A05.getValue()).execute(new C70593Bs(r5, 31));
        }
        AnonymousClass19Y A012 = A01();
        AtomicInteger atomicInteger = this.A04;
        if (!A012.A01.isMarkerOn(125903041, atomicInteger.get())) {
            this.A03.clear();
            ConcurrentMap concurrentMap = this.A02;
            concurrentMap.clear();
            AnonymousClass19Y A013 = A01();
            C30371dp r2 = new C30371dp(125903041);
            r2.A00 = Integer.valueOf(atomicInteger.get());
            r2.A00(Long.valueOf(r5.A05()), "start_foreground_time_ms");
            A013.Bj3(r2);
            C30351dn r0 = r5.A00;
            if (r0 != null) {
                A01().markerAnnotate(125903041, atomicInteger.get(), "health_log_id", r0.A06);
                concurrentMap.put("drift_start_ms", Long.valueOf(A00(r5)));
            }
        }
    }

    public void Bs0(C62652rk r3) {
        int i = r3.A02;
        if (!A0C(i)) {
            A0B(AnonymousClass000.A0y("_dns_end", AnonymousClass000.A11(A02(i))), A04(r3, true));
        }
    }

    public void BvW(C62652rk r3) {
        int i = r3.A02;
        if (!A0C(i)) {
            A0B(AnonymousClass000.A0y("_handshake_end", A07(this, r3, i)), A04(r3, true));
        }
    }

    public void BvX(C62652rk r3, int i) {
        int i2 = r3.A02;
        if (!A0C(i2)) {
            A0B(AnonymousClass000.A0y("_handshake_end", A07(this, r3, i2)), A04(r3, false));
        }
    }

    public void BvY(C62652rk r3) {
        int i = r3.A02;
        if (!A0C(i)) {
            A08(this, r3, "_handshake_start", A07(this, r3, i));
        }
    }

    public void BxP(C62652rk r3) {
        int i = r3.A02;
        if (!A0C(i)) {
            A0B(AnonymousClass000.A0y("_login_end", A07(this, r3, i)), A04(r3, true));
        }
    }

    public void BxR(C62652rk r3, int i) {
        int i2 = r3.A02;
        if (!A0C(i2)) {
            A0B(AnonymousClass000.A0y("_login_end", A07(this, r3, i2)), A04(r3, false));
        }
    }

    public void BxS(C62652rk r3) {
        int i = r3.A02;
        if (!A0C(i)) {
            A08(this, r3, "_login_start", A07(this, r3, i));
        }
    }

    public void C5s(C62652rk r3, int i) {
        int i2 = r3.A02;
        if (!A0C(i2)) {
            A0B(AnonymousClass000.A0y("_socket_end", A07(this, r3, i2)), A04(r3, false));
        }
    }

    public void C5t(C62652rk r3) {
        int i = r3.A02;
        if (!A0C(i)) {
            A0B(AnonymousClass000.A0y("_socket_end", A07(this, r3, i)), A04(r3, true));
        }
    }

    public void C5u(C62652rk r3) {
        int i = r3.A02;
        if (!A0C(i)) {
            A08(this, r3, "_socket_start", A07(this, r3, i));
        }
    }

    public AnonymousClass34S(C30151dT r3, AnonymousClass00H r4) {
        C18070vi.A0j(r4, r3);
        this.A01 = r4;
        this.A00 = r3;
    }

    public static final String A02(int i) {
        switch (i) {
            case 1:
                return "debug";
            case 2:
                return "push_overrides";
            case 3:
                return "ip_override_port_1";
            case 4:
                return "ip_override_port_2";
            case 5:
                return "primary";
            case 6:
                return "hardcoded";
            case 7:
                return "ex";
            case 8:
                return "push_fallbacks";
            case 9:
                return "primary_http";
            case 10:
                return "hardcoded_http";
            case 11:
                return "ex_http";
            case 13:
                return "fallback";
            case 14:
                return "fallback_http";
            default:
                return "unknown";
        }
    }

    public static final String A04(C62652rk r5, boolean z) {
        String str;
        String A052 = A05(r5.A01());
        String A022 = r5.A02();
        String A032 = A03(r5.A00());
        String[] strArr = new String[4];
        if (z) {
            str = "success";
        } else {
            str = "fail";
        }
        C17900vP.A0O(str, A052, A022, A032, strArr);
        return C29431cG.A0h("||", C200410p.A0P(strArr), (C22821Di) null);
    }

    public static StringBuilder A07(AnonymousClass34S r2, C62652rk r3, int i) {
        A09(r2.A01(), r3, r2.A04.get());
        String A022 = A02(i);
        StringBuilder sb = new StringBuilder();
        sb.append(A022);
        return sb;
    }

    public static void A08(AnonymousClass34S r4, C62652rk r5, String str, StringBuilder sb) {
        sb.append(str);
        r4.A0B(sb.toString(), A06(A05(r5.A01()), r5.A02(), A03(r5.A00())));
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A09(X.AnonymousClass19T r6, X.C62652rk r7, int r8) {
        /*
            int r5 = r7.A00()
            int r0 = r7.A02
            java.lang.Integer r0 = X.C63602tO.A01(r0)
            if (r0 == 0) goto L_0x005e
            int r1 = r0.intValue()
            r0 = 6
            if (r1 != r0) goto L_0x004c
            java.lang.String r4 = "ex"
        L_0x0015:
            java.lang.String r2 = A03(r5)
            r3 = 125903041(0x78120c1, float:1.9429014E-34)
            if (r4 == 0) goto L_0x0033
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r4)
            java.lang.String r0 = "_port"
            r1.append(r0)
            r0 = 3
            if (r5 != r0) goto L_0x0049
            java.lang.String r0 = "_http"
        L_0x002c:
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            r6.markerAnnotate((int) r3, (int) r8, (java.lang.String) r0, (java.lang.String) r2)
        L_0x0033:
            java.lang.String r2 = r7.A02()
            if (r2 == 0) goto L_0x0048
            if (r4 == 0) goto L_0x0048
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r4)
            java.lang.String r0 = "_pop_address"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            r6.markerAnnotate((int) r3, (int) r8, (java.lang.String) r0, (java.lang.String) r2)
        L_0x0048:
            return
        L_0x0049:
            java.lang.String r0 = ""
            goto L_0x002c
        L_0x004c:
            r0 = 4
            if (r1 != r0) goto L_0x0052
            java.lang.String r4 = "fallback"
            goto L_0x0015
        L_0x0052:
            r0 = 2
            if (r1 != r0) goto L_0x0058
            java.lang.String r4 = "primary"
            goto L_0x0015
        L_0x0058:
            r0 = 5
            if (r1 != r0) goto L_0x005e
            java.lang.String r4 = "hardcoded"
            goto L_0x0015
        L_0x005e:
            r4 = 0
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass34S.A09(X.19T, X.2rk, int):void");
    }

    public void Brz(int i) {
        if (!A0C(i)) {
            String A0y = AnonymousClass000.A0y("_dns_end", AnonymousClass000.A11(A02(i)));
            String[] strArr = new String[4];
            AnonymousClass001.A1Q("fail", (Object) null, strArr);
            strArr[2] = null;
            strArr[3] = null;
            A0B(A0y, C29431cG.A0h("||", C200410p.A0P(strArr), (C22821Di) null));
        }
    }

    public void Bs1(int i) {
        if (!A0C(i)) {
            A0B(AnonymousClass000.A0y("_dns_start", AnonymousClass000.A11(A02(i))), A06((String) null, (String) null, (String) null));
        }
    }
}
