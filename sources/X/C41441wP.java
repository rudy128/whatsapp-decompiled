package X;

import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.whatsapp.WaTextView;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.util.Log;

/* renamed from: X.1wP  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C41441wP implements Runnable {
    public final /* synthetic */ ConversationsFragment A00;
    public final /* synthetic */ boolean A01;

    public final void run() {
        C38231qw r0;
        View findViewById;
        View view;
        int i;
        ConversationsFragment conversationsFragment = this.A00;
        boolean z = this.A01;
        if (C18020vd.A05(C18040vf.A01, conversationsFragment.A25, 9528)) {
            if (!z) {
                return;
            }
            if (C20134A8u.A07((AnonymousClass1NP) conversationsFragment.A2k.get())) {
                if (conversationsFragment.A1m != null && conversationsFragment.A09 == null) {
                    Log.i("conversations/gdrive-header/gdrive-media-restore-pending/show-view-recycler-view");
                    View inflate = conversationsFragment.A1D().getLayoutInflater().inflate(2131624983, conversationsFragment.A1m.BbU(), false);
                    conversationsFragment.A09 = inflate;
                    C38231qw r02 = conversationsFragment.A1m;
                    C18070vi.A0d(inflate, 1);
                    r02.BBD(inflate, true);
                    AnonymousClass1FL A1D = conversationsFragment.A1D();
                    conversationsFragment.A3c.get();
                    A1D.bindService(AnonymousClass1LU.A1M(conversationsFragment.A1B(), (String) null), conversationsFragment.A49, 1);
                    conversationsFragment.A0I = (ImageView) conversationsFragment.A09.findViewById(2131431171);
                    conversationsFragment.A0J = (ProgressBar) conversationsFragment.A09.findViewById(2131431174);
                    WaTextView waTextView = (WaTextView) conversationsFragment.A09.findViewById(2131431167);
                    conversationsFragment.A0w = waTextView;
                    C43421zm.A04(waTextView);
                    conversationsFragment.A0L = (TextView) conversationsFragment.A09.findViewById(2131431166);
                    conversationsFragment.A0I.setImageResource(2131232346);
                    ImageView imageView = conversationsFragment.A0I;
                    C110065es r2 = new C110065es();
                    r2.setDuration(2000);
                    r2.setRepeatCount(-1);
                    r2.setInterpolator(new LinearInterpolator());
                    r2.A00 = 0;
                    r2.A01 = true;
                    imageView.setAnimation(r2);
                    view = conversationsFragment.A09;
                    i = 18;
                } else {
                    return;
                }
            } else if (conversationsFragment.A0I != null) {
                Log.i("conversations/resume/gdrive-header/gdrive-media-restore-done/hide-view-recycler-view");
                conversationsFragment.A1m.CEk(conversationsFragment.A0I);
                conversationsFragment.A1D().unbindService(conversationsFragment.A49);
                conversationsFragment.A0I = null;
                return;
            } else {
                return;
            }
        } else if (z && (r0 = conversationsFragment.A1m) != null && (findViewById = r0.BbU().findViewById(2131431177)) != null) {
            int visibility = findViewById.getVisibility();
            boolean A07 = C20134A8u.A07((AnonymousClass1NP) conversationsFragment.A2k.get());
            if (visibility == 8) {
                if (A07) {
                    findViewById.setVisibility(0);
                    Log.i("conversations/gdrive-header/gdrive-media-restore-pending/show-view");
                    AnonymousClass1FL A1D2 = conversationsFragment.A1D();
                    conversationsFragment.A3c.get();
                    A1D2.bindService(AnonymousClass1LU.A1M(conversationsFragment.A1B(), (String) null), conversationsFragment.A49, 1);
                    View view2 = conversationsFragment.A09;
                    C17960vV.A05(view2);
                    view2.setVisibility(0);
                    conversationsFragment.A1m.CJ4();
                    conversationsFragment.A0I = (ImageView) conversationsFragment.A1m.BbU().findViewById(2131431171);
                    conversationsFragment.A0J = (ProgressBar) conversationsFragment.A1m.BbU().findViewById(2131431174);
                    WaTextView waTextView2 = (WaTextView) conversationsFragment.A1m.BbU().findViewById(2131431167);
                    conversationsFragment.A0w = waTextView2;
                    C43421zm.A04(waTextView2);
                    conversationsFragment.A0L = (TextView) conversationsFragment.A1m.BbU().findViewById(2131431166);
                    conversationsFragment.A0I.setImageResource(2131232346);
                    ImageView imageView2 = conversationsFragment.A0I;
                    C110065es r22 = new C110065es();
                    r22.setDuration(2000);
                    r22.setRepeatCount(-1);
                    r22.setInterpolator(new LinearInterpolator());
                    r22.A00 = 0;
                    r22.A01 = true;
                    imageView2.setAnimation(r22);
                    view = conversationsFragment.A09;
                    i = 16;
                } else {
                    return;
                }
            } else if (!A07) {
                Log.i("conversations/resume/gdrive-header/gdrive-media-restore-done/hide-view");
                conversationsFragment.A1m.BbU().findViewById(2131431177).setVisibility(8);
                conversationsFragment.A1D().unbindService(conversationsFragment.A49);
                return;
            } else {
                return;
            }
        } else {
            return;
        }
        view.setOnClickListener(new C89924dF(conversationsFragment, i));
    }

    public /* synthetic */ C41441wP(ConversationsFragment conversationsFragment, boolean z) {
        this.A00 = conversationsFragment;
        this.A01 = z;
    }
}
