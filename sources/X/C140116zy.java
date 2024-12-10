package X;

import android.net.Uri;
import java.io.File;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: X.6zy  reason: invalid class name and case insensitive filesystem */
public final class C140116zy {
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

    public final void A01(AnonymousClass206 r7, List list) {
        if (r7 instanceof C441822l) {
            C18070vi.A0d("CrosspostRequestSessionManager/handleNewAutoShareRecordCreation skip for audio status", 0);
            return;
        }
        C18070vi.A0d("CrosspostRequestSessionManager/handleNewAutoShareRecordCreation start new record creation", 0);
        ((AnonymousClass73E) this.A08.get()).A05((String) null, list, 0, r7.A0x);
    }

    public final void A02(AnonymousClass210 r2, List list) {
        C18070vi.A0d(r2, 0);
        A01(r2, list);
        ((C133766pS) this.A06.get()).A01(r2);
    }

    public final void A03(List list, List list2) {
        List list3 = list;
        if (AnonymousClass74A.A07(list)) {
            C18070vi.A0d("CrosspostRequestSessionManager/handleNewAutoShareCrosspostInPreviousSession retry skipped for audio status", 0);
            return;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CrosspostRequestSessionManager/handleNewStatusInPreviousAppSessionAutoShareCrosspost started for messages: ");
        ArrayList A0E = C29351c6.A0E(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C108995ce.A1Q(A0E, it);
        }
        C108995ce.A1K(A0E, A10);
        String A012 = AnonymousClass74A.A01();
        ((C133526ou) this.A07.get()).A00(A012);
        ArrayList A0E2 = C29351c6.A0E(list);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C108995ce.A1Q(A0E2, it2);
        }
        List list4 = list2;
        AnonymousClass74A.A05(this.A00, (AnonymousClass2LF) C18070vi.A0E(this.A03), this.A08, A012, A0E2, list4);
        ((C133106oB) this.A02.get()).A00(new C146357Ou(new AnonymousClass6OC(this.A04), this, A012, list), A012, list3, (List) null, list4, 10);
    }

    public static final void A00(C134426qZ r26, C140116zy r27, C136316tc r28, C136456tq r29) {
        String str;
        File file;
        long j;
        int i;
        C1194368c r4;
        C18070vi.A0d("CrosspostRequestSessionManager/handleMediaUploadAndCrosspost started", 0);
        C140116zy r0 = r27;
        C136316tc r10 = r28;
        C128856gn r3 = new C128856gn(r26, r0, r10);
        C130986kK r8 = (C130986kK) r0.A09.get();
        C17960vV.A00();
        AnonymousClass1IX r2 = r10.A02;
        C132936nt r7 = new C132936nt(new C128876gp(r3, r10, r8), r2.size());
        AnonymousClass1IZ it = r2.iterator();
        while (it.hasNext()) {
            AnonymousClass206 A0Y = C17880vN.A0Y(it);
            Map map = r10.A05;
            C136066tD r02 = (C136066tD) C108965cb.A0o(map, A0Y.A0x);
            String str2 = null;
            if (r02 != null) {
                str = r02.A01;
            } else {
                str = null;
            }
            C136066tD r03 = (C136066tD) C108965cb.A0o(map, A0Y.A0x);
            if (r03 != null) {
                str2 = r03.A02;
            }
            AnonymousClass6pC r6 = new AnonymousClass6pC(r10, r7, r8);
            boolean z = A0Y instanceof AnonymousClass210;
            if (z || (A0Y instanceof AnonymousClass21V)) {
                String A002 = r8.A04.A00(str, true);
                if (A002 == null || A002.length() == 0) {
                    if (!z) {
                        C62572rc r04 = ((AnonymousClass21V) A0Y).A02;
                        if (r04 == null) {
                            j = A0Y.A0x;
                            i = -8;
                        } else {
                            file = r04.A0G;
                        }
                    } else if (str2 == null || str2.length() == 0) {
                        C17960vV.A0F(false, "invalid mediaFilePath for textStatus");
                        j = A0Y.A0x;
                        i = -7;
                    } else {
                        file = r8.A01.A0a(str2);
                    }
                    if (file == null || !file.exists()) {
                        if (!A0Y.A0z) {
                            C17960vV.A0F(false, "media file does not exist");
                        }
                        j = A0Y.A0x;
                        i = -9;
                    } else {
                        C26551So A012 = C63972u0.A01((AnonymousClass1BI) null, A0Y.A0u, 8);
                        C18070vi.A0X(A012);
                        long j2 = A0Y.A0x;
                        C62022qf r5 = new C62022qf(false, false, true);
                        Uri fromFile = Uri.fromFile(file);
                        if (A012 == C26551So.A0w) {
                            r4 = new C1194368c(r8.A03);
                        } else {
                            r4 = null;
                        }
                        C136456tq r14 = r29;
                        byte[] bArr = r14.A00;
                        C17960vV.A07(bArr);
                        C63722ta A003 = C63722ta.A00(fromFile, new C61382pa(bArr, 1), r4, r5, A012, (AnonymousClass73B) null, (String) null, 0, true, false, true);
                        AnonymousClass1T6 r22 = r8.A05;
                        byte[] bArr2 = new byte[24];
                        new SecureRandom().nextBytes(bArr2);
                        AnonymousClass34B A0B = r22.A0B(new AnonymousClass7FE(r14, r8, bArr2), A003, true);
                        A0B.A0Z = "mms";
                        A0B.A07(new C145967Nh(A0B, r6, r8, 0, j2), (Executor) null);
                        r8.A0B.put(Long.valueOf(j2), A0B);
                        AnonymousClass7RN.A02(r8.A06, r8, A0B, 34);
                    }
                } else {
                    r6.A01(A0Y.A0x, A002);
                }
            } else {
                C17960vV.A0F(false, AnonymousClass001.A1E(A0Y, "invalid status type ", AnonymousClass000.A10()));
                j = A0Y.A0x;
                i = -6;
            }
            r6.A00(i, j);
        }
    }

    public C140116zy(AnonymousClass1KB r1, AnonymousClass10I r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7, AnonymousClass00H r8, AnonymousClass00H r9, AnonymousClass00H r10) {
        C18070vi.A0w(r1, r2, r3, r4, r5);
        C18070vi.A0x(r6, r7, r8, r9, r10);
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r3;
        this.A08 = r4;
        this.A05 = r5;
        this.A02 = r6;
        this.A09 = r7;
        this.A07 = r8;
        this.A04 = r9;
        this.A06 = r10;
    }
}
