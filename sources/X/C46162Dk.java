package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.facebook.msys.mci.DefaultCrypto;
import java.util.List;
import java.util.Set;

/* renamed from: X.2Dk  reason: invalid class name and case insensitive filesystem */
public final class C46162Dk extends C29691ci {
    public int A00;
    public int A01;
    public C179509Ig A02;
    public C179519Ih A03;
    public C179459Ia A04;
    public AnonymousClass9IW A05;
    public C179469Ib A06;
    public AnonymousClass206 A07;
    public Long A08;
    public Set A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final long A0D;
    public final long A0E;
    public final long A0F;
    public final long A0G;
    public final long A0H;
    public final long A0I;
    public final long A0J;
    public final AnonymousClass1IX A0K;
    public final C29691ci A0L;
    public final AnonymousClass9IZ A0M;
    public final AnonymousClass9IR A0N;
    public final Integer A0O;
    public final Long A0P;
    public final String A0Q;
    public final String A0R;
    public final String A0S;
    public final String A0T;
    public final String A0U;
    public final String A0V;
    public final List A0W;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46162Dk(AnonymousClass1IX r4, C29691ci r5, C179509Ig r6, C179519Ih r7, AnonymousClass9IZ r8, AnonymousClass9IR r9, C179459Ia r10, AnonymousClass9IW r11, C179469Ib r12, AnonymousClass206 r13, Integer num, Long l, Long l2, String str, String str2, String str3, String str4, String str5, String str6, List list, Set set, int i, int i2, long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2, boolean z3) {
        super(r5);
        C18070vi.A0d(r5, 2);
        C18070vi.A0d(r6, 15);
        C18070vi.A0d(r9, 16);
        this.A0D = j;
        this.A0L = r5;
        String str7 = str;
        this.A0T = str7;
        this.A0H = j2;
        this.A0Q = str2;
        this.A0F = j3;
        this.A0V = str3;
        this.A0I = j4;
        this.A0U = str4;
        this.A0J = j5;
        this.A0E = j6;
        this.A0R = str5;
        this.A0S = str6;
        this.A0G = j7;
        this.A02 = r6;
        this.A0N = r9;
        this.A05 = r11;
        this.A0M = r8;
        this.A0B = z;
        this.A0W = list;
        this.A0C = z2;
        this.A04 = r10;
        this.A0A = z3;
        this.A03 = r7;
        this.A0K = r4;
        this.A0P = l;
        this.A01 = i;
        this.A0O = num;
        this.A00 = i2;
        this.A09 = set;
        this.A08 = l2;
        this.A06 = r12;
        this.A07 = r13;
        this.A0k = str7;
    }

    public final boolean A0R(AnonymousClass1c4 r4) {
        C18070vi.A0d(r4, 0);
        if (AnonymousClass1c4.A01(r4, 3877)) {
            if (!C18020vd.A05(C18040vf.A02, r4.A02, 5161) || this.A04 != C179459Ia.GEOSUSPENDED) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean A0S(AnonymousClass1c4 r4) {
        C18070vi.A0d(r4, 0);
        if (AnonymousClass1c4.A01(r4, 3877)) {
            if (!C18020vd.A05(C18040vf.A02, r4.A02, 3149) || this.A04 != C179459Ia.SUSPENDED) {
                return false;
            }
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C46162Dk) {
                C46162Dk r8 = (C46162Dk) obj;
                if (!(this.A0D == r8.A0D && C18070vi.A18(this.A0L, r8.A0L) && C18070vi.A18(this.A0T, r8.A0T) && this.A0H == r8.A0H && C18070vi.A18(this.A0Q, r8.A0Q) && this.A0F == r8.A0F && C18070vi.A18(this.A0V, r8.A0V) && this.A0I == r8.A0I && C18070vi.A18(this.A0U, r8.A0U) && this.A0J == r8.A0J && this.A0E == r8.A0E && C18070vi.A18(this.A0R, r8.A0R) && C18070vi.A18(this.A0S, r8.A0S) && this.A0G == r8.A0G && this.A02 == r8.A02 && this.A0N == r8.A0N && this.A05 == r8.A05 && this.A0M == r8.A0M && this.A0B == r8.A0B && C18070vi.A18(this.A0W, r8.A0W) && this.A0C == r8.A0C && this.A04 == r8.A04 && this.A0A == r8.A0A && this.A03 == r8.A03 && C18070vi.A18(this.A0K, r8.A0K) && C18070vi.A18(this.A0P, r8.A0P) && this.A01 == r8.A01 && this.A0O == r8.A0O && this.A00 == r8.A00 && C18070vi.A18(this.A09, r8.A09) && C18070vi.A18(this.A08, r8.A08) && this.A06 == r8.A06 && C18070vi.A18(this.A07, r8.A07))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ C46162Dk A00(C29691ci r61, C179509Ig r62, C46162Dk r63, int i, long j) {
        long j2;
        boolean z;
        boolean z2;
        int i2;
        int i3 = i;
        C179509Ig r37 = r62;
        C29691ci r39 = r61;
        long j3 = j;
        Long l = null;
        String str = null;
        String str2 = null;
        C179519Ih r30 = null;
        C179459Ia r33 = null;
        boolean z3 = false;
        AnonymousClass9IZ r31 = null;
        AnonymousClass9IW r34 = null;
        AnonymousClass9IR r32 = null;
        long j4 = 0;
        AnonymousClass1IX r27 = null;
        Long l2 = null;
        String str3 = null;
        int i4 = 0;
        long j5 = 0;
        String str4 = null;
        long j6 = 0;
        long j7 = 0;
        C179469Ib r35 = null;
        long j8 = 0;
        String str5 = null;
        String str6 = null;
        List list = null;
        Integer num = null;
        Set set = null;
        C46162Dk r11 = r63;
        if ((i & 1) != 0) {
            j3 = r11.A0D;
        }
        if ((i & 2) != 0) {
            r39 = r11.A0L;
        }
        if ((i & 4) != 0) {
            str3 = r11.A0T;
        }
        if ((i & 8) != 0) {
            j5 = r11.A0H;
        }
        if ((i & 16) != 0) {
            str2 = r11.A0Q;
        }
        if ((i & 32) != 0) {
            j7 = r11.A0F;
        }
        if ((i & 64) != 0) {
            str = r11.A0V;
        }
        if ((i3 & 128) != 0) {
            j8 = r11.A0I;
        }
        if ((i3 & 256) != 0) {
            str5 = r11.A0U;
        }
        if ((i3 & 512) != 0) {
            j4 = r11.A0J;
        }
        if ((i3 & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0) {
            j2 = r11.A0E;
        } else {
            j2 = 0;
        }
        if ((i3 & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH) != 0) {
            str4 = r11.A0R;
        }
        if ((i3 & ZipDecompressor.UNZIP_BUFFER_SIZE) != 0) {
            str6 = r11.A0S;
        }
        if ((i3 & DefaultCrypto.BUFFER_SIZE) != 0) {
            j6 = r11.A0G;
        }
        if ((i3 & 16384) != 0) {
            r37 = r11.A02;
        }
        if ((32768 & i) != 0) {
            r32 = r11.A0N;
        }
        if ((i & 65536) != 0) {
            r34 = r11.A05;
        }
        if ((i & A7Y.A0F) != 0) {
            r31 = r11.A0M;
        }
        if ((i & 262144) != 0) {
            z3 = r11.A0B;
        }
        if ((i & 524288) != 0) {
            list = r11.A0W;
        }
        if ((i & 1048576) != 0) {
            z = r11.A0C;
        } else {
            z = false;
        }
        if ((i & 2097152) != 0) {
            r33 = r11.A04;
        }
        if ((i & 4194304) != 0) {
            z2 = r11.A0A;
        } else {
            z2 = false;
        }
        if ((i & 8388608) != 0) {
            r30 = r11.A03;
        }
        if ((i & EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING) != 0) {
            r27 = r11.A0K;
        }
        if ((i & 33554432) != 0) {
            l2 = r11.A0P;
        }
        if ((i & 67108864) != 0) {
            i4 = r11.A01;
        }
        if ((i & 134217728) != 0) {
            num = r11.A0O;
        }
        if ((i & 268435456) != 0) {
            i2 = r11.A00;
        } else {
            i2 = 0;
        }
        if ((i & 536870912) != 0) {
            set = r11.A09;
        }
        if ((i & 1073741824) != 0) {
            l = r11.A08;
        }
        if ((i & Integer.MIN_VALUE) != 0) {
            r35 = r11.A06;
        }
        AnonymousClass206 r112 = r11.A07;
        C18070vi.A0d(r39, 1);
        C18070vi.A0d(r37, 14);
        C18070vi.A0d(r32, 15);
        C18070vi.A0m(r34, r31);
        C18070vi.A0d(list, 19);
        C18070vi.A0d(r33, 21);
        C18070vi.A0d(r30, 23);
        C18070vi.A0d(num, 27);
        C18070vi.A0d(set, 29);
        C18070vi.A0d(r35, 31);
        return new C46162Dk(r27, r39, r37, r30, r31, r32, r33, r34, r35, r112, num, l2, l, str3, str2, str, str5, str4, str6, list, set, i4, i2, j3, j5, j7, j8, j4, j2, j6, z3, z, z2);
    }

    public final void A0N(C46162Dk r3) {
        if (r3 != null) {
            this.A0W = r3.A0W;
            this.A0X = r3.A0X;
            this.A0P = r3.A0P;
            this.A0Q = r3.A0Q;
            this.A0Z = r3.A0Z;
            this.A0g = r3.A0g;
            this.A0f = r3.A0f;
            this.A0A = r3.A0A;
        }
    }

    public final boolean A0O() {
        if (this.A0A || this.A02 != C179509Ig.ADMIN) {
            return false;
        }
        return true;
    }

    public final boolean A0P() {
        if (this.A0A) {
            return false;
        }
        C179509Ig r1 = this.A02;
        if (r1 == C179509Ig.ADMIN || r1 == C179509Ig.OWNER) {
            return true;
        }
        return false;
    }

    public final boolean A0Q() {
        if (this.A0A || this.A02 != C179509Ig.OWNER) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A0I2 = AnonymousClass000.A0I(this.A0D) * 31;
        long j = this.A0H;
        long j2 = this.A0F;
        long j3 = this.A0I;
        int A0K2 = AnonymousClass001.A0K(this.A0J, (AnonymousClass001.A0K(j3, (AnonymousClass001.A0K(j2, (AnonymousClass001.A0K(j, (AnonymousClass000.A0N(this.A0L, A0I2) + C17900vP.A00(this.A0T)) * 31) + C17900vP.A00(this.A0Q)) * 31) + C17900vP.A00(this.A0V)) * 31) + C17900vP.A00(this.A0U)) * 31);
        int A002 = AnonymousClass0DV.A00(AnonymousClass000.A0N(this.A04, AnonymousClass0DV.A00(AnonymousClass000.A0N(this.A0W, AnonymousClass0DV.A00(AnonymousClass000.A0N(this.A0M, AnonymousClass000.A0N(this.A05, AnonymousClass000.A0N(this.A0N, AnonymousClass000.A0N(this.A02, AnonymousClass001.A0K(this.A0G, (((AnonymousClass001.A0K(this.A0E, A0K2) + C17900vP.A00(this.A0R)) * 31) + C17900vP.A00(this.A0S)) * 31))))), this.A0B)), this.A0C)), this.A0A);
        Integer num = this.A0O;
        Set set = this.A09;
        return AnonymousClass000.A0N(this.A06, (AnonymousClass000.A0N(set, (((((((((AnonymousClass000.A0N(this.A03, A002) + AnonymousClass001.A0k(this.A0K)) * 31) + AnonymousClass001.A0k(this.A0P)) * 31) + this.A01) * 31) + A01(num).hashCode() + num.intValue()) * 31) + this.A00) * 31) + AnonymousClass001.A0k(this.A08)) * 31) + C17880vN.A02(this.A07);
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "NEVER";
            case 2:
                return "DAY";
            case 3:
                return "WEEK";
            case 4:
                return "MONTH";
            default:
                return "DEFAULT";
        }
    }

    public static final void A02(C46162Dk r2, AnonymousClass206 r3) {
        Integer num;
        C691336a A002 = C50382Uf.A00(r3);
        if (A002 == null || !A002.A07 || (num = r3.A0S) == null || num.intValue() != 100) {
            r2.A07 = r3;
        } else {
            r2.A0S = r3.A0y;
        }
    }

    public final C29681ch A0M() {
        AnonymousClass1BI A082 = A08();
        C18070vi.A0z(A082, "null cannot be cast to non-null type com.whatsapp.jid.NewsletterJid");
        return (C29681ch) A082;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("NewsletterInfo(chatRowId=");
        A10.append(this.A0D);
        A10.append(", chatInfo=");
        A10.append(this.A0L);
        A10.append(", name=");
        A10.append(this.A0T);
        A10.append(", nameId=");
        A10.append(this.A0H);
        A10.append(", description=");
        A10.append(this.A0Q);
        A10.append(", descriptionId=");
        A10.append(this.A0F);
        A10.append(", pictureUrl=");
        A10.append(this.A0V);
        A10.append(", pictureId=");
        A10.append(this.A0I);
        A10.append(", picturePreviewUrl=");
        A10.append(this.A0U);
        A10.append(", picturePreviewId=");
        A10.append(this.A0J);
        A10.append(", createdTimestamp=");
        A10.append(this.A0E);
        A10.append(", handle=");
        A10.append(this.A0R);
        A10.append(", inviteCode=");
        A10.append(this.A0S);
        A10.append(", followersCount=");
        A10.append(this.A0G);
        A10.append(", membership=");
        A10.append(this.A02);
        A10.append(", privacy=");
        A10.append(this.A0N);
        A10.append(", verified=");
        A10.append(this.A05);
        A10.append(", verificationSource=");
        A10.append(this.A0M);
        A10.append(", muted=");
        A10.append(this.A0B);
        A10.append(", accounts=");
        A10.append(this.A0W);
        A10.append(", oldestMessageRetrieved=");
        A10.append(this.A0C);
        A10.append(", suspended=");
        A10.append(this.A04);
        A10.append(", deleted=");
        A10.append(this.A0A);
        A10.append(", reactionsSettings=");
        A10.append(this.A03);
        A10.append(", reactionsSettingsBlocklist=");
        A10.append(this.A0K);
        A10.append(", reactionsSettingsUpdateTs=");
        A10.append(this.A0P);
        A10.append(", showEnforcedUpdateBanner=");
        A10.append(this.A01);
        A10.append(", mediaCacheSetting=");
        A10.append(A01(this.A0O));
        A10.append(", adminCount=");
        A10.append(this.A00);
        A10.append(", capabilities=");
        A10.append(this.A09);
        A10.append(", wamoSubPlanId=");
        A10.append(this.A08);
        A10.append(", wamoSubStatus=");
        A10.append(this.A06);
        A10.append(", lastWamoSubPreviewMessage=");
        return AnonymousClass001.A1F(this.A07, A10);
    }
}
