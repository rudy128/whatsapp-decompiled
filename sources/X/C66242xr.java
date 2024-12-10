package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.util.Log;

/* renamed from: X.2xr  reason: invalid class name and case insensitive filesystem */
public abstract class C66242xr implements C36851oZ {
    public void BmD() {
    }

    public void BmE(boolean z) {
    }

    public void BmF(long j, long j2) {
    }

    public void BmG(long j, long j2) {
    }

    public void BmH(long j, long j2) {
    }

    public void BmI(long j, long j2) {
    }

    public void BmJ(long j, long j2) {
    }

    public void BmK(int i) {
    }

    public void BmL() {
    }

    public void BmM(long j, long j2) {
    }

    public void BmN() {
    }

    public void Bsb() {
    }

    public void BtJ(int i) {
    }

    public void BtL(int i, Bundle bundle) {
    }

    public void ByU(boolean z) {
    }

    public void ByV(long j, long j2) {
    }

    public void ByW() {
    }

    public void C4d() {
    }

    public void C9a() {
    }

    public static int A01(long j, int i, long j2) {
        if (i > 0) {
            return (int) ((j * 100) / j2);
        }
        return -1;
    }

    public void Bkn(boolean z) {
        String str;
        if (this instanceof C45812Bt) {
            C45812Bt r2 = (C45812Bt) this;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("deleteacctconfirm/gdrive-observer/deletion-finished/");
            if (z) {
                str = "success";
            } else {
                str = "failed";
            }
            C17890vO.A1A(A10, str);
            r2.A00.open();
        }
    }

    public void BtK(int i, Bundle bundle) {
        if (this instanceof C45822Bu) {
            C45822Bu r3 = (C45822Bu) this;
            ConversationsFragment conversationsFragment = r3.A04;
            if (conversationsFragment.A1b()) {
                r3.A00 = 2;
                if (i != 10) {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("conversations-gdrive-observer/error-during-restore/");
                    C17890vO.A1A(A10, C41361wE.A03(i));
                    C45822Bu.A00(r3, conversationsFragment.A1H(2131890703), conversationsFragment.A1H(2131890668), 1, 0, false);
                    conversationsFragment.A10.A05();
                }
            }
        }
    }

    public void Bxy() {
        AnonymousClass1FL A1B;
        if (this instanceof C45822Bu) {
            C45822Bu r4 = (C45822Bu) this;
            Log.i("conversations-gdrive-observer/restore-cancelled");
            ConversationsFragment conversationsFragment = r4.A04;
            if (conversationsFragment.A1b() && (A1B = conversationsFragment.A1B()) != null && !A1B.isFinishing()) {
                conversationsFragment.A0r.A0J(new C70633Bw(r4, A1B, 19));
            }
        }
    }

    public void Bxz(long j, boolean z) {
        AnonymousClass1FL A1B;
        if (this instanceof C45822Bu) {
            C45822Bu r6 = (C45822Bu) this;
            C17900vP.A0n("conversations-gdrive-observer/restore-end ", AnonymousClass000.A10(), z);
            ConversationsFragment conversationsFragment = r6.A04;
            if (conversationsFragment.A1b() && (A1B = conversationsFragment.A1B()) != null) {
                r6.A00 = 8;
                r6.A01 = -1;
                String A0q = C17880vN.A0q(A1B, C88584aA.A03(conversationsFragment.A1t, j), new Object[1], 0, 2131890697);
                if (j > 0) {
                    C45822Bu.A00(r6, A1B.getString(2131890704), A0q, 3, 100, false);
                } else if (j == 0) {
                    Log.i("conversations-gdrive-observer/restore-end/nothing-to-restore");
                    if (!A1B.isFinishing()) {
                        conversationsFragment.A0r.A0J(new C70633Bw(r6, A1B, 20));
                    }
                } else {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("conversations-gdrive-observer/restore-end restored: ");
                    A10.append(j);
                    A10.append(" result: ");
                    A10.append(z);
                    C17890vO.A0w(A10);
                }
            }
        }
    }

    public void By0(long j, long j2) {
        if (this instanceof C45822Bu) {
            C45822Bu r5 = (C45822Bu) this;
            Log.i("conversations-gdrive-observer/restore-paused/no-data-connection");
            ConversationsFragment conversationsFragment = r5.A04;
            if (conversationsFragment.A1b()) {
                r5.A00 = 4;
                A02(conversationsFragment, r5, conversationsFragment.A1H(2131890700), A01(j, (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1)), j2));
            }
        }
    }

    public void By1(long j, long j2) {
        if (this instanceof C45822Bu) {
            C45822Bu r5 = (C45822Bu) this;
            Log.i("conversations-gdrive-observer/restore-paused/low-battery");
            ConversationsFragment conversationsFragment = r5.A04;
            if (conversationsFragment.A1b()) {
                r5.A00 = 5;
                A02(conversationsFragment, r5, conversationsFragment.A1H(2131890699), A01(j, (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1)), j2));
            }
        }
    }

    public void By2(long j, long j2) {
        if (this instanceof C45822Bu) {
            C45822Bu r4 = (C45822Bu) this;
            Log.i("conversations-gdrive-observer/restore-paused/sdcard-missing");
            ConversationsFragment conversationsFragment = r4.A04;
            if (conversationsFragment.A1b()) {
                r4.A00 = 7;
                C45822Bu.A00(r4, conversationsFragment.A1H(2131890705), conversationsFragment.A1H(2131890739), 4, A01(j, (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1)), j2), false);
            }
        }
    }

    public void By3(long j, long j2) {
        if (this instanceof C45822Bu) {
            C45822Bu r5 = (C45822Bu) this;
            Log.i("conversations-gdrive-observer/restore-paused/sdcard-unmounted");
            ConversationsFragment conversationsFragment = r5.A04;
            if (conversationsFragment.A1b()) {
                r5.A00 = 6;
                A02(conversationsFragment, r5, conversationsFragment.A1H(2131892326), A01(j, (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1)), j2));
            }
        }
    }

    public void By4(long j, long j2) {
        if (this instanceof C45822Bu) {
            C45822Bu r5 = (C45822Bu) this;
            Log.i("conversations-gdrive-observer/restore-paused/no-wifi");
            ConversationsFragment conversationsFragment = r5.A04;
            if (conversationsFragment.A1b()) {
                r5.A00 = 3;
                A02(conversationsFragment, r5, conversationsFragment.A1H(2131890701), A01(j, (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1)), j2));
            }
        }
    }

    public void By5(int i) {
        if (this instanceof C45822Bu) {
            C45822Bu r8 = (C45822Bu) this;
            ConversationsFragment conversationsFragment = r8.A04;
            if (conversationsFragment.A1b()) {
                int i2 = i;
                if (i > 0) {
                    r8.A00 = 10;
                    C45822Bu.A00(r8, conversationsFragment.A1H(2131899059), conversationsFragment.A1I(2131890702, conversationsFragment.A1t.A0M().format(((double) i) / 100.0d)), 4, i2, true);
                }
            }
        }
    }

    public void By6() {
        if (this instanceof C45822Bu) {
            C45822Bu r2 = (C45822Bu) this;
            Log.i("conversations-gdrive-observer/restore-start");
            ConversationsFragment conversationsFragment = r2.A04;
            if (conversationsFragment.A1b()) {
                r2.A00 = 9;
                C45822Bu.A00(r2, conversationsFragment.A1H(2131899059), conversationsFragment.A1H(2131899058), 4, -1, true);
            }
        }
    }

    public void By7(long j, long j2) {
        long j3 = j;
        if (this instanceof C45822Bu) {
            C45822Bu r13 = (C45822Bu) this;
            ConversationsFragment conversationsFragment = r13.A04;
            if (conversationsFragment.A1b() && conversationsFragment.A1B() != null) {
                String A03 = C88584aA.A03(conversationsFragment.A1t, j3);
                if (r13.A00 != 1 || !A03.equals(C88584aA.A03(conversationsFragment.A1t, r13.A01))) {
                    r13.A01 = j3;
                    String A1H = conversationsFragment.A1H(2131899059);
                    Object[] A1b = AnonymousClass000.A1b(A03, 3);
                    long j4 = j2;
                    A1b[1] = C88584aA.A03(conversationsFragment.A1t, j4);
                    A1b[2] = conversationsFragment.A1t.A0M().format(((double) j3) / ((double) j4));
                    C45822Bu.A00(r13, A1H, conversationsFragment.A1I(2131890698, A1b), 3, (int) ((j * 100) / j2), true);
                    r13.A00 = 1;
                }
            }
        }
    }

    public static void A02(Fragment fragment, C45822Bu r6, String str, int i) {
        C45822Bu.A00(r6, fragment.A1H(2131890705), str, 3, i, false);
    }
}
