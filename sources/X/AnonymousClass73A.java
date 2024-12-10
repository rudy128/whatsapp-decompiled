package X;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.73A  reason: invalid class name */
public final class AnonymousClass73A {
    public final AnonymousClass1KB A00;
    public final AnonymousClass10I A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass00H A0B;
    public final AnonymousClass00H A0C;

    public final void A03(AnonymousClass206 r6) {
        if (r6 instanceof C441822l) {
            C18070vi.A0d("XFamilyCrosspostRequestSessionManager/handleNewAutoShareRecordCreation skip for audio status", 0);
            return;
        }
        C18070vi.A0d("XFamilyCrosspostRequestSessionManager/handleNewAutoShareRecordCreation start new record creation", 0);
        ((AnonymousClass72Q) this.A09.get()).A05((String) null, 0, r6.A0x);
    }

    public final void A04(AnonymousClass210 r4) {
        C18070vi.A0d(r4, 0);
        if (C18020vd.A05(C18040vf.A02, ((C30141dS) this.A08.get()).A01, 4437)) {
            A03(r4);
            ((C133916pi) this.A07.get()).A01(r4);
        }
    }

    public final void A05(List list, boolean z) {
        List list2 = list;
        StringBuilder A0K = C18070vi.A0K(list);
        A0K.append("XFamilyCrosspostRequestSessionManager/handleNewStatusInPreviousAppSessionAutoShareCrosspost started for messages: ");
        ArrayList A0E = C29351c6.A0E(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C108995ce.A1Q(A0E, it);
        }
        C108995ce.A1K(A0E, A0K);
        String A022 = AnonymousClass74B.A02();
        C17880vN.A1E(AnonymousClass716.A01(this.A06).edit(), "pref_debug_session_id", A022);
        ((AnonymousClass6p6) this.A0A.get()).A00(A022);
        AnonymousClass72Q r3 = (AnonymousClass72Q) this.A09.get();
        ArrayList A0E2 = C29351c6.A0E(list);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C108995ce.A1Q(A0E2, it2);
        }
        r3.A07(A0E2, A022);
        ((C133126oD) this.A03.get()).A00(new AnonymousClass7PN(new AnonymousClass6QG(this, Boolean.valueOf(z), A022, list2, true), this, A022), A022, list, (List) null, true);
    }

    public static final void A00(Context context, AnonymousClass73A r10, AnonymousClass8A3 r11, String str, List list, boolean z) {
        AnonymousClass77S r0;
        C18070vi.A0d("XFamilyCrosspostRequestSessionManager/processTextStatusBurningAndMakeEligibilityRequest started", 0);
        AnonymousClass00H r4 = r10.A09;
        AnonymousClass72Q r5 = (AnonymousClass72Q) r4.get();
        List list2 = list;
        ArrayList A0D = C29351c6.A0D(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C108995ce.A1Q(A0D, it);
        }
        HashMap A032 = r5.A03(A0D);
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C135936t0 r02 = (C135936t0) C108965cb.A0n(A032, C17880vN.A0Y(it2).A0x);
            if (r02 != null) {
                r0 = r02.A02;
            } else {
                r0 = null;
            }
            A13.add(r0);
        }
        AnonymousClass8A3 r52 = r11;
        if (C18020vd.A05(C18040vf.A02, ((C30141dS) r10.A08.get()).A01, 4437)) {
            ArrayList<AnonymousClass210> A132 = AnonymousClass000.A13();
            for (Object next : list) {
                if (next instanceof AnonymousClass210) {
                    A132.add(next);
                }
            }
            if (!A132.isEmpty()) {
                AnonymousClass00H r3 = r10.A07;
                C133916pi r2 = (C133916pi) r3.get();
                for (AnonymousClass210 A002 : A132) {
                    r2.A00(context, A002);
                }
                C133916pi r22 = (C133916pi) r3.get();
                for (AnonymousClass210 A012 : A132) {
                    r22.A01(A012);
                }
            }
        } else if (!A02(context, r10, list)) {
            AnonymousClass74B.A05(r10.A00, (AnonymousClass2LI) C18070vi.A0E(r10.A04), r4, r10.A07, list);
            AnonymousClass6YJ.A00("XFamilyCrosspostRequestSessionManager/processTextStatusBurningAndMakeEligibilityRequest status burning fails", (Throwable) null);
            C17960vV.A0F(false, "XFamilyCrosspostRequestSessionManager/status burning fails");
            r11.Bsm(-16, (Integer) null);
            return;
        }
        ((C133126oD) r10.A03.get()).A00(r52, str, list2, A13, z);
    }

    public static final void A01(C123366Ue r26, AnonymousClass73A r27, C135586sR r28, C136476ts r29) {
        String str;
        File file;
        long j;
        Integer num;
        int i;
        C1194368c r4;
        C18070vi.A0d("XFamilyCrosspostRequestSessionManager/handleMediaUploadAndCrosspost started", 0);
        AnonymousClass73A r0 = r27;
        C135586sR r10 = r28;
        C128896gr r3 = new C128896gr(r26, r0, r10);
        C130946kG r8 = (C130946kG) r0.A0C.get();
        C17960vV.A00();
        AnonymousClass1IX r2 = r10.A00;
        C132956nv r7 = new C132956nv(new C128916gt(r3, r10, r8), r2.size());
        AnonymousClass1IZ it = r2.iterator();
        while (it.hasNext()) {
            AnonymousClass206 A0Y = C17880vN.A0Y(it);
            C135936t0 r02 = (C135936t0) C108965cb.A0o(r10.A02, A0Y.A0x);
            if (r02 != null) {
                str = r02.A04;
            } else {
                str = null;
            }
            C133626pD r6 = new C133626pD(r10, r7, r8);
            boolean z = A0Y instanceof AnonymousClass210;
            if (z || (A0Y instanceof AnonymousClass21V)) {
                String A002 = r8.A03.A00(str, true);
                if (A002 == null || A002.length() == 0) {
                    if (!z) {
                        C62572rc r03 = ((AnonymousClass21V) A0Y).A02;
                        if (r03 == null) {
                            j = A0Y.A0x;
                            num = null;
                            i = -8;
                        } else {
                            file = r03.A0G;
                        }
                    } else if (str == null || str.length() == 0) {
                        C17960vV.A0F(false, "invalid mediaFilePath for textStatus");
                        j = A0Y.A0x;
                        num = null;
                        i = -7;
                    } else {
                        file = r8.A00.A0a(str);
                    }
                    if (file == null || !file.exists()) {
                        if (!A0Y.A0z) {
                            C17960vV.A0F(false, "media file does not exist");
                        }
                        j = A0Y.A0x;
                        num = null;
                        i = -9;
                    } else {
                        C26551So A012 = C63972u0.A01((AnonymousClass1BI) null, A0Y.A0u, 8);
                        C18070vi.A0X(A012);
                        long j2 = A0Y.A0x;
                        C62022qf r5 = new C62022qf(false, false, true);
                        Uri fromFile = Uri.fromFile(file);
                        if (A012 == C26551So.A0w) {
                            r4 = new C1194368c(r8.A02);
                        } else {
                            r4 = null;
                        }
                        C136476ts r14 = r29;
                        byte[] bArr = r14.A00;
                        C17960vV.A07(bArr);
                        C63722ta A003 = C63722ta.A00(fromFile, new C61382pa(bArr, 1), r4, r5, A012, (AnonymousClass73B) null, (String) null, 0, true, false, true);
                        AnonymousClass1T6 r22 = r8.A04;
                        byte[] bArr2 = new byte[24];
                        new SecureRandom().nextBytes(bArr2);
                        AnonymousClass34B A0B2 = r22.A0B(new AnonymousClass7FD(r14, bArr2), A003, true);
                        A0B2.A0Z = "mms";
                        A0B2.A07(new C145967Nh(A0B2, r6, r8, 1, j2), (Executor) null);
                        r8.A0A.put(Long.valueOf(j2), A0B2);
                        r8.A05.CGF(new C21357Aim(A0B2, r8, 3));
                    }
                } else {
                    r6.A00(A0Y.A0x, A002);
                }
            } else {
                C17960vV.A0F(false, AnonymousClass001.A1E(A0Y, "invalid status type ", AnonymousClass000.A10()));
                j = A0Y.A0x;
                num = null;
                i = -6;
            }
            r6.A01(num, i, j);
        }
    }

    public static final boolean A02(Context context, AnonymousClass73A r8, List list) {
        if (context instanceof Application) {
            C17960vV.A0F(false, "XFamilyCrosspostRequestSessionManager/application context was passed for text status burning");
            AnonymousClass6YJ.A00("XFamilyCrosspostRequestSessionManager/processTextStatusBurning application context was passed in for burning text status", (Throwable) null);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass206 A0Y = C17880vN.A0Y(it);
            if (A0Y instanceof AnonymousClass210) {
                AnonymousClass210 r1 = (AnonymousClass210) A0Y;
                String A002 = ((C132466mr) r8.A0B.get()).A00(context, r1);
                if (A002 == null) {
                    StringBuilder A10 = AnonymousClass000.A10();
                    AnonymousClass206.A06(A0Y, "XFamilyCrosspostRequestSessionManager/text status burning failed for message: ", A10);
                    AnonymousClass6YJ.A00(A10.toString(), (Throwable) null);
                    return false;
                }
                ((AnonymousClass72Q) r8.A09.get()).A04(r1.A0x, A002);
                StringBuilder A102 = AnonymousClass000.A10();
                AnonymousClass206.A06(A0Y, "XFamilyCrosspostRequestSessionManager/text status burning succeed for message: ", A102);
                C18070vi.A0d(A102.toString(), 0);
            }
        }
        return true;
    }

    public AnonymousClass73A(AnonymousClass1KB r1, AnonymousClass10I r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7, AnonymousClass00H r8, AnonymousClass00H r9, AnonymousClass00H r10, AnonymousClass00H r11, AnonymousClass00H r12, AnonymousClass00H r13) {
        C18070vi.A0w(r1, r2, r3, r4, r5);
        C18070vi.A0x(r6, r7, r8, r9, r10);
        C18070vi.A0r(r11, r12, r13);
        this.A00 = r1;
        this.A01 = r2;
        this.A08 = r3;
        this.A04 = r4;
        this.A09 = r5;
        this.A05 = r6;
        this.A0B = r7;
        this.A0A = r8;
        this.A03 = r9;
        this.A0C = r10;
        this.A02 = r11;
        this.A06 = r12;
        this.A07 = r13;
    }
}
