package X;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderNode;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;

/* renamed from: X.BEq  reason: case insensitive filesystem */
public final class C22591BEq extends Canvas {
    public Canvas A00;

    public static void A00() {
        C18070vi.A11("nativeCanvas");
        throw null;
    }

    public boolean clipOutPath(Path path) {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.clipOutPath(path);
        }
        A00();
        throw null;
    }

    public boolean clipOutRect(float f, float f2, float f3, float f4) {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.clipOutRect(f, f2, f3, f4);
        }
        A00();
        throw null;
    }

    public boolean clipPath(Path path, Region.Op op) {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.clipPath(path, op);
        }
        A00();
        throw null;
    }

    public boolean clipRect(Rect rect, Region.Op op) {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.clipRect(rect, op);
        }
        A00();
        throw null;
    }

    public void concat(Matrix matrix) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            A00();
            throw null;
        } else {
            canvas.concat(matrix);
        }
    }

    public void disableZ() {
        Canvas canvas = this.A00;
        if (canvas == null) {
            A00();
            throw null;
        } else {
            canvas.disableZ();
        }
    }

    public void drawARGB(int i, int i2, int i3, int i4) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            A00();
            throw null;
        } else {
            canvas.drawARGB(i, i2, i3, i4);
        }
    }

    public void drawArc(float f, float f2, float f3, float f4, float f5, float f6, boolean z, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            A00();
            throw null;
        } else {
            canvas.drawArc(f, f2, f3, f4, f5, f6, z, paint);
        }
    }

    public void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            A00();
            throw null;
        } else {
            canvas.drawBitmap(bitmap, matrix, paint);
        }
    }

    public void drawBitmapMesh(Bitmap bitmap, int i, int i2, float[] fArr, int i3, int[] iArr, int i4, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            A00();
            throw null;
        } else {
            canvas.drawBitmapMesh(bitmap, i, i2, fArr, i3, iArr, i4, paint);
        }
    }

    public void drawCircle(float f, float f2, float f3, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            A00();
            throw null;
        } else {
            canvas.drawCircle(f, f2, f3, paint);
        }
    }

    public void drawColor(int i, BlendMode blendMode) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            A00();
            throw null;
        } else {
            canvas.drawColor(i, blendMode);
        }
    }

    public void drawDoubleRoundRect(RectF rectF, float f, float f2, RectF rectF2, float f3, float f4, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            A00();
            throw null;
        } else {
            canvas.drawDoubleRoundRect(rectF, f, f2, rectF2, f3, f4, paint);
        }
    }

    public void drawGlyphs(int[] iArr, int i, float[] fArr, int i2, int i3, Font font, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            A00();
            throw null;
        } else {
            canvas.drawGlyphs(iArr, i, fArr, i2, i3, font, paint);
        }
    }

    public void drawLine(float f, float f2, float f3, float f4, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            A00();
            throw null;
        } else {
            canvas.drawLine(f, f2, f3, f4, paint);
        }
    }

    public void drawLines(float[] fArr, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            A00();
            throw null;
        } else {
            canvas.drawLines(fArr, paint);
        }
    }

    public void drawOval(RectF rectF, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            A00();
            throw null;
        } else {
            canvas.drawOval(rectF, paint);
        }
    }

    public void drawPaint(Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            A00();
            throw null;
        } else {
            canvas.drawPaint(paint);
        }
    }

    public void drawPatch(NinePatch ninePatch, Rect rect, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            A00();
            throw null;
        } else {
            canvas.drawPatch(ninePatch, rect, paint);
        }
    }

    public void drawPath(Path path, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            A00();
            throw null;
        } else {
            canvas.drawPath(path, paint);
        }
    }

    public void drawPicture(Picture picture, Rect rect) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            A00();
            throw null;
        } else {
            canvas.drawPicture(picture, rect);
        }
    }

    public void drawPoint(float f, float f2, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            A00();
            throw null;
        } else {
            canvas.drawPoint(f, f2, paint);
        }
    }

    public void drawPoints(float[] fArr, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            A00();
            throw null;
        } else {
            canvas.drawPoints(fArr, paint);
        }
    }

    public void drawPosText(String str, float[] fArr, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            A00();
            throw null;
        } else {
            canvas.drawPosText(str, fArr, paint);
        }
    }

    public void drawRGB(int i, int i2, int i3) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            A00();
            throw null;
        } else {
            canvas.drawRGB(i, i2, i3);
        }
    }

    public void drawRect(Rect rect, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            A00();
            throw null;
        } else {
            canvas.drawRect(rect, paint);
        }
    }

    public void drawRenderNode(RenderNode renderNode) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            A00();
            throw null;
        } else {
            canvas.drawRenderNode(renderNode);
        }
    }

    public void drawRoundRect(RectF rectF, float f, float f2, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            A00();
            throw null;
        } else {
            canvas.drawRoundRect(rectF, f, f2, paint);
        }
    }

    public void drawText(String str, float f, float f2, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            A00();
            throw null;
        } else {
            canvas.drawText(str, f, f2, paint);
        }
    }

    public void drawTextOnPath(char[] cArr, int i, int i2, Path path, float f, float f2, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            A00();
            throw null;
        } else {
            canvas.drawTextOnPath(cArr, i, i2, path, f, f2, paint);
        }
    }

    public void drawTextRun(MeasuredText measuredText, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            A00();
            throw null;
        } else {
            canvas.drawTextRun(measuredText, i, i2, i3, i4, f, f2, z, paint);
        }
    }

    public void drawVertices(Canvas.VertexMode vertexMode, int i, float[] fArr, int i2, float[] fArr2, int i3, int[] iArr, int i4, short[] sArr, int i5, int i6, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            A00();
            throw null;
        } else {
            canvas.drawVertices(vertexMode, i, fArr, i2, fArr2, i3, iArr, i4, sArr, i5, i6, paint);
        }
    }

    public void enableZ() {
        Canvas canvas = this.A00;
        if (canvas == null) {
            A00();
            throw null;
        } else {
            canvas.enableZ();
        }
    }

    public boolean getClipBounds(Rect rect) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            A00();
            throw null;
        }
        boolean clipBounds = canvas.getClipBounds(rect);
        if (clipBounds) {
            rect.set(0, 0, rect.width(), Integer.MAX_VALUE);
        }
        return clipBounds;
    }

    public int getDensity() {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.getDensity();
        }
        A00();
        throw null;
    }

    public DrawFilter getDrawFilter() {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.getDrawFilter();
        }
        A00();
        throw null;
    }

    public int getHeight() {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.getHeight();
        }
        A00();
        throw null;
    }

    public void getMatrix(Matrix matrix) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            A00();
            throw null;
        } else {
            canvas.getMatrix(matrix);
        }
    }

    public int getMaximumBitmapHeight() {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.getMaximumBitmapHeight();
        }
        A00();
        throw null;
    }

    public int getMaximumBitmapWidth() {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.getMaximumBitmapWidth();
        }
        A00();
        throw null;
    }

    public int getSaveCount() {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.getSaveCount();
        }
        A00();
        throw null;
    }

    public int getWidth() {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.getWidth();
        }
        A00();
        throw null;
    }

    public boolean isOpaque() {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.isOpaque();
        }
        A00();
        throw null;
    }

    public boolean quickReject(Path path, Canvas.EdgeType edgeType) {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.quickReject(path, edgeType);
        }
        A00();
        throw null;
    }

    public void restore() {
        Canvas canvas = this.A00;
        if (canvas == null) {
            A00();
            throw null;
        } else {
            canvas.restore();
        }
    }

    public void restoreToCount(int i) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            A00();
            throw null;
        } else {
            canvas.restoreToCount(i);
        }
    }

    public void rotate(float f) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            A00();
            throw null;
        } else {
            canvas.rotate(f);
        }
    }

    public int save() {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.save();
        }
        A00();
        throw null;
    }

    public int saveLayer(RectF rectF, Paint paint, int i) {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.saveLayer(rectF, paint, i);
        }
        A00();
        throw null;
    }

    public int saveLayerAlpha(RectF rectF, int i, int i2) {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.saveLayerAlpha(rectF, i, i2);
        }
        A00();
        throw null;
    }

    public void scale(float f, float f2) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            A00();
            throw null;
        } else {
            canvas.scale(f, f2);
        }
    }

    public void setBitmap(Bitmap bitmap) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            A00();
            throw null;
        } else {
            canvas.setBitmap(bitmap);
        }
    }

    public void setDensity(int i) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            A00();
            throw null;
        } else {
            canvas.setDensity(i);
        }
    }

    public void setDrawFilter(DrawFilter drawFilter) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            A00();
            throw null;
        } else {
            canvas.setDrawFilter(drawFilter);
        }
    }

    public void setMatrix(Matrix matrix) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            A00();
            throw null;
        } else {
            canvas.setMatrix(matrix);
        }
    }

    public void skew(float f, float f2) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            A00();
            throw null;
        } else {
            canvas.skew(f, f2);
        }
    }

    public void translate(float f, float f2) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            A00();
            throw null;
        } else {
            canvas.translate(f, f2);
        }
    }

    public boolean clipOutRect(Rect rect) {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.clipOutRect(rect);
        }
        A00();
        throw null;
    }

    public boolean clipPath(Path path) {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.clipPath(path);
        }
        A00();
        throw null;
    }

    public boolean clipRect(float f, float f2, float f3, float f4, Region.Op op) {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.clipRect(f, f2, f3, f4, op);
        }
        A00();
        throw null;
    }

    public void drawArc(RectF rectF, float f, float f2, boolean z, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            A00();
            throw null;
        } else {
            canvas.drawArc(rectF, f, f2, z, paint);
        }
    }

    public void drawBitmap(int[] iArr, int i, int i2, float f, float f2, int i3, int i4, boolean z, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            A00();
            throw null;
        } else {
            canvas.drawBitmap(iArr, i, i2, f, f2, i3, i4, z, paint);
        }
    }

    public void drawColor(int i) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            A00();
            throw null;
        } else {
            canvas.drawColor(i);
        }
    }

    public void drawDoubleRoundRect(RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            A00();
            throw null;
        } else {
            canvas.drawDoubleRoundRect(rectF, fArr, rectF2, fArr2, paint);
        }
    }

    public void drawLines(float[] fArr, int i, int i2, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            A00();
            throw null;
        } else {
            canvas.drawLines(fArr, i, i2, paint);
        }
    }

    public void drawOval(float f, float f2, float f3, float f4, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            A00();
            throw null;
        } else {
            canvas.drawOval(f, f2, f3, f4, paint);
        }
    }

    public void drawPatch(NinePatch ninePatch, RectF rectF, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            A00();
            throw null;
        } else {
            canvas.drawPatch(ninePatch, rectF, paint);
        }
    }

    public void drawPicture(Picture picture) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            A00();
            throw null;
        } else {
            canvas.drawPicture(picture);
        }
    }

    public void drawPoints(float[] fArr, int i, int i2, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            A00();
            throw null;
        } else {
            canvas.drawPoints(fArr, i, i2, paint);
        }
    }

    public void drawPosText(char[] cArr, int i, int i2, float[] fArr, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            A00();
            throw null;
        } else {
            canvas.drawPosText(cArr, i, i2, fArr, paint);
        }
    }

    public void drawRect(float f, float f2, float f3, float f4, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            A00();
            throw null;
        } else {
            canvas.drawRect(f, f2, f3, f4, paint);
        }
    }

    public void drawRoundRect(float f, float f2, float f3, float f4, float f5, float f6, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            A00();
            throw null;
        } else {
            canvas.drawRoundRect(f, f2, f3, f4, f5, f6, paint);
        }
    }

    public void drawText(CharSequence charSequence, int i, int i2, float f, float f2, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            A00();
            throw null;
        } else {
            canvas.drawText(charSequence, i, i2, f, f2, paint);
        }
    }

    public void drawTextOnPath(String str, Path path, float f, float f2, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            A00();
            throw null;
        } else {
            canvas.drawTextOnPath(str, path, f, f2, paint);
        }
    }

    public void drawTextRun(CharSequence charSequence, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            A00();
            throw null;
        } else {
            canvas.drawTextRun(charSequence, i, i2, i3, i4, f, f2, z, paint);
        }
    }

    public boolean quickReject(float f, float f2, float f3, float f4, Canvas.EdgeType edgeType) {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.quickReject(f, f2, f3, f4, edgeType);
        }
        A00();
        throw null;
    }

    public int saveLayer(float f, float f2, float f3, float f4, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.saveLayer(f, f2, f3, f4, paint);
        }
        A00();
        throw null;
    }

    public int saveLayerAlpha(float f, float f2, float f3, float f4, int i) {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.saveLayerAlpha(f, f2, f3, f4, i);
        }
        A00();
        throw null;
    }

    public boolean clipOutRect(int i, int i2, int i3, int i4) {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.clipOutRect(i, i2, i3, i4);
        }
        A00();
        throw null;
    }

    public boolean clipRect(RectF rectF, Region.Op op) {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.clipRect(rectF, op);
        }
        A00();
        throw null;
    }

    public void drawBitmap(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, boolean z, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            A00();
            throw null;
        } else {
            canvas.drawBitmap(iArr, i, i2, i3, i4, i5, i6, z, paint);
        }
    }

    public void drawColor(int i, PorterDuff.Mode mode) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            A00();
            throw null;
        } else {
            canvas.drawColor(i, mode);
        }
    }

    public void drawPicture(Picture picture, RectF rectF) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            A00();
            throw null;
        } else {
            canvas.drawPicture(picture, rectF);
        }
    }

    public void drawRect(RectF rectF, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            A00();
            throw null;
        } else {
            canvas.drawRect(rectF, paint);
        }
    }

    public void drawText(String str, int i, int i2, float f, float f2, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            A00();
            throw null;
        } else {
            canvas.drawText(str, i, i2, f, f2, paint);
        }
    }

    public void drawTextRun(char[] cArr, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            A00();
            throw null;
        } else {
            canvas.drawTextRun(cArr, i, i2, i3, i4, f, f2, z, paint);
        }
    }

    public boolean quickReject(RectF rectF, Canvas.EdgeType edgeType) {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.quickReject(rectF, edgeType);
        }
        A00();
        throw null;
    }

    public int saveLayer(RectF rectF, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.saveLayer(rectF, paint);
        }
        A00();
        throw null;
    }

    public int saveLayerAlpha(RectF rectF, int i) {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.saveLayerAlpha(rectF, i);
        }
        A00();
        throw null;
    }

    public boolean clipOutRect(RectF rectF) {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.clipOutRect(rectF);
        }
        A00();
        throw null;
    }

    public boolean clipRect(float f, float f2, float f3, float f4) {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.clipRect(f, f2, f3, f4);
        }
        A00();
        throw null;
    }

    public void drawBitmap(Bitmap bitmap, float f, float f2, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            A00();
            throw null;
        } else {
            canvas.drawBitmap(bitmap, f, f2, paint);
        }
    }

    public void drawColor(long j) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            A00();
            throw null;
        } else {
            canvas.drawColor(j);
        }
    }

    public void drawText(char[] cArr, int i, int i2, float f, float f2, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            A00();
            throw null;
        } else {
            canvas.drawText(cArr, i, i2, f, f2, paint);
        }
    }

    public boolean quickReject(float f, float f2, float f3, float f4) {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.quickReject(f, f2, f3, f4);
        }
        A00();
        throw null;
    }

    public int saveLayer(float f, float f2, float f3, float f4, Paint paint, int i) {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.saveLayer(f, f2, f3, f4, paint, i);
        }
        A00();
        throw null;
    }

    public int saveLayerAlpha(float f, float f2, float f3, float f4, int i, int i2) {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.saveLayerAlpha(f, f2, f3, f4, i, i2);
        }
        A00();
        throw null;
    }

    public boolean clipRect(Rect rect) {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.clipRect(rect);
        }
        A00();
        throw null;
    }

    public void drawBitmap(Bitmap bitmap, Rect rect, Rect rect2, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            A00();
            throw null;
        } else {
            canvas.drawBitmap(bitmap, rect, rect2, paint);
        }
    }

    public boolean quickReject(Path path) {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.quickReject(path);
        }
        A00();
        throw null;
    }

    public void drawColor(long j, BlendMode blendMode) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            A00();
            throw null;
        } else {
            canvas.drawColor(j, blendMode);
        }
    }

    public boolean clipRect(int i, int i2, int i3, int i4) {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.clipRect(i, i2, i3, i4);
        }
        A00();
        throw null;
    }

    public void drawBitmap(Bitmap bitmap, Rect rect, RectF rectF, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            A00();
            throw null;
        } else {
            canvas.drawBitmap(bitmap, rect, rectF, paint);
        }
    }

    public boolean quickReject(RectF rectF) {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.quickReject(rectF);
        }
        A00();
        throw null;
    }

    public boolean clipRect(RectF rectF) {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.clipRect(rectF);
        }
        A00();
        throw null;
    }
}
