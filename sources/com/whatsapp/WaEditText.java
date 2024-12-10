package com.whatsapp;

import X.AnonymousClass11C;
import X.AnonymousClass1EG;
import X.AnonymousClass3Ma;
import X.AnonymousClass4C7;
import X.C107025Yc;
import X.C17960vV;
import X.C18000vb;
import X.C29471cL;
import X.C70613Bu;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.Selection;
import android.text.method.DigitsKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;

public class WaEditText extends AnonymousClass4C7 {
    public Rect A00;
    public C107025Yc A01;
    public AnonymousClass11C A02;
    public C18000vb A03;
    public boolean A04;
    public final Runnable A05 = new C70613Bu(this, 6);

    private void A06(Context context, AttributeSet attributeSet) {
        if (attributeSet != null && !isInEditMode()) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C29471cL.A01);
            int resourceId = obtainStyledAttributes.getResourceId(3, 0);
            if (resourceId != 0) {
                setContentDescription(this.A03.A09(resourceId));
            }
            int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
            if (resourceId2 != 0) {
                setHint(resourceId2);
            }
            int resourceId3 = obtainStyledAttributes.getResourceId(2, 0);
            if (resourceId3 != 0) {
                setImeActionLabel(this.A03.A09(resourceId3), getImeActionId());
            }
            int resourceId4 = obtainStyledAttributes.getResourceId(0, 0);
            if (resourceId4 != 0) {
                setText(this.A03.A09(resourceId4));
            }
            obtainStyledAttributes.recycle();
        }
    }

    public static void A07(WaEditText waEditText) {
        if (waEditText.A04) {
            InputMethodManager inputMethodManager = waEditText.getInputMethodManager();
            C17960vV.A07(inputMethodManager);
            inputMethodManager.showSoftInput(waEditText, 0);
            waEditText.A04 = false;
        }
    }

    public boolean A0J(Point point) {
        int i;
        Rect rect = this.A00;
        if (rect == null) {
            return true;
        }
        int i2 = point.x;
        if (i2 < rect.left || i2 > rect.right || (i = point.y) < rect.top || i > rect.bottom) {
            return false;
        }
        return true;
    }

    public boolean onTextContextMenuItem(int i) {
        C107025Yc r0 = this.A01;
        if ((r0 == null || !r0.C8U(i)) && !super.onTextContextMenuItem(i)) {
            return false;
        }
        return true;
    }

    public void setKeyFilter(String str) {
        if (str != null) {
            setKeyListener(DigitsKeyListener.getInstance(str));
        }
    }

    public WaEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A06(context, attributeSet);
    }

    private InputMethodManager getInputMethodManager() {
        return (InputMethodManager) getContext().getSystemService("input_method");
    }

    public void A0H() {
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        this.A04 = false;
        removeCallbacks(this.A05);
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        }
    }

    public void A0I(boolean z) {
        InputMethodManager inputMethodManager = getInputMethodManager();
        if (inputMethodManager == null) {
            return;
        }
        if (inputMethodManager.isFullscreenMode() && !z) {
            return;
        }
        if (inputMethodManager.isActive(this)) {
            this.A04 = false;
            removeCallbacks(this.A05);
            inputMethodManager.showSoftInput(this, 0);
            return;
        }
        requestFocus();
        this.A04 = true;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (this.A04) {
            Runnable runnable = this.A05;
            removeCallbacks(runnable);
            post(runnable);
        }
        return onCreateInputConnection;
    }

    public void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (IndexOutOfBoundsException unused) {
            setText(AnonymousClass1EG.A02(getText()));
        }
    }

    public void setCursorPosition_internal(int i, int i2) {
        int A032 = AnonymousClass3Ma.A03(this);
        Selection.setSelection(getText(), Math.min(i, A032), Math.min(i2, A032));
    }

    public void setOnContextMenuListener(C107025Yc r1) {
        this.A01 = r1;
    }

    public void setSpan_internal(Object obj, int i, int i2, int i3) {
        getText().setSpan(obj, i, Math.min(i2, AnonymousClass3Ma.A03(this)), i3);
    }

    public void setVisibleBounds(Rect rect) {
        this.A00 = rect;
    }

    public WaEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A0G();
        A06(context, attributeSet);
    }

    public WaEditText(Context context) {
        super(context);
        A0G();
    }
}
