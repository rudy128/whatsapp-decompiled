package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.whatsapp.WaFrameLayout;
import com.whatsapp.gallery.LinksGalleryFragment;
import java.util.Calendar;
import java.util.List;

/* renamed from: X.407  reason: invalid class name */
public class AnonymousClass407 extends AnonymousClass3XJ implements AnonymousClass8AZ {
    public final /* synthetic */ LinksGalleryFragment A00;

    public AnonymousClass407(LinksGalleryFragment linksGalleryFragment) {
        this.A00 = linksGalleryFragment;
    }

    public int BPU(int i) {
        return ((C147397Sz) this.A00.A0L.get(i)).bucketCount;
    }

    public int BSM() {
        return this.A00.A0L.size();
    }

    public long BSN(int i) {
        return -((Calendar) this.A00.A0L.get(i)).getTimeInMillis();
    }

    public /* bridge */ /* synthetic */ void Bma(C42011xT r3, int i) {
        List list = C42011xT.A0I;
        ((C73983Yb) r3).A00.setText(this.A00.A0L.get(i).toString());
    }

    public /* bridge */ /* synthetic */ C42011xT BqT(ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        View inflate = LayoutInflater.from(context).inflate(2131625961, viewGroup, false);
        inflate.setClickable(false);
        inflate.setBackgroundColor(AnonymousClass3Ma.A00(context, 2130969988, 2131101073));
        return new C73983Yb(inflate);
    }

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        View inflate = LayoutInflater.from(context).inflate(2131625815, viewGroup, false);
        ((FrameLayout) inflate.findViewById(2131432020)).setForeground(C24261Jm.A00(context, 2131232942));
        ImageView A0H = AnonymousClass3MW.A0H(inflate, 2131429091);
        LinksGalleryFragment linksGalleryFragment = this.A00;
        AnonymousClass3NL.A01(context, A0H, linksGalleryFragment.A05, 2131231228);
        ((WaFrameLayout) inflate.findViewById(2131431007)).setForeground(linksGalleryFragment.A01.BS0(AnonymousClass00R.A00, 2, false));
        return new C74253Zc(inflate, linksGalleryFragment);
    }

    public /* bridge */ /* synthetic */ boolean C6y(MotionEvent motionEvent, C42011xT r3, int i) {
        return false;
    }
}
