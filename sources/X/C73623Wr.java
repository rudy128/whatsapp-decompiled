package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.List;

/* renamed from: X.3Wr  reason: invalid class name and case insensitive filesystem */
public final class C73623Wr extends C38391rD {
    public final AnonymousClass3V2 A00;

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r15, int i) {
        C18070vi.A0d(r15, 0);
        AnonymousClass77E r1 = (AnonymousClass77E) AnonymousClass3MW.A10(AnonymousClass3V2.A00(this.A00)).get(i);
        C18070vi.A0d(r1, 1);
        View view = r15.A0H;
        Resources A0Y = AnonymousClass000.A0Y(view);
        int dimensionPixelSize = A0Y.getDimensionPixelSize(2131167733);
        int dimensionPixelSize2 = A0Y.getDimensionPixelSize(2131167732);
        AnonymousClass775 r3 = r1.A00;
        if (r3 != null) {
            Bitmap bitmap = r3.A00;
            if (bitmap == null) {
                String str = r3.A01;
                if (str != null) {
                    byte[] decode = Base64.decode(str, 0);
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    int length = decode.length;
                    BitmapFactory.decodeByteArray(decode, 0, length, options);
                    float max = ((float) Math.max(options.outWidth, options.outHeight)) / ((float) dimensionPixelSize);
                    if (max < 1.0f) {
                        max = 1.0f;
                    }
                    int ceil = (int) ((float) Math.ceil((double) max));
                    options.inSampleSize = ceil;
                    options.inJustDecodeBounds = false;
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, length, options);
                    bitmap = Bitmap.createBitmap(decodeByteArray.getWidth(), decodeByteArray.getHeight(), Bitmap.Config.ARGB_8888);
                    C18070vi.A0X(bitmap);
                    Canvas canvas = new Canvas(bitmap);
                    Paint A07 = AnonymousClass3Ma.A07();
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    A07.setShader(new BitmapShader(decodeByteArray, tileMode, tileMode));
                    float f = (float) (dimensionPixelSize2 / ceil);
                    canvas.drawRoundRect(new RectF(0.0f, 0.0f, (float) decodeByteArray.getWidth(), (float) decodeByteArray.getHeight()), f, f, A07);
                    synchronized (r3) {
                        r3.A00 = bitmap;
                        r3.A01 = null;
                    }
                } else {
                    return;
                }
            }
            BitmapDrawable bitmapDrawable = new BitmapDrawable(A0Y, bitmap);
            AnonymousClass1Y5.A09(view, false);
            ImageView imageView = (ImageView) view;
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof TransitionDrawable) {
                drawable = ((LayerDrawable) drawable).getDrawable(1);
            }
            if (drawable != null) {
                TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable, bitmapDrawable});
                imageView.setImageDrawable(transitionDrawable);
                transitionDrawable.startTransition(200);
                return;
            }
            imageView.setImageDrawable(bitmapDrawable);
        }
    }

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        LayoutInflater A0K = C72463Mc.A0K(viewGroup, 0);
        if (i == 1) {
            List list = C42011xT.A0I;
            return new C42011xT(AnonymousClass3MX.A0B(A0K, viewGroup, 2131626058, false));
        }
        throw AnonymousClass001.A13("Invalid view type: ", AnonymousClass000.A10(), i);
    }

    public int A0Q() {
        return AnonymousClass3MW.A10(AnonymousClass3V2.A00(this.A00)).size();
    }

    public int getItemViewType(int i) {
        C108725cC A0T = this.A00.A0T();
        if (A0T == null) {
            return 0;
        }
        return A0T.Baw();
    }

    public C73623Wr(AnonymousClass3V2 r1) {
        this.A00 = r1;
    }
}
