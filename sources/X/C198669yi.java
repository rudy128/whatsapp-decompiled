package X;

import com.whatsapp.util.Log;

/* renamed from: X.9yi  reason: invalid class name and case insensitive filesystem */
public final class C198669yi {
    public final AnonymousClass11S A00;
    public final C35191ln A01;
    public final C18030ve A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;

    public C198669yi(AnonymousClass11S r2, C35191ln r3, C18030ve r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7, AnonymousClass00H r8, AnonymousClass00H r9, AnonymousClass00H r10) {
        C18070vi.A0w(r4, r2, r5, r6, r3);
        C18070vi.A0q(r7, r8, r9);
        C18070vi.A0d(r10, 9);
        this.A02 = r4;
        this.A00 = r2;
        this.A08 = r5;
        this.A04 = r6;
        this.A01 = r3;
        this.A06 = r7;
        this.A03 = r8;
        this.A05 = r9;
        this.A07 = r10;
    }

    public static final boolean A00(AnonymousClass206 r5) {
        String str;
        C692336k A002 = C60472o5.A00(r5);
        if (!AnonymousClass206.A08(r5) || A002 == null) {
            str = "CommentProtobufHelper/commentMessageInfo is null";
        } else {
            Long A022 = A002.A02();
            if (A022 != null && A022.longValue() > 0) {
                return true;
            }
            str = "CommentProtobufHelper/commentMessageInfo does not have row id populated";
        }
        Log.e(str);
        return false;
    }
}
