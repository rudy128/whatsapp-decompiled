package X;

import com.whatsapp.bot.metaai.imagine.AiImagineBottomSheetLauncher;

/* renamed from: X.7Ck  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7Ck implements C1598286a {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AiImagineBottomSheetLauncher A01;
    public final /* synthetic */ AnonymousClass1BI A02;

    public final void CAi() {
        AiImagineBottomSheetLauncher aiImagineBottomSheetLauncher = this.A01;
        AnonymousClass1BI r3 = this.A02;
        int i = this.A00;
        AnonymousClass00H r0 = aiImagineBottomSheetLauncher.A01;
        if (r0 != null) {
            AnonymousClass3MW.A0W(r0).A0A(r3, 11, i);
        } else {
            C18070vi.A11("bonsaiUiUtilLazy");
            throw null;
        }
    }

    public /* synthetic */ AnonymousClass7Ck(AiImagineBottomSheetLauncher aiImagineBottomSheetLauncher, AnonymousClass1BI r2, int i) {
        this.A01 = aiImagineBottomSheetLauncher;
        this.A02 = r2;
        this.A00 = i;
    }
}
