package X;

import android.util.Base64;
import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.5yu  reason: invalid class name and case insensitive filesystem */
public final class C116955yu extends C20126A8l {
    public int A00;
    public final C136536ty A01;
    public final boolean A02;
    public final String A03;
    public final String[] A04;

    public C116955yu(C136536ty r13, C19999A2n a2n, String str, int i, long j, boolean z, boolean z2) {
        super(C62382rJ.A03, a2n, str, "regular_low", 7, j, z);
        this.A00 = i;
        this.A02 = z2;
        this.A01 = r13;
        String[] A1Z = C17880vN.A1Z();
        A1Z[0] = "favoriteSticker";
        String str2 = r13.A07;
        A1Z[1] = str2;
        this.A04 = A1Z;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("[\"favoriteSticker\",\"");
        A10.append(str2);
        this.A03 = AnonymousClass000.A0y("\"]", A10);
    }

    public C163398Uv A08() {
        C23624Bmt A0N = C166008cC.DEFAULT_INSTANCE.A0N();
        C136536ty r4 = this.A01;
        String str = r4.A08;
        if (str != null) {
            C166008cC r1 = (C166008cC) C17880vN.A0G(A0N);
            r1.bitField0_ |= 1;
            r1.url_ = str;
        }
        String str2 = r4.A04;
        if (str2 != null) {
            byte[] decode = Base64.decode(str2, 0);
            C23581BmB A012 = DSQ.A01(decode, 0, decode.length);
            C166008cC r12 = (C166008cC) C17880vN.A0G(A0N);
            r12.bitField0_ |= 2;
            r12.fileEncSha256_ = A012;
        }
        String str3 = r4.A05;
        if (str3 != null) {
            byte[] decode2 = Base64.decode(str3, 1);
            C23581BmB A013 = DSQ.A01(decode2, 0, decode2.length);
            C166008cC r13 = (C166008cC) C17880vN.A0G(A0N);
            r13.bitField0_ |= 4;
            r13.mediaKey_ = A013;
        }
        String str4 = r4.A06;
        if (str4 != null) {
            C166008cC r14 = (C166008cC) C17880vN.A0G(A0N);
            r14.bitField0_ |= 8;
            r14.mimetype_ = str4;
        }
        int i = r4.A00;
        C166008cC r15 = (C166008cC) C17880vN.A0G(A0N);
        r15.bitField0_ |= 16;
        r15.height_ = i;
        int i2 = r4.A01;
        C166008cC r16 = (C166008cC) C17880vN.A0G(A0N);
        r16.bitField0_ |= 32;
        r16.width_ = i2;
        String str5 = r4.A03;
        if (str5 != null) {
            C166008cC r17 = (C166008cC) C17880vN.A0G(A0N);
            r17.bitField0_ |= 64;
            r17.directPath_ = str5;
        }
        long j = r4.A02;
        C166008cC r18 = (C166008cC) C17880vN.A0G(A0N);
        r18.bitField0_ |= 128;
        r18.fileLength_ = j;
        boolean z = this.A02;
        C166008cC r19 = (C166008cC) C17880vN.A0G(A0N);
        r19.bitField0_ |= 256;
        r19.isFavorite_ = z;
        boolean z2 = r4.A09;
        C166008cC r110 = (C166008cC) C17880vN.A0G(A0N);
        r110.bitField0_ |= EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
        r110.isLottie_ = z2;
        int i3 = this.A00;
        if (i3 >= 0) {
            C166008cC r111 = (C166008cC) C17880vN.A0G(A0N);
            r111.bitField0_ |= 512;
            r111.deviceIdHint_ = i3;
        }
        C163398Uv A08 = super.A08();
        C166378cn r2 = (C166378cn) C17880vN.A0G(A08);
        C166008cC r112 = (C166008cC) A0N.A0C();
        int i4 = C166378cn.AGENT_ACTION_FIELD_NUMBER;
        r112.getClass();
        r2.stickerAction_ = r112;
        r2.bitField0_ |= 134217728;
        return A08;
    }

    public String A0A() {
        return this.A03;
    }

    public String A0B() {
        return "favoriteSticker";
    }

    public String[] A0F() {
        return this.A04;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("FavoriteStickerMutation{\n        isFavorite=");
        A10.append(this.A02);
        A10.append(",\n        setterId=");
        A10.append(this.A00);
        A10.append(",\n        metadata=");
        A10.append(this.A01);
        return AnonymousClass1Y7.A01(AnonymousClass000.A0y("\n        }", A10));
    }
}
