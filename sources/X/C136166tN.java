package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.provider.MediaStore;
import java.util.ArrayList;

/* renamed from: X.6tN  reason: invalid class name and case insensitive filesystem */
public class C136166tN {
    public boolean A00;
    public final Handler A01;
    public final C25131Mz A02;
    public final ArrayList A03 = AnonymousClass000.A13();
    public final AnonymousClass11C A04;
    public final Thread A05;

    public void A00() {
        ArrayList arrayList = this.A03;
        synchronized (arrayList) {
            this.A00 = true;
            arrayList.notifyAll();
        }
        C1403471a A012 = C1403471a.A01();
        Thread thread = this.A05;
        AnonymousClass11B A0O = this.A04.A0O();
        synchronized (A012) {
            C132376mg A002 = C1403471a.A00(A012, thread);
            A002.A00 = 0;
            BitmapFactory.Options options = A002.A01;
            if (options != null) {
                options.requestCancelDecode();
            }
            A012.notifyAll();
            synchronized (A002) {
                if (A002.A02) {
                    MediaStore.Images.Thumbnails.cancelThumbnailRequest(A0O.A00, -1, thread.getId());
                    MediaStore.Video.Thumbnails.cancelThumbnailRequest(A0O.A00, -1, thread.getId());
                }
            }
        }
        thread.interrupt();
    }

    public void A01(AnonymousClass891 r4) {
        if (r4 != null) {
            ArrayList arrayList = this.A03;
            synchronized (arrayList) {
                int i = 0;
                while (true) {
                    if (i >= arrayList.size()) {
                        break;
                    } else if (((C127296e7) arrayList.get(i)).A00 != r4) {
                        i++;
                    } else if (i >= 0) {
                        arrayList.remove(i);
                    }
                }
            }
        }
    }

    public void A02(AnonymousClass891 r4, C1606889n r5) {
        C17960vV.A0F(!this.A05.isInterrupted(), "Thumb loader reused after destroy");
        Bitmap bitmap = (Bitmap) this.A02.A0A(r4.Ba8());
        if (bitmap != null) {
            r5.C7F(bitmap, true);
            return;
        }
        r5.BCw();
        ArrayList arrayList = this.A03;
        synchronized (arrayList) {
            arrayList.add(new C127296e7(r4, r5));
            arrayList.notifyAll();
        }
    }

    public C136166tN(Handler handler, C24771Lp r4, AnonymousClass11C r5, String str) {
        this.A04 = r5;
        this.A01 = handler;
        this.A02 = r4.A05();
        this.A00 = false;
        Thread thread = new Thread(C146747Ql.A00(this, 46), str);
        this.A05 = thread;
        thread.start();
    }
}
