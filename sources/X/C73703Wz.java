package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.WaDynamicRoundCornerImageView;
import com.whatsapp.settings.chat.wallpaper.SolidColorWallpaper;

/* renamed from: X.3Wz  reason: invalid class name and case insensitive filesystem */
public class C73703Wz extends C38391rD {
    public final Context A00;
    public final int[] A01;
    public final /* synthetic */ SolidColorWallpaper A02;

    public C73703Wz(Context context, SolidColorWallpaper solidColorWallpaper, int[] iArr) {
        this.A02 = solidColorWallpaper;
        this.A00 = context;
        this.A01 = iArr;
    }

    public long A0M(int i) {
        return (long) this.A01[i];
    }

    public int A0Q() {
        return this.A01.length;
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r4, int i) {
        C74063Yj r42 = (C74063Yj) r4;
        C73703Wz r1 = r42.A00;
        int i2 = r1.A01[i];
        View view = r42.A0H;
        view.setBackgroundColor(i2);
        AnonymousClass3MY.A0w(r1.A02, view, SolidColorWallpaper.A06[i]);
        C90104dX.A00(view, r42, i, 31);
    }

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        Context context = this.A00;
        WaDynamicRoundCornerImageView waDynamicRoundCornerImageView = new WaDynamicRoundCornerImageView(context);
        waDynamicRoundCornerImageView.A05();
        C38491rN r2 = new C38491rN(-1, -1);
        if (AnonymousClass1J8.A01(this.A02.A01)) {
            waDynamicRoundCornerImageView.setRadius(context.getResources().getDimension(2131169405));
            int round = Math.round(context.getResources().getDimension(2131169544));
            r2.setMargins(round, round, round, round);
        }
        waDynamicRoundCornerImageView.setLayoutParams(r2);
        return new C74063Yj(waDynamicRoundCornerImageView, this);
    }
}
