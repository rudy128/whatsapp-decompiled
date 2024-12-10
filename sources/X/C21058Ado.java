package X;

import com.whatsapp.stickers.StickerView;

/* renamed from: X.Ado  reason: case insensitive filesystem */
public final /* synthetic */ class C21058Ado implements AnonymousClass889 {
    public final /* synthetic */ AQ4 A00;
    public final /* synthetic */ C1418377d A01;
    public final /* synthetic */ Integer A02;

    public final void C6q(boolean z) {
        AQ4 aq4 = this.A00;
        C1418377d r5 = this.A01;
        Integer num = this.A02;
        if (z) {
            AnonymousClass3Ma.A1D(aq4.A04, aq4, 41);
            aq4.A0B.setVisibility(8);
            aq4.A06.setVisibility(8);
            aq4.A0D = r5;
            aq4.A0F = num;
            aq4.A0E.setContentDescription(AnonymousClass73J.A00(aq4.A0G, r5));
            StickerView stickerView = aq4.A0E;
            stickerView.A02 = true;
            stickerView.A07();
            return;
        }
        aq4.A07.setVisibility(8);
        aq4.A0B.setVisibility(0);
        aq4.A06.setVisibility(0);
    }

    public /* synthetic */ C21058Ado(AQ4 aq4, C1418377d r2, Integer num) {
        this.A00 = aq4;
        this.A01 = r2;
        this.A02 = num;
    }
}
