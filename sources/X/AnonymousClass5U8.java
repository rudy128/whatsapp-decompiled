package X;

import com.whatsapp.settings.SettingsContactsActivity;

/* renamed from: X.5U8  reason: invalid class name */
public final class AnonymousClass5U8 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ SettingsContactsActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5U8(SettingsContactsActivity settingsContactsActivity) {
        super(1);
        this.this$0 = settingsContactsActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean A1Y = AnonymousClass000.A1Y(obj);
        C37301pI r1 = this.this$0.A0S;
        if (r1 != null) {
            r1.A02(A1Y, 0);
            return C27621Wu.A00;
        }
        C18070vi.A11("nativeContactsLogUtil");
        throw null;
    }
}
