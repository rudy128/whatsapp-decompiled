package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.facebook.msys.mci.DefaultCrypto;

/* renamed from: X.Cqo  reason: case insensitive filesystem */
public final class C26030Cqo {
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final long A09;
    public final long A0A;
    public final long A0B;
    public final long A0C;
    public final long A0D;
    public final long A0E;
    public final long A0F;
    public final long A0G;
    public final long A0H;
    public final long A0I;
    public final long A0J;
    public final long A0K;
    public final long A0L;
    public final long A0M;
    public final long A0N;
    public final long A0O;
    public final long A0P;
    public final long A0Q;
    public final long A0R;
    public final long A0S;
    public final long A0T;
    public final long A0U;
    public final long A0V;
    public final long A0W;
    public final long A0X;
    public final long A0Y;
    public final long A0Z;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26030Cqo) {
                C26030Cqo cqo = (C26030Cqo) obj;
                if (!(this.A0M == cqo.A0M && this.A0J == cqo.A0J && this.A0L == cqo.A0L && this.A0K == cqo.A0K && this.A0O == cqo.A0O && this.A0N == cqo.A0N && this.A0Y == cqo.A0Y && this.A0U == cqo.A0U && this.A0V == cqo.A0V && this.A0W == cqo.A0W && this.A0X == cqo.A0X && this.A0Z == cqo.A0Z && this.A05 == cqo.A05 && this.A02 == cqo.A02 && this.A08 == cqo.A08 && this.A03 == cqo.A03 && this.A04 == cqo.A04 && this.A09 == cqo.A09 && this.A01 == cqo.A01 && this.A00 == cqo.A00 && this.A06 == cqo.A06 && this.A07 == cqo.A07 && this.A0T == cqo.A0T && this.A0A == cqo.A0A && this.A0B == cqo.A0B && this.A0C == cqo.A0C && this.A0D == cqo.A0D && this.A0F == cqo.A0F && this.A0G == cqo.A0G && this.A0H == cqo.A0H && this.A0I == cqo.A0I && this.A0E == cqo.A0E && this.A0Q == cqo.A0Q && this.A0R == cqo.A0R && this.A0P == cqo.A0P && this.A0S == cqo.A0S)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass001.A0J(this.A0S, AnonymousClass001.A0K(this.A0P, AnonymousClass001.A0K(this.A0R, AnonymousClass001.A0K(this.A0Q, AnonymousClass001.A0K(this.A0E, AnonymousClass001.A0K(this.A0I, AnonymousClass001.A0K(this.A0H, AnonymousClass001.A0K(this.A0G, AnonymousClass001.A0K(this.A0F, AnonymousClass001.A0K(this.A0D, AnonymousClass001.A0K(this.A0C, AnonymousClass001.A0K(this.A0B, AnonymousClass001.A0K(this.A0A, AnonymousClass001.A0K(this.A0T, AnonymousClass001.A0K(this.A07, AnonymousClass001.A0K(this.A06, AnonymousClass001.A0K(this.A00, AnonymousClass001.A0K(this.A01, AnonymousClass001.A0K(this.A09, AnonymousClass001.A0K(this.A04, AnonymousClass001.A0K(this.A03, AnonymousClass001.A0K(this.A08, AnonymousClass001.A0K(this.A02, AnonymousClass001.A0K(this.A05, AnonymousClass001.A0K(this.A0Z, AnonymousClass001.A0K(this.A0X, AnonymousClass001.A0K(this.A0W, AnonymousClass001.A0K(this.A0V, AnonymousClass001.A0K(this.A0U, AnonymousClass001.A0K(this.A0Y, AnonymousClass001.A0K(this.A0N, AnonymousClass001.A0K(this.A0O, AnonymousClass001.A0K(this.A0K, AnonymousClass001.A0K(this.A0L, AnonymousClass001.A0K(this.A0J, AnonymousClass8BV.A00(this.A0M))))))))))))))))))))))))))))))))))));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MediaEngagementReceivedDailyStat(numPhotoReceived=");
        A10.append(this.A0M);
        A10.append(", numPhotoDownloaded=");
        A10.append(this.A0J);
        A10.append(", numPhotoMidScan=");
        A10.append(this.A0L);
        A10.append(", numPhotoFull=");
        A10.append(this.A0K);
        A10.append(", numPhotoWifi=");
        A10.append(this.A0O);
        A10.append(", numPhotoVoDownloaded=");
        A10.append(this.A0N);
        A10.append(", numVideoReceived=");
        A10.append(this.A0Y);
        A10.append(", numVideoDownloaded=");
        A10.append(this.A0U);
        A10.append(", numVideoDownloadedLte=");
        A10.append(this.A0V);
        A10.append(", numVideoDownloadedWifi=");
        A10.append(this.A0W);
        A10.append(", numVideoHdDownloaded=");
        A10.append(this.A0X);
        A10.append(", numVideoVoDownloaded=");
        A10.append(this.A0Z);
        A10.append(", numDocsReceived=");
        A10.append(this.A05);
        A10.append(", numDocsDownloaded=");
        A10.append(this.A02);
        A10.append(", numLargeDocsReceived=");
        A10.append(this.A08);
        A10.append(", numDocsDownloadedLte=");
        A10.append(this.A03);
        A10.append(", numDocsDownloadedWifi=");
        A10.append(this.A04);
        A10.append(", numMediaAsDocsDownloaded=");
        A10.append(this.A09);
        A10.append(", numAudioReceived=");
        A10.append(this.A01);
        A10.append(", numAudioDownloaded=");
        A10.append(this.A00);
        A10.append(", numGifDownloaded=");
        A10.append(this.A06);
        A10.append(", numInlinePlayedVideo=");
        A10.append(this.A07);
        A10.append(", numUrlReceived=");
        A10.append(this.A0T);
        A10.append(", numMediaChatDownloaded=");
        A10.append(this.A0A);
        A10.append(", numMediaChatReceived=");
        A10.append(this.A0B);
        A10.append(", numMediaCommunityDownloaded=");
        A10.append(this.A0C);
        A10.append(", numMediaCommunityReceived=");
        A10.append(this.A0D);
        A10.append(", numMediaGroupDownloaded=");
        A10.append(this.A0F);
        A10.append(", numMediaGroupReceived=");
        A10.append(this.A0G);
        A10.append(", numMediaStatusDownloaded=");
        A10.append(this.A0H);
        A10.append(", numMediaStatusReceived=");
        A10.append(this.A0I);
        A10.append(", numMediaDownloadFailed=");
        A10.append(this.A0E);
        A10.append(", numStickerPackDownloaded=");
        A10.append(this.A0Q);
        A10.append(", numStickerPackReceived=");
        A10.append(this.A0R);
        A10.append(", numStickerDownloaded=");
        A10.append(this.A0P);
        A10.append(", numStickerReceived=");
        return C17900vP.A0E(A10, this.A0S);
    }

    public C26030Cqo(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36) {
        this.A0M = j;
        this.A0J = j2;
        this.A0L = j3;
        this.A0K = j4;
        this.A0O = j5;
        this.A0N = j6;
        this.A0Y = j7;
        this.A0U = j8;
        this.A0V = j9;
        this.A0W = j10;
        this.A0X = j11;
        this.A0Z = j12;
        this.A05 = j13;
        this.A02 = j14;
        this.A08 = j15;
        this.A03 = j16;
        this.A04 = j17;
        this.A09 = j18;
        this.A01 = j19;
        this.A00 = j20;
        this.A06 = j21;
        this.A07 = j22;
        this.A0T = j23;
        this.A0A = j24;
        this.A0B = j25;
        this.A0C = j26;
        this.A0D = j27;
        this.A0F = j28;
        this.A0G = j29;
        this.A0H = j30;
        this.A0I = j31;
        this.A0E = j32;
        this.A0Q = j33;
        this.A0R = j34;
        this.A0P = j35;
        this.A0S = j36;
    }

    public static /* synthetic */ C26030Cqo A00(C26030Cqo cqo, int i, int i2, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36) {
        long j37 = j36;
        long j38 = j35;
        long j39 = j34;
        long j40 = j33;
        long j41 = j32;
        int i3 = i;
        long j42 = j31;
        long j43 = j30;
        long j44 = j13;
        long j45 = j12;
        long j46 = j11;
        long j47 = j10;
        long j48 = j9;
        long j49 = j8;
        long j50 = j7;
        long j51 = j6;
        long j52 = j5;
        long j53 = j4;
        long j54 = j3;
        long j55 = j2;
        long j56 = j;
        long j57 = j14;
        long j58 = j15;
        long j59 = j16;
        long j60 = j17;
        long j61 = j18;
        long j62 = j19;
        long j63 = j20;
        long j64 = j21;
        long j65 = j22;
        long j66 = j23;
        long j67 = j24;
        long j68 = j25;
        long j69 = j26;
        long j70 = j27;
        long j71 = j28;
        long j72 = j29;
        C26030Cqo cqo2 = cqo;
        if ((i & 1) != 0) {
            j56 = cqo2.A0M;
        }
        if ((i & 2) != 0) {
            j55 = cqo2.A0J;
        }
        if ((i & 4) != 0) {
            j54 = cqo2.A0L;
        }
        if ((i & 8) != 0) {
            j53 = cqo2.A0K;
        }
        if ((i & 16) != 0) {
            j52 = cqo2.A0O;
        }
        if ((i & 32) != 0) {
            j51 = cqo2.A0N;
        }
        if ((i & 64) != 0) {
            j50 = cqo2.A0Y;
        }
        if ((i3 & 128) != 0) {
            j49 = cqo2.A0U;
        }
        if ((i3 & 256) != 0) {
            j48 = cqo2.A0V;
        }
        if ((i3 & 512) != 0) {
            j47 = cqo2.A0W;
        }
        if ((i3 & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0) {
            j46 = cqo2.A0X;
        }
        if ((i3 & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH) != 0) {
            j45 = cqo2.A0Z;
        }
        if ((i3 & ZipDecompressor.UNZIP_BUFFER_SIZE) != 0) {
            j44 = cqo2.A05;
        }
        if ((i3 & DefaultCrypto.BUFFER_SIZE) != 0) {
            j57 = cqo2.A02;
        }
        if ((i3 & 16384) != 0) {
            j58 = cqo2.A08;
        }
        if ((i & 32768) != 0) {
            j59 = cqo2.A03;
        }
        if ((i & 65536) != 0) {
            j60 = cqo2.A04;
        }
        if ((i & A7Y.A0F) != 0) {
            j61 = cqo2.A09;
        }
        if ((i & 262144) != 0) {
            j62 = cqo2.A01;
        }
        if ((i & 524288) != 0) {
            j63 = cqo2.A00;
        }
        if ((i & 1048576) != 0) {
            j64 = cqo2.A06;
        }
        if ((i & 2097152) != 0) {
            j65 = cqo2.A07;
        }
        if ((i & 4194304) != 0) {
            j66 = cqo2.A0T;
        }
        if ((i & 8388608) != 0) {
            j67 = cqo2.A0A;
        }
        if ((i & EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING) != 0) {
            j68 = cqo2.A0B;
        }
        if ((i & 33554432) != 0) {
            j69 = cqo2.A0C;
        }
        if ((i & 67108864) != 0) {
            j70 = cqo2.A0D;
        }
        if ((i & 134217728) != 0) {
            j71 = cqo2.A0F;
        }
        if ((i & 268435456) != 0) {
            j72 = cqo2.A0G;
        }
        if ((i & 536870912) != 0) {
            j43 = cqo2.A0H;
        }
        if ((i & 1073741824) != 0) {
            j42 = cqo2.A0I;
        }
        if ((i & Integer.MIN_VALUE) != 0) {
            j41 = cqo2.A0E;
        }
        if ((i2 & 1) != 0) {
            j40 = cqo2.A0Q;
        }
        if ((i2 & 2) != 0) {
            j39 = cqo2.A0R;
        }
        if ((i2 & 4) != 0) {
            j38 = cqo2.A0P;
        }
        if ((i2 & 8) != 0) {
            j37 = cqo2.A0S;
        }
        return new C26030Cqo(j56, j55, j54, j53, j52, j51, j50, j49, j48, j47, j46, j45, j44, j57, j58, j59, j60, j61, j62, j63, j64, j65, j66, j67, j68, j69, j70, j71, j72, j43, j42, j41, j40, j39, j38, j37);
    }

    public C26030Cqo() {
        this(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
    }
}
