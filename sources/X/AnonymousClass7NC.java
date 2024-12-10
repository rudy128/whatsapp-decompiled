package X;

import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.mediaview.PhotoView;
import com.whatsapp.plugins.MetaAiLinkView;
import com.whatsapp.reels.ReelsPreviewView;
import java.util.HashSet;

/* renamed from: X.7NC  reason: invalid class name */
public class AnonymousClass7NC implements AnonymousClass3M2 {
    public final int A00;
    public final int A01;
    public final Object A02;

    public AnonymousClass7NC(Object obj, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
    }

    public int BZK() {
        int i = this.A00;
        int i2 = this.A01;
        if (i == 0) {
            return (int) (((float) i2) * C72463Mc.A00(((AnonymousClass4SU) this.A02).A03));
        }
        return i2;
    }

    public void CMa(Bitmap bitmap, View view, AnonymousClass206 r9) {
        ThumbnailButton thumbnailButton;
        Drawable drawable;
        switch (this.A00) {
            case 0:
                int A0G = C72453Mb.A0G(view, r9, 0);
                C77523qH r5 = (C77523qH) view;
                if (bitmap == null) {
                    r5.A02 = 0;
                    int i = r9.A0u;
                    if (i != 1) {
                        if (i != A0G) {
                            if (i != 3) {
                                if (i != 9) {
                                    if (i != 13) {
                                        if (!(i == 23 || i == 25)) {
                                            if (i != 26) {
                                                if (!(i == 28 || i == 29)) {
                                                    r5.setImageResource(0);
                                                }
                                            }
                                        }
                                    }
                                }
                                drawable = C137486vX.A00(view.getContext(), (C438921i) r9);
                            }
                            r5.setImageResource(2131232619);
                        } else {
                            Drawable[] drawableArr = new Drawable[A0G];
                            drawableArr[0] = new ColorDrawable(C19740yt.A00(view.getContext(), 2131101947));
                            drawableArr[1] = new InsetDrawable(C24261Jm.A00(view.getContext(), 2131231965), view.getResources().getDimensionPixelSize(2131169020));
                            drawable = new LayerDrawable(drawableArr);
                        }
                        r5.setImageDrawable(drawable);
                    }
                    r5.setScaleType(ImageView.ScaleType.CENTER);
                    AnonymousClass1FY r3 = ((AnonymousClass4SU) this.A02).A03;
                    C72463Mc.A0x(r3, r3.getResources(), r5, 2130970113, 2131101227);
                    drawable = AnonymousClass4aX.A04(view.getContext(), view.getContext(), 2130970114, 2131101228, 2131232196);
                    C18070vi.A0X(drawable);
                    r5.setImageDrawable(drawable);
                } else {
                    r5.setImageBitmap(bitmap);
                }
                HashSet hashSet = ((AnonymousClass4SU) this.A02).A0C;
                AnonymousClass205 r1 = r9.A0v;
                if (!hashSet.contains(r1)) {
                    hashSet.add(r1);
                    C108985cd.A11(view, C72463Mc.A0Q());
                    return;
                }
                return;
            case 1:
                C18070vi.A0d(r9, 2);
                MetaAiLinkView metaAiLinkView = (MetaAiLinkView) this.A02;
                if (bitmap != null) {
                    metaAiLinkView.getImageThumbView().setVisibility(0);
                    thumbnailButton = metaAiLinkView.getImageThumbView();
                    break;
                } else {
                    metaAiLinkView.A02();
                    return;
                }
            case 2:
                C18070vi.A0d(r9, 2);
                ReelsPreviewView reelsPreviewView = (ReelsPreviewView) this.A02;
                if (bitmap != null) {
                    reelsPreviewView.getImageThumbView().setVisibility(0);
                    thumbnailButton = reelsPreviewView.getImageThumbView();
                    break;
                } else {
                    reelsPreviewView.A02();
                    return;
                }
            case 3:
                AnonymousClass6GY r12 = (AnonymousClass6GY) this.A02;
                r12.A08.A0A(bitmap);
                r12.A04 = true;
                return;
            default:
                ((AnonymousClass6Ga) this.A02).A0N.A0A(bitmap);
                return;
        }
        thumbnailButton.setImageBitmap(bitmap);
    }

    public /* synthetic */ void CN4(View view) {
        switch (this.A00) {
            case 3:
                AnonymousClass6GY r2 = (AnonymousClass6GY) this.A02;
                PhotoView photoView = r2.A08;
                photoView.A0I = null;
                photoView.A04 = 0.0f;
                r2.A04 = false;
                return;
            case 4:
                PhotoView photoView2 = ((AnonymousClass6Ga) this.A02).A0N;
                photoView2.A0I = null;
                photoView2.A04 = 0.0f;
                return;
            default:
                return;
        }
    }

    public /* synthetic */ void BuW() {
    }
}
