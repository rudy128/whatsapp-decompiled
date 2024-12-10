package X;

import android.text.Html;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.payments.ui.widget.PaymentInteropShimmerRow;
import java.util.List;

/* renamed from: X.8IR  reason: invalid class name */
public abstract class AnonymousClass8IR extends C42011xT {
    /* JADX WARNING: type inference failed for: r3v5, types: [android.widget.FrameLayout, android.view.View, X.8DI, android.view.ViewGroup] */
    public void A0B(C183409Yd r13) {
        View view;
        View.OnClickListener onClickListener;
        View r3;
        if (this instanceof C1765494q) {
            throw AnonymousClass000.A0s("title");
        } else if (this instanceof C1765594r) {
            C1765594r r2 = (C1765594r) this;
            C1766995f r132 = (C1766995f) r13;
            r2.A01.setText(r132.A00);
            r2.A02.setText(r132.A01);
            r2.A00.setVisibility(0);
        } else if (this instanceof C1765394p) {
            C1765394p r32 = (C1765394p) this;
            r32.A01.setText(((AnonymousClass6C5) r13).A00);
            AnonymousClass8BS.A10(C108945cZ.A0D(r32), r32.A00, 2131100602);
        } else if (!(this instanceof C1765294o)) {
            if (this instanceof C1765694s) {
                C1765694s r22 = (C1765694s) this;
                AnonymousClass95P r133 = (AnonymousClass95P) r13;
                r22.A01.setText(r133.A02);
                r22.A00.A0R(Html.fromHtml(r133.A01));
                view = r22.A0H;
                onClickListener = r133.A00;
            } else if (this instanceof C1764994l) {
                C1765794t r33 = (C1765794t) this;
                AnonymousClass6C7 r134 = (AnonymousClass6C7) r13;
                ImageView imageView = r33.A03;
                View view2 = r33.A0H;
                AnonymousClass8BS.A10(view2.getContext(), imageView, 2131100602);
                String str = r134.A02;
                String str2 = r134.A01;
                View.OnClickListener onClickListener2 = r134.A00;
                r33.A08 = str;
                r33.A07 = str2;
                r33.A00 = onClickListener2;
                List list = r33.A09;
                list.clear();
                LinearLayout linearLayout = r33.A04;
                linearLayout.removeAllViews();
                list.addAll(r134.A03);
                r33.A0C();
                for (int i = 0; i < Math.min(list.size(), 2); i++) {
                    AW0 aw0 = (AW0) list.get(i);
                    int size = list.size();
                    ? frameLayout = new FrameLayout(view2.getContext());
                    if (!frameLayout.A06) {
                        frameLayout.A06 = true;
                        AnonymousClass10E A0O = AnonymousClass3MW.A0O(frameLayout.generatedComponent());
                        frameLayout.A02 = AnonymousClass10E.A6O(A0O);
                        frameLayout.A04 = AnonymousClass8BU.A0V(A0O);
                        frameLayout.A03 = AnonymousClass10E.A6Q(A0O);
                    }
                    View.inflate(frameLayout.getContext(), 2131626443, frameLayout);
                    frameLayout.A01 = AnonymousClass3MW.A0J(frameLayout, 2131429789);
                    frameLayout.A00 = AnonymousClass3MW.A0J(frameLayout, 2131427786);
                    C17960vV.A07(aw0);
                    long j = aw0.A05;
                    if (j > 0) {
                        frameLayout.A01.setText(AnonymousClass11X.A00.A0B(frameLayout.A03, frameLayout.A02.A09(j)));
                    }
                    frameLayout.A00.setText(frameLayout.A04.A0T(aw0));
                    int i2 = size - 1;
                    View findViewById = frameLayout.findViewById(2131430073);
                    int i3 = 8;
                    if (i < i2) {
                        i3 = 0;
                    }
                    findViewById.setVisibility(i3);
                    linearLayout.addView(frameLayout);
                }
                return;
            } else if (this instanceof C1765094m) {
                C1765094m r7 = (C1765094m) this;
                AnonymousClass6C2 r135 = (AnonymousClass6C2) r13;
                r7.A00 = r135.A01;
                String str3 = r135.A04;
                if (str3 != null) {
                    TextView textView = r7.A06;
                    textView.setText(str3);
                    textView.setVisibility(0);
                }
                ImageView imageView2 = r7.A03;
                View view3 = r7.A0H;
                AnonymousClass4aX.A0D(imageView2, AnonymousClass8BY.A00(view3));
                String str4 = r135.A03;
                String str5 = r135.A02;
                View.OnClickListener onClickListener3 = r135.A00;
                r7.A08 = str4;
                r7.A07 = str5;
                r7.A00 = onClickListener3;
                List list2 = r7.A09;
                list2.clear();
                LinearLayout linearLayout2 = r7.A04;
                linearLayout2.removeAllViews();
                list2.addAll(r135.A05);
                r7.A0C();
                for (int i4 = 0; i4 < Math.min(list2.size(), 2); i4++) {
                    AW0 aw02 = (AW0) list2.get(i4);
                    int size2 = list2.size();
                    if (aw02.A03 != 1000 || !aw02.A0P) {
                        r3 = new AnonymousClass96T(view3.getContext());
                    } else {
                        r3 = AnonymousClass3MZ.A0D(view3).inflate(2131626423, linearLayout2, false);
                    }
                    if (r3 instanceof AnonymousClass96T) {
                        AnonymousClass96T r1 = (AnonymousClass96T) r3;
                        r1.A0Z = "mandate_payment_screen";
                        r1.A0S = r7.A00;
                        C17960vV.A07(aw02);
                        r1.BDE(aw02);
                    } else if (r3 instanceof PaymentInteropShimmerRow) {
                        C17960vV.A07(aw02);
                        ((PaymentInteropShimmerRow) r3).BDE(aw02);
                    }
                    int i5 = size2 - 1;
                    View findViewById2 = r3.findViewById(2131430073);
                    if (i4 < i5) {
                        findViewById2.setVisibility(0);
                    } else {
                        findViewById2.setVisibility(8);
                    }
                    linearLayout2.addView(r3);
                }
                return;
            } else {
                view = this.A0H;
                onClickListener = ((AnonymousClass95N) r13).A00;
            }
            view.setOnClickListener(onClickListener);
        }
    }
}
