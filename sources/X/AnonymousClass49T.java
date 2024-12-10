package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;
import java.lang.ref.WeakReference;

/* renamed from: X.49T  reason: invalid class name */
public final class AnonymousClass49T extends A34 {
    public final float A00;
    public final int A01;
    public final AnonymousClass1VW A02;
    public final C27191Vc A03;
    public final C27171Va A04;
    public final AnonymousClass1E7 A05;
    public final AnonymousClass1PU A06;
    public final WeakReference A07;
    public final WeakReference A08;

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        View view = (View) this.A08.get();
        if (view == null) {
            return null;
        }
        C27191Vc r3 = this.A03;
        Context context = view.getContext();
        AnonymousClass1E7 r5 = this.A05;
        int i = this.A01;
        float f = this.A00;
        Bitmap A042 = r3.A04(context, r5, "BaseConversationTitle.doInBackground", f, i, false);
        if (A042 == null) {
            return this.A04.A00(AnonymousClass3MY.A04(view), r5, f, i);
        }
        return A042;
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        ImageView imageView = (ImageView) this.A08.get();
        if (imageView != null) {
            if (bitmap == null) {
                AnonymousClass1VW r3 = this.A02;
                Context A042 = AnonymousClass3MY.A04(imageView);
                AnonymousClass1E7 r0 = this.A05;
                int A022 = r3.A02(r0);
                int i = this.A01;
                bitmap = r3.A04(A042, AnonymousClass1VW.A01(r0.A0J), this.A00, A022, i);
            }
            imageView.setImageBitmap(bitmap);
            if ((imageView instanceof WDSProfilePhoto) && this.A00 == -2.14748365E9f) {
                ((WDSProfilePhoto) imageView).setProfilePhotoShape(C39201sg.SQUIRCLE);
            }
            AnonymousClass4LA r02 = (AnonymousClass4LA) this.A07.get();
            if (r02 != null) {
                r02.A00.A0B();
            }
        }
    }

    public AnonymousClass49T(ImageView imageView, AnonymousClass1VW r4, C27191Vc r5, C27171Va r6, AnonymousClass4LA r7, AnonymousClass1E7 r8, AnonymousClass1PU r9) {
        float dimension;
        this.A02 = r4;
        this.A06 = r9;
        this.A04 = r6;
        this.A03 = r5;
        this.A05 = r8;
        this.A07 = AnonymousClass3MW.A0z(r7);
        this.A08 = AnonymousClass3MW.A0z(imageView);
        this.A01 = AnonymousClass000.A0Y(imageView).getDimensionPixelSize(2131166219);
        AnonymousClass1PU r1 = this.A06;
        C42941yz r0 = AnonymousClass1EC.A01;
        if (r1.A03(C42941yz.A00(r8.A0J))) {
            dimension = -2.14748365E9f;
        } else {
            dimension = AnonymousClass000.A0Y(imageView).getDimension(2131168737);
        }
        this.A00 = dimension;
    }
}
