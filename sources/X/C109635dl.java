package X;

import android.media.AudioRecord;
import android.os.Handler;
import android.os.HandlerThread;
import com.whatsapp.util.OpusRecorder;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.ref.WeakReference;

/* renamed from: X.5dl  reason: invalid class name and case insensitive filesystem */
public final class C109635dl extends HandlerThread {
    public float A00;
    public int A01;
    public long A02;
    public Handler A03;
    public AnonymousClass72K A04;
    public final long A05;
    public final Handler A06 = C17890vO.A0D();
    public final C18030ve A07;
    public final C133016o2 A08;
    public final WeakReference A09;
    public final AnonymousClass11P A0A;

    public static final void A00(C109635dl r3, boolean z) {
        File file;
        File A032;
        AnonymousClass72K r2 = r3.A04;
        if (r2 != null) {
            try {
                C18100vl r1 = r2.A0D;
                ((OpusRecorder) r1.getValue()).stop();
                r2.A01 = ((OpusRecorder) r1.getValue()).getPageNumber();
                r2.A05();
                if (AnonymousClass72K.A01(r2)) {
                    FileOutputStream fileOutputStream = r2.A0L;
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    } else {
                        throw C17880vN.A0g();
                    }
                }
                if (z) {
                    AnonymousClass72K r0 = r3.A04;
                    if (!(r0 == null || (A032 = r0.A03()) == null)) {
                        A032.delete();
                    }
                    AnonymousClass72K r02 = r3.A04;
                    if (!(r02 == null || (file = (File) r02.A0E.getValue()) == null)) {
                        file.delete();
                    }
                }
                AnonymousClass72K.A00(r2).close();
                ((AudioRecord) r2.A09.getValue()).release();
            } catch (Throwable th) {
                C30691eM.A00(th);
            }
            r3.A04 = null;
            r3.quit();
            r3.interrupt();
        }
    }

    public final void A01() {
        if (this.A03 == null) {
            start();
            Handler handler = new Handler(getLooper());
            this.A03 = handler;
            handler.post(AnonymousClass7RC.A00(this, 5));
            handler.postDelayed(AnonymousClass7RC.A00(this, 6), 16);
            handler.post(AnonymousClass7RC.A00(this, 7));
            handler.postDelayed(AnonymousClass7RC.A00(this, 8), this.A05);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109635dl(AnonymousClass11P r2, C18030ve r3, C145827Mt r4, C133016o2 r5, long j) {
        super("VoiceStatusRecorderThread");
        C18070vi.A0o(r2, r3, r5);
        this.A0A = r2;
        this.A07 = r3;
        this.A08 = r5;
        this.A05 = j;
        this.A09 = AnonymousClass3MW.A0z(r4);
    }
}
