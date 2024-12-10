package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.whatsapp.util.Log;

/* renamed from: X.3w6  reason: invalid class name and case insensitive filesystem */
public final class C79833w6 extends C94974lU {
    public final C33251iW A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass11P A03;
    public final C62262r7 A04;
    public final AnonymousClass10I A05;

    public final boolean A02(AnonymousClass1FU r13, AnonymousClass206 r14, int i) {
        C73203Rj r1;
        int i2;
        long j;
        AnonymousClass206 r7 = r14;
        boolean A17 = C18070vi.A17(r14, r13);
        AnonymousClass4XQ r2 = (AnonymousClass4XQ) this.A02.get();
        Integer num = AnonymousClass00R.A01;
        if (r2.A01.A09()) {
            if (!AnonymousClass4XQ.A00(r2, r14, num)) {
                num = AnonymousClass00R.A0N;
            } else {
                num = AnonymousClass00R.A00;
            }
        }
        int intValue = num.intValue();
        if (intValue == A17) {
            Log.w("UnpinInChatSelectionAction/execute Cannot unpin message with no connection.");
            r1 = AnonymousClass4a6.A00(r13);
            i2 = 2131894580;
            r1.A0D(i2);
            r1.A0g(r13, (C22851Dl) null, 2131899286);
            AnonymousClass3MY.A1G(r1);
        } else if (intValue == 3) {
            Log.w("UnpinInChatSelectionAction/execute Cannot unpin message with other error.");
            r1 = AnonymousClass4a6.A00(r13);
            i2 = 2131894579;
            r1.A0D(i2);
            r1.A0g(r13, (C22851Dl) null, 2131899286);
            AnonymousClass3MY.A1G(r1);
        } else if (intValue == 0) {
            C98704ra.A00(this.A05, this, r14, 14);
            AnonymousClass22C A032 = C63892tr.A03(r14);
            if (A032 == null) {
                return true;
            }
            C62262r7 r6 = this.A04;
            AnonymousClass11P r12 = this.A03;
            if (!A032.A1D(r12)) {
                j = C17880vN.A04(A032.A01 - AnonymousClass11P.A01(r12));
            } else {
                j = 0;
            }
            r6.A01.execute(new DTZ(r6, r7, i, 2, j));
            return true;
        } else if (intValue == 2) {
            Log.e("UnpinInChatSelectionAction/execute Unreacheable/impossible states for unpin.");
        } else {
            throw AnonymousClass3MW.A14();
        }
        return false;
    }

    public Drawable BSc(Context context, C18000vb r3) {
        C18070vi.A0d(context, 0);
        return C24261Jm.A00(context, 2131233180);
    }

    public boolean BRj() {
        return true;
    }

    public int getId() {
        return 25;
    }

    public C79833w6(C33251iW r2, AnonymousClass11P r3, C62262r7 r4, AnonymousClass10I r5, AnonymousClass00H r6, AnonymousClass00H r7) {
        C18070vi.A0w(r3, r2, r6, r5, r7);
        C18070vi.A0d(r4, 6);
        this.A03 = r3;
        this.A00 = r2;
        this.A02 = r6;
        this.A05 = r5;
        this.A01 = r7;
        this.A04 = r4;
    }

    public String BaW(C108015az r3) {
        return C18070vi.A0F(C72463Mc.A0E(r3), 2131894572);
    }
}
