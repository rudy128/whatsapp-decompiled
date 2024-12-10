package X;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;

/* renamed from: X.Dtk  reason: case insensitive filesystem */
public final class C28224Dtk extends AnonymousClass11G implements C36001nB {
    public final /* synthetic */ C26202CuY this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28224Dtk(C26202CuY cuY) {
        super(3);
        this.this$0 = cuY;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        Drawable A01;
        Drawable A012;
        C28672EDo eDo = (C28672EDo) obj2;
        C22825BRd bRd = (C22825BRd) obj3;
        C18070vi.A0n(obj, eDo, bRd);
        Object obj4 = null;
        if (!C26212Cuq.A04()) {
            C25697CkS ckS = bRd.A0I;
            if (ckS == null || (A012 = ckS.A01(eDo)) == null) {
                if (eDo instanceof BSF) {
                    Bitmap bitmap = ((BSF) eDo).A04;
                    C18070vi.A0X(bitmap);
                    eDo.BRV().get("is_rounded");
                    return new C22828BRg(bitmap);
                }
                BEA.A1I(bRd, "Could not create Drawable for CloseableImage: ");
                return null;
            } else if (A012 instanceof Animatable) {
                return new C22826BRe((Animatable) A012, A012, bRd.A0Q);
            } else {
                return new C22829BRh(A012);
            }
        } else {
            C26212Cuq.A03("KFrescoController#imageToDataModelMapper");
            try {
                C25697CkS ckS2 = bRd.A0I;
                if (ckS2 == null || (A01 = ckS2.A01(eDo)) == null) {
                    if (eDo instanceof BSF) {
                        Bitmap bitmap2 = ((BSF) eDo).A04;
                        C18070vi.A0X(bitmap2);
                        eDo.BRV().get("is_rounded");
                        obj4 = new C22828BRg(bitmap2);
                    } else {
                        BEA.A1I(bRd, "Could not create Drawable for CloseableImage: ");
                    }
                } else if (A01 instanceof Animatable) {
                    obj4 = new C22826BRe((Animatable) A01, A01, bRd.A0Q);
                } else {
                    obj4 = new C22829BRh(A01);
                }
                return obj4;
            } finally {
                C26212Cuq.A01();
            }
        }
    }
}
