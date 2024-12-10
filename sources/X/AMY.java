package X;

import android.content.Context;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;
import com.whatsapp.Me;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.crypto.NoSuchPaddingException;

public final class AMY implements C22535BBs, B75 {
    public double A00;
    public File A01;
    public File A02;
    public File A03;
    public int A04;
    public final C218617r A05;
    public final C199349zq A06;
    public final AnonymousClass1L7 A07;
    public final C27431Wb A08;
    public final C203911y A09;
    public final C196169uZ A0A;
    public final C192059nj A0B;
    public final C196139uW A0C;
    public final C186839eq A0D;
    public final C138296wq A0E;
    public final C33841jT A0F;
    public final AnonymousClass00H A0G;
    public final AnonymousClass00H A0H;
    public final AnonymousClass00H A0I;
    public final Set A0J = C17880vN.A14();
    public final C18100vl A0K = AnonymousClass1DF.A01(new C21949AvD(this));
    public final AnonymousClass190 A0L;
    public final AnonymousClass11S A0M;
    public final C19830z4 A0N;
    public final C22621Co A0O;
    public final AnonymousClass1Cd A0P;
    public final AnonymousClass1WZ A0Q;
    public final A7P A0R;
    public final AnonymousClass00H A0S;
    public final C18100vl A0T = AnonymousClass1DF.A01(new C21948AvC(this));
    public final C18100vl A0U = AnonymousClass1DF.A01(C22077AxH.A00);

    public boolean Bf0(String str) {
        if (str != null) {
            return AnonymousClass8BX.A1V(str, this.A0T);
        }
        return false;
    }

    public boolean CLj(File file, String str) {
        C18070vi.A0d(file, 0);
        if (str != null && AnonymousClass8BX.A1V(str, this.A0K)) {
            return false;
        }
        String name = file.getName();
        C18070vi.A0b(name);
        C18070vi.A0d(name, 0);
        int length = name.length();
        int A0E2 = AnonymousClass1YF.A0E(name, ".", length - 1);
        if (A0E2 != -1 && A0E2 != length - 1) {
            return true;
        }
        file.getAbsolutePath();
        return false;
    }

    public AMY(AnonymousClass190 r24, C218617r r25, AnonymousClass11S r26, C199349zq r27, AnonymousClass1L7 r28, C19830z4 r29, C22621Co r30, C27431Wb r31, AnonymousClass1Cd r32, AnonymousClass1WZ r33, C203911y r34, C196169uZ r35, C192059nj r36, C196139uW r37, A7P a7p, C186839eq r39, C138296wq r40, C33841jT r41, AnonymousClass00H r42, AnonymousClass00H r43, AnonymousClass00H r44, AnonymousClass00H r45) {
        C22621Co r16 = r30;
        AnonymousClass190 r22 = r24;
        C218617r r21 = r25;
        AnonymousClass11S r20 = r26;
        AnonymousClass1L7 r18 = r28;
        C18070vi.A0w(r20, r22, r21, r16, r18);
        A7P a7p2 = a7p;
        C33841jT r6 = r41;
        C27431Wb r15 = r31;
        C203911y r12 = r34;
        C192059nj r10 = r36;
        C18070vi.A0x(a7p2, r10, r12, r15, r6);
        AnonymousClass00H r5 = r42;
        AnonymousClass1Cd r14 = r32;
        C19830z4 r17 = r29;
        C18070vi.A0r(r17, r14, r5);
        C196139uW r9 = r37;
        C18070vi.A0d(r9, 14);
        C138296wq r7 = r40;
        AnonymousClass00H r4 = r43;
        AnonymousClass1WZ r13 = r33;
        C196169uZ r11 = r35;
        C18070vi.A0t(r7, r4, r11, r13);
        AnonymousClass00H r3 = r44;
        C199349zq r19 = r27;
        AnonymousClass8BW.A1J(r19, r3);
        AnonymousClass00H r2 = r45;
        C18070vi.A0d(r2, 22);
        this.A0M = r20;
        this.A0L = r22;
        this.A05 = r21;
        this.A0O = r16;
        this.A07 = r18;
        this.A0R = a7p2;
        this.A0B = r10;
        this.A09 = r12;
        this.A08 = r15;
        this.A0F = r6;
        this.A0N = r17;
        this.A0P = r14;
        this.A0G = r5;
        this.A0C = r9;
        this.A0D = r39;
        this.A0E = r7;
        this.A0H = r4;
        this.A0A = r11;
        this.A0Q = r13;
        this.A06 = r19;
        this.A0S = r3;
        this.A0I = r2;
    }

    public static final void A00(AMY amy) {
        int i = (int) amy.A00;
        if (i > amy.A04) {
            amy.A04 = i;
            C20736AWr.A00(C17880vN.A0V(amy.A0S), amy.A04, 9);
        }
    }

    public final void A01() {
        this.A0C.A04();
        this.A0B.A01();
        this.A01 = null;
        this.A02 = null;
        this.A03 = null;
        this.A04 = 0;
        Log.i("p2p/fpm/ExportHelper/reset()/success");
    }

    public final void A02(CancellationSignal cancellationSignal) {
        boolean z;
        AnonymousClass9HZ r1;
        AnonymousClass9HZ th;
        double d;
        CancellationSignal cancellationSignal2 = cancellationSignal;
        C18070vi.A0d(cancellationSignal2, 0);
        A7P a7p = this.A0R;
        a7p.A06("export");
        a7p.A04(10);
        AnonymousClass11S r4 = this.A0M;
        if (AnonymousClass11S.A00(r4) == null) {
            String A0r = C17880vN.A0r(C17890vO.A0B(this.A0N), "saved_user_before_logout");
            String A022 = C20056A5f.A02(A0r);
            String A042 = C63942tw.A04(A0r);
            if (A022 == null) {
                A022 = "";
            }
            if (A042 == null) {
                A042 = "";
            }
            Me me = new Me(A022, A042, A0r);
            r4.A0I();
            AnonymousClass11S.A03(me, r4);
            AnonymousClass1Cd r0 = this.A0P;
            z = true;
            r0.A06();
            r0.A08 = true;
            C22621Co.A02(this.A0O, false);
        } else {
            z = false;
        }
        try {
            C192059nj r12 = this.A0B;
            String str = C182319Tx.A00;
            C18070vi.A0d(str, 0);
            Context context = r12.A00;
            C17880vN.A0e(context.getFilesDir(), "migration/export/sandbox").mkdirs();
            File A0e = C17880vN.A0e(AnonymousClass8BU.A0f(context, "migration/export/sandbox"), str);
            try {
                C27431Wb r15 = this.A08;
                AMK amk = new AMK(this, 1);
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("MessageStoreBackup/backupDatabase/to ");
                C17890vO.A1A(A10, A0e.getName());
                AnonymousClass9JN r8 = AnonymousClass9JN.UNENCRYPTED;
                C18070vi.A0d(r8, 0);
                A5N A002 = ((C191639mv) r15.A0Y.get()).A00((C19947A0e) r15.A0X.get(), r8, A0e, false);
                AnonymousClass1Cd r02 = r15.A0I;
                r02.A06();
                File file = r02.A03;
                r02.A06();
                A002.A08(amk, C27431Wb.A03(r15, file, file.length()));
                if (this.A0C.A02(A0e, str, true) >= 0) {
                    this.A03 = A0e;
                    cancellationSignal2.throwIfCanceled();
                    C171828sL r7 = new C171828sL();
                    Set<AnonymousClass1NZ> set = (Set) this.A0G.get();
                    C18070vi.A0b(set);
                    if (C108945cZ.A1U(set)) {
                        d = 5.0d / ((double) set.size());
                    } else {
                        d = 0.0d;
                    }
                    for (AnonymousClass1NZ r6 : set) {
                        String A0M2 = r6.A0M();
                        C17900vP.A0f("p2p/fpm/ExportHelper/backup/local/", A0M2, AnonymousClass000.A10());
                        try {
                            A26 A0T2 = r6.A0T(r7, r8);
                            int i = A0T2.A01;
                            if (i == 0) {
                                File file2 = A0T2.A03;
                                if (file2 != null) {
                                    A03(file2, AnonymousClass8BS.A0i(file2));
                                } else {
                                    C17900vP.A0e("p2p/fpm/ExportHelper/exportOtherSettings()/success but file not returned, name: ", A0M2, AnonymousClass000.A10());
                                }
                            } else if (i != 2) {
                                C17900vP.A0e("p2p/fpm/ExportHelper/exportOtherSettings()/failed-to-generate-backup ", A0M2, AnonymousClass000.A10());
                            } else {
                                C17900vP.A0f("p2p/fpm/ExportHelper/exportOtherSettings()/skipped ", A0M2, AnonymousClass000.A10());
                            }
                        } catch (Exception e) {
                            C17900vP.A0h("p2p/fpm/ExportHelper/exportOtherSettings()/exception when generating backup with name: ", A0M2, AnonymousClass000.A10(), e);
                        }
                        this.A00 += d;
                        A00(this);
                    }
                    cancellationSignal2.throwIfCanceled();
                    synchronized (this) {
                        try {
                            cancellationSignal2.throwIfCanceled();
                            C199349zq r62 = this.A06;
                            r62.A01(this, this, AnonymousClass000.A13(), AnonymousClass000.A13(), C17880vN.A11());
                        } catch (C167678gm e2) {
                            Log.e("exportMedia()/Failed to create media backup", e2);
                        } catch (C167558ga e3) {
                            Log.e("exportMedia()/Failed to create media backup", e3);
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                        Set set2 = this.A0J;
                        set2.size();
                        double size = 90.0d / ((double) set2.size());
                        cancellationSignal2.throwIfCanceled();
                        Iterator it = set2.iterator();
                        while (it.hasNext()) {
                            File A0T3 = AnonymousClass8BS.A0T(it);
                            String path = A0T3.getPath();
                            C18070vi.A0X(path);
                            String path2 = ((File) this.A07.A02.get()).getPath();
                            C18070vi.A0X(path2);
                            A03(A0T3, AnonymousClass8BV.A0s(path, path2));
                            this.A00 += size;
                            A00(this);
                            cancellationSignal2.throwIfCanceled();
                        }
                    }
                    if (z) {
                        Log.i("p2p/fpm/ExportHelper/Clearing me object");
                        r4.A0F();
                        this.A0Q.A01();
                    }
                    a7p.A04(11);
                    return;
                }
                r1 = new AnonymousClass9HZ(505, "exportMessageStore()/Failed to register message store db file");
                throw r1;
            } catch (IOException e4) {
                Log.e("p2p/fpm/ExportHelper/exportMessageStoreDb()/IOException during message store db backup", e4);
                String message = e4.getMessage();
                if (message == null || !AnonymousClass1YF.A0Y(message, "ENOSPC", false)) {
                    r1 = new AnonymousClass9HZ(505, (Throwable) e4);
                } else {
                    r1 = new AnonymousClass9HZ(501, (Throwable) e4);
                }
            } catch (InvalidAlgorithmParameterException e5) {
                Log.e("p2p/fpm/ExportHelper/exportMessageStoreDb()/Other exception during message store db backup", e5);
                th = new AnonymousClass9HZ(505, (Throwable) e5);
                throw th;
            } catch (NoSuchPaddingException e6) {
                Log.e("p2p/fpm/ExportHelper/exportMessageStoreDb()/Other exception during message store db backup", e6);
                th = new AnonymousClass9HZ(505, (Throwable) e6);
                throw th;
            } catch (NoSuchAlgorithmException e7) {
                Log.e("p2p/fpm/ExportHelper/exportMessageStoreDb()/Other exception during message store db backup", e7);
                th = new AnonymousClass9HZ(505, (Throwable) e7);
                throw th;
            } catch (InvalidKeyException e8) {
                Log.e("p2p/fpm/ExportHelper/exportMessageStoreDb()/Other exception during message store db backup", e8);
                th = new AnonymousClass9HZ(505, (Throwable) e8);
                throw th;
            }
        } catch (OperationCanceledException e9) {
            Log.e("p2p/fpm/ExportHelper/Operation was canceled during the process, resetting");
            A01();
            throw e9;
        } catch (Throwable th3) {
            if (z) {
                Log.i("p2p/fpm/ExportHelper/Clearing me object");
                r4.A0F();
                this.A0Q.A01();
            }
            throw th3;
        }
    }

    public final void A03(File file, String str) {
        try {
            if (this.A0C.A02(file, str, false) < 0) {
                Log.e("p2p/fpm/ExportHelper/exportMessagesWithDb()/Failed to register optional file");
            }
        } catch (IOException e) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("p2p/fpm/ExportHelper/exportOptionalFile/IOException during file registration. Local path: ");
            C108985cd.A1M(file.getPath(), A10, e);
            this.A0L.A0E("p2p/fpm/ExportHelper/exportOptionalFile/IOException", e.getMessage(), e);
        }
    }

    public Set BUb() {
        return (Set) this.A0U.getValue();
    }

    public boolean CCi(Collection collection, List list, List list2) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            File A0T2 = AnonymousClass8BS.A0T(it);
            String A022 = C20127A8m.A02(A0T2);
            if (Bf0(A022) && CLj(A0T2, A022)) {
                this.A0J.add(A0T2);
            }
        }
        return true;
    }
}
