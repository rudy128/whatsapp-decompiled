package X;

import android.graphics.Bitmap;
import android.view.ViewTreeObserver;

/* renamed from: X.4eG  reason: invalid class name and case insensitive filesystem */
public class C90554eG implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass4LQ A01;
    public final /* synthetic */ AnonymousClass4aY A02;
    public final /* synthetic */ AnonymousClass206 A03;
    public final /* synthetic */ AnonymousClass205 A04;
    public final /* synthetic */ AnonymousClass4QM A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ Bitmap[] A08;

    public C90554eG(AnonymousClass4LQ r1, AnonymousClass4aY r2, AnonymousClass206 r3, AnonymousClass205 r4, AnonymousClass4QM r5, String str, String str2, Bitmap[] bitmapArr, int i) {
        this.A02 = r2;
        this.A01 = r1;
        this.A07 = str;
        this.A06 = str2;
        this.A04 = r4;
        this.A05 = r5;
        this.A00 = i;
        this.A08 = bitmapArr;
        this.A03 = r3;
    }

    public void onGlobalLayout() {
        AnonymousClass4aY r4 = this.A02;
        if (r4.A4e != null) {
            AnonymousClass3MY.A1D(r4.A4d, this);
            r4.A4d.setVisibility(0);
            int width = r4.A1M.getWidth();
            r4.A4e.CON(this.A01, r4.A4d, width);
            C108645c3 r3 = r4.A4e;
            String str = this.A07;
            String str2 = this.A06;
            AnonymousClass205 r6 = this.A04;
            AnonymousClass4QM r7 = this.A05;
            int i = this.A00;
            Bitmap[] bitmapArr = this.A08;
            r3.BL2(new C143887Fe(r4.A1T, r4.A3F, r4.A3T, str), this.A03, r6, r7, str, str2, bitmapArr, i);
        }
    }
}
