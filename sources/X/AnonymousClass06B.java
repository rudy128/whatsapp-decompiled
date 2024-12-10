package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.PopupWindow;
import android.widget.TextView;

/* renamed from: X.06B  reason: invalid class name */
public final class AnonymousClass06B extends AnonymousClass0SE implements C004001t, PopupWindow.OnDismissListener, View.OnKeyListener, AdapterView.OnItemClickListener {
    public int A00;
    public int A01 = 0;
    public View A02;
    public View A03;
    public ViewTreeObserver A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public PopupWindow.OnDismissListener A08;
    public C004301w A09;
    public final int A0A;
    public final Context A0B;
    public final View.OnAttachStateChangeListener A0C = new C05230Ra(this, 1);
    public final ViewTreeObserver.OnGlobalLayoutListener A0D = new C05250Rk(this, 1);
    public final AnonymousClass05P A0E;
    public final C003301m A0F;
    public final AnonymousClass06R A0G;
    public final int A0H;
    public final int A0I;
    public final boolean A0J;

    public void A08(C003301m r1) {
    }

    public boolean BLO() {
        return false;
    }

    public void C3a(Parcelable parcelable) {
    }

    public Parcelable C4J() {
        return null;
    }

    public boolean C7B(AnonymousClass068 r14) {
        AnonymousClass068 r9 = r14;
        if (r14.hasVisibleItems()) {
            C04630Od r6 = new C04630Od(this.A0B, this.A03, r9, this.A0H, this.A0I, this.A0J);
            C004301w r1 = this.A09;
            r6.A04 = r1;
            AnonymousClass0SE r0 = r6.A03;
            if (r0 != null) {
                r0.CIA(r1);
            }
            boolean A022 = AnonymousClass0SE.A02(r14);
            r6.A05 = A022;
            AnonymousClass0SE r02 = r6.A03;
            if (r02 != null) {
                r02.A09(A022);
            }
            r6.A02 = this.A08;
            this.A08 = null;
            this.A0F.A0a(false);
            AnonymousClass06R r03 = this.A0G;
            int i = r03.A01;
            int BbP = r03.BbP();
            if ((Gravity.getAbsoluteGravity(this.A01, this.A02.getLayoutDirection()) & 7) == 5) {
                i += this.A02.getWidth();
            }
            AnonymousClass0SE r04 = r6.A03;
            if (r04 == null || !r04.BgV()) {
                if (r6.A01 != null) {
                    AnonymousClass0SE A012 = r6.A01();
                    A012.A0A(true);
                    if ((Gravity.getAbsoluteGravity(r6.A00, r6.A01.getLayoutDirection()) & 7) == 5) {
                        i -= r6.A01.getWidth();
                    }
                    A012.A04(i);
                    A012.A05(BbP);
                    int i2 = (int) ((r6.A08.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
                    A012.A00 = new Rect(i - i2, BbP - i2, i + i2, BbP + i2);
                    A012.CMX();
                }
            }
            C004301w r05 = this.A09;
            if (r05 == null) {
                return true;
            }
            r05.Bzb(r14);
            return true;
        }
        return false;
    }

    public void CQu(boolean z) {
        this.A05 = false;
        AnonymousClass05P r0 = this.A0E;
        if (r0 != null) {
            r0.notifyDataSetChanged();
        }
    }

    public void onDismiss() {
        this.A07 = true;
        this.A0F.close();
        ViewTreeObserver viewTreeObserver = this.A04;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.A04 = this.A03.getViewTreeObserver();
            }
            this.A04.removeGlobalOnLayoutListener(this.A0D);
            this.A04 = null;
        }
        this.A03.removeOnAttachStateChangeListener(this.A0C);
        PopupWindow.OnDismissListener onDismissListener = this.A08;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void A04(int i) {
        this.A0G.A01 = i;
    }

    public void A05(int i) {
        this.A0G.CLK(i);
    }

    public void A09(boolean z) {
        this.A0E.A01 = z;
    }

    public C009205e BU2() {
        return this.A0G.A0B;
    }

    public boolean BgV() {
        if (this.A07 || !this.A0G.A0A.isShowing()) {
            return false;
        }
        return true;
    }

    public void Bp9(C003301m r2, boolean z) {
        if (r2 == this.A0F) {
            dismiss();
            C004301w r0 = this.A09;
            if (r0 != null) {
                r0.Bp9(r2, z);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [X.0SF, X.06R] */
    public AnonymousClass06B(Context context, View view, C003301m r6, int i, int i2, boolean z) {
        this.A0B = context;
        this.A0F = r6;
        this.A0J = z;
        this.A0E = new AnonymousClass05P(LayoutInflater.from(context), r6, 2131623955, z);
        this.A0H = i;
        this.A0I = i2;
        Resources resources = context.getResources();
        this.A0A = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131165207));
        this.A02 = view;
        this.A0G = new AnonymousClass0SF(context, (AttributeSet) null, i, i2);
        r6.A0N(context, this);
    }

    public void CMX() {
        View view;
        Rect rect;
        if (BgV()) {
            return;
        }
        if (this.A07 || (view = this.A02) == null) {
            throw AnonymousClass000.A0n("StandardMenuPopup cannot be used without an anchor");
        }
        this.A03 = view;
        AnonymousClass06R r6 = this.A0G;
        PopupWindow popupWindow = r6.A0A;
        popupWindow.setOnDismissListener(this);
        r6.A07 = this;
        r6.A0F = true;
        popupWindow.setFocusable(true);
        View view2 = this.A03;
        boolean A1X = AnonymousClass000.A1X(this.A04);
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.A04 = viewTreeObserver;
        if (A1X) {
            viewTreeObserver.addOnGlobalLayoutListener(this.A0D);
        }
        view2.addOnAttachStateChangeListener(this.A0C);
        r6.A06 = view2;
        r6.A00 = this.A01;
        if (!this.A05) {
            this.A00 = AnonymousClass0SE.A01(this.A0B, this.A0E, this.A0A);
            this.A05 = true;
        }
        r6.A03(this.A00);
        popupWindow.setInputMethodMode(2);
        Rect rect2 = this.A00;
        if (rect2 != null) {
            rect = new Rect(rect2);
        } else {
            rect = null;
        }
        r6.A05 = rect;
        r6.CMX();
        C009205e r4 = r6.A0B;
        r4.setOnKeyListener(this);
        if (this.A06) {
            C003301m r3 = this.A0F;
            if (r3.A09() != null) {
                View inflate = LayoutInflater.from(this.A0B).inflate(2131623954, r4, false);
                TextView textView = (TextView) inflate.findViewById(16908310);
                if (textView != null) {
                    textView.setText(r3.A09());
                }
                inflate.setEnabled(false);
                r4.addHeaderView(inflate, (Object) null, false);
            }
        }
        r6.CHm(this.A0E);
        r6.CMX();
    }

    public void dismiss() {
        if (BgV()) {
            this.A0G.dismiss();
        }
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    public void A03(int i) {
        this.A01 = i;
    }

    public void A06(View view) {
        this.A02 = view;
    }

    public void A07(PopupWindow.OnDismissListener onDismissListener) {
        this.A08 = onDismissListener;
    }

    public void A0A(boolean z) {
        this.A06 = z;
    }

    public void CIA(C004301w r1) {
        this.A09 = r1;
    }
}
