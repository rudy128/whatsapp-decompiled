package X;

import android.content.Context;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

/* renamed from: X.3cD  reason: invalid class name and case insensitive filesystem */
public final class C74693cD extends C39381sz {
    public int A00 = 0;
    public int A01 = 0;
    public final int A02;
    public final Context A03;
    public final AnonymousClass4KS A04;
    public final AnonymousClass4VK A05;
    public final C72803No A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74693cD(Context context, AnonymousClass4KS r3, AnonymousClass4VK r4, C72803No r5, int i) {
        super(context);
        C18070vi.A0d(r3, 5);
        this.A03 = context;
        this.A05 = r4;
        this.A02 = i;
        this.A06 = r5;
        this.A04 = r3;
    }

    public void C8s(MotionEvent motionEvent, View view) {
        C18070vi.A0d(view, 0);
        if (motionEvent.getAction() == 1) {
            Layout layout = ((TextView) view).getLayout();
            C18070vi.A0X(layout);
            this.A00 = (int) layout.getPrimaryHorizontal(this.A02);
            int round = Math.round(motionEvent.getRawY());
            Context context = this.A03;
            this.A01 = (round - AnonymousClass3MW.A01(context.getResources(), 2131167087)) - AnonymousClass3MW.A01(context.getResources(), 2131167088);
        }
        super.C8s(motionEvent, view);
    }

    public void onClick(View view) {
        C18070vi.A0d(view, 0);
        AnonymousClass4KS r1 = this.A04;
        Context context = this.A03;
        AnonymousClass4VK r6 = this.A05;
        String str = this.A06.A00;
        AnonymousClass10E r12 = r1.A00.A00;
        AnonymousClass3RP r3 = new AnonymousClass3RP(context, AnonymousClass3MZ.A0l(r12), r6, C000200d.A00(r12.A4b), C000200d.A00(r12.AC1), C000200d.A00(r12.AA9), C000200d.A00(r12.A0n), str);
        r3.showAtLocation(view, 0, this.A00, this.A01);
        r3.update();
    }
}
