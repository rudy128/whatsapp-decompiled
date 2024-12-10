package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.8D8  reason: invalid class name */
public final class AnonymousClass8D8 extends ArrayAdapter {
    public List A00;
    public final C18000vb A01;
    public final AnonymousClass190 A02;

    public View getView(int i, View view, ViewGroup viewGroup) {
        C187579g2 r1;
        String A0G;
        WaTextView waTextView;
        int i2;
        C18070vi.A0d(viewGroup, 2);
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(2131623977, viewGroup, false);
            r1 = new C187579g2(view);
            view.setTag(r1);
        } else {
            Object tag = view.getTag();
            C18070vi.A0z(tag, "null cannot be cast to non-null type com.whatsapp.accountswitching.ui.AccountSwitchingAdapter.ViewHolder");
            r1 = (C187579g2) tag;
        }
        if (i >= this.A00.size()) {
            Log.i("AccountSwitchingAdapter/getView/position >= items.size");
            this.A02.A0G("AccountSwitchingAdapter/AdapterSizeMismatch", "position >= items.size", false);
            return view;
        }
        C194189rK r4 = (C194189rK) this.A00.get(i);
        WaTextView waTextView2 = r1.A04;
        C62562rb r10 = r4.A01;
        waTextView2.setText(r10.A08);
        WaTextView waTextView3 = r1.A05;
        C18000vb r5 = this.A01;
        C22951Dx r0 = PhoneUserJid.Companion;
        waTextView3.setText(r5.A0G(AnonymousClass17K.A05(C22951Dx.A01(r10.A06))));
        Bitmap bitmap = r4.A00;
        WaImageView waImageView = r1.A02;
        if (bitmap == null) {
            waImageView.setImageResource(2131231047);
        } else {
            waImageView.setImageBitmap(bitmap);
        }
        if (r4.A02) {
            ConstraintLayout constraintLayout = r1.A01;
            Context context = getContext();
            Object[] objArr = new Object[2];
            objArr[0] = waTextView2.getText();
            constraintLayout.setContentDescription(C17880vN.A0q(context, waTextView3.getText(), objArr, 1, 2131889167));
            waTextView2.A0J();
            r1.A00.setChecked(true);
        } else {
            ConstraintLayout constraintLayout2 = r1.A01;
            Context context2 = getContext();
            Object[] objArr2 = new Object[2];
            objArr2[0] = waTextView2.getText();
            constraintLayout2.setContentDescription(C17880vN.A0q(context2, waTextView3.getText(), objArr2, 1, 2131891285));
            waTextView2.A0L();
            r1.A00.setChecked(false);
            int i3 = r10.A00;
            if (i3 > 0) {
                if (i3 < 9) {
                    A0G = String.valueOf(i3);
                } else {
                    A0G = r5.A0G(getContext().getString(2131886389));
                }
                waTextView = r1.A03;
                waTextView.setText(A0G);
                i2 = 0;
                waTextView.setVisibility(i2);
                return view;
            }
        }
        waTextView = r1.A03;
        i2 = 8;
        waTextView.setVisibility(i2);
        return view;
    }

    public AnonymousClass8D8(Context context, AnonymousClass190 r3, C18000vb r4, List list) {
        super(context, 2131623977, list);
        this.A02 = r3;
        this.A01 = r4;
        this.A00 = list;
    }
}
