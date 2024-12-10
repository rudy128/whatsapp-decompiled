package X;

import com.whatsapp.WaEditText;
import com.whatsapp.gifsearch.GifSearchContainer;

/* renamed from: X.4nO  reason: invalid class name and case insensitive filesystem */
public final class C96154nO implements AnonymousClass87C {
    public final /* synthetic */ C80753xv A00;
    public final /* synthetic */ C140126zz A01;

    public void BvG(AnonymousClass77J r4, boolean z) {
        GifSearchContainer gifSearchContainer;
        C18070vi.A0d(r4, 0);
        AnonymousClass736 r2 = this.A01.A07;
        AnonymousClass4VT r0 = r2.A01;
        if (r0 != null) {
            r0.A02.A04(false);
            r2.A01 = null;
        }
        C80753xv r1 = this.A00;
        C28931bI r02 = r1.A04;
        if (r02 == null || (gifSearchContainer = (GifSearchContainer) r02.A02()) == null) {
            gifSearchContainer = r1.A02;
            C17960vV.A05(gifSearchContainer);
            C18070vi.A0X(gifSearchContainer);
        }
        WaEditText waEditText = gifSearchContainer.A06;
        if (waEditText != null) {
            waEditText.A0H();
        }
        C107435Zr r03 = r1.A00;
        if (r03 != null) {
            r03.BvF(r4);
        }
    }

    public C96154nO(C80753xv r1, C140126zz r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
