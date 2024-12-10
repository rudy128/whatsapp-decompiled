package X;

import android.view.ViewGroup;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.group.GroupAdminPickerActivity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3Wd  reason: invalid class name and case insensitive filesystem */
public class C73483Wd extends C38391rD {
    public ArrayList A00;
    public List A01 = AnonymousClass000.A13();
    public final /* synthetic */ GroupAdminPickerActivity A02;

    public C73483Wd(GroupAdminPickerActivity groupAdminPickerActivity) {
        this.A02 = groupAdminPickerActivity;
    }

    public int A0Q() {
        return this.A01.size();
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r8, int i) {
        AnonymousClass3ZK r82 = (AnonymousClass3ZK) r8;
        AnonymousClass1E7 r5 = (AnonymousClass1E7) this.A01.get(i);
        List list = C42011xT.A0I;
        r82.A02.A0A(r5, this.A00);
        GroupAdminPickerActivity groupAdminPickerActivity = this.A02;
        groupAdminPickerActivity.A08.A07(r82.A00, r5);
        if (!groupAdminPickerActivity.A07.A0j(r5, -1) || r5.A0c == null) {
            r82.A03.A04(8);
        } else {
            ((TextEmojiLabel) AnonymousClass3MY.A0I(r82.A03, 0)).A0S(AnonymousClass3MX.A17(groupAdminPickerActivity.A07, r5), this.A00, 0, false);
        }
        String str = r5.A0Z;
        TextEmojiLabel textEmojiLabel = r82.A01;
        if (str != null) {
            textEmojiLabel.setVisibility(0);
            textEmojiLabel.A0R(r5.A0Z);
        } else {
            textEmojiLabel.setVisibility(8);
        }
        r82.A0H.setTag(AnonymousClass1E7.A01(r5));
    }

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        List list = C42011xT.A0I;
        GroupAdminPickerActivity groupAdminPickerActivity = this.A02;
        return new AnonymousClass3ZK(AnonymousClass3MX.A09(groupAdminPickerActivity.getLayoutInflater(), viewGroup, 2131625490), groupAdminPickerActivity);
    }
}
