package X;

import android.os.SystemClock;
import com.whatsapp.util.Log;

/* renamed from: X.1Ez  reason: invalid class name */
public final class AnonymousClass1Ez {
    public long A00;
    public long A01;
    public String A02;
    public boolean A03;
    public final boolean A04;

    public AnonymousClass1Ez(String str) {
        this(false);
        A05(str);
    }

    public final long A03(String str) {
        long uptimeMillis;
        C18070vi.A0d(str, 0);
        long j = this.A00;
        long j2 = this.A01;
        long j3 = 0;
        if (j2 != 0) {
            if (this.A04) {
                uptimeMillis = SystemClock.elapsedRealtime();
            } else {
                uptimeMillis = SystemClock.uptimeMillis();
            }
            j3 = uptimeMillis - j2;
        }
        long j4 = j + j3;
        if (this.A03) {
            StringBuilder sb = new StringBuilder();
            sb.append("timer/mark/");
            sb.append(str);
            sb.append(": ");
            sb.append(j4);
            A00(sb.toString());
        }
        return j4;
    }

    private final void A00(String str) {
        String str2 = this.A02;
        if (str2 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append('/');
            sb.append(str);
            str = sb.toString();
        }
        Log.i(str);
    }

    public final long A01() {
        long uptimeMillis;
        long j = this.A00;
        long j2 = this.A01;
        long j3 = 0;
        if (j2 != 0) {
            if (this.A04) {
                uptimeMillis = SystemClock.elapsedRealtime();
            } else {
                uptimeMillis = SystemClock.uptimeMillis();
            }
            j3 = uptimeMillis - j2;
        }
        long j4 = j + j3;
        if (this.A03) {
            StringBuilder sb = new StringBuilder();
            sb.append("timer/elapsed: ");
            sb.append(j4);
            A00(sb.toString());
        }
        return j4;
    }

    public final long A02() {
        long uptimeMillis;
        long j = this.A01;
        if (j != 0) {
            long j2 = this.A00;
            if (this.A04) {
                uptimeMillis = SystemClock.elapsedRealtime();
            } else {
                uptimeMillis = SystemClock.uptimeMillis();
            }
            long j3 = j2 + (uptimeMillis - j);
            this.A00 = j3;
            if (this.A03) {
                StringBuilder sb = new StringBuilder();
                sb.append("timer/stop: ");
                sb.append(j3);
                A00(sb.toString());
            }
            this.A01 = 0;
        }
        return this.A00;
    }

    public final void A04() {
        long uptimeMillis;
        if (this.A01 == 0) {
            if (this.A03) {
                A00("timer/start");
            }
            if (this.A04) {
                uptimeMillis = SystemClock.elapsedRealtime();
            } else {
                uptimeMillis = SystemClock.uptimeMillis();
            }
            this.A01 = uptimeMillis;
        }
    }

    public final void A05(String str) {
        this.A02 = str;
        this.A03 = true;
        A04();
    }

    public AnonymousClass1Ez(boolean z) {
        this.A04 = z;
    }

    public AnonymousClass1Ez() {
        this(false);
    }
}
