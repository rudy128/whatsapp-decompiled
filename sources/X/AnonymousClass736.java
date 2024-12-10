package X;

import android.content.Context;
import android.widget.ImageView;
import com.whatsapp.media.WamediaManager;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: X.736  reason: invalid class name */
public final class AnonymousClass736 {
    public static final AnonymousClass892 A0J = new C144487Hm();
    public AnonymousClass6L3 A00;
    public AnonymousClass4VT A01;
    public ThreadPoolExecutor A02;
    public final AnonymousClass190 A03;
    public final C131356kx A04;
    public final C218617r A05;
    public final AnonymousClass1KB A06;
    public final AnonymousClass181 A07;
    public final AnonymousClass1NM A08;
    public final AnonymousClass11P A09;
    public final AnonymousClass118 A0A;
    public final C18030ve A0B;
    public final AnonymousClass1D9 A0C;
    public final WamediaManager A0D;
    public final AnonymousClass10I A0E;
    public final AnonymousClass00H A0F;
    public final AnonymousClass00H A0G;
    public final boolean A0H;
    public volatile AnonymousClass6L3 A0I;

    public static AnonymousClass6L3 A00(AnonymousClass736 r3) {
        if (r3.A0I == null) {
            synchronized (r3) {
                if (r3.A0I == null) {
                    r3.A0I = r3.A04.A00("gif_content_obj_store", 32);
                }
            }
        }
        return r3.A0I;
    }

    public byte[] A03(String str) {
        AnonymousClass893 r0;
        if (this.A0H) {
            r0 = (AnonymousClass893) this.A0F.get();
        } else {
            AnonymousClass893 r02 = this.A00;
            r0 = r02;
            if (r02 == null) {
                AnonymousClass6L3 A002 = this.A04.A00("gif_preview_obj_store", 256);
                this.A00 = A002;
                r0 = A002;
            }
        }
        C128506gA BM6 = r0.BM6(str);
        if (BM6 != null) {
            return BM6.A02;
        }
        return null;
    }

    public AnonymousClass736(AnonymousClass190 r3, C131356kx r4, C218617r r5, AnonymousClass1KB r6, AnonymousClass181 r7, AnonymousClass1NM r8, AnonymousClass11P r9, AnonymousClass118 r10, C18030ve r11, AnonymousClass1D9 r12, WamediaManager wamediaManager, AnonymousClass10I r14, AnonymousClass00H r15, AnonymousClass00H r16) {
        this.A0A = r10;
        this.A04 = r4;
        this.A09 = r9;
        this.A0B = r11;
        this.A06 = r6;
        this.A03 = r3;
        this.A0E = r14;
        this.A05 = r5;
        this.A07 = r7;
        this.A0C = r12;
        this.A0D = wamediaManager;
        this.A08 = r8;
        this.A0G = r15;
        this.A0F = r16;
        this.A0H = C18020vd.A05(C18040vf.A02, r11, 1662);
    }

    public static ThreadPoolExecutor A01(AnonymousClass736 r8) {
        C17960vV.A02();
        ThreadPoolExecutor threadPoolExecutor = r8.A02;
        if (threadPoolExecutor != null) {
            return threadPoolExecutor;
        }
        C49302Py BHv = r8.A0E.BHv("GifCacheWorker", new LinkedBlockingQueue(), 4, 4, 10, 1);
        r8.A02 = BHv;
        return BHv;
    }

    public void A02(ImageView imageView, String str) {
        Context context = imageView.getContext();
        C17960vV.A02();
        AnonymousClass4VT r0 = this.A01;
        if (r0 == null) {
            File A0e = C17880vN.A0e(C108945cZ.A16(this.A0A), "GifsCache");
            if (!A0e.mkdirs() && !A0e.isDirectory()) {
                Log.w("gif/cache/unable to create gifs directory");
            }
            C86284Ra r3 = new C86284Ra(this.A06, this.A07, this.A0C, this.A0E, A0e, "gif-cache");
            r3.A00 = context.getResources().getDimensionPixelSize(2131166917);
            r0 = r3.A00();
            this.A01 = r0;
        }
        r0.A03(imageView, str);
    }
}
