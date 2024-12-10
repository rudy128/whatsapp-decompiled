package X;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.calling.callhistory.group.GroupCallLogActivity;

/* renamed from: X.3ZP  reason: invalid class name */
public class AnonymousClass3ZP extends C42011xT {
    public final ImageButton A00;
    public final ImageButton A01;
    public final ImageView A02;
    public final TextView A03;
    public final C42141xh A04;
    public final /* synthetic */ GroupCallLogActivity A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3ZP(View view, GroupCallLogActivity groupCallLogActivity) {
        super(view);
        this.A05 = groupCallLogActivity;
        this.A02 = AnonymousClass3MW.A0H(view, 2131429433);
        this.A04 = C42141xh.A01(view, groupCallLogActivity.A00, 2131429428);
        this.A01 = (ImageButton) view.findViewById(2131428646);
        this.A00 = (ImageButton) view.findViewById(2131436740);
        this.A03 = C17880vN.A0E(view, 2131433431);
    }
}
