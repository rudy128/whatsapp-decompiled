package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.location.PlaceInfo;
import java.util.List;

/* renamed from: X.5fB  reason: invalid class name and case insensitive filesystem */
public class C110255fB extends BaseAdapter {
    public PlaceInfo A00;
    public List A01;
    public final Context A02;
    public final AnonymousClass4VT A03;
    public final boolean A04 = true;

    public C110255fB(Context context, AnonymousClass4VT r3) {
        this.A02 = context;
        this.A03 = r3;
    }

    public long getItemId(int i) {
        return 0;
    }

    public int getItemViewType(int i) {
        return 0;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(this.A02).inflate(2131625900, (ViewGroup) null);
        }
        TextView A0E = C17880vN.A0E(view, 2131432185);
        TextView A0E2 = C17880vN.A0E(view, 2131432180);
        ImageView A0H = AnonymousClass3MW.A0H(view, 2131432184);
        if (this.A04) {
            Context context = this.A02;
            C28081Yu.A00(C19740yt.A03(context, AnonymousClass1YL.A00(context, 2130970830, 2131102245)), A0H);
        }
        List list = this.A01;
        if (list != null && i < list.size()) {
            PlaceInfo placeInfo = (PlaceInfo) this.A01.get(i);
            A0E.setText(placeInfo.A06);
            int i2 = 0;
            if (!TextUtils.isEmpty(placeInfo.A09)) {
                A0E2.setVisibility(0);
                A0E2.setText(placeInfo.A09);
                A0E2.setSingleLine(true);
            } else {
                A0E2.setVisibility(8);
            }
            if (placeInfo == this.A00) {
                A0E.setCompoundDrawablesWithIntrinsicBounds(0, 0, 2131232819, 0);
                A0E.setContentDescription(C17880vN.A0q(this.A02, placeInfo.A06, new Object[1], 0, 2131886124));
            } else {
                A0E.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                A0E.setContentDescription(placeInfo.A06);
            }
            int i3 = placeInfo.A03;
            if (i3 == 2) {
                i2 = this.A02.getResources().getDimensionPixelSize(2131168267);
            } else if (i3 == 3) {
                i2 = this.A02.getResources().getDimensionPixelSize(2131168266);
            }
            A0H.setPadding(i2, i2, i2, i2);
            String str = placeInfo.A05;
            if (str != null) {
                this.A03.A03(A0H, str);
            } else {
                A0H.setImageDrawable((Drawable) null);
                return view;
            }
        }
        return view;
    }

    public int getViewTypeCount() {
        return 1;
    }

    public int getCount() {
        return C72463Mc.A0C(this.A01);
    }

    public Object getItem(int i) {
        List list = this.A01;
        if (list == null || i >= list.size()) {
            return null;
        }
        return this.A01.get(i);
    }
}
