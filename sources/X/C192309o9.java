package X;

/* renamed from: X.9o9  reason: invalid class name and case insensitive filesystem */
public class C192309o9 {
    public final C18010vc A00;
    public final AnonymousClass11P A01;

    public long A00() {
        long A05 = C17890vO.A05(this.A00.A05("AccountDefenceLocalDataRepository_prefs"), "com.whatsapp.registration.accountdefence.AccountDefenceLocalDataRepository.account_defence_original_sms_wait_time");
        C17900vP.A0m("AccountDefenceLocalDataRepository/get-original-sms-wait-time-diff ", AnonymousClass000.A10(), A05);
        return A05;
    }

    public long A01() {
        long A05 = C17890vO.A05(this.A00.A05("AccountDefenceLocalDataRepository_prefs"), "com.whatsapp.registration.accountdefence.AccountDefenceLocalDataRepository.account_defence_original_voice_wait_time");
        C17900vP.A0m("AccountDefenceLocalDataRepository/get-original-voice-wait-time-diff ", AnonymousClass000.A10(), A05);
        return A05;
    }

    public C192309o9(AnonymousClass11P r1, C18010vc r2) {
        this.A01 = r1;
        this.A00 = r2;
    }
}
