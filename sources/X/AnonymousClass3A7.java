package X;

import com.whatsapp.chatlock.passcode.ChatLockPasscodeManager;

/* renamed from: X.3A7  reason: invalid class name */
public final class AnonymousClass3A7 implements C72303Lk {
    public final AnonymousClass1TK A00;
    public final ChatLockPasscodeManager A01;

    public /* synthetic */ void Bld() {
    }

    public void Blc() {
        if (!C17880vN.A1W(C17890vO.A0B(this.A00.A00), "chat_lock_broken_encoding_checked")) {
            this.A01.A03();
        }
    }

    public AnonymousClass3A7(AnonymousClass1TK r1, ChatLockPasscodeManager chatLockPasscodeManager) {
        C18070vi.A0j(chatLockPasscodeManager, r1);
        this.A01 = chatLockPasscodeManager;
        this.A00 = r1;
    }
}
