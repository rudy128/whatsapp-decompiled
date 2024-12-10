package X;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5hY  reason: invalid class name and case insensitive filesystem */
public final class C110955hY extends C39401t1 {
    public AnonymousClass8BC A00;
    public final View A01;
    public final C1405671z A02;
    public final AnonymousClass6p8 A03;
    public final AnonymousClass70N A04;

    public void A1h(C26228CvK cvK, int i) {
        Object obj;
        C18070vi.A0d(cvK, 1);
        Iterator it = this.A04.A03().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (obj.hashCode() == i) {
                break;
            }
        }
        C1409773u r5 = (C1409773u) obj;
        if (r5 == null) {
            cvK.A0Q("");
            cvK.A02.setBoundsInParent(new Rect(0, 0, 0, 0));
            cvK.A0O(C108955ca.A0x(this));
            return;
        }
        cvK.A0Q(r5.A0E(AnonymousClass3MY.A04(this.A01)));
        C1405671z r2 = this.A02;
        Matrix matrix = new Matrix(r2.A05);
        RectF rectF = r2.A0B;
        matrix.preTranslate(rectF.left, rectF.top);
        float f = r2.A00;
        matrix.preScale(f, f);
        matrix.preConcat(r2.A0A);
        RectF rectF2 = r2.A08;
        if (rectF2 != null) {
            matrix.preTranslate(-rectF2.left, -rectF2.top);
        }
        RectF A08 = AnonymousClass3MW.A08();
        matrix.mapRect(A08, r5.A06);
        cvK.A02.setBoundsInParent(new Rect((int) A08.left, (int) A08.top, (int) A08.right, (int) A08.bottom));
        cvK.A0O(C108955ca.A0x(r5));
        cvK.A0L(C26137Ct0.A08);
    }

    public void A1i(List list) {
        C18070vi.A0d(list, 0);
        List<Object> A032 = this.A04.A03();
        ArrayList A0D = C29351c6.A0D(A032);
        for (Object hashCode : A032) {
            C17890vO.A1D(A0D, hashCode.hashCode());
        }
        list.addAll(A0D);
    }

    public int A1b(float f, float f2) {
        C1409773u A022 = this.A04.A02(this.A03.A01((AnonymousClass69K) null, f, f2), false);
        if (A022 == null) {
            return -1;
        }
        return A022.hashCode();
    }

    public boolean A1m(int i, int i2, Bundle bundle) {
        Object obj;
        Iterator it = this.A04.A03().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (obj.hashCode() == i) {
                break;
            }
        }
        C1409773u r3 = (C1409773u) obj;
        if (r3 == null || i2 != 16) {
            return false;
        }
        AnonymousClass8BC r2 = this.A00;
        if (r2 != null) {
            RectF rectF = r3.A06;
            r2.C5N(r3, rectF.centerX(), rectF.centerY());
        }
        A1d();
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110955hY(View view, C1405671z r2, AnonymousClass6p8 r3, AnonymousClass70N r4) {
        super(view);
        C18070vi.A0p(r4, r3, r2);
        this.A01 = view;
        this.A04 = r4;
        this.A03 = r3;
        this.A02 = r2;
    }
}
