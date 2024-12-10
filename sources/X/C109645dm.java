package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import java.io.File;
import java.lang.ref.WeakReference;

/* renamed from: X.5dm  reason: invalid class name and case insensitive filesystem */
public final class C109645dm extends HandlerThread {
    public int A00;
    public long A01 = -1;
    public Handler A02;
    public AnonymousClass70T A03;
    public boolean A04;
    public boolean A05;
    public final Handler A06;
    public final AnonymousClass190 A07;
    public final AnonymousClass118 A08;
    public final C18030ve A09;
    public final AnonymousClass00H A0A;
    public final File A0B;
    public final WeakReference A0C;
    public final int A0D;
    public final AnonymousClass11P A0E;

    public static final int A00(C109645dm r6) {
        AnonymousClass70T r0 = r6.A03;
        if (r0 != null) {
            r6.A00 = Math.max(r6.A00, r0.A02());
        }
        int i = r6.A00;
        long j = r6.A01;
        if (j != -1) {
            return i + ((int) (SystemClock.elapsedRealtime() - j));
        }
        return i;
    }

    public static final void A01(C109645dm r5) {
        AnonymousClass70T r0 = r5.A03;
        if (r0 != null) {
            int A032 = r0.A03();
            int A002 = A00(r5);
            if (A032 > 0) {
                r5.A06.post(new AnonymousClass7RE(r5, A002, A032, 8));
            }
            Handler handler = r5.A02;
            if (handler != null) {
                handler.postDelayed(new AnonymousClass7RH((Object) r5, 27), (long) r5.A0D);
            }
        }
    }

    public static final void A02(C109645dm r8) {
        long j = r8.A01;
        if (j != -1) {
            r8.A00 += (int) (SystemClock.elapsedRealtime() - j);
            r8.A01 = -1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        if (r2.A05 != false) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(X.C109645dm r2) {
        /*
            boolean r0 = r2.A04
            if (r0 != 0) goto L_0x0009
            boolean r0 = r2.A05
            r1 = 1
            if (r0 == 0) goto L_0x000a
        L_0x0009:
            r1 = 0
        L_0x000a:
            X.70T r0 = r2.A03
            if (r0 == 0) goto L_0x0032
            if (r1 == 0) goto L_0x002f
            int r1 = A00(r2)     // Catch:{ IOException -> 0x0023 }
            X.70T r0 = r2.A03     // Catch:{ IOException -> 0x0023 }
            if (r0 == 0) goto L_0x001b
            r0.A0A(r1)     // Catch:{ IOException -> 0x0023 }
        L_0x001b:
            X.70T r0 = r2.A03     // Catch:{ IOException -> 0x0023 }
            if (r0 == 0) goto L_0x0032
            r0.A07()     // Catch:{ IOException -> 0x0023 }
            return
        L_0x0023:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            android.os.Handler r1 = r2.A06
            r0 = 26
            X.AnonymousClass7RH.A00(r1, r2, r0)
            return
        L_0x002f:
            r0.A04()
        L_0x0032:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C109645dm.A03(X.5dm):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109645dm(AnonymousClass190 r3, AnonymousClass11P r4, AnonymousClass118 r5, C18030ve r6, AnonymousClass6GX r7, AnonymousClass00H r8, File file) {
        super("VoiceStatusPlayerThread");
        C18070vi.A0s(r5, r6, r3, r4);
        C18070vi.A0d(r8, 6);
        this.A08 = r5;
        this.A09 = r6;
        this.A07 = r3;
        this.A0E = r4;
        this.A0A = r8;
        this.A0B = file;
        this.A0C = AnonymousClass3MW.A0z(r7);
        this.A06 = C17890vO.A0D();
        this.A0D = 16;
    }
}
