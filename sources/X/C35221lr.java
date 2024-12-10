package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.jid.UserJid;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;

/* renamed from: X.1lr  reason: invalid class name and case insensitive filesystem */
public final class C35221lr {
    public final C18030ve A00;
    public final C35211lq A01;
    public final AnonymousClass1RU A02;
    public final AnonymousClass1R0 A03;
    public final AnonymousClass1W6 A04;

    public C35221lr(C18030ve r2, C35211lq r3, AnonymousClass1RU r4, AnonymousClass1R0 r5, AnonymousClass1W6 r6) {
        C18070vi.A0d(r2, 1);
        C18070vi.A0d(r6, 2);
        C18070vi.A0d(r5, 3);
        C18070vi.A0d(r3, 4);
        C18070vi.A0d(r4, 5);
        this.A00 = r2;
        this.A04 = r6;
        this.A03 = r5;
        this.A01 = r3;
        this.A02 = r4;
    }

    public static final void A00(AnonymousClass206 r6, C63362sw r7) {
        C29621ca r5 = r7.A0C;
        if ((r6 instanceof AnonymousClass23U) && r5 != null) {
            C29621ca A0K = r5.A0K("enc");
            if (A0K != null) {
                C29621ca r3 = new C29621ca("fp", (AnonymousClass1MD[]) null);
                C29621ca[] r2 = r5.A02;
                if (r2 != null) {
                    for (int i = 0; i < r2.length; i++) {
                        if (r2[i] == A0K) {
                            r2[i] = r3;
                        }
                    }
                }
            }
            ((AnonymousClass23U) r6).A03 = C60632oM.A01(r5, new ByteArrayOutputStream());
        }
    }

    public final AnonymousClass23U A01(C63362sw r18, byte[] bArr, int i) {
        boolean z;
        C20719AVz aVz;
        C63362sw r3 = r18;
        AnonymousClass205 r1 = r3.A0B;
        long j = r3.A0X;
        AnonymousClass23U r4 = new AnonymousClass23U(r1, bArr, i, r3.A01, j);
        C23624Bmt A0N = AnonymousClass2B9.DEFAULT_INSTANCE.A0N();
        AnonymousClass20F r0 = new AnonymousClass20F(AnonymousClass350.class);
        HashMap hashMap = r3.A0i;
        AnonymousClass350 r7 = (AnonymousClass350) ((B5K) hashMap.get(r0));
        if (r7 != null) {
            AnonymousClass2BL r02 = ((AnonymousClass2B9) A0N.A00).botInfo_;
            if (r02 == null) {
                r02 = AnonymousClass2BL.DEFAULT_INSTANCE;
            }
            C23624Bmt A0O = r02.A0O();
            String str = r7.A04;
            if (!AnonymousClass1EG.A0H(str)) {
                A0O.A0E();
                AnonymousClass2BL r12 = (AnonymousClass2BL) A0O.A00;
                int i2 = AnonymousClass2BL.EDIT_TARGET_ID_FIELD_NUMBER;
                r12.bitField0_ |= 1;
                r12.targetId_ = str;
            }
            String str2 = r7.A03;
            if (!AnonymousClass1EG.A0H(str2)) {
                A0O.A0E();
                AnonymousClass2BL r13 = (AnonymousClass2BL) A0O.A00;
                int i3 = AnonymousClass2BL.EDIT_TARGET_ID_FIELD_NUMBER;
                str2.getClass();
                r13.bitField0_ |= 2;
                r13.editTargetId_ = str2;
            }
            AnonymousClass1BI r03 = r7.A00;
            if (r03 != null) {
                String rawString = r03.getRawString();
                A0O.A0E();
                AnonymousClass2BL r14 = (AnonymousClass2BL) A0O.A00;
                int i4 = AnonymousClass2BL.EDIT_TARGET_ID_FIELD_NUMBER;
                rawString.getClass();
                r14.bitField0_ |= 4;
                r14.targetChatJid_ = rawString;
            }
            UserJid userJid = r7.A01;
            if (userJid != null) {
                String rawString2 = userJid.getRawString();
                A0O.A0E();
                AnonymousClass2BL r15 = (AnonymousClass2BL) A0O.A00;
                int i5 = AnonymousClass2BL.EDIT_TARGET_ID_FIELD_NUMBER;
                rawString2.getClass();
                r15.bitField0_ |= 8;
                r15.targetSenderJid_ = rawString2;
            }
            AnonymousClass2BL r04 = (AnonymousClass2BL) A0O.A0C();
            A0N.A0E();
            AnonymousClass2B9 r16 = (AnonymousClass2B9) A0N.A00;
            r04.getClass();
            r16.botInfo_ = r04;
            r16.bitField0_ |= 1;
            z = true;
        } else {
            z = false;
        }
        if (C18020vd.A05(C18040vf.A02, this.A00, 5718) && (aVz = (C20719AVz) ((B5K) hashMap.get(new AnonymousClass20F(C20719AVz.class)))) != null) {
            C196899vp.A01(r4, new C20948Ac2(aVz.A00, r3.A0h, aVz.A01, aVz.A02, (byte[]) null, (byte[]) null, j));
        }
        if (z) {
            r4.A02 = A0N.A0C().A0M();
        }
        A02((C166278cd) null, r4, r3);
        A00(r4, r3);
        return r4;
    }

    public final void A02(C166278cd r5, AnonymousClass206 r6, C63362sw r7) {
        int i;
        r7.A09(r6);
        AnonymousClass206 A0K = r6.A0K();
        if ((A0K instanceof C445623x) && A0K != null) {
            AnonymousClass1W6 r0 = this.A04;
            AnonymousClass206 A05 = r0.A01.A05(A0K.A0v);
            if (A05 == null || AnonymousClass25A.A0p(A05) || (i = A05.A0u) == 12 || i == 90 || C20133A8t.A0A(A05)) {
                r6.A0L = null;
            } else {
                this.A03.A00(r6, A05);
            }
        }
        if (!(r5 == null || (r5.bitField0_ & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) == 0)) {
            String str = r7.A0B.A01;
            String str2 = r7.A0h;
            if (!C18070vi.A18(str, str2)) {
                r6.A0N = new AnonymousClass205(r7.A03(), str2, r7.A0B.A02);
            }
        }
        C693236t A002 = C60512o9.A00(r6);
        if (A002 != null) {
            this.A02.BWH(r6, A002);
        }
        this.A01.A00(r5, r6, r7);
    }
}
