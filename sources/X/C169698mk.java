package X;

import android.database.Cursor;
import java.util.ArrayList;

/* renamed from: X.8mk  reason: invalid class name and case insensitive filesystem */
public final class C169698mk extends C169708ml {
    public final AnonymousClass11P A00;
    public final AnonymousClass387 A01;
    public final AnonymousClass1Cd A02;
    public final AnonymousClass1WM A03;
    public final C28531aO A04;
    public final AnonymousClass00H A05;
    public final C20606ARq A06;
    public final AnonymousClass1LW A07;

    public C20126A8l A0C(A6U a6u, String str, boolean z) {
        C18070vi.A0d(a6u, 2);
        C166378cn r3 = a6u.A03;
        if (!C18070vi.A18(C62382rJ.A03, a6u.A01)) {
            return null;
        }
        String[] strArr = a6u.A06;
        if (strArr.length != 5 || !AnonymousClass8BU.A1a("star", strArr) || r3 == null || !AnonymousClass8BW.A1Q(r3.bitField0_) || (r3.bitField0_ & 2) == 0) {
            return null;
        }
        AnonymousClass8YM r0 = r3.starAction_;
        if (r0 == null) {
            r0 = AnonymousClass8YM.DEFAULT_INSTANCE;
        }
        if ((r0.bitField0_ & 1) == 0) {
            return null;
        }
        C22931Dv r5 = AnonymousClass1BI.A00;
        AnonymousClass1BI A022 = r5.A02(strArr[1]);
        if (A022 == null) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("star-message-mutation/from-key-value unable to create chat jid from ");
            C17890vO.A19(A10, strArr[1]);
        }
        String str2 = strArr[3];
        Boolean A002 = C20068A5s.A00(str2);
        if (A002 == null) {
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("star-message-mutation/from-key-value value=");
            A102.append(str2);
            C17890vO.A19(A102, " at index=3 is not one of the valid strings");
            return null;
        } else if (A022 == null) {
            return null;
        } else {
            AnonymousClass205 A012 = AnonymousClass205.A01(A022, strArr[2], A002.booleanValue());
            AnonymousClass1BI A023 = r5.A02(strArr[4]);
            AnonymousClass8YM r02 = r3.starAction_;
            if (r02 == null) {
                r02 = AnonymousClass8YM.DEFAULT_INSTANCE;
            }
            boolean z2 = r02.starred_;
            return new C170488pw(a6u.A02, A023, A012, str, r3.timestamp_, z2, z);
        }
    }

    public boolean A0J() {
        return true;
    }

    public static final boolean A01(C169698mk r4, C170488pw r5, AnonymousClass205 r6) {
        AnonymousClass1BI r3 = r5.A00;
        C18070vi.A0d(r6, 0);
        String[] A1Y = C17880vN.A1Y();
        A1Y[0] = "deleteMessageForMe";
        String A002 = AnonymousClass9QR.A00(C20068A5s.A01(r3, r6, A1Y));
        C26331Rs r1 = r4.A00;
        if (r1.A09(A002) == null && r1.A0A(A002) == null) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0031, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0034, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0035, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0038, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A0F(boolean r6) {
        /*
            r5 = this;
            X.1Cd r0 = r5.A02
            X.1at r4 = r0.get()
            X.387 r3 = r5.A01     // Catch:{ all -> 0x0032 }
            r2 = 0
            X.0vb r0 = r3.A00     // Catch:{ all -> 0x0032 }
            X.1jz r1 = new X.1jz     // Catch:{ all -> 0x0032 }
            r1.<init>(r0)     // Catch:{ all -> 0x0032 }
            r1.A03 = r2     // Catch:{ all -> 0x0032 }
            java.lang.Boolean r0 = X.AnonymousClass000.A0i()     // Catch:{ all -> 0x0032 }
            r1.A08 = r0     // Catch:{ all -> 0x0032 }
            android.database.Cursor r2 = r3.BUo(r2, r1)     // Catch:{ all -> 0x0032 }
            X.C18070vi.A0b(r4)     // Catch:{ all -> 0x002b }
            r0 = 1
            java.util.ArrayList r0 = A00(r2, r5, r0)     // Catch:{ all -> 0x002b }
            r2.close()     // Catch:{ all -> 0x0032 }
            r4.close()
            return r0
        L_0x002b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x002d }
        L_0x002d:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x0032 }
            throw r0     // Catch:{ all -> 0x0032 }
        L_0x0032:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0034 }
        L_0x0034:
            r0 = move-exception
            X.CDX.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C169698mk.A0F(boolean):java.util.List");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C169698mk(C20606ARq aRq, C26371Rw r3, AnonymousClass1S4 r4, AnonymousClass11P r5, AnonymousClass1LW r6, AnonymousClass1CJ r7, AnonymousClass387 r8, AnonymousClass1Cd r9, AnonymousClass1WM r10, C26331Rs r11, C28531aO r12, AnonymousClass00H r13) {
        super(r3, r4, r7, r11);
        C18070vi.A0w(r7, r3, r4, r13, r11);
        C18070vi.A0x(r10, r5, r6, aRq, r9);
        C18070vi.A0d(r12, 11);
        this.A05 = r13;
        this.A03 = r10;
        this.A00 = r5;
        this.A07 = r6;
        this.A06 = aRq;
        this.A02 = r9;
        this.A04 = r12;
        this.A01 = r8;
    }

    public static final ArrayList A00(Cursor cursor, C169698mk r15, boolean z) {
        C196029uL A002;
        ArrayList A13 = AnonymousClass000.A13();
        long A012 = AnonymousClass11P.A01(r15.A00);
        while (cursor.moveToNext()) {
            AnonymousClass1BI A0B = r15.A07.A0B(C17890vO.A06(cursor, "chat_row_id"));
            if (!(A0B == null || (A002 = r15.A06.A00(cursor, A0B)) == null)) {
                A13.add(new C170488pw((C19999A2n) null, A002.A02, AnonymousClass205.A01(A002.A01, A002.A03, A002.A04), (String) null, A012, z, false));
            }
        }
        return A13;
    }

    public String A0D() {
        return "regular_high";
    }

    public String A0E() {
        return "star";
    }
}
