package X;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.AkW  reason: case insensitive filesystem */
public final class C21465AkW implements Runnable {
    public final int A00;
    public final long A01;
    public final AnonymousClass1UK A02;
    public final AnonymousClass1UW A03;
    public final C33791jO A04;
    public final AnonymousClass12D A05;
    public final C33811jQ A06;
    public final AnonymousClass18K A07;
    public final String A08;
    public final AtomicInteger A09;

    /* JADX WARNING: type inference failed for: r0v18, types: [java.lang.Object, X.2Rh] */
    public void run() {
        AtomicInteger atomicInteger = this.A09;
        int incrementAndGet = atomicInteger.incrementAndGet();
        if (incrementAndGet > 10) {
            StringBuilder A11 = AnonymousClass000.A11("ClientIplsSecretKeyProvider.fetchKeyTask/");
            A11.append(this.A08);
            C17900vP.A0j("/run: retry ", A11, incrementAndGet);
            atomicInteger.set(0);
            AnonymousClass12D r1 = this.A05;
            if (r1 != null) {
                r1.Bp4(new Object());
                return;
            }
            return;
        }
        try {
            AnonymousClass1UW r2 = this.A03;
            if (r2.A00() != null) {
                StringBuilder A112 = AnonymousClass000.A11("ClientIplsSecretKeyProvider.fetchKeyTask/");
                A112.append(this.A08);
                C17890vO.A1A(A112, "/returning as key exists");
                AnonymousClass8XJ A012 = r2.A01();
                if (A012 != null) {
                    AnonymousClass12D r12 = this.A05;
                    if (r12 != null) {
                        r12.Bp4(new AnonymousClass8nK(A012));
                        return;
                    }
                    return;
                }
                throw C17880vN.A0g();
            }
            StringBuilder A113 = AnonymousClass000.A11("ClientIplsSecretKeyProvider.fetchKeyTask/");
            A113.append(this.A08);
            C17890vO.A1A(A113, "/kicking off startClientIplsHandshake");
            byte[] bArr = new byte[32];
            C22691Cv.A00().nextBytes(bArr);
            String A14 = C108955ca.A14(bArr);
            C33791jO r22 = this.A04;
            C18070vi.A0b(A14);
            Object obj = r22.A02(C179329Hn.GET, (AnonymousClass8XJ) null, A14).get(40000, TimeUnit.MILLISECONDS);
            C18070vi.A0X(obj);
            A00((AnonymousClass9MD) obj, this.A00);
        } catch (Exception e) {
            StringBuilder A114 = AnonymousClass000.A11("ClientIplsSecretKeyProvider.fetchKeyTask/");
            A114.append(this.A08);
            C108995ce.A1M("/run: failed with exception ", A114, e);
            String message = e.getMessage();
            if (message == null) {
                message = "unknown";
            }
            A02((Long) null, message, this.A00, this.A01);
        }
    }

    private final void A00(AnonymousClass9MD r17, int i) {
        Long l;
        EE9 ee9;
        EE9 ee92;
        AnonymousClass9MD r1 = r17;
        Integer num = null;
        int i2 = i;
        if (r1 instanceof AnonymousClass8nM) {
            AnonymousClass8nM r6 = (AnonymousClass8nM) r1;
            C179329Hn r5 = r6.A00;
            int ordinal = r5.ordinal();
            if (ordinal == 0) {
                StringBuilder A11 = AnonymousClass000.A11("ClientIplsSecretKeyProvider.fetchKeyTask/");
                A11.append(this.A08);
                C17900vP.A0Y(r5, "/processResult: success with ", A11);
                A01(r6.A01, i2);
            } else if (ordinal == 1) {
                StringBuilder A112 = AnonymousClass000.A11("ClientIplsSecretKeyProvider.fetchKeyTask/");
                String str = this.A08;
                A112.append(str);
                C17900vP.A0Y(r5, "/processResult: success ", A112);
                AnonymousClass8XJ r3 = r6.A01;
                StringBuilder A0o = AnonymousClass8BW.A0o("ClientIplsSecretKeyProvider.fetchKeyTask/", str);
                A0o.append("/processResult: success, secretsSize: ");
                if (!(r3 == null || (ee92 = r3.clientSecretKey_) == null)) {
                    num = AnonymousClass8BT.A0l(ee92);
                }
                C17900vP.A0b(num, A0o);
                AnonymousClass1UK r62 = this.A02;
                long j = this.A01;
                long time = new Date().getTime();
                AtomicInteger atomicInteger = this.A09;
                C18070vi.A0d(r1, 0);
                C171258rQ r12 = new C171258rQ();
                r12.A03 = Long.valueOf(j);
                r12.A02 = Long.valueOf(time);
                r12.A04 = AnonymousClass8BT.A0o(atomicInteger);
                r12.A00 = 0;
                if (r3 == null || (ee9 = r3.clientSecretKey_) == null) {
                    l = null;
                } else {
                    l = C17880vN.A0n(ee9.size());
                }
                r12.A05 = l;
                r12.A01 = Integer.valueOf(i2);
                r62.A02.CC7(r12);
                AnonymousClass12D r13 = this.A05;
                if (r13 == null) {
                    return;
                }
                if (r3 != null) {
                    r13.Bp4(new AnonymousClass8nK(r3));
                    return;
                }
                throw C17880vN.A0g();
            }
        } else if (r1 instanceof AnonymousClass8nL) {
            AnonymousClass8nL r14 = (AnonymousClass8nL) r1;
            A02(r14.A00, r14.A01, i2, this.A01);
        } else if (r1 instanceof AnonymousClass8nN) {
            StringBuilder A113 = AnonymousClass000.A11("ClientIplsSecretKeyProvider.fetchKeyTask/");
            A113.append(this.A08);
            C17890vO.A1A(A113, "/processResult: failed for the first time");
            A01((AnonymousClass8XJ) null, i2);
        }
    }

    public C21465AkW(AnonymousClass1UK r1, AnonymousClass1UW r2, C33791jO r3, AnonymousClass12D r4, C33811jQ r5, AnonymousClass18K r6, String str, AtomicInteger atomicInteger, int i, long j) {
        this.A08 = str;
        this.A09 = atomicInteger;
        this.A05 = r4;
        this.A04 = r3;
        this.A03 = r2;
        this.A06 = r5;
        this.A07 = r6;
        this.A00 = i;
        this.A01 = j;
        this.A02 = r1;
    }

    private final void A01(AnonymousClass8XJ r5, int i) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ClientIplsSecretKeyProvider.fetchKeyTask/");
        A10.append(this.A08);
        C17890vO.A1A(A10, "/send put request");
        byte[] bArr = new byte[32];
        C22691Cv.A00().nextBytes(bArr);
        String A14 = C108955ca.A14(bArr);
        C33791jO r1 = this.A04;
        C18070vi.A0b(A14);
        Object obj = r1.A02(C179329Hn.PUT, r5, A14).get(40000, TimeUnit.MILLISECONDS);
        C18070vi.A0X(obj);
        A00((AnonymousClass9MD) obj, i);
    }

    /* JADX WARNING: type inference failed for: r0v12, types: [java.lang.Object, X.2Rh] */
    private final void A02(Long l, String str, int i, long j) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ClientIplsSecretKeyProvider.fetchKeyTask/");
        String str2 = this.A08;
        A10.append(str2);
        C17900vP.A0f("/processResult: failed with error ", str, A10);
        AtomicInteger atomicInteger = this.A09;
        int i2 = atomicInteger.get();
        int i3 = i;
        long j2 = j;
        if (i2 < 10) {
            long convert = TimeUnit.MILLISECONDS.convert((long) Math.pow(2.0d, (double) i2), TimeUnit.SECONDS);
            StringBuilder A0o = AnonymousClass8BW.A0o("ClientIplsSecretKeyProvider.fetchKeyTask/", str2);
            A0o.append("/processResult: ");
            A0o.append(convert);
            C17890vO.A1A(A0o, " for the new retry");
            C33811jQ r7 = this.A06;
            AnonymousClass12D r6 = this.A05;
            C33791jO r5 = this.A04;
            r7.A05(new C21465AkW(this.A02, this.A03, r5, r6, r7, this.A07, str2, atomicInteger, i3, j2), convert);
            return;
        }
        AnonymousClass1UK r52 = this.A02;
        long time = new Date().getTime();
        C171258rQ r1 = new C171258rQ();
        r1.A03 = Long.valueOf(j2);
        r1.A02 = Long.valueOf(time);
        r1.A04 = AnonymousClass8BT.A0o(atomicInteger);
        r1.A00 = C17880vN.A0h();
        r1.A06 = String.valueOf(l);
        r1.A01 = Integer.valueOf(i3);
        r52.A02.CC7(r1);
        C17890vO.A1A(AnonymousClass8BW.A0o("ClientIplsSecretKeyProvider.fetchKeyTask/", str2), "/processResult: failed after max retries");
        atomicInteger.set(0);
        AnonymousClass12D r12 = this.A05;
        if (r12 != null) {
            r12.Bp4(new Object());
        }
    }
}
