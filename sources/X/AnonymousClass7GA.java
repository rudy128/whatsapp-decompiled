package X;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.status.playback.MessageReplyActivity;

/* renamed from: X.7GA  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7GA implements C107375Zl {
    public final /* synthetic */ Resources A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ ViewGroup A02;
    public final /* synthetic */ ImageView A03;
    public final /* synthetic */ MessageReplyActivity A04;
    public final /* synthetic */ boolean A05;

    public final void C5m(int[] iArr) {
        MessageReplyActivity messageReplyActivity = this.A04;
        boolean z = this.A05;
        ViewGroup viewGroup = this.A02;
        messageReplyActivity.A4c(this.A00, this.A01, viewGroup, this.A03, iArr, z);
    }

    public /* synthetic */ AnonymousClass7GA(Resources resources, View view, ViewGroup viewGroup, ImageView imageView, MessageReplyActivity messageReplyActivity, boolean z) {
        this.A04 = messageReplyActivity;
        this.A05 = z;
        this.A02 = viewGroup;
        this.A01 = view;
        this.A03 = imageView;
        this.A00 = resources;
    }
}
