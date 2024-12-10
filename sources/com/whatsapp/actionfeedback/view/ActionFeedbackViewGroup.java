package com.whatsapp.actionfeedback.view;

import X.AnonymousClass000;
import X.AnonymousClass00R;
import X.AnonymousClass1DF;
import X.AnonymousClass1Y1;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3Qo;
import X.AnonymousClass5Ax;
import X.C108745cE;
import X.C17880vN;
import X.C18070vi;
import X.C18100vl;
import android.content.Context;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.Iterator;
import java.util.Map;

public final class ActionFeedbackViewGroup extends LinearLayout {
    public final Map A00;
    public final C18100vl A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ActionFeedbackViewGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        this.A01 = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new AnonymousClass5Ax(this));
        this.A00 = C17880vN.A13();
        LayoutInflater.from(context).inflate(2131623991, this, true);
        setGravity(1);
        setOrientation(1);
    }

    public final AnonymousClass3Qo A00(C108745cE r6) {
        int i;
        AnonymousClass3Qo r3 = new AnonymousClass3Qo(AnonymousClass3MY.A04(this));
        r3.setViewState(r6);
        TransitionManager.beginDelayedTransition(this, getTransition());
        Integer BUN = r6.BUN();
        if (BUN != null) {
            i = AnonymousClass3Ma.A02(this, BUN.intValue());
        } else {
            i = 0;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.setMargins(i, 0, i, 0);
        addView(r3, 0, marginLayoutParams);
        return r3;
    }

    private final Transition getTransition() {
        return (Transition) this.A01.getValue();
    }

    public final void A01() {
        Map map = this.A00;
        Iterator A15 = AnonymousClass000.A15(map);
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            ((View) A16.getKey()).removeCallbacks((Runnable) A16.getValue());
        }
        map.clear();
        if (getChildCount() > 0) {
            TransitionManager.beginDelayedTransition(this, getTransition());
            removeAllViews();
        }
    }

    public final void A02(View view) {
        Map map = this.A00;
        Runnable runnable = (Runnable) map.get(view);
        if (runnable != null) {
            view.removeCallbacks(runnable);
            map.remove(view);
        }
        if (indexOfChild(view) >= 0) {
            TransitionManager.beginDelayedTransition(this, getTransition());
            removeView(view);
        }
    }

    public final void setActionFeedbackViewAutoDismiss(View view, long j, Runnable runnable) {
        C18070vi.A0i(view, runnable);
        Map map = this.A00;
        Runnable runnable2 = (Runnable) map.get(view);
        if (runnable2 != null) {
            view.removeCallbacks(runnable2);
        }
        map.put(view, runnable);
        view.postDelayed(runnable, j);
    }

    public /* synthetic */ ActionFeedbackViewGroup(Context context, AttributeSet attributeSet, int i, AnonymousClass1Y1 r5) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ActionFeedbackViewGroup(Context context) {
        this(context, (AttributeSet) null);
        C18070vi.A0d(context, 1);
    }
}
