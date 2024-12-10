package X;

import android.view.View;
import com.whatsapp.calling.callhistory.group.GroupCallLogActivity;

/* renamed from: X.4dm  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C90254dm implements View.OnLongClickListener {
    public final /* synthetic */ GroupCallLogActivity A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ boolean A02;

    public final boolean onLongClick(View view) {
        return this.A00.A4b(this.A01, this.A02);
    }

    public /* synthetic */ C90254dm(GroupCallLogActivity groupCallLogActivity, String str, boolean z) {
        this.A00 = groupCallLogActivity;
        this.A02 = z;
        this.A01 = str;
    }
}
