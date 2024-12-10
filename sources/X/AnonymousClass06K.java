package X;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* renamed from: X.06K  reason: invalid class name */
public class AnonymousClass06K extends C009205e {
    public C16550sc A00;
    public MenuItem A01;
    public final int A02;
    public final int A03;

    public boolean onHoverEvent(MotionEvent motionEvent) {
        AnonymousClass05P r4;
        int i;
        AnonymousClass03G r3;
        int pointToPosition;
        int i2;
        if (this.A00 != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i = headerViewListAdapter.getHeadersCount();
                r4 = (AnonymousClass05P) headerViewListAdapter.getWrappedAdapter();
            } else {
                r4 = (AnonymousClass05P) adapter;
                i = 0;
            }
            if (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i2 = pointToPosition - i) < 0 || i2 >= r4.getCount()) {
                r3 = null;
            } else {
                r3 = r4.getItem(i2);
            }
            MenuItem menuItem = this.A01;
            if (menuItem != r3) {
                C003301m A002 = r4.A00();
                if (menuItem != null) {
                    this.A00.BwI(menuItem, A002);
                }
                this.A01 = r3;
                if (r3 != null) {
                    this.A00.BwH(r3, A002);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    public AnonymousClass06K(Context context, boolean z) {
        super(context, z);
        if (1 == A01(context.getResources().getConfiguration())) {
            this.A02 = 21;
            this.A03 = 22;
            return;
        }
        this.A02 = 22;
        this.A03 = 21;
    }

    public static int A01(Configuration configuration) {
        return configuration.getLayoutDirection();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null) {
            if (i == this.A02) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (i == this.A03) {
                setSelection(-1);
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
                }
                ((AnonymousClass05P) adapter).A00().A0a(false);
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void setHoverListener(C16550sc r1) {
        this.A00 = r1;
    }

    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
