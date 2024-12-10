package com.whatsapp.webview.ui.views;

import X.C108945cZ;
import X.C17890vO;
import X.C18070vi;
import X.C18090vk;
import X.C21429Ajw;
import X.C27795DlN;
import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

public final class CustomScrollingBehavior extends AppBarLayout.ScrollingViewBehavior {
    public boolean A00;
    public int A01 = -1;
    public final Handler A02 = C17890vO.A0D();
    public final C18090vk A03 = new C27795DlN(this);

    public CustomScrollingBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean A0B(View view, View view2, CoordinatorLayout coordinatorLayout) {
        View view3;
        C18070vi.A0n(coordinatorLayout, view, view2);
        ViewParent parent = coordinatorLayout.getParent();
        View view4 = null;
        if ((parent instanceof ViewGroup) && (view3 = (View) parent) != null) {
            view4 = view3.findViewById(2131428319);
        }
        if (this.A01 == -1) {
            this.A01 = view2.getTop();
        }
        if (this.A00) {
            if (view4 != null) {
                view4.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), view2.getTop() - this.A01);
            }
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), view2.getHeight() - C108945cZ.A05(view2.getTop(), this.A01));
        }
        return super.A0B(view, view2, coordinatorLayout);
    }

    public boolean A0K(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        boolean A16 = C18070vi.A16(coordinatorLayout, view);
        C18070vi.A0d(motionEvent, 2);
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != A16) {
                if (action != 2) {
                    if (action != 3) {
                        if (action != 8) {
                            return false;
                        }
                    }
                }
            }
            this.A02.postDelayed(new C21429Ajw(this.A03, 2), 200);
            return false;
        }
        this.A00 = A16;
        this.A02.removeCallbacks(new C21429Ajw(this.A03, A16 ? 1 : 0));
        return false;
    }
}
