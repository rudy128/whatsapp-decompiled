package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import androidx.compose.ui.platform.AndroidComposeView;

/* renamed from: X.0Xi  reason: invalid class name and case insensitive filesystem */
public final class C06200Xi implements C16970tW {
    public static boolean A07 = true;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public boolean A04;
    public final RenderNode A05;
    public final AndroidComposeView A06;

    public void CIQ() {
        RenderNode renderNode = this.A05;
        renderNode.setLayerType(0);
        renderNode.setHasOverlappingRendering(true);
    }

    public void CJ3() {
        this.A05.setHasOverlappingRendering(true);
    }

    public void CKT() {
        this.A05.setRotationX(0.0f);
    }

    public void CKU() {
        this.A05.setRotationY(0.0f);
    }

    public void CKV() {
        this.A05.setRotation(0.0f);
    }

    public void CLE() {
        this.A05.setTranslationX(0.0f);
    }

    public void CLF() {
        this.A05.setTranslationY(0.0f);
    }

    public void BIm() {
        int i = Build.VERSION.SDK_INT;
        RenderNode renderNode = this.A05;
        if (i >= 24) {
            AnonymousClass0FK.A00(renderNode);
        } else {
            A00(renderNode);
        }
    }

    public void BJZ(Canvas canvas) {
        C18070vi.A0z(canvas, "null cannot be cast to non-null type android.view.DisplayListCanvas");
        ((DisplayListCanvas) canvas).drawRenderNode(this.A05);
    }

    public float BMz() {
        return this.A05.getAlpha();
    }

    public boolean BOo() {
        return this.A05.getClipToOutline();
    }

    public float BRA() {
        return this.A05.getElevation();
    }

    public boolean BSI() {
        return this.A05.isValid();
    }

    public void BUP(Matrix matrix) {
        this.A05.getMatrix(matrix);
    }

    public void Bkd(int i) {
        this.A01 += i;
        this.A02 += i;
        this.A05.offsetLeftAndRight(i);
    }

    public void Bkg(int i) {
        this.A03 += i;
        this.A00 += i;
        this.A05.offsetTopAndBottom(i);
    }

    public void CDa(AnonymousClass0HC r6, C17040te r7, C22821Di r8) {
        RenderNode renderNode = this.A05;
        Canvas start = renderNode.start(this.A02 - this.A01, this.A00 - this.A03);
        AnonymousClass0WO r2 = r6.A00;
        Canvas canvas = r2.A00;
        r2.A00 = start;
        if (r7 != null) {
            r2.CGe();
            r2.BEz(r7);
        }
        r8.invoke(r2);
        if (r7 != null) {
            r2.CFz();
        }
        r2.A00 = canvas;
        renderNode.end(start);
    }

    public void CHo(float f) {
        this.A05.setAlpha(f);
    }

    public void CHr(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            AnonymousClass0P5.A02(this.A05, i);
        }
    }

    public void CID(float f) {
        this.A05.setCameraDistance(-f);
    }

    public void CIK(boolean z) {
        this.A04 = z;
        this.A05.setClipToBounds(z);
    }

    public void CIL(boolean z) {
        this.A05.setClipToOutline(z);
    }

    public void CIl(float f) {
        this.A05.setElevation(f);
    }

    public void CJn(Outline outline) {
        this.A05.setOutline(outline);
    }

    public void CJy(float f) {
        this.A05.setPivotX(f);
    }

    public void CJz(float f) {
        this.A05.setPivotY(f);
    }

    public boolean CK3(int i, int i2, int i3, int i4) {
        this.A01 = i;
        this.A03 = i2;
        this.A02 = i3;
        this.A00 = i4;
        return this.A05.setLeftTopRightBottom(i, i2, i3, i4);
    }

    public void CKX(float f) {
        this.A05.setScaleX(f);
    }

    public void CKY(float f) {
        this.A05.setScaleY(f);
    }

    public void CKp(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            AnonymousClass0P5.A03(this.A05, i);
        }
    }

    public int getHeight() {
        return this.A00 - this.A03;
    }

    public int getWidth() {
        return this.A02 - this.A01;
    }

    public C06200Xi(AndroidComposeView androidComposeView) {
        this.A06 = androidComposeView;
        RenderNode create = RenderNode.create("Compose", androidComposeView);
        this.A05 = create;
        if (A07) {
            create.setScaleX(create.getScaleX());
            create.setScaleY(create.getScaleY());
            create.setTranslationX(create.getTranslationX());
            create.setTranslationY(create.getTranslationY());
            create.setElevation(create.getElevation());
            create.setRotation(create.getRotation());
            create.setRotationX(create.getRotationX());
            create.setRotationY(create.getRotationY());
            create.setCameraDistance(create.getCameraDistance());
            create.setPivotX(create.getPivotX());
            create.setPivotY(create.getPivotY());
            create.setClipToOutline(create.getClipToOutline());
            create.setClipToBounds(false);
            create.setAlpha(create.getAlpha());
            create.isValid();
            create.setLeftTopRightBottom(0, 0, 0, 0);
            create.offsetLeftAndRight(0);
            create.offsetTopAndBottom(0);
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                AnonymousClass0P5.A02(create, AnonymousClass0P5.A00(create));
                AnonymousClass0P5.A03(create, AnonymousClass0P5.A01(create));
            } else if (i < 24) {
                A00(this.A05);
                create.setLayerType(0);
                create.setHasOverlappingRendering(create.hasOverlappingRendering());
                A07 = false;
            }
            AnonymousClass0FK.A00(this.A05);
            create.setLayerType(0);
            create.setHasOverlappingRendering(create.hasOverlappingRendering());
            A07 = false;
        }
    }

    public int BNc() {
        return this.A00;
    }

    public boolean BOn() {
        return this.A04;
    }

    public int BTx() {
        return this.A01;
    }

    public int BYM() {
        return this.A02;
    }

    public int Baa() {
        return this.A03;
    }

    public void CKL() {
    }

    public static final void A00(RenderNode renderNode) {
        renderNode.destroyDisplayListData();
    }
}
