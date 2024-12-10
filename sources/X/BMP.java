package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;

public class BMP extends RecyclerView implements C37831qC {
    public static final int[] A06;
    public AnonymousClass1XU A00;
    public ArrayList A01;
    public boolean A02 = true;
    public boolean A03 = true;
    public boolean A04;
    public final C37861qG A05 = new Object();

    private void A05(int[] iArr, int i, int i2, int i3) {
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        nestedScrollBy(i, i2);
        this.A04 = true;
        ArrayList arrayList = this.A01;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C39711tW) it.next()).A03(this, 1);
            }
        }
        int scrollY2 = getScrollY() - scrollY;
        int scrollX2 = getScrollX() - scrollX;
        int[] iArr2 = iArr;
        if (iArr != null) {
            iArr[0] = iArr[0] + scrollX2;
            iArr[1] = iArr[1] + scrollY2;
        }
        A0z(A06, iArr2, 0, scrollX2, 0, scrollY2, i3);
    }

    public void Byz(View view, int i, int i2, int i3, int i4, int i5) {
        A05((int[]) null, i3, i4, i5);
    }

    public void C73(View view, int i) {
        setIsScrollEnabled(true);
        C37861qG r0 = this.A05;
        if (i == 1) {
            r0.A00 = 0;
        } else {
            r0.A01 = 0;
        }
        if (getScrollState() == 1) {
            this.A04 = false;
            ArrayList arrayList = this.A01;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C39711tW) it.next()).A03(this, 0);
                }
            }
        }
    }

    public static void A04(ViewParent viewParent) {
        if (viewParent instanceof View) {
            ((View) viewParent).getTag();
        }
        if (viewParent != null) {
            A04(viewParent.getParent());
        }
    }

    public void A0t(C39711tW r2) {
        ArrayList arrayList = this.A01;
        if (arrayList == null) {
            arrayList = AnonymousClass000.A13();
            this.A01 = arrayList;
        }
        arrayList.add(r2);
        super.A0t(r2);
    }

    public void A0u(C39711tW r2) {
        ArrayList arrayList = this.A01;
        if (arrayList != null) {
            arrayList.remove(r2);
        }
        super.A0u(r2);
    }

    public void Byy(View view, int[] iArr, int i, int i2, int i3) {
        A13(iArr, A06, i, i2, i3);
    }

    public void Bz1(View view, View view2, int i, int i2) {
        C37861qG r1 = this.A05;
        if (i2 == 1) {
            r1.A00 = i;
        } else {
            r1.A01 = i;
        }
    }

    public int getNestedScrollAxes() {
        C37861qG r0 = this.A05;
        return r0.A01 | r0.A00;
    }

    public int getScrollState() {
        if (this.A04) {
            return 1;
        }
        return this.A02;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.A03 || !this.A02 || !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.A03 || !this.A02 || !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setIsScrollEnabled(boolean z) {
        boolean z2 = this.A02;
        if (z2 != z) {
            this.A02 = z;
            if (z2) {
                this.A00 = AnonymousClass1HF.A09(this);
            }
            if (this.A02) {
                AnonymousClass1HF.A0f(this, this.A00);
                this.A00 = null;
                return;
            }
            AnonymousClass1HF.A0f(this, new BMR(this, this));
        }
    }

    static {
        int[] A1W = C108945cZ.A1W();
        // fill-array-data instruction
        A1W[0] = 0;
        A1W[1] = 0;
        A06 = A1W;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.1qG] */
    public BMP(Context context) {
        super(context);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        A04(getParent());
        boolean z2 = true;
        if (!canScrollVertically(1) && !canScrollVertically(-1) && !canScrollHorizontally(1) && !canScrollHorizontally(-1)) {
            z2 = false;
        }
        this.A03 = z2;
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        dispatchNestedFling(f, f2, z);
        if (!A11((int) (-f), (int) (-f2))) {
            return false;
        }
        this.A04 = false;
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public boolean C6L(View view, View view2, int i, int i2) {
        return false;
    }

    public void Bz0(View view, int[] iArr, int i, int i2, int i3, int i4, int i5) {
        A05(iArr, i3, i4, i5);
    }
}
