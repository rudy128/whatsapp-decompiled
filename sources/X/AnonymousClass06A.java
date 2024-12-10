package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.06A  reason: invalid class name */
public final class AnonymousClass06A extends AnonymousClass0SE implements C004001t, PopupWindow.OnDismissListener, View.OnKeyListener {
    public int A00 = 0;
    public int A01;
    public View A02;
    public View A03;
    public ViewTreeObserver A04;
    public boolean A05;
    public int A06 = 0;
    public int A07;
    public int A08;
    public PopupWindow.OnDismissListener A09;
    public C004301w A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public final int A0F;
    public final int A0G;
    public final Context A0H;
    public final Handler A0I;
    public final ViewTreeObserver.OnGlobalLayoutListener A0J = new C05250Rk(this, 0);
    public final C16550sc A0K = new AnonymousClass0SI(this);
    public final List A0L = AnonymousClass000.A13();
    public final int A0M;
    public final View.OnAttachStateChangeListener A0N = new C05230Ra(this, 0);
    public final List A0O = AnonymousClass000.A13();
    public final boolean A0P;

    public void A04(int i) {
        this.A0C = true;
        this.A07 = i;
    }

    public void A05(int i) {
        this.A0D = true;
        this.A08 = i;
    }

    public boolean A0B() {
        return false;
    }

    public boolean BLO() {
        return false;
    }

    public void C3a(Parcelable parcelable) {
    }

    public Parcelable C4J() {
        return null;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [X.0SF, X.06R] */
    private void A00(C003301m r18) {
        AnonymousClass0HZ r2;
        View view;
        Rect rect;
        int i;
        boolean z;
        int i2;
        int i3;
        int i4;
        AnonymousClass05P r14;
        int i5;
        int firstVisiblePosition;
        Context context = this.A0H;
        LayoutInflater from = LayoutInflater.from(context);
        C003301m r6 = r18;
        AnonymousClass05P r22 = new AnonymousClass05P(from, r6, 2131623947, this.A0P);
        if (!BgV() && this.A0B) {
            r22.A01 = true;
        } else if (BgV()) {
            r22.A01 = AnonymousClass0SE.A02(r6);
        }
        int A012 = AnonymousClass0SE.A01(context, r22, this.A0M);
        ? r7 = new AnonymousClass0SF(context, (AttributeSet) null, this.A0F, this.A0G);
        r7.A00 = this.A0K;
        r7.A07 = this;
        PopupWindow popupWindow = r7.A0A;
        popupWindow.setOnDismissListener(this);
        r7.A06 = this.A02;
        r7.A00 = this.A00;
        r7.A0F = true;
        popupWindow.setFocusable(true);
        popupWindow.setInputMethodMode(2);
        r7.CHm(r22);
        r7.A03(A012);
        r7.A00 = this.A00;
        List list = this.A0L;
        if (list.size() > 0) {
            r2 = (AnonymousClass0HZ) list.get(list.size() - 1);
            C003301m r12 = r2.A01;
            int size = r12.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size) {
                    break;
                }
                MenuItem item = r12.getItem(i6);
                if (!item.hasSubMenu() || r6 != item.getSubMenu()) {
                    i6++;
                } else {
                    C009205e r13 = r2.A02.A0B;
                    ListAdapter adapter = r13.getAdapter();
                    int i7 = 0;
                    if (adapter instanceof HeaderViewListAdapter) {
                        HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                        i5 = headerViewListAdapter.getHeadersCount();
                        r14 = (AnonymousClass05P) headerViewListAdapter.getWrappedAdapter();
                    } else {
                        r14 = (AnonymousClass05P) adapter;
                        i5 = 0;
                    }
                    int count = r14.getCount();
                    while (true) {
                        if (i7 >= count) {
                            break;
                        } else if (item != r14.getItem(i7)) {
                            i7++;
                        } else if (i7 != -1 && (firstVisiblePosition = (i7 + i5) - r13.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < r13.getChildCount()) {
                            view = r13.getChildAt(firstVisiblePosition);
                        }
                    }
                }
            }
            view = null;
        } else {
            r2 = null;
            view = null;
        }
        if (view != null) {
            r7.A06();
            r7.A04();
            C009205e r142 = ((AnonymousClass0HZ) list.get(list.size() - 1)).A02.A0B;
            int[] iArr = new int[2];
            r142.getLocationOnScreen(iArr);
            Rect rect2 = new Rect();
            this.A03.getWindowVisibleDisplayFrame(rect2);
            if (this.A01 != 1 ? iArr[0] - A012 >= 0 : iArr[0] + r142.getWidth() + A012 > rect2.right) {
                i = 0;
                z = false;
            } else {
                i = 1;
                z = true;
            }
            this.A01 = i;
            if (Build.VERSION.SDK_INT >= 26) {
                r7.A06 = view;
                i3 = 0;
                i2 = 0;
            } else {
                int[] iArr2 = new int[2];
                this.A02.getLocationOnScreen(iArr2);
                int[] iArr3 = new int[2];
                view.getLocationOnScreen(iArr3);
                if ((this.A00 & 7) == 5) {
                    iArr2[0] = iArr2[0] + this.A02.getWidth();
                    iArr3[0] = iArr3[0] + view.getWidth();
                }
                i2 = iArr3[0] - iArr2[0];
                i3 = iArr3[1] - iArr2[1];
            }
            if ((this.A00 & 5) == 5) {
                if (!z) {
                    A012 = view.getWidth();
                }
                i4 = i2 + A012;
                r7.A01 = i4;
                r7.A0H = true;
                r7.A0G = true;
                r7.CLK(i3);
            } else if (z) {
                A012 = view.getWidth();
                i4 = i2 + A012;
                r7.A01 = i4;
                r7.A0H = true;
                r7.A0G = true;
                r7.CLK(i3);
            }
            i4 = i2 - A012;
            r7.A01 = i4;
            r7.A0H = true;
            r7.A0G = true;
            r7.CLK(i3);
        } else {
            if (this.A0C) {
                r7.A01 = this.A07;
            }
            if (this.A0D) {
                r7.CLK(this.A08);
            }
            Rect rect3 = this.A00;
            if (rect3 != null) {
                rect = new Rect(rect3);
            } else {
                rect = null;
            }
            r7.A05 = rect;
        }
        list.add(new AnonymousClass0HZ(r6, r7, this.A01));
        r7.CMX();
        C009205e r3 = r7.A0B;
        r3.setOnKeyListener(this);
        if (r2 == null && this.A0E && r6.A09() != null) {
            View inflate = from.inflate(2131623954, r3, false);
            inflate.setEnabled(false);
            ((TextView) inflate.findViewById(16908310)).setText(r6.A09());
            r3.addHeaderView(inflate, (Object) null, false);
            r7.CMX();
        }
    }

    public void A03(int i) {
        if (this.A06 != i) {
            this.A06 = i;
            this.A00 = Gravity.getAbsoluteGravity(i, this.A02.getLayoutDirection());
        }
    }

    public void A06(View view) {
        if (this.A02 != view) {
            this.A02 = view;
            this.A00 = Gravity.getAbsoluteGravity(this.A06, view.getLayoutDirection());
        }
    }

    public void A08(C003301m r2) {
        r2.A0N(this.A0H, this);
        if (BgV()) {
            A00(r2);
        } else {
            this.A0O.add(r2);
        }
    }

    public C009205e BU2() {
        List list = this.A0L;
        if (list.isEmpty()) {
            return null;
        }
        return ((AnonymousClass0HZ) list.get(list.size() - 1)).A02.A0B;
    }

    public boolean BgV() {
        List list = this.A0L;
        if (list.size() <= 0 || !((AnonymousClass0HZ) list.get(0)).A02.A0A.isShowing()) {
            return false;
        }
        return true;
    }

    public void Bp9(C003301m r7, boolean z) {
        List list = this.A0L;
        int size = list.size();
        int i = 0;
        while (i < size) {
            if (r7 != ((AnonymousClass0HZ) list.get(i)).A01) {
                i++;
            } else if (i >= 0) {
                int i2 = i + 1;
                if (i2 < list.size()) {
                    ((AnonymousClass0HZ) list.get(i2)).A01.A0a(false);
                }
                AnonymousClass0HZ r1 = (AnonymousClass0HZ) list.remove(i);
                r1.A01.A0W(this);
                if (this.A05) {
                    AnonymousClass06R r0 = r1.A02;
                    r0.A05();
                    r0.A0A.setAnimationStyle(0);
                }
                r1.A02.dismiss();
                int size2 = list.size();
                if (size2 > 0) {
                    this.A01 = ((AnonymousClass0HZ) list.get(size2 - 1)).A00;
                } else {
                    int i3 = 1;
                    if (this.A02.getLayoutDirection() == 1) {
                        i3 = 0;
                    }
                    this.A01 = i3;
                    if (size2 == 0) {
                        dismiss();
                        C004301w r12 = this.A0A;
                        if (r12 != null) {
                            r12.Bp9(r7, true);
                        }
                        ViewTreeObserver viewTreeObserver = this.A04;
                        if (viewTreeObserver != null) {
                            if (viewTreeObserver.isAlive()) {
                                this.A04.removeGlobalOnLayoutListener(this.A0J);
                            }
                            this.A04 = null;
                        }
                        this.A03.removeOnAttachStateChangeListener(this.A0N);
                        this.A09.onDismiss();
                        return;
                    }
                }
                if (z) {
                    ((AnonymousClass0HZ) list.get(0)).A01.A0a(false);
                    return;
                }
                return;
            } else {
                return;
            }
        }
    }

    public boolean C7B(AnonymousClass068 r5) {
        Iterator it = this.A0L.iterator();
        while (true) {
            if (it.hasNext()) {
                AnonymousClass0HZ r1 = (AnonymousClass0HZ) it.next();
                if (r5 == r1.A01) {
                    r1.A02.A0B.requestFocus();
                    break;
                }
            } else if (!r5.hasVisibleItems()) {
                return false;
            } else {
                A08(r5);
                C004301w r0 = this.A0A;
                if (r0 != null) {
                    r0.Bzb(r5);
                    return true;
                }
            }
        }
        return true;
    }

    public void CQu(boolean z) {
        for (AnonymousClass0HZ r0 : this.A0L) {
            ListAdapter adapter = r0.A02.A0B.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((AnonymousClass05P) adapter).notifyDataSetChanged();
        }
    }

    public void dismiss() {
        List list = this.A0L;
        int size = list.size();
        if (size > 0) {
            AnonymousClass0HZ[] r2 = (AnonymousClass0HZ[]) list.toArray(new AnonymousClass0HZ[size]);
            while (true) {
                size--;
                if (size >= 0) {
                    AnonymousClass0HZ r1 = r2[size];
                    if (r1.A02.A0A.isShowing()) {
                        r1.A02.dismiss();
                    }
                } else {
                    return;
                }
            }
        }
    }

    public void onDismiss() {
        List list = this.A0L;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AnonymousClass0HZ r1 = (AnonymousClass0HZ) list.get(i);
            if (!r1.A02.A0A.isShowing()) {
                r1.A01.A0a(false);
                return;
            }
        }
    }

    public AnonymousClass06A(Context context, View view, int i, int i2, boolean z) {
        this.A0H = context;
        this.A02 = view;
        this.A0F = i;
        this.A0G = i2;
        this.A0P = z;
        this.A0B = false;
        this.A01 = view.getLayoutDirection() == 1 ? 0 : 1;
        Resources resources = context.getResources();
        this.A0M = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131165207));
        this.A0I = new Handler();
    }

    public void CMX() {
        if (!BgV()) {
            List<C003301m> list = this.A0O;
            for (C003301m A002 : list) {
                A00(A002);
            }
            list.clear();
            View view = this.A02;
            this.A03 = view;
            if (view != null) {
                boolean A1X = AnonymousClass000.A1X(this.A04);
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.A04 = viewTreeObserver;
                if (A1X) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.A0J);
                }
                this.A03.addOnAttachStateChangeListener(this.A0N);
            }
        }
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    public void A07(PopupWindow.OnDismissListener onDismissListener) {
        this.A09 = onDismissListener;
    }

    public void A09(boolean z) {
        this.A0B = z;
    }

    public void A0A(boolean z) {
        this.A0E = z;
    }

    public void CIA(C004301w r1) {
        this.A0A = r1;
    }
}
