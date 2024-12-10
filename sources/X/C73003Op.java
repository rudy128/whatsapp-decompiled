package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.whatsapp.WaTextView;
import java.util.List;

/* renamed from: X.3Op  reason: invalid class name and case insensitive filesystem */
public final class C73003Op extends BaseAdapter {
    public Long A00;
    public final Context A01;
    public final C18000vb A02;
    public final List A03;

    public int getCount() {
        return this.A03.size();
    }

    public /* bridge */ /* synthetic */ Object getItem(int i) {
        return this.A03.get(i);
    }

    public long getItemId(int i) {
        return ((AnonymousClass4UY) this.A03.get(i)).A01;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView;
        Drawable drawable;
        Drawable drawable2;
        AnonymousClass1D6 A012;
        AnonymousClass4UY r3 = (AnonymousClass4UY) this.A03.get(i);
        Object obj = null;
        if (view instanceof WaTextView) {
            textView = (TextView) view;
            if (textView != null) {
                obj = textView.getTag();
            }
        } else {
            textView = null;
        }
        AnonymousClass4CU r4 = r3.A02;
        if (obj != r4) {
            Context context = this.A01;
            int i2 = 2132083197;
            if (r4 == AnonymousClass4CU.TITLE) {
                i2 = 2132083198;
            }
            textView = new WaTextView(new ContextThemeWrapper(context, i2));
            textView.setTag(r4);
        }
        C18070vi.A0d(textView, 0);
        Integer num = r3.A03;
        if (num == null || (drawable = C24261Jm.A00(this.A01, num.intValue())) == null) {
            drawable = null;
        } else {
            drawable.mutate().setTint(textView.getCurrentTextColor());
        }
        long j = r3.A01;
        Long l = this.A00;
        if (l == null || j != l.longValue() || (drawable2 = AnonymousClass3MY.A08(this.A01)) == null) {
            drawable2 = null;
        } else {
            drawable2.mutate().setTint(textView.getCurrentTextColor());
        }
        if (AnonymousClass3MY.A1b(this.A02)) {
            A012 = AnonymousClass1D6.A01(drawable, drawable2);
        } else {
            A012 = AnonymousClass1D6.A01(drawable2, drawable);
        }
        textView.setText(r3.A00);
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) A012.first, (Drawable) null, (Drawable) A012.second, (Drawable) null);
        textView.setCompoundDrawablePadding(AnonymousClass000.A0Y(textView).getDimensionPixelSize(2131166186));
        return textView;
    }

    public C73003Op(Context context, C18000vb r2, List list) {
        this.A02 = r2;
        this.A01 = context;
        this.A03 = list;
    }
}
