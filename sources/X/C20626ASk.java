package X;

import android.text.TextUtils;

/* renamed from: X.ASk  reason: case insensitive filesystem */
public class C20626ASk implements B83, B85, C436820m {
    public final A79 A00;

    public void BDb(C19998A2m a2m, AnonymousClass206 r7) {
        AnonymousClass8BX.A1H(r7, "FMessageQuickReplyForTemplateProtobuf: message type is not supported ", AnonymousClass000.A10(), r7 instanceof AnonymousClass224);
        AnonymousClass224 r72 = (AnonymousClass224) r7;
        AnonymousClass8X8 r4 = a2m.A00;
        AnonymousClass8bK r0 = ((C166418cr) r4.A00).templateButtonReplyMessage_;
        if (r0 == null) {
            r0 = AnonymousClass8bK.DEFAULT_INSTANCE;
        }
        C23624Bmt A0O = r0.A0O();
        String A0P = r72.A0P();
        AnonymousClass8bK r1 = (AnonymousClass8bK) C17880vN.A0G(A0O);
        int i = AnonymousClass8bK.CONTEXT_INFO_FIELD_NUMBER;
        A0P.getClass();
        r1.bitField0_ |= 2;
        r1.selectedDisplayText_ = A0P;
        if (!TextUtils.isEmpty(r72.A01)) {
            String str = r72.A01;
            AnonymousClass8bK r12 = (AnonymousClass8bK) C17880vN.A0G(A0O);
            str.getClass();
            r12.bitField0_ |= 1;
            r12.selectedId_ = str;
        }
        int i2 = r72.A00;
        AnonymousClass8bK r13 = (AnonymousClass8bK) C17880vN.A0G(A0O);
        r13.bitField0_ |= 8;
        r13.selectedIndex_ = i2;
        Integer num = r72.A03;
        if (num != null) {
            int intValue = num.intValue();
            AnonymousClass8bK r14 = (AnonymousClass8bK) C17880vN.A0G(A0O);
            r14.bitField0_ |= 16;
            r14.selectedCarouselCardIndex_ = intValue;
        }
        C166278cd A01 = A79.A01(A0O, this.A00, a2m, r72);
        AnonymousClass8bK r15 = (AnonymousClass8bK) A0O.A00;
        A01.getClass();
        r15.contextInfo_ = A01;
        r15.bitField0_ |= 4;
        C166418cr A0M = AnonymousClass8BS.A0M(r4);
        AnonymousClass8bK r02 = (AnonymousClass8bK) A0O.A0C();
        r02.getClass();
        A0M.templateButtonReplyMessage_ = r02;
        A0M.bitField0_ |= 8388608;
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [X.224, X.210, X.206] */
    public AnonymousClass206 CBG(C20077A6d a6d) {
        C166418cr r2 = a6d.A08;
        if ((r2.bitField0_ & 8388608) == 0) {
            return null;
        }
        AnonymousClass8bK r5 = r2.templateButtonReplyMessage_;
        if (r5 == null) {
            r5 = AnonymousClass8bK.DEFAULT_INSTANCE;
        }
        C17960vV.A07(r5);
        ? r1 = new AnonymousClass210(a6d.A0A, 32, a6d.A03);
        r1.A0i(r5.selectedDisplayText_);
        r1.A01 = r5.selectedId_;
        r1.A00 = r5.selectedIndex_;
        if ((r5.bitField0_ & 16) != 0) {
            r1.A03 = Integer.valueOf(r5.selectedCarouselCardIndex_);
        }
        return r1;
    }

    public C20626ASk(A79 a79) {
        this.A00 = a79;
    }
}
