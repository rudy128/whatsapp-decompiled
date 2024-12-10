package X;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: X.8DD  reason: invalid class name */
public class AnonymousClass8DD extends BaseAdapter {
    public static final int A03;
    public final int A00;
    public final int A01;
    public final Calendar A02;

    public long getItemId(int i) {
        return 0;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) AnonymousClass3MZ.A0D(viewGroup).inflate(2131626082, viewGroup, false);
        }
        Calendar calendar = this.A02;
        int i2 = i + this.A01;
        int i3 = this.A00;
        if (i2 > i3) {
            i2 -= i3;
        }
        calendar.set(7, i2);
        textView.setText(calendar.getDisplayName(7, A03, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(AnonymousClass8BS.A0l(calendar.getDisplayName(7, 2, Locale.getDefault()), viewGroup.getContext().getString(2131899213), AnonymousClass3MW.A1a(), 0));
        return textView;
    }

    static {
        int i = 1;
        if (Build.VERSION.SDK_INT >= 26) {
            i = 4;
        }
        A03 = i;
    }

    public /* bridge */ /* synthetic */ Object getItem(int i) {
        int i2 = this.A00;
        if (i >= i2) {
            return null;
        }
        int i3 = i + this.A01;
        if (i3 > i2) {
            i3 -= i2;
        }
        return Integer.valueOf(i3);
    }

    public AnonymousClass8DD(int i) {
        Calendar A07 = A8Y.A07((Calendar) null);
        this.A02 = A07;
        this.A00 = A07.getMaximum(7);
        this.A01 = i;
    }

    public int getCount() {
        return this.A00;
    }

    public AnonymousClass8DD() {
        Calendar A07 = A8Y.A07((Calendar) null);
        this.A02 = A07;
        this.A00 = A07.getMaximum(7);
        this.A01 = A07.getFirstDayOfWeek();
    }
}
