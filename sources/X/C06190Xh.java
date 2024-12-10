package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RenderNode;
import android.os.Build;
import androidx.compose.ui.platform.AndroidComposeView;

/* renamed from: X.0Xh  reason: invalid class name and case insensitive filesystem */
public final class C06190Xh implements C16970tW {
    public final RenderNode A00 = new RenderNode("Compose");
    public final AndroidComposeView A01;

    public void CJ3() {
        this.A00.setHasOverlappingRendering(true);
    }

    public void CKT() {
        this.A00.setRotationX(0.0f);
    }

    public void CKU() {
        this.A00.setRotationY(0.0f);
    }

    public void CKV() {
        this.A00.setRotationZ(0.0f);
    }

    public void CLE() {
        this.A00.setTranslationX(0.0f);
    }

    public void CLF() {
        this.A00.setTranslationY(0.0f);
    }

    public void BIm() {
        this.A00.discardDisplayList();
    }

    public void BJZ(Canvas canvas) {
        canvas.drawRenderNode(this.A00);
    }

    public float BMz() {
        return this.A00.getAlpha();
    }

    public int BNc() {
        return this.A00.getBottom();
    }

    public boolean BOn() {
        return this.A00.getClipToBounds();
    }

    public boolean BOo() {
        return this.A00.getClipToOutline();
    }

    public float BRA() {
        return this.A00.getElevation();
    }

    public boolean BSI() {
        return this.A00.hasDisplayList();
    }

    public int BTx() {
        return this.A00.getLeft();
    }

    public void BUP(Matrix matrix) {
        this.A00.getMatrix(matrix);
    }

    public int BYM() {
        return this.A00.getRight();
    }

    public int Baa() {
        return this.A00.getTop();
    }

    public void Bkd(int i) {
        this.A00.offsetLeftAndRight(i);
    }

    public void Bkg(int i) {
        this.A00.offsetTopAndBottom(i);
    }

    public void CDa(AnonymousClass0HC r5, C17040te r6, C22821Di r7) {
        RenderNode renderNode = this.A00;
        AnonymousClass0WO r1 = r5.A00;
        Canvas canvas = r1.A00;
        r1.A00 = renderNode.beginRecording();
        if (r6 != null) {
            r1.CGe();
            r1.BEz(r6);
        }
        r7.invoke(r1);
        if (r6 != null) {
            r1.CFz();
        }
        r1.A00 = canvas;
        renderNode.endRecording();
    }

    public void CHo(float f) {
        this.A00.setAlpha(f);
    }

    public void CHr(int i) {
        this.A00.setAmbientShadowColor(i);
    }

    public void CID(float f) {
        this.A00.setCameraDistance(f);
    }

    public void CIK(boolean z) {
        this.A00.setClipToBounds(z);
    }

    public void CIL(boolean z) {
        this.A00.setClipToOutline(z);
    }

    public void CIQ() {
        RenderNode renderNode = this.A00;
        renderNode.setUseCompositingLayer(false, (Paint) null);
        renderNode.setHasOverlappingRendering(true);
    }

    public void CIl(float f) {
        this.A00.setElevation(f);
    }

    public void CJn(Outline outline) {
        this.A00.setOutline(outline);
    }

    public void CJy(float f) {
        this.A00.setPivotX(f);
    }

    public void CJz(float f) {
        this.A00.setPivotY(f);
    }

    public boolean CK3(int i, int i2, int i3, int i4) {
        return this.A00.setPosition(i, i2, i3, i4);
    }

    public void CKL() {
        if (Build.VERSION.SDK_INT >= 31) {
            AnonymousClass0FJ.A00(this.A00);
        }
    }

    public void CKX(float f) {
        this.A00.setScaleX(f);
    }

    public void CKY(float f) {
        this.A00.setScaleY(f);
    }

    public void CKp(int i) {
        this.A00.setSpotShadowColor(i);
    }

    public int getHeight() {
        return this.A00.getHeight();
    }

    public int getWidth() {
        return this.A00.getWidth();
    }

    public C06190Xh(AndroidComposeView androidComposeView) {
        this.A01 = androidComposeView;
    }
}
