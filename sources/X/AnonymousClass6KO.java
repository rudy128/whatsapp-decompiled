package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.updates.ui.UpdatesFragment;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.6KO  reason: invalid class name */
public abstract class AnonymousClass6KO extends C113585nK implements AnonymousClass85W {
    public final AnonymousClass1c4 A00;
    public final AnonymousClass7KN A01;
    public final UpdatesFragment A02;
    public final RecyclerView A03;
    public final WDSButton A04;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004c, code lost:
        if (r5 == false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0021, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r7.A00.A02, 10995) == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003c, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r7.A00.A02, 10995) != false) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0D(X.AnonymousClass6JR r8) {
        /*
            r7 = this;
            com.whatsapp.wds.components.button.WDSButton r3 = r7.A04
            boolean r5 = r8.A02
            r0 = r5 ^ 1
            r4 = 0
            int r0 = X.C72453Mb.A07(r0)
            r3.setVisibility(r0)
            boolean r6 = r8.A01
            if (r6 != 0) goto L_0x0023
            X.1c4 r0 = r7.A00
            X.0ve r2 = r0.A02
            r1 = 10995(0x2af3, float:1.5407E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r0, r2, r1)
            r0 = 2131889453(0x7f120d2d, float:1.941357E38)
            if (r1 != 0) goto L_0x0026
        L_0x0023:
            r0 = 2131892623(0x7f12198f, float:1.942E38)
        L_0x0026:
            r3.setText(r0)
            androidx.recyclerview.widget.RecyclerView r3 = r7.A03
            X.C18070vi.A0W(r3)
            if (r6 != 0) goto L_0x0044
            X.1c4 r0 = r7.A00
            X.0ve r2 = r0.A02
            r1 = 10995(0x2af3, float:1.5407E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0044
        L_0x003e:
            r4 = 8
        L_0x0040:
            r3.setVisibility(r4)
            return
        L_0x0044:
            java.util.List r0 = r8.A00
            boolean r0 = X.AnonymousClass000.A1a(r0)
            if (r0 == 0) goto L_0x003e
            if (r5 != 0) goto L_0x003e
            goto L_0x0040
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6KO.A0D(X.6JR):void");
    }

    public AnonymousClass6KO(View view, C131416l3 r5, C37451pZ r6, AnonymousClass1c4 r7, UpdatesFragment updatesFragment) {
        super(view);
        this.A00 = r7;
        this.A02 = updatesFragment;
        WDSButton wDSButton = (WDSButton) AnonymousClass3MX.A0C(view, 2131430865);
        this.A04 = wDSButton;
        RecyclerView A0Q = AnonymousClass3MX.A0Q(view, 2131434408);
        this.A03 = A0Q;
        C18070vi.A0V(A0Q);
        AnonymousClass7KN A002 = r5.A00(A0Q, r6, updatesFragment, false);
        this.A01 = A002;
        AnonymousClass3Ma.A1E(wDSButton, this, 22);
        A002.A00();
    }
}
