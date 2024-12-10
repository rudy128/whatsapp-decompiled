package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.StateSet;
import android.view.View;
import android.widget.CheckBox;

/* renamed from: X.3Zh  reason: invalid class name and case insensitive filesystem */
public class C74303Zh extends C42011xT implements C22851Dl {
    public final View A00;
    public final CheckBox A01;
    public final int[] A02;
    public final int[] A03;
    public final int[] A04;

    public void A0B(boolean z, int i) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        CheckBox checkBox = this.A01;
        Resources resources = checkBox.getResources();
        int i2 = 2131231567;
        if (z) {
            i2 = 2131231566;
        }
        Drawable A002 = C40501uo.A00(AnonymousClass3Ma.A06(checkBox), resources, i2);
        C17960vV.A07(A002);
        LayerDrawable layerDrawable = (LayerDrawable) A002;
        int[] iArr = this.A03;
        int i3 = iArr[i % iArr.length];
        int[] iArr2 = this.A04;
        int i4 = iArr2[i % iArr2.length];
        Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(2131429193);
        Drawable findDrawableByLayerId2 = layerDrawable.findDrawableByLayerId(2131429192);
        Drawable A08 = AnonymousClass4aX.A08(findDrawableByLayerId, i4);
        Drawable A082 = AnonymousClass4aX.A08(findDrawableByLayerId2, i3);
        layerDrawable.setDrawableByLayerId(2131429193, A08);
        layerDrawable.setDrawableByLayerId(2131429192, A082);
        stateListDrawable.addState(StateSet.WILD_CARD, layerDrawable);
        stateListDrawable.mutate();
        Context context = checkBox.getContext();
        int[] iArr3 = this.A02;
        AnonymousClass3MY.A0w(context, checkBox, iArr3[i % iArr3.length]);
        checkBox.setButtonDrawable(stateListDrawable);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        if (r1 != false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001d, code lost:
        if (r1 != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void Bo9(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Number r7 = (java.lang.Number) r7
            int r5 = r6.A05()
            int r0 = r7.intValue()
            r4 = 1
            boolean r3 = X.AnonymousClass000.A1T(r5, r0)
            android.widget.CheckBox r2 = r6.A01
            boolean r1 = r2.isChecked()
            if (r3 == 0) goto L_0x001a
            r0 = 1
            if (r1 == 0) goto L_0x002c
        L_0x001a:
            r0 = 0
            if (r3 != 0) goto L_0x002c
            if (r1 == 0) goto L_0x002c
        L_0x001f:
            if (r5 < 0) goto L_0x0028
            if (r0 != 0) goto L_0x0025
            if (r4 == 0) goto L_0x0028
        L_0x0025:
            r6.A0B(r3, r5)
        L_0x0028:
            r2.setChecked(r3)
            return
        L_0x002c:
            r4 = 0
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74303Zh.Bo9(java.lang.Object):void");
    }

    public C74303Zh(View view, int[] iArr, int[] iArr2, int[] iArr3) {
        super(view);
        this.A00 = AnonymousClass1HF.A06(view, 2131435129);
        CheckBox checkBox = (CheckBox) AnonymousClass1HF.A06(view, 2131435128);
        this.A01 = checkBox;
        AnonymousClass1Y5.A02(checkBox, 2131886289);
        this.A03 = iArr;
        this.A04 = iArr2;
        this.A02 = iArr3;
    }
}
