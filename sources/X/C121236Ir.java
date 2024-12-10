package X;

import android.widget.ImageButton;

/* renamed from: X.6Ir  reason: invalid class name and case insensitive filesystem */
public final class C121236Ir extends C114105qA {
    public final /* synthetic */ AnonymousClass72I A00;

    public void C65(C43191zP r8) {
        C18070vi.A0d(r8, 0);
        super.C65(r8);
        AnonymousClass72I r0 = this.A00;
        ImageButton imageButton = r0.A00;
        imageButton.setAlpha((float) A00(r8, 0.0f, 1.0f));
        float A002 = (float) A00(r8, 1.0f, 0.0f);
        ImageButton imageButton2 = r0.A01;
        imageButton2.setScaleX(A002);
        imageButton2.setScaleY(A002);
        if (r8.A07.A00 >= ((double) this.A00)) {
            imageButton.setVisibility(4);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C121236Ir(AnonymousClass72I r3) {
        super(r3, 2.0f, 0.0f);
        this.A00 = r3;
    }
}
