package X;

import android.app.Dialog;
import android.content.Intent;
import android.os.SystemClock;
import com.whatsapp.Me;
import com.whatsapp.accountsync.ProfileActivity;
import com.whatsapp.backup.google.RestoreFromBackupActivity;
import com.whatsapp.registration.RegisterName;
import com.whatsapp.util.Log;

/* renamed from: X.8dR  reason: invalid class name and case insensitive filesystem */
public abstract class C166678dR extends C166728ds {
    public C204011z A00;
    public AnonymousClass1LU A01;
    public C22549BCg A02;
    public final boolean A03;
    public final boolean A04;

    public void A4d(C192039nf r1) {
    }

    public static synchronized C22549BCg A2B(C166678dR r36) {
        C22549BCg bCg;
        C166678dR r8 = r36;
        synchronized (r8) {
            if (r8.A02 == null) {
                C204011z r1 = r8.A00;
                boolean z = r8.A04;
                boolean z2 = r8.A03;
                AnonymousClass9WN r13 = new AnonymousClass9WN(r8);
                AnonymousClass10E r0 = r1.A00.A00.A00;
                AnonymousClass1KB A12 = AnonymousClass10E.A12(r0);
                AnonymousClass10I AL1 = AnonymousClass10E.AL1(r0);
                AnonymousClass00H A002 = C000200d.A00(r0.A9T);
                AnonymousClass00H A003 = C000200d.A00(r0.A9q);
                AnonymousClass00H A004 = C000200d.A00(r0.A63);
                AnonymousClass00H A0s = AnonymousClass3MW.A0s(r0);
                boolean z3 = z;
                boolean z4 = z2;
                C219017v r26 = (C219017v) r0.A91.get();
                C203911y r27 = (C203911y) r0.A9n.get();
                C22881Do r28 = (C22881Do) r0.A5t.get();
                C27351Vt r22 = (C27351Vt) r0.A0d.get();
                C22611Cn r23 = (C22611Cn) r0.A6h.get();
                AnonymousClass1WZ r24 = (AnonymousClass1WZ) r0.A6j.get();
                C26811To r19 = (C26811To) r0.AAf.get();
                AnonymousClass1NM r20 = (AnonymousClass1NM) r0.A6D.get();
                AnonymousClass11Z r21 = (AnonymousClass11Z) r0.AAV.get();
                C166678dR r15 = r8;
                C1775899j r14 = new C1775899j(r15, A12, r13, (C33621j7) r0.A0g.get(), r19, r20, r21, r22, r23, r24, AnonymousClass3Ma.A0g(r0), r26, r27, r28, (C58802lH) r0.A8V.get(), AL1, A002, A003, A004, A0s, z3, z4);
                r8.A02 = r14;
                C20334AGq.A00(r8, r14.A00, 0);
            }
            bCg = r8.A02;
        }
        return bCg;
    }

    public C18150vq A4b() {
        C33841jT r2;
        if (this instanceof RegisterName) {
            r2 = ((RegisterName) this).A4j();
        } else if (this instanceof RestoreFromBackupActivity) {
            r2 = ((RestoreFromBackupActivity) this).A0V;
        } else {
            r2 = ((ProfileActivity) this).A0A;
        }
        return new C18150vq(r2, (C18140vp) null);
    }

    public void A4c() {
        C19830z4 r0;
        String A0l;
        String A0n;
        String str;
        if (this instanceof RegisterName) {
            RegisterName registerName = (RegisterName) this;
            if (AnonymousClass3MY.A09(registerName) == null || !AnonymousClass3MY.A1a(registerName.getIntent(), "debug")) {
                r0 = registerName.A4j().A0C;
                A0l = r0.A0l();
                A0n = r0.A0n();
            } else {
                AnonymousClass11S r02 = registerName.A02;
                r02.A0I();
                Me me = r02.A00;
                if (me != null) {
                    A0l = me.cc;
                    A0n = me.number;
                    r0 = registerName.A0A;
                } else {
                    throw AnonymousClass000.A0n("Required value was null.");
                }
            }
            Me me2 = new Me(A0l, A0n, r0.A0m());
            if (me2.jabber_id == null) {
                Log.e("RegisterName/messagestoreverified/missing-params bounce to regphone");
                C33841jT.A03(registerName.A4j(), 1, true);
                registerName.A3q(AnonymousClass1LU.A04(registerName), true);
                return;
            }
            AnonymousClass11S r1 = registerName.A02;
            r1.A0I();
            if (!AnonymousClass11S.A05(me2, r1, "me")) {
                registerName.finish();
                return;
            }
            AnonymousClass11S r03 = registerName.A02;
            r03.A0I();
            AnonymousClass11S.A03(me2, r03);
            AnonymousClass00H r04 = registerName.A17;
            if (r04 != null) {
                ((C26271Rm) r04.get()).A05(registerName);
                C19830z4 r12 = registerName.A0A;
                AnonymousClass194 r05 = registerName.A0G;
                if (r05 != null) {
                    C61092p7.A00(r05, r12);
                    Log.i("RegisterName/set_dirty");
                    C219017v r06 = registerName.A0m;
                    if (r06 != null) {
                        r06.A16 = true;
                        registerName.A4j().A08();
                        C219017v r07 = registerName.A0m;
                        if (r07 != null) {
                            r07.A07();
                            Log.i("RegisterName//msgstoreverified/group_sync_required");
                            AnonymousClass126 r13 = registerName.A0i;
                            if (r13 != null) {
                                r13.A0P(3, true);
                                registerName.A00 = SystemClock.uptimeMillis();
                                AnonymousClass1E8 A0P = AnonymousClass3MY.A0P(registerName);
                                if (A0P != null) {
                                    registerName.A0Y = A0P;
                                    C27001Ui r5 = registerName.A0r;
                                    if (r5 != null) {
                                        r5.A03(AnonymousClass11S.A00(registerName.A02), "RegisterName.messageStoreVerified", 0, 2, false);
                                        if (C72453Mb.A0M(registerName).getLong("message_store_verified_time", 0) == 0) {
                                            C19830z4 r3 = registerName.A0A;
                                            C17880vN.A1D(C19830z4.A00(r3), "message_store_verified_time", System.currentTimeMillis());
                                        }
                                        RegisterName.A0r(registerName);
                                        if (registerName.A0u != null) {
                                            AnonymousClass1Cd r08 = registerName.A0W;
                                            if (r08 == null) {
                                                str = "messageStoreManager";
                                            } else if (r08.A03() != 0) {
                                                Log.i("RegisterName/restoredialog/congrats");
                                                C166658dJ r09 = registerName.A0u;
                                                if (r09 != null) {
                                                    r09.A00(2);
                                                }
                                            } else {
                                                Log.i("RegisterName/restoredialog/empty-msg-restore");
                                                if (!registerName.A1W) {
                                                    C36801oU r010 = registerName.A0J;
                                                    if (r010 == null) {
                                                        str = "googleBackupConditionsManager";
                                                    } else if (r010.A0D()) {
                                                        Intent A0A = C17880vN.A0A();
                                                        A0A.setClassName(registerName.getPackageName(), "com.whatsapp.backup.google.GoogleDriveNewUserSetupActivity");
                                                        registerName.CNh(A0A, 15);
                                                        registerName.A1W = true;
                                                    }
                                                }
                                                AnonymousClass4Yv.A00(registerName, 103);
                                            }
                                        } else {
                                            C219217x r14 = registerName.A0S;
                                            if (r14 == null) {
                                                str = "waPermissionsHelper";
                                            } else if (r14.A02("android.permission.GET_ACCOUNTS") != 0) {
                                                Log.i("RegisterName/delay google drive setup due to lack of permissions");
                                                AnonymousClass8BX.A15(registerName);
                                            }
                                        }
                                        AnonymousClass00H r011 = registerName.A1A;
                                        if (r011 != null) {
                                            Log.e("ConsumerBridge/onScheduleGenerateEncryptionKeys()");
                                            ((C196169uZ) ((C217317e) AnonymousClass3MW.A0c(((C183589Yv) r011.get()).A00).A01(C217317e.class)).A00.get()).A01();
                                            C21449AkG.A00(registerName.A05, registerName, 19);
                                            return;
                                        }
                                        str = "crossPlatformMigrationLazy";
                                    } else {
                                        str = "profilePhotoManager";
                                    }
                                } else {
                                    throw AnonymousClass000.A0n("Required value was null.");
                                }
                            } else {
                                str = "groupChatManager";
                            }
                        }
                    }
                    str = "messageHandler";
                } else {
                    str = "roadblocks";
                }
            } else {
                str = "androidContactsSyncHelper";
            }
            C18070vi.A11(str);
            throw null;
        } else if (this instanceof ProfileActivity) {
            ProfileActivity profileActivity = (ProfileActivity) this;
            if (profileActivity.A07.A0l()) {
                C177709Ag r012 = profileActivity.A03;
                if (r012 == null || r012.A09() != 1) {
                    C177709Ag r15 = new C177709Ag(profileActivity);
                    profileActivity.A03 = r15;
                    C17890vO.A0u(r15, profileActivity.A05);
                    return;
                }
                return;
            }
            ProfileActivity.A0Q(profileActivity);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 200) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 != -1) {
            A4e(false);
        } else if (A2B(this).BEi()) {
            A2B(this).CRb();
        }
    }

    public C166678dR(boolean z, boolean z2) {
        this.A04 = z;
        this.A03 = z2;
    }

    public void A4e(boolean z) {
        A2B(this).CGQ(z, true);
    }

    public Dialog onCreateDialog(int i) {
        Dialog BqS = A2B(this).BqS(i);
        if (BqS == null) {
            return super.onCreateDialog(i);
        }
        return BqS;
    }

    public C166678dR() {
        this(false, true);
    }
}
