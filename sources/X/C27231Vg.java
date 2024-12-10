package X;

import android.content.Context;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: X.1Vg  reason: invalid class name and case insensitive filesystem */
public class C27231Vg {
    public static final Uri A0D = Uri.parse("");
    public Handler A00;
    public AnonymousClass70T A01;
    public AnonymousClass00H A02;
    public Boolean A03 = null;
    public ExecutorService A04;
    public final C18030ve A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass118 A07;
    public final AnonymousClass10I A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass00H A0B;
    public final AnonymousClass00H A0C = C221618v.A00(AnonymousClass16P.class);

    public static synchronized ExecutorService A00(C27231Vg r8) {
        ExecutorService executorService;
        synchronized (r8) {
            executorService = r8.A04;
            if (executorService == null) {
                executorService = r8.A08.BHv("AsyncAudioPlayer", new LinkedBlockingQueue(), 0, 1, 0, 60);
                r8.A04 = executorService;
            }
        }
        return executorService;
    }

    public void A01() {
        if (this.A01 != null) {
            A00(this).submit(new AnonymousClass7RJ(this, 1));
        }
    }

    public void A02(Uri uri) {
        Handler handler;
        Uri uri2 = uri;
        if (uri.compareTo(A0D) != 0) {
            synchronized (this) {
                handler = this.A00;
                if (handler == null) {
                    handler = new C109595dh(Looper.getMainLooper(), this, 6);
                    this.A00 = handler;
                }
            }
            handler.removeMessages(99);
            handler.sendEmptyMessageDelayed(99, 10000);
            A01();
            if (!((AnonymousClass16P) this.A0C.get()).A00) {
                Context context = this.A07.A00;
                if (((C31111f2) this.A0A.get()).A00) {
                    AudioManager A0D2 = ((AnonymousClass11C) this.A0B.get()).A0D();
                    if (A0D2 == null || A0D2.getStreamVolume(5) > 0) {
                        A00(this).submit(new C146607Px(this, context, uri2, 3, 7));
                        return;
                    }
                    return;
                }
                ((AnonymousClass1KB) this.A09.get()).A0J(new AnonymousClass7RO(this, context, uri, 25));
            }
        }
    }

    public C27231Vg(AnonymousClass118 r3, C18030ve r4, AnonymousClass10I r5, AnonymousClass00H r6, AnonymousClass00H r7, AnonymousClass00H r8, AnonymousClass00H r9, AnonymousClass00H r10) {
        this.A07 = r3;
        this.A08 = r5;
        this.A05 = r4;
        this.A09 = r6;
        this.A0B = r7;
        this.A06 = r8;
        this.A0A = r9;
        this.A02 = r10;
    }
}
