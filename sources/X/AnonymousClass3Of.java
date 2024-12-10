package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.chatinfo.ListChatInfoActivity;
import java.util.List;

/* renamed from: X.3Of  reason: invalid class name */
public class AnonymousClass3Of extends ArrayAdapter {
    public final /* synthetic */ ListChatInfoActivity A00;

    /* JADX WARNING: type inference failed for: r0v9, types: [X.4Nn, java.lang.Object] */
    public View getView(int i, View view, ViewGroup viewGroup) {
        C85474Nn r0;
        TextEmojiLabel textEmojiLabel;
        String str;
        if (view == null) {
            int itemViewType = getItemViewType(i);
            int i2 = 2131625492;
            if (itemViewType == 0) {
                i2 = 2131625490;
            }
            ListChatInfoActivity listChatInfoActivity = this.A00;
            view = listChatInfoActivity.getLayoutInflater().inflate(i2, viewGroup, false);
            ? obj = new Object();
            obj.A02 = C42141xh.A01(view, listChatInfoActivity.A06, 2131432903);
            obj.A01 = AnonymousClass3MX.A0W(view, 2131435610);
            int i3 = 2131427946;
            if (itemViewType == 0) {
                i3 = 2131437025;
            }
            obj.A00 = AnonymousClass3MW.A0H(view, i3);
            view.setTag(obj);
            r0 = obj;
        } else {
            r0 = (C85474Nn) view.getTag();
        }
        Object item = getItem(i);
        C17960vV.A07(item);
        AnonymousClass1E7 r3 = (AnonymousClass1E7) item;
        r0.A03 = r3;
        r0.A02.A05(r3);
        ImageView imageView = r0.A00;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(new AnonymousClass4ZR(getContext()).A02(2131899523));
        AnonymousClass1Xr.A04(imageView, AnonymousClass000.A0y(C22971Dz.A06(r3.A0J), A10));
        ListChatInfoActivity listChatInfoActivity2 = this.A00;
        listChatInfoActivity2.A0C.A07(r0.A00, r3);
        AnonymousClass48j.A00(r0.A00, r3, r0, this, 3);
        if (listChatInfoActivity2.A0A.A0j(r3, -1)) {
            r0.A01.setVisibility(0);
            textEmojiLabel = r0.A01;
            str = AnonymousClass3MX.A17(listChatInfoActivity2.A0A, r3);
        } else {
            String str2 = r3.A0Z;
            TextEmojiLabel textEmojiLabel2 = r0.A01;
            if (str2 != null) {
                textEmojiLabel2.setVisibility(0);
                textEmojiLabel = r0.A01;
                str = r3.A0Z;
            } else {
                textEmojiLabel2.setVisibility(8);
                return view;
            }
        }
        textEmojiLabel.A0R(str);
        return view;
    }

    public int getViewTypeCount() {
        return 2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3Of(Context context, ListChatInfoActivity listChatInfoActivity, List list) {
        super(context, 0, list);
        this.A00 = listChatInfoActivity;
    }

    public int getCount() {
        return AnonymousClass3MW.A10(this.A00.A08.A06).size();
    }

    public int getItemViewType(int i) {
        Object item = getItem(i);
        C24921Me r1 = this.A00.A0A;
        C17960vV.A07(item);
        return r1.A0j((AnonymousClass1E7) item, -1) ? 1 : 0;
    }
}
