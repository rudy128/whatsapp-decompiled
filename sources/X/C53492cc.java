package X;

import android.content.UriMatcher;

/* renamed from: X.2cc  reason: invalid class name and case insensitive filesystem */
public class C53492cc {
    public final UriMatcher A00;
    public final AnonymousClass00H A01;

    public C53492cc(C19880zA r23, AnonymousClass11S r24, AnonymousClass1M9 r25, C24921Me r26, C24791Lr r27, AnonymousClass1CJ r28, AnonymousClass1MZ r29, C41891xG r30, C18030ve r31, AnonymousClass1TM r32, C19959A0q a0q, AnonymousClass1TN r34, AnonymousClass1HY r35, C62012qe r36, AnonymousClass19T r37, AnonymousClass1Nb r38, AnonymousClass00H r39, AnonymousClass00H r40, AnonymousClass00H r41) {
        C19959A0q a0q2 = a0q;
        AnonymousClass1TM r12 = r32;
        C18030ve r11 = r31;
        C41891xG r10 = r30;
        AnonymousClass1CJ r8 = r28;
        C24791Lr r7 = r27;
        AnonymousClass00H r19 = r39;
        C24921Me r6 = r26;
        AnonymousClass1Nb r18 = r38;
        AnonymousClass1M9 r5 = r25;
        AnonymousClass19T r17 = r37;
        AnonymousClass11S r4 = r24;
        C62012qe r16 = r36;
        C19880zA r3 = r23;
        AnonymousClass1MZ r9 = r29;
        this.A01 = C18150vq.A01(new C70993Dh(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, a0q2, r34, r35, r16, r17, r18, r19, r40, r41));
        UriMatcher uriMatcher = new UriMatcher(-1);
        this.A00 = uriMatcher;
        uriMatcher.addURI("com.whatsapp.provider.instrumentation", "contacts", 1);
    }
}
