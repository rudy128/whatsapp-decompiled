package X;

import android.text.TextUtils;
import android.widget.TextView;
import com.whatsapp.payments.ui.PaymentTransactionHistoryActivity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9jY  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C189629jY {
    public final /* synthetic */ PaymentTransactionHistoryActivity A00;

    public final void A00(C188079gq r7, String str, List list, List list2) {
        int i;
        String A0R;
        int i2;
        PaymentTransactionHistoryActivity paymentTransactionHistoryActivity = this.A00;
        C161828Hx r0 = paymentTransactionHistoryActivity.A0C;
        r0.A01 = list;
        r0.notifyDataSetChanged();
        ArrayList arrayList = paymentTransactionHistoryActivity.A0Y;
        arrayList.clear();
        arrayList.addAll(list2);
        paymentTransactionHistoryActivity.A02.setVisibility(8);
        if (list.isEmpty()) {
            TextView textView = paymentTransactionHistoryActivity.A03;
            boolean z = r7.A05;
            boolean z2 = r7.A06;
            if (z) {
                if (!z2) {
                    boolean A1W = AnonymousClass000.A1W(r7.A00);
                    boolean isEmpty = TextUtils.isEmpty(str);
                    if (A1W) {
                        if (isEmpty) {
                            i2 = 2131893887;
                        } else {
                            i = 2131893888;
                            A0R = C17890vO.A0R(paymentTransactionHistoryActivity, str, 1, 0, i);
                            textView.setText(A0R);
                            paymentTransactionHistoryActivity.A01.setVisibility(0);
                            return;
                        }
                    } else if (isEmpty) {
                        i2 = 2131893883;
                    } else {
                        i = 2131893886;
                        A0R = C17890vO.A0R(paymentTransactionHistoryActivity, str, 1, 0, i);
                        textView.setText(A0R);
                        paymentTransactionHistoryActivity.A01.setVisibility(0);
                        return;
                    }
                } else if (TextUtils.isEmpty(str)) {
                    i2 = 2131893884;
                } else {
                    i = 2131893885;
                    A0R = C17890vO.A0R(paymentTransactionHistoryActivity, str, 1, 0, i);
                    textView.setText(A0R);
                    paymentTransactionHistoryActivity.A01.setVisibility(0);
                    return;
                }
            } else if (!z2) {
                boolean A1W2 = AnonymousClass000.A1W(r7.A00);
                boolean z3 = r7.A02;
                if (A1W2) {
                    if (!z3) {
                        boolean z4 = r7.A03;
                        boolean isEmpty2 = TextUtils.isEmpty(str);
                        if (z4) {
                            if (isEmpty2) {
                                i2 = 2131893881;
                            } else {
                                i = 2131893882;
                                A0R = C17890vO.A0R(paymentTransactionHistoryActivity, str, 1, 0, i);
                                textView.setText(A0R);
                                paymentTransactionHistoryActivity.A01.setVisibility(0);
                                return;
                            }
                        } else if (isEmpty2) {
                            i2 = 2131893893;
                        } else {
                            i = 2131893894;
                            A0R = C17890vO.A0R(paymentTransactionHistoryActivity, str, 1, 0, i);
                            textView.setText(A0R);
                            paymentTransactionHistoryActivity.A01.setVisibility(0);
                            return;
                        }
                    } else if (TextUtils.isEmpty(str)) {
                        i2 = 2131893875;
                    } else {
                        i = 2131893876;
                        A0R = C17890vO.A0R(paymentTransactionHistoryActivity, str, 1, 0, i);
                        textView.setText(A0R);
                        paymentTransactionHistoryActivity.A01.setVisibility(0);
                        return;
                    }
                } else if (!z3) {
                    boolean z5 = r7.A03;
                    boolean isEmpty3 = TextUtils.isEmpty(str);
                    if (z5) {
                        if (isEmpty3) {
                            i2 = 2131893877;
                        } else {
                            i = 2131893880;
                            A0R = C17890vO.A0R(paymentTransactionHistoryActivity, str, 1, 0, i);
                            textView.setText(A0R);
                            paymentTransactionHistoryActivity.A01.setVisibility(0);
                            return;
                        }
                    } else if (isEmpty3) {
                        i2 = 2131893889;
                    } else {
                        i = 2131893892;
                        A0R = C17890vO.A0R(paymentTransactionHistoryActivity, str, 1, 0, i);
                        textView.setText(A0R);
                        paymentTransactionHistoryActivity.A01.setVisibility(0);
                        return;
                    }
                } else if (TextUtils.isEmpty(str)) {
                    i2 = 2131893871;
                } else {
                    i = 2131893874;
                    A0R = C17890vO.A0R(paymentTransactionHistoryActivity, str, 1, 0, i);
                    textView.setText(A0R);
                    paymentTransactionHistoryActivity.A01.setVisibility(0);
                    return;
                }
            } else if (!r7.A02) {
                boolean z6 = r7.A03;
                boolean isEmpty4 = TextUtils.isEmpty(str);
                if (z6) {
                    if (isEmpty4) {
                        i2 = 2131893878;
                    } else {
                        i = 2131893879;
                        A0R = C17890vO.A0R(paymentTransactionHistoryActivity, str, 1, 0, i);
                        textView.setText(A0R);
                        paymentTransactionHistoryActivity.A01.setVisibility(0);
                        return;
                    }
                } else if (isEmpty4) {
                    i2 = 2131893890;
                } else {
                    i = 2131893891;
                    A0R = C17890vO.A0R(paymentTransactionHistoryActivity, str, 1, 0, i);
                    textView.setText(A0R);
                    paymentTransactionHistoryActivity.A01.setVisibility(0);
                    return;
                }
            } else if (TextUtils.isEmpty(str)) {
                i2 = 2131893872;
            } else {
                i = 2131893873;
                A0R = C17890vO.A0R(paymentTransactionHistoryActivity, str, 1, 0, i);
                textView.setText(A0R);
                paymentTransactionHistoryActivity.A01.setVisibility(0);
                return;
            }
            A0R = paymentTransactionHistoryActivity.getString(i2);
            textView.setText(A0R);
            paymentTransactionHistoryActivity.A01.setVisibility(0);
            return;
        }
        paymentTransactionHistoryActivity.A01.setVisibility(8);
        paymentTransactionHistoryActivity.A0B.A04(list);
    }

    public /* synthetic */ C189629jY(PaymentTransactionHistoryActivity paymentTransactionHistoryActivity) {
        this.A00 = paymentTransactionHistoryActivity;
    }
}
