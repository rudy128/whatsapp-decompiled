package X;

import android.os.Handler;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.camera.VoipLiteCamera;

/* renamed from: X.8GT  reason: invalid class name */
public final class AnonymousClass8GT extends AnonymousClass1J2 {
    public final Handler A00 = C17890vO.A0D();
    public final C22801Dg A01;
    public final AnonymousClass1DT A02 = AnonymousClass3MW.A0L();
    public final AnonymousClass1XL A03;
    public final C19830z4 A04;
    public final AnonymousClass2NV A05;
    public final C27361Vu A06;
    public final Runnable A07 = new C21449AkG((Object) this, 47);
    public final AnonymousClass1DS A08;
    public final AnonymousClass1DT A09;
    public final AnonymousClass1Cd A0A;
    public final AnonymousClass1WZ A0B;
    public final AnonymousClass19D A0C;
    public final C27371Vv A0D;
    public final C183569Yt A0E;
    public final C27391Vx A0F;

    public AnonymousClass8GT(AnonymousClass1XL r27, C33621j7 r28, C46152Dc r29, C19830z4 r30, AnonymousClass1Cd r31, AnonymousClass1WZ r32, AnonymousClass19D r33, C219017v r34, C203911y r35, C58802lH r36, C33841jT r37, C27371Vv r38, C27361Vu r39, C27391Vx r40, AnonymousClass1NR r41, AnonymousClass1Nb r42, AnonymousClass4aW r43, C170178or r44, AnonymousClass10I r45) {
        C46152Dc r11 = r29;
        AnonymousClass1XL r1 = r27;
        C108975cc.A10(r1, 1, r11);
        C170178or r2 = r44;
        C18070vi.A0d(r2, 17);
        this.A03 = r1;
        AnonymousClass1Cd r12 = r31;
        this.A0A = r12;
        this.A04 = r30;
        C27371Vv r8 = r38;
        this.A0D = r8;
        C27391Vx r7 = r40;
        this.A0F = r7;
        this.A06 = r39;
        AnonymousClass19D r14 = r33;
        this.A0C = r14;
        AnonymousClass1WZ r13 = r32;
        this.A0B = r13;
        AnonymousClass1DT A0L = AnonymousClass3MW.A0L();
        this.A09 = A0L;
        C22801Dg A0R = C108945cZ.A0R();
        this.A01 = A0R;
        C183569Yt r3 = new C183569Yt(this);
        this.A0E = r3;
        C219017v r15 = r34;
        AnonymousClass1Nb r21 = r42;
        AnonymousClass1NR r20 = r41;
        C33621j7 r10 = r28;
        C27371Vv r18 = r8;
        AnonymousClass2NV r9 = new AnonymousClass2NV(r10, r11, r12, r13, r14, r15, r35, r36, r18, this, r20, r21, r43, r2, r45, new C18150vq(r37, (C18140vp) null));
        this.A05 = r9;
        AnonymousClass1DT r22 = r9.A00;
        C18070vi.A0X(r22);
        this.A08 = r22;
        C20339AGv.A01(r22, A0R, new B0J(this), 48);
        A0R.A0H(A0L, new C20338AGu(this, 13));
        r7.registerObserver(r3);
        A00(this);
    }

    public static final void A05(AnonymousClass8GT r1, int i, int i2) {
        if (i == 1) {
            r1.A0D.A00.A04 = Integer.valueOf(i2);
        } else if (i == 2) {
            r1.A0D.A00.A07 = Integer.valueOf(i2);
        } else if (i == 3) {
            r1.A0D.A00.A08 = Integer.valueOf(i2);
        }
    }

    public static final void A00(AnonymousClass8GT r4) {
        AnonymousClass1Cd r0 = r4.A0A;
        r0.A06();
        if (r0.A08) {
            Log.i("DirectTransferBackgroundTaskViewModel/msg-store-is-already-ready");
            A05(r4, r4.A04.A0H(), 2);
            A04(r4, 6);
            return;
        }
        C19830z4 r1 = r4.A04;
        C17880vN.A1C(C19830z4.A00(r1), "migrate_from_other_app_attempt_count", r1.A0H() + 1);
        A03(r4);
        Integer num = 1;
        if (!num.equals(r4.A09.A06())) {
            Log.i("DirectTransferBackgroundTaskViewModel/startBackgroundTaskAfterOtherAppIsLoggedOut/start-background-task");
            A04(r4, 1);
            AnonymousClass2NV r12 = r4.A05;
            if (!((C33841jT) r12.A06.get()).A0G()) {
                AnonymousClass3MX.A1K(r12.A00, 0);
            } else {
                r12.A00();
            }
        }
    }

    public static final void A03(AnonymousClass8GT r5) {
        int i = C17890vO.A0B(r5.A04).getInt("direct_db_migration_timeout_in_secs", VoipLiteCamera.DEFAULT_SUPERNOVA_HEIGHT);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("DirectTransferBackgroundTaskViewModel/setupTimeout/timeout =");
        long A032 = C17890vO.A03(i);
        C17890vO.A16(A10, A032);
        if (i > 0) {
            r5.A00.postDelayed(r5.A07, A032);
        }
    }

    public void A0S() {
        Log.i("DirectTransferBackgroundTaskViewModel/removeAllListener");
        this.A00.removeCallbacks(this.A07);
        C22801Dg r1 = this.A01;
        r1.A0G(this.A09);
        r1.A0G(this.A08);
        this.A0F.unregisterObserver(this.A0E);
    }

    public static final void A04(AnonymousClass8GT r2, int i) {
        switch (i) {
            case 1:
            case 2:
            case 7:
                break;
            default:
                if (r2.A04.A0H() >= 3) {
                    A04(r2, 7);
                    return;
                }
                break;
        }
        AnonymousClass3MX.A1K(r2.A09, i);
    }
}
