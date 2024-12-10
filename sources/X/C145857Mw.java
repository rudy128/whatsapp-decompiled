package X;

import android.graphics.Bitmap;
import com.whatsapp.reels.ReelsPreviewView;

/* renamed from: X.7Mw  reason: invalid class name and case insensitive filesystem */
public class C145857Mw implements C108315bU {
    public final int A00;
    public final Object A01;

    public C145857Mw(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void Bwt() {
        switch (this.A00) {
            case 0:
                ((C139286ya) ((AnonymousClass6AT) this.A01).A09.get()).A05.getAndIncrement();
                return;
            case 1:
                ReelsPreviewView.A01((Bitmap) null, (ReelsPreviewView) this.A01);
                return;
            default:
                C138146wb r0 = (C138146wb) this.A01;
                C138146wb.A00(r0.A00, r0.A01, r0.A02, "ImageFailed");
                return;
        }
    }

    public void C8a() {
        if (2 - this.A00 == 0) {
            C138146wb r0 = (C138146wb) this.A01;
            C138146wb.A00(r0.A00, r0.A01, r0.A02, "ImageRequested");
        }
    }

    public void C8b(Bitmap bitmap) {
        switch (this.A00) {
            case 0:
                C18070vi.A0d(bitmap, 0);
                AnonymousClass6AT r0 = (AnonymousClass6AT) this.A01;
                r0.A00 = bitmap;
                C139286ya r2 = (C139286ya) r0.A09.get();
                if (r2.A03 == null) {
                    r2.A03 = Long.valueOf(C139286ya.A00(r2));
                    return;
                }
                return;
            case 1:
                C18070vi.A0d(bitmap, 0);
                ReelsPreviewView.A01(bitmap, (ReelsPreviewView) this.A01);
                return;
            default:
                C138146wb r02 = (C138146wb) this.A01;
                C138146wb.A00(r02.A00, r02.A01, r02.A02, "ImageFinalRendered");
                return;
        }
    }
}
