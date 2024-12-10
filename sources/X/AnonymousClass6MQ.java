package X;

import android.util.Pair;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.6MQ  reason: invalid class name */
public final class AnonymousClass6MQ extends A34 {
    public final AnonymousClass11E A00;
    public final AnonymousClass1M9 A01;
    public final C678831f A02;
    public final AnonymousClass1OZ A03;
    public final Integer A04;
    public final String A05;
    public final WeakReference A06;

    public AnonymousClass6MQ(AnonymousClass11E r2, AnonymousClass1M9 r3, AnonymousClass8AN r4, C678831f r5, AnonymousClass1OZ r6, Integer num, String str) {
        C18070vi.A0d(r6, 3);
        this.A05 = str;
        this.A03 = r6;
        this.A02 = r5;
        this.A01 = r3;
        this.A00 = r2;
        this.A04 = num;
        this.A06 = AnonymousClass3MW.A0z(r4);
    }

    public void A0E() {
        AnonymousClass8AN r0 = (AnonymousClass8AN) this.A06.get();
        if (r0 != null) {
            r0.BuF();
        }
    }

    public void A0F() {
        AnonymousClass8AN r0 = (AnonymousClass8AN) this.A06.get();
        if (r0 != null) {
            r0.BuH();
        }
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        Object obj;
        Object obj2;
        C188829i3 r2;
        String str;
        AnonymousClass1E7 r3 = null;
        if (!this.A00.A09()) {
            obj = C62602rf.A04;
        } else {
            try {
                this.A03.A0E(32000);
                Pair A032 = this.A02.A03(AnonymousClass2R1.A0F, this.A04, this.A05);
                if (!(!((C62602rf) A032.first).A01() || (obj2 = A032.second) == null || (r2 = (C188829i3) obj2) == null)) {
                    int i = r2.A04;
                    if (Integer.valueOf(i) != null) {
                        if (i == 1) {
                            UserJid userJid = r2.A0D;
                            if (userJid != null) {
                                r3 = this.A01.A0H(userJid);
                            }
                        } else {
                            if (i == 2) {
                                str = "handlecontactlesssync/fetchContactUsingNumber/user/not-wa/";
                            } else if (i == 3) {
                                str = "handlecontactlesssync/fetchContactUsingNumber/invalid/";
                            }
                            Log.e(str);
                        }
                    }
                }
                obj = A032.first;
            } catch (C36811oV e) {
                C108995ce.A1M("handlecontactlesssync/fetchContactUsingNumber/exception: ", AnonymousClass000.A10(), e);
                return AnonymousClass1D6.A01(C62602rf.A04, (Object) null);
            }
        }
        return AnonymousClass1D6.A01(obj, r3);
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        int i;
        AnonymousClass1D6 r5 = (AnonymousClass1D6) obj;
        C18070vi.A0d(r5, 0);
        WeakReference weakReference = this.A06;
        AnonymousClass8AN r2 = (AnonymousClass8AN) weakReference.get();
        if (r2 != null) {
            r2.Bvd();
            C62602rf r1 = (C62602rf) r5.first;
            if (r1.A01()) {
                AnonymousClass1E7 r0 = (AnonymousClass1E7) r5.second;
                if (r0 != null) {
                    r2.BuG(r0);
                    return;
                }
                AnonymousClass8AN r12 = (AnonymousClass8AN) weakReference.get();
                if (r12 != null) {
                    r12.BuG((AnonymousClass1E7) null);
                    return;
                }
                return;
            }
            int i2 = r1.A00;
            if (i2 == 0) {
                Log.w("handlecontactlesssync/fetchContactUsingNumber/network-unavailable/");
                i = 0;
            } else if (i2 == 5) {
                Log.w("handlecontactlesssync/fetchContactUsingNumber/rateLimited/try-again-later/");
                i = 2;
            } else if (i2 == 4) {
                Log.w("handlecontactlesssync/fetchContactUsingNumber/try-again/");
                i = 1;
            } else if (i2 == 1) {
                Log.w("handlecontactlesssync/fetchContactUsingNumber/existing request ongoing/");
                return;
            } else if (i2 == 6) {
                Log.w("handlecontactlesssync/fetchContactUsingNumber/exception-occurred/");
                i = 3;
            } else {
                return;
            }
            r2.C5X(i);
        }
    }
}
