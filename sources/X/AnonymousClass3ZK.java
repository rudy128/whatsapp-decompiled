package X;

import android.view.View;
import android.widget.ImageView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.group.GroupAdminPickerActivity;

/* renamed from: X.3ZK  reason: invalid class name */
public class AnonymousClass3ZK extends C42011xT {
    public final ImageView A00;
    public final TextEmojiLabel A01;
    public final C42141xh A02;
    public final C28931bI A03;
    public final /* synthetic */ GroupAdminPickerActivity A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3ZK(View view, GroupAdminPickerActivity groupAdminPickerActivity) {
        super(view);
        this.A04 = groupAdminPickerActivity;
        C42141xh A012 = C42141xh.A01(view, groupAdminPickerActivity.A04, 2131432903);
        this.A02 = A012;
        TextEmojiLabel A0W = AnonymousClass3MX.A0W(view, 2131435610);
        this.A01 = A0W;
        ImageView A0H = AnonymousClass3MW.A0H(view, 2131437025);
        this.A00 = A0H;
        this.A03 = C72453Mb.A0s(view, 2131435005);
        A0H.setImportantForAccessibility(2);
        A012.A01.setTextColor(AnonymousClass3MZ.A02(view.getContext(), view.getContext(), 2130970343, 2131101314));
        C72463Mc.A0w(view.getContext(), view.getContext(), A0W, 2130970340, 2131101312);
        view.setBackgroundResource(2131232942);
        view.setOnClickListener(groupAdminPickerActivity.A0S);
    }
}
