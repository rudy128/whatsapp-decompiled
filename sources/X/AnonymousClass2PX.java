package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* renamed from: X.2PX  reason: invalid class name */
public class AnonymousClass2PX extends A34 {
    public final AnonymousClass1VW A00;
    public final C23481Gl A01;
    public final C27191Vc A02;
    public final C27171Va A03;
    public final AnonymousClass1E7 A04;
    public final WeakReference A05;

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        View view = (View) this.A05.get();
        if (view == null) {
            return null;
        }
        C27191Vc r3 = this.A02;
        Context context = view.getContext();
        AnonymousClass1E7 r5 = this.A04;
        Bitmap A042 = r3.A04(context, r5, "ContactPhotos.doInBackground", -1.0f, 96, true);
        if (A042 == null && (A042 = this.A03.A00(view.getContext(), r5, -1.0f, 96)) == null) {
            AnonymousClass1VW r8 = this.A00;
            A042 = r8.A04(view.getContext(), AnonymousClass1VW.A01(r5.A0J), -1.0f, r8.A02(r5), 96);
        }
        C23481Gl r0 = this.A01;
        if (r0 == null) {
            return A042;
        }
        r0.A00 = A042;
        return A042;
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        ImageView imageView = (ImageView) this.A05.get();
        if (imageView != null && bitmap != null) {
            imageView.setImageBitmap(bitmap);
            imageView.setVisibility(0);
        }
    }

    public AnonymousClass2PX(ImageView imageView, AnonymousClass1VW r3, C23481Gl r4, C27191Vc r5, C27171Va r6, AnonymousClass1E7 r7) {
        this.A00 = r3;
        this.A03 = r6;
        this.A02 = r5;
        this.A04 = r7;
        this.A05 = new WeakReference(imageView);
        this.A01 = r4;
    }
}
