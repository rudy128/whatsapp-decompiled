package X;

import android.content.SharedPreferences;
import android.os.PowerManager;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;

/* renamed from: X.12E  reason: invalid class name */
public class AnonymousClass12E implements AnonymousClass12D, C201511a {
    public final C19880zA A00;
    public final C19880zA A01;
    public final C19880zA A02;
    public final AnonymousClass190 A03;
    public final AnonymousClass11S A04;
    public final C26261Rl A05;
    public final C25001Mm A06;
    public final C26271Rm A07;
    public final AnonymousClass11E A08;
    public final AnonymousClass1M9 A09;
    public final C26961Ue A0A;
    public final AnonymousClass1US A0B;
    public final C26861Tt A0C;
    public final C26931Ua A0D;
    public final AnonymousClass11P A0E;
    public final C26291Ro A0F;
    public final C24661Le A0G;
    public final C26281Rn A0H;
    public final C18030ve A0I;
    public final C26221Rh A0J;
    public final AnonymousClass00H A0K;
    public final AnonymousClass11C A0L;
    public final C19830z4 A0M;
    public final AnonymousClass1UN A0N;
    public final AnonymousClass10I A0O;
    public final AnonymousClass00H A0P;
    public final AnonymousClass00H A0Q;

    public void A0A() {
        AnonymousClass2R1 r0;
        Log.i("ContactSyncMethods/requestUrgentDeltaSync");
        C17960vV.A0H(!this.A04.A0N(), "ContactSyncMethods/requestUrgentDeltaSync/companions should not perform delta sync");
        if (((C30881ef) this.A0K.get()).A00 == 3) {
            r0 = AnonymousClass2R1.A02;
        } else {
            r0 = AnonymousClass2R1.A0B;
        }
        C63212sh r2 = new C63212sh(r0, (Integer) null);
        r2.A05 = true;
        r2.A00 = C62132qq.A0C;
        r2.A03 = true;
        A00(this, r2.A02(), true);
    }

    public void A0E(Collection collection) {
        Collection collection2 = collection;
        if (!collection.isEmpty()) {
            collection.size();
            A04(C62132qq.A0I, AnonymousClass2R1.A05, collection2, true, false);
        }
    }

    public static AnonymousClass2P4 A00(AnonymousClass12E r5, C62592re r6, boolean z) {
        AnonymousClass2P4 r4 = new AnonymousClass2P4(z);
        r6.A02(r4);
        AnonymousClass1US r3 = r5.A0B;
        r3.A0P.execute(new C146497Pi(r3, r6, 21));
        return r4;
    }

    public static void A01(AnonymousClass12E r6, C62132qq r7, AnonymousClass2R1 r8, Collection collection, boolean z) {
        PowerManager.WakeLock A002;
        PowerManager A0G2 = r6.A0L.A0G();
        if (A0G2 == null) {
            Log.w("contactsyncmethods/forceFullSync pm=null");
            A002 = null;
        } else {
            A002 = C181789Rv.A00(A0G2, "fullsync", 1);
        }
        if (A002 != null) {
            try {
                A002.acquire(300000);
                Log.i("contactsyncmethods/forceFullSync/wl/acquire");
            } catch (RuntimeException e) {
                Log.e("contactsyncmethods/forceFullSync", e);
                r6.A03.A0G("contactsyncmethods/forceFullSync", e.getMessage(), true);
            } catch (Throwable th) {
                if (A002 != null && A002.isHeld()) {
                    A002.release();
                    Log.i("contactsyncmethods/forceFullSync/wl/release");
                }
                throw th;
            }
        }
        C63212sh r1 = new C63212sh(r8, (Integer) null);
        r1.A03 = true;
        r1.A02 = z;
        r1.A00 = r7;
        r1.A08.addAll(collection);
        r6.A03(r1.A02());
        if (A002 != null && A002.isHeld()) {
            A002.release();
            Log.i("contactsyncmethods/forceFullSync/wl/release");
        }
    }

    public C62602rf A03(C62592re r2) {
        C62602rf r0;
        if (!this.A08.A09()) {
            Log.i("contactsyncmethods/network_unavailable");
            return C62602rf.A04;
        }
        try {
            r0 = (C62602rf) A00(this, r2, false).get();
        } catch (InterruptedException | ExecutionException unused) {
            r0 = C62602rf.A03;
        }
        A02(this, r2, r0);
        return r0;
    }

    public void A05() {
        AnonymousClass11S r1 = this.A04;
        r1.A0I();
        if (r1.A00 != null && !r1.A0N()) {
            this.A0O.CGF(new C70563Bp(this, 33));
        }
    }

    public void A06() {
        C17960vV.A0H(!this.A04.A0N(), "ContactSyncMethods/requestBackgroundFullSyncWithRetry/should not be executed by companions");
        C63212sh r2 = new C63212sh(AnonymousClass2R1.A03, AnonymousClass00R.A01);
        r2.A00 = C62132qq.A0C;
        r2.A05 = true;
        A00(this, r2.A02(), true);
    }

    public void A07() {
        C26931Ua r3 = this.A0D;
        C26931Ua.A00(r3, 6, AnonymousClass11P.A01(r3.A01));
        C63212sh r2 = new C63212sh(AnonymousClass2R1.A08, (Integer) null);
        r2.A03 = true;
        r2.A00 = C62132qq.A0G;
        A00(this, r2.A02(), true);
    }

    public void A08() {
        AnonymousClass1UN r5 = this.A0N;
        if (r5.A02.A0O() <= 0) {
            boolean A062 = r5.A06();
            C26931Ua r4 = this.A0D;
            if (!A062) {
                C26931Ua.A00(r4, 7, AnonymousClass11P.A01(r4.A01));
                this.A0M.A1M(AnonymousClass11P.A01(this.A0E));
                return;
            }
            AnonymousClass11P r3 = r4.A01;
            C26931Ua.A00(r4, 4, AnonymousClass11P.A01(r3));
            AnonymousClass00H r1 = this.A0Q;
            if (((C33821jR) r1.get()).A00.A00() != null) {
                C26931Ua.A00(r4, 5, AnonymousClass11P.A01(r3));
                A07();
                return;
            }
            ((C33821jR) r1.get()).A00(new C66862yr(this, 0), "contactsyncmethods", 1);
        }
    }

    public void A09() {
        AnonymousClass2R1 r1;
        Log.i("ContactSyncMethods/requestOnChangeDeltaSync");
        C17960vV.A0H(!this.A04.A0N(), "ContactSyncMethods/requestOnChangeDeltaSync/companions should not perform delta sync");
        if (((C30881ef) this.A0K.get()).A00 == 3) {
            r1 = AnonymousClass2R1.A02;
        } else {
            r1 = AnonymousClass2R1.A0B;
        }
        C63212sh r4 = new C63212sh(r1, AnonymousClass00R.A00);
        r4.A04 = true;
        r4.A05 = true;
        r4.A00 = C62132qq.A0C;
        if (C18020vd.A05(C18040vf.A02, this.A0I, 5868)) {
            r4.A03 = true;
        }
        A00(this, r4.A02(), true);
    }

    public void A0B(AnonymousClass1E7 r11) {
        Class<UserJid> cls = UserJid.class;
        Jid A062 = r11.A06(cls);
        if (A062 != null) {
            AnonymousClass11S r1 = this.A04;
            r1.A0I();
            if (!A062.equals(r1.A0E) && !C22971Dz.A0Z(A062) && r11.A0H == null) {
                if (r1.A0N()) {
                    A04(C62132qq.A0D, AnonymousClass2R1.A0E, Collections.singleton(r11.A06(cls)), false, true);
                } else if (!r11.A0z) {
                    C63212sh r2 = new C63212sh(AnonymousClass2R1.A0C, (Integer) null);
                    r2.A05 = true;
                    r2.A00 = C62132qq.A0C;
                    r2.A08.add(A062);
                    A00(this, r2.A02(), true);
                }
            }
        }
    }

    public void A0C(Integer num) {
        C63212sh r1 = new C63212sh(AnonymousClass2R1.A0A, AnonymousClass00R.A00);
        r1.A05 = true;
        r1.A03 = true;
        r1.A00 = C62132qq.A0G;
        r1.A01 = num;
        A00(this, r1.A02(), true);
    }

    public void A0D(Integer num) {
        AnonymousClass2R1 r0;
        if (!this.A04.A0N()) {
            if (((C30881ef) this.A0K.get()).A00 == 3) {
                r0 = AnonymousClass2R1.A02;
            } else {
                r0 = AnonymousClass2R1.A0B;
            }
            C63212sh r2 = new C63212sh(r0, num);
            r2.A04 = true;
            r2.A05 = true;
            r2.A00 = C62132qq.A0C;
            r2.A03 = true;
            A00(this, r2.A02(), true);
        }
    }

    public void Bp4(C49642Rh r4) {
        this.A0O.CGL(new C70563Bp(this, 34), "kickoff-nativecontacts-download)");
    }

    public AnonymousClass12E(C19880zA r2, C19880zA r3, C19880zA r4, AnonymousClass190 r5, AnonymousClass11S r6, C26261Rl r7, C25001Mm r8, C26271Rm r9, AnonymousClass11E r10, AnonymousClass1M9 r11, C26961Ue r12, AnonymousClass1US r13, C26861Tt r14, C26931Ua r15, AnonymousClass11C r16, AnonymousClass11P r17, C19830z4 r18, C26291Ro r19, C24661Le r20, C26281Rn r21, AnonymousClass1UN r22, C18030ve r23, C26221Rh r24, AnonymousClass10I r25, AnonymousClass00H r26, AnonymousClass00H r27, AnonymousClass00H r28) {
        this.A0E = r17;
        this.A0I = r23;
        this.A03 = r5;
        this.A04 = r6;
        this.A0O = r25;
        this.A0G = r20;
        this.A06 = r8;
        this.A09 = r11;
        this.A0L = r16;
        this.A0K = r26;
        this.A00 = r2;
        this.A0J = r24;
        this.A05 = r7;
        this.A07 = r9;
        this.A02 = r3;
        this.A0H = r21;
        this.A0F = r19;
        this.A01 = r4;
        this.A08 = r10;
        this.A0B = r13;
        this.A0C = r14;
        this.A0Q = r27;
        this.A0A = r12;
        this.A0M = r18;
        this.A0P = r28;
        this.A0N = r22;
        this.A0D = r15;
    }

    public static void A02(AnonymousClass12E r7, C62592re r8, C62602rf r9) {
        if (r9.A00()) {
            AnonymousClass2R1 r2 = r8.A03;
            if (r2.mode == C49542Qw.FULL && r8.A0C && r2.context != C49562Qy.REGISTRATION) {
                AnonymousClass1UN r4 = r7.A0N;
                if (r4.A03() && ((C33821jR) r7.A0Q.get()).A00.A00() != null) {
                    if (r4.A09()) {
                        Object value = r4.A03.A01.getValue();
                        C18070vi.A0X(value);
                        long j = ((SharedPreferences) value).getLong("force_full_contacts_backup_timestamp", 0);
                        Long valueOf = Long.valueOf(j);
                        if (j == 0 || valueOf == null) {
                            j = r4.A02.A0O();
                        }
                        if (AnonymousClass11P.A01(r4.A01) - j > 1814400000) {
                            C63212sh r22 = new C63212sh(AnonymousClass2R1.A09, AnonymousClass00R.A00);
                            r22.A05 = true;
                            r22.A03 = true;
                            r22.A00 = C62132qq.A0G;
                            A00(r7, r22.A02(), true);
                            return;
                        }
                        return;
                    }
                    r7.A0O.CGL(new C70563Bp(r7, 35), "contact_periodic_sync");
                }
            }
        }
    }

    public AnonymousClass2P4 A04(C62132qq r7, AnonymousClass2R1 r8, Collection collection, boolean z, boolean z2) {
        C17960vV.A0C(r7.A00());
        boolean z3 = false;
        if (r8.scope == C49362Qe.MULTI_PROTOCOLS_QUERY) {
            z3 = true;
        }
        C17960vV.A0C(z3);
        collection.size();
        C63212sh r5 = new C63212sh(r8, (Integer) null);
        r5.A03 = z;
        r5.A00 = r7;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AnonymousClass1BI r3 = (AnonymousClass1BI) it.next();
            if (!C18020vd.A05(C18040vf.A02, this.A0I, 3311)) {
                this.A09.A0H(r3);
            }
            if (r3 != null) {
                r5.A08.add(r3);
            }
        }
        return A00(this, r5.A02(), z2);
    }
}
