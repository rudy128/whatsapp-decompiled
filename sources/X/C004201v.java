package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* renamed from: X.01v  reason: invalid class name and case insensitive filesystem */
public class C004201v extends BaseAdapter {
    public int A00 = -1;
    public final /* synthetic */ C004101u A01;

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.A01.A01.inflate(2131623952, viewGroup, false);
        }
        ((C008003p) view).BdW(getItem(i));
        return view;
    }

    public C004201v(C004101u r2) {
        this.A01 = r2;
        A01();
    }

    /* renamed from: A00 */
    public AnonymousClass03G getItem(int i) {
        ArrayList A0C = this.A01.A04.A0C();
        int i2 = this.A00;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (AnonymousClass03G) A0C.get(i);
    }

    public void A01() {
        C003301m r0 = this.A01.A04;
        AnonymousClass03G A07 = r0.A07();
        if (A07 != null) {
            ArrayList A0C = r0.A0C();
            int size = A0C.size();
            for (int i = 0; i < size; i++) {
                if (A0C.get(i) == A07) {
                    this.A00 = i;
                    return;
                }
            }
        }
        this.A00 = -1;
    }

    public int getCount() {
        int size = this.A01.A04.A0C().size();
        if (this.A00 >= 0) {
            return size - 1;
        }
        return size;
    }

    public void notifyDataSetChanged() {
        A01();
        super.notifyDataSetChanged();
    }
}
