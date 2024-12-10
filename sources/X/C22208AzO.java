package X;

import android.view.Window;
import com.whatsapp.migration.transfer.ui.ChatTransferActivity;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.AzO  reason: case insensitive filesystem */
public final class C22208AzO extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C173628vP this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22208AzO(C173628vP r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        C173628vP r3 = this.this$0;
        if (AnonymousClass3MX.A1a((Boolean) obj)) {
            WDSButton wDSButton = r3.A05;
            if (wDSButton != null) {
                wDSButton.setVisibility(0);
                WDSButton wDSButton2 = r3.A05;
                if (wDSButton2 != null) {
                    wDSButton2.setText(2131897145);
                    WDSButton wDSButton3 = r3.A05;
                    if (wDSButton3 != null) {
                        C90054dS.A00(wDSButton3, r3, 17);
                        C28931bI r0 = ((ChatTransferActivity) r3).A09;
                        if (r0 == null) {
                            str = "qrCodeViewStub";
                        } else {
                            C18070vi.A05(r0.A02(), 2131429065).setAlpha(0.1f);
                            r3.A4e(new C90054dS(r3, 18), 2131232878);
                            C192109no r1 = r3.A03;
                            if (r1 != null) {
                                Window window = r3.getWindow();
                                C18070vi.A0X(window);
                                r1.A00(window);
                            } else {
                                str = "brightnessController";
                            }
                        }
                        C18070vi.A11(str);
                        throw null;
                    }
                }
            }
            str = "primaryBtn";
            C18070vi.A11(str);
            throw null;
        }
        return C27621Wu.A00;
    }
}
