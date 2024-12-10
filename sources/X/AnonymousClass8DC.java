package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/* renamed from: X.8DC  reason: invalid class name */
public class AnonymousClass8DC extends BaseAdapter {
    public final Context A00;
    public final C1766595b A01;

    public long getItemId(int i) {
        return (long) i;
    }

    public int getCount() {
        return this.A01.A00.size();
    }

    public /* bridge */ /* synthetic */ Object getItem(int i) {
        return this.A01.A00.get(i);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        Context context = this.A00;
        View A0D = AnonymousClass3MY.A0D(LayoutInflater.from(context), 2131626419);
        C187769gL r5 = (C187769gL) this.A01.A00.get(i);
        ImageView A0G = AnonymousClass3MW.A0G(A0D, 2131435646);
        A0G.setColorFilter(context.getResources().getColor(r5.A00), PorterDuff.Mode.SRC_IN);
        A0G.setImageResource(r5.A01);
        TextView A0J = AnonymousClass3MW.A0J(A0D, 2131436378);
        A0J.setText(r5.A05);
        int i2 = r5.A03;
        if (i2 == 2131102246) {
            i2 = AnonymousClass1YL.A00(context, 2130970831, 2131102246);
        }
        AnonymousClass8BS.A14(context.getResources(), A0J, i2);
        TextView A0J2 = AnonymousClass3MW.A0J(A0D, 2131435707);
        A0J2.setText(r5.A04);
        AnonymousClass8BS.A14(context.getResources(), A0J2, r5.A02);
        View A06 = AnonymousClass1HF.A06(A0D, 2131431986);
        if (i == getCount() - 1) {
            A06.setVisibility(8);
        }
        return A0D;
    }

    public AnonymousClass8DC(Context context, C1766595b r2) {
        this.A00 = context;
        this.A01 = r2;
    }
}
