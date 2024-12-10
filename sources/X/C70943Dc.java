package X;

import android.content.Context;
import android.view.ViewConfiguration;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: X.3Dc  reason: invalid class name and case insensitive filesystem */
public class C70943Dc implements C18140vp {
    public final int A00;
    public final Object A01;

    public C70943Dc(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: type inference failed for: r2v6, types: [X.1F0, java.lang.Object] */
    public final Object get() {
        switch (this.A00) {
            case 0:
                return Integer.valueOf(C18020vd.A00(C18040vf.A02, (C18020vd) this.A01, 8162));
            case 1:
                AnonymousClass1H5 r1 = (AnonymousClass1H5) this.A01;
                C18070vi.A0d(r1, 0);
                return Boolean.valueOf(C18020vd.A05(C18040vf.A02, r1.A01, 8084));
            case 2:
                AnonymousClass1H5 r12 = (AnonymousClass1H5) this.A01;
                C18070vi.A0d(r12, 0);
                return Boolean.valueOf(C18020vd.A05(C18040vf.A01, r12.A01, 9331));
            case 3:
                return AnonymousClass1L7.A01((AnonymousClass1L7) this.A01);
            case 4:
                return C200710s.A00((AnonymousClass10I) this.A01);
            case 5:
                return ((C18010vc) this.A01).A05(C19830z4.A06);
            case 6:
                ? obj = new Object();
                C22551Ch r13 = ((C22601Cm) this.A01).A06;
                obj.A00 = r13.A01;
                obj.A01 = r13.A02;
                return new AnonymousClass1F2(obj);
            case 7:
                return new C446724i((AnonymousClass1OS) this.A01);
            case 8:
                return Integer.valueOf(ViewConfiguration.get((Context) this.A01).getScaledTouchSlop());
            case 11:
                return new AnonymousClass2JZ((A48) ((AnonymousClass00H) this.A01).get());
            case 12:
                AnonymousClass1T4 r0 = (AnonymousClass1T4) this.A01;
                return r0.A00.BHv(r0.A01, new LinkedBlockingQueue(), 0, 1, 1, 60);
            case 13:
                C49302Py BHv = ((AnonymousClass10I) this.A01).BHv("FileDownloadQueue", new LinkedBlockingQueue(), 1, 1, 10, 5);
                BHv.allowCoreThreadTimeOut(true);
                return BHv;
            case 14:
                C49302Py BHv2 = ((AnonymousClass10I) this.A01).BHv("MediaUploadQueue", new LinkedBlockingQueue(), 10, 10, 1, 5);
                BHv2.allowCoreThreadTimeOut(true);
                return BHv2;
            case 15:
                return new C70583Br(this.A01, 34);
            case 16:
                return new C70583Br(this.A01, 38);
            case 17:
                int i = 3;
                if (((AnonymousClass1P3) this.A01).A0Y()) {
                    i = 1;
                }
                return Integer.valueOf(i);
            case 18:
                boolean A03 = C22781De.A03();
                AnonymousClass1DS r5 = (AnonymousClass1DS) ((AnonymousClass1CM) this.A01).A01.get();
                if (A03) {
                    return C22791Df.A00(r5);
                }
                C22801Dg r3 = new C22801Dg();
                boolean[] zArr = {true};
                if (r5.A08 != AnonymousClass1DS.A0A) {
                    r3.A0E(r5.A06());
                    zArr[0] = false;
                }
                r3.A0H(r5, new C91494fm(zArr, r3, 30));
                return r3;
            case 19:
                return ((AnonymousClass11C) this.A01).A07();
            case 20:
                Log.i("externalfilevalidator/initializing allowlist lazily");
                C218617r r4 = (C218617r) ((AnonymousClass1NL) this.A01).A01.get();
                HashSet A12 = C17880vN.A12();
                A12.add(r4.A0I());
                A12.add(r4.A0C());
                A12.add(r4.A0D());
                A12.add(r4.A0B());
                A12.add(r4.A0F());
                A12.add(r4.A0X("personal"));
                A12.add(r4.A0X("business"));
                A12.add(r4.A0E());
                File file = r4.A08().A0B;
                C218617r.A07(file, false);
                A12.add(file);
                A12.add(r4.A0G());
                Context context = r4.A01.A00;
                File A0e = C17880vN.A0e(context.getFilesDir(), "Gifs");
                C218617r.A07(A0e, false);
                A12.add(A0e);
                File A0e2 = C17880vN.A0e(context.getCacheDir(), "stickers_cache");
                C218617r.A07(A0e2, false);
                A12.add(A0e2);
                A12.add(r4.A08().A0A);
                A12.add(r4.A08().A08);
                A12.add(r4.A08().A09);
                A12.add(r4.A09());
                A12.add(r4.A0H());
                File A0e3 = C17880vN.A0e(context.getCacheDir(), "music_album_artwork");
                C218617r.A07(A0e3, false);
                A12.add(A0e3);
                if (r4.A00 != null && AnonymousClass112.A07()) {
                    if (C18020vd.A05(C18040vf.A02, r4.A02, 7735)) {
                        C60302nm.A01(r4.A00, A12);
                    }
                }
                return Collections.unmodifiableSet(A12);
            default:
                return ((AnonymousClass00H) this.A01).get();
        }
    }
}
