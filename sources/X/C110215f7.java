package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.whatsapp.WaTextView;

/* renamed from: X.5f7  reason: invalid class name and case insensitive filesystem */
public final class C110215f7 extends ArrayAdapter {
    public Integer A00 = AnonymousClass3MY.A0f();
    public String A01;
    public final Context A02;
    public final C18100vl A03 = AnonymousClass7S3.A00(this, 26);
    public final C18100vl A04 = AnonymousClass7S3.A00(this, 27);
    public final Fragment A05;
    public final C136166tN A06;

    public int getViewTypeCount() {
        return 1;
    }

    public C110215f7(Context context, Fragment fragment, C136166tN r4) {
        super(context, 17367049);
        this.A02 = context;
        this.A06 = r4;
        this.A05 = fragment;
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        int i2;
        C139226yS r9 = (C139226yS) getItem(i);
        String str = null;
        View inflate = LayoutInflater.from(this.A02).inflate(2131625412, (ViewGroup) null);
        TextView A0C = C108975cc.A0C(inflate);
        if (r9 != null) {
            str = r9.A05;
        }
        A0C.setText(str);
        if (r9 != null) {
            i2 = r9.A00;
        } else {
            i2 = 0;
        }
        WaTextView A0U = AnonymousClass3MW.A0U(inflate, 2131429679);
        if (i2 > -1) {
            Resources resources = A0U.getResources();
            Object[] A1a = AnonymousClass3MW.A1a();
            A1a[0] = A0U.getWhatsAppLocale().A0L().format(Integer.valueOf(i2));
            AnonymousClass3MX.A1E(resources, A0U, A1a, 2131755518, i2);
        } else {
            C18070vi.A0b(A0U);
            A0U.setVisibility(8);
        }
        ImageView A0H = AnonymousClass3MW.A0H(inflate, 2131436135);
        Integer num = this.A00;
        if (num != null && num.intValue() == i) {
            C72453Mb.A0s(inflate, 2131429089).A02();
        }
        if (r9 != null && (r9.A02 != 9 || r9.A04 == null)) {
            Fragment fragment = this.A05;
            C136166tN r10 = this.A06;
            C18070vi.A0b(A0H);
            AnonymousClass6WT.A00((Drawable) this.A04.getValue(), A0H, fragment, r9, r10, A0H.getLayoutParams().width, C72453Mb.A0I(this.A03), true);
        }
        return inflate;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C139226yS r4 = (C139226yS) getItem(i);
        String str = null;
        View inflate = LayoutInflater.from(this.A02).inflate(2131625413, (ViewGroup) null);
        TextView A0C = C108975cc.A0C(inflate);
        String str2 = this.A01;
        if (str2 == null) {
            if (r4 != null) {
                str = r4.A05;
            }
            str2 = str;
        }
        A0C.setText(str2);
        return inflate;
    }
}
