package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.whatsapp.WaTextView;
import java.util.List;

/* renamed from: X.3Oj  reason: invalid class name */
public abstract class AnonymousClass3Oj extends BaseAdapter {
    public final Context A00;
    public final List A01;

    public int getCount() {
        return this.A01.size();
    }

    public Object getItem(int i) {
        return this.A01.get(i);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        int i2;
        WaTextView waTextView;
        Drawable drawable;
        Object obj = this.A01.get(i);
        boolean z = this instanceof C76593nb;
        if (z) {
            C87614Wg r1 = (C87614Wg) obj;
            C18070vi.A0d(r1, 0);
            i2 = r1.A01;
        } else {
            AnonymousClass4UV r12 = (AnonymousClass4UV) obj;
            C18070vi.A0d(r12, 0);
            i2 = r12.A00;
        }
        long j = (long) i2;
        if (!(view instanceof WaTextView) || (waTextView = (WaTextView) view) == null || !C18070vi.A18(waTextView.getTag(), Long.valueOf(j))) {
            waTextView = new WaTextView(new C003101k(this.A00, 2132083353));
            waTextView.setGravity(16);
            waTextView.setTag(Long.valueOf(j));
        }
        if (z) {
            C87614Wg r5 = (C87614Wg) obj;
            C18070vi.A0d(r5, 1);
            AnonymousClass4ZN.A01(((C76593nb) this).A00, waTextView, r5.A02);
            return waTextView;
        }
        AnonymousClass4UV r52 = (AnonymousClass4UV) obj;
        boolean A1Z = C72453Mb.A1Z(r52);
        Context context = ((C76583na) this).A00;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131165386);
        Drawable A002 = C24261Jm.A00(context, r52.A01);
        if (A002 != null) {
            A002.mutate().setTint(waTextView.getCurrentTextColor());
            A002.setBounds(A1Z, A1Z, dimensionPixelSize, dimensionPixelSize);
        } else {
            A002 = null;
        }
        if (!r52.A03 || (drawable = AnonymousClass3MY.A08(context)) == null) {
            drawable = null;
        } else {
            drawable.mutate().setTint(waTextView.getCurrentTextColor());
            drawable.setBounds(A1Z ? 1 : 0, A1Z, dimensionPixelSize, dimensionPixelSize);
        }
        waTextView.setText(r52.A02);
        waTextView.setCompoundDrawables(A002, (Drawable) null, drawable, (Drawable) null);
        waTextView.setCompoundDrawablePadding(AnonymousClass000.A0Y(waTextView).getDimensionPixelSize(2131165389));
        return waTextView;
    }

    public AnonymousClass3Oj(Context context, List list) {
        this.A00 = context;
        this.A01 = list;
    }
}
