package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.documentpicker.DocumentPickerActivity;
import java.io.File;
import java.util.List;

/* renamed from: X.5fD  reason: invalid class name and case insensitive filesystem */
public final class C110275fD extends BaseAdapter implements Filterable {
    public final C110315fI A00;
    public final /* synthetic */ DocumentPickerActivity A01;

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C129666iA r7;
        C133676pJ r5;
        if (view != null) {
            Object tag = view.getTag();
            C18070vi.A0z(tag, "null cannot be cast to non-null type com.whatsapp.documentpicker.viewholder.DocumentPickerViewHolder");
            r7 = (C129666iA) tag;
        } else {
            view = AnonymousClass3MX.A0B(this.A01.getLayoutInflater(), viewGroup, 2131625134, false);
            r7 = new C129666iA(view);
            view.setTag(r7);
        }
        DocumentPickerActivity documentPickerActivity = this.A01;
        List list = documentPickerActivity.A0S;
        if (!(list == null || (r5 = (C133676pJ) list.get(i)) == null)) {
            ImageView imageView = r7.A01;
            Context context = view.getContext();
            File file = r5.A02;
            String A09 = C64062u9.A09(file.getAbsolutePath());
            C18070vi.A0X(A09);
            String A0N = C26511Sk.A0N(A09);
            C18070vi.A0b(context);
            Drawable A012 = C137486vX.A01(context, A0N, A09, false);
            C18070vi.A0X(A012);
            imageView.setImageDrawable(A012);
            r7.A04.setText(C43351zf.A03(view.getContext(), documentPickerActivity.A00, file.getName(), documentPickerActivity.A0Q));
            r7.A03.setText(C88584aA.A02(documentPickerActivity.A00, r5.A01));
            TextView textView = r7.A02;
            C18000vb r0 = documentPickerActivity.A00;
            long j = r5.A00;
            textView.setText(C64052u8.A0C(r0, j, false));
            textView.setContentDescription(C64052u8.A0C(documentPickerActivity.A00, j, true));
            View view2 = r7.A00;
            AnonymousClass3MY.A0w(documentPickerActivity, view2, 2131888275);
            if (documentPickerActivity.A0a.contains(r5)) {
                view.setBackgroundResource(2131231276);
                view2.setVisibility(0);
            } else {
                view.setBackgroundResource(0);
                view2.setVisibility(8);
                return view;
            }
        }
        return view;
    }

    public boolean isEmpty() {
        return false;
    }

    public C110275fD(DocumentPickerActivity documentPickerActivity) {
        this.A01 = documentPickerActivity;
        this.A00 = new C110315fI(documentPickerActivity);
    }

    public int getCount() {
        return AnonymousClass001.A0m(this.A01.A0S);
    }

    public Object getItem(int i) {
        List list = this.A01.A0S;
        if (list != null) {
            return list.get(i);
        }
        return null;
    }

    public Filter getFilter() {
        return this.A00;
    }
}
