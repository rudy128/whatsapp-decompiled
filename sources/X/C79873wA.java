package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import com.whatsapp.pininchat.expirationDialog.PinInChatExpirationDialogFragment;

/* renamed from: X.3wA  reason: invalid class name and case insensitive filesystem */
public final class C79873wA extends C94974lU {
    public final AnonymousClass1KB A00;
    public final AnonymousClass1WF A01;
    public final C62262r7 A02;
    public final AnonymousClass10I A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final C33251iW A07;
    public final C18030ve A08;
    public final AnonymousClass00H A09;

    public Drawable BSc(Context context, C18000vb r3) {
        C18070vi.A0d(context, 0);
        return C24261Jm.A00(context, 2131233410);
    }

    public static final void A00(AnonymousClass1FU r3, C79873wA r4, AnonymousClass206 r5) {
        r4.A09.get();
        C24521Kq r0 = C24521Kq.$redex_init_class;
        PinInChatExpirationDialogFragment pinInChatExpirationDialogFragment = new PinInChatExpirationDialogFragment();
        Bundle A0D = C17880vN.A0D();
        AnonymousClass4aU.A0A(A0D, r5.A0v);
        pinInChatExpirationDialogFragment.A1R(A0D);
        pinInChatExpirationDialogFragment.A05 = r5;
        pinInChatExpirationDialogFragment.A2F(r3.getSupportFragmentManager(), "PinInChatExpirationDialogFragment");
        r4.A02.A00(r5, 38, C111195io.A0C.A00());
    }

    public boolean BRj() {
        return true;
    }

    public int getId() {
        return 24;
    }

    public C79873wA(AnonymousClass1KB r1, C33251iW r2, AnonymousClass1WF r3, C18030ve r4, C62262r7 r5, AnonymousClass10I r6, AnonymousClass00H r7, AnonymousClass00H r8, AnonymousClass00H r9, AnonymousClass00H r10) {
        C18070vi.A0w(r4, r1, r6, r2, r7);
        C18070vi.A0x(r8, r3, r5, r9, r10);
        this.A08 = r4;
        this.A00 = r1;
        this.A03 = r6;
        this.A07 = r2;
        this.A06 = r7;
        this.A05 = r8;
        this.A01 = r3;
        this.A02 = r5;
        this.A09 = r9;
        this.A04 = r10;
    }

    public String BaW(C108015az r3) {
        return C18070vi.A0F(C72463Mc.A0E(r3), 2131894571);
    }
}
