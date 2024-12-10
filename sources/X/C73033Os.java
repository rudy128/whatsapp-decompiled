package X;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.Jid;
import java.util.List;

/* renamed from: X.3Os  reason: invalid class name and case insensitive filesystem */
public class C73033Os extends BaseAdapter {
    public int A00 = 4;
    public int A01 = 3;
    public List A02;
    public boolean A03;
    public final Activity A04;
    public final LayoutInflater A05;
    public final C72043Kk A06;
    public final AnonymousClass4ZR A07;
    public final C24921Me A08;
    public final C37451pZ A09;
    public final AnonymousClass1KW A0A;
    public final AnonymousClass10I A0B;

    public C73033Os(Activity activity, C72043Kk r3, AnonymousClass4ZR r4, C24921Me r5, C37451pZ r6, AnonymousClass1KW r7, AnonymousClass10I r8) {
        this.A0A = r7;
        this.A04 = activity;
        this.A0B = r8;
        this.A08 = r5;
        this.A06 = r3;
        this.A07 = r4;
        this.A09 = r6;
        this.A05 = LayoutInflater.from(activity);
        this.A02 = AnonymousClass000.A13();
    }

    public long getItemId(int i) {
        return (long) i;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [X.4No, java.lang.Object] */
    public View getView(int i, View view, ViewGroup viewGroup) {
        C85484No r0;
        AnonymousClass1E7 r1;
        int i2;
        if (view == null) {
            view = this.A05.inflate(2131626307, viewGroup, false);
            ? obj = new Object();
            obj.A03 = C42141xh.A01(view, this.A06, 2131432903);
            obj.A02 = AnonymousClass3MX.A0V(view, 2131427350);
            obj.A01 = AnonymousClass3MW.A0G(view, 2131427946);
            obj.A00 = AnonymousClass1HF.A06(view, 2131430073);
            view.setTag(obj);
            r0 = obj;
        } else {
            r0 = (C85484No) view.getTag();
        }
        int count = getCount() - 1;
        View view2 = r0.A00;
        if (i == count) {
            view2.setVisibility(8);
        } else {
            view2.setVisibility(0);
        }
        if (this.A03 || C72463Mc.A0C(this.A02) <= this.A00 || i != (i2 = this.A01)) {
            List list = this.A02;
            if (list == null) {
                r1 = null;
            } else {
                r1 = (AnonymousClass1E7) list.get(i);
            }
            C17960vV.A07(r1);
            C42141xh r5 = r0.A03;
            r5.A01.setTextColor(AnonymousClass3Ma.A00(this.A04, 2130970343, 2131101314));
            r0.A03.A05(r1);
            ImageView imageView = r0.A01;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append(this.A07.A02(2131899523));
            AnonymousClass1BI r2 = r1.A0J;
            C17960vV.A07(r2);
            AnonymousClass1Xr.A04(imageView, AnonymousClass000.A0y(r2.getRawString(), A10));
            r0.A02.setVisibility(0);
            r0.A02.setTag(r1.A0J);
            C24921Me r9 = this.A08;
            Jid A062 = r1.A06(AnonymousClass1E9.class);
            C17960vV.A07(A062);
            String str = (String) r9.A07.get(A062);
            if (str != null) {
                TextEmojiLabel textEmojiLabel = r0.A02;
                textEmojiLabel.setText(C43251zV.A05(textEmojiLabel.getContext(), this.A0A, str));
            } else {
                AnonymousClass3MW.A1S(r0.A02);
                AnonymousClass3MW.A1T(new AnonymousClass497(r0.A02, r9, this.A0A, (AnonymousClass1EC) AnonymousClass3Ma.A0m(r1)), this.A0B, 0);
            }
            this.A09.A07(r0.A01, r1);
            r0.A01.setClickable(true);
            AnonymousClass48j.A00(r0.A01, r1, r0, this, 5);
            return view;
        }
        C42141xh r6 = r0.A03;
        Activity activity = this.A04;
        r6.A01.setText(C72473Md.A0k(activity.getResources(), C72463Mc.A0C(this.A02) - i2, 2131755258));
        C42141xh r3 = r0.A03;
        r3.A01.setTextColor(AnonymousClass3Ma.A00(activity, 2130970340, 2131101312));
        r0.A02.setVisibility(8);
        ImageView imageView2 = r0.A01;
        AnonymousClass4aX.A0B(imageView2.getContext(), imageView2, 2131231897, AnonymousClass1YL.A00(r0.A01.getContext(), 2130969145, 2131100155));
        r0.A01.setClickable(false);
        return view;
    }

    public int getViewTypeCount() {
        return 1;
    }

    public int getCount() {
        int i;
        if (this.A03 || C72463Mc.A0C(this.A02) <= (i = this.A00)) {
            return C72463Mc.A0C(this.A02);
        }
        return i;
    }

    public /* bridge */ /* synthetic */ Object getItem(int i) {
        List list = this.A02;
        if (list == null) {
            return null;
        }
        return list.get(i);
    }
}
