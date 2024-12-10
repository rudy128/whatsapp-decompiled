package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.profile.SetAboutInfo;
import java.util.ArrayList;

/* renamed from: X.3Od  reason: invalid class name */
public class AnonymousClass3Od extends ArrayAdapter {
    public final ArrayList A00;
    public final /* synthetic */ SetAboutInfo A01;

    public View getView(int i, View view, ViewGroup viewGroup) {
        TextEmojiLabel A0W;
        if (view == null) {
            view = AnonymousClass3MY.A0D((LayoutInflater) AnonymousClass11C.A02(viewGroup.getContext(), "layout_inflater"), 2131626896);
        }
        String str = (String) this.A00.get(i);
        if (!(str == null || (A0W = AnonymousClass3MX.A0W(view, 2131435699)) == null)) {
            View findViewById = view.findViewById(2131435702);
            SetAboutInfo setAboutInfo = this.A01;
            findViewById.setVisibility(C72453Mb.A06(str.equals(C72453Mb.A10(setAboutInfo.A05)) ? 1 : 0));
            AnonymousClass3MY.A0w(setAboutInfo, findViewById, 2131888275);
            A0W.A0R(str);
        }
        return view;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3Od(Context context, SetAboutInfo setAboutInfo, ArrayList arrayList) {
        super(context, 2131435699, arrayList);
        this.A01 = setAboutInfo;
        this.A00 = arrayList;
    }
}
