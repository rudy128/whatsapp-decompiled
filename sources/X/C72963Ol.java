package X;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.whatsapp.WaTextView;
import com.whatsapp.inappsupport.ui.SupportTopicsActivity;
import java.util.ArrayList;

/* renamed from: X.3Ol  reason: invalid class name and case insensitive filesystem */
public final class C72963Ol extends BaseAdapter {
    public final SupportTopicsActivity A00;
    public final ArrayList A01;

    public long getItemId(int i) {
        return (long) i;
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [X.4FD, java.lang.Object] */
    public View getView(int i, View view, ViewGroup viewGroup) {
        AnonymousClass4FD r1;
        C18070vi.A0d(viewGroup, 2);
        Object obj = this.A01.get(i);
        C18070vi.A0X(obj);
        C89454cU r6 = (C89454cU) obj;
        if (view == null) {
            view = LayoutInflater.from(this.A00).inflate(2131627156, viewGroup, false);
            C18070vi.A0d(view, 1);
            ? obj2 = new Object();
            obj2.A01 = C72453Mb.A0g(view, 2131436312);
            obj2.A00 = AnonymousClass3MX.A0C(view, 2131436306);
            WaTextView A0g = C72453Mb.A0g(view, 2131436312);
            C18070vi.A0d(A0g, 0);
            obj2.A01 = A0g;
            obj2.A00 = AnonymousClass3MX.A0C(view, 2131436306);
            AnonymousClass1HF.A0f(obj2.A01, new AnonymousClass3SN(2));
            view.setTag(obj2);
            r1 = obj2;
        } else {
            Object tag = view.getTag();
            C18070vi.A0z(tag, "null cannot be cast to non-null type com.whatsapp.inappsupport.ui.SupportTopicsFragment.SupportFlowTopicAdapter.ViewHolder");
            r1 = (AnonymousClass4FD) tag;
        }
        WaTextView waTextView = r1.A01;
        waTextView.setText(r6.A03);
        C90014dO.A00(waTextView, this, r6, 49);
        if (this.A00.A00 == 2) {
            int i2 = (int) (16.0f * Resources.getSystem().getDisplayMetrics().density);
            waTextView.setPadding(i2, i2, i2, i2);
            r1.A00.setVisibility(0);
            return view;
        }
        r1.A00.setVisibility(8);
        return view;
    }

    public int getCount() {
        return this.A01.size();
    }

    public /* bridge */ /* synthetic */ Object getItem(int i) {
        Object obj = this.A01.get(i);
        C18070vi.A0X(obj);
        return obj;
    }

    public C72963Ol(SupportTopicsActivity supportTopicsActivity, ArrayList arrayList) {
        this.A00 = supportTopicsActivity;
        this.A01 = arrayList;
    }
}
