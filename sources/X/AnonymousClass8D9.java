package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.PaymentGroupParticipantPickerActivity;
import java.util.List;

/* renamed from: X.8D9  reason: invalid class name */
public class AnonymousClass8D9 extends ArrayAdapter {
    public List A00;
    public final LayoutInflater A01;
    public final /* synthetic */ PaymentGroupParticipantPickerActivity A02;

    /* JADX WARNING: type inference failed for: r0v7, types: [X.9fl, java.lang.Object] */
    public View getView(int i, View view, ViewGroup viewGroup) {
        C187409fl r0;
        TextView textView;
        int i2;
        if (view == null) {
            view = this.A01.inflate(2131625490, viewGroup, false);
            ? obj = new Object();
            obj.A02 = C42141xh.A01(view, this.A02.A00, 2131432903);
            obj.A00 = AnonymousClass3MW.A0H(view, 2131437025);
            obj.A04 = C72453Mb.A0s(view, 2131435003);
            obj.A01 = C17880vN.A0E(view, 2131435610);
            view.setTag(obj);
            r0 = obj;
        } else {
            r0 = (C187409fl) view.getTag();
        }
        r0.A02.A01.setText((CharSequence) null);
        C42141xh r6 = r0.A02;
        r6.A01.setTextColor(AnonymousClass3MZ.A02(getContext(), getContext(), 2130970343, 2131101314));
        r0.A02.A01.setAlpha(1.0f);
        r0.A04.A04(8);
        r0.A01.setVisibility(8);
        r0.A01.setText(2131893531);
        C184879bf r4 = (C184879bf) this.A00.get(i);
        C17960vV.A07(r4);
        AnonymousClass1E7 r7 = r4.A00;
        r0.A03 = r4;
        r0.A02.A05(r7);
        ImageView imageView = r0.A00;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(new AnonymousClass4ZR(getContext()).A02(2131899523));
        AnonymousClass1Xr.A04(imageView, AnonymousClass000.A0y(C22971Dz.A06(r7.A0J), A10));
        PaymentGroupParticipantPickerActivity paymentGroupParticipantPickerActivity = this.A02;
        paymentGroupParticipantPickerActivity.A04.A07(r0.A00, r7);
        AnonymousClass3Ma.A1F(r0.A00, this, r7, r0, 29);
        AnonymousClass1QO r8 = paymentGroupParticipantPickerActivity.A0B;
        Class<UserJid> cls = UserJid.class;
        if (AnonymousClass1R2.A00(paymentGroupParticipantPickerActivity.A08, (UserJid) r7.A06(cls), r8) != 2) {
            r0.A02.A01.setAlpha(0.5f);
            r0.A01.setVisibility(0);
            if (r7.A0B()) {
                textView = r0.A01;
                i2 = 2131888748;
            }
            if (r7.A0c != null && !r7.A0B()) {
                r0.A04.A04(0);
                ((TextEmojiLabel) r0.A04.A02()).A0R(paymentGroupParticipantPickerActivity.A03.A0Q(r7));
            }
            return view;
        } else if (AnonymousClass3MW.A0V(paymentGroupParticipantPickerActivity.A0G).A0P((UserJid) r7.A06(cls))) {
            r0.A02.A01.setAlpha(0.5f);
            r0.A01.setVisibility(0);
            textView = r0.A01;
            i2 = 2131897294;
        } else {
            if (C18020vd.A05(C18040vf.A02, paymentGroupParticipantPickerActivity.A0E, 544)) {
                AnonymousClass8pI r2 = r4.A01;
                if (!(paymentGroupParticipantPickerActivity.A0C.A06().BWj() == null || r2 == null || ((int) ((AnonymousClass8pI.A01(r2).A00 >> 12) & 15)) != 2)) {
                    r0.A01.setVisibility(0);
                    textView = r0.A01;
                    i2 = 2131893921;
                }
            }
            r0.A04.A04(0);
            ((TextEmojiLabel) r0.A04.A02()).A0R(paymentGroupParticipantPickerActivity.A03.A0Q(r7));
            return view;
        }
        textView.setText(i2);
        r0.A04.A04(0);
        ((TextEmojiLabel) r0.A04.A02()).A0R(paymentGroupParticipantPickerActivity.A03.A0Q(r7));
        return view;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8D9(Context context, PaymentGroupParticipantPickerActivity paymentGroupParticipantPickerActivity, List list) {
        super(context, 2131625490, list);
        this.A02 = paymentGroupParticipantPickerActivity;
        this.A01 = LayoutInflater.from(context);
        this.A00 = C17880vN.A10(list);
    }

    public int getCount() {
        List list = this.A00;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public /* bridge */ /* synthetic */ Object getItem(int i) {
        return this.A00.get(i);
    }
}
