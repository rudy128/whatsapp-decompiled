package X;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.google.android.search.verification.client.SearchActionVerificationClientService;

/* renamed from: X.0N3  reason: invalid class name */
public class AnonymousClass0N3 {
    public static final int[] A02 = {16843067, 16843068};
    public Bitmap A00;
    public final ProgressBar A01;

    public Drawable A01(Drawable drawable, boolean z) {
        boolean z2;
        if (drawable instanceof AnonymousClass3LV) {
            AnonymousClass3LV r1 = (AnonymousClass3LV) drawable;
            Drawable Bbv = r1.Bbv();
            if (Bbv != null) {
                r1.CLU(A01(Bbv, z));
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i = 0; i < numberOfLayers; i++) {
                int id = layerDrawable.getId(i);
                Drawable drawable2 = layerDrawable.getDrawable(i);
                if (id != 16908301) {
                    z2 = false;
                    if (id != 16908303) {
                        drawableArr[i] = A01(drawable2, z2);
                    }
                }
                z2 = true;
                drawableArr[i] = A01(drawable2, z2);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                layerDrawable2.setId(i2, layerDrawable.getId(i2));
                if (Build.VERSION.SDK_INT >= 23) {
                    AnonymousClass0D9.A00(layerDrawable, layerDrawable2, i2);
                }
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.A00 == null) {
                this.A00 = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, (RectF) null, (float[]) null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            if (z) {
                return new ClipDrawable(shapeDrawable, 3, 1);
            }
            return shapeDrawable;
        }
        return drawable;
    }

    public void A02(AttributeSet attributeSet, int i) {
        ProgressBar progressBar = this.A01;
        C002401c A002 = C002401c.A00(progressBar.getContext(), attributeSet, A02, i, 0);
        Drawable A04 = A002.A04(0);
        if (A04 != null) {
            if (A04 instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) A04;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i2 = 0; i2 < numberOfFrames; i2++) {
                    Drawable A012 = A01(animationDrawable.getFrame(i2), true);
                    A012.setLevel(SearchActionVerificationClientService.NOTIFICATION_ID);
                    animationDrawable2.addFrame(A012, animationDrawable.getDuration(i2));
                }
                animationDrawable2.setLevel(SearchActionVerificationClientService.NOTIFICATION_ID);
                A04 = animationDrawable2;
            }
            progressBar.setIndeterminateDrawable(A04);
        }
        Drawable A042 = A002.A04(1);
        if (A042 != null) {
            progressBar.setProgressDrawable(A01(A042, false));
        }
        A002.A02.recycle();
    }

    public AnonymousClass0N3(ProgressBar progressBar) {
        this.A01 = progressBar;
    }
}
