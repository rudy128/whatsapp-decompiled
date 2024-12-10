package X;

import android.graphics.Bitmap;
import android.view.View;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.whatsapp.reels.ReelsPreviewView;

/* renamed from: X.7My  reason: invalid class name and case insensitive filesystem */
public class C145877My implements C108315bU {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C145877My(Object obj, Object obj2, Object obj3, int i) {
        this.A00 = i;
        this.A01 = obj3;
        this.A03 = obj;
        this.A02 = obj2;
    }

    public void Bwt() {
        if (this.A00 != 0) {
            C108945cZ.A1Q(this.A01);
            ((ReelsPreviewView) this.A03).A02();
            return;
        }
        ((ShimmerFrameLayout) this.A03).A05((CUR) null);
        ((View) this.A02).setVisibility(0);
    }

    public void C8b(Bitmap bitmap) {
        if (this.A00 != 0) {
            C18070vi.A0d(bitmap, 0);
            ReelsPreviewView reelsPreviewView = (ReelsPreviewView) this.A03;
            reelsPreviewView.A03();
            C108945cZ.A1Q(this.A02);
            reelsPreviewView.getImageThumbView().setVisibility(0);
            reelsPreviewView.getImageThumbView().setImageBitmap(bitmap);
            return;
        }
        ((ShimmerFrameLayout) this.A03).A05((CUR) null);
    }

    public void C8a() {
    }
}
