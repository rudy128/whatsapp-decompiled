package X;

import com.whatsapp.backup.google.workers.GoogleBackupWorker;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.8gr  reason: invalid class name and case insensitive filesystem */
public final class C167728gr extends C20463AMa {
    public final /* synthetic */ GoogleBackupWorker A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C167728gr(X.C218617r r39, X.AnonymousClass1NW r40, X.AnonymousClass1NP r41, X.C192369oH r42, X.C19947A0e r43, X.AnonymousClass1NO r44, X.AnonymousClass1NT r45, X.C36801oU r46, X.C175238yN r47, X.AnonymousClass8gY r48, X.AMX r49, X.C199349zq r50, X.C19948A0f r51, X.A0L r52, X.A7X r53, X.B76 r54, com.whatsapp.backup.google.workers.GoogleBackupWorker r55, X.AnonymousClass1L7 r56, X.AnonymousClass1NM r57, X.AnonymousClass11P r58, X.C19830z4 r59, X.C27431Wb r60, X.AnonymousClass1Cd r61, X.C18030ve r62, X.AnonymousClass18K r63, X.C171878sQ r64, X.AnonymousClass1OZ r65, X.AnonymousClass1Q5 r66, X.AnonymousClass00H r67, java.lang.String r68, java.util.List r69, java.util.concurrent.atomic.AtomicLong r70, java.util.concurrent.atomic.AtomicLong r71, boolean r72) {
        /*
            r38 = this;
            r3 = r38
            r0 = r55
            r3.A00 = r0
            r2 = r66
            r13 = r49
            r1 = r69
            r0 = r70
            X.C108995ce.A1H(r2, r13, r1, r0)
            r35 = r71
            X.C18070vi.A0b(r35)
            r37 = 1
            r29 = r65
            r28 = r64
            r27 = r63
            r26 = r62
            r25 = r61
            r12 = r47
            r16 = r48
            r14 = r50
            r31 = r67
            r32 = r68
            r4 = r39
            r5 = r40
            r9 = r44
            r6 = r41
            r10 = r45
            r7 = r42
            r11 = r46
            r36 = r72
            r8 = r43
            r15 = r51
            r17 = r52
            r18 = r53
            r19 = r54
            r20 = r56
            r21 = r57
            r22 = r58
            r23 = r59
            r24 = r60
            r30 = r2
            r33 = r1
            r34 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C167728gr.<init>(X.17r, X.1NW, X.1NP, X.9oH, X.A0e, X.1NO, X.1NT, X.1oU, X.8yN, X.8gY, X.AMX, X.9zq, X.A0f, X.A0L, X.A7X, X.B76, com.whatsapp.backup.google.workers.GoogleBackupWorker, X.1L7, X.1NM, X.11P, X.0z4, X.1Wb, X.1Cd, X.0ve, X.18K, X.8sQ, X.1OZ, X.1Q5, X.00H, java.lang.String, java.util.List, java.util.concurrent.atomic.AtomicLong, java.util.concurrent.atomic.AtomicLong, boolean):void");
    }

    public void A06(boolean z) {
        StringBuilder A10 = AnonymousClass000.A10();
        GoogleBackupWorker googleBackupWorker = this.A00;
        A10.append(GoogleBackupWorker.A00(googleBackupWorker));
        A10.append("onBackupFailed, attempt: sys=");
        A10.append(googleBackupWorker.A01.A00);
        A10.append(" user=");
        AnonymousClass1NP r4 = googleBackupWorker.A04;
        A10.append(r4.A07().getInt("google_backup_retry_count", 0));
        A10.append(" terminalFailure=");
        A10.append(z);
        A10.append(" isStopped=");
        A10.append(AnonymousClass000.A1S(googleBackupWorker.A03, -256));
        A10.append(" stopped=");
        AtomicBoolean atomicBoolean = googleBackupWorker.A0Y;
        C17900vP.A0r(A10, atomicBoolean.get());
        if (atomicBoolean.get()) {
            C175238yN r2 = this.A0I;
            C17900vP.A0n("GoogleBackupRestoreObservable/backup-end/success: ", AnonymousClass000.A10(), false);
            r2.A00 = 0;
            C20737AWs.A00(r2, 1, false);
            r4.A0H(0);
            return;
        }
        super.A06(z);
    }
}
