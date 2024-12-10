package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.webpagepreview.WebPagePreviewView;

/* renamed from: X.4qh  reason: invalid class name and case insensitive filesystem */
public final class C98174qh implements AnonymousClass3M2 {
    public final Context A00;
    public final WebPagePreviewView A01;
    public final boolean A02;
    public final Bitmap[] A03;
    public final int A04;
    public final int A05;
    public final C80033wR A06;
    public final boolean A07;

    public C98174qh(Context context, C80033wR r3, WebPagePreviewView webPagePreviewView, Bitmap[] bitmapArr, int i, int i2, boolean z, boolean z2) {
        C18070vi.A0d(context, 1);
        this.A00 = context;
        this.A01 = webPagePreviewView;
        this.A02 = z;
        this.A05 = i;
        this.A04 = i2;
        this.A03 = bitmapArr;
        this.A06 = r3;
        this.A07 = z2;
    }

    public int BZK() {
        return 0;
    }

    public /* synthetic */ void BuW() {
    }

    public void CMa(Bitmap bitmap, View view, AnonymousClass206 r10) {
        int[] A002;
        C18070vi.A0d(r10, 2);
        C693536w A003 = C60502o8.A00(r10);
        if (A003 != null) {
            A002 = A00(A003.A01, A003.A00);
        } else if (this.A07 && bitmap != null) {
            int min = Math.min(bitmap.getWidth(), bitmap.getHeight());
            A002 = A00(min, min);
        } else {
            return;
        }
        int i = A002[0];
        int i2 = A002[1];
        WebPagePreviewView webPagePreviewView = this.A01;
        boolean z = this.A02;
        if (z) {
            ViewGroup.LayoutParams layoutParams = webPagePreviewView.A05.getLayoutParams();
            layoutParams.width = i;
            layoutParams.height = i2;
            webPagePreviewView.A05.setLayoutParams(layoutParams);
        } else {
            webPagePreviewView.A0M(i, i2);
        }
        if (bitmap != null) {
            webPagePreviewView.A0N(bitmap, z);
            if (z) {
                this.A03[0] = bitmap;
                return;
            }
            return;
        }
        int A004 = AnonymousClass3Ma.A00(this.A00, 2130970830, 2131102245);
        if (z) {
            webPagePreviewView.setVideoLargeThumbWithBackground(A004);
        } else {
            webPagePreviewView.setImageLargeThumbWithBackground(A004);
        }
    }

    public /* synthetic */ void CN4(View view) {
    }

    private final int[] A00(int i, int i2) {
        C80033wR r1 = this.A06;
        r1.A05(i, i2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        Pair A032 = r1.A03(makeMeasureSpec, makeMeasureSpec);
        int A0M = (AnonymousClass000.A0M(A032.first) - this.A04) - this.A05;
        Object obj = A032.second;
        C18070vi.A0W(obj);
        Object obj2 = A032.first;
        C18070vi.A0W(obj2);
        return new int[]{A0M, (AnonymousClass000.A0M(obj) * A0M) / AnonymousClass000.A0M(obj2)};
    }
}
