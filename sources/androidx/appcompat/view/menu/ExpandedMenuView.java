package androidx.appcompat.view.menu;

import X.AnonymousClass03G;
import X.C002401c;
import X.C003301m;
import X.C004501y;
import X.C004601z;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public final class ExpandedMenuView extends ListView implements C004501y, AdapterView.OnItemClickListener, C004601z {
    public static final int[] A01 = {16842964, 16843049};
    public C003301m A00;

    public boolean Bdt(AnonymousClass03G r3) {
        return this.A00.A0f(0, r3);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C002401c A002 = C002401c.A00(context, attributeSet, A01, i, 0);
        TypedArray typedArray = A002.A02;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(A002.A03(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(A002.A03(1));
        }
        typedArray.recycle();
    }

    public int getWindowAnimations() {
        return 0;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Bdt((AnonymousClass03G) getAdapter().getItem(i));
    }

    public void BdU(C003301m r1) {
        this.A00 = r1;
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }
}
