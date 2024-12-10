package X;

import android.graphics.Bitmap;
import com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel;
import com.whatsapp.filter.FilterUtils;
import com.whatsapp.util.Log;

/* renamed from: X.6LP  reason: invalid class name */
public class AnonymousClass6LP extends A34 {
    public final /* synthetic */ CallGridViewModel A00;

    public AnonymousClass6LP(CallGridViewModel callGridViewModel) {
        this.A00 = callGridViewModel;
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        Bitmap[] bitmapArr = (Bitmap[]) objArr;
        int length = bitmapArr.length;
        boolean A1R = C17890vO.A1R(length);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("OnCameraClosedBlurTask requires only 1 bitmap but received ");
        A10.append(length);
        C17960vV.A0F(A1R, AnonymousClass000.A0y(" bitmaps", A10));
        Bitmap bitmap = bitmapArr[0];
        if (bitmap != null) {
            int width = bitmap.getWidth() / 40;
            int i = 8;
            if (width >= 8) {
                i = Math.min(width, 16);
            }
            FilterUtils.A02(i, bitmap);
            return bitmap;
        }
        Log.i("voip/CallGridViewModel/cacheLastFrame no bitmap");
        return bitmap;
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (!C108945cZ.A1T(this)) {
            C41111vp r2 = this.A00.A0j;
            r2.A0F(new C134536qk(((C134536qk) r2.A06()).A00, bitmap));
        }
    }
}
