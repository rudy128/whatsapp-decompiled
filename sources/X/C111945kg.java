package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.google.android.material.imageview.ShapeableImageView;
import java.util.List;

/* renamed from: X.5kg  reason: invalid class name and case insensitive filesystem */
public final class C111945kg extends C38391rD {
    public final AnonymousClass1DS A00;
    public final C125616bN A01;

    public C111945kg(AnonymousClass1DS r2, C125616bN r3) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
        this.A01 = r3;
    }

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        return new C113065mU(AnonymousClass3MY.A0E(C72463Mc.A0K(viewGroup, 0), viewGroup, 2131624325));
    }

    public int A0Q() {
        return AnonymousClass001.A0m(AnonymousClass3MW.A10(this.A00));
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r7, int i) {
        C127036dh r3;
        int ordinal;
        ViewGroup.LayoutParams layoutParams;
        ShapeableImageView shapeableImageView;
        Resources resources;
        int i2;
        Bitmap bitmap;
        Bitmap bitmap2;
        C113065mU r72 = (C113065mU) r7;
        C18070vi.A0d(r72, 0);
        List A10 = AnonymousClass3MW.A10(this.A00);
        if (A10 != null) {
            r3 = (C127036dh) A10.get(i);
            if (r3 != null) {
                AnonymousClass6R5 r0 = (AnonymousClass6R5) r3.A01.A06();
                if (r0 == null) {
                    ordinal = -1;
                } else {
                    ordinal = r0.ordinal();
                    if (ordinal == 2) {
                        int i3 = 2131624499;
                        if (C39761tb.A03()) {
                            i3 = 2131624500;
                        }
                        C28931bI r1 = r72.A00;
                        ViewStub viewStub = r1.A01;
                        if (viewStub != null) {
                            viewStub.setLayoutResource(i3);
                        }
                        r1.A04(0);
                        AnonymousClass3MX.A1D(r72.A0H.getResources(), r72.A01, 2131891272);
                        r72.A01.setImageBitmap((Bitmap) null);
                    }
                }
                if (ordinal == 1) {
                    r72.A00.A04(8);
                    shapeableImageView = r72.A01;
                    C130296jC r02 = r3.A00;
                    if (r02 != null) {
                        bitmap = r02.A00;
                    } else {
                        bitmap = null;
                    }
                    shapeableImageView.setImageBitmap(bitmap);
                    View view = r72.A0H;
                    AnonymousClass3MX.A1D(view.getResources(), shapeableImageView, 2131891260);
                    layoutParams = shapeableImageView.getLayoutParams();
                    resources = view.getResources();
                    if (resources != null) {
                        i2 = 2131167022;
                    }
                } else if (ordinal != 0) {
                    C28931bI r03 = r72.A00;
                    if (ordinal != 4) {
                        r03.A04(8);
                        r72.A01.setImageBitmap((Bitmap) null);
                    } else {
                        r03.A04(8);
                        shapeableImageView = r72.A01;
                        shapeableImageView.setImageResource(2131232879);
                        View view2 = r72.A0H;
                        AnonymousClass3MX.A1D(view2.getResources(), shapeableImageView, 2131891261);
                        layoutParams = shapeableImageView.getLayoutParams();
                        Resources resources2 = view2.getResources();
                        if (resources2 != null) {
                            int dimensionPixelSize = resources2.getDimensionPixelSize(2131167023);
                            if (Integer.valueOf(dimensionPixelSize) != null) {
                                layoutParams.width = dimensionPixelSize;
                                shapeableImageView.setLayoutParams(layoutParams);
                            }
                        }
                    }
                } else {
                    r72.A00.A04(8);
                    shapeableImageView = r72.A01;
                    C130296jC r04 = r3.A00;
                    if (r04 != null) {
                        bitmap2 = r04.A00;
                    } else {
                        bitmap2 = null;
                    }
                    shapeableImageView.setImageBitmap(bitmap2);
                    View view3 = r72.A0H;
                    AnonymousClass3MX.A1D(view3.getResources(), shapeableImageView, 2131891260);
                    layoutParams = shapeableImageView.getLayoutParams();
                    resources = view3.getResources();
                    if (resources != null) {
                        i2 = 2131167024;
                    }
                }
                int dimensionPixelSize2 = resources.getDimensionPixelSize(i2);
                if (Integer.valueOf(dimensionPixelSize2) != null) {
                    layoutParams.width = dimensionPixelSize2;
                    layoutParams.height = dimensionPixelSize2;
                    shapeableImageView.setLayoutParams(layoutParams);
                }
            }
        } else {
            r3 = null;
        }
        AnonymousClass78T.A00(r72.A0H, this, r3, i, 6);
    }
}
