package X;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.mediacomposer.MediaComposerActivity;

/* renamed from: X.6kU  reason: invalid class name and case insensitive filesystem */
public class C131086kU {
    public float A00;
    public float A01;
    public Drawable A02;
    public Drawable A03;
    public Uri A04;
    public View A05;
    public View A06;
    public ViewGroup A07;
    public ViewGroup A08;
    public ImageView A09;
    public TextView A0A;
    public boolean A0B;
    public final Handler A0C = C17890vO.A0D();
    public final Runnable A0D = new AnonymousClass7RA((Object) this, 39);
    public final int[] A0E = C108945cZ.A1W();
    public final /* synthetic */ MediaComposerActivity A0F;

    public C131086kU(Activity activity, MediaComposerActivity mediaComposerActivity) {
        this.A0F = mediaComposerActivity;
        this.A03 = C24261Jm.A00(activity, 2131231823);
        this.A02 = AnonymousClass4aX.A02(activity, 2131231823, 2131100136);
        this.A08 = (ViewGroup) activity.findViewById(2131434487);
        this.A0A = (TextView) activity.findViewById(2131430179);
        this.A05 = activity.findViewById(2131430180);
        this.A07 = (ViewGroup) activity.findViewById(2131430172);
        C110765h3 r1 = new C110765h3(activity, this);
        this.A09 = r1;
        r1.setSelected(true);
        AnonymousClass3MW.A1R(this.A09);
        this.A07.addView(this.A09);
    }
}
