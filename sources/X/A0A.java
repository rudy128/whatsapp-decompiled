package X;

import android.os.CancellationSignal;
import android.os.SystemClock;
import android.util.Base64;
import com.whatsapp.jid.PhoneUserJid;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class A0A {
    public final AnonymousClass11S A00;
    public final C27341Vs A01;
    public final C27351Vt A02;
    public final AnonymousClass00H A03;
    public final C23651Hc A04;
    public final AnonymousClass11P A05;

    public static void A00(CancellationSignal cancellationSignal, CountDownLatch countDownLatch) {
        long elapsedRealtime = SystemClock.elapsedRealtime() + C20113A7w.A0L;
        while (true) {
            cancellationSignal.throwIfCanceled();
            if (countDownLatch.getCount() != 0 && SystemClock.elapsedRealtime() <= elapsedRealtime) {
                countDownLatch.await(500, TimeUnit.MILLISECONDS);
            } else {
                return;
            }
        }
    }

    public C187719gG A01(CancellationSignal cancellationSignal, String str, String str2, String str3) {
        byte[] bArr;
        AnonymousClass11S r11 = this.A00;
        PhoneUserJid A002 = AnonymousClass11S.A00(r11);
        if (A002 != null) {
            byte[] decode = Base64.decode(str2, 2);
            byte[] decode2 = Base64.decode(str3, 2);
            CountDownLatch countDownLatch = new CountDownLatch(1);
            String str4 = str;
            this.A01.A00(new C70573Bq(countDownLatch, 28), str4, decode2, decode);
            try {
                A00(cancellationSignal, countDownLatch);
                if (countDownLatch.getCount() <= 0) {
                    PhoneUserJid A003 = AnonymousClass11S.A00(r11);
                    if (A003 == null) {
                        throw new AnonymousClass9HZ(301, "User was logged out while waiting for encryption key.");
                    } else if (A003.equals(A002)) {
                        C190569lA A012 = this.A02.A01(new C191279mJ(str4, new byte[0], decode2, decode, new byte[0]));
                        if (A012 != null) {
                            if (A012.A00 == 547) {
                                throw new C173668vV((int) AnonymousClass74N.A03, "Needs sms verification.");
                            } else if (Arrays.equals(A012.A01, decode) && (bArr = A012.A02) != null) {
                                return new C187719gG(A003, str4, Base64.encodeToString(decode, 2), Base64.encodeToString(decode2, 2), Base64.encodeToString(bArr, 2), System.currentTimeMillis());
                            }
                        }
                        throw new C173668vV(101, "Key not found.");
                    } else {
                        throw new AnonymousClass9HZ(301, "User changed while waiting for encryption key.");
                    }
                } else if (!this.A04.A02()) {
                    throw new C173668vV(102, "Not connected to server, cannot fetch keys.");
                } else {
                    throw new C173668vV(103, "Failed to fetch keys, timed out.");
                }
            } catch (InterruptedException e) {
                throw new C173668vV("Failed to fetch keys, interrupted.", (Throwable) e);
            }
        } else {
            throw new AnonymousClass9HZ(301, "Cannot fetch encryption key when user is not logged in.");
        }
    }

    public A0A(AnonymousClass11S r1, C23651Hc r2, C27341Vs r3, AnonymousClass11P r4, C27351Vt r5, AnonymousClass00H r6) {
        this.A05 = r4;
        this.A00 = r1;
        this.A03 = r6;
        this.A02 = r5;
        this.A04 = r2;
        this.A01 = r3;
    }
}
