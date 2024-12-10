package X;

import com.whatsapp.chatlock.passcode.ChatLockPasscodeManager;
import com.whatsapp.util.Log;

/* renamed from: X.3S3  reason: invalid class name */
public final class AnonymousClass3S3 extends C02120Cu {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass4EF A01;
    public final /* synthetic */ AnonymousClass4Q2 A02;
    public final /* synthetic */ AnonymousClass4OS A03;
    public final /* synthetic */ C93844jd A04;

    public void A02(int i, CharSequence charSequence) {
        C93844jd r3;
        C18070vi.A0d(charSequence, 1);
        Log.i("ChatLockAuthActivity/error");
        if (i == 13) {
            r3 = this.A04;
            if (ChatLockPasscodeManager.A01(r3.A03) && !(this.A01 instanceof C76883oa)) {
                AnonymousClass4OS r1 = this.A03;
                ((C93834jc) r1.A04.A0H.get()).BCo(r1.A01, r1.A02, r1.A03, (AnonymousClass4OS) null, r1.A00);
                r3.A00 = null;
            }
        }
        this.A02.A00(charSequence, i, this.A00, 1);
        r3 = this.A04;
        AnonymousClass3MX.A0a(r3.A02).A02(this.A01, Integer.valueOf(i));
        r3.A00 = null;
    }

    public AnonymousClass3S3(AnonymousClass4EF r1, AnonymousClass4Q2 r2, AnonymousClass4OS r3, C93844jd r4, int i) {
        this.A04 = r4;
        this.A01 = r1;
        this.A03 = r3;
        this.A02 = r2;
        this.A00 = i;
    }

    public void A00() {
        C93844jd r6 = this.A04;
        AnonymousClass00H r5 = r6.A02;
        AnonymousClass4VV A0a = AnonymousClass3MX.A0a(r5);
        AnonymousClass4EF r4 = this.A01;
        A0a.A03(r4, Integer.valueOf(this.A00), C17880vN.A0h(), 10);
        AnonymousClass3MX.A0a(r5).A02(r4, (Integer) null);
        AnonymousClass4Q2 r1 = this.A02;
        Log.i("ChatLockAuthCallbackBase/authfail");
        r1.A00.C3e(new AnonymousClass4YL(AnonymousClass00R.A0Y, (Integer) null, (Integer) null));
        r6.A00 = null;
    }

    public void A01() {
        Log.i("ChatLockAuthActivity/success");
        C93844jd r5 = this.A04;
        AnonymousClass3MX.A0a(r5.A02).A03(this.A01, Integer.valueOf(this.A00), C17880vN.A0h(), 3);
        this.A02.A00.C3e(new AnonymousClass4YL(AnonymousClass00R.A00, (Integer) null, (Integer) null));
        r5.A00 = null;
    }
}
