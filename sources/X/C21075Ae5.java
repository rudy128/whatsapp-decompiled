package X;

import android.view.View;
import com.whatsapp.biz.linkedaccounts.LinkedAccountMediaView;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

/* renamed from: X.Ae5  reason: case insensitive filesystem */
public final /* synthetic */ class C21075Ae5 implements C107705aS {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AVS A01;
    public final /* synthetic */ UserJid A02;
    public final /* synthetic */ ArrayList A03;

    public final void Bp3(View view) {
        AVS avs = this.A01;
        UserJid userJid = this.A02;
        ArrayList arrayList = this.A03;
        int i = this.A00;
        View view2 = view;
        if (view.getTag(2131432150) != null) {
            int i2 = avs.A02;
            int i3 = 21;
            if (i2 == 0) {
                i3 = 18;
            }
            AnonymousClass72R r0 = avs.A06;
            C1417376t r6 = avs.A07;
            r0.A04(r6, i3);
            LinkedAccountMediaView.A03(avs.A03, view2, r6, userJid, AnonymousClass001.A1H("thumb-transition-", ((AnonymousClass77G) arrayList.get(i)).A01.A04, AnonymousClass000.A10()), arrayList, i, i2, 0, avs.A0C);
        }
    }

    public /* synthetic */ C21075Ae5(AVS avs, UserJid userJid, ArrayList arrayList, int i) {
        this.A01 = avs;
        this.A02 = userJid;
        this.A03 = arrayList;
        this.A00 = i;
    }
}
