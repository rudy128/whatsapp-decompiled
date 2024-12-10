package X;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.whatsapp.jid.UserJid;

/* renamed from: X.3w8  reason: invalid class name and case insensitive filesystem */
public final class C79853w8 extends C94974lU {
    public C30191dX A00;
    public C219217x A01;
    public C19830z4 A02;
    public final AnonymousClass11S A03;
    public final AnonymousClass1M9 A04;
    public final AnonymousClass12L A05;
    public final C36451nu A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass00H A0B;
    public final AnonymousClass1KB A0C;

    public final boolean A02(AnonymousClass01E r13, AnonymousClass4aY r14, AnonymousClass206 r15) {
        C18070vi.A0d(r15, 0);
        UserJid A032 = AnonymousClass126.A03(r15);
        if (A032 == null) {
            this.A0C.A08(2131890877, 0);
            return true;
        }
        AnonymousClass1E7 A0E = this.A04.A0E(A032);
        AnonymousClass01E r5 = r13;
        try {
            C36451nu r4 = this.A06;
            if (AnonymousClass3Ma.A1Y(r4)) {
                AnonymousClass1GP supportFragmentManager = r13.getSupportFragmentManager();
                C219217x r8 = this.A01;
                if (r8 != null) {
                    C30191dX r7 = this.A00;
                    if (r7 != null) {
                        C19830z4 r9 = this.A02;
                        if (r9 != null) {
                            r4.A05(r5, supportFragmentManager, r7, r8, r9, A0E, A032);
                            r13.getSupportFragmentManager().A0t(new AnonymousClass7A5(r13, r14, 1), r13, "request_bottom_sheet_fragment");
                        } else {
                            C18070vi.A11("waSharedPreferences");
                        }
                    } else {
                        C18070vi.A11("contactAccessHelper");
                    }
                } else {
                    C18070vi.A11("waPermissionsHelper");
                }
                throw null;
            }
            r13.startActivityForResult(r4.A02(A0E, A032, true), 13);
            C88654aI A0b = AnonymousClass3MW.A0b(this.A09);
            if (C18020vd.A05(C18040vf.A02, A0b.A03, 2805)) {
                C88654aI.A03(A0b, A032, (String) null, 21, true);
            }
            AnonymousClass3MW.A0m(this.A07).A06(true, 5);
            return true;
        } catch (ActivityNotFoundException unused) {
            AnonymousClass4Yv.A01(r13, 12);
            return true;
        }
    }

    public Drawable BSc(Context context, C18000vb r3) {
        C18070vi.A0d(context, 0);
        return C24261Jm.A00(context, 2131233261);
    }

    public boolean BRj() {
        return true;
    }

    public int getId() {
        return 10;
    }

    public C79853w8(AnonymousClass1KB r1, AnonymousClass11S r2, AnonymousClass1M9 r3, AnonymousClass12L r4, C36451nu r5, AnonymousClass00H r6, AnonymousClass00H r7, AnonymousClass00H r8, AnonymousClass00H r9, AnonymousClass00H r10) {
        C18070vi.A0w(r1, r2, r4, r6, r3);
        C18070vi.A0x(r7, r8, r5, r9, r10);
        this.A0C = r1;
        this.A03 = r2;
        this.A05 = r4;
        this.A08 = r6;
        this.A04 = r3;
        this.A0B = r7;
        this.A07 = r8;
        this.A06 = r5;
        this.A0A = r9;
        this.A09 = r10;
    }

    public String BaW(C108015az r3) {
        return C18070vi.A0F(C72463Mc.A0E(r3), 2131898687);
    }
}
