package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2xi  reason: invalid class name and case insensitive filesystem */
public final class C66152xi implements AnonymousClass191 {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;

    public C66152xi(AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7, AnonymousClass00H r8, AnonymousClass00H r9, AnonymousClass00H r10) {
        C18070vi.A0w(r2, r3, r4, r5, r6);
        C18070vi.A0q(r7, r8, r9);
        C18070vi.A0d(r10, 9);
        this.A03 = r2;
        this.A00 = r3;
        this.A07 = r4;
        this.A08 = r5;
        this.A05 = r6;
        this.A01 = r7;
        this.A02 = r8;
        this.A04 = r9;
        this.A06 = r10;
    }

    public void Ba9() {
    }

    public void Blf() {
        Throwable th;
        int length;
        StringBuilder A11;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AccountSwitchingAsyncInit");
        C17890vO.A1A(A10, "/onAsyncInitAnyUserState");
        C19830z4 A0K = C17880vN.A0K(this.A08);
        AnonymousClass00H r15 = this.A01;
        A0K.A1H(C17880vN.A0J(r15).A0F().size());
        AnonymousClass00H r14 = this.A00;
        if (C17880vN.A0I(r14).A0F()) {
            if (!C17880vN.A0J(r15).A0K()) {
                C17890vO.A1A(AnonymousClass000.A11("AccountSwitchingAsyncInit"), "/runSanityCheckOnStagingDirectories");
                try {
                    AnonymousClass00H r5 = this.A02;
                    File[] listFiles = ((File) ((A8T) r5.get()).A0A.getValue()).listFiles();
                    if (listFiles != null && (length = listFiles.length) != 0) {
                        int i = 0;
                        while (true) {
                            File file = listFiles[i];
                            File[] listFiles2 = file.listFiles();
                            if (listFiles2 == null || listFiles2.length == 0) {
                                boolean delete = file.delete();
                                A11 = AnonymousClass000.A11("AccountSwitchingAsyncInit");
                                A11.append('/');
                                String name = file.getName();
                                C18070vi.A0X(name);
                                A11.append(C60322np.A01(name));
                                A11.append(" is empty/delete: ");
                                A11.append(delete);
                            } else {
                                A11 = AnonymousClass000.A11("AccountSwitchingAsyncInit");
                                A11.append('/');
                                String name2 = file.getName();
                                C18070vi.A0X(name2);
                                A11.append(C60322np.A01(name2));
                                A11.append(" is non empty");
                            }
                            Log.i(A11.toString());
                            i++;
                            if (i >= length) {
                                break;
                            }
                        }
                    } else {
                        C17890vO.A1A(AnonymousClass000.A11("AccountSwitchingAsyncInit"), "/stagingAccountFolders null or empty");
                    }
                    List A0D = ((A8T) r5.get()).A0D();
                    if (A0D.isEmpty()) {
                        for (C62562rb r4 : C17880vN.A0J(r15).A0F()) {
                            StringBuilder A102 = AnonymousClass000.A10();
                            A102.append("staged dir not found for: {");
                            A102.append(C49842Sd.A00(r4));
                            String A0y = AnonymousClass000.A0y("}, removing entry from data repo", A102);
                            ((AnonymousClass190) this.A03.get()).A0G(AnonymousClass000.A0y("/staged dir not found", AnonymousClass000.A11("AccountSwitchingAsyncInit")), A0y, false);
                            C17900vP.A0f("/onAsyncInitAnyUserState/", A0y, AnonymousClass000.A11("AccountSwitchingAsyncInit"));
                            C17880vN.A0J(r15).A0O(r4.A07);
                        }
                    } else {
                        List<C62562rb> A0F = C17880vN.A0J(r15).A0F();
                        if (A0F.isEmpty()) {
                            Iterator it = A0D.iterator();
                            while (it.hasNext()) {
                                String A0v = C17880vN.A0v(it);
                                if (!(A0F instanceof Collection) || !A0F.isEmpty()) {
                                    int i2 = 0;
                                    for (C62562rb r0 : A0F) {
                                        if (C18070vi.A18(r0.A07, A0v) && (i2 = i2 + 1) < 0) {
                                            AnonymousClass1ZU.A0A();
                                            th = null;
                                            throw th;
                                        }
                                    }
                                    if (i2 <= 0) {
                                    }
                                }
                                String A0y2 = AnonymousClass000.A0y(" staged dir found, but accounts data repo entry not found", AnonymousClass000.A11(A0v));
                                C17900vP.A0e("/onAsyncInitAnyUserState: ", A0y2, AnonymousClass000.A11("AccountSwitchingAsyncInit"));
                                AnonymousClass00H r13 = this.A03;
                                ((AnonymousClass190) r13.get()).A0G(AnonymousClass000.A0y("/accounts data repo entry not found", AnonymousClass000.A11("AccountSwitchingAsyncInit")), A0y2, false);
                                String str = A0v;
                                C62562rb r17 = new C62562rb((String) null, str, "", "", 0, 0, 0, 0, 0, true, false);
                                String A072 = C17880vN.A0I(r14).A07(r17);
                                Log.i("MultiAccountSharedPrefReader/getPushNameFromSharedPref");
                                String A012 = C20026A3v.A01(r17, (C20026A3v) this.A04.get(), "startup_prefs", "push_name");
                                C64012u4 A0J = C17880vN.A0J(r15);
                                synchronized (A0J) {
                                    try {
                                        Log.i("AccountSwitchingDataRepo/delete/");
                                        File A0D2 = A0J.A0D("accounts");
                                        if (A0D2.exists()) {
                                            C17900vP.A0n("AccountSwitchingDataRepo/delete/deleted file: ", AnonymousClass000.A10(), A0D2.delete());
                                        }
                                    } catch (SecurityException e) {
                                        Log.e("AccountSwitchingDataRepo/delete/", e);
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                }
                                if (A072 == null || A072.length() == 0 || A012 == null || A012.length() == 0) {
                                    StringBuilder A112 = AnonymousClass000.A11("AccountSwitchingAsyncInit");
                                    A112.append("/unable to fetch jid or name/jid=");
                                    A112.append(A072);
                                    C17900vP.A0e(" ; name=", A012, A112);
                                    ((AnonymousClass190) r13.get()).A0G(AnonymousClass000.A0y("/unable to fetch jid or name", AnonymousClass000.A11("AccountSwitchingAsyncInit")), A0y2, false);
                                } else {
                                    C17880vN.A0J(r15).A0G(new C62562rb((String) null, str, A072, A012, 0, 0, 0, 0, 0, true, false));
                                }
                            }
                        }
                    }
                } catch (RuntimeException e2) {
                    Log.e("AccountSwitchingAsyncInit", e2);
                }
            }
            A6J a6j = (A6J) this.A06.get();
            Log.i("InactiveAccountNotificationManager/processDailyNotificationsDeletion");
            C62562rb A032 = C17880vN.A0I(a6j.A04).A03();
            if (A032 != null) {
                ((A1T) a6j.A07.get()).A02(A032.A07, AnonymousClass11P.A01(a6j.A01));
            }
            for (C62562rb r1 : C17880vN.A0J(a6j.A05).A0F()) {
                ((A1T) a6j.A07.get()).A02(r1.A07, r1.A03);
            }
        }
    }

    public void Blg() {
        C62562rb A032;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AccountSwitchingAsyncInit");
        C17890vO.A1A(A10, "/onAsyncInitUserRegisteredAndDbReady");
        ((AnonymousClass1NL) this.A05.get()).A02.add("com.whatsapp.accountswitching.AccountSwitchingContentProvider");
        AnonymousClass00H r1 = this.A00;
        if (C17880vN.A0I(r1).A0F() && (A032 = C17880vN.A0I(r1).A03()) != null) {
            String str = A032.A07;
            ((A6J) this.A06.get()).A04(str);
            if (((AnonymousClass1QK) this.A07.get()).A0D()) {
                C17880vN.A0J(this.A01).A0I(str);
                return;
            }
            AnonymousClass00H r2 = this.A01;
            if (C18070vi.A18(str, C64012u4.A01(C17880vN.A0J(r2)).A01)) {
                C17890vO.A1A(AnonymousClass000.A11("AccountSwitchingAsyncInit"), "/onAsyncInitUserRegisteredAndDbReady/removing paymentsOnboardedLid");
                C17880vN.A0J(r2).A0I((String) null);
            }
        }
    }
}
