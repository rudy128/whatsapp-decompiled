package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8Hq  reason: invalid class name and case insensitive filesystem */
public final class C161758Hq extends C38391rD {
    public int A00 = -1;
    public ArrayList A01 = AnonymousClass000.A13();
    public final C18000vb A02;
    public final AnonymousClass1QS A03;
    public final C22465B8x A04;
    public final A56 A05;

    public C161758Hq(C18000vb r2, AnonymousClass1QS r3, C22465B8x b8x, A56 a56) {
        C18070vi.A0d(a56, 3);
        this.A02 = r2;
        this.A03 = r3;
        this.A05 = a56;
        this.A04 = b8x;
    }

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        C18070vi.A0d(viewGroup, 0);
        C20810AZn aZn = new C20810AZn(this, 0);
        switch (i) {
            case 0:
                return new AnonymousClass92A(C108955ca.A0G(AnonymousClass3MY.A0B(viewGroup), viewGroup, 2131625562, false));
            case 1:
                List list = C42011xT.A0I;
                return new AnonymousClass92B(C108955ca.A0G(AnonymousClass3MZ.A0D(viewGroup), viewGroup, 2131625561, false), this.A02, this.A03, aZn, this.A05);
            case 2:
                View inflate = AnonymousClass3MY.A0B(viewGroup).inflate(2131624138, viewGroup, false);
                C72453Mb.A1S(inflate);
                C42011xT r3 = new C42011xT(inflate);
                AnonymousClass4aX.A0D(AnonymousClass3MW.A0G(inflate, 2131427620), AnonymousClass8BY.A00(inflate));
                return r3;
            case 3:
                List list2 = C42011xT.A0I;
                return new AnonymousClass92F(AnonymousClass3MY.A0E(AnonymousClass3MZ.A0D(viewGroup), viewGroup, 2131625559));
            case 4:
                List list3 = C42011xT.A0I;
                View view = new AnonymousClass92F(AnonymousClass3MY.A0E(AnonymousClass3MZ.A0D(viewGroup), viewGroup, 2131625559)).A0H;
                C18070vi.A0W(view);
                return new AnonymousClass92D(view, aZn);
            case 5:
                List list4 = C42011xT.A0I;
                View view2 = new AnonymousClass92F(AnonymousClass3MY.A0E(AnonymousClass3MZ.A0D(viewGroup), viewGroup, 2131625559)).A0H;
                C18070vi.A0W(view2);
                return new AnonymousClass92C(view2, aZn);
            case 6:
                List list5 = C42011xT.A0I;
                View view3 = new AnonymousClass92F(AnonymousClass3MY.A0E(AnonymousClass3MZ.A0D(viewGroup), viewGroup, 2131625559)).A0H;
                C18070vi.A0W(view3);
                return new AnonymousClass92E(view3, aZn);
            default:
                throw AnonymousClass001.A13("Unexpected view type: ", AnonymousClass000.A10(), i);
        }
    }

    public int A0Q() {
        return this.A01.size();
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r8, int i) {
        AnonymousClass8IH r82 = (AnonymousClass8IH) r8;
        C18070vi.A0d(r82, 0);
        C183429Yf r6 = (C183429Yf) AnonymousClass8BS.A0Z(this.A01, i);
        if (r6 instanceof C22517BBa) {
            ((C22517BBa) r6).setChecked(AnonymousClass000.A1T(i, this.A00));
        }
        if (r82 instanceof AnonymousClass92B) {
            AnonymousClass92B r83 = (AnonymousClass92B) r82;
            C18070vi.A0d(r6, 0);
            AnonymousClass960 r62 = (AnonymousClass960) r6;
            C20284AEs aEs = r62.A01;
            A56 a56 = r83.A01;
            PaymentMethodRow paymentMethodRow = r83.A02;
            a56.A04(aEs, r62.A02, paymentMethodRow);
            paymentMethodRow.A00();
            AFO.A00(paymentMethodRow, r83, 15);
            paymentMethodRow.setRadioButtonChecked(r62.A00);
        } else if (r82 instanceof AnonymousClass92A) {
            AnonymousClass92A r84 = (AnonymousClass92A) r82;
            C18070vi.A0d(r6, 0);
            String str = ((C1768495w) r6).A00;
            if (str.length() == 0) {
                r84.A0H.setVisibility(8);
                return;
            }
            r84.A0H.setVisibility(0);
            r84.A00.A0S(str, (List) null, 0, false);
        } else if (r82 instanceof AnonymousClass92F) {
            AnonymousClass92F r85 = (AnonymousClass92F) r82;
            if (r85 instanceof AnonymousClass92E) {
                AnonymousClass92E r86 = (AnonymousClass92E) r85;
                C18070vi.A0d(r6, 0);
                View view = r86.A0H;
                Context context = view.getContext();
                PaymentMethodRow paymentMethodRow2 = r86.A01;
                AnonymousClass8BV.A14(context, paymentMethodRow2, 2131893456);
                paymentMethodRow2.A00.setImageResource(2131231836);
                paymentMethodRow2.A05(false);
                paymentMethodRow2.A00();
                paymentMethodRow2.setRadioButtonChecked(((C1768795z) r6).A00);
                ImageView imageView = paymentMethodRow2.A00;
                C18070vi.A0X(imageView);
                int A012 = AnonymousClass3MW.A01(view.getResources(), 2131168112);
                imageView.setPadding(A012, A012, A012, A012);
                AnonymousClass8BW.A10(context, imageView, 2131101222);
                AnonymousClass3MY.A0v(context, imageView, 2131232166);
                AFO.A00(paymentMethodRow2, r86, 14);
            } else if (r85 instanceof AnonymousClass92D) {
                AnonymousClass92D r87 = (AnonymousClass92D) r85;
                C18070vi.A0d(r6, 0);
                PaymentMethodRow paymentMethodRow3 = r87.A01;
                AnonymousClass8BV.A14(C108945cZ.A0D(r87), paymentMethodRow3, 2131893269);
                paymentMethodRow3.A00.setImageResource(2131232428);
                paymentMethodRow3.A05(false);
                paymentMethodRow3.A00();
                paymentMethodRow3.setRadioButtonChecked(((C1768695y) r6).A00);
                AFO.A00(paymentMethodRow3, r87, 13);
            } else if (r85 instanceof AnonymousClass92C) {
                AnonymousClass92C r88 = (AnonymousClass92C) r85;
                C18070vi.A0d(r6, 0);
                View view2 = r88.A0H;
                Context context2 = view2.getContext();
                PaymentMethodRow paymentMethodRow4 = r88.A01;
                AnonymousClass8BV.A14(context2, paymentMethodRow4, 2131893456);
                paymentMethodRow4.A03(context2.getString(2131893455), false);
                paymentMethodRow4.A00.setImageResource(2131231836);
                paymentMethodRow4.A05(false);
                paymentMethodRow4.A00();
                paymentMethodRow4.setRadioButtonChecked(((C1768595x) r6).A00);
                ImageView imageView2 = paymentMethodRow4.A00;
                C18070vi.A0X(imageView2);
                int A013 = AnonymousClass3MW.A01(view2.getResources(), 2131168112);
                imageView2.setPadding(A013, A013, A013, A013);
                AnonymousClass8BW.A10(context2, imageView2, 2131101222);
                AnonymousClass3MY.A0v(context2, imageView2, 2131232166);
                AFO.A00(paymentMethodRow4, r88, 12);
            } else {
                C18070vi.A0d(r6, 0);
                View view3 = ((C1768395v) r6).A00;
                ViewParent parent = view3.getParent();
                if (parent != null) {
                    ((ViewGroup) parent).removeView(view3);
                }
                r85.A00.addView(view3);
            }
        } else {
            C18070vi.A0d(r6, 0);
            r82.A0H.setOnClickListener(((C1768295u) r6).A00);
        }
    }

    public int getItemViewType(int i) {
        return ((C183429Yf) this.A01.get(i)).A00;
    }

    public final void A0U(List list) {
        int i = 0;
        for (Object next : list) {
            int i2 = i + 1;
            if (i < 0) {
                AnonymousClass1ZU.A0B();
                throw null;
            }
            C183429Yf r2 = (C183429Yf) next;
            if ((r2 instanceof C22517BBa) && ((C22517BBa) r2).isChecked()) {
                this.A00 = i;
            }
            i = i2;
        }
        ArrayList arrayList = this.A01;
        arrayList.clear();
        arrayList.addAll(list);
    }
}
