package X;

import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.whatsapp.location.LiveLocationPrivacyActivity;

/* renamed from: X.5fA  reason: invalid class name and case insensitive filesystem */
public class C110245fA extends BaseAdapter {
    public final /* synthetic */ LiveLocationPrivacyActivity A00;

    public boolean hasStableIds() {
        return true;
    }

    public C110245fA(LiveLocationPrivacyActivity liveLocationPrivacyActivity) {
        this.A00 = liveLocationPrivacyActivity;
    }

    public int getCount() {
        return this.A00.A0G.size();
    }

    public /* bridge */ /* synthetic */ Object getItem(int i) {
        return this.A00.A0G.get(i);
    }

    public long getItemId(int i) {
        return ((AnonymousClass1E7) ((Pair) this.A00.A0G.get(i)).first).A0J();
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [X.6hB, java.lang.Object] */
    public View getView(int i, View view, ViewGroup viewGroup) {
        C129056hB r0;
        if (view == null) {
            view = AnonymousClass3MX.A09(this.A00.getLayoutInflater(), viewGroup, 2131625881);
            ? obj = new Object();
            obj.A02 = AnonymousClass3MX.A0W(view, 2131432903);
            obj.A01 = C17880vN.A0E(view, 2131436192);
            obj.A00 = AnonymousClass3MW.A0H(view, 2131427946);
            view.setTag(obj);
            r0 = obj;
        } else {
            r0 = (C129056hB) view.getTag();
        }
        LiveLocationPrivacyActivity liveLocationPrivacyActivity = this.A00;
        AnonymousClass1E7 r5 = (AnonymousClass1E7) ((Pair) liveLocationPrivacyActivity.A0G.get(i)).first;
        if (r5 != null) {
            long A01 = AnonymousClass11P.A01(liveLocationPrivacyActivity.A05);
            long A0H = liveLocationPrivacyActivity.A09.A0H(C72463Mc.A0g(r5));
            r0.A03 = r5;
            r0.A01.setText(C64052u8.A09(liveLocationPrivacyActivity.A00, A0H - A01));
            r0.A02.setText(liveLocationPrivacyActivity.A00.A0F(liveLocationPrivacyActivity.A03.A0I(r5)));
            r0.A00.setImportantForAccessibility(2);
            liveLocationPrivacyActivity.A04.A07(r0.A00, r0.A03);
        }
        return view;
    }
}
