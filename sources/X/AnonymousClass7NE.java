package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.WaImageView;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.search.views.MessageThumbView;
import com.whatsapp.util.Log;

/* renamed from: X.7NE  reason: invalid class name */
public class AnonymousClass7NE implements AnonymousClass3M2 {
    public final int A00;
    public final Object A01;

    public AnonymousClass7NE(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void A00(Bitmap bitmap) {
        ImageView imageView = (ImageView) this.A01;
        Drawable drawable = imageView.getDrawable();
        BitmapDrawable A05 = C108965cb.A05(bitmap, imageView);
        if (drawable == null || (drawable instanceof ColorDrawable)) {
            imageView.setImageDrawable(A05);
            return;
        }
        Drawable[] drawableArr = new Drawable[2];
        AnonymousClass001.A1Q(drawable, A05, drawableArr);
        TransitionDrawable transitionDrawable = new TransitionDrawable(drawableArr);
        imageView.setImageDrawable(transitionDrawable);
        transitionDrawable.startTransition(150);
    }

    public int BZK() {
        Resources A0Y;
        int i;
        switch (this.A00) {
            case 0:
                return 0;
            case 1:
                A0Y = AnonymousClass000.A0Y(((C1407773a) this.A01).A0E);
                i = 2131166307;
                break;
            case 2:
                return 400;
            case 3:
                return ((View) this.A01).getWidth();
            default:
                A0Y = AnonymousClass3MW.A05((AnonymousClass118) this.A01);
                i = 2131168025;
                break;
        }
        return A0Y.getDimensionPixelSize(i);
    }

    public /* synthetic */ void BuW() {
        if (1 - this.A00 == 0) {
            Log.w("ConversationRowSticker/onFileReadError");
            ((C1407773a) this.A01).A01 = false;
        }
    }

    public void CMa(Bitmap bitmap, View view, AnonymousClass206 r8) {
        switch (this.A00) {
            case 0:
                if (bitmap != null) {
                    WaImageView waImageView = ((C133266oT) this.A01).A0D;
                    AnonymousClass3MW.A1R(waImageView);
                    waImageView.setImageBitmap(bitmap);
                    waImageView.setVisibility(0);
                    return;
                }
                return;
            case 1:
                if (bitmap == null || !(r8 instanceof AnonymousClass21V)) {
                    C1407773a r1 = (C1407773a) this.A01;
                    r1.A01 = false;
                    r1.A0E.setImageResource(2131233044);
                    return;
                }
                ((C1407773a) this.A01).A0E.setImageBitmap(bitmap);
                return;
            case 2:
                if (bitmap != null) {
                    float A02 = C28851b7.A02(((float) bitmap.getWidth()) / ((float) bitmap.getHeight()), 1.6f, 3.0f);
                    ThumbnailButton thumbnailButton = ((AnonymousClass6BF) this.A01).A0X;
                    thumbnailButton.getLayoutParams().height = (int) (C108945cZ.A03(thumbnailButton) / A02);
                    thumbnailButton.setVisibility(0);
                    thumbnailButton.setImageBitmap(bitmap);
                    return;
                }
                return;
            case 3:
                if (bitmap == null) {
                    MessageThumbView messageThumbView = (MessageThumbView) this.A01;
                    if (messageThumbView.A00 != 0) {
                        bitmap = BitmapFactory.decodeResource(messageThumbView.getResources(), messageThumbView.A00);
                    }
                }
                MessageThumbView messageThumbView2 = (MessageThumbView) this.A01;
                if (messageThumbView2.A01 > 0) {
                    A00(C26511Sk.A06(bitmap, (float) messageThumbView2.A01, messageThumbView2.getResources().getDimensionPixelSize(2131168564)));
                    return;
                }
                A00(bitmap);
                return;
            default:
                C18070vi.A0d(view, 0);
                if ((view instanceof ImageView) && bitmap != null) {
                    ((ImageView) view).setImageBitmap(bitmap);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ void CN4(View view) {
        switch (this.A00) {
            case 1:
                Log.w("ConversationRowSticker/showPlaceholder");
                C1407773a r1 = (C1407773a) this.A01;
                r1.A01 = false;
                r1.A0E.setImageResource(2131233044);
                return;
            case 3:
                ImageView imageView = (ImageView) this.A01;
                C108955ca.A1L(imageView, AnonymousClass3Ma.A01(imageView.getContext(), view.getResources(), 2130971098, 2131102425));
                return;
            default:
                return;
        }
    }
}
