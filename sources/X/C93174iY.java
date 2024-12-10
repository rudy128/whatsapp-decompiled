package X;

import android.content.Context;

/* renamed from: X.4iY  reason: invalid class name and case insensitive filesystem */
public final class C93174iY implements C108835cN {
    public final C84674Kk A00;
    public final AnonymousClass1V9 A01;
    public final String A02;

    public C93174iY(C84674Kk r2, AnonymousClass1V9 r3, String str) {
        C18070vi.A0d(r2, 2);
        this.A02 = str;
        this.A00 = r2;
        this.A01 = r3;
    }

    public /* bridge */ /* synthetic */ void Bop(Object obj) {
        Context context = (Context) obj;
        C18070vi.A0d(context, 0);
        this.A01.A00(7, 37);
        AnonymousClass1VE r1 = this.A00.A00;
        if (!C17880vN.A1W(AnonymousClass1VE.A00(r1), "permanently_hide_return_to_call_text")) {
            AnonymousClass3MZ.A08(r1).putBoolean("permanently_hide_return_to_call_text", true).commit();
        }
        C87394Vk.A00(this.A02).A2C(((AnonymousClass1FL) AnonymousClass1L9.A01(context, AnonymousClass1FY.class)).getSupportFragmentManager(), "AudioChatBottomSheetDialog");
    }
}
