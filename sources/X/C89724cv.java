package X;

import android.net.Uri;
import android.view.View;
import com.whatsapp.calling.callhistory.group.GroupCallLogActivity;

/* renamed from: X.4cv  reason: invalid class name and case insensitive filesystem */
public class C89724cv implements View.OnClickListener {
    public final Object A00;
    public final String A01;
    public final boolean A02;

    public final void onClick(View view) {
        GroupCallLogActivity groupCallLogActivity = (GroupCallLogActivity) this.A00;
        Uri parse = Uri.parse(AnonymousClass74H.A07(this.A01, this.A02));
        AnonymousClass1VP r2 = groupCallLogActivity.A03;
        groupCallLogActivity.A01.A03();
        C63982u1.A06(parse, groupCallLogActivity, groupCallLogActivity.A05, r2, 13);
    }

    public C89724cv(GroupCallLogActivity groupCallLogActivity, String str, boolean z) {
        this.A00 = groupCallLogActivity;
        this.A01 = str;
        this.A02 = z;
    }
}
