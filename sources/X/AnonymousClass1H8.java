package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.1H8  reason: invalid class name */
public class AnonymousClass1H8 extends LayoutInflater {
    public static final String[] A01 = {"android.widget.", "android.webkit."};
    public final C18000vb A00;

    public LayoutInflater cloneInContext(Context context) {
        return new AnonymousClass1H8(context, this, this.A00);
    }

    public View onCreateView(String str, AttributeSet attributeSet) {
        String[] strArr = A01;
        int i = 0;
        while (i < 2) {
            try {
                View createView = createView(str, strArr[i], attributeSet);
                if (createView != null) {
                    return createView;
                }
                i++;
            } catch (ClassNotFoundException unused) {
            }
        }
        return super.onCreateView(str, attributeSet);
    }

    public AnonymousClass1H8(Context context, LayoutInflater layoutInflater, C18000vb r3) {
        super(layoutInflater, context);
        this.A00 = r3;
    }

    public View inflate(int i, ViewGroup viewGroup, boolean z) {
        View inflate = super.inflate(i, viewGroup, z);
        C18000vb r4 = this.A00;
        if (!(inflate instanceof C27651Wy)) {
            if (!z || inflate.getTag(2131428112) == null) {
                C27641Ww.A04(inflate, r4);
            } else if (inflate instanceof ViewGroup) {
                ViewGroup viewGroup2 = (ViewGroup) inflate;
                int childCount = viewGroup2.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    C27641Ww.A04(viewGroup2.getChildAt(i2), r4);
                }
            }
            inflate.setTag(2131428112, C27641Ww.A00);
        }
        return inflate;
    }
}
